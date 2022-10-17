public class BooleanComparisons {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 95;
        System.out.println(chemistryGrade >= biologyGrade);
        System.out.println(chemistryGrade == englishGrade);
        System.out.println(chemistryGrade != englishGrade);

        String sentence = "Working!";
        String sentence2 = "Working!";
        System.out.println(!sentence.equals(sentence2));

        // double sales = 37.5;
        // double costs = 7.89;
        // System.out.println(costs > sales);
    }
}
