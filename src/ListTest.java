import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Kullanat");
		list1.add("Sittichok");
		list1.add("Pattamaporn");
		for(String list:list1){
			System.out.println(list);
		}
		
		Collections.sort(list1);
		
		for(String list:list1){
			System.out.println(list);
		}
	}

}
