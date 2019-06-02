package com.codefountain.string;

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
