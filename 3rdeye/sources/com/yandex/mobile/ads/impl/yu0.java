package com.yandex.mobile.ads.impl;

import N7.B8;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.yandex.mobile.ads.impl.gv0;

/* loaded from: classes3.dex */
public final class yu0 {
    private static final zu0 i = hm1.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f35980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35981b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35982c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f35983d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35984e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35985f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f35986g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f35987h;

    public yu0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f35980a = (String) zf.a(str);
        this.f35981b = str2;
        this.f35982c = str3;
        this.f35983d = codecCapabilities;
        this.f35986g = z10;
        this.f35984e = z11;
        this.f35985f = z12;
        this.f35987h = k01.f(str2);
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f35983d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = s82.f32899a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean b(dc0 dc0Var) throws NumberFormatException {
        if (this.f35987h) {
            return this.f35984e;
        }
        Pair<Integer, Integer> pairB = gv0.b(dc0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f35980a;
    }

    public final oy a(dc0 dc0Var, dc0 dc0Var2) throws NumberFormatException {
        dc0 dc0Var3;
        dc0 dc0Var4;
        int i10 = !s82.a(dc0Var.f26083m, dc0Var2.f26083m) ? 8 : 0;
        if (this.f35987h) {
            if (dc0Var.f26091u != dc0Var2.f26091u) {
                i10 |= 1024;
            }
            if (!this.f35984e && (dc0Var.f26088r != dc0Var2.f26088r || dc0Var.f26089s != dc0Var2.f26089s)) {
                i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!s82.a(dc0Var.f26095y, dc0Var2.f26095y)) {
                i10 |= 2048;
            }
            String str = this.f35980a;
            String str2 = s82.f32902d;
            zu0 zu0Var = i;
            if (str2.startsWith(zu0Var.i()) && zu0Var.g().equals(str) && !dc0Var.a(dc0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new oy(this.f35980a, dc0Var, dc0Var2, dc0Var.a(dc0Var2) ? 3 : 2, 0);
            }
            dc0Var3 = dc0Var;
            dc0Var4 = dc0Var2;
        } else {
            dc0Var3 = dc0Var;
            dc0Var4 = dc0Var2;
            if (dc0Var3.f26096z != dc0Var4.f26096z) {
                i10 |= 4096;
            }
            if (dc0Var3.f26066A != dc0Var4.f26066A) {
                i10 |= 8192;
            }
            if (dc0Var3.f26067B != dc0Var4.f26067B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f35981b)) {
                Pair<Integer, Integer> pairB = gv0.b(dc0Var3);
                Pair<Integer, Integer> pairB2 = gv0.b(dc0Var4);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new oy(this.f35980a, dc0Var3, dc0Var4, 3, 0);
                    }
                }
            }
            if (!dc0Var3.a(dc0Var4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f35981b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new oy(this.f35980a, dc0Var3, dc0Var4, 1, 0);
            }
        }
        return new oy(this.f35980a, dc0Var3, dc0Var4, 0, i10);
    }

