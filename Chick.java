class Chick implements Animal{
	private String myType;
	private String mySound;
    public Chick(String type, String young, String old){
    	myType = type;
    	if ((int)(Math.random()*2) == 0)
    		mySound = young;
    	else 
    		mySound = old;
    }
    public String getSound(){return mySound;}
    public String getType(){return myType;}
}