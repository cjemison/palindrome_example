import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by cjemison on 6/27/17.
 */
public class AppTest {
  private App app;

  @Before
  public void setUp() throws Exception {
    app = new App();
  }

  @Test
  public void validPalindrome() throws Exception {
    assertTrue(app.validPalindrone("madam"));
  }

  @Test
  public void validPalindrome1() throws Exception {
    assertTrue(app.validPalindrone("nurses run"));
  }

  @Test
  public void invalidPalindrome() throws Exception {
    assertFalse(app.validPalindrone("dog"));
  }
}