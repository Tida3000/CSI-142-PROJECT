package exceptions;

public class InvalidPriceException extends Exception {
   
    public InvalidPriceException(String message) {
        super(message);
    }
   
    public InvalidPriceException(double price) {
        super("Invalid price: P" + price + ". Price must be greater than 0.");
    }
}
