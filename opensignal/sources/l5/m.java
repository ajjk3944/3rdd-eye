package l5;

import a5.d0;
import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d6) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = d0.f106b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = d0.f108d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    j1.g.g();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = j1.g.c(i10, i11, (int) d6);
                    for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                        if (j1.g.d(supportedPerformancePoints.get(i12)).covers(performancePointC)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
