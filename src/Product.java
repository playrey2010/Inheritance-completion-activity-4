import java.text.NumberFormat;

public abstract class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        count++;
    }


    // Get and set accessors for the code, description, and price instance variables
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//Methods
    @Override
    public String toString() {
        return "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    @Override
    public boolean equals (Object object) {
        if (this.toString().equalsIgnoreCase(object.toString())) {
            return true;
        }
        else {
            return false;
        }
    }
    // Use the NumberFormat class to format the price to 2 decimal places
    // Notice: this is a private method. It is accessed within this same class.
    private String getFormattedPrice() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        currency.setMaximumFractionDigits(2);
        currency.setMinimumFractionDigits(2);
        return currency.format(price);
    }
    // Create public access for the count variable

    public static int getCount() {
        return count;
    }

}
