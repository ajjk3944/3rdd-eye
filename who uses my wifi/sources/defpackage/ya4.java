package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ya4 extends f74 {
    public static final /* synthetic */ int g0 = 0;
    public final uj4 A;
    public final pz B;
    public final oa4 C;
    public final wa4 D;
    public final kj1 E;
    public final kj1 F;
    public final long G;
    public final fw3 H;
    public final yc4 I;
    public int J;
    public int K;
    public boolean L;
    public final kc4 M;
    public final lc4 N;
    public final la4 O;
    public ts1 P;
    public rm1 Q;
    public Object R;
    public Surface S;
    public final int T;
    public uz2 U;
    public final in2 V;
    public float W;
    public boolean X;
    public final boolean Y;
    public boolean Z;
    public final int a0;
    public rm1 b0;
    public dc4 c0;
    public int d0;
    public long e0;
    public ni4 f0;
    public final pj4 i;
    public final ts1 j;
    public final hp2 k;
    public final Context l;
    public final mc4 m;
    public final kg4[] n;
    public final kg4[] o;
    public final lj4 p;
    public final d13 q;
    public final ci3 r;
    public final jb4 s;
    public final mu2 t;
    public final CopyOnWriteArraySet u;
    public final sw1 v;
    public final ArrayList w;
    public final boolean x;
    public final md4 y;
    public final Looper z;

    static {
        zk1.a("media3.exoplayer");
    }

    public ya4(ka4 ka4Var, mc4 mc4Var) {
        super(10);
        this.k = new hp2();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = v23.a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            a30.u(sb.toString());
            Context context = ka4Var.a;
            pz pzVar = ka4Var.b;
            Looper looper = ka4Var.h;
            this.l = context.getApplicationContext();
            this.y = new md4(pzVar);
            this.a0 = ka4Var.i;
            this.V = ka4Var.j;
            this.T = ka4Var.k;
            this.X = false;
            this.G = ka4Var.p;
            oa4 oa4Var = new oa4(this);
            this.C = oa4Var;
            this.D = new wa4(0);
            this.n = ((ug0) ka4Var.c.g).z(new Handler(looper), oa4Var, oa4Var);
            this.o = new kg4[2];
            int i = 0;
            while (true) {
                kg4[] kg4VarArr = this.o;
                int length = kg4VarArr.length;
                if (i >= 2) {
                    break;
                }
                kg4 kg4Var = this.n[i];
                kg4VarArr[i] = null;
                i++;
            }
            this.p = (lj4) ka4Var.e.a();
            ka4Var.d.a();
            this.A = (uj4) ka4Var.g.a();
            this.x = ka4Var.l;
            this.N = ka4Var.m;
            this.M = ka4Var.n;
            this.z = looper;
            this.B = pzVar;
            this.m = mc4Var;
            this.t = new mu2(looper, pzVar, new t24(this, 18));
            this.u = new CopyOnWriteArraySet();
            this.w = new ArrayList();
            this.f0 = new ni4();
            this.O = la4.a;
            int length2 = this.n.length;
            this.i = new pj4(new jc4[2], new nj4[2], o42.b, null);
            this.v = new sw1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                int i3 = iArr[i2];
                zt0.b0(!false);
                sparseBooleanArray.append(i3, true);
            }
            this.p.getClass();
            zt0.b0(!false);
            sparseBooleanArray.append(29, true);
            zt0.b0(!false);
            of4 of4Var = new of4(sparseBooleanArray);
            this.j = new ts1(of4Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < of4Var.a.size(); i4++) {
                int iA = of4Var.a(i4);
                zt0.b0(!false);
                sparseBooleanArray2.append(iA, true);
            }
            zt0.b0(!false);
            sparseBooleanArray2.append(4, true);
            zt0.b0(!false);
            sparseBooleanArray2.append(10, true);
            zt0.b0(!false);
            this.P = new ts1(new of4(sparseBooleanArray2));
            this.q = this.B.p(this.z, null);
            ci3 ci3Var = new ci3(4, this);
            this.r = ci3Var;
            this.c0 = dc4.a(this.i);
            this.y.A(this.m, this.z);
            final xd4 xd4Var = new xd4(ka4Var.w);
            jb4 jb4Var = new jb4(this.l, this.n, this.o, this.p, this.i, (lb4) ka4Var.f.a(), this.A, this.y, this.N, ka4Var.x, ka4Var.o, this.z, this.B, ci3Var, xd4Var, this.O);
            Looper looper2 = jb4Var.o;
            d13 d13Var = jb4Var.m;
            this.s = jb4Var;
            this.W = 1.0f;
            rm1 rm1Var = rm1.B;
            this.Q = rm1Var;
            this.b0 = rm1Var;
            this.d0 = -1;
            hm3 hm3Var = ui2.a;
            this.Y = true;
            md4 md4Var = this.y;
            md4Var.getClass();
            this.t.a(md4Var);
            uj4 uj4Var = this.A;
            Handler handler = new Handler(this.z);
            md4 md4Var2 = this.y;
            xj4 xj4Var = (xj4) uj4Var;
            xj4Var.getClass();
            md4Var2.getClass();
            bi3 bi3Var = xj4Var.h;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) bi3Var.g;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                tj4 tj4Var = (tj4) it.next();
                if (tj4Var.b == md4Var2) {
                    tj4Var.c = true;
                    copyOnWriteArrayList.remove(tj4Var);
                }
            }
            ((CopyOnWriteArrayList) bi3Var.g).add(new tj4(handler, md4Var2));
            this.u.add(this.C);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context2 = this.l;
                final boolean z = ka4Var.u;
                this.B.p(looper2, null).d(new Runnable() { // from class: ma4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        MediaMetricsManager mediaMetricsManagerI = lb.i(context3.getSystemService("media_metrics"));
                        rd4 rd4Var = mediaMetricsManagerI == null ? null : new rd4(context3, mediaMetricsManagerI.createPlaybackSession());
                        if (rd4Var == null) {
                            a30.x("MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.V1(rd4Var);
                        }
                        xd4 xd4Var2 = xd4Var;
                        LogSessionId sessionId = rd4Var.i.getSessionId();
                        synchronized (xd4Var2) {
                            x34 x34Var = xd4Var2.b;
                            if (x34Var == null) {
                                throw null;
                            }
                            LogSessionId logSessionId = (LogSessionId) x34Var.f;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            zt0.b0(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            x34Var.f = sessionId;
                        }
                    }
                });
            }
            fw3 fw3Var = new fw3(looper2, this.z, this.B, new il3(3, this));
            this.H = fw3Var;
            bh3 bh3Var = new bh3(9, this);
            d13 d13Var2 = (d13) fw3Var.g;
            if (d13Var2.a.getLooper().getThread().isAlive()) {
                d13Var2.d(bh3Var);
            }
            pz pzVar2 = this.B;
            tt3 tt3Var = new tt3(19);
            context.getApplicationContext();
            pzVar2.p(looper2, null);
            new d6(tt3Var, pzVar2.p(looper, null));
            pz pzVar3 = this.B;
            kj1 kj1Var = new kj1(6);
            context.getApplicationContext();
            pzVar3.p(looper2, null);
            this.E = kj1Var;
            pz pzVar4 = this.B;
            kj1 kj1Var2 = new kj1(7);
            context.getApplicationContext();
            pzVar4.p(looper2, null);
            this.F = kj1Var2;
            int i5 = tc4.a;
            t82 t82Var = t82.d;
            this.U = uz2.c;
            this.I = new yc4(this, this.C, this.B, ka4Var.q, ka4Var.r, ka4Var.s, ka4Var.t);
            d13Var.a(38, this.M).a();
            in2 in2Var = this.V;
            Handler handler2 = d13Var.a;
            v03 v03VarF = d13.f();
            v03VarF.a = handler2.obtainMessage(31, 0, 0, in2Var);
            v03VarF.a();
            k2(1, this.V, 3);
            k2(2, Integer.valueOf(this.T), 4);
            k2(2, 0, 5);
            k2(1, Boolean.valueOf(this.X), 9);
            k2(6, this.D, 8);
            k2(-1, Integer.valueOf(this.a0), 16);
            this.k.a();
        } catch (Throwable th) {
            this.k.a();
            throw th;
        }
    }

    public static long d2(dc4 dc4Var) {
        ez1 ez1Var = new ez1();
        sw1 sw1Var = new sw1();
        oz1 oz1Var = dc4Var.a;
        oz1Var.o(dc4Var.b.a, sw1Var);
        long j = dc4Var.c;
        if (j != -9223372036854775807L) {
            return j;
        }
        oz1Var.b(sw1Var.c, ez1Var, 0L).getClass();
        return 0L;
    }

    public static dc4 f2(dc4 dc4Var, int i) {
        dc4 dc4VarD = dc4Var.d(i);
        return (i == 1 || i == 4) ? dc4VarD.f(false) : dc4VarD;
    }

    @Override // defpackage.f74
    public final int C1() {
        j2();
        return this.c0.e;
    }

    @Override // defpackage.f74
    public final int D1() {
        j2();
        return this.c0.n;
    }

    @Override // defpackage.f74
    public final boolean H1() {
        j2();
        return this.c0.l;
    }

    @Override // defpackage.f74
    public final void I1() {
        j2();
    }

    @Override // defpackage.f74
    public final o42 J1() {
        j2();
        return (o42) this.c0.i.i;
    }

    @Override // defpackage.f74
    public final oz1 K1() {
        j2();
        return this.c0.a;
    }

    @Override // defpackage.f74
    public final int N1() {
        j2();
        if (this.c0.a.g()) {
            return 0;
        }
        dc4 dc4Var = this.c0;
        return dc4Var.a.e(dc4Var.b.a);
    }

    @Override // defpackage.f74
    public final int O1() {
        j2();
        int iZ1 = Z1(this.c0);
        if (iZ1 == -1) {
            return 0;
        }
        return iZ1;
    }

    @Override // defpackage.f74
    public final long Q1() {
        j2();
        return v23.q(b2(this.c0));
    }

    @Override // defpackage.f74
    public final long R1() {
        j2();
        return v23.q(this.c0.q);
    }

    @Override // defpackage.f74
    public final boolean S1() {
        j2();
        return this.c0.b.b();
    }

    @Override // defpackage.f74
    public final int T1() {
        j2();
        if (S1()) {
            return this.c0.b.c;
        }
        return -1;
    }

    public final void U1(float f) {
        j2();
        String str = v23.a;
        float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.W == fMax) {
            return;
        }
        this.W = fMax;
        this.s.m.a(32, Float.valueOf(fMax)).a();
        t24 t24Var = new t24(fMax);
        mu2 mu2Var = this.t;
        mu2Var.c(22, t24Var);
        mu2Var.d();
    }

    public final void V1(bd4 bd4Var) {
        this.y.k.a(bd4Var);
    }

    public final void W1(sf2 sf2Var) {
        j2();
        this.y.k.b(sf2Var);
    }

    public final void X1() {
        String str;
        boolean zC;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = v23.a;
        HashSet hashSet = zk1.a;
        synchronized (zk1.class) {
            str = zk1.b;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        ex0.q(sb, "Release ", hexString, " [AndroidXMedia3/1.8.0] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        a30.u(sb.toString());
        j2();
        kj1 kj1Var = this.E;
        if (kj1Var.g) {
            kj1Var.g = false;
        }
        kj1 kj1Var2 = this.F;
        if (kj1Var2.g) {
            kj1Var2.g = false;
        }
        yc4 yc4Var = this.I;
        yc4Var.i.a.removeCallbacksAndMessages(null);
        ya4 ya4Var = yc4Var.f;
        ya4Var.j2();
        ya4Var.t.b(yc4Var);
        jb4 jb4Var = this.s;
        if (jb4Var.M || !jb4Var.o.getThread().isAlive()) {
            zC = true;
        } else {
            jb4Var.M = true;
            hp2 hp2Var = new hp2();
            jb4Var.m.a(7, hp2Var).a();
            zC = hp2Var.c(jb4Var.y);
        }
        if (!zC) {
            mu2 mu2Var = this.t;
            mu2Var.c(10, y24.m);
            mu2Var.d();
        }
        this.t.e();
        this.q.a.removeCallbacksAndMessages(null);
        uj4 uj4Var = this.A;
        md4 md4Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((xj4) uj4Var).h.g;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            tj4 tj4Var = (tj4) it.next();
            if (tj4Var.b == md4Var) {
                tj4Var.c = true;
                copyOnWriteArrayList.remove(tj4Var);
            }
        }
        this.c0.getClass();
        dc4 dc4VarF2 = f2(this.c0, 1);
        this.c0 = dc4VarF2;
        dc4 dc4VarG = dc4VarF2.g(dc4VarF2.b);
        this.c0 = dc4VarG;
        dc4VarG.p = dc4VarG.r;
        this.c0.q = 0L;
        d13 d13Var = md4Var.m;
        d13Var.getClass();
        d13Var.d(new bh3(12, md4Var));
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        hm3 hm3Var = ui2.a;
    }

    public final void Y1(b84 b84Var) {
        dc4 dc4Var = this.c0;
        dc4 dc4VarG = dc4Var.g(dc4Var.b);
        dc4VarG.p = dc4VarG.r;
        dc4VarG.q = 0L;
        dc4 dc4VarF2 = f2(dc4VarG, 1);
        if (b84Var != null) {
            dc4VarF2 = dc4VarF2.e(b84Var);
        }
        dc4 dc4Var2 = dc4VarF2;
        this.J++;
        Handler handler = this.s.m.a;
        v03 v03VarF = d13.f();
        v03VarF.a = handler.obtainMessage(6);
        v03VarF.a();
        c2(dc4Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final int Z1(dc4 dc4Var) {
        oz1 oz1Var = dc4Var.a;
        return oz1Var.g() ? this.d0 : oz1Var.o(dc4Var.b.a, this.v).c;
    }

    public final long a2(dc4 dc4Var) {
        long jQ = v23.q(0L);
        kh4 kh4Var = dc4Var.b;
        if (!kh4Var.b()) {
            return v23.q(b2(dc4Var));
        }
        oz1 oz1Var = dc4Var.a;
        oz1Var.o(kh4Var.a, this.v);
        long j = dc4Var.c;
        if (j != -9223372036854775807L) {
            return v23.q(j) + jQ;
        }
        oz1Var.b(Z1(dc4Var), (ez1) this.g, 0L).getClass();
        return jQ;
    }

    public final long b2(dc4 dc4Var) {
        oz1 oz1Var = dc4Var.a;
        if (oz1Var.g()) {
            return v23.r(this.e0);
        }
        long j = dc4Var.r;
        kh4 kh4Var = dc4Var.b;
        if (kh4Var.b()) {
            return j;
        }
        oz1Var.o(kh4Var.a, this.v);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056b A[LOOP:0: B:277:0x0563->B:279:0x056b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0589 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05fe  */
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
    public final void c2(final defpackage.dc4 r33, int r34, boolean r35, int r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya4.c2(dc4, int, boolean, int, long, int):void");
    }

    @Override // defpackage.f74
    public final int d() {
        j2();
        if (S1()) {
            return this.c0.b.b;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dc4 e2(defpackage.dc4 r23, defpackage.oz1 r24, android.util.Pair r25) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya4.e2(dc4, oz1, android.util.Pair):dc4");
    }

    public final Pair g2(oz1 oz1Var, int i, long j) {
        if (oz1Var.g()) {
            this.d0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.e0 = j;
            return null;
        }
        if (i == -1 || i >= oz1Var.a()) {
            i = oz1Var.k(false);
            oz1Var.b(i, (ez1) this.g, 0L).getClass();
            j = v23.q(0L);
        }
        return oz1Var.m((ez1) this.g, this.v, i, v23.r(j));
    }

    public final void h2(Surface surface) {
        Object obj = this.R;
        boolean z = false;
        boolean zC = true;
        if (obj != null && obj != surface) {
            z = true;
        }
        long j = z ? this.G : -9223372036854775807L;
        jb4 jb4Var = this.s;
        if (!jb4Var.M && jb4Var.o.getThread().isAlive()) {
            hp2 hp2Var = new hp2();
            jb4Var.m.a(30, new Pair(surface, hp2Var)).a();
            if (j != -9223372036854775807L) {
                zC = hp2Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.R;
            Surface surface2 = this.S;
            if (obj2 == surface2) {
                surface2.release();
                this.S = null;
            }
        }
        this.R = surface;
        if (zC) {
            return;
        }
        Y1(new b84(2, new rg("Detaching surface timed out."), 1003));
    }

    @Override // defpackage.f74, defpackage.wn2
    public final void i() {
        j2();
    }

    public final void i2(int i, int i2) {
        uz2 uz2Var = this.U;
        if (i == uz2Var.a && i2 == uz2Var.b) {
            return;
        }
        this.U = new uz2(i, i2);
        y24 y24Var = new y24(i, i2);
        mu2 mu2Var = this.t;
        mu2Var.c(24, y24Var);
        mu2Var.d();
        k2(2, new uz2(i, i2), 14);
    }

    public final void j2() {
        this.k.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.z;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = v23.a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.Y) {
                throw new IllegalStateException(str2);
            }
            a30.z(str2, this.Z ? null : new IllegalStateException());
            this.Z = true;
        }
    }

    public final void k2(int i, Object obj, int i2) {
        jb4 jb4Var;
        kg4[] kg4VarArr = this.n;
        int length = kg4VarArr.length;
        int i3 = 0;
        while (true) {
            jb4Var = this.s;
            if (i3 >= 2) {
                break;
            }
            kg4 kg4Var = kg4VarArr[i3];
            if (i == -1 || kg4Var.g == i) {
                Z1(this.c0);
                oz1 oz1Var = this.c0.a;
                gc4 gc4Var = new gc4(jb4Var, kg4Var, jb4Var.o);
                zt0.b0(!gc4Var.f);
                gc4Var.c = i2;
                zt0.b0(!gc4Var.f);
                gc4Var.d = obj;
                gc4Var.a();
            }
            i3++;
        }
        kg4[] kg4VarArr2 = this.o;
        int length2 = kg4VarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            kg4 kg4Var2 = kg4VarArr2[i4];
            if (kg4Var2 != null && (i == -1 || kg4Var2.g == i)) {
                Z1(this.c0);
                oz1 oz1Var2 = this.c0.a;
                gc4 gc4Var2 = new gc4(jb4Var, kg4Var2, jb4Var.o);
                zt0.b0(!gc4Var2.f);
                gc4Var2.c = i2;
                zt0.b0(!gc4Var2.f);
                gc4Var2.d = obj;
                gc4Var2.a();
            }
        }
    }

    public final void l2(boolean z) {
        j2();
        dc4 dc4Var = this.c0;
        int i = dc4Var.n;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (dc4Var.l == z && i == i2 && dc4Var.m == 1) {
            return;
        }
        this.J++;
        dc4 dc4VarH = dc4Var.h(1, i2, z);
        int i3 = (i2 << 4) | 1;
        Handler handler = this.s.m.a;
        v03 v03VarF = d13.f();
        v03VarF.a = handler.obtainMessage(1, z ? 1 : 0, i3);
        v03VarF.a();
        c2(dc4VarH, 0, false, 5, -9223372036854775807L, -1);
    }

    public final long n2() {
        j2();
        if (!S1()) {
            oz1 oz1VarK1 = K1();
            if (oz1VarK1.g()) {
                return -9223372036854775807L;
            }
            return v23.q(oz1VarK1.b(O1(), (ez1) this.g, 0L).j);
        }
        dc4 dc4Var = this.c0;
        kh4 kh4Var = dc4Var.b;
        oz1 oz1Var = dc4Var.a;
        Object obj = kh4Var.a;
        sw1 sw1Var = this.v;
        oz1Var.o(obj, sw1Var);
        return v23.q(sw1Var.b(kh4Var.b, kh4Var.c));
    }

    @Override // defpackage.f74
    public final long o1() {
        j2();
        return a2(this.c0);
    }

    public final long o2() {
        j2();
        if (S1()) {
            dc4 dc4Var = this.c0;
            return dc4Var.k.equals(dc4Var.b) ? v23.q(this.c0.p) : n2();
        }
        j2();
        if (this.c0.a.g()) {
            return this.e0;
        }
        dc4 dc4Var2 = this.c0;
        long j = 0;
        if (dc4Var2.k.d != dc4Var2.b.d) {
            return v23.q(dc4Var2.a.b(O1(), (ez1) this.g, 0L).j);
        }
        long j2 = dc4Var2.p;
        if (this.c0.k.b()) {
            dc4 dc4Var3 = this.c0;
            dc4Var3.a.o(dc4Var3.k.a, this.v).f.a(this.c0.k.b).getClass();
        } else {
            j = j2;
        }
        dc4 dc4Var4 = this.c0;
        dc4Var4.a.o(dc4Var4.k.a, this.v);
        return v23.q(j);
    }

    public final void p() {
        j2();
        Y1(null);
        sn3 sn3Var = sn3.j;
        long j = this.c0.r;
        new ui2(sn3Var);
    }

    @Override // defpackage.f74
    public final void u1(int i, long j) {
        j2();
        if (i == -1) {
            return;
        }
        zt0.D(i >= 0);
        oz1 oz1Var = this.c0.a;
        if (oz1Var.g() || i < oz1Var.a()) {
            md4 md4Var = this.y;
            if (!md4Var.n) {
                ad4 ad4VarT = md4Var.t();
                md4Var.n = true;
                md4Var.s(ad4VarT, -1, new y24(27));
            }
            this.J++;
            if (S1()) {
                a30.x("seekTo ignored because an ad is playing");
                r60 r60Var = new r60(this.c0);
                r60Var.f(1);
                ya4 ya4Var = (ya4) this.r.g;
                ya4Var.q.d(new sz2(ya4Var, r60Var, 20));
                return;
            }
            dc4 dc4VarD = this.c0;
            int i2 = dc4VarD.e;
            if (i2 == 3 || (i2 == 4 && !oz1Var.g())) {
                dc4VarD = this.c0.d(2);
            }
            int iO1 = O1();
            dc4 dc4VarE2 = e2(dc4VarD, oz1Var, g2(oz1Var, i, j));
            long jR = v23.r(j);
            jb4 jb4Var = this.s;
            jb4Var.getClass();
            jb4Var.m.a(3, new ib4(oz1Var, i, jR)).a();
            c2(dc4VarE2, 0, true, 1, b2(dc4VarE2), iO1);
        }
    }
}
