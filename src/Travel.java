
import java.util.ArrayList;
import java.util.Arrays;

public class Travel

{
	public String Medium;
	public String SCity;
	public String DCity;
        public int Package;
	Travel(String m, String s, String d ,int p)
	{
		this.Medium = m;
		this.SCity = s;
		this.DCity = d;
                this.Package = p;
	}
	//overriding the toString() method
	@Override
	public String toString()
	{
		return this.Medium + " " + this.SCity + " " + this.DCity + " " + this.Package;
	}
        public static ArrayList ListUser(){
            ArrayList<Travel> List = new ArrayList<Travel>();
            Travel t1 = new Travel("Daewoo Faisal Movers", "Karachi", "Islamabad",1000);
            Travel t2 = new Travel("Daewoo Express", "Karachi", "Islamabad",1100);
            Travel t3 = new Travel("Road Master", "Karachi", "Islamabad",1500);
            Travel t4 = new Travel("Green Line Express", "Karachi", "Islamabad",2500);
            Travel t5 = new Travel("Green Line Express (B)", "Karachi", "Islamabad",3500);
            Travel t6 = new Travel("Air Sial", "Karachi", "Islamabad",30000);
            Travel t7 = new Travel("PIA", "Karachi", "Islamabad",25000);
            Travel t8 = new Travel("Air Blue", "Karachi", "Islamabad",26000);
            Travel t9 = new Travel("Daewoo Faisal", "Islamabad", "Lahore",1200);
            List.add(t1);
            List.add(t2);
            List.add(t3);
            List.add(t4);
            List.add(t5);
            List.add(t6);
            List.add(t7);
            List.add(t8);
            List.add(t9);
            return List;
        }
}

//public class Demo
//
//{
//	public static void main(String[] args)
//	{
//		Travel t1 = new Travel("Daewoo Faisal Movers", "Karachi", "Islamabad",1000);
//		Travel t2 = new Travel("Daewoo Express", "Karachi", "Islamabad",1100);
//                Travel t3 = new Travel("Road Master", "Karachi", "Islamabad",1500);
//                Travel t4 = new Travel("Green Line Express", "Karachi", "Islamabad",2500);
//                Travel t5 = new Travel("Green Line Express (B)", "Karachi", "Islamabad",3500);
//                Travel t6 = new Travel("Air Sial", "Karachi", "Islamabad",30000);
//                Travel t7 = new Travel("PIA", "Karachi", "Islamabad",25000);
//                Travel t8 = new Travel("Air Blue", "Karachi", "Islamabad",26000);
//                Travel t9 = new Travel("Daewoo Faisal", "Karachi", "Lahore",1200);
//
//		//Creating Arrays
//		Travel[] TravelArr = {t1,t2,t3,t4,t5,t6,t7,t8,t9};
////		int[] intArr = {5, 10, 15};
////		double[] doubleArr = {5.0, 10.0, 15.0};
////		String[] stringArr = {"Justin", "Jessica"};
////		
////		System.out.println("Student Array: " + Arrays.toString(studentArr));
////		System.out.println("Intger Array: " + Arrays.toString(intArr));
////		System.out.println("Double Array: " + Arrays.toString(doubleArr));
////		System.out.println("String Array: " + Arrays.toString(stringArr));
//                System.out.println(TravelArr[2].Medium);
//	}
//}
