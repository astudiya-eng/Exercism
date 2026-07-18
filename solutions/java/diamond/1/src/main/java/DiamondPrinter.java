import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        int targetIndex = a - 'A';

        for (int i = 0; i <= targetIndex; i++) {
            char currentLetter = (char) ('A' + i);
            
            String outsideSpaces = " ".repeat(targetIndex - i);

            if (i == 0) {
                diamond.add(outsideSpaces + currentLetter + outsideSpaces);
            } else {
                String insideSpaces = " ".repeat((i * 2) - 1);
                diamond.add(outsideSpaces + currentLetter + insideSpaces + currentLetter + outsideSpaces);
            }
        }

        for (int i = targetIndex - 1; i >= 0; i--) {
            diamond.add(diamond.get(i));
        }

        return diamond;
    }
 }
