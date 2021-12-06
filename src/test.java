import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;

public class test {
     @Override
    public String toString() {
    return "object";
  }

    public static void main(String[] args) {
//        ArrayList<Object> Outer_list = new ArrayList <>();     
//        Outer_list.add("ddd");
//        Outer_list.add(2);
//        Outer_list.add(11122.33);    
//        System.out.println(Outer_list);
    	
        // By double initialization 
//        List<ArrayList<Object>> MainList = new ArrayList<ArrayList<Object>>();
//        ArrayList<Object> inner_list = new ArrayList <>();
//        MainList.add(inner_list);
//        inner_list.add("Naim");
//        inner_list.add(2);
//        inner_list.add(55.2);
        //MainList.add(new ArrayList <>()).add(11).add("Naim");
        //MainList.addAll(2, 7, "11");
        
        
        // By 2d array
//        Object[][] array = new Object[10][10];
//        array[0][0] = "Naim" ;
//        array[0][1] = 18;
//        array[0][2] = "033";
//        array[1][0] = "Ali";
//        array[1][1] = 21;
//        array[1][2] = "0331";
//        System.out.println(Arrays.toString(array));
//        Object a = array[0];
        //System.out.println(a[1]);
        
//        System.out.println(MainList.get(0).get(0));
//		Student s1 = new Student("Justin", 101, 8.81);
//		Student s2 = new Student("Jessica", 102, 9.11);
//		Student s3 = new Student("Simon", 103, 7.02);
//		
//		//Creating Arrays
//		Student[] studentArr = {s1, s2, s3};
//		int[] intArr = {5, 10, 15};
//		double[] doubleArr = {5.0, 10.0, 15.0};
//		String[] stringArr = {"Justin", "Jessica"};
//		
//		System.out.println("Student Array: " + Arrays.toString(studentArr));
//		System.out.println("Intger Array: " + Arrays.toString(intArr));
//		System.out.println("Double Array: " + Arrays.toString(doubleArr));
//		System.out.println("String Array: " + Arrays.toString(stringArr));
                
//                Travel t1 = new Travel("Daewoo Faisal Movers", "Karachi", "Islamabad",1000);
//		Travel t2 = new Travel("Daewoo Express", "Karachi", "Islamabad",1100);
//                Travel t3 = new Travel("Road Master", "Karachi", "Islamabad",1500);
//                Travel t4 = new Travel("Green Line Express", "Karachi", "Islamabad",2500);
//                Travel t5 = new Travel("Green Line Express (B)", "Karachi", "Islamabad",3500);
//                Travel t6 = new Travel("Air Sial", "Karachi", "Islamabad",30000);
//                Travel t7 = new Travel("PIA", "Karachi", "Islamabad",25000);
//                Travel t8 = new Travel("Air Blue", "Karachi", "Islamabad",26000);
//                Travel t9 = new Travel("Daewoo Faisal", "Karachi", "Lahore",1200);

		//Creating Arrays
//		Travel[] TravelArr = {t1,t2,t3,t4,t5,t6,t7,t8,t9};
//;
//                System.out.println(TravelArr[2].Medium);
	
//                for (int i = 0; i < TravelArr.length; i++) {
//                System.out.println(TravelArr[i].Medium);
                
        ArrayList<Travel> list1 = Travel.ListUser();
//        ArrayList<Travel> sort = new ArrayList<Travel>();
        
        for (int i = 0; i < list1.size() ; i++){ 
            //System.out.println(list1.get(i).Package);
            //sort.add(list.get(i));
            for (int j = 0; j < list1.size()-1-i; j++) {
                if(list1.get(j).Package > list1.get(j+1).Package){
                    //list.set(j, list.get(j)),list.set(j+1, list.get(j)) = list.get(j+1),list.get(j);
                    ArrayList<Travel> sort = new ArrayList<Travel>();
                    sort.add(list1.get(j));
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, sort.get(0));
                    //arr[j], arr[j+1] = arr[j+1], arr[j]
                }
                
            }
        }
        for (int i = 0; i < list1.size() ; i++){ 
            System.out.println(list1.get(i));
        }
    
    
    }
}
