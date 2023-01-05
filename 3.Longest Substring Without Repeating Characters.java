class Solution{
public static int lengthOfLongestSubstring(String s) {
    Queue<Character> queue = new LinkedList<>();
    int maxLength = 0;
    for(int i=0 ; i<s.length() ; i++){
        if(!queue.contains(s.charAt(i))){
        	queue.add(s.charAt(i));
            if(queue.size() > maxLength){
                maxLength = queue.size();
            }
        }else{
            while(queue.poll() != s.charAt(i)){}
            queue.add(s.charAt(i));
        }
    }
    return maxLength;
}
}