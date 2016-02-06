package com.example.ashish.one_app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Department extends Activity {
    private String[] deptArray = {"Chemical Engineering", "Civil Engineering", "Computer Science and Engineering",
            "Electrical Engineering", " Electronics and Communication Engineering", " Mechanical Engineering", " Metallurgical and " +
            "Materials", "Engineering,Information Technology", "Biotechnology", " Physics", " Chemistry", " Mathematics",
            "Environmental science", " Materials Science and Management Studies"};

    private ListView deptListView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        deptListView = (ListView) findViewById(R.id.dept_list);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, deptArray);
        deptListView.setAdapter(arrayAdapter);
    }
}
