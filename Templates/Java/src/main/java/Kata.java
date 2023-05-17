public class Kata {
    public String hello(String name) {
        return String.format("Hello %s", name);
    }

    public void add(String word, boolean[] bitArray) {
        int hash1 = h1(word);
        int hash2 = h2(word);
        int hash3 = h3(word);
        bitArray[hash1] = true;
        bitArray[hash2] = true;
        bitArray[hash3] = true;
    }

    private int stringToInt(String word) {
        int result = 0;
        for (int index = 0; index < word.length(); index++) {
             result += (int) word.charAt(index);
        }
        return result;
    }

    private int h1(String word) {
        int value = stringToInt(word);
        return value % 43;
    }

    private int h2(String word) {
        return 2;
    }

    private int h3(String word) {
        return 3;
    }
}
