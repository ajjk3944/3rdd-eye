package s5;

import a5.d0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.h1;
import androidx.media3.common.j0;
import androidx.media3.common.k;
import androidx.media3.common.q;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import d5.v0;
import d5.w;
import d5.w0;
import e2.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l5.l;
import l5.n;
import l5.r;
import l5.s;
import l5.v;
import l5.z;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.u0;

/* loaded from: classes.dex */
public final class c extends r {
    public static final int[] H1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean I1;
    public static boolean J1;
    public int A1;
    public float B1;
    public h1 C1;
    public boolean D1;
    public int E1;
    public rb.f F1;
    public d G1;
    public final Context X0;
    public final h Y0;
    public final q3.a Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final long f21873a1;

    /* renamed from: b1, reason: collision with root package name */
    public final int f21874b1;

    /* renamed from: c1, reason: collision with root package name */
    public final boolean f21875c1;

    /* renamed from: d1, reason: collision with root package name */
    public kc.c f21876d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f21877e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f21878f1;

    /* renamed from: g1, reason: collision with root package name */
    public Surface f21879g1;

    /* renamed from: h1, reason: collision with root package name */
    public PlaceholderSurface f21880h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f21881i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f21882j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f21883k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f21884l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f21885m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f21886n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f21887o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f21888p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f21889q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f21890r1;
    public int s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f21891t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f21892u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f21893v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f21894w1;

    /* renamed from: x1, reason: collision with root package name */
    public long f21895x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f21896y1;
    public int z1;

