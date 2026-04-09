package F;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
