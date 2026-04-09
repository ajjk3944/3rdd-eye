package q;

import a0.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.o;

/* loaded from: classes.dex */
public class d extends Activity implements androidx.lifecycle.g, e.a {

    /* renamed from: b, reason: collision with root package name */
    private k.g<Class<Object>, Object> f3170b = new k.g<>();

    /* renamed from: c, reason: collision with root package name */
    private h f3171c = new h(this);

    public androidx.lifecycle.d a() {
        return this.f3171c;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a0.e.d(decorView, keyEvent)) {
            return a0.e.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a0.e.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // a0.e.a
    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f3171c.k(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
