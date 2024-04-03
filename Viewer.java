package dz_seminar_3;
import java.util.Scanner;

import dz_seminar_3.repository.*;

public class Viewer {
    
    private PersonController personController;

    public Viewer(PersonController personController){
        this.personController = personController;
    }

    public void run(){
        String data = prompt("Enter the following data 'Surname Name Middlename Birthday PhoneNumber Gender' separated by a space: ");
        String [] arrData = data.split(" ");
        if(checkData(arrData)){
            Person person = new Person(arrData[0], arrData[1], arrData[2], arrData[3], arrData[4], arrData[5]);
            personController.savePerson(person);
        }


    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private boolean checkData (String [] arr) {

        Verifier v = new Verifier(arr);
        v.checkAmountData();
        v.checkFullName();
        v.checkBirthDay();
        v.checkPhoneNumber();
        v.checkGender();
        return true;
    }
}
