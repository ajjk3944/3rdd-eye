package l5;

import a5.d0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import h7.h0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o5.x0;

/* loaded from: classes.dex */
public abstract class r extends d5.b {
    public static final byte[] W0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public int H0;
    public final j I;
    public boolean I0;
    public final s J;
    public boolean J0;
    public final float K;
    public boolean K0;
    public final c5.g L;
    public long L0;
    public final c5.g M;
    public long M0;
    public final c5.g N;
    public boolean N0;
    public final g O;
    public boolean O0;
    public final ArrayList P;
    public boolean P0;
    public final MediaCodec.BufferInfo Q;
    public boolean Q0;
    public final ArrayDeque R;
    public d5.f R0;
    public androidx.media3.common.r S;
    public d5.c S0;
    public androidx.media3.common.r T;
    public q T0;
    public h0 U;
    public long U0;
    public h0 V;
    public boolean V0;
    public MediaCrypto W;
    public boolean X;
    public final long Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f14739a0;

    /* renamed from: b0, reason: collision with root package name */
    public k f14740b0;

    /* renamed from: c0, reason: collision with root package name */
    public androidx.media3.common.r f14741c0;

    /* renamed from: d0, reason: collision with root package name */
    public MediaFormat f14742d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f14743e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f14744f0;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayDeque f14745g0;

    /* renamed from: h0, reason: collision with root package name */
    public p f14746h0;

    /* renamed from: i0, reason: collision with root package name */
    public n f14747i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f14748j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f14749k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f14750l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f14751m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f14752n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f14753o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f14754p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f14755q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f14756r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f14757s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f14758t0;

    /* renamed from: u0, reason: collision with root package name */
    public h f14759u0;

    /* renamed from: v0, reason: collision with root package name */
    public long f14760v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f14761w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f14762x0;

    /* renamed from: y0, reason: collision with root package name */
    public ByteBuffer f14763y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f14764z0;

    public r(int i10, j jVar, float f10) {
        super(i10);
        this.I = jVar;
        this.J = s.f14765d;
        this.K = f10;
        this.L = new c5.g(0);
        this.M = new c5.g(0);
        this.N = new c5.g(2);
        g gVar = new g(2);
        gVar.G = 32;
        this.O = gVar;
        this.P = new ArrayList();
        this.Q = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f14739a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.R = new ArrayDeque();
        g0(q.f14735d);
        gVar.r(0);
        gVar.f3306r.order(ByteOrder.nativeOrder());
        this.f14744f0 = -1.0f;
        this.f14748j0 = 0;
        this.F0 = 0;
        this.f14761w0 = -1;
        this.f14762x0 = -1;
        this.f14760v0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.G0 = 0;
        this.H0 = 0;
    }

    public final boolean A() throws MediaCryptoException, d5.f {
        if (!this.I0) {
            l0();
            return true;
        }
        this.G0 = 1;
        if (this.f14750l0 || this.f14752n0) {
            this.H0 = 3;
            return false;
        }
        this.H0 = 2;
        return true;
    }

