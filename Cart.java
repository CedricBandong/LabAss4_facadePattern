public class Cart implements HotelService{
    public void requestCart(int numberOfCarts) {
      if (numberOfCarts == 1) {
        System.out.println(numberOfCarts + " cart has been requested.");
      }
      else {
        System.out.println(numberOfCarts + " carts has been requested.");
      }
    }
}
