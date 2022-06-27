import java.util.Enumeration;

public abstract class Statement {
   
  protected abstract String getTop(Customer aCustomer);
  protected abstract String getFgs(Rental aRental);
  protected abstract String getFoot(Customer aCustomer);
   
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getTop(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += getFgs(each);
      }
      //add footer lines
      result += getFoot(aCustomer);
      return result;
  }
}