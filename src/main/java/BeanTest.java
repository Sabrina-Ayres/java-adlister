import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Album one = new Album();
        one.setArtist("JLH");
        one.setName("Solid Sender");
        one.setRelease_date(2000);

        Author two = new Author();
        two.setFirstName("Sally");
        two.setLastName("Ride");

        Quotes three = new Quotes();
        three.setContent("This is a quote.");
        three.setAuthorName("By Someone");

        Quotes four = new Quotes();
        four.setContent("And another one.....");
        four.setAuthorName("By The Other");

        List<Object> listQuotes = new ArrayList<Object>();
        listQuotes.add(three.getAuthorName());
        listQuotes.add(three.getContent());
        listQuotes.add(four.getAuthorName());
        listQuotes.add(four.getContent());

        System.out.println(listQuotes);


//        System.out.println(one.getArtist());
//        System.out.println(one.getName());
//        System.out.println(one.getRelease_date());
//        System.out.println(" ");
//        System.out.println(two.getFirstName());
//        System.out.println(two.getLastName());
//        System.out.println(" ");
//        System.out.println(three.getContent());
//        System.out.println(three.getAuthorName());


    }

}
