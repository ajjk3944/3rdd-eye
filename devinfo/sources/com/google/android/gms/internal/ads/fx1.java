package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class fx1 {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i4, int i10, double d10) {
        boolean z3;
        int i11;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i4, i10, (int) d10);
            int i12 = 0;
            while (true) {
                z3 = true;
                if (i12 >= supportedPerformancePoints.size()) {
                    i11 = 1;
                    break;
                }
                if (com.applovin.shadow.okio.a.e(supportedPerformancePoints.get(i12)).covers(performancePoint)) {
                    i11 = 2;
                    break;
                }
                i12++;
            }
            if (i11 == 1 && yr1.f18842d == null) {
                int iB = Build.VERSION.SDK_INT >= 35 ? 2 : b(false);
                int iB2 = b(true);
                if (iB != 0 && (iB2 != 0 ? !(iB != 2 || iB2 != 2) : iB == 2)) {
                    z3 = false;
                }
                yr1.f18842d = Boolean.valueOf(z3);
                if (z3) {
                }
            }
            return i11;
        }
        return 0;
    }

    public static int b(boolean z3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            lw1 lw1Var = new lw1();
            lw1Var.e("video/avc");
            mx1 mx1Var = new mx1(lw1Var);
            if (mx1Var.f14052m != null) {
                u51 u51VarB = px1.b(uu1.f17350h, mx1Var, z3, false);
                for (int i4 = 0; i4 < u51VarB.f17098d; i4++) {
                    if (((ex1) u51VarB.get(i4)).f10907d != null && (videoCapabilities = ((ex1) u51VarB.get(i4)).f10907d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (com.applovin.shadow.okio.a.e(supportedPerformancePoints.get(i10)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (kx1 unused) {
        }
        return 0;
    }
}
