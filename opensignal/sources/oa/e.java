package oa;

import a5.a0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.n;
import io.sentry.android.core.e0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import qb.v;
import ya.s0;

/* loaded from: classes.dex */
public abstract class e extends com.google.android.exoplayer2.g {
    public static final byte[] Y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public ByteBuffer A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final l H;
    public int H0;
    public final f I;
    public int I0;
    public final float J;
    public int J0;
    public final z9.d K;
    public boolean K0;
    public final z9.d L;
    public boolean L0;
    public final z9.d M;
    public boolean M0;
    public final a N;
    public long N0;
    public final a0 O;
    public long O0;
    public final ArrayList P;
    public boolean P0;
    public final MediaCodec.BufferInfo Q;
    public boolean Q0;
    public final long[] R;
    public boolean R0;
    public final long[] S;
    public boolean S0;
    public final long[] T;
    public n T0;
    public Format U;
    public z9.b U0;
    public Format V;
    public long V0;
    public b9.e W;
    public long W0;
    public b9.e X;
    public int X0;
    public MediaCrypto Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final long f19180a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f19181b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f19182c0;

    /* renamed from: d0, reason: collision with root package name */
    public l5.a0 f19183d0;

    /* renamed from: e0, reason: collision with root package name */
    public Format f19184e0;

    /* renamed from: f0, reason: collision with root package name */
    public MediaFormat f19185f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f19186g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f19187h0;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayDeque f19188i0;

    /* renamed from: j0, reason: collision with root package name */
    public d f19189j0;

    /* renamed from: k0, reason: collision with root package name */
    public c f19190k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f19191l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f19192m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f19193n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f19194o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f19195p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f19196q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f19197r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f19198s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f19199t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f19200u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f19201v0;

    /* renamed from: w0, reason: collision with root package name */
    public l5.h f19202w0;

    /* renamed from: x0, reason: collision with root package name */
    public long f19203x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f19204y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f19205z0;

    public e(int i10, float f10) {
        super(i10);
        this.H = l.f19214a;
        this.I = f.f19206d;
        this.J = f10;
        this.K = new z9.d(0);
        this.L = new z9.d(0);
        this.M = new z9.d(2);
        a aVar = new a(2);
        aVar.G = 32;
        this.N = aVar;
        this.O = new a0(1);
        this.P = new ArrayList();
        this.Q = new MediaCodec.BufferInfo();
        this.f19181b0 = 1.0f;
        this.f19182c0 = 1.0f;
        this.f19180a0 = -9223372036854775807L;
        this.R = new long[10];
        this.S = new long[10];
        this.T = new long[10];
        this.V0 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        aVar.r(0);
        aVar.f26791r.order(ByteOrder.nativeOrder());
        this.f19187h0 = -1.0f;
        this.f19191l0 = 0;
        this.H0 = 0;
        this.f19204y0 = -1;
        this.f19205z0 = -1;
        this.f19203x0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.I0 = 0;
        this.J0 = 0;
    }

    public final boolean A() throws MediaCryptoException, n {
        if (!this.K0) {
            j0();
            return true;
        }
        this.I0 = 1;
        if (this.f19193n0 || this.f19195p0) {
            this.J0 = 3;
            return false;
        }
        this.J0 = 2;
        return true;
    }

