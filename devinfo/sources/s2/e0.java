package s2;

import androidx.lifecycle.f1;
import com.google.android.gms.internal.ads.te0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f33368a;

    /* renamed from: b, reason: collision with root package name */
    public final te0 f33369b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33370c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33371d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33372e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f33373f;

    public e0(d0 d0Var, te0 te0Var, long j) {
        this.f33368a = d0Var;
        this.f33369b = te0Var;
        this.f33370c = j;
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        float fC = 0.0f;
        this.f33371d = arrayList.isEmpty() ? 0.0f : ((m) arrayList.get(0)).f33402a.f33330d.c(0);
        if (!arrayList.isEmpty()) {
            m mVar = (m) zj.n.h0(arrayList);
            fC = mVar.f33402a.f33330d.c(r4.f34145f - 1) + mVar.f33407f;
        }
        this.f33372e = fC;
        this.f33373f = (ArrayList) te0Var.f16796d;
    }

    public final int a(int i4) {
        te0 te0Var = this.f33369b;
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        m mVar = (m) arrayList.get(i4 >= ((e) ((f1) te0Var.f16795c).f1134b).f33365b.length() ? cm.g.r(arrayList) : i4 < 0 ? 0 : z.c(i4, arrayList));
        return mVar.f33402a.f33330d.f34144e.getLineForOffset(mVar.a(i4)) + mVar.f33405d;
    }

    public final int b(float f10) {
        ArrayList arrayList = (ArrayList) this.f33369b.f16797e;
        int iR = 0;
        if (f10 > 0.0f) {
            if (f10 < ((m) zj.n.h0(arrayList)).g) {
                int size = arrayList.size() - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > size) {
                        iR = -(i4 + 1);
                        break;
                    }
                    int i10 = (i4 + size) >>> 1;
                    m mVar = (m) arrayList.get(i10);
                    char c9 = mVar.f33407f > f10 ? (char) 1 : mVar.g <= f10 ? (char) 65535 : (char) 0;
                    if (c9 >= 0) {
                        if (c9 <= 0) {
                            iR = i10;
                            break;
                        }
                        size = i10 - 1;
                    } else {
                        i4 = i10 + 1;
                    }
                }
            } else {
                iR = cm.g.r(arrayList);
            }
        }
        m mVar2 = (m) arrayList.get(iR);
        int i11 = mVar2.f33404c;
        int i12 = mVar2.f33405d;
        if (i11 - mVar2.f33403b == 0) {
            return i12;
        }
        a aVar = mVar2.f33402a;
        float f11 = f10 - mVar2.f33407f;
        t2.p pVar = aVar.f33330d;
        return pVar.f34144e.getLineForVertical(((int) f11) - pVar.g) + i12;
    }

    public final int c(int i4) {
        te0 te0Var = this.f33369b;
        te0Var.b(i4);
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        m mVar = (m) arrayList.get(z.d(i4, arrayList));
        a aVar = mVar.f33402a;
        return aVar.f33330d.f34144e.getLineStart(i4 - mVar.f33405d) + mVar.f33403b;
    }

    public final float d(int i4) {
        te0 te0Var = this.f33369b;
        te0Var.b(i4);
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        m mVar = (m) arrayList.get(z.d(i4, arrayList));
        a aVar = mVar.f33402a;
        return aVar.f33330d.f(i4 - mVar.f33405d) + mVar.f33407f;
    }

    public final c3.j e(int i4) {
        te0 te0Var = this.f33369b;
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        f1 f1Var = (f1) te0Var.f16795c;
        boolean z3 = false;
        if (i4 >= 0 && i4 <= ((e) f1Var.f1134b).f33365b.length()) {
            z3 = true;
        }
        if (!z3) {
            StringBuilder sbW = je.u.w(i4, "offset(", ") is out of bounds [0, ");
            sbW.append(((e) f1Var.f1134b).f33365b.length());
            sbW.append(']');
            x2.a.a(sbW.toString());
        }
        m mVar = (m) arrayList.get(i4 == ((e) ((f1) te0Var.f16795c).f1134b).f33365b.length() ? cm.g.r(arrayList) : z.c(i4, arrayList));
        a aVar = mVar.f33402a;
        int iA = mVar.a(i4);
        t2.p pVar = aVar.f33330d;
        return pVar.f34144e.getParagraphDirection(pVar.f34144e.getLineForOffset(iA)) == 1 ? c3.j.f2719a : c3.j.f2720b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return nk.k.a(this.f33368a, e0Var.f33368a) && this.f33369b.equals(e0Var.f33369b) && d3.k.a(this.f33370c, e0Var.f33370c) && this.f33371d == e0Var.f33371d && this.f33372e == e0Var.f33372e && nk.k.a(this.f33373f, e0Var.f33373f);
    }

    public final int hashCode() {
        int iHashCode = (this.f33369b.hashCode() + (this.f33368a.hashCode() * 31)) * 31;
        long j = this.f33370c;
        return this.f33373f.hashCode() + r5.c.d(this.f33372e, r5.c.d(this.f33371d, (((int) (j ^ (j >>> 32))) + iHashCode) * 31, 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f33368a + ", multiParagraph=" + this.f33369b + ", size=" + ((Object) d3.k.b(this.f33370c)) + ", firstBaseline=" + this.f33371d + ", lastBaseline=" + this.f33372e + ", placeholderRects=" + this.f33373f + ')';
    }
}
