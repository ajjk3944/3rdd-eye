package com.google.android.exoplayer2;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k1 extends w1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f4214b;

    /* renamed from: c, reason: collision with root package name */
    public final ya.v0 f4215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4217e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4218f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4219g;

    /* renamed from: h, reason: collision with root package name */
    public final w1[] f4220h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f4221i;
    public final HashMap j;

    public k1(ArrayList arrayList, ya.v0 v0Var) {
        this.f4215c = v0Var;
        this.f4214b = v0Var.f26183b.length;
        int size = arrayList.size();
        this.f4218f = new int[size];
        this.f4219g = new int[size];
        this.f4220h = new w1[size];
        this.f4221i = new Object[size];
        this.j = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            this.f4220h[i10] = t0Var.b();
            this.f4219g[i10] = iO;
            this.f4218f[i10] = iH;
            iO += this.f4220h[i10].o();
            iH += this.f4220h[i10].h();
            this.f4221i[i10] = t0Var.a();
            this.j.put(this.f4221i[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f4216d = iO;
        this.f4217e = iH;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int a(boolean z10) {
        if (this.f4214b != 0) {
            int iQ = 0;
            if (z10) {
                int[] iArr = this.f4215c.f26183b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                w1[] w1VarArr = this.f4220h;
                if (!w1VarArr[iQ].p()) {
                    return w1VarArr[iQ].a(z10) + this.f4219g[iQ];
                }
                iQ = q(iQ, z10);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f4220h[iIntValue].b(obj3)) != -1) {
                return this.f4218f[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int c(boolean z10) {
        int iR;
        int i10 = this.f4214b;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = this.f4215c.f26183b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i10 - 1;
            }
            do {
                w1[] w1VarArr = this.f4220h;
                if (!w1VarArr[iR].p()) {
                    return w1VarArr[iR].c(z10) + this.f4219g[iR];
                }
                iR = r(iR, z10);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int e(int i10, boolean z10, int i11) {
        int[] iArr = this.f4219g;
        int iD = qb.v.d(iArr, i10 + 1);
        int i12 = iArr[iD];
        w1[] w1VarArr = this.f4220h;
        int iE = w1VarArr[iD].e(i10 - i12, z10, i11 == 2 ? 0 : i11);
        if (iE != -1) {
            return i12 + iE;
        }
        int iQ = q(iD, z10);
        while (iQ != -1 && w1VarArr[iQ].p()) {
            iQ = q(iQ, z10);
        }
        if (iQ != -1) {
            return w1VarArr[iQ].a(z10) + iArr[iQ];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final u1 f(int i10, u1 u1Var, boolean z10) {
        int[] iArr = this.f4218f;
        int iD = qb.v.d(iArr, i10 + 1);
        int i11 = this.f4219g[iD];
        this.f4220h[iD].f(i10 - iArr[iD], u1Var, z10);
        u1Var.f4596c += i11;
        if (z10) {
            Object obj = this.f4221i[iD];
            Object obj2 = u1Var.f4595b;
            obj2.getClass();
            u1Var.f4595b = Pair.create(obj, obj2);
        }
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final u1 g(Object obj, u1 u1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.f4219g[iIntValue];
        this.f4220h[iIntValue].g(obj3, u1Var);
        u1Var.f4596c += i10;
        u1Var.f4595b = obj;
        return u1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int h() {
        return this.f4217e;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int k(int i10, boolean z10, int i11) {
        int[] iArr = this.f4219g;
        int iD = qb.v.d(iArr, i10 + 1);
        int i12 = iArr[iD];
        w1[] w1VarArr = this.f4220h;
        int iK = w1VarArr[iD].k(i10 - i12, z10, i11 == 2 ? 0 : i11);
        if (iK != -1) {
            return i12 + iK;
        }
        int iR = r(iD, z10);
        while (iR != -1 && w1VarArr[iR].p()) {
            iR = r(iR, z10);
        }
        if (iR != -1) {
            return w1VarArr[iR].c(z10) + iArr[iR];
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w1
    public final Object l(int i10) {
        int[] iArr = this.f4218f;
        int iD = qb.v.d(iArr, i10 + 1);
        return Pair.create(this.f4221i[iD], this.f4220h[iD].l(i10 - iArr[iD]));
    }

    @Override // com.google.android.exoplayer2.w1
    public final v1 m(int i10, v1 v1Var, long j) {
        int[] iArr = this.f4219g;
        int iD = qb.v.d(iArr, i10 + 1);
        int i11 = iArr[iD];
        int i12 = this.f4218f[iD];
        this.f4220h[iD].m(i10 - i11, v1Var, j);
        Object objCreate = this.f4221i[iD];
        if (!v1.f4738r.equals(v1Var.f4740a)) {
            objCreate = Pair.create(objCreate, v1Var.f4740a);
        }
        v1Var.f4740a = objCreate;
        v1Var.f4752o += i12;
        v1Var.f4753p += i12;
        return v1Var;
    }

    @Override // com.google.android.exoplayer2.w1
    public final int o() {
        return this.f4216d;
    }

    public final int q(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f4214b - 1) {
                return i10 + 1;
            }
            return -1;
        }
        ya.v0 v0Var = this.f4215c;
        int i11 = v0Var.f26184c[i10] + 1;
        int[] iArr = v0Var.f26183b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int r(int i10, boolean z10) {
        if (!z10) {
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }
        ya.v0 v0Var = this.f4215c;
        int i11 = v0Var.f26184c[i10] - 1;
        if (i11 >= 0) {
            return v0Var.f26183b[i11];
        }
        return -1;
    }
}
