package guler.solutions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExprations {

	public static void main(String[] args) {
		/*
		 * String alphanumeric ="abcDeeF12Ghhiiiijkl99abcDeeFyz";
		 * System.out.println(alphanumeric.replaceAll("abcDee", "YYY"));
		 * System.out.println(Pattern.matches("[xyz]", "x"));
		 */
		
		System.out.println(Pattern.matches("\\D", "acv"));
		
		Pattern p = Pattern.compile("Youtube");
		Matcher m = p.matcher("ismail Youtube chanell");
		System.out.println(m.find());
		System.out.println(m.group());
		System.out.println(m.start() +": " + m.end());
		
		

	}

}
