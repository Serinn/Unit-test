package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Recipe {
    private String name;
    private double price;
    private int amtCoffee;
    private double amtMilk;
    private int amtSugar;
    private double amtChocolate;
    
    public Recipe() {
    	this.name = "";
    	this.price = 0;
    	this.amtCoffee = 0;
    	this.amtMilk = 0;
    	this.amtSugar = 0;
    	this.amtChocolate = 0;
    }
   
    public double getAmtChocolate() {
		return amtChocolate;
	}
   
    public void setAmtChocolate(String chocolate) throws RecipeException {
    	double amtChocolate = 0;
    	try {
    		amtChocolate = Double.parseDouble(chocolate);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error while parsing amount of chocolate!"); 
    		//1. "Units of chocolate must be a positive integer" message is corrected 
    		//2. Thrown exception type is also corrected from RecieException 
    	}
		if (amtChocolate >= 0) {
			this.amtChocolate = amtChocolate;
		} else {
			throw new RecipeException("Units of chocolate must be a positive integer");
		}
	}
   
    public double getAmtCoffee() {
		return amtCoffee;
	}
    
    public void setAmtCoffee(String coffee) throws RecipeException {
    	int amtCoffee = 0;
    	try {
    		amtCoffee = Integer.parseInt(coffee);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error while parsing amount of coffee!");
    		//1. "Units of coffee must be a positive integer" message is corrected
    		//2. Thrown exception is also corrected from RecipeException
    	}
		if (amtCoffee >= 0) {
			this.amtCoffee = amtCoffee;
		} else {
			throw new RecipeException("Units of coffee must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtMilk.
	 */
    public double getAmtMilk() {
		return amtMilk;
	}
    /**
	 * @param amtMilk   The amtMilk to set.
	 */
    public void setAmtMilk(String milk) throws RecipeException{
    	double amtMilk = 0;
    	try {
    		amtMilk = Double.parseDouble(milk);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error while parsing amount of milk!");
    		//1. "Units of milk must be a positive integer"
    		//2. Thrown exception is also corrected from RecipeException 
    	}
		if (amtMilk >= 0) {
			this.amtMilk = amtMilk;
		} else {
			throw new RecipeException("Units of milk must be a positive integer");
		}
	}
    /**
	 * @return   Returns the amtSugar.
	 */
    public int getAmtSugar() {
		return amtSugar;
	}
    /**
	 * @param amtSugar   The amtSugar to set.
	 */
    public void setAmtSugar(String sugar) throws RecipeException {
    	int amtSugar = 0;
    	try {
    		amtSugar = Integer.parseInt(sugar);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Units of sugar must be a positive integer");
    		//1. "Units of sugar must be a positive integer" message is corrected
    		//2. Thrown exception is also corrected from RecipeException
    	}
		if (amtSugar >= 0) {
			this.amtSugar = amtSugar;
		} else {
			throw new RecipeException("Units of sugar must be a positive integer");
		}
	}
    /**
	 * @return   Returns the name.
	 */
    public String getName() {
		return name;
	}
    /**
	 * @param name   The name to set.
	 */
    public void setName(String name) throws RecipeException {
    	if(name != null) {
    		this.name = name;
    	}
    	else { //handle the null case 
    		throw new RecipeException("Name could not be NULL");
    	}
	}
    /**
	 * @return   Returns the price.
	 */
    public double getPrice() {
		return price;
	}
    /**
	 * @param price   The price to set.
	 */
    public void setPrice(String price) throws RecipeException{
    	double amtPrice = 0;
    	try {
    		amtPrice = Double.parseDouble(price);
    	} catch (NumberFormatException e) {
    		throw new NumberFormatException("Error while parsing price!");
    		// 1. "Price must be a positive integer" message is corrected
    		//2. Thrown exception is also corrected from RecipeException
    	}
		if (amtPrice > 0) { // there's no zero price
			this.price = amtPrice; }
			else if (amtPrice==0) {
				throw new RecipeException("There is no zero price, there has to be a price!");
			}
		 else {
			throw new RecipeException("Price must be a positive integer");
		}
	} 
    
    /**
     * Returns the name of the recipe.
     * @return String
     */
    public String toString() {
    	return name;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Recipe other = (Recipe) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