    public final boolean a(dc0 dc0Var) throws gv0.b {
        int i10;
        Pair<Integer, Integer> pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f35981b.equals(dc0Var.f26083m) && !this.f35981b.equals(gv0.a(dc0Var))) {
            return false;
        }
        int i11 = 16;
        if (dc0Var.f26080j != null && (pairB = gv0.b(dc0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(dc0Var.f26083m)) {
                if ("video/avc".equals(this.f35981b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f35981b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f35987h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f35983d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (s82.f32899a <= 23 && "video/x-vnd.on2.vp9".equals(this.f35981b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f35983d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i12 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (iIntValue3 >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i12 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        if ("video/hevc".equals(this.f35981b) && 2 == iIntValue) {
                            zu0 zu0Var = i;
                            String strJ = zu0Var.j();
                            String str = s82.f32900b;
                            if (strJ.equals(str) || zu0Var.a().equals(str)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + dc0Var.f26080j + ", " + this.f35982c);
                return false;
            }
        }
        if (this.f35987h) {
            int i13 = dc0Var.f26088r;
            if (i13 <= 0 || (i10 = dc0Var.f26089s) <= 0) {
                return true;
            }
            if (s82.f32899a >= 21) {
                return a(i13, i10, dc0Var.f26090t);
            }
            boolean z10 = i13 * i10 <= gv0.a();
            if (!z10) {
                a("legacyFrameSize, " + dc0Var.f26088r + "x" + dc0Var.f26089s);
            }
            return z10;
        }
        int i14 = s82.f32899a;
        if (i14 >= 21) {
            int i15 = dc0Var.f26066A;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f35983d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                        a(fe.a("sampleRate.support, ", i15));
                    }
                }
                return false;
            }
            int i16 = dc0Var.f26096z;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f35983d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str2 = this.f35980a;
                        String str3 = this.f35981b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i11 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i11 = 30;
                            }
                            rs0.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i11 + "]");
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i16) {
                            a(fe.a("channelCount.support, ", i16));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f35983d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = s82.f32899a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i13, i14);
        }
        if (!zIsSizeSupported) {
            if (i10 < i11) {
                String str = this.f35980a;
                zu0 zu0Var = i;
                if (!zu0Var.h().equals(str) || !zu0Var.b().equals(s82.f32900b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i11 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i10 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i15 = point2.x;
                    int i16 = point2.y;
                    if (d10 != -1.0d && d10 >= 1.0d) {
                        zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d10));
                    } else {
                        zIsSizeSupported2 = videoCapabilities.isSizeSupported(i15, i16);
                    }
                    if (zIsSizeSupported2) {
                        StringBuilder sbI = androidx.work.s.i("sizeAndRate.rotated, ", i10, "x", i11, "x");
                        sbI.append(d10);
                        StringBuilder sbK = B8.k("AssumedSupport [", sbI.toString(), "] [");
                        sbK.append(this.f35980a);
                        sbK.append(", ");
                        sbK.append(this.f35981b);
                        sbK.append("] [");
                        sbK.append(s82.f32903e);
                        sbK.append("]");
                        rs0.a("MediaCodecInfo", sbK.toString());
                    }
                }
            }
            StringBuilder sbI2 = androidx.work.s.i("sizeAndRate.support, ", i10, "x", i11, "x");
            sbI2.append(d10);
            a(sbI2.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.yu0 a(java.lang.String r4, java.lang.String r5, java.lang.String r6, android.media.MediaCodecInfo.CodecCapabilities r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            com.yandex.mobile.ads.impl.yu0 r4 = new com.yandex.mobile.ads.impl.yu0
            r10 = 0
            r0 = 1
            if (r8 == 0) goto L4d
            int r1 = com.yandex.mobile.ads.impl.s82.f32899a
            r2 = 19
            if (r1 < r2) goto L4d
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r8.isFeatureSupported(r2)
            if (r2 == 0) goto L4d
            r2 = 22
            if (r1 > r2) goto L4a
            com.yandex.mobile.ads.impl.zu0 r1 = com.yandex.mobile.ads.impl.yu0.i
            java.lang.String r2 = r1.d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.s82.f32902d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            java.lang.String r2 = r1.c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4a
        L35:
            java.lang.String r2 = r1.e()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L4d
            java.lang.String r1 = r1.f()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L4a
            goto L4d
        L4a:
            r1 = r10
            r10 = r0
            goto L4e
        L4d:
            r1 = r10
        L4e:
            r2 = 21
            if (r8 == 0) goto L5b
            int r3 = com.yandex.mobile.ads.impl.s82.f32899a
            if (r3 < r2) goto L5b
            java.lang.String r3 = "tunneled-playback"
            r8.isFeatureSupported(r3)
        L5b:
            if (r11 != 0) goto L6e
            if (r8 == 0) goto L6c
            int r11 = com.yandex.mobile.ads.impl.s82.f32899a
            if (r11 < r2) goto L6c
            java.lang.String r11 = "secure-playback"
            boolean r11 = r8.isFeatureSupported(r11)
            if (r11 == 0) goto L6c
            goto L6e
        L6c:
            r11 = r1
            goto L6f
        L6e:
            r11 = r0
        L6f:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yu0.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.yandex.mobile.ads.impl.yu0");
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (s82.f32899a >= 29 && "video/x-vnd.on2.vp9".equals(this.f35981b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f35983d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(String str) {
        StringBuilder sbK = B8.k("NoSupport [", str, "] [");
        sbK.append(this.f35980a);
        sbK.append(", ");
        sbK.append(this.f35981b);
        sbK.append("] [");
        sbK.append(s82.f32903e);
        sbK.append("]");
        rs0.a("MediaCodecInfo", sbK.toString());
    }
}
