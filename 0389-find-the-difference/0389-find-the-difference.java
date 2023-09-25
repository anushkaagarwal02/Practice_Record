class Solution {
    public char findTheDifference(String s, String t) {
        char ch=0;
        for(char c:s.toCharArray())
        {ch^=c;}
        for(char cha:t.toCharArray())
        {
            ch^=cha;
        }
        return ch;
    }
}