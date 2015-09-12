package com.pason.learnlistview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends Activity {

    private String[] str = {"aa","bb","cc","aa","bb","cc","bb","cc","aa","bb","cc"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //if there is only a listView without TextView or Button,needn't setContentView
        setContentView(R.layout.activity_main);
        //if extends ListActivity,needn't write this
        ListView listView = (ListView)findViewById(R.id.list);
        //if reference a resource xml file,using the following
    //    ListAdapter adapter = ArrayAdapter.
    //          createFromResource(this,R.array.myarrays,android.R.layout.simple_list_item_1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        //if extends ListActivity,there will be this.setListAdapter();
        listView.setAdapter(adapter);
    }
}
