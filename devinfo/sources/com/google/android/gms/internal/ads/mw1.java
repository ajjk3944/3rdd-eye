package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mw1 extends ix1 implements st1 {
    public final Context B0;
    public final g1 C0;
    public final kw1 D0;
    public final bx1 E0;
    public final HashSet F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public mx1 J0;
    public final ns1 K0;
    public ns1 L0;
    public mx1 M0;
    public long N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public long T0;

    /* JADX WARN: Illegal instructions before constructor call */
    public mw1(Context context, mu0 mu0Var, Handler handler, bt1 bt1Var, kw1 kw1Var) {
        uu1 uu1Var = uu1.f17350h;
        bx1 bx1Var = Build.VERSION.SDK_INT >= 35 ? new bx1() : null;
        super(1, mu0Var, uu1Var, 44100.0f);
        this.B0 = context.getApplicationContext();
        this.D0 = kw1Var;
        this.E0 = bx1Var;
        this.R0 = -1000;
        this.C0 = new g1(handler, bt1Var, 1);
        this.T0 = -9223372036854775807L;
        kw1Var.f13271l = new kh0(24, this);
        this.F0 = new HashSet();
        ns1 ns1Var = ns1.f14404b;
        this.K0 = ns1Var;
        this.L0 = ns1Var;
    }

    @Override // com.google.android.gms.internal.ads.st1
    public final fc A1() {
        return this.D0.f13281v;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    @Override // com.google.android.gms.internal.ads.ix1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(com.google.android.gms.internal.ads.uu1 r13, com.google.android.gms.internal.ads.mx1 r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.O(com.google.android.gms.internal.ads.uu1, com.google.android.gms.internal.ads.mx1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // com.google.android.gms.internal.ads.ix1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList P(com.google.android.gms.internal.ads.uu1 r4, com.google.android.gms.internal.ads.mx1 r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f14052m
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.u51 r4 = com.google.android.gms.internal.ads.u51.f17096e
            goto L3c
        L7:
            com.google.android.gms.internal.ads.kw1 r0 = r3.D0
            com.google.android.gms.internal.ads.cw1 r1 = r0.f13275p
            com.google.android.gms.internal.ads.lv1 r0 = r0.m(r5)
            com.google.android.gms.internal.ads.nv1 r0 = r1.a(r0)
            int r0 = r0.f14451d
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L1d
            goto L38
        L1d:
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = com.google.android.gms.internal.ads.px1.a(r0, r2, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            r0 = 0
            goto L31
        L2b:
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.ex1 r0 = (com.google.android.gms.internal.ads.ex1) r0
        L31:
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.u51 r4 = com.google.android.gms.internal.ads.x41.l(r0)
            goto L3c
        L38:
            com.google.android.gms.internal.ads.u51 r4 = com.google.android.gms.internal.ads.px1.b(r4, r5, r2, r2)
        L3c:
            java.util.HashMap r0 = com.google.android.gms.internal.ads.px1.f15143a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.google.android.gms.internal.ads.rg0 r4 = new com.google.android.gms.internal.ads.rg0
            r1 = 27
            r4.<init>(r1, r5)
            com.google.android.gms.internal.ads.nx1 r5 = new com.google.android.gms.internal.ads.nx1
            r5.<init>(r4)
            java.util.Collections.sort(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.P(com.google.android.gms.internal.ads.uu1, com.google.android.gms.internal.ads.mx1):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean Q(mx1 mx1Var) {
        j();
        kw1 kw1Var = this.D0;
        int i4 = kw1Var.f13275p.a(kw1Var.m(mx1Var)).f14451d;
        return i4 == 1 || i4 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    @Override // com.google.android.gms.internal.ads.ix1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r7 R(com.google.android.gms.internal.ads.ex1 r14, com.google.android.gms.internal.ads.mx1 r15, float r16) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.R(com.google.android.gms.internal.ads.ex1, com.google.android.gms.internal.ads.mx1, float):com.google.android.gms.internal.ads.r7");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final ps1 S(ex1 ex1Var, mx1 mx1Var, mx1 mx1Var2) {
        int i4;
        int i10;
        ps1 ps1VarD = ex1Var.d(mx1Var, mx1Var2);
        int i11 = ps1VarD.f15103e;
        if (this.G == null && Q(mx1Var2)) {
            i11 |= 32768;
        }
        if (o0(ex1Var, mx1Var2) > this.G0) {
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
    public final long T(long j, long j8) {
        long jU;
        kw1 kw1Var = this.D0;
        boolean z3 = kw1Var.r() && this.T0 != -9223372036854775807L;
        if (this.S0) {
            if (!kw1Var.k()) {
                jU = -9223372036854775807L;
            } else if (kw1Var.f13273n.k()) {
                jU = bq0.t(((pv1) kw1Var.f13273n.f232e).f15120b, kw1Var.f13277r.f9821a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = kw1Var.f13277r.f9821a.getBufferSizeInFrames();
                int iY = nn1.y(((pv1) kw1Var.f13273n.f232e).f15119a);
                mq0.c0(iY != -2147483647);
                jU = bq0.u(bufferSizeInFrames, 1000000L, iY, RoundingMode.DOWN);
            }
            if (z3 && jU != -9223372036854775807L) {
                float fMin = Math.min(jU, this.T0 - j);
                fc fcVar = kw1Var.f13281v;
                float f10 = fcVar != null ? fcVar.f11094a : 1.0f;
                this.g.getClass();
                return Math.max(10000L, ((long) ((fMin / f10) / 2.0f)) - (bq0.s(SystemClock.elapsedRealtime()) - j8));
            }
        } else if (z3 || this.f12520r0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final float U(float f10, mx1 mx1Var, mx1[] mx1VarArr) {
        int iMax = -1;
        for (mx1 mx1Var2 : mx1VarArr) {
            int i4 = mx1Var2.F;
            if (i4 != -1) {
                iMax = Math.max(iMax, i4);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void V(String str, long j, long j8) {
        g1 g1Var = this.C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new qv1(g1Var, str, j, j8));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = this.F0;
            if (hashSet.isEmpty()) {
                return;
            }
            cx1 cx1Var = this.L;
            cx1Var.getClass();
            cx1Var.b(new ArrayList(hashSet));
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void W(String str) {
        g1 g1Var = this.C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new qv1(g1Var, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void X(Exception exc) {
        ls.H("MediaCodecAudioRenderer", "Audio codec error", exc);
        g1 g1Var = this.C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new qv1(g1Var, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final ps1 Y(ce1 ce1Var) {
        mx1 mx1Var = (mx1) ce1Var.f10095c;
        mx1Var.getClass();
        this.J0 = mx1Var;
        ps1 ps1VarY = super.Y(ce1Var);
        g1 g1Var = this.C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new d1(g1Var, mx1Var, ps1VarY, 14));
        }
        return ps1VarY;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void Z(mx1 mx1Var, MediaFormat mediaFormat) throws us1 {
        int i4;
        int i10 = 24;
        int[] iArr = null;
        boolean z3 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            HashSet hashSet = this.F0;
            if (!hashSet.isEmpty()) {
                ns1 ns1Var = ns1.f14404b;
                HashMap map = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (mediaFormat.containsKey(str)) {
                        int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                        if (valueTypeForKey == 1) {
                            map.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                        } else if (valueTypeForKey == 2) {
                            map.put(str, Long.valueOf(mediaFormat.getLong(str)));
                        } else if (valueTypeForKey == 3) {
                            map.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                        } else if (valueTypeForKey == 4) {
                            map.put(str, mediaFormat.getString(str));
                        } else if (valueTypeForKey == 5) {
                            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                            if (byteBuffer == null) {
                                map.put(str, null);
                            } else {
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                byteBufferAllocate.put(byteBuffer.duplicate());
                                byteBufferAllocate.flip();
                                map.put(str, byteBufferAllocate);
                            }
                        }
                    }
                }
                ns1 ns1Var2 = new ns1(map);
                if (!ns1Var2.equals(this.L0)) {
                    this.L0 = ns1Var2;
                    g1 g1Var = this.C0;
                    Handler handler = g1Var.f11341a;
                    if (handler != null) {
                        handler.post(new uh0(i10, g1Var, ns1Var2));
                    }
                }
            }
        }
        mx1 mx1Var2 = this.M0;
        if (mx1Var2 != null) {
            mx1Var = mx1Var2;
        } else if (this.L != null) {
            mediaFormat.getClass();
            int iY = "audio/raw".equals(mx1Var.f14052m) ? mx1Var.G : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? bq0.y(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            lw1 lw1Var = new lw1();
            lw1Var.e("audio/raw");
            lw1Var.F = iY;
            lw1Var.G = mx1Var.H;
            lw1Var.H = mx1Var.I;
            lw1Var.j = mx1Var.f14050k;
            lw1Var.f13652a = mx1Var.f14042a;
            lw1Var.f13653b = mx1Var.f14043b;
            lw1Var.f13654c = x41.q(mx1Var.f14044c);
            lw1Var.f13655d = mx1Var.f14045d;
            lw1Var.f13656e = mx1Var.f14046e;
            lw1Var.f13657f = mx1Var.f14047f;
            lw1Var.D = mediaFormat.getInteger("channel-count");
            lw1Var.E = mediaFormat.getInteger("sample-rate");
            mx1 mx1Var3 = new mx1(lw1Var);
            boolean z10 = this.H0;
            int i11 = mx1Var3.E;
            if (z10 && i11 == 6 && (i4 = mx1Var.E) < 6) {
                iArr = new int[i4];
                for (int i12 = 0; i12 < i4; i12++) {
                    iArr[i12] = i12;
                }
            } else if (this.I0) {
                if (i11 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i11 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i11 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i11 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i11 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            mx1Var = mx1Var3;
        }
        try {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 29) {
                if (this.f12508f0) {
                    j();
                }
                if (i13 < 29) {
                    z3 = false;
                }
                mq0.c0(z3);
            }
            this.D0.o(mx1Var, iArr);
        } catch (rv1 e2) {
            throw k(e2, e2.f15771a, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.st1
    public final void a(fc fcVar) {
        kw1 kw1Var = this.D0;
        kw1Var.getClass();
        float f10 = fcVar.f11094a;
        String str = bq0.f9768a;
        kw1Var.f13281v = new fc(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(fcVar.f11095b, 8.0f)));
        jw1 jw1Var = new jw1(fcVar, -9223372036854775807L, -9223372036854775807L);
        if (kw1Var.k()) {
            kw1Var.f13279t = jw1Var;
        } else {
            kw1Var.f13280u = jw1Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void a0() {
        this.D0.C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    @Override // com.google.android.gms.internal.ads.gu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r9, java.lang.Object r10) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mw1.b(int, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final boolean b0(long j, long j8, cx1 cx1Var, ByteBuffer byteBuffer, int i4, int i10, int i11, long j9, boolean z3, boolean z10, mx1 mx1Var) throws us1 {
        byteBuffer.getClass();
        this.T0 = -9223372036854775807L;
        if (this.M0 != null && (i10 & 2) != 0) {
            cx1Var.getClass();
            cx1Var.p(i4);
            return true;
        }
        kw1 kw1Var = this.D0;
        if (z3) {
            if (cx1Var != null) {
                cx1Var.p(i4);
            }
            this.f12524t0.f14783f += i11;
            kw1Var.C = true;
            return true;
        }
        try {
            if (!kw1Var.q(j9, i11, byteBuffer)) {
                this.T0 = j9;
                return false;
            }
            if (cx1Var != null) {
                cx1Var.p(i4);
            }
            this.f12524t0.f14782e += i11;
            return true;
        } catch (sv1 e2) {
            mx1 mx1Var2 = this.J0;
            if (this.f12508f0) {
                j();
            }
            throw k(e2, mx1Var2, false, 5001);
        } catch (tv1 e10) {
            if (this.f12508f0) {
                j();
            }
            throw k(e10, mx1Var, e10.f16977b, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void c(long j, boolean z3, boolean z10) throws IllegalStateException {
        super.c(j, z3, z10);
        this.D0.a();
        this.N0 = j;
        this.T0 = -9223372036854775807L;
        this.Q0 = false;
        this.O0 = true;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void c0() throws IllegalStateException, us1 {
        try {
            kw1 kw1Var = this.D0;
            if (!kw1Var.J && kw1Var.k() && kw1Var.f()) {
                kw1Var.n();
                kw1Var.J = true;
            }
            long j = this.f12526u0.f12012e;
            if (j != -9223372036854775807L) {
                this.T0 = j;
            }
        } catch (tv1 e2) {
            throw k(e2, e2.f16978c, e2.f16977b, true != this.f12508f0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void d() throws IllegalStateException {
        this.D0.p();
        this.S0 = true;
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final void d0(rq1 rq1Var) {
        mx1 mx1Var;
        if (Build.VERSION.SDK_INT < 29 || (mx1Var = rq1Var.f15733c) == null || !Objects.equals(mx1Var.f14052m, "audio/opus") || !this.f12508f0) {
            return;
        }
        ByteBuffer byteBuffer = rq1Var.f15737h;
        byteBuffer.getClass();
        rq1Var.f15733c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            bw1 bw1Var = this.D0.f13277r;
            if (bw1Var != null) {
                bw1Var.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.st1
    public final long e() {
        if (this.f15088h == 2) {
            p0();
        }
        return this.N0;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void f() throws IllegalStateException {
        p0();
        this.S0 = false;
        kw1 kw1Var = this.D0;
        kw1Var.M = false;
        if (kw1Var.k()) {
            bw1 bw1Var = kw1Var.f13277r;
            dw1 dw1Var = bw1Var.f9824d;
            dw1Var.f10582k = 0L;
            dw1Var.f10591t = 0;
            dw1Var.f10590s = 0;
            dw1Var.f10583l = 0L;
            dw1Var.f10596y = -9223372036854775807L;
            dw1Var.f10597z = -9223372036854775807L;
            if (dw1Var.f10592u == -9223372036854775807L) {
                dw1Var.f10580h.a(0);
            }
            dw1Var.f10594w = dw1Var.d();
            if (!bw1Var.f9828i || bw1Var.b()) {
                bw1Var.f9821a.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.pr1
    public final void g() {
        g1 g1Var = this.C0;
        this.P0 = true;
        this.J0 = null;
        this.T0 = -9223372036854775807L;
        try {
            try {
                this.D0.a();
                super.g();
                os1 os1Var = this.f12524t0;
                g1Var.getClass();
                synchronized (os1Var) {
                }
                Handler handler = g1Var.f11341a;
                if (handler != null) {
                    handler.post(new uh0(25, g1Var, os1Var));
                }
            } catch (Throwable th2) {
                super.g();
                g1Var.b(this.f12524t0);
                throw th2;
            }
        } catch (Throwable th3) {
            g1Var.b(this.f12524t0);
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void h() throws IllegalStateException {
        kw1 kw1Var = this.D0;
        this.Q0 = false;
        this.T0 = -9223372036854775807L;
        try {
            try {
                this.f12508f0 = false;
                e0();
                D();
                if (this.P0) {
                    this.P0 = false;
                    kw1Var.b();
                }
            } finally {
                this.G = null;
            }
        } catch (Throwable th2) {
            if (this.P0) {
                this.P0 = false;
                kw1Var.b();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void i() {
        bx1 bx1Var;
        cw1 cw1Var = this.D0.f13275p;
        yf0 yf0Var = cw1Var.f10236c;
        if (yf0Var != null) {
            yf0Var.e();
        }
        xi0 xi0Var = cw1Var.f10239f;
        if (xi0Var != null && xi0Var.f18393b) {
            xi0Var.f18398h = null;
            Context context = (Context) xi0Var.f18392a;
            jz.d(context).unregisterAudioDeviceCallback((fv1) xi0Var.f18396e);
            context.unregisterReceiver((kf) xi0Var.f18397f);
            gv1 gv1Var = (gv1) xi0Var.g;
            if (gv1Var != null) {
                gv1Var.f11616a.unregisterContentObserver(gv1Var);
            }
            xi0Var.f18393b = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (bx1Var = this.E0) == null) {
            return;
        }
        bx1Var.s();
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final String m() {
        return "MediaCodecAudioRenderer";
    }

    public final int o0(ex1 ex1Var, mx1 mx1Var) {
        if ("OMX.google.raw.decoder".equals(ex1Var.f10904a) && Build.VERSION.SDK_INT == 23 && !bq0.h(this.B0)) {
            return -1;
        }
        return mx1Var.f14053n;
    }

    public final void p0() {
        long j;
        long jMax;
        ArrayDeque arrayDeque;
        long j8;
        s();
        kw1 kw1Var = this.D0;
        av0 av0Var = kw1Var.W;
        if (!kw1Var.k() || kw1Var.D) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(kw1Var.f13277r.f9824d.a(), bq0.t(((pv1) kw1Var.f13273n.f232e).f15120b, kw1Var.l()));
            while (true) {
                arrayDeque = kw1Var.g;
                if (arrayDeque.isEmpty() || jMin < ((jw1) arrayDeque.getFirst()).f12858c) {
                    break;
                } else {
                    kw1Var.f13280u = (jw1) arrayDeque.remove();
                }
            }
            jw1 jw1Var = kw1Var.f13280u;
            long jU = jMin - jw1Var.f12858c;
            long jW = bq0.w(jU, jw1Var.f12856a.f11094a);
            if (arrayDeque.isEmpty()) {
                t30 t30Var = (t30) av0Var.f9424d;
                if (t30Var.zzc()) {
                    if (t30Var.f16692n >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                        long j9 = t30Var.f16691m;
                        t30Var.j.getClass();
                        long jB = j9 - (r10.f13358i.b() * (r10.j * r10.f13352b));
                        int i4 = t30Var.f16687h.f12558a;
                        int i10 = t30Var.g.f12558a;
                        if (i4 == i10) {
                            jU = bq0.u(jU, jB, t30Var.f16692n, RoundingMode.DOWN);
                            j = Long.MIN_VALUE;
                        } else {
                            j = Long.MIN_VALUE;
                            jU = bq0.u(jU, jB * i4, t30Var.f16692n * i10, RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        jU = (long) (t30Var.f16683c * jU);
                    }
                    jw1 jw1Var2 = kw1Var.f13280u;
                    j8 = jw1Var2.f12857b + jU;
                    jw1Var2.f12859d = jU - jW;
                } else {
                    j = Long.MIN_VALUE;
                    jw1 jw1Var22 = kw1Var.f13280u;
                    j8 = jw1Var22.f12857b + jU;
                    jw1Var22.f12859d = jU - jW;
                }
            } else {
                j = Long.MIN_VALUE;
                jw1 jw1Var3 = kw1Var.f13280u;
                j8 = jw1Var3.f12857b + jW + jw1Var3.f12859d;
            }
            long j10 = ((nw1) av0Var.f9423c).f14454l;
            jMax = bq0.t(((pv1) kw1Var.f13273n.f232e).f15120b, j10) + j8;
            long j11 = kw1Var.T;
            if (j10 > j11) {
                long jT = bq0.t(((pv1) kw1Var.f13273n.f232e).f15120b, j10 - j11);
                kw1Var.T = j10;
                kw1Var.U += jT;
                if (kw1Var.V == null) {
                    kw1Var.V = new Handler(Looper.myLooper());
                }
                kw1Var.V.removeCallbacksAndMessages(null);
                kw1Var.V.postDelayed(new du0(17, kw1Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.O0) {
                jMax = Math.max(this.N0, jMax);
            }
            this.N0 = jMax;
            this.O0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final boolean r() {
        return this.D0.r();
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final boolean s() {
        if (!this.f12520r0) {
            return false;
        }
        kw1 kw1Var = this.D0;
        if (kw1Var.k()) {
            return kw1Var.J && !kw1Var.r();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final void z(boolean z3, boolean z10) {
        os1 os1Var = new os1();
        this.f12524t0 = os1Var;
        g1 g1Var = this.C0;
        Handler handler = g1Var.f11341a;
        if (handler != null) {
            handler.post(new qv1(g1Var, os1Var, 8));
        }
        j();
        cv1 cv1Var = this.f15087f;
        cv1Var.getClass();
        kw1 kw1Var = this.D0;
        kw1Var.f13270k = cv1Var;
        w5 w5Var = this.g;
        w5Var.getClass();
        kw1Var.f13275p.f10237d = w5Var;
    }

    @Override // com.google.android.gms.internal.ads.st1
    public final boolean z1() {
        boolean z3 = this.Q0;
        this.Q0 = false;
        return z3;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final st1 x() {
        return this;
    }
}
