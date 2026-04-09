package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.recyclerview.widget.C0305b;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class UN extends VL {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f11644s0 = 0;

    /* renamed from: C, reason: collision with root package name */
    public final CopyOnWriteArraySet f11645C;

    /* renamed from: D, reason: collision with root package name */
    public final I7 f11646D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f11647E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f11648F;

    /* renamed from: G, reason: collision with root package name */
    public final GO f11649G;

    /* renamed from: H, reason: collision with root package name */
    public final Looper f11650H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC1452l f11651I;

    /* renamed from: J, reason: collision with root package name */
    public final C1994v2 f11652J;

    /* renamed from: K, reason: collision with root package name */
    public final NN f11653K;

    /* renamed from: L, reason: collision with root package name */
    public final C2153y f11654L;
    public final Ou M;

    /* renamed from: N, reason: collision with root package name */
    public final C1778r2 f11655N;

    /* renamed from: O, reason: collision with root package name */
    public final long f11656O;

    /* renamed from: P, reason: collision with root package name */
    public final C0305b f11657P;

    /* renamed from: Q, reason: collision with root package name */
    public final K4.c f11658Q;

    /* renamed from: R, reason: collision with root package name */
    public final C2041vw f11659R;

    /* renamed from: S, reason: collision with root package name */
    public final HashMap f11660S;

    /* renamed from: T, reason: collision with root package name */
    public int f11661T;

    /* renamed from: U, reason: collision with root package name */
    public int f11662U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f11663V;

    /* renamed from: W, reason: collision with root package name */
    public final C2124xO f11664W;

    /* renamed from: X, reason: collision with root package name */
    public final C2178yO f11665X;

    /* renamed from: Y, reason: collision with root package name */
    public final KN f11666Y;

    /* renamed from: Z, reason: collision with root package name */
    public Z5 f11667Z;

    /* renamed from: a0, reason: collision with root package name */
    public C1348j3 f11668a0;
    public Object b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1184g f11669c;

    /* renamed from: c0, reason: collision with root package name */
    public Surface f11670c0;

    /* renamed from: d, reason: collision with root package name */
    public final Z5 f11671d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f11672d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0494Em f11673e;

    /* renamed from: e0, reason: collision with root package name */
    public Ar f11674e0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f11675f;

    /* renamed from: f0, reason: collision with root package name */
    public final C0729Sj f11676f0;

    /* renamed from: g, reason: collision with root package name */
    public final C2232zO f11677g;

    /* renamed from: g0, reason: collision with root package name */
    public float f11678g0;

    /* renamed from: h, reason: collision with root package name */
    public final PP[] f11679h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11680h0;
    public final PP[] i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f11681i0;

    /* renamed from: j, reason: collision with root package name */
    public final C0911b f11682j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f11683j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1231gt f11684k;

    /* renamed from: k0, reason: collision with root package name */
    public final int f11685k0;

    /* renamed from: l, reason: collision with root package name */
    public final Wu f11686l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f11687l0;

    /* renamed from: m, reason: collision with root package name */
    public final ZN f11688m;

    /* renamed from: m0, reason: collision with root package name */
    public AN f11689m0;

    /* renamed from: n, reason: collision with root package name */
    public final C1009cp f11690n;

    /* renamed from: n0, reason: collision with root package name */
    public C1348j3 f11691n0;

    /* renamed from: o0, reason: collision with root package name */
    public C1747qO f11692o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f11693p0;

    /* renamed from: q0, reason: collision with root package name */
    public long f11694q0;

    /* renamed from: r0, reason: collision with root package name */
    public OQ f11695r0;

    static {
        AbstractC2102x2.a("media3.exoplayer");
    }

    public UN(JN jn, C2232zO c2232zO) {
        super(5);
        this.f11673e = new C0494Em();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = Vt.f12096a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 37 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-beta01] [");
            sb.append(str);
            sb.append("]");
            AbstractC2022vd.p("ExoPlayerImpl", sb.toString());
            Context context = jn.f9278a;
            C1994v2 c1994v2 = jn.f9279b;
            Looper looper = jn.f9285h;
            this.f11675f = context.getApplicationContext();
            this.f11649G = new GO(c1994v2);
            this.f11685k0 = jn.i;
            this.f11676f0 = jn.f9286j;
            this.f11672d0 = jn.f9287k;
            this.f11680h0 = false;
            this.f11656O = jn.f9292p;
            NN nn = new NN(this);
            this.f11653K = nn;
            this.f11654L = new C2153y(1);
            this.f11679h = ((Rx) jn.f9280c.f13695b).i(new Handler(looper), nn, nn);
            this.i = new PP[2];
            int i = 0;
            while (true) {
                PP[] ppArr = this.i;
                int length = ppArr.length;
                if (i >= 2) {
                    break;
                }
                PP pp = this.f11679h[i];
                ppArr[i] = null;
                i++;
            }
            this.f11682j = (C0911b) jn.f9282e.a();
            jn.f9281d.a();
            this.f11651I = (InterfaceC1452l) jn.f9284g.a();
            this.f11648F = jn.f9288l;
            this.f11665X = jn.f9289m;
            this.f11664W = jn.f9290n;
            this.f11650H = looper;
            this.f11652J = c1994v2;
            this.f11677g = c2232zO;
            this.f11690n = new C1009cp(new CopyOnWriteArraySet(), looper, looper.getThread(), c1994v2, new ZJ(22, this), true);
            this.f11645C = new CopyOnWriteArraySet();
            this.f11647E = new ArrayList();
            this.f11695r0 = new OQ();
            this.f11666Y = KN.f9484a;
            int length2 = this.f11679h.length;
            this.f11669c = new C1184g(new C2070wO[2], new InterfaceC1020d[2], C2020vb.f17275b, null);
            this.f11646D = new I7();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i6 = iArr[i3];
                AbstractC0582Jp.h0(!false);
                sparseBooleanArray.append(i6, true);
            }
            this.f11682j.getClass();
            AbstractC0582Jp.h0(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0582Jp.h0(!false);
            C1264hP c1264hP = new C1264hP(sparseBooleanArray);
            this.f11671d = new Z5(c1264hP);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i7 = 0; i7 < c1264hP.f14493a.size(); i7++) {
                int iA = c1264hP.a(i7);
                AbstractC0582Jp.h0(!false);
                sparseBooleanArray2.append(iA, true);
            }
            AbstractC0582Jp.h0(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0582Jp.h0(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0582Jp.h0(!false);
            this.f11667Z = new Z5(new C1264hP(sparseBooleanArray2));
            this.f11684k = this.f11652J.B(this.f11650H, null);
            Wu wu = new Wu(8, this);
            this.f11686l = wu;
            this.f11692o0 = C1747qO.a(this.f11669c);
            this.f11649G.B(this.f11677g, this.f11650H);
            final MO mo = new MO(jn.f9299w);
            ZN zn = new ZN(this.f11675f, this.f11679h, this.i, this.f11682j, this.f11669c, (InterfaceC0936bO) jn.f9283f.a(), this.f11651I, this.f11649G, this.f11665X, jn.f9300x, jn.f9291o, this.f11650H, this.f11652J, wu, mo, this.f11666Y);
            Looper looper2 = zn.f12869j;
            C1231gt c1231gt = zn.f12866h;
            this.f11688m = zn;
            this.f11678g0 = 1.0f;
            C1348j3 c1348j3 = C1348j3.f14865B;
            this.f11668a0 = c1348j3;
            this.f11691n0 = c1348j3;
            this.f11693p0 = -1;
            C2057wB c2057wB = C0627Mj.f9890a;
            this.f11681i0 = true;
            GO go = this.f11649G;
            go.getClass();
            this.f11690n.a(go);
            InterfaceC1452l interfaceC1452l = this.f11651I;
            Handler handler = new Handler(this.f11650H);
            GO go2 = this.f11649G;
            C1614o c1614o = (C1614o) interfaceC1452l;
            c1614o.getClass();
            go2.getClass();
            Rx rx = c1614o.f15866c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) rx.f11090b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1398k c1398k = (C1398k) it.next();
                if (c1398k.f15030b == go2) {
                    c1398k.f15031c = true;
                    copyOnWriteArrayList.remove(c1398k);
                }
            }
            ((CopyOnWriteArrayList) rx.f11090b).add(new C1398k(handler, go2));
            this.f11645C.add(this.f11653K);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                final Context context2 = this.f11675f;
                final boolean z6 = jn.f9297u;
                this.f11652J.B(looper2, null).e(new Runnable() { // from class: com.google.android.gms.internal.ads.LN
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        MediaMetricsManager mediaMetricsManagerH = U4.n.h(context3.getSystemService("media_metrics"));
                        LO lo = mediaMetricsManagerH == null ? null : new LO(context3, mediaMetricsManagerH.createPlaybackSession());
                        if (lo == null) {
                            AbstractC2022vd.v("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z6) {
                            this.I1(lo);
                        }
                        MO mo2 = mo;
                        LogSessionId sessionId = lo.f9680d.getSessionId();
                        synchronized (mo2) {
                            C1014cu c1014cu = mo2.f9875b;
                            if (c1014cu == null) {
                                throw null;
                            }
                            LogSessionId logSessionId = (LogSessionId) c1014cu.f13695b;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            AbstractC0582Jp.h0(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            c1014cu.f13695b = sessionId;
                        }
                    }
                });
            }
            C0305b c0305b = new C0305b(looper2, this.f11650H, this.f11652J, new C1014cu(9, this));
            this.f11657P = c0305b;
            int i9 = 14;
            Fu fu = new Fu(i9, this);
            C1231gt c1231gt2 = (C1231gt) c0305b.f5431b;
            if (c1231gt2.f14397a.getLooper().getThread().isAlive()) {
                c1231gt2.e(fu);
            }
            C1994v2 c1994v22 = this.f11652J;
            W9 w9 = new W9(i9);
            context.getApplicationContext();
            c1994v22.B(looper2, null);
            new A1.t(w9, c1994v22.B(looper, null));
            boolean z7 = (jn.f9294r == Integer.MAX_VALUE || jn.f9295s == Integer.MAX_VALUE) ? false : true;
            Ou ou = new Ou(context, looper2, this.f11652J);
            this.M = ou;
            if (ou.f10269a != z7) {
                ou.f10269a = z7;
                ou.e(z7, ou.f10270b);
            }
            C1994v2 c1994v23 = this.f11652J;
            C1778r2 c1778r2 = new C1778r2(4);
            context.getApplicationContext();
            c1994v23.B(looper2, null);
            c1994v23.B(Looper.getMainLooper(), null);
            this.f11655N = c1778r2;
            int i10 = AbstractC1639oO.f15947a;
            C1161fd c1161fd = C1161fd.f14102d;
            this.f11674e0 = Ar.f7055c;
            this.f11659R = i8 >= 34 ? new C2041vw(this, context) : null;
            this.f11660S = new HashMap();
            this.f11689m0 = AN.f6982b;
            this.f11658Q = new K4.c(this, this.f11653K, this.f11652J, jn.f9293q, jn.f9294r, jn.f9295s, jn.f9296t);
            c1231gt.b(38, this.f11664W).a();
            C0729Sj c0729Sj = this.f11676f0;
            Handler handler2 = c1231gt.f14397a;
            C0959bt c0959btG = C1231gt.g();
            c0959btG.f13478a = handler2.obtainMessage(31, 0, 0, c0729Sj);
            c0959btG.a();
            Z1(1, 3, this.f11676f0);
            Z1(2, 4, Integer.valueOf(this.f11672d0));
            Z1(2, 5, 0);
            Z1(1, 9, Boolean.valueOf(this.f11680h0));
            Z1(6, 8, this.f11654L);
            Z1(-1, 16, Integer.valueOf(this.f11685k0));
            this.f11673e.a();
        } catch (Throwable th) {
            this.f11673e.a();
            throw th;
        }
    }

    public static AN M1(AN an, List list) {
        HashMap map = new HashMap(an.f6983a);
        HashSet hashSet = new HashSet(list);
        for (String str : an.f6983a.keySet()) {
            if (!hashSet.contains(str)) {
                map.remove(str);
            }
        }
        return new AN(map);
    }

    public static long T1(C1747qO c1747qO) {
        U7 u7 = new U7();
        I7 i7 = new I7();
        AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
        abstractC1353j8.o(c1747qO.f16353b.f16374a, i7);
        long j6 = c1747qO.f16354c;
        if (j6 != -9223372036854775807L) {
            return j6;
        }
        abstractC1353j8.b(i7.f9072c, u7, 0L).getClass();
        return 0L;
    }

    public static C1747qO V1(C1747qO c1747qO, int i) {
        C1747qO c1747qOD = c1747qO.d(i);
        return (i == 1 || i == 4) ? c1747qOD.f(false) : c1747qOD;
    }

    public final void A0() {
        this.f11673e.d();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f11650H;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = Vt.f12096a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f11681i0) {
                throw new IllegalStateException(str2);
            }
            AbstractC2022vd.z("ExoPlayerImpl", str2, this.f11683j0 ? null : new IllegalStateException());
            this.f11683j0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int A1() {
        A0();
        if (!this.f11692o0.f16352a.g()) {
            C1747qO c1747qO = this.f11692o0;
            return c1747qO.f16352a.e(c1747qO.f16353b.f16374a);
        }
        int i = this.f11693p0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int B1() {
        A0();
        int iO1 = O1(this.f11692o0);
        if (iO1 == -1) {
            return 0;
        }
        return iO1;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final long D1() {
        A0();
        return Vt.r(Q1(this.f11692o0));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final long E1() {
        A0();
        return Vt.r(this.f11692o0.f16367q);
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final boolean F1() {
        A0();
        return this.f11692o0.f16353b.b();
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int G1() {
        A0();
        if (F1()) {
            return this.f11692o0.f16353b.f16376c;
        }
        return -1;
    }

    public final void H1(float f2) {
        A0();
        String str = Vt.f12096a;
        float fMax = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.f11678g0 == fMax) {
            return;
        }
        this.f11678g0 = fMax;
        this.f11688m.f12866h.b(32, Float.valueOf(fMax)).a();
        ZJ zj = new ZJ(fMax);
        C1009cp c1009cp = this.f11690n;
        c1009cp.c(22, zj);
        c1009cp.d();
    }

    public final void I1(CO co) {
        this.f11649G.f8369f.a(co);
    }

    public final void J1(C0641Ng c0641Ng) {
        A0();
        this.f11649G.f8369f.b(c0641Ng);
    }

    public final void L1() {
        String str;
        boolean zE;
        Context context;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = Vt.f12096a;
        HashSet hashSet = AbstractC2102x2.f17538a;
        synchronized (AbstractC2102x2.class) {
            str = AbstractC2102x2.f17539b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 40 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        A.f.w(sb, "Release ", hexString, " [AndroidXMedia3/1.9.0-beta01] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        AbstractC2022vd.p("ExoPlayerImpl", sb.toString());
        A0();
        this.M.b(false);
        C1778r2 c1778r2 = this.f11655N;
        if (c1778r2.f16455b) {
            c1778r2.f16455b = false;
        }
        C2041vw c2041vw = this.f11659R;
        if (c2041vw != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) c2041vw.f17369b).get()) != null) {
            context.unregisterDeviceIdChangeListener((TN) c2041vw.f17370c);
        }
        K4.c cVar = this.f11658Q;
        ((C1231gt) cVar.f2214g).f14397a.removeCallbacksAndMessages(null);
        UN un = (UN) cVar.f2209b;
        Pr pr = (Pr) cVar.f2212e;
        un.A0();
        pr.getClass();
        un.f11690n.b(pr);
        ZN zn = this.f11688m;
        if (zn.f12848V || !zn.f12869j.getThread().isAlive()) {
            zE = true;
        } else {
            zn.f12848V = true;
            C0494Em c0494Em = new C0494Em();
            zn.f12866h.b(7, c0494Em).a();
            zE = c0494Em.e(zn.f12835H);
        }
        if (!zE) {
            C1009cp c1009cp = this.f11690n;
            c1009cp.c(10, ZJ.f12818d);
            c1009cp.d();
        }
        this.f11690n.e();
        this.f11684k.f14397a.removeCallbacksAndMessages(null);
        InterfaceC1452l interfaceC1452l = this.f11651I;
        GO go = this.f11649G;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((C1614o) interfaceC1452l).f15866c.f11090b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1398k c1398k = (C1398k) it.next();
            if (c1398k.f15030b == go) {
                c1398k.f15031c = true;
                copyOnWriteArrayList.remove(c1398k);
            }
        }
        this.f11692o0.getClass();
        C1747qO c1747qOV1 = V1(this.f11692o0, 1);
        this.f11692o0 = c1747qOV1;
        C1747qO c1747qOG = c1747qOV1.g(c1747qOV1.f16353b);
        this.f11692o0 = c1747qOG;
        c1747qOG.f16366p = c1747qOG.f16368r;
        this.f11692o0.f16367q = 0L;
        C1231gt c1231gt = go.f8371h;
        c1231gt.getClass();
        c1231gt.e(new Fu(17, go));
        Surface surface = this.f11670c0;
        if (surface != null) {
            surface.release();
            this.f11670c0 = null;
        }
        C2057wB c2057wB = C0627Mj.f9890a;
        this.f11687l0 = true;
    }

    public final void N1(HN hn) {
        C1747qO c1747qO = this.f11692o0;
        C1747qO c1747qOG = c1747qO.g(c1747qO.f16353b);
        c1747qOG.f16366p = c1747qOG.f16368r;
        c1747qOG.f16367q = 0L;
        C1747qO c1747qOV1 = V1(c1747qOG, 1);
        if (hn != null) {
            c1747qOV1 = c1747qOV1.e(hn);
        }
        C1747qO c1747qO2 = c1747qOV1;
        this.f11661T++;
        Handler handler = this.f11688m.f12866h.f14397a;
        C0959bt c0959btG = C1231gt.g();
        c0959btG.f13478a = handler.obtainMessage(6);
        c0959btG.a();
        S1(c1747qO2, 0, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final long O() {
        A0();
        return P1(this.f11692o0);
    }

    public final int O1(C1747qO c1747qO) {
        AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
        return abstractC1353j8.g() ? this.f11693p0 : abstractC1353j8.o(c1747qO.f16353b.f16374a, this.f11646D).f9072c;
    }

    public final long P1(C1747qO c1747qO) {
        long jR = Vt.r(0L);
        C1749qQ c1749qQ = c1747qO.f16353b;
        if (!c1749qQ.b()) {
            return Vt.r(Q1(c1747qO));
        }
        AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
        abstractC1353j8.o(c1749qQ.f16374a, this.f11646D);
        long j6 = c1747qO.f16354c;
        if (j6 != -9223372036854775807L) {
            return Vt.r(j6) + jR;
        }
        abstractC1353j8.b(O1(c1747qO), (U7) this.f11985a, 0L).getClass();
        return jR;
    }

    public final long Q1(C1747qO c1747qO) {
        AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
        if (abstractC1353j8.g()) {
            return Vt.s(this.f11694q0);
        }
        long j6 = c1747qO.f16368r;
        C1749qQ c1749qQ = c1747qO.f16353b;
        if (c1749qQ.b()) {
            return j6;
        }
        abstractC1353j8.o(c1749qQ.f16374a, this.f11646D);
        return j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x056e A[LOOP:0: B:271:0x0566->B:273:0x056e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x057f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0598 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S1(final com.google.android.gms.internal.ads.C1747qO r33, int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UN.S1(com.google.android.gms.internal.ads.qO, int, boolean, int, long, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1747qO U1(com.google.android.gms.internal.ads.C1747qO r23, com.google.android.gms.internal.ads.AbstractC1353j8 r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UN.U1(com.google.android.gms.internal.ads.qO, com.google.android.gms.internal.ads.j8, android.util.Pair):com.google.android.gms.internal.ads.qO");
    }

    public final Pair W1(AbstractC1353j8 abstractC1353j8, int i, long j6) {
        if (abstractC1353j8.g()) {
            this.f11693p0 = i;
            if (j6 == -9223372036854775807L) {
                j6 = 0;
            }
            this.f11694q0 = j6;
            return null;
        }
        if (i == -1 || i >= abstractC1353j8.a()) {
            i = abstractC1353j8.k(false);
            abstractC1353j8.b(i, (U7) this.f11985a, 0L).getClass();
            j6 = Vt.r(0L);
        }
        return abstractC1353j8.m((U7) this.f11985a, this.f11646D, i, Vt.s(j6));
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final void X(int i, long j6) {
        A0();
        if (i == -1) {
            return;
        }
        AbstractC0582Jp.m(i >= 0);
        AbstractC1353j8 abstractC1353j8 = this.f11692o0.f16352a;
        if (abstractC1353j8.g() || i < abstractC1353j8.a()) {
            GO go = this.f11649G;
            if (!go.i) {
                BO boU = go.u();
                go.i = true;
                go.t(boU, -1, new DO(1));
            }
            this.f11661T++;
            if (F1()) {
                AbstractC2022vd.v("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                W3 w32 = new W3(this.f11692o0);
                w32.b(1);
                UN un = (UN) this.f11686l.f12337b;
                un.f11684k.e(new RunnableC0786Vp(un, 19, w32));
                return;
            }
            C1747qO c1747qOD = this.f11692o0;
            int i3 = c1747qOD.f16356e;
            if (i3 == 3 || (i3 == 4 && !abstractC1353j8.g())) {
                c1747qOD = this.f11692o0.d(2);
            }
            int iB1 = B1();
            C1747qO c1747qOU1 = U1(c1747qOD, abstractC1353j8, W1(abstractC1353j8, i, j6));
            long jS = Vt.s(j6);
            ZN zn = this.f11688m;
            zn.getClass();
            zn.f12866h.b(3, new YN(abstractC1353j8, i, jS)).a();
            S1(c1747qOU1, 0, true, 1, Q1(c1747qOU1), iB1);
        }
    }

    public final void X1(Surface surface) {
        Object obj = this.b0;
        boolean z6 = false;
        boolean zE = true;
        if (obj != null && obj != surface) {
            z6 = true;
        }
        long j6 = z6 ? this.f11656O : -9223372036854775807L;
        ZN zn = this.f11688m;
        if (!zn.f12848V && zn.f12869j.getThread().isAlive()) {
            C0494Em c0494Em = new C0494Em();
            zn.f12866h.b(30, new Pair(surface, c0494Em)).a();
            if (j6 != -9223372036854775807L) {
                zE = c0494Em.e(j6);
            }
        }
        if (z6) {
            Object obj2 = this.b0;
            Surface surface2 = this.f11670c0;
            if (obj2 == surface2) {
                surface2.release();
                this.f11670c0 = null;
            }
        }
        this.b0 = surface;
        if (zE) {
            return;
        }
        N1(new HN(2, new J0.c("Detaching surface timed out."), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
    }

    public final void Y1(int i, int i3) {
        Ar ar = this.f11674e0;
        if (i == ar.f7056a && i3 == ar.f7057b) {
            return;
        }
        this.f11674e0 = new Ar(i, i3);
        ZJ zj = new ZJ(i, i3);
        C1009cp c1009cp = this.f11690n;
        c1009cp.c(24, zj);
        c1009cp.d();
        Z1(2, 14, new Ar(i, i3));
    }

    public final void Z1(int i, int i3, Object obj) {
        ZN zn;
        PP[] ppArr = this.f11679h;
        int length = ppArr.length;
        int i6 = 0;
        while (true) {
            zn = this.f11688m;
            if (i6 >= 2) {
                break;
            }
            PP pp = ppArr[i6];
            if (i == -1 || pp.f10398b == i) {
                O1(this.f11692o0);
                AbstractC1353j8 abstractC1353j8 = this.f11692o0.f16352a;
                C1908tO c1908tO = new C1908tO(zn, pp, zn.f12869j);
                AbstractC0582Jp.h0(!c1908tO.f16908f);
                c1908tO.f16905c = i3;
                AbstractC0582Jp.h0(!c1908tO.f16908f);
                c1908tO.f16906d = obj;
                c1908tO.a();
            }
            i6++;
        }
        PP[] ppArr2 = this.i;
        int length2 = ppArr2.length;
        for (int i7 = 0; i7 < 2; i7++) {
            PP pp2 = ppArr2[i7];
            if (pp2 != null && (i == -1 || pp2.f10398b == i)) {
                O1(this.f11692o0);
                AbstractC1353j8 abstractC1353j82 = this.f11692o0.f16352a;
                C1908tO c1908tO2 = new C1908tO(zn, pp2, zn.f12869j);
                AbstractC0582Jp.h0(!c1908tO2.f16908f);
                c1908tO2.f16905c = i3;
                AbstractC0582Jp.h0(!c1908tO2.f16908f);
                c1908tO2.f16906d = obj;
                c1908tO2.a();
            }
        }
    }

    public final void a2(boolean z6) {
        A0();
        C1747qO c1747qO = this.f11692o0;
        int i = c1747qO.f16364n;
        int i3 = 0;
        if (i == 1) {
            if (z6) {
                i = 1;
            } else {
                i = 1;
                i3 = 1;
            }
        }
        if (c1747qO.f16362l == z6 && i == i3 && c1747qO.f16363m == 1) {
            return;
        }
        this.f11661T++;
        C1747qO c1747qOH = c1747qO.h(1, i3, z6);
        int i6 = (i3 << 4) | 1;
        Handler handler = this.f11688m.f12866h.f14397a;
        C0959bt c0959btG = C1231gt.g();
        c0959btG.f13478a = handler.obtainMessage(1, z6 ? 1 : 0, i6);
        c0959btG.a();
        S1(c1747qOH, 0, false, 5, -9223372036854775807L, -1);
    }

    public final long b2() {
        A0();
        if (!F1()) {
            AbstractC1353j8 abstractC1353j8Y1 = y1();
            if (abstractC1353j8Y1.g()) {
                return -9223372036854775807L;
            }
            return Vt.r(abstractC1353j8Y1.b(B1(), (U7) this.f11985a, 0L).f11611j);
        }
        C1747qO c1747qO = this.f11692o0;
        C1749qQ c1749qQ = c1747qO.f16353b;
        AbstractC1353j8 abstractC1353j8 = c1747qO.f16352a;
        Object obj = c1749qQ.f16374a;
        I7 i7 = this.f11646D;
        abstractC1353j8.o(obj, i7);
        return Vt.r(i7.b(c1749qQ.f16375b, c1749qQ.f16376c));
    }

    public final long c2() {
        A0();
        if (F1()) {
            C1747qO c1747qO = this.f11692o0;
            return c1747qO.f16361k.equals(c1747qO.f16353b) ? Vt.r(this.f11692o0.f16366p) : b2();
        }
        A0();
        if (this.f11692o0.f16352a.g()) {
            return this.f11694q0;
        }
        C1747qO c1747qO2 = this.f11692o0;
        long j6 = 0;
        if (c1747qO2.f16361k.f16377d != c1747qO2.f16353b.f16377d) {
            return Vt.r(c1747qO2.f16352a.b(B1(), (U7) this.f11985a, 0L).f11611j);
        }
        long j7 = c1747qO2.f16366p;
        if (this.f11692o0.f16361k.b()) {
            C1747qO c1747qO3 = this.f11692o0;
            c1747qO3.f16352a.o(c1747qO3.f16361k.f16374a, this.f11646D).f9075f.a(this.f11692o0.f16361k.f16375b).getClass();
        } else {
            j6 = j7;
        }
        C1747qO c1747qO4 = this.f11692o0;
        c1747qO4.f16352a.o(c1747qO4.f16361k.f16374a, this.f11646D);
        return Vt.r(j6);
    }

    @Override // com.google.android.gms.internal.ads.VL, com.google.android.gms.internal.ads.InterfaceC0526Gk
    public final void i() {
        A0();
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int m() {
        A0();
        if (F1()) {
            return this.f11692o0.f16353b.f16375b;
        }
        return -1;
    }

    public final void p() {
        A0();
        N1(null);
        C1197gC c1197gC = C1197gC.f14227e;
        long j6 = this.f11692o0.f16368r;
        new C0627Mj(c1197gC);
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int r1() {
        A0();
        return this.f11692o0.f16356e;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final int s1() {
        A0();
        return this.f11692o0.f16364n;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final boolean t1() {
        A0();
        return this.f11692o0.f16362l;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final void u1() {
        A0();
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final C2020vb v1() {
        A0();
        return (C2020vb) this.f11692o0.i.f14182d;
    }

    @Override // com.google.android.gms.internal.ads.VL
    public final AbstractC1353j8 y1() {
        A0();
        return this.f11692o0.f16352a;
    }
}
