package O6;

import H6.C0672i;
import H6.O;
import N7.B8;
import N7.X2;
import N7.Z;
import X6.o;
import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;

/* compiled from: DivImageView.kt */
/* loaded from: classes.dex */
public final class n extends X6.o implements l<Z.f>, O {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m<Z.f> f10434q;

    /* renamed from: r, reason: collision with root package name */
    public Uri f10435r;

    public n(Context context) {
        super(context, R.attr.divImageStyle);
        this.f13645o = o.a.C0197a.f13647a;
        this.f10434q = new m<>();
        super.setAdjustViewBounds(true);
        super.setCropToPadding(true);
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.f> mVar = this.f10434q;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10434q.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10434q.d(bindingContext, x22, view);
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
        this.f10434q.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10434q.f10430c.g();
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10434q.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10434q.f10429b.f10419b;
    }

    public final Uri getImageUrl$div_release() {
        return this.f10435r;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10434q.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10434q.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.f> mVar = this.f10434q;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10434q.j(view);
    }

    @Override // r7.C5530a
    public final boolean l(int i) {
        return false;
    }

    @Override // r7.C5530a, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10434q.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10434q.release();
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10434q.f10432e = c0672i;
    }

    public final void setImageUrl$div_release(Uri uri) {
        this.f10435r = uri;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10434q.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.f getDiv() {
        return (Z.f) this.f10434q.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.f fVar) {
        this.f10434q.f10431d = fVar;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
    }

    @Override // android.widget.ImageView
    public void setCropToPadding(boolean z10) {
    }
}
