package Pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		
		List<String> li=Arrays.asList("Alok","Ashok","Deepak","Jaga");
		
		li.forEach(System.out::println);
		
		
	}

}
