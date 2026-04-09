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

/* compiled from: DivFrameLayout.kt */
/* renamed from: O6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483i extends r7.g implements l<Z.a>, InterfaceC1480f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Z.a> f10423n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1481g f10424o;

    public C1483i(Context context) {
        super(context, null, 0);
        this.f10423n = new m<>();
        this.f10424o = new C1481g();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.a> mVar = this.f10423n;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10423n.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10423n.d(bindingContext, x22, view);
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
        this.f10423n.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10423n.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10423n.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10423n.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1480f
    public List<i7.b> getItems() {
        return this.f10424o.f10421b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10423n.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10423n.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.a> mVar = this.f10423n;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10423n.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10423n.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10423n.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10423n.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1480f
    public void setItems(List<i7.b> list) {
        this.f10424o.f10421b = list;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10423n.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.a getDiv() {
        return (Z.a) this.f10423n.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.a aVar) {
        this.f10423n.f10431d = aVar;
    }
}
