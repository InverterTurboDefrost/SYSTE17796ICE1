package gradecalculator;

public class GradeCalculator {

    //This is a comment that was added later on the remote side!
    static double[] grades = {44.3, 60.6, 90.4, 78, 88, 33.34, 94, 44, 69, 77};
    
    public static void main(String[] args) {
        System.out.printf("Average of all %d grades is: %.2f\n", grades.length, calcAvg());
        System.out.printf("The highest grade is: %.2f\n", calcMax());
    }
    
    public static double calcAvg(){
        
        double finalCalc = 0;
        
        for (double grade : grades){
            
            if(grade > 0)
                finalCalc += grade;
        }
        
        finalCalc = finalCalc / grades.length;
        
        return finalCalc;
    }
    
    public static double calcMax(){
        
        double maxNumber = 0;
        
        for (int i = 1; i < grades.length; i++) 
            
             if (grades[i] > maxNumber)
                 maxNumber = grades[i];
        
         return maxNumber;
    }
    
}
