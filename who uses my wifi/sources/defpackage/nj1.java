package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nj1 implements lf1 {
    public static final /* synthetic */ int z = 0;
    public final jk1 a;
    public final int b;
    public final kz2 c;
    public final kz2 d;
    public final kz2 e;
    public final kz2 f;
    public final ArrayDeque g;
    public final pj1 h;
    public final ArrayList i;
    public sn3 j;
    public int k;
    public int l;
    public long m;
    public int n;
    public kz2 o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public nf1 v;
    public mj1[] w;
    public long[][] x;
    public int y;

    static {
        int i = yb.r;
    }

    public nj1() {
        this(jk1.e, 16);
    }

    public final void a() {
        this.k = 0;
        this.n = 0;
    }

    @Override // defpackage.lf1
    public final boolean b(mf1 mf1Var) {
        sn3 sn3VarI;
        gg1 gg1VarD = g82.D(mf1Var, false, false);
        if (gg1VarD != null) {
            sn3VarI = xm3.i(gg1VarD);
        } else {
            vm3 vm3Var = xm3.g;
            sn3VarI = sn3.j;
        }
        this.j = sn3VarI;
        return gg1VarD == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x05af, code lost:
    
        throw defpackage.lq1.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x038e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    @Override // defpackage.lf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.mf1 r38, defpackage.pf1 r39) throws java.lang.NumberFormatException, defpackage.lq1 {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj1.c(mf1, pf1):int");
    }

    @Override // defpackage.lf1
    public final /* synthetic */ List d() {
        return this.j;
    }

    @Override // defpackage.lf1
    public final void e(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                a();
                return;
            }
            pj1 pj1Var = this.h;
            pj1Var.a.clear();
            pj1Var.b = 0;
            this.i.clear();
            return;
        }
        for (mj1 mj1Var : this.w) {
            tj1 tj1Var = mj1Var.b;
            int iP = v23.p(tj1Var.f, j2, false);
            while (true) {
                if (iP < 0) {
                    iP = -1;
                    break;
                } else if ((tj1Var.g[iP] & 1) != 0) {
                    break;
                } else {
                    iP--;
                }
            }
            if (iP == -1) {
                iP = tj1Var.a(j2);
            }
            mj1Var.e = iP;
            kg1 kg1Var = mj1Var.d;
            if (kg1Var != null) {
                kg1Var.b = false;
                kg1Var.c = 0;
            }
        }
    }

    @Override // defpackage.lf1
    public final void f(nf1 nf1Var) {
        if ((this.b & 16) == 0) {
            nf1Var = new rl(nf1Var, this.a);
        }
        this.v = nf1Var;
    }

    public final void g(long j) throws NumberFormatException {
        wn1 wn1VarC;
        ArrayList arrayList;
        int i;
        int i2;
        wn1 wn1Var;
        long j2;
        mj1 mj1Var;
        int i3;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            if (arrayDeque.isEmpty() || ((m43) arrayDeque.peek()).c != j) {
                break;
            }
            m43 m43Var = (m43) arrayDeque.pop();
            if (m43Var.b == 1836019574) {
                m43 m43VarJ = m43Var.j(1835365473);
                new ArrayList();
                wn1 wn1VarE = m43VarJ != null ? ej1.e(m43VarJ) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = this.y == 1;
                uf1 uf1Var = new uf1();
                p43 p43VarI = m43Var.i(1969517665);
                if (p43VarI != null) {
                    wn1VarC = ej1.c(p43VarI);
                    uf1Var.a(wn1VarC);
                } else {
                    wn1VarC = null;
                }
                p43 p43VarI2 = m43Var.i(1836476516);
                p43VarI2.getClass();
                wn1 wn1Var2 = new wn1(ej1.d(p43VarI2.c));
                wn1 wn1Var3 = wn1VarC;
                ArrayList arrayListB = ej1.b(m43Var, uf1Var, -9223372036854775807L, null, false, z2, gj1.b);
                String strF = m54.F(arrayListB);
                long j3 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int size = -1;
                while (i4 < arrayListB.size()) {
                    tj1 tj1Var = (tj1) arrayListB.get(i4);
                    int i6 = tj1Var.b;
                    ArrayDeque arrayDeque2 = arrayDeque;
                    int i7 = tj1Var.e;
                    if (i6 == 0) {
                        arrayList = arrayListB;
                        i2 = i4;
                        i = i5;
                        wn1Var = wn1VarE;
                    } else {
                        qj1 qj1Var = tj1Var.a;
                        arrayList = arrayListB;
                        nf1 nf1Var = this.v;
                        i = i5 + 1;
                        i2 = i4;
                        int i8 = qj1Var.b;
                        jg1 jg1VarZ = nf1Var.z(i5, i8);
                        mj1 mj1Var2 = new mj1(qj1Var, tj1Var, jg1VarZ);
                        wn1Var = wn1VarE;
                        long j4 = qj1Var.e;
                        if (j4 == -9223372036854775807L) {
                            j4 = tj1Var.h;
                        }
                        long jMax = Math.max(j3, j4);
                        ph4 ph4Var = qj1Var.g;
                        String str = ph4Var.m;
                        int i9 = "audio/true-hd".equals(str) ? i7 * 16 : i7 + 30;
                        gg4 gg4Var = new gg4(ph4Var);
                        gg4Var.m = i9;
                        if (i8 == 2) {
                            int i10 = ph4Var.f;
                            if ((this.b & 8) != 0) {
                                i10 |= size == -1 ? 1 : 2;
                            }
                            gg4Var.f = i10;
                            i8 = 2;
                        }
                        if (i8 == 1) {
                            int i11 = uf1Var.a;
                            j2 = jMax;
                            if (i11 != -1 && (i3 = uf1Var.b) != -1) {
                                gg4Var.G = i11;
                                gg4Var.H = i3;
                            }
                        } else {
                            j2 = jMax;
                        }
                        wn1 wn1Var4 = ph4Var.k;
                        ArrayList arrayList3 = this.i;
                        wl2.E(i8, wn1Var, gg4Var, wn1Var4, arrayList3.isEmpty() ? null : new wn1(arrayList3), wn1Var3, wn1Var2);
                        gg4Var.d(strF);
                        if (Objects.equals(str, "audio/mpeg")) {
                            mj1Var = mj1Var2;
                            mj1Var.f = new ph4(gg4Var);
                        } else {
                            mj1Var = mj1Var2;
                            jg1VarZ.d(new ph4(gg4Var));
                        }
                        if (i8 == 2 && size == -1) {
                            size = arrayList2.size();
                        }
                        arrayList2.add(mj1Var);
                        j3 = j2;
                    }
                    i4 = i2 + 1;
                    wn1VarE = wn1Var;
                    arrayDeque = arrayDeque2;
                    arrayListB = arrayList;
                    i5 = i;
                }
                ArrayDeque arrayDeque3 = arrayDeque;
                int i12 = -1;
                mj1[] mj1VarArr = (mj1[]) arrayList2.toArray(new mj1[0]);
                this.w = mj1VarArr;
                int length = mj1VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i13 = 0; i13 < mj1VarArr.length; i13++) {
                    jArr[i13] = new long[mj1VarArr[i13].b.b];
                    jArr2[i13] = mj1VarArr[i13].b.f[0];
                }
                long j5 = 0;
                int i14 = 0;
                while (i14 < mj1VarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i15 = i12;
                    for (int i16 = 0; i16 < mj1VarArr.length; i16++) {
                        if (!zArr[i16]) {
                            long j7 = jArr2[i16];
                            if (j7 <= j6) {
                                i15 = i16;
                                j6 = j7;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j5;
                    tj1 tj1Var2 = mj1VarArr[i15].b;
                    mj1[] mj1VarArr2 = mj1VarArr;
                    boolean[] zArr2 = zArr;
                    j5 += tj1Var2.d[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = tj1Var2.f[i18];
                    } else {
                        zArr2[i15] = true;
                        i14++;
                    }
                    mj1VarArr = mj1VarArr2;
                    zArr = zArr2;
                    i12 = -1;
                }
                this.x = jArr;
                this.v.s();
                this.v.v(new lj1(j3, this.w, size));
                arrayDeque3.clear();
                this.k = 2;
            } else if (!arrayDeque.isEmpty()) {
                ((m43) arrayDeque.peek()).e.add(m43Var);
            }
        }
        if (this.k != 2) {
            a();
        }
    }

    public nj1(jk1 jk1Var, int i) {
        this.a = jk1Var;
        this.b = i;
        vm3 vm3Var = xm3.g;
        this.j = sn3.j;
        this.k = 0;
        this.h = new pj1();
        this.i = new ArrayList();
        this.f = new kz2(16);
        this.g = new ArrayDeque();
        this.c = new kz2(wl2.G);
        this.d = new kz2(6);
        this.e = new kz2();
        this.p = -1;
        this.v = nf1.d;
        this.w = new mj1[0];
    }
}
