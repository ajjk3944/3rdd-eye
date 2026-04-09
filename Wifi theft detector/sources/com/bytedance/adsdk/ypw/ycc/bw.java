package com.bytedance.adsdk.ypw.ycc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.ypw.xq.ypw.qh;

/* loaded from: classes.dex */
public class bw {
    private static final PointF emc = new PointF();

    public static float emc(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static boolean xq(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    private static int ypw(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int emc(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static PointF emc(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float ypw(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void emc(qh qhVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFEmc = qhVar.emc();
        path.moveTo(pointFEmc.x, pointFEmc.y);
        emc.set(pointFEmc.x, pointFEmc.y);
        int i10 = 0;
        while (i10 < qhVar.xq().size()) {
            com.bytedance.adsdk.ypw.xq.emc emcVar = qhVar.xq().get(i10);
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
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (qhVar.ypw()) {
            path3.close();
        }
    }

    public static int emc(float f10, float f11) {
        return emc((int) f10, (int) f11);
    }

    private static int emc(int i10, int i11) {
        return i10 - (i11 * ypw(i10, i11));
    }

    public static int emc(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
