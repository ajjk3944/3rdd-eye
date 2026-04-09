package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bi4 implements jh4, nf1, zj4 {
    public static final Map S;
    public static final ph4 T;
    public boolean A;
    public boolean B;
    public p21 C;
    public cg1 D;
    public long E;
    public boolean F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public final Uri f;
    public final th3 g;
    public final pz h;
    public final wt2 i;
    public final lv2 j;
    public final hi4 k;
    public final rj4 l;
    public final long m;
    public final long n;
    public final jr3 p;
    public final Handler t;
    public ih4 u;
    public oh1 v;
    public ki4[] w;
    public ai4[] x;
    public boolean y;
    public boolean z;
    public final t83 o = new t83(2);
    public final hp2 q = new hp2();
    public final yh4 r = new yh4(this, 2);
    public final yh4 s = new yh4(this, 0);

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        S = Collections.unmodifiableMap(map);
        gg4 gg4Var = new gg4();
        gg4Var.a = "icy";
        gg4Var.e("application/x-icy");
        T = new ph4(gg4Var);
    }

    public bi4(Uri uri, th3 th3Var, jr3 jr3Var, pz pzVar, lv2 lv2Var, wt2 wt2Var, hi4 hi4Var, rj4 rj4Var, int i, long j) {
        this.f = uri;
        this.g = th3Var;
        this.h = pzVar;
        this.j = lv2Var;
        this.i = wt2Var;
        this.k = hi4Var;
        this.l = rj4Var;
        this.m = i;
        this.p = jr3Var;
        this.n = j;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.t = new Handler(looperMyLooper, null);
        this.x = new ai4[0];
        this.w = new ki4[0];
        this.N = -9223372036854775807L;
        this.G = 1;
    }

    public final boolean A() {
        return this.N != -9223372036854775807L;
    }

    public final void B() {
        zt0.b0(this.z);
        this.C.getClass();
        this.D.getClass();
    }

    @Override // defpackage.jh4
    public final void a(ih4 ih4Var, long j) {
        this.u = ih4Var;
        this.q.a();
        w();
    }

    @Override // defpackage.mi4
    public final boolean b(nb4 nb4Var) {
        if (this.Q) {
            return false;
        }
        t83 t83Var = this.o;
        if (((IOException) t83Var.i) != null || this.O) {
            return false;
        }
        if (this.z && this.K == 0) {
            return false;
        }
        boolean zA = this.q.a();
        if (((yj4) t83Var.h) != null) {
            return zA;
        }
        w();
        return true;
    }

    public final void c(xh4 xh4Var, boolean z) {
        Uri uri = xh4Var.b.g;
        ch4 ch4Var = new ch4();
        long j = xh4Var.i;
        long j2 = this.E;
        wt2 wt2Var = this.i;
        wt2Var.n(new jr3(wt2Var, ch4Var, new hh4(-1, null, v23.q(j), v23.q(j2)), 9));
        if (z) {
            return;
        }
        for (ki4 ki4Var : this.w) {
            ki4Var.i(false);
        }
        if (this.K > 0) {
            ih4 ih4Var = this.u;
            ih4Var.getClass();
            ih4Var.c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    @Override // defpackage.jh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(long r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi4.d(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // defpackage.jh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.B
            if (r0 == 0) goto L5
            goto L5d
        L5:
            r11.B()
            boolean r0 = r11.A()
            if (r0 != 0) goto L5d
            p21 r0 = r11.C
            java.lang.Object r0 = r0.h
            boolean[] r0 = (boolean[]) r0
            ki4[] r1 = r11.w
            int r1 = r1.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L5d
            ki4[] r3 = r11.w
            r4 = r3[r2]
            boolean r3 = r0[r2]
            ii4 r10 = r4.a
            monitor-enter(r4)
            int r5 = r4.o     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L32
            long[] r6 = r4.m     // Catch: java.lang.Throwable -> L3e
            r7 = r5
            int r5 = r4.q     // Catch: java.lang.Throwable -> L3e
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3e
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L34
        L32:
            r7 = r12
            goto L51
        L34:
            if (r3 == 0) goto L41
            int r3 = r4.r     // Catch: java.lang.Throwable -> L3e
            if (r3 == r7) goto L41
            int r3 = r3 + 1
            r6 = r3
            goto L42
        L3e:
            r0 = move-exception
            r12 = r0
            goto L5b
        L41:
            r6 = r7
        L42:
            r9 = 0
            r7 = r12
            int r12 = r4.f(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3e
            r13 = -1
            if (r12 == r13) goto L51
            long r12 = r4.g(r12)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            goto L54
        L51:
            monitor-exit(r4)
            r12 = -1
        L54:
            r10.a(r12)
            int r2 = r2 + 1
            r12 = r7
            goto L18
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi4.e(long):void");
    }

    @Override // defpackage.jh4
    public final long f() {
        if (this.J) {
            this.J = false;
        } else {
            if (!this.I) {
                return -9223372036854775807L;
            }
            if (!this.Q && x() <= this.P) {
                return -9223372036854775807L;
            }
            this.I = false;
        }
        return this.M;
    }

    public final void g(xh4 xh4Var) {
        if (this.E == -9223372036854775807L && this.D != null) {
            long jY = y(true);
            long j = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.E = j;
            this.k.s(j, this.D, this.F);
        }
        Uri uri = xh4Var.b.g;
        ch4 ch4Var = new ch4();
        hh4 hh4Var = new hh4(-1, null, v23.q(xh4Var.i), v23.q(this.E));
        wt2 wt2Var = this.i;
        wt2Var.n(new pb3(wt2Var, ch4Var, hh4Var, 10));
        this.Q = true;
        ih4 ih4Var = this.u;
        ih4Var.getClass();
        ih4Var.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7 A[RETURN] */
    @Override // defpackage.jh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r26, defpackage.lc4 r28) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi4.h(long, lc4):long");
    }

    @Override // defpackage.mi4
    public final long i() {
        return j();
    }

    @Override // defpackage.mi4
    public final long j() {
        long jY;
        boolean z;
        long j;
        B();
        if (this.Q || this.K == 0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.N;
        }
        if (this.A) {
            int length = this.w.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                p21 p21Var = this.C;
                if (((boolean[]) p21Var.g)[i] && ((boolean[]) p21Var.h)[i]) {
                    ki4 ki4Var = this.w[i];
                    synchronized (ki4Var) {
                        z = ki4Var.v;
                    }
                    if (z) {
                        continue;
                    } else {
                        ki4 ki4Var2 = this.w[i];
                        synchronized (ki4Var2) {
                            j = ki4Var2.u;
                        }
                        jY = Math.min(jY, j);
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.M : jY;
    }

    @Override // defpackage.jh4
    public final ri4 l() {
        B();
        return (ri4) this.C.f;
    }

    @Override // defpackage.jh4
    public final long m(nj4[] nj4VarArr, boolean[] zArr, li4[] li4VarArr, boolean[] zArr2, long j) throws Throwable {
        nj4 nj4Var;
        B();
        p21 p21Var = this.C;
        ri4 ri4Var = (ri4) p21Var.f;
        boolean[] zArr3 = (boolean[]) p21Var.h;
        int i = this.K;
        for (int i2 = 0; i2 < nj4VarArr.length; i2++) {
            li4 li4Var = li4VarArr[i2];
            if (li4Var != null && (nj4VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((zh4) li4Var).a;
                zt0.b0(zArr3[i3]);
                this.K--;
                zArr3[i3] = false;
                li4VarArr[i2] = null;
            }
        }
        boolean z = !this.H ? j == 0 || this.B : i != 0;
        for (int i4 = 0; i4 < nj4VarArr.length; i4++) {
            if (li4VarArr[i4] == null && (nj4Var = nj4VarArr[i4]) != null) {
                zt0.b0(nj4Var.b() == 1);
                zt0.b0(nj4Var.t(0) == 0);
                int iIndexOf = ri4Var.b.indexOf(nj4Var.a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                zt0.b0(!zArr3[iIndexOf]);
                this.K++;
                zArr3[iIndexOf] = true;
                this.J = nj4Var.h().s | this.J;
                li4VarArr[i4] = new zh4(this, iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    ki4 ki4Var = this.w[iIndexOf];
                    z = (ki4Var.p + ki4Var.r == 0 || ki4Var.k(j, true)) ? false : true;
                }
            }
        }
        if (this.K == 0) {
            this.O = false;
            this.I = false;
            this.J = false;
            t83 t83Var = this.o;
            if (((yj4) t83Var.h) != null) {
                for (ki4 ki4Var2 : this.w) {
                    ki4Var2.l();
                }
                yj4 yj4Var = (yj4) t83Var.h;
                yj4Var.getClass();
                yj4Var.a(false);
            } else {
                this.Q = false;
                for (ki4 ki4Var3 : this.w) {
                    ki4Var3.i(false);
                }
            }
        } else if (z) {
            j = d(j);
            for (int i5 = 0; i5 < li4VarArr.length; i5++) {
                if (li4VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.H = true;
        return j;
    }

    public final void n(int i) {
        B();
        p21 p21Var = this.C;
        boolean[] zArr = (boolean[]) p21Var.i;
        if (zArr[i]) {
            return;
        }
        ph4 ph4Var = ((ri4) p21Var.f).a(i).d[0];
        wt2 wt2Var = this.i;
        wt2Var.n(new lv2(wt2Var, new hh4(pp1.g(ph4Var.m), ph4Var, v23.q(this.M), -9223372036854775807L), 19));
        zArr[i] = true;
    }

    @Override // defpackage.mi4
    public final boolean o() {
        boolean z;
        if (((yj4) this.o.h) == null) {
            return false;
        }
        hp2 hp2Var = this.q;
        synchronized (hp2Var) {
            z = hp2Var.a;
        }
        return z;
    }

    public final void p(int i) {
        B();
        if (this.O) {
            if ((!this.A || ((boolean[]) this.C.g)[i]) && !this.w[i].j(false)) {
                this.N = 0L;
                this.O = false;
                this.I = true;
                this.M = 0L;
                this.P = 0;
                for (ki4 ki4Var : this.w) {
                    ki4Var.i(false);
                }
                ih4 ih4Var = this.u;
                ih4Var.getClass();
                ih4Var.c(this);
            }
        }
    }

    public final boolean q() {
        return this.I || A();
    }

    @Override // defpackage.jh4
    public final void r() throws IOException {
        IOException iOException;
        int i = this.G == 7 ? 6 : 3;
        t83 t83Var = this.o;
        IOException iOException2 = (IOException) t83Var.i;
        if (iOException2 != null) {
            throw iOException2;
        }
        yj4 yj4Var = (yj4) t83Var.h;
        if (yj4Var != null && (iOException = yj4Var.h) != null && yj4Var.i > i) {
            throw iOException;
        }
        if (this.Q && !this.z) {
            throw lq1.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.nf1
    public final void s() {
        this.y = true;
        this.t.post(this.r);
    }

    public final jg1 t(ai4 ai4Var) {
        int length = this.w.length;
        for (int i = 0; i < length; i++) {
            if (ai4Var.equals(this.x[i])) {
                return this.w[i];
            }
        }
        if (this.y) {
            int i2 = ai4Var.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            a30.x(sb.toString());
            return new gf1();
        }
        ki4 ki4Var = new ki4(this.l, this.h, this.j);
        ki4Var.e = this;
        int i3 = length + 1;
        ai4[] ai4VarArr = (ai4[]) Arrays.copyOf(this.x, i3);
        ai4VarArr[length] = ai4Var;
        String str = v23.a;
        this.x = ai4VarArr;
        ki4[] ki4VarArr = (ki4[]) Arrays.copyOf(this.w, i3);
        ki4VarArr[length] = ki4Var;
        this.w = ki4VarArr;
        return ki4Var;
    }

    public final void u() {
        ph4 ph4Var;
        wn1 wn1VarC;
        int i;
        ph4 ph4Var2;
        long j = this.n;
        if (this.R || this.z || !this.y || this.D == null) {
            return;
        }
        ki4[] ki4VarArr = this.w;
        int length = ki4VarArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hp2 hp2Var = this.q;
                synchronized (hp2Var) {
                    hp2Var.a = false;
                }
                int length2 = this.w.length;
                d02[] d02VarArr = new d02[length2];
                boolean[] zArr = new boolean[length2];
                int i3 = 0;
                while (true) {
                    int i4 = 1;
                    if (i3 >= length2) {
                        break;
                    }
                    ki4 ki4Var = this.w[i3];
                    synchronized (ki4Var) {
                        ph4Var = ki4Var.x ? null : ki4Var.y;
                    }
                    ph4Var.getClass();
                    String str = ph4Var.m;
                    boolean zA = pp1.a(str);
                    boolean z2 = (zA || pp1.b(str)) ? true : z;
                    zArr[i3] = z2;
                    boolean z3 = z;
                    this.A |= z2;
                    this.B = (j != -9223372036854775807L && length2 == 1 && pp1.c(str)) ? true : z3 ? 1 : 0;
                    oh1 oh1Var = this.v;
                    if (oh1Var != null) {
                        if (zA || this.x[i3].b) {
                            wn1 wn1Var = ph4Var.k;
                            if (wn1Var == null) {
                                en1[] en1VarArr = new en1[1];
                                en1VarArr[z3 ? 1 : 0] = oh1Var;
                                wn1VarC = new wn1(en1VarArr);
                            } else {
                                en1[] en1VarArr2 = new en1[1];
                                en1VarArr2[z3 ? 1 : 0] = oh1Var;
                                wn1VarC = wn1Var.c(en1VarArr2);
                            }
                            gg4 gg4Var = new gg4(ph4Var);
                            gg4Var.j = wn1VarC;
                            ph4Var = new ph4(gg4Var);
                        }
                        if (zA && ph4Var.g == -1 && ph4Var.h == -1 && (i = oh1Var.a) != -1) {
                            gg4 gg4Var2 = new gg4(ph4Var);
                            gg4Var2.g = i;
                            ph4Var = new ph4(gg4Var2);
                        }
                    }
                    this.h.getClass();
                    if (ph4Var.q == null) {
                        i4 = z3 ? 1 : 0;
                    }
                    gg4 gg4Var3 = new gg4(ph4Var);
                    gg4Var3.K = i4;
                    ph4 ph4Var3 = new ph4(gg4Var3);
                    d02VarArr[i3] = new d02(Integer.toString(i3), ph4Var3);
                    this.J |= ph4Var3.s;
                    i3++;
                    z = z3 ? 1 : 0;
                }
                ri4 ri4Var = new ri4(d02VarArr);
                p21 p21Var = new p21();
                p21Var.f = ri4Var;
                p21Var.g = zArr;
                int i5 = ri4Var.a;
                p21Var.h = new boolean[i5];
                p21Var.i = new boolean[i5];
                this.C = p21Var;
                if (this.B && this.E == -9223372036854775807L) {
                    this.E = j;
                    this.D = new wh4(this, this.D);
                }
                this.k.s(this.E, this.D, this.F);
                this.z = true;
                ih4 ih4Var = this.u;
                ih4Var.getClass();
                ih4Var.g(this);
                return;
            }
            ki4 ki4Var2 = ki4VarArr[i2];
            synchronized (ki4Var2) {
                ph4Var2 = ki4Var2.x ? null : ki4Var2.y;
            }
            if (ph4Var2 == null) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.nf1
    public final void v(cg1 cg1Var) {
        this.t.post(new ve4(this, cg1Var, 3));
    }

    public final void w() {
        xh4 xh4Var = new xh4(this, this.f, this.g, this.p, this, this.q);
        if (this.z) {
            zt0.b0(A());
            long j = this.E;
            if (j != -9223372036854775807L && this.N > j) {
                this.Q = true;
                this.N = -9223372036854775807L;
                return;
            }
            cg1 cg1Var = this.D;
            cg1Var.getClass();
            dg1 dg1Var = cg1Var.b(this.N).a;
            long j2 = this.N;
            xh4Var.f.a = dg1Var.b;
            xh4Var.i = j2;
            xh4Var.h = true;
            xh4Var.l = false;
            for (ki4 ki4Var : this.w) {
                ki4Var.s = this.N;
            }
            this.N = -9223372036854775807L;
        }
        this.P = x();
        t83 t83Var = this.o;
        t83Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        t83Var.i = null;
        yj4 yj4Var = new yj4(t83Var, looperMyLooper, xh4Var, this, SystemClock.elapsedRealtime());
        t83 t83Var2 = yj4Var.m;
        zt0.b0(((yj4) t83Var2.h) == null);
        t83Var2.h = yj4Var;
        yj4Var.b();
    }

    public final int x() {
        int i = 0;
        for (ki4 ki4Var : this.w) {
            i += ki4Var.p + ki4Var.o;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            ki4[] r3 = r6.w
            int r4 = r3.length
            if (r0 >= r4) goto L27
            if (r7 != 0) goto L17
            p21 r4 = r6.C
            r4.getClass()
            java.lang.Object r4 = r4.h
            boolean[] r4 = (boolean[]) r4
            boolean r4 = r4[r0]
            if (r4 == 0) goto L21
        L17:
            r3 = r3[r0]
            monitor-enter(r3)
            long r4 = r3.u     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r1 = java.lang.Math.max(r1, r4)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi4.y(boolean):long");
    }

    @Override // defpackage.nf1
    public final jg1 z(int i, int i2) {
        return t(new ai4(i, false));
    }

    @Override // defpackage.mi4
    public final void k(long j) {
    }
}
