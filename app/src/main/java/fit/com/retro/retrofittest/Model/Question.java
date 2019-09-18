package fit.com.retro.retrofittest.Model;

import com.google.gson.annotations.SerializedName;

public class Question {
    public String title;
    public String body;

    @SerializedName("question_id")
    public String questionId;


    public String toString(){
        return title;
    }

}
