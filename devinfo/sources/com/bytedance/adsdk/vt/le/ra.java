package com.bytedance.adsdk.vt.le;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.vt.lh.vt.jg;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    private static final PointF ouw = new PointF();

    public static boolean lh(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static int ouw(int i4, int i10, float f10) {
        return (int) ((f10 * (i10 - i4)) + i4);
    }

    public static float vt(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static PointF ouw(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void ouw(jg jgVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = jgVar.vt;
        path.moveTo(pointF.x, pointF.y);
        ouw.set(pointF.x, pointF.y);
        int i4 = 0;
        while (i4 < jgVar.ouw.size()) {
            com.bytedance.adsdk.vt.lh.ouw ouwVar = jgVar.ouw.get(i4);
            PointF pointF2 = ouwVar.ouw;
            PointF pointF3 = ouwVar.vt;
            PointF pointF4 = ouwVar.f7098lh;
            PointF pointF5 = ouw;
            if (pointF2.equals(pointF5) && pointF3.equals(pointF4)) {
                path.lineTo(pointF4.x, pointF4.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            pointF5.set(pointF4.x, pointF4.y);
            i4++;
            path = path2;
        }
        Path path3 = path;
        if (jgVar.f7111lh) {
            path3.close();
        }
    }

    public static float ouw(float f10, float f11, float f12) {
        return c.c(f11, f10, f12, f10);
    }

    public static int ouw(int i4) {
        return Math.max(0, Math.min(255, i4));
    }

    public static int ouw(float f10, float f11) {
        int i4 = (int) f10;
        int i10 = (int) f11;
        int i11 = i4 / i10;
        int i12 = i4 % i10;
        if (!((i4 ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i4 - (i10 * i11);
    }
}
