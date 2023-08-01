package Practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DesignBrowserHistory {
    String currentPage;
    String home;
    Deque <String>browsHistory,forwardStep;
    public DesignBrowserHistory(String homepage) {
        browsHistory.add(homepage);
     currentPage= homepage;
        browsHistory = new ArrayDeque();
     forwardStep= new ArrayDeque();

    }

    public void visit(String url) {

        browsHistory.add(url);
        currentPage= url;
        forwardStep= new ArrayDeque();
    }

    public String back(int steps) {

        while(!browsHistory.isEmpty()&&steps>0){
            if(steps>browsHistory.size()||currentPage.equals(home)){
                browsHistory =new ArrayDeque<>();

            }
            forwardStep.push(browsHistory.removeLast());
            currentPage=browsHistory.peekLast();
            steps--;
        }
        return currentPage;
    }

    public String forward(int steps) {
        while(!forwardStep.isEmpty()&&steps>0){
            browsHistory.add(currentPage);
            currentPage=forwardStep.pop();
            steps--;
        }
        return currentPage;
    }
}
