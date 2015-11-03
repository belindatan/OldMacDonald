class Chick implements Animal 
{     
 
     protected String myType;     
     protected String mySound;   
     protected String sound2;   
     public Chick(String type, String sound, String sound2)     
     {         
         myType = type;         
         mySound = sound;     
         mySound = sound2;  
     }     
     public Chick()     
     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
 
  //your code here


