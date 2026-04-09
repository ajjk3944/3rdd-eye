package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class LP {

    /* renamed from: a, reason: collision with root package name */
    public final String f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9692c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9693d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9694e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9695f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9696g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9697h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f9698j;

    /* renamed from: k, reason: collision with root package name */
    public int f9699k;

    /* renamed from: l, reason: collision with root package name */
    public float f9700l;

    public LP(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        this.f9690a = str;
        this.f9691b = str2;
        this.f9692c = str3;
        this.f9693d = codecCapabilities;
        this.f9696g = z6;
        this.f9694e = z7;
        this.f9695f = z8;
        this.f9697h = z9;
        this.i = D4.b(str2);
        this.f9700l = -3.4028235E38f;
        this.f9698j = -1;
        this.f9699k = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.LP a(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            com.google.android.gms.internal.ads.LP r0 = new com.google.android.gms.internal.ads.LP
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LP.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):com.google.android.gms.internal.ads.LP");
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i3, double d6) {
        Range<Double> achievableFrameRatesFor;
        Point pointJ = j(videoCapabilities, i, i3);
        int i6 = pointJ.x;
        int i7 = pointJ.y;
        if (d6 == -1.0d || d6 < 1.0d) {
            return videoCapabilities.isSizeSupported(i6, i7);
        }
        double dFloor = Math.floor(d6);
        if (videoCapabilities.areSizeAndRateSupported(i6, i7, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i6, i7)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = Vt.f12096a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(TP tp) {
        int i;
        String str = tp.f11397m;
        String str2 = this.f9691b;
        if ((!str2.equals(str) && !str2.equals(WP.d(tp))) || !f(tp, true) || !g(tp)) {
            return false;
        }
        if (this.i) {
            int i3 = tp.f11404t;
            if (i3 > 0 && (i = tp.f11405u) > 0) {
                return e(i3, i, tp.f11408x);
            }
        } else {
            int i6 = tp.f11379F;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9693d;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                    sb.append("sampleRate.support, ");
                    sb.append(i6);
                    h(sb.toString());
                    return false;
                }
            }
            int i7 = tp.f11378E;
            if (i7 != -1) {
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
                    int i8 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    String str3 = this.f9690a;
                    StringBuilder sb2 = new StringBuilder(AbstractC2763b.b(String.valueOf(maxInputChannelCount).length() + str3.length() + 32 + 4, 1, String.valueOf(i8)));
                    sb2.append("AssumedMaxChannelAdjustment: ");
                    sb2.append(str3);
                    sb2.append(", [");
                    sb2.append(maxInputChannelCount);
                    sb2.append(" to ");
                    sb2.append(i8);
                    sb2.append("]");
                    AbstractC2022vd.v("MediaCodecInfo", sb2.toString());
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount < i7) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 22);
                    sb3.append("channelCount.support, ");
                    sb3.append(i7);
                    h(sb3.toString());
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(TP tp) {
        if (this.i) {
            return this.f9694e;
        }
        Pair pairB = AbstractC1224gm.b(tp);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final CN d(TP tp, TP tp2) {
        TP tp3;
        TP tp4;
        int i;
        String str = tp.f11397m;
        String str2 = tp2.f11397m;
        HK hk = tp2.f11376C;
        int i3 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (tp.f11409y != tp2.f11409y) {
                i3 |= 1024;
            }
            boolean z6 = (tp.f11404t == tp2.f11404t && tp.f11405u == tp2.f11405u) ? false : true;
            if (!this.f9694e && z6) {
                i3 |= 512;
            }
            HK hk2 = tp.f11376C;
            if ((!HK.a(hk2) || !HK.a(hk)) && !Objects.equals(hk2, hk)) {
                i3 |= 2048;
            }
            boolean zStartsWith = Build.MODEL.startsWith("SM-T230");
            String str3 = this.f9690a;
            if (zStartsWith && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !tp.b(tp2)) {
                i3 |= 2;
            }
            int i6 = tp.f11406v;
            if (i6 != -1 && (i = tp.f11407w) != -1 && i6 == tp2.f11406v && i == tp2.f11407w && z6) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairB = AbstractC1224gm.b(tp);
                Pair pairB2 = AbstractC1224gm.b(tp2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i3 = 2;
                }
            }
            if (i3 == 0) {
                return new CN(str3, tp, tp2, true == tp.b(tp2) ? 3 : 2, 0);
            }
            tp3 = tp;
            tp4 = tp2;
        } else {
            tp3 = tp;
            tp4 = tp2;
            if (tp3.f11378E != tp4.f11378E) {
                i3 |= 4096;
            }
            if (tp3.f11379F != tp4.f11379F) {
                i3 |= 8192;
            }
            if (tp3.f11380G != tp4.f11380G) {
                i3 |= 16384;
            }
            String str4 = this.f9691b;
            if (i3 == 0 && (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4"))) {
                Pair pairB3 = AbstractC1224gm.b(tp3);
                Pair pairB4 = AbstractC1224gm.b(tp4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new CN(this.f9690a, tp3, tp4, 3, 0);
                    }
                    if (str4.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new CN(this.f9690a, tp3, tp4, 3, 0);
                    }
                }
            }
            if (i3 == 0 && (str4.equals("audio/eac3-joc") || str4.equals("audio/eac3"))) {
                return new CN(this.f9690a, tp3, tp4, 3, 0);
            }
            if (!tp3.b(tp4)) {
                i3 |= 32;
            }
            if ("audio/opus".equals(str4)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new CN(this.f9690a, tp3, tp4, 1, 0);
            }
        }
        return new CN(this.f9690a, tp3, tp4, 0, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LP.e(int, int, double):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.internal.ads.TP r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.LP.f(com.google.android.gms.internal.ads.TP, boolean):boolean");
    }

    public final boolean g(TP tp) {
        return (Objects.equals(tp.f11397m, "audio/flac") && tp.f11380G == 22 && Build.VERSION.SDK_INT < 34 && this.f9690a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final void h(String str) {
        String str2 = Vt.f12096a;
        String str3 = this.f9691b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length() + 14;
        String str4 = this.f9690a;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 2 + length + 3 + length2 + 1);
        A.f.w(sb, "NoSupport [", str, "] [", str4);
        A.f.w(sb, ", ", str3, "] [", str2);
        sb.append("]");
        AbstractC2022vd.h("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.f9690a;
    }
}
