package rb;

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
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.m1;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import io.sentry.android.core.e0;
import io.sentry.android.core.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l5.a0;

/* loaded from: classes.dex */
public final class g extends oa.e {
    public static final int[] I1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean J1;
    public static boolean K1;
    public int A1;
    public int B1;
    public float C1;
    public v D1;
    public boolean E1;
    public int F1;
    public f G1;
    public l H1;
    public final Context Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final q f21460a1;

    /* renamed from: b1, reason: collision with root package name */
    public final q3.a f21461b1;

    /* renamed from: c1, reason: collision with root package name */
    public final long f21462c1;

    /* renamed from: d1, reason: collision with root package name */
    public final int f21463d1;

    /* renamed from: e1, reason: collision with root package name */
    public final boolean f21464e1;

    /* renamed from: f1, reason: collision with root package name */
    public kc.c f21465f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f21466g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f21467h1;

    /* renamed from: i1, reason: collision with root package name */
    public Surface f21468i1;

    /* renamed from: j1, reason: collision with root package name */
    public DummySurface f21469j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f21470k1;

    /* renamed from: l1, reason: collision with root package name */
    public int f21471l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f21472m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f21473n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f21474o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f21475p1;

    /* renamed from: q1, reason: collision with root package name */
    public long f21476q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f21477r1;
    public int s1;

    /* renamed from: t1, reason: collision with root package name */
    public int f21478t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f21479u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f21480v1;

    /* renamed from: w1, reason: collision with root package name */
    public long f21481w1;

    /* renamed from: x1, reason: collision with root package name */
    public long f21482x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f21483y1;
    public int z1;

