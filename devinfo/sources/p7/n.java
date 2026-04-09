package p7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final km.n f31431a = km.n.q("x", "y");

    public static int a(q7.a aVar) {
        aVar.c();
        int iY = (int) (aVar.y() * 255.0d);
        int iY2 = (int) (aVar.y() * 255.0d);
        int iY3 = (int) (aVar.y() * 255.0d);
        while (aVar.v()) {
            aVar.O();
        }
        aVar.g();
        return Color.argb(255, iY, iY2, iY3);
    }

    public static PointF b(q7.a aVar, float f10) {
        int iC = i3.e.c(aVar.F());
        if (iC == 0) {
            aVar.c();
            float fY = (float) aVar.y();
            float fY2 = (float) aVar.y();
            while (aVar.F() != 2) {
                aVar.O();
            }
            aVar.g();
            return new PointF(fY * f10, fY2 * f10);
        }
        if (iC != 2) {
            if (iC != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(je.u.D(aVar.F())));
            }
            float fY3 = (float) aVar.y();
            float fY4 = (float) aVar.y();
            while (aVar.v()) {
                aVar.O();
            }
            return new PointF(fY3 * f10, fY4 * f10);
        }
        aVar.e();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (aVar.v()) {
            int iL = aVar.L(f31431a);
            if (iL == 0) {
                fD = d(aVar);
            } else if (iL != 1) {
                aVar.N();
                aVar.O();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.m();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(q7.a aVar, float f10) {
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.F() == 1) {
            aVar.c();
            arrayList.add(b(aVar, f10));
            aVar.g();
        }
        aVar.g();
        return arrayList;
    }

    public static float d(q7.a aVar) {
        int iF = aVar.F();
        int iC = i3.e.c(iF);
        if (iC != 0) {
            if (iC == 6) {
                return (float) aVar.y();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(je.u.D(iF)));
        }
        aVar.c();
        float fY = (float) aVar.y();
        while (aVar.v()) {
            aVar.O();
        }
        aVar.g();
        return fY;
    }
}
