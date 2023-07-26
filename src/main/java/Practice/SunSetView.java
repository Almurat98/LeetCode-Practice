package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class SunSetView {

    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"WEST").forEach(System.out::println);
    }

    public static ArrayList<Integer> sunsetViews(int [] building,String direction){
        Stack<Integer>buildWithView = new Stack<>();
        ArrayList<Integer>buildingList = new ArrayList<>();

        if (direction.equals("WEST")) {
            for (int i = 0; i < building.length; i++) {
            if (buildWithView.isEmpty()) {
                buildWithView.push(i);
            }
            if(!buildWithView.isEmpty()&&building[i]>building[buildWithView.peek()]){
                buildWithView.push(i);
            }
            }
        }
        if (direction.equals("EAST")){
            for (int i = building.length-1; i >=0 ; i--) {
                if(buildWithView.isEmpty()){
                    buildWithView.push(i);
                }
                if (!buildWithView.isEmpty()&&building[i]>building[buildWithView.peek()]){
                        buildWithView.push(i);
                }
            }
        }

        while(!buildWithView.isEmpty()) {

            buildingList.add(buildWithView.pop());
        }
        Collections.sort(buildingList);



        return buildingList;
    }
}
