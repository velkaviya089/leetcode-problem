class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s="";
        int count=0;
        while(s.length()<b.length()){
            s=s+a;
            count++;
        }
        if(s.contains(b)){
            return count;
        }
        s=s+a;
        count++;
        if (s.contains(b)){
            return count;
        }
        return -1;
    }
}