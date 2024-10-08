package com.crio.xquiz;
import java.util.*;

public class Question{
   private String questionText;
   private String answer;
   private List<String> choices;
        public Question(String questionText,List<String> choices,String answer){
                if(questionText==null || questionText.isEmpty()){
                        System.out.println("Question text cannot be null or empty!");
                }
                else if(choices==null || choices.isEmpty()){
                        System.out.println("Choices cannot be null or empty!");
                }
                else if(answer==null || answer.isEmpty()){
                        System.out.println("Answer cannot be null or empty!");
                }
                else if(!choices.contains(answer)){
                        System.out.println("Answer is not present among the choices!");
                }
                else{
                        this.questionText=questionText;
                        this.choices=choices;
                        this.answer=answer;
                }
        }
            
        
    public String getAnswer(){
        return this.answer;
    }

    public String getQuestionText(){
        return this.questionText;
    }

    public List<String> getChoices(){
        return this.choices;
    }

    public boolean checkAnswer(String answer){
        if(this.answer==answer || this.answer.equals(answer)){
                return true;
        }
        else{
                return false;
        }
    }


public void display(){
    System.out.println(getQuestionText());
    for(int i = 0; i < choices.size(); i++){
        int choiceNumber = i + 1;
        System.out.println(choiceNumber + ":" + choices.get(i));
    }
}

}

