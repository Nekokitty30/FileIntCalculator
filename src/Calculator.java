import java.util.ArrayList;

public class Calculator {

    int sum(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((x, y) -> x + y).get();
        System.out.println(answer);
        return answer;

    }

    long min(ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x < 0).count();
        System.out.println(answer);
        return answer;

    }


    long max(ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x > 0).count();
        System.out.println(answer);
        return answer;

    }

    int min1(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((x,y) -> Math.min(x,y)).get();
        System.out.println(answer);
        return answer;

    }

    int max1(ArrayList<Integer> arrayList) {
        int answer = arrayList.stream().reduce((x,y) -> Math.max(x,y)).get();
        System.out.println(answer);
        return answer;

    }

        long zero (ArrayList<Integer> arrayList) {
        long answer = arrayList.stream().filter((x) -> x == 0).count();
        System.out.println(answer);
        return answer;

    }
}