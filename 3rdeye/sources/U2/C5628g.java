package u2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import k2.k;
import n2.C5347a;
import n2.C5351e;
import p2.n;

/* compiled from: MiscUtils.java */
/* renamed from: u2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5628g {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f46556a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        int i = (int) f10;
        int i10 = (int) f11;
        int i11 = i / i10;
        int i12 = i % i10;
        if (!((i ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i - (i10 * i11);
    }

    public static void d(n nVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = nVar.f45070b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f46556a;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            ArrayList arrayList = nVar.f45069a;
            if (i >= arrayList.size()) {
                break;
            }
            C5347a c5347a = (C5347a) arrayList.get(i);
            PointF pointF3 = c5347a.f44245a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = c5347a.f44246b;
            PointF pointF5 = c5347a.f44247c;
            if (zEquals && pointF4.equals(pointF5)) {
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
        if (nVar.f45071c) {
            path3.close();
        }
    }

    public static float e(float f10, float f11, float f12) {
        return com.google.android.gms.measurement.internal.a.e(f11, f10, f12, f10);
    }

    public static void f(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2, k kVar) {
        if (c5351e.a(i, kVar.getName())) {
            String name = kVar.getName();
            C5351e c5351e3 = new C5351e(c5351e2);
            c5351e3.f44270a.add(name);
            C5351e c5351e4 = new C5351e(c5351e3);
            c5351e4.f44271b = kVar;
            arrayList.add(c5351e4);
        }
    }
}
