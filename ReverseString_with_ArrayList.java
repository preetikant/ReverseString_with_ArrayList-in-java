import java.io.*;
import java.lang.*;
import java.util.*;
class ReverseString_with_ArrayList{
	public static void main(String[] args) {
		String input = "PreetiKant";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();
		for (char c :hello ) {
			trial1.add(c);
			Collections.reverse(trial1);
			ListIterator li = trial1.listIterator();
			while(li.hasNext())
				System.out.print(li.next());
		}
	}
}