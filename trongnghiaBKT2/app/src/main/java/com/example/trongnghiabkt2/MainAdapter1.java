package com.example.trongnghiabkt2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainAdapter1 extends FirebaseRecyclerAdapter<MainModel1,MainAdapter1.myViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter1(@NonNull FirebaseRecyclerOptions<MainModel1> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel1 model) {
            holder.TenKH.setText(model.getTenKH());
            holder.Tenthuong.setText(model.getTenthuong());
            holder.Dactinh.setText(model.getDactinh());
        Glide.with(holder.img.getContext())
                .load(model.getSurl())
                .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .circleCrop()
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);
        return new MainAdapter1.myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView TenKH,Tenthuong,Congdung,Dactinh,Lieudung;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img= (CircleImageView) itemView.findViewById(R.id.img1);
            TenKH=(TextView) itemView.findViewById(R.id.tenkhtext);
            Tenthuong=(TextView) itemView.findViewById(R.id.tentext);
            Dactinh=(TextView) itemView.findViewById(R.id.dttext);
        }
    }
}
