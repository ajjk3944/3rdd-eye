package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class te0 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(wu0 wu0Var, Path path) {
        Path path2;
        path.reset();
        PointF pointF = wu0Var.b;
        ArrayList arrayList = wu0Var.a;
        path.moveTo(pointF.x, pointF.y);
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = a;
        pointF2.set(f, f2);
        int i = 0;
        while (i < arrayList.size()) {
            yk ykVar = (yk) arrayList.get(i);
            PointF pointF3 = ykVar.a;
            PointF pointF4 = ykVar.b;
            PointF pointF5 = ykVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (wu0Var.c) {
            path3.close();
        }
    }

    public static float f(float f, float f2, float f3) {
        return ex0.d(f2, f, f3, f);
    }

    public static void g(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2, v40 v40Var) {
        if (t40Var.a(v40Var.getName(), i)) {
            String name = v40Var.getName();
            t40 t40Var3 = new t40(t40Var2);
            t40Var3.a.add(name);
            t40 t40Var4 = new t40(t40Var3);
            t40Var4.b = v40Var;
            arrayList.add(t40Var4);
        }
    }
}
