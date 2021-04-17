package Assignment_of_Sinx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Assi_of_java_Sinx {
	
		public static void main(String[] args) {
			
			int n,k=-1,f=1,i;
			double p,s1=0,x,rad,r=0;
			try
			{
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the values of x :");
				x=Double.parseDouble(in.readLine());
				System.out.println("Enter tha values of n :");
				n=Integer.parseInt(in.readLine());
				
				rad=x*3.14/180;
				s1=rad;
				for(i=3;i<n;i+=2)
				{
					p=Math.pow(rad,i);
					f=f*(i-1)*i;
					r=p/f;
					s1=s1+k*r;
					k=k*(-1);
				}
				
				DecimalFormat df = new DecimalFormat("#.####");
				df.setRoundingMode(RoundingMode.CEILING);
				
				
				System.out.println("Sin("+x+")="+df.format(s1));
			}
			
			catch(Exception e)
			{
				System.out.println("Error :"+e);
			}
}
}

