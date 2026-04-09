package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nt1 implements Handler.Callback, hy1, fu1, r0 {

    /* renamed from: d0, reason: collision with root package name */
    public static final long f14409d0 = bq0.r(10000);
    public boolean B;
    public boolean C;
    public mt1 D;
    public int E;
    public eu1 F;
    public x8 G;
    public boolean H;
    public boolean J;
    public boolean K;
    public boolean M;
    public boolean P;
    public int Q;
    public mt1 R;
    public long S;
    public long T;
    public int U;
    public boolean V;
    public us1 W;
    public xs1 Y;

    /* renamed from: a, reason: collision with root package name */
    public final lu1[] f14410a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f14411a0;

    /* renamed from: b, reason: collision with root package name */
    public final pr1[] f14412b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f14414c;

    /* renamed from: c0, reason: collision with root package name */
    public final qs1 f14415c0;

    /* renamed from: d, reason: collision with root package name */
    public final b f14416d;

    /* renamed from: e, reason: collision with root package name */
    public final g f14417e;

    /* renamed from: f, reason: collision with root package name */
    public final pt1 f14418f;
    public final l g;

    /* renamed from: h, reason: collision with root package name */
    public final no0 f14419h;

    /* renamed from: i, reason: collision with root package name */
    public final wb f14420i;
    public final Looper j;

    /* renamed from: k, reason: collision with root package name */
    public final fh f14421k;

    /* renamed from: l, reason: collision with root package name */
    public final tg f14422l;

    /* renamed from: m, reason: collision with root package name */
    public final long f14423m;

    /* renamed from: n, reason: collision with root package name */
    public final in0 f14424n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14425o;

    /* renamed from: p, reason: collision with root package name */
    public final w5 f14426p;

    /* renamed from: q, reason: collision with root package name */
    public final ne0 f14427q;

    /* renamed from: r, reason: collision with root package name */
    public final vt1 f14428r;

    /* renamed from: s, reason: collision with root package name */
    public final wj0 f14429s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14430t;

    /* renamed from: u, reason: collision with root package name */
    public final cv1 f14431u;

    /* renamed from: v, reason: collision with root package name */
    public final wu1 f14432v;

    /* renamed from: w, reason: collision with root package name */
    public final no0 f14433w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14434x;

    /* renamed from: y, reason: collision with root package name */
    public final jw f14435y;

    /* renamed from: z, reason: collision with root package name */
    public nu1 f14436z;
    public long Z = -9223372036854775807L;
    public int N = 0;
    public boolean O = false;
    public boolean I = false;

    /* renamed from: b0, reason: collision with root package name */
    public float f14413b0 = 1.0f;
    public mu1 A = mu1.f14023b;
    public long X = -9223372036854775807L;
    public long L = -9223372036854775807L;

    public nt1(Context context, pr1[] pr1VarArr, pr1[] pr1VarArr2, b bVar, g gVar, pt1 pt1Var, l lVar, wu1 wu1Var, nu1 nu1Var, qs1 qs1Var, long j, Looper looper, w5 w5Var, ne0 ne0Var, cv1 cv1Var, xs1 xs1Var) {
        this.f14427q = ne0Var;
        this.f14416d = bVar;
        this.f14417e = gVar;
        this.f14418f = pt1Var;
        this.g = lVar;
        this.f14436z = nu1Var;
        this.f14415c0 = qs1Var;
        this.f14430t = j;
        this.f14426p = w5Var;
        this.f14431u = cv1Var;
        this.Y = xs1Var;
        this.f14432v = wu1Var;
        this.f14423m = pt1Var.d();
        ag agVar = uh.f17203a;
        eu1 eu1VarA = eu1.a(gVar);
        this.F = eu1VarA;
        this.G = new x8(eu1VarA);
        int length = pr1VarArr.length;
        this.f14412b = new pr1[2];
        this.f14414c = new boolean[2];
        bVar.getClass();
        this.f14410a = new lu1[2];
        boolean z3 = false;
        for (int i4 = 0; i4 < 2; i4++) {
            pr1 pr1Var = pr1VarArr[i4];
            pr1Var.f15086e = i4;
            pr1Var.f15087f = cv1Var;
            pr1Var.g = w5Var;
            pr1[] pr1VarArr3 = this.f14412b;
            pr1Var.getClass();
            pr1VarArr3[i4] = pr1Var;
            pr1 pr1Var2 = this.f14412b[i4];
            synchronized (pr1Var2.f15082a) {
                pr1Var2.f15097r = bVar;
            }
            pr1 pr1Var3 = pr1VarArr2[i4];
            if (pr1Var3 != null) {
                pr1Var3.f15086e = i4;
                pr1Var3.f15087f = cv1Var;
                pr1Var3.g = w5Var;
                z3 = true;
            }
            lu1[] lu1VarArr = this.f14410a;
            pr1 pr1Var4 = pr1VarArr[i4];
            lu1 lu1Var = new lu1();
            lu1Var.f13637e = pr1Var4;
            lu1Var.f13635c = i4;
            lu1Var.f13638f = pr1Var3;
            lu1Var.f13636d = 0;
            lu1Var.f13633a = false;
            lu1Var.f13634b = false;
            lu1VarArr[i4] = lu1Var;
        }
        this.f14434x = z3;
        this.f14424n = new in0(this);
        this.f14425o = new ArrayList();
        this.f14421k = new fh();
        this.f14422l = new tg();
        mq0.c0(bVar.f9506a == null);
        bVar.f9506a = this;
        bVar.f9507b = lVar;
        this.V = true;
        no0 no0VarA = w5Var.A(looper, null);
        this.f14433w = no0VarA;
        this.f14428r = new vt1(wu1Var, no0VarA, new kh0(20, this), xs1Var);
        this.f14429s = new wj0(this, wu1Var, no0VarA, cv1Var);
        wb wbVar = new wb();
        wbVar.f17958b = new Object();
        wbVar.f17959c = null;
        wbVar.f17960d = null;
        wbVar.f17957a = 0;
        this.f14420i = wbVar;
        Looper looperA = wbVar.a();
        this.j = looperA;
        no0 no0VarA2 = w5Var.A(looperA, this);
        this.f14419h = no0VarA2;
        this.f14435y = new jw(context, looperA, this);
        no0VarA2.b(35, new r0() { // from class: com.google.android.gms.internal.ads.kt1
            @Override // com.google.android.gms.internal.ads.r0
            public final /* synthetic */ void a(long j8, long j9, mx1 mx1Var, MediaFormat mediaFormat) {
                this.f13240a.a(j8, j9, mx1Var, mediaFormat);
            }
        }).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.iy1, com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public static final boolean A(tt1 tt1Var) {
        if (tt1Var != null) {
            try {
                ?? r12 = tt1Var.f16948a;
                if (tt1Var.f16952e) {
                    iz1[] iz1VarArr = tt1Var.f16950c;
                    for (int i4 = 0; i4 < 2; i4++) {
                        iz1 iz1Var = iz1VarArr[i4];
                        if (iz1Var != null) {
                            iz1Var.zzc();
                        }
                    }
                } else {
                    r12.h();
                }
                if ((!tt1Var.f16952e ? 0L : r12.B1()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(fh fhVar, tg tgVar, int i4, boolean z3, Object obj, uh uhVar, uh uhVar2) {
        fh fhVar2 = fhVar;
        uh uhVar3 = uhVar;
        Object obj2 = uhVar3.b(uhVar3.o(obj, tgVar).f16811c, fhVar, 0L).f11164a;
        for (int i10 = 0; i10 < uhVar2.a(); i10++) {
            if (uhVar2.b(i10, fhVar, 0L).f11164a.equals(obj2)) {
                return i10;
            }
        }
        int iE = uhVar3.e(obj);
        int iC = uhVar3.c();
        int iE2 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= iC || iE2 != -1) {
                break;
            }
            uh uhVar4 = uhVar3;
            int iL = uhVar4.l(iE, tgVar, fhVar2, i4, z3);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = uhVar2.e(uhVar4.f(iL));
            i11++;
            uhVar3 = uhVar4;
            iE = iL;
            fhVar2 = fhVar;
        }
        if (iE2 == -1) {
            return -1;
        }
        return uhVar2.d(iE2, tgVar, false).f16811c;
    }

    public static Pair z(uh uhVar, mt1 mt1Var, int i4, boolean z3, fh fhVar, tg tgVar) {
        uh uhVar2 = mt1Var.f14014a;
        if (uhVar.g()) {
            return null;
        }
        uh uhVar3 = true == uhVar2.g() ? uhVar : uhVar2;
        try {
            Pair pairM = uhVar3.m(fhVar, tgVar, mt1Var.f14015b, mt1Var.f14016c);
            if (!uhVar.equals(uhVar3)) {
                if (uhVar.e(pairM.first) == -1) {
                    int iW = W(fhVar, tgVar, i4, z3, pairM.first, uhVar3, uhVar);
                    if (iW != -1) {
                        return uhVar.m(fhVar, tgVar, iW, -9223372036854775807L);
                    }
                    return null;
                }
                if (uhVar3.o(pairM.first, tgVar).f16813e && uhVar3.b(tgVar.f16811c, fhVar, 0L).f11172k == uhVar3.e(pairM.first)) {
                    return uhVar.m(fhVar, tgVar, uhVar.o(pairM.first, tgVar).f16811c, mt1Var.f14016c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i4 = 0; i4 < 2; i4++) {
            lu1[] lu1VarArr = this.f14410a;
            int iR = lu1VarArr[i4].r();
            lu1 lu1Var = lu1VarArr[i4];
            pr1 pr1Var = (pr1) lu1Var.f13637e;
            pr1 pr1Var2 = (pr1) lu1Var.f13638f;
            in0 in0Var = this.f14424n;
            lu1Var.i(pr1Var, in0Var);
            if (pr1Var2 != null) {
                boolean z3 = (pr1Var2.f15088h == 0 || lu1Var.f13636d == 3) ? false : true;
                lu1Var.i(pr1Var2, in0Var);
                lu1Var.j(false);
                if (z3) {
                    pr1 pr1Var3 = (pr1) lu1Var.f13637e;
                    pr1Var2.getClass();
                    pr1Var2.b(17, pr1Var3);
                }
            }
            lu1Var.f13636d = 0;
            m(i4, false);
            this.Q -= iR;
        }
        this.Z = -9223372036854775807L;
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
            boolean r0 = r10.f14434x
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
            com.google.android.gms.internal.ads.lu1[] r3 = r10.f14410a
            r3 = r3[r1]
            int r4 = r3.r()
            boolean r5 = r3.q()
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            int r5 = r3.f13636d
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
            java.lang.Object r8 = r3.f13637e
            com.google.android.gms.internal.ads.pr1 r8 = (com.google.android.gms.internal.ads.pr1) r8
            goto L3c
        L35:
            java.lang.Object r8 = r3.f13638f
            com.google.android.gms.internal.ads.pr1 r8 = (com.google.android.gms.internal.ads.pr1) r8
            r8.getClass()
        L3c:
            com.google.android.gms.internal.ads.in0 r9 = r10.f14424n
            r3.i(r8, r9)
            r3.j(r5)
            if (r2 != r7) goto L47
            goto L48
        L47:
            r6 = r0
        L48:
            r3.f13636d = r6
        L4a:
            int r2 = r10.Q
            int r3 = r3.r()
            int r4 = r4 - r3
            int r2 = r2 - r4
            r10.Q = r2
            int r1 = r1 + 1
            goto Ld
        L57:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.Z = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.C():void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.D():void");
    }

    public final boolean E() {
        tt1 tt1Var = this.f14428r.f17711h;
        long j = tt1Var.g.f17339e;
        if (tt1Var.f16952e) {
            return j == -9223372036854775807L || this.F.f10887r < j || !T();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2 A[PHI: r27
  0x01a2: PHI (r27v0 boolean) = (r27v2 boolean), (r27v3 boolean) binds: [B:67:0x0196, B:69:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e0  */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(com.google.android.gms.internal.ads.uh r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.F(com.google.android.gms.internal.ads.uh, boolean):void");
    }

    public final void G(uh uhVar, jy1 jy1Var, uh uhVar2, jy1 jy1Var2, long j, boolean z3) {
        if (!o(uhVar, jy1Var)) {
            fc fcVar = jy1Var.b() ? fc.f11093d : this.F.f10884o;
            in0 in0Var = this.f14424n;
            if (in0Var.A1().equals(fcVar)) {
                return;
            }
            this.f14419h.d(16);
            in0Var.a(fcVar);
            K(this.F.f10884o, fcVar.f11094a, false, false);
            return;
        }
        Object obj = jy1Var.f12875a;
        tg tgVar = this.f14422l;
        int i4 = uhVar.o(obj, tgVar).f16811c;
        fh fhVar = this.f14421k;
        uhVar.b(i4, fhVar, 0L);
        a2 a2Var = fhVar.f11170h;
        String str = bq0.f9768a;
        qs1 qs1Var = this.f14415c0;
        qs1Var.getClass();
        a2Var.getClass();
        long jS = bq0.s(-9223372036854775807L);
        qs1Var.f15430c = jS;
        qs1Var.f15433f = jS;
        qs1Var.g = jS;
        qs1Var.c();
        if (j != -9223372036854775807L) {
            qs1Var.f15431d = n(uhVar, obj, j);
            qs1Var.c();
            return;
        }
        if (!Objects.equals(!uhVar2.g() ? uhVar2.b(uhVar2.o(jy1Var2.f12875a, tgVar).f16811c, fhVar, 0L).f11164a : null, fhVar.f11164a) || z3) {
            qs1Var.f15431d = -9223372036854775807L;
            qs1Var.c();
        }
    }

    public final long H(tt1 tt1Var) {
        if (tt1Var == null) {
            return 0L;
        }
        long jMax = tt1Var.f16961p;
        if (tt1Var.f16952e) {
            for (int i4 = 0; i4 < 2; i4++) {
                lu1[] lu1VarArr = this.f14410a;
                if (lu1VarArr[i4].m(tt1Var) != null) {
                    pr1 pr1VarM = lu1VarArr[i4].m(tt1Var);
                    Objects.requireNonNull(pr1VarM);
                    long j = pr1VarM.f15092m;
                    if (j == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j, jMax);
                }
            }
        }
        return jMax;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.iy1, com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public final void I() {
        boolean z3;
        vt1 vt1Var = this.f14428r;
        vt1Var.z();
        tt1 tt1Var = vt1Var.f17714l;
        if (tt1Var != null) {
            ?? r12 = tt1Var.f16948a;
            if ((!tt1Var.f16951d || tt1Var.f16952e) && !r12.G1()) {
                uh uhVar = this.F.f10872a;
                if (tt1Var.f16952e) {
                    r12.C1();
                }
                if (this.f14418f.A1()) {
                    if (!tt1Var.f16951d) {
                        long j = tt1Var.g.f17336b;
                        tt1Var.f16951d = true;
                        r12.k(this, j);
                        return;
                    }
                    qt1 qt1Var = new qt1();
                    qt1Var.f15443a = this.S - tt1Var.f16961p;
                    float f10 = this.f14424n.A1().f11094a;
                    mq0.m(f10 > 0.0f || f10 == -3.4028235E38f);
                    qt1Var.f15444b = f10;
                    long j8 = this.L;
                    if (j8 >= 0) {
                        z3 = true;
                    } else if (j8 == -9223372036854775807L) {
                        j8 = -9223372036854775807L;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mq0.m(z3);
                    qt1Var.f15445c = j8;
                    rt1 rt1Var = new rt1(qt1Var);
                    mq0.c0(tt1Var.f16958m == null);
                    r12.g(rt1Var);
                }
            }
        }
    }

    public final void J() {
        tt1 tt1Var = this.f14428r.f17711h;
        boolean z3 = false;
        if (tt1Var != null && tt1Var.g.g && this.I) {
            z3 = true;
        }
        this.J = z3;
    }

    public final void K(fc fcVar, float f10, boolean z3, boolean z10) {
        int i4;
        if (z3) {
            if (z10) {
                this.G.b(1);
            }
            eu1 eu1Var = this.F;
            this.F = new eu1(eu1Var.f10872a, eu1Var.f10873b, eu1Var.f10874c, eu1Var.f10875d, eu1Var.f10876e, eu1Var.f10877f, eu1Var.g, eu1Var.f10878h, eu1Var.f10879i, eu1Var.j, eu1Var.f10880k, eu1Var.f10881l, eu1Var.f10882m, eu1Var.f10883n, fcVar, eu1Var.f10885p, eu1Var.f10886q, eu1Var.f10887r, eu1Var.f10888s);
        }
        float f11 = fcVar.f11094a;
        tt1 tt1Var = this.f14428r.f17711h;
        while (true) {
            i4 = 0;
            if (tt1Var == null) {
                break;
            }
            d[] dVarArr = (d[]) tt1Var.f16960o.f11326c;
            int length = dVarArr.length;
            while (i4 < length) {
                d dVar = dVarArr[i4];
                i4++;
            }
            tt1Var = tt1Var.f16958m;
        }
        lu1[] lu1VarArr = this.f14410a;
        while (i4 < 2) {
            lu1 lu1Var = lu1VarArr[i4];
            ((pr1) lu1Var.f13637e).o(f10, f11);
            pr1 pr1Var = (pr1) lu1Var.f13638f;
            if (pr1Var != null) {
                pr1Var.o(f10, f11);
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.L():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.jz1, java.lang.Object] */
    public final void M() {
        tt1 tt1Var = this.f14428r.f17713k;
        boolean z3 = true;
        if (!this.M && (tt1Var == null || !tt1Var.f16948a.G1())) {
            z3 = false;
        }
        eu1 eu1Var = this.F;
        if (z3 != eu1Var.g) {
            this.F = eu1Var.f(z3);
        }
    }

    public final eu1 N(jy1 jy1Var, long j, long j8, long j9, boolean z3, int i4) {
        oz1 oz1Var;
        g gVar;
        List list;
        u51 u51VarF;
        oz1 oz1Var2;
        this.V = (!this.V && j == this.F.f10887r && jy1Var.equals(this.F.f10873b)) ? false : true;
        J();
        eu1 eu1Var = this.F;
        oz1 oz1Var3 = eu1Var.f10878h;
        g gVar2 = eu1Var.f10879i;
        List list2 = eu1Var.j;
        if (this.f14429s.f18031a) {
            vt1 vt1Var = this.f14428r;
            tt1 tt1Var = vt1Var.f17711h;
            oz1 oz1Var4 = tt1Var == null ? oz1.f14819d : tt1Var.f16959n;
            g gVar3 = tt1Var == null ? this.f14417e : tt1Var.f16960o;
            d[] dVarArr = (d[]) gVar3.f11326c;
            u41 u41Var = new u41(4);
            int length = dVarArr.length;
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                d dVar = dVarArr[i10];
                if (dVar != null) {
                    v8 v8Var = dVar.L1(0).f14050k;
                    if (v8Var == null) {
                        oz1Var2 = oz1Var4;
                        u41Var.a(new v8(new c8[0]));
                    } else {
                        oz1Var2 = oz1Var4;
                        u41Var.a(v8Var);
                        z10 = true;
                    }
                } else {
                    oz1Var2 = oz1Var4;
                }
                i10++;
                oz1Var4 = oz1Var2;
            }
            oz1 oz1Var5 = oz1Var4;
            if (z10) {
                u51VarF = u41Var.f();
            } else {
                v41 v41Var = x41.f18307b;
                u51VarF = u51.f17096e;
            }
            if (tt1Var != null) {
                ut1 ut1Var = tt1Var.g;
                if (ut1Var.f17337c != j8) {
                    tt1Var.g = ut1Var.b(j8);
                }
            }
            tt1 tt1Var2 = vt1Var.f17711h;
            if (tt1Var2 == vt1Var.f17712i && tt1Var2 != null) {
                g gVar4 = tt1Var2.f16960o;
                int i11 = 0;
                while (true) {
                    lu1[] lu1VarArr = this.f14410a;
                    if (i11 >= 2) {
                        break;
                    }
                    if (gVar4.b(i11)) {
                        if (((pr1) lu1VarArr[i11].f13637e).f15083b != 1) {
                            break;
                        }
                        ((ku1[]) gVar4.f11325b)[i11].getClass();
                    }
                    i11++;
                }
            }
            list = u51VarF;
            gVar = gVar3;
            oz1Var = oz1Var5;
        } else {
            if (!jy1Var.equals(eu1Var.f10873b)) {
                gVar2 = this.f14417e;
                oz1Var3 = oz1.f14819d;
                list2 = u51.f17096e;
            }
            oz1Var = oz1Var3;
            gVar = gVar2;
            list = list2;
        }
        if (z3) {
            x8 x8Var = this.G;
            if (!x8Var.f18319c || x8Var.f18320d == 5) {
                x8Var.f18317a = true;
                x8Var.f18319c = true;
                x8Var.f18320d = i4;
            } else {
                mq0.m(i4 == 5);
            }
        }
        eu1 eu1Var2 = this.F;
        return eu1Var2.b(jy1Var, j, j8, j9, R(eu1Var2.f10885p), oz1Var, gVar, list);
    }

    public final void O(boolean[] zArr, long j) {
        lu1[] lu1VarArr;
        long j8;
        tt1 tt1Var = this.f14428r.f17712i;
        g gVar = tt1Var.f16960o;
        int i4 = 0;
        while (true) {
            lu1VarArr = this.f14410a;
            if (i4 >= 2) {
                break;
            }
            if (!gVar.b(i4)) {
                lu1VarArr[i4].b();
            }
            i4++;
        }
        int i10 = 0;
        while (i10 < 2) {
            if (gVar.b(i10) && lu1VarArr[i10].m(tt1Var) == null) {
                j8 = j;
                P(tt1Var, i10, zArr[i10], j8);
            } else {
                j8 = j;
            }
            i10++;
            j = j8;
        }
    }

    public final void P(tt1 tt1Var, int i4, boolean z3, long j) {
        int iC;
        int i10;
        lu1 lu1Var = this.f14410a[i4];
        if (lu1Var.g()) {
            return;
        }
        boolean z10 = tt1Var == this.f14428r.f17711h;
        g gVar = tt1Var.f16960o;
        ku1 ku1Var = ((ku1[]) gVar.f11325b)[i4];
        d dVar = ((d[]) gVar.f11326c)[i4];
        boolean z11 = T() && this.F.f10876e == 3;
        boolean z12 = !z3 && z11;
        this.Q++;
        iz1 iz1Var = tt1Var.f16950c[i4];
        long j8 = tt1Var.f16961p;
        jy1 jy1Var = tt1Var.g.f17335a;
        if (dVar != null) {
            iC = dVar.c();
            i10 = 0;
        } else {
            iC = 0;
            i10 = 0;
        }
        mx1[] mx1VarArr = new mx1[iC];
        while (i10 < iC) {
            dVar.getClass();
            mx1VarArr[i10] = dVar.L1(i10);
            i10++;
        }
        int i11 = lu1Var.f13636d;
        in0 in0Var = this.f14424n;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            lu1Var.f13633a = true;
            pr1 pr1Var = (pr1) lu1Var.f13637e;
            mq0.c0(pr1Var.f15088h == 0);
            pr1Var.f15085d = ku1Var;
            pr1Var.f15096q = jy1Var;
            pr1Var.f15088h = 1;
            pr1Var.z(z12, z10);
            pr1Var.v(mx1VarArr, iz1Var, j, j8, jy1Var);
            pr1Var.u(j, z12, true);
            in0Var.c(pr1Var);
        } else {
            lu1Var.f13634b = true;
            pr1 pr1Var2 = (pr1) lu1Var.f13638f;
            pr1Var2.getClass();
            mq0.c0(pr1Var2.f15088h == 0);
            pr1Var2.f15085d = ku1Var;
            pr1Var2.f15096q = jy1Var;
            pr1Var2.f15088h = 1;
            pr1Var2.z(z12, z10);
            pr1Var2.v(mx1VarArr, iz1Var, j, j8, jy1Var);
            pr1Var2.u(j, z12, true);
            in0Var.c(pr1Var2);
        }
        jt1 jt1Var = new jt1(this);
        pr1 pr1VarM = lu1Var.m(tt1Var);
        pr1VarM.getClass();
        pr1VarM.b(11, jt1Var);
        if (z11 && z10) {
            lu1Var.D();
        }
    }

    public final void Q(boolean z3) {
        tt1 tt1Var = this.f14428r.f17713k;
        jy1 jy1Var = tt1Var == null ? this.F.f10873b : tt1Var.g.f17335a;
        boolean zEquals = this.F.f10880k.equals(jy1Var);
        if (!zEquals) {
            this.F = this.F.g(jy1Var);
        }
        eu1 eu1Var = this.F;
        eu1Var.f10885p = tt1Var == null ? eu1Var.f10887r : tt1Var.d();
        eu1 eu1Var2 = this.F;
        eu1Var2.f10886q = R(eu1Var2.f10885p);
        if ((!zEquals || z3) && tt1Var != null && tt1Var.f16952e) {
            S(tt1Var.g.f17335a, tt1Var.f16959n, tt1Var.f16960o);
        }
    }

    public final long R(long j) {
        tt1 tt1Var = this.f14428r.f17713k;
        if (tt1Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.S - tt1Var.f16961p));
    }

    public final void S(jy1 jy1Var, oz1 oz1Var, g gVar) {
        tt1 tt1Var = this.f14428r.f17713k;
        tt1Var.getClass();
        long jR = R(tt1Var.d());
        long j = o(this.F.f10872a, tt1Var.g.f17335a) ? this.f14415c0.f15434h : -9223372036854775807L;
        uh uhVar = this.F.f10872a;
        float f10 = this.f14424n.A1().f11094a;
        boolean z3 = this.F.f10881l;
        this.f14418f.g(new ot1(this.f14431u, uhVar, jy1Var, jR, f10, this.K, j), (d[]) gVar.f11326c);
    }

    public final boolean T() {
        eu1 eu1Var = this.F;
        return eu1Var.f10881l && eu1Var.f10883n == 0;
    }

    public final void U(int i4) {
        lu1 lu1Var = this.f14410a[i4];
        try {
            tt1 tt1Var = this.f14428r.f17711h;
            if (tt1Var == null) {
                throw null;
            }
            pr1 pr1VarM = lu1Var.m(tt1Var);
            pr1VarM.getClass();
            iz1 iz1Var = pr1VarM.f15089i;
            iz1Var.getClass();
            iz1Var.zzc();
        } catch (IOException | RuntimeException e2) {
            int i10 = ((pr1) lu1Var.f13637e).f15083b;
            throw e2;
        }
    }

    public final boolean V() {
        if (!this.f14434x) {
            return false;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.f14410a[i4].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r0
    public final void a(long j, long j8, mx1 mx1Var, MediaFormat mediaFormat) {
        if (this.C) {
            Handler handler = this.f14419h.f14385a;
            io0 io0VarG = no0.g();
            io0VarG.f12403a = handler.obtainMessage(37);
            io0VarG.a();
        }
    }

    public final void b(IOException iOException, int i4) {
        us1 us1Var = new us1(0, iOException, i4);
        tt1 tt1Var = this.f14428r.f17711h;
        if (tt1Var != null) {
            us1Var = us1Var.a(tt1Var.g.f17335a);
        }
        ls.H("ExoPlayerImplInternal", "Playback error", us1Var);
        u(false, false);
        this.F = this.F.e(us1Var);
    }

    public final void c(int i4) {
        eu1 eu1Var = this.F;
        if (eu1Var.f10876e != i4) {
            if (i4 != 2) {
                this.X = -9223372036854775807L;
            }
            this.F = eu1Var.d(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final /* bridge */ /* synthetic */ void d(jz1 jz1Var) {
        this.f14419h.b(9, (iy1) jz1Var).a();
    }

    @Override // com.google.android.gms.internal.ads.hy1
    public final void e(iy1 iy1Var) {
        this.f14419h.b(8, iy1Var).a();
    }

    public final void f() {
        x8 x8Var = this.G;
        eu1 eu1Var = this.F;
        boolean z3 = x8Var.f18317a | (((eu1) x8Var.f18321e) != eu1Var);
        x8Var.f18317a = z3;
        x8Var.f18321e = eu1Var;
        if (z3) {
            it1 it1Var = (it1) this.f14427q.f14280b;
            it1Var.f12457k.e(new uh0(18, it1Var, x8Var));
            this.G = new x8(this.F);
        }
    }

    public final void g(float f10) {
        this.f14413b0 = f10;
        float f11 = f10 * this.f14435y.g;
        for (int i4 = 0; i4 < 2; i4++) {
            lu1 lu1Var = this.f14410a[i4];
            pr1 pr1Var = (pr1) lu1Var.f13637e;
            if (pr1Var.f15083b == 1) {
                Float fValueOf = Float.valueOf(f11);
                pr1Var.b(2, fValueOf);
                pr1 pr1Var2 = (pr1) lu1Var.f13638f;
                if (pr1Var2 != null) {
                    pr1Var2.b(2, fValueOf);
                }
            }
        }
    }

    public final void h(int i4, int i10, int i11, boolean z3) {
        boolean z10;
        if (!z3) {
            z10 = false;
        } else if (i4 != -1) {
            z10 = true;
        } else {
            i4 = -1;
            z10 = false;
        }
        if (i4 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.B;
        if (i4 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z11 ? 4 : 0;
        }
        eu1 eu1Var = this.F;
        if (eu1Var.f10881l == z10 && eu1Var.f10883n == i10 && eu1Var.f10882m == i11) {
            return;
        }
        this.F = eu1Var.h(i11, i10, z10);
        y(false, false);
        vt1 vt1Var = this.f14428r;
        for (tt1 tt1Var = vt1Var.f17711h; tt1Var != null; tt1Var = tt1Var.f16958m) {
            for (d dVar : (d[]) tt1Var.f16960o.f11326c) {
            }
        }
        if (!T()) {
            k();
            l();
            this.F.getClass();
            vt1Var.n(this.S);
            return;
        }
        int i12 = this.F.f10876e;
        no0 no0Var = this.f14419h;
        if (i12 != 3) {
            if (i12 == 2) {
                no0Var.c(2);
                return;
            }
            return;
        }
        in0 in0Var = this.f14424n;
        in0Var.f12386b = true;
        pu1 pu1Var = (pu1) in0Var.f12387c;
        if (!pu1Var.f15113b) {
            pu1Var.f15115d = SystemClock.elapsedRealtime();
            pu1Var.f15113b = true;
        }
        j();
        no0Var.c(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0657 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TRY_LEAVE, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0799 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, LOOP:18: B:378:0x0797->B:379:0x0799, LOOP_END, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08d2 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, LOOP:8: B:454:0x08d0->B:455:0x08d2, LOOP_END, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08e0 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08f0 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a88 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0aac A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ac8 A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0b4b A[Catch: IOException -> 0x0028, x91 -> 0x002b, ua -> 0x002e, qw1 -> 0x0031, RuntimeException -> 0x05f9, us1 -> 0x05fc, TryCatch #19 {us1 -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c80  */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v101, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean z3) {
        jy1 jy1Var = this.f14428r.f17711h.g.f17335a;
        long jR = r(jy1Var, this.F.f10887r, true, false);
        if (jR != this.F.f10887r) {
            eu1 eu1Var = this.F;
            this.F = N(jy1Var, jR, eu1Var.f10874c, eu1Var.f10875d, z3, 5);
        }
    }

    public final void j() {
        tt1 tt1Var = this.f14428r.f17711h;
        if (tt1Var == null) {
            return;
        }
        g gVar = tt1Var.f16960o;
        for (int i4 = 0; i4 < 2; i4++) {
            if (gVar.b(i4)) {
                this.f14410a[i4].D();
            }
        }
    }

    public final void k() {
        in0 in0Var = this.f14424n;
        in0Var.f12386b = false;
        pu1 pu1Var = (pu1) in0Var.f12387c;
        if (pu1Var.f15113b) {
            pu1Var.b(pu1Var.e());
            pu1Var.f15113b = false;
        }
        for (int i4 = 0; i4 < 2; i4++) {
            lu1 lu1Var = this.f14410a[i4];
            pr1 pr1Var = (pr1) lu1Var.f13637e;
            if (lu1.l(pr1Var)) {
                lu1.n(pr1Var);
            }
            pr1 pr1Var2 = (pr1) lu1Var.f13638f;
            if (pr1Var2 != null && pr1Var2.f15088h != 0) {
                lu1.n(pr1Var2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.l():void");
    }

    public final void m(int i4, boolean z3) {
        boolean[] zArr = this.f14414c;
        if (zArr[i4] != z3) {
            zArr[i4] = z3;
            this.f14433w.e(new b4.a(this, i4, z3));
        }
    }

    public final long n(uh uhVar, Object obj, long j) {
        int i4 = uhVar.o(obj, this.f14422l).f16811c;
        fh fhVar = this.f14421k;
        uhVar.b(i4, fhVar, 0L);
        if (fhVar.f11167d == -9223372036854775807L || !fhVar.b() || !fhVar.g) {
            return -9223372036854775807L;
        }
        long j8 = fhVar.f11168e;
        String str = bq0.f9768a;
        return bq0.s((j8 == -9223372036854775807L ? System.currentTimeMillis() : j8 + SystemClock.elapsedRealtime()) - fhVar.f11167d) - j;
    }

    public final boolean o(uh uhVar, jy1 jy1Var) {
        if (jy1Var.b() || uhVar.g()) {
            return false;
        }
        int i4 = uhVar.o(jy1Var.f12875a, this.f14422l).f16811c;
        fh fhVar = this.f14421k;
        uhVar.b(i4, fhVar, 0L);
        return fhVar.b() && fhVar.g && fhVar.f11167d != -9223372036854775807L;
    }

    public final void p(long j) {
        boolean z3 = this.B;
        long j8 = f14409d0;
        if (z3) {
            this.A.getClass();
            jMin = this.F.f10876e != 3 ? j8 : 1000L;
            for (int i4 = 0; i4 < 2; i4++) {
                lu1 lu1Var = this.f14410a[i4];
                long j9 = this.S;
                long j10 = this.T;
                pr1 pr1Var = (pr1) lu1Var.f13637e;
                long jT = lu1.l(pr1Var) ? ((ix1) pr1Var).T(j9, j10) : Long.MAX_VALUE;
                pr1 pr1Var2 = (pr1) lu1Var.f13638f;
                if (pr1Var2 != null && pr1Var2.f15088h != 0) {
                    jT = Math.min(jT, ((ix1) pr1Var2).T(j9, j10));
                }
                jMin = Math.min(jMin, bq0.r(jT));
            }
            if (this.F.i()) {
                tt1 tt1Var = this.f14428r.f17711h;
                if ((tt1Var != null ? tt1Var.f16958m : null) != null) {
                    if (this.S + (bq0.s(jMin) * this.F.f10884o.f11094a) >= r0.a()) {
                        jMin = Math.min(jMin, j8);
                    }
                }
            }
        } else if (this.F.f10876e != 3 || T()) {
            jMin = j8;
        }
        this.f14419h.f14385a.sendEmptyMessageAtTime(2, jMin + j);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    public final void q(mt1 mt1Var) throws Throwable {
        long jLongValue;
        long j;
        jy1 jy1VarE;
        boolean z3;
        int i4;
        long j8;
        boolean z10;
        long j9;
        long j10;
        eu1 eu1Var;
        jy1 jy1Var;
        uh uhVar;
        long j11;
        long j12;
        boolean z11;
        long j13;
        long jC;
        eu1 eu1Var2;
        int i10;
        if (this.C) {
            if (this.D != null) {
                this.E++;
                this.G.b(1);
            }
            this.D = mt1Var;
            return;
        }
        this.G.b(1);
        uh uhVar2 = this.F.f10872a;
        int i11 = this.N;
        boolean z12 = this.O;
        fh fhVar = this.f14421k;
        tg tgVar = this.f14422l;
        Pair pairZ = z(uhVar2, mt1Var, i11, z12, fhVar, tgVar);
        long jMax = -9223372036854775807L;
        if (pairZ == null) {
            Pair pairW = w(this.F.f10872a);
            jy1 jy1Var2 = (jy1) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z3 = !this.F.f10872a.g();
            jy1VarE = jy1Var2;
            j = -9223372036854775807L;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j14 = mt1Var.f14016c;
            if (j14 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = -9223372036854775807L;
                jMax = jLongValue;
            }
            jy1VarE = this.f14428r.E(this.F.f10872a, obj);
            if (jy1VarE.b()) {
                this.F.f10872a.o(jy1VarE.f12875a, tgVar);
                a aVarA = tgVar.f16814f.a(-1);
                int i12 = 0;
                while (true) {
                    int[] iArr = aVarA.f9151d;
                    if (i12 >= iArr.length || (i4 = iArr[i12]) == 0 || i4 == 1) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 == -1) {
                    tgVar.f16814f.getClass();
                }
                tgVar.f16814f.a(-1).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j14 != -9223372036854775807L) {
                z3 = false;
            }
            z3 = true;
        }
        try {
            if (this.F.f10872a.g()) {
                this.R = mt1Var;
            } else {
                if (pairZ != null) {
                    if (jy1VarE.equals(this.F.f10873b)) {
                        tt1 tt1Var = this.f14428r.f17711h;
                        if (tt1Var == null || !tt1Var.f16952e || jLongValue == 0) {
                            jC = jLongValue;
                        } else {
                            ?? r42 = tt1Var.f16948a;
                            long j15 = fhVar.j;
                            if (this.B && j15 != j) {
                                this.A.getClass();
                            }
                            jC = r42.c(jLongValue, this.f14436z);
                        }
                        long j16 = jC;
                        if (bq0.r(jC) == bq0.r(this.F.f10887r) && ((i10 = (eu1Var2 = this.F).f10876e) == 2 || i10 == 3)) {
                            jLongValue = eu1Var2.f10887r;
                        } else {
                            j10 = j16;
                        }
                    } else {
                        j10 = jLongValue;
                    }
                    if (this.B) {
                        lu1[] lu1VarArr = this.f14410a;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 2) {
                                break;
                            }
                            lu1 lu1Var = lu1VarArr[i13];
                            if (lu1Var.g() && ((pr1) lu1Var.f13637e).f15083b == 2) {
                                this.C = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    boolean z13 = this.F.f10876e == 4;
                    vt1 vt1Var = this.f14428r;
                    long jR = r(jy1VarE, j10, vt1Var.f17711h != vt1Var.f17712i, z13);
                    boolean z14 = z3 | (jLongValue != jR);
                    try {
                        eu1Var = this.F;
                        jy1Var = jy1VarE;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        uhVar = eu1Var.f10872a;
                        j11 = jMax;
                    } catch (Throwable th3) {
                        th = th3;
                        jy1VarE = jy1Var;
                        j8 = jMax;
                        z10 = z14;
                        j9 = jR;
                        this.F = N(jy1VarE, j9, j8, j9, z10, 2);
                        throw th;
                    }
                    try {
                        G(uhVar, jy1Var, uhVar, eu1Var.f10873b, j11, true);
                        jy1VarE = jy1Var;
                        j12 = j11;
                        z11 = z14;
                        j13 = jR;
                        this.F = N(jy1VarE, j13, j12, j13, z11, 2);
                    } catch (Throwable th4) {
                        th = th4;
                        jy1VarE = jy1Var;
                        j8 = j11;
                        z10 = z14;
                        j9 = jR;
                        this.F = N(jy1VarE, j9, j8, j9, z10, 2);
                        throw th;
                    }
                }
                if (this.F.f10876e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            }
            j12 = jMax;
            j13 = jLongValue;
            z11 = z3;
            this.F = N(jy1VarE, j13, j12, j13, z11, 2);
        } catch (Throwable th5) {
            th = th5;
            j8 = jMax;
            z10 = z3;
            j9 = jLongValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.ads.iy1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r(com.google.android.gms.internal.ads.jy1 r10, long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.r(com.google.android.gms.internal.ads.jy1, long, boolean, boolean):long");
    }

    public final void s(long j, boolean z3) {
        tt1 tt1Var = this.f14428r.f17711h;
        long j8 = j + (tt1Var == null ? 1000000000000L : tt1Var.f16961p);
        this.S = j8;
        ((pu1) this.f14424n.f12387c).b(j8);
        for (int i4 = 0; i4 < 2; i4++) {
            lu1 lu1Var = this.f14410a[i4];
            long j9 = this.S;
            pr1 pr1VarM = lu1Var.m(tt1Var);
            if (pr1VarM != null) {
                pr1VarM.u(j9, false, z3);
            }
        }
        for (tt1 tt1Var2 = r0.f17711h; tt1Var2 != null; tt1Var2 = tt1Var2.f16958m) {
            for (d dVar : (d[]) tt1Var2.f16960o.f11326c) {
            }
        }
    }

    public final void t() {
        for (int i4 = 0; i4 < 2; i4++) {
            lu1 lu1Var = this.f14410a[i4];
            mu1 mu1Var = this.B ? this.A : null;
            ((pr1) lu1Var.f13637e).b(18, mu1Var);
            pr1 pr1Var = (pr1) lu1Var.f13638f;
            if (pr1Var != null) {
                pr1Var.b(18, mu1Var);
            }
        }
    }

    public final void u(boolean z3, boolean z10) {
        v(z3 || !this.P, false, true, false);
        this.G.b(z10 ? 1 : 0);
        this.f14418f.e(this.f14431u);
        this.f14435y.b(1, this.F.f10881l);
        c(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[PHI: r2 r7 r9
  0x00bb: PHI (r2v2 com.google.android.gms.internal.ads.jy1) = (r2v1 com.google.android.gms.internal.ads.jy1), (r2v8 com.google.android.gms.internal.ads.jy1) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r7v4 long) = (r7v3 long), (r7v18 long) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt1.v(boolean, boolean, boolean, boolean):void");
    }

    public final Pair w(uh uhVar) {
        int i4;
        long j = 0;
        if (uhVar.g()) {
            return Pair.create(eu1.f10871t, 0L);
        }
        int iK = uhVar.k(this.O);
        fh fhVar = this.f14421k;
        tg tgVar = this.f14422l;
        Pair pairM = uhVar.m(fhVar, tgVar, iK, -9223372036854775807L);
        jy1 jy1VarE = this.f14428r.E(uhVar, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (jy1VarE.b()) {
            uhVar.o(jy1VarE.f12875a, tgVar);
            a aVarA = tgVar.f16814f.a(-1);
            int i10 = 0;
            while (true) {
                int[] iArr = aVarA.f9151d;
                if (i10 >= iArr.length || (i4 = iArr[i10]) == 0 || i4 == 1) {
                    break;
                }
                i10++;
            }
            if (-1 == i10) {
                tgVar.f16814f.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(jy1VarE, Long.valueOf(j));
    }

    public final void x(uh uhVar, uh uhVar2) {
        if (uhVar.g() && uhVar2.g()) {
            return;
        }
        ArrayList arrayList = this.f14425o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z3, boolean z10) {
        this.K = z3;
        long jElapsedRealtime = -9223372036854775807L;
        if (z3 && !z10) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.L = jElapsedRealtime;
    }
}
