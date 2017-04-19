package paint;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class MEscrImg extends JComponent{
	public MEscrImg(){
		
	}
	public void Paint(GraphicAdapter g){
		g.getGraphicAdapter().drawImage(MAbrirArq.image, 0, 0, null);
	}
}