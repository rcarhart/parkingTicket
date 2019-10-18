
public class ParkedCar {
  
  private String carMake;
  private String carModel;
  private String carColor;
  private String carLicense;
  private int minutesParked;
  
  public ParkedCar(String carMake, String carModel, String carColor, String carLicense, int minutesParked )
  {
    this.carMake = carMake;
    this.carModel = carModel;
    this.carColor = carColor;
    this.carLicense = carLicense;
    this.minutesParked = minutesParked;
  }
  
  public int getMinutesParked()
  {
    return minutesParked;
  }
  

}


public class ParkingMeter {
  
  private int purchasedParkingTime;
  
  
  
  public ParkingMeter(int purchasedParkingTime)
  {
    this.purchasedParkingTime = purchasedParkingTime;
  }
  
  public static int getPurchasedParkingTime(){
    
  }
  

}


public class ParkingTicket {
  
  private String carMake;
  private String carModel;
  private String carColor;
  private String carLicense;
  private int minutesParked;
  private int totalTimeCarParked;
  
  public String getCarMake(ParkedCar obj){
    return this.carMake + this.carModel + this.carColor + this.carLicense;
  }
  
  public int getTimeOverPurchased(ParkingMeter object2,ParkedCar object3){
    int timeOverPurchased = ParkingMeter.getPurchasedParkingTime() - ParkedCar.getMinutesParked();
    return timeOverPurchased;
  }
  
 
}



class PoliceOfficer {
  
  private String policeName;
  private int badgeNumber;
  
  public PoliceOfficer(){}
  
  public void setPoliceName(String policeName){
    this.policeName = policeName;
  }
  
  public void setBadgeNumber(int badgeNumber){
    this.badgeNumber = badgeNumber;
  }
  
  public String getPoliceName(){
    return policeName;
  }
  
  public int getBadgeNumber(){
    return badgeNumber;
  }
  
}
