package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ex1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10905b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10906c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f10907d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10908e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10909f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10910h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10911i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f10912k;

    /* renamed from: l, reason: collision with root package name */
    public float f10913l;

    public ex1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z3, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f10904a = str;
        this.f10905b = str2;
        this.f10906c = str3;
        this.f10907d = codecCapabilities;
        this.g = z3;
        this.f10908e = z10;
        this.f10909f = z11;
        this.f10910h = z12;
        this.f10911i = ia.b(str2);
        this.f10913l = -3.4028235E38f;
        this.j = -1;
        this.f10912k = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.ex1 a(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            com.google.android.gms.internal.ads.ex1 r0 = new com.google.android.gms.internal.ads.ex1
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r6 = r1
            goto L11
        L10:
            r6 = r2
        L11:
            if (r12 == 0) goto L18
            java.lang.String r3 = "tunneled-playback"
            r12.isFeatureSupported(r3)
        L18:
            if (r14 != 0) goto L24
            if (r12 == 0) goto L26
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L26
        L24:
            r7 = r1
            goto L27
        L26:
            r7 = r2
        L27:
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r14 < r3) goto L61
            if (r12 == 0) goto L61
            java.lang.String r14 = "detached-surface"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L61
            java.lang.String r14 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Xiaomi"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "OPPO"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "realme"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "motorola"
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L61
            java.lang.String r3 = "LENOVO"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L68
        L61:
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r2
            r2 = r10
            goto L6e
        L68:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r1
            r1 = r9
        L6e:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex1.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.gms.internal.ads.ex1");
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i10, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointJ = j(videoCapabilities, i4, i10);
        int i11 = pointJ.x;
        int i12 = pointJ.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i11, i12);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i11, i12, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = bq0.f9768a;
        return new Point((((i4 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(mx1 mx1Var) {
        int i4;
        String str = mx1Var.f14052m;
        String str2 = this.f10905b;
        if ((!str2.equals(str) && !str2.equals(px1.d(mx1Var))) || !f(mx1Var, true) || !g(mx1Var)) {
            return false;
        }
        if (this.f10911i) {
            int i10 = mx1Var.f14059t;
            if (i10 > 0 && (i4 = mx1Var.f14060u) > 0) {
                return e(i10, i4, mx1Var.f14063x);
            }
        } else {
            int i11 = mx1Var.F;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10907d;
            if (i11 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i11)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb2.append("sampleRate.support, ");
                    sb2.append(i11);
                    h(sb2.toString());
                    return false;
                }
            }
            int i12 = mx1Var.E;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    String str3 = this.f10904a;
                    StringBuilder sb3 = new StringBuilder(r5.c.f(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i13)));
                    sb3.append("AssumedMaxChannelAdjustment: ");
                    sb3.append(str3);
                    sb3.append(", [");
                    sb3.append(maxInputChannelCount);
                    sb3.append(" to ");
                    sb3.append(i13);
                    sb3.append("]");
                    ls.t("MediaCodecInfo", sb3.toString());
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i12).length() + 22);
                    sb4.append("channelCount.support, ");
                    sb4.append(i12);
                    h(sb4.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(mx1 mx1Var) {
        if (this.f10911i) {
            return this.f10908e;
        }
        Pair pairB = ba0.b(mx1Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final ps1 d(mx1 mx1Var, mx1 mx1Var2) {
        mx1 mx1Var3;
        mx1 mx1Var4;
        int i4;
        String str = mx1Var.f14052m;
        String str2 = mx1Var2.f14052m;
        sm1 sm1Var = mx1Var2.C;
        int i10 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.f10911i) {
            if (mx1Var.f14064y != mx1Var2.f14064y) {
                i10 |= Segment.SHARE_MINIMUM;
            }
            boolean z3 = (mx1Var.f14059t == mx1Var2.f14059t && mx1Var.f14060u == mx1Var2.f14060u) ? false : true;
            if (!this.f10908e && z3) {
                i10 |= 512;
            }
            sm1 sm1Var2 = mx1Var.C;
            if ((!sm1.a(sm1Var2) || !sm1.a(sm1Var)) && !Objects.equals(sm1Var2, sm1Var)) {
                i10 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f10904a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !mx1Var.b(mx1Var2)) {
                i10 |= 2;
            }
            int i11 = mx1Var.f14061v;
            if (i11 != -1 && (i4 = mx1Var.f14062w) != -1 && i11 == mx1Var2.f14061v && i4 == mx1Var2.f14062w && z3) {
                i10 |= 2;
            }
            if (i10 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairB = ba0.b(mx1Var);
                Pair pairB2 = ba0.b(mx1Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i10 = 2;
                }
            }
            if (i10 == 0) {
                return new ps1(str3, mx1Var, mx1Var2, true == mx1Var.b(mx1Var2) ? 3 : 2, 0);
            }
            mx1Var3 = mx1Var;
            mx1Var4 = mx1Var2;
        } else {
            mx1Var3 = mx1Var;
            mx1Var4 = mx1Var2;
            if (mx1Var3.E != mx1Var4.E) {
                i10 |= Buffer.SEGMENTING_THRESHOLD;
            }
            if (mx1Var3.F != mx1Var4.F) {
                i10 |= Segment.SIZE;
            }
            if (mx1Var3.G != mx1Var4.G) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str4 = this.f10905b;
            if (i10 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairB3 = ba0.b(mx1Var3);
                Pair pairB4 = ba0.b(mx1Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ps1(this.f10904a, mx1Var3, mx1Var4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new ps1(this.f10904a, mx1Var3, mx1Var4, 3, 0);
                    }
                }
            }
            if (i10 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new ps1(this.f10904a, mx1Var3, mx1Var4, 3, 0);
            }
            if (!mx1Var3.b(mx1Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ps1(this.f10904a, mx1Var3, mx1Var4, 1, 0);
            }
        }
        return new ps1(this.f10904a, mx1Var3, mx1Var4, 0, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r11, int r12, double r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex1.e(int, int, double):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.internal.ads.mx1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ex1.f(com.google.android.gms.internal.ads.mx1, boolean):boolean");
    }

    public final boolean g(mx1 mx1Var) {
        return (Objects.equals(mx1Var.f14052m, "audio/flac") && mx1Var.G == 22 && Build.VERSION.SDK_INT < 34 && this.f10904a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = bq0.f9768a;
        String str3 = this.f10905b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f10904a;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        je.u.B(sb2, "NoSupport [", str, "] [", str4);
        je.u.B(sb2, ", ", str3, "] [", str2);
        sb2.append("]");
        ls.g("MediaCodecInfo", sb2.toString());
    }

    public final String toString() {
        return this.f10904a;
    }
}
