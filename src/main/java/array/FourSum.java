package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class FourSum {


    public static int largestSumAfterKNegations(int[] A, int K) {
        int changeNum = 0;
        List<Integer> results = new ArrayList<>();
        for (int j = 0; j < K; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    changeNum++;
                    A[j] = 1;
                 }
                sum += 1;

                if (changeNum == K && A[i] == 0) {
                    results.add(sum);
                }
            }
        }

        Arrays.sort(results.toArray());
        return  results.get(results.size());
    }


    public static void main(String[] args) {
        int[] A = {1,1,1,0,0,0,1,1,1,1,0};
        largestSumAfterKNegations(A, 2);
    }

}
