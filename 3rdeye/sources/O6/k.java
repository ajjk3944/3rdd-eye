package O6;

import H6.C0672i;
import K6.C0713c;
import N7.B8;
import N7.X2;
import N7.Z;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.List;
import t4.C5606d;

/* compiled from: DivGridLayout.kt */
/* loaded from: classes.dex */
public final class k extends X6.j implements l<Z.e> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m<Z.e> f10427g;

    /* renamed from: h, reason: collision with root package name */
    public I f10428h;

    public k(Context context) {
        super(context);
        this.f10427g = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.e> mVar = this.f10427g;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10427g.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10427g.d(bindingContext, x22, view);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10427g.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10427g.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10427g.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10427g.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10427g.f10429b.f10420c;
    }

    public final I getReleaseViewVisitor$div_release() {
        return this.f10428h;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10427g.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.e> mVar = this.f10427g;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10427g.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10427g.a();
    }

    @Override // X6.j, android.view.ViewGroup
    public final void onViewRemoved(View child) {
        kotlin.jvm.internal.l.f(child, "child");
        super.onViewRemoved(child);
        I i = this.f10428h;
        if (i != null) {
            C5606d.I(i, child);
        }
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10427g.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10427g.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10427g.setNeedClipping(z10);
    }

    public final void setReleaseViewVisitor$div_release(I i) {
        this.f10428h = i;
    }

    @Override // O6.l
    public Z.e getDiv() {
        return (Z.e) this.f10427g.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.e eVar) {
        this.f10427g.f10431d = eVar;
    }
}
