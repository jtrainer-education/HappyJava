package education.jtrainer.nutsandbolts.HappyJava;

public class HappyJava {
    
    static int iteration=0;
    static private Boolean isHappy(String a){
        iteration++;
        System.out.println("iteration n."+iteration+" input value:"+a);
        int value=0;
        int size=a.length();
        int sum=0;
        for (int i=0;i<size;i++) {
            char element=a.charAt(i);
            int valueInt=Character.getNumericValue(element);
            sum=sum+valueInt*valueInt;
        }
        if (sum==1) return true;
        else {
            
            if (isUnHappy(sum)) return false;
            return(isHappy(Integer.toString(sum)));
        }
    }
    
    static private Boolean isUnHappy(int b){
        Integer[] unhappylist = new Integer[]{4, 16, 37, 58, 89, 145, 42, 20};
        for (int i=0;i<8;i++){
            if (b==unhappylist[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (isHappy(args[0]).equals(Boolean.TRUE)){
            System.out.println("number is happy");
        }
        else {
            System.out.println("number is unhappy");
        }           
    }
}
