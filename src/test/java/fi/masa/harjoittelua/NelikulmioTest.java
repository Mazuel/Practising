package fi.masa.harjoittelua;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class NelikulmioTest {
	
	@Mock
	private KonsoliLukija lukija;
	
	private Nelikulmio laskuri = new Nelikulmio();
	
	@Test
	public void shouldReturnCorrectCubic() {
		when(lukija.read()).thenReturn("kyllä", "4", "4");
		String expected = 
				  "****\n"
				+ "****\n"
				+ "****\n"
				+ "****";
		String result = laskuri.laskeNumero(lukija);
		assertThat(result).isEqualTo(expected);
	}
}
