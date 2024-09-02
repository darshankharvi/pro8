package com.example.pro8;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    // Array of strings...
    ListView simpleList;
    String courseList[] = {"C-Programming", "Data Structure", "Database",
            "Python",
            "Java", "Operating System", "Compiler Design", "Android Development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.activity_list_view, R.id.textView, courseList);
        simpleList.setAdapter(arrayAdapter);
    }
}
