package fi.masa.harjoittelua;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TriangleTest {

	@Mock
	private KonsoliLukija lukija;
	
	private Triangle laskuri = new Triangle();
	
	
	@Test
	public void shouldReturnCorrectTriangle() {
	    when(lukija.read()).thenReturn("kyllä", "5");
	    String expected = 
	            "     * \n" + 
	            "    * * \n" + 
	            "   * * * \n" + 
	            "  * * * * \n" + 
	            " * * * * * \n" + 
	            "  * * * *\n" + 
	            "   * * *\n" + 
	            "    * *\n" + 
	            "     *\n" +
	            "    \n";
	    String result = laskuri.laskeNumero(lukija);
	    assertThat(result).isEqualTo(expected);
	}
}
