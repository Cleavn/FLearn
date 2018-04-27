package cleavn.flearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class CategoryAdapter extends ArrayAdapter<String> {

    public CategoryAdapter(@NonNull Context context, String[] categoryName, String[] categoryDescr) {
        super(context, R.layout.category_item , categoryName);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View categoryView = layoutInflater.inflate(R.layout.category_item, parent, false);

        String categoryItem = getItem(position);
        String categoryItemDescr = getItem(position);
        View categoryColor = (View) categoryView.findViewById(R.id.colorImageView);
        TextView categoryName = (TextView) categoryView.findViewById(R.id.categoryNameTextView);
        TextView categoryDescr = (TextView) categoryView.findViewById(R.id.categoryDescrTextView);

        categoryColor.setBackgroundColor(0xFF00FF00);
        categoryName.setText(categoryItem);
        categoryDescr.setText(categoryItemDescr);

        return categoryView;
    }
}
