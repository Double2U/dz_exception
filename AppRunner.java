package dz_seminar_3;
import dz_seminar_3.repository.PersonRepository;

public class AppRunner {
    

    private AppRunner(){
        PersonRepository pr = new PersonRepository();
        PersonController pc = new PersonController(pr);
        Viewer v = new Viewer(pc);
        v.run();
    }

    public static void run(){
        new AppRunner();
    }
}
