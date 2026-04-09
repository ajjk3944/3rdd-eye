package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class PP implements InterfaceC1854sO {

    /* renamed from: O0, reason: collision with root package name */
    public static final byte[] f10358O0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0, reason: collision with root package name */
    public boolean f10359A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f10360B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10361C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f10362C0;

    /* renamed from: D0, reason: collision with root package name */
    public long f10364D0;

    /* renamed from: E, reason: collision with root package name */
    public C1749qQ f10365E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10366E0;

    /* renamed from: F, reason: collision with root package name */
    public C0911b f10367F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f10368F0;

    /* renamed from: G, reason: collision with root package name */
    public final C2181ya f10369G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f10370G0;

    /* renamed from: H, reason: collision with root package name */
    public final EO f10371H;

    /* renamed from: H0, reason: collision with root package name */
    public BN f10372H0;

    /* renamed from: I, reason: collision with root package name */
    public final float f10373I;

    /* renamed from: I0, reason: collision with root package name */
    public OP f10374I0;

    /* renamed from: J, reason: collision with root package name */
    public final FM f10375J;

    /* renamed from: J0, reason: collision with root package name */
    public long f10376J0;

    /* renamed from: K, reason: collision with root package name */
    public final FM f10377K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f10378K0;

    /* renamed from: L, reason: collision with root package name */
    public final FM f10379L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f10380L0;
    public final HP M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f10381M0;

    /* renamed from: N, reason: collision with root package name */
    public final MediaCodec.BufferInfo f10382N;

    /* renamed from: N0, reason: collision with root package name */
    public long f10383N0;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayDeque f10384O;

    /* renamed from: P, reason: collision with root package name */
    public final W1 f10385P;

    /* renamed from: Q, reason: collision with root package name */
    public final AtomicInteger f10386Q;

    /* renamed from: R, reason: collision with root package name */
    public TP f10387R;

    /* renamed from: S, reason: collision with root package name */
    public TP f10388S;

    /* renamed from: T, reason: collision with root package name */
    public C2255zu f10389T;

    /* renamed from: U, reason: collision with root package name */
    public C2255zu f10390U;

    /* renamed from: V, reason: collision with root package name */
    public VN f10391V;

    /* renamed from: W, reason: collision with root package name */
    public final long f10392W;

    /* renamed from: X, reason: collision with root package name */
    public float f10393X;

    /* renamed from: Y, reason: collision with root package name */
    public float f10394Y;

    /* renamed from: Z, reason: collision with root package name */
    public JP f10395Z;

    /* renamed from: a0, reason: collision with root package name */
    public TP f10397a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f10398b;
    public MediaFormat b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10400c0;

    /* renamed from: d, reason: collision with root package name */
    public C2070wO f10401d;

    /* renamed from: d0, reason: collision with root package name */
    public float f10402d0;

    /* renamed from: e, reason: collision with root package name */
    public int f10403e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayDeque f10404e0;

    /* renamed from: f, reason: collision with root package name */
    public MO f10405f;

    /* renamed from: f0, reason: collision with root package name */
    public MP f10406f0;

    /* renamed from: g, reason: collision with root package name */
    public C1994v2 f10407g;

    /* renamed from: g0, reason: collision with root package name */
    public LP f10408g0;

    /* renamed from: h, reason: collision with root package name */
    public int f10409h;

    /* renamed from: h0, reason: collision with root package name */
    public int f10410h0;
    public MQ i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f10411i0;

    /* renamed from: j, reason: collision with root package name */
    public TP[] f10412j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f10413j0;

    /* renamed from: k, reason: collision with root package name */
    public long f10414k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f10415k0;

    /* renamed from: l, reason: collision with root package name */
    public long f10416l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f10417l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f10419m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10420n;

    /* renamed from: n0, reason: collision with root package name */
    public long f10421n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f10422o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f10423p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f10424q0;

    /* renamed from: r0, reason: collision with root package name */
    public ByteBuffer f10425r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f10426s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f10427t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f10428u0;
    public boolean v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f10429w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f10430x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f10431y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f10432z0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10396a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final C1879sw f10399c = new C1879sw(8, false);

    /* renamed from: m, reason: collision with root package name */
    public long f10418m = Long.MIN_VALUE;

    /* renamed from: D, reason: collision with root package name */
    public AbstractC1353j8 f10363D = AbstractC1353j8.f14909a;

    public PP(int i, C2181ya c2181ya, EO eo, float f2) {
        this.f10398b = i;
        this.f10369G = c2181ya;
        eo.getClass();
        this.f10371H = eo;
        this.f10373I = f2;
        this.f10386Q = new AtomicInteger();
        this.f10375J = new FM(0);
        this.f10377K = new FM(0);
        this.f10379L = new FM(2);
        HP hp = new HP(2);
        hp.f8920l = 32;
        this.M = hp;
        this.f10382N = new MediaCodec.BufferInfo();
        this.f10393X = 1.0f;
        this.f10394Y = 1.0f;
        this.f10392W = -9223372036854775807L;
        this.f10384O = new ArrayDeque();
        this.f10374I0 = OP.f10193f;
        hp.p(0);
        hp.f8093e.order(ByteOrder.nativeOrder());
        W1 w12 = new W1();
        w12.f12143c = InterfaceC0812Xh.f12436a;
        w12.f12142b = 0;
        w12.f12141a = 2;
        this.f10385P = w12;
        this.f10402d0 = -1.0f;
        this.f10410h0 = 0;
        this.f10430x0 = 0;
        this.f10423p0 = -1;
        this.f10424q0 = -1;
        this.f10422o0 = -9223372036854775807L;
        this.f10364D0 = -9223372036854775807L;
        this.f10376J0 = -9223372036854775807L;
        this.f10421n0 = -9223372036854775807L;
        this.f10431y0 = 0;
        this.f10432z0 = 0;
        this.f10372H0 = new BN();
        this.f10381M0 = false;
        this.f10383N0 = 0L;
    }

    public void A() {
        this.f10423p0 = -1;
        this.f10377K.f8093e = null;
        this.f10424q0 = -1;
        this.f10425r0 = null;
        this.f10364D0 = -9223372036854775807L;
        i0().f10198e = -9223372036854775807L;
        this.f10376J0 = -9223372036854775807L;
        this.f10422o0 = -9223372036854775807L;
        this.f10360B0 = false;
        this.f10421n0 = -9223372036854775807L;
        this.f10359A0 = false;
        this.f10415k0 = false;
        this.f10417l0 = false;
        this.f10426s0 = false;
        this.f10431y0 = 0;
        this.f10432z0 = 0;
        this.f10430x0 = this.f10429w0 ? 1 : 0;
        this.f10381M0 = false;
        this.f10383N0 = 0L;
    }

    public final void B() {
        A();
        this.f10404e0 = null;
        this.f10408g0 = null;
        this.f10397a0 = null;
        this.b0 = null;
        this.f10400c0 = false;
        this.f10362C0 = false;
        this.f10402d0 = -1.0f;
        this.f10410h0 = 0;
        this.f10411i0 = false;
        this.f10413j0 = false;
        this.f10419m0 = false;
        this.f10429w0 = false;
        this.f10430x0 = 0;
    }

    public KP C(IllegalStateException illegalStateException, LP lp) {
        return new KP(illegalStateException, lp);
    }

    public void E(FM fm) {
    }

    public int F(FM fm) {
        return 0;
    }

    public boolean G(FM fm) {
        return false;
    }

    public void H(long j6) {
        this.f10376J0 = j6;
        while (true) {
            ArrayDeque arrayDeque = this.f10384O;
            if (arrayDeque.isEmpty() || j6 < ((OP) arrayDeque.peek()).f10194a) {
                return;
            }
            OP op = (OP) arrayDeque.poll();
            op.getClass();
            h0(op);
            W();
        }
    }

    public final int I(TP tp) throws HN {
        try {
            return J(this.f10371H, tp);
        } catch (RP e6) {
            throw m(e6, tp, false, 4002);
        }
    }

    public abstract int J(EO eo, TP tp);

    public final void K(long j6, boolean z6, boolean z7) {
        this.f10420n = false;
        this.f10416l = j6;
        this.f10418m = j6;
        if (!z7) {
            MQ mq = this.i;
            mq.getClass();
            z7 = mq.g(j6 - this.f10414k) != 0;
        }
        a(j6, z6, z7);
    }

    public abstract ArrayList L(EO eo, TP tp);

    public boolean M(TP tp) {
        return false;
    }

    public abstract C1726q3 N(LP lp, TP tp, float f2);

    public abstract CN O(LP lp, TP tp, TP tp2);

    public long P(long j6, long j7) {
        if (this.f10409h == 1) {
            return (t() || u()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public abstract float Q(float f2, TP tp, TP[] tpArr);

    public abstract void R(long j6, long j7, String str);

    public abstract void S(String str);

    public abstract void T(Exception exc);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.CN U(com.google.android.gms.internal.ads.C1879sw r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PP.U(com.google.android.gms.internal.ads.sw):com.google.android.gms.internal.ads.CN");
    }

    public abstract void V(TP tp, MediaFormat mediaFormat);

    public abstract void W();

    public abstract boolean X(long j6, long j7, JP jp, ByteBuffer byteBuffer, int i, int i3, int i6, long j8, boolean z6, boolean z7, TP tp);

    public abstract void Y();

    public abstract void Z(FM fm);

    public void a(long j6, boolean z6, boolean z7) {
        ArrayDeque arrayDeque = this.f10384O;
        if (!arrayDeque.isEmpty()) {
            this.f10374I0 = (OP) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z7) {
            this.f10366E0 = false;
            this.f10368F0 = false;
            if (this.f10427t0) {
                a0();
            } else if (this.f10395Z != null) {
                if (y()) {
                    x();
                    v();
                } else if (z()) {
                    b0();
                } else {
                    this.f10381M0 = true;
                }
            }
            M3.o oVar = this.f10374I0.f10197d;
            if (oVar.e() > 0) {
                this.f10370G0 = true;
            }
            oVar.d();
        }
    }

    public final void a0() {
        this.f10364D0 = -9223372036854775807L;
        i0().f10198e = -9223372036854775807L;
        this.f10376J0 = -9223372036854775807L;
        this.v0 = false;
        this.M.o();
        this.f10379L.o();
        this.f10428u0 = false;
        W1 w12 = this.f10385P;
        w12.getClass();
        w12.f12143c = InterfaceC0812Xh.f12436a;
        w12.f12142b = 0;
        w12.f12141a = 2;
    }

    public final void b0() {
        try {
            JP jp = this.f10395Z;
            if (jp == null) {
                throw null;
            }
            jp.k();
        } finally {
            A();
        }
    }

    public final boolean c0(int i) throws HN, MP {
        C1879sw c1879sw = this.f10399c;
        c1879sw.f16823b = null;
        c1879sw.f16824c = null;
        FM fm = this.f10375J;
        fm.o();
        int iN = n(c1879sw, fm, i | 4);
        if (iN == -5) {
            U(c1879sw);
            return true;
        }
        if (iN != -4 || !fm.n(4)) {
            return false;
        }
        this.f10366E0 = true;
        g0();
        return false;
    }

    public abstract void d();

    public final boolean d0(TP tp) throws HN, MP {
        if (this.f10395Z != null && this.f10432z0 != 3 && this.f10409h != 0) {
            float f2 = this.f10394Y;
            tp.getClass();
            TP[] tpArr = this.f10412j;
            tpArr.getClass();
            float fQ = Q(f2, tp, tpArr);
            float f5 = this.f10402d0;
            if (f5 != fQ) {
                if (fQ == -1.0f) {
                    f0();
                    return false;
                }
                if (f5 != -1.0f || fQ > this.f10373I) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fQ);
                    JP jp = this.f10395Z;
                    jp.getClass();
                    jp.g(bundle);
                    this.f10402d0 = fQ;
                }
            }
        }
        return true;
    }

    public final boolean e0() {
        if (this.f10359A0) {
            this.f10431y0 = 1;
            if (this.f10413j0) {
                this.f10432z0 = 3;
                return false;
            }
            this.f10432z0 = 2;
            return true;
        }
        C2255zu c2255zu = this.f10390U;
        c2255zu.getClass();
        this.f10389T = c2255zu;
        this.f10431y0 = 0;
        this.f10432z0 = 0;
        return true;
    }

    public abstract void f();

    public final void f0() throws HN, MP {
        if (this.f10359A0) {
            this.f10431y0 = 1;
            this.f10432z0 = 3;
        } else {
            x();
            v();
        }
    }

    public final void g0() throws HN, MP {
        int i = this.f10432z0;
        if (i == 1) {
            b0();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                this.f10368F0 = true;
                Y();
                return;
            } else {
                x();
                v();
                return;
            }
        }
        b0();
        C2255zu c2255zu = this.f10390U;
        c2255zu.getClass();
        this.f10389T = c2255zu;
        this.f10431y0 = 0;
        this.f10432z0 = 0;
    }

    public final void h0(OP op) {
        this.f10374I0 = op;
        if (op.f10196c != -9223372036854775807L) {
            this.f10378K0 = true;
        }
    }

    public void i() {
        this.f10387R = null;
        h0(OP.f10193f);
        this.f10384O.clear();
        if (this.f10427t0) {
            this.f10427t0 = false;
            a0();
        } else {
            if (this.f10395Z == null) {
                return;
            }
            if (y()) {
                x();
            } else if (z()) {
                b0();
            } else {
                this.f10381M0 = true;
            }
        }
    }

    public final OP i0() {
        ArrayDeque arrayDeque = this.f10384O;
        return !arrayDeque.isEmpty() ? (OP) arrayDeque.getLast() : this.f10374I0;
    }

    public abstract void j();

    public final boolean j0(long j6, long j7) {
        if (j7 >= j6) {
            return false;
        }
        TP tp = this.f10388S;
        return tp == null || !Objects.equals(tp.f11397m, "audio/opus") || j6 - j7 > 80000;
    }

    public abstract void k();

    public final void k0(TP[] tpArr, MQ mq, long j6, long j7, C1749qQ c1749qQ) {
        AbstractC0582Jp.h0(!this.f10420n);
        this.i = mq;
        this.f10365E = c1749qQ;
        if (this.f10418m == Long.MIN_VALUE) {
            this.f10418m = j6;
        }
        this.f10412j = tpArr;
        this.f10414k = j7;
        p0(tpArr, j6, j7, c1749qQ);
    }

    public final void l() {
        this.f10401d.getClass();
    }

    public final boolean l0() {
        return this.f10418m == Long.MIN_VALUE;
    }

    public final HN m(Exception exc, TP tp, boolean z6, int i) {
        int I6;
        if (tp == null || this.f10361C) {
            I6 = 4;
        } else {
            this.f10361C = true;
            try {
                I6 = I(tp) & 7;
            } catch (HN unused) {
            } finally {
                this.f10361C = false;
            }
        }
        return new HN(1, exc, i, o(), this.f10403e, tp, tp == null ? 4 : I6, this.f10365E, z6);
    }

    public InterfaceC1099eO m0() {
        return null;
    }

    public final int n(C1879sw c1879sw, FM fm, int i) {
        MQ mq = this.i;
        mq.getClass();
        int iA = mq.a(c1879sw, fm, i);
        if (iA == -4) {
            if (fm.n(4)) {
                this.f10418m = Long.MIN_VALUE;
                return this.f10420n ? -4 : -3;
            }
            long j6 = fm.f8095g + this.f10414k;
            fm.f8095g = j6;
            this.f10418m = Math.max(this.f10418m, j6);
            return iA;
        }
        if (iA == -5) {
            TP tp = (TP) c1879sw.f16824c;
            tp.getClass();
            long j7 = tp.f11402r;
            if (j7 != Long.MAX_VALUE) {
                C1855sP c1855sP = new C1855sP(tp);
                c1855sP.f16737q = j7 + this.f10414k;
                c1879sw.f16824c = new TP(c1855sP);
                return -5;
            }
        }
        return iA;
    }

    public final void n0() {
        synchronized (this.f10396a) {
            this.f10367F = null;
        }
    }

    public abstract String o();

    public abstract void o0(boolean z6, boolean z7);

    public boolean p(long j6) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p0(com.google.android.gms.internal.ads.TP[] r12, long r13, long r15, com.google.android.gms.internal.ads.C1749qQ r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.OP r12 = r11.f10374I0
            long r0 = r12.f10196c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.OP r4 = new com.google.android.gms.internal.ads.OP
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.h0(r4)
            boolean r12 = r11.f10380L0
            if (r12 == 0) goto L56
            r11.W()
            return
        L24:
            java.util.ArrayDeque r12 = r11.f10384O
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f10364D0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.f10376J0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.OP r4 = new com.google.android.gms.internal.ads.OP
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.h0(r4)
            com.google.android.gms.internal.ads.OP r12 = r11.f10374I0
            long r12 = r12.f10196c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.W()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.OP r0 = new com.google.android.gms.internal.ads.OP
            long r1 = r11.f10364D0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PP.p0(com.google.android.gms.internal.ads.TP[], long, long, com.google.android.gms.internal.ads.qQ):void");
    }

    public void q(float f2, float f5) {
        this.f10393X = f2;
        this.f10394Y = f5;
        d0(this.f10397a0);
    }

    public void r() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ca, code lost:
    
        r28 = r7;
        r3 = -1;
        r29 = r11;
        r9 = r25;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0429, code lost:
    
        if (r30.f10419m0 != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x042b, code lost:
    
        r30.f10360B0 = true;
        r4.s(r30.f10423p0, 0, 0, 4);
        r30.f10423p0 = r3;
        r11.f8093e = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x043e, code lost:
    
        r30.f10431y0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TryCatch #5 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0265, B:148:0x026e, B:150:0x0274, B:152:0x027c, B:154:0x0286, B:156:0x028e, B:159:0x029a, B:160:0x029f, B:161:0x02a0, B:163:0x02a4, B:165:0x02a8, B:167:0x02ac, B:168:0x02af, B:170:0x02b5, B:172:0x02c6, B:175:0x02d3, B:177:0x02df, B:180:0x02ea, B:182:0x02ee, B:184:0x02f4, B:185:0x02f8, B:187:0x0302, B:188:0x0311, B:190:0x031f, B:192:0x0323, B:194:0x0327, B:196:0x0333, B:201:0x033e, B:203:0x0342, B:206:0x034e, B:208:0x0352, B:212:0x035d, B:214:0x0365, B:218:0x036e, B:204:0x034c, B:197:0x0336, B:199:0x033a), top: B:411:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[LOOP:4: B:65:0x00e7->B:117:0x01fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ce A[Catch: CryptoException -> 0x0010, IllegalStateException -> 0x007e, TryCatch #2 {CryptoException -> 0x0010, blocks: (B:3:0x0003, B:5:0x0007, B:12:0x0014, B:14:0x0019, B:16:0x001f, B:23:0x0041, B:25:0x0060, B:27:0x0074, B:38:0x0091, B:33:0x0086, B:236:0x03c8, B:238:0x03ce, B:247:0x03f7, B:249:0x03fb, B:251:0x0400, B:255:0x0408, B:257:0x040c, B:259:0x0414, B:261:0x0422, B:264:0x0427, B:266:0x042b, B:269:0x043e, B:270:0x0441, B:221:0x0393, B:223:0x0399, B:228:0x03a9, B:230:0x03ad, B:232:0x03b1, B:233:0x03bc, B:235:0x03c4), top: B:408:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e4 A[LOOP:0: B:136:0x0250->B:245:0x03e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05fa A[LOOP:1: B:247:0x03f7->B:372:0x05fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0602 A[EDGE_INSN: B:436:0x0602->B:374:0x0602 BREAK  A[LOOP:1: B:247:0x03f7->B:372:0x05fa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154 A[Catch: IllegalStateException -> 0x00a6, CryptoException -> 0x00ab, TRY_ENTER, TryCatch #5 {CryptoException -> 0x00ab, blocks: (B:130:0x022a, B:46:0x00a3, B:56:0x00b6, B:58:0x00ba, B:60:0x00c0, B:64:0x00d8, B:65:0x00e7, B:69:0x00f4, B:71:0x00fa, B:120:0x020c, B:122:0x0212, B:123:0x0215, B:125:0x021b, B:127:0x021f, B:73:0x010c, B:75:0x0113, B:76:0x0127, B:78:0x0137, B:82:0x0146, B:83:0x014e, B:86:0x0154, B:88:0x0158, B:90:0x0162, B:92:0x016c, B:93:0x0194, B:94:0x019c, B:95:0x019d, B:97:0x01a4, B:99:0x01ac, B:101:0x01b4, B:102:0x01bb, B:107:0x01ce, B:109:0x01dc, B:114:0x01f3, B:118:0x01fe, B:112:0x01e3, B:119:0x0201, B:133:0x0235, B:135:0x0242, B:136:0x0250, B:138:0x0254, B:144:0x0265, B:148:0x026e, B:150:0x0274, B:152:0x027c, B:154:0x0286, B:156:0x028e, B:159:0x029a, B:160:0x029f, B:161:0x02a0, B:163:0x02a4, B:165:0x02a8, B:167:0x02ac, B:168:0x02af, B:170:0x02b5, B:172:0x02c6, B:175:0x02d3, B:177:0x02df, B:180:0x02ea, B:182:0x02ee, B:184:0x02f4, B:185:0x02f8, B:187:0x0302, B:188:0x0311, B:190:0x031f, B:192:0x0323, B:194:0x0327, B:196:0x0333, B:201:0x033e, B:203:0x0342, B:206:0x034e, B:208:0x0352, B:212:0x035d, B:214:0x0365, B:218:0x036e, B:204:0x034c, B:197:0x0336, B:199:0x033a), top: B:411:0x002b }] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.ads.FM] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.lang.Throwable, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.media.MediaFormat, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.PP, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(long r31, long r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PP.s(long, long):void");
    }

    public abstract boolean t();

    public abstract boolean u();

    /* JADX WARN: Can't wrap try/catch for region: R(13:(5:242|63|e6|70|(2:237|72))(1:82)|231|83|250|84|245|85|86|(1:88)|89|90|(2:103|(7:110|120|121|(1:126)(1:125)|127|128|(6:240|130|(1:132)(1:133)|227|136|(3:(1:162)(1:141)|163|(8:165|(1:167)|168|169|233|170|171|261)(3:259|178|179))(0))(0))(5:111|(1:119)(0)|120|121|(5:123|126|127|128|(0)(0))(0)))(5:94|(1:102)(0)|120|121|(0)(0))|172) */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02b9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02ba, code lost:
    
        r9 = r9;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02bc, code lost:
    
        r9 = r1;
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02c1, code lost:
    
        r9 = r1;
        r19 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f5 A[Catch: Exception -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0109, blocks: (B:69:0x00f1, B:70:0x00f2, B:72:0x00fb, B:88:0x0156, B:92:0x0188, B:94:0x0190, B:96:0x019a, B:98:0x01a2, B:100:0x01aa, B:123:0x01f5, B:105:0x01b8, B:107:0x01c0, B:111:0x01cb, B:113:0x01d5, B:115:0x01dd, B:117:0x01e5, B:79:0x0113, B:66:0x00e9, B:68:0x00ed, B:76:0x0110), top: B:237:0x00fb, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0316 A[Catch: MP -> 0x0330, TryCatch #9 {MP -> 0x0330, blocks: (B:199:0x02e4, B:201:0x0316, B:204:0x0323, B:206:0x032d, B:210:0x0347, B:213:0x034f, B:214:0x0351, B:209:0x0332, B:216:0x0355, B:217:0x0356, B:219:0x035d, B:220:0x035e, B:221:0x0368, B:223:0x036b), top: B:244:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x032d A[Catch: MP -> 0x0330, TryCatch #9 {MP -> 0x0330, blocks: (B:199:0x02e4, B:201:0x0316, B:204:0x0323, B:206:0x032d, B:210:0x0347, B:213:0x034f, B:214:0x0351, B:209:0x0332, B:216:0x0355, B:217:0x0356, B:219:0x035d, B:220:0x035e, B:221:0x0368, B:223:0x036b), top: B:244:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0332 A[Catch: MP -> 0x0330, TryCatch #9 {MP -> 0x0330, blocks: (B:199:0x02e4, B:201:0x0316, B:204:0x0323, B:206:0x032d, B:210:0x0347, B:213:0x034f, B:214:0x0351, B:209:0x0332, B:216:0x0355, B:217:0x0356, B:219:0x035d, B:220:0x035e, B:221:0x0368, B:223:0x036b), top: B:244:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x034f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() throws com.google.android.gms.internal.ads.HN, com.google.android.gms.internal.ads.MP {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PP.v():void");
    }

    public boolean w(LP lp) {
        return true;
    }

    public final void x() {
        try {
            JP jp = this.f10395Z;
            if (jp != null) {
                jp.i();
                this.f10372H0.f7333b++;
                LP lp = this.f10408g0;
                if (lp == null) {
                    throw null;
                }
                S(lp.f9690a);
            }
            this.f10395Z = null;
            this.f10389T = null;
            B();
        } catch (Throwable th) {
            this.f10395Z = null;
            this.f10389T = null;
            B();
            throw th;
        }
    }

    public boolean y() {
        int i = this.f10432z0;
        if (i == 3 || ((this.f10411i0 && !this.f10362C0) || (this.f10413j0 && this.f10360B0))) {
            return true;
        }
        if (i == 2) {
            try {
                C2255zu c2255zu = this.f10390U;
                c2255zu.getClass();
                this.f10389T = c2255zu;
                this.f10431y0 = 0;
                this.f10432z0 = 0;
            } catch (HN e6) {
                AbstractC2022vd.z("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e6);
                return true;
            }
        }
        return false;
    }

    public boolean z() {
        return true;
    }

    public void D(TP tp) {
    }
}
