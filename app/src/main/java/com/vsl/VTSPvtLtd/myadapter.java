package com.vsl.VTSPvtLtd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewHolder>{

    model data[];

    public myadapter(model[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewHolder holder, int position) {
        holder.t1.setText(data[position].getNo());
        holder.t2.setText(data[position].getCustomer_No());
        holder.t3.setText(data[position].getCustomer_Name());
        holder.t4.setText(data[position].getCustomer_PO_No_());
        holder.t5.setText(data[position].getPosting_Date());
        holder.t6.setText(data[position].getTransporter_Name());
        holder.t7.setText(data[position].getScanned());
        holder.t8.setText(data[position].getDocument_Status());
        holder.t9.setText(data[position].getQC_Remarks());
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class myviewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;

        public myviewHolder(@NonNull View itemView) {
            super(itemView);

            t1= itemView.findViewById(R.id.No);
            t2= itemView.findViewById(R.id.Customer_No);
            t3= itemView.findViewById(R.id.Customer_Name);
            t4= itemView.findViewById(R.id.Customer_PO_No_);

            t5= itemView.findViewById(R.id.Posting_Date);
            t6= itemView.findViewById(R.id.Transporter_Name);
            t7= itemView.findViewById(R.id.Scanned);
            t8= itemView.findViewById(R.id.Document_Status);
            t9= itemView.findViewById(R.id.QC_Remarks);

        }
    }

}
