package net.kiranatos;

import org.openqa.selenium.By;

public class Demo04Locators {
    /* Selectors = Locators 
    <div id="element_id" class="element_class">
      <div name="element_name">
        <div>Text</div>
        <a ref="link">LinkText</a>
      </div>
      <a ref="link">Text</a>
    </div>   */
    private static By by;
    public static void main(String[] args) {
        by = By.id("element_id"); // ID
        by = By.name("element_name"); // NAME
        by = By.className("element_class"); // CLASS NAME
        by = By.tagName("a"); // TAG NAME
        by = By.linkText("Text"); // LINK TEXT
        by = By.partialLinkText("Text"); // PARTIAL LINK TEXT
        by = By.cssSelector("div.element_class"); // CSS SELECTOR
        by = By.xpath("//div[@id='element_id']"); // XPATH
    }
}
