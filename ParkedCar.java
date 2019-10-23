public class ParkedCar {
  
  
  private String carMake; // the make of the car
  private String carModel; // the model of the car
  private String carColor; // the color of the car
  private String carLicense; // the license plate of the car
  private int minutesParked; // the time the car has been parked
  
  /** Constructor to make an instance of the car
  @param carMake, carModel, carColor, carLicense, minutesParked. 
  */
  public ParkedCar(String carMake, String carModel, String carColor, String carLicense, int minutesParked )
  {
    this.carMake = carMake;
    this.carModel = carModel;
    this.carColor = carColor;
    this.carLicense = carLicense;
    this.minutesParked = minutesParked;
  }
  
  //method to get the car Make
   public String getCarMake(){
      return this.carMake;
   }
   
   //method to get the car model
   public String getCarModel(){
      return this.carModel;
   }
   //method to get the car color
   public String getCarColor(){
      return this.carColor;
   }
   //method to get the car license
   public String getCarLicense(){
      return this.carLicense;
   }
   
   //method to get the minutes parked
   public int getMinutesParked(){
      return this.minutesParked;
   }

}