public class HotelApp {
    public static void main(String[] args) {

      FrontDesk frontDesk = new FrontDesk();

      frontDesk.pickUpVehicle("CED423");
      frontDesk.cleanRoom(104);
      frontDesk.requestCart(2);
    }
}
