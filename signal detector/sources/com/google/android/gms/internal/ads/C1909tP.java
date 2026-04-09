package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1909tP extends PP implements InterfaceC1099eO {

    /* renamed from: P0, reason: collision with root package name */
    public final Context f16909P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final Vu f16910Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final C1801rP f16911R0;

    /* renamed from: S0, reason: collision with root package name */
    public final C1879sw f16912S0;

    /* renamed from: T0, reason: collision with root package name */
    public final HashSet f16913T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f16914U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f16915V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f16916W0;

    /* renamed from: X0, reason: collision with root package name */
    public TP f16917X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final AN f16918Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public AN f16919Z0;

    /* renamed from: a1, reason: collision with root package name */
    public TP f16920a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f16921b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f16922c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f16923d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f16924e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f16925f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f16926g1;

    /* renamed from: h1, reason: collision with root package name */
    public long f16927h1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1909tP(Context context, C2181ya c2181ya, Handler handler, NN nn, C1801rP c1801rP) {
        EO eo = EO.f7955h;
        C1879sw c1879sw = Build.VERSION.SDK_INT >= 35 ? new C1879sw(12) : null;
        super(1, c2181ya, eo, 44100.0f);
        this.f16909P0 = context.getApplicationContext();
        this.f16911R0 = c1801rP;
        this.f16912S0 = c1879sw;
        this.f16925f1 = -1000;
        this.f16910Q0 = new Vu(handler, nn);
        this.f16927h1 = -9223372036854775807L;
        c1801rP.f16551l = new C1014cu(13, this);
        this.f16913T0 = new HashSet();
        AN an = AN.f6982b;
        this.f16918Y0 = an;
        this.f16919Z0 = an;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J(com.google.android.gms.internal.ads.EO r13, com.google.android.gms.internal.ads.TP r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1909tP.J(com.google.android.gms.internal.ads.EO, com.google.android.gms.internal.ads.TP):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList L(com.google.android.gms.internal.ads.EO r4, com.google.android.gms.internal.ads.TP r5) {
        /*
            r3 = this;
            java.lang.String r0 = r5.f11397m
            if (r0 != 0) goto L7
            com.google.android.gms.internal.ads.gC r4 = com.google.android.gms.internal.ads.C1197gC.f14227e
            goto L3c
        L7:
            com.google.android.gms.internal.ads.rP r0 = r3.f16911R0
            K4.c r1 = r0.f16555p
            com.google.android.gms.internal.ads.VO r0 = r0.m(r5)
            com.google.android.gms.internal.ads.XO r0 = r1.n(r0)
            int r0 = r0.f12421d
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1d
            r1 = 2
            if (r0 == r1) goto L1d
            goto L38
        L1d:
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = com.google.android.gms.internal.ads.WP.a(r0, r2, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            r0 = 0
            goto L31
        L2b:
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.LP r0 = (com.google.android.gms.internal.ads.LP) r0
        L31:
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.gC r4 = com.google.android.gms.internal.ads.LB.i(r0)
            goto L3c
        L38:
            com.google.android.gms.internal.ads.gC r4 = com.google.android.gms.internal.ads.WP.b(r4, r5, r2, r2)
        L3c:
            java.util.HashMap r0 = com.google.android.gms.internal.ads.WP.f12225a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            com.google.android.gms.internal.ads.cu r4 = new com.google.android.gms.internal.ads.cu
            r1 = 14
            r4.<init>(r1, r5)
            com.google.android.gms.internal.ads.UP r5 = new com.google.android.gms.internal.ads.UP
            r5.<init>(r4)
            java.util.Collections.sort(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1909tP.L(com.google.android.gms.internal.ads.EO, com.google.android.gms.internal.ads.TP):java.util.ArrayList");
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean M(TP tp) {
        l();
        C1801rP c1801rP = this.f16911R0;
        int i = c1801rP.f16555p.n(c1801rP.m(tp)).f12421d;
        return i == 1 || i == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    @Override // com.google.android.gms.internal.ads.PP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1726q3 N(com.google.android.gms.internal.ads.LP r14, com.google.android.gms.internal.ads.TP r15, float r16) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1909tP.N(com.google.android.gms.internal.ads.LP, com.google.android.gms.internal.ads.TP, float):com.google.android.gms.internal.ads.q3");
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final CN O(LP lp, TP tp, TP tp2) {
        int i;
        int i3;
        CN cnD = lp.d(tp, tp2);
        int i6 = cnD.f7586e;
        if (this.f10390U == null && M(tp2)) {
            i6 |= 32768;
        }
        if (q0(lp, tp2) > this.f16914U0) {
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
    public final long P(long j6, long j7) {
        long jU;
        C1801rP c1801rP = this.f16911R0;
        boolean z6 = c1801rP.r() && this.f16927h1 != -9223372036854775807L;
        if (this.f16926g1) {
            if (!c1801rP.k()) {
                jU = -9223372036854775807L;
            } else if (c1801rP.f16553n.k()) {
                jU = Vt.t(((ZO) c1801rP.f16553n.f11473e).f12883b, c1801rP.f16557r.f15149a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c1801rP.f16557r.f15149a.getBufferSizeInFrames();
                int iH = AbstractC2022vd.H(((ZO) c1801rP.f16553n.f11473e).f12882a);
                AbstractC0582Jp.h0(iH != -2147483647);
                jU = Vt.u(bufferSizeInFrames, 1000000L, iH, RoundingMode.DOWN);
            }
            if (z6 && jU != -9223372036854775807L) {
                float fMin = Math.min(jU, this.f16927h1 - j6);
                C2159y5 c2159y5 = c1801rP.f16561v;
                float f2 = c2159y5 != null ? c2159y5.f17679a : 1.0f;
                this.f10407g.getClass();
                return Math.max(10000L, ((long) ((fMin / f2) / 2.0f)) - (Vt.s(SystemClock.elapsedRealtime()) - j7));
            }
        } else if (z6 || this.f10368F0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final float Q(float f2, TP tp, TP[] tpArr) {
        int iMax = -1;
        for (TP tp2 : tpArr) {
            int i = tp2.f11379F;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f2;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void R(long j6, long j7, String str) {
        Vu vu = this.f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0882aP(vu, str, j6, j7));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            HashSet hashSet = this.f16913T0;
            if (hashSet.isEmpty()) {
                return;
            }
            JP jp = this.f10395Z;
            jp.getClass();
            jp.f(new ArrayList(hashSet));
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void S(String str) {
        Vu vu = this.f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0882aP(vu, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void T(Exception exc) {
        AbstractC2022vd.K("MediaCodecAudioRenderer", "Audio codec error", exc);
        Vu vu = this.f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0882aP(vu, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final CN U(C1879sw c1879sw) {
        TP tp = (TP) c1879sw.f16824c;
        tp.getClass();
        this.f16917X0 = tp;
        CN cnU = super.U(c1879sw);
        Vu vu = this.f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0912b0(vu, tp, cnU, 14));
        }
        return cnU;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void V(TP tp, MediaFormat mediaFormat) throws HN {
        int i;
        int[] iArr = null;
        boolean z6 = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            HashSet hashSet = this.f16913T0;
            if (!hashSet.isEmpty()) {
                AN an = AN.f6982b;
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
                AN an2 = new AN(map);
                if (!an2.equals(this.f16919Z0)) {
                    this.f16919Z0 = an2;
                    Vu vu = this.f16910Q0;
                    Handler handler = (Handler) vu.f12105a;
                    if (handler != null) {
                        handler.post(new RunnableC0786Vp(vu, 25, an2));
                    }
                }
            }
        }
        TP tp2 = this.f16920a1;
        if (tp2 != null) {
            tp = tp2;
        } else if (this.f10395Z != null) {
            mediaFormat.getClass();
            int iY = "audio/raw".equals(tp.f11397m) ? tp.f11380G : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? Vt.y(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            C1855sP c1855sP = new C1855sP();
            c1855sP.e("audio/raw");
            c1855sP.f16716F = iY;
            c1855sP.f16717G = tp.f11381H;
            c1855sP.f16718H = tp.f11382I;
            c1855sP.f16730j = tp.f11395k;
            c1855sP.f16722a = tp.f11386a;
            c1855sP.f16723b = tp.f11387b;
            c1855sP.f16724c = LB.m(tp.f11388c);
            c1855sP.f16725d = tp.f11389d;
            c1855sP.f16726e = tp.f11390e;
            c1855sP.f16727f = tp.f11391f;
            c1855sP.f16714D = mediaFormat.getInteger("channel-count");
            c1855sP.f16715E = mediaFormat.getInteger("sample-rate");
            TP tp3 = new TP(c1855sP);
            boolean z7 = this.f16915V0;
            int i3 = tp3.f11378E;
            if (z7 && i3 == 6 && (i = tp.f11378E) < 6) {
                iArr = new int[i];
                for (int i6 = 0; i6 < i; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.f16916W0) {
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            tp = tp3;
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29) {
                if (this.f10427t0) {
                    l();
                }
                if (i7 < 29) {
                    z6 = false;
                }
                AbstractC0582Jp.h0(z6);
            }
            this.f16911R0.o(tp, iArr);
        } catch (C0937bP e6) {
            throw m(e6, e6.f13376a, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void W() {
        this.f16911R0.f16521C = true;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean X(long j6, long j7, JP jp, ByteBuffer byteBuffer, int i, int i3, int i6, long j8, boolean z6, boolean z7, TP tp) throws HN {
        byteBuffer.getClass();
        this.f16927h1 = -9223372036854775807L;
        if (this.f16920a1 != null && (i3 & 2) != 0) {
            jp.getClass();
            jp.E(i);
            return true;
        }
        C1801rP c1801rP = this.f16911R0;
        if (z6) {
            if (jp != null) {
                jp.E(i);
            }
            this.f10372H0.f7337f += i6;
            c1801rP.f16521C = true;
            return true;
        }
        try {
            if (!c1801rP.q(j8, i6, byteBuffer)) {
                this.f16927h1 = j8;
                return false;
            }
            if (jp != null) {
                jp.E(i);
            }
            this.f10372H0.f7336e += i6;
            return true;
        } catch (C0991cP e6) {
            TP tp2 = this.f16917X0;
            if (this.f10427t0) {
                l();
            }
            throw m(e6, tp2, false, 5001);
        } catch (C1046dP e7) {
            if (this.f10427t0) {
                l();
            }
            throw m(e7, tp, e7.f13762b, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void Y() throws IllegalStateException, HN {
        try {
            C1801rP c1801rP = this.f16911R0;
            if (!c1801rP.f16528J && c1801rP.k() && c1801rP.f()) {
                c1801rP.n();
                c1801rP.f16528J = true;
            }
            long j6 = this.f10374I0.f10198e;
            if (j6 != -9223372036854775807L) {
                this.f16927h1 = j6;
            }
        } catch (C1046dP e6) {
            throw m(e6, e6.f13763c, e6.f13762b, true != this.f10427t0 ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void Z(FM fm) {
        TP tp;
        if (Build.VERSION.SDK_INT < 29 || (tp = fm.f8091c) == null || !Objects.equals(tp.f11397m, "audio/opus") || !this.f10427t0) {
            return;
        }
        ByteBuffer byteBuffer = fm.f8096h;
        byteBuffer.getClass();
        fm.f8091c.getClass();
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            C1424kP c1424kP = this.f16911R0.f16557r;
            if (c1424kP != null) {
                c1424kP.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void a(long j6, boolean z6, boolean z7) throws IllegalStateException {
        super.a(j6, z6, z7);
        this.f16911R0.a();
        this.f16921b1 = j6;
        this.f16927h1 = -9223372036854775807L;
        this.f16924e1 = false;
        this.f16922c1 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final void b(C2159y5 c2159y5) {
        C1801rP c1801rP = this.f16911R0;
        c1801rP.getClass();
        float f2 = c2159y5.f17679a;
        String str = Vt.f12096a;
        c1801rP.f16561v = new C2159y5(Math.max(0.1f, Math.min(f2, 8.0f)), Math.max(0.1f, Math.min(c2159y5.f17680b, 8.0f)));
        C1748qP c1748qP = new C1748qP(c2159y5, -9223372036854775807L, -9223372036854775807L);
        if (c1801rP.k()) {
            c1801rP.f16559t = c1748qP;
        } else {
            c1801rP.f16560u = c1748qP;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1854sO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r9, java.lang.Object r10) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1909tP.c(int, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void d() throws IllegalStateException {
        this.f16911R0.p();
        this.f16926g1 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final long e() {
        if (this.f10409h == 2) {
            r0();
        }
        return this.f16921b1;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void f() throws IllegalStateException {
        r0();
        this.f16926g1 = false;
        C1801rP c1801rP = this.f16911R0;
        c1801rP.M = false;
        if (c1801rP.k()) {
            C1424kP c1424kP = c1801rP.f16557r;
            C1478lP c1478lP = c1424kP.f15152d;
            c1478lP.f15395k = 0L;
            c1478lP.f15404t = 0;
            c1478lP.f15403s = 0;
            c1478lP.f15396l = 0L;
            c1478lP.f15409y = -9223372036854775807L;
            c1478lP.f15410z = -9223372036854775807L;
            if (c1478lP.f15405u == -9223372036854775807L) {
                c1478lP.f15393h.a(0);
            }
            c1478lP.f15407w = c1478lP.d();
            if (!c1424kP.i || c1424kP.b()) {
                c1424kP.f15149a.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final boolean g() {
        boolean z6 = this.f16924e1;
        this.f16924e1 = false;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public final C2159y5 h() {
        return this.f16911R0.f16561v;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void i() {
        Vu vu = this.f16910Q0;
        this.f16923d1 = true;
        this.f16917X0 = null;
        this.f16927h1 = -9223372036854775807L;
        try {
            try {
                this.f16911R0.a();
                super.i();
                BN bn = this.f10372H0;
                vu.getClass();
                synchronized (bn) {
                }
                Handler handler = (Handler) vu.f12105a;
                if (handler != null) {
                    handler.post(new RunnableC0786Vp(vu, 26, bn));
                }
            } catch (Throwable th) {
                super.i();
                vu.J(this.f10372H0);
                throw th;
            }
        } catch (Throwable th2) {
            vu.J(this.f10372H0);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void j() throws IllegalStateException {
        C1801rP c1801rP = this.f16911R0;
        this.f16924e1 = false;
        this.f16927h1 = -9223372036854775807L;
        try {
            try {
                this.f10427t0 = false;
                a0();
                x();
                if (this.f16923d1) {
                    this.f16923d1 = false;
                    c1801rP.b();
                }
            } finally {
                this.f10390U = null;
            }
        } catch (Throwable th) {
            if (this.f16923d1) {
                this.f16923d1 = false;
                c1801rP.b();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void k() {
        C1879sw c1879sw;
        K4.c cVar = this.f16911R0.f16555p;
        C1009cp c1009cp = (C1009cp) cVar.f2210c;
        if (c1009cp != null) {
            c1009cp.e();
        }
        C0447Bq c0447Bq = (C0447Bq) cVar.f2215h;
        if (c0447Bq != null && c0447Bq.f7445a) {
            c0447Bq.f7452h = null;
            Context context = (Context) c0447Bq.f7446b;
            AbstractC0709Rg.b(context).unregisterAudioDeviceCallback((PO) c0447Bq.f7449e);
            context.unregisterReceiver((A1.t) c0447Bq.f7450f);
            QO qo = (QO) c0447Bq.f7451g;
            if (qo != null) {
                qo.f10613a.unregisterContentObserver(qo);
            }
            c0447Bq.f7445a = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (c1879sw = this.f16912S0) == null) {
            return;
        }
        ((HashSet) c1879sw.f16823b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c1879sw.f16824c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final InterfaceC1099eO m0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final String o() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final void o0(boolean z6, boolean z7) {
        BN bn = new BN();
        this.f10372H0 = bn;
        Vu vu = this.f16910Q0;
        Handler handler = (Handler) vu.f12105a;
        if (handler != null) {
            handler.post(new RunnableC0882aP(vu, bn, 8));
        }
        l();
        MO mo = this.f10405f;
        mo.getClass();
        C1801rP c1801rP = this.f16911R0;
        c1801rP.f16550k = mo;
        C1994v2 c1994v2 = this.f10407g;
        c1994v2.getClass();
        c1801rP.f16555p.f2213f = c1994v2;
    }

    public final int q0(LP lp, TP tp) {
        if ("OMX.google.raw.decoder".equals(lp.f9690a) && Build.VERSION.SDK_INT == 23 && !Vt.h(this.f16909P0)) {
            return -1;
        }
        return tp.f11398n;
    }

    public final void r0() {
        long j6;
        long jMax;
        ArrayDeque arrayDeque;
        long j7;
        u();
        C1801rP c1801rP = this.f16911R0;
        C2041vw c2041vw = c1801rP.f16540W;
        if (!c1801rP.k() || c1801rP.f16522D) {
            j6 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(c1801rP.f16557r.f15152d.a(), Vt.t(((ZO) c1801rP.f16553n.f11473e).f12883b, c1801rP.l()));
            while (true) {
                arrayDeque = c1801rP.f16547g;
                if (arrayDeque.isEmpty() || jMin < ((C1748qP) arrayDeque.getFirst()).f16372c) {
                    break;
                } else {
                    c1801rP.f16560u = (C1748qP) arrayDeque.remove();
                }
            }
            C1748qP c1748qP = c1801rP.f16560u;
            long jU = jMin - c1748qP.f16372c;
            long jW = Vt.w(jU, c1748qP.f16370a.f17679a);
            if (arrayDeque.isEmpty()) {
                C0813Xi c0813Xi = (C0813Xi) c2041vw.f17371d;
                if (c0813Xi.f()) {
                    if (c0813Xi.f12448n >= 1024) {
                        long j8 = c0813Xi.f12447m;
                        c0813Xi.f12444j.getClass();
                        long jA = j8 - (r10.i.a() * (r10.f10474j * r10.f10467b));
                        int i = c0813Xi.f12443h.f16197a;
                        int i3 = c0813Xi.f12442g.f16197a;
                        if (i == i3) {
                            jU = Vt.u(jU, jA, c0813Xi.f12448n, RoundingMode.DOWN);
                            j6 = Long.MIN_VALUE;
                        } else {
                            j6 = Long.MIN_VALUE;
                            jU = Vt.u(jU, jA * i, c0813Xi.f12448n * i3, RoundingMode.DOWN);
                        }
                    } else {
                        j6 = Long.MIN_VALUE;
                        jU = (long) (c0813Xi.f12438c * jU);
                    }
                    C1748qP c1748qP2 = c1801rP.f16560u;
                    j7 = c1748qP2.f16371b + jU;
                    c1748qP2.f16373d = jU - jW;
                } else {
                    j6 = Long.MIN_VALUE;
                    C1748qP c1748qP22 = c1801rP.f16560u;
                    j7 = c1748qP22.f16371b + jU;
                    c1748qP22.f16373d = jU - jW;
                }
            } else {
                j6 = Long.MIN_VALUE;
                C1748qP c1748qP3 = c1801rP.f16560u;
                j7 = c1748qP3.f16371b + jW + c1748qP3.f16373d;
            }
            long j9 = ((C1963uP) c2041vw.f17370c).f17120l;
            jMax = Vt.t(((ZO) c1801rP.f16553n.f11473e).f12883b, j9) + j7;
            long j10 = c1801rP.f16537T;
            if (j9 > j10) {
                long jT = Vt.t(((ZO) c1801rP.f16553n.f11473e).f12883b, j9 - j10);
                c1801rP.f16537T = j9;
                c1801rP.f16538U += jT;
                if (c1801rP.f16539V == null) {
                    c1801rP.f16539V = new Handler(Looper.myLooper());
                }
                c1801rP.f16539V.removeCallbacksAndMessages(null);
                c1801rP.f16539V.postDelayed(new Fu(18, c1801rP), 100L);
            }
        }
        if (jMax != j6) {
            if (!this.f16922c1) {
                jMax = Math.max(this.f16921b1, jMax);
            }
            this.f16921b1 = jMax;
            this.f16922c1 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean t() {
        return this.f16911R0.r();
    }

    @Override // com.google.android.gms.internal.ads.PP
    public final boolean u() {
        if (!this.f10368F0) {
            return false;
        }
        C1801rP c1801rP = this.f16911R0;
        if (c1801rP.k()) {
            return c1801rP.f16528J && !c1801rP.r();
        }
        return true;
    }
}
