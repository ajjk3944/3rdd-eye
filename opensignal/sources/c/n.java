package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.f0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: classes.dex */
public class n extends Dialog implements androidx.lifecycle.v, l7.e {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.x f3033a;

    /* renamed from: d, reason: collision with root package name */
    public final i4.b f3034d;

    /* renamed from: g, reason: collision with root package name */
    public final w f3035g;

    public n(Context context, int i10) {
        super(context, i10);
        this.f3034d = new i4.b(new n7.b(this, new p0(10, this)));
        this.f3035g = new w(new f0(4, this));
    }

    public static void a(n nVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        br.l.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        br.l.b(window);
        View decorView = window.getDecorView();
        br.l.d(decorView, "window!!.decorView");
        o0.f(decorView, this);
        Window window2 = getWindow();
        br.l.b(window2);
        View decorView2 = window2.getDecorView();
        br.l.d(decorView2, "window!!.decorView");
        decorView2.setTag(x.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        br.l.b(window3);
        View decorView3 = window3.getDecorView();
        br.l.d(decorView3, "window!!.decorView");
        i4.C(decorView3, this);
    }

    @Override // l7.e
    public final io.sentry.t f() {
        return (io.sentry.t) this.f3034d.f11197d;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o h() {
        androidx.lifecycle.x xVar = this.f3033a;
        if (xVar != null) {
            return xVar;
        }
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x(this);
        this.f3033a = xVar2;
        return xVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3035g.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            br.l.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.f3035g;
            wVar.getClass();
            wVar.f3058e = onBackInvokedDispatcher;
            wVar.c(wVar.f3060g);
        }
        n7.b bVar = (n7.b) this.f3034d.f11196a;
        l7.e eVar = bVar.f17388a;
        if (!bVar.f17392e) {
            bVar.a();
        }
        if (eVar.h().e1().isAtLeast(androidx.lifecycle.n.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.h().e1()).toString());
        }
        if (bVar.f17394g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleF = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleF = b4.F("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        bVar.f17393f = bundleF;
        bVar.f17394g = true;
        androidx.lifecycle.x xVar = this.f3033a;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f3033a = xVar;
        }
        xVar.v1(androidx.lifecycle.m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        br.l.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f3034d.K(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.x xVar = this.f3033a;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f3033a = xVar;
        }
        xVar.v1(androidx.lifecycle.m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.x xVar = this.f3033a;
        if (xVar == null) {
            xVar = new androidx.lifecycle.x(this);
            this.f3033a = xVar;
        }
        xVar.v1(androidx.lifecycle.m.ON_DESTROY);
        this.f3033a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        b();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        br.l.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        br.l.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
