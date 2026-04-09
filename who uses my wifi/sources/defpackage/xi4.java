package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xi4 implements nj4 {
    public final d02 a;
    public final int b;
    public final int[] c;
    public final ph4[] d;
    public int e;

    public xi4(d02 d02Var, int[] iArr) {
        int length = iArr.length;
        zt0.b0(length > 0);
        d02Var.getClass();
        ph4[] ph4VarArr = d02Var.d;
        this.a = d02Var;
        this.b = length;
        this.d = new ph4[length];
        for (int i = 0; i < iArr.length; i++) {
            this.d[i] = ph4VarArr[iArr[i]];
        }
        Arrays.sort(this.d, bk.j);
        this.c = new int[this.b];
        for (int i2 = 0; i2 < this.b; i2++) {
            int[] iArr2 = this.c;
            ph4 ph4Var = this.d[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= ph4VarArr.length) {
                    i3 = -1;
                    break;
                } else if (ph4Var == ph4VarArr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    public static void d(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            um3 um3Var = (um3) arrayList.get(i2);
            if (um3Var != null) {
                um3Var.a(new wi4(j, jArr[i2]));
            }
        }
    }

    @Override // defpackage.nj4
    public final d02 a() {
        return this.a;
    }

    @Override // defpackage.nj4
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.nj4
    public final ph4 c(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xi4 xi4Var = (xi4) obj;
            if (this.a.equals(xi4Var.a) && Arrays.equals(this.c, xi4Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nj4
    public final int f() {
        return this.c[0];
    }

    @Override // defpackage.nj4
    public final ph4 h() {
        return this.d[0];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.nj4
    public final int m0(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.nj4
    public final int t(int i) {
        return this.c[i];
    }
}