    public c(Context context, l5.j jVar, Handler handler, w wVar) {
        super(2, jVar, 30.0f);
        this.f21873a1 = 5000L;
        this.f21874b1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.X0 = applicationContext;
        this.Y0 = new h(applicationContext);
        this.Z0 = new q3.a(handler, 6, wVar);
        this.f21875c1 = "NVIDIA".equals(d0.f107c);
        this.f21887o1 = -9223372036854775807L;
        this.f21896y1 = -1;
        this.z1 = -1;
        this.B1 = -1.0f;
        this.f21882j1 = 1;
        this.E1 = 0;
        this.C1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.o0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int p0(l5.n r10, androidx.media3.common.r r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.p0(l5.n, androidx.media3.common.r):int");
    }

    public static h0 q0(Context context, s sVar, androidx.media3.common.r rVar, boolean z10, boolean z11) {
        String str = rVar.H;
        if (str == null) {
            f0 f0Var = h0.f19336d;
            return u0.f19383x;
        }
        sVar.getClass();
        List listE = z.e(str, z10, z11);
        String strB = z.b(rVar);
        if (strB == null) {
            return h0.l(listE);
        }
        List listE2 = z.e(strB, z10, z11);
        if (d0.f105a >= 26 && "video/dolby-vision".equals(rVar.H) && !listE2.isEmpty() && !b.a(context)) {
            return h0.l(listE2);
        }
        f0 f0Var2 = h0.f19336d;
        e0 e0Var = new e0();
        e0Var.c(listE);
        e0Var.c(listE2);
        return e0Var.d();
    }

    public static int r0(n nVar, androidx.media3.common.r rVar) {
        int i10 = rVar.I;
        List list = rVar.J;
        if (i10 == -1) {
            return p0(nVar, rVar);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return rVar.I + length;
    }

    public final void A0(long j) {
        d5.c cVar = this.S0;
        cVar.k += j;
        cVar.f6944l++;
        this.f21893v1 += j;
        this.f21894w1++;
    }

    @Override // l5.r
    public final boolean G() {
        return this.D1 && d0.f105a < 23;
    }

    @Override // l5.r
    public final float H(float f10, androidx.media3.common.r[] rVarArr) {
        float fMax = -1.0f;
        for (androidx.media3.common.r rVar : rVarArr) {
            float f11 = rVar.O;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // l5.r
    public final ArrayList I(s sVar, androidx.media3.common.r rVar, boolean z10) {
        h0 h0VarQ0 = q0(this.X0, sVar, rVar, z10, this.D1);
        Pattern pattern = z.f14773a;
        ArrayList arrayList = new ArrayList(h0VarQ0);
        Collections.sort(arrayList, new t(1, new io.sentry.android.replay.capture.e(14, rVar)));
        return arrayList;
    }

    @Override // l5.r
    public final l5.i K(n nVar, androidx.media3.common.r rVar, MediaCrypto mediaCrypto, float f10) {
        int i10;
        k kVar;
        kc.c cVar;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        char c4;
        boolean z10;
        Pair pairD;
        int iP0;
        PlaceholderSurface placeholderSurface = this.f21880h1;
        if (placeholderSurface != null && placeholderSurface.f1943a != nVar.f14728f) {
            if (this.f21879g1 == placeholderSurface) {
                this.f21879g1 = null;
            }
            placeholderSurface.release();
            this.f21880h1 = null;
        }
        String str = nVar.f14725c;
        androidx.media3.common.r[] rVarArr = this.D;
        rVarArr.getClass();
        int i12 = rVar.M;
        float f11 = rVar.O;
        int i13 = rVar.N;
        k kVar2 = rVar.T;
        int iR0 = r0(nVar, rVar);
        if (rVarArr.length == 1) {
            if (iR0 != -1 && (iP0 = p0(nVar, rVar)) != -1) {
                iR0 = Math.min((int) (iR0 * 1.5f), iP0);
            }
            cVar = new kc.c(i12, i13, iR0);
            i10 = i13;
            kVar = kVar2;
        } else {
            int length = rVarArr.length;
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z11 = false;
            while (i14 < length) {
                androidx.media3.common.r rVar2 = rVarArr[i14];
                int i15 = i14;
                if (kVar2 != null && rVar2.T == null) {
                    q qVarA = rVar2.a();
                    qVarA.f1754w = kVar2;
                    rVar2 = new androidx.media3.common.r(qVarA);
                }
                d5.d dVarB = nVar.b(rVar, rVar2);
                androidx.media3.common.r[] rVarArr2 = rVarArr;
                int i16 = rVar2.N;
                if (dVarB.f6952d != 0) {
                    int i17 = rVar2.M;
                    i11 = length;
                    c4 = 65535;
                    z11 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iR0 = Math.max(iR0, r0(nVar, rVar2));
                } else {
                    i11 = length;
                    c4 = 65535;
                }
                i14 = i15 + 1;
                rVarArr = rVarArr2;
                length = i11;
            }
            if (z11) {
                a5.a.B("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i13 > i12;
                int i18 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i19 = z12 ? i12 : i13;
                float f12 = i19 / i18;
                kVar = kVar2;
                int i20 = 0;
                while (i20 < 9) {
                    int i21 = H1[i20];
                    int i22 = i20;
                    int i23 = (int) (i21 * f12);
                    if (i21 <= i18 || i23 <= i19) {
                        break;
                    }
                    int i24 = i19;
                    int i25 = i18;
                    if (d0.f105a >= 21) {
                        int i26 = z13 ? i23 : i21;
                        if (!z13) {
                            i21 = i23;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f14726d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(d0.f(i26, widthAlignment) * widthAlignment, d0.f(i21, heightAlignment) * heightAlignment);
                        }
                        i10 = i13;
                        if (nVar.f(f11, point2.x, point2.y)) {
                            point = point2;
                            break;
                        }
                        i20 = i22 + 1;
                        i13 = i10;
                        i19 = i24;
                        i18 = i25;
                    } else {
                        i10 = i13;
                        try {
                            int iF = d0.f(i21, 16) * 16;
                            int iF2 = d0.f(i23, 16) * 16;
                            if (iF * iF2 <= z.i()) {
                                int i27 = z13 ? iF2 : iF;
                                if (!z13) {
                                    iF = iF2;
                                }
                                point2 = new Point(i27, iF);
                                point = point2;
                                break;
                            }
                            i20 = i22 + 1;
                            i13 = i10;
                            i19 = i24;
                            i18 = i25;
                        } catch (v unused) {
                        }
                    }
                }
                i10 = i13;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    q qVarA2 = rVar.a();
                    qVarA2.f1747p = iMax;
                    qVarA2.f1748q = iMax2;
                    iR0 = Math.max(iR0, p0(nVar, new androidx.media3.common.r(qVarA2)));
                    a5.a.B("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i10 = i13;
                kVar = kVar2;
            }
            cVar = new kc.c(iMax, iMax2, iR0);
        }
        this.f21876d1 = cVar;
        int i28 = this.D1 ? this.E1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i10);
        a5.a.A(mediaFormat, rVar.J);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        a5.a.w(mediaFormat, "rotation-degrees", rVar.P);
        if (kVar != null) {
            k kVar3 = kVar;
            a5.a.w(mediaFormat, "color-transfer", kVar3.f1711g);
            a5.a.w(mediaFormat, "color-standard", kVar3.f1709a);
            a5.a.w(mediaFormat, "color-range", kVar3.f1710d);
            byte[] bArr = kVar3.f1712r;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(rVar.H) && (pairD = z.d(rVar)) != null) {
            a5.a.w(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f14269a);
        mediaFormat.setInteger("max-height", cVar.f14270b);
        a5.a.w(mediaFormat, "max-input-size", cVar.f14271c);
        if (d0.f105a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f21875c1) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (this.f21879g1 == null) {
            if (!x0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.f21880h1 == null) {
                this.f21880h1 = PlaceholderSurface.f(this.X0, nVar.f14728f);
            }
            this.f21879g1 = this.f21880h1;
        }
        return new l5.i(nVar, mediaFormat, rVar, this.f21879g1, mediaCrypto);
    }

    @Override // l5.r
    public final void L(c5.g gVar) {
        if (this.f21878f1) {
            ByteBuffer byteBuffer = gVar.B;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s8 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        l5.k kVar = this.f14740b0;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // l5.r
    public final void P(Exception exc) {
        a5.a.n("MediaCodecVideoRenderer", "Video codec error", exc);
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 28, exc));
        }
    }

    @Override // l5.r
    public final void Q(String str, long j, long j7) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            str2 = str;
            handler.post(new f5.e(aVar, str2, j, j7, 2));
        } else {
            str2 = str;
        }
        this.f21877e1 = o0(str2);
        n nVar = this.f14747i0;
        nVar.getClass();
        boolean z10 = false;
        if (d0.f105a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f14724b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f14726d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f21878f1 = z10;
        if (d0.f105a < 23 || !this.D1) {
            return;
        }
        l5.k kVar = this.f14740b0;
        kVar.getClass();
        this.F1 = new rb.f(this, kVar);
    }

    @Override // l5.r
    public final void R(String str) {
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 29, str));
        }
    }

    @Override // l5.r
    public final d5.d S(io.sentry.internal.debugmeta.c cVar) throws Exception {
        d5.d dVarS = super.S(cVar);
        androidx.media3.common.r rVar = (androidx.media3.common.r) cVar.f12354g;
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new ch.a(aVar, rVar, dVarS, 17));
        }
        return dVarS;
    }

    @Override // l5.r
    public final void T(androidx.media3.common.r rVar, MediaFormat mediaFormat) {
        l5.k kVar = this.f14740b0;
        if (kVar != null) {
            kVar.setVideoScalingMode(this.f21882j1);
        }
        if (this.D1) {
            this.f21896y1 = rVar.M;
            this.z1 = rVar.N;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f21896y1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.z1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = rVar.Q;
        int i10 = rVar.P;
        this.B1 = f10;
        if (d0.f105a < 21) {
            this.A1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.f21896y1;
            this.f21896y1 = this.z1;
            this.z1 = i11;
            this.B1 = 1.0f / f10;
        }
        float f11 = rVar.O;
        h hVar = this.Y0;
        hVar.f21907f = f11;
        rb.d dVar = hVar.f21902a;
        ((rb.c) dVar.f21455d).c();
        ((rb.c) dVar.f21456e).c();
        dVar.f21452a = false;
        dVar.f21453b = -9223372036854775807L;
        dVar.f21454c = 0;
        hVar.b();
    }

    @Override // l5.r
    public final void V(long j) {
        super.V(j);
        if (this.D1) {
            return;
        }
        this.s1--;
    }

    @Override // l5.r
    public final void W() {
        n0();
    }

    @Override // l5.r
    public final void X(c5.g gVar) {
        boolean z10 = this.D1;
        if (!z10) {
            this.s1++;
        }
        if (d0.f105a >= 23 || !z10) {
            return;
        }
        long j = gVar.f3308y;
        m0(j);
        u0();
        this.S0.f6939e++;
        t0();
        V(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // l5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z(long r31, long r33, l5.k r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, androidx.media3.common.r r44) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.Z(long, long, l5.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.r):boolean");
    }

    @Override // l5.r, d5.u0
    public final boolean b() {
        PlaceholderSurface placeholderSurface;
        if (super.b() && (this.f21883k1 || (((placeholderSurface = this.f21880h1) != null && this.f21879g1 == placeholderSurface) || this.f14740b0 == null || this.D1))) {
            this.f21887o1 = -9223372036854775807L;
            return true;
        }
        if (this.f21887o1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f21887o1) {
            return true;
        }
        this.f21887o1 = -9223372036854775807L;
        return false;
    }

    @Override // l5.r
    public final void d0() {
        super.d0();
        this.s1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.Surface] */
    @Override // d5.b, d5.r0
    public final void e(int i10, Object obj) throws Exception {
        Handler handler;
        Handler handler2;
        int iIntValue;
        h hVar = this.Y0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.G1 = (d) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.E1 != iIntValue2) {
                    this.E1 = iIntValue2;
                    if (this.D1) {
                        b0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && hVar.j != (iIntValue = ((Integer) obj).intValue())) {
                    hVar.j = iIntValue;
                    hVar.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f21882j1 = iIntValue3;
            l5.k kVar = this.f14740b0;
            if (kVar != null) {
                kVar.setVideoScalingMode(iIntValue3);
                return;
            }
            return;
        }
        PlaceholderSurface placeholderSurfaceF = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceF == null) {
            PlaceholderSurface placeholderSurface = this.f21880h1;
            if (placeholderSurface != null) {
                placeholderSurfaceF = placeholderSurface;
            } else {
                n nVar = this.f14747i0;
                if (nVar != null && x0(nVar)) {
                    placeholderSurfaceF = PlaceholderSurface.f(this.X0, nVar.f14728f);
                    this.f21880h1 = placeholderSurfaceF;
                }
            }
        }
        Surface surface = this.f21879g1;
        q3.a aVar = this.Z0;
        if (surface == placeholderSurfaceF) {
            if (placeholderSurfaceF == null || placeholderSurfaceF == this.f21880h1) {
                return;
            }
            h1 h1Var = this.C1;
            if (h1Var != null && (handler = (Handler) aVar.f20679d) != null) {
                handler.post(new io.sentry.cache.e(aVar, 27, h1Var));
            }
            if (this.f21881i1) {
                Surface surface2 = this.f21879g1;
                Handler handler3 = (Handler) aVar.f20679d;
                if (handler3 != null) {
                    handler3.post(new io.sentry.android.core.z(aVar, surface2, SystemClock.elapsedRealtime(), 3));
                    return;
                }
                return;
            }
            return;
        }
        this.f21879g1 = placeholderSurfaceF;
        hVar.getClass();
        PlaceholderSurface placeholderSurface2 = placeholderSurfaceF instanceof PlaceholderSurface ? null : placeholderSurfaceF;
        if (hVar.f21906e != placeholderSurface2) {
            hVar.a();
            hVar.f21906e = placeholderSurface2;
            hVar.c(true);
        }
        this.f21881i1 = false;
        int i11 = this.f6930y;
        l5.k kVar2 = this.f14740b0;
        if (kVar2 != null) {
            if (d0.f105a < 23 || placeholderSurfaceF == null || this.f21877e1) {
                b0();
                N();
            } else {
                kVar2.i(placeholderSurfaceF);
            }
        }
        if (placeholderSurfaceF == null || placeholderSurfaceF == this.f21880h1) {
            this.C1 = null;
            n0();
            return;
        }
        h1 h1Var2 = this.C1;
        if (h1Var2 != null && (handler2 = (Handler) aVar.f20679d) != null) {
            handler2.post(new io.sentry.cache.e(aVar, 27, h1Var2));
        }
        n0();
        if (i11 == 2) {
            long j = this.f21873a1;
            this.f21887o1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // l5.r, d5.u0
    public final void g(float f10, float f11) throws Exception {
        super.g(f10, f11);
        h hVar = this.Y0;
        hVar.f21910i = f10;
        hVar.f21912m = 0L;
        hVar.f21915p = -1L;
        hVar.f21913n = -1L;
        hVar.c(false);
    }

    @Override // d5.u0, d5.v0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // l5.r
    public final boolean h0(n nVar) {
        return this.f21879g1 != null || x0(nVar);
    }

    @Override // l5.r
    public final int j0(s sVar, androidx.media3.common.r rVar) {
        boolean z10;
        int i10 = 0;
        if (!j0.j(rVar.H)) {
            return v0.f(0, 0, 0);
        }
        int i11 = 1;
        boolean z11 = rVar.K != null;
        Context context = this.X0;
        h0 h0VarQ0 = q0(context, sVar, rVar, z11, false);
        if (z11 && h0VarQ0.isEmpty()) {
            h0VarQ0 = q0(context, sVar, rVar, false, false);
        }
        if (h0VarQ0.isEmpty()) {
            return v0.f(1, 0, 0);
        }
        int i12 = rVar.f1783c0;
        if (i12 != 0 && i12 != 2) {
            return v0.f(2, 0, 0);
        }
        n nVar = (n) h0VarQ0.get(0);
        boolean zD = nVar.d(rVar);
        if (zD) {
            z10 = true;
        } else {
            for (int i13 = 1; i13 < h0VarQ0.size(); i13++) {
                n nVar2 = (n) h0VarQ0.get(i13);
                if (nVar2.d(rVar)) {
                    z10 = false;
                    zD = true;
                    nVar = nVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i14 = zD ? 4 : 3;
        int i15 = nVar.e(rVar) ? 16 : 8;
        int i16 = nVar.f14729g ? 64 : 0;
        int i17 = z10 ? 128 : 0;
        if (d0.f105a >= 26 && "video/dolby-vision".equals(rVar.H) && !b.a(context)) {
            i17 = 256;
        }
        if (zD) {
            h0 h0VarQ02 = q0(context, sVar, rVar, z11, true);
            if (!h0VarQ02.isEmpty()) {
                Pattern pattern = z.f14773a;
                ArrayList arrayList = new ArrayList(h0VarQ02);
                Collections.sort(arrayList, new t(i11, new io.sentry.android.replay.capture.e(14, rVar)));
                n nVar3 = (n) arrayList.get(0);
                if (nVar3.d(rVar) && nVar3.e(rVar)) {
                    i10 = 32;
                }
            }
        }
        return i14 | i15 | i10 | i16 | i17;
    }

    @Override // l5.r, d5.b
    public final void m() {
        q3.a aVar = this.Z0;
        this.C1 = null;
        n0();
        this.f21881i1 = false;
        this.F1 = null;
        try {
            super.m();
            d5.c cVar = this.S0;
            aVar.getClass();
            synchronized (cVar) {
            }
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new j(aVar, cVar, 1));
            }
        } catch (Throwable th2) {
            d5.c cVar2 = this.S0;
            aVar.getClass();
            synchronized (cVar2) {
                Handler handler2 = (Handler) aVar.f20679d;
                if (handler2 != null) {
                    handler2.post(new j(aVar, cVar2, 1));
                }
                throw th2;
            }
        }
    }

    @Override // d5.b
    public final void n(boolean z10, boolean z11) {
        this.S0 = new d5.c();
        w0 w0Var = this.f6927g;
        w0Var.getClass();
        boolean z12 = w0Var.f7097a;
        a5.a.i((z12 && this.E1 == 0) ? false : true);
        if (this.D1 != z12) {
            this.D1 = z12;
            b0();
        }
        d5.c cVar = this.S0;
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new j(aVar, cVar, 0));
        }
        this.f21884l1 = z11;
        this.f21885m1 = false;
    }

    public final void n0() {
        l5.k kVar;
        this.f21883k1 = false;
        if (d0.f105a < 23 || !this.D1 || (kVar = this.f14740b0) == null) {
            return;
        }
        this.F1 = new rb.f(this, kVar);
    }

    @Override // l5.r, d5.b
    public final void o(long j, boolean z10) throws Exception {
        super.o(j, z10);
        n0();
        h hVar = this.Y0;
        hVar.f21912m = 0L;
        hVar.f21915p = -1L;
        hVar.f21913n = -1L;
        this.f21891t1 = -9223372036854775807L;
        this.f21886n1 = -9223372036854775807L;
        this.f21890r1 = 0;
        if (!z10) {
            this.f21887o1 = -9223372036854775807L;
        } else {
            long j7 = this.f21873a1;
            this.f21887o1 = j7 > 0 ? SystemClock.elapsedRealtime() + j7 : -9223372036854775807L;
        }
    }

    @Override // d5.b
    public final void p() {
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
            PlaceholderSurface placeholderSurface = this.f21880h1;
            if (placeholderSurface != null) {
                if (this.f21879g1 == placeholderSurface) {
                    this.f21879g1 = null;
                }
                placeholderSurface.release();
                this.f21880h1 = null;
            }
        }
    }

    @Override // d5.b
    public final void q() {
        this.f21889q1 = 0;
        this.f21888p1 = SystemClock.elapsedRealtime();
        this.f21892u1 = SystemClock.elapsedRealtime() * 1000;
        this.f21893v1 = 0L;
        this.f21894w1 = 0;
        h hVar = this.Y0;
        hVar.f21905d = true;
        hVar.f21912m = 0L;
        hVar.f21915p = -1L;
        hVar.f21913n = -1L;
        f fVar = hVar.f21903b;
        if (fVar != null) {
            g gVar = hVar.f21904c;
            gVar.getClass();
            gVar.f21899d.sendEmptyMessage(1);
            fVar.b(new io.sentry.android.replay.capture.e(27, hVar));
        }
        hVar.c(false);
    }

    @Override // d5.b
    public final void r() {
        this.f21887o1 = -9223372036854775807L;
        s0();
        int i10 = this.f21894w1;
        if (i10 != 0) {
            long j = this.f21893v1;
            q3.a aVar = this.Z0;
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new i(aVar, j, i10));
            }
            this.f21893v1 = 0L;
            this.f21894w1 = 0;
        }
        h hVar = this.Y0;
        hVar.f21905d = false;
        f fVar = hVar.f21903b;
        if (fVar != null) {
            fVar.a();
            g gVar = hVar.f21904c;
            gVar.getClass();
            gVar.f21899d.sendEmptyMessage(2);
        }
        hVar.a();
    }

    public final void s0() {
        if (this.f21889q1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f21888p1;
            int i10 = this.f21889q1;
            q3.a aVar = this.Z0;
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new i(aVar, i10, j));
            }
            this.f21889q1 = 0;
            this.f21888p1 = jElapsedRealtime;
        }
    }

    public final void t0() {
        this.f21885m1 = true;
        if (this.f21883k1) {
            return;
        }
        this.f21883k1 = true;
        Surface surface = this.f21879g1;
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.android.core.z(aVar, surface, SystemClock.elapsedRealtime(), 3));
        }
        this.f21881i1 = true;
    }

    public final void u0() {
        int i10 = this.f21896y1;
        if (i10 == -1 && this.z1 == -1) {
            return;
        }
        h1 h1Var = this.C1;
        if (h1Var != null && h1Var.f1695a == i10 && h1Var.f1696d == this.z1 && h1Var.f1697g == this.A1 && h1Var.f1698r == this.B1) {
            return;
        }
        h1 h1Var2 = new h1(this.f21896y1, this.z1, this.A1, this.B1);
        this.C1 = h1Var2;
        q3.a aVar = this.Z0;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 27, h1Var2));
        }
    }

    public final void v0(l5.k kVar, int i10) {
        u0();
        a5.a.b("releaseOutputBuffer");
        kVar.g(i10, true);
        a5.a.o();
        this.f21892u1 = SystemClock.elapsedRealtime() * 1000;
        this.S0.f6939e++;
        this.f21890r1 = 0;
        t0();
    }

    public final void w0(l5.k kVar, int i10, long j) {
        u0();
        a5.a.b("releaseOutputBuffer");
        kVar.d(i10, j);
        a5.a.o();
        this.f21892u1 = SystemClock.elapsedRealtime() * 1000;
        this.S0.f6939e++;
        this.f21890r1 = 0;
        t0();
    }

    @Override // l5.r
    public final d5.d x(n nVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2) {
        d5.d dVarB = nVar.b(rVar, rVar2);
        int i10 = dVarB.f6953e;
        int i11 = rVar2.M;
        kc.c cVar = this.f21876d1;
        if (i11 > cVar.f14269a || rVar2.N > cVar.f14270b) {
            i10 |= 256;
        }
        if (r0(nVar, rVar2) > this.f21876d1.f14271c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new d5.d(nVar.f14723a, rVar, rVar2, i12 != 0 ? 0 : dVarB.f6952d, i12);
    }

    public final boolean x0(n nVar) {
        if (d0.f105a < 23 || this.D1 || o0(nVar.f14723a)) {
            return false;
        }
        return !nVar.f14728f || PlaceholderSurface.e(this.X0);
    }

    @Override // l5.r
    public final l y(IllegalStateException illegalStateException, n nVar) {
        Surface surface = this.f21879g1;
        a aVar = new a(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return aVar;
    }

    public final void y0(l5.k kVar, int i10) {
        a5.a.b("skipVideoBuffer");
        kVar.g(i10, false);
        a5.a.o();
        this.S0.f6940f++;
    }

    public final void z0(int i10, int i11) {
        d5.c cVar = this.S0;
        cVar.f6942h += i10;
        int i12 = i10 + i11;
        cVar.f6941g += i12;
        this.f21889q1 += i12;
        int i13 = this.f21890r1 + i12;
        this.f21890r1 = i13;
        cVar.f6943i = Math.max(i13, cVar.f6943i);
        int i14 = this.f21874b1;
        if (i14 <= 0 || this.f21889q1 < i14) {
            return;
        }
        s0();
    }
}
