package c9;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3427a = io.sentry.internal.debugmeta.c.v("x", "y");

    public static int a(d9.b bVar) {
        bVar.b();
        int iG = (int) (bVar.G() * 255.0d);
        int iG2 = (int) (bVar.G() * 255.0d);
        int iG3 = (int) (bVar.G() * 255.0d);
        while (bVar.w()) {
            bVar.i0();
        }
        bVar.h();
        return Color.argb(255, iG, iG2, iG3);
    }

    public static PointF b(d9.b bVar, float f10) {
        int i10 = o.f3426a[bVar.V().ordinal()];
        if (i10 == 1) {
            float fG = (float) bVar.G();
            float fG2 = (float) bVar.G();
            while (bVar.w()) {
                bVar.i0();
            }
            return new PointF(fG * f10, fG2 * f10);
        }
        if (i10 == 2) {
            bVar.b();
            float fG3 = (float) bVar.G();
            float fG4 = (float) bVar.G();
            while (bVar.V() != d9.a.END_ARRAY) {
                bVar.i0();
            }
            bVar.h();
            return new PointF(fG3 * f10, fG4 * f10);
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + bVar.V());
        }
        bVar.f();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (bVar.w()) {
            int iZ = bVar.Z(f3427a);
            if (iZ == 0) {
                fD = d(bVar);
            } else if (iZ != 1) {
                bVar.f0();
                bVar.i0();
            } else {
                fD2 = d(bVar);
            }
        }
        bVar.i();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(d9.b bVar, float f10) {
        ArrayList arrayList = new ArrayList();
        bVar.b();
        while (bVar.V() == d9.a.BEGIN_ARRAY) {
            bVar.b();
            arrayList.add(b(bVar, f10));
            bVar.h();
        }
        bVar.h();
        return arrayList;
    }

    public static float d(d9.b bVar) {
        d9.a aVarV = bVar.V();
        int i10 = o.f3426a[aVarV.ordinal()];
        if (i10 == 1) {
            return (float) bVar.G();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + aVarV);
        }
        bVar.b();
        float fG = (float) bVar.G();
        while (bVar.w()) {
            bVar.i0();
        }
        bVar.h();
        return fG;
    }
}
