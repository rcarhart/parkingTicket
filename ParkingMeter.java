public class ParkingMeter {
  
  private int purchasedParkingTime; //the amount of time that has been purchased from the parking meter

   /** constructor to create an instance of the parkingMeter
   @param purchasedParkingTime the amount of time that has been purchased to park
   */
  public ParkingMeter(int purchasedParkingTime)
  {
    this.purchasedParkingTime = purchasedParkingTime;
  }
  
  //method to get the amount of time purchased from parking meter
  public int getPurchasedParkingTime(){
    return this.purchasedParkingTime;
  }
  

}
