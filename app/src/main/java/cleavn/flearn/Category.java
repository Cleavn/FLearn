package cleavn.flearn;

public class Category {
    private String name, descr;
    private int categoryID;
    private CategoryColor categoryColor;

    public enum CategoryColor{RAW, BLUE, RED, GREEN, ORANGE, PURPLE}

    public Category(String name, String descr, CategoryColor categoryColor){
        this.categoryID = 0;
        this.name = name;
        this.descr = descr;
        this.categoryColor = categoryColor;
    }

    public Category(int categoryID, String name, String descr, CategoryColor categoryColor){
        this.categoryID = categoryID;
        this.name = name;
        this.descr = descr;
        this.categoryColor = categoryColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    static int categoryToDrawable(CategoryColor categoryColor){
        switch (categoryColor){
            case RAW:

                break;
            case BLUE:
                //return R.drawable.raw;
                break;
            case RED:
                //return R.drawable.raw;
                break;
            case GREEN:
                //return R.drawable.raw;
                break;
            case ORANGE:
                //return R.drawable.raw;
                break;
            case PURPLE:
                //return R.drawable.raw;
                break;
            default:
                //return R.drawable.raw;
                break;
        }
        //return R.drawable.raw;
        return 0;
    }
}