class PoliceOfficer {
  
  private String policeName;
  private int badgeNumber;
  
  public PoliceOfficer(String policeName, int badgeNumber){
   this.policeName = policeName;
   this.badgeNumber = badgeNumber;
  }
  
  
  public String getPoliceName(){
    return policeName;
  }
  
  public int getBadgeNumber(){
    return badgeNumber;
  }
  
  public boolean inspection(ParkedCar object, ParkingMeter object2){
   if(object.getMinutesParked() > object2.getPurchasedParkingTime()){
      return true;
   } else {
      return false;
   }
  }
  
//   public String getCarStatus(ParkingTicket object){
//    if(object.isCarIllegallyParked() == true){
//       String status = "You car is illegally parked";
//    } else {
//       status = "You are not illegally parked";
//    }
//    return status;
//   }
  
//   public ParkingTicket issueParkingTicket(){
//    ParkingTicket parkingTicket = new ParkingTicket();
//    
//       if(parkingTicket.    
//   }
  
  public static void main(String[] args){
   
   ParkedCar tylersCar = new ParkedCar("Toyota", "Corolla", "red", "A12345", 120);
   ParkingMeter parkingMeter = new ParkingMeter(100);
   PoliceOfficer bob = new PoliceOfficer("Bob", 1234567);
   ParkingTicket parkingTicket1234 = new ParkingTicket();
   
   if(parkingTicket1234.isCarIllegallyParked(parkingMeter, tylersCar) == true){
   System.out.println("Police officer: " + bob.getPoliceName() + " " + "badgeNumber: " + bob.getBadgeNumber() + " Has inspected you car and determined you are illegally parked"
                      + parkingTicket1234.isCarIllegallyParked(parkingMeter, tylersCar));
                      
   System.out.println("Here is your parking ticket: " + "$" + parkingTicket1234.getParkingTicketFine(parkingMeter, tylersCar) + "\n" + parkingTicket1234.getCarInfo(tylersCar));
                      
  } else {
   System.out.println("You are legally parked");
  }                    
  
  }
  
}