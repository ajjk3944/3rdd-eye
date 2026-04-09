package G;

import R.InterfaceC0182i;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.J;
import androidx.lifecycle.L;

/* loaded from: classes.dex */
public abstract class e extends Activity implements InterfaceC0298u, InterfaceC0182i {

    /* renamed from: a, reason: collision with root package name */
    public final C0300w f1476a = new C0300w(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        q5.i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        q5.i.d(decorView, "window.decorView");
        if (com.bumptech.glide.c.k(decorView, keyEvent)) {
            return true;
        }
        return com.bumptech.glide.c.l(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        q5.i.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        q5.i.d(decorView, "window.decorView");
        if (com.bumptech.glide.c.k(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // R.InterfaceC0182i
    public final boolean g(KeyEvent keyEvent) {
        q5.i.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = L.f5194b;
        J.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        q5.i.e(bundle, "outState");
        this.f1476a.g(EnumC0292n.f5245c);
        super.onSaveInstanceState(bundle);
    }
}
