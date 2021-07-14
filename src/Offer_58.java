import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Offer_58 {
}

//18ms
class Solution58_1 {
    public String reverseLeftWords(String s, int n) {
        ArrayList arrayList = new ArrayList();
        for (int i = n; i < s.length(); i++) {
            arrayList.add(s.charAt(i));
        }
        for(int i = 0; i<n ; i++){
            arrayList.add(s.charAt(i));
        }
        String result = (String) arrayList.stream().map(Object::toString)
                .collect(Collectors.joining(""));;
        return result;
    }
}

//4ms
class Solution58_2 {
        public String reverseLeftWords(String s, int n) {
            StringBuilder res = new StringBuilder();
            for(int i = n; i < s.length(); i++)
                res.append(s.charAt(i));
            for(int i = 0; i < n; i++)
                res.append(s.charAt(i));
            return res.toString();
        }
}
//切片函数
class Solution58_3 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
