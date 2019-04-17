package br.unirio.trabalho_pm;

import java.util.List;

public class Tracksegment {
	
	private List<Trackpoint> points;
	
	public void addPoint(Trackpoint point) {
		points.add(point);
	}
	
	public void removePoint(int index) {
		points.remove(index);
	}
	
	public Trackpoint getPoint(int index) {
		return points.get(index);
	}

	public Iterable<Trackpoint> getSegment(){
		return points;
	}
	
}
