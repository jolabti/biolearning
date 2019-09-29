package com.corry.biolearning.Shareclass;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.corry.biolearning.R;

 import java.util.List;

public class ForumAdapter extends RecyclerView.Adapter<ForumAdapter.ForumViewHolder> {


    private List<ForumModel> mForumShow  ;
    private Context mContext;

    public ForumAdapter(List<ForumModel> mForumShow) {

       this.mForumShow = mForumShow;
    }


    @NonNull
    @Override
    public ForumAdapter.ForumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_forum, parent, false);
        ForumViewHolder viewHolder = new ForumViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForumAdapter.ForumViewHolder holder, int position) {

        ForumModel fm = mForumShow.get(position);

        holder.tvForum.setText(fm.emailPoster +" "+fm.messagePoster);
    }

    @Override
    public int getItemCount() {

        Log.d("trace_dasize", String.valueOf(mForumShow.size()));
        return mForumShow.size();
    }


    public class ForumViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView tvForum;

        public ForumViewHolder(@NonNull View itemView) {
            super(itemView);

            tvForum = itemView.findViewById(R.id.show_post_id);
        }
    }


}
