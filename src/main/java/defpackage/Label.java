package defpackage;

import javax.swing.*;
import java.awt.*;

/* renamed from: Label  reason: default package */
public class Label extends JLabel {
    public Label(String s, int x, int y, int width, int height) {
        setFont(Xf.font);
        setText(s);
        setForeground(Color.WHITE);
        setBounds(Xf.up(x), Xf.up(y), Xf.up(width), Xf.up(height));
    }
}
