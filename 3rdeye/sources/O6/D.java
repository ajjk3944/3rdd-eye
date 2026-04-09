package O6;

import H6.C0672i;
import H6.O;
import N7.B8;
import N7.X2;
import N7.Z;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;
import x6.AbstractC5774f;

/* compiled from: DivVideoView.kt */
/* loaded from: classes.dex */
public final class D extends r7.g implements l<Z.q>, O {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Z.q> f10373n;

    public D(Context context) {
        super(context, null, R.attr.divImageStyle);
        this.f10373n = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.q> mVar = this.f10373n;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10373n.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10373n.d(bindingContext, x22, view);
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
        this.f10373n.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10373n.f10430c.g();
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10373n.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10373n.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10373n.f10429b.f10420c;
    }

    public final AbstractC5774f getPlayerView() {
        getChildCount();
        View childAt = getChildAt(0);
        if (childAt == null || !(childAt instanceof AbstractC5774f)) {
            return null;
        }
        return (AbstractC5774f) childAt;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10373n.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.q> mVar = this.f10373n;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10373n.j(view);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10373n.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
        AbstractC5774f playerView = getPlayerView();
        if (playerView != null) {
            playerView.getAttachedPlayer();
        }
        C1476b divBorderDrawer = this.f10373n.f10429b.getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.h();
        }
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10373n.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10373n.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.q getDiv() {
        return (Z.q) this.f10373n.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.q qVar) {
        this.f10373n.f10431d = qVar;
    }
}
