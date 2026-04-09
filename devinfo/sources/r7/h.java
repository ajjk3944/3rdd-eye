package r7;

import android.graphics.Path;
import android.graphics.PointF;
import h7.l;
import java.util.ArrayList;
import m7.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f32867a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i4) {
        return Math.max(0, Math.min(255, i4));
    }

    public static int d(float f10, float f11) {
        int i4 = (int) f10;
        int i10 = (int) f11;
        int i11 = i4 / i10;
        int i12 = i4 % i10;
        if (!((i4 ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i4 - (i10 * i11);
    }

    public static void e(k kVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = kVar.f28925b;
        ArrayList arrayList = kVar.f28924a;
        path.moveTo(pointF.x, pointF.y);
        float f10 = pointF.x;
        float f11 = pointF.y;
        PointF pointF2 = f32867a;
        pointF2.set(f10, f11);
        int i4 = 0;
        while (i4 < arrayList.size()) {
            k7.a aVar = (k7.a) arrayList.get(i4);
            PointF pointF3 = aVar.f28038a;
            PointF pointF4 = aVar.f28039b;
            PointF pointF5 = aVar.f28040c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i4++;
            path = path2;
        }
        Path path3 = path;
        if (kVar.f28926c) {
            path3.close();
        }
    }

    public static float f(float f10, float f11, float f12) {
        return r5.c.c(f11, f10, f12, f10);
    }

    public static void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2, l lVar) {
        if (eVar.a(i4, lVar.getName())) {
            String name = lVar.getName();
            k7.e eVar3 = new k7.e(eVar2);
            eVar3.f28062a.add(name);
            k7.e eVar4 = new k7.e(eVar3);
            eVar4.f28063b = lVar;
            arrayList.add(eVar4);
        }
    }
}
