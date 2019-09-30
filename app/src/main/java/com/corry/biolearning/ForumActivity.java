package com.corry.biolearning;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.corry.biolearning.Shareclass.ForumAdapter;
import com.corry.biolearning.Shareclass.ForumModel;
import com.corry.biolearning.Shareclass.Function;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForumActivity extends AppCompatActivity {


    List<ForumModel> forums;
    ForumAdapter fAdapter;


    FirebaseDatabase database = FirebaseDatabase.getInstance();

    DatabaseReference myRef = null;

    LinearLayout llforum;
    RecyclerView rvforum;
    LinearLayout llpostforum;
    AppCompatEditText edxpost;
    AppCompatImageView imgpost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);

        database.setPersistenceEnabled(false);
        myRef = database.getReference("forumgroup");
        myRef.keepSynced(false);

        declareComponent();

        retrieveDataFirebase();


        imgpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Function.writeForumDiscussion(getApplicationContext(), FirebaseAuth.getInstance().getCurrentUser().getEmail(), edxpost.getText().toString() == null ? "" : edxpost.getText().toString());

                } catch (Exception e) {
                    e.printStackTrace();

                }

                edxpost.setText("");
            }
        });
    }


    private void declareComponent() {


        llforum = findViewById(R.id.ll_forum_id);
        rvforum = findViewById(R.id.rv_forum_id);
        llpostforum = findViewById(R.id.ll_post_forum_id);
        edxpost = findViewById(R.id.edx_post_id);
        imgpost = findViewById(R.id.img_post_id);


    }


    private void retrieveDataFirebase() {


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println("Data shapshow==> " + dataSnapshot.getChildren());


                if (dataSnapshot.exists()) {


                    forums = new ArrayList<>();
                    forums.clear();


                    for (DataSnapshot npsnapshot : dataSnapshot.getChildren()) {
                        ForumModel l = npsnapshot.getValue(ForumModel.class);
                        Log.d("trace_me", l.getEmailPoster());
                        Log.d("trace_me", l.getMessagePoster());


                        forums.add(l);


                    }


                }


                if (forums != null) {


                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms


                            Collections.reverse(forums);
                            fAdapter = new ForumAdapter(forums);


                            RecyclerView.LayoutManager layoutManager =
                                    new LinearLayoutManager(ForumActivity.this);
                            rvforum.setLayoutManager(layoutManager);
                            rvforum.setHasFixedSize(true);
                            rvforum.setAdapter(fAdapter);
                            fAdapter.notifyDataSetChanged();


                        }
                    }, 200);
                } else if (forums == null) {

                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //Do something after 100ms


                            Function.showToast(getApplicationContext(), "Data forum kosong");

                        }
                    }, 100);

                }


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });


    }


    //                    Function.writeForumDiscussion(getApplicationContext(), FirebaseAuth.getInstance().getCurrentUser().getEmail(), generateRandomString(100));
}
