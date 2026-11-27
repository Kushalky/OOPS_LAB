class Student{
  String USN;
  String Name; 
  
  Student(String USN,String Name){
   this.USN=USN;
   this.Name=Name;
   }
   void display(){
      System.out.println("NAME :" +Name);
       System.out.println("USN :" +USN);  
   }
   }
 public class lab1{
     public static void main(String[] args){
      Student S1=new Student("1WN25CS118","Kushal");          
      Student S2=new Student("1WN25CS115","Kruthik");
      Student S3=new Student("1WN25CS106","Kartik");
      Student S4=new Student("1WN25CS104","Manoj");
      Student S5=new Student("1WN25CS113","Preetam");
      
      Student s[]={S1,S2,S3,S4,S5};
      
      System.out.println("----Student Details------");
      for(int i=0;i<s.length;i++){
           s[i].display();
           System.out.println();
       }
      System.out.println("Kushal K Y");
      System.out.println("1WN25CS118");
    }
  }
