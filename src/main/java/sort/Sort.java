package sort;

import domain.Issue;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Sort implements Comparator<Issue> {

    @Override
    public int compare(Issue o1, Issue o2) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        final Date date1 = format.parse(o1.getPublicationDate());
        final Date date2 = format.parse(o2.getPublicationDate());
        return date1.compareTo(date2);
    }
}
