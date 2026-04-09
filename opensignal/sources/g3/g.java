package g3;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import ir.f0;

/* loaded from: classes.dex */
public abstract class g extends Activity implements v, u3.i {

    /* renamed from: a, reason: collision with root package name */
    public final x f9291a = new x(this);

    @Override // u3.i
    public final boolean b(KeyEvent keyEvent) {
        br.l.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        br.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        br.l.d(decorView, "window.decorView");
        if (f0.q(decorView, keyEvent)) {
            return true;
        }
        return f0.r(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        br.l.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        br.l.d(decorView, "window.decorView");
        if (f0.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = k0.f1500d;
        i0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        br.l.e(bundle, "outState");
        this.f9291a.x1(androidx.lifecycle.n.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
