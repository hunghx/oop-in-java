package ra.model;

import java.util.ArrayList;
import java.util.List;

public class PersonCrud {
   public static List<Person> personList = new ArrayList<>(); // cấp phát tĩnh  , có sẵn vùng nhớ

   public List<Person> getPersonList() {
        return personList;
    }


}
