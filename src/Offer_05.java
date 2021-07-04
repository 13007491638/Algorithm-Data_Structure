public class Offer_05 {
    String replaceSpace(String s){
        StringBuffer sb = new StringBuffer(s);
        int x = s.length();
        for(int i = 0 ; i < x; i++){
            if (sb.charAt(i) == ' '){
                sb.insert(i,"%20");
                sb.deleteCharAt(i+3);
                x += 2;
            }
        }
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        Offer_05 offer_05 = new Offer_05();
        String result = offer_05.replaceSpace("      ");
        System.out.println(result);
    }
}
