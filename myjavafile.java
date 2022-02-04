public class myjavafile{

    public static String PrintFirstChar(String str){
        return str.substring(1,1); //creates first error
    }

    public static String PrintLastChar(String str){
        return str.substring(str.length()-1,str.length()-1); //creates second error
    }

}
