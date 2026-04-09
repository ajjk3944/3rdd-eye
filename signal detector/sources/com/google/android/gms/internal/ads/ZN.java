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

/* loaded from: classes.dex */
public final class ZN implements Handler.Callback, InterfaceC1641oQ, InterfaceC1800rO, Q {

    /* renamed from: r0, reason: collision with root package name */
    public static final long f12829r0 = Vt.r(10000);

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f12830C;

    /* renamed from: D, reason: collision with root package name */
    public final C1994v2 f12831D;

    /* renamed from: E, reason: collision with root package name */
    public final Wu f12832E;

    /* renamed from: F, reason: collision with root package name */
    public final C1263hO f12833F;

    /* renamed from: G, reason: collision with root package name */
    public final G3.q f12834G;

    /* renamed from: H, reason: collision with root package name */
    public final long f12835H;

    /* renamed from: I, reason: collision with root package name */
    public final MO f12836I;

    /* renamed from: J, reason: collision with root package name */
    public final GO f12837J;

    /* renamed from: K, reason: collision with root package name */
    public final C1231gt f12838K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f12839L;
    public final C1916tf M;

    /* renamed from: N, reason: collision with root package name */
    public C2178yO f12840N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12842P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f12843Q;

    /* renamed from: R, reason: collision with root package name */
    public YN f12844R;

    /* renamed from: S, reason: collision with root package name */
    public int f12845S;

    /* renamed from: T, reason: collision with root package name */
    public C1747qO f12846T;

    /* renamed from: U, reason: collision with root package name */
    public W3 f12847U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f12848V;

    /* renamed from: X, reason: collision with root package name */
    public boolean f12850X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f12851Y;

    /* renamed from: a, reason: collision with root package name */
    public final L0.E[] f12853a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f12854a0;

    /* renamed from: b, reason: collision with root package name */
    public final PP[] f12855b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f12856c;

    /* renamed from: d, reason: collision with root package name */
    public final C0911b f12858d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f12859d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1184g f12860e;

    /* renamed from: e0, reason: collision with root package name */
    public int f12861e0;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0936bO f12862f;

    /* renamed from: f0, reason: collision with root package name */
    public YN f12863f0;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1452l f12864g;

    /* renamed from: g0, reason: collision with root package name */
    public long f12865g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1231gt f12866h;

    /* renamed from: h0, reason: collision with root package name */
    public long f12867h0;
    public final C1728q5 i;

    /* renamed from: i0, reason: collision with root package name */
    public int f12868i0;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f12869j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f12870j0;

    /* renamed from: k, reason: collision with root package name */
    public final U7 f12871k;

    /* renamed from: k0, reason: collision with root package name */
    public HN f12872k0;

    /* renamed from: l, reason: collision with root package name */
    public final I7 f12873l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12875m;

    /* renamed from: m0, reason: collision with root package name */
    public KN f12876m0;

    /* renamed from: n, reason: collision with root package name */
    public final Es f12877n;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f12879o0;

    /* renamed from: q0, reason: collision with root package name */
    public final DN f12881q0;

    /* renamed from: n0, reason: collision with root package name */
    public long f12878n0 = -9223372036854775807L;
    public int b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f12857c0 = false;

    /* renamed from: W, reason: collision with root package name */
    public boolean f12849W = false;

    /* renamed from: p0, reason: collision with root package name */
    public float f12880p0 = 1.0f;

    /* renamed from: O, reason: collision with root package name */
    public C2124xO f12841O = C2124xO.f17587b;

    /* renamed from: l0, reason: collision with root package name */
    public long f12874l0 = -9223372036854775807L;

    /* renamed from: Z, reason: collision with root package name */
    public long f12852Z = -9223372036854775807L;