    public g(Context context, Handler handler, u uVar) {
        super(2, 30.0f);
        this.f21462c1 = 5000L;
        this.f21463d1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.Z0 = applicationContext;
        this.f21460a1 = new q(applicationContext);
        this.f21461b1 = new q3.a(handler, 3, uVar);
        this.f21464e1 = "NVIDIA".equals(qb.v.f20830c);
        this.f21476q1 = -9223372036854775807L;
        this.z1 = -1;
        this.A1 = -1;
        this.C1 = -1.0f;
        this.f21471l1 = 1;
        this.F1 = 0;
        this.D1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0839  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 3072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.g.m0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int n0(oa.c r10, com.google.android.exoplayer2.Format r11) {
        /*
            int r0 = r11.M
            int r1 = r11.N
            r2 = -1
            if (r0 == r2) goto Lc1
            if (r1 != r2) goto Lb
            goto Lc1
        Lb:
            java.lang.String r3 = r11.H
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = oa.k.c(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.getClass()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = r2
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = r4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = r9
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = r8
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto L81;
                case 1: goto Lbc;
                case 2: goto L81;
                case 3: goto L84;
                case 4: goto L81;
                case 5: goto Lbc;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            int r0 = r0 * r1
        L82:
            r4 = r8
            goto Lbd
        L84:
            java.lang.String r11 = qb.v.f20831d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "Amazon"
            java.lang.String r4 = qb.v.f20830c
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lad
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lad
            boolean r10 = r10.f19174f
            if (r10 == 0) goto Lad
            goto Lbb
        Lad:
            r10 = 16
            int r11 = qb.v.f(r0, r10)
            int r10 = qb.v.f(r1, r10)
            int r10 = r10 * r11
            int r0 = r10 * 256
            goto L82
        Lbb:
            return r2
        Lbc:
            int r0 = r0 * r1
        Lbd:
            int r0 = r0 * r9
            int r4 = r4 * r8
            int r0 = r0 / r4
            return r0
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.g.n0(oa.c, com.google.android.exoplayer2.Format):int");
    }

    public static List o0(oa.f fVar, Format format, boolean z10, boolean z11) {
        Pair pairC;
        String str = format.H;
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        fVar.getClass();
        ArrayList arrayList = new ArrayList(oa.k.d(str, z10, z11));
        Collections.sort(arrayList, new e2.t(3, new io.sentry.android.replay.capture.e(20, format)));
        if ("video/dolby-vision".equals(str) && (pairC = oa.k.c(format)) != null) {
            int iIntValue = ((Integer) pairC.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                arrayList.addAll(oa.k.d("video/hevc", z10, z11));
            } else if (iIntValue == 512) {
                arrayList.addAll(oa.k.d("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static int p0(oa.c cVar, Format format) {
        int i10 = format.I;
        List list = format.J;
        if (i10 == -1) {
            return n0(cVar, format);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return format.I + length;
    }

    @Override // oa.e
    public final boolean G() {
        return this.E1 && qb.v.f20828a < 23;
    }

    @Override // oa.e
    public final float H(float f10, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f11 = format.O;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // oa.e
    public final List I(oa.f fVar, Format format, boolean z10) {
        return o0(fVar, format, z10, this.E1);
    }

    @Override // oa.e
    public final js.e K(oa.c cVar, Format format, MediaCrypto mediaCrypto, float f10) {
        int i10;
        ColorInfo colorInfo;
        kc.c cVar2;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        char c4;
        boolean z10;
        Pair pairC;
        int iN0;
        DummySurface dummySurface = this.f21469j1;
        if (dummySurface != null && dummySurface.f4762a != cVar.f19174f) {
            dummySurface.release();
            this.f21469j1 = null;
        }
        String str = cVar.f19171c;
        Format[] formatArr = this.B;
        formatArr.getClass();
        int i12 = format.M;
        float f11 = format.O;
        int i13 = format.N;
        ColorInfo colorInfo2 = format.T;
        int iP0 = p0(cVar, format);
        if (formatArr.length == 1) {
            if (iP0 != -1 && (iN0 = n0(cVar, format)) != -1) {
                iP0 = Math.min((int) (iP0 * 1.5f), iN0);
            }
            cVar2 = new kc.c(i12, i13, iP0);
            i10 = i13;
            colorInfo = colorInfo2;
        } else {
            int length = formatArr.length;
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z11 = false;
            while (i14 < length) {
                Format format2 = formatArr[i14];
                int i15 = i14;
                if (colorInfo2 != null && format2.T == null) {
                    g0 g0VarD = format2.d();
                    g0VarD.f4162w = colorInfo2;
                    format2 = new Format(g0VarD);
                }
                z9.e eVarB = cVar.b(format, format2);
                Format[] formatArr2 = formatArr;
                int i16 = format2.N;
                if (eVarB.f26797d != 0) {
                    int i17 = format2.M;
                    i11 = length;
                    c4 = 65535;
                    z11 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iP0 = Math.max(iP0, p0(cVar, format2));
                } else {
                    i11 = length;
                    c4 = 65535;
                }
                i14 = i15 + 1;
                formatArr = formatArr2;
                length = i11;
            }
            if (z11) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(iMax);
                sb2.append("x");
                sb2.append(iMax2);
                e0.p("MediaCodecVideoRenderer", sb2.toString());
                boolean z12 = i13 > i12;
                int i18 = z12 ? i13 : i12;
                boolean z13 = z12;
                int i19 = z12 ? i12 : i13;
                float f12 = i19 / i18;
                colorInfo = colorInfo2;
                int i20 = 0;
                while (i20 < 9) {
                    int i21 = I1[i20];
                    int i22 = i20;
                    int i23 = (int) (i21 * f12);
                    if (i21 <= i18 || i23 <= i19) {
                        break;
                    }
                    int i24 = i19;
                    int i25 = i18;
                    if (qb.v.f20828a >= 21) {
                        int i26 = z13 ? i23 : i21;
                        if (!z13) {
                            i21 = i23;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f19172d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(qb.v.f(i26, widthAlignment) * widthAlignment, qb.v.f(i21, heightAlignment) * heightAlignment);
                        }
                        i10 = i13;
                        if (cVar.e(f11, point2.x, point2.y)) {
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
                            int iF = qb.v.f(i21, 16) * 16;
                            int iF2 = qb.v.f(i23, 16) * 16;
                            if (iF * iF2 <= oa.k.h()) {
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
                        } catch (oa.h unused) {
                        }
                    }
                }
                i10 = i13;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    g0 g0VarD2 = format.d();
                    g0VarD2.f4155p = iMax;
                    g0VarD2.f4156q = iMax2;
                    iP0 = Math.max(iP0, n0(cVar, new Format(g0VarD2)));
                    StringBuilder sb3 = new StringBuilder(57);
                    sb3.append("Codec max resolution adjusted to: ");
                    sb3.append(iMax);
                    sb3.append("x");
                    sb3.append(iMax2);
                    e0.p("MediaCodecVideoRenderer", sb3.toString());
                }
            } else {
                i10 = i13;
                colorInfo = colorInfo2;
            }
            cVar2 = new kc.c(iMax, iMax2, iP0);
        }
        this.f21465f1 = cVar2;
        int i28 = this.E1 ? this.F1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i10);
        qb.b.H(mediaFormat, format.J);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        qb.b.A(mediaFormat, "rotation-degrees", format.P);
        if (colorInfo != null) {
            ColorInfo colorInfo3 = colorInfo;
            qb.b.A(mediaFormat, "color-transfer", colorInfo3.f4757g);
            qb.b.A(mediaFormat, "color-standard", colorInfo3.f4755a);
            qb.b.A(mediaFormat, "color-range", colorInfo3.f4756d);
            byte[] bArr = colorInfo3.f4758r;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format.H) && (pairC = oa.k.c(format)) != null) {
            qb.b.A(mediaFormat, "profile", ((Integer) pairC.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar2.f14269a);
        mediaFormat.setInteger("max-height", cVar2.f14270b);
        qb.b.A(mediaFormat, "max-input-size", cVar2.f14271c);
        if (qb.v.f20828a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f21464e1) {
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
        if (this.f21468i1 == null) {
            if (!v0(cVar)) {
                throw new IllegalStateException();
            }
            if (this.f21469j1 == null) {
                this.f21469j1 = DummySurface.f(this.Z0, cVar.f19174f);
            }
            this.f21468i1 = this.f21469j1;
        }
        return new js.e(cVar, mediaFormat, this.f21468i1, mediaCrypto, 7);
    }

    @Override // oa.e
    public final void L(z9.d dVar) {
        if (this.f21467h1) {
            ByteBuffer byteBuffer = dVar.B;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s8 == 60 && s10 == 1 && b10 == 4 && b11 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a0 a0Var = this.f19183d0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    a0Var.c(bundle);
                }
            }
        }
    }

    @Override // oa.e
    public final void P(Exception exc) {
        qb.b.q("MediaCodecVideoRenderer", "Video codec error", exc);
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 23, exc));
        }
    }

    @Override // oa.e
    public final void Q(String str, long j, long j7) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            str2 = str;
            handler.post(new f5.e(aVar, str2, j, j7, 1));
        } else {
            str2 = str;
        }
        this.f21466g1 = m0(str2);
        oa.c cVar = this.f19190k0;
        cVar.getClass();
        boolean z10 = false;
        if (qb.v.f20828a >= 29 && "video/x-vnd.on2.vp9".equals(cVar.f19170b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f19172d;
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
        this.f21467h1 = z10;
        if (qb.v.f20828a < 23 || !this.E1) {
            return;
        }
        a0 a0Var = this.f19183d0;
        a0Var.getClass();
        this.G1 = new f(this, a0Var);
    }

    @Override // oa.e
    public final void R(String str) {
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 22, str));
        }
    }

    @Override // oa.e
    public final z9.e S(io.sentry.internal.debugmeta.c cVar) throws com.google.android.exoplayer2.n {
        z9.e eVarS = super.S(cVar);
        Format format = (Format) cVar.f12354g;
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new ch.a(aVar, format, eVarS, 16));
        }
        return eVarS;
    }

    @Override // oa.e
    public final void T(Format format, MediaFormat mediaFormat) {
        a0 a0Var = this.f19183d0;
        if (a0Var != null) {
            a0Var.setVideoScalingMode(this.f21471l1);
        }
        if (this.E1) {
            this.z1 = format.M;
            this.A1 = format.N;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.z1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.A1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = format.Q;
        int i10 = format.P;
        this.C1 = f10;
        if (qb.v.f20828a < 21) {
            this.B1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.z1;
            this.z1 = this.A1;
            this.A1 = i11;
            this.C1 = 1.0f / f10;
        }
        float f11 = format.O;
        q qVar = this.f21460a1;
        qVar.f21507f = f11;
        d dVar = qVar.f21502a;
        ((c) dVar.f21455d).c();
        ((c) dVar.f21456e).c();
        dVar.f21452a = false;
        dVar.f21453b = -9223372036854775807L;
        dVar.f21454c = 0;
        qVar.a();
    }

    @Override // oa.e
    public final void U(long j) {
        super.U(j);
        if (this.E1) {
            return;
        }
        this.f21479u1--;
    }

    @Override // oa.e
    public final void V() {
        l0();
    }

    @Override // oa.e
    public final void W(z9.d dVar) {
        boolean z10 = this.E1;
        if (!z10) {
            this.f21479u1++;
        }
        if (qb.v.f20828a >= 23 || !z10) {
            return;
        }
        long j = dVar.f26793y;
        k0(j);
        s0();
        this.U0.f26783b++;
        r0();
        U(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // oa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(long r31, long r33, l5.a0 r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, com.google.android.exoplayer2.Format r44) throws com.google.android.exoplayer2.n, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.g.Y(long, long, l5.a0, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    @Override // oa.e
    public final void c0() {
        super.c0();
        this.f21479u1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.i1
    public final void e(int i10, Object obj) throws com.google.android.exoplayer2.n {
        Handler handler;
        Handler handler2;
        int iIntValue;
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f21471l1 = iIntValue2;
                a0 a0Var = this.f19183d0;
                if (a0Var != null) {
                    a0Var.setVideoScalingMode(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                this.H1 = (l) obj;
                return;
            }
            if (i10 == 102 && this.F1 != (iIntValue = ((Integer) obj).intValue())) {
                this.F1 = iIntValue;
                if (this.E1) {
                    a0();
                    return;
                }
                return;
            }
            return;
        }
        DummySurface dummySurfaceF = obj instanceof Surface ? (Surface) obj : null;
        if (dummySurfaceF == null) {
            DummySurface dummySurface = this.f21469j1;
            if (dummySurface != null) {
                dummySurfaceF = dummySurface;
            } else {
                oa.c cVar = this.f19190k0;
                if (cVar != null && v0(cVar)) {
                    dummySurfaceF = DummySurface.f(this.Z0, cVar.f19174f);
                    this.f21469j1 = dummySurfaceF;
                }
            }
        }
        Surface surface = this.f21468i1;
        q3.a aVar = this.f21461b1;
        if (surface == dummySurfaceF) {
            if (dummySurfaceF == null || dummySurfaceF == this.f21469j1) {
                return;
            }
            v vVar = this.D1;
            if (vVar != null && (handler = (Handler) aVar.f20679d) != null) {
                handler.post(new io.sentry.cache.e(aVar, 21, vVar));
            }
            if (this.f21470k1) {
                Surface surface2 = this.f21468i1;
                Handler handler3 = (Handler) aVar.f20679d;
                if (handler3 != null) {
                    handler3.post(new z(aVar, surface2, SystemClock.elapsedRealtime(), 2));
                    return;
                }
                return;
            }
            return;
        }
        this.f21468i1 = dummySurfaceF;
        q qVar = this.f21460a1;
        qVar.getClass();
        DummySurface dummySurface2 = dummySurfaceF instanceof DummySurface ? null : dummySurfaceF;
        Surface surface3 = qVar.f21506e;
        if (surface3 != dummySurface2) {
            if (qb.v.f20828a >= 30 && surface3 != null && qVar.f21509h != 0.0f) {
                qVar.f21509h = 0.0f;
                try {
                    surface3.setFrameRate(0.0f, 0);
                } catch (IllegalStateException e4) {
                    qb.b.q("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
                }
            }
            qVar.f21506e = dummySurface2;
            qVar.b(true);
        }
        this.f21470k1 = false;
        int i11 = this.f4140x;
        a0 a0Var2 = this.f19183d0;
        if (a0Var2 != null) {
            if (qb.v.f20828a < 23 || dummySurfaceF == null || this.f21466g1) {
                a0();
                N();
            } else {
                a0Var2.i(dummySurfaceF);
            }
        }
        if (dummySurfaceF == null || dummySurfaceF == this.f21469j1) {
            this.D1 = null;
            l0();
            return;
        }
        v vVar2 = this.D1;
        if (vVar2 != null && (handler2 = (Handler) aVar.f20679d) != null) {
            handler2.post(new io.sentry.cache.e(aVar, 21, vVar2));
        }
        l0();
        if (i11 == 2) {
            long j = this.f21462c1;
            this.f21476q1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // oa.e
    public final boolean f0(oa.c cVar) {
        return this.f21468i1 != null || v0(cVar);
    }

    @Override // com.google.android.exoplayer2.g, com.google.android.exoplayer2.l1
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // oa.e
    public final int h0(oa.f fVar, Format format) {
        int i10 = 0;
        if (!qb.m.j(format.H)) {
            return 0;
        }
        boolean z10 = format.K != null;
        List listO0 = o0(fVar, format, z10, false);
        if (z10 && listO0.isEmpty()) {
            listO0 = o0(fVar, format, false, false);
        }
        if (listO0.isEmpty()) {
            return 1;
        }
        Class cls = format.f4021a0;
        if (cls != null && !ba.k.class.equals(cls)) {
            return 2;
        }
        oa.c cVar = (oa.c) listO0.get(0);
        boolean zC = cVar.c(format);
        int i11 = cVar.d(format) ? 16 : 8;
        if (zC) {
            List listO02 = o0(fVar, format, z10, true);
            if (!listO02.isEmpty()) {
                oa.c cVar2 = (oa.c) listO02.get(0);
                if (cVar2.c(format) && cVar2.d(format)) {
                    i10 = 32;
                }
            }
        }
        return (zC ? 4 : 3) | i11 | i10;
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final boolean j() {
        DummySurface dummySurface;
        if (super.j() && (this.f21472m1 || (((dummySurface = this.f21469j1) != null && this.f21468i1 == dummySurface) || this.f19183d0 == null || this.E1))) {
            this.f21476q1 = -9223372036854775807L;
            return true;
        }
        if (this.f21476q1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f21476q1) {
            return true;
        }
        this.f21476q1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.g
    public final void k() {
        q3.a aVar = this.f21461b1;
        this.D1 = null;
        l0();
        this.f21470k1 = false;
        q qVar = this.f21460a1;
        m mVar = qVar.f21503b;
        if (mVar != null) {
            mVar.a();
            p pVar = qVar.f21504c;
            pVar.getClass();
            pVar.f21499d.sendEmptyMessage(2);
        }
        this.G1 = null;
        try {
            this.U = null;
            this.V0 = -9223372036854775807L;
            this.W0 = -9223372036854775807L;
            this.X0 = 0;
            E();
            z9.b bVar = this.U0;
            aVar.getClass();
            synchronized (bVar) {
            }
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new t(aVar, bVar, 0));
            }
        } catch (Throwable th2) {
            z9.b bVar2 = this.U0;
            aVar.getClass();
            synchronized (bVar2) {
                Handler handler2 = (Handler) aVar.f20679d;
                if (handler2 != null) {
                    handler2.post(new t(aVar, bVar2, 0));
                }
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void l(boolean z10, boolean z11) {
        this.U0 = new z9.b();
        m1 m1Var = this.f4138g;
        m1Var.getClass();
        boolean z12 = m1Var.f4240a;
        qb.b.j((z12 && this.F1 == 0) ? false : true);
        if (this.E1 != z12) {
            this.E1 = z12;
            a0();
        }
        z9.b bVar = this.U0;
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new t(aVar, bVar, 1));
        }
        q qVar = this.f21460a1;
        m mVar = qVar.f21503b;
        if (mVar != null) {
            p pVar = qVar.f21504c;
            pVar.getClass();
            pVar.f21499d.sendEmptyMessage(1);
            mVar.c(new io.sentry.android.replay.capture.e(25, qVar));
        }
        this.f21473n1 = z11;
        this.f21474o1 = false;
    }

    public final void l0() {
        a0 a0Var;
        this.f21472m1 = false;
        if (qb.v.f20828a < 23 || !this.E1 || (a0Var = this.f19183d0) == null) {
            return;
        }
        this.G1 = new f(this, a0Var);
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final void m(long j, boolean z10) throws com.google.android.exoplayer2.n {
        super.m(j, z10);
        l0();
        q qVar = this.f21460a1;
        qVar.f21511l = 0L;
        qVar.f21514o = -1L;
        qVar.f21512m = -1L;
        this.f21480v1 = -9223372036854775807L;
        this.f21475p1 = -9223372036854775807L;
        this.f21478t1 = 0;
        if (!z10) {
            this.f21476q1 = -9223372036854775807L;
        } else {
            long j7 = this.f21462c1;
            this.f21476q1 = j7 > 0 ? SystemClock.elapsedRealtime() + j7 : -9223372036854775807L;
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void n() {
        try {
            try {
                z();
                a0();
                b9.e eVar = this.X;
                if (eVar != null) {
                    eVar.D(null);
                }
                this.X = null;
            } catch (Throwable th2) {
                b9.e eVar2 = this.X;
                if (eVar2 != null) {
                    eVar2.D(null);
                }
                this.X = null;
                throw th2;
            }
        } finally {
            DummySurface dummySurface = this.f21469j1;
            if (dummySurface != null) {
                if (this.f21468i1 == dummySurface) {
                    this.f21468i1 = null;
                }
                dummySurface.release();
                this.f21469j1 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.g
    public final void o() {
        this.s1 = 0;
        this.f21477r1 = SystemClock.elapsedRealtime();
        this.f21481w1 = SystemClock.elapsedRealtime() * 1000;
        this.f21482x1 = 0L;
        this.f21483y1 = 0;
        q qVar = this.f21460a1;
        qVar.f21505d = true;
        qVar.f21511l = 0L;
        qVar.f21514o = -1L;
        qVar.f21512m = -1L;
        qVar.b(false);
    }

    @Override // com.google.android.exoplayer2.g
    public final void p() {
        Surface surface;
        this.f21476q1 = -9223372036854775807L;
        q0();
        int i10 = this.f21483y1;
        if (i10 != 0) {
            long j = this.f21482x1;
            q3.a aVar = this.f21461b1;
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new s(aVar, j, i10, 1));
            }
            this.f21482x1 = 0L;
            this.f21483y1 = 0;
        }
        q qVar = this.f21460a1;
        qVar.f21505d = false;
        if (qb.v.f20828a < 30 || (surface = qVar.f21506e) == null || qVar.f21509h == 0.0f) {
            return;
        }
        qVar.f21509h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e4) {
            qb.b.q("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }

    public final void q0() {
        if (this.s1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f21477r1;
            int i10 = this.s1;
            q3.a aVar = this.f21461b1;
            Handler handler = (Handler) aVar.f20679d;
            if (handler != null) {
                handler.post(new s(aVar, i10, j));
            }
            this.s1 = 0;
            this.f21477r1 = jElapsedRealtime;
        }
    }

    public final void r0() {
        this.f21474o1 = true;
        if (this.f21472m1) {
            return;
        }
        this.f21472m1 = true;
        Surface surface = this.f21468i1;
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new z(aVar, surface, SystemClock.elapsedRealtime(), 2));
        }
        this.f21470k1 = true;
    }

    public final void s0() {
        int i10 = this.z1;
        if (i10 == -1 && this.A1 == -1) {
            return;
        }
        v vVar = this.D1;
        if (vVar != null && vVar.f21524a == i10 && vVar.f21525b == this.A1 && vVar.f21526c == this.B1 && vVar.f21527d == this.C1) {
            return;
        }
        v vVar2 = new v(i10, this.A1, this.B1, this.C1);
        this.D1 = vVar2;
        q3.a aVar = this.f21461b1;
        Handler handler = (Handler) aVar.f20679d;
        if (handler != null) {
            handler.post(new io.sentry.cache.e(aVar, 21, vVar2));
        }
    }

    public final void t0(a0 a0Var, int i10) {
        s0();
        qb.b.d("releaseOutputBuffer");
        a0Var.g(i10, true);
        qb.b.r();
        this.f21481w1 = SystemClock.elapsedRealtime() * 1000;
        this.U0.f26783b++;
        this.f21478t1 = 0;
        r0();
    }

    public final void u0(a0 a0Var, int i10, long j) {
        s0();
        qb.b.d("releaseOutputBuffer");
        a0Var.d(i10, j);
        qb.b.r();
        this.f21481w1 = SystemClock.elapsedRealtime() * 1000;
        this.U0.f26783b++;
        this.f21478t1 = 0;
        r0();
    }

    @Override // oa.e, com.google.android.exoplayer2.g
    public final void v(float f10, float f11) throws com.google.android.exoplayer2.n {
        super.v(f10, f11);
        q qVar = this.f21460a1;
        qVar.f21510i = f10;
        qVar.f21511l = 0L;
        qVar.f21514o = -1L;
        qVar.f21512m = -1L;
        qVar.b(false);
    }

    public final boolean v0(oa.c cVar) {
        if (qb.v.f20828a < 23 || this.E1 || m0(cVar.f19169a)) {
            return false;
        }
        return !cVar.f19174f || DummySurface.e(this.Z0);
    }

    public final void w0(a0 a0Var, int i10) {
        qb.b.d("skipVideoBuffer");
        a0Var.g(i10, false);
        qb.b.r();
        this.U0.f26784c++;
    }

    @Override // oa.e
    public final z9.e x(oa.c cVar, Format format, Format format2) {
        z9.e eVarB = cVar.b(format, format2);
        int i10 = eVarB.f26798e;
        int i11 = format2.M;
        kc.c cVar2 = this.f21465f1;
        if (i11 > cVar2.f14269a || format2.N > cVar2.f14270b) {
            i10 |= 256;
        }
        if (p0(cVar, format2) > this.f21465f1.f14271c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new z9.e(cVar.f19169a, format, format2, i12 != 0 ? 0 : eVarB.f26797d, i12);
    }

    public final void x0(int i10) {
        z9.b bVar = this.U0;
        bVar.f26785d += i10;
        this.s1 += i10;
        int i11 = this.f21478t1 + i10;
        this.f21478t1 = i11;
        bVar.f26786e = Math.max(i11, bVar.f26786e);
        int i12 = this.f21463d1;
        if (i12 <= 0 || this.s1 < i12) {
            return;
        }
        q0();
    }

    @Override // oa.e
    public final oa.b y(IllegalStateException illegalStateException, oa.c cVar) {
        Surface surface = this.f21468i1;
        e eVar = new e(illegalStateException, cVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return eVar;
    }

    public final void y0(long j) {
        z9.b bVar = this.U0;
        bVar.f26788g += j;
        bVar.f26789h++;
        this.f21482x1 += j;
        this.f21483y1++;
    }
}
