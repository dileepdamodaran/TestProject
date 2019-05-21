import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJavaLambda {
	
	private static List<Developer> getDevelopers(){
		
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("dileep", 36,new Long(150000)));
		result.add(new Developer("patty", 32,new Long(100000)));
		result.add(new Developer("telner", 28,new Long(100000)));
		return result;
		
	}
	public static void main (String args[])
	{
		lambdaSortList();
		
		
		lambdaIterateMap();
		
		lambdaMethod();
		
		iterateLambdaList();
		
		streamsJava8();
	}
	/**
	 * 
	 */
	private static void lambdaSortList() {
		// TODO Auto-generated method stub
		//Sort with lambda list
				List<Developer> developers = getDevelopers();
				developers.sort((Developer d1 , Developer d2)->d1.getAge()-d2.getAge());
				developers.forEach((developer)->System.out.println(developer.getAge()));
	}
	/**
	 * 
	 */
	private static void streamsJava8() {
		List<String> list =new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		list.forEach(System.out::println);
		
		list.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
	}
	
	private static void iterateLambdaList() {
		List list =new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.forEach(item->System.out.println(item));
		
		list.forEach(item->{
			if("C".equals(item)) {
				System.out.println(" :::::: "+item);
			}
		});
		
	}
	
	private static void lambdaMethod() {

		System.out.println("Test Lambda");
		//Before Java 8
		Game football = new Game () {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("Foot ball");
				
			}
			
		};
		
		Game cricket = new Game () {

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("Cricket");
				
			}
			
		};
		
		//Using Lambda
		Game footballLambda =()->
		    System.out.println("Foot ball");
		Series odiSeries = (type)->
		System.out.println(" Series : " +type);
		odiSeries.play("cricket");
	}
	/**
	 * 
	 */
	 private static void lambdaIterateMap() {
		//Iterate Map
			Map<String, Integer> items = new HashMap<String, Integer>();
			items.put("A",10);
			items.put("B",20);
			items.put("C",40);
			items.forEach((k, v)->System.out.println("Key "+k +" Value "+v));
		
		
	}

	interface Game{
		 void play();
	}
	 interface Series{
		 void play(String type);
	 }
}


;;