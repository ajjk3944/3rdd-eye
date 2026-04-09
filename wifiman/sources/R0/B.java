package R0;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
abstract class B extends A {
    public B(InputConnection inputConnection, InterfaceC6835l interfaceC6835l) {
        super(inputConnection, interfaceC6835l);
    }

    @Override // R0.A
    protected final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.getHandler();
        }
        return null;
    }
}
