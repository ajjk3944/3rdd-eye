package O6;

import H6.C0672i;
import N7.B8;
import N7.X2;
import N7.Z;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import b9.C1992A;
import java.util.List;

/* compiled from: DivSelectView.kt */
/* loaded from: classes.dex */
public final class w extends r7.k implements l<Z.j> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ m<Z.j> f10473A;

    /* renamed from: B, reason: collision with root package name */
    public p9.l<? super String, C1992A> f10474B;

    public w(Context context) {
        super(context);
        this.f10473A = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.j> mVar = this.f10473A;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10473A.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10473A.d(bindingContext, x22, view);
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

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10473A.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10473A.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10473A.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10473A.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10473A.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10473A.f10433f;
    }

    public p9.l<String, C1992A> getValueUpdater() {
        return this.f10474B;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.j> mVar = this.f10473A;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10473A.j(view);
    }

    @Override // r7.C5535f, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10473A.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10473A.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10473A.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10473A.setNeedClipping(z10);
    }

    public void setValueUpdater(p9.l<? super String, C1992A> lVar) {
        this.f10474B = lVar;
    }

    @Override // O6.l
    public Z.j getDiv() {
        return (Z.j) this.f10473A.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.j jVar) {
        this.f10473A.f10431d = jVar;
    }
}
