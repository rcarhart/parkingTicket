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
  
   public String getCarMake(){
      return this.carMake;
   }
   
   public String getCarModel(){
      return this.carModel;
   }
   
   public String getCarColor(){
      return this.carColor;
   }
   
   public String getCarLicense(){
      return this.carLicense;
   }
   
   public int getMinutesParked(){
      return this.minutesParked;
   }

}