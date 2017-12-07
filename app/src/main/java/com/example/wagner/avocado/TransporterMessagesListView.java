package com.example.wagner.avocado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TransporterMessagesListView extends ArrayAdapter<String> {
    private String[] transportername;
    private String[] time;
    private Activity context;
    private String[] price;
    private Button[] acceptButton;
    private Button[] declineButton;

    public TransporterMessagesListView(Activity context, String[] transportername, String[] time, String[] price) {
        super(context, R.layout.activity_transporter_messages_list_view, transportername);
        this.context = context;
        this.transportername = transportername;
        this.time = time;
        this.price = price;
        this.acceptButton = acceptButton;
        this.declineButton = declineButton;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        TransporterMessagesListView.ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.activity_transporter_messages_list_view, null, true);
            viewHolder = new TransporterMessagesListView.ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (TransporterMessagesListView.ViewHolder) r.getTag();
        }

        viewHolder.tvw1.setText(transportername[position]);
        viewHolder.tvw2.setText(time[position]);
        viewHolder.tvw3.setText(price[position]);
        return r;
    }

    class ViewHolder {
        TextView tvw1;
        TextView tvw2;
        TextView tvw3;

        ViewHolder(View v) {
            tvw1 = v.findViewById(R.id.farmername);
            tvw2 = v.findViewById(R.id.t_time);
            tvw3 = v.findViewById(R.id.t_price);
        }
    }
}