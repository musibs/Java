package com.codefountain.string;

/**
 * String changes in Java 12. Additon of {@link String#indent(int)}
 * and {@link String#transform(java.util.function.Function)} methods
 * 
 * @author Somnath Musib
 *
 */
public class StringEnhancements {
	
	public static void main(String[] args) {
		
		String text = "This is a sample text";
		
		System.out.println(text.indent(3));
		
		
		String anotherText = "Text$ with$ $lots$ $of$ symbols$";
		String[] modifiedText = anotherText
				.transform(strText -> strText.replace("$", ""))
				.transform(str -> str.split(" "));
		
		for(String string : modifiedText) {
			System.out.println(string.indent(2));
		}
		
		
	}

}
