package repository;

import domain.Issues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class IssuesRepository {
    private Collection<Issues> items = new ArrayList<>();
    private Predicate<? super Issues> issues;

    public void save(Issues item) {
        items.add( item );
    }

    public Collection<Issues> findAll() {
        return items;
    }

    public Issues findById(int id) {
        for (Issues item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) {
        items.removeIf(issues);
    }

}
