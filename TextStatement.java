public class TextStatement extends Statement {

    protected String getTop(Customer aCustomer) {
        String result = "Rental Record for " + aCustomer.getName() + "\n";
        return result;
    }

    protected String getFgs(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
        String.valueOf(aRental.getCharge()) + "\n";
    }

    protected String getFoot(Customer aCustomer) {
        String result = "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }
}