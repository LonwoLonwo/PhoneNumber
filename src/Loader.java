import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readString = reader.readLine().trim();

        String justNumbers = readString.replaceAll("[^0-9]", "");

        if(justNumbers.length() < 10 || justNumbers.length() > 11){
            System.out.println("Некорректный номер телефона.");
        }
        else if(justNumbers.length() == 10){
            System.out.println("+7 " + justNumbers.substring(0, 3) + " " + justNumbers.substring(3, 6) + "-"
                    + justNumbers.substring(6, 8) + "-" + justNumbers.substring(8));
        }
        else{
            System.out.println("+" + justNumbers.charAt(0) + " " + justNumbers.substring(1, 4) + " " + justNumbers.substring(4, 7) + "-"
                    + justNumbers.substring(7, 9) + "-" + justNumbers.substring(9));
        }
    }

    //Запасная регулярка
    public static void regularAnother(String readString){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(readString);

        while(m.find()) {
            System.out.print(m.group());
        }
    }
}
