import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {

    private static final List<String> STUDENTS = List.of(
        "Alice", "Bob", "Charlie", "David",
        "Eve", "Fred", "Ginny", "Harriet",
        "Ileana", "Joseph", "Kincaid", "Larry"
    );

    private final String row1;
    private final String row2;

    KindergartenGarden(String garden) {
        String[] rows = garden.split("\n");
        this.row1 = rows[0];
        this.row2 = rows[1];
    }

    List<Plant> getPlantsOfStudent(String student) {
        int studentIndex = STUDENTS.indexOf(student);

        int startIndex = studentIndex * 2;

        List<Plant> studentPlants = new ArrayList<>();

        studentPlants.add(Plant.getPlant(row1.charAt(startIndex)));
        studentPlants.add(Plant.getPlant(row1.charAt(startIndex + 1)));
        studentPlants.add(Plant.getPlant(row2.charAt(startIndex)));
        studentPlants.add(Plant.getPlant(row2.charAt(startIndex + 1)));

        return studentPlants;
    }
}
