package Methods1;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    //camelCase
    public static void sayiBulmaca (){
        int[] numbers = new int[]{1,2,5,7,9};
        int target = 6;
        boolean isInclude=false;

        for(int number: numbers){
            if(number==target){
                isInclude=true;
                break;
            }
        }

        if(isInclude){
            mesajVer(target, true);
        }else{
            mesajVer(target,false);
        }

    }

    public static void mesajVer(int target, boolean isInclude) {
        if(isInclude){
            System.out.println("Number has been found: " + target);
        }else{
            System.out.println("Number can not found: " + target);
        }


    }
}
