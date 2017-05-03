package paint;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.IOException;

public class FPonto implements Class1D {
	private Point point;
	private Color color = Color.black;
	
	public FPonto() {
		
	}
	public FPonto(Point p) {
		this.point = p;
	}
	
	public FPonto(Point p, Color c) {
		this.point = p;
		this.color = c;
	}
	@Override
	public void draw(GraphicAdapter g){
		g.GraphicAdapter.setColor(getColor());
		g.getGraphicAdapter().drawLine(getPoint().x, getPoint().y,getPoint().x, getPoint().y);
	}
	
	@Override
    public boolean contains(Point p) {
		if(p.x == getPoint().x && p.y == getPoint().y){
			return true;
		}
		return false;
    }
    @Override
    public void move(Point startDrag, Point endDrag){
    	setPoint(endDrag);
    }
	
   
    
    @Override
    public void makeObject(Point startDrag, Point endDrag){
    	Point p = new Point(startDrag.x, startDrag.y);
    	setPoint(p);
    	setColor(GUI.selectColor);
    }
    
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

    @Override
    public void writetoFile(BufferedWriter b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
