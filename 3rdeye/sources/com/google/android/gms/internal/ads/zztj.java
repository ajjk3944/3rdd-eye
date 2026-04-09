package com.google.android.gms.internal.ads;

import K1.u;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zztj {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i10, double d10) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, B6.c.e(i, i10, (int) d10));
            boolean z10 = true;
            if (iZzc == 1 && zztk.zza == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    }
                    zztk.zza = Boolean.valueOf(z10);
                    if (!zztk.zza.booleanValue()) {
                    }
                }
                z10 = false;
                zztk.zza = Boolean.valueOf(z10);
                if (!zztk.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzah("video/avc");
            zzz zzzVarZzan = zzxVar.zzan();
            if (zzzVarZzan.zzo != null) {
                List listZze = zzuc.zze(zztr.zza, zzzVarZzan, z10, false);
                for (int i = 0; i < listZze.size(); i++) {
                    if (((zzti) listZze.get(i)).zzd != null && (videoCapabilities = ((zzti) listZze.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        H2.a.h();
                        return zzc(supportedPerformancePoints, u.d());
                    }
                }
            }
        } catch (zztw unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (H2.e.d(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
