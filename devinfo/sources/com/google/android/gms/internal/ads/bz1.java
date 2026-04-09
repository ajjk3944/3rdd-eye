package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bz1 implements iy1, z1, r {
    public static final Map O;
    public static final mx1 P;
    public long A;
    public boolean B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public long I;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9861a;

    /* renamed from: b, reason: collision with root package name */
    public final l91 f9862b;

    /* renamed from: c, reason: collision with root package name */
    public final w5 f9863c;

    /* renamed from: d, reason: collision with root package name */
    public final l90 f9864d;

    /* renamed from: e, reason: collision with root package name */
    public final ce1 f9865e;

    /* renamed from: f, reason: collision with root package name */
    public final ez1 f9866f;
    public final i g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9867h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9868i;

    /* renamed from: k, reason: collision with root package name */
    public final av0 f9869k;

    /* renamed from: p, reason: collision with root package name */
    public hy1 f9874p;

    /* renamed from: q, reason: collision with root package name */
    public y3 f9875q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9879u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9880v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9881w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9882x;

    /* renamed from: y, reason: collision with root package name */
    public oa1 f9883y;

    /* renamed from: z, reason: collision with root package name */
    public m2 f9884z;
    public final pq0 j = new pq0(1);

    /* renamed from: l, reason: collision with root package name */
    public final za0 f9870l = new za0();

    /* renamed from: m, reason: collision with root package name */
    public final yy1 f9871m = new yy1(this, 2);

    /* renamed from: n, reason: collision with root package name */
    public final yy1 f9872n = new yy1(this, 0);

    /* renamed from: o, reason: collision with root package name */
    public final Handler f9873o = bq0.n();

    /* renamed from: t, reason: collision with root package name */
    public az1[] f9878t = new az1[0];

    /* renamed from: s, reason: collision with root package name */
    public hz1[] f9877s = new hz1[0];

    /* renamed from: r, reason: collision with root package name */
    public wy1[] f9876r = new wy1[0];
    public long J = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        O = DesugarCollections.unmodifiableMap(map);
        lw1 lw1Var = new lw1();
        lw1Var.f13652a = "icy";
        lw1Var.e("application/x-icy");
        P = new mx1(lw1Var);
    }

    public bz1(Uri uri, l91 l91Var, av0 av0Var, w5 w5Var, ce1 ce1Var, l90 l90Var, ez1 ez1Var, i iVar, int i4, long j) {
        this.f9861a = uri;
        this.f9862b = l91Var;
        this.f9863c = w5Var;
        this.f9865e = ce1Var;
        this.f9864d = l90Var;
        this.f9866f = ez1Var;
        this.g = iVar;
        this.f9867h = i4;
        this.f9869k = av0Var;
        this.f9868i = j;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long B1() {
        return C1();
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final long C1() {
        long jV;
        boolean z3;
        x();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.J;
        }
        if (this.f9881w) {
            int length = this.f9877s.length;
            jV = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                oa1 oa1Var = this.f9883y;
                if (((boolean[]) oa1Var.f14635c)[i4] && ((boolean[]) oa1Var.f14636d)[i4]) {
                    hz1 hz1Var = this.f9877s[i4];
                    synchronized (hz1Var) {
                        z3 = hz1Var.f12060v;
                    }
                    if (!z3) {
                        jV = Math.min(jV, this.f9877s[i4].n());
                    }
                }
            }
        } else {
            jV = Long.MAX_VALUE;
        }
        if (jV == Long.MAX_VALUE) {
            jV = v(false);
        }
        return jV == Long.MIN_VALUE ? this.I : jV;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean G1() {
        boolean z3;
        if (((q) this.j.f15074c) == null) {
            return false;
        }
        za0 za0Var = this.f9870l;
        synchronized (za0Var) {
            z3 = za0Var.f19049a;
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.iy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.f9882x
            if (r0 == 0) goto L5
            goto L5d
        L5:
            r11.x()
            boolean r0 = r11.w()
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.oa1 r0 = r11.f9883y
            java.lang.Object r0 = r0.f14636d
            boolean[] r0 = (boolean[]) r0
            com.google.android.gms.internal.ads.hz1[] r1 = r11.f9877s
            int r1 = r1.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L5d
            com.google.android.gms.internal.ads.hz1[] r3 = r11.f9877s
            r4 = r3[r2]
            boolean r3 = r0[r2]
            com.google.android.gms.internal.ads.fz1 r10 = r4.f12041a
            monitor-enter(r4)
            int r5 = r4.f12053o     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L32
            long[] r6 = r4.f12051m     // Catch: java.lang.Throwable -> L3e
            r7 = r5
            int r5 = r4.f12055q     // Catch: java.lang.Throwable -> L3e
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3e
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L34
        L32:
            r7 = r12
            goto L51
        L34:
            if (r3 == 0) goto L41
            int r3 = r4.f12056r     // Catch: java.lang.Throwable -> L3e
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
            int r12 = r4.i(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3e
            r13 = -1
            if (r12 == r13) goto L51
            long r12 = r4.j(r12)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r4)
            goto L54
        L51:
            monitor-exit(r4)
            r12 = -1
        L54:
            r10.b(r12)
            int r2 = r2 + 1
            r12 = r7
            goto L18
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bz1.a(long):void");
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long b(d[] dVarArr, boolean[] zArr, iz1[] iz1VarArr, boolean[] zArr2, long j) {
        d dVar;
        x();
        oa1 oa1Var = this.f9883y;
        oz1 oz1Var = (oz1) oa1Var.f14634b;
        boolean[] zArr3 = (boolean[]) oa1Var.f14636d;
        int i4 = this.G;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            iz1 iz1Var = iz1VarArr[i10];
            if (iz1Var != null && (dVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((zy1) iz1Var).f19235a;
                mq0.c0(zArr3[i11]);
                this.G--;
                zArr3[i11] = false;
                iz1VarArr[i10] = null;
            }
        }
        boolean z3 = !this.D ? j == 0 || this.f9882x : i4 != 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            if (iz1VarArr[i12] == null && (dVar = dVarArr[i12]) != null) {
                mq0.c0(dVar.c() == 1);
                mq0.c0(dVar.K1(0) == 0);
                int iIndexOf = oz1Var.f14821b.indexOf(dVar.b());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                mq0.c0(!zArr3[iIndexOf]);
                this.G++;
                zArr3[iIndexOf] = true;
                this.F = dVar.zzc().f14058s | this.F;
                iz1VarArr[i12] = new zy1(this, iIndexOf);
                zArr2[i12] = true;
                if (!z3) {
                    hz1 hz1Var = this.f9877s[iIndexOf];
                    z3 = (hz1Var.f12054p + hz1Var.f12056r == 0 || hz1Var.p(j, true)) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.E = false;
            this.F = false;
            pq0 pq0Var = this.j;
            if (((q) pq0Var.f15074c) != null) {
                for (hz1 hz1Var2 : this.f9877s) {
                    hz1Var2.r();
                }
                q qVar = (q) pq0Var.f15074c;
                qVar.getClass();
                qVar.a(false);
            } else {
                this.M = false;
                for (hz1 hz1Var3 : this.f9877s) {
                    hz1Var3.l(false);
                }
            }
        } else if (z3) {
            j = j(j);
            for (int i13 = 0; i13 < iz1VarArr.length; i13++) {
                if (iz1VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.D = true;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.iy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r26, com.google.android.gms.internal.ads.nu1 r28) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bz1.c(long, com.google.android.gms.internal.ads.nu1):long");
    }

    public final void d(xy1 xy1Var, boolean z3) {
        Uri uri = xy1Var.f18574b.f16880b;
        cy1 cy1Var = new cy1();
        long j = xy1Var.f18580i;
        long j8 = this.A;
        l90 l90Var = this.f9864d;
        l90Var.z(new my1(l90Var, cy1Var, new a0.c0(-1, null, bq0.r(j), bq0.r(j8)), 1));
        if (z3) {
            return;
        }
        for (hz1 hz1Var : this.f9877s) {
            hz1Var.l(false);
        }
        if (this.G > 0) {
            hy1 hy1Var = this.f9874p;
            hy1Var.getClass();
            hy1Var.d(this);
        }
    }

    public final void e(xy1 xy1Var) {
        if (this.A == -9223372036854775807L && this.f9884z != null) {
            long jV = v(true);
            long j = jV == Long.MIN_VALUE ? 0L : jV + 10000;
            this.A = j;
            this.f9866f.s(j, this.f9884z, this.B);
        }
        Uri uri = xy1Var.f18574b.f16880b;
        cy1 cy1Var = new cy1();
        long j8 = xy1Var.f18580i;
        long j9 = this.A;
        l90 l90Var = this.f9864d;
        l90Var.z(new my1(l90Var, cy1Var, new a0.c0(-1, null, bq0.r(j8), bq0.r(j9)), 0));
        this.M = true;
        hy1 hy1Var = this.f9874p;
        hy1Var.getClass();
        hy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final oz1 f() {
        x();
        return (oz1) this.f9883y.f14634b;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final boolean g(rt1 rt1Var) {
        if (this.M) {
            return false;
        }
        pq0 pq0Var = this.j;
        if (((IOException) pq0Var.f15075d) != null || this.K) {
            return false;
        }
        if (this.f9880v && this.G == 0) {
            return false;
        }
        boolean zA = this.f9870l.a();
        if (((q) pq0Var.f15074c) != null) {
            return zA;
        }
        t();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void h() throws IOException {
        IOException iOException;
        int i4 = this.C == 7 ? 6 : 3;
        pq0 pq0Var = this.j;
        IOException iOException2 = (IOException) pq0Var.f15075d;
        if (iOException2 != null) {
            throw iOException2;
        }
        q qVar = (q) pq0Var.f15074c;
        if (qVar != null && (iOException = qVar.f15161c) != null && qVar.f15162d > i4) {
            throw iOException;
        }
        if (this.M && !this.f9880v) {
            throw ua.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void i() {
        this.f9879u = true;
        this.f9873o.post(this.f9871m);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    @Override // com.google.android.gms.internal.ads.iy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(long r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bz1.j(long):long");
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final void k(hy1 hy1Var, long j) {
        this.f9874p = hy1Var;
        this.f9870l.a();
        t();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final u2 m(int i4, int i10) {
        return r(new az1(i4, false));
    }

    public final void n(int i4) {
        x();
        oa1 oa1Var = this.f9883y;
        boolean[] zArr = (boolean[]) oa1Var.f14637e;
        if (zArr[i4]) {
            return;
        }
        mx1 mx1Var = ((oz1) oa1Var.f14634b).a(i4).f12340d[0];
        a0.c0 c0Var = new a0.c0(ia.f(mx1Var.f14052m), mx1Var, bq0.r(this.I), -9223372036854775807L);
        l90 l90Var = this.f9864d;
        l90Var.z(new zu1(l90Var, c0Var));
        zArr[i4] = true;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void o(m2 m2Var) {
        this.f9873o.post(new ny1(1, this, m2Var));
    }

    public final void p(int i4) {
        x();
        if (this.K) {
            if ((!this.f9881w || ((boolean[]) this.f9883y.f14635c)[i4]) && !this.f9877s[i4].o(false)) {
                this.J = 0L;
                this.K = false;
                this.E = true;
                this.I = 0L;
                this.L = 0;
                for (hz1 hz1Var : this.f9877s) {
                    hz1Var.l(false);
                }
                hy1 hy1Var = this.f9874p;
                hy1Var.getClass();
                hy1Var.d(this);
            }
        }
    }

    public final boolean q() {
        return this.E || w();
    }

    public final u2 r(az1 az1Var) {
        int length = this.f9877s.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (az1Var.equals(this.f9878t[i4])) {
                return this.f9877s[i4];
            }
        }
        if (this.f9879u) {
            int i10 = az1Var.f9503a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i10);
            sb2.append(") after finishing tracks.");
            ls.t("ProgressiveMediaPeriod", sb2.toString());
            return new w1();
        }
        hz1 hz1Var = new hz1(this.g, this.f9863c, this.f9865e);
        wy1 wy1Var = new wy1(hz1Var);
        hz1Var.f12045e = this;
        int i11 = length + 1;
        az1[] az1VarArr = (az1[]) Arrays.copyOf(this.f9878t, i11);
        az1VarArr[length] = az1Var;
        String str = bq0.f9768a;
        this.f9878t = az1VarArr;
        hz1[] hz1VarArr = (hz1[]) Arrays.copyOf(this.f9877s, i11);
        hz1VarArr[length] = hz1Var;
        this.f9877s = hz1VarArr;
        wy1[] wy1VarArr = (wy1[]) Arrays.copyOf(this.f9876r, i11);
        wy1VarArr[length] = wy1Var;
        this.f9876r = wy1VarArr;
        return wy1Var;
    }

    public final void s() {
        int i4;
        mx1 mx1Var;
        long j = this.f9868i;
        if (this.N || this.f9880v || !this.f9879u || this.f9884z == null) {
            return;
        }
        for (hz1 hz1Var : this.f9877s) {
            synchronized (hz1Var) {
                mx1Var = hz1Var.f12062x ? null : hz1Var.f12063y;
            }
            if (mx1Var == null) {
                return;
            }
        }
        this.f9870l.b();
        int length = this.f9877s.length;
        ii[] iiVarArr = new ii[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            mx1 mx1VarM = this.f9877s[i10].m();
            mx1VarM.getClass();
            String str = mx1VarM.f14052m;
            boolean zA = ia.a(str);
            boolean z3 = zA || ia.b(str);
            zArr[i10] = z3;
            this.f9881w = z3 | this.f9881w;
            this.f9882x = j != -9223372036854775807L && length == 1 && ia.c(str);
            y3 y3Var = this.f9875q;
            if (y3Var != null) {
                if (zA || this.f9878t[i10].f9504b) {
                    v8 v8Var = mx1VarM.f14050k;
                    v8 v8Var2 = v8Var == null ? new v8(y3Var) : v8Var.c(y3Var);
                    lw1 lw1Var = new lw1(mx1VarM);
                    lw1Var.j = v8Var2;
                    mx1VarM = new mx1(lw1Var);
                }
                if (zA && mx1VarM.g == -1 && mx1VarM.f14048h == -1 && (i4 = y3Var.f18615a) != -1) {
                    lw1 lw1Var2 = new lw1(mx1VarM);
                    lw1Var2.g = i4;
                    mx1VarM = new mx1(lw1Var2);
                }
            }
            this.f9863c.getClass();
            int i11 = mx1VarM.f14056q != null ? 1 : 0;
            lw1 lw1Var3 = new lw1(mx1VarM);
            lw1Var3.K = i11;
            mx1 mx1Var2 = new mx1(lw1Var3);
            iiVarArr[i10] = new ii(Integer.toString(i10), mx1Var2);
            this.F = mx1Var2.f14058s | this.F;
        }
        this.f9883y = new oa1(new oz1(iiVarArr), zArr);
        if (this.f9882x && this.A == -9223372036854775807L) {
            this.A = j;
            this.f9884z = new uy1(this, this.f9884z);
        }
        this.f9866f.s(this.A, this.f9884z, this.B);
        this.f9880v = true;
        hy1 hy1Var = this.f9874p;
        hy1Var.getClass();
        hy1Var.e(this);
    }

    public final void t() {
        xy1 xy1Var = new xy1(this, this.f9861a, this.f9862b, this.f9869k, this, this.f9870l);
        if (this.f9880v) {
            mq0.c0(w());
            long j = this.A;
            if (j != -9223372036854775807L && this.J > j) {
                this.M = true;
                this.J = -9223372036854775807L;
                return;
            }
            m2 m2Var = this.f9884z;
            m2Var.getClass();
            n2 n2Var = m2Var.g(this.J).f13331a;
            long j8 = this.J;
            xy1Var.f18578f.f9923a = n2Var.f14131b;
            xy1Var.f18580i = j8;
            xy1Var.f18579h = true;
            xy1Var.f18582l = false;
            for (hz1 hz1Var : this.f9877s) {
                hz1Var.f12057s = this.J;
            }
            this.J = -9223372036854775807L;
        }
        this.L = u();
        pq0 pq0Var = this.j;
        pq0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        pq0Var.f15075d = null;
        q qVar = new q(pq0Var, looperMyLooper, xy1Var, this, SystemClock.elapsedRealtime());
        pq0 pq0Var2 = qVar.f15165h;
        mq0.c0(((q) pq0Var2.f15074c) == null);
        pq0Var2.f15074c = qVar;
        qVar.b();
    }

    public final int u() {
        int i4 = 0;
        for (hz1 hz1Var : this.f9877s) {
            i4 += hz1Var.f12054p + hz1Var.f12053o;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long v(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.hz1[] r3 = r5.f9877s
            int r4 = r3.length
            if (r0 >= r4) goto L24
            if (r6 != 0) goto L17
            com.google.android.gms.internal.ads.oa1 r4 = r5.f9883y
            r4.getClass()
            java.lang.Object r4 = r4.f14636d
            boolean[] r4 = (boolean[]) r4
            boolean r4 = r4[r0]
            if (r4 == 0) goto L21
        L17:
            r3 = r3[r0]
            long r3 = r3.n()
            long r1 = java.lang.Math.max(r1, r3)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bz1.v(boolean):long");
    }

    public final boolean w() {
        return this.J != -9223372036854775807L;
    }

    public final void x() {
        mq0.c0(this.f9880v);
        this.f9883y.getClass();
        this.f9884z.getClass();
    }

    @Override // com.google.android.gms.internal.ads.iy1
    public final long z1() {
        if (this.F) {
            this.F = false;
        } else {
            if (!this.E) {
                return -9223372036854775807L;
            }
            if (!this.M && u() <= this.L) {
                return -9223372036854775807L;
            }
            this.E = false;
        }
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final void l(long j) {
    }
}
