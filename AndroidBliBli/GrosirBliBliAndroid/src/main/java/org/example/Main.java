package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
//            public static final By cancelOrder = AppiumBy.id("blibli.mobile.commerce:id/bt_cancel");
            //    public static final By orderCancel = AppiumBy.id("blibli.mobile.commerce:id/tvLabel");
           // public static final By changeAccount = AppiumBy.id("blibli.mobile.commerce:id/tv_change_payment");

        }
    }
}