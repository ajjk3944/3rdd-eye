package R0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
class C extends B {
    public C(InputConnection inputConnection, InterfaceC6835l interfaceC6835l) {
        super(inputConnection, interfaceC6835l);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}
