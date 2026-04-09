package f5;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.common.n0;
import d5.w0;
import e5.o0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import oe.u0;

/* loaded from: classes.dex */
public final class d0 extends l5.r implements d5.f0 {
    public final Context X0;
    public final io.sentry.internal.debugmeta.c Y0;
    public final z Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f8457a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f8458b1;

    /* renamed from: c1, reason: collision with root package name */
    public androidx.media3.common.r f8459c1;

    /* renamed from: d1, reason: collision with root package name */
    public androidx.media3.common.r f8460d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f8461e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f8462f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f8463g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f8464h1;

    /* renamed from: i1, reason: collision with root package name */
    public d5.a0 f8465i1;

    public d0(Context context, l5.j jVar, Handler handler, d5.w wVar, z zVar) {
        super(1, jVar, 44100.0f);
        this.X0 = context.getApplicationContext();
        this.Z0 = zVar;
        this.Y0 = new io.sentry.internal.debugmeta.c(handler, 19, wVar);
        zVar.f8622r = new b9.e(20, this);
    }

    public static oe.h0 o0(l5.s sVar, androidx.media3.common.r rVar, boolean z10, z zVar) {
        String str = rVar.H;
        if (str == null) {
            oe.f0 f0Var = oe.h0.f19336d;
            return u0.f19383x;
        }
        if (zVar.f(rVar) != 0) {
            List listE = l5.z.e("audio/raw", false, false);
            l5.n nVar = listE.isEmpty() ? null : (l5.n) listE.get(0);
            if (nVar != null) {
                return oe.h0.p(nVar);
            }
        }
        sVar.getClass();
        List listE2 = l5.z.e(str, z10, false);
        String strB = l5.z.b(rVar);
        if (strB == null) {
            return oe.h0.l(listE2);
        }
        List listE3 = l5.z.e(strB, z10, false);
        oe.f0 f0Var2 = oe.h0.f19336d;
        oe.e0 e0Var = new oe.e0();
        e0Var.c(listE2);
        e0Var.c(listE3);
        return e0Var.d();
    }

