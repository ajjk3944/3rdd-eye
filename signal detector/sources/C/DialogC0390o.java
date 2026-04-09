package c;

import a.AbstractC0241a;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.Q;

/* renamed from: c.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0390o extends Dialog implements InterfaceC0298u, InterfaceC0373M, F0.g {

    /* renamed from: a, reason: collision with root package name */
    public C0300w f5867a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.w f5868b;

    /* renamed from: c, reason: collision with root package name */
    public final C0371K f5869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0390o(Context context, int i) {
        super(context, i);
        q5.i.e(context, "context");
        this.f5868b = new A1.w(this);
        this.f5869c = new C0371K(new A3.z(11, this));
    }

    public static void a(DialogC0390o dialogC0390o) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q5.i.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        q5.i.b(window);
        View decorView = window.getDecorView();
        q5.i.d(decorView, "window!!.decorView");
        Q.i(decorView, this);
        Window window2 = getWindow();
        q5.i.b(window2);
        View decorView2 = window2.getDecorView();
        q5.i.d(decorView2, "window!!.decorView");
        com.bumptech.glide.c.J(decorView2, this);
        Window window3 = getWindow();
        q5.i.b(window3);
        View decorView3 = window3.getDecorView();
        q5.i.d(decorView3, "window!!.decorView");
        AbstractC0241a.o(decorView3, this);
    }

    @Override // F0.g
    public final F0.f f() {
        return (F0.f) this.f5868b.f139b;
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        C0300w c0300w = this.f5867a;
        if (c0300w != null) {
            return c0300w;
        }
        C0300w c0300w2 = new C0300w(this);
        this.f5867a = c0300w2;
        return c0300w2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5869c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            q5.i.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0371K c0371k = this.f5869c;
            c0371k.getClass();
            c0371k.f5806e = onBackInvokedDispatcher;
            c0371k.d(c0371k.f5808g);
        }
        this.f5868b.e(bundle);
        C0300w c0300w = this.f5867a;
        if (c0300w == null) {
            c0300w = new C0300w(this);
            this.f5867a = c0300w;
        }
        c0300w.d(EnumC0291m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        q5.i.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f5868b.f(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C0300w c0300w = this.f5867a;
        if (c0300w == null) {
            c0300w = new C0300w(this);
            this.f5867a = c0300w;
        }
        c0300w.d(EnumC0291m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0300w c0300w = this.f5867a;
        if (c0300w == null) {
            c0300w = new C0300w(this);
            this.f5867a = c0300w;
        }
        c0300w.d(EnumC0291m.ON_DESTROY);
        this.f5867a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        q5.i.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q5.i.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
