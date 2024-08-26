import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
public static void main(String[] args) {
    Date today = new Date();
    
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    String dateText = formatDate.format(today);
    
    System.out.print(dateText);
}
}