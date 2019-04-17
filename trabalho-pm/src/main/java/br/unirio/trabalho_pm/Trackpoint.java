package br.unirio.trabalho_pm;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que exemplifica um ponto no espaço.
 * @author diego
 *
 */

public class Trackpoint {
		
	private @Getter @Setter double latitude;
	private @Getter @Setter double longitude;
	private @Getter @Setter double elevation;
	private @Getter @Setter String time;
}
