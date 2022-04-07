import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class CsvUtil {
 private static final String SEPARATOR = ",";


 public static String toCsv(List < String > listToConvert) {
  return String.join(SEPARATOR, listToConvert);
 }

 @Test
 public void toCsv_csvFromListOfString() {

		List<String> numbersList = Arrays.asList("1", 
	            "3", 
	            "3",
	            "4");

 String expected = "1,3,3,4";

  assertEquals(expected, toCsv(numbersList));
 }


 public static String toCsvStream(List < String > listToConvert) {
  return listToConvert.stream()
   .collect(joining(SEPARATOR));
 }

 @Test
 public void toCsvStream_csvFromListOfString() {
		List<String> numbersList = Arrays.asList("1", 
	            "3", 
	            "3",
	            "4");

  String expected = "1,3,3,4";

  assertEquals(expected, toCsv(numbersList));
 }

 public static String toCsvJava7(List < String > listToConvert) {
  StringBuilder csvBuilder = new StringBuilder();

  for (String s: listToConvert) {
   csvBuilder.append(s);
   csvBuilder.append(SEPARATOR);
  }

  String csv = csvBuilder.toString();

  //Remove last separator
  if (csv.endsWith(SEPARATOR)) {
   csv = csv.substring(0, csv.length() - SEPARATOR.length());
  }

  return csv;
 }

 @Test
 public void toCsvJava7_csvFromListOfString() {
		List<String> numbersList = Arrays.asList("1", 
	            "3", 
	            "3",
	            "4");

		  String expected = "1,3,3,4";

  assertEquals(expected, toCsvJava7(numbersList));
 }


 public static String toUpperCaseCsv(List < String > listToConvert) {
  return listToConvert.stream()
   .map(String::toUpperCase)
   .collect(joining(SEPARATOR));
 }

 @Test
 public void toUpperCaseCsv_upperCaseCsvFromListOfString() {
		List<String> numbersList = Arrays.asList("1", 
	            "3", 
	            "3",
	            "4");

		  String expected = "1,3,3,4";

  assertEquals(expected, toUpperCaseCsv(numbersList));
 }

}