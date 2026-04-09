package s1;

import F1.AbstractC2773t;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.B;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.InterfaceC4017o;
import kotlin.jvm.internal.AbstractC6492s;
import o.V;

/* loaded from: classes.dex */
public abstract class g extends Activity implements InterfaceC4017o, AbstractC2773t.a {

    /* renamed from: a, reason: collision with root package name */
    private final V f61034a = new V(0, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private final C4018p f61035b = new C4018p(this);

    private final boolean Q(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        String str = strArr[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill");
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    public AbstractC4013k O() {
        return this.f61035b;
    }

    protected final boolean P(String[] strArr) {
        return !Q(strArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC6492s.i(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        if (AbstractC2773t.d(decorView, event)) {
            return true;
        }
        return AbstractC2773t.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC6492s.i(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC6492s.h(decorView, "window.decorView");
        if (AbstractC2773t.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B.INSTANCE.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6492s.i(outState, "outState");
        this.f61035b.m(AbstractC4013k.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // F1.AbstractC2773t.a
    public boolean v(KeyEvent event) {
        AbstractC6492s.i(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
