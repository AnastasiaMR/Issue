package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issues {
    private int id;
    private String author;
    private String name;
    private boolean isOpen;
    private int publicationDate;

}
