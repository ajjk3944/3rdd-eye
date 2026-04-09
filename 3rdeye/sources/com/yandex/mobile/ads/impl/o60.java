package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xv0;
import com.yandex.mobile.ads.impl.zz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class o60 implements Handler.Callback, dw0.a, s52.a, mw0.d, zz.a, hi1.a {

    /* renamed from: A, reason: collision with root package name */
    private boolean f31206A;

    /* renamed from: C, reason: collision with root package name */
    private boolean f31208C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f31209D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f31210E;

    /* renamed from: F, reason: collision with root package name */
    private int f31211F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f31213H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f31214I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31215J;

    /* renamed from: K, reason: collision with root package name */
    private int f31216K;

    /* renamed from: L, reason: collision with root package name */
    private g f31217L;

    /* renamed from: M, reason: collision with root package name */
    private long f31218M;

    /* renamed from: N, reason: collision with root package name */
    private int f31219N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31220O;

    /* renamed from: P, reason: collision with root package name */
    private h60 f31221P;

    /* renamed from: b, reason: collision with root package name */
    private final so1[] f31223b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<so1> f31224c;

    /* renamed from: d, reason: collision with root package name */
    private final to1[] f31225d;

    /* renamed from: e, reason: collision with root package name */
    private final s52 f31226e;

    /* renamed from: f, reason: collision with root package name */
    private final t52 f31227f;

    /* renamed from: g, reason: collision with root package name */
    private final pr0 f31228g;

    /* renamed from: h, reason: collision with root package name */
    private final pi f31229h;
    private final bf0 i;

    /* renamed from: j, reason: collision with root package name */
    private final HandlerThread f31230j;

    /* renamed from: k, reason: collision with root package name */
    private final Looper f31231k;

    /* renamed from: l, reason: collision with root package name */
    private final v42.d f31232l;

    /* renamed from: m, reason: collision with root package name */
    private final v42.b f31233m;

    /* renamed from: n, reason: collision with root package name */
    private final long f31234n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f31235o;

    /* renamed from: p, reason: collision with root package name */
    private final zz f31236p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList<c> f31237q;

    /* renamed from: r, reason: collision with root package name */
    private final dp f31238r;

    /* renamed from: s, reason: collision with root package name */
    private final e f31239s;

    /* renamed from: t, reason: collision with root package name */
    private final hw0 f31240t;

    /* renamed from: u, reason: collision with root package name */
    private final mw0 f31241u;

    /* renamed from: v, reason: collision with root package name */
    private final or0 f31242v;

    /* renamed from: w, reason: collision with root package name */
    private final long f31243w;

    /* renamed from: x, reason: collision with root package name */
    private uw1 f31244x;

    /* renamed from: y, reason: collision with root package name */
    private th1 f31245y;

    /* renamed from: z, reason: collision with root package name */
    private d f31246z;

    /* renamed from: G, reason: collision with root package name */
    private boolean f31212G = false;

    /* renamed from: B, reason: collision with root package name */
    private boolean f31207B = false;

    /* renamed from: Q, reason: collision with root package name */
    private long f31222Q = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<mw0.c> f31247a;

        /* renamed from: b, reason: collision with root package name */
        private final xx1 f31248b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31249c;

        /* renamed from: d, reason: collision with root package name */
        private final long f31250d;

        public /* synthetic */ a(int i, long j4, xx1 xx1Var, ArrayList arrayList, int i10) {
            this(i, j4, xx1Var, arrayList);
        }

        private a(int i, long j4, xx1 xx1Var, ArrayList arrayList) {
            this.f31247a = arrayList;
            this.f31248b = xx1Var;
            this.f31249c = i;
            this.f31250d = j4;
        }
    }

    public static class b {
    }

    public static final class c implements Comparable<c> {
        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f31251a;

        /* renamed from: b, reason: collision with root package name */
        public th1 f31252b;

        /* renamed from: c, reason: collision with root package name */
        public int f31253c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f31254d;

        /* renamed from: e, reason: collision with root package name */
        public int f31255e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f31256f;

        /* renamed from: g, reason: collision with root package name */
        public int f31257g;

        public d(th1 th1Var) {
            this.f31252b = th1Var;
        }

        public final void a(int i) {
            this.f31251a |= i > 0;
            this.f31253c += i;
        }
    }

    public interface e {
        void a(d dVar);
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final jw0.b f31258a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31259b;

        /* renamed from: c, reason: collision with root package name */
        public final long f31260c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f31261d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f31262e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f31263f;

        public f(jw0.b bVar, long j4, long j10, boolean z10, boolean z11, boolean z12) {
            this.f31258a = bVar;
            this.f31259b = j4;
            this.f31260c = j10;
            this.f31261d = z10;
            this.f31262e = z11;
            this.f31263f = z12;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final v42 f31264a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31265b;

        /* renamed from: c, reason: collision with root package name */
        public final long f31266c;

        public g(v42 v42Var, int i, long j4) {
            this.f31264a = v42Var;
            this.f31265b = i;
            this.f31266c = j4;
        }
    }

    public o60(so1[] so1VarArr, s52 s52Var, t52 t52Var, pr0 pr0Var, pi piVar, int i, xc xcVar, uw1 uw1Var, wz wzVar, long j4, Looper looper, m32 m32Var, e eVar, gi1 gi1Var) {
        this.f31239s = eVar;
        this.f31223b = so1VarArr;
        this.f31226e = s52Var;
        this.f31227f = t52Var;
        this.f31228g = pr0Var;
        this.f31229h = piVar;
        this.f31211F = i;
        this.f31244x = uw1Var;
        this.f31242v = wzVar;
        this.f31243w = j4;
        this.f31238r = m32Var;
        this.f31234n = pr0Var.e();
        this.f31235o = pr0Var.a();
        th1 th1VarA = th1.a(t52Var);
        this.f31245y = th1VarA;
        this.f31246z = new d(th1VarA);
        this.f31225d = new to1[so1VarArr.length];
        for (int i10 = 0; i10 < so1VarArr.length; i10++) {
            so1VarArr[i10].a(i10, gi1Var);
            this.f31225d[i10] = so1VarArr[i10].n();
        }
        this.f31236p = new zz(this, m32Var);
        this.f31237q = new ArrayList<>();
        this.f31224c = lx1.a();
        this.f31232l = new v42.d();
        this.f31233m = new v42.b();
        s52Var.a(this, piVar);
        this.f31220O = true;
        Handler handler = new Handler(looper);
        this.f31240t = new hw0(xcVar, handler);
        this.f31241u = new mw0(this, xcVar, handler, gi1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f31230j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f31231k = looper2;
        this.i = m32Var.a(looper2, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.f31206A);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.hw0 r0 = r6.f31240t
            com.yandex.mobile.ads.impl.ew0 r0 = r0.d()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            boolean r1 = r0.f27057d
            r2 = 0
            if (r1 != 0) goto L11
            r0 = r2
            goto L17
        L11:
            com.yandex.mobile.ads.impl.dw0 r0 = r0.f27054a
            long r0 = r0.getNextLoadPositionUs()
        L17:
            r4 = -9223372036854775808
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            goto L4f
        L1f:
            com.yandex.mobile.ads.impl.hw0 r0 = r6.f31240t
            com.yandex.mobile.ads.impl.ew0 r0 = r0.d()
            boolean r1 = r0.f27057d
            if (r1 != 0) goto L2a
            goto L30
        L2a:
            com.yandex.mobile.ads.impl.dw0 r1 = r0.f27054a
            long r2 = r1.getNextLoadPositionUs()
        L30:
            long r1 = r6.a(r2)
            com.yandex.mobile.ads.impl.hw0 r3 = r6.f31240t
            com.yandex.mobile.ads.impl.ew0 r3 = r3.e()
            if (r0 != r3) goto L3d
            goto L41
        L3d:
            com.yandex.mobile.ads.impl.gw0 r0 = r0.f27059f
            long r3 = r0.f28013b
        L41:
            com.yandex.mobile.ads.impl.pr0 r0 = r6.f31228g
            com.yandex.mobile.ads.impl.zz r3 = r6.f31236p
            com.yandex.mobile.ads.impl.vh1 r3 = r3.getPlaybackParameters()
            float r3 = r3.f34542b
            boolean r0 = r0.a(r1, r3)
        L4f:
            r6.f31210E = r0
            if (r0 == 0) goto L5e
            com.yandex.mobile.ads.impl.hw0 r0 = r6.f31240t
            com.yandex.mobile.ads.impl.ew0 r0 = r0.d()
            long r1 = r6.f31218M
            r0.a(r1)
        L5e:
            r6.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o60.f():void");
    }

    private void g() throws Throwable {
        a(this.f31241u.a(), true);
    }

    private void j() {
        this.f31246z.a(1);
        a(false, false, false, true);
        this.f31228g.f();
        b(this.f31245y.f33594a.c() ? 4 : 2);
        this.f31241u.a(this.f31229h.a());
        this.i.a(2);
    }

    private void l() {
        a(true, false, true, false);
        this.f31228g.b();
        b(1);
        this.f31230j.quit();
        synchronized (this) {
            this.f31206A = true;
            notifyAll();
        }
    }

    private void m() throws h60 {
        int i;
        float f10 = this.f31236p.getPlaybackParameters().f34542b;
        ew0 ew0VarF = this.f31240t.f();
        boolean z10 = true;
        for (ew0 ew0VarE = this.f31240t.e(); ew0VarE != null && ew0VarE.f27057d; ew0VarE = ew0VarE.b()) {
            t52 t52VarB = ew0VarE.b(f10, this.f31245y.f33594a);
            t52 t52VarF = ew0VarE.f();
            if (t52VarF != null && t52VarF.f33452c.length == t52VarB.f33452c.length) {
                for (int i10 = 0; i10 < t52VarB.f33452c.length; i10++) {
                    if (s82.a(t52VarB.f33451b[i10], t52VarF.f33451b[i10]) && s82.a(t52VarB.f33452c[i10], t52VarF.f33452c[i10])) {
                    }
                }
                if (ew0VarE == ew0VarF) {
                    z10 = false;
                }
            }
            if (z10) {
                ew0 ew0VarE2 = this.f31240t.e();
                boolean zA = this.f31240t.a(ew0VarE2);
                boolean[] zArr = new boolean[this.f31223b.length];
                long jA = ew0VarE2.a(t52VarB, this.f31245y.f33610r, zA, zArr);
                th1 th1Var = this.f31245y;
                boolean z11 = (th1Var.f33598e == 4 || jA == th1Var.f33610r) ? false : true;
                th1 th1Var2 = this.f31245y;
                i = 4;
                this.f31245y = a(th1Var2.f33595b, jA, th1Var2.f33596c, th1Var2.f33597d, z11, 5);
                if (z11) {
                    b(jA);
                }
                boolean[] zArr2 = new boolean[this.f31223b.length];
                int i11 = 0;
                while (true) {
                    so1[] so1VarArr = this.f31223b;
                    if (i11 >= so1VarArr.length) {
                        break;
                    }
                    so1 so1Var = so1VarArr[i11];
                    boolean zB = b(so1Var);
                    zArr2[i11] = zB;
                    ft1 ft1Var = ew0VarE2.f27056c[i11];
                    if (zB) {
                        if (ft1Var != so1Var.g()) {
                            a(so1Var);
                        } else if (zArr[i11]) {
                            so1Var.a(this.f31218M);
                        }
                    }
                    i11++;
                }
                a(zArr2);
            } else {
                i = 4;
                this.f31240t.a(ew0VarE);
                if (ew0VarE.f27057d) {
                    ew0VarE.a(t52VarB, Math.max(ew0VarE.f27059f.f28013b, ew0VarE.c(this.f31218M)));
                }
            }
            a(true);
            if (this.f31245y.f33598e != i) {
                f();
                s();
                this.i.a(2);
                return;
            }
            return;
        }
    }

    private void n() {
        ew0 ew0VarE = this.f31240t.e();
        this.f31208C = ew0VarE != null && ew0VarE.f27059f.f28019h && this.f31207B;
    }

    private boolean o() {
        th1 th1Var = this.f31245y;
        return th1Var.f33604l && th1Var.f33605m == 0;
    }

    private void q() throws h60 {
        this.f31236p.b();
        for (so1 so1Var : this.f31223b) {
            if (b(so1Var) && so1Var.getState() == 2) {
                so1Var.stop();
            }
        }
    }

    private void r() {
        ew0 ew0VarD = this.f31240t.d();
        boolean z10 = this.f31210E || (ew0VarD != null && ew0VarD.f27054a.isLoading());
        th1 th1Var = this.f31245y;
        if (z10 != th1Var.f33600g) {
            this.f31245y = new th1(th1Var.f33594a, th1Var.f33595b, th1Var.f33596c, th1Var.f33597d, th1Var.f33598e, th1Var.f33599f, z10, th1Var.f33601h, th1Var.i, th1Var.f33602j, th1Var.f33603k, th1Var.f33604l, th1Var.f33605m, th1Var.f33606n, th1Var.f33608p, th1Var.f33609q, th1Var.f33610r, th1Var.f33607o);
        }
    }

    private void s() throws h60 {
        long j4;
        ew0 ew0VarE = this.f31240t.e();
        if (ew0VarE == null) {
            return;
        }
        long discontinuity = ew0VarE.f27057d ? ew0VarE.f27054a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            b(discontinuity);
            if (discontinuity != this.f31245y.f33610r) {
                th1 th1Var = this.f31245y;
                long j10 = discontinuity;
                this.f31245y = a(th1Var.f33595b, j10, th1Var.f33596c, j10, true, 5);
            }
        } else {
            long jA = this.f31236p.a(ew0VarE != this.f31240t.f());
            this.f31218M = jA;
            long jC = ew0VarE.c(jA);
            long j11 = this.f31245y.f33610r;
            if (!this.f31237q.isEmpty() && !this.f31245y.f33595b.a()) {
                if (this.f31220O) {
                    j11--;
                    this.f31220O = false;
                }
                th1 th1Var2 = this.f31245y;
                int iA = th1Var2.f33594a.a(th1Var2.f33595b.f27470a);
                int iMin = Math.min(this.f31219N, this.f31237q.size());
                c cVar = iMin > 0 ? this.f31237q.get(iMin - 1) : null;
                while (cVar != null && (iA < 0 || (iA == 0 && 0 > j11))) {
                    int i = iMin - 1;
                    cVar = i > 0 ? this.f31237q.get(iMin - 2) : null;
                    iMin = i;
                }
                if (iMin < this.f31237q.size()) {
                    this.f31237q.get(iMin);
                }
                this.f31219N = iMin;
            }
            this.f31245y.f33610r = jC;
        }
        ew0 ew0VarD = this.f31240t.d();
        th1 th1Var3 = this.f31245y;
        if (ew0VarD.f27057d) {
            long bufferedPositionUs = ew0VarD.f27058e ? ew0VarD.f27054a.getBufferedPositionUs() : Long.MIN_VALUE;
            j4 = bufferedPositionUs == Long.MIN_VALUE ? ew0VarD.f27059f.f28016e : bufferedPositionUs;
        } else {
            j4 = ew0VarD.f27059f.f28013b;
        }
        th1Var3.f33608p = j4;
        th1 th1Var4 = this.f31245y;
        th1Var4.f33609q = a(th1Var4.f33608p);
        th1 th1Var5 = this.f31245y;
        if (th1Var5.f33604l && th1Var5.f33598e == 3 && a(th1Var5.f33594a, th1Var5.f33595b)) {
            th1 th1Var6 = this.f31245y;
            if (th1Var6.f33606n.f34542b == 1.0f) {
                float fA = ((wz) this.f31242v).a(a(th1Var6.f33594a, th1Var6.f33595b.f27470a, th1Var6.f33610r), a(this.f31245y.f33608p));
                if (this.f31236p.getPlaybackParameters().f34542b != fA) {
                    this.f31236p.a(new vh1(fA, this.f31245y.f33606n.f34543c));
                    a(this.f31245y.f33606n, this.f31236p.getPlaybackParameters().f34542b, false, false);
                }
            }
        }
    }

    public final void h() {
        this.i.a(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ew0 ew0VarF;
        try {
            switch (message.what) {
                case 0:
                    j();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((vh1) message.obj);
                    break;
                case 5:
                    this.f31244x = (uw1) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    l();
                    return true;
                case 8:
                    c((dw0) message.obj);
                    break;
                case 9:
                    b((dw0) message.obj);
                    break;
                case 10:
                    m();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    hi1 hi1Var = (hi1) message.obj;
                    hi1Var.getClass();
                    if (hi1Var.a() != this.f31231k) {
                        this.i.a(15, hi1Var).a();
                        break;
                    } else {
                        a(hi1Var);
                        int i = this.f31245y.f33598e;
                        if (i == 3 || i == 2) {
                            this.i.a(2);
                            break;
                        }
                    }
                case 15:
                    d((hi1) message.obj);
                    break;
                case 16:
                    vh1 vh1Var = (vh1) message.obj;
                    a(vh1Var, vh1Var.f34542b, true, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (xx1) message.obj);
                    break;
                case 21:
                    a((xx1) message.obj);
                    break;
                case 22:
                    g();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (b40.a e4) {
            a(e4, e4.f25078b);
        } catch (h60 e10) {
            e = e10;
            if (e.f28096d == 1 && (ew0VarF = this.f31240t.f()) != null) {
                e = e.a(ew0VarF.f27059f.f28012a);
            }
            if (e.f28101j && this.f31221P == null) {
                rs0.b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f31221P = e;
                bf0 bf0Var = this.i;
                bf0Var.a(bf0Var.a(25, e));
            } else {
                h60 h60Var = this.f31221P;
                if (h60Var != null) {
                    h60Var.addSuppressed(e);
                    e = this.f31221P;
                }
                rs0.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f31245y = this.f31245y.a(e);
            }
        } catch (pv e11) {
            a(e11, e11.f31923b);
        } catch (yf1 e12) {
            int i10 = e12.f35783c;
            if (i10 == 1) {
                i = e12.f35782b ? 3001 : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i10 == 4) {
                i = e12.f35782b ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            a(e12, i);
        } catch (IOException e13) {
            a(e13, 2000);
        } catch (RuntimeException e14) {
            h60 h60VarA = h60.a(e14, ((e14 instanceof IllegalStateException) || (e14 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            rs0.a("ExoPlayerImplInternal", "Playback error", h60VarA);
            a(true, false);
            this.f31245y = this.f31245y.a(h60VarA);
        }
        d dVar = this.f31246z;
        th1 th1Var = this.f31245y;
        boolean z10 = dVar.f31251a | (dVar.f31252b != th1Var);
        dVar.f31251a = z10;
        dVar.f31252b = th1Var;
        if (z10) {
            this.f31239s.a(dVar);
            this.f31246z = new d(this.f31245y);
        }
        return true;
    }

    public final void i() {
        this.i.b(0).a();
    }

    public final synchronized boolean k() {
        if (!this.f31206A && this.f31230j.isAlive()) {
            this.i.a(7);
            a(new T0(this, 2), this.f31243w);
            return this.f31206A;
        }
        return true;
    }

    public final void p() {
        this.i.b(6).a();
    }

    private void a(a aVar, int i) throws Throwable {
        this.f31246z.a(1);
        mw0 mw0Var = this.f31241u;
        if (i == -1) {
            i = mw0Var.b();
        }
        a(mw0Var.a(i, aVar.f31247a, aVar.f31248b), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05ec  */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.yandex.mobile.ads.impl.t52] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [int] */
    /* JADX WARN: Type inference failed for: r5v69, types: [com.yandex.mobile.ads.impl.c70[]] */
    /* JADX WARN: Type inference failed for: r5v70, types: [com.yandex.mobile.ads.impl.p52] */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70, types: [int] */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44, types: [int] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() throws java.io.IOException, com.yandex.mobile.ads.impl.h60 {
        /*
            Method dump skipped, instructions count: 1741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o60.b():void");
    }

    private long c() {
        ew0 ew0VarF = this.f31240t.f();
        if (ew0VarF == null) {
            return 0L;
        }
        long jC = ew0VarF.c();
        if (!ew0VarF.f27057d) {
            return jC;
        }
        int i = 0;
        while (true) {
            so1[] so1VarArr = this.f31223b;
            if (i >= so1VarArr.length) {
                return jC;
            }
            if (b(so1VarArr[i]) && this.f31223b[i].g() == ew0VarF.f27056c[i]) {
                long j4 = this.f31223b[i].j();
                if (j4 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jC = Math.max(j4, jC);
            }
            i++;
        }
    }

    private void e(boolean z10) throws h60 {
        this.f31212G = z10;
        if (!this.f31240t.a(this.f31245y.f33594a, z10)) {
            b(true);
        }
        a(false);
    }

    public final Looper d() {
        return this.f31231k;
    }

    private void d(hi1 hi1Var) {
        Looper looperA = hi1Var.a();
        if (!looperA.getThread().isAlive()) {
            rs0.d("TAG", "Trying to send message on a dead thread.");
            hi1Var.a(false);
        } else {
            this.f31238r.a(looperA, null).a(new I2(1, this, hi1Var));
        }
    }

    private static void a(hi1 hi1Var) throws h60 {
        synchronized (hi1Var) {
        }
        try {
            hi1Var.c().a(hi1Var.d(), hi1Var.b());
        } finally {
            hi1Var.a(true);
        }
    }

    private void c(dw0 dw0Var) throws h60 {
        if (this.f31240t.a(dw0Var)) {
            ew0 ew0VarD = this.f31240t.d();
            ew0VarD.a(this.f31236p.getPlaybackParameters().f34542b, this.f31245y.f33594a);
            this.f31228g.a(this.f31223b, ew0VarD.f().f33452c);
            if (ew0VarD == this.f31240t.e()) {
                b(ew0VarD.f27059f.f28013b);
                a(new boolean[this.f31223b.length]);
                th1 th1Var = this.f31245y;
                jw0.b bVar = th1Var.f33595b;
                long j4 = ew0VarD.f27059f.f28013b;
                this.f31245y = a(bVar, j4, th1Var.f33596c, j4, false, 5);
            }
            f();
        }
    }

    private void d(boolean z10) throws h60 {
        this.f31207B = z10;
        n();
        if (!this.f31208C || this.f31240t.f() == this.f31240t.e()) {
            return;
        }
        b(true);
        a(false);
    }

    private void a(so1 so1Var) throws h60 {
        if (b(so1Var)) {
            this.f31236p.a(so1Var);
            if (so1Var.getState() == 2) {
                so1Var.stop();
            }
            so1Var.c();
            this.f31216K--;
        }
    }

    private void a(boolean[] zArr) throws h60 {
        ew0 ew0VarF = this.f31240t.f();
        t52 t52VarF = ew0VarF.f();
        for (int i = 0; i < this.f31223b.length; i++) {
            if (!t52VarF.a(i) && this.f31224c.remove(this.f31223b[i])) {
                this.f31223b[i].b();
            }
        }
        for (int i10 = 0; i10 < this.f31223b.length; i10++) {
            if (t52VarF.a(i10)) {
                boolean z10 = zArr[i10];
                so1 so1Var = this.f31223b[i10];
                if (!b(so1Var)) {
                    ew0 ew0VarF2 = this.f31240t.f();
                    boolean z11 = ew0VarF2 == this.f31240t.e();
                    t52 t52VarF2 = ew0VarF2.f();
                    uo1 uo1Var = t52VarF2.f33451b[i10];
                    c70 c70Var = t52VarF2.f33452c[i10];
                    int iB = c70Var != null ? c70Var.b() : 0;
                    dc0[] dc0VarArr = new dc0[iB];
                    for (int i11 = 0; i11 < iB; i11++) {
                        dc0VarArr[i11] = c70Var.a(i11);
                    }
                    boolean z12 = o() && this.f31245y.f33598e == 3;
                    boolean z13 = !z10 && z12;
                    this.f31216K++;
                    this.f31224c.add(so1Var);
                    so1Var.a(uo1Var, dc0VarArr, ew0VarF2.f27056c[i10], this.f31218M, z13, z11, ew0VarF2.d(), ew0VarF2.c());
                    so1Var.a(11, new n60(this));
                    this.f31236p.b(so1Var);
                    if (z12) {
                        so1Var.start();
                    }
                }
            }
        }
        ew0VarF.f27060g = true;
    }

    public final synchronized void c(hi1 hi1Var) {
        if (!this.f31206A && this.f31230j.isAlive()) {
            this.i.a(14, hi1Var).a();
            return;
        }
        rs0.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        hi1Var.a(false);
    }

    private void c(boolean z10) {
        if (z10 == this.f31215J) {
            return;
        }
        this.f31215J = z10;
        if (z10 || !this.f31245y.f33607o) {
            return;
        }
        this.i.a(2);
    }

    private long a(v42 v42Var, Object obj, long j4) {
        long jElapsedRealtime;
        v42Var.a(v42Var.a(obj, this.f31233m).f34345d, this.f31232l, 0L);
        v42.d dVar = this.f31232l;
        if (dVar.f34363g != -9223372036854775807L && dVar.a()) {
            v42.d dVar2 = this.f31232l;
            if (dVar2.f34365j) {
                long j10 = dVar2.f34364h;
                int i = s82.f32899a;
                if (j10 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = j10 + SystemClock.elapsedRealtime();
                }
                return s82.a(jElapsedRealtime - this.f31232l.f34363g) - (j4 + this.f31233m.f34347f);
            }
        }
        return -9223372036854775807L;
    }

    private Pair<jw0.b, Long> a(v42 v42Var) {
        long jB = 0;
        if (v42Var.c()) {
            return Pair.create(th1.a(), 0L);
        }
        Pair<Object, Long> pairA = v42Var.a(this.f31232l, this.f31233m, v42Var.a(this.f31212G), -9223372036854775807L);
        jw0.b bVarA = this.f31240t.a(v42Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (bVarA.a()) {
            v42Var.a(bVarA.f27470a, this.f31233m);
            if (bVarA.f27472c == this.f31233m.d(bVarA.f27471b)) {
                jB = this.f31233m.b();
            }
        } else {
            jB = jLongValue;
        }
        return Pair.create(bVarA, Long.valueOf(jB));
    }

    private long a(long j4) {
        ew0 ew0VarD = this.f31240t.d();
        if (ew0VarD == null) {
            return 0L;
        }
        return Math.max(0L, j4 - ew0VarD.c(this.f31218M));
    }

    private void a(IOException iOException, int i) {
        h60 h60VarA = h60.a(iOException, i);
        ew0 ew0VarE = this.f31240t.e();
        if (ew0VarE != null) {
            h60VarA = h60VarA.a(ew0VarE.f27059f.f28012a);
        }
        rs0.a("ExoPlayerImplInternal", "Playback error", h60VarA);
        a(false, false);
        this.f31245y = this.f31245y.a(h60VarA);
    }

    private void a(boolean z10) {
        long j4;
        ew0 ew0VarD = this.f31240t.d();
        jw0.b bVar = ew0VarD == null ? this.f31245y.f33595b : ew0VarD.f27059f.f28012a;
        boolean zEquals = this.f31245y.f33603k.equals(bVar);
        if (!zEquals) {
            this.f31245y = this.f31245y.a(bVar);
        }
        th1 th1Var = this.f31245y;
        if (ew0VarD == null) {
            j4 = th1Var.f33610r;
        } else if (!ew0VarD.f27057d) {
            j4 = ew0VarD.f27059f.f28013b;
        } else {
            long bufferedPositionUs = ew0VarD.f27058e ? ew0VarD.f27054a.getBufferedPositionUs() : Long.MIN_VALUE;
            j4 = bufferedPositionUs == Long.MIN_VALUE ? ew0VarD.f27059f.f28016e : bufferedPositionUs;
        }
        th1Var.f33608p = j4;
        th1 th1Var2 = this.f31245y;
        th1Var2.f33609q = a(th1Var2.f33608p);
        if ((!zEquals || z10) && ew0VarD != null && ew0VarD.f27057d) {
            this.f31228g.a(this.f31223b, ew0VarD.f().f33452c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0213  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v9, types: [long] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v21 */
    /* JADX WARN: Type inference failed for: r22v25 */
    /* JADX WARN: Type inference failed for: r22v27 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.yandex.mobile.ads.impl.v42 r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o60.a(com.yandex.mobile.ads.impl.v42, boolean):void");
    }

    private void b(dw0 dw0Var) {
        if (this.f31240t.a(dw0Var)) {
            this.f31240t.a(this.f31218M);
            f();
        }
    }

    private static boolean b(so1 so1Var) {
        return so1Var.getState() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(hi1 hi1Var) {
        try {
            a(hi1Var);
        } catch (h60 e4) {
            rs0.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
            throw new RuntimeException(e4);
        }
    }

    private void b(long j4) throws h60 {
        ew0 ew0VarE = this.f31240t.e();
        long jD = ew0VarE == null ? j4 + 1000000000000L : ew0VarE.d(j4);
        this.f31218M = jD;
        this.f31236p.a(jD);
        for (so1 so1Var : this.f31223b) {
            if (b(so1Var)) {
                so1Var.a(this.f31218M);
            }
        }
        for (ew0 ew0VarE2 = this.f31240t.e(); ew0VarE2 != null; ew0VarE2 = ew0VarE2.b()) {
            for (c70 c70Var : ew0VarE2.f().f33452c) {
                if (c70Var != null) {
                    c70Var.f();
                }
            }
        }
    }

    private void a(vh1 vh1Var, float f10, boolean z10, boolean z11) throws h60 {
        vh1 vh1Var2;
        int i;
        if (z10) {
            if (z11) {
                this.f31246z.a(1);
            }
            th1 th1Var = this.f31245y;
            th1 th1Var2 = new th1(th1Var.f33594a, th1Var.f33595b, th1Var.f33596c, th1Var.f33597d, th1Var.f33598e, th1Var.f33599f, th1Var.f33600g, th1Var.f33601h, th1Var.i, th1Var.f33602j, th1Var.f33603k, th1Var.f33604l, th1Var.f33605m, vh1Var, th1Var.f33608p, th1Var.f33609q, th1Var.f33610r, th1Var.f33607o);
            vh1Var2 = vh1Var;
            this.f31245y = th1Var2;
        } else {
            vh1Var2 = vh1Var;
        }
        float f11 = vh1Var2.f34542b;
        ew0 ew0VarE = this.f31240t.e();
        while (true) {
            i = 0;
            if (ew0VarE == null) {
                break;
            }
            c70[] c70VarArr = ew0VarE.f().f33452c;
            int length = c70VarArr.length;
            while (i < length) {
                c70 c70Var = c70VarArr[i];
                if (c70Var != null) {
                    c70Var.a(f11);
                }
                i++;
            }
            ew0VarE = ew0VarE.b();
        }
        so1[] so1VarArr = this.f31223b;
        int length2 = so1VarArr.length;
        while (i < length2) {
            so1 so1Var = so1VarArr[i];
            if (so1Var != null) {
                so1Var.a(f10, vh1Var2.f34542b);
            }
            i++;
        }
    }

    private void b(boolean z10) throws h60 {
        jw0.b bVar = this.f31240t.e().f27059f.f28012a;
        long jA = a(bVar, this.f31245y.f33610r, true, false);
        if (jA != this.f31245y.f33610r) {
            th1 th1Var = this.f31245y;
            this.f31245y = a(bVar, jA, th1Var.f33596c, th1Var.f33597d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.th1 a(com.yandex.mobile.ads.impl.jw0.b r26, long r27, long r29, long r31, boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o60.a(com.yandex.mobile.ads.impl.jw0$b, long, long, long, boolean, int):com.yandex.mobile.ads.impl.th1");
    }

    private void b(vh1 vh1Var) throws h60 {
        this.f31236p.a(vh1Var);
        vh1 playbackParameters = this.f31236p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f34542b, true, true);
    }

    private void b(int i) {
        th1 th1Var = this.f31245y;
        if (th1Var.f33598e != i) {
            if (i != 2) {
                this.f31222Q = -9223372036854775807L;
            }
            this.f31245y = th1Var.a(i);
        }
    }

    private void a(b bVar) throws Throwable {
        this.f31246z.a(1);
        mw0 mw0Var = this.f31241u;
        bVar.getClass();
        a(mw0Var.d(), false);
    }

    @Override // com.yandex.mobile.ads.impl.bx1.a
    public final void a(bx1 bx1Var) {
        this.i.a(9, (dw0) bx1Var).a();
    }

    public final void a(vh1 vh1Var) {
        this.i.a(16, vh1Var).a();
    }

    @Override // com.yandex.mobile.ads.impl.dw0.a
    public final void a(dw0 dw0Var) {
        this.i.a(8, dw0Var).a();
    }

    @Override // com.yandex.mobile.ads.impl.s52.a
    public final void a() {
        this.i.a(10);
    }

    private void a(int i, int i10, xx1 xx1Var) throws Throwable {
        this.f31246z.a(1);
        a(this.f31241u.a(i, i10, xx1Var), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[PHI: r4 r5 r7
  0x00b0: PHI (r4v3 com.yandex.mobile.ads.impl.jw0$b) = (r4v2 com.yandex.mobile.ads.impl.jw0$b), (r4v8 com.yandex.mobile.ads.impl.jw0$b) binds: [B:32:0x0085, B:34:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:32:0x0085, B:34:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:32:0x0085, B:34:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.o60.a(boolean, boolean, boolean, boolean):void");
    }

    private void a(v42 v42Var, v42 v42Var2) {
        if (v42Var.c() && v42Var2.c()) {
            return;
        }
        int size = this.f31237q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f31237q);
        } else {
            this.f31237q.get(size).getClass();
            throw null;
        }
    }

    private static Pair<Object, Long> a(v42 v42Var, g gVar, boolean z10, int i, boolean z11, v42.d dVar, v42.b bVar) {
        Pair<Object, Long> pairA;
        v42 v42Var2;
        Object objA;
        v42 v42Var3 = gVar.f31264a;
        if (v42Var.c()) {
            return null;
        }
        if (v42Var3.c()) {
            v42Var3 = v42Var;
        }
        try {
            pairA = v42Var3.a(dVar, bVar, gVar.f31265b, gVar.f31266c);
            v42Var2 = v42Var3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (v42Var.equals(v42Var2)) {
            return pairA;
        }
        if (v42Var.a(pairA.first) != -1) {
            return (v42Var2.a(pairA.first, bVar).f34348g && v42Var2.a(bVar.f34345d, dVar, 0L).f34371p == v42Var2.a(pairA.first)) ? v42Var.a(dVar, bVar, v42Var.a(pairA.first, bVar).f34345d, gVar.f31266c) : pairA;
        }
        if (z10 && (objA = a(dVar, bVar, i, z11, pairA.first, v42Var2, v42Var)) != null) {
            return v42Var.a(dVar, bVar, v42Var.a(objA, bVar).f34345d, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(v42.d dVar, v42.b bVar, int i, boolean z10, Object obj, v42 v42Var, v42 v42Var2) {
        int iA = v42Var.a(obj);
        int iA2 = v42Var.a();
        int i10 = 0;
        int iA3 = iA;
        int iA4 = -1;
        while (i10 < iA2 && iA4 == -1) {
            v42.d dVar2 = dVar;
            v42.b bVar2 = bVar;
            int i11 = i;
            boolean z11 = z10;
            v42 v42Var3 = v42Var;
            iA3 = v42Var3.a(iA3, bVar2, dVar2, i11, z11);
            if (iA3 == -1) {
                break;
            }
            iA4 = v42Var2.a(v42Var3.a(iA3));
            i10++;
            v42Var = v42Var3;
            bVar = bVar2;
            dVar = dVar2;
            i = i11;
            z10 = z11;
        }
        if (iA4 == -1) {
            return null;
        }
        return v42Var2.a(iA4);
    }

    private void a(g gVar) throws Throwable {
        long jLongValue;
        jw0.b bVarA;
        long j4;
        boolean z10;
        long j10;
        boolean z11;
        jw0.b bVar;
        long j11;
        long jA;
        long j12;
        th1 th1Var;
        int i;
        long jA2;
        boolean z12;
        th1 th1Var2;
        jw0.b bVar2;
        jw0.b bVar3;
        boolean z13;
        long j13;
        this.f31246z.a(1);
        Pair<Object, Long> pairA = a(this.f31245y.f33594a, gVar, true, this.f31211F, this.f31212G, this.f31232l, this.f31233m);
        if (pairA == null) {
            Pair<jw0.b, Long> pairA2 = a(this.f31245y.f33594a);
            bVarA = (jw0.b) pairA2.first;
            jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f31245y.f33594a.c();
            j10 = -9223372036854775807L;
            j4 = 0;
        } else {
            Object obj = pairA.first;
            jLongValue = ((Long) pairA.second).longValue();
            long j14 = gVar.f31266c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            bVarA = this.f31240t.a(this.f31245y.f33594a, obj, jLongValue);
            if (bVarA.a()) {
                this.f31245y.f33594a.a(bVarA.f27470a, this.f31233m);
                jLongValue = this.f31233m.d(bVarA.f27471b) == bVarA.f27472c ? this.f31233m.b() : 0L;
                j4 = 0;
            } else {
                j4 = 0;
                if (gVar.f31266c != -9223372036854775807L) {
                    z10 = false;
                }
                j10 = j14;
            }
            z10 = true;
            j10 = j14;
        }
        try {
            if (this.f31245y.f33594a.c()) {
                this.f31217L = gVar;
            } else if (pairA == null) {
                if (this.f31245y.f33598e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (bVarA.equals(this.f31245y.f33595b)) {
                    try {
                        ew0 ew0VarE = this.f31240t.e();
                        jA = (ew0VarE == null || !ew0VarE.f27057d || jLongValue == j4) ? jLongValue : ew0VarE.f27054a.a(jLongValue, this.f31244x);
                        if (s82.b(jA) != s82.b(this.f31245y.f33610r) || ((i = (th1Var = this.f31245y).f33598e) != 2 && i != 3)) {
                            z11 = z10;
                            j12 = j10;
                            bVar = bVarA;
                        }
                        long j15 = th1Var.f33610r;
                        this.f31245y = a(bVarA, j15, j10, j15, z10, 2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z11 = z10;
                        bVar = bVarA;
                        j11 = jLongValue;
                        this.f31245y = a(bVar, j11, j10, j11, z11, 2);
                        throw th;
                    }
                }
                z11 = z10;
                j12 = j10;
                bVar = bVarA;
                jA = jLongValue;
                try {
                    jA2 = a(bVar, jA, this.f31240t.e() != this.f31240t.f(), this.f31245y.f33598e == 4);
                    z12 = z11 | (jLongValue != jA2);
                    try {
                        th1Var2 = this.f31245y;
                        bVar2 = bVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = j12;
                    j11 = jLongValue;
                    this.f31245y = a(bVar, j11, j10, j11, z11, 2);
                    throw th;
                }
                try {
                    v42 v42Var = th1Var2.f33594a;
                    long j16 = j12;
                    try {
                        a(v42Var, bVar2, v42Var, th1Var2.f33595b, j16);
                        bVar3 = bVar2;
                        j10 = j16;
                        z13 = z12;
                        j13 = jA2;
                        this.f31245y = a(bVar3, j13, j10, j13, z13, 2);
                    } catch (Throwable th4) {
                        th = th4;
                        bVar = bVar2;
                        j10 = j16;
                        z11 = z12;
                        j11 = jA2;
                        this.f31245y = a(bVar, j11, j10, j11, z11, 2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bVar = bVar2;
                    j10 = j12;
                    z11 = z12;
                    j11 = jA2;
                    this.f31245y = a(bVar, j11, j10, j11, z11, 2);
                    throw th;
                }
            }
            z13 = z10;
            bVar3 = bVarA;
            j13 = jLongValue;
            this.f31245y = a(bVar3, j13, j10, j13, z13, 2);
        } catch (Throwable th6) {
            th = th6;
            z11 = z10;
        }
    }

    private long a(jw0.b bVar, long j4, boolean z10, boolean z11) throws h60 {
        long jSeekToUs;
        ew0 ew0Var;
        q();
        this.f31209D = false;
        if (z11 || this.f31245y.f33598e == 3) {
            b(2);
        }
        ew0 ew0VarE = this.f31240t.e();
        ew0 ew0VarB = ew0VarE;
        while (ew0VarB != null && !bVar.equals(ew0VarB.f27059f.f28012a)) {
            ew0VarB = ew0VarB.b();
        }
        if (z10 || ew0VarE != ew0VarB || (ew0VarB != null && ew0VarB.d(j4) < 0)) {
            for (so1 so1Var : this.f31223b) {
                a(so1Var);
            }
            if (ew0VarB != null) {
                while (this.f31240t.e() != ew0VarB) {
                    this.f31240t.a();
                }
                this.f31240t.a(ew0VarB);
                ew0VarB.h();
                a(new boolean[this.f31223b.length]);
            }
        }
        if (ew0VarB != null) {
            this.f31240t.a(ew0VarB);
            if (!ew0VarB.f27057d) {
                gw0 gw0Var = ew0VarB.f27059f;
                if (j4 == gw0Var.f28013b) {
                    ew0Var = ew0VarB;
                } else {
                    ew0Var = ew0VarB;
                    gw0Var = new gw0(gw0Var.f28012a, j4, gw0Var.f28014c, gw0Var.f28015d, gw0Var.f28016e, gw0Var.f28017f, gw0Var.f28018g, gw0Var.f28019h, gw0Var.i);
                }
                ew0Var.f27059f = gw0Var;
            } else {
                ew0 ew0Var2 = ew0VarB;
                if (ew0Var2.f27058e) {
                    jSeekToUs = ew0Var2.f27054a.seekToUs(j4);
                    ew0Var2.f27054a.discardBuffer(jSeekToUs - this.f31234n, this.f31235o);
                }
                b(jSeekToUs);
                f();
            }
            jSeekToUs = j4;
            b(jSeekToUs);
            f();
        } else {
            this.f31240t.c();
            b(j4);
            jSeekToUs = j4;
        }
        a(false);
        this.i.a(2);
        return jSeekToUs;
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f31213H != z10) {
            this.f31213H = z10;
            if (!z10) {
                for (so1 so1Var : this.f31223b) {
                    if (!b(so1Var) && this.f31224c.remove(so1Var)) {
                        so1Var.b();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(a aVar) throws Throwable {
        this.f31246z.a(1);
        if (aVar.f31249c != -1) {
            this.f31217L = new g(new cj1(aVar.f31247a, aVar.f31248b), aVar.f31249c, aVar.f31250d);
        }
        a(this.f31241u.a(aVar.f31247a, aVar.f31248b), false);
    }

    public final void a(int i, long j4, xx1 xx1Var, ArrayList arrayList) {
        this.i.a(17, new a(i, j4, xx1Var, arrayList, 0)).a();
    }

    public final void a(boolean z10, int i) {
        this.i.a(z10 ? 1 : 0, i).a();
    }

    private void a(boolean z10, int i, boolean z11, int i10) throws h60 {
        this.f31246z.a(z11 ? 1 : 0);
        d dVar = this.f31246z;
        dVar.f31251a = true;
        dVar.f31256f = true;
        dVar.f31257g = i10;
        th1 th1Var = this.f31245y;
        this.f31245y = new th1(th1Var.f33594a, th1Var.f33595b, th1Var.f33596c, th1Var.f33597d, th1Var.f33598e, th1Var.f33599f, th1Var.f33600g, th1Var.f33601h, th1Var.i, th1Var.f33602j, th1Var.f33603k, z10, i, th1Var.f33606n, th1Var.f33608p, th1Var.f33609q, th1Var.f33610r, th1Var.f33607o);
        this.f31209D = false;
        for (ew0 ew0VarE = this.f31240t.e(); ew0VarE != null; ew0VarE = ew0VarE.b()) {
            for (c70 c70Var : ew0VarE.f().f33452c) {
                if (c70Var != null) {
                    c70Var.a(z10);
                }
            }
        }
        if (!o()) {
            q();
            s();
            return;
        }
        int i11 = this.f31245y.f33598e;
        if (i11 != 3) {
            if (i11 == 2) {
                this.i.a(2);
                return;
            }
            return;
        }
        this.f31209D = false;
        this.f31236p.a();
        for (so1 so1Var : this.f31223b) {
            if (b(so1Var)) {
                so1Var.start();
            }
        }
        this.i.a(2);
    }

    private void a(int i) throws h60 {
        this.f31211F = i;
        if (!this.f31240t.a(this.f31245y.f33594a, i)) {
            b(true);
        }
        a(false);
    }

    private void a(xx1 xx1Var) throws Throwable {
        this.f31246z.a(1);
        a(this.f31241u.a(xx1Var), false);
    }

    private boolean a(v42 v42Var, jw0.b bVar) {
        if (!bVar.a() && !v42Var.c()) {
            v42Var.a(v42Var.a(bVar.f27470a, this.f31233m).f34345d, this.f31232l, 0L);
            if (this.f31232l.a()) {
                v42.d dVar = this.f31232l;
                if (dVar.f34365j && dVar.f34363g != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(boolean z10, boolean z11) {
        a(z10 || !this.f31213H, false, true, false);
        this.f31246z.a(z11 ? 1 : 0);
        this.f31228g.d();
        b(1);
    }

    private void a(v42 v42Var, jw0.b bVar, v42 v42Var2, jw0.b bVar2, long j4) {
        if (!a(v42Var, bVar)) {
            vh1 vh1Var = bVar.a() ? vh1.f34541e : this.f31245y.f33606n;
            if (this.f31236p.getPlaybackParameters().equals(vh1Var)) {
                return;
            }
            this.f31236p.a(vh1Var);
            return;
        }
        v42Var.a(v42Var.a(bVar.f27470a, this.f31233m).f34345d, this.f31232l, 0L);
        or0 or0Var = this.f31242v;
        xv0.e eVar = this.f31232l.f34367l;
        int i = s82.f32899a;
        ((wz) or0Var).a(eVar);
        if (j4 != -9223372036854775807L) {
            ((wz) this.f31242v).a(a(v42Var, bVar.f27470a, j4));
            return;
        }
        if (s82.a(!v42Var2.c() ? v42Var2.a(v42Var2.a(bVar2.f27470a, this.f31233m).f34345d, this.f31232l, 0L).f34358b : null, this.f31232l.f34358b)) {
            return;
        }
        ((wz) this.f31242v).a(-9223372036854775807L);
    }

    private synchronized void a(h32<Boolean> h32Var, long j4) {
        long jB = this.f31238r.b() + j4;
        boolean z10 = false;
        while (!h32Var.get().booleanValue() && j4 > 0) {
            try {
                this.f31238r.getClass();
                wait(j4);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j4 = jB - this.f31238r.b();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
