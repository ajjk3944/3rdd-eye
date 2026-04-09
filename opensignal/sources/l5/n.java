package l5;

import a5.d0;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.j0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f14723a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14724b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14725c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f14726d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14727e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14728f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14729g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14730h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f14723a = str;
        this.f14724b = str2;
        this.f14725c = str3;
        this.f14726d = codecCapabilities;
        this.f14729g = z10;
        this.f14727e = z11;
        this.f14728f = z12;
        this.f14730h = j0.j(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d6) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(d0.f(i10, widthAlignment) * widthAlignment, d0.f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d6 == -1.0d || d6 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d6));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l5.n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            l5.n r0 = new l5.n
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L3d
            int r3 = a5.d0.f105a
            r4 = 19
            if (r3 < r4) goto L3d
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r11.isFeatureSupported(r4)
            if (r4 == 0) goto L3d
            r4 = 22
            if (r3 > r4) goto L3b
            java.lang.String r3 = a5.d0.f108d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r2
            goto L3e
        L3d:
            r6 = r1
        L3e:
            r3 = 21
            if (r11 == 0) goto L4c
            int r4 = a5.d0.f105a
            if (r4 < r3) goto L4c
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r11.isFeatureSupported(r4)
        L4c:
            if (r13 != 0) goto L64
            if (r11 == 0) goto L5d
            int r13 = a5.d0.f105a
            if (r13 < r3) goto L5d
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L5d
            goto L64
        L5d:
            r7 = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r8
            goto L6a
        L64:
            r7 = r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r2 = r9
        L6a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):l5.n");
    }

    public final d5.d b(androidx.media3.common.r rVar, androidx.media3.common.r rVar2) {
        androidx.media3.common.r rVar3;
        androidx.media3.common.r rVar4;
        int i10 = !d0.a(rVar.H, rVar2.H) ? 8 : 0;
        if (this.f14730h) {
            if (rVar.P != rVar2.P) {
                i10 |= 1024;
            }
            if (!this.f14727e && (rVar.M != rVar2.M || rVar.N != rVar2.N)) {
                i10 |= 512;
            }
            if (!d0.a(rVar.T, rVar2.T)) {
                i10 |= 2048;
            }
            if (d0.f108d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f14723a) && !rVar.b(rVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new d5.d(this.f14723a, rVar, rVar2, rVar.b(rVar2) ? 3 : 2, 0);
            }
            rVar3 = rVar;
            rVar4 = rVar2;
        } else {
            rVar3 = rVar;
            rVar4 = rVar2;
            if (rVar3.U != rVar4.U) {
                i10 |= 4096;
            }
            if (rVar3.V != rVar4.V) {
                i10 |= 8192;
            }
            if (rVar3.W != rVar4.W) {
                i10 |= 16384;
            }
            String str = this.f14724b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = z.d(rVar3);
                Pair pairD2 = z.d(rVar4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new d5.d(this.f14723a, rVar3, rVar4, 3, 0);
                    }
                }
            }
            if (!rVar3.b(rVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new d5.d(this.f14723a, rVar3, rVar4, 1, 0);
            }
        }
        return new d5.d(this.f14723a, rVar3, rVar4, 0, i10);
    }

    public final boolean c(androidx.media3.common.r rVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = z.d(rVar);
        if (pairD != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            int iIntValue2 = ((Integer) pairD.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(rVar.H);
            int i10 = 8;
            String str = this.f14724b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.f14730h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14726d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (d0.f105a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = d0.f106b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                g("codec.profileLevel, " + rVar.E + ", " + this.f14725c);
                return false;
            }
        }
        return true;
    }

    public final boolean d(androidx.media3.common.r rVar) {
        String str = rVar.H;
        String str2 = this.f14724b;
        boolean z10 = str2.equals(str) || str2.equals(z.b(rVar));
        int i10 = rVar.N;
        int i11 = rVar.M;
        if (!z10 || !c(rVar, true)) {
            return false;
        }
        if (!this.f14730h) {
            int i12 = d0.f105a;
            if (i12 >= 21) {
                int i13 = rVar.V;
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14726d;
                if (i13 != -1) {
                    if (codecCapabilities == null) {
                        g("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        g("sampleRate.aCaps");
                        return false;
                    }
                    if (!audioCapabilities.isSampleRateSupported(i13)) {
                        g("sampleRate.support, " + i13);
                        return false;
                    }
                }
                int i14 = rVar.U;
                if (i14 != -1) {
                    if (codecCapabilities == null) {
                        g("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        g("channelCount.aCaps");
                        return false;
                    }
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        int i15 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                        a5.a.B("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f14723a + ", [" + maxInputChannelCount + " to " + i15 + "]");
                        maxInputChannelCount = i15;
                    }
                    if (maxInputChannelCount < i14) {
                        g("channelCount.support, " + i14);
                        return false;
                    }
                }
            }
        } else if (i11 > 0 && i10 > 0) {
            if (d0.f105a >= 21) {
                return f(rVar.O, i11, i10);
            }
            boolean z11 = i11 * i10 <= z.i();
            if (!z11) {
                g("legacyFrameSize, " + i11 + "x" + i10);
            }
            return z11;
        }
        return true;
    }

    public final boolean e(androidx.media3.common.r rVar) {
        if (this.f14730h) {
            return this.f14727e;
        }
        Pair pairD = z.d(rVar);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(double r8, int r10, int r11) {
        /*
            r7 = this;
            r0 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = r7.f14726d
            if (r1 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
            r7.g(r8)
            return r0
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            if (r1 != 0) goto L17
            java.lang.String r8 = "sizeAndRate.vCaps"
            r7.g(r8)
            return r0
        L17:
            int r2 = a5.d0.f105a
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L4b
            int r2 = l5.m.a(r1, r10, r11, r8)
            r3 = 2
            if (r2 != r3) goto L2b
            goto La9
        L2b:
            if (r2 != r6) goto L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "sizeAndRate.cover, "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r5)
            r1.append(r11)
            r1.append(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.g(r8)
            return r0
        L4b:
            boolean r2 = a(r1, r10, r11, r8)
            if (r2 != 0) goto La9
            if (r10 >= r11) goto L8b
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r3 = r7.f14723a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L68
            java.lang.String r2 = "mcv5a"
            java.lang.String r3 = a5.d0.f106b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L68
            goto L8b
        L68:
            boolean r1 = a(r1, r11, r10, r8)
            if (r1 != 0) goto L6f
            goto L8b
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r5)
            r0.append(r11)
            r0.append(r4)
            r0.append(r8)
            int r8 = a5.d0.f105a
            a5.a.l()
            return r6
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "sizeAndRate.support, "
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r5)
            r1.append(r11)
            r1.append(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.g(r8)
            return r0
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.n.f(double, int, int):boolean");
    }

    public final void g(String str) {
        int i10 = d0.f105a;
        a5.a.l();
    }

    public final String toString() {
        return this.f14723a;
    }
}
