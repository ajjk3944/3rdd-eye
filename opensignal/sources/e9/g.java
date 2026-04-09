package e9;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import t8.k;
import z8.p;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f7994a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10) {
        return Math.max(0, Math.min(255, i10));
    }

    public static int d(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static void e(p pVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = pVar.f26758b;
        ArrayList arrayList = pVar.f26757a;
        path.moveTo(pointF.x, pointF.y);
        float f10 = pointF.x;
        float f11 = pointF.y;
        PointF pointF2 = f7994a;
        pointF2.set(f10, f11);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            x8.a aVar = (x8.a) arrayList.get(i10);
            PointF pointF3 = aVar.f25068a;
            PointF pointF4 = aVar.f25069b;
            PointF pointF5 = aVar.f25070c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (pVar.f26759c) {
            path3.close();
        }
    }

    public static float f(float f10, float f11, float f12) {
        return c7.a.a(f11, f10, f12, f10);
    }

    public static void g(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2, k kVar) {
        if (fVar.a(i10, kVar.getName())) {
            String name = kVar.getName();
            x8.f fVar3 = new x8.f(fVar2);
            fVar3.f25092a.add(name);
            x8.f fVar4 = new x8.f(fVar3);
            fVar4.f25093b = kVar;
            arrayList.add(fVar4);
        }
    }
}
