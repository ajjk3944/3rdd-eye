package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.T;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.AbstractC7419g;
import q2.C7416d;
import q2.C7417e;
import q2.InterfaceC7418f;

/* renamed from: c.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC4163r extends Dialog implements InterfaceC4017o, InterfaceC4141J, InterfaceC7418f {

    /* renamed from: a, reason: collision with root package name */
    private C4018p f33580a;

    /* renamed from: b, reason: collision with root package name */
    private final C7417e f33581b;

    /* renamed from: c, reason: collision with root package name */
    private final C4138G f33582c;

    public /* synthetic */ DialogC4163r(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final C4018p c() {
        C4018p c4018p = this.f33580a;
        if (c4018p != null) {
            return c4018p;
        }
        C4018p c4018p2 = new C4018p(this);
        this.f33580a = c4018p2;
        return c4018p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DialogC4163r dialogC4163r) {
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.InterfaceC4017o
    public AbstractC4013k O() {
        return c();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6492s.i(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // c.InterfaceC4141J
    public final C4138G b() {
        return this.f33582c;
    }

    public void d() {
        Window window = getWindow();
        AbstractC6492s.f(window);
        View decorView = window.getDecorView();
        AbstractC6492s.h(decorView, "window!!.decorView");
        T.b(decorView, this);
        Window window2 = getWindow();
        AbstractC6492s.f(window2);
        View decorView2 = window2.getDecorView();
        AbstractC6492s.h(decorView2, "window!!.decorView");
        AbstractC4145N.b(decorView2, this);
        Window window3 = getWindow();
        AbstractC6492s.f(window3);
        View decorView3 = window3.getDecorView();
        AbstractC6492s.h(decorView3, "window!!.decorView");
        AbstractC7419g.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f33582c.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C4138G c4138g = this.f33582c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC6492s.h(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c4138g.o(onBackInvokedDispatcher);
        }
        this.f33581b.d(bundle);
        c().h(AbstractC4013k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC6492s.h(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f33581b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        c().h(AbstractC4013k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        c().h(AbstractC4013k.a.ON_DESTROY);
        this.f33580a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // q2.InterfaceC7418f
    public C7416d t() {
        return this.f33581b.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4163r(Context context, int i10) {
        super(context, i10);
        AbstractC6492s.i(context, "context");
        this.f33581b = C7417e.f58360d.a(this);
        this.f33582c = new C4138G(new Runnable() { // from class: c.q
            @Override // java.lang.Runnable
            public final void run() {
                DialogC4163r.g(this.f33579a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC6492s.i(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC6492s.i(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
