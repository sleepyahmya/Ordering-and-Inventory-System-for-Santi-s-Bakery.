package orderingsystemforsanti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ProductCategories extends JFrame {

    private ProductManager productManager;
    private JPanel mainPanel;

    public ProductCategories(String selectedCategory) {
        productManager = new ProductManager();

        setTitle("Product Categories - " + selectedCategory);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);

        // Load only the selected category
        switch (selectedCategory) {
            case "Bread":
                loadBread();
                break;
            case "Bookies":
                loadCookies();
                break;
            case "Cakes":
                loadCakes();
                break;
            case "Dinks":
                loadDrinks();
                break;
            default:
                JOptionPane.showMessageDialog(this, "Unknown category: " + selectedCategory);
                break;
        }

        setVisible(true);
    }

    // Load Bread products
    private void loadBread() {
        loadSpecificCategory("Bread");
    }

    // Load Cookies products
    private void loadCookies() {
        loadSpecificCategory("Cookies");
    }

    // Load Cakes products
    private void loadCakes() {
        loadSpecificCategory("Cakes");
    }

    // Load Drinks products
    private void loadDrinks() {
        loadSpecificCategory("Drinks");
    }

    // Shared loader method
    private void loadSpecificCategory(String category) {
        mainPanel.removeAll();

        JLabel categoryLabel = new JLabel(category);
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 20));
        categoryLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(categoryLabel);

        JPanel categoryPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        categoryPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 20, 10));

        List<Product> products = productManager.getProductsByCategory(category);

        for (Product p : products) {
            JPanel productPanel = createProductPanel(p);
            categoryPanel.add(productPanel);
        }

        mainPanel.add(categoryPanel);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    // Creates a product panel with image, name, price, stock, and edit button
    private JPanel createProductPanel(Product p) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(160, 210));
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Load and scale the product image
        ImageIcon icon = new ImageIcon(p.getImagePath());
        Image img = icon.getImage().getScaledInstance(140, 120, Image.SCALE_SMOOTH);
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        imgLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel infoLabel = new JLabel("<html><center>" + p.getName() + "<br>₱" + p.getPrice() + "<br>Stock: " + p.getStock() + "</center></html>");
        infoLabel.setHorizontalAlignment(JLabel.CENTER);

        JButton editBtn = new JButton("Edit");
        editBtn.addActionListener(e -> openEditDialog(p));

        panel.add(imgLabel, BorderLayout.NORTH);
        panel.add(infoLabel, BorderLayout.CENTER);
        panel.add(editBtn, BorderLayout.SOUTH);

        return panel;
    }

    // Popup to edit price and stock
    private void openEditDialog(Product p) {
        JTextField priceField = new JTextField(String.valueOf(p.getPrice()));
        JTextField stockField = new JTextField(String.valueOf(p.getStock()));

        Object[] message = {
            "Product: " + p.getName(),
            "New Price:", priceField,
            "New Stock:", stockField
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Edit Product", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            try {
                double newPrice = Double.parseDouble(priceField.getText());
                int newStock = Integer.parseInt(stockField.getText());

                p.setPrice(newPrice);
                p.setStock(newStock);
                productManager.updateProduct(p);

                // Reload current category after update
                loadSpecificCategory(p.getCategory());

                JOptionPane.showMessageDialog(this, "Product updated successfully!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers for price and stock.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Example for testing one category
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProductCategories("Bread"));
    }
}
