class PoliceOfficer {
  
  private String policeName; //the police officers Name
  private int badgeNumber; // the police officers badge number
  
  /** constructor to create the police officer
  @param policeName 
  @param badgeNumber
  */
  public PoliceOfficer(String policeName, int badgeNumber){
   this.policeName = policeName;
   this.badgeNumber = badgeNumber;
  }
  
  //method to get the police officers name
  public String getPoliceName(){
    return policeName;
  }
  
  // method to get the police officers badge number
  public int getBadgeNumber(){
    return badgeNumber;
  }
  
    /** method to determine if a car is parked legally or not
  @param ParkingMeter object used to determine the amount of time purchased
  @param ParkedCar object used to determine how long the car has been parked
  */
  public boolean inspection(ParkedCar object, ParkingMeter object2){
  
  boolean timeExpired;
   if(object.getMinutesParked() > object2.getPurchasedParkingTime()){
      return true;
   } else {
      return false;
   }
  }
  

  public static void main(String[] args){
   
   ParkedCar tylersCar = new ParkedCar("Toyota", "Corolla", "red", "A12345", 120);
   ParkingMeter parkingMeter = new ParkingMeter(100);
   PoliceOfficer bob = new PoliceOfficer("Bob", 1234567);
   ParkingTicket parkingTicket1234 = new ParkingTicket();
   
   if(bob.inspection(tylersCar, parkingMeter)){
      System.out.println("Police officer: " + bob.getPoliceName() + "\n " + "badgeNumber: " + bob.getBadgeNumber() + " Has inspected you car and determined you are illegally parked"
                      + bob.inspection(tylersCar, parkingMeter));
                      
      System.out.println("Here is your parking ticket: " + "$" + parkingTicket1234.getParkingTicketFine(parkingMeter, tylersCar) + "\n" + parkingTicket1234.getCarInfo(tylersCar));
                      
   } else {
    System.out.println("You are legally parked");
          }                    
  
  }
  
}