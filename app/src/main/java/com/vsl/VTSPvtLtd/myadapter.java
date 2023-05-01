package com.vsl.VTSPvtLtd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewHolder> {

    model[] data;

    public myadapter(model[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow, parent, false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.t1.setText(data[position].getPostId());
        holder.t2.setText(data[position].getId());
        holder.t3.setText(data[position].getName());
        holder.t4.setText(data[position].getEmail());
        holder.t5.setText(data[position].getBody());

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    static class myviewHolder extends RecyclerView.ViewHolder {

        Context context;
        TextView t1, t2, t3, t4, t5;
        LinearLayout linearLayout;

        public myviewHolder(@NonNull View itemView) {
            super(itemView);

            this.t1 = itemView.findViewById(R.id.postId);
            this.t2 = itemView.findViewById(R.id.id);
            this.t3 = itemView.findViewById(R.id.name);
            this.t4 = itemView.findViewById(R.id.email);
            this.t5 = itemView.findViewById(R.id.body);
            this.linearLayout = itemView.findViewById(R.id.lld);
            context = itemView.getContext();

            this.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //i need counterNumber value here


                    String postid = t1.getText().toString();
                    String id = t2.getText().toString();
                    String name = t3.getText().toString();
                    String email = t4.getText().toString();
                    String body = t5.getText().toString();

                    final Intent intent;
                    intent = new Intent(context, ShowData.class);


                    intent.putExtra("postid", postid);
                    intent.putExtra("id", id);
                    intent.putExtra("name", name);
                    intent.putExtra("email", email);
                    intent.putExtra("body", body);
                    context.startActivity(intent);


                }
            });
        }
    }

}
