package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ic4 extends oz1 {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final ni4 c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final oz1[] h;
    public final Object[] i;
    public final HashMap j;

    public ic4(oz1[] oz1VarArr, Object[] objArr, ni4 ni4Var) {
        this.c = ni4Var;
        this.b = ni4Var.b.length;
        this.h = oz1VarArr;
        int length = oz1VarArr.length;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int i = 0;
        int iA = 0;
        int iC = 0;
        int i2 = 0;
        while (i < oz1VarArr.length) {
            oz1 oz1Var = oz1VarArr[i];
            this.h[i2] = oz1Var;
            this.g[i2] = iA;
            this.f[i2] = iC;
            iA += oz1Var.a();
            iC += this.h[i2].c();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.d = iA;
        this.e = iC;
    }

    @Override // defpackage.oz1
    public final int a() {
        return this.d;
    }

    @Override // defpackage.oz1
    public final ez1 b(int i, ez1 ez1Var, long j) {
        int[] iArr = this.g;
        int iO = v23.o(iArr, i + 1, false, false);
        int i2 = iArr[iO];
        int i3 = this.f[iO];
        this.h[iO].b(i - i2, ez1Var, j);
        Object objCreate = this.i[iO];
        if (!ez1.m.equals(ez1Var.a)) {
            objCreate = Pair.create(objCreate, ez1Var.a);
        }
        ez1Var.a = objCreate;
        ez1Var.k += i3;
        ez1Var.l += i3;
        return ez1Var;
    }

    @Override // defpackage.oz1
    public final int c() {
        return this.e;
    }

    @Override // defpackage.oz1
    public final sw1 d(int i, sw1 sw1Var, boolean z) {
        int[] iArr = this.f;
        int iO = v23.o(iArr, i + 1, false, false);
        int i2 = this.g[iO];
        this.h[iO].d(i - iArr[iO], sw1Var, z);
        sw1Var.c += i2;
        if (z) {
            Object obj = this.i[iO];
            Object obj2 = sw1Var.b;
            obj2.getClass();
            sw1Var.b = Pair.create(obj, obj2);
        }
        return sw1Var;
    }

    @Override // defpackage.oz1
    public final int e(Object obj) {
        int iE;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iE = this.h[iIntValue].e(obj3)) != -1) {
                return this.f[iIntValue] + iE;
            }
        }
        return -1;
    }

    @Override // defpackage.oz1
    public final Object f(int i) {
        int[] iArr = this.f;
        int iO = v23.o(iArr, i + 1, false, false);
        return Pair.create(this.i[iO], this.h[iO].f(i - iArr[iO]));
    }

    @Override // defpackage.oz1
    public final int h(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int iO = v23.o(iArr, i + 1, false, false);
        int i3 = iArr[iO];
        oz1[] oz1VarArr = this.h;
        int iH = oz1VarArr[iO].h(i - i3, i2 != 2 ? i2 : 0, z);
        if (iH != -1) {
            return i3 + iH;
        }
        int iP = p(iO, z);
        while (iP != -1 && oz1VarArr[iP].g()) {
            iP = p(iP, z);
        }
        if (iP != -1) {
            return oz1VarArr[iP].k(z) + iArr[iP];
        }
        if (i2 == 2) {
            return k(z);
        }
        return -1;
    }

    @Override // defpackage.oz1
    public final int i(int i) {
        int[] iArr = this.g;
        int iO = v23.o(iArr, i + 1, false, false);
        int i2 = iArr[iO];
        oz1[] oz1VarArr = this.h;
        int i3 = oz1VarArr[iO].i(i - i2);
        if (i3 != -1) {
            return i2 + i3;
        }
        int iQ = q(iO, false);
        while (iQ != -1 && oz1VarArr[iQ].g()) {
            iQ = q(iQ, false);
        }
        if (iQ == -1) {
            return -1;
        }
        return oz1VarArr[iQ].j(false) + iArr[iQ];
    }

    @Override // defpackage.oz1
    public final int j(boolean z) {
        int iQ;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                int length = iArr.length;
                iQ = length > 0 ? iArr[length - 1] : -1;
            } else {
                iQ = i - 1;
            }
            do {
                oz1[] oz1VarArr = this.h;
                if (!oz1VarArr[iQ].g()) {
                    return oz1VarArr[iQ].j(z) + this.g[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.oz1
    public final int k(boolean z) {
        if (this.b != 0) {
            int iP = 0;
            if (z) {
                int[] iArr = this.c.b;
                iP = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                oz1[] oz1VarArr = this.h;
                if (!oz1VarArr[iP].g()) {
                    return oz1VarArr[iP].k(z) + this.g[iP];
                }
                iP = p(iP, z);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // defpackage.oz1
    public final sw1 o(Object obj, sw1 sw1Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.g[iIntValue];
        this.h[iIntValue].o(obj3, sw1Var);
        sw1Var.c += i;
        sw1Var.b = obj;
        return sw1Var;
    }

    public final int p(int i, boolean z) {
        if (!z) {
            if (i >= this.b - 1) {
                return -1;
            }
            return i + 1;
        }
        ni4 ni4Var = this.c;
        int i2 = ni4Var.c[i] + 1;
        int[] iArr = ni4Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        ni4 ni4Var = this.c;
        int i2 = ni4Var.c[i] - 1;
        if (i2 >= 0) {
            return ni4Var.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ic4(List list, ni4 ni4Var) {
        oz1[] oz1VarArr = new oz1[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            oz1VarArr[i2] = ((sb4) it.next()).d();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((sb4) it2.next()).a();
            i++;
        }
        this(oz1VarArr, objArr, ni4Var);
    }
}
