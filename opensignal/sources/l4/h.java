package l4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends j4.f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f14671a;

    public h(EditText editText) {
        this.f14671a = new WeakReference(editText);
    }

    @Override // j4.f
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f14671a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f14671a.get(), 1);
    }
}
