package paint;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.io.IOException;


public class FElipse implements Class2D{
	private Ellipse2D elip2d;
	private Color linecolor = null;
	private Color color = null;
	
	public FElipse() {
	}
	
	public FElipse(Ellipse2D e) {
		this.elip2d = e;
	}
	
	public FElipse(Ellipse2D e, Color lc) {
		this.elip2d = e;
		this.linecolor = lc;
	}
	
	public FElipse(Ellipse2D e, Color lc, Color c) {
		this.elip2d = e;
		this.linecolor = lc;
		this.color = c;
	}
	@Override
	public void makeObject(Point startDrag, Point endDrag) {
		setLineColor(GUI.selectColor);
		Ellipse2D r = new Ellipse2D.Float(Math.min(startDrag.x, endDrag.x), Math.min(startDrag.y, endDrag.y), Math.abs(startDrag.x - endDrag.x), Math.abs(startDrag.y - endDrag.y));
	    this.setElip2d(r);
	}
	
	public void makeOval(int x, int y, int w, int h) {
		Ellipse2D r = new Ellipse2D.Float(x, y, w, h);
		this.setElip2d(r);
	}
	
	/*public void makeOval(Point startDrag, MouseEvent e) {
		Ellipse2D r = new Ellipse2D.Float(Math.min(startDrag.x, e.getX()), Math.min(startDrag.y, e.getY()), Math.abs(startDrag.x - e.getX()), Math.abs(startDrag.y - e.getY()));
	    this.setElip2d(r);
	}*/
	
	@Override
    public void draw(GraphicAdapter g) {
		if(getColor() == null){
    		g.getGraphicAdapter().setColor(getLineColor());
    		g.getGraphicAdapter().drawOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
    	}
    	else{
    		g.getGraphicAdapter().setColor(getColor());
    		g.getGraphicAdapter().fillOval((int)getElip2d().getX(),(int)getElip2d().getY(), (int)getElip2d().getWidth(), (int)getElip2d().getHeight());
    	}
    }
	@Override
	public void fill(Color c){
		this.setColor(c);
	}
    @Override
    public boolean contains(Point p) {
    	return this.getElip2d().contains(p);
    }
    @Override
    public void move(Point startDrag, Point endDrag){
    	this.getElip2d().setFrame(getElip2d().getX() + endDrag.x - startDrag.x,this.getElip2d().getY() + endDrag.y - startDrag.y,this.getElip2d().getWidth(), this.getElip2d().getHeight());
    }
    
   
    
	public Ellipse2D getElip2d() {
		return elip2d;
	}
	public void setElip2d(Ellipse2D elip2d) {
		this.elip2d = elip2d;
	}
	public Color getLineColor() {
		return linecolor;
	}
	public void setLineColor(Color linecolor) {
		this.linecolor = linecolor;
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
