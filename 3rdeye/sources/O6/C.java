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

/* compiled from: DivTabsLayout.kt */
/* loaded from: classes.dex */
public final class C extends y7.w implements l<Z.o> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m<Z.o> f10372g;

    public C(Context context) {
        super(context);
        this.f10372g = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.o> mVar = this.f10372g;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10372g.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10372g.d(bindingContext, x22, view);
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
        this.f10372g.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10372g.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10372g.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10372g.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10372g.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10372g.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.o> mVar = this.f10372g;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10372g.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10372g.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10372g.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10372g.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10372g.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.o getDiv() {
        return (Z.o) this.f10372g.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.o oVar) {
        this.f10372g.f10431d = oVar;
    }
}
