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

/* compiled from: DivWrapLayout.kt */
/* loaded from: classes.dex */
public final class E extends Y6.a implements l<Z.a>, InterfaceC1480f {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1481g f10374A;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m<Z.a> f10375z;

    public E(Context context) {
        super(context);
        this.f10375z = new m<>();
        this.f10374A = new C1481g();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.a> mVar = this.f10375z;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10375z.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10375z.d(bindingContext, x22, view);
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
        this.f10375z.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10375z.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10375z.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10375z.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1480f
    public List<i7.b> getItems() {
        return this.f10374A.f10421b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10375z.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10375z.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.a> mVar = this.f10375z;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10375z.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10375z.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10375z.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10375z.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1480f
    public void setItems(List<i7.b> list) {
        this.f10374A.f10421b = list;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10375z.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.a getDiv() {
        return (Z.a) this.f10375z.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.a aVar) {
        this.f10375z.f10431d = aVar;
    }
}
