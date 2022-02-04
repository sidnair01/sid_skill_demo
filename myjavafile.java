public class myjavafile{

    public static String PrintFirstChar(String str){
        return str.substring(0,1); //creates first error
    }

    public static String PrintLastChar(String str){
        return str.substring(str.length()-1,str.length()); //creates second error
    }

}
