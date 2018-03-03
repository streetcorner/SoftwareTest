package cn.tju.tiei;


import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class testHamcrest {

	@Test
	public void test() {
		Assert.assertThat("abcdefg", allOf(startsWith("abc")));
	}
}
