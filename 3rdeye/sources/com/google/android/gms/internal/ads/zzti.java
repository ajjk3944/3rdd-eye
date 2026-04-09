package com.google.android.gms.internal.ads;

import N7.B8;
import N7.C1154e9;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.ads.AdRequest;
import g0.C4356c;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzti {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public zzti(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = z16;
        this.zzi = zzay.zzj(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzti zzd(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            com.google.android.gms.internal.ads.zzti r0 = new com.google.android.gms.internal.ads.zzti
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L10
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L10
            r8 = r1
            goto L11
        L10:
            r8 = r2
        L11:
            if (r15 == 0) goto L1d
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L1d
            r9 = r1
            goto L1e
        L1d:
            r9 = r2
        L1e:
            if (r20 != 0) goto L2a
            if (r15 == 0) goto L2c
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L2c
        L2a:
            r10 = r1
            goto L2d
        L2c:
            r10 = r2
        L2d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r3 < r4) goto L4f
            if (r15 == 0) goto L4f
            java.lang.String r3 = "detached-surface"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4f
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L4f
            java.lang.String r4 = "OPPO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5b
        L4f:
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r2
            r2 = r13
            goto L66
        L5b:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r11 = r1
            r1 = r12
        L66:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzd(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzti");
    }

    private static Point zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzex.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzk(String str) {
        String str2 = zzex.zza;
        StringBuilder sbK = B8.k("NoSupport [", str, "] [");
        sbK.append(this.zza);
        sbK.append(", ");
        zzea.zzb("MediaCodecInfo", C1154e9.j(sbK, this.zzb, "] [", str2, "]"));
    }

    private static boolean zzl(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzj = zzj(videoCapabilities, i, i10);
        int i11 = pointZzj.x;
        int i12 = pointZzj.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i11, i12);
        }
        double dFloor = Math.floor(d10);
        if (videoCapabilities.areSizeAndRateSupported(i11, i12, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i11, i12)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzm(com.google.android.gms.internal.ads.zzz r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzm(com.google.android.gms.internal.ads.zzz, boolean):boolean");
    }

    private final boolean zzn(zzz zzzVar) {
        return (Objects.equals(zzzVar.zzo, "audio/flac") && zzzVar.zzI == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final boolean zzo(zzz zzzVar) {
        String str = this.zzb;
        return str.equals(zzzVar.zzo) || str.equals(zzuc.zzb(zzzVar));
    }

    public final String toString() {
        return this.zza;
    }

    public final float zza(int i, int i10) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f10 = this.zzl;
        if (f10 != -3.4028235E38f && this.zzj == i && this.zzk == i10) {
            return f10;
        }
        float f11 = 1024.0f;
        if (!zzh(i, i10, 1024.0d)) {
            float f12 = 0.0f;
            while (true) {
                float f13 = f11 - f12;
                if (Math.abs(f13) <= 5.0f) {
                    break;
                }
                float f14 = (f13 / 2.0f) + f12;
                boolean zZzh = zzh(i, i10, f14);
                if (true == zZzh) {
                    f12 = f14;
                }
                if (true != zZzh) {
                    f11 = f14;
                }
            }
            f11 = f12;
        }
        this.zzl = f11;
        this.zzj = i;
        this.zzk = i10;
        return f11;
    }

    public final Point zzb(int i, int i10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzj(videoCapabilities, i, i10);
    }

    public final zzie zzc(zzz zzzVar, zzz zzzVar2) {
        zzz zzzVar3;
        zzz zzzVar4;
        int i;
        int i10 = true != Objects.equals(zzzVar.zzo, zzzVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzzVar.zzA != zzzVar2.zzA) {
                i10 |= 1024;
            }
            boolean z10 = (zzzVar.zzv == zzzVar2.zzv && zzzVar.zzw == zzzVar2.zzw) ? false : true;
            if (!this.zze && z10) {
                i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            zzk zzkVar = zzzVar.zzE;
            if ((!zzk.zzg(zzkVar) || !zzk.zzg(zzzVar2.zzE)) && !Objects.equals(zzkVar, zzzVar2.zzE)) {
                i10 |= 2048;
            }
            String str = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzzVar.zzd(zzzVar2)) {
                i10 |= 2;
            }
            int i11 = zzzVar.zzx;
            if (i11 != -1 && (i = zzzVar.zzy) != -1 && i11 == zzzVar2.zzx && i == zzzVar2.zzy && z10) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzie(str, zzzVar, zzzVar2, true == zzzVar.zzd(zzzVar2) ? 3 : 2, 0);
            }
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
        } else {
            zzzVar3 = zzzVar;
            zzzVar4 = zzzVar2;
            if (zzzVar3.zzG != zzzVar4.zzG) {
                i10 |= 4096;
            }
            if (zzzVar3.zzH != zzzVar4.zzH) {
                i10 |= 8192;
            }
            if (zzzVar3.zzI != zzzVar4.zzI) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i12 = zzuc.zza;
                Pair pairZza = zzdk.zza(zzzVar3);
                Pair pairZza2 = zzdk.zza(zzzVar4);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzie(this.zza, zzzVar3, zzzVar4, 3, 0);
                    }
                }
            }
            if (!zzzVar3.zzd(zzzVar4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzie(this.zza, zzzVar3, zzzVar4, 1, 0);
            }
        }
        return new zzie(this.zza, zzzVar3, zzzVar4, 0, i10);
    }

    public final boolean zze(zzz zzzVar) {
        return zzo(zzzVar) && zzm(zzzVar, false) && zzn(zzzVar);
    }

    public final boolean zzf(zzz zzzVar) throws zztw {
        int i;
        if (!zzo(zzzVar) || !zzm(zzzVar, true) || !zzn(zzzVar)) {
            return false;
        }
        if (this.zzi) {
            int i10 = zzzVar.zzv;
            if (i10 <= 0 || (i = zzzVar.zzw) <= 0) {
                return true;
            }
            return zzh(i10, i, zzzVar.zzz);
        }
        int i11 = zzzVar.zzH;
        if (i11 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzk("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzk("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i11)) {
                zzk(C4356c.h(i11, "sampleRate.support, "));
                return false;
            }
        }
        int i12 = zzzVar.zzG;
        if (i12 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzk("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzk("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                zzea.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i13 + "]");
                maxInputChannelCount = i13;
            }
            if (maxInputChannelCount < i12) {
                zzk(C4356c.h(i12, "channelCount.support, "));
                return false;
            }
        }
        return true;
    }

    public final boolean zzg(zzz zzzVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zzuc.zza;
        Pair pairZza = zzdk.zza(zzzVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzh(int r9, int r10, double r11) {
        /*
            r8 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r8.zzd
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r9 = "sizeAndRate.caps"
            r8.zzk(r9)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L17
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.zzk(r9)
            return r1
        L17:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 1
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r3) goto L3e
            int r2 = com.google.android.gms.internal.ads.zztk.zza(r0, r9, r10, r11)
            r3 = 2
            if (r2 != r3) goto L2a
            goto L99
        L2a:
            if (r2 == r4) goto L2d
            goto L3e
        L2d:
            java.lang.String r0 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = androidx.work.s.i(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.zzk(r9)
            return r1
        L3e:
            boolean r2 = zzl(r0, r9, r10, r11)
            if (r2 != 0) goto L99
            if (r9 >= r10) goto L88
            java.lang.String r2 = r8.zza
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5a
            java.lang.String r3 = "mcv5a"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L88
        L5a:
            boolean r0 = zzl(r0, r10, r9, r11)
            if (r0 != 0) goto L61
            goto L88
        L61:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = androidx.work.s.i(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = com.google.android.gms.internal.ads.zzex.zza
            java.lang.String r12 = "AssumedSupport ["
            java.lang.String r0 = "] ["
            java.lang.String r1 = ", "
            java.lang.StringBuilder r9 = j6.l.d(r12, r9, r0, r2, r1)
            java.lang.String r12 = "]"
            java.lang.String r9 = N7.C1154e9.j(r9, r10, r0, r11, r12)
            java.lang.String r10 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzea.zzb(r10, r9)
            goto L99
        L88:
            java.lang.String r0 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = androidx.work.s.i(r0, r9, r6, r10, r5)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.zzk(r9)
            return r1
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzh(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzi() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
