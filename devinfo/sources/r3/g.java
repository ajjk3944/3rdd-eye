package r3;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g extends Activity implements a0, e4.l {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f32744a = new c0(this, true);

    @Override // e4.l
    public final boolean a(KeyEvent keyEvent) {
        nk.k.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        nk.k.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        if (cm.g.g(decorView, keyEvent)) {
            return true;
        }
        return cm.g.h(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        nk.k.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        if (cm.g.g(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = u0.f1190b;
        s0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        nk.k.e(bundle, "outState");
        this.f32744a.g();
        super.onSaveInstanceState(bundle);
    }
}
