package org.example;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

                                                                                            //The Gathering
//____________________________________________________________________________________________________________________________________________________________________________________________________
class ShoppingCartTest {

//Arrange
//@Test
//void calculatePriceForMagicCards_red() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "red", null, "The Gathering", null);
//Action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 3.5);
//}

//Arrange
//@Test
//void calculatePriceForMagicCards_blue() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering", null);
//Action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 5.0);
//}


//Arrange
//@Test
//void calculatePriceForMagicCards_green() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Maga Eternal", null);
//action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 4.40 );
//}

//Arrange
//@Test
//void calculatePriceForMagicCards_black() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Maga Eternal", null);
//Action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 6.80  );
//}

//Arrange
//@Test
//void calculatePriceForMagicCards_brown() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Maga Eternal", null);
//Action
//shoppingCart.addProduct(product);
//Expeted
//assertEquals(shoppingCart.getTotalPrice(), 2.0  );
//}


//Arrange
//@Test
//void calculatePriceForMagicCards_The_Black_Lotus () {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, null, false, "BLack", null, "Magic: The Gathering - Black Lotus", null);
//Action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 40000.00  );
//}
                                                                                                //testing animals by types
//__________________________________________________________________________________________________________________________________________________________________________________________________________________________________

//Arrange
//@Test
//void calculatePriceForPetsTypes_Land() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(4, null, false, "null", null, "Perro", null);
//Action
//shoppingCart.addProduct(product);
//Expected
//assertEquals(shoppingCart.getTotalPrice(), 16.80  );
//}

//Arrange
@Test
void calculatePriceForPetsTypes_Aquatic_and_Colors_blue() {
ShoppingCart shoppingCart = new ShoppingCart();
Product product = new Product(null, null, false, "blue", null, "Pez", BigDecimal.valueOf(0.1));
//Action
shoppingCart.addProduct(product);
//Expected
assertEquals(shoppingCart.getTotalPrice(), 0.1  );
}


//Arrange
@Test
void calculatePriceForPetsTypes_Aquatic_and_Colors_gold() {
ShoppingCart shoppingCart = new ShoppingCart();
Product product = new Product(null, null, false, "blue", null, "Pez", BigDecimal.valueOf(100));
//Action
shoppingCart.addProduct(product);
//Expected
assertEquals(shoppingCart.getTotalPrice(), 100  );
}



                                                                                                //testing the gourmet Products
//__________________________________________________________________________________________________________________________________________________________________________________________________________________________________

//@Test
//void calculatePriceForWine() {
//ShoppingCart shoppingCart = new ShoppingCart();
//Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);
//shoppingCart.addProduct(product);
//assertEquals(shoppingCart.getTotalPrice(), 100.0);
//}

//@Test
//void calculatePriceForCheese() {
//ShoppingCart shoppingCart = new ShoppingCart();

//Product product = new Product(null, 5, true, null, null, "French Camembert", null);

//shoppingCart.addProduct(product);

//assertEquals(shoppingCart.getTotalPrice(), 50.0);

// }
}