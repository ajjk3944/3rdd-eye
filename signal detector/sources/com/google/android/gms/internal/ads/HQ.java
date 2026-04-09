package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class HQ implements InterfaceC1695pQ, InterfaceC2100x0, InterfaceC1829s {

    /* renamed from: c0, reason: collision with root package name */
    public static final Map f8921c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final TP f8922d0;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1641oQ f8924D;

    /* renamed from: E, reason: collision with root package name */
    public C2101x1 f8925E;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8929I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8930J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8931K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f8932L;
    public C2222zE M;

    /* renamed from: N, reason: collision with root package name */
    public L0 f8933N;

    /* renamed from: O, reason: collision with root package name */
    public long f8934O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8935P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f8937R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8938S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f8939T;

    /* renamed from: U, reason: collision with root package name */
    public int f8940U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f8941V;

    /* renamed from: W, reason: collision with root package name */
    public long f8942W;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f8944Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f8945Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8946a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f8947a0;

    /* renamed from: b, reason: collision with root package name */
    public final XD f8948b;
    public boolean b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1994v2 f8949c;

    /* renamed from: d, reason: collision with root package name */
    public final C2233zP f8950d;

    /* renamed from: e, reason: collision with root package name */
    public final C2233zP f8951e;

    /* renamed from: f, reason: collision with root package name */
    public final JQ f8952f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1292i f8953g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8954h;
    public final long i;

    /* renamed from: k, reason: collision with root package name */
    public final C2041vw f8956k;

    /* renamed from: j, reason: collision with root package name */
    public final C1338iu f8955j = new C1338iu(1);

    /* renamed from: l, reason: collision with root package name */
    public final C0494Em f8957l = new C0494Em();

    /* renamed from: m, reason: collision with root package name */
    public final EQ f8958m = new EQ(this, 2);

    /* renamed from: n, reason: collision with root package name */
    public final EQ f8959n = new EQ(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public final Handler f8923C = Vt.n();

    /* renamed from: H, reason: collision with root package name */
    public GQ[] f8928H = new GQ[0];

    /* renamed from: G, reason: collision with root package name */
    public LQ[] f8927G = new LQ[0];

    /* renamed from: F, reason: collision with root package name */
    public CQ[] f8926F = new CQ[0];

    /* renamed from: X, reason: collision with root package name */
    public long f8943X = -9223372036854775807L;

    /* renamed from: Q, reason: collision with root package name */
    public int f8936Q = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f8921c0 = Collections.unmodifiableMap(map);
        C1855sP c1855sP = new C1855sP();
        c1855sP.f16722a = "icy";
        c1855sP.e("application/x-icy");
        f8922d0 = new TP(c1855sP);
    }

    public HQ(Uri uri, XD xd, C2041vw c2041vw, C1994v2 c1994v2, C2233zP c2233zP, C2233zP c2233zP2, JQ jq, InterfaceC1292i interfaceC1292i, int i, long j6) {
        this.f8946a = uri;
        this.f8948b = xd;
        this.f8949c = c1994v2;
        this.f8951e = c2233zP;
        this.f8950d = c2233zP2;
        this.f8952f = jq;
        this.f8953g = interfaceC1292i;
        this.f8954h = i;
        this.f8956k = c2041vw;
        this.i = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public final void A(L0 l02) {
        this.f8923C.post(new NP(this, 2, l02));
    }

    public final void B() {
        AbstractC0582Jp.h0(this.f8930J);
        this.M.getClass();
        this.f8933N.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r12) {
        /*
            r11 = this;
            boolean r0 = r11.f8932L
            if (r0 == 0) goto L5
            goto L5d
        L5:
            r11.B()
            boolean r0 = r11.z()
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.zE r0 = r11.M
            java.lang.Object r0 = r0.f17840d
            boolean[] r0 = (boolean[]) r0
            com.google.android.gms.internal.ads.LQ[] r1 = r11.f8927G
            int r1 = r1.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L5d
            com.google.android.gms.internal.ads.LQ[] r3 = r11.f8927G
            r4 = r3[r2]
            boolean r3 = r0[r2]
            R0.d r10 = r4.f9702a
            monitor-enter(r4)
            int r5 = r4.f9715o     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L32
            long[] r6 = r4.f9713m     // Catch: java.lang.Throwable -> L3e
            r7 = r5
            int r5 = r4.f9717q     // Catch: java.lang.Throwable -> L3e
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L3e
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L34
        L32:
            r7 = r12
            goto L51
        L34:
            if (r3 == 0) goto L41
            int r3 = r4.f9718r     // Catch: java.lang.Throwable -> L3e
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
            r10.c(r12)
            int r2 = r2 + 1
            r12 = r7
            goto L18
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r12
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HQ.a(long):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long b(InterfaceC1020d[] interfaceC1020dArr, boolean[] zArr, MQ[] mqArr, boolean[] zArr2, long j6) throws Throwable {
        InterfaceC1020d interfaceC1020d;
        B();
        C2222zE c2222zE = this.M;
        SQ sq = (SQ) c2222zE.f17838b;
        boolean[] zArr3 = (boolean[]) c2222zE.f17840d;
        int i = this.f8940U;
        for (int i3 = 0; i3 < interfaceC1020dArr.length; i3++) {
            MQ mq = mqArr[i3];
            if (mq != null && (interfaceC1020dArr[i3] == null || !zArr[i3])) {
                int i6 = ((FQ) mq).f8125a;
                AbstractC0582Jp.h0(zArr3[i6]);
                this.f8940U--;
                zArr3[i6] = false;
                mqArr[i3] = null;
            }
        }
        boolean z6 = !this.f8937R ? j6 == 0 || this.f8932L : i != 0;
        for (int i7 = 0; i7 < interfaceC1020dArr.length; i7++) {
            if (mqArr[i7] == null && (interfaceC1020d = interfaceC1020dArr[i7]) != null) {
                AbstractC0582Jp.h0(interfaceC1020d.b() == 1);
                AbstractC0582Jp.h0(interfaceC1020d.t(0) == 0);
                int iIndexOf = sq.f11185b.indexOf(interfaceC1020d.a());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC0582Jp.h0(!zArr3[iIndexOf]);
                this.f8940U++;
                zArr3[iIndexOf] = true;
                this.f8939T = interfaceC1020d.f().f11403s | this.f8939T;
                mqArr[i7] = new FQ(this, iIndexOf);
                zArr2[i7] = true;
                if (!z6) {
                    LQ lq = this.f8927G[iIndexOf];
                    z6 = (lq.f9716p + lq.f9718r == 0 || lq.p(j6, true)) ? false : true;
                }
            }
        }
        if (this.f8940U == 0) {
            this.f8944Y = false;
            this.f8938S = false;
            this.f8939T = false;
            C1338iu c1338iu = this.f8955j;
            if (((r) c1338iu.f14823c) != null) {
                for (LQ lq2 : this.f8927G) {
                    lq2.r();
                }
                r rVar = (r) c1338iu.f14823c;
                rVar.getClass();
                rVar.a(false);
            } else {
                this.f8947a0 = false;
                for (LQ lq3 : this.f8927G) {
                    lq3.l(false);
                }
            }
        } else if (z6) {
            j6 = h(j6);
            for (int i8 = 0; i8 < mqArr.length; i8++) {
                if (mqArr[i8] != null) {
                    zArr2[i8] = true;
                }
            }
        }
        this.f8937R = true;
        return j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r26, com.google.android.gms.internal.ads.C2178yO r28) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HQ.c(long, com.google.android.gms.internal.ads.yO):long");
    }

    public final void d(DQ dq, boolean z6) {
        Uri uri = dq.f7770b.f14260b;
        C1319iQ c1319iQ = new C1319iQ();
        C1587nQ c1587nQ = new C1587nQ(-1, null, Vt.r(dq.i), Vt.r(this.f8934O));
        C2233zP c2233zP = this.f8950d;
        c2233zP.a(new C1910tQ(c2233zP, c1319iQ, c1587nQ, 1));
        if (z6) {
            return;
        }
        for (LQ lq : this.f8927G) {
            lq.l(false);
        }
        if (this.f8940U > 0) {
            InterfaceC1641oQ interfaceC1641oQ = this.f8924D;
            interfaceC1641oQ.getClass();
            interfaceC1641oQ.d(this);
        }
    }

    public final void e(DQ dq) {
        if (this.f8934O == -9223372036854775807L && this.f8933N != null) {
            long jY = y(true);
            long j6 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.f8934O = j6;
            this.f8952f.s(j6, this.f8933N, this.f8935P);
        }
        Uri uri = dq.f7770b.f14260b;
        C1319iQ c1319iQ = new C1319iQ();
        C1587nQ c1587nQ = new C1587nQ(-1, null, Vt.r(dq.i), Vt.r(this.f8934O));
        C2233zP c2233zP = this.f8950d;
        c2233zP.a(new C1910tQ(c2233zP, c1319iQ, c1587nQ, 0));
        this.f8947a0 = true;
        InterfaceC1641oQ interfaceC1641oQ = this.f8924D;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.d(this);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        if (this.f8947a0) {
            return false;
        }
        C1338iu c1338iu = this.f8955j;
        if (((IOException) c1338iu.f14824d) != null || this.f8944Y) {
            return false;
        }
        if (this.f8930J && this.f8940U == 0) {
            return false;
        }
        boolean zA = this.f8957l.a();
        if (((r) c1338iu.f14823c) != null) {
            return zA;
        }
        v();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long g() {
        if (this.f8939T) {
            this.f8939T = false;
        } else {
            if (!this.f8938S) {
                return -9223372036854775807L;
            }
            if (!this.f8947a0 && w() <= this.f8945Z) {
                return -9223372036854775807L;
            }
            this.f8938S = false;
        }
        return this.f8942W;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(long r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HQ.h(long):long");
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        long jY;
        boolean z6;
        B();
        if (this.f8947a0 || this.f8940U == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f8943X;
        }
        if (this.f8931K) {
            int length = this.f8927G.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C2222zE c2222zE = this.M;
                if (((boolean[]) c2222zE.f17839c)[i] && ((boolean[]) c2222zE.f17840d)[i]) {
                    LQ lq = this.f8927G[i];
                    synchronized (lq) {
                        z6 = lq.f9722v;
                    }
                    if (!z6) {
                        jY = Math.min(jY, this.f8927G[i].n());
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.f8942W : jY;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void k(InterfaceC1641oQ interfaceC1641oQ, long j6) {
        this.f8924D = interfaceC1641oQ;
        this.f8957l.a();
        v();
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final SQ m() {
        B();
        return (SQ) this.M.f17838b;
    }

    public final void n(int i) {
        B();
        C2222zE c2222zE = this.M;
        boolean[] zArr = (boolean[]) c2222zE.f17841e;
        if (zArr[i]) {
            return;
        }
        TP tp = ((SQ) c2222zE.f17838b).a(i).f17549d[0];
        C1587nQ c1587nQ = new C1587nQ(D4.f(tp.f11397m), tp, Vt.r(this.f8942W), -9223372036854775807L);
        C2233zP c2233zP = this.f8950d;
        c2233zP.a(new C1879sw(c2233zP, 13, c1587nQ));
        zArr[i] = true;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        boolean z6;
        if (((r) this.f8955j.f14823c) == null) {
            return false;
        }
        C0494Em c0494Em = this.f8957l;
        synchronized (c0494Em) {
            z6 = c0494Em.f8001a;
        }
        return z6;
    }

    public final void p(int i) {
        B();
        if (this.f8944Y) {
            if ((!this.f8931K || ((boolean[]) this.M.f17839c)[i]) && !this.f8927G[i].o(false)) {
                this.f8943X = 0L;
                this.f8944Y = false;
                this.f8938S = true;
                this.f8942W = 0L;
                this.f8945Z = 0;
                for (LQ lq : this.f8927G) {
                    lq.l(false);
                }
                InterfaceC1641oQ interfaceC1641oQ = this.f8924D;
                interfaceC1641oQ.getClass();
                interfaceC1641oQ.d(this);
            }
        }
    }

    public final boolean q() {
        return this.f8938S || z();
    }

    public final T0 r(GQ gq) {
        int length = this.f8927G.length;
        for (int i = 0; i < length; i++) {
            if (gq.equals(this.f8928H[i])) {
                return this.f8927G[i];
            }
        }
        if (this.f8929I) {
            int i3 = gq.f8386a;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i3);
            sb.append(") after finishing tracks.");
            AbstractC2022vd.v("ProgressiveMediaPeriod", sb.toString());
            return new C1938u0();
        }
        LQ lq = new LQ(this.f8953g, this.f8949c, this.f8951e);
        CQ cq = new CQ(lq);
        lq.f9706e = this;
        int i6 = length + 1;
        GQ[] gqArr = (GQ[]) Arrays.copyOf(this.f8928H, i6);
        gqArr[length] = gq;
        String str = Vt.f12096a;
        this.f8928H = gqArr;
        LQ[] lqArr = (LQ[]) Arrays.copyOf(this.f8927G, i6);
        lqArr[length] = lq;
        this.f8927G = lqArr;
        CQ[] cqArr = (CQ[]) Arrays.copyOf(this.f8926F, i6);
        cqArr[length] = cq;
        this.f8926F = cqArr;
        return cq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void s() throws IOException {
        IOException iOException;
        int i = this.f8936Q == 7 ? 6 : 3;
        C1338iu c1338iu = this.f8955j;
        IOException iOException2 = (IOException) c1338iu.f14824d;
        if (iOException2 != null) {
            throw iOException2;
        }
        r rVar = (r) c1338iu.f14823c;
        if (rVar != null && (iOException = rVar.f16436c) != null && rVar.f16437d > i) {
            throw iOException;
        }
        if (this.f8947a0 && !this.f8930J) {
            throw P4.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final void t() {
        int i;
        TP tp;
        long j6 = this.i;
        if (this.b0 || this.f8930J || !this.f8929I || this.f8933N == null) {
            return;
        }
        for (LQ lq : this.f8927G) {
            synchronized (lq) {
                tp = lq.f9724x ? null : lq.f9725y;
            }
            if (tp == null) {
                return;
            }
        }
        this.f8957l.b();
        int length = this.f8927G.length;
        C2108x8[] c2108x8Arr = new C2108x8[length];
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 < length; i3++) {
            TP tpM = this.f8927G[i3].m();
            tpM.getClass();
            String str = tpM.f11397m;
            boolean zA = D4.a(str);
            boolean z6 = zA || D4.b(str);
            zArr[i3] = z6;
            this.f8931K = z6 | this.f8931K;
            this.f8932L = j6 != -9223372036854775807L && length == 1 && D4.c(str);
            C2101x1 c2101x1 = this.f8925E;
            if (c2101x1 != null) {
                if (zA || this.f8928H[i3].f8387b) {
                    U3 u32 = tpM.f11395k;
                    U3 u33 = u32 == null ? new U3(c2101x1) : u32.c(c2101x1);
                    C1855sP c1855sP = new C1855sP(tpM);
                    c1855sP.f16730j = u33;
                    tpM = new TP(c1855sP);
                }
                if (zA && tpM.f11392g == -1 && tpM.f11393h == -1 && (i = c2101x1.f17532a) != -1) {
                    C1855sP c1855sP2 = new C1855sP(tpM);
                    c1855sP2.f16728g = i;
                    tpM = new TP(c1855sP2);
                }
            }
            this.f8949c.getClass();
            int i6 = tpM.f11401q != null ? 1 : 0;
            C1855sP c1855sP3 = new C1855sP(tpM);
            c1855sP3.f16721K = i6;
            TP tp2 = new TP(c1855sP3);
            c2108x8Arr[i3] = new C2108x8(Integer.toString(i3), tp2);
            this.f8939T = tp2.f11403s | this.f8939T;
        }
        this.M = new C2222zE(new SQ(c2108x8Arr), zArr);
        if (this.f8932L && this.f8934O == -9223372036854775807L) {
            this.f8934O = j6;
            this.f8933N = new AQ(this, this.f8933N);
        }
        this.f8952f.s(this.f8934O, this.f8933N, this.f8935P);
        this.f8930J = true;
        InterfaceC1641oQ interfaceC1641oQ = this.f8924D;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.e(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public final void u() {
        this.f8929I = true;
        this.f8923C.post(this.f8958m);
    }

    public final void v() {
        DQ dq = new DQ(this, this.f8946a, this.f8948b, this.f8956k, this, this.f8957l);
        if (this.f8930J) {
            AbstractC0582Jp.h0(z());
            long j6 = this.f8934O;
            if (j6 != -9223372036854775807L && this.f8943X > j6) {
                this.f8947a0 = true;
                this.f8943X = -9223372036854775807L;
                return;
            }
            L0 l02 = this.f8933N;
            l02.getClass();
            M0 m02 = l02.i(this.f8943X).f9416a;
            long j7 = this.f8943X;
            dq.f7774f.f6910a = m02.f9792b;
            dq.i = j7;
            dq.f7776h = true;
            dq.f7779l = false;
            for (LQ lq : this.f8927G) {
                lq.f9719s = this.f8943X;
            }
            this.f8943X = -9223372036854775807L;
        }
        this.f8945Z = w();
        C1338iu c1338iu = this.f8955j;
        c1338iu.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        c1338iu.f14824d = null;
        r rVar = new r(c1338iu, looperMyLooper, dq, this, SystemClock.elapsedRealtime());
        C1338iu c1338iu2 = rVar.f16441h;
        AbstractC0582Jp.h0(((r) c1338iu2.f14823c) == null);
        c1338iu2.f14823c = rVar;
        rVar.b();
    }

    public final int w() {
        int i = 0;
        for (LQ lq : this.f8927G) {
            i += lq.f9716p + lq.f9715o;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2100x0
    public final T0 x(int i, int i3) {
        return r(new GQ(i, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long y(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.LQ[] r3 = r5.f8927G
            int r4 = r3.length
            if (r0 >= r4) goto L24
            if (r6 != 0) goto L17
            com.google.android.gms.internal.ads.zE r4 = r5.M
            r4.getClass()
            java.lang.Object r4 = r4.f17840d
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.HQ.y(boolean):long");
    }

    public final boolean z() {
        return this.f8943X != -9223372036854775807L;
    }
}
