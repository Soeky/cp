import java.util.*;

public class Problems{
    public static void main(String[] args) {

    }

    public boolean hasDuplicate(int[] nums){
        return !(Arrays.stream(nums).distinct().count() == nums.length);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        return map.values().stream().distinct().count() == 1;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int diff = target-nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String t = new String(temp);
            if (map.containsKey(t)){
                List<String> l = map.get(t);
                l.add(s);
                map.put(t, l);
            }else {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(t, l);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> l : map.values()){
            res.add(l);
        }
        res.sort(Comparator.comparing(List::size));
        return res;
    }

    //TODO understood question wrongly
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> res = new HashSet<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) >= k){
                res.add(n);
            }
        }
        int[] ress = new int[res.size()];
        int i = 0;
        for (int sa : res){
            ress[i++] = sa;
        }
        return ress;
    }

}


