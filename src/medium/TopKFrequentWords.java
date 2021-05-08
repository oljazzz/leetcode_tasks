package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        int count = 1;
        HashMap<String, Long> map = new HashMap<>();
        List<String> wordList = Arrays.asList(words);
        HashMap<String, Long> map1 = wordList.stream().
                collect(Collectors.groupingBy(k1 -> k1, () -> map,
                        Collectors.counting()));


        return new ArrayList<>();
    }


    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        TopKFrequentWords frequentWords = new TopKFrequentWords();
        frequentWords.topKFrequent(words, 4);
    }
}
