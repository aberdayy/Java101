public class Main {
    public static void main(String[] args) {

    char[][] student_answers = {{'a', 'b', 'c', 'a', 'b', 'c', 'a', 'b', 'c', 'a'},{'a', 'b', 'c', 's', 'b', 'a', 'a', 'a', 'a', 'a'},{'s', 'b', 'c', 'f', 'b', 'c', 'f', 'b', 'c', 'a'},{'a', 'a', 'f', 'a', 'a', 'a', 'a', 'a', 'c', 'a'}};
    char[] correct_answers ={'a','a','a','a','a','a','a','a','a','a'};

    int[] score = grades(student_answers,correct_answers);

    System.out.println("student grade " +score);
    for (int i = 0; i<score.length;i++){
        System.out.println("Grade : " +score[i]);

    }


    }

    public static int grade (char[] studentAnswers, char[] correctAnswers){
        int score = 0;
        for(int i = 0; i<studentAnswers.length; i++){
            if(studentAnswers[i] == correctAnswers[i]){
                score +=10;
            }
        }
        return score;
    }


    public static int[] grades (char[][] studentAnswers, char[] correctAnswers){
        int[] result =  new int[studentAnswers.length];
        for (int x = 0; x<studentAnswers.length; x++){
                result[x] = grade(studentAnswers[x],correctAnswers);
            }
        return result;

    }

    }

