package w0;

import android.view.KeyEvent;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8250d {
    public static final long a(KeyEvent keyEvent) {
        return AbstractC8252f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? AbstractC8249c.f64330a.c() : AbstractC8249c.f64330a.b() : AbstractC8249c.f64330a.a();
    }

    public static final int c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
