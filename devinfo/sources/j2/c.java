package j2;

import com.google.android.gms.internal.ads.te0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends androidx.recyclerview.widget.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static c f27097e;

    /* renamed from: f, reason: collision with root package name */
    public static final c3.j f27098f = c3.j.f2720b;
    public static final c3.j g = c3.j.f2719a;

    /* renamed from: c, reason: collision with root package name */
    public s2.e0 f27099c;

    /* renamed from: d, reason: collision with root package name */
    public p2.p f27100d;

    @Override // androidx.recyclerview.widget.d0
    public final int[] e(int i4) {
        int iB;
        if (o().length() <= 0 || i4 >= o().length()) {
            return null;
        }
        try {
            p2.p pVar = this.f27100d;
            if (pVar == null) {
                nk.k.k("node");
                throw null;
            }
            o1.c cVarG = pVar.g();
            int iRound = Math.round(cVarG.f30369d - cVarG.f30367b);
            if (i4 <= 0) {
                i4 = 0;
            }
            s2.e0 e0Var = this.f27099c;
            if (e0Var == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            int iA = e0Var.a(i4);
            s2.e0 e0Var2 = this.f27099c;
            if (e0Var2 == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            float fD = e0Var2.d(iA) + iRound;
            s2.e0 e0Var3 = this.f27099c;
            if (e0Var3 == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            if (e0Var3 == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            if (fD < e0Var3.d(e0Var3.f33369b.f16794b - 1)) {
                s2.e0 e0Var4 = this.f27099c;
                if (e0Var4 == null) {
                    nk.k.k("layoutResult");
                    throw null;
                }
                iB = e0Var4.b(fD);
            } else {
                s2.e0 e0Var5 = this.f27099c;
                if (e0Var5 == null) {
                    nk.k.k("layoutResult");
                    throw null;
                }
                iB = e0Var5.f33369b.f16794b;
            }
            return h(i4, y(iB - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.d0
    public final int[] r(int i4) {
        int iB;
        if (o().length() <= 0 || i4 <= 0) {
            return null;
        }
        try {
            p2.p pVar = this.f27100d;
            if (pVar == null) {
                nk.k.k("node");
                throw null;
            }
            o1.c cVarG = pVar.g();
            int iRound = Math.round(cVarG.f30369d - cVarG.f30367b);
            int length = o().length();
            if (length <= i4) {
                i4 = length;
            }
            s2.e0 e0Var = this.f27099c;
            if (e0Var == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            int iA = e0Var.a(i4);
            s2.e0 e0Var2 = this.f27099c;
            if (e0Var2 == null) {
                nk.k.k("layoutResult");
                throw null;
            }
            float fD = e0Var2.d(iA) - iRound;
            if (fD > 0.0f) {
                s2.e0 e0Var3 = this.f27099c;
                if (e0Var3 == null) {
                    nk.k.k("layoutResult");
                    throw null;
                }
                iB = e0Var3.b(fD);
            } else {
                iB = 0;
            }
            if (i4 == o().length() && iB < iA) {
                iB++;
            }
            return h(y(iB, f27098f), i4);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int y(int i4, c3.j jVar) {
        s2.e0 e0Var = this.f27099c;
        if (e0Var == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        int iC = e0Var.c(i4);
        s2.e0 e0Var2 = this.f27099c;
        if (e0Var2 == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        if (jVar != e0Var2.e(iC)) {
            s2.e0 e0Var3 = this.f27099c;
            if (e0Var3 != null) {
                return e0Var3.c(i4);
            }
            nk.k.k("layoutResult");
            throw null;
        }
        s2.e0 e0Var4 = this.f27099c;
        if (e0Var4 == null) {
            nk.k.k("layoutResult");
            throw null;
        }
        te0 te0Var = e0Var4.f33369b;
        te0Var.b(i4);
        ArrayList arrayList = (ArrayList) te0Var.f16797e;
        s2.a aVar = ((s2.m) arrayList.get(s2.z.d(i4, arrayList))).f33402a;
        return (aVar.f33330d.e(i4 - r6.f33405d) + r6.f33403b) - 1;
    }
}
