package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JewelsAndStone {
    public int numJewelsInStones(String jewels, String stones) {
        final int[] jewelsCount = {0};
        HashMap<Character, Integer> map = new HashMap<>();
        Map<String, Long> jewelsMap = IntStream.range(0, jewels.length())
                .mapToObj(i -> jewels.substring(i, i + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("jewels map = " + jewelsMap);
        jewelsMap.keySet().forEach(jewel->{
            for (int i = 0; i < stones.length(); i++) {
                String stone = String.valueOf(stones.charAt(i));
                if(jewel.equals(stone)){
                    jewelsCount[0] = jewelsCount[0] +1;
                }
            }
        });
        return jewelsCount[0];
    }

//    public void putAndIncrement(String key, int value) {
//        Integer prev = map.get(key);
//        Integer newValue = value;
//        if (prev != null) {
//            newValue += prev.intValue();
//        }
//        map.put(newValue);
//    }

    public static void main(String[] args) {
        JewelsAndStone j = new JewelsAndStone();
        int n = j.numJewelsInStones("aA", "aAAbbbb");
        System.out.println("n = " + n);
    }
}
