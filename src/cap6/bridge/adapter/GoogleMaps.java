package cap6.bridge.adapter;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) throws Exception {

		String url = "https://maps.google.com.br/maps?q=maneVicente";		
		URL google;
		try {
			google = new URL(url);
			InputStream stream = google.openStream();
		} catch (Exception e) {
			throw e;
		}
		return new String();
	}

}
