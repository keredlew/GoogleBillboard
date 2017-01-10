import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
 double dNum = 0.0f;
  
  for(int i = 2; i < e.length()-2; i++)
  {
    dNum = Double.parseDouble(e.substring(i, i+10));
    if (isPrime(dNum))
    break;
}
    System.out.println(dNum);
}  
public void draw()
{
	//no use
}

public boolean isPrime(double dNum)  
{   
    if (dNum < 2.0f)
  return false;
  for(int i = 2; i <= Math.sqrt(dNum); i++)
  if (dNum % i == 0)
  return false;
  return true; 
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