    public final boolean B(long j, long j7) throws n, MediaCryptoException {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean zY;
        int iF;
        boolean z12;
        int i10 = this.f19205z0;
        MediaCodec.BufferInfo bufferInfo2 = this.Q;
        if (i10 < 0) {
            if (this.f19196q0 && this.L0) {
                try {
                    iF = this.f19183d0.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    X();
                    if (this.Q0) {
                        a0();
                    }
                }
            } else {
                iF = this.f19183d0.f(bufferInfo2);
            }
            if (iF < 0) {
                if (iF != -2) {
                    if (this.f19201v0 && (this.P0 || this.I0 == 2)) {
                        X();
                        return false;
                    }
                    return false;
                }
                this.M0 = true;
                MediaFormat mediaFormatB = this.f19183d0.b();
                if (this.f19191l0 != 0 && mediaFormatB.getInteger("width") == 32 && mediaFormatB.getInteger("height") == 32) {
                    this.f19200u0 = true;
                    return true;
                }
                if (this.f19198s0) {
                    mediaFormatB.setInteger("channel-count", 1);
                }
                this.f19185f0 = mediaFormatB;
                this.f19186g0 = true;
                return true;
            }
            if (this.f19200u0) {
                this.f19200u0 = false;
                this.f19183d0.g(iF, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                X();
                return false;
            }
            this.f19205z0 = iF;
            ByteBuffer byteBufferJ = this.f19183d0.j(iF);
            this.A0 = byteBufferJ;
            if (byteBufferJ != null) {
                byteBufferJ.position(bufferInfo2.offset);
                this.A0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f19197r0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j10 = this.N0;
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
            this.B0 = z12;
            long j12 = this.O0;
            long j13 = bufferInfo2.presentationTimeUs;
            this.C0 = j12 == j13;
            k0(j13);
        }
        if (this.f19196q0 && this.L0) {
            try {
                z10 = false;
                z11 = true;
                bufferInfo = bufferInfo2;
                try {
                    zY = Y(j, j7, this.f19183d0, this.A0, this.f19205z0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.B0, this.C0, this.V);
                } catch (IllegalStateException unused2) {
                    X();
                    if (!this.Q0) {
                        return z10;
                    }
                    a0();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = true;
            bufferInfo = bufferInfo2;
            zY = Y(j, j7, this.f19183d0, this.A0, this.f19205z0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.B0, this.C0, this.V);
        }
        if (!zY) {
            return z10;
        }
        U(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0 ? z11 : z10;
        this.f19205z0 = -1;
        this.A0 = null;
        if (!z13) {
            return z11;
        }
        X();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C() throws com.google.android.exoplayer2.n, android.media.MediaCryptoException, android.media.MediaCodec.CryptoException {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.C():boolean");
    }

    public final void D() {
        try {
            this.f19183d0.flush();
        } finally {
            c0();
        }
    }

    public final boolean E() {
        if (this.f19183d0 == null) {
            return false;
        }
        if (this.J0 == 3 || this.f19193n0 || ((this.f19194o0 && !this.M0) || (this.f19195p0 && this.L0))) {
            a0();
            return true;
        }
        D();
        return false;
    }

    public final List F(boolean z10) {
        Format format = this.U;
        f fVar = this.I;
        List listI = I(fVar, format, z10);
        if (!listI.isEmpty() || !z10) {
            return listI;
        }
        List listI2 = I(fVar, this.U, false);
        if (!listI2.isEmpty()) {
            String str = this.U.H;
            String strValueOf = String.valueOf(listI2);
            StringBuilder sbS = c7.a.s(strValueOf.length() + c7.a.d(99, str), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", strValueOf);
            sbS.append(".");
            e0.p("MediaCodecRenderer", sbS.toString());
        }
        return listI2;
    }

    public boolean G() {
        return false;
    }

    public abstract float H(float f10, Format[] formatArr);

    public abstract List I(f fVar, Format format, boolean z10);

    public final ba.k J(b9.e eVar) {
        eVar.getClass();
        return null;
    }

    public abstract js.e K(c cVar, Format format, MediaCrypto mediaCrypto, float f10);

    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(oa.c r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.M(oa.c, android.media.MediaCrypto):void");
    }

    public final void N() throws n {
        Format format;
        if (this.f19183d0 != null || this.D0 || (format = this.U) == null) {
            return;
        }
        if (this.X == null && g0(format)) {
            Format format2 = this.U;
            z();
            String str = format2.H;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            a aVar = this.N;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                aVar.getClass();
                aVar.G = 32;
            } else {
                aVar.getClass();
                aVar.G = 1;
            }
            this.D0 = true;
            return;
        }
        e0(this.X);
        String str2 = this.U.H;
        b9.e eVar = this.W;
        if (eVar != null) {
            if (this.Y == null) {
                J(eVar);
                if (this.W.w() == null) {
                    return;
                }
            }
            if (ba.k.f2491a) {
                int iZ = this.W.z();
                if (iZ == 1) {
                    ba.b bVarW = this.W.w();
                    bVarW.getClass();
                    throw c(bVarW, this.U, false, bVarW.f2484a);
                }
                if (iZ != 4) {
                    return;
                }
            }
        }
        try {
            O(this.Y, this.Z);
        } catch (d e4) {
            throw c(e4, this.U, false, 4001);
        }
    }

    public final void O(MediaCrypto mediaCrypto, boolean z10) throws d {
        String diagnosticInfo;
        if (this.f19188i0 == null) {
            try {
                List listF = F(z10);
                this.f19188i0 = new ArrayDeque();
                if (!listF.isEmpty()) {
                    this.f19188i0.add((c) listF.get(0));
                }
                this.f19189j0 = null;
            } catch (h e4) {
                throw new d(this.U, e4, z10, -49998);
            }
        }
        if (this.f19188i0.isEmpty()) {
            throw new d(this.U, null, z10, -49999);
        }
        while (this.f19183d0 == null) {
            c cVar = (c) this.f19188i0.peekFirst();
            if (!f0(cVar)) {
                return;
            }
            try {
                M(cVar, mediaCrypto);
            } catch (Exception e10) {
                String strValueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 30);
                sb2.append("Failed to initialize decoder: ");
                sb2.append(strValueOf);
                qb.b.J("MediaCodecRenderer", sb2.toString(), e10);
                this.f19188i0.removeFirst();
                Format format = this.U;
                String str = cVar.f19169a;
                String strValueOf2 = String.valueOf(format);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + c7.a.d(23, str));
                sb3.append("Decoder init failed: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(strValueOf2);
                String string = sb3.toString();
                String str2 = format.H;
                if (v.f20828a >= 21) {
                    diagnosticInfo = e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).getDiagnosticInfo() : null;
                } else {
                    diagnosticInfo = null;
                }
                d dVar = new d(string, e10, str2, z10, cVar, diagnosticInfo);
                P(dVar);
                d dVar2 = this.f19189j0;
                if (dVar2 == null) {
                    this.f19189j0 = dVar;
                } else {
                    this.f19189j0 = new d(dVar2.getMessage(), dVar2.getCause(), dVar2.f19176a, dVar2.f19177d, dVar2.f19178g, dVar2.f19179r);
                }
                if (this.f19188i0.isEmpty()) {
                    throw this.f19189j0;
                }
            }
        }
        this.f19188i0 = null;
    }

    public abstract void P(Exception exc);

    public abstract void Q(String str, long j, long j7);

    public abstract void R(String str);

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z9.e S(io.sentry.internal.debugmeta.c r13) throws com.google.android.exoplayer2.n {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.e.S(io.sentry.internal.debugmeta.c):z9.e");
    }

    public abstract void T(Format format, MediaFormat mediaFormat);

    public void U(long j) {
        while (true) {
            int i10 = this.X0;
            if (i10 == 0) {
                return;
            }
            long[] jArr = this.T;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.R;
            this.V0 = jArr2[0];
            long[] jArr3 = this.S;
            this.W0 = jArr3[0];
            int i11 = i10 - 1;
            this.X0 = i11;
            System.arraycopy(jArr2, 1, jArr2, 0, i11);
            System.arraycopy(jArr3, 1, jArr3, 0, this.X0);
            System.arraycopy(jArr, 1, jArr, 0, this.X0);
            V();
        }
    }

    public abstract void V();

    public abstract void W(z9.d dVar);

    public final void X() throws n, MediaCryptoException {
        int i10 = this.J0;
        if (i10 == 1) {
            D();
            return;
        }
        if (i10 == 2) {
            D();
            j0();
        } else if (i10 != 3) {
            this.Q0 = true;
            b0();
        } else {
            a0();
            N();
        }
    }

    public abstract boolean Y(long j, long j7, l5.a0 a0Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z10, boolean z11, Format format);

    public final boolean Z(int i10) throws n, MediaCryptoException {
        io.sentry.internal.debugmeta.c cVar = this.f4137d;
        cVar.c();
        z9.d dVar = this.K;
        dVar.p();
        int iR = r(cVar, dVar, i10 | 4);
        if (iR == -5) {
            S(cVar);
            return true;
        }
        if (iR != -4 || !dVar.g(4)) {
            return false;
        }
        this.P0 = true;
        X();
        return false;
    }

    public final void a0() {
        try {
            l5.a0 a0Var = this.f19183d0;
            if (a0Var != null) {
                a0Var.release();
                this.U0.getClass();
                R(this.f19190k0.f19169a);
            }
            this.f19183d0 = null;
            try {
                MediaCrypto mediaCrypto = this.Y;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f19183d0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.Y;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void c0() {
        this.f19204y0 = -1;
        this.L.f26791r = null;
        this.f19205z0 = -1;
        this.A0 = null;
        this.f19203x0 = -9223372036854775807L;
        this.L0 = false;
        this.K0 = false;
        this.f19199t0 = false;
        this.f19200u0 = false;
        this.B0 = false;
        this.C0 = false;
        this.P.clear();
        this.N0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        l5.h hVar = this.f19202w0;
        if (hVar != null) {
            hVar.f14714a = 0L;
            hVar.f14715b = 0L;
            hVar.f14716c = false;
        }
        this.I0 = 0;
        this.J0 = 0;
        this.H0 = this.G0 ? 1 : 0;
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final int d() {
        return 8;
    }

    public final void d0() {
        c0();
        this.T0 = null;
        this.f19202w0 = null;
        this.f19188i0 = null;
        this.f19190k0 = null;
        this.f19184e0 = null;
        this.f19185f0 = null;
        this.f19186g0 = false;
        this.M0 = false;
        this.f19187h0 = -1.0f;
        this.f19191l0 = 0;
        this.f19192m0 = false;
        this.f19193n0 = false;
        this.f19194o0 = false;
        this.f19195p0 = false;
        this.f19196q0 = false;
        this.f19197r0 = false;
        this.f19198s0 = false;
        this.f19201v0 = false;
        this.G0 = false;
        this.H0 = 0;
        this.Z = false;
    }

    public final void e0(b9.e eVar) {
        b9.e eVar2 = this.W;
        if (eVar2 != eVar) {
            if (eVar != null) {
                eVar.i(null);
            }
            if (eVar2 != null) {
                eVar2.D(null);
            }
        }
        this.W = eVar;
    }

    @Override // com.google.android.exoplayer2.l1
    public final int f(Format format) throws n {
        try {
            return h0(this.I, format);
        } catch (h e4) {
            throw c(e4, format, false, 4002);
        }
    }

    public boolean f0(c cVar) {
        return true;
    }

    public boolean g0(Format format) {
        return false;
    }

    public abstract int h0(f fVar, Format format);

    @Override // com.google.android.exoplayer2.g
    public boolean i() {
        return this.Q0;
    }

    public final boolean i0(Format format) throws n {
        if (v.f20828a >= 23 && this.f19183d0 != null && this.J0 != 3 && this.f4140x != 0) {
            float f10 = this.f19182c0;
            Format[] formatArr = this.B;
            formatArr.getClass();
            float fH = H(f10, formatArr);
            float f11 = this.f19187h0;
            if (f11 != fH) {
                if (fH == -1.0f) {
                    if (this.K0) {
                        this.I0 = 1;
                        this.J0 = 3;
                        return false;
                    }
                    a0();
                    N();
                    return false;
                }
                if (f11 != -1.0f || fH > this.J) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fH);
                    this.f19183d0.c(bundle);
                    this.f19187h0 = fH;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.g
    public boolean j() {
        boolean zB;
        if (this.U != null) {
            if (h()) {
                zB = this.F;
            } else {
                s0 s0Var = this.f4141y;
                s0Var.getClass();
                zB = s0Var.b();
            }
            if (!zB) {
                if ((this.f19205z0 >= 0) || (this.f19203x0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f19203x0)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void j0() throws MediaCryptoException, n {
        try {
            MediaCrypto mediaCrypto = this.Y;
            J(this.X).getClass();
            mediaCrypto.setMediaDrmSession(null);
            e0(this.X);
            this.I0 = 0;
            this.J0 = 0;
        } catch (MediaCryptoException e4) {
            throw c(e4, this.U, false, 6006);
        }
    }

    public final void k0(long j) {
        Object objD;
        Object objE;
        a0 a0Var = this.O;
        synchronized (a0Var) {
            objD = a0Var.d(j, true);
        }
        Format format = (Format) objD;
        if (format == null && this.f19186g0) {
            a0 a0Var2 = this.O;
            synchronized (a0Var2) {
                objE = a0Var2.f91e == 0 ? null : a0Var2.e();
            }
            format = (Format) objE;
        }
        if (format != null) {
            this.V = format;
        } else if (!this.f19186g0 || this.V == null) {
            return;
        }
        T(this.V, this.f19185f0);
        this.f19186g0 = false;
    }

    @Override // com.google.android.exoplayer2.g
    public void m(long j, boolean z10) throws n {
        int i10;
        this.P0 = false;
        this.Q0 = false;
        this.S0 = false;
        if (this.D0) {
            this.N.p();
            this.M.p();
            this.E0 = false;
        } else if (E()) {
            N();
        }
        a0 a0Var = this.O;
        synchronized (a0Var) {
            i10 = a0Var.f91e;
        }
        if (i10 > 0) {
            this.R0 = true;
        }
        this.O.b();
        int i11 = this.X0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.W0 = this.S[i12];
            this.V0 = this.R[i12];
            this.X0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void q(Format[] formatArr, long j, long j7) {
        if (this.W0 == -9223372036854775807L) {
            qb.b.j(this.V0 == -9223372036854775807L);
            this.V0 = j;
            this.W0 = j7;
            return;
        }
        int i10 = this.X0;
        long[] jArr = this.S;
        if (i10 == jArr.length) {
            long j10 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j10);
            e0.p("MediaCodecRenderer", sb2.toString());
        } else {
            this.X0 = i10 + 1;
        }
        int i11 = this.X0 - 1;
        this.R[i11] = j;
        jArr[i11] = j7;
        this.T[i11] = this.N0;
    }

    @Override // com.google.android.exoplayer2.g
    public final void s(long j, long j7) throws n, MediaCryptoException {
        boolean z10 = false;
        if (this.S0) {
            this.S0 = false;
            X();
        }
        n nVar = this.T0;
        if (nVar != null) {
            this.T0 = null;
            throw nVar;
        }
        try {
            if (this.Q0) {
                b0();
                return;
            }
            if (this.U != null || Z(2)) {
                N();
                if (this.D0) {
                    qb.b.d("bypassRender");
                    while (w(j, j7)) {
                    }
                    qb.b.r();
                } else if (this.f19183d0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    qb.b.d("drainAndFeed");
                    while (B(j, j7)) {
                        long j10 = this.f19180a0;
                        if (!(j10 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j10)) {
                            break;
                        }
                    }
                    while (C()) {
                        long j11 = this.f19180a0;
                        if (!(j11 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j11)) {
                            break;
                        }
                    }
                    qb.b.r();
                } else {
                    z9.b bVar = this.U0;
                    int i10 = bVar.f26782a;
                    s0 s0Var = this.f4141y;
                    s0Var.getClass();
                    bVar.f26782a = i10 + s0Var.h(j - this.D);
                    Z(1);
                }
                synchronized (this.U0) {
                }
            }
        } catch (IllegalStateException e4) {
            int i11 = v.f20828a;
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
                a0();
            }
            throw c(y(e4, this.f19190k0), this.U, z10, 4003);
        }
    }

    @Override // com.google.android.exoplayer2.g
    public void v(float f10, float f11) throws n {
        this.f19181b0 = f10;
        this.f19182c0 = f11;
        i0(this.f19184e0);
    }

    public final boolean w(long j, long j7) throws n {
        a aVar;
        qb.b.j(!this.Q0);
        a aVar2 = this.N;
        int i10 = aVar2.F;
        if (i10 > 0) {
            aVar = aVar2;
            if (!Y(j, j7, null, aVar2.f26791r, this.f19205z0, 0, i10, aVar2.f26793y, aVar2.g(Integer.MIN_VALUE), aVar2.g(4), this.V)) {
                return false;
            }
            U(aVar.E);
            aVar.p();
        } else {
            aVar = aVar2;
        }
        if (this.P0) {
            this.Q0 = true;
            return false;
        }
        boolean z10 = this.E0;
        z9.d dVar = this.M;
        if (z10) {
            qb.b.j(aVar.t(dVar));
            this.E0 = false;
        }
        if (this.F0) {
            if (aVar.F > 0) {
                return true;
            }
            z();
            this.F0 = false;
            N();
            if (!this.D0) {
                return false;
            }
        }
        qb.b.j(!this.P0);
        io.sentry.internal.debugmeta.c cVar = this.f4137d;
        cVar.c();
        dVar.p();
        while (true) {
            dVar.p();
            int iR = r(cVar, dVar, 0);
            if (iR == -5) {
                S(cVar);
                break;
            }
            if (iR != -4) {
                if (iR != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (dVar.g(4)) {
                    this.P0 = true;
                    break;
                }
                if (this.R0) {
                    Format format = this.U;
                    format.getClass();
                    this.V = format;
                    T(format, null);
                    this.R0 = false;
                }
                dVar.s();
                if (!aVar.t(dVar)) {
                    this.E0 = true;
                    break;
                }
            }
        }
        if (aVar.F > 0) {
            aVar.s();
        }
        return aVar.F > 0 || this.P0 || this.F0;
    }

    public abstract z9.e x(c cVar, Format format, Format format2);

    public b y(IllegalStateException illegalStateException, c cVar) {
        return new b(illegalStateException, cVar);
    }

    public final void z() {
        this.F0 = false;
        this.N.p();
        this.M.p();
        this.E0 = false;
        this.D0 = false;
    }

    public void b0() {
    }

    public void L(z9.d dVar) {
    }
}
