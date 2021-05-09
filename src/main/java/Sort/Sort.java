package Sort;

import domain.Issues;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Sort  implements Comparator<Issues>{

    @Override
    public int compareTo() {
        SimpleDateFormat publicationDate = new SimpleDateFormat( "dd.MM.yyyy" );
        return publicationDate - o.publicationDate;
        }
    }



