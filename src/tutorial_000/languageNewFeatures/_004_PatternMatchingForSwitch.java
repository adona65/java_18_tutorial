package tutorial_000.languageNewFeatures;

public class _004_PatternMatchingForSwitch {

	public static void main(String[] args) {

		/*
		 * Pattern Matching for Switch is a preview feature which goal is to enhance pattern matching for switch expressions and statements. 
		 * It allow to pass an objet to a switch, then perform given action depending of the type of this object.
		 * 
		 * We might for example writte a method like the following :
		 *
		 	public String checkObjectType(Object obj) {
			    return switch (obj) {
			        case MyPojo p -> "Pojo's attribute: %s".formatted(p.getPojoAttribute());
			        case String s && s.length() > 5 -> "This is a String";
			        case Integer i -> "It's a number.";
			        case null -> "Object is null.";
			        default -> "It is an object.";
			    };
			}
		 *
		 * It was a preview feature in java 17, and still is so in java 18. However, some bugfix were made with java 18.
		 */
	}
}


