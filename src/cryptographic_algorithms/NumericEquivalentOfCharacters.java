package cryptographic_algorithms;

public class NumericEquivalentOfCharacters {
    // This array stores all the 26 alphabet characters
    char arr[] = new char[26];

    void initNumericEquivalent() {
        int j = 65;
        for (int i = 0; i < arr.length; i++) {
            // In 0th position A is stored, in 1th position b is stored and so on and in
            // 25th psoition Z is stored
            arr[i] = (char) j;
            j++;
        }
    }

    char getChar(int pos) {
        // Returns the character in a particular position
        return arr[pos];
    }

    int getPos(char ch) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                result = i;
            }
        }
        // if the character is not found then it returns -1
        return result;
    }
}
