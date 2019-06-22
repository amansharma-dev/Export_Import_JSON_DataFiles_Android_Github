package com.example.export_import_json_datafiles_android_github;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.export_import_json_datafiles_android_github.model.DataItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataItemAdapter extends RecyclerView.Adapter<DataItemAdapter.MyViewHolder> {

    private List<DataItem> dataItemList;
    private Context context;

    public DataItemAdapter(Context context,List<DataItem> dataItemList) {
        this.dataItemList = dataItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public DataItemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataItemAdapter.MyViewHolder myViewHolder, int i) {
        DataItem dataItem = dataItemList.get(i);

        InputStream inputStream = null;


        try {
            String imageFile = dataItem.getArtistImage();
            inputStream = context.getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream,null);

            myViewHolder.artistImage.setImageDrawable(drawable);
            myViewHolder.artistSongName.setText(dataItem.getSongName());
            myViewHolder.artistName.setText(dataItem.getArtistName());
            myViewHolder.artistGenre.setText(dataItem.getArtistGenre());
            myViewHolder.songPrice.setText(String.valueOf(dataItem.getSongPrice()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public int getItemCount() {
        return dataItemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView artistImage;
        TextView artistSongName;
        TextView artistName;
        TextView artistGenre;
        TextView songPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            artistImage = itemView.findViewById(R.id.image_view_artist);
            artistSongName = itemView.findViewById(R.id.song_name);
            artistName = itemView.findViewById(R.id.artist_name);
            artistGenre = itemView.findViewById(R.id.artist_genre);
            songPrice = itemView.findViewById(R.id.song_price);
        }
    }
}
