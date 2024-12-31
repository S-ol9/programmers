import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i]) continue;
            else answer.add(todo_list[i]);
        }
        return answer.toArray(new String[0]);
    }
}