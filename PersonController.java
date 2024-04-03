package dz_seminar_3;

import dz_seminar_3.repository.*;

public class PersonController {

        PersonRepository personRepository;

        public PersonController(PersonRepository pr){
            this.personRepository = pr;
        }

        public void savePerson(Person person){
            this.personRepository.create(person);
        }
}
