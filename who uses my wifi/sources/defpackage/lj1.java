package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lj1 implements cg1 {
    public final long a;
    public final mj1[] b;
    public final int c;

    public lj1(long j, mj1[] mj1VarArr, int i) {
        this.a = j;
        this.b = mj1VarArr;
        this.c = i;
    }

    @Override // defpackage.cg1
    public final long a() {
        return this.a;
    }

    @Override // defpackage.cg1
    public final bg1 b(long j) {
        long j2;
        long j3;
        long j4;
        mj1[] mj1VarArr;
        boolean z;
        char c;
        int iA;
        long j5;
        long j6;
        int iA2;
        long j7 = j;
        mj1[] mj1VarArr2 = this.b;
        int length = mj1VarArr2.length;
        dg1 dg1Var = dg1.c;
        if (length == 0) {
            return new bg1(dg1Var, dg1Var);
        }
        boolean z2 = false;
        char c2 = 65535;
        int i = this.c;
        if (i != -1) {
            tj1 tj1Var = mj1VarArr2[i].b;
            long[] jArr = tj1Var.f;
            int iP = v23.p(jArr, j7, false);
            while (true) {
                if (iP < 0) {
                    iP = -1;
                    break;
                }
                if ((tj1Var.g[iP] & 1) != 0) {
                    break;
                }
                iP--;
            }
            if (iP == -1) {
                iP = tj1Var.a(j7);
            }
            if (iP == -1) {
                return new bg1(dg1Var, dg1Var);
            }
            long j8 = jArr[iP];
            long[] jArr2 = tj1Var.c;
            j2 = jArr2[iP];
            if (j8 >= j7 || iP >= tj1Var.b - 1 || (iA2 = tj1Var.a(j7)) == -1 || iA2 == iP) {
                j5 = -9223372036854775807L;
                j6 = -1;
            } else {
                long j9 = jArr[iA2];
                j6 = jArr2[iA2];
                j5 = j9;
            }
            j4 = j6;
            j3 = j5;
            j7 = j8;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            j4 = -1;
        }
        int i2 = 0;
        long jMin = j2;
        long jMin2 = j4;
        while (i2 < mj1VarArr2.length) {
            if (i2 != i) {
                tj1 tj1Var2 = mj1VarArr2[i2].b;
                long[] jArr3 = tj1Var2.c;
                int[] iArr = tj1Var2.g;
                long[] jArr4 = tj1Var2.f;
                int iP2 = v23.p(jArr4, j7, z2);
                while (true) {
                    if (iP2 < 0) {
                        iA = -1;
                        break;
                    }
                    if ((iArr[iP2] & 1) != 0) {
                        iA = iP2;
                        break;
                    }
                    iP2--;
                }
                mj1VarArr = mj1VarArr2;
                if (iA == -1) {
                    iA = tj1Var2.a(j7);
                }
                if (iA != -1) {
                    jMin = Math.min(jArr3[iA], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    int iP3 = v23.p(jArr4, j3, false);
                    while (true) {
                        if (iP3 < 0) {
                            iP3 = -1;
                            break;
                        }
                        if ((iArr[iP3] & 1) != 0) {
                            break;
                        }
                        iP3--;
                    }
                    c = 65535;
                    if (iP3 == -1) {
                        iP3 = tj1Var2.a(j3);
                    }
                    if (iP3 != -1) {
                        jMin2 = Math.min(jArr3[iP3], jMin2);
                    }
                } else {
                    z = false;
                    c = 65535;
                }
            } else {
                mj1VarArr = mj1VarArr2;
                z = z2;
                c = c2;
            }
            i2++;
            c2 = c;
            z2 = z;
            mj1VarArr2 = mj1VarArr;
        }
        dg1 dg1Var2 = new dg1(j7, jMin);
        return j3 == -9223372036854775807L ? new bg1(dg1Var2, dg1Var2) : new bg1(dg1Var2, new dg1(j3, jMin2));
    }

    @Override // defpackage.cg1
    public final boolean d() {
        return true;
    }
}