    @Override // l5.r
    public final float H(float f10, androidx.media3.common.r[] rVarArr) {
        int iMax = -1;
        for (androidx.media3.common.r rVar : rVarArr) {
            int i10 = rVar.V;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // l5.r
    public final ArrayList I(l5.s sVar, androidx.media3.common.r rVar, boolean z10) {
        oe.h0 h0VarO0 = o0(sVar, rVar, z10, this.Z0);
        Pattern pattern = l5.z.f14773a;
        ArrayList arrayList = new ArrayList(h0VarO0);
        Collections.sort(arrayList, new e2.t(1, new io.sentry.android.replay.capture.e(14, rVar)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @Override // l5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l5.i K(l5.n r13, androidx.media3.common.r r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d0.K(l5.n, androidx.media3.common.r, android.media.MediaCrypto, float):l5.i");
    }

    @Override // l5.r
    public final void P(Exception exc) {
        a5.a.n("MediaCodecAudioRenderer", "Audio codec error", exc);
        io.sentry.internal.debugmeta.c cVar = this.Y0;
        Handler handler = (Handler) cVar.f12353d;
        if (handler != null) {
            handler.post(new d(cVar, exc, 0));
        }
    }

    @Override // l5.r
    public final void Q(String str, long j, long j7) {
        io.sentry.internal.debugmeta.c cVar = this.Y0;
        Handler handler = (Handler) cVar.f12353d;
        if (handler != null) {
            handler.post(new e(cVar, str, j, j7, 0));
        }
    }

    @Override // l5.r
    public final void R(String str) {
        io.sentry.internal.debugmeta.c cVar = this.Y0;
        Handler handler = (Handler) cVar.f12353d;
        if (handler != null) {
            handler.post(new a5.o(cVar, 13, str));
        }
    }

    @Override // l5.r
    public final d5.d S(io.sentry.internal.debugmeta.c cVar) throws Exception {
        androidx.media3.common.r rVar = (androidx.media3.common.r) cVar.f12354g;
        rVar.getClass();
        this.f8459c1 = rVar;
        d5.d dVarS = super.S(cVar);
        androidx.media3.common.r rVar2 = this.f8459c1;
        io.sentry.internal.debugmeta.c cVar2 = this.Y0;
        Handler handler = (Handler) cVar2.f12353d;
        if (handler != null) {
            handler.post(new ch.a(cVar2, rVar2, dVarS, 4));
        }
        return dVarS;
    }

    @Override // l5.r
    public final void T(androidx.media3.common.r rVar, MediaFormat mediaFormat) throws d5.f {
        androidx.media3.common.r rVar2 = this.f8460d1;
        int[] iArr = null;
        if (rVar2 != null) {
            rVar = rVar2;
        } else if (this.f14740b0 != null) {
            String str = rVar.H;
            int i10 = rVar.U;
            int iV = "audio/raw".equals(str) ? rVar.W : (a5.d0.f105a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? a5.d0.v(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            androidx.media3.common.q qVar = new androidx.media3.common.q();
            qVar.k = "audio/raw";
            qVar.f1757z = iV;
            qVar.A = rVar.X;
            qVar.B = rVar.Y;
            qVar.f1755x = mediaFormat.getInteger("channel-count");
            qVar.f1756y = mediaFormat.getInteger("sample-rate");
            rVar = new androidx.media3.common.r(qVar);
            if (this.f8458b1 && rVar.U == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            this.Z0.b(rVar, iArr);
        } catch (i e4) {
            throw k(e4, e4.f8526a, false, 5001);
        }
    }

    @Override // l5.r
    public final void U() {
        this.Z0.getClass();
    }

    @Override // l5.r
    public final void W() {
        this.Z0.G = true;
    }

    @Override // l5.r
    public final void X(c5.g gVar) {
        if (!this.f8462f1 || gVar.g(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(gVar.f3308y - this.f8461e1) > 500000) {
            this.f8461e1 = gVar.f3308y;
        }
        this.f8462f1 = false;
    }

    @Override // l5.r
    public final boolean Z(long j, long j7, l5.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j10, boolean z10, boolean z11, androidx.media3.common.r rVar) throws d5.f {
        byteBuffer.getClass();
        if (this.f8460d1 != null && (i11 & 2) != 0) {
            kVar.getClass();
            kVar.g(i10, false);
            return true;
        }
        z zVar = this.Z0;
        if (z10) {
            if (kVar != null) {
                kVar.g(i10, false);
            }
            this.S0.f6940f += i12;
            zVar.G = true;
            return true;
        }
        try {
            if (!zVar.j(byteBuffer, j10, i12)) {
                return false;
            }
            if (kVar != null) {
                kVar.g(i10, false);
            }
            this.S0.f6939e += i12;
            return true;
        } catch (j e4) {
            throw k(e4, this.f8459c1, e4.f8533d, 5001);
        } catch (k e10) {
            throw k(e10, rVar, e10.f8535d, 5002);
        }
    }

    @Override // d5.f0
    public final long a() {
        if (this.f6930y == 2) {
            p0();
        }
        return this.f8461e1;
    }

    @Override // l5.r, d5.u0
    public final boolean b() {
        return this.Z0.k() || super.b();
    }

    @Override // l5.r, d5.b, d5.u0
    public final boolean c() {
        if (!this.O0) {
            return false;
        }
        z zVar = this.Z0;
        if (zVar.m()) {
            return zVar.S && !zVar.k();
        }
        return true;
    }

    @Override // l5.r
    public final void c0() throws IllegalStateException, d5.f {
        try {
            z zVar = this.Z0;
            if (!zVar.S && zVar.m() && zVar.c()) {
                zVar.o();
                zVar.S = true;
            }
        } catch (k e4) {
            throw k(e4, e4.f8536g, e4.f8535d, 5002);
        }
    }

    @Override // d5.b, d5.r0
    public final void e(int i10, Object obj) throws IllegalStateException {
        z zVar = this.Z0;
        if (i10 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (zVar.J != fFloatValue) {
                zVar.J = fFloatValue;
                if (zVar.m()) {
                    if (a5.d0.f105a >= 21) {
                        zVar.f8625u.setVolume(zVar.J);
                        return;
                    }
                    AudioTrack audioTrack = zVar.f8625u;
                    float f10 = zVar.J;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            androidx.media3.common.f fVar = (androidx.media3.common.f) obj;
            if (zVar.f8626v.equals(fVar)) {
                return;
            }
            zVar.f8626v = fVar;
            if (zVar.Z) {
                return;
            }
            zVar.d();
            return;
        }
        if (i10 == 6) {
            androidx.media3.common.g gVar = (androidx.media3.common.g) obj;
            if (zVar.X.equals(gVar)) {
                return;
            }
            gVar.getClass();
            if (zVar.f8625u != null) {
                zVar.X.getClass();
            }
            zVar.X = gVar;
            return;
        }
        switch (i10) {
            case 9:
                zVar.r(zVar.g().f8591a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (zVar.W != iIntValue) {
                    zVar.W = iIntValue;
                    zVar.V = iIntValue != 0;
                    zVar.d();
                    break;
                }
                break;
            case 11:
                this.f8465i1 = (d5.a0) obj;
                break;
            case 12:
                if (a5.d0.f105a >= 23) {
                    c0.a(zVar, obj);
                    break;
                }
                break;
        }
    }

    @Override // d5.u0, d5.v0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // d5.f0
    public final n0 getPlaybackParameters() {
        z zVar = this.Z0;
        return zVar.k ? zVar.f8629y : zVar.g().f8591a;
    }

    @Override // l5.r
    public final boolean i0(androidx.media3.common.r rVar) {
        return this.Z0.f(rVar) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if ((r5.isEmpty() ? null : (l5.n) r5.get(0)) != null) goto L30;
     */
    @Override // l5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int j0(l5.s r14, androidx.media3.common.r r15) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d0.j0(l5.s, androidx.media3.common.r):int");
    }

    @Override // l5.r, d5.b
    public final void m() {
        io.sentry.internal.debugmeta.c cVar = this.Y0;
        this.f8464h1 = true;
        this.f8459c1 = null;
        try {
            this.Z0.d();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.m();
                throw th2;
            } finally {
            }
        }
    }

    @Override // d5.b
    public final void n(boolean z10, boolean z11) throws IllegalStateException {
        d5.c cVar = new d5.c();
        this.S0 = cVar;
        io.sentry.internal.debugmeta.c cVar2 = this.Y0;
        Handler handler = (Handler) cVar2.f12353d;
        if (handler != null) {
            handler.post(new c(cVar2, cVar, 0));
        }
        w0 w0Var = this.f6927g;
        w0Var.getClass();
        boolean z12 = w0Var.f7097a;
        z zVar = this.Z0;
        if (z12) {
            zVar.getClass();
            a5.a.i(a5.d0.f105a >= 21);
            a5.a.i(zVar.V);
            if (!zVar.Z) {
                zVar.Z = true;
                zVar.d();
            }
        } else if (zVar.Z) {
            zVar.Z = false;
            zVar.d();
        }
        o0 o0Var = this.f6929x;
        o0Var.getClass();
        zVar.f8621q = o0Var;
    }

    public final int n0(l5.n nVar, androidx.media3.common.r rVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f14723a) || (i10 = a5.d0.f105a) >= 24 || (i10 == 23 && a5.d0.E(this.X0))) {
            return rVar.I;
        }
        return -1;
    }

    @Override // l5.r, d5.b
    public final void o(long j, boolean z10) throws Exception {
        super.o(j, z10);
        this.Z0.d();
        this.f8461e1 = j;
        this.f8462f1 = true;
        this.f8463g1 = true;
    }

    @Override // d5.b
    public final void p() throws IllegalStateException {
        z zVar = this.Z0;
        try {
            try {
                z();
                b0();
                h7.h0 h0Var = this.V;
                if (h0Var != null) {
                    h0Var.U(null);
                }
                this.V = null;
            } catch (Throwable th2) {
                h7.h0 h0Var2 = this.V;
                if (h0Var2 != null) {
                    h0Var2.U(null);
                }
                this.V = null;
                throw th2;
            }
        } finally {
            if (this.f8464h1) {
                this.f8464h1 = false;
                zVar.q();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0238 A[Catch: Exception -> 0x024e, TRY_LEAVE, TryCatch #0 {Exception -> 0x024e, blocks: (B:92:0x0213, B:94:0x0238), top: B:165:0x0213 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0() {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d0.p0():void");
    }

    @Override // d5.b
    public final void q() throws IllegalStateException {
        z zVar = this.Z0;
        zVar.U = true;
        if (zVar.m()) {
            n nVar = zVar.f8615i.f8554f;
            nVar.getClass();
            nVar.a();
            zVar.f8625u.play();
        }
    }

    @Override // d5.b
    public final void r() throws IllegalStateException {
        p0();
        z zVar = this.Z0;
        zVar.U = false;
        if (zVar.m()) {
            o oVar = zVar.f8615i;
            oVar.c();
            if (oVar.f8571y == -9223372036854775807L) {
                n nVar = oVar.f8554f;
                nVar.getClass();
                nVar.a();
                zVar.f8625u.pause();
            }
        }
    }

    @Override // d5.f0
    public final void setPlaybackParameters(n0 n0Var) {
        z zVar = this.Z0;
        zVar.getClass();
        n0 n0Var2 = new n0(a5.d0.g(n0Var.f1725a, 0.1f, 8.0f), a5.d0.g(n0Var.f1726d, 0.1f, 8.0f));
        if (!zVar.k || a5.d0.f105a < 23) {
            zVar.r(n0Var2, zVar.g().f8592b);
        } else {
            zVar.s(n0Var2);
        }
    }

    @Override // l5.r
    public final d5.d x(l5.n nVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2) {
        d5.d dVarB = nVar.b(rVar, rVar2);
        int i10 = dVarB.f6953e;
        if (n0(nVar, rVar2) > this.f8457a1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new d5.d(nVar.f14723a, rVar, rVar2, i11 != 0 ? 0 : dVarB.f6952d, i11);
    }

    @Override // d5.b, d5.u0
    public final d5.f0 i() {
        return this;
    }
}
