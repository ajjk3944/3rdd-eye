package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.o0;
import androidx.lifecycle.y0;
import com.google.android.gms.internal.measurement.d5;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.a0, a6.f {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.c0 f21623a;

    /* renamed from: b, reason: collision with root package name */
    public final y4.a f21624b;

    /* renamed from: c, reason: collision with root package name */
    public final yj.n f21625c;

    /* renamed from: d, reason: collision with root package name */
    public final yj.n f21626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i4) {
        super(context, i4);
        nk.k.e(context, "context");
        this.f21624b = new y4.a(new c6.a(this, new a6.e(0, this)));
        final int i10 = 0;
        this.f21625c = a.a.u(new mk.a(this) { // from class: d.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f21622b;

            {
                this.f21622b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        k5.a aVar = new k5.a();
                        this.f21622b.b().f21583b.i(aVar);
                        return aVar;
                    default:
                        return new c0(new o0(19, this.f21622b));
                }
            }
        });
        final int i11 = 1;
        this.f21626d = a.a.u(new mk.a(this) { // from class: d.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f21622b;

            {
                this.f21622b = this;
            }

            @Override // mk.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        k5.a aVar = new k5.a();
                        this.f21622b.b().f21583b.i(aVar);
                        return aVar;
                    default:
                        return new c0(new o0(19, this.f21622b));
                }
            }
        });
    }

    public static void a(l lVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        nk.k.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final c0 b() {
        return (c0) this.f21626d.getValue();
    }

    public final void c() {
        Window window = getWindow();
        nk.k.b(window);
        View decorView = window.getDecorView();
        nk.k.d(decorView, "getDecorView(...)");
        y0.h(decorView, this);
        Window window2 = getWindow();
        nk.k.b(window2);
        View decorView2 = window2.getDecorView();
        nk.k.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        nk.k.b(window3);
        View decorView3 = window3.getDecorView();
        nk.k.d(decorView3, "getDecorView(...)");
        d5.u(decorView3, this);
        Window window4 = getWindow();
        nk.k.b(window4);
        View decorView4 = window4.getDecorView();
        nk.k.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // a6.f
    public final yb.i g() {
        return (yb.i) this.f21624b.f37324b;
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.c0 j() {
        androidx.lifecycle.c0 c0Var = this.f21623a;
        if (c0Var != null) {
            return c0Var;
        }
        androidx.lifecycle.c0 c0Var2 = new androidx.lifecycle.c0(this, true);
        this.f21623a = c0Var2;
        return c0Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((k5.a) this.f21625c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            c0 c0VarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            nk.k.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            c0VarB.a(onBackInvokedDispatcher);
        }
        this.f21624b.q(bundle);
        androidx.lifecycle.c0 c0Var = this.f21623a;
        if (c0Var == null) {
            c0Var = new androidx.lifecycle.c0(this, true);
            this.f21623a = c0Var;
        }
        c0Var.e(androidx.lifecycle.r.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        nk.k.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f21624b.r(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        androidx.lifecycle.c0 c0Var = this.f21623a;
        if (c0Var == null) {
            c0Var = new androidx.lifecycle.c0(this, true);
            this.f21623a = c0Var;
        }
        c0Var.e(androidx.lifecycle.r.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.c0 c0Var = this.f21623a;
        if (c0Var == null) {
            c0Var = new androidx.lifecycle.c0(this, true);
            this.f21623a = c0Var;
        }
        c0Var.e(androidx.lifecycle.r.ON_DESTROY);
        this.f21623a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        c();
        super.setContentView(i4);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        nk.k.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        nk.k.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
