package com.example.studentmanagement;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class StudentList extends ListActivity {
    TextView txtMsg;
    String[] studentName = { "Data-1", "Data-2", "Data-3", "Data-4", "Data-5",
            "Data-6", "Data-7", "Data-8", "Data-9", "Data-10", "Data-11",
            "Data-12", "Data-13", "Data-14", "Data-15" };
//    Integer[] thumbnails = { };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        txtMsg = (TextView) findViewById(R.id.txtMsg);
//        CustomIconLabelAdapter adapter = new CustomIconLabelAdapter(
//                this,
//                R.layout.custom_row_icon_label,
//                items,
//                thumbnails);
//// bind intrinsic ListView to custom adapter
//        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = " Position: " + position + " " + studentName[position];
        txtMsg.setText(text);
    }
}
