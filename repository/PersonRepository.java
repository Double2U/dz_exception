package dz_seminar_3.repository;

import java.io.FileWriter;
import java.io.IOException;

public class PersonRepository implements Repository {

    @Override
    public void create(Person person) {
        try(FileWriter fw = new FileWriter(person.getSurname() + ".txt", true)){
            fw.write(person.toString());
        } catch(IOException e){
            e.printStackTrace();
        }
        }
    }
    
