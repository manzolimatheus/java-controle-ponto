package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
  public static String getNow() {
    LocalDateTime date = LocalDateTime.now();

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    return date.format(myFormatObj);
  }

  public static String getFormattedDate(LocalDateTime ldt) {
    String pattern = "EEEE, dd 'de' MMMM 'de' yyyy 'as' HH:mm:ss";
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern(pattern);
    return fmt.format(ldt);
  }
}