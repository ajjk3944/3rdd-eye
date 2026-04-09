package O6;

import H6.C0672i;
import N7.B8;
import N7.X2;
import N7.Z;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DivHolderView.kt */
/* loaded from: classes.dex */
public final class m<T extends Z> implements l<T>, InterfaceC1478d, r7.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1479e f10429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r7.t f10430c;

    /* renamed from: d, reason: collision with root package name */
    public T f10431d;

    /* renamed from: e, reason: collision with root package name */
    public C0672i f10432e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10433f;

    public m() {
        C1479e c1479e = new C1479e();
        c1479e.f10420c = true;
        this.f10429b = c1479e;
        this.f10430c = new r7.t();
        this.f10433f = new ArrayList();
    }

    public final void a() {
        C1476b c1476b = this.f10429b.f10419b;
        if (c1476b != null) {
            c1476b.i();
        }
    }

    @Override // i7.k
    public final /* synthetic */ void b(j6.d dVar) {
        B8.c(this, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10429b.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10429b.d(bindingContext, x22, view);
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10430c.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10430c.g();
    }

    @Override // O6.l
    public final C0672i getBindingContext() {
        return this.f10432e;
    }

    @Override // O6.l
    public final T getDiv() {
        return this.f10431d;
    }

    @Override // O6.InterfaceC1478d
    public final C1476b getDivBorderDrawer() {
        return this.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public final boolean getNeedClipping() {
        return this.f10429b.f10420c;
    }

    @Override // i7.k
    public final List<j6.d> getSubscriptions() {
        return this.f10433f;
    }

    @Override // i7.k
    public final /* synthetic */ void h() throws Exception {
        B8.d(this);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10430c.j(view);
    }

    @Override // H6.O
    public final void release() throws Exception {
        B8.d(this);
        this.f10431d = null;
        this.f10432e = null;
        C1476b divBorderDrawer = this.f10429b.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.h();
        }
    }

    @Override // O6.l
    public final void setBindingContext(C0672i c0672i) {
        this.f10432e = c0672i;
    }

    @Override // O6.l
    public final void setDiv(T t10) {
        this.f10431d = t10;
    }

    @Override // O6.InterfaceC1478d
    public final void setNeedClipping(boolean z10) {
        this.f10429b.setNeedClipping(z10);
    }
}
