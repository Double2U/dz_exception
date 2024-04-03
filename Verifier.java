package dz_seminar_3;

import dz_seminar_3.exception.*;

public class Verifier {

    private String[] data;

    public Verifier (String[] data){
        this.data = data;
    }


    public void checkAmountData(){
        if (data.length != 6){
            throw new DataAmountException();
        }
    }

    public void checkFullName(){
        if(data[0] == null && data[1] == null && data[2] == null ){
            throw new NullPointerException();
        }
    }

    public void checkBirthDay(){
        if(data[3].length() != 10 ){
            throw new DataFormatException("Entered birth day do not fit the format dd.mm.yyyy");
        }
    }

    public void checkPhoneNumber(){
        if(data[4].length() != 7){
            throw new DataFormatException("Invalid phone number.Phone number must contain seven digits! ");
        }
        try{
            Integer.parseInt(data[4]);
        } catch (NumberFormatException e){
            throw new RuntimeException("Invalid phone number! Phone number must be integer!");
        }
        if (data[4].charAt(0) == '+' || data[4].charAt(0) == '-'){
            throw new DataFormatException("Phone number must not contain a sign");
        }
    }

    public void checkGender(){
        if (!data[5].equals("m") && !data[5].equals("f")){
            throw new DataFormatException("Invalid gender. Enter 'm' - male or 'f' - female!");
        }
    }
}
