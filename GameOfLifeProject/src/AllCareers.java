import java.util.ArrayList;

public class AllCareers {
	 static ArrayList<Career> careerChoice =new ArrayList<Career>();
	public static void main(String[] args) {
		careerChoice.add(new Career("Acting",5000,80000,false));
		careerChoice.add(new Career("Animation Art/Comics",18000,80000,true));
		careerChoice.add(new Career("Art and Design",18000,110000,true));
		careerChoice.add(new Career("Aviation",22000,90000,true));
		careerChoice.add(new Career("Beauty",20000,90000,false));
		careerChoice.add(new Career("Broadcasting",20000,80000,true));
		careerChoice.add(new Career("Building",22000,90000,false));
		careerChoice.add(new Career("Computer/Internet",20000,80000,false));
		careerChoice.add(new Career("Corporate",18000,100000,true));
		careerChoice.add(new Career("Criminal Justice",25000,120000,true));
		careerChoice.add(new Career("Design",22000,90000,true));
		careerChoice.add(new Career("Education",20000,90000,true));
		careerChoice.add(new Career("Enviornment/Agriculture",25000,100000,false));
		careerChoice.add(new Career("Health",25000,120000,true));
		careerChoice.add(new Career("Hospitality",20000,85000,false));
		careerChoice.add(new Career("Journalism",21000,90000,true));
		careerChoice.add(new Career("Military",21000,100000,true));
		careerChoice.add(new Career("Miscellaneous",18000,80000,false));
		careerChoice.add(new Career("Retail",21000,80000,false));
		careerChoice.add(new Career("Music",20000,60000,false));
		careerChoice.add(new Career("Small Buisness",19000,110000,false));
		careerChoice.add(new Career("Science",20000,75000,true));
		careerChoice.add(new Career("Sports",22000,12000,false));
		careerChoice.add(new Career("Writer/Media",25000,12000,true));
		careerChoice.add(new Career("Movie",23000,11000,true));
	}

}
