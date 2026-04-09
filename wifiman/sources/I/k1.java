package I;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import mh.InterfaceC6835l;
import t.C8016c;

/* loaded from: classes.dex */
public interface k1 {
    H.h a();

    void b(int i10);

    boolean c(C8016c c8016c);

    void d(InterfaceC6835l interfaceC6835l);

    int e(HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i10);

    void sendKeyEvent(KeyEvent keyEvent);
}
