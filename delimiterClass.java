import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class delimiterClass {
	
	List <Integer> numbersList = new ArrayList<>();
	
	 for (int j = 1; j < 6; j++) {
      numbersList.add(j);
System.out.println(numbersList.stream().map(String::valueOf)
        .collect(Collectors.joining(",")));
String joinedList = numbersList.stream().map(String::valueOf).collect(Collectors.joining(","));
System.out.println(joinedList);

}
}
}


