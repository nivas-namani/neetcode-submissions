// java.util.*;

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        System.out.println(str);
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }

        int i = 0;
        while (i < str.length()) {
            System.out.println(str.indexOf('#', i));
            int sharpIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, sharpIndex));
            String word = str.substring(sharpIndex + 1, sharpIndex + 1 + length);
            result.add(word);
            i = sharpIndex + 1 + length;
        }

        return result;
    }
}
