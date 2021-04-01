package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class RecipeTest {
	/***********************Chocolate test***********************/ 
	@Test
	public void testGetAmtChocolate() throws RecipeException, NumberFormatException{
		double expected = 5;
		double actual = 0;
		String chocoAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected==actual);
	}
	
	@Test
	public void testSetPosAmtChocolate() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String chocoAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test
	public void testSetZeroAmtChocolate() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String chocoAmt = "0";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected=RecipeException.class)
	public void testSetNegAmtChocolate() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String chocoAmt = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test
	public void testSetFloatAmtChocolate() throws RecipeException, NumberFormatException {
		double expected = 5.2;
		double actual = 0.0;
		String chocoAmt = "5.2";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetParseAmtChocolate() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String chocoAmt = "x";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(chocoAmt);
		actual = objRecipe.getAmtChocolate();
		System.out.println(actual);
		assertTrue(expected==actual); // if false fails
	}
	
	
/***********************Coffee test***********************/
	@Test
	public void testGetAmtCoffee() throws RecipeException, NumberFormatException{
		double expected = 5;
		double actual = 0;
		String coffeeAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected==actual);
	}

	public void testSetPosAmtCoffee() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String coffeeAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test
	public void testSetZeroAmtCoffee() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String coffeeAmt = "0";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected=RecipeException.class)
	public void testSetNegAmtCoffee() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String coffeeAmt = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test
	public void testSetFloatAmtCoffee() throws RecipeException, NumberFormatException {
		double expected = 5.2;
		double actual = 0.0;
		String coffeeAmt = "5.2";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetParseAmtCoffee() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String coffeeAmt = "x";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtCoffee(coffeeAmt);
		actual = objRecipe.getAmtCoffee();
		System.out.println(actual);
		assertTrue(expected==actual); // if false fails
	}
	
	
	
	
/***********************Name test ***********************/
	@Test
	public void testGetName() throws RecipeException {
		String expected = "";
		String actual = "";
		String name = "";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName(name);
		actual = objRecipe.getName();
		
		assertTrue(expected==actual);
	}
	
	@Test
	public void testSetRegName() throws RecipeException {
		String expected = "";
		String actual = "";
		String name="";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName(name);
		actual = objRecipe.getName();
		assertTrue(expected==actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetNullName() throws RecipeException {
		String expected = "";
		String actual = "";
		String name= null;
		
		Recipe objRecipe = new Recipe();
		objRecipe.setName(name);
		actual = objRecipe.getName();
		assertTrue(expected==actual);
	}

	/***********************ToString test ***********************/
	@Test
	public void testToString() {
		String result= "";
		Recipe objRecipe = new Recipe();
	 assertEquals(objRecipe.toString(), result);
	}
	
	
	/***********************Price test ***********************/
	@Test
	public void testGetPrice() throws RecipeException {
		double expected = 100;
		double actual = 0;
		String price = "100";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		
		assertTrue(expected==actual);
	}
	@Test
	public void testSetPosPrice() throws RecipeException, NumberFormatException{
		double expected = 5;
		double actual = 0;
		String price = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		
		assertTrue(expected==actual); // if false fails
	}
	
	
	@Test (expected = RecipeException.class)
	public void testSetZeroPrice() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String price = "0";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected=RecipeException.class)
	public void testSetNegPrice() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String price = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test
	public void testSetFloatPrice() throws RecipeException, NumberFormatException {
		double expected = 5.2;
		double actual = 0.0;
		String price = "5.2";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		
		assertTrue(expected==actual); // if false fails
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetParsePrice() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String price = "x";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setPrice(price);
		actual = objRecipe.getPrice();
		System.out.println(actual);
		assertTrue(expected==actual); // if false fails
	}
	
/*************** Milk test**********************/
	@Test
	public void testGetAmtMilk() throws RecipeException, NumberFormatException{
		double expected = 5;
		double actual = 0;
		String milkAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milkAmt);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected==actual);
	}
	
	@Test
	public void testSetPosAmtMilk() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String milkAmt = "5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtMilk(milkAmt);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test
	public void testSetZeroAmtMilk() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String milkAmt = "0";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(milkAmt);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test(expected=RecipeException.class)
	public void testSetNegAmtMilk() throws RecipeException, NumberFormatException {
		double expected = 5;
		double actual = 0;
		String milkAmt = "-5";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(milkAmt);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test
	public void testSetFloatAmtMilk() throws RecipeException, NumberFormatException {
		double expected = 5.2;
		double actual = 0.0;
		String milkAmt = "5.2";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(milkAmt);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected==actual); // if false fails
	}
	@Test(expected = NumberFormatException.class)
	public void testSetParseAmtMilk() throws RecipeException, NumberFormatException {
		double expected = 0;
		double actual = 0;
		String milkAmt = "x";
		
		Recipe objRecipe = new Recipe();
		objRecipe.setAmtChocolate(milkAmt);
		actual = objRecipe.getAmtMilk();
		System.out.println(actual);
		assertTrue(expected==actual); // if false fails
	}
	

}
