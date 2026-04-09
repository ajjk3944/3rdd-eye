package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jb4 implements Handler.Callback, ih4, ec4, be1 {
    public static final long i0 = v23.q(10000);
    public final md4 A;
    public final d13 B;
    public final boolean C;
    public final r24 D;
    public lc4 E;
    public boolean G;
    public boolean H;
    public ib4 I;
    public int J;
    public dc4 K;
    public r60 L;
    public boolean M;
    public boolean O;
    public boolean P;
    public boolean R;
    public boolean U;
    public int V;
    public ib4 W;
    public long X;
    public long Y;
    public int Z;
    public boolean a0;
    public b84 b0;
    public la4 d0;
    public final t71[] f;
    public boolean f0;
    public final kg4[] g;
    public final boolean[] h;
    public final m44 h0;
    public final lj4 i;
    public final pj4 j;
    public final lb4 k;
    public final uj4 l;
    public final d13 m;
    public final r2 n;
    public final Looper o;
    public final ez1 p;
    public final sw1 q;
    public final long r;
    public final g53 s;
    public final ArrayList t;
    public final pz u;
    public final ci3 v;
    public final rb4 w;
    public final uu0 x;
    public final long y;
    public final xd4 z;
    public long e0 = -9223372036854775807L;
    public int S = 0;
    public boolean T = false;
    public boolean N = false;
    public float g0 = 1.0f;
    public kc4 F = kc4.b;
    public long c0 = -9223372036854775807L;
    public long Q = -9223372036854775807L;

    public jb4(Context context, kg4[] kg4VarArr, kg4[] kg4VarArr2, lj4 lj4Var, pj4 pj4Var, lb4 lb4Var, uj4 uj4Var, md4 md4Var, lc4 lc4Var, m44 m44Var, long j, Looper looper, pz pzVar, ci3 ci3Var, xd4 xd4Var, la4 la4Var) {
        Looper looper2;
        this.v = ci3Var;
        this.i = lj4Var;
        this.j = pj4Var;
        this.k = lb4Var;
        this.l = uj4Var;
        boolean z = false;
        this.E = lc4Var;
        this.h0 = m44Var;
        this.y = j;
        this.u = pzVar;
        this.z = xd4Var;
        this.d0 = la4Var;
        this.A = md4Var;
        this.r = lb4Var.c();
        aw1 aw1Var = oz1.a;
        dc4 dc4VarA = dc4.a(pj4Var);
        this.K = dc4VarA;
        this.L = new r60(dc4VarA);
        int length = kg4VarArr.length;
        this.g = new kg4[2];
        this.h = new boolean[2];
        lj4Var.getClass();
        this.f = new t71[2];
        boolean z2 = false;
        for (int i = 0; i < 2; i++) {
            kg4 kg4Var = kg4VarArr[i];
            kg4Var.j = i;
            kg4Var.k = xd4Var;
            kg4Var.l = pzVar;
            kg4[] kg4VarArr3 = this.g;
            kg4Var.getClass();
            kg4VarArr3[i] = kg4Var;
            kg4 kg4Var2 = this.g[i];
            synchronized (kg4Var2.f) {
                kg4Var2.w = lj4Var;
            }
            kg4 kg4Var3 = kg4VarArr2[i];
            if (kg4Var3 != null) {
                kg4Var3.j = i;
                kg4Var3.k = xd4Var;
                kg4Var3.l = pzVar;
                z2 = true;
            }
            t71[] t71VarArr = this.f;
            kg4 kg4Var4 = kg4VarArr[i];
            t71 t71Var = new t71();
            t71Var.e = kg4Var4;
            t71Var.a = i;
            t71Var.f = kg4Var3;
            t71Var.b = 0;
            t71Var.c = false;
            t71Var.d = false;
            t71VarArr[i] = t71Var;
        }
        this.C = z2;
        this.s = new g53(this);
        this.t = new ArrayList();
        this.p = new ez1();
        this.q = new sw1();
        zt0.b0(lj4Var.a == null);
        lj4Var.a = this;
        lj4Var.b = uj4Var;
        this.a0 = true;
        d13 d13VarP = pzVar.p(looper, null);
        this.B = d13VarP;
        this.w = new rb4(md4Var, d13VarP, new x34(this), la4Var);
        this.x = new uu0(this, md4Var, d13VarP, xd4Var);
        r2 r2Var = new r2(6);
        this.n = r2Var;
        synchronized (r2Var.h) {
            try {
                if (((Looper) r2Var.i) == null) {
                    if (r2Var.g == 0 && ((HandlerThread) r2Var.j) == null) {
                        z = true;
                    }
                    zt0.b0(z);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    r2Var.j = handlerThread;
                    handlerThread.start();
                    r2Var.i = ((HandlerThread) r2Var.j).getLooper();
                }
                r2Var.g++;
                looper2 = (Looper) r2Var.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o = looper2;
        d13 d13VarP2 = pzVar.p(looper2, this);
        this.m = d13VarP2;
        this.D = new r24(context, looper2, this);
        d13VarP2.a(35, new be1() { // from class: ab4
            @Override // defpackage.be1
            public final /* synthetic */ void b(long j2, long j3, ph4 ph4Var, MediaFormat mediaFormat) {
                this.f.b(j2, j3, ph4Var, mediaFormat);
            }
        }).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jh4, mi4] */
    public static final boolean A(pb4 pb4Var) {
        if (pb4Var != null) {
            try {
                ?? r1 = pb4Var.a;
                if (pb4Var.e) {
                    li4[] li4VarArr = pb4Var.c;
                    for (int i = 0; i < 2; i++) {
                        li4 li4Var = li4VarArr[i];
                        if (li4Var != null) {
                            li4Var.h();
                        }
                    }
                } else {
                    r1.r();
                }
                if ((!pb4Var.e ? 0L : r1.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(ez1 ez1Var, sw1 sw1Var, int i, boolean z, Object obj, oz1 oz1Var, oz1 oz1Var2) {
        ez1 ez1Var2 = ez1Var;
        oz1 oz1Var3 = oz1Var;
        Object obj2 = oz1Var3.b(oz1Var3.o(obj, sw1Var).c, ez1Var, 0L).a;
        for (int i2 = 0; i2 < oz1Var2.a(); i2++) {
            if (oz1Var2.b(i2, ez1Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iE = oz1Var3.e(obj);
        int iC = oz1Var3.c();
        int iE2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= iC || iE2 != -1) {
                break;
            }
            oz1 oz1Var4 = oz1Var3;
            int iL = oz1Var4.l(iE, sw1Var, ez1Var2, i, z);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = oz1Var2.e(oz1Var4.f(iL));
            i3++;
            oz1Var3 = oz1Var4;
            iE = iL;
            ez1Var2 = ez1Var;
        }
        if (iE2 == -1) {
            return -1;
        }
        return oz1Var2.d(iE2, sw1Var, false).c;
    }

    public static Pair z(oz1 oz1Var, ib4 ib4Var, int i, boolean z, ez1 ez1Var, sw1 sw1Var) {
        oz1 oz1Var2 = ib4Var.a;
        if (oz1Var.g()) {
            return null;
        }
        oz1 oz1Var3 = true == oz1Var2.g() ? oz1Var : oz1Var2;
        try {
            Pair pairM = oz1Var3.m(ez1Var, sw1Var, ib4Var.b, ib4Var.c);
            if (!oz1Var.equals(oz1Var3)) {
                if (oz1Var.e(pairM.first) == -1) {
                    int iW = W(ez1Var, sw1Var, i, z, pairM.first, oz1Var3, oz1Var);
                    if (iW != -1) {
                        return oz1Var.m(ez1Var, sw1Var, iW, -9223372036854775807L);
                    }
                    return null;
                }
                if (oz1Var3.o(pairM.first, sw1Var).e && oz1Var3.b(sw1Var.c, ez1Var, 0L).k == oz1Var3.e(pairM.first)) {
                    return oz1Var.m(ez1Var, sw1Var, oz1Var.o(pairM.first, sw1Var).c, ib4Var.c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            t71[] t71VarArr = this.f;
            int iR = t71VarArr[i].r();
            t71 t71Var = t71VarArr[i];
            kg4 kg4Var = (kg4) t71Var.e;
            kg4 kg4Var2 = (kg4) t71Var.f;
            g53 g53Var = this.s;
            t71Var.i(kg4Var, g53Var);
            if (kg4Var2 != null) {
                boolean z = (kg4Var2.m == 0 || t71Var.b == 3) ? false : true;
                t71Var.i(kg4Var2, g53Var);
                t71Var.j(false);
                if (z) {
                    kg4 kg4Var3 = (kg4) t71Var.e;
                    kg4Var2.getClass();
                    kg4Var2.a(17, kg4Var3);
                }
            }
            t71Var.b = 0;
            m(i, false);
            this.V -= iR;
        }
        this.e0 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C() {
        /*
            r10 = this;
            boolean r0 = r10.C
            if (r0 == 0) goto L5e
            boolean r0 = r10.V()
            if (r0 != 0) goto Lb
            goto L5e
        Lb:
            r0 = 0
            r1 = r0
        Ld:
            r2 = 2
            if (r1 >= r2) goto L57
            t71[] r3 = r10.f
            r3 = r3[r1]
            int r4 = r3.r()
            boolean r5 = r3.q()
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            int r5 = r3.b
            r6 = 1
            r7 = 4
            if (r5 == r7) goto L2c
            if (r5 != r2) goto L29
        L27:
            r5 = r6
            goto L2e
        L29:
            r2 = r5
            r5 = r0
            goto L2e
        L2c:
            r2 = r5
            goto L27
        L2e:
            if (r5 == 0) goto L35
            java.lang.Object r8 = r3.e
            kg4 r8 = (defpackage.kg4) r8
            goto L3c
        L35:
            java.lang.Object r8 = r3.f
            kg4 r8 = (defpackage.kg4) r8
            r8.getClass()
        L3c:
            g53 r9 = r10.s
            r3.i(r8, r9)
            r3.j(r5)
            if (r2 != r7) goto L47
            goto L48
        L47:
            r6 = r0
        L48:
            r3.b = r6
        L4a:
            int r2 = r10.V
            int r3 = r3.r()
            int r4 = r4 - r3
            int r2 = r2 - r4
            r10.V = r2
            int r1 = r1 + 1
            goto Ld
        L57:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.e0 = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.D():void");
    }

    public final boolean E() {
        pb4 pb4Var = this.w.h;
        long j = pb4Var.g.e;
        if (pb4Var.e) {
            return j == -9223372036854775807L || this.K.r < j || !T();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(defpackage.oz1 r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.F(oz1, boolean):void");
    }

    public final void G(oz1 oz1Var, kh4 kh4Var, oz1 oz1Var2, kh4 kh4Var2, long j, boolean z) {
        if (!o(oz1Var, kh4Var)) {
            sr1 sr1Var = kh4Var.b() ? sr1.d : this.K.o;
            g53 g53Var = this.s;
            if (g53Var.g().equals(sr1Var)) {
                return;
            }
            this.m.c(16);
            g53Var.b(sr1Var);
            K(this.K.o, sr1Var.a, false, false);
            return;
        }
        Object obj = kh4Var.a;
        sw1 sw1Var = this.q;
        int i = oz1Var.o(obj, sw1Var).c;
        ez1 ez1Var = this.p;
        oz1Var.b(i, ez1Var, 0L);
        qg1 qg1Var = ez1Var.h;
        String str = v23.a;
        m44 m44Var = this.h0;
        m44Var.getClass();
        qg1Var.getClass();
        long jR = v23.r(-9223372036854775807L);
        m44Var.c = jR;
        m44Var.f = jR;
        m44Var.g = jR;
        m44Var.c();
        if (j != -9223372036854775807L) {
            m44Var.d = n(oz1Var, obj, j);
            m44Var.c();
            return;
        }
        if (!Objects.equals(!oz1Var2.g() ? oz1Var2.b(oz1Var2.o(kh4Var2.a, sw1Var).c, ez1Var, 0L).a : null, ez1Var.a) || z) {
            m44Var.d = -9223372036854775807L;
            m44Var.c();
        }
    }

    public final long H(pb4 pb4Var) {
        if (pb4Var == null) {
            return 0L;
        }
        long jMax = pb4Var.p;
        if (pb4Var.e) {
            for (int i = 0; i < 2; i++) {
                t71[] t71VarArr = this.f;
                if (t71VarArr[i].m(pb4Var) != null) {
                    kg4 kg4VarM = t71VarArr[i].m(pb4Var);
                    Objects.requireNonNull(kg4VarM);
                    long j = kg4VarM.r;
                    if (j == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j, jMax);
                }
            }
        }
        return jMax;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jh4, mi4] */
    public final void I() {
        boolean z;
        rb4 rb4Var = this.w;
        rb4Var.z();
        pb4 pb4Var = rb4Var.l;
        if (pb4Var != null) {
            ?? r1 = pb4Var.a;
            if ((!pb4Var.d || pb4Var.e) && !r1.o()) {
                oz1 oz1Var = this.K.a;
                if (pb4Var.e) {
                    r1.j();
                }
                if (this.k.g()) {
                    if (!pb4Var.d) {
                        long j = pb4Var.g.b;
                        pb4Var.d = true;
                        r1.a(this, j);
                        return;
                    }
                    mb4 mb4Var = new mb4();
                    mb4Var.a = this.X - pb4Var.p;
                    float f = this.s.g().a;
                    zt0.D(f > 0.0f || f == -3.4028235E38f);
                    mb4Var.b = f;
                    long j2 = this.Q;
                    if (j2 >= 0) {
                        z = true;
                    } else if (j2 == -9223372036854775807L) {
                        j2 = -9223372036854775807L;
                        z = true;
                    } else {
                        z = false;
                    }
                    zt0.D(z);
                    mb4Var.c = j2;
                    nb4 nb4Var = new nb4(mb4Var);
                    zt0.b0(pb4Var.m == null);
                    r1.b(nb4Var);
                }
            }
        }
    }

    public final void J() {
        pb4 pb4Var = this.w.h;
        boolean z = false;
        if (pb4Var != null && pb4Var.g.g && this.N) {
            z = true;
        }
        this.O = z;
    }

    public final void K(sr1 sr1Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.L.f(1);
            }
            dc4 dc4Var = this.K;
            this.K = new dc4(dc4Var.a, dc4Var.b, dc4Var.c, dc4Var.d, dc4Var.e, dc4Var.f, dc4Var.g, dc4Var.h, dc4Var.i, dc4Var.j, dc4Var.k, dc4Var.l, dc4Var.m, dc4Var.n, sr1Var, dc4Var.p, dc4Var.q, dc4Var.r, dc4Var.s);
        }
        float f2 = sr1Var.a;
        pb4 pb4Var = this.w.h;
        while (true) {
            i = 0;
            if (pb4Var == null) {
                break;
            }
            nj4[] nj4VarArr = (nj4[]) pb4Var.o.h;
            int length = nj4VarArr.length;
            while (i < length) {
                nj4 nj4Var = nj4VarArr[i];
                i++;
            }
            pb4Var = pb4Var.m;
        }
        t71[] t71VarArr = this.f;
        while (i < 2) {
            t71 t71Var = t71VarArr[i];
            ((kg4) t71Var.e).q(f, f2);
            kg4 kg4Var = (kg4) t71Var.f;
            if (kg4Var != null) {
                kg4Var.q(f, f2);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mi4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, mi4] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, jh4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.L():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, mi4] */
    public final void M() {
        pb4 pb4Var = this.w.k;
        boolean z = true;
        if (!this.R && (pb4Var == null || !pb4Var.a.o())) {
            z = false;
        }
        dc4 dc4Var = this.K;
        if (z != dc4Var.g) {
            this.K = dc4Var.f(z);
        }
    }

    public final dc4 N(kh4 kh4Var, long j, long j2, long j3, boolean z, int i) {
        ri4 ri4Var;
        pj4 pj4Var;
        List list;
        sn3 sn3VarF;
        ri4 ri4Var2;
        this.a0 = (!this.a0 && j == this.K.r && kh4Var.equals(this.K.b)) ? false : true;
        J();
        dc4 dc4Var = this.K;
        ri4 ri4Var3 = dc4Var.h;
        pj4 pj4Var2 = dc4Var.i;
        List list2 = dc4Var.j;
        if (this.x.f) {
            rb4 rb4Var = this.w;
            pb4 pb4Var = rb4Var.h;
            ri4 ri4Var4 = pb4Var == null ? ri4.d : pb4Var.n;
            pj4 pj4Var3 = pb4Var == null ? this.j : pb4Var.o;
            nj4[] nj4VarArr = (nj4[]) pj4Var3.h;
            um3 um3Var = new um3(4);
            int length = nj4VarArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                nj4 nj4Var = nj4VarArr[i2];
                if (nj4Var != null) {
                    wn1 wn1Var = nj4Var.c(0).k;
                    if (wn1Var == null) {
                        ri4Var2 = ri4Var4;
                        um3Var.a(new wn1(new en1[0]));
                    } else {
                        ri4Var2 = ri4Var4;
                        um3Var.a(wn1Var);
                        z2 = true;
                    }
                } else {
                    ri4Var2 = ri4Var4;
                }
                i2++;
                ri4Var4 = ri4Var2;
            }
            ri4 ri4Var5 = ri4Var4;
            if (z2) {
                sn3VarF = um3Var.f();
            } else {
                vm3 vm3Var = xm3.g;
                sn3VarF = sn3.j;
            }
            if (pb4Var != null) {
                qb4 qb4Var = pb4Var.g;
                if (qb4Var.c != j2) {
                    pb4Var.g = qb4Var.b(j2);
                }
            }
            pb4 pb4Var2 = rb4Var.h;
            if (pb4Var2 == rb4Var.i && pb4Var2 != null) {
                pj4 pj4Var4 = pb4Var2.o;
                int i3 = 0;
                while (true) {
                    t71[] t71VarArr = this.f;
                    if (i3 >= 2) {
                        break;
                    }
                    if (pj4Var4.a(i3)) {
                        if (((kg4) t71VarArr[i3].e).g != 1) {
                            break;
                        }
                        ((jc4[]) pj4Var4.g)[i3].getClass();
                    }
                    i3++;
                }
            }
            list = sn3VarF;
            pj4Var = pj4Var3;
            ri4Var = ri4Var5;
        } else {
            if (!kh4Var.equals(dc4Var.b)) {
                pj4Var2 = this.j;
                ri4Var3 = ri4.d;
                list2 = sn3.j;
            }
            ri4Var = ri4Var3;
            pj4Var = pj4Var2;
            list = list2;
        }
        if (z) {
            r60 r60Var = this.L;
            if (!r60Var.d || r60Var.e == 5) {
                r60Var.c = true;
                r60Var.d = true;
                r60Var.e = i;
            } else {
                zt0.D(i == 5);
            }
        }
        dc4 dc4Var2 = this.K;
        return dc4Var2.b(kh4Var, j, j2, j3, R(dc4Var2.p), ri4Var, pj4Var, list);
    }

    public final void O(boolean[] zArr, long j) {
        t71[] t71VarArr;
        long j2;
        pb4 pb4Var = this.w.i;
        pj4 pj4Var = pb4Var.o;
        int i = 0;
        while (true) {
            t71VarArr = this.f;
            if (i >= 2) {
                break;
            }
            if (!pj4Var.a(i)) {
                t71VarArr[i].b();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (pj4Var.a(i2) && t71VarArr[i2].m(pb4Var) == null) {
                j2 = j;
                P(pb4Var, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void P(pb4 pb4Var, int i, boolean z, long j) {
        int iB;
        int i2;
        t71 t71Var = this.f[i];
        if (t71Var.g()) {
            return;
        }
        boolean z2 = pb4Var == this.w.h;
        pj4 pj4Var = pb4Var.o;
        jc4 jc4Var = ((jc4[]) pj4Var.g)[i];
        nj4 nj4Var = ((nj4[]) pj4Var.h)[i];
        boolean z3 = T() && this.K.e == 3;
        boolean z4 = !z && z3;
        this.V++;
        li4 li4Var = pb4Var.c[i];
        long j2 = pb4Var.p;
        kh4 kh4Var = pb4Var.g.a;
        if (nj4Var != null) {
            iB = nj4Var.b();
            i2 = 0;
        } else {
            iB = 0;
            i2 = 0;
        }
        ph4[] ph4VarArr = new ph4[iB];
        while (i2 < iB) {
            nj4Var.getClass();
            ph4VarArr[i2] = nj4Var.c(i2);
            i2++;
        }
        int i3 = t71Var.b;
        g53 g53Var = this.s;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            t71Var.c = true;
            kg4 kg4Var = (kg4) t71Var.e;
            zt0.b0(kg4Var.m == 0);
            kg4Var.i = jc4Var;
            kg4Var.v = kh4Var;
            kg4Var.m = 1;
            kg4Var.p0(z4, z2);
            kg4Var.l0(ph4VarArr, li4Var, j, j2, kh4Var);
            kg4Var.L(j, z4, true);
            g53Var.c(kg4Var);
        } else {
            t71Var.d = true;
            kg4 kg4Var2 = (kg4) t71Var.f;
            kg4Var2.getClass();
            zt0.b0(kg4Var2.m == 0);
            kg4Var2.i = jc4Var;
            kg4Var2.v = kh4Var;
            kg4Var2.m = 1;
            kg4Var2.p0(z4, z2);
            kg4Var2.l0(ph4VarArr, li4Var, j, j2, kh4Var);
            kg4Var2.L(j, z4, true);
            g53Var.c(kg4Var2);
        }
        za4 za4Var = new za4(this);
        kg4 kg4VarM = t71Var.m(pb4Var);
        kg4VarM.getClass();
        kg4VarM.a(11, za4Var);
        if (z3 && z2) {
            t71Var.D();
        }
    }

    public final void Q(boolean z) {
        pb4 pb4Var = this.w.k;
        kh4 kh4Var = pb4Var == null ? this.K.b : pb4Var.g.a;
        boolean zEquals = this.K.k.equals(kh4Var);
        if (!zEquals) {
            this.K = this.K.g(kh4Var);
        }
        dc4 dc4Var = this.K;
        dc4Var.p = pb4Var == null ? dc4Var.r : pb4Var.d();
        dc4 dc4Var2 = this.K;
        dc4Var2.q = R(dc4Var2.p);
        if ((!zEquals || z) && pb4Var != null && pb4Var.e) {
            S(pb4Var.g.a, pb4Var.n, pb4Var.o);
        }
    }

    public final long R(long j) {
        pb4 pb4Var = this.w.k;
        if (pb4Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.X - pb4Var.p));
    }

    public final void S(kh4 kh4Var, ri4 ri4Var, pj4 pj4Var) {
        pb4 pb4Var = this.w.k;
        pb4Var.getClass();
        long jR = R(pb4Var.d());
        long j = o(this.K.a, pb4Var.g.a) ? this.h0.h : -9223372036854775807L;
        oz1 oz1Var = this.K.a;
        float f = this.s.g().a;
        boolean z = this.K.l;
        this.k.b(new kb4(this.z, oz1Var, kh4Var, jR, f, this.P, j), (nj4[]) pj4Var.h);
    }

    public final boolean T() {
        dc4 dc4Var = this.K;
        return dc4Var.l && dc4Var.n == 0;
    }

    public final void U(int i) {
        t71 t71Var = this.f[i];
        try {
            pb4 pb4Var = this.w.h;
            if (pb4Var == null) {
                throw null;
            }
            kg4 kg4VarM = t71Var.m(pb4Var);
            kg4VarM.getClass();
            li4 li4Var = kg4VarM.n;
            li4Var.getClass();
            li4Var.h();
        } catch (IOException | RuntimeException e) {
            int i2 = ((kg4) t71Var.e).g;
            throw e;
        }
    }

    public final boolean V() {
        if (!this.C) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f[i].q()) {
                return true;
            }
        }
        return false;
    }

    public final void a(IOException iOException, int i) {
        b84 b84Var = new b84(0, iOException, i);
        pb4 pb4Var = this.w.h;
        if (pb4Var != null) {
            b84Var = b84Var.a(pb4Var.g.a);
        }
        a30.C("ExoPlayerImplInternal", "Playback error", b84Var);
        u(false, false);
        this.K = this.K.e(b84Var);
    }

    @Override // defpackage.be1
    public final void b(long j, long j2, ph4 ph4Var, MediaFormat mediaFormat) {
        if (this.H) {
            Handler handler = this.m.a;
            v03 v03VarF = d13.f();
            v03VarF.a = handler.obtainMessage(37);
            v03VarF.a();
        }
    }

    @Override // defpackage.ih4
    public final /* bridge */ /* synthetic */ void c(mi4 mi4Var) {
        this.m.a(9, (jh4) mi4Var).a();
    }

    public final void d(int i) {
        dc4 dc4Var = this.K;
        if (dc4Var.e != i) {
            if (i != 2) {
                this.c0 = -9223372036854775807L;
            }
            this.K = dc4Var.d(i);
        }
    }

    public final void e() {
        r60 r60Var = this.L;
        dc4 dc4Var = this.K;
        boolean z = r60Var.c | (((dc4) r60Var.f) != dc4Var);
        r60Var.c = z;
        r60Var.f = dc4Var;
        if (z) {
            ya4 ya4Var = (ya4) this.v.g;
            ya4Var.q.d(new sz2(ya4Var, r60Var, 20));
            this.L = new r60(this.K);
        }
    }

    public final void f(float f) {
        this.g0 = f;
        float f2 = f * this.D.g;
        for (int i = 0; i < 2; i++) {
            t71 t71Var = this.f[i];
            kg4 kg4Var = (kg4) t71Var.e;
            if (kg4Var.g == 1) {
                Float fValueOf = Float.valueOf(f2);
                kg4Var.a(2, fValueOf);
                kg4 kg4Var2 = (kg4) t71Var.f;
                if (kg4Var2 != null) {
                    kg4Var2.a(2, fValueOf);
                }
            }
        }
    }

    @Override // defpackage.ih4
    public final void g(jh4 jh4Var) {
        this.m.a(8, jh4Var).a();
    }

    public final void h(int i, int i2, int i3, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.G;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        dc4 dc4Var = this.K;
        if (dc4Var.l == z2 && dc4Var.n == i2 && dc4Var.m == i3) {
            return;
        }
        this.K = dc4Var.h(i3, i2, z2);
        y(false, false);
        rb4 rb4Var = this.w;
        for (pb4 pb4Var = rb4Var.h; pb4Var != null; pb4Var = pb4Var.m) {
            for (nj4 nj4Var : (nj4[]) pb4Var.o.h) {
            }
        }
        if (!T()) {
            k();
            l();
            this.K.getClass();
            rb4Var.n(this.X);
            return;
        }
        int i4 = this.K.e;
        d13 d13Var = this.m;
        if (i4 != 3) {
            if (i4 == 2) {
                d13Var.b(2);
                return;
            }
            return;
        }
        g53 g53Var = this.s;
        g53Var.g = true;
        nc4 nc4Var = (nc4) g53Var.h;
        if (!nc4Var.f) {
            nc4Var.h = SystemClock.elapsedRealtime();
            nc4Var.f = true;
        }
        j();
        d13Var.b(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:293:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x063c A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TRY_LEAVE, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x077e A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, LOOP:18: B:371:0x077c->B:372:0x077e, LOOP_END, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x08b7 A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, LOOP:8: B:447:0x08b5->B:448:0x08b7, LOOP_END, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x08c5 A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08d5 A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a6d A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a91 A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0aad A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0b30 A[Catch: IOException -> 0x0028, di3 -> 0x002b, lq1 -> 0x002e, if4 -> 0x0031, RuntimeException -> 0x05de, b84 -> 0x05e1, TryCatch #24 {b84 -> 0x05e1, RuntimeException -> 0x05de, blocks: (B:278:0x05da, B:286:0x05f5, B:287:0x05fd, B:289:0x060a, B:291:0x0618, B:296:0x0630, B:389:0x07b3, B:391:0x07b9, B:393:0x07bf, B:396:0x07c4, B:397:0x07cf, B:399:0x07d3, B:403:0x07f8, B:405:0x07fe, B:410:0x080c, B:411:0x0814, B:412:0x0817, B:414:0x0820, B:462:0x08ee, B:463:0x08f3, B:468:0x0900, B:470:0x0908, B:471:0x090e, B:473:0x091c, B:474:0x0935, B:476:0x0939, B:478:0x0941, B:492:0x096b, B:479:0x0946, B:481:0x094f, B:485:0x0958, B:491:0x0968, B:494:0x0975, B:496:0x097b, B:500:0x0988, B:509:0x09c4, B:511:0x09ca, B:513:0x09ce, B:540:0x0a61, B:542:0x0a6d, B:544:0x0a7e, B:545:0x0a87, B:564:0x0ad1, B:567:0x0ad8, B:569:0x0adc, B:574:0x0ae9, B:575:0x0aec, B:576:0x0aef, B:578:0x0af5, B:580:0x0afe, B:582:0x0b06, B:584:0x0b0c, B:586:0x0b12, B:593:0x0b34, B:595:0x0b3a, B:599:0x0b43, B:608:0x0b5d, B:605:0x0b56, B:607:0x0b5a, B:587:0x0b19, B:590:0x0b27, B:591:0x0b2f, B:592:0x0b30, B:546:0x0a8b, B:548:0x0a91, B:550:0x0a95, B:554:0x0a9e, B:556:0x0aad, B:558:0x0ab3, B:560:0x0abf, B:561:0x0ac4, B:562:0x0ac9, B:563:0x0ace, B:516:0x09dc, B:518:0x09e0, B:520:0x09f2, B:522:0x09fd, B:524:0x0a05, B:528:0x0a0e, B:530:0x0a18, B:536:0x0a23, B:502:0x0990, B:504:0x0994, B:505:0x09ae, B:507:0x09b4, B:493:0x096e, B:417:0x0829, B:419:0x082d, B:421:0x0833, B:423:0x0839, B:425:0x0843, B:428:0x0849, B:429:0x084c, B:431:0x0855, B:433:0x0867, B:435:0x0870, B:437:0x0878, B:442:0x0884, B:444:0x08ac, B:446:0x08b2, B:448:0x08b7, B:449:0x08bf, B:451:0x08c5, B:452:0x08c8, B:453:0x08d1, B:455:0x08d5, B:457:0x08db, B:458:0x08e0, B:461:0x08ed, B:299:0x063c, B:309:0x0659, B:314:0x066a, B:318:0x067c, B:325:0x06a1, B:342:0x06d8, B:344:0x070b, B:346:0x070f, B:350:0x071f, B:352:0x0723, B:356:0x072a, B:358:0x0730, B:360:0x074f, B:363:0x0758, B:365:0x075d, B:367:0x0763, B:368:0x076b, B:370:0x0771, B:348:0x0715, B:372:0x077e, B:373:0x0789, B:375:0x078f, B:377:0x0793, B:379:0x0798, B:388:0x07b0, B:385:0x07a7, B:387:0x07ad, B:609:0x0b62, B:613:0x0b6c), top: B:687:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0c65  */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, jh4] */
    /* JADX WARN: Type inference failed for: r3v101, types: [java.lang.Object, jh4] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, jh4] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, jh4] */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.lang.Object, jh4] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean z) {
        kh4 kh4Var = this.w.h.g.a;
        long jR = r(kh4Var, this.K.r, true, false);
        if (jR != this.K.r) {
            dc4 dc4Var = this.K;
            this.K = N(kh4Var, jR, dc4Var.c, dc4Var.d, z, 5);
        }
    }

    public final void j() {
        pb4 pb4Var = this.w.h;
        if (pb4Var == null) {
            return;
        }
        pj4 pj4Var = pb4Var.o;
        for (int i = 0; i < 2; i++) {
            if (pj4Var.a(i)) {
                this.f[i].D();
            }
        }
    }

    public final void k() {
        g53 g53Var = this.s;
        g53Var.g = false;
        nc4 nc4Var = (nc4) g53Var.h;
        if (nc4Var.f) {
            nc4Var.a(nc4Var.e());
            nc4Var.f = false;
        }
        for (int i = 0; i < 2; i++) {
            t71 t71Var = this.f[i];
            kg4 kg4Var = (kg4) t71Var.e;
            if (t71.l(kg4Var)) {
                t71.n(kg4Var);
            }
            kg4 kg4Var2 = (kg4) t71Var.f;
            if (kg4Var2 != null && kg4Var2.m != 0) {
                t71.n(kg4Var2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, jh4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.l():void");
    }

    public final void m(int i, boolean z) {
        boolean[] zArr = this.h;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.B.d(new cd(this, i, z));
        }
    }

    public final long n(oz1 oz1Var, Object obj, long j) {
        int i = oz1Var.o(obj, this.q).c;
        ez1 ez1Var = this.p;
        oz1Var.b(i, ez1Var, 0L);
        if (ez1Var.d == -9223372036854775807L || !ez1Var.b() || !ez1Var.g) {
            return -9223372036854775807L;
        }
        long j2 = ez1Var.e;
        String str = v23.a;
        return v23.r((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - ez1Var.d) - j;
    }

    public final boolean o(oz1 oz1Var, kh4 kh4Var) {
        if (kh4Var.b() || oz1Var.g()) {
            return false;
        }
        int i = oz1Var.o(kh4Var.a, this.q).c;
        ez1 ez1Var = this.p;
        oz1Var.b(i, ez1Var, 0L);
        return ez1Var.b() && ez1Var.g && ez1Var.d != -9223372036854775807L;
    }

    public final void p(long j) {
        boolean z = this.G;
        long j2 = i0;
        if (z) {
            this.F.getClass();
            jMin = this.K.e != 3 ? j2 : 1000L;
            for (int i = 0; i < 2; i++) {
                t71 t71Var = this.f[i];
                long j3 = this.X;
                long j4 = this.Y;
                kg4 kg4Var = (kg4) t71Var.e;
                long jQ = t71.l(kg4Var) ? kg4Var.Q(j3, j4) : Long.MAX_VALUE;
                kg4 kg4Var2 = (kg4) t71Var.f;
                if (kg4Var2 != null && kg4Var2.m != 0) {
                    jQ = Math.min(jQ, kg4Var2.Q(j3, j4));
                }
                jMin = Math.min(jMin, v23.q(jQ));
            }
            if (this.K.i()) {
                pb4 pb4Var = this.w.h;
                if ((pb4Var != null ? pb4Var.m : null) != null) {
                    if (this.X + (v23.r(jMin) * this.K.o.a) >= r0.a()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.K.e != 3 || T()) {
            jMin = j2;
        }
        this.m.a.sendEmptyMessageAtTime(2, jMin + j);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, jh4] */
    public final void q(ib4 ib4Var, boolean z) throws Throwable {
        long jLongValue;
        long j;
        long j2;
        kh4 kh4VarE;
        boolean z2;
        int i;
        long j3;
        boolean z3;
        long j4;
        long jH;
        long j5;
        boolean z4;
        oz1 oz1Var;
        long j6;
        long j7;
        long j8;
        boolean z5;
        dc4 dc4Var;
        int i2;
        this.L.f(z ? 1 : 0);
        if (this.H) {
            if (this.I != null) {
                this.J++;
            }
            this.I = ib4Var;
            return;
        }
        oz1 oz1Var2 = this.K.a;
        int i3 = this.S;
        boolean z6 = this.T;
        ez1 ez1Var = this.p;
        sw1 sw1Var = this.q;
        Pair pairZ = z(oz1Var2, ib4Var, i3, z6, ez1Var, sw1Var);
        if (pairZ == null) {
            Pair pairW = w(this.K.a);
            kh4 kh4Var = (kh4) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z2 = !this.K.a.g();
            kh4VarE = kh4Var;
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j9 = ib4Var.c;
            j = j9 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            j2 = 0;
            kh4VarE = this.w.E(this.K.a, obj);
            if (kh4VarE.b()) {
                this.K.a.o(kh4VarE.a, sw1Var);
                cd1 cd1VarA = sw1Var.f.a(-1);
                int i4 = 0;
                while (true) {
                    int[] iArr = cd1VarA.d;
                    if (i4 >= iArr.length || (i = iArr[i4]) == 0 || i == 1) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    sw1Var.f.getClass();
                }
                z2 = true;
                jLongValue = 0;
            } else {
                z2 = j9 == -9223372036854775807L;
            }
        }
        try {
            if (this.K.a.g()) {
                this.W = ib4Var;
            } else if (pairZ == null) {
                if (this.K.e != 1) {
                    d(4);
                }
                v(false, true, false, true);
            } else {
                if (kh4VarE.equals(this.K.b)) {
                    pb4 pb4Var = this.w.h;
                    if (pb4Var == null || !pb4Var.e || jLongValue == j2) {
                        jH = jLongValue;
                    } else {
                        ?? r0 = pb4Var.a;
                        long j10 = ez1Var.j;
                        if (this.G && j10 != -9223372036854775807L) {
                            this.F.getClass();
                        }
                        jH = r0.h(jLongValue, this.E);
                    }
                    if (v23.q(jH) == v23.q(this.K.r) && ((i2 = (dc4Var = this.K).e) == 2 || i2 == 3)) {
                        jLongValue = dc4Var.r;
                    }
                } else {
                    jH = jLongValue;
                }
                this.H = this.G;
                boolean z7 = this.K.e == 4;
                rb4 rb4Var = this.w;
                if (rb4Var.h != rb4Var.i) {
                    j5 = jH;
                    z4 = true;
                } else {
                    j5 = jH;
                    z4 = false;
                }
                long jR = r(kh4VarE, j5, z4, z7);
                boolean z8 = z2 | (jLongValue != jR);
                try {
                    dc4 dc4Var2 = this.K;
                    kh4 kh4Var2 = kh4VarE;
                    try {
                        oz1Var = dc4Var2.a;
                        j6 = j;
                    } catch (Throwable th) {
                        th = th;
                        kh4VarE = kh4Var2;
                        j3 = j;
                        j4 = jR;
                        z3 = z8;
                        this.K = N(kh4VarE, j4, j3, j4, z3, 2);
                        throw th;
                    }
                    try {
                        G(oz1Var, kh4Var2, oz1Var, dc4Var2.b, j6, true);
                        kh4VarE = kh4Var2;
                        j7 = j6;
                        j8 = jR;
                        z5 = z8;
                        this.K = N(kh4VarE, j8, j7, j8, z5, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        kh4VarE = kh4Var2;
                        j3 = j6;
                        j4 = jR;
                        z3 = z8;
                        this.K = N(kh4VarE, j4, j3, j4, z3, 2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z5 = z2;
            j8 = jLongValue;
            j7 = j;
            this.K = N(kh4VarE, j8, j7, j8, z5, 2);
        } catch (Throwable th4) {
            th = th4;
            j3 = j;
            z3 = z2;
            j4 = jLongValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, jh4] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, jh4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r(defpackage.kh4 r10, long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.r(kh4, long, boolean, boolean):long");
    }

    public final void s(long j, boolean z) {
        pb4 pb4Var = this.w.h;
        long j2 = j + (pb4Var == null ? 1000000000000L : pb4Var.p);
        this.X = j2;
        ((nc4) this.s.h).a(j2);
        for (int i = 0; i < 2; i++) {
            t71 t71Var = this.f[i];
            long j3 = this.X;
            kg4 kg4VarM = t71Var.m(pb4Var);
            if (kg4VarM != null) {
                kg4VarM.L(j3, false, z);
            }
        }
        for (pb4 pb4Var2 = r0.h; pb4Var2 != null; pb4Var2 = pb4Var2.m) {
            for (nj4 nj4Var : (nj4[]) pb4Var2.o.h) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            t71 t71Var = this.f[i];
            kc4 kc4Var = this.G ? this.F : null;
            ((kg4) t71Var.e).a(18, kc4Var);
            kg4 kg4Var = (kg4) t71Var.f;
            if (kg4Var != null) {
                kg4Var.a(18, kc4Var);
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        v(z || !this.U, false, true, false);
        this.L.f(z2 ? 1 : 0);
        this.k.e(this.z);
        this.D.b(1, this.K.l);
        d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[PHI: r2 r7 r9
  0x00b2: PHI (r2v2 kh4) = (r2v1 kh4), (r2v8 kh4) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r7v4 long) = (r7v3 long), (r7v18 long) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:30:0x0088, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb4.v(boolean, boolean, boolean, boolean):void");
    }

    public final Pair w(oz1 oz1Var) {
        int i;
        long j = 0;
        if (oz1Var.g()) {
            return Pair.create(dc4.t, 0L);
        }
        int iK = oz1Var.k(this.T);
        ez1 ez1Var = this.p;
        sw1 sw1Var = this.q;
        Pair pairM = oz1Var.m(ez1Var, sw1Var, iK, -9223372036854775807L);
        kh4 kh4VarE = this.w.E(oz1Var, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (kh4VarE.b()) {
            oz1Var.o(kh4VarE.a, sw1Var);
            cd1 cd1VarA = sw1Var.f.a(-1);
            int i2 = 0;
            while (true) {
                int[] iArr = cd1VarA.d;
                if (i2 >= iArr.length || (i = iArr[i2]) == 0 || i == 1) {
                    break;
                }
                i2++;
            }
            if (-1 == i2) {
                sw1Var.f.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(kh4VarE, Long.valueOf(j));
    }

    public final void x(oz1 oz1Var, oz1 oz1Var2) {
        if (oz1Var.g() && oz1Var2.g()) {
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z, boolean z2) {
        this.P = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.Q = jElapsedRealtime;
    }
}
