package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ju1 extends uh {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f12837k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f12838b;

    /* renamed from: c, reason: collision with root package name */
    public final kz1 f12839c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12840d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12841e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12842f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final uh[] f12843h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f12844i;
    public final HashMap j;

    public ju1(uh[] uhVarArr, Object[] objArr, kz1 kz1Var) {
        this.f12839c = kz1Var;
        this.f12838b = kz1Var.f13304b.length;
        this.f12843h = uhVarArr;
        int length = uhVarArr.length;
        this.f12842f = new int[length];
        this.g = new int[length];
        this.f12844i = objArr;
        this.j = new HashMap();
        int i4 = 0;
        int iA = 0;
        int iC = 0;
        int i10 = 0;
        while (i4 < uhVarArr.length) {
            uh uhVar = uhVarArr[i4];
            this.f12843h[i10] = uhVar;
            this.g[i10] = iA;
            this.f12842f[i10] = iC;
            iA += uhVar.a();
            iC += this.f12843h[i10].c();
            this.j.put(objArr[i10], Integer.valueOf(i10));
            i4++;
            i10++;
        }
        this.f12840d = iA;
        this.f12841e = iC;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int a() {
        return this.f12840d;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final fh b(int i4, fh fhVar, long j) {
        int[] iArr = this.g;
        int iP = bq0.p(iArr, i4 + 1, false, false);
        int i10 = iArr[iP];
        int i11 = this.f12842f[iP];
        this.f12843h[iP].b(i4 - i10, fhVar, j);
        Object objCreate = this.f12844i[iP];
        if (!fh.f11162m.equals(fhVar.f11164a)) {
            objCreate = Pair.create(objCreate, fhVar.f11164a);
        }
        fhVar.f11164a = objCreate;
        fhVar.f11172k += i11;
        fhVar.f11173l += i11;
        return fhVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int c() {
        return this.f12841e;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final tg d(int i4, tg tgVar, boolean z3) {
        int[] iArr = this.f12842f;
        int iP = bq0.p(iArr, i4 + 1, false, false);
        int i10 = this.g[iP];
        this.f12843h[iP].d(i4 - iArr[iP], tgVar, z3);
        tgVar.f16811c += i10;
        if (z3) {
            Object obj = this.f12844i[iP];
            Object obj2 = tgVar.f16810b;
            obj2.getClass();
            tgVar.f16810b = Pair.create(obj, obj2);
        }
        return tgVar;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.f12843h[iIntValue].e(obj3)) != -1) {
                return this.f12842f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final Object f(int i4) {
        int[] iArr = this.f12842f;
        int iP = bq0.p(iArr, i4 + 1, false, false);
        return Pair.create(this.f12844i[iP], this.f12843h[iP].f(i4 - iArr[iP]));
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int h(int i4, int i10, boolean z3) {
        int[] iArr = this.g;
        int iP = bq0.p(iArr, i4 + 1, false, false);
        int i11 = iArr[iP];
        uh[] uhVarArr = this.f12843h;
        int iH = uhVarArr[iP].h(i4 - i11, i10 != 2 ? i10 : 0, z3);
        if (iH != -1) {
            return i11 + iH;
        }
        int iP2 = p(iP, z3);
        while (iP2 != -1 && uhVarArr[iP2].g()) {
            iP2 = p(iP2, z3);
        }
        if (iP2 != -1) {
            return uhVarArr[iP2].k(z3) + iArr[iP2];
        }
        if (i10 == 2) {
            return k(z3);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int i(int i4) {
        int[] iArr = this.g;
        int iP = bq0.p(iArr, i4 + 1, false, false);
        int i10 = iArr[iP];
        uh[] uhVarArr = this.f12843h;
        int i11 = uhVarArr[iP].i(i4 - i10);
        if (i11 != -1) {
            return i10 + i11;
        }
        int iQ = q(iP, false);
        while (iQ != -1 && uhVarArr[iQ].g()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return uhVarArr[iQ].j(false) + iArr[iQ];
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int j(boolean z3) {
        int iQ;
        int i4 = this.f12838b;
        if (i4 != 0) {
            if (z3) {
                int[] iArr = this.f12839c.f13304b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i4 - 1;
            }
            do {
                uh[] uhVarArr = this.f12843h;
                if (!uhVarArr[iQ].g()) {
                    return uhVarArr[iQ].j(z3) + this.g[iQ];
                }
                iQ = q(iQ, z3);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final int k(boolean z3) {
        if (this.f12838b != 0) {
            int iP = 0;
            if (z3) {
                int[] iArr = this.f12839c.f13304b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                uh[] uhVarArr = this.f12843h;
                if (!uhVarArr[iP].g()) {
                    return uhVarArr[iP].k(z3) + this.g[iP];
                }
                iP = p(iP, z3);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.uh
    public final tg o(Object obj, tg tgVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i4 = this.g[iIntValue];
        this.f12843h[iIntValue].o(obj3, tgVar);
        tgVar.f16811c += i4;
        tgVar.f16810b = obj;
        return tgVar;
    }

    public final int p(int i4, boolean z3) {
        if (!z3) {
            if (i4 >= this.f12838b - 1) {
                return -1;
            }
            return i4 + 1;
        }
        kz1 kz1Var = this.f12839c;
        int i10 = kz1Var.f13305c[i4] + 1;
        int[] iArr = kz1Var.f13304b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int q(int i4, boolean z3) {
        if (!z3) {
            if (i4 <= 0) {
                return -1;
            }
            return i4 - 1;
        }
        kz1 kz1Var = this.f12839c;
        int i10 = kz1Var.f13305c[i4] - 1;
        if (i10 >= 0) {
            return kz1Var.f13304b[i10];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ju1(List list, kz1 kz1Var) {
        uh[] uhVarArr = new uh[list.size()];
        Iterator it = list.iterator();
        int i4 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            uhVarArr[i10] = ((wt1) it.next()).a();
            i10++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i4] = ((wt1) it2.next()).b();
            i4++;
        }
        this(uhVarArr, objArr, kz1Var);
    }
}
