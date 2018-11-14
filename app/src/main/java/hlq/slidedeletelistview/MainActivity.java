package hlq.slidedeletelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hlq.com.slidedeletelistview.BtnDeleteListern;
import hlq.com.slidedeletelistview.SlideDeleteListView;

public class MainActivity extends AppCompatActivity {

    private SlideDeleteListView slideDeleteListView;
    private List<String> listDates = null;
    private ArrayAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideDeleteListView = findViewById(R.id.listview);
        listDates = new ArrayList<>(Arrays.asList("项目1", "项目2", "项目3", "项目4", "项目5", "项目6"));
        mAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listDates);
        slideDeleteListView.setAdapter(mAdapter);
        slideDeleteListView.setBtnDelClickListener(new BtnDeleteListern() {
            @Override
            public void deleteOnCliclListern(int positon) {
                Toast.makeText(MainActivity.this, "点击的是第" + positon + "项", Toast.LENGTH_SHORT).show();
            }
        });
        slideDeleteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击的是第" + position + "项", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
