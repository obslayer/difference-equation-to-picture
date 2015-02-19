package numercal_integra;

import java.io.IOException;
import java.util.*;


public class calc 
{
	public static void main(String[] args){
		double u=0,v=0;
		for (int i=0;i<10001;i++){
			double r=Math.random();
			if(r<0.01){
				u=0;v=0.15*v;
			}
			if(r>=0.01&&r<0.08){
				u=0.2*u-0.25*v;v=0.23*u+0.22*v+1.6;
			}
			if(r>=0.08&&r<0.15){
				u=-0.15*u+0.28*v;v=0.28*u+0.24*v+0.9;
			}
			if(r>=0.15){
				u=0.85*u+0.04*v;v=0.04*u+0.85*v+1.6;
			}
			System.out.println(u+" "+v);
		}
		
	}
}
