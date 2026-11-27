interface Parking_charge{
  double calculate_charge();
  public void display_parking_details();
  
  }
  
class Vehicle_parking implements Parking_charge{
    int vehicle_number;
    String Vehicle_type;
    double Parking_hours;

    Vehicle_parking(int vehicle_number,String Vehicle_type,double Parking_hours){
        this.vehicle_number=vehicle_number;
        this.Vehicle_type=Vehicle_type;
        this.Parking_hours=Parking_hours;
    
   }
   
   public double calculate_charge(){
     return 0;
   }

   
   public void display_parking_details(){
      System.out.println("VEHICLE NUMBER : "+vehicle_number);
      System.out.println("VEHICLE TYPE : "+Vehicle_type);
      System.out.println("PARKING HOURS : "+Parking_hours);
      System.out.println("TOTAL CHARGE FOR PARKING : "+calculate_charge());
      System.out.println();
      
   }

  }  
     
 class TwoWheller extends Vehicle_parking{
       TwoWheller(int vehicle_number,double Parking_hours){
        super(vehicle_number,"TWO WHELLER",Parking_hours);
        
        }
        
     public  double calculate_charge(){
        
         if(Parking_hours<=2){
           return Parking_hours*20;
           }else{
            return 2*20 +(Parking_hours-2)*10;
            }
    }
 }   
 class FourWheller extends Vehicle_parking{
       FourWheller(int vehicle_number,double Parking_hours){
        super(vehicle_number,"Four WHELLER",Parking_hours);
        
        }
        
     public  double calculate_charge(){
        
         if(Parking_hours<=2){
           return Parking_hours*50;
           }else{
            return 2*50 +(Parking_hours-2)*30;
            }
    }
}   
public class LAB3b{
  public static void main(String[] args){
     
    Parking_charge p;
    
    p=new TwoWheller(5,2.5);
    p.display_parking_details();
    
    p=new FourWheller(77,1.5);
    p.display_parking_details();
    
     System.out.println("Kushal K Y");
     System.out.println("1WN25CS118");
}
}
