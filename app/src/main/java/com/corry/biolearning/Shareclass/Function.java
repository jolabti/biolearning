package com.corry.biolearning.Shareclass;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Function {


    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

//    public static void writeForumDiscussion(Context context, String email, final String message){
//
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//
//        myRef.push().setValue(email +" : "+ message);
//
//    }

    public static void writeForumDiscussion(Context context, String email, final String message) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("forumgroup");


        String userId = myRef.push().getKey();

        // creating user object
        ForumModel forumModel = new ForumModel(email, message);

        // pushing user to 'users' node using the userId

        myRef.push().setValue(forumModel);


//                myRef.push().setValue(email + " : " + message);

    }

}
