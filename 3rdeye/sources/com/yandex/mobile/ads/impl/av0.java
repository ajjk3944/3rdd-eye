package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.uu0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class av0 extends mk {
    private static final bv0 F0 = hm1.f();

    /* renamed from: G0, reason: collision with root package name */
    private static final byte[] f24852G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final long[] f24853A;

    /* renamed from: A0, reason: collision with root package name */
    private h60 f24854A0;

    /* renamed from: B, reason: collision with root package name */
    private dc0 f24855B;

    /* renamed from: B0, reason: collision with root package name */
    protected ky f24856B0;

    /* renamed from: C, reason: collision with root package name */
    private dc0 f24857C;

    /* renamed from: C0, reason: collision with root package name */
    private long f24858C0;

    /* renamed from: D, reason: collision with root package name */
    private b40 f24859D;

    /* renamed from: D0, reason: collision with root package name */
    private long f24860D0;

    /* renamed from: E, reason: collision with root package name */
    private b40 f24861E;

    /* renamed from: E0, reason: collision with root package name */
    private int f24862E0;

    /* renamed from: F, reason: collision with root package name */
    private MediaCrypto f24863F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f24864G;

    /* renamed from: H, reason: collision with root package name */
    private long f24865H;

    /* renamed from: I, reason: collision with root package name */
    private float f24866I;

    /* renamed from: J, reason: collision with root package name */
    private float f24867J;

    /* renamed from: K, reason: collision with root package name */
    private uu0 f24868K;

    /* renamed from: L, reason: collision with root package name */
    private dc0 f24869L;

    /* renamed from: M, reason: collision with root package name */
    private MediaFormat f24870M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f24871N;

    /* renamed from: O, reason: collision with root package name */
    private float f24872O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayDeque<yu0> f24873P;

    /* renamed from: Q, reason: collision with root package name */
    private b f24874Q;

    /* renamed from: R, reason: collision with root package name */
    private yu0 f24875R;

    /* renamed from: S, reason: collision with root package name */
    private int f24876S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f24877T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f24878U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f24879V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f24880W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f24881X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f24882Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f24883Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f24884a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f24885b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f24886c0;

    /* renamed from: d0, reason: collision with root package name */
    private km f24887d0;

    /* renamed from: e0, reason: collision with root package name */
    private long f24888e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f24889f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f24890g0;

    /* renamed from: h0, reason: collision with root package name */
    private ByteBuffer f24891h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f24892i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f24893j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f24894k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f24895l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f24896m0;

    /* renamed from: n, reason: collision with root package name */
    private final uu0.b f24897n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f24898n0;

    /* renamed from: o, reason: collision with root package name */
    private final cv0 f24899o;

    /* renamed from: o0, reason: collision with root package name */
    private int f24900o0;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f24901p;

    /* renamed from: p0, reason: collision with root package name */
    private int f24902p0;

    /* renamed from: q, reason: collision with root package name */
    private final float f24903q;

    /* renamed from: q0, reason: collision with root package name */
    private int f24904q0;

    /* renamed from: r, reason: collision with root package name */
    private final my f24905r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f24906r0;

    /* renamed from: s, reason: collision with root package name */
    private final my f24907s;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f24908s0;

    /* renamed from: t, reason: collision with root package name */
    private final my f24909t;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f24910t0;

    /* renamed from: u, reason: collision with root package name */
    private final tk f24911u;

    /* renamed from: u0, reason: collision with root package name */
    private long f24912u0;

    /* renamed from: v, reason: collision with root package name */
    private final u42<dc0> f24913v;

    /* renamed from: v0, reason: collision with root package name */
    private long f24914v0;

    /* renamed from: w, reason: collision with root package name */
    private final ArrayList<Long> f24915w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f24916w0;

    /* renamed from: x, reason: collision with root package name */
    private final MediaCodec.BufferInfo f24917x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f24918x0;

    /* renamed from: y, reason: collision with root package name */
    private final long[] f24919y;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f24920y0;

    /* renamed from: z, reason: collision with root package name */
    private final long[] f24921z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f24922z0;

    public static final class a {
        public static void a(uu0.a aVar, gi1 gi1Var) {
            LogSessionId logSessionIdA = gi1Var.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f34221b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public static class b extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f24923b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24924c;

        /* renamed from: d, reason: collision with root package name */
        public final yu0 f24925d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24926e;

        public /* synthetic */ b(String str, Throwable th, String str2, boolean z10, yu0 yu0Var, String str3, int i) {
            this(str, th, str2, z10, yu0Var, str3);
        }

        private static String a(int i) {
            return "com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        public b(int i, dc0 dc0Var, gv0.b bVar, boolean z10) {
            this("Decoder init failed: [" + i + "], " + dc0Var, bVar, dc0Var.f26083m, z10, null, a(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String a(Exception exc) {
            if (exc instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
            }
            return null;
        }

        private b(String str, Throwable th, String str2, boolean z10, yu0 yu0Var, String str3) {
            super(str, th);
            this.f24923b = str2;
            this.f24924c = z10;
            this.f24925d = yu0Var;
            this.f24926e = str3;
        }
    }

    public av0(int i, a00 a00Var, cv0 cv0Var, float f10) {
        super(i);
        this.f24897n = a00Var;
        this.f24899o = (cv0) zf.a(cv0Var);
        this.f24901p = false;
        this.f24903q = f10;
        this.f24905r = my.j();
        this.f24907s = new my(0);
        this.f24909t = new my(2);
        tk tkVar = new tk();
        this.f24911u = tkVar;
        this.f24913v = new u42<>();
        this.f24915w = new ArrayList<>();
        this.f24917x = new MediaCodec.BufferInfo();
        this.f24866I = 1.0f;
        this.f24867J = 1.0f;
        this.f24865H = -9223372036854775807L;
        this.f24919y = new long[10];
        this.f24921z = new long[10];
        this.f24853A = new long[10];
        this.f24858C0 = -9223372036854775807L;
        this.f24860D0 = -9223372036854775807L;
        tkVar.e(0);
        tkVar.f30572d.order(ByteOrder.nativeOrder());
        this.f24872O = -1.0f;
        this.f24876S = 0;
        this.f24900o0 = 0;
        this.f24889f0 = -1;
        this.f24890g0 = -1;
        this.f24888e0 = -9223372036854775807L;
        this.f24912u0 = -9223372036854775807L;
        this.f24914v0 = -9223372036854775807L;
        this.f24902p0 = 0;
        this.f24904q0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.av0.A():boolean");
    }

    private void B() {
        try {
            this.f24868K.flush();
        } finally {
            P();
        }
    }

    @TargetApi(23)
    private void M() throws Exception {
        int i = this.f24904q0;
        if (i == 1) {
            B();
            return;
        }
        if (i == 2) {
            B();
            S();
        } else if (i != 3) {
            this.f24918x0 = true;
            O();
        } else {
            N();
            K();
        }
    }

    private void S() throws MediaCryptoException, h60 {
        try {
            this.f24863F.setMediaDrmSession(a(this.f24861E).f29970b);
            b40 b40Var = this.f24861E;
            F.b(this.f24859D, b40Var);
            this.f24859D = b40Var;
            this.f24902p0 = 0;
            this.f24904q0 = 0;
        } catch (MediaCryptoException e4) {
            throw a(e4, this.f24855B, 6006);
        }
    }

    private boolean c(long j4, long j10) throws Exception {
        boolean z10;
        boolean zA;
        int iA;
        boolean z11;
        if (this.f24890g0 < 0) {
            if (this.f24881X && this.f24908s0) {
                try {
                    iA = this.f24868K.a(this.f24917x);
                } catch (IllegalStateException unused) {
                    M();
                    if (this.f24918x0) {
                        N();
                    }
                    return false;
                }
            } else {
                iA = this.f24868K.a(this.f24917x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f24886c0 && (this.f24916w0 || this.f24902p0 == 2)) {
                        M();
                    }
                    return false;
                }
                this.f24910t0 = true;
                MediaFormat mediaFormatA = this.f24868K.a();
                if (this.f24876S != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.f24885b0 = true;
                } else {
                    if (this.f24883Z) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.f24870M = mediaFormatA;
                    this.f24871N = true;
                }
                return true;
            }
            if (this.f24885b0) {
                this.f24885b0 = false;
                this.f24868K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f24917x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                M();
                return false;
            }
            this.f24890g0 = iA;
            ByteBuffer byteBufferC = this.f24868K.c(iA);
            this.f24891h0 = byteBufferC;
            if (byteBufferC != null) {
                byteBufferC.position(this.f24917x.offset);
                ByteBuffer byteBuffer = this.f24891h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f24917x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f24882Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f24917x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j11 = this.f24912u0;
                    if (j11 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j11;
                    }
                }
            }
            long j12 = this.f24917x.presentationTimeUs;
            int size = this.f24915w.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z11 = false;
                    break;
                }
                if (this.f24915w.get(i).longValue() == j12) {
                    this.f24915w.remove(i);
                    z11 = true;
                    break;
                }
                i++;
            }
            this.f24892i0 = z11;
            long j13 = this.f24914v0;
            long j14 = this.f24917x.presentationTimeUs;
            this.f24893j0 = j13 == j14;
            d(j14);
        }
        if (this.f24881X && this.f24908s0) {
            try {
                uu0 uu0Var = this.f24868K;
                ByteBuffer byteBuffer2 = this.f24891h0;
                int i10 = this.f24890g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f24917x;
                z10 = false;
                try {
                    zA = a(j4, j10, uu0Var, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f24892i0, this.f24893j0, this.f24857C);
                } catch (IllegalStateException unused2) {
                    M();
                    if (this.f24918x0) {
                        N();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            uu0 uu0Var2 = this.f24868K;
            ByteBuffer byteBuffer3 = this.f24891h0;
            int i11 = this.f24890g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f24917x;
            zA = a(j4, j10, uu0Var2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f24892i0, this.f24893j0, this.f24857C);
        }
        if (zA) {
            c(this.f24917x.presentationTimeUs);
            boolean z12 = (this.f24917x.flags & 4) != 0 ? true : z10;
            this.f24890g0 = -1;
            this.f24891h0 = null;
            if (!z12) {
                return true;
            }
            M();
        }
        return z10;
    }

    private void y() throws h60 {
        if (this.f24916w0) {
            throw new IllegalStateException();
        }
        ec0 ec0VarQ = q();
        this.f24909t.b();
        do {
            this.f24909t.b();
            int iA = a(ec0VarQ, this.f24909t, 0);
            if (iA == -5) {
                a(ec0VarQ);
                return;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f24909t.f()) {
                    this.f24916w0 = true;
                    return;
                }
                if (this.f24920y0) {
                    dc0 dc0Var = this.f24855B;
                    dc0Var.getClass();
                    this.f24857C = dc0Var;
                    a(dc0Var, (MediaFormat) null);
                    this.f24920y0 = false;
                }
                this.f24909t.h();
            }
        } while (this.f24911u.a(this.f24909t));
        this.f24895l0 = true;
    }

    @TargetApi(23)
    private boolean z() throws MediaCryptoException, h60 {
        if (this.f24906r0) {
            this.f24902p0 = 1;
            if (this.f24878U || this.f24880W) {
                this.f24904q0 = 3;
                return false;
            }
            this.f24904q0 = 2;
        } else {
            S();
        }
        return true;
    }

    public final void C() throws Exception {
        if (D()) {
            K();
        }
    }

    public final boolean D() throws MediaCryptoException {
        if (this.f24868K == null) {
            return false;
        }
        int i = this.f24904q0;
        if (i == 3 || this.f24878U || ((this.f24879V && !this.f24910t0) || (this.f24880W && this.f24908s0))) {
            N();
            return true;
        }
        if (i == 2) {
            int i10 = s82.f32899a;
            if (i10 < 23) {
                throw new IllegalStateException();
            }
            if (i10 >= 23) {
                try {
                    S();
                } catch (h60 e4) {
                    rs0.b("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    N();
                    return true;
                }
            }
        }
        B();
        return false;
    }

    public final uu0 E() {
        return this.f24868K;
    }

    public final yu0 F() {
        return this.f24875R;
    }

    public boolean G() {
        return false;
    }

    public final MediaFormat H() {
        return this.f24870M;
    }

    public final long I() {
        return this.f24860D0;
    }

    public final float J() {
        return this.f24866I;
    }

    public final void K() throws Exception {
        dc0 dc0Var;
        if (this.f24868K != null || this.f24894k0 || (dc0Var = this.f24855B) == null) {
            return;
        }
        boolean z10 = false;
        if (this.f24861E == null && b(dc0Var)) {
            dc0 dc0Var2 = this.f24855B;
            this.f24896m0 = false;
            this.f24911u.b();
            this.f24909t.b();
            this.f24895l0 = false;
            this.f24894k0 = false;
            String str = dc0Var2.f26083m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f24911u.f(32);
            } else {
                this.f24911u.f(1);
            }
            this.f24894k0 = true;
            return;
        }
        b40 b40Var = this.f24861E;
        F.b(this.f24859D, b40Var);
        this.f24859D = b40Var;
        String str2 = this.f24855B.f26083m;
        if (b40Var != null) {
            if (this.f24863F == null) {
                lc0 lc0VarA = a(b40Var);
                if (lc0VarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(lc0VarA.f29969a, lc0VarA.f29970b);
                        this.f24863F = mediaCrypto;
                        if (!lc0VarA.f29971c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                            z10 = true;
                        }
                        this.f24864G = z10;
                    } catch (MediaCryptoException e4) {
                        throw a(e4, this.f24855B, 6006);
                    }
                } else if (this.f24859D.getError() == null) {
                    return;
                }
            }
            if (lc0.f29968d) {
                int state = this.f24859D.getState();
                if (state == 1) {
                    b40.a error = this.f24859D.getError();
                    error.getClass();
                    throw a(error, this.f24855B, error.f25078b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.f24863F, this.f24864G);
        } catch (b e10) {
            throw a(e10, this.f24855B, 4001);
        }
    }

    public abstract void L();

    public final void N() {
        try {
            uu0 uu0Var = this.f24868K;
            if (uu0Var != null) {
                uu0Var.release();
                this.f24856B0.f29810b++;
                a(this.f24875R.f35980a);
            }
            this.f24868K = null;
            try {
                MediaCrypto mediaCrypto = this.f24863F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f24868K = null;
            try {
                MediaCrypto mediaCrypto2 = this.f24863F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void P() {
        this.f24889f0 = -1;
        this.f24907s.f30572d = null;
        this.f24890g0 = -1;
        this.f24891h0 = null;
        this.f24888e0 = -9223372036854775807L;
        this.f24908s0 = false;
        this.f24906r0 = false;
        this.f24884a0 = false;
        this.f24885b0 = false;
        this.f24892i0 = false;
        this.f24893j0 = false;
        this.f24915w.clear();
        this.f24912u0 = -9223372036854775807L;
        this.f24914v0 = -9223372036854775807L;
        km kmVar = this.f24887d0;
        if (kmVar != null) {
            kmVar.a();
        }
        this.f24902p0 = 0;
        this.f24904q0 = 0;
        this.f24900o0 = this.f24898n0 ? 1 : 0;
    }

    public final void Q() {
        P();
        this.f24854A0 = null;
        this.f24887d0 = null;
        this.f24873P = null;
        this.f24875R = null;
        this.f24869L = null;
        this.f24870M = null;
        this.f24871N = false;
        this.f24910t0 = false;
        this.f24872O = -1.0f;
        this.f24876S = 0;
        this.f24877T = false;
        this.f24878U = false;
        this.f24879V = false;
        this.f24880W = false;
        this.f24881X = false;
        this.f24882Y = false;
        this.f24883Z = false;
        this.f24886c0 = false;
        this.f24898n0 = false;
        this.f24900o0 = 0;
        this.f24864G = false;
    }

    public final void R() {
        this.f24922z0 = true;
    }

    public abstract float a(float f10, dc0[] dc0VarArr);

    public abstract int a(cv0 cv0Var, dc0 dc0Var) throws gv0.b;

    public abstract oy a(yu0 yu0Var, dc0 dc0Var, dc0 dc0Var2);

    public abstract uu0.a a(yu0 yu0Var, dc0 dc0Var, MediaCrypto mediaCrypto, float f10);

    public abstract ArrayList a(cv0 cv0Var, dc0 dc0Var, boolean z10) throws gv0.b;

    public abstract void a(dc0 dc0Var, MediaFormat mediaFormat) throws h60;

    public void a(my myVar) throws h60 {
    }

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j4, long j10);

    public abstract boolean a(long j4, long j10, uu0 uu0Var, ByteBuffer byteBuffer, int i, int i10, int i11, long j11, boolean z10, boolean z11, dc0 dc0Var) throws h60;

    public abstract void b(my myVar) throws h60;

    public boolean b(dc0 dc0Var) {
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public boolean d() {
        if (this.f24855B == null) {
            return false;
        }
        if (t() || this.f24890g0 >= 0) {
            return true;
        }
        return this.f24888e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f24888e0;
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.to1
    public final int f() {
        return 8;
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public void u() throws MediaCryptoException {
        this.f24855B = null;
        this.f24858C0 = -9223372036854775807L;
        this.f24860D0 = -9223372036854775807L;
        this.f24862E0 = 0;
        D();
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public void v() {
        try {
            this.f24896m0 = false;
            this.f24911u.b();
            this.f24909t.b();
            this.f24895l0 = false;
            this.f24894k0 = false;
            N();
        } finally {
            F.b(this.f24861E, null);
            this.f24861E = null;
        }
    }

    private boolean b(long j4, long j10) throws Exception {
        if (this.f24918x0) {
            throw new IllegalStateException();
        }
        if (this.f24911u.m()) {
            tk tkVar = this.f24911u;
            ByteBuffer byteBuffer = tkVar.f30572d;
            int i = this.f24890g0;
            int iL = tkVar.l();
            tk tkVar2 = this.f24911u;
            if (!a(j4, j10, null, byteBuffer, i, 0, iL, tkVar2.f30574f, tkVar2.e(), this.f24911u.f(), this.f24857C)) {
                return false;
            }
            c(this.f24911u.k());
            this.f24911u.b();
        }
        if (this.f24916w0) {
            this.f24918x0 = true;
            return false;
        }
        if (this.f24895l0) {
            if (!this.f24911u.a(this.f24909t)) {
                throw new IllegalStateException();
            }
            this.f24895l0 = false;
        }
        if (this.f24896m0) {
            if (this.f24911u.m()) {
                return true;
            }
            this.f24896m0 = false;
            this.f24911u.b();
            this.f24909t.b();
            this.f24895l0 = false;
            this.f24894k0 = false;
            this.f24896m0 = false;
            K();
            if (!this.f24894k0) {
                return false;
            }
        }
        y();
        if (this.f24911u.m()) {
            this.f24911u.h();
        }
        return this.f24911u.m() || this.f24916w0 || this.f24896m0;
    }

    public boolean a(yu0 yu0Var) {
        return true;
    }

    private List<yu0> a(boolean z10) throws gv0.b {
        ArrayList arrayListA = a(this.f24899o, this.f24855B, z10);
        if (!arrayListA.isEmpty() || !z10) {
            return arrayListA;
        }
        ArrayList arrayListA2 = a(this.f24899o, this.f24855B, false);
        if (!arrayListA2.isEmpty()) {
            rs0.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f24855B.f26083m + ", but no secure decoder available. Trying to proceed with " + arrayListA2 + ".");
        }
        return arrayListA2;
    }

    public final void d(long j4) throws h60 {
        dc0 dc0VarB = this.f24913v.b(j4);
        if (dc0VarB == null && this.f24871N) {
            dc0VarB = this.f24913v.c();
        }
        if (dc0VarB != null) {
            this.f24857C = dc0VarB;
        } else if (!this.f24871N || this.f24857C == null) {
            return;
        }
        a(this.f24857C, this.f24870M);
        this.f24871N = false;
    }

    private lc0 a(b40 b40Var) throws h60 {
        yu cryptoConfig = b40Var.getCryptoConfig();
        if (cryptoConfig != null && !(cryptoConfig instanceof lc0)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.f24855B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (lc0) cryptoConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.yandex.mobile.ads.impl.yu0 r18, android.media.MediaCrypto r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.av0.a(com.yandex.mobile.ads.impl.yu0, android.media.MediaCrypto):void");
    }

    public void O() throws h60 {
    }

    public void c(long j4) {
        while (true) {
            int i = this.f24862E0;
            if (i == 0 || j4 < this.f24853A[0]) {
                return;
            }
            long[] jArr = this.f24919y;
            this.f24858C0 = jArr[0];
            this.f24860D0 = this.f24921z[0];
            int i10 = i - 1;
            this.f24862E0 = i10;
            System.arraycopy(jArr, 1, jArr, 0, i10);
            long[] jArr2 = this.f24921z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f24862E0);
            long[] jArr3 = this.f24853A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.f24862E0);
            L();
        }
    }

    private boolean c(int i) throws Exception {
        ec0 ec0VarQ = q();
        this.f24905r.b();
        int iA = a(ec0VarQ, this.f24905r, i | 4);
        if (iA == -5) {
            a(ec0VarQ);
            return true;
        }
        if (iA != -4 || !this.f24905r.f()) {
            return false;
        }
        this.f24916w0 = true;
        M();
        return false;
    }

    private boolean c(dc0 dc0Var) throws Exception {
        if (s82.f32899a >= 23 && this.f24868K != null && this.f24904q0 != 3 && getState() != 0) {
            float fA = a(this.f24867J, s());
            float f10 = this.f24872O;
            if (f10 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f24906r0) {
                    this.f24902p0 = 1;
                    this.f24904q0 = 3;
                    return false;
                }
                N();
                K();
                return false;
            }
            if (f10 == -1.0f && fA <= this.f24903q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.f24868K.a(bundle);
            this.f24872O = fA;
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public boolean a() {
        return this.f24918x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.media.MediaCrypto r22, boolean r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.av0.a(android.media.MediaCrypto, boolean):void");
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public void a(boolean z10, boolean z11) throws h60 {
        this.f24856B0 = new ky();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r12 != false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.mobile.ads.impl.oy a(com.yandex.mobile.ads.impl.ec0 r12) throws com.yandex.mobile.ads.impl.h60 {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.av0.a(com.yandex.mobile.ads.impl.ec0):com.yandex.mobile.ads.impl.oy");
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public void a(long j4, boolean z10) throws h60 {
        this.f24916w0 = false;
        this.f24918x0 = false;
        this.f24922z0 = false;
        if (this.f24894k0) {
            this.f24911u.b();
            this.f24909t.b();
            this.f24895l0 = false;
        } else {
            C();
        }
        if (this.f24913v.d() > 0) {
            this.f24920y0 = true;
        }
        this.f24913v.a();
        int i = this.f24862E0;
        if (i != 0) {
            int i10 = i - 1;
            this.f24860D0 = this.f24921z[i10];
            this.f24858C0 = this.f24919y[i10];
            this.f24862E0 = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(dc0[] dc0VarArr, long j4, long j10) throws h60 {
        if (this.f24860D0 == -9223372036854775807L) {
            if (this.f24858C0 == -9223372036854775807L) {
                this.f24858C0 = j4;
                this.f24860D0 = j10;
                return;
            }
            throw new IllegalStateException();
        }
        int i = this.f24862E0;
        if (i == this.f24921z.length) {
            rs0.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f24921z[this.f24862E0 - 1]);
        } else {
            this.f24862E0 = i + 1;
        }
        long[] jArr = this.f24919y;
        int i10 = this.f24862E0 - 1;
        jArr[i10] = j4;
        this.f24921z[i10] = j10;
        this.f24853A[i10] = this.f24912u0;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j10) throws Exception {
        boolean z10 = false;
        if (this.f24922z0) {
            this.f24922z0 = false;
            M();
        }
        h60 h60Var = this.f24854A0;
        if (h60Var == null) {
            try {
                if (this.f24918x0) {
                    O();
                    return;
                }
                if (this.f24855B != null || c(2)) {
                    K();
                    if (this.f24894k0) {
                        h52.a("bypassRender");
                        while (b(j4, j10)) {
                        }
                        h52.a();
                    } else if (this.f24868K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        h52.a("drainAndFeed");
                        while (c(j4, j10) && (this.f24865H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.f24865H)) {
                        }
                        while (A() && (this.f24865H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.f24865H)) {
                        }
                        h52.a();
                    } else {
                        this.f24856B0.f29812d += b(j4);
                        c(1);
                    }
                    synchronized (this.f24856B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e4) {
                int i = s82.f32899a;
                if (i < 21 || !(e4 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e4.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e4;
                    }
                }
                a(e4);
                if (i >= 21 && (e4 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e4).isRecoverable()) {
                    z10 = true;
                }
                if (z10) {
                    N();
                }
                throw a(4003, this.f24855B, a(e4, this.f24875R), z10);
            }
        }
        this.f24854A0 = null;
        throw h60Var;
    }

    public final void a(h60 h60Var) {
        this.f24854A0 = h60Var;
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.so1
    public void a(float f10, float f11) throws Exception {
        this.f24866I = f10;
        this.f24867J = f11;
        c(this.f24869L);
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(dc0 dc0Var) throws h60 {
        try {
            return a(this.f24899o, dc0Var);
        } catch (gv0.b e4) {
            throw a(e4, dc0Var, 4002);
        }
    }

    public xu0 a(IllegalStateException illegalStateException, yu0 yu0Var) {
        return new xu0(illegalStateException, yu0Var);
    }
}
