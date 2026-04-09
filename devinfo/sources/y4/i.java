package y4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends w4.g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f37340a;

    public i(EditText editText) {
        this.f37340a = new WeakReference(editText);
    }

    @Override // w4.g
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f37340a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a((EditText) this.f37340a.get(), 1);
    }
}
