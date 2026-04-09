package c;

import A9.I;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.InterfaceC1790x;

/* compiled from: ComponentDialog.kt */
/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC2011i extends Dialog implements InterfaceC1790x, InterfaceC2025w, D1.e {

    /* renamed from: b, reason: collision with root package name */
    public C1791y f18289b;

    /* renamed from: c, reason: collision with root package name */
    public final D1.d f18290c;

    /* renamed from: d, reason: collision with root package name */
    public final C2023u f18291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2011i(Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.l.f(context, "context");
        this.f18290c = new D1.d(this);
        this.f18291d = new C2023u(new C2.h(this, 12));
    }

    public static void a(DialogC2011i this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.l.c(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.l.e(decorView, "window!!.decorView");
        B7.d.A(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.l.c(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.l.e(decorView2, "window!!.decorView");
        A2.l.D(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.l.c(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.l.e(decorView3, "window!!.decorView");
        I.A(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1790x
    public final AbstractC1781n getLifecycle() {
        C1791y c1791y = this.f18289b;
        if (c1791y != null) {
            return c1791y;
        }
        C1791y c1791y2 = new C1791y(this);
        this.f18289b = c1791y2;
        return c1791y2;
    }

    @Override // c.InterfaceC2025w
    public final C2023u getOnBackPressedDispatcher() {
        return this.f18291d;
    }

    @Override // D1.e
    public final D1.c getSavedStateRegistry() {
        return this.f18290c.f1029b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f18291d.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.l.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C2023u c2023u = this.f18291d;
            c2023u.getClass();
            c2023u.f18312e = onBackInvokedDispatcher;
            c2023u.e(c2023u.f18314g);
        }
        this.f18290c.b(bundle);
        C1791y c1791y = this.f18289b;
        if (c1791y == null) {
            c1791y = new C1791y(this);
            this.f18289b = c1791y;
        }
        c1791y.d(AbstractC1781n.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.l.e(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f18290c.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1791y c1791y = this.f18289b;
        if (c1791y == null) {
            c1791y = new C1791y(this);
            this.f18289b = c1791y;
        }
        c1791y.d(AbstractC1781n.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1791y c1791y = this.f18289b;
        if (c1791y == null) {
            c1791y = new C1791y(this);
            this.f18289b = c1791y;
        }
        c1791y.d(AbstractC1781n.a.ON_DESTROY);
        this.f18289b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.l.f(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
