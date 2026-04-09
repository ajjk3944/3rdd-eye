package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class eh extends Dialog implements b60, at0 {
    public d60 f;
    public final gw3 g;
    public final aj0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(Context context, int i) {
        super(context, i);
        i30.m(context, "context");
        this.g = new gw3(new zs0(this, new ga0(2, this)));
        this.h = new aj0(new e2(5, this));
    }

    public static void b(eh ehVar) {
        super.onBackPressed();
    }

    @Override // defpackage.at0
    public final vq2 a() {
        return (vq2) this.g.h;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i30.m(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        i30.j(window);
        View decorView = window.getDecorView();
        i30.l(decorView, "getDecorView(...)");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        i30.j(window2);
        View decorView2 = window2.getDecorView();
        i30.l(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        i30.j(window3);
        View decorView3 = window3.getDecorView();
        i30.l(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.b60
    public final d60 e() {
        d60 d60Var = this.f;
        if (d60Var != null) {
            return d60Var;
        }
        d60 d60Var2 = new d60(this);
        this.f = d60Var2;
        return d60Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.h.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            i30.l(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            aj0 aj0Var = this.h;
            aj0Var.e = onBackInvokedDispatcher;
            aj0Var.d(aj0Var.g);
        }
        zs0 zs0Var = (zs0) this.g.g;
        at0 at0Var = zs0Var.a;
        if (!zs0Var.e) {
            zs0Var.a();
        }
        if (at0Var.e().c.compareTo(u50.i) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + at0Var.e().c).toString());
        }
        if (zs0Var.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleN = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleN = m54.n(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        zs0Var.f = bundleN;
        zs0Var.g = true;
        d60 d60Var = this.f;
        if (d60Var == null) {
            d60Var = new d60(this);
            this.f = d60Var;
        }
        d60Var.d(t50.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        i30.l(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.g.y(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d60 d60Var = this.f;
        if (d60Var == null) {
            d60Var = new d60(this);
            this.f = d60Var;
        }
        d60Var.d(t50.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d60 d60Var = this.f;
        if (d60Var == null) {
            d60Var = new d60(this);
            this.f = d60Var;
        }
        d60Var.d(t50.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        i30.m(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i30.m(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
