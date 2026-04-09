package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class H extends PP {
    public static final int[] B1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: C1, reason: collision with root package name */
    public static boolean f8497C1;

    /* renamed from: D1, reason: collision with root package name */
    public static boolean f8498D1;

    /* renamed from: A1, reason: collision with root package name */
    public boolean f8499A1;

    /* renamed from: P0, reason: collision with root package name */
    public final Context f8500P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final boolean f8501Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C0697Ql f8502R0;

    /* renamed from: S0, reason: collision with root package name */
    public final boolean f8503S0;

    /* renamed from: T0, reason: collision with root package name */
    public final T f8504T0;

    /* renamed from: U0, reason: collision with root package name */
    public final S f8505U0;

    /* renamed from: V0, reason: collision with root package name */
    public final long f8506V0;

    /* renamed from: W0, reason: collision with root package name */
    public final PriorityQueue f8507W0;

    /* renamed from: X0, reason: collision with root package name */
    public T2.d f8508X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f8509Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f8510Z0;

    /* renamed from: a1, reason: collision with root package name */
    public InterfaceC1185g0 f8511a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f8512b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f8513c1;

    /* renamed from: d1, reason: collision with root package name */
    public List f8514d1;

    /* renamed from: e1, reason: collision with root package name */
    public Surface f8515e1;

    /* renamed from: f1, reason: collision with root package name */
    public J f8516f1;

    /* renamed from: g1, reason: collision with root package name */
    public Ar f8517g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f8518h1;
    public int i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f8519j1;

    /* renamed from: k1, reason: collision with root package name */
    public long f8520k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f8521l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f8522m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f8523n1;

    /* renamed from: o1, reason: collision with root package name */
    public C2124xO f8524o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f8525p1;

    /* renamed from: q1, reason: collision with root package name */
    public long f8526q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f8527r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f8528s1;

    /* renamed from: t1, reason: collision with root package name */
    public C1161fd f8529t1;

    /* renamed from: u1, reason: collision with root package name */
    public C1161fd f8530u1;
    public int v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f8531w1;
    public Q x1;

    /* renamed from: y1, reason: collision with root package name */
    public long f8532y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f8533z1;

    public H(L2.m mVar) {
        super(2, (C2181ya) mVar.f2539d, (EO) mVar.f2538c, 30.0f);
        Context applicationContext = ((Context) mVar.f2537b).getApplicationContext();
        this.f8500P0 = applicationContext;
        this.f8511a1 = null;
        this.f8502R0 = new C0697Ql((Handler) mVar.f2540e, (NN) mVar.f2541f);
        this.f8501Q0 = this.f8511a1 == null;
        this.f8504T0 = new T(applicationContext, this);
        this.f8505U0 = new S();
        this.f8503S0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f8517g1 = Ar.f7055c;
        this.i1 = 1;
        this.f8519j1 = 0;
        this.f8529t1 = C1161fd.f14102d;
        this.f8531w1 = 0;
        this.f8530u1 = null;
        this.v1 = -1000;
        this.f8532y1 = -9223372036854775807L;
        this.f8533z1 = -9223372036854775807L;
        this.f8507W0 = new PriorityQueue();
        this.f8506V0 = -9223372036854775807L;
        this.f8524o1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r0(com.google.android.gms.internal.ads.LP r11, com.google.android.gms.internal.ads.TP r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.r0(com.google.android.gms.internal.ads.LP, com.google.android.gms.internal.ads.TP):int");
    }

    public static int w0(LP lp, TP tp) {
        int i = tp.f11398n;
        if (i == -1) {
            return r0(lp, tp);
        }
        List list = tp.f11400p;
        int size = list.size();
        int length = 0;
        for (int i3 = 0; i3 < size; i3++) {
            length += ((byte[]) list.get(i3)).length;
        }
        return i + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean x0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.x0(java.lang.String):boolean");
    }

    public static List y0(Context context, EO eo, TP tp, boolean z6, boolean z7) {
        List listA;
        String str = tp.f11397m;
        if (str == null) {
            return C1197gC.f14227e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC1114el.i(context)) {
            String strD = WP.d(tp);
            if (strD == null) {
                listA = C1197gC.f14227e;
            } else {
                eo.getClass();
                listA = WP.a(strD, z6, z7);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return WP.b(eo, tp, z6, z7);
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void A() {
        super.A();
        this.f8507W0.clear();
        this.f8523n1 = 0;
        this.f8525p1 = false;
    }

    public final boolean A0(FM fm) {
        if (l0() || fm.n(536870912)) {
            return true;
        }
        long j6 = this.f8533z1;
        return j6 == -9223372036854775807L || j6 - (fm.f8095g - this.f10374I0.f10196c) <= 100000;
    }

    public final boolean B0(LP lp) {
        if (this.f8511a1 != null) {
            return true;
        }
        Surface surface = this.f8515e1;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && lp.f9697h) {
            return true;
        }
        if (x0(lp.f9690a)) {
            return false;
        }
        return !lp.f9695f || J.a(this.f8500P0);
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final KP C(IllegalStateException illegalStateException, LP lp) {
        Surface surface = this.f8515e1;
        E e6 = new E(illegalStateException, lp);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return e6;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface C0(com.google.android.gms.internal.ads.LP r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.g0 r0 = r6.f8511a1
            if (r0 == 0) goto L9
            android.view.Surface r7 = r0.k()
            return r7
        L9:
            android.view.Surface r0 = r6.f8515e1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r7.f9697h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r0 = r7.f9690a
            boolean r0 = x0(r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L30
            boolean r0 = r7.f9695f
            if (r0 == 0) goto L32
            android.content.Context r0 = r6.f8500P0
            boolean r0 = com.google.android.gms.internal.ads.J.a(r0)
            if (r0 != 0) goto L32
        L30:
            r0 = r1
            goto L33
        L32:
            r0 = r3
        L33:
            com.google.android.gms.internal.ads.AbstractC0582Jp.h0(r0)
            com.google.android.gms.internal.ads.J r0 = r6.f8516f1
            if (r0 == 0) goto L47
            boolean r4 = r7.f9695f
            boolean r5 = r0.f9205a
            if (r5 == r4) goto L47
            if (r0 == 0) goto L47
            r0.release()
            r6.f8516f1 = r2
        L47:
            com.google.android.gms.internal.ads.J r0 = r6.f8516f1
            if (r0 != 0) goto Lbf
            android.content.Context r0 = r6.f8500P0
            boolean r7 = r7.f9695f
            if (r7 == 0) goto L5b
            boolean r0 = com.google.android.gms.internal.ads.J.a(r0)
            if (r0 == 0) goto L59
        L57:
            r0 = r3
            goto L5e
        L59:
            r0 = r1
            goto L5e
        L5b:
            int r0 = com.google.android.gms.internal.ads.J.f9203d
            goto L57
        L5e:
            com.google.android.gms.internal.ads.AbstractC0582Jp.h0(r0)
            com.google.android.gms.internal.ads.I r0 = new com.google.android.gms.internal.ads.I
            java.lang.String r2 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r2)
            if (r7 == 0) goto L6d
            int r7 = com.google.android.gms.internal.ads.J.f9203d
            goto L6e
        L6d:
            r7 = r1
        L6e:
            r0.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r2.<init>(r4, r0)
            r0.f9049b = r2
            com.google.android.gms.internal.ads.in r4 = new com.google.android.gms.internal.ads.in
            r4.<init>(r2)
            r0.f9048a = r4
            monitor-enter(r0)
            android.os.Handler r2 = r0.f9049b     // Catch: java.lang.Throwable -> L9d
            android.os.Message r7 = r2.obtainMessage(r3, r7, r1)     // Catch: java.lang.Throwable -> L9d
            r7.sendToTarget()     // Catch: java.lang.Throwable -> L9d
        L8d:
            com.google.android.gms.internal.ads.J r7 = r0.f9052e     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.RuntimeException r7 = r0.f9051d     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.Error r7 = r0.f9050c     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            r0.wait()     // Catch: java.lang.Throwable -> L9d java.lang.InterruptedException -> L9f
            goto L8d
        L9d:
            r7 = move-exception
            goto Lbd
        L9f:
            r1 = r3
            goto L8d
        La1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto Lab
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        Lab:
            java.lang.RuntimeException r7 = r0.f9051d
            if (r7 != 0) goto Lbc
            java.lang.Error r7 = r0.f9050c
            if (r7 != 0) goto Lbb
            com.google.android.gms.internal.ads.J r7 = r0.f9052e
            r7.getClass()
            r6.f8516f1 = r7
            goto Lbf
        Lbb:
            throw r7
        Lbc:
            throw r7
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            throw r7
        Lbf:
            com.google.android.gms.internal.ads.J r7 = r6.f8516f1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.C0(com.google.android.gms.internal.ads.LP):android.view.Surface");
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void D(TP tp) throws HN {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 == null || interfaceC1185g0.b()) {
            return;
        }
        try {
            interfaceC1185g0.D0(tp);
        } catch (C1130f0 e6) {
            throw m(e6, tp, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void E(FM fm) {
        int iF = F(fm);
        if (Build.VERSION.SDK_INT < 34 || (iF & 32) == 0) {
            this.f8523n1++;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final int F(FM fm) {
        return (Build.VERSION.SDK_INT < 34 || this.f8524o1 == null || fm.f8095g >= this.f10416l || A0(fm)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean G(FM fm) {
        boolean z6 = false;
        if (!A0(fm)) {
            if (fm.f8095g < this.f10416l) {
                if (!fm.n(268435456)) {
                    if (fm.n(67108864)) {
                        fm.o();
                        z6 = true;
                    }
                    if (z6) {
                        this.f10372H0.f7335d++;
                    }
                }
            }
            return z6;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void H(long j6) {
        super.H(j6);
        this.f8523n1--;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final int J(EO eo, TP tp) {
        boolean z6;
        String str = tp.f11397m;
        if (!D4.b(str)) {
            return 128;
        }
        int i = 0;
        boolean z7 = tp.f11401q != null;
        Context context = this.f8500P0;
        List listY0 = y0(context, eo, tp, z7, false);
        if (z7 && listY0.isEmpty()) {
            listY0 = y0(context, eo, tp, false, false);
        }
        if (listY0.isEmpty()) {
            return 129;
        }
        if (tp.f11385L != 0) {
            return 130;
        }
        LP lp = (LP) listY0.get(0);
        boolean zB = lp.b(tp);
        if (zB) {
            z6 = true;
        } else {
            for (int i3 = 1; i3 < listY0.size(); i3++) {
                LP lp2 = (LP) listY0.get(i3);
                if (lp2.b(tp)) {
                    zB = true;
                    z6 = false;
                    lp = lp2;
                    break;
                }
            }
            z6 = true;
        }
        int i6 = true != zB ? 3 : 4;
        int i7 = true != lp.c(tp) ? 8 : 16;
        int i8 = true != lp.f9696g ? 0 : 64;
        int i9 = true != z6 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC1114el.i(context)) {
            i9 = 256;
        }
        if (zB) {
            List listY02 = y0(context, eo, tp, z7, true);
            if (!listY02.isEmpty()) {
                HashMap map = WP.f12225a;
                ArrayList arrayList = new ArrayList(listY02);
                Collections.sort(arrayList, new UP(new C1014cu(14, tp)));
                LP lp3 = (LP) arrayList.get(0);
                if (lp3.b(tp) && lp3.c(tp)) {
                    i = 32;
                }
            }
        }
        return i6 | i7 | i | i8 | i9;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final ArrayList L(EO eo, TP tp) {
        List listY0 = y0(this.f8500P0, eo, tp, false, false);
        HashMap map = WP.f12225a;
        ArrayList arrayList = new ArrayList(listY0);
        Collections.sort(arrayList, new UP(new C1014cu(14, tp)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r1 = null;
     */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1726q3 N(com.google.android.gms.internal.ads.LP r23, com.google.android.gms.internal.ads.TP r24, float r25) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.N(com.google.android.gms.internal.ads.LP, com.google.android.gms.internal.ads.TP, float):com.google.android.gms.internal.ads.q3");
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final CN O(LP lp, TP tp, TP tp2) {
        int i;
        int i3;
        CN cnD = lp.d(tp, tp2);
        int i6 = cnD.f7586e;
        T2.d dVar = this.f8508X0;
        dVar.getClass();
        if (tp2.f11404t > dVar.f3569a || tp2.f11405u > dVar.f3570b) {
            i6 |= 256;
        }
        if (w0(lp, tp2) > dVar.f3571c) {
            i6 |= 64;
        }
        String str = lp.f9690a;
        if (i6 != 0) {
            i3 = 0;
            i = i6;
        } else {
            i = 0;
            i3 = cnD.f7585d;
        }
        return new CN(str, tp, tp2, i3, i);
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final float Q(float f2, TP tp, TP[] tpArr) {
        LP lp;
        float fMax = -1.0f;
        for (TP tp2 : tpArr) {
            float f5 = tp2.f11408x;
            if (f5 != -1.0f) {
                fMax = Math.max(fMax, f5);
            }
        }
        float f6 = fMax == -1.0f ? -1.0f : fMax * f2;
        if (this.f8524o1 == null || (lp = this.f10408g0) == null) {
            return f6;
        }
        int i = tp.f11404t;
        int i3 = tp.f11405u;
        float f7 = -3.4028235E38f;
        if (lp.i) {
            float f8 = lp.f9700l;
            if (f8 != -3.4028235E38f && lp.f9698j == i && lp.f9699k == i3) {
                f7 = f8;
            } else {
                f7 = 1024.0f;
                if (!lp.e(i, i3, 1024.0d)) {
                    float f9 = 0.0f;
                    while (true) {
                        float f10 = f7 - f9;
                        if (Math.abs(f10) <= 5.0f) {
                            break;
                        }
                        float f11 = (f10 / 2.0f) + f9;
                        boolean zE = lp.e(i, i3, f11);
                        if (true == zE) {
                            f9 = f11;
                        }
                        if (true != zE) {
                            f7 = f11;
                        }
                    }
                    f7 = f9;
                }
                lp.f9700l = f7;
                lp.f9698j = i;
                lp.f9699k = i3;
            }
        }
        return f6 != -1.0f ? Math.max(f6, f7) : f7;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void R(long j6, long j7, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0697Ql c0697Ql = this.f8502R0;
        Handler handler = (Handler) c0697Ql.f10691b;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC0857a0(c0697Ql, str2, j6, j7));
        } else {
            str2 = str;
        }
        this.f8509Y0 = x0(str2);
        LP lp = this.f10408g0;
        lp.getClass();
        boolean z6 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(lp.f9691b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = lp.f9693d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z6 = true;
                    break;
                }
                i++;
            }
        }
        this.f8510Z0 = z6;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void S(String str) {
        C0697Ql c0697Ql = this.f8502R0;
        Handler handler = (Handler) c0697Ql.f10691b;
        if (handler != null) {
            handler.post(new RunnableC0857a0(c0697Ql, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void T(Exception exc) {
        AbstractC2022vd.K("MediaCodecVideoRenderer", "Video codec error", exc);
        C0697Ql c0697Ql = this.f8502R0;
        Handler handler = (Handler) c0697Ql.f10691b;
        if (handler != null) {
            handler.post(new RunnableC0857a0(c0697Ql, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final CN U(C1879sw c1879sw) {
        CN cnU = super.U(c1879sw);
        TP tp = (TP) c1879sw.f16824c;
        tp.getClass();
        C0697Ql c0697Ql = this.f8502R0;
        Handler handler = (Handler) c0697Ql.f10691b;
        if (handler != null) {
            handler.post(new RunnableC0912b0(c0697Ql, tp, cnU, 0));
        }
        return cnU;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void V(TP tp, MediaFormat mediaFormat) {
        JP jp = this.f10395Z;
        if (jp != null) {
            jp.m(this.i1);
        }
        mediaFormat.getClass();
        boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f2 = tp.f11410z;
        int i = tp.f11409y;
        if (i == 90 || i == 270) {
            f2 = 1.0f / f2;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.f8529t1 = new C1161fd(integer, integer2, f2);
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 == null || !this.f8499A1) {
            this.f8504T0.d(tp.f11408x);
        } else {
            C1855sP c1855sP = new C1855sP(tp);
            c1855sP.f16739s = integer;
            c1855sP.f16740t = integer2;
            c1855sP.f16745y = f2;
            TP tp2 = new TP(c1855sP);
            int i6 = this.f8513c1;
            List list = this.f8514d1;
            if (list == null) {
                list = C1197gC.f14227e;
            }
            interfaceC1185g0.C0(tp2, this.f10374I0.f10195b, i6, list);
            this.f8513c1 = 2;
        }
        this.f8499A1 = false;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void W() {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            interfaceC1185g0.j();
            long j6 = this.f8532y1;
            if (j6 == -9223372036854775807L) {
                j6 = this.f10374I0.f10195b;
                this.f8532y1 = j6;
            }
            this.f8511a1.B0(-j6);
        } else {
            this.f8504T0.a(2);
        }
        this.f8499A1 = true;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean X(long j6, long j7, JP jp, ByteBuffer byteBuffer, int i, int i3, int i6, long j8, boolean z6, boolean z7, TP tp) {
        int i7;
        jp.getClass();
        long j9 = j8 - this.f10374I0.f10196c;
        int i8 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f8507W0;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j8) {
                break;
            }
            priorityQueue.poll();
            i8++;
        }
        t0(i8, 0);
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            if (!z6 || z7) {
                return interfaceC1185g0.t0(j8, new F(this, jp, i, j9));
            }
            s0(jp, i);
            return true;
        }
        long j10 = this.f10374I0.f10195b;
        T t6 = this.f8504T0;
        S s5 = this.f8505U0;
        int iF = t6.f(j8, j6, j7, j10, z6, z7, s5);
        if (iF == 0) {
            this.f10407g.getClass();
            long jNanoTime = System.nanoTime();
            Q q3 = this.x1;
            if (q3 != null) {
                q3.a(j9, jNanoTime, tp, this.b0);
            }
            v0(jp, i, jNanoTime);
            u0(s5.f11099a);
            return true;
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    return false;
                }
                s0(jp, i);
                u0(s5.f11099a);
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            jp.E(i);
            Trace.endSection();
            t0(0, 1);
            u0(s5.f11099a);
            return true;
        }
        long j11 = s5.f11100b;
        long j12 = s5.f11099a;
        if (j11 == this.f8528s1) {
            s0(jp, i);
        } else {
            Q q6 = this.x1;
            if (q6 != null) {
                i7 = i;
                q6.a(j9, j11, tp, this.b0);
            } else {
                i7 = i;
            }
            v0(jp, i7, j11);
        }
        u0(j12);
        this.f8528s1 = j11;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void Y() {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            interfaceC1185g0.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void Z(FM fm) {
        if (this.f8510Z0) {
            ByteBuffer byteBuffer = fm.f8096h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b5 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s6 = byteBuffer.getShort();
                byte b6 = byteBuffer.get();
                byte b7 = byteBuffer.get();
                byteBuffer.position(0);
                if (b5 == -75 && s5 == 60 && s6 == 1 && b6 == 4) {
                    if (b7 == 0 || b7 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        JP jp = this.f10395Z;
                        jp.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jp.g(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void a(long j6, boolean z6, boolean z7) {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null && !z6) {
            interfaceC1185g0.r0(true);
        }
        super.a(j6, z6, z7);
        InterfaceC1185g0 interfaceC1185g02 = this.f8511a1;
        T t6 = this.f8504T0;
        if (interfaceC1185g02 == null) {
            t6.f11309b.a();
            t6.f11314g = -9223372036854775807L;
            t6.f11312e = -9223372036854775807L;
            t6.f11311d = Math.min(t6.f11311d, 1);
            t6.f11315h = -9223372036854775807L;
        }
        if (z6) {
            InterfaceC1185g0 interfaceC1185g03 = this.f8511a1;
            if (interfaceC1185g03 != null) {
                interfaceC1185g03.A0(false);
            } else {
                t6.i = false;
                t6.f11315h = -9223372036854775807L;
            }
        }
        this.f8522m1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1854sO
    public final void c(int i, Object obj) throws HN, MP {
        if (i == 1) {
            z0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            Q q3 = (Q) obj;
            this.x1 = q3;
            InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
            if (interfaceC1185g0 != null) {
                interfaceC1185g0.u0(q3);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f8531w1 != iIntValue) {
                this.f8531w1 = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.i1 = iIntValue2;
            JP jp = this.f10395Z;
            if (jp != null) {
                jp.m(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f8519j1 = iIntValue3;
            InterfaceC1185g0 interfaceC1185g02 = this.f8511a1;
            if (interfaceC1185g02 != null) {
                interfaceC1185g02.x0(iIntValue3);
                return;
            }
            Y y3 = this.f8504T0.f11309b;
            if (y3.f12548j == iIntValue3) {
                return;
            }
            y3.f12548j = iIntValue3;
            y3.c(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC1214gc.f14278a)) {
                InterfaceC1185g0 interfaceC1185g03 = this.f8511a1;
                if (interfaceC1185g03 == null || !interfaceC1185g03.b()) {
                    return;
                }
                interfaceC1185g03.d();
                return;
            }
            this.f8514d1 = list;
            InterfaceC1185g0 interfaceC1185g04 = this.f8511a1;
            if (interfaceC1185g04 != null) {
                interfaceC1185g04.y0(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Ar ar = (Ar) obj;
            if (ar.f7056a == 0 || ar.f7057b == 0) {
                return;
            }
            this.f8517g1 = ar;
            InterfaceC1185g0 interfaceC1185g05 = this.f8511a1;
            if (interfaceC1185g05 != null) {
                Surface surface = this.f8515e1;
                surface.getClass();
                interfaceC1185g05.w0(surface, ar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.v1 = ((Integer) obj).intValue();
                JP jp2 = this.f10395Z;
                if (jp2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.v1));
                    jp2.g(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f8515e1;
                z0(null);
                obj.getClass();
                ((H) obj).c(1, surface2);
                break;
            case 18:
                boolean z6 = this.f8524o1 != null;
                C2124xO c2124xO = (C2124xO) obj;
                this.f8524o1 = c2124xO;
                if (z6 != (c2124xO != null)) {
                    d0(this.f10397a0);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    VN vn = (VN) obj;
                    vn.getClass();
                    this.f10391V = vn;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void d() {
        this.f8521l1 = 0;
        this.f10407g.getClass();
        this.f8520k1 = SystemClock.elapsedRealtime();
        this.f8526q1 = 0L;
        this.f8527r1 = 0;
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            interfaceC1185g0.a();
        } else {
            this.f8504T0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void f() {
        int i = this.f8521l1;
        final C0697Ql c0697Ql = this.f8502R0;
        if (i > 0) {
            this.f10407g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final long j6 = jElapsedRealtime - this.f8520k1;
            final int i3 = this.f8521l1;
            Handler handler = (Handler) c0697Ql.f10691b;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0697Ql c0697Ql2 = c0697Ql;
                        c0697Ql2.getClass();
                        String str = Vt.f12096a;
                        GO go = ((NN) c0697Ql2.f10692c).f9997a.f11649G;
                        BO boX = go.x((C1749qQ) go.f8367d.f16141e);
                        go.t(boX, 1018, new V0.m(boX, i3, j6));
                    }
                });
            }
            this.f8521l1 = 0;
            this.f8520k1 = jElapsedRealtime;
        }
        int i6 = this.f8527r1;
        if (i6 != 0) {
            long j7 = this.f8526q1;
            Handler handler2 = (Handler) c0697Ql.f10691b;
            if (handler2 != null) {
                handler2.post(new RunnableC0857a0(i6, j7, c0697Ql));
            }
            this.f8526q1 = 0L;
            this.f8527r1 = 0;
        }
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            interfaceC1185g0.c();
            return;
        }
        T t6 = this.f8504T0;
        t6.f11310c = false;
        t6.f11315h = -9223372036854775807L;
        Y y3 = t6.f11309b;
        y3.f12543d = false;
        V v6 = y3.f12542c;
        if (v6 != null) {
            v6.b();
        }
        y3.d();
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void i() {
        C0697Ql c0697Ql = this.f8502R0;
        this.f8530u1 = null;
        this.f8533z1 = -9223372036854775807L;
        this.f8518h1 = false;
        this.f8525p1 = true;
        try {
            super.i();
            BN bn = this.f10372H0;
            c0697Ql.getClass();
            synchronized (bn) {
            }
            Handler handler = (Handler) c0697Ql.f10691b;
            if (handler != null) {
                handler.post(new CD(c0697Ql, 2, bn));
            }
            c0697Ql.y(C1161fd.f14102d);
        } catch (Throwable th) {
            c0697Ql.B(this.f10372H0);
            c0697Ql.y(C1161fd.f14102d);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void j() {
        try {
            try {
                this.f10427t0 = false;
                a0();
                x();
            } finally {
                this.f10390U = null;
            }
        } finally {
            this.f8512b1 = false;
            this.f8532y1 = -9223372036854775807L;
            J j6 = this.f8516f1;
            if (j6 != null) {
                j6.release();
                this.f8516f1 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void k() {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 == null || !this.f8501Q0) {
            return;
        }
        interfaceC1185g0.G();
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final String o() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void o0(boolean z6, boolean z7) {
        InterfaceC1185g0 interfaceC1185g0;
        this.f10372H0 = new BN();
        l();
        BN bn = this.f10372H0;
        C0697Ql c0697Ql = this.f8502R0;
        Handler handler = (Handler) c0697Ql.f10691b;
        if (handler != null) {
            handler.post(new RunnableC0857a0(c0697Ql, bn, 4));
        }
        boolean z8 = this.f8512b1;
        T t6 = this.f8504T0;
        if (!z8) {
            if (this.f8514d1 != null && this.f8511a1 == null) {
                K k6 = new K(this.f8500P0, t6);
                k6.f9411d = true;
                long j6 = this.f8506V0;
                k6.f9414g = j6 != -9223372036854775807L ? -j6 : -9223372036854775807L;
                C1994v2 c1994v2 = this.f10407g;
                c1994v2.getClass();
                k6.f9412e = c1994v2;
                AbstractC0582Jp.h0(!k6.f9413f);
                if (k6.f9410c == null) {
                    k6.f9410c = new N();
                }
                P p6 = new P(k6);
                k6.f9413f = true;
                p6.f10308p = 1;
                SparseArray sparseArray = p6.f10296c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    interfaceC1185g0 = (InterfaceC1185g0) sparseArray.get(0);
                } else {
                    L l2 = new L(p6, p6.f10294a);
                    p6.f10300g.add(l2);
                    sparseArray.put(0, l2);
                    interfaceC1185g0 = l2;
                }
                this.f8511a1 = interfaceC1185g0;
            }
            this.f8512b1 = true;
        }
        int i = !z7 ? 1 : 0;
        InterfaceC1185g0 interfaceC1185g02 = this.f8511a1;
        if (interfaceC1185g02 == null) {
            C1994v2 c1994v22 = this.f10407g;
            c1994v22.getClass();
            t6.f11317k = c1994v22;
            t6.a(i);
            return;
        }
        interfaceC1185g02.z0(new L6(1, this));
        Q q3 = this.x1;
        if (q3 != null) {
            this.f8511a1.u0(q3);
        }
        if (this.f8515e1 != null && !this.f8517g1.equals(Ar.f7055c)) {
            this.f8511a1.w0(this.f8515e1, this.f8517g1);
        }
        this.f8511a1.x0(this.f8519j1);
        this.f8511a1.s0(this.f10393X);
        List list = this.f8514d1;
        if (list != null) {
            this.f8511a1.y0(list);
        }
        this.f8513c1 = i;
        this.f10380L0 = true;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean p(long j6) {
        long j7 = this.f10376J0;
        return j7 == -9223372036854775807L || j6 > j7 - this.f10374I0.f10196c;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void p0(TP[] tpArr, long j6, long j7, C1749qQ c1749qQ) {
        super.p0(tpArr, j6, j7, c1749qQ);
        AbstractC1353j8 abstractC1353j8 = this.f10363D;
        if (abstractC1353j8.g()) {
            this.f8533z1 = -9223372036854775807L;
        } else {
            this.f8533z1 = abstractC1353j8.o(c1749qQ.f16374a, new I7()).f9073d;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void q(float f2, float f5) {
        super.q(f2, f5);
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            interfaceC1185g0.s0(f2);
        } else {
            this.f8504T0.g(f2);
        }
    }

    public final boolean q0(long j6, long j7, boolean z6, boolean z7) throws HN, MP {
        if (this.f8511a1 != null && this.f8501Q0) {
            j7 -= -this.f8532y1;
        }
        if (j6 < -500000 && !z6) {
            MQ mq = this.i;
            mq.getClass();
            int iG = mq.g(j7 - this.f10414k);
            if (iG != 0) {
                PriorityQueue priorityQueue = this.f8507W0;
                if (z7) {
                    BN bn = this.f10372H0;
                    int i = bn.f7335d + iG;
                    bn.f7335d = i;
                    bn.f7337f += this.f8523n1;
                    bn.f7335d = priorityQueue.size() + i;
                } else {
                    this.f10372H0.f7340j++;
                    t0(priorityQueue.size() + iG, this.f8523n1);
                }
                if (this.f10395Z != null) {
                    if (y()) {
                        x();
                        v();
                    } else if (z()) {
                        b0();
                    } else {
                        this.f10381M0 = true;
                    }
                }
                InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
                if (interfaceC1185g0 != null) {
                    interfaceC1185g0.r0(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void r() {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 == null) {
            T t6 = this.f8504T0;
            if (t6.f11311d == 0) {
                t6.f11311d = 1;
                return;
            }
            return;
        }
        int i = this.f8513c1;
        if (i == 0 || i == 1) {
            this.f8513c1 = 0;
        } else {
            interfaceC1185g0.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void s(long j6, long j7) throws Throwable {
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        if (interfaceC1185g0 != null) {
            try {
                interfaceC1185g0.v0(j6, j7);
            } catch (C1130f0 e6) {
                throw m(e6, e6.f14006a, false, 7001);
            }
        }
        super.s(j6, j7);
    }

    public final void s0(JP jp, int i) {
        Trace.beginSection("skipVideoBuffer");
        jp.E(i);
        Trace.endSection();
        this.f10372H0.f7337f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.TP r0 = r7.f10387R
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r7.l0()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f10420n
            goto L18
        Lf:
            com.google.android.gms.internal.ads.MQ r0 = r7.i
            r0.getClass()
            boolean r0 = r0.c()
        L18:
            if (r0 != 0) goto L3e
            int r0 = r7.f10424q0
            if (r0 < 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L3e
            long r3 = r7.f10422o0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.v2 r0 = r7.f10407g
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f10422o0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.ads.g0 r0 = r7.f8511a1
            if (r0 == 0) goto L48
            boolean r0 = r0.d0(r2)
            return r0
        L48:
            if (r2 == 0) goto L50
            com.google.android.gms.internal.ads.JP r0 = r7.f10395Z
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r1
        L50:
            com.google.android.gms.internal.ads.T r0 = r7.f8504T0
            boolean r0 = r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.t():boolean");
    }

    public final void t0(int i, int i3) {
        BN bn = this.f10372H0;
        bn.f7339h += i;
        int i6 = i + i3;
        bn.f7338g += i6;
        this.f8521l1 += i6;
        int i7 = this.f8522m1 + i6;
        this.f8522m1 = i7;
        bn.i = Math.max(i7, bn.i);
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean u() {
        if (!this.f10368F0) {
            return false;
        }
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        return interfaceC1185g0 == null || interfaceC1185g0.h();
    }

    public final void u0(long j6) {
        BN bn = this.f10372H0;
        bn.f7341k += j6;
        bn.f7342l++;
        this.f8526q1 += j6;
        this.f8527r1++;
    }

    public final void v0(JP jp, int i, long j6) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jp.v(i, j6);
        Trace.endSection();
        this.f10372H0.f7336e++;
        this.f8522m1 = 0;
        if (this.f8511a1 == null) {
            C1161fd c1161fd = this.f8529t1;
            boolean zEquals = c1161fd.equals(C1161fd.f14102d);
            C0697Ql c0697Ql = this.f8502R0;
            if (!zEquals && !c1161fd.equals(this.f8530u1)) {
                this.f8530u1 = c1161fd;
                c0697Ql.y(c1161fd);
            }
            T t6 = this.f8504T0;
            int i3 = t6.f11311d;
            t6.f11311d = 3;
            t6.f11317k.getClass();
            t6.f11313f = Vt.s(SystemClock.elapsedRealtime());
            if (i3 == 3 || (surface = this.f8515e1) == null) {
                return;
            }
            Handler handler = (Handler) c0697Ql.f10691b;
            if (handler != null) {
                handler.post(new RunnableC1021d0(c0697Ql, surface, SystemClock.elapsedRealtime()));
            }
            this.f8518h1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean w(LP lp) {
        return B0(lp);
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean y() {
        LP lp = this.f10408g0;
        if (this.f8511a1 != null && lp != null) {
            String str = lp.f9690a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.TP r0 = r12.f10397a0
            long r1 = r12.f8533z1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L24
            r8 = 1
            long r8 = r8 + r1
            com.google.android.gms.internal.ads.OP r5 = r12.f10374I0
            long r10 = r5.f10196c
            long r10 = r10 + r1
            long r1 = r12.f10383N0
            long r1 = r1 + r8
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r8 = r8 - r10
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L26
        L24:
            r1 = r7
            goto L27
        L26:
            r1 = r6
        L27:
            com.google.android.gms.internal.ads.xO r2 = r12.f8524o1
            if (r2 != 0) goto L2c
            goto L41
        L2c:
            boolean r2 = r12.f8525p1
            if (r2 != 0) goto L41
            if (r0 == 0) goto L36
            int r0 = r0.f11399o
            if (r0 > 0) goto L41
        L36:
            if (r1 != 0) goto L41
            com.google.android.gms.internal.ads.OP r0 = r12.f10374I0
            long r0 = r0.f10198e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L41
            return r6
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H.z():boolean");
    }

    public final void z0(Object obj) throws HN, MP {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f8515e1;
        C0697Ql c0697Ql = this.f8502R0;
        if (surface2 == surface) {
            if (surface != null) {
                C1161fd c1161fd = this.f8530u1;
                if (c1161fd != null) {
                    c0697Ql.y(c1161fd);
                }
                Surface surface3 = this.f8515e1;
                if (surface3 == null || !this.f8518h1 || (handler = (Handler) c0697Ql.f10691b) == null) {
                    return;
                }
                handler.post(new RunnableC1021d0(c0697Ql, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f8515e1 = surface;
        InterfaceC1185g0 interfaceC1185g0 = this.f8511a1;
        T t6 = this.f8504T0;
        if (interfaceC1185g0 == null) {
            t6.c(surface);
        }
        this.f8518h1 = false;
        int i = this.f10409h;
        JP jp = this.f10395Z;
        if (jp != null && this.f8511a1 == null) {
            LP lp = this.f10408g0;
            lp.getClass();
            if (!B0(lp) || this.f8509Y0) {
                x();
                v();
            } else {
                Surface surfaceC0 = C0(lp);
                if (surfaceC0 != null) {
                    jp.h(surfaceC0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    jp.p();
                }
            }
        }
        if (surface != null) {
            C1161fd c1161fd2 = this.f8530u1;
            if (c1161fd2 != null) {
                c0697Ql.y(c1161fd2);
            }
        } else {
            this.f8530u1 = null;
            InterfaceC1185g0 interfaceC1185g02 = this.f8511a1;
            if (interfaceC1185g02 != null) {
                interfaceC1185g02.l();
            }
        }
        if (i == 2) {
            InterfaceC1185g0 interfaceC1185g03 = this.f8511a1;
            if (interfaceC1185g03 != null) {
                interfaceC1185g03.A0(true);
            } else {
                t6.i = true;
                t6.f11315h = -9223372036854775807L;
            }
        }
    }
}
