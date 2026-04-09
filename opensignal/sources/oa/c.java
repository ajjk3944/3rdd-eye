package oa;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import qb.m;
import qb.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19170b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19171c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f19172d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19174f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19175g;

    public c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        str.getClass();
        this.f19169a = str;
        this.f19170b = str2;
        this.f19171c = str3;
        this.f19172d = codecCapabilities;
        this.f19173e = z10;
        this.f19174f = z11;
        this.f19175g = m.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d6) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(v.f(i10, widthAlignment) * widthAlignment, v.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d6 == -1.0d || d6 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static oa.c g(java.lang.String r7, java.lang.String r8, java.lang.String r9, android.media.MediaCodecInfo.CodecCapabilities r10, boolean r11) {
        /*
            oa.c r0 = new oa.c
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L3d
            int r3 = qb.v.f20828a
            r4 = 19
            if (r3 < r4) goto L3d
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r10.isFeatureSupported(r4)
            if (r4 == 0) goto L3d
            r4 = 22
            if (r3 > r4) goto L3b
            java.lang.String r3 = qb.v.f20831d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r5 = r2
            goto L3e
        L3d:
            r5 = r1
        L3e:
            r3 = 21
            if (r10 == 0) goto L4c
            int r4 = qb.v.f20828a
            if (r4 < r3) goto L4c
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r10.isFeatureSupported(r4)
        L4c:
            if (r11 != 0) goto L63
            if (r10 == 0) goto L5d
            int r11 = qb.v.f20828a
            if (r11 < r3) goto L5d
            java.lang.String r11 = "secure-playback"
            boolean r11 = r10.isFeatureSupported(r11)
            if (r11 == 0) goto L5d
            goto L63
        L5d:
            r6 = r1
            r2 = r8
            r3 = r9
            r4 = r10
            r1 = r7
            goto L68
        L63:
            r6 = r2
            r1 = r7
            r3 = r9
            r4 = r10
            r2 = r8
        L68:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean):oa.c");
    }

    public final z9.e b(Format format, Format format2) {
        Format format3;
        Format format4;
        int i10 = !v.a(format.H, format2.H) ? 8 : 0;
        if (this.f19175g) {
            if (format.P != format2.P) {
                i10 |= 1024;
            }
            if (!this.f19173e && (format.M != format2.M || format.N != format2.N)) {
                i10 |= 512;
            }
            if (!v.a(format.T, format2.T)) {
                i10 |= 2048;
            }
            if (v.f20831d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f19169a) && !format.e(format2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z9.e(this.f19169a, format, format2, format.e(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.U != format4.U) {
                i10 |= 4096;
            }
            if (format3.V != format4.V) {
                i10 |= 8192;
            }
            if (format3.W != format4.W) {
                i10 |= 16384;
            }
            String str = this.f19170b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairC = k.c(format3);
                Pair pairC2 = k.c(format4);
                if (pairC != null && pairC2 != null) {
                    int iIntValue = ((Integer) pairC.first).intValue();
                    int iIntValue2 = ((Integer) pairC2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new z9.e(this.f19169a, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.e(format4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new z9.e(this.f19169a, format3, format4, 1, 0);
            }
        }
        return new z9.e(this.f19169a, format3, format4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.exoplayer2.Format r20) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.c(com.google.android.exoplayer2.Format):boolean");
    }

    public final boolean d(Format format) {
        if (this.f19175g) {
            return this.f19173e;
        }
        Pair pairC = k.c(format);
        return pairC != null && ((Integer) pairC.first).intValue() == 42;
    }

    public final boolean e(double d6, int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f19172d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i10, i11, d6)) {
            return true;
        }
        if (i10 < i11) {
            String str = this.f19169a;
            if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(v.f20829b)) && a(videoCapabilities, i11, i10, d6)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.rotated, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d6);
                String string = sb2.toString();
                new StringBuilder(c7.a.d(c7.a.d(c7.a.d(c7.a.d(25, string), str), this.f19170b), v.f20832e));
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder(69);
        sb3.append("sizeAndRate.support, ");
        sb3.append(i10);
        sb3.append("x");
        sb3.append(i11);
        sb3.append("x");
        sb3.append(d6);
        f(sb3.toString());
        return false;
    }

    public final void f(String str) {
        new StringBuilder(c7.a.d(c7.a.d(c7.a.d(c7.a.d(20, str), this.f19169a), this.f19170b), v.f20832e));
    }

    public final String toString() {
        return this.f19169a;
    }
}
