package com.bytedance.adsdk.ypw.ycc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.xq.ypw.qh;
import com.google.android.gms.internal.ads.AbstractC1135f5;

/* loaded from: classes.dex */
public class bw {
    private static final PointF emc = new PointF();

    public static int emc(int i, int i3, float f2) {
        return (int) ((f2 * (i3 - i)) + i);
    }

    public static boolean xq(float f2, float f5, float f6) {
        return f2 >= f5 && f2 <= f6;
    }

    private static int ypw(int i, int i3) {
        int i6 = i / i3;
        return (((i ^ i3) >= 0) || i % i3 == 0) ? i6 : i6 - 1;
    }

    public static PointF emc(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void emc(qh qhVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFEmc = qhVar.emc();
        path.moveTo(pointFEmc.x, pointFEmc.y);
        emc.set(pointFEmc.x, pointFEmc.y);
        int i = 0;
        while (i < qhVar.xq().size()) {
            com.bytedance.adsdk.ypw.xq.emc emcVar = qhVar.xq().get(i);
            PointF pointFEmc2 = emcVar.emc();
            PointF pointFYpw = emcVar.ypw();
            PointF pointFXq = emcVar.xq();
            PointF pointF = emc;
            if (pointFEmc2.equals(pointF) && pointFYpw.equals(pointFXq)) {
                path.lineTo(pointFXq.x, pointFXq.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFEmc2.x, pointFEmc2.y, pointFYpw.x, pointFYpw.y, pointFXq.x, pointFXq.y);
            }
            pointF.set(pointFXq.x, pointFXq.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (qhVar.ypw()) {
            path3.close();
        }
    }

    public static float ypw(float f2, float f5, float f6) {
        return Math.max(f5, Math.min(f6, f2));
    }

    public static float emc(float f2, float f5, float f6) {
        return AbstractC1135f5.h(f5, f2, f6, f2);
    }

    public static int emc(float f2, float f5) {
        return emc((int) f2, (int) f5);
    }

    private static int emc(int i, int i3) {
        return i - (i3 * ypw(i, i3));
    }

    public static int emc(int i, int i3, int i6) {
        return Math.max(i3, Math.min(i6, i));
    }
}
