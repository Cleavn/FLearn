package cleavn.flearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends ArrayAdapter<Category>{

    public CategoryAdapter(Context context, ArrayList<Category> category) {
        super(context,0 ,category);
    }

}
