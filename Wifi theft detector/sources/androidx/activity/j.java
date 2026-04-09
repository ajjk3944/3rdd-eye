package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class j extends Dialog implements androidx.lifecycle.n, q, t1.d {

    /* renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.p f265a;

    /* renamed from: b, reason: collision with root package name */
    public final t1.c f266b;

    /* renamed from: c, reason: collision with root package name */
    public final OnBackPressedDispatcher f267c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public j(@NotNull Context context) {
        this(context, 0, 2, null);
        kotlin.jvm.internal.p.e(context, "context");
    }

    public static final void d(j this$0) {
        kotlin.jvm.internal.p.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.p.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.p b() {
        androidx.lifecycle.p pVar = this.f265a;
        if (pVar != null) {
            return pVar;
        }
        androidx.lifecycle.p pVar2 = new androidx.lifecycle.p(this);
        this.f265a = pVar2;
        return pVar2;
    }

    public void c() {
        Window window = getWindow();
        kotlin.jvm.internal.p.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.p.d(decorView, "window!!.decorView");
        k0.a(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.p.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.p.d(decorView2, "window!!.decorView");
        t.a(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.p.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.p.d(decorView3, "window!!.decorView");
        t1.e.a(decorView3, this);
    }

    @Override // androidx.lifecycle.n
    public Lifecycle getLifecycle() {
        return b();
    }

    @Override // androidx.activity.q
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f267c;
    }

    @Override // t1.d
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.f266b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f267c.k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f267c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.p.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.n(onBackInvokedDispatcher);
        }
        this.f266b.d(bundle);
        b().i(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.p.d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f266b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().i(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().i(Lifecycle.Event.ON_DESTROY);
        this.f265a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    public /* synthetic */ j(Context context, int i10, int i11, kotlin.jvm.internal.i iVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.p.e(context, "context");
        this.f266b = t1.c.f24378d.a(this);
        this.f267c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                j.d(this.f264a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.p.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.p.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
