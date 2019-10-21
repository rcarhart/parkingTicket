public class ParkingTicket {
  
  
  public String getCarInfo(ParkedCar object){
    return object.getCarMake() +  "  " + object.getCarModel() + " " + object.getCarColor() + " "  + object.getCarLicense();
  }
  
  public boolean isCarIllegallyParked(ParkingMeter object, ParkedCar object2){
  
   boolean isCarIllegallyParked;
   if(object.getPurchasedParkingTime() < object2.getMinutesParked()){
         return true;
      } else {
         return false;
      }
  }
  
  public int getParkingTicketFine(ParkingMeter object, ParkedCar object2){
    int timeOverPurchased = object.getPurchasedParkingTime() - object2.getMinutesParked();
     int fine = 25;
      if(timeOverPurchased < 60){
         return fine;
      } else if(timeOverPurchased > 60){
         return fine + 10;
         }
         return fine;    
  }
  
  public String getPoliceOfficerName(PoliceOfficer object){
   return object.getPoliceName();
  }
  
  public int getPoliceOfficerBadgeNumber(PoliceOfficer object){
   return object.getBadgeNumber();
  }

}
