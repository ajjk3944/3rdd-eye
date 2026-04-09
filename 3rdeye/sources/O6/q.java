package O6;

import H6.C0672i;
import N7.B8;
import N7.X2;
import N7.Z;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import java.util.List;

/* compiled from: DivLineHeightTextView.kt */
/* loaded from: classes.dex */
public final class q extends r7.p implements l<Z.p> {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ m<Z.p> f10446B;

    /* renamed from: C, reason: collision with root package name */
    public X6.a f10447C;

    /* renamed from: D, reason: collision with root package name */
    public F6.d f10448D;

    /* renamed from: E, reason: collision with root package name */
    public long f10449E;

    public q(Context context) {
        super(context);
        this.f10446B = new m<>();
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.p> mVar = this.f10446B;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10446B.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10446B.d(bindingContext, x22, view);
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
        this.f10446B.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10446B.f10430c.g();
    }

    public X6.a getAdaptiveMaxLines$div_release() {
        return this.f10447C;
    }

    public long getAnimationStartDelay$div_release() {
        return this.f10449E;
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10446B.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10446B.f10429b.f10419b;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10446B.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10446B.f10433f;
    }

    public F6.d getTextRoundedBgHelper$div_release() {
        return this.f10448D;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.p> mVar = this.f10446B;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10446B.j(view);
    }

    @Override // r7.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        F6.d textRoundedBgHelper$div_release;
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper$div_release = getTextRoundedBgHelper$div_release()) != null && (!textRoundedBgHelper$div_release.f1671c.isEmpty())) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int iSave = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                F6.d textRoundedBgHelper$div_release2 = getTextRoundedBgHelper$div_release();
                if (textRoundedBgHelper$div_release2 != null) {
                    CharSequence text = getText();
                    kotlin.jvm.internal.l.d(text, "null cannot be cast to non-null type android.text.Spanned");
                    Layout layout = getLayout();
                    kotlin.jvm.internal.l.e(layout, "layout");
                    textRoundedBgHelper$div_release2.a(canvas, (Spanned) text, layout);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        super.onDraw(canvas);
    }

    @Override // r7.C5535f, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10446B.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10446B.release();
    }

    public void setAdaptiveMaxLines$div_release(X6.a aVar) {
        this.f10447C = aVar;
    }

    public void setAnimationStartDelay$div_release(long j4) {
        this.f10449E = j4;
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10446B.f10432e = c0672i;
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10446B.setNeedClipping(z10);
    }

    public void setTextRoundedBgHelper$div_release(F6.d dVar) {
        this.f10448D = dVar;
    }

    @Override // O6.l
    public Z.p getDiv() {
        return (Z.p) this.f10446B.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.p pVar) {
        this.f10446B.f10431d = pVar;
    }
}
