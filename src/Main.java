import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "đi qua mùa cô đơn !!!";
        str = str.replaceAll(",", "");
        String[] arr = str.split(" ");
        System.out.println(str);
        System.out.println("------------");
        Map<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
            String key = arr[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
            System.out.println(" từ khóa " + key + " xuất hiện " + map.get(key));
        }
        Set tapHop = map.keySet();// dùng set để k in ra các phần tử trùng nhau
//        Iterator i = tapHop.iterator();// dung oterator duyệt phần tử collection
//        while (i.hasNext()) {//hasNext trả về true nếu có nhiều phần tử kế tiếp đang duyệt
//            String key = (String) i.next();
//
//        }


    }
}