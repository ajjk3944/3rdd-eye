package R0;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class G {
    public static final InterfaceInputConnectionC3472z a(InputConnection inputConnection, InterfaceC6835l interfaceC6835l) {
        return Build.VERSION.SDK_INT >= 34 ? new F(inputConnection, interfaceC6835l) : new C(inputConnection, interfaceC6835l);
    }
}