    public ZN(Context context, PP[] ppArr, PP[] ppArr2, C0911b c0911b, C1184g c1184g, InterfaceC0936bO interfaceC0936bO, InterfaceC1452l interfaceC1452l, GO go, C2178yO c2178yO, DN dn, long j6, Looper looper, C1994v2 c1994v2, Wu wu, MO mo, KN kn) {
        this.f12832E = wu;
        this.f12858d = c0911b;
        this.f12860e = c1184g;
        this.f12862f = interfaceC0936bO;
        this.f12864g = interfaceC1452l;
        this.f12840N = c2178yO;
        this.f12881q0 = dn;
        this.f12835H = j6;
        this.f12831D = c1994v2;
        this.f12836I = mo;
        this.f12876m0 = kn;
        this.f12837J = go;
        this.f12875m = interfaceC0936bO.d();
        C1730q7 c1730q7 = AbstractC1353j8.f14909a;
        C1747qO c1747qOA = C1747qO.a(c1184g);
        this.f12846T = c1747qOA;
        this.f12847U = new W3(c1747qOA);
        int length = ppArr.length;
        this.f12855b = new PP[2];
        this.f12856c = new boolean[2];
        c0911b.getClass();
        this.f12853a = new L0.E[2];
        boolean z6 = false;
        for (int i = 0; i < 2; i++) {
            PP pp = ppArr[i];
            pp.f10403e = i;
            pp.f10405f = mo;
            pp.f10407g = c1994v2;
            PP[] ppArr3 = this.f12855b;
            pp.getClass();
            ppArr3[i] = pp;
            PP pp2 = this.f12855b[i];
            synchronized (pp2.f10396a) {
                pp2.f10367F = c0911b;
            }
            PP pp3 = ppArr2[i];
            if (pp3 != null) {
                pp3.f10403e = i;
                pp3.f10405f = mo;
                pp3.f10407g = c1994v2;
                z6 = true;
            }
            L0.E[] eArr = this.f12853a;
            PP pp4 = ppArr[i];
            L0.E e6 = new L0.E();
            e6.f2416e = pp4;
            e6.f2412a = i;
            e6.f2417f = pp3;
            e6.f2413b = 0;
            e6.f2414c = false;
            e6.f2415d = false;
            eArr[i] = e6;
        }
        this.f12839L = z6;
        this.f12877n = new Es(this);
        this.f12830C = new ArrayList();
        this.f12871k = new U7();
        this.f12873l = new I7();
        AbstractC0582Jp.h0(c0911b.f13270a == null);
        c0911b.f13270a = this;
        c0911b.f13271b = interfaceC1452l;
        this.f12870j0 = true;
        C1231gt c1231gtB = c1994v2.B(looper, null);
        this.f12838K = c1231gtB;
        this.f12833F = new C1263hO(go, c1231gtB, new C1448kw(7, this), kn);
        this.f12834G = new G3.q(this, go, c1231gtB, mo);
        C1728q5 c1728q5 = new C1728q5();
        c1728q5.f16318b = new Object();
        c1728q5.f16319c = null;
        c1728q5.f16320d = null;
        c1728q5.f16317a = 0;
        this.i = c1728q5;
        Looper looperA = c1728q5.a();
        this.f12869j = looperA;
        C1231gt c1231gtB2 = c1994v2.B(looperA, this);
        this.f12866h = c1231gtB2;
        this.M = new C1916tf(context, looperA, this);
        c1231gtB2.b(35, new Q() { // from class: com.google.android.gms.internal.ads.WN
            @Override // com.google.android.gms.internal.ads.Q
            public final /* synthetic */ void a(long j7, long j8, TP tp, MediaFormat mediaFormat) {
                this.f12220a.a(j7, j8, tp, mediaFormat);
            }
        }).a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.NQ, com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public static final boolean A(C1154fO c1154fO) {
        if (c1154fO != null) {
            try {
                ?? r12 = c1154fO.f14065a;
                if (c1154fO.f14069e) {
                    MQ[] mqArr = c1154fO.f14067c;
                    for (int i = 0; i < 2; i++) {
                        MQ mq = mqArr[i];
                        if (mq != null) {
                            mq.f();
                        }
                    }
                } else {
                    r12.s();
                }
                if ((!c1154fO.f14069e ? 0L : r12.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(U7 u7, I7 i7, int i, boolean z6, Object obj, AbstractC1353j8 abstractC1353j8, AbstractC1353j8 abstractC1353j82) {
        U7 u72 = u7;
        AbstractC1353j8 abstractC1353j83 = abstractC1353j8;
        Object obj2 = abstractC1353j83.b(abstractC1353j83.o(obj, i7).f9072c, u7, 0L).f11603a;
        for (int i3 = 0; i3 < abstractC1353j82.a(); i3++) {
            if (abstractC1353j82.b(i3, u7, 0L).f11603a.equals(obj2)) {
                return i3;
            }
        }
        int iE = abstractC1353j83.e(obj);
        int iC = abstractC1353j83.c();
        int iE2 = -1;
        int i6 = 0;
        while (true) {
            if (i6 >= iC || iE2 != -1) {
                break;
            }
            AbstractC1353j8 abstractC1353j84 = abstractC1353j83;
            int iL = abstractC1353j84.l(iE, i7, u72, i, z6);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = abstractC1353j82.e(abstractC1353j84.f(iL));
            i6++;
            abstractC1353j83 = abstractC1353j84;
            iE = iL;
            u72 = u7;
        }
        if (iE2 == -1) {
            return -1;
        }
        return abstractC1353j82.d(iE2, i7, false).f9072c;
    }

    public static Pair z(AbstractC1353j8 abstractC1353j8, YN yn, int i, boolean z6, U7 u7, I7 i7) {
        AbstractC1353j8 abstractC1353j82 = yn.f12635a;
        if (abstractC1353j8.g()) {
            return null;
        }
        AbstractC1353j8 abstractC1353j83 = true == abstractC1353j82.g() ? abstractC1353j8 : abstractC1353j82;
        try {
            Pair pairM = abstractC1353j83.m(u7, i7, yn.f12636b, yn.f12637c);
            if (!abstractC1353j8.equals(abstractC1353j83)) {
                if (abstractC1353j8.e(pairM.first) == -1) {
                    int iW = W(u7, i7, i, z6, pairM.first, abstractC1353j83, abstractC1353j8);
                    if (iW != -1) {
                        return abstractC1353j8.m(u7, i7, iW, -9223372036854775807L);
                    }
                    return null;
                }
                if (abstractC1353j83.o(pairM.first, i7).f9074e && abstractC1353j83.b(i7.f9072c, u7, 0L).f11612k == abstractC1353j83.e(pairM.first)) {
                    return abstractC1353j8.m(u7, i7, abstractC1353j8.o(pairM.first, i7).f9072c, yn.f12637c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i = 0; i < 2; i++) {
            L0.E[] eArr = this.f12853a;
            int iR = eArr[i].r();
            L0.E e6 = eArr[i];
            PP pp = (PP) e6.f2416e;
            PP pp2 = (PP) e6.f2417f;
            Es es = this.f12877n;
            e6.i(pp, es);
            if (pp2 != null) {
                boolean z6 = (pp2.f10409h == 0 || e6.f2413b == 3) ? false : true;
                e6.i(pp2, es);
                e6.j(false);
                if (z6) {
                    PP pp3 = (PP) e6.f2416e;
                    pp2.getClass();
                    pp2.c(17, pp3);
                }
            }
            e6.f2413b = 0;
            m(i, false);
            this.f12861e0 -= iR;
        }
        this.f12878n0 = -9223372036854775807L;
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
            boolean r0 = r10.f12839L
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
            L0.E[] r3 = r10.f12853a
            r3 = r3[r1]
            int r4 = r3.r()
            boolean r5 = r3.q()
            if (r5 != 0) goto L1f
            goto L4a
        L1f:
            int r5 = r3.f2413b
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
            java.lang.Object r8 = r3.f2416e
            com.google.android.gms.internal.ads.PP r8 = (com.google.android.gms.internal.ads.PP) r8
            goto L3c
        L35:
            java.lang.Object r8 = r3.f2417f
            com.google.android.gms.internal.ads.PP r8 = (com.google.android.gms.internal.ads.PP) r8
            r8.getClass()
        L3c:
            com.google.android.gms.internal.ads.Es r9 = r10.f12877n
            r3.i(r8, r9)
            r3.j(r5)
            if (r2 != r7) goto L47
            goto L48
        L47:
            r6 = r0
        L48:
            r3.f2413b = r6
        L4a:
            int r2 = r10.f12861e0
            int r3 = r3.r()
            int r4 = r4 - r3
            int r2 = r2 - r4
            r10.f12861e0 = r2
            int r1 = r1 + 1
            goto Ld
        L57:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.f12878n0 = r0
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.C():void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.D():void");
    }

    public final boolean E() {
        C1154fO c1154fO = this.f12833F.f14484h;
        long j6 = c1154fO.f14071g.f14265e;
        if (c1154fO.f14069e) {
            return j6 == -9223372036854775807L || this.f12846T.f16368r < j6 || !T();
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
    public final void F(com.google.android.gms.internal.ads.AbstractC1353j8 r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.F(com.google.android.gms.internal.ads.j8, boolean):void");
    }

    public final void G(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ, AbstractC1353j8 abstractC1353j82, C1749qQ c1749qQ2, long j6, boolean z6) {
        if (!o(abstractC1353j8, c1749qQ)) {
            C2159y5 c2159y5 = c1749qQ.b() ? C2159y5.f17678d : this.f12846T.f16365o;
            Es es = this.f12877n;
            if (es.h().equals(c2159y5)) {
                return;
            }
            this.f12866h.d(16);
            es.b(c2159y5);
            K(this.f12846T.f16365o, c2159y5.f17679a, false, false);
            return;
        }
        Object obj = c1749qQ.f16374a;
        I7 i7 = this.f12873l;
        int i = abstractC1353j8.o(obj, i7).f9072c;
        U7 u7 = this.f12871k;
        abstractC1353j8.b(i, u7, 0L);
        C2154y0 c2154y0 = u7.f11610h;
        String str = Vt.f12096a;
        DN dn = this.f12881q0;
        dn.getClass();
        c2154y0.getClass();
        long jS = Vt.s(-9223372036854775807L);
        dn.f7757c = jS;
        dn.f7760f = jS;
        dn.f7761g = jS;
        dn.c();
        if (j6 != -9223372036854775807L) {
            dn.f7758d = n(abstractC1353j8, obj, j6);
            dn.c();
            return;
        }
        if (!Objects.equals(!abstractC1353j82.g() ? abstractC1353j82.b(abstractC1353j82.o(c1749qQ2.f16374a, i7).f9072c, u7, 0L).f11603a : null, u7.f11603a) || z6) {
            dn.f7758d = -9223372036854775807L;
            dn.c();
        }
    }

    public final long H(C1154fO c1154fO) {
        if (c1154fO == null) {
            return 0L;
        }
        long jMax = c1154fO.f14079p;
        if (c1154fO.f14069e) {
            for (int i = 0; i < 2; i++) {
                L0.E[] eArr = this.f12853a;
                if (eArr[i].m(c1154fO) != null) {
                    PP ppM = eArr[i].m(c1154fO);
                    Objects.requireNonNull(ppM);
                    long j6 = ppM.f10418m;
                    if (j6 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j6, jMax);
                }
            }
        }
        return jMax;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.NQ, com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void I() {
        boolean z6;
        C1263hO c1263hO = this.f12833F;
        c1263hO.z();
        C1154fO c1154fO = c1263hO.f14487l;
        if (c1154fO != null) {
            ?? r12 = c1154fO.f14065a;
            if ((!c1154fO.f14068d || c1154fO.f14069e) && !r12.o()) {
                AbstractC1353j8 abstractC1353j8 = this.f12846T.f16352a;
                if (c1154fO.f14069e) {
                    r12.j();
                }
                if (this.f12862f.h()) {
                    if (!c1154fO.f14068d) {
                        long j6 = c1154fO.f14071g.f14262b;
                        c1154fO.f14068d = true;
                        r12.k(this, j6);
                        return;
                    }
                    C0990cO c0990cO = new C0990cO();
                    c0990cO.f13552a = this.f12865g0 - c1154fO.f14079p;
                    float f2 = this.f12877n.h().f17679a;
                    AbstractC0582Jp.m(f2 > 0.0f || f2 == -3.4028235E38f);
                    c0990cO.f13553b = f2;
                    long j7 = this.f12852Z;
                    if (j7 >= 0) {
                        z6 = true;
                    } else if (j7 == -9223372036854775807L) {
                        j7 = -9223372036854775807L;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC0582Jp.m(z6);
                    c0990cO.f13554c = j7;
                    C1045dO c1045dO = new C1045dO(c0990cO);
                    AbstractC0582Jp.h0(c1154fO.f14076m == null);
                    r12.f(c1045dO);
                }
            }
        }
    }

    public final void J() {
        C1154fO c1154fO = this.f12833F.f14484h;
        boolean z6 = false;
        if (c1154fO != null && c1154fO.f14071g.f14267g && this.f12849W) {
            z6 = true;
        }
        this.f12850X = z6;
    }

    public final void K(C2159y5 c2159y5, float f2, boolean z6, boolean z7) {
        int i;
        if (z6) {
            if (z7) {
                this.f12847U.b(1);
            }
            C1747qO c1747qO = this.f12846T;
            this.f12846T = new C1747qO(c1747qO.f16352a, c1747qO.f16353b, c1747qO.f16354c, c1747qO.f16355d, c1747qO.f16356e, c1747qO.f16357f, c1747qO.f16358g, c1747qO.f16359h, c1747qO.i, c1747qO.f16360j, c1747qO.f16361k, c1747qO.f16362l, c1747qO.f16363m, c1747qO.f16364n, c2159y5, c1747qO.f16366p, c1747qO.f16367q, c1747qO.f16368r, c1747qO.f16369s);
        }
        float f5 = c2159y5.f17679a;
        C1154fO c1154fO = this.f12833F.f14484h;
        while (true) {
            i = 0;
            if (c1154fO == null) {
                break;
            }
            InterfaceC1020d[] interfaceC1020dArr = (InterfaceC1020d[]) c1154fO.f14078o.f14181c;
            int length = interfaceC1020dArr.length;
            while (i < length) {
                InterfaceC1020d interfaceC1020d = interfaceC1020dArr[i];
                i++;
            }
            c1154fO = c1154fO.f14076m;
        }
        L0.E[] eArr = this.f12853a;
        while (i < 2) {
            L0.E e6 = eArr[i];
            ((PP) e6.f2416e).q(f2, f5);
            PP pp = (PP) e6.f2417f;
            if (pp != null) {
                pp.q(f2, f5);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.L():void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.NQ, java.lang.Object] */
    public final void M() {
        C1154fO c1154fO = this.f12833F.f14486k;
        boolean z6 = true;
        if (!this.f12854a0 && (c1154fO == null || !c1154fO.f14065a.o())) {
            z6 = false;
        }
        C1747qO c1747qO = this.f12846T;
        if (z6 != c1747qO.f16358g) {
            this.f12846T = c1747qO.f(z6);
        }
    }

    public final C1747qO N(C1749qQ c1749qQ, long j6, long j7, long j8, boolean z6, int i) {
        SQ sq;
        C1184g c1184g;
        List list;
        C1197gC c1197gCF;
        SQ sq2;
        this.f12870j0 = (!this.f12870j0 && j6 == this.f12846T.f16368r && c1749qQ.equals(this.f12846T.f16353b)) ? false : true;
        J();
        C1747qO c1747qO = this.f12846T;
        SQ sq3 = c1747qO.f16359h;
        C1184g c1184g2 = c1747qO.i;
        List list2 = c1747qO.f16360j;
        if (this.f12834G.f1636a) {
            C1263hO c1263hO = this.f12833F;
            C1154fO c1154fO = c1263hO.f14484h;
            SQ sq4 = c1154fO == null ? SQ.f11183d : c1154fO.f14077n;
            C1184g c1184g3 = c1154fO == null ? this.f12860e : c1154fO.f14078o;
            InterfaceC1020d[] interfaceC1020dArr = (InterfaceC1020d[]) c1184g3.f14181c;
            IB ib = new IB(4);
            int length = interfaceC1020dArr.length;
            int i3 = 0;
            boolean z7 = false;
            while (i3 < length) {
                InterfaceC1020d interfaceC1020d = interfaceC1020dArr[i3];
                if (interfaceC1020d != null) {
                    U3 u32 = interfaceC1020d.h(0).f11395k;
                    if (u32 == null) {
                        sq2 = sq4;
                        ib.a(new U3(new B3[0]));
                    } else {
                        sq2 = sq4;
                        ib.a(u32);
                        z7 = true;
                    }
                } else {
                    sq2 = sq4;
                }
                i3++;
                sq4 = sq2;
            }
            SQ sq5 = sq4;
            if (z7) {
                c1197gCF = ib.f();
            } else {
                JB jb = LB.f9635b;
                c1197gCF = C1197gC.f14227e;
            }
            if (c1154fO != null) {
                C1209gO c1209gO = c1154fO.f14071g;
                if (c1209gO.f14263c != j7) {
                    c1154fO.f14071g = c1209gO.b(j7);
                }
            }
            C1154fO c1154fO2 = c1263hO.f14484h;
            if (c1154fO2 == c1263hO.i && c1154fO2 != null) {
                C1184g c1184g4 = c1154fO2.f14078o;
                int i6 = 0;
                while (true) {
                    L0.E[] eArr = this.f12853a;
                    if (i6 >= 2) {
                        break;
                    }
                    if (c1184g4.c(i6)) {
                        if (((PP) eArr[i6].f2416e).f10398b != 1) {
                            break;
                        }
                        ((C2070wO[]) c1184g4.f14180b)[i6].getClass();
                    }
                    i6++;
                }
            }
            list = c1197gCF;
            c1184g = c1184g3;
            sq = sq5;
        } else {
            if (!c1749qQ.equals(c1747qO.f16353b)) {
                c1184g2 = this.f12860e;
                sq3 = SQ.f11183d;
                list2 = C1197gC.f14227e;
            }
            sq = sq3;
            c1184g = c1184g2;
            list = list2;
        }
        if (z6) {
            W3 w32 = this.f12847U;
            if (!w32.f12152c || w32.f12153d == 5) {
                w32.f12150a = true;
                w32.f12152c = true;
                w32.f12153d = i;
            } else {
                AbstractC0582Jp.m(i == 5);
            }
        }
        C1747qO c1747qO2 = this.f12846T;
        return c1747qO2.b(c1749qQ, j6, j7, j8, R(c1747qO2.f16366p), sq, c1184g, list);
    }

    public final void O(boolean[] zArr, long j6) {
        L0.E[] eArr;
        long j7;
        C1154fO c1154fO = this.f12833F.i;
        C1184g c1184g = c1154fO.f14078o;
        int i = 0;
        while (true) {
            eArr = this.f12853a;
            if (i >= 2) {
                break;
            }
            if (!c1184g.c(i)) {
                eArr[i].b();
            }
            i++;
        }
        int i3 = 0;
        while (i3 < 2) {
            if (c1184g.c(i3) && eArr[i3].m(c1154fO) == null) {
                j7 = j6;
                P(c1154fO, i3, zArr[i3], j7);
            } else {
                j7 = j6;
            }
            i3++;
            j6 = j7;
        }
    }

    public final void P(C1154fO c1154fO, int i, boolean z6, long j6) {
        int iB;
        int i3;
        L0.E e6 = this.f12853a[i];
        if (e6.g()) {
            return;
        }
        boolean z7 = c1154fO == this.f12833F.f14484h;
        C1184g c1184g = c1154fO.f14078o;
        C2070wO c2070wO = ((C2070wO[]) c1184g.f14180b)[i];
        InterfaceC1020d interfaceC1020d = ((InterfaceC1020d[]) c1184g.f14181c)[i];
        boolean z8 = T() && this.f12846T.f16356e == 3;
        boolean z9 = !z6 && z8;
        this.f12861e0++;
        MQ mq = c1154fO.f14067c[i];
        long j7 = c1154fO.f14079p;
        C1749qQ c1749qQ = c1154fO.f14071g.f14261a;
        if (interfaceC1020d != null) {
            iB = interfaceC1020d.b();
            i3 = 0;
        } else {
            iB = 0;
            i3 = 0;
        }
        TP[] tpArr = new TP[iB];
        while (i3 < iB) {
            interfaceC1020d.getClass();
            tpArr[i3] = interfaceC1020d.h(i3);
            i3++;
        }
        int i6 = e6.f2413b;
        Es es = this.f12877n;
        if (i6 == 0 || i6 == 2 || i6 == 4) {
            e6.f2414c = true;
            PP pp = (PP) e6.f2416e;
            AbstractC0582Jp.h0(pp.f10409h == 0);
            pp.f10401d = c2070wO;
            pp.f10365E = c1749qQ;
            pp.f10409h = 1;
            pp.o0(z9, z7);
            pp.k0(tpArr, mq, j6, j7, c1749qQ);
            pp.K(j6, z9, true);
            es.c(pp);
        } else {
            e6.f2415d = true;
            PP pp2 = (PP) e6.f2417f;
            pp2.getClass();
            AbstractC0582Jp.h0(pp2.f10409h == 0);
            pp2.f10401d = c2070wO;
            pp2.f10365E = c1749qQ;
            pp2.f10409h = 1;
            pp2.o0(z9, z7);
            pp2.k0(tpArr, mq, j6, j7, c1749qQ);
            pp2.K(j6, z9, true);
            es.c(pp2);
        }
        VN vn = new VN(this);
        PP ppM = e6.m(c1154fO);
        ppM.getClass();
        ppM.c(11, vn);
        if (z8 && z7) {
            e6.D();
        }
    }

    public final void Q(boolean z6) {
        C1154fO c1154fO = this.f12833F.f14486k;
        C1749qQ c1749qQ = c1154fO == null ? this.f12846T.f16353b : c1154fO.f14071g.f14261a;
        boolean zEquals = this.f12846T.f16361k.equals(c1749qQ);
        if (!zEquals) {
            this.f12846T = this.f12846T.g(c1749qQ);
        }
        C1747qO c1747qO = this.f12846T;
        c1747qO.f16366p = c1154fO == null ? c1747qO.f16368r : c1154fO.d();
        C1747qO c1747qO2 = this.f12846T;
        c1747qO2.f16367q = R(c1747qO2.f16366p);
        if ((!zEquals || z6) && c1154fO != null && c1154fO.f14069e) {
            S(c1154fO.f14071g.f14261a, c1154fO.f14077n, c1154fO.f14078o);
        }
    }

    public final long R(long j6) {
        C1154fO c1154fO = this.f12833F.f14486k;
        if (c1154fO == null) {
            return 0L;
        }
        return Math.max(0L, j6 - (this.f12865g0 - c1154fO.f14079p));
    }

    public final void S(C1749qQ c1749qQ, SQ sq, C1184g c1184g) {
        C1154fO c1154fO = this.f12833F.f14486k;
        c1154fO.getClass();
        long jR = R(c1154fO.d());
        long j6 = o(this.f12846T.f16352a, c1154fO.f14071g.f14261a) ? this.f12881q0.f7762h : -9223372036854775807L;
        AbstractC1353j8 abstractC1353j8 = this.f12846T.f16352a;
        float f2 = this.f12877n.h().f17679a;
        boolean z6 = this.f12846T.f16362l;
        this.f12862f.g(new C0881aO(this.f12836I, abstractC1353j8, c1749qQ, jR, f2, this.f12851Y, j6), (InterfaceC1020d[]) c1184g.f14181c);
    }

    public final boolean T() {
        C1747qO c1747qO = this.f12846T;
        return c1747qO.f16362l && c1747qO.f16364n == 0;
    }

    public final void U(int i) {
        L0.E e6 = this.f12853a[i];
        try {
            C1154fO c1154fO = this.f12833F.f14484h;
            if (c1154fO == null) {
                throw null;
            }
            PP ppM = e6.m(c1154fO);
            ppM.getClass();
            MQ mq = ppM.i;
            mq.getClass();
            mq.f();
        } catch (IOException | RuntimeException e7) {
            int i3 = ((PP) e6.f2416e).f10398b;
            throw e7;
        }
    }

    public final boolean V() {
        if (!this.f12839L) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (this.f12853a[i].q()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Q
    public final void a(long j6, long j7, TP tp, MediaFormat mediaFormat) {
        if (this.f12843Q) {
            Handler handler = this.f12866h.f14397a;
            C0959bt c0959btG = C1231gt.g();
            c0959btG.f13478a = handler.obtainMessage(37);
            c0959btG.a();
        }
    }

    public final void b(IOException iOException, int i) {
        HN hn = new HN(0, iOException, i);
        C1154fO c1154fO = this.f12833F.f14484h;
        if (c1154fO != null) {
            hn = hn.a(c1154fO.f14071g.f14261a);
        }
        AbstractC2022vd.K("ExoPlayerImplInternal", "Playback error", hn);
        u(false, false);
        this.f12846T = this.f12846T.e(hn);
    }

    public final void c(int i) {
        C1747qO c1747qO = this.f12846T;
        if (c1747qO.f16356e != i) {
            if (i != 2) {
                this.f12874l0 = -9223372036854775807L;
            }
            this.f12846T = c1747qO.d(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final /* bridge */ /* synthetic */ void d(NQ nq) {
        this.f12866h.b(9, (InterfaceC1695pQ) nq).a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final void e(InterfaceC1695pQ interfaceC1695pQ) {
        this.f12866h.b(8, interfaceC1695pQ).a();
    }

    public final void f() {
        W3 w32 = this.f12847U;
        C1747qO c1747qO = this.f12846T;
        boolean z6 = w32.f12150a | (((C1747qO) w32.f12154e) != c1747qO);
        w32.f12150a = z6;
        w32.f12154e = c1747qO;
        if (z6) {
            UN un = (UN) this.f12832E.f12337b;
            un.f11684k.e(new RunnableC0786Vp(un, 19, w32));
            this.f12847U = new W3(this.f12846T);
        }
    }

    public final void g(float f2) {
        this.f12880p0 = f2;
        float f5 = f2 * this.M.f16957g;
        for (int i = 0; i < 2; i++) {
            L0.E e6 = this.f12853a[i];
            PP pp = (PP) e6.f2416e;
            if (pp.f10398b == 1) {
                Float fValueOf = Float.valueOf(f5);
                pp.c(2, fValueOf);
                PP pp2 = (PP) e6.f2417f;
                if (pp2 != null) {
                    pp2.c(2, fValueOf);
                }
            }
        }
    }

    public final void h(int i, int i3, int i6, boolean z6) {
        boolean z7;
        if (!z6) {
            z7 = false;
        } else if (i != -1) {
            z7 = true;
        } else {
            i = -1;
            z7 = false;
        }
        if (i == -1) {
            i6 = 2;
        } else if (i6 == 2) {
            i6 = 1;
        }
        boolean z8 = this.f12842P;
        if (i == 0) {
            i3 = 1;
        } else if (i3 == 1) {
            i3 = z8 ? 4 : 0;
        }
        C1747qO c1747qO = this.f12846T;
        if (c1747qO.f16362l == z7 && c1747qO.f16364n == i3 && c1747qO.f16363m == i6) {
            return;
        }
        this.f12846T = c1747qO.h(i6, i3, z7);
        y(false, false);
        C1263hO c1263hO = this.f12833F;
        for (C1154fO c1154fO = c1263hO.f14484h; c1154fO != null; c1154fO = c1154fO.f14076m) {
            for (InterfaceC1020d interfaceC1020d : (InterfaceC1020d[]) c1154fO.f14078o.f14181c) {
            }
        }
        if (!T()) {
            k();
            l();
            this.f12846T.getClass();
            c1263hO.n(this.f12865g0);
            return;
        }
        int i7 = this.f12846T.f16356e;
        C1231gt c1231gt = this.f12866h;
        if (i7 != 3) {
            if (i7 == 2) {
                c1231gt.c(2);
                return;
            }
            return;
        }
        Es es = this.f12877n;
        es.f8016b = true;
        AO ao = (AO) es.f8017c;
        if (!ao.f6984a) {
            ao.f6986c = SystemClock.elapsedRealtime();
            ao.f6984a = true;
        }
        j();
        c1231gt.c(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0657 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TRY_LEAVE, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0799 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, LOOP:18: B:378:0x0797->B:379:0x0799, LOOP_END, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08d2 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, LOOP:8: B:454:0x08d0->B:455:0x08d2, LOOP_END, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08e0 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08f0 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a88 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0aac A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ac8 A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0b4b A[Catch: IOException -> 0x0028, jE -> 0x002b, P4 -> 0x002e, xP -> 0x0031, RuntimeException -> 0x05f9, HN -> 0x05fc, TryCatch #20 {HN -> 0x05fc, RuntimeException -> 0x05f9, blocks: (B:285:0x05f5, B:293:0x0610, B:294:0x0618, B:296:0x0625, B:298:0x0633, B:303:0x064b, B:396:0x07ce, B:398:0x07d4, B:400:0x07da, B:403:0x07df, B:404:0x07ea, B:406:0x07ee, B:410:0x0813, B:412:0x0819, B:417:0x0827, B:418:0x082f, B:419:0x0832, B:421:0x083b, B:469:0x0909, B:470:0x090e, B:475:0x091b, B:477:0x0923, B:478:0x0929, B:480:0x0937, B:481:0x0950, B:483:0x0954, B:485:0x095c, B:499:0x0986, B:486:0x0961, B:488:0x096a, B:492:0x0973, B:498:0x0983, B:501:0x0990, B:503:0x0996, B:507:0x09a3, B:516:0x09df, B:518:0x09e5, B:520:0x09e9, B:547:0x0a7c, B:549:0x0a88, B:551:0x0a99, B:552:0x0aa2, B:571:0x0aec, B:574:0x0af3, B:576:0x0af7, B:581:0x0b04, B:582:0x0b07, B:583:0x0b0a, B:585:0x0b10, B:587:0x0b19, B:589:0x0b21, B:591:0x0b27, B:593:0x0b2d, B:600:0x0b4f, B:602:0x0b55, B:606:0x0b5e, B:615:0x0b78, B:612:0x0b71, B:614:0x0b75, B:594:0x0b34, B:597:0x0b42, B:598:0x0b4a, B:599:0x0b4b, B:553:0x0aa6, B:555:0x0aac, B:557:0x0ab0, B:561:0x0ab9, B:563:0x0ac8, B:565:0x0ace, B:567:0x0ada, B:568:0x0adf, B:569:0x0ae4, B:570:0x0ae9, B:523:0x09f7, B:525:0x09fb, B:527:0x0a0d, B:529:0x0a18, B:531:0x0a20, B:535:0x0a29, B:537:0x0a33, B:543:0x0a3e, B:509:0x09ab, B:511:0x09af, B:512:0x09c9, B:514:0x09cf, B:500:0x0989, B:424:0x0844, B:426:0x0848, B:428:0x084e, B:430:0x0854, B:432:0x085e, B:435:0x0864, B:436:0x0867, B:438:0x0870, B:440:0x0882, B:442:0x088b, B:444:0x0893, B:449:0x089f, B:451:0x08c7, B:453:0x08cd, B:455:0x08d2, B:456:0x08da, B:458:0x08e0, B:459:0x08e3, B:460:0x08ec, B:462:0x08f0, B:464:0x08f6, B:465:0x08fb, B:468:0x0908, B:306:0x0657, B:316:0x0674, B:321:0x0685, B:325:0x0697, B:332:0x06bc, B:349:0x06f3, B:351:0x0726, B:353:0x072a, B:357:0x073a, B:359:0x073e, B:363:0x0745, B:365:0x074b, B:367:0x076a, B:370:0x0773, B:372:0x0778, B:374:0x077e, B:375:0x0786, B:377:0x078c, B:355:0x0730, B:379:0x0799, B:380:0x07a4, B:382:0x07aa, B:384:0x07ae, B:386:0x07b3, B:395:0x07cb, B:392:0x07c2, B:394:0x07c8, B:616:0x0b7d, B:620:0x0b87), top: B:699:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c80  */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v101, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v66, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean z6) {
        C1749qQ c1749qQ = this.f12833F.f14484h.f14071g.f14261a;
        long jR = r(c1749qQ, this.f12846T.f16368r, true, false);
        if (jR != this.f12846T.f16368r) {
            C1747qO c1747qO = this.f12846T;
            this.f12846T = N(c1749qQ, jR, c1747qO.f16354c, c1747qO.f16355d, z6, 5);
        }
    }

    public final void j() {
        C1154fO c1154fO = this.f12833F.f14484h;
        if (c1154fO == null) {
            return;
        }
        C1184g c1184g = c1154fO.f14078o;
        for (int i = 0; i < 2; i++) {
            if (c1184g.c(i)) {
                this.f12853a[i].D();
            }
        }
    }

    public final void k() {
        Es es = this.f12877n;
        es.f8016b = false;
        AO ao = (AO) es.f8017c;
        if (ao.f6984a) {
            ao.a(ao.e());
            ao.f6984a = false;
        }
        for (int i = 0; i < 2; i++) {
            L0.E e6 = this.f12853a[i];
            PP pp = (PP) e6.f2416e;
            if (L0.E.l(pp)) {
                L0.E.n(pp);
            }
            PP pp2 = (PP) e6.f2417f;
            if (pp2 != null && pp2.f10409h != 0) {
                L0.E.n(pp2);
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
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.l():void");
    }

    public final void m(int i, boolean z6) {
        boolean[] zArr = this.f12856c;
        if (zArr[i] != z6) {
            zArr[i] = z6;
            this.f12838K.e(new A3.h(this, i, z6));
        }
    }

    public final long n(AbstractC1353j8 abstractC1353j8, Object obj, long j6) {
        int i = abstractC1353j8.o(obj, this.f12873l).f9072c;
        U7 u7 = this.f12871k;
        abstractC1353j8.b(i, u7, 0L);
        if (u7.f11606d == -9223372036854775807L || !u7.b() || !u7.f11609g) {
            return -9223372036854775807L;
        }
        long j7 = u7.f11607e;
        String str = Vt.f12096a;
        return Vt.s((j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime()) - u7.f11606d) - j6;
    }

    public final boolean o(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ) {
        if (c1749qQ.b() || abstractC1353j8.g()) {
            return false;
        }
        int i = abstractC1353j8.o(c1749qQ.f16374a, this.f12873l).f9072c;
        U7 u7 = this.f12871k;
        abstractC1353j8.b(i, u7, 0L);
        return u7.b() && u7.f11609g && u7.f11606d != -9223372036854775807L;
    }

    public final void p(long j6) {
        boolean z6 = this.f12842P;
        long j7 = f12829r0;
        if (z6) {
            this.f12841O.getClass();
            jMin = this.f12846T.f16356e != 3 ? j7 : 1000L;
            for (int i = 0; i < 2; i++) {
                L0.E e6 = this.f12853a[i];
                long j8 = this.f12865g0;
                long j9 = this.f12867h0;
                PP pp = (PP) e6.f2416e;
                long jP = L0.E.l(pp) ? pp.P(j8, j9) : Long.MAX_VALUE;
                PP pp2 = (PP) e6.f2417f;
                if (pp2 != null && pp2.f10409h != 0) {
                    jP = Math.min(jP, pp2.P(j8, j9));
                }
                jMin = Math.min(jMin, Vt.r(jP));
            }
            if (this.f12846T.i()) {
                C1154fO c1154fO = this.f12833F.f14484h;
                if ((c1154fO != null ? c1154fO.f14076m : null) != null) {
                    if (this.f12865g0 + (Vt.s(jMin) * this.f12846T.f16365o.f17679a) >= r0.a()) {
                        jMin = Math.min(jMin, j7);
                    }
                }
            }
        } else if (this.f12846T.f16356e != 3 || T()) {
            jMin = j7;
        }
        this.f12866h.f14397a.sendEmptyMessageAtTime(2, jMin + j6);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    public final void q(YN yn) throws Throwable {
        long jLongValue;
        long j6;
        C1749qQ c1749qQE;
        boolean z6;
        int i;
        long j7;
        boolean z7;
        long j8;
        long j9;
        C1747qO c1747qO;
        C1749qQ c1749qQ;
        AbstractC1353j8 abstractC1353j8;
        long j10;
        long j11;
        boolean z8;
        long j12;
        long jC;
        C1747qO c1747qO2;
        int i3;
        if (this.f12843Q) {
            if (this.f12844R != null) {
                this.f12845S++;
                this.f12847U.b(1);
            }
            this.f12844R = yn;
            return;
        }
        this.f12847U.b(1);
        AbstractC1353j8 abstractC1353j82 = this.f12846T.f16352a;
        int i6 = this.b0;
        boolean z9 = this.f12857c0;
        U7 u7 = this.f12871k;
        I7 i7 = this.f12873l;
        Pair pairZ = z(abstractC1353j82, yn, i6, z9, u7, i7);
        long jMax = -9223372036854775807L;
        if (pairZ == null) {
            Pair pairW = w(this.f12846T.f16352a);
            C1749qQ c1749qQ2 = (C1749qQ) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z6 = !this.f12846T.f16352a.g();
            c1749qQE = c1749qQ2;
            j6 = -9223372036854775807L;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j13 = yn.f12637c;
            if (j13 == -9223372036854775807L) {
                j6 = -9223372036854775807L;
            } else {
                j6 = -9223372036854775807L;
                jMax = jLongValue;
            }
            c1749qQE = this.f12833F.E(this.f12846T.f16352a, obj);
            if (c1749qQE.b()) {
                this.f12846T.f16352a.o(c1749qQE.f16374a, i7);
                C0856a c0856aA = i7.f9075f.a(-1);
                int i8 = 0;
                while (true) {
                    int[] iArr = c0856aA.f13009d;
                    if (i8 >= iArr.length || (i = iArr[i8]) == 0 || i == 1) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 == -1) {
                    i7.f9075f.getClass();
                }
                i7.f9075f.a(-1).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j13 != -9223372036854775807L) {
                z6 = false;
            }
            z6 = true;
        }
        try {
            if (this.f12846T.f16352a.g()) {
                this.f12863f0 = yn;
            } else {
                if (pairZ != null) {
                    if (c1749qQE.equals(this.f12846T.f16353b)) {
                        C1154fO c1154fO = this.f12833F.f14484h;
                        if (c1154fO == null || !c1154fO.f14069e || jLongValue == 0) {
                            jC = jLongValue;
                        } else {
                            ?? r42 = c1154fO.f14065a;
                            long j14 = u7.f11611j;
                            if (this.f12842P && j14 != j6) {
                                this.f12841O.getClass();
                            }
                            jC = r42.c(jLongValue, this.f12840N);
                        }
                        long j15 = jC;
                        if (Vt.r(jC) == Vt.r(this.f12846T.f16368r) && ((i3 = (c1747qO2 = this.f12846T).f16356e) == 2 || i3 == 3)) {
                            jLongValue = c1747qO2.f16368r;
                        } else {
                            j9 = j15;
                        }
                    } else {
                        j9 = jLongValue;
                    }
                    if (this.f12842P) {
                        L0.E[] eArr = this.f12853a;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 2) {
                                break;
                            }
                            L0.E e6 = eArr[i9];
                            if (e6.g() && ((PP) e6.f2416e).f10398b == 2) {
                                this.f12843Q = true;
                                break;
                            }
                            i9++;
                        }
                    }
                    boolean z10 = this.f12846T.f16356e == 4;
                    C1263hO c1263hO = this.f12833F;
                    long jR = r(c1749qQE, j9, c1263hO.f14484h != c1263hO.i, z10);
                    boolean z11 = z6 | (jLongValue != jR);
                    try {
                        c1747qO = this.f12846T;
                        c1749qQ = c1749qQE;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        abstractC1353j8 = c1747qO.f16352a;
                        j10 = jMax;
                    } catch (Throwable th2) {
                        th = th2;
                        c1749qQE = c1749qQ;
                        j7 = jMax;
                        z7 = z11;
                        j8 = jR;
                        this.f12846T = N(c1749qQE, j8, j7, j8, z7, 2);
                        throw th;
                    }
                    try {
                        G(abstractC1353j8, c1749qQ, abstractC1353j8, c1747qO.f16353b, j10, true);
                        c1749qQE = c1749qQ;
                        j11 = j10;
                        z8 = z11;
                        j12 = jR;
                        this.f12846T = N(c1749qQE, j12, j11, j12, z8, 2);
                    } catch (Throwable th3) {
                        th = th3;
                        c1749qQE = c1749qQ;
                        j7 = j10;
                        z7 = z11;
                        j8 = jR;
                        this.f12846T = N(c1749qQE, j8, j7, j8, z7, 2);
                        throw th;
                    }
                }
                if (this.f12846T.f16356e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            }
            j11 = jMax;
            j12 = jLongValue;
            z8 = z6;
            this.f12846T = N(c1749qQE, j12, j11, j12, z8, 2);
        } catch (Throwable th4) {
            th = th4;
            j7 = jMax;
            z7 = z6;
            j8 = jLongValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long r(com.google.android.gms.internal.ads.C1749qQ r10, long r11, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.r(com.google.android.gms.internal.ads.qQ, long, boolean, boolean):long");
    }

    public final void s(long j6, boolean z6) {
        C1154fO c1154fO = this.f12833F.f14484h;
        long j7 = j6 + (c1154fO == null ? 1000000000000L : c1154fO.f14079p);
        this.f12865g0 = j7;
        ((AO) this.f12877n.f8017c).a(j7);
        for (int i = 0; i < 2; i++) {
            L0.E e6 = this.f12853a[i];
            long j8 = this.f12865g0;
            PP ppM = e6.m(c1154fO);
            if (ppM != null) {
                ppM.K(j8, false, z6);
            }
        }
        for (C1154fO c1154fO2 = r0.f14484h; c1154fO2 != null; c1154fO2 = c1154fO2.f14076m) {
            for (InterfaceC1020d interfaceC1020d : (InterfaceC1020d[]) c1154fO2.f14078o.f14181c) {
            }
        }
    }

    public final void t() {
        for (int i = 0; i < 2; i++) {
            L0.E e6 = this.f12853a[i];
            C2124xO c2124xO = this.f12842P ? this.f12841O : null;
            ((PP) e6.f2416e).c(18, c2124xO);
            PP pp = (PP) e6.f2417f;
            if (pp != null) {
                pp.c(18, c2124xO);
            }
        }
    }

    public final void u(boolean z6, boolean z7) {
        v(z6 || !this.f12859d0, false, true, false);
        this.f12847U.b(z7 ? 1 : 0);
        this.f12862f.e(this.f12836I);
        this.M.b(1, this.f12846T.f16362l);
        c(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb A[PHI: r2 r7 r9
  0x00bb: PHI (r2v2 com.google.android.gms.internal.ads.qQ) = (r2v1 com.google.android.gms.internal.ads.qQ), (r2v8 com.google.android.gms.internal.ads.qQ) binds: [B:33:0x0091, B:35:0x00b6] A[DONT_GENERATE, DONT_INLINE]
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZN.v(boolean, boolean, boolean, boolean):void");
    }

    public final Pair w(AbstractC1353j8 abstractC1353j8) {
        int i;
        long j6 = 0;
        if (abstractC1353j8.g()) {
            return Pair.create(C1747qO.f16351t, 0L);
        }
        int iK = abstractC1353j8.k(this.f12857c0);
        U7 u7 = this.f12871k;
        I7 i7 = this.f12873l;
        Pair pairM = abstractC1353j8.m(u7, i7, iK, -9223372036854775807L);
        C1749qQ c1749qQE = this.f12833F.E(abstractC1353j8, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (c1749qQE.b()) {
            abstractC1353j8.o(c1749qQE.f16374a, i7);
            C0856a c0856aA = i7.f9075f.a(-1);
            int i3 = 0;
            while (true) {
                int[] iArr = c0856aA.f13009d;
                if (i3 >= iArr.length || (i = iArr[i3]) == 0 || i == 1) {
                    break;
                }
                i3++;
            }
            if (-1 == i3) {
                i7.f9075f.getClass();
            }
        } else {
            j6 = jLongValue;
        }
        return Pair.create(c1749qQE, Long.valueOf(j6));
    }

    public final void x(AbstractC1353j8 abstractC1353j8, AbstractC1353j8 abstractC1353j82) {
        if (abstractC1353j8.g() && abstractC1353j82.g()) {
            return;
        }
        ArrayList arrayList = this.f12830C;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z6, boolean z7) {
        this.f12851Y = z6;
        long jElapsedRealtime = -9223372036854775807L;
        if (z6 && !z7) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f12852Z = jElapsedRealtime;
    }
}
