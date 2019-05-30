/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ Jimbo Zhu
 * @ 9/7
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1=25;
        int iNum2=9;
        int iNum3=11;
        int iNum4=10;
        int iNum5=5;
        
        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println( "43.21 + 3.14 + 10.0=" + (43.21 + 3.14 + 10.0) );
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 + "-" +iNum2 + "-" + iNum1 +"="+ (iNum3 - iNum2 - iNum1));
        System.out.println( "3.14 - 10.0="+(3.14 - 10.0) );
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + "*"+ iNum2 +"=" +(iNum1 * iNum2) ); 
        System.out.println("3.14 * 10.0 * 10.0="+(3.14 * 10.0 * 10.0) );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNum2 +"/" +iNum1+"="+(iNum2 / iNum1)  );
        System.out.println( "43.21 / 10.0="+(43.21 / 10.0) );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3+"%"+iNum2+"="+(iNum3 % iNum2) );
        System.out.println( "10.0 % 3.14="+(10.0 % 3.14) );
        
        //own expressions
        System.out.println("own expressions");
        System.out.println(iNum1+"*"+iNum2+"%"+iNum5+"="+(iNum1 * iNum2 % iNum5));
        System.out.println(iNum4+"-"+iNum1+"/"+iNum5+"="+(iNum4 - iNum1 / iNum5));
        System.out.println(iNum5+"+"+iNum1+"-"+iNum3+"="+(iNum5 + iNum1 - iNum3));
        
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class