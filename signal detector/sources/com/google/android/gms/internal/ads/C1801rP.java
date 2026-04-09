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
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801rP {

    /* renamed from: X, reason: collision with root package name */
    public static final AtomicInteger f16518X = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public long f16519A;

    /* renamed from: B, reason: collision with root package name */
    public int f16520B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16521C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16522D;

    /* renamed from: E, reason: collision with root package name */
    public long f16523E;

    /* renamed from: F, reason: collision with root package name */
    public float f16524F;

    /* renamed from: G, reason: collision with root package name */
    public ByteBuffer f16525G;

    /* renamed from: H, reason: collision with root package name */
    public int f16526H;

    /* renamed from: I, reason: collision with root package name */
    public ByteBuffer f16527I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f16528J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f16529K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f16530L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public int f16531N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f16532O;

    /* renamed from: P, reason: collision with root package name */
    public C1817ro f16533P;

    /* renamed from: Q, reason: collision with root package name */
    public AudioDeviceInfo f16534Q;

    /* renamed from: R, reason: collision with root package name */
    public int f16535R;

    /* renamed from: S, reason: collision with root package name */
    public long f16536S;

    /* renamed from: T, reason: collision with root package name */
    public long f16537T;

    /* renamed from: U, reason: collision with root package name */
    public long f16538U;

    /* renamed from: V, reason: collision with root package name */
    public Handler f16539V;

    /* renamed from: W, reason: collision with root package name */
    public final C2041vw f16540W;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16541a;

    /* renamed from: b, reason: collision with root package name */
    public final C1532mP f16542b;

    /* renamed from: c, reason: collision with root package name */
    public final C2071wP f16543c;

    /* renamed from: d, reason: collision with root package name */
    public final C1167fj f16544d;

    /* renamed from: e, reason: collision with root package name */
    public final C2017vP f16545e;

    /* renamed from: f, reason: collision with root package name */
    public final C1197gC f16546f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f16547g;

    /* renamed from: h, reason: collision with root package name */
    public C1586nP f16548h;
    public final H1.l i;

    /* renamed from: j, reason: collision with root package name */
    public final H1.l f16549j;

    /* renamed from: k, reason: collision with root package name */
    public MO f16550k;

    /* renamed from: l, reason: collision with root package name */
    public C1014cu f16551l;

    /* renamed from: m, reason: collision with root package name */
    public C0752Tp f16552m;

    /* renamed from: n, reason: collision with root package name */
    public C0752Tp f16553n;

    /* renamed from: o, reason: collision with root package name */
    public C1110eh f16554o;

    /* renamed from: p, reason: collision with root package name */
    public final K4.c f16555p;

    /* renamed from: q, reason: collision with root package name */
    public C1694pP f16556q;

    /* renamed from: r, reason: collision with root package name */
    public C1424kP f16557r;

    /* renamed from: s, reason: collision with root package name */
    public C0729Sj f16558s;

    /* renamed from: t, reason: collision with root package name */
    public C1748qP f16559t;

    /* renamed from: u, reason: collision with root package name */
    public C1748qP f16560u;

    /* renamed from: v, reason: collision with root package name */
    public C2159y5 f16561v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16562w;

    /* renamed from: x, reason: collision with root package name */
    public long f16563x;

    /* renamed from: y, reason: collision with root package name */
    public long f16564y;

    /* renamed from: z, reason: collision with root package name */
    public long f16565z;

    public C1801rP(C1640oP c1640oP) {
        int deviceId;
        Context context = c1640oP.f15948a;
        this.f16541a = context == null ? null : context.getApplicationContext();
        this.f16558s = C0729Sj.f11224b;
        this.f16540W = c1640oP.f15953f;
        this.f16555p = c1640oP.f15952e;
        C1532mP c1532mP = new C1532mP();
        this.f16542b = c1532mP;
        C2071wP c2071wP = new C2071wP();
        c2071wP.f17435m = Vt.f12097b;
        this.f16543c = c2071wP;
        this.f16544d = new C1167fj();
        this.f16545e = new C2017vP();
        this.f16546f = LB.j(c2071wP, c1532mP);
        this.f16524F = 1.0f;
        this.f16531N = 0;
        this.f16533P = new C1817ro();
        C2159y5 c2159y5 = C2159y5.f17678d;
        this.f16560u = new C1748qP(c2159y5, 0L, 0L);
        this.f16561v = c2159y5;
        this.f16562w = false;
        this.f16547g = new ArrayDeque();
        this.i = new H1.l();
        this.f16549j = new H1.l();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f16535R = i;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1801rP.c(java.nio.ByteBuffer, int):int");
    }

    public final void a() throws IllegalStateException {
        C2222zE c2222zE;
        if (k()) {
            this.f16563x = 0L;
            this.f16564y = 0L;
            this.f16565z = 0L;
            this.f16519A = 0L;
            this.f16520B = 0;
            this.f16560u = new C1748qP(this.f16561v, 0L, 0L);
            this.f16523E = 0L;
            this.f16559t = null;
            this.f16547g.clear();
            this.f16525G = null;
            this.f16526H = 0;
            this.f16527I = null;
            this.f16529K = false;
            this.f16528J = false;
            this.f16530L = false;
            this.f16543c.f17437o = 0L;
            C1110eh c1110eh = (C1110eh) this.f16553n.f11474f;
            this.f16554o = c1110eh;
            c1110eh.b(C0455Ch.f7637b);
            this.f16548h = null;
            C0752Tp c0752Tp = this.f16552m;
            if (c0752Tp != null) {
                this.f16553n = c0752Tp;
                this.f16552m = null;
            }
            f16518X.incrementAndGet();
            C1424kP c1424kP = this.f16557r;
            if (c1424kP.f15152d.f15389d.getPlayState() == 3) {
                c1424kP.f15149a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && c1424kP.b()) {
                C2041vw c2041vw = c1424kP.f15155g;
                c2041vw.getClass();
                ((C1424kP) c2041vw.f17371d).f15149a.unregisterStreamEventCallback((C1318iP) c2041vw.f17370c);
                ((Handler) c2041vw.f17369b).removeCallbacksAndMessages(null);
            }
            if (i >= 24 && (c2222zE = c1424kP.f15151c) != null) {
                C1210gP c1210gP = (C1210gP) c2222zE.f17840d;
                c1210gP.getClass();
                ((AudioTrack) c2222zE.f17838b).removeOnRoutingChangedListener(c1210gP);
                c2222zE.f17840d = null;
                c1424kP.f15151c = null;
            }
            AudioTrack audioTrack = c1424kP.f15149a;
            C1009cp c1009cp = c1424kP.f15156h;
            Handler handlerN = Vt.n();
            synchronized (C1424kP.f15146p) {
                try {
                    if (C1424kP.f15147q == null) {
                        C1424kP.f15147q = Executors.newSingleThreadScheduledExecutor(new Ht());
                    }
                    C1424kP.f15148r++;
                    C1424kP.f15147q.schedule(new RunnableC0912b0(audioTrack, handlerN, c1009cp, 15), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f16557r = null;
        }
        H1.l lVar = this.f16549j;
        lVar.f1773c = null;
        lVar.f1771a = -9223372036854775807L;
        lVar.f1772b = -9223372036854775807L;
        H1.l lVar2 = this.i;
        lVar2.f1773c = null;
        lVar2.f1771a = -9223372036854775807L;
        lVar2.f1772b = -9223372036854775807L;
        this.f16537T = 0L;
        this.f16538U = 0L;
        Handler handler = this.f16539V;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() throws IllegalStateException {
        a();
        C1197gC c1197gC = this.f16546f;
        int i = c1197gC.f14229d;
        for (int i3 = 0; i3 < i; i3++) {
            ((InterfaceC0812Xh) c1197gC.get(i3)).h();
        }
        this.f16544d.h();
        this.f16545e.h();
        C1110eh c1110eh = this.f16554o;
        if (c1110eh != null) {
            int i6 = 0;
            while (true) {
                LB lb = c1110eh.f13923a;
                if (i6 >= lb.size()) {
                    break;
                }
                InterfaceC0812Xh interfaceC0812Xh = (InterfaceC0812Xh) lb.get(i6);
                C0455Ch c0455Ch = C0455Ch.f7637b;
                interfaceC0812Xh.j();
                interfaceC0812Xh.h();
                i6++;
            }
            c1110eh.f13925c = new ByteBuffer[0];
            C1703ph c1703ph = C1703ph.f16196e;
            c1110eh.f13926d = false;
        }
        this.M = false;
    }

    public final C1424kP d(ZO zo) throws C0991cP {
        try {
            return this.f16555p.r(zo);
        } catch (YO e6) {
            int i = zo.f12883b;
            int i3 = zo.f12884c;
            int i6 = zo.f12882a;
            int i7 = zo.f12885d;
            String strValueOf = String.valueOf((TP) this.f16553n.f11471c);
            int length = String.valueOf(i).length();
            int length2 = String.valueOf(i3).length();
            int length3 = String.valueOf(i6).length();
            StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i7).length() + 2 + strValueOf.length());
            AbstractC2763b.h(sb, "AudioTrack init failed 0 Config(", i, ", ", i3);
            AbstractC2763b.h(sb, ", ", i6, ", ", i7);
            C0991cP c0991cP = new C0991cP(AbstractC1135f5.n(sb, ") ", strValueOf, ""), e6);
            C1014cu c1014cu = this.f16551l;
            if (c1014cu == null) {
                throw c0991cP;
            }
            c1014cu.f(c0991cP);
            throw c0991cP;
        }
    }

    public final void e(long j6) throws C1046dP {
        ByteBuffer byteBuffer;
        h(j6);
        if (this.f16527I != null) {
            return;
        }
        if (!this.f16554o.c()) {
            ByteBuffer byteBuffer2 = this.f16525G;
            if (byteBuffer2 != null) {
                g(byteBuffer2);
                h(j6);
                return;
            }
            return;
        }
        while (!this.f16554o.d()) {
            do {
                C1110eh c1110eh = this.f16554o;
                if (c1110eh.c()) {
                    ByteBuffer byteBuffer3 = c1110eh.f13925c[c1110eh.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c1110eh.e(InterfaceC0812Xh.f12436a);
                        byteBuffer = c1110eh.f13925c[c1110eh.f()];
                    }
                } else {
                    byteBuffer = InterfaceC0812Xh.f12436a;
                }
                if (byteBuffer.hasRemaining()) {
                    g(byteBuffer);
                    h(j6);
                } else {
                    ByteBuffer byteBuffer4 = this.f16525G;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C1110eh c1110eh2 = this.f16554o;
                    ByteBuffer byteBuffer5 = this.f16525G;
                    if (c1110eh2.c() && !c1110eh2.f13926d) {
                        c1110eh2.e(byteBuffer5);
                    }
                }
            } while (this.f16527I == null);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() throws com.google.android.gms.internal.ads.C1046dP {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.eh r0 = r6.f16554o
            boolean r0 = r0.c()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.h(r1)
            java.nio.ByteBuffer r0 = r6.f16527I
            if (r0 != 0) goto L45
            goto L44
        L14:
            com.google.android.gms.internal.ads.eh r0 = r6.f16554o
            boolean r5 = r0.c()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f13926d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f13926d = r4
            java.util.ArrayList r0 = r0.f13924b
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.ads.Xh r0 = (com.google.android.gms.internal.ads.InterfaceC0812Xh) r0
            r0.b()
        L2e:
            r6.e(r1)
            com.google.android.gms.internal.ads.eh r0 = r6.f16554o
            boolean r0 = r0.d()
            if (r0 == 0) goto L45
            java.nio.ByteBuffer r0 = r6.f16527I
            if (r0 == 0) goto L44
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L44
            goto L45
        L44:
            return r4
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1801rP.f():boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1801rP.g(java.nio.ByteBuffer):void");
    }

    public final void h(long j6) throws C1046dP {
        if (this.f16527I == null) {
            return;
        }
        H1.l lVar = this.f16549j;
        if (((Exception) lVar.f1773c) != null && (f16518X.get() > 0 || SystemClock.elapsedRealtime() < lVar.f1772b)) {
            return;
        }
        int iRemaining = this.f16527I.remaining();
        try {
            boolean zA = this.f16557r.a(this.f16527I, this.f16526H);
            this.f16536S = SystemClock.elapsedRealtime();
            lVar.f1773c = null;
            lVar.f1771a = -9223372036854775807L;
            lVar.f1772b = -9223372036854775807L;
            this.f16557r.b();
            if (this.f16553n.k()) {
                this.f16565z += iRemaining - this.f16527I.remaining();
            }
            if (zA) {
                if (!this.f16553n.k()) {
                    AbstractC0582Jp.h0(this.f16527I == this.f16525G);
                    this.f16519A = (this.f16520B * this.f16526H) + this.f16519A;
                }
                this.f16527I = null;
            }
        } catch (TO e6) {
            boolean z6 = e6.f11372b;
            if (z6) {
                if (l() > 0) {
                    z = true;
                } else if (this.f16557r.b()) {
                    this.f16553n.getClass();
                    z = true;
                }
            }
            C1046dP c1046dP = new C1046dP(e6.f11371a, (TP) this.f16553n.f11471c, z);
            C1014cu c1014cu = this.f16551l;
            if (c1014cu != null) {
                c1014cu.f(c1046dP);
            }
            if (z6) {
                throw c1046dP;
            }
            lVar.f(c1046dP);
        }
    }

    public final void i() throws IllegalStateException {
        if (this.f16553n != null) {
            C0752Tp c0752Tp = this.f16552m;
            if (c0752Tp != null) {
                this.f16553n = c0752Tp;
                this.f16552m = null;
            }
            try {
                ZO zoO = this.f16555p.o(m((TP) this.f16553n.f11472d));
                C0752Tp c0752Tp2 = this.f16553n;
                this.f16553n = new C0752Tp((TP) c0752Tp2.f11471c, (TP) c0752Tp2.f11472d, c0752Tp2.f11469a, c0752Tp2.f11470b, zoO, (C1110eh) c0752Tp2.f11474f);
            } catch (UO e6) {
                throw new IllegalStateException(new C0937bP(e6, (TP) this.f16553n.f11471c));
            }
        }
        a();
    }

    public final void j(long j6) {
        C2159y5 c2159y5;
        boolean zK = this.f16553n.k();
        boolean z6 = false;
        C2041vw c2041vw = this.f16540W;
        if (zK) {
            int i = ((TP) this.f16553n.f11471c).f11380G;
            c2159y5 = this.f16561v;
            C0813Xi c0813Xi = (C0813Xi) c2041vw.f17371d;
            float f2 = c2159y5.f17679a;
            c0813Xi.getClass();
            AbstractC0582Jp.m(f2 > 0.0f);
            if (c0813Xi.f12438c != f2) {
                c0813Xi.f12438c = f2;
                c0813Xi.i = true;
            }
            float f5 = c2159y5.f17680b;
            AbstractC0582Jp.m(f5 > 0.0f);
            if (c0813Xi.f12439d != f5) {
                c0813Xi.f12439d = f5;
                c0813Xi.i = true;
            }
        } else {
            c2159y5 = C2159y5.f17678d;
        }
        C2159y5 c2159y52 = c2159y5;
        this.f16561v = c2159y52;
        if (this.f16553n.k()) {
            int i3 = ((TP) this.f16553n.f11471c).f11380G;
            z6 = this.f16562w;
            ((C1963uP) c2041vw.f17370c).f17118j = z6;
        }
        this.f16562w = z6;
        this.f16547g.add(new C1748qP(c2159y52, Math.max(0L, j6), Vt.t(((ZO) this.f16553n.f11473e).f12883b, l())));
        C1110eh c1110eh = (C1110eh) this.f16553n.f11474f;
        this.f16554o = c1110eh;
        c1110eh.b(C0455Ch.f7637b);
        C1014cu c1014cu = this.f16551l;
        if (c1014cu != null) {
            boolean z7 = this.f16562w;
            Vu vu = ((C1909tP) c1014cu.f13695b).f16910Q0;
            Handler handler = (Handler) vu.f12105a;
            if (handler != null) {
                handler.post(new A1.q(vu, z7, 5));
            }
        }
    }

    public final boolean k() {
        return this.f16557r != null;
    }

    public final long l() {
        if (!this.f16553n.k()) {
            return this.f16519A;
        }
        long j6 = this.f16565z;
        long j7 = this.f16553n.f11470b;
        String str = Vt.f12096a;
        return ((j6 + j7) - 1) / j7;
    }

    public final VO m(TP tp) {
        VO vo = new VO(tp);
        vo.f11988b = this.f16558s;
        vo.f11989c = this.f16534Q;
        vo.f11990d = this.f16531N;
        vo.f11992f = -1;
        vo.f11991e = this.f16535R;
        return new VO(vo);
    }

    public final void n() throws IllegalStateException {
        if (this.f16529K) {
            return;
        }
        this.f16529K = true;
        if (this.f16557r.b()) {
            this.f16530L = false;
        }
        C1424kP c1424kP = this.f16557r;
        if (c1424kP.i) {
            return;
        }
        c1424kP.i = true;
        C1478lP c1478lP = c1424kP.f15152d;
        long jC = c1424kP.c();
        c1478lP.f15407w = c1478lP.d();
        c1478lP.f15387b.getClass();
        c1478lP.f15405u = Vt.s(SystemClock.elapsedRealtime());
        c1478lP.f15408x = jC;
        c1424kP.f15149a.stop();
    }

    public final void o(TP tp, int[] iArr) throws C0937bP {
        C1110eh c1110eh;
        int iD;
        TP tp2;
        int i;
        C1694pP c1694pP = this.f16556q;
        K4.c cVar = this.f16555p;
        if (c1694pP == null && this.f16541a != null) {
            C1694pP c1694pP2 = new C1694pP(this);
            this.f16556q = c1694pP2;
            cVar.u();
            if (((C1009cp) cVar.f2210c) == null) {
                C1009cp c1009cp = new C1009cp(Thread.currentThread());
                cVar.f2210c = c1009cp;
                c1009cp.f13673b = false;
            }
            ((C1009cp) cVar.f2210c).a(c1694pP2);
        }
        if ("audio/raw".equals(tp.f11397m)) {
            int i3 = tp.f11380G;
            AbstractC0582Jp.m(Vt.a(i3));
            int i6 = tp.f11378E;
            int iD2 = Vt.d(i3) * i6;
            IB ib = new IB(4);
            ib.b(this.f16546f);
            ib.a(this.f16544d);
            InterfaceC0812Xh[] interfaceC0812XhArr = (InterfaceC0812Xh[]) this.f16540W.f17369b;
            AbstractC1984ut.k(2, interfaceC0812XhArr);
            ib.e(2);
            System.arraycopy(interfaceC0812XhArr, 0, ib.f8331a, ib.f8332b, 2);
            ib.f8332b += 2;
            c1110eh = new C1110eh(ib.f());
            if (c1110eh.equals(this.f16554o)) {
                c1110eh = this.f16554o;
            }
            int i7 = tp.f11381H;
            int i8 = tp.f11382I;
            C2071wP c2071wP = this.f16543c;
            c2071wP.i = i7;
            c2071wP.f17432j = i8;
            this.f16542b.i = iArr;
            try {
                C1703ph c1703phA = c1110eh.a(new C1703ph(tp.f11379F, i6, i3));
                C1855sP c1855sP = new C1855sP(tp);
                int i9 = c1703phA.f16199c;
                c1855sP.f16716F = i9;
                c1855sP.f16715E = c1703phA.f16197a;
                int i10 = c1703phA.f16198b;
                c1855sP.f16714D = i10;
                tp2 = new TP(c1855sP);
                iD = Vt.d(i9) * i10;
                i = iD2;
            } catch (C0625Mh e6) {
                throw new C0937bP(e6, tp);
            }
        } else {
            c1110eh = new C1110eh(C1197gC.f14227e);
            iD = -1;
            tp2 = tp;
            i = -1;
        }
        VO voM = m(tp2);
        TP tp3 = (TP) voM.f11987a;
        try {
            ZO zoO = cVar.o(voM);
            if (zoO.f12882a == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new C0937bP(sb.toString(), tp3);
            }
            if (zoO.f12884c == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new C0937bP(sb2.toString(), tp3);
            }
            C0752Tp c0752Tp = new C0752Tp(tp, tp2, i, iD, zoO, c1110eh);
            if (k()) {
                this.f16552m = c0752Tp;
            } else {
                this.f16553n = c0752Tp;
            }
        } catch (UO e7) {
            throw new C0937bP(e7, tp);
        }
    }

    public final void p() throws IllegalStateException {
        this.M = true;
        if (k()) {
            C1424kP c1424kP = this.f16557r;
            C1478lP c1478lP = c1424kP.f15152d;
            if (c1478lP.f15405u != -9223372036854775807L) {
                c1478lP.f15387b.getClass();
                c1478lP.f15405u = Vt.s(SystemClock.elapsedRealtime());
            }
            c1478lP.f15394j = Vt.t(c1478lP.f15390e, c1478lP.d());
            c1478lP.f15393h.a(0);
            if (!c1424kP.i || c1424kP.b()) {
                c1424kP.f15149a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0286, code lost:
    
        if (r0 != 0) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(long r22, int r24, java.nio.ByteBuffer r25) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.C0991cP, com.google.android.gms.internal.ads.C1046dP {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1801rP.q(long, int, java.nio.ByteBuffer):boolean");
    }

    public final boolean r() {
        if (!k()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.f16557r.b() && this.f16530L) {
            return false;
        }
        long jL = l();
        long jA = this.f16557r.f15152d.a();
        C1424kP c1424kP = this.f16557r;
        c1424kP.getClass();
        return jL > Vt.u(jA, (long) c1424kP.f15149a.getSampleRate(), 1000000L, RoundingMode.UP);
    }
}
