package com.example.ashish.one_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Courses extends AppCompatActivity {
    private String[] courseArray = {"B.Tech", "M.Tech", "M.B.A.", "M.C.A", "Phd", "M.Sc"};

    private ListView courseListView1;
    private ArrayAdapter arrayAdapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        courseListView1 = (ListView) findViewById(R.id.course_list);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array
        arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, courseArray);
        courseListView1.setAdapter(arrayAdapter1);
    }
}
