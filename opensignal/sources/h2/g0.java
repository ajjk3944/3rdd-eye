package h2;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f9824a;

    /* renamed from: b, reason: collision with root package name */
    public final m f9825b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9826c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9827d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9828e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9829f;

    public g0(f0 f0Var, m mVar, long j) {
        this.f9824a = f0Var;
        this.f9825b = mVar;
        this.f9826c = j;
        ArrayList arrayList = mVar.f9854h;
        float fC = 0.0f;
        this.f9827d = arrayList.isEmpty() ? 0.0f : ((p) arrayList.get(0)).f9859a.f9781d.c(0);
        if (!arrayList.isEmpty()) {
            p pVar = (p) mq.o.z0(arrayList);
            fC = pVar.f9859a.f9781d.c(r4.f11174f - 1) + pVar.f9864f;
        }
        this.f9828e = fC;
        this.f9829f = mVar.f9853g;
    }

    public final int a(int i10, boolean z10) {
        int iE;
        m mVar = this.f9825b;
        mVar.c(i10);
        ArrayList arrayList = mVar.f9854h;
        p pVar = (p) arrayList.get(b0.d(i10, arrayList));
        b bVar = pVar.f9859a;
        int i11 = i10 - pVar.f9862d;
        i2.h hVar = bVar.f9781d;
        if (z10) {
            Layout layout = hVar.f11173e;
            i2.g gVar = i2.i.f11183a;
            if (layout.getEllipsisCount(i11) <= 0 || hVar.f11170b != TextUtils.TruncateAt.END) {
                cj.a aVarB = hVar.b();
                Layout layout2 = (Layout) aVarB.f3974d;
                iE = aVarB.A(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iE = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iE = hVar.e(i11);
        }
        return iE + pVar.f9860b;
    }

    public final int b(int i10) {
        m mVar = this.f9825b;
        ArrayList arrayList = mVar.f9854h;
        p pVar = (p) arrayList.get(i10 >= ((f) mVar.f9847a.f3974d).f9811d.length() ? e5.z(arrayList) : i10 < 0 ? 0 : b0.c(i10, arrayList));
        return pVar.f9859a.f9781d.f11173e.getLineForOffset(pVar.a(i10)) + pVar.f9862d;
    }

    public final int c(float f10) {
        ArrayList arrayList = this.f9825b.f9854h;
        int iZ = 0;
        if (f10 > 0.0f) {
            if (f10 < ((p) mq.o.z0(arrayList)).f9865g) {
                int size = arrayList.size() - 1;
                int i10 = 0;
                while (true) {
                    if (i10 > size) {
                        iZ = -(i10 + 1);
                        break;
                    }
                    int i11 = (i10 + size) >>> 1;
                    p pVar = (p) arrayList.get(i11);
                    char c4 = pVar.f9864f > f10 ? (char) 1 : pVar.f9865g <= f10 ? (char) 65535 : (char) 0;
                    if (c4 >= 0) {
                        if (c4 <= 0) {
                            iZ = i11;
                            break;
                        }
                        size = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            } else {
                iZ = e5.z(arrayList);
            }
        }
        p pVar2 = (p) arrayList.get(iZ);
        int i12 = pVar2.f9861c;
        int i13 = pVar2.f9862d;
        if (i12 - pVar2.f9860b == 0) {
            return i13;
        }
        b bVar = pVar2.f9859a;
        float f11 = f10 - pVar2.f9864f;
        i2.h hVar = bVar.f9781d;
        return hVar.f11173e.getLineForVertical(((int) f11) - hVar.f11175g) + i13;
    }

    public final int d(int i10) {
        m mVar = this.f9825b;
        mVar.c(i10);
        ArrayList arrayList = mVar.f9854h;
        p pVar = (p) arrayList.get(b0.d(i10, arrayList));
        b bVar = pVar.f9859a;
        return bVar.f9781d.f11173e.getLineStart(i10 - pVar.f9862d) + pVar.f9860b;
    }

    public final float e(int i10) {
        m mVar = this.f9825b;
        mVar.c(i10);
        ArrayList arrayList = mVar.f9854h;
        p pVar = (p) arrayList.get(b0.d(i10, arrayList));
        b bVar = pVar.f9859a;
        return bVar.f9781d.f(i10 - pVar.f9862d) + pVar.f9864f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return br.l.a(this.f9824a, g0Var.f9824a) && this.f9825b.equals(g0Var.f9825b) && ir.f0.t(this.f9826c, g0Var.f9826c) && this.f9827d == g0Var.f9827d && this.f9828e == g0Var.f9828e && br.l.a(this.f9829f, g0Var.f9829f);
    }

    public final r2.j f(int i10) {
        m mVar = this.f9825b;
        ArrayList arrayList = mVar.f9854h;
        mVar.b(i10);
        p pVar = (p) arrayList.get(i10 == ((f) mVar.f9847a.f3974d).f9811d.length() ? e5.z(arrayList) : b0.c(i10, arrayList));
        b bVar = pVar.f9859a;
        int iA = pVar.a(i10);
        i2.h hVar = bVar.f9781d;
        return hVar.f11173e.getParagraphDirection(hVar.f11173e.getLineForOffset(iA)) == 1 ? r2.j.Ltr : r2.j.Rtl;
    }

    public final int hashCode() {
        return this.f9829f.hashCode() + w.g.a(w.g.a(h0.b.b((this.f9825b.hashCode() + (this.f9824a.hashCode() * 31)) * 31, 31, this.f9826c), this.f9827d, 31), this.f9828e, 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f9824a + ", multiParagraph=" + this.f9825b + ", size=" + ((Object) ir.f0.Z(this.f9826c)) + ", firstBaseline=" + this.f9827d + ", lastBaseline=" + this.f9828e + ", placeholderRects=" + this.f9829f + ')';
    }
}
