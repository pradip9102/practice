package org.tryout.practice;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TryoutTest {

	@Test
	void fail() {
		Assertions.fail("hey!");
	}
}
