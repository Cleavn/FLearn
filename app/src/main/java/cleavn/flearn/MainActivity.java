package cleavn.flearn;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // Create list of dummycategories

    String[] dummycategories = {"english", "math", "whatever"};
    String[] dummycatdescr = {"business english vocabluary", "formular", "whatever"};

    Category cat1 = new Category(dummycategories[1],dummycatdescr[1], Category.CategoryColor.BLUE);

    Category[] categories = new Category[] {cat1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListAdapter categoryAdapter = new CategoryAdapter(this, dummycategories, dummycatdescr);
        ListView listView = (ListView) findViewById(R.id.categoryListView);
        listView.setAdapter(categoryAdapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);


    }

}
