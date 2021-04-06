package co.edu.unipiloto.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public Drink(String name, String description, int imageResourceId){
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.name = name;
    }

    public static final Drink[] drinks = {
      new Drink("Latte", "bebida de café hecha con espresso y leche al vapor",R.drawable.latte),
      new Drink("Capuccino", "bebida preparada con café expreso y leche montada con vapor para darle cremosidad", R.drawable.capuccino),
      new Drink("Filter", "bebida preparada con los granos de cafe mejor calidad",R.drawable.filter)
    };

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description; }

    public void setDescription(String description) {this.description = description; }

    public int getImageResourceId() {return imageResourceId; }

    public void setImageResourceId(int imageResourceId) {this.imageResourceId = imageResourceId; }
}
