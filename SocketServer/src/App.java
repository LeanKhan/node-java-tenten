import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    private static Person person;

    public App() {
    };

    public Person getPerson() {
        return App.person;
    }

    public void createPerson(String personJSON) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person p = mapper.readValue(personJSON, Person.class);

            App.person = p;

            System.out.printf("Person %s created successfully!", p.getFirstname());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getPersonJSON() {
        ObjectMapper mapper = new ObjectMapper();
        try {

            if (App.person == null) {
                return "";
            }

            // this is a package that helps us work with JSON
            String json = mapper.writeValueAsString(App.person);
            
            System.out.printf("Person %s gotten successfully!", App.person.getFirstname());
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
