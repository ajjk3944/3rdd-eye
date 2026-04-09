package O6;

import H6.C0672i;
import K6.C0713c;
import L0.N;
import N7.B8;
import N7.X2;
import N7.Z;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: DivCustomWrapper.kt */
/* renamed from: O6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482h extends r7.g implements l<Z.b> {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Z.b> f10422n;

    public C1482h(Context context) {
        super(context, null, 0);
        this.f10422n = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.b> mVar = this.f10422n;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10422n.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10422n.d(bindingContext, x22, view);
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
        this.f10422n.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10422n.f10430c.g();
    }

    @Override // android.view.View
    public int getBaseline() {
        View customView = getCustomView();
        if (customView == null) {
            return super.getBaseline();
        }
        int baseline = customView.getBaseline();
        ViewGroup.LayoutParams layoutParams = customView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return getPaddingTop() + baseline + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10422n.f10432e;
    }

    public final View getCustomView() {
        if (getChildCount() != 0) {
            return N.a(this);
        }
        return null;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10422n.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10422n.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10422n.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.b> mVar = this.f10422n;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10422n.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10422n.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10422n.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10422n.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10422n.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.b getDiv() {
        return (Z.b) this.f10422n.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.b bVar) {
        this.f10422n.f10431d = bVar;
    }
}
