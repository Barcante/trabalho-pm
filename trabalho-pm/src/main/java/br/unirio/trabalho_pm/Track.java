package br.unirio.trabalho_pm;

import java.util.List;

import lombok.Getter;

public class Track {
	
	private @Getter String name;
	
	private List<Tracksegment> segments;
	
	public void addSegment(Tracksegment segment) {
		segments.add(segment);
	}
	
	public void removeSegment(int index) {
		segments.remove(index);
	}
	
	public Tracksegment getSegment(int index) {
		return segments.get(index);
	}

	public Iterable<Tracksegment> getSegment(){
		return segments;
	}

}
