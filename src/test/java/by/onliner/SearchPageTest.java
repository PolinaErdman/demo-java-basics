package by.onliner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchPageTest {

    @Test
    public void testSearch() {
        Product expected = new Product("Apple", 1200);

        SearchPage searchPage = new SearchPage();
        searchPage.searchProduct(expected);

        Product actual = searchPage.searchProduct(expected);

        Assertions.assertEquals(expected, actual);
    }
}
