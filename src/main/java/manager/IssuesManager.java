package manager;

import domain.Issues;
import repository.IssuesRepository;
import java.util.Arrays;

public class IssuesManager {
    private IssuesRepository repository;

    public IssuesManager(IssuesRepository repository) {
        this.repository = repository;
    }

    public Issues[] searchByAuthor(int id, String name) {
        Issues[] result = new Issues[0];
        for (Issues issues : repository.findAll( )) {
            if (matches(issues, issues.getAuthor( ) )) {
                Issues[] tmp = new Issues[result.length + 1];
                System.arraycopy( result, 0, tmp, 0, result.length );
                tmp[tmp.length - 1] = issues;
                result = tmp;
            }
        }
        Arrays.sort( result );
        return result;
    }

    public boolean matches(Issues issues, String author) {
        return issues.getAuthor( ).equalsIgnoreCase( author );
    }

}
