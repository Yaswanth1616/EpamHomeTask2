package Sweets;
public class Sweet {     
private float sugarQuantity;
private float sweetPrice;
private String sweetColor;
private String sweetName;
private int count;
private float weight;

public Sweet(String sweetName,float sugarQuantity,float SweetPrice,float weight,String sweetColor,int count)
{
	setSweetName(sweetName);
	setSugarQuantity(sugarQuantity);
	setSweetPrice(sweetPrice);
	setSweetColor(sweetColor);
	setCount(count);
	setWeight(weight);
}
public String getSweetName() {  
	return sweetName;
}
public void setSweetName(String sweetName) {
	this.sweetName = sweetName;
}
public float getSugarQuantity() {
	return sugarQuantity;
}
public void setSugarQuantity(float sugarQuantity) {
	this.sugarQuantity = sugarQuantity;
}
public float getSweetPrice() {
	return sweetPrice;
}
public void setSweetPrice(float sweetPrice) {
	this.sweetPrice = sweetPrice;
}
public String getSweetColor() {
	return sweetColor;
}
public void setSweetColor(String sweetColor) {
	this.sweetColor = sweetColor;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public float getWeight() {
	return weight;
}
public void setWeight(float weight) {
	this.weight = weight;
}
}
