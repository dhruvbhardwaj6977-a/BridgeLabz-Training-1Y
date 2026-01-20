public class VolumeOfEarth{
	public static void main(String[] args){
	
	double radius = 6378;
	
	double volumekm =(4.0/3.0)*
	Math.PI*radius*radius*radius;
	
	double radiusmiles = radius*0.621371;
	
	double volumemiles =(4.0/3.0)*
	Math.PI* radiusmiles*radiusmiles*radiusmiles;
	
	System.out.println("the volume of the earth in cubic kilometer is:" +volumekm);
	System.out.println("the volume of the earth in cubic miles is :" +volumemiles);
	}
	}
	