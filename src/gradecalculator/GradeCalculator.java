package gradecalculator;

public class GradeCalculator {
    
    public static void main(String[] args) {
        
        //This is a comment that was added on the remote repo!
        double[] grades = {44.3, 60.6, 90.4, 78, 88, 33.34, 94, 44, 69, 77};
        
        System.out.printf("Average of all %d grades is: %.2f\n", grades.length, calcAvg(grades));
    }
    
    public static double calcAvg(double[] grades){
        
        double finalCalc = 0;
        
        for (double grade : grades){
            
            if(grade > 0)
                finalCalc += grade;
        }
        
        finalCalc = finalCalc / grades.length;
        
        return finalCalc;
    }
}
