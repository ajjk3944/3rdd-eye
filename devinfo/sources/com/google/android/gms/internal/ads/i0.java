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
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 extends ix1 {

    /* renamed from: n1, reason: collision with root package name */
    public static final int[] f12065n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: o1, reason: collision with root package name */
    public static boolean f12066o1;

    /* renamed from: p1, reason: collision with root package name */
    public static boolean f12067p1;
    public final Context B0;
    public final boolean C0;
    public final g1 D0;
    public final boolean E0;
    public final t0 F0;
    public final s0 G0;
    public final long H0;
    public final PriorityQueue I0;
    public h0 J0;
    public boolean K0;
    public boolean L0;
    public j1 M0;
    public boolean N0;
    public int O0;
    public List P0;
    public Surface Q0;
    public k0 R0;
    public yk0 S0;
    public boolean T0;
    public int U0;
    public int V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public mu1 f12068a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f12069b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f12070c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f12071d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f12072e1;

    /* renamed from: f1, reason: collision with root package name */
    public vr f12073f1;

    /* renamed from: g1, reason: collision with root package name */
    public vr f12074g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f12075h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f12076i1;

    /* renamed from: j1, reason: collision with root package name */
    public r0 f12077j1;

    /* renamed from: k1, reason: collision with root package name */
    public long f12078k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f12079l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f12080m1;

    public i0(com.google.android.gms.common.api.internal.p pVar) {
        super(2, (mu0) pVar.f9117d, (uu1) pVar.f9116c, 30.0f);
        Context applicationContext = ((Context) pVar.f9115b).getApplicationContext();
        this.B0 = applicationContext;
        this.M0 = null;
        this.D0 = new g1((Handler) pVar.f9118e, (bt1) pVar.f9119f, 0);
        this.C0 = this.M0 == null;
        this.F0 = new t0(applicationContext, this);
        this.G0 = new s0();
        this.E0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.S0 = yk0.f18785c;
        this.U0 = 1;
        this.V0 = 0;
        this.f12073f1 = vr.f17692d;
        this.f12076i1 = 0;
        this.f12074g1 = null;
        this.f12075h1 = -1000;
        this.f12078k1 = -9223372036854775807L;
        this.f12079l1 = -9223372036854775807L;
        this.I0 = new PriorityQueue();
        this.H0 = -9223372036854775807L;
        this.f12068a1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int p0(com.google.android.gms.internal.ads.ex1 r8, com.google.android.gms.internal.ads.mx1 r9) {
        /*
            int r0 = r9.f14059t
            int r1 = r9.f14060u
            r2 = -1
            if (r0 == r2) goto Lca
            if (r1 != r2) goto Lb
            goto Lca
        Lb:
            java.lang.String r3 = r9.f14052m
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L40
            android.util.Pair r9 = com.google.android.gms.internal.ads.ba0.b(r9)
            if (r9 == 0) goto L3f
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r9 == r3) goto L3d
            r3 = 1
            if (r9 == r3) goto L3d
            r3 = 2
            if (r9 != r3) goto L37
            goto L3d
        L37:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L3f
            r3 = r6
            goto L40
        L3d:
            r3 = r5
            goto L40
        L3f:
            r3 = r7
        L40:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbd;
                case -1662735862: goto Lb6;
                case -1662541442: goto La5;
                case 1187890754: goto L9c;
                case 1331836730: goto L5f;
                case 1599127256: goto L56;
                case 1599127257: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lca
        L4a:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            r4 = 8
            goto Lc5
        L56:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            goto Lc5
        L5f:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lca
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lca
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8d
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lca
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8d
            boolean r8 = r8.f10909f
            if (r8 != 0) goto Lca
        L8d:
            java.lang.String r8 = com.google.android.gms.internal.ads.bq0.f9768a
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L9c:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
            goto Lc5
        La5:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lca
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb6:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lca
            goto Lc5
        Lbd:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lca
        Lc5:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.p0(com.google.android.gms.internal.ads.ex1, com.google.android.gms.internal.ads.mx1):int");
    }

    public static int u0(ex1 ex1Var, mx1 mx1Var) {
        int i4 = mx1Var.f14053n;
        if (i4 == -1) {
            return p0(ex1Var, mx1Var);
        }
        List list = mx1Var.f14055p;
        int size = list.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) list.get(i10)).length;
        }
        return i4 + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0656 A[Catch: all -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0018, B:507:0x066a, B:42:0x0073, B:45:0x007e, B:77:0x00dd, B:500:0x0656, B:508:0x066e), top: B:513:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean v0(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.v0(java.lang.String):boolean");
    }

    public static List w0(Context context, uu1 uu1Var, mx1 mx1Var, boolean z3, boolean z10) {
        List listA;
        String str = mx1Var.f14052m;
        if (str == null) {
            return u51.f17096e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f0.a(context)) {
            String strD = px1.d(mx1Var);
            if (strD == null) {
                listA = u51.f17096e;
            } else {
                uu1Var.getClass();
                listA = px1.a(strD, z3, z10);
            }
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return px1.b(uu1Var, mx1Var, z3, z10);
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void A(mx1[] mx1VarArr, long j, long j8, jy1 jy1Var) {
        super.A(mx1VarArr, j, j8, jy1Var);
        uh uhVar = this.f15095p;
        if (uhVar.g()) {
            this.f12079l1 = -9223372036854775807L;
        } else {
            this.f12079l1 = uhVar.o(jy1Var.f12875a, new tg()).f16812d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface A0(com.google.android.gms.internal.ads.ex1 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.j1 r0 = r6.M0
            if (r0 == 0) goto L9
            android.view.Surface r7 = r0.D1()
            return r7
        L9:
            android.view.Surface r0 = r6.Q0
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r7.f10910h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r0 = r7.f10904a
            boolean r0 = v0(r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L30
            boolean r0 = r7.f10909f
            if (r0 == 0) goto L32
            android.content.Context r0 = r6.B0
            boolean r0 = com.google.android.gms.internal.ads.k0.a(r0)
            if (r0 != 0) goto L32
        L30:
            r0 = r1
            goto L33
        L32:
            r0 = r3
        L33:
            com.google.android.gms.internal.ads.mq0.c0(r0)
            com.google.android.gms.internal.ads.k0 r0 = r6.R0
            if (r0 == 0) goto L47
            boolean r4 = r7.f10909f
            boolean r5 = r0.f12911a
            if (r5 == r4) goto L47
            if (r0 == 0) goto L47
            r0.release()
            r6.R0 = r2
        L47:
            com.google.android.gms.internal.ads.k0 r0 = r6.R0
            if (r0 != 0) goto Lbf
            android.content.Context r0 = r6.B0
            boolean r7 = r7.f10909f
            if (r7 == 0) goto L5b
            boolean r0 = com.google.android.gms.internal.ads.k0.a(r0)
            if (r0 == 0) goto L59
        L57:
            r0 = r3
            goto L5e
        L59:
            r0 = r1
            goto L5e
        L5b:
            int r0 = com.google.android.gms.internal.ads.k0.f12909d
            goto L57
        L5e:
            com.google.android.gms.internal.ads.mq0.c0(r0)
            com.google.android.gms.internal.ads.j0 r0 = new com.google.android.gms.internal.ads.j0
            java.lang.String r2 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r2)
            if (r7 == 0) goto L6d
            int r7 = com.google.android.gms.internal.ads.k0.f12909d
            goto L6e
        L6d:
            r7 = r1
        L6e:
            r0.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r2.<init>(r4, r0)
            r0.f12553b = r2
            com.google.android.gms.internal.ads.dc0 r4 = new com.google.android.gms.internal.ads.dc0
            r4.<init>(r2)
            r0.f12552a = r4
            monitor-enter(r0)
            android.os.Handler r2 = r0.f12553b     // Catch: java.lang.Throwable -> L9d
            android.os.Message r7 = r2.obtainMessage(r3, r7, r1)     // Catch: java.lang.Throwable -> L9d
            r7.sendToTarget()     // Catch: java.lang.Throwable -> L9d
        L8d:
            com.google.android.gms.internal.ads.k0 r7 = r0.f12556e     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.RuntimeException r7 = r0.f12555d     // Catch: java.lang.Throwable -> L9d
            if (r7 != 0) goto La1
            java.lang.Error r7 = r0.f12554c     // Catch: java.lang.Throwable -> L9d
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
            java.lang.RuntimeException r7 = r0.f12555d
            if (r7 != 0) goto Lbc
            java.lang.Error r7 = r0.f12554c
            if (r7 != 0) goto Lbb
            com.google.android.gms.internal.ads.k0 r7 = r0.f12556e
            r7.getClass()
            r6.R0 = r7
            goto Lbf
        Lbb:
            throw r7
        Lbc:
            throw r7
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            throw r7
        Lbf:
            com.google.android.gms.internal.ads.k0 r7 = r6.R0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.A0(com.google.android.gms.internal.ads.ex1):android.view.Surface");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean C(ex1 ex1Var) {
        return z0(ex1Var);
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean E() {
        ex1 ex1Var = this.S;
        if (this.M0 != null && ex1Var != null) {
            String str = ex1Var.f10904a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.E();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.google.android.gms.internal.ads.ix1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.mx1 r0 = r12.M
            long r1 = r12.f12079l1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L24
            r8 = 1
            long r8 = r8 + r1
            com.google.android.gms.internal.ads.hx1 r5 = r12.f12526u0
            long r10 = r5.f12010c
            long r10 = r10 + r1
            long r1 = r12.f12536z0
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
            com.google.android.gms.internal.ads.mu1 r2 = r12.f12068a1
            if (r2 != 0) goto L2c
            goto L41
        L2c:
            boolean r2 = r12.f12069b1
            if (r2 != 0) goto L41
            if (r0 == 0) goto L36
            int r0 = r0.f14054o
            if (r0 > 0) goto L41
        L36:
            if (r1 != 0) goto L41
            com.google.android.gms.internal.ads.hx1 r0 = r12.f12526u0
            long r0 = r0.f12012e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L41
            return r6
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.F():boolean");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void G() {
        super.G();
        this.I0.clear();
        this.Z0 = 0;
        this.f12069b1 = false;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final dx1 I(IllegalStateException illegalStateException, ex1 ex1Var) {
        Surface surface = this.Q0;
        d0 d0Var = new d0(illegalStateException, ex1Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return d0Var;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void J(mx1 mx1Var) throws us1 {
        j1 j1Var = this.M0;
        if (j1Var == null || j1Var.c()) {
            return;
        }
        try {
            j1Var.e2(mx1Var);
        } catch (i1 e2) {
            throw k(e2, mx1Var, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void K(rq1 rq1Var) {
        int iL = L(rq1Var);
        if (Build.VERSION.SDK_INT < 34 || (iL & 32) == 0) {
            this.Z0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final int L(rq1 rq1Var) {
        return (Build.VERSION.SDK_INT < 34 || this.f12068a1 == null || rq1Var.g >= this.f15091l || y0(rq1Var)) ? 0 : 32;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean M(rq1 rq1Var) {
        boolean z3 = false;
        if (!y0(rq1Var)) {
            if (rq1Var.g < this.f15091l) {
                if (!rq1Var.h(268435456)) {
                    if (rq1Var.h(67108864)) {
                        rq1Var.i();
                        z3 = true;
                    }
                    if (z3) {
                        this.f12524t0.f14781d++;
                    }
                }
            }
            return z3;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void N(long j) {
        super.N(j);
        this.Z0--;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final int O(uu1 uu1Var, mx1 mx1Var) {
        boolean z3;
        String str = mx1Var.f14052m;
        if (!ia.b(str)) {
            return 128;
        }
        int i4 = 0;
        boolean z10 = mx1Var.f14056q != null;
        Context context = this.B0;
        List listW0 = w0(context, uu1Var, mx1Var, z10, false);
        if (z10 && listW0.isEmpty()) {
            listW0 = w0(context, uu1Var, mx1Var, false, false);
        }
        if (listW0.isEmpty()) {
            return 129;
        }
        if (mx1Var.L != 0) {
            return 130;
        }
        ex1 ex1Var = (ex1) listW0.get(0);
        boolean zB = ex1Var.b(mx1Var);
        if (zB) {
            z3 = true;
        } else {
            for (int i10 = 1; i10 < listW0.size(); i10++) {
                ex1 ex1Var2 = (ex1) listW0.get(i10);
                if (ex1Var2.b(mx1Var)) {
                    zB = true;
                    z3 = false;
                    ex1Var = ex1Var2;
                    break;
                }
            }
            z3 = true;
        }
        int i11 = true != zB ? 3 : 4;
        int i12 = true != ex1Var.c(mx1Var) ? 8 : 16;
        int i13 = true != ex1Var.g ? 0 : 64;
        int i14 = true != z3 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !f0.a(context)) {
            i14 = 256;
        }
        if (zB) {
            List listW02 = w0(context, uu1Var, mx1Var, z10, true);
            if (!listW02.isEmpty()) {
                HashMap map = px1.f15143a;
                ArrayList arrayList = new ArrayList(listW02);
                Collections.sort(arrayList, new nx1(new rg0(27, mx1Var)));
                ex1 ex1Var3 = (ex1) arrayList.get(0);
                if (ex1Var3.b(mx1Var) && ex1Var3.c(mx1Var)) {
                    i4 = 32;
                }
            }
        }
        return i11 | i12 | i4 | i13 | i14;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final ArrayList P(uu1 uu1Var, mx1 mx1Var) {
        List listW0 = w0(this.B0, uu1Var, mx1Var, false, false);
        HashMap map = px1.f15143a;
        ArrayList arrayList = new ArrayList(listW0);
        Collections.sort(arrayList, new nx1(new rg0(27, mx1Var)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r1 = null;
     */
    @Override // com.google.android.gms.internal.ads.ix1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r7 R(com.google.android.gms.internal.ads.ex1 r23, com.google.android.gms.internal.ads.mx1 r24, float r25) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.R(com.google.android.gms.internal.ads.ex1, com.google.android.gms.internal.ads.mx1, float):com.google.android.gms.internal.ads.r7");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final ps1 S(ex1 ex1Var, mx1 mx1Var, mx1 mx1Var2) {
        int i4;
        int i10;
        ps1 ps1VarD = ex1Var.d(mx1Var, mx1Var2);
        int i11 = ps1VarD.f15103e;
        h0 h0Var = this.J0;
        h0Var.getClass();
        if (mx1Var2.f14059t > h0Var.f11671a || mx1Var2.f14060u > h0Var.f11672b) {
            i11 |= 256;
        }
        if (u0(ex1Var, mx1Var2) > h0Var.f11673c) {
            i11 |= 64;
        }
        String str = ex1Var.f10904a;
        if (i11 != 0) {
            i10 = 0;
            i4 = i11;
        } else {
            i4 = 0;
            i10 = ps1VarD.f15102d;
        }
        return new ps1(str, mx1Var, mx1Var2, i10, i4);
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final float U(float f10, mx1 mx1Var, mx1[] mx1VarArr) {
        ex1 ex1Var;
        float fMax = -1.0f;
        for (mx1 mx1Var2 : mx1VarArr) {
            float f11 = mx1Var2.f14063x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.f12068a1 == null || (ex1Var = this.S) == null) {
            return f12;
        }
        int i4 = mx1Var.f14059t;
        int i10 = mx1Var.f14060u;
        float f13 = -3.4028235E38f;
        if (ex1Var.f10911i) {
            float f14 = ex1Var.f10913l;
            if (f14 != -3.4028235E38f && ex1Var.j == i4 && ex1Var.f10912k == i10) {
                f13 = f14;
            } else {
                f13 = 1024.0f;
                if (!ex1Var.e(i4, i10, 1024.0d)) {
                    float f15 = 0.0f;
                    while (true) {
                        float f16 = f13 - f15;
                        if (Math.abs(f16) <= 5.0f) {
                            break;
                        }
                        float f17 = (f16 / 2.0f) + f15;
                        boolean zE = ex1Var.e(i4, i10, f17);
                        if (true == zE) {
                            f15 = f17;
                        }
                        if (true != zE) {
                            f13 = f17;
                        }
                    }
                    f13 = f15;
                }
                ex1Var.f10913l = f13;
                ex1Var.j = i4;
                ex1Var.f10912k = i10;
            }
        }
        return f12 != -1.0f ? Math.max(f12, f13) : f13;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void V(String str, long j, long j8) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        g1 g1Var = this.D0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            str2 = str;
            handler.post(new c1(g1Var, str2, j, j8));
        } else {
            str2 = str;
        }
        this.K0 = v0(str2);
        ex1 ex1Var = this.S;
        ex1Var.getClass();
        boolean z3 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(ex1Var.f10905b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = ex1Var.f10907d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i4].profile == 16384) {
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        this.L0 = z3;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void W(String str) {
        g1 g1Var = this.D0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new c1(g1Var, str, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void X(Exception exc) {
        ls.H("MediaCodecVideoRenderer", "Video codec error", exc);
        g1 g1Var = this.D0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new c1(g1Var, exc, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final ps1 Y(ce1 ce1Var) {
        ps1 ps1VarY = super.Y(ce1Var);
        mx1 mx1Var = (mx1) ce1Var.f10095c;
        mx1Var.getClass();
        g1 g1Var = this.D0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new d1(g1Var, mx1Var, ps1VarY, 0));
        }
        return ps1VarY;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void Z(mx1 mx1Var, MediaFormat mediaFormat) {
        cx1 cx1Var = this.L;
        if (cx1Var != null) {
            cx1Var.h(this.U0);
        }
        mediaFormat.getClass();
        boolean z3 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z3 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z3 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = mx1Var.f14065z;
        int i4 = mx1Var.f14064y;
        if (i4 == 90 || i4 == 270) {
            f10 = 1.0f / f10;
            int i10 = integer2;
            integer2 = integer;
            integer = i10;
        }
        this.f12073f1 = new vr(integer, integer2, f10);
        j1 j1Var = this.M0;
        if (j1Var == null || !this.f12080m1) {
            this.F0.d(mx1Var.f14063x);
        } else {
            lw1 lw1Var = new lw1(mx1Var);
            lw1Var.f13668s = integer;
            lw1Var.f13669t = integer2;
            lw1Var.f13674y = f10;
            mx1 mx1Var2 = new mx1(lw1Var);
            int i11 = this.O0;
            List list = this.P0;
            if (list == null) {
                list = u51.f17096e;
            }
            j1Var.d2(mx1Var2, this.f12526u0.f12009b, i11, list);
            this.O0 = 2;
        }
        this.f12080m1 = false;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void a0() {
        j1 j1Var = this.M0;
        if (j1Var != null) {
            j1Var.C1();
            long j = this.f12078k1;
            if (j == -9223372036854775807L) {
                j = this.f12526u0.f12009b;
                this.f12078k1 = j;
            }
            this.M0.c2(-j);
        } else {
            this.F0.a(2);
        }
        this.f12080m1 = true;
    }

    @Override // com.google.android.gms.internal.ads.gu1
    public final void b(int i4, Object obj) throws gx1, us1 {
        if (i4 == 1) {
            x0(obj);
            return;
        }
        if (i4 == 7) {
            obj.getClass();
            r0 r0Var = (r0) obj;
            this.f12077j1 = r0Var;
            j1 j1Var = this.M0;
            if (j1Var != null) {
                j1Var.V1(r0Var);
                return;
            }
            return;
        }
        if (i4 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f12076i1 != iIntValue) {
                this.f12076i1 = iIntValue;
                return;
            }
            return;
        }
        if (i4 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.U0 = iIntValue2;
            cx1 cx1Var = this.L;
            if (cx1Var != null) {
                cx1Var.h(iIntValue2);
                return;
            }
            return;
        }
        if (i4 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.V0 = iIntValue3;
            j1 j1Var2 = this.M0;
            if (j1Var2 != null) {
                j1Var2.Z1(iIntValue3);
                return;
            }
            a1 a1Var = this.F0.f16611b;
            if (a1Var.j == iIntValue3) {
                return;
            }
            a1Var.j = iIntValue3;
            a1Var.c(true);
            return;
        }
        if (i4 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(tp.f16913a)) {
                j1 j1Var3 = this.M0;
                if (j1Var3 == null || !j1Var3.c()) {
                    return;
                }
                j1Var3.d();
                return;
            }
            this.P0 = list;
            j1 j1Var4 = this.M0;
            if (j1Var4 != null) {
                j1Var4.a2(list);
                return;
            }
            return;
        }
        if (i4 == 14) {
            obj.getClass();
            yk0 yk0Var = (yk0) obj;
            if (yk0Var.f18786a == 0 || yk0Var.f18787b == 0) {
                return;
            }
            this.S0 = yk0Var;
            j1 j1Var5 = this.M0;
            if (j1Var5 != null) {
                Surface surface = this.Q0;
                surface.getClass();
                j1Var5.Y1(surface, yk0Var);
                return;
            }
            return;
        }
        switch (i4) {
            case 16:
                obj.getClass();
                this.f12075h1 = ((Integer) obj).intValue();
                cx1 cx1Var2 = this.L;
                if (cx1Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f12075h1));
                    cx1Var2.d(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.Q0;
                x0(null);
                obj.getClass();
                ((i0) obj).b(1, surface2);
                break;
            case 18:
                boolean z3 = this.f12068a1 != null;
                mu1 mu1Var = (mu1) obj;
                this.f12068a1 = mu1Var;
                if (z3 != (mu1Var != null)) {
                    h0(this.M);
                    break;
                }
                break;
            default:
                if (i4 == 11) {
                    jt1 jt1Var = (jt1) obj;
                    jt1Var.getClass();
                    this.H = jt1Var;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean b0(long j, long j8, cx1 cx1Var, ByteBuffer byteBuffer, int i4, int i10, int i11, long j9, boolean z3, boolean z10, mx1 mx1Var) {
        int i12;
        cx1Var.getClass();
        long j10 = j9 - this.f12526u0.f12010c;
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.I0;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j9) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        r0(i13, 0);
        j1 j1Var = this.M0;
        if (j1Var != null) {
            if (!z3 || z10) {
                return j1Var.U1(j9, new e0(this, cx1Var, i4, j10));
            }
            q0(cx1Var, i4);
            return true;
        }
        long j11 = this.f12526u0.f12009b;
        t0 t0Var = this.F0;
        s0 s0Var = this.G0;
        int iF = t0Var.f(j9, j, j8, j11, z3, z10, s0Var);
        if (iF == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            r0 r0Var = this.f12077j1;
            if (r0Var != null) {
                r0Var.a(j10, jNanoTime, mx1Var, this.N);
            }
            t0(cx1Var, i4, jNanoTime);
            s0(s0Var.f15817a);
            return true;
        }
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    return false;
                }
                q0(cx1Var, i4);
                s0(s0Var.f15817a);
                return true;
            }
            Trace.beginSection("dropVideoBuffer");
            cx1Var.p(i4);
            Trace.endSection();
            r0(0, 1);
            s0(s0Var.f15817a);
            return true;
        }
        long j12 = s0Var.f15818b;
        long j13 = s0Var.f15817a;
        if (j12 == this.f12072e1) {
            q0(cx1Var, i4);
        } else {
            r0 r0Var2 = this.f12077j1;
            if (r0Var2 != null) {
                i12 = i4;
                r0Var2.a(j10, j12, mx1Var, this.N);
            } else {
                i12 = i4;
            }
            t0(cx1Var, i12, j12);
        }
        s0(j13);
        this.f12072e1 = j12;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void c(long j, boolean z3, boolean z10) {
        j1 j1Var = this.M0;
        if (j1Var != null && !z3) {
            j1Var.S1(true);
        }
        super.c(j, z3, z10);
        j1 j1Var2 = this.M0;
        t0 t0Var = this.F0;
        if (j1Var2 == null) {
            t0Var.f16611b.a();
            t0Var.g = -9223372036854775807L;
            t0Var.f16614e = -9223372036854775807L;
            t0Var.f16613d = Math.min(t0Var.f16613d, 1);
            t0Var.f16616h = -9223372036854775807L;
        }
        if (z3) {
            j1 j1Var3 = this.M0;
            if (j1Var3 != null) {
                j1Var3.b2(false);
            } else {
                t0Var.f16617i = false;
                t0Var.f16616h = -9223372036854775807L;
            }
        }
        this.Y0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void c0() {
        j1 j1Var = this.M0;
        if (j1Var != null) {
            j1Var.C1();
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void d() {
        this.X0 = 0;
        this.g.getClass();
        this.W0 = SystemClock.elapsedRealtime();
        this.f12070c1 = 0L;
        this.f12071d1 = 0;
        j1 j1Var = this.M0;
        if (j1Var != null) {
            j1Var.b();
        } else {
            this.F0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void d0(rq1 rq1Var) {
        if (this.L0) {
            ByteBuffer byteBuffer = rq1Var.f15737h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        cx1 cx1Var = this.L;
                        cx1Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        cx1Var.d(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void f() {
        int i4 = this.X0;
        g1 g1Var = this.D0;
        if (i4 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.W0;
            int i10 = this.X0;
            Handler handler = g1Var.f11341a;
            if (handler != null) {
                handler.post(new e1(g1Var, i10, j, 0));
            }
            this.X0 = 0;
            this.W0 = jElapsedRealtime;
        }
        int i11 = this.f12071d1;
        if (i11 != 0) {
            long j8 = this.f12070c1;
            Handler handler2 = g1Var.f11341a;
            if (handler2 != null) {
                handler2.post(new c1(g1Var, j8, i11));
            }
            this.f12070c1 = 0L;
            this.f12071d1 = 0;
        }
        j1 j1Var = this.M0;
        if (j1Var != null) {
            j1Var.a();
            return;
        }
        t0 t0Var = this.F0;
        t0Var.f16612c = false;
        t0Var.f16616h = -9223372036854775807L;
        a1 a1Var = t0Var.f16611b;
        a1Var.f9168d = false;
        w0 w0Var = a1Var.f9167c;
        if (w0Var != null) {
            w0Var.b();
        }
        a1Var.d();
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void g() {
        g1 g1Var = this.D0;
        this.f12074g1 = null;
        this.f12079l1 = -9223372036854775807L;
        this.T0 = false;
        this.f12069b1 = true;
        try {
            super.g();
            os1 os1Var = this.f12524t0;
            g1Var.getClass();
            synchronized (os1Var) {
            }
            Handler handler = g1Var.f11341a;
            if (handler != null) {
                handler.post(new q81(2, g1Var, os1Var));
            }
            g1Var.a(vr.f17692d);
        } catch (Throwable th2) {
            g1Var.c(this.f12524t0);
            g1Var.a(vr.f17692d);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void h() {
        try {
            try {
                this.f12508f0 = false;
                e0();
                D();
            } finally {
                this.G = null;
            }
        } finally {
            this.N0 = false;
            this.f12078k1 = -9223372036854775807L;
            k0 k0Var = this.R0;
            if (k0Var != null) {
                k0Var.release();
                this.R0 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void i() {
        j1 j1Var = this.M0;
        if (j1Var == null || !this.C0) {
            return;
        }
        j1Var.O1();
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final String m() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final boolean n(long j) {
        long j8 = this.f12528v0;
        return j8 == -9223372036854775807L || j > j8 - this.f12526u0.f12010c;
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void o(float f10, float f11) throws gx1, us1 {
        super.o(f10, f11);
        j1 j1Var = this.M0;
        if (j1Var != null) {
            j1Var.T1(f10);
        } else {
            this.F0.g(f10);
        }
    }

    public final boolean o0(long j, long j8, boolean z3, boolean z10) throws gx1, us1 {
        if (this.M0 != null && this.C0) {
            j8 -= -this.f12078k1;
        }
        if (j < -500000 && !z3) {
            iz1 iz1Var = this.f15089i;
            iz1Var.getClass();
            int iF = iz1Var.f(j8 - this.f15090k);
            if (iF != 0) {
                PriorityQueue priorityQueue = this.I0;
                if (z10) {
                    os1 os1Var = this.f12524t0;
                    int i4 = os1Var.f14781d + iF;
                    os1Var.f14781d = i4;
                    os1Var.f14783f += this.Z0;
                    os1Var.f14781d = priorityQueue.size() + i4;
                } else {
                    this.f12524t0.j++;
                    r0(priorityQueue.size() + iF, this.Z0);
                }
                if (this.L != null) {
                    if (E()) {
                        D();
                        B();
                    } else if (F()) {
                        f0();
                    } else {
                        this.f12534y0 = true;
                    }
                }
                j1 j1Var = this.M0;
                if (j1Var != null) {
                    j1Var.S1(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void p() {
        j1 j1Var = this.M0;
        if (j1Var == null) {
            t0 t0Var = this.F0;
            if (t0Var.f16613d == 0) {
                t0Var.f16613d = 1;
                return;
            }
            return;
        }
        int i4 = this.O0;
        if (i4 == 0 || i4 == 1) {
            this.O0 = 0;
        } else {
            j1Var.N1();
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void q(long j, long j8) throws Throwable {
        j1 j1Var = this.M0;
        if (j1Var != null) {
            try {
                j1Var.X1(j, j8);
            } catch (i1 e2) {
                throw k(e2, e2.f12111a, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.q(j, j8);
    }

    public final void q0(cx1 cx1Var, int i4) {
        Trace.beginSection("skipVideoBuffer");
        cx1Var.p(i4);
        Trace.endSection();
        this.f12524t0.f14783f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // com.google.android.gms.internal.ads.pr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.mx1 r0 = r7.D
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r7.w()
            if (r0 == 0) goto Lf
            boolean r0 = r7.f15093n
            goto L18
        Lf:
            com.google.android.gms.internal.ads.iz1 r0 = r7.f15089i
            r0.getClass()
            boolean r0 = r0.a()
        L18:
            if (r0 != 0) goto L3e
            int r0 = r7.f12505c0
            if (r0 < 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L3e
            long r3 = r7.f12503a0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.w5 r0 = r7.g
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r7.f12503a0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L3e
            goto L3f
        L3e:
            r2 = r1
        L3f:
            com.google.android.gms.internal.ads.j1 r0 = r7.M0
            if (r0 == 0) goto L48
            boolean r0 = r0.Q1(r2)
            return r0
        L48:
            if (r2 == 0) goto L50
            com.google.android.gms.internal.ads.cx1 r0 = r7.L
            if (r0 == 0) goto L4f
            goto L50
        L4f:
            return r1
        L50:
            com.google.android.gms.internal.ads.t0 r0 = r7.F0
            boolean r0 = r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i0.r():boolean");
    }

    public final void r0(int i4, int i10) {
        os1 os1Var = this.f12524t0;
        os1Var.f14784h += i4;
        int i11 = i4 + i10;
        os1Var.g += i11;
        this.X0 += i11;
        int i12 = this.Y0 + i11;
        this.Y0 = i12;
        os1Var.f14785i = Math.max(i12, os1Var.f14785i);
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final boolean s() {
        if (!this.f12520r0) {
            return false;
        }
        j1 j1Var = this.M0;
        return j1Var == null || j1Var.A1();
    }

    public final void s0(long j) {
        os1 os1Var = this.f12524t0;
        os1Var.f14786k += j;
        os1Var.f14787l++;
        this.f12070c1 += j;
        this.f12071d1++;
    }

    public final void t0(cx1 cx1Var, int i4, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        cx1Var.l(i4, j);
        Trace.endSection();
        this.f12524t0.f14782e++;
        this.Y0 = 0;
        if (this.M0 == null) {
            vr vrVar = this.f12073f1;
            boolean zEquals = vrVar.equals(vr.f17692d);
            g1 g1Var = this.D0;
            if (!zEquals && !vrVar.equals(this.f12074g1)) {
                this.f12074g1 = vrVar;
                g1Var.a(vrVar);
            }
            t0 t0Var = this.F0;
            int i10 = t0Var.f16613d;
            t0Var.f16613d = 3;
            t0Var.f16618k.getClass();
            t0Var.f16615f = bq0.s(SystemClock.elapsedRealtime());
            if (i10 == 3 || (surface = this.Q0) == null) {
                return;
            }
            Handler handler = g1Var.f11341a;
            if (handler != null) {
                handler.post(new f1(g1Var, surface, SystemClock.elapsedRealtime()));
            }
            this.T0 = true;
        }
    }

    public final void x0(Object obj) throws gx1, us1 {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.Q0;
        g1 g1Var = this.D0;
        if (surface2 == surface) {
            if (surface != null) {
                vr vrVar = this.f12074g1;
                if (vrVar != null) {
                    g1Var.a(vrVar);
                }
                Surface surface3 = this.Q0;
                if (surface3 == null || !this.T0 || (handler = g1Var.f11341a) == null) {
                    return;
                }
                handler.post(new f1(g1Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.Q0 = surface;
        j1 j1Var = this.M0;
        t0 t0Var = this.F0;
        if (j1Var == null) {
            t0Var.c(surface);
        }
        this.T0 = false;
        int i4 = this.f15088h;
        cx1 cx1Var = this.L;
        if (cx1Var != null && this.M0 == null) {
            ex1 ex1Var = this.S;
            ex1Var.getClass();
            if (!z0(ex1Var) || this.K0) {
                D();
                B();
            } else {
                Surface surfaceA0 = A0(ex1Var);
                if (surfaceA0 != null) {
                    cx1Var.f(surfaceA0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    cx1Var.H1();
                }
            }
        }
        if (surface != null) {
            vr vrVar2 = this.f12074g1;
            if (vrVar2 != null) {
                g1Var.a(vrVar2);
            }
        } else {
            this.f12074g1 = null;
            j1 j1Var2 = this.M0;
            if (j1Var2 != null) {
                j1Var2.E1();
            }
        }
        if (i4 == 2) {
            j1 j1Var3 = this.M0;
            if (j1Var3 != null) {
                j1Var3.b2(true);
            } else {
                t0Var.f16617i = true;
                t0Var.f16616h = -9223372036854775807L;
            }
        }
    }

    public final boolean y0(rq1 rq1Var) {
        if (w() || rq1Var.h(536870912)) {
            return true;
        }
        long j = this.f12079l1;
        return j == -9223372036854775807L || j - (rq1Var.g - this.f12526u0.f12010c) <= 100000;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void z(boolean z3, boolean z10) {
        j1 j1Var;
        this.f12524t0 = new os1();
        j();
        os1 os1Var = this.f12524t0;
        g1 g1Var = this.D0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new c1(g1Var, os1Var, 4));
        }
        boolean z11 = this.N0;
        t0 t0Var = this.F0;
        if (!z11) {
            if (this.P0 != null && this.M0 == null) {
                l0 l0Var = new l0(this.B0, t0Var);
                l0Var.f13309d = true;
                long j = this.H0;
                l0Var.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                w5 w5Var = this.g;
                w5Var.getClass();
                l0Var.f13310e = w5Var;
                mq0.c0(!l0Var.f13311f);
                if (l0Var.f13308c == null) {
                    l0Var.f13308c = new o0();
                }
                q0 q0Var = new q0(l0Var);
                l0Var.f13311f = true;
                q0Var.f15179p = 1;
                SparseArray sparseArray = q0Var.f15168c;
                if (sparseArray.indexOfKey(0) >= 0) {
                    j1Var = (j1) sparseArray.get(0);
                } else {
                    m0 m0Var = new m0(q0Var, q0Var.f15166a);
                    q0Var.g.add(m0Var);
                    sparseArray.put(0, m0Var);
                    j1Var = m0Var;
                }
                this.M0 = j1Var;
            }
            this.N0 = true;
        }
        int i4 = !z10 ? 1 : 0;
        j1 j1Var2 = this.M0;
        if (j1Var2 == null) {
            w5 w5Var2 = this.g;
            w5Var2.getClass();
            t0Var.f16618k = w5Var2;
            t0Var.a(i4);
            return;
        }
        j1Var2.W1(new mx0(1, this));
        r0 r0Var = this.f12077j1;
        if (r0Var != null) {
            this.M0.V1(r0Var);
        }
        if (this.Q0 != null && !this.S0.equals(yk0.f18785c)) {
            this.M0.Y1(this.Q0, this.S0);
        }
        this.M0.Z1(this.V0);
        this.M0.T1(this.J);
        List list = this.P0;
        if (list != null) {
            this.M0.a2(list);
        }
        this.O0 = i4;
        this.f12532x0 = true;
    }

    public final boolean z0(ex1 ex1Var) {
        if (this.M0 != null) {
            return true;
        }
        Surface surface = this.Q0;
        if (surface != null && surface.isValid()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 35 && ex1Var.f10910h) {
            return true;
        }
        if (v0(ex1Var.f10904a)) {
            return false;
        }
        return !ex1Var.f10909f || k0.a(this.B0);
    }
}
