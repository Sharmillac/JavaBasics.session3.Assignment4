package assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cCalculator {
	public double mAdd(double lNum1 , double lNum2)
	{
		double lResult = 0;
		lResult = lNum1 + lNum2;
		return lResult;
	}
	
	public double mSubtract(double lNum1 , double lNum2)
	{
		double lResult = 0;
		lResult = lNum1 - lNum2;
		return lResult;
	}
	
	public double mMultiply(double lNum1 , double lNum2)
	{
		double lResult = 0;
		lResult = lNum1 * lNum2;
		return lResult;
	}
	
	
	public double mDivide(double lNum1 , double lNum2)
	{
		double lResult = 0;
		lResult = lNum1 / lNum2;
		return lResult;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		cCalculator lCalc = new cCalculator();
		boolean lHasError = false;
		Scanner scan = new Scanner(System.in);
		double lNumber1 = 0, lNumber2 =  0;
        String lOperator = "";
		System.out.println("Please enter First Number.");
		try
		{
			lNumber1 = scan.nextInt();
			
		}
		catch(InputMismatchException pE)
		{
			lHasError= true;
			System.out.println("Invalid Number");
		}
		
		if(!lHasError)
		{
			scan = new Scanner(System.in);
			System.out.println("Please enter second Number.");
			try
			{
				lNumber2 = scan.nextInt();
				
			}
			catch(InputMismatchException pE)
			{
				lHasError= true;
				System.out.println("Invalid Number");
			}
		}
		
		if(!lHasError)
		{
			scan = new Scanner(System.in);
			System.out.println("Please enter Operation");
		
			
			try
			{
				lOperator = scan.next();
				
			}
			catch(InputMismatchException pE)
			{
				lHasError= true;
				System.out.println("Invalid Number");
			}
		}
		if(!lOperator.equals("+") && !lOperator.equals("-") && !lOperator.equals("*") && !lOperator.equals("/"))
		{
			System.out.println("Invalid Opeartion . Allowed values = +,-,*,/");
			lHasError = true;
		}
		if(!lHasError)
		{
			switch(lOperator)
			{
				case "+" :
				{
					System.out.println("Performing Addition");
					double lResult = lCalc.mAdd(lNumber1, lNumber2);
					System.out.println(lResult);
					break;
				}
				case "-" :
				{
					System.out.println("Performing Subtraction");
					double lResult = lCalc.mSubtract(lNumber1, lNumber2);
					System.out.println(lResult);
					break;
				}
				case "*" :
				{
					System.out.println("Performing Multiplication");
					double lResult = lCalc.mMultiply(lNumber1, lNumber2);
					System.out.println(lResult);
					break;
				}
				case "/" :
				{
					System.out.println("Performing Division");
					double lResult = lCalc.mDivide(lNumber1, lNumber2);
					System.out.println(lResult);
					break;
				}
				default :
				{
					System.out.println("Invalid Operation");
				}
	
			
			}
		}
	

		
	}

}