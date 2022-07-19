package com.example.studentmanagement;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentAdapter extends ArrayAdapter<String> {
    Context context;
    Integer[] thumbnails;
    String[] items;

    public StudentAdapter(Context context, int layoutToBeInflated,
                                  String[] items) {
        super(context, R.layout.student_element, items);
        this.context = context;
//        this.thumbnails = thumbnails;
        this.items = items;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.student_element, null);
        TextView label = (TextView) row.findViewById(R.id.label);
//        ImageView icon = (ImageView) row.findViewById(R.id.icon);
        label.setText(items[position]);
//        icon.setImageResource(thumbnails[position]);
        return (row);
    }
}
