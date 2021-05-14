package manager;

import domain.Issue;
import repository.IssuesRepository;
import java.util.Arrays;

public class IssuesManager {
    private IssuesRepository repository;

    public IssuesManager(IssuesRepository repository) {
        this.repository = repository;
    }

    public Issue[] searchByAuthor(int id, String name) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.findAll( )) {
            if (matches( issue, issue.getAuthor( ) )) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy( result, 0, tmp, 0, result.length );
                tmp[tmp.length - 1] = issue;
                result = tmp;
            }
        }
        Arrays.sort( result );
        return result;
    }

    public boolean matches(Issue issue, String author) {
        return issue.getAuthor( ).equalsIgnoreCase( author );
    }

}
