class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i=0; i<words.length-1; i++) {
            for (int j=i+1; j<words.length; j++) {
                if(isPrefixAndSuffix(words[i], words[j])) count++;
            }
        }

        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        boolean prefixCondition = str2.indexOf(str1) == 0;
        boolean suffixCondition = str2.lastIndexOf(str1) == str2.length() - str1.length();

        return prefixCondition && suffixCondition;
    }
}