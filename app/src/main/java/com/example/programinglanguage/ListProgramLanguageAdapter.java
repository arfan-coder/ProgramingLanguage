package com.example.programinglanguage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListProgramLanguageAdapter extends RecyclerView.Adapter<ListProgramLanguageAdapter.ListViewHolder> {
    private ArrayList<ProgramingLanguage> list;

    public ListProgramLanguageAdapter(ArrayList<ProgramingLanguage> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View programs = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        return new ListViewHolder(programs);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        ProgramingLanguage program = list.get(position);

        Glide.with(holder.itemView.getContext())
                .load(program.getProgramingPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.photo);

        holder.name.setText(program.getProgramName());
        holder.detail.setText(program.getProgramDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent todetail = new Intent(view.getContext(), Detail.class);
                todetail.putExtra("objek", list.get(position));
                view.getContext().startActivity(todetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView photo;
        TextView name, detail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            detail = itemView.findViewById(R.id.detail);
        }
    }
}
