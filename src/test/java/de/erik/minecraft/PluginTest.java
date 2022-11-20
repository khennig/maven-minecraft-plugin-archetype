package de.erik.minecraft;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class PluginTest {

	private ServerMock server;
	private Plugin plugin;

	@Test
	public void doWhatever() throws IOException {
		// setup
		// test
		boolean result = plugin.doWhatever(null);
		// assert
		assertThat(result).isTrue();
	}

	@Before
	public void setUp() {
		server = MockBukkit.mock();
		plugin = MockBukkit.load(Plugin.class);
	}

	@After
	public void tearDown() {
		MockBukkit.unmock();
	}

}
