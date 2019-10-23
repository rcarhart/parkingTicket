public class ParkingTicket {
  
  /** method to get the cars info
  @param ParkedCar object any instance of a car that has been created
  */
  public String getCarInfo(ParkedCar object){
    return object.getCarMake() +  "  " + object.getCarModel() + " " + object.getCarColor() + " "  + object.getCarLicense();
  }

  
  /** method to To report the amount of the fine, which is $25 for the first hour or part of an
   hour that the car is illegally parked, plus $10 for every additional hour or part of
   an hour that the car is illegally parked
  @param parkingMeter object to determine how much time has been purchased
  @param parkedCar object to determine how long the car has been parked
  */
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
  
  /** method to get the police officers name
  @param PoliceOfficer object 
  */
  public String getPoliceOfficerName(PoliceOfficer object){
   return object.getPoliceName();
  }
  
  /** method to get the police officers badge number
  @param PoliceOfficer object
  */
  public int getPoliceOfficerBadgeNumber(PoliceOfficer object){
   return object.getBadgeNumber();
  }

}
