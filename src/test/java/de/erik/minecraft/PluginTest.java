package de.erik.minecraft;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;

public class PluginTest {

	@Test
	public void doWhatever() throws IOException {
		// setup
		// test
		boolean result = Plugin.doWhatever(null);
		// assert
		assertThat(result).isTrue();
	}

}
