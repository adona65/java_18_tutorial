package tutorial_000.languageNewFeatures;

public class _001_SimpleWebServer {

		/*
		 * Previously to Java 18, if we wanted to integrate multiline code snippets into JavaDoc, we had to do this with <pre>...</pre>,
		 * optionally in combination with {@code ... }. For this, we had to pay attention to two things :
		 * - There must be no line breaks between <pre> and the code and between the code and </pre>.
		 * - The code starts directly after the asterisks : i.e., if there are spaces between the asterisks and the code, they also appear in the 
		 * JavaDoc. So the code must be shifted one character to the left compared to the rest of the text in the JavaDoc comment.
		 * 
		 * Lets see an example with <pre> :
		 */
		
		/**
		 * How to write a text file with Java 7:
		 *
		 * <pre><b>try</b> (BufferedWriter writer = Files.<i>newBufferedWriter</i>(path)) {
		 *  writer.write(text);
		 *}</pre>
		 */
		static void docWithPre(){};
		
		/*
		 * And an example with <pre> and {@code ... } :
		 */
		/**
		 * How to write a text file with Java 7:
		 *
		 * <pre>{@code try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 *  writer.write(text);
		 *}}</pre>
		 */
		static void docWithPreAndACode(){};
		
		/*
		 * The difference between the two previous examples is that in the first, we can format the code with HTML tags such as <b> and <i>, 
		 * while in the second, such tags would not be evaluated but displayed.
		 * 
		 * Know, Java 18 enchanced this code snippets in javadoc introducing the @snippet tag, designed to display source code. With it,
		 * we can write the comment as follows:
		 */
		/**
		 * How to write a text file with Java 7:
		 *
		 * {@snippet :
		 * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 *   writer.write(text);
		 * }
		 * }
		 */
		static void docWithNewSnippetTag(){};
		
		/*
		 * We can also highlight parts of the code using @highlight. In the following example, it highlight all occurrences of "text" 
		 * within the second line of code.
		 */
		/**
		 * {@snippet :
		 * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 *   writer.write(text);  // @highlight substring="text"
		 * }
		 * }
		 */
		static void docWithNewHighlight(){};
		
		/*
		 * @highlight may also be "customized". The following example highlights all words starting with "write" within the block 
		 * marked with @highlight region and @end. With type="...", we can also specify the type of highlighting : bold, italic, or highlighted 
		 * (with a colored background).
		 */
		/**
		 * {@snippet :
		 * // @highlight region regex="\bwrite.*?\b" type="highlighted"
		 * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 *   writer.write(text);                                          
		 * }
		 * // @end
		 * }
		 */
		static void docWithCustomizedHighlight(){};
		
		/*
		 * With @link, we can link a part of the text, e.g., BufferedWriter, to its JavaDoc.
		 * 
		 * BEWARE : the colon at the end of the line with the @link tag is essential in this case, and it means that the comment refers 
		 * to the following line. We could also write the comment at the end of the next line, just like in the first @highlight example, or 
		 * use @link region and @end to specify a part within which all occurrences of BufferedWriter should be linked.
		 */
		/**
		 * {@snippet :
		 * // @link substring="BufferedWriter" target="java.io.BufferedWriter" :
		 * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
		 *   writer.write(text);
		 * }
		 * }
		 */
		static void docWithLink(){};
		
		
		public static void main(String[] args) {
			/*
			 * In your favorite IDE, you can put mouse over this methods to watch display javadoc examples.
			 */
			docWithPre();
			docWithPreAndACode();
			docWithNewSnippetTag();
			docWithNewHighlight();
			docWithCustomizedHighlight();
			docWithLink();
		}
}
