package practice5;

public class CellPhone {

    //1. private static object of the class (half way)

    private static CellPhone cellPhone = null;

    //2. private constructor
    private CellPhone() {

    }

    //3. public static method which has return type of the class (object) --> singleton method
    public static CellPhone getInstance(){
        if (cellPhone == null){
            cellPhone = new CellPhone();
        }
        return cellPhone;
    }

    public void printMYMobile(){
        System.out.println("Samsung Note 20");
    }

}
