package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kw1 {
    public static final AtomicInteger X = new AtomicInteger();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public ByteBuffer G;
    public int H;
    public ByteBuffer I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public le0 P;
    public AudioDeviceInfo Q;
    public int R;
    public long S;
    public long T;
    public long U;
    public Handler V;
    public final av0 W;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13262a;

    /* renamed from: b, reason: collision with root package name */
    public final ew1 f13263b;

    /* renamed from: c, reason: collision with root package name */
    public final pw1 f13264c;

    /* renamed from: d, reason: collision with root package name */
    public final c40 f13265d;

    /* renamed from: e, reason: collision with root package name */
    public final ow1 f13266e;

    /* renamed from: f, reason: collision with root package name */
    public final u51 f13267f;
    public final ArrayDeque g;

    /* renamed from: h, reason: collision with root package name */
    public gw1 f13268h;

    /* renamed from: i, reason: collision with root package name */
    public final r9 f13269i;
    public final r9 j;

    /* renamed from: k, reason: collision with root package name */
    public cv1 f13270k;

    /* renamed from: l, reason: collision with root package name */
    public kh0 f13271l;

    /* renamed from: m, reason: collision with root package name */
    public a8.g f13272m;

    /* renamed from: n, reason: collision with root package name */
    public a8.g f13273n;

    /* renamed from: o, reason: collision with root package name */
    public yz f13274o;

    /* renamed from: p, reason: collision with root package name */
    public final cw1 f13275p;

    /* renamed from: q, reason: collision with root package name */
    public iw1 f13276q;

    /* renamed from: r, reason: collision with root package name */
    public bw1 f13277r;

    /* renamed from: s, reason: collision with root package name */
    public p50 f13278s;

    /* renamed from: t, reason: collision with root package name */
    public jw1 f13279t;

    /* renamed from: u, reason: collision with root package name */
    public jw1 f13280u;

    /* renamed from: v, reason: collision with root package name */
    public fc f13281v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13282w;

    /* renamed from: x, reason: collision with root package name */
    public long f13283x;

    /* renamed from: y, reason: collision with root package name */
    public long f13284y;

    /* renamed from: z, reason: collision with root package name */
    public long f13285z;

    public kw1(hw1 hw1Var) {
        int deviceId;
        Context context = hw1Var.f11996a;
        this.f13262a = context == null ? null : context.getApplicationContext();
        this.f13278s = p50.f14899b;
        this.W = hw1Var.f12001f;
        this.f13275p = hw1Var.f12000e;
        ew1 ew1Var = new ew1();
        this.f13263b = ew1Var;
        pw1 pw1Var = new pw1();
        pw1Var.f15129m = bq0.f9769b;
        this.f13264c = pw1Var;
        this.f13265d = new c40();
        this.f13266e = new ow1();
        this.f13267f = x41.m(pw1Var, ew1Var);
        this.F = 1.0f;
        this.N = 0;
        this.P = new le0();
        fc fcVar = fc.f11093d;
        this.f13280u = new jw1(fcVar, 0L, 0L);
        this.f13281v = fcVar;
        this.f13282w = false;
        this.g = new ArrayDeque();
        this.f13269i = new r9();
        this.j = new r9();
        int i4 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i4 = deviceId;
        }
        this.R = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.nio.ByteBuffer r9, int r10) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.c(java.nio.ByteBuffer, int):int");
    }

    public final void a() throws IllegalStateException {
        xv1 xv1Var;
        if (k()) {
            this.f13283x = 0L;
            this.f13284y = 0L;
            this.f13285z = 0L;
            this.A = 0L;
            this.B = 0;
            this.f13280u = new jw1(this.f13281v, 0L, 0L);
            this.E = 0L;
            this.f13279t = null;
            this.g.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.K = false;
            this.J = false;
            this.L = false;
            this.f13264c.f15131o = 0L;
            yz yzVar = (yz) this.f13273n.f233f;
            this.f13274o = yzVar;
            yzVar.b(v00.f17409b);
            this.f13268h = null;
            a8.g gVar = this.f13272m;
            if (gVar != null) {
                this.f13273n = gVar;
                this.f13272m = null;
            }
            X.incrementAndGet();
            bw1 bw1Var = this.f13277r;
            if (bw1Var.f9824d.f10577d.getPlayState() == 3) {
                bw1Var.f9821a.pause();
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29 && bw1Var.b()) {
                aw1 aw1Var = bw1Var.g;
                aw1Var.getClass();
                aw1Var.a();
            }
            if (i4 >= 24 && (xv1Var = bw1Var.f9823c) != null) {
                xv1Var.b();
                bw1Var.f9823c = null;
            }
            AudioTrack audioTrack = bw1Var.f9821a;
            yf0 yf0Var = bw1Var.f9827h;
            Handler handlerN = bq0.n();
            synchronized (bw1.f9818p) {
                try {
                    if (bw1.f9819q == null) {
                        bw1.f9819q = Executors.newSingleThreadScheduledExecutor(new mp0());
                    }
                    bw1.f9820r++;
                    bw1.f9819q.schedule(new d1(audioTrack, handlerN, yf0Var, 15), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13277r = null;
        }
        r9 r9Var = this.j;
        r9Var.f15578c = null;
        r9Var.f15576a = -9223372036854775807L;
        r9Var.f15577b = -9223372036854775807L;
        r9 r9Var2 = this.f13269i;
        r9Var2.f15578c = null;
        r9Var2.f15576a = -9223372036854775807L;
        r9Var2.f15577b = -9223372036854775807L;
        this.T = 0L;
        this.U = 0L;
        Handler handler = this.V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() throws IllegalStateException {
        a();
        u51 u51Var = this.f13267f;
        int i4 = u51Var.f17098d;
        for (int i10 = 0; i10 < i4; i10++) {
            ((q10) u51Var.get(i10)).A1();
        }
        this.f13265d.A1();
        this.f13266e.A1();
        yz yzVar = this.f13274o;
        if (yzVar != null) {
            int i11 = 0;
            while (true) {
                x41 x41Var = yzVar.f18934a;
                if (i11 >= x41Var.size()) {
                    break;
                }
                q10 q10Var = (q10) x41Var.get(i11);
                v00 v00Var = v00.f17409b;
                q10Var.C1();
                q10Var.A1();
                i11++;
            }
            yzVar.f18936c = new ByteBuffer[0];
            j00 j00Var = j00.f12557e;
            yzVar.f18937d = false;
        }
        this.M = false;
    }

    public final bw1 d(pv1 pv1Var) throws sv1 {
        try {
            return this.f13275p.c(pv1Var);
        } catch (ov1 e2) {
            int i4 = pv1Var.f15120b;
            int i10 = pv1Var.f15121c;
            int i11 = pv1Var.f15119a;
            int i12 = pv1Var.f15122d;
            String strValueOf = String.valueOf((mx1) this.f13273n.f230c);
            int length = String.valueOf(i4).length();
            int length2 = String.valueOf(i10).length();
            int length3 = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i12).length() + 2 + strValueOf.length());
            r5.c.q(i4, i10, "AudioTrack init failed 0 Config(", ", ", sb2);
            r5.c.q(i11, i12, ", ", ", ", sb2);
            sv1 sv1Var = new sv1(r5.c.m(sb2, ") ", strValueOf, ""), e2);
            kh0 kh0Var = this.f13271l;
            if (kh0Var == null) {
                throw sv1Var;
            }
            kh0Var.q(sv1Var);
            throw sv1Var;
        }
    }

    public final void e(long j) throws tv1 {
        ByteBuffer byteBuffer;
        h(j);
        if (this.I != null) {
            return;
        }
        if (!this.f13274o.c()) {
            ByteBuffer byteBuffer2 = this.G;
            if (byteBuffer2 != null) {
                g(byteBuffer2);
                h(j);
                return;
            }
            return;
        }
        while (!this.f13274o.d()) {
            do {
                yz yzVar = this.f13274o;
                if (yzVar.c()) {
                    ByteBuffer byteBuffer3 = yzVar.f18936c[yzVar.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        yzVar.e(q10.f15188a);
                        byteBuffer = yzVar.f18936c[yzVar.f()];
                    }
                } else {
                    byteBuffer = q10.f15188a;
                }
                if (byteBuffer.hasRemaining()) {
                    g(byteBuffer);
                    h(j);
                } else {
                    ByteBuffer byteBuffer4 = this.G;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    yz yzVar2 = this.f13274o;
                    ByteBuffer byteBuffer5 = this.G;
                    if (yzVar2.c() && !yzVar2.f18937d) {
                        yzVar2.e(byteBuffer5);
                    }
                }
            } while (this.I == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws com.google.android.gms.internal.ads.tv1 {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.yz r0 = r6.f13274o
            boolean r0 = r0.c()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.h(r1)
            java.nio.ByteBuffer r0 = r6.I
            if (r0 != 0) goto L45
            goto L44
        L14:
            com.google.android.gms.internal.ads.yz r0 = r6.f13274o
            boolean r5 = r0.c()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f18937d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f18937d = r4
            java.util.ArrayList r0 = r0.f18935b
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.q10 r0 = (com.google.android.gms.internal.ads.q10) r0
            r0.c()
        L2e:
            r6.e(r1)
            com.google.android.gms.internal.ads.yz r0 = r6.f13274o
            boolean r0 = r0.d()
            if (r0 == 0) goto L45
            java.nio.ByteBuffer r0 = r6.I
            if (r0 == 0) goto L44
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L44
            goto L45
        L44:
            return r4
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.g(java.nio.ByteBuffer):void");
    }

    public final void h(long j) throws tv1 {
        if (this.I == null) {
            return;
        }
        r9 r9Var = this.j;
        if (((Exception) r9Var.f15578c) != null && (X.get() > 0 || SystemClock.elapsedRealtime() < r9Var.f15577b)) {
            return;
        }
        int iRemaining = this.I.remaining();
        try {
            boolean zA = this.f13277r.a(this.I, this.H);
            this.S = SystemClock.elapsedRealtime();
            r9Var.f15578c = null;
            r9Var.f15576a = -9223372036854775807L;
            r9Var.f15577b = -9223372036854775807L;
            this.f13277r.b();
            if (this.f13273n.k()) {
                this.f13285z += iRemaining - this.I.remaining();
            }
            if (zA) {
                if (!this.f13273n.k()) {
                    mq0.c0(this.I == this.G);
                    this.A = (this.B * this.H) + this.A;
                }
                this.I = null;
            }
        } catch (jv1 e2) {
            boolean z3 = e2.f12848b;
            if (z3) {
                if (l() > 0) {
                    z = true;
                } else if (this.f13277r.b()) {
                    this.f13273n.getClass();
                    z = true;
                }
            }
            tv1 tv1Var = new tv1(e2.f12847a, (mx1) this.f13273n.f230c, z);
            kh0 kh0Var = this.f13271l;
            if (kh0Var != null) {
                kh0Var.q(tv1Var);
            }
            if (z3) {
                throw tv1Var;
            }
            r9Var.h(tv1Var);
        }
    }

    public final void i() throws IllegalStateException {
        if (this.f13273n != null) {
            a8.g gVar = this.f13272m;
            if (gVar != null) {
                this.f13273n = gVar;
                this.f13272m = null;
            }
            try {
                pv1 pv1VarB = this.f13275p.b(m((mx1) this.f13273n.f231d));
                a8.g gVar2 = this.f13273n;
                this.f13273n = new a8.g((mx1) gVar2.f230c, (mx1) gVar2.f231d, gVar2.f228a, gVar2.f229b, pv1VarB, (yz) gVar2.f233f);
            } catch (kv1 e2) {
                throw new IllegalStateException(new rv1(e2, (mx1) this.f13273n.f230c));
            }
        }
        a();
    }

    public final void j(long j) {
        fc fcVar;
        boolean zK = this.f13273n.k();
        boolean z3 = false;
        av0 av0Var = this.W;
        if (zK) {
            int i4 = ((mx1) this.f13273n.f230c).G;
            fcVar = this.f13281v;
            t30 t30Var = (t30) av0Var.f9424d;
            float f10 = fcVar.f11094a;
            t30Var.getClass();
            mq0.m(f10 > 0.0f);
            if (t30Var.f16683c != f10) {
                t30Var.f16683c = f10;
                t30Var.f16688i = true;
            }
            float f11 = fcVar.f11095b;
            mq0.m(f11 > 0.0f);
            if (t30Var.f16684d != f11) {
                t30Var.f16684d = f11;
                t30Var.f16688i = true;
            }
        } else {
            fcVar = fc.f11093d;
        }
        fc fcVar2 = fcVar;
        this.f13281v = fcVar2;
        if (this.f13273n.k()) {
            int i10 = ((mx1) this.f13273n.f230c).G;
            z3 = this.f13282w;
            ((nw1) av0Var.f9423c).j = z3;
        }
        this.f13282w = z3;
        this.g.add(new jw1(fcVar2, Math.max(0L, j), bq0.t(((pv1) this.f13273n.f232e).f15120b, l())));
        yz yzVar = (yz) this.f13273n.f233f;
        this.f13274o = yzVar;
        yzVar.b(v00.f17409b);
        kh0 kh0Var = this.f13271l;
        if (kh0Var != null) {
            boolean z10 = this.f13282w;
            g1 g1Var = ((mw1) kh0Var.f13160b).C0;
            Handler handler = g1Var.f11341a;
            if (handler != null) {
                handler.post(new bi.a(3, g1Var, z10));
            }
        }
    }

    public final boolean k() {
        return this.f13277r != null;
    }

    public final long l() {
        if (!this.f13273n.k()) {
            return this.A;
        }
        long j = this.f13285z;
        long j8 = this.f13273n.f229b;
        String str = bq0.f9768a;
        return ((j + j8) - 1) / j8;
    }

    public final lv1 m(mx1 mx1Var) {
        lv1 lv1Var = new lv1(mx1Var);
        lv1Var.f13644b = this.f13278s;
        lv1Var.f13645c = this.Q;
        lv1Var.f13646d = this.N;
        lv1Var.f13648f = -1;
        lv1Var.f13647e = this.R;
        return new lv1(lv1Var);
    }

    public final void n() throws IllegalStateException {
        if (this.K) {
            return;
        }
        this.K = true;
        if (this.f13277r.b()) {
            this.L = false;
        }
        bw1 bw1Var = this.f13277r;
        if (bw1Var.f9828i) {
            return;
        }
        bw1Var.f9828i = true;
        dw1 dw1Var = bw1Var.f9824d;
        long jD = bw1Var.d();
        dw1Var.f10594w = dw1Var.d();
        dw1Var.f10575b.getClass();
        dw1Var.f10592u = bq0.s(SystemClock.elapsedRealtime());
        dw1Var.f10595x = jD;
        bw1Var.f9821a.stop();
    }

    public final void o(mx1 mx1Var, int[] iArr) throws rv1 {
        yz yzVar;
        int iD;
        mx1 mx1Var2;
        int i4;
        iw1 iw1Var = this.f13276q;
        cw1 cw1Var = this.f13275p;
        if (iw1Var == null && this.f13262a != null) {
            iw1 iw1Var2 = new iw1(this);
            this.f13276q = iw1Var2;
            cw1Var.e();
            if (cw1Var.f10236c == null) {
                yf0 yf0Var = new yf0(Thread.currentThread());
                cw1Var.f10236c = yf0Var;
                yf0Var.f18728b = false;
            }
            cw1Var.f10236c.a(iw1Var2);
        }
        if ("audio/raw".equals(mx1Var.f14052m)) {
            int i10 = mx1Var.G;
            mq0.m(bq0.a(i10));
            int i11 = mx1Var.E;
            int iD2 = bq0.d(i10) * i11;
            u41 u41Var = new u41(4);
            u41Var.b(this.f13267f);
            u41Var.a(this.f13265d);
            q10[] q10VarArr = (q10[]) this.W.f9422b;
            yo0.m(q10VarArr, 2);
            u41Var.e(2);
            System.arraycopy(q10VarArr, 0, u41Var.f15865a, u41Var.f15866b, 2);
            u41Var.f15866b += 2;
            yzVar = new yz(u41Var.f());
            if (yzVar.equals(this.f13274o)) {
                yzVar = this.f13274o;
            }
            int i12 = mx1Var.H;
            int i13 = mx1Var.I;
            pw1 pw1Var = this.f13264c;
            pw1Var.f15126i = i12;
            pw1Var.j = i13;
            this.f13263b.f10897i = iArr;
            try {
                j00 j00VarA = yzVar.a(new j00(mx1Var.F, i11, i10));
                lw1 lw1Var = new lw1(mx1Var);
                int i14 = j00VarA.f12560c;
                lw1Var.F = i14;
                lw1Var.E = j00VarA.f12558a;
                int i15 = j00VarA.f12559b;
                lw1Var.D = i15;
                mx1Var2 = new mx1(lw1Var);
                iD = bq0.d(i14) * i15;
                i4 = iD2;
            } catch (f10 e2) {
                throw new rv1(e2, mx1Var);
            }
        } else {
            yzVar = new yz(u51.f17096e);
            iD = -1;
            mx1Var2 = mx1Var;
            i4 = -1;
        }
        lv1 lv1VarM = m(mx1Var2);
        mx1 mx1Var3 = (mx1) lv1VarM.f13643a;
        try {
            pv1 pv1VarB = cw1Var.b(lv1VarM);
            if (pv1VarB.f15119a == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=false)");
                throw new rv1(sb2.toString(), mx1Var3);
            }
            if (pv1VarB.f15121c == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=false)");
                throw new rv1(sb3.toString(), mx1Var3);
            }
            a8.g gVar = new a8.g(mx1Var, mx1Var2, i4, iD, pv1VarB, yzVar);
            if (k()) {
                this.f13272m = gVar;
            } else {
                this.f13273n = gVar;
            }
        } catch (kv1 e10) {
            throw new rv1(e10, mx1Var);
        }
    }

    public final void p() throws IllegalStateException {
        this.M = true;
        if (k()) {
            bw1 bw1Var = this.f13277r;
            dw1 dw1Var = bw1Var.f9824d;
            if (dw1Var.f10592u != -9223372036854775807L) {
                dw1Var.f10575b.getClass();
                dw1Var.f10592u = bq0.s(SystemClock.elapsedRealtime());
            }
            dw1Var.j = bq0.t(dw1Var.f10578e, dw1Var.d());
            dw1Var.f10580h.a(0);
            if (!bw1Var.f9828i || bw1Var.b()) {
                bw1Var.f9821a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x025f, code lost:
    
        if (r0 != 0) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(long r22, int r24, java.nio.ByteBuffer r25) throws com.google.android.gms.internal.ads.tv1, java.lang.IllegalStateException, com.google.android.gms.internal.ads.sv1 {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kw1.q(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean r() {
        if (!k()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f13277r.b() && this.L) {
            return false;
        }
        long jL = l();
        long jA = this.f13277r.f9824d.a();
        bw1 bw1Var = this.f13277r;
        bw1Var.getClass();
        return jL > bq0.u(jA, (long) bw1Var.f9821a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
