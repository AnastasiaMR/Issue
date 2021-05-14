package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue {
    private int id;
    private String author;
    private String name;
    private Set<Assignee> assignee;
    private Set<Label> label;
    private boolean isOpen;
    private int publicationDate;

}
