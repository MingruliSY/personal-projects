public class GradeAnalyzer {
    public static void main(String[] args) {
    int [][] grades = {
        {85, 90, 88},
        {92, 87, 95},
        {78, 85, 80},
        {90, 91, 89}
    };
    
    int numberOfStudents = grades.length;
    int numberOfSubjects = grades [0].length;

    double classTotal = 0;
    int highestScore = grades[0][0];

    System.out.println("=== Student Grade Analysis ===");

    for (int i = 0; i < numberOfStudents; i++){
        int studentTotal = 0;

        for (int j = 0; j < numberOfSubjects; j++){
            studentTotal += grades[i][j];

            if (grades[i][j] > highestScore){
                highestScore = grades[i][j];
            }
        }
        double studentAverage = (double) studentTotal / numberOfStudents;
        classTotal += studentAverage;

        System.out.println("Student " + (i + 1) + " Average: " + studentAverage);

    }
    double classAverage = classTotal / numberOfStudents;

    System.out.println("---------------------------");
    System.out.println("Class Average: " + classAverage);
    System.out.println("Highest Score: " + highestScore);
  }
    
    
}
