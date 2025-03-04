package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPageUserInterface extends PageObject {

    public static final Target SHOPPING_CART_BUTTON = Target.the("SHOPPING CART")
            .locatedBy("//*[@id=\"shopping_cart_container\"]/a");

    public static final Target REMOVE_TO_CART1 = Target.the("button remove cart")
            .locatedBy("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/button");

    public static final Target PRODUCT_NAME_1 = Target.the("Nombre del producto 1")
            .locatedBy("//*[@id=\"item_4_title_link\"]/div");
    public static final Target PRODUCT_NAME_2 = Target.the("Nombre del producto 2")
            .locatedBy("//*[@id=\"item_0_title_link\"]/div");
    public static final Target PRODUCT_NAME_3 = Target.the("Nombre del producto 3")
            .locatedBy("//*[@id=\"item_1_title_link\"]/div");
    public static final Target PRODUCT_NAME_4 = Target.the("Nombre del producto 4")
            .locatedBy("//*[@id=\"item_5_title_link\"]/div");
    public static final Target PRODUCT_NAME_5 = Target.the("Nombre del producto 5")
            .locatedBy("//*[@id=\"item_2_title_link\"]/div");
    public static final Target PRODUCT_NAME_6 = Target.the("Nombre del producto 6")
            .locatedBy("//*[@id=\"item_3_title_link\"]/div");

    public static final Target PRODUCT_ADD1 = Target.the("Agregar primer producto")
            .locatedBy("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
    public static final Target PRODUCT_ADD2 = Target.the("Agregar primer producto")
            .locatedBy("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button");
    public static final Target PRODUCT_ADD3 = Target.the("Agregar primer producto")
            .locatedBy("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button");

    public static final Target SORT_DROPDOWN = Target.the("Product sort dropdown")
            .locatedBy("//*[@id=\"inventory_filter_container\"]/select/option[2]");

    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button")
            .locatedBy("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]");

    public static Target LIST_PRODUCTS_IN_THE_CART = Target.the("Lista de productos en el carrito")
            .locatedBy("//div[@class='cart_item']//div[@class='inventory_item_name']");


}

