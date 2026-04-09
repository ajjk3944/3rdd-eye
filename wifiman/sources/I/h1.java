package I;

import android.view.KeyEvent;
import w0.AbstractC8250d;
import w0.AbstractC8252f;

/* loaded from: classes.dex */
public abstract class h1 {
    public static final g1 b() {
        return new C2922b();
    }

    public static final boolean c(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(KeyEvent keyEvent, int i10) {
        return AbstractC8252f.b(AbstractC8250d.a(keyEvent)) == i10;
    }
}
