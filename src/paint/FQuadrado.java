package paint;

import java.awt.Rectangle;

public class FQuadrado extends FRetangulo {

    public void setRect(Rectangle rect) {
        rect.setBounds(rect.x, rect.y, rect.width, rect.height);
        super.setRect(rect);
    }
}
