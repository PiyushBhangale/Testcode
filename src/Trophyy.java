import java.util.Scanner;

public class Trophyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double rate=130.44;
		double required_volume,required_purity,required_thickness;
		String required_shape,required_metal;
		double coating_element,total_cost = 0;
		Shape_dime t1= new Shape_dime();
		
		
		required_shape=t1.shape();
		required_volume=t1.dimension();
	
		
		Metal t2= new Metal();
		required_metal=t2.metalused();
		required_purity=t2.purity_percentage();
		
		Coating t3=new Coating();
		
		
		coating_element=t3.coat();
		
		
		System.out.println("Shape   			:"+required_shape);
		System.out.println("Volume  			:"+required_volume);
		System.out.println("Metal   			:"+required_metal);
		System.out.println("Purity   			:"+required_purity);
		System.out.println("Coating cost   		:"+coating_element);
		total_cost=(required_volume*rate*required_purity)+coating_element;
		
		System.out.println("\n Total_Cost******************************************************"
				+ total_cost+ "********************************************************Total_Cost");
		
		

		
		

	}

}

class Shape_dime{
	
	String shape = null;
	Scanner s=new Scanner(System.in);
	String shape() 
	{
		
		
		
		System.out.println(""
				+ "Enter the choice number"
				+ "\n 1. Sphere"
				+ "\n 2. Cylinder"
				+ "\n 3. Cube");
		int choice = 0;
		choice=s.nextInt();
		switch(choice) {
		case 1:
			shape="Sphere";
			break;
		case 2:
			shape="Cylinder";
			break;
		case 3:
			shape="Cube";
			break;
			default:
				System.out.println("Invalid response");
		}

		return shape;
	}
	
	double dimension() {
		int rs,rc,hc,e;
		double volume = 0;
		System.out.println("Enter the dimensions :");
		try {
		switch(shape) {
		case "Sphere":
			System.out.println("1. Enter the radius");
			rs=s.nextInt();
			volume=(4/3)*Math.PI*Math.pow(rs, 3);
			
			
			break;
		case "Cylinder":
			System.out.println("1. Enter the radius");
			rc=s.nextInt();
			System.out.println("2. Enter the height");
			hc=s.nextInt();
			volume=Math.PI*Math.pow(rc, 2)*hc;
			break;
		case "Cube":
			System.out.println("1.Enter the edge");
			e=s.nextInt();
			volume=Math.pow(e, 3);
			break;
			default:
				System.out.println("Invalid response");
		}
		}
		catch(NullPointerException io) 
		{
			System.out.println("Nullpointer");
		}
		return volume;
		
	}
	
	
}
class Metal{
	
	String metal_used = null;
	Scanner s=new Scanner(System.in);
	String metalused() 
	{
		
		
		
		System.out.println(""
				+ "Enter the choice number"
				+ "\n 1. Aluminium"
				+ "\n 2. Steel"
				+ "\n 3. Copper");
		int choice = 0;
		choice=s.nextInt();
		switch(choice) {
		case 1:
			metal_used="Aluminium";
			break;
		case 2:
			metal_used="Steel";
			break;
		case 3:
			metal_used="Copper";
			break;
			default:
				System.out.println("Invalid response");
		}
		
		return metal_used;
	}
	
	double purity_percentage() 
	{
		double purity;
		System.out.println("Enter the purity percentage");
		purity=s.nextInt();
		return purity;
	}
}




class Coating {
	String coating_element = null;
	double coating_cost;
	double final_coating;
	Scanner s=new Scanner(System.in);
	static double thickness;
	double coat() 
	{
		
		System.out.println("Enter the thickness");
		thickness=s.nextInt();
		
		System.out.println(""
				+ "Enter the choice number"
				+ "\n 1. Gold"
				+ "\n 2. Silver"
				+ "\n 3. Bronze");
		int choice = 0;
		choice=s.nextInt();
		switch(choice) {
		case 1:
			coating_element="Gold";
			
			Gold g=new Gold();
			
			
			final_coating=g.calculate_coating_cost();
			
			
			break;
		case 2:
			coating_element="Silver";
			Silver s=new Silver();
			final_coating=s.calculate_coating_cost();
			break;
		case 3:
			coating_element="Bronze";
			Bronze b=new Bronze();
			final_coating=b.calculate_coating_cost();
			break;
			default:
				System.out.println("Invalid response");
		}
		
		return final_coating;
	}
	
	
		
		
		
	
	
	
}
class Gold extends Coating{
	final double gold_cost=200;
	double  calculate_coating_cost(){
		
		coating_cost=thickness*gold_cost;
		
		return coating_cost;
		
	}
}

class Silver extends Coating{
	final double silver_cost=100;
	double  calculate_coating_cost(){
		coating_cost=thickness*silver_cost;
	
		
		return coating_cost;
		
	}
}

class Bronze extends Coating{
	final double bronze_cost=50;
	double  calculate_coating_cost(){
		coating_cost=thickness*bronze_cost;
		
		return coating_cost;
		
	}
}
