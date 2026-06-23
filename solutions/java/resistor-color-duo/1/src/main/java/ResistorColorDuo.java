import java.util.Arrays;
class ResistorColorDuo {
    private String[] colorsList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int value(String[] colors) {
        return getColorCod (colors[0]) * 10 + getColorCod (colors[1]);
    }
    private int getColorCod (String color){
        return Arrays.asList(colorsList).indexOf(color);
    }
}
