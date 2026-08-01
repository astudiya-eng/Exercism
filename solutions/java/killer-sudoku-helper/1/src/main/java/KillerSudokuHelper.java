import java.util.ArrayList;
import java.util.List;

public class KillerSudokuHelper {

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {
        List<List<Integer>> result = new ArrayList<>();
        
        int excludeMask = 0;
        for (int num : exclude) {
            excludeMask |= (1 << num);
        }

        search(1, cageSum, cageSize, excludeMask, new ArrayList<>(), result);
        return result;
    }

    List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {
        return combinationsInCage(cageSum, cageSize, List.of());
    }

    private void search(int start, int sum, int size, int mask, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == size) {
            if (sum == 0) result.add(new ArrayList<>(current));
            return;
        }

        for (int digit = start; digit <= 9; digit++) {
            if (digit > sum) break; // Твоя оптимизация!

            if ((mask & (1 << digit)) == 0) {
                current.add(digit);
                search(digit + 1, sum - digit, size, mask, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}