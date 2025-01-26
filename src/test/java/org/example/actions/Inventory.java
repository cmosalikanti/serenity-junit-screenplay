package org.example.actions;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Inventory {
    public static final Target INVENTORY_LIST = Target.the("the inventory list")
            .located(By.cssSelector(".inventory_list"));

}
