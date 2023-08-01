package Practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DesignBrowserHistory {


   Stack <String>browsHistory,forwardStep;
    public DesignBrowserHistory(String homepage) {
        browsHistory = new Stack<>();
     forwardStep= new Stack<>();
     browsHistory.add(homepage);
    }

    public void visit(String url) {
      while (!forwardStep.isEmpty()){
          forwardStep.pop();
      }
      browsHistory.push(url);
    }

    public String back(int steps) {
        while(browsHistory.size()>1&&steps-->0) {
            forwardStep.push(browsHistory.peek());
            browsHistory.pop();
        }
        return browsHistory.peek();
    }

    public String forward(int steps) {
        while(!forwardStep.isEmpty()&&steps-->0){
            browsHistory.add(forwardStep.peek());
            forwardStep.pop();
        }
        return browsHistory.peek();
    }
}