    public final boolean B(long j, long j7) throws Exception {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean Z;
        int iF;
        boolean z12;
        int i10 = this.f14762x0;
        MediaCodec.BufferInfo bufferInfo2 = this.Q;
        if (i10 < 0) {
            if (this.f14753o0 && this.J0) {
                try {
                    iF = this.f14740b0.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    Y();
                    if (this.O0) {
                        b0();
                    }
                }
            } else {
                iF = this.f14740b0.f(bufferInfo2);
            }
            if (iF < 0) {
                if (iF != -2) {
                    if (this.f14758t0 && (this.N0 || this.G0 == 2)) {
                        Y();
                        return false;
                    }
                    return false;
                }
                this.K0 = true;
                MediaFormat mediaFormatB = this.f14740b0.b();
                if (this.f14748j0 != 0 && mediaFormatB.getInteger("width") == 32 && mediaFormatB.getInteger("height") == 32) {
                    this.f14757s0 = true;
                    return true;
                }
                if (this.f14755q0) {
                    mediaFormatB.setInteger("channel-count", 1);
                }
                this.f14742d0 = mediaFormatB;
                this.f14743e0 = true;
                return true;
            }
            if (this.f14757s0) {
                this.f14757s0 = false;
                this.f14740b0.g(iF, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                Y();
                return false;
            }
            this.f14762x0 = iF;
            ByteBuffer byteBufferJ = this.f14740b0.j(iF);
            this.f14763y0 = byteBufferJ;
            if (byteBufferJ != null) {
                byteBufferJ.position(bufferInfo2.offset);
                this.f14763y0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f14754p0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j10 = this.L0;
                if (j10 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j10;
                }
            }
            long j11 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.P;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z12 = false;
                    break;
                }
                if (((Long) arrayList.get(i11)).longValue() == j11) {
                    arrayList.remove(i11);
                    z12 = true;
                    break;
                }
                i11++;
            }
            this.f14764z0 = z12;
            long j12 = this.M0;
            long j13 = bufferInfo2.presentationTimeUs;
            this.A0 = j12 == j13;
            m0(j13);
        }
        if (this.f14753o0 && this.J0) {
            try {
                z10 = false;
                z11 = true;
                bufferInfo = bufferInfo2;
                try {
                    Z = Z(j, j7, this.f14740b0, this.f14763y0, this.f14762x0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f14764z0, this.A0, this.T);
                } catch (IllegalStateException unused2) {
                    Y();
                    if (!this.O0) {
                        return z10;
                    }
                    b0();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = true;
            bufferInfo = bufferInfo2;
            Z = Z(j, j7, this.f14740b0, this.f14763y0, this.f14762x0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f14764z0, this.A0, this.T);
        }
        if (!Z) {
            return z10;
        }
        V(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0 ? z11 : z10;
        this.f14762x0 = -1;
        this.f14763y0 = null;
        if (!z13) {
            return z11;
        }
        Y();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.r.C():boolean");
    }

    public final void D() {
        try {
            this.f14740b0.flush();
        } finally {
            d0();
        }
    }

    public final boolean E() throws MediaCryptoException {
        if (this.f14740b0 == null) {
            return false;
        }
        int i10 = this.H0;
        if (i10 == 3 || this.f14750l0 || ((this.f14751m0 && !this.K0) || (this.f14752n0 && this.J0))) {
            b0();
            return true;
        }
        if (i10 == 2) {
            int i11 = d0.f105a;
            a5.a.i(i11 >= 23);
            if (i11 >= 23) {
                try {
                    l0();
                } catch (d5.f e4) {
                    a5.a.C("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    b0();
                    return true;
                }
            }
        }
        D();
        return false;
    }

    public final List F(boolean z10) {
        androidx.media3.common.r rVar = this.S;
        s sVar = this.J;
        ArrayList arrayListI = I(sVar, rVar, z10);
        if (!arrayListI.isEmpty() || !z10) {
            return arrayListI;
        }
        ArrayList arrayListI2 = I(sVar, this.S, false);
        if (!arrayListI2.isEmpty()) {
            a5.a.B("MediaCodecRenderer", "Drm session requires secure decoder for " + this.S.H + ", but no secure decoder available. Trying to proceed with " + arrayListI2 + ".");
        }
        return arrayListI2;
    }

    public boolean G() {
        return false;
    }

    public abstract float H(float f10, androidx.media3.common.r[] rVarArr);

    public abstract ArrayList I(s sVar, androidx.media3.common.r rVar, boolean z10);

    public final i5.l J(h0 h0Var) {
        h0Var.getClass();
        return null;
    }

    public abstract i K(n nVar, androidx.media3.common.r rVar, MediaCrypto mediaCrypto, float f10);

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(l5.n r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.r.M(l5.n, android.media.MediaCrypto):void");
    }

    public final void N() throws Exception {
        androidx.media3.common.r rVar;
        if (this.f14740b0 != null || this.B0 || (rVar = this.S) == null) {
            return;
        }
        if (this.V == null && i0(rVar)) {
            androidx.media3.common.r rVar2 = this.S;
            z();
            String str = rVar2.H;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            g gVar = this.O;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                gVar.getClass();
                gVar.G = 32;
            } else {
                gVar.getClass();
                gVar.G = 1;
            }
            this.B0 = true;
            return;
        }
        f0(this.V);
        String str2 = this.S.H;
        h0 h0Var = this.U;
        if (h0Var != null) {
            if (this.W == null) {
                J(h0Var);
                if (this.U.C() == null) {
                    return;
                }
            }
            if (i5.l.f11246a) {
                int iF = this.U.F();
                if (iF == 1) {
                    i5.d dVarC = this.U.C();
                    dVarC.getClass();
                    throw k(dVarC, this.S, false, dVarC.f11239a);
                }
                if (iF != 4) {
                    return;
                }
            }
        }
        try {
            O(this.W, this.X);
        } catch (p e4) {
            throw k(e4, this.S, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.media.MediaCrypto r20, boolean r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.r.O(android.media.MediaCrypto, boolean):void");
    }

    public abstract void P(Exception exc);

    public abstract void Q(String str, long j, long j7);

    public abstract void R(String str);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d5.d S(io.sentry.internal.debugmeta.c r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.r.S(io.sentry.internal.debugmeta.c):d5.d");
    }

    public abstract void T(androidx.media3.common.r rVar, MediaFormat mediaFormat);

    public void V(long j) {
        this.U0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.R;
            if (arrayDeque.isEmpty() || j < ((q) arrayDeque.peek()).f14736a) {
                return;
            }
            g0((q) arrayDeque.poll());
            W();
        }
    }

    public abstract void W();

    public abstract void X(c5.g gVar);

    public final void Y() throws Exception {
        int i10 = this.H0;
        if (i10 == 1) {
            D();
            return;
        }
        if (i10 == 2) {
            D();
            l0();
        } else if (i10 != 3) {
            this.O0 = true;
            c0();
        } else {
            b0();
            N();
        }
    }

    public abstract boolean Z(long j, long j7, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z10, boolean z11, androidx.media3.common.r rVar);

    public final boolean a0(int i10) throws Exception {
        io.sentry.internal.debugmeta.c cVar = this.f6926d;
        cVar.c();
        c5.g gVar = this.L;
        gVar.p();
        int iT = t(cVar, gVar, i10 | 4);
        if (iT == -5) {
            S(cVar);
            return true;
        }
        if (iT != -4 || !gVar.g(4)) {
            return false;
        }
        this.N0 = true;
        Y();
        return false;
    }

    @Override // d5.u0
    public boolean b() {
        boolean zB;
        if (this.S != null) {
            if (l()) {
                zB = this.G;
            } else {
                x0 x0Var = this.B;
                x0Var.getClass();
                zB = x0Var.b();
            }
            if (!zB) {
                if ((this.f14762x0 >= 0) || (this.f14760v0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f14760v0)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b0() {
        try {
            k kVar = this.f14740b0;
            if (kVar != null) {
                kVar.release();
                this.S0.f6936b++;
                R(this.f14747i0.f14723a);
            }
            this.f14740b0 = null;
            try {
                MediaCrypto mediaCrypto = this.W;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f14740b0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.W;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // d5.b, d5.u0
    public boolean c() {
        return this.O0;
    }

    @Override // d5.b, d5.v0
    public final int d() {
        return 8;
    }

    public void d0() {
        this.f14761w0 = -1;
        this.M.f3306r = null;
        this.f14762x0 = -1;
        this.f14763y0 = null;
        this.f14760v0 = -9223372036854775807L;
        this.J0 = false;
        this.I0 = false;
        this.f14756r0 = false;
        this.f14757s0 = false;
        this.f14764z0 = false;
        this.A0 = false;
        this.P.clear();
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        h hVar = this.f14759u0;
        if (hVar != null) {
            hVar.f14714a = 0L;
            hVar.f14715b = 0L;
            hVar.f14716c = false;
        }
        this.G0 = 0;
        this.H0 = 0;
        this.F0 = this.E0 ? 1 : 0;
    }

    public final void e0() {
        d0();
        this.R0 = null;
        this.f14759u0 = null;
        this.f14745g0 = null;
        this.f14747i0 = null;
        this.f14741c0 = null;
        this.f14742d0 = null;
        this.f14743e0 = false;
        this.K0 = false;
        this.f14744f0 = -1.0f;
        this.f14748j0 = 0;
        this.f14749k0 = false;
        this.f14750l0 = false;
        this.f14751m0 = false;
        this.f14752n0 = false;
        this.f14753o0 = false;
        this.f14754p0 = false;
        this.f14755q0 = false;
        this.f14758t0 = false;
        this.E0 = false;
        this.F0 = 0;
        this.X = false;
    }

    public final void f0(h0 h0Var) {
        h0 h0Var2 = this.U;
        if (h0Var2 != h0Var) {
            if (h0Var != null) {
                h0Var.o(null);
            }
            if (h0Var2 != null) {
                h0Var2.U(null);
            }
        }
        this.U = h0Var;
    }

    @Override // d5.u0
    public void g(float f10, float f11) throws Exception {
        this.Z = f10;
        this.f14739a0 = f11;
        k0(this.f14741c0);
    }

    public final void g0(q qVar) {
        this.T0 = qVar;
        if (qVar.f14737b != -9223372036854775807L) {
            this.V0 = true;
            U();
        }
    }

    @Override // d5.u0
    public final void h(long j, long j7) throws Exception {
        boolean z10 = false;
        if (this.Q0) {
            this.Q0 = false;
            Y();
        }
        d5.f fVar = this.R0;
        if (fVar != null) {
            this.R0 = null;
            throw fVar;
        }
        try {
            if (this.O0) {
                c0();
                return;
            }
            if (this.S != null || a0(2)) {
                N();
                if (this.B0) {
                    a5.a.b("bypassRender");
                    while (w(j, j7)) {
                    }
                    a5.a.o();
                } else if (this.f14740b0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    a5.a.b("drainAndFeed");
                    while (B(j, j7)) {
                        long j10 = this.Y;
                        if (!(j10 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j10)) {
                            break;
                        }
                    }
                    while (C()) {
                        long j11 = this.Y;
                        if (!(j11 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j11)) {
                            break;
                        }
                    }
                    a5.a.o();
                } else {
                    d5.c cVar = this.S0;
                    int i10 = cVar.f6938d;
                    x0 x0Var = this.B;
                    x0Var.getClass();
                    cVar.f6938d = i10 + x0Var.h(j - this.E);
                    a0(1);
                }
                synchronized (this.S0) {
                }
            }
        } catch (IllegalStateException e4) {
            int i11 = d0.f105a;
            if (i11 < 21 || !(e4 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e4.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e4;
                }
            }
            P(e4);
            if (i11 >= 21) {
                if (e4 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e4).isRecoverable() : false) {
                    z10 = true;
                }
            }
            if (z10) {
                b0();
            }
            throw k(y(e4, this.f14747i0), this.S, z10, 4003);
        }
    }

    public boolean h0(n nVar) {
        return true;
    }

    public boolean i0(androidx.media3.common.r rVar) {
        return false;
    }

    @Override // d5.v0
    public final int j(androidx.media3.common.r rVar) throws d5.f {
        try {
            return j0(this.J, rVar);
        } catch (v e4) {
            throw k(e4, rVar, false, 4002);
        }
    }

    public abstract int j0(s sVar, androidx.media3.common.r rVar);

    public final boolean k0(androidx.media3.common.r rVar) throws Exception {
        if (d0.f105a >= 23 && this.f14740b0 != null && this.H0 != 3 && this.f6930y != 0) {
            float f10 = this.f14739a0;
            androidx.media3.common.r[] rVarArr = this.D;
            rVarArr.getClass();
            float fH = H(f10, rVarArr);
            float f11 = this.f14744f0;
            if (f11 != fH) {
                if (fH == -1.0f) {
                    if (this.I0) {
                        this.G0 = 1;
                        this.H0 = 3;
                        return false;
                    }
                    b0();
                    N();
                    return false;
                }
                if (f11 != -1.0f || fH > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fH);
                    this.f14740b0.c(bundle);
                    this.f14744f0 = fH;
                }
            }
        }
        return true;
    }

    public final void l0() throws MediaCryptoException, d5.f {
        try {
            MediaCrypto mediaCrypto = this.W;
            J(this.V).getClass();
            mediaCrypto.setMediaDrmSession(null);
            f0(this.V);
            this.G0 = 0;
            this.H0 = 0;
        } catch (MediaCryptoException e4) {
            throw k(e4, this.S, false, 6006);
        }
    }

    @Override // d5.b
    public void m() throws MediaCryptoException {
        this.S = null;
        g0(q.f14735d);
        this.R.clear();
        E();
    }

    public final void m0(long j) {
        Object objE;
        Object objE2;
        a5.a0 a0Var = this.T0.f14738c;
        synchronized (a0Var) {
            objE = null;
            objE2 = null;
            while (a0Var.f91e > 0 && j - a0Var.f88b[a0Var.f90d] >= 0) {
                objE2 = a0Var.e();
            }
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) objE2;
        if (rVar == null && this.V0 && this.f14742d0 != null) {
            a5.a0 a0Var2 = this.T0.f14738c;
            synchronized (a0Var2) {
                if (a0Var2.f91e != 0) {
                    objE = a0Var2.e();
                }
            }
            rVar = (androidx.media3.common.r) objE;
        }
        if (rVar != null) {
            this.T = rVar;
        } else if (!this.f14743e0 || this.T == null) {
            return;
        }
        T(this.T, this.f14742d0);
        this.f14743e0 = false;
        this.V0 = false;
    }

    @Override // d5.b
    public void o(long j, boolean z10) throws Exception {
        int i10;
        this.N0 = false;
        this.O0 = false;
        this.Q0 = false;
        if (this.B0) {
            this.O.p();
            this.N.p();
            this.C0 = false;
        } else if (E()) {
            N();
        }
        a5.a0 a0Var = this.T0.f14738c;
        synchronized (a0Var) {
            i10 = a0Var.f91e;
        }
        if (i10 > 0) {
            this.P0 = true;
        }
        a5.a0 a0Var2 = this.T0.f14738c;
        synchronized (a0Var2) {
            a0Var2.f90d = 0;
            a0Var2.f91e = 0;
            Arrays.fill(a0Var2.f89c, (Object) null);
        }
        this.R.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // d5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(androidx.media3.common.r[] r6, long r7, long r9) {
        /*
            r5 = this;
            l5.q r6 = r5.T0
            long r6 = r6.f14737b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            l5.q r6 = new l5.q
            r6.<init>(r0, r9)
            r5.g0(r6)
            return
        L16:
            java.util.ArrayDeque r6 = r5.R
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.L0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.U0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            l5.q r6 = new l5.q
            r6.<init>(r0, r9)
            r5.g0(r6)
            l5.q r6 = r5.T0
            long r6 = r6.f14737b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L41
            r5.W()
        L41:
            return
        L42:
            l5.q r7 = new l5.q
            long r0 = r5.L0
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.r.s(androidx.media3.common.r[], long, long):void");
    }

    public final boolean w(long j, long j7) throws Exception {
        g gVar;
        a5.a.i(!this.O0);
        g gVar2 = this.O;
        int i10 = gVar2.F;
        if (i10 > 0) {
            gVar = gVar2;
            if (!Z(j, j7, null, gVar2.f3306r, this.f14762x0, 0, i10, gVar2.f3308y, gVar2.g(Integer.MIN_VALUE), gVar2.g(4), this.T)) {
                return false;
            }
            V(gVar.E);
            gVar.p();
        } else {
            gVar = gVar2;
        }
        if (this.N0) {
            this.O0 = true;
            return false;
        }
        boolean z10 = this.C0;
        c5.g gVar3 = this.N;
        if (z10) {
            a5.a.i(gVar.t(gVar3));
            this.C0 = false;
        }
        if (this.D0) {
            if (gVar.F > 0) {
                return true;
            }
            z();
            this.D0 = false;
            N();
            if (!this.B0) {
                return false;
            }
        }
        a5.a.i(!this.N0);
        io.sentry.internal.debugmeta.c cVar = this.f6926d;
        cVar.c();
        gVar3.p();
        while (true) {
            gVar3.p();
            int iT = t(cVar, gVar3, 0);
            if (iT == -5) {
                S(cVar);
                break;
            }
            if (iT != -4) {
                if (iT != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (gVar3.g(4)) {
                    this.N0 = true;
                    break;
                }
                if (this.P0) {
                    androidx.media3.common.r rVar = this.S;
                    rVar.getClass();
                    this.T = rVar;
                    T(rVar, null);
                    this.P0 = false;
                }
                gVar3.s();
                if (!gVar.t(gVar3)) {
                    this.C0 = true;
                    break;
                }
            }
        }
        if (gVar.F > 0) {
            gVar.s();
        }
        return gVar.F > 0 || this.N0 || this.D0;
    }

    public abstract d5.d x(n nVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2);

    public l y(IllegalStateException illegalStateException, n nVar) {
        return new l(illegalStateException, nVar);
    }

    public final void z() {
        this.D0 = false;
        this.O.p();
        this.N.p();
        this.C0 = false;
        this.B0 = false;
    }

    public void U() {
    }

    public void c0() {
    }

    public void L(c5.g gVar) {
    }
}
