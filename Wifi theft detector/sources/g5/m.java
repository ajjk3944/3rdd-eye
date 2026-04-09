package g5;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;

/* loaded from: classes2.dex */
public class m extends l {

    /* renamed from: f, reason: collision with root package name */
    public boolean f21201f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f21202g = 0.0f;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            m mVar = m.this;
            if (mVar.f21198c == null || mVar.f21199d.isEmpty()) {
                return;
            }
            m mVar2 = m.this;
            RectF rectF = mVar2.f21199d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, mVar2.f21202g);
        }
    }

    public m(View view) {
        m(view);
    }

    @DoNotInline
    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    public static boolean p(com.google.android.material.shape.a aVar) {
        return (aVar.q() instanceof j) && (aVar.s() instanceof j) && (aVar.i() instanceof j) && (aVar.k() instanceof j);
    }

    @Override // g5.l
    public void b(View view) {
        this.f21202g = l();
        this.f21201f = n() || o();
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // g5.l
    public boolean i() {
        return !this.f21201f || this.f21196a;
    }

    public final float l() {
        RectF rectF;
        com.google.android.material.shape.a aVar = this.f21198c;
        if (aVar == null || (rectF = this.f21199d) == null) {
            return 0.0f;
        }
        return aVar.f10988f.a(rectF);
    }

    public final boolean n() {
        com.google.android.material.shape.a aVar;
        if (this.f21199d.isEmpty() || (aVar = this.f21198c) == null) {
            return false;
        }
        return aVar.v(this.f21199d);
    }

    public final boolean o() {
        com.google.android.material.shape.a aVar;
        if (!this.f21199d.isEmpty() && (aVar = this.f21198c) != null && this.f21197b && !aVar.v(this.f21199d) && p(this.f21198c)) {
            float fA = this.f21198c.r().a(this.f21199d);
            float fA2 = this.f21198c.t().a(this.f21199d);
            float fA3 = this.f21198c.j().a(this.f21199d);
            float fA4 = this.f21198c.l().a(this.f21199d);
            if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                RectF rectF = this.f21199d;
                rectF.set(rectF.left - fA2, rectF.top, rectF.right, rectF.bottom);
                this.f21202g = fA2;
                return true;
            }
            if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                RectF rectF2 = this.f21199d;
                rectF2.set(rectF2.left, rectF2.top - fA3, rectF2.right, rectF2.bottom);
                this.f21202g = fA3;
                return true;
            }
            if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                RectF rectF3 = this.f21199d;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fA, rectF3.bottom);
                this.f21202g = fA;
                return true;
            }
            if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                RectF rectF4 = this.f21199d;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fA);
                this.f21202g = fA;
                return true;
            }
        }
        return false;
    }
}
