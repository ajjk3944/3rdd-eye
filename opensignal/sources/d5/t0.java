package d5;

import android.util.Pair;
import androidx.media3.common.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o5.b1;

/* loaded from: classes.dex */
public final class t0 extends a1 {
    public static final /* synthetic */ int G = 0;
    public final int[] B;
    public final a1[] D;
    public final Object[] E;
    public final HashMap F;

    /* renamed from: d, reason: collision with root package name */
    public final int f7087d;

    /* renamed from: g, reason: collision with root package name */
    public final b1 f7088g;

    /* renamed from: r, reason: collision with root package name */
    public final int f7089r;

    /* renamed from: x, reason: collision with root package name */
    public final int f7090x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f7091y;

    public t0(ArrayList arrayList, b1 b1Var) {
        this.f7088g = b1Var;
        this.f7087d = ((o5.a1) b1Var).f18892b.length;
        int size = arrayList.size();
        this.f7091y = new int[size];
        this.B = new int[size];
        this.D = new a1[size];
        this.E = new Object[size];
        this.F = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            this.D[i10] = h0Var.b();
            this.B[i10] = iO;
            this.f7091y[i10] = iH;
            iO += this.D[i10].o();
            iH += this.D[i10].h();
            this.E[i10] = h0Var.a();
            this.F.put(this.E[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f7089r = iO;
        this.f7090x = iH;
    }

    @Override // androidx.media3.common.a1
    public final int a(boolean z10) {
        if (this.f7087d != 0) {
            int iQ = 0;
            if (z10) {
                int[] iArr = ((o5.a1) this.f7088g).f18892b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                a1[] a1VarArr = this.D;
                if (!a1VarArr[iQ].p()) {
                    return a1VarArr[iQ].a(z10) + this.B[iQ];
                }
                iQ = q(iQ, z10);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.F.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.D[iIntValue].b(obj3)) != -1) {
                return this.f7091y[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final int c(boolean z10) {
        int iR;
        int i10 = this.f7087d;
        if (i10 != 0) {
            if (z10) {
                int[] iArr = ((o5.a1) this.f7088g).f18892b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i10 - 1;
            }
            do {
                a1[] a1VarArr = this.D;
                if (!a1VarArr[iR].p()) {
                    return a1VarArr[iR].c(z10) + this.B[iR];
                }
                iR = r(iR, z10);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final int e(int i10, boolean z10, int i11) {
        int[] iArr = this.B;
        int iD = a5.d0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        a1[] a1VarArr = this.D;
        int iE = a1VarArr[iD].e(i10 - i12, z10, i11 != 2 ? i11 : 0);
        if (iE != -1) {
            return i12 + iE;
        }
        int iQ = q(iD, z10);
        while (iQ != -1 && a1VarArr[iQ].p()) {
            iQ = q(iQ, z10);
        }
        if (iQ != -1) {
            return a1VarArr[iQ].a(z10) + iArr[iQ];
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final androidx.media3.common.y0 f(int i10, androidx.media3.common.y0 y0Var, boolean z10) {
        int[] iArr = this.f7091y;
        int iD = a5.d0.d(iArr, i10 + 1, false, false);
        int i11 = this.B[iD];
        this.D[iD].f(i10 - iArr[iD], y0Var, z10);
        y0Var.f1829g += i11;
        if (z10) {
            Object obj = this.E[iD];
            Object obj2 = y0Var.f1828d;
            obj2.getClass();
            y0Var.f1828d = Pair.create(obj, obj2);
        }
        return y0Var;
    }

    @Override // androidx.media3.common.a1
    public final androidx.media3.common.y0 g(Object obj, androidx.media3.common.y0 y0Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.F.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i10 = this.B[iIntValue];
        this.D[iIntValue].g(obj3, y0Var);
        y0Var.f1829g += i10;
        y0Var.f1828d = obj;
        return y0Var;
    }

    @Override // androidx.media3.common.a1
    public final int h() {
        return this.f7090x;
    }

    @Override // androidx.media3.common.a1
    public final int k(int i10, boolean z10, int i11) {
        int[] iArr = this.B;
        int iD = a5.d0.d(iArr, i10 + 1, false, false);
        int i12 = iArr[iD];
        a1[] a1VarArr = this.D;
        int iK = a1VarArr[iD].k(i10 - i12, z10, i11 != 2 ? i11 : 0);
        if (iK != -1) {
            return i12 + iK;
        }
        int iR = r(iD, z10);
        while (iR != -1 && a1VarArr[iR].p()) {
            iR = r(iR, z10);
        }
        if (iR != -1) {
            return a1VarArr[iR].c(z10) + iArr[iR];
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // androidx.media3.common.a1
    public final Object l(int i10) {
        int[] iArr = this.f7091y;
        int iD = a5.d0.d(iArr, i10 + 1, false, false);
        return Pair.create(this.E[iD], this.D[iD].l(i10 - iArr[iD]));
    }

    @Override // androidx.media3.common.a1
    public final androidx.media3.common.z0 m(int i10, androidx.media3.common.z0 z0Var, long j) {
        int[] iArr = this.B;
        int iD = a5.d0.d(iArr, i10 + 1, false, false);
        int i11 = iArr[iD];
        int i12 = this.f7091y[iD];
        this.D[iD].m(i10 - i11, z0Var, j);
        Object objCreate = this.E[iD];
        if (!androidx.media3.common.z0.N.equals(z0Var.f1842a)) {
            objCreate = Pair.create(objCreate, z0Var.f1842a);
        }
        z0Var.f1842a = objCreate;
        z0Var.K += i12;
        z0Var.L += i12;
        return z0Var;
    }

    @Override // androidx.media3.common.a1
    public final int o() {
        return this.f7089r;
    }

    public final int q(int i10, boolean z10) {
        if (!z10) {
            if (i10 < this.f7087d - 1) {
                return i10 + 1;
            }
            return -1;
        }
        o5.a1 a1Var = (o5.a1) this.f7088g;
        int i11 = a1Var.f18893c[i10] + 1;
        int[] iArr = a1Var.f18892b;
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
        o5.a1 a1Var = (o5.a1) this.f7088g;
        int i11 = a1Var.f18893c[i10] - 1;
        if (i11 >= 0) {
            return a1Var.f18892b[i11];
        }
        return -1;
    }
}
