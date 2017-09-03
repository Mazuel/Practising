package fi.masa.harjoittelua;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OnnenlaskuriTest {

	@Mock
	private KonsoliLukija lukija;

	private Onnenlaskuri onnenLaskuri = new Onnenlaskuri();

	@Test
	public void shouldReturnCorrectLuckyNumber() {
		when(lukija.lue()).thenReturn("kyllä", "7", "3");
		String onnennumero = onnenLaskuri.laskeNumero(lukija);
		assertThat(onnennumero).isEqualTo("Onnennumerosi on 1 ja onnenkerroin on 0.3184713375796178");
	}


	
	@Test
	public void vastausei() {
		when(lukija.lue()).thenReturn("ei");
		String onnennumero = onnenLaskuri.laskeNumero(lukija);
		assertThat(onnennumero).isEqualTo("Onnennumerosi on -1 ja onnenkerroin on 0.0");
	}

}
