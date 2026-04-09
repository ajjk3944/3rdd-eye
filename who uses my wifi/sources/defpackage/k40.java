package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class k40 {
    public static final l92 a = l92.D("x", "y");

    public static int a(i40 i40Var) {
        i40Var.a();
        int iL = (int) (i40Var.l() * 255.0d);
        int iL2 = (int) (i40Var.l() * 255.0d);
        int iL3 = (int) (i40Var.l() * 255.0d);
        while (i40Var.i()) {
            i40Var.s();
        }
        i40Var.f();
        return Color.argb(255, iL, iL2, iL3);
    }

    public static PointF b(i40 i40Var, float f) {
        int iS = ex0.s(i40Var.o());
        if (iS == 0) {
            i40Var.a();
            float fL = (float) i40Var.l();
            float fL2 = (float) i40Var.l();
            while (i40Var.o() != 2) {
                i40Var.s();
            }
            i40Var.f();
            return new PointF(fL * f, fL2 * f);
        }
        if (iS != 2) {
            if (iS != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(ex0.t(i40Var.o())));
            }
            float fL3 = (float) i40Var.l();
            float fL4 = (float) i40Var.l();
            while (i40Var.i()) {
                i40Var.s();
            }
            return new PointF(fL3 * f, fL4 * f);
        }
        i40Var.c();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (i40Var.i()) {
            int iQ = i40Var.q(a);
            if (iQ == 0) {
                fD = d(i40Var);
            } else if (iQ != 1) {
                i40Var.r();
                i40Var.s();
            } else {
                fD2 = d(i40Var);
            }
        }
        i40Var.g();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(i40 i40Var, float f) {
        ArrayList arrayList = new ArrayList();
        i40Var.a();
        while (i40Var.o() == 1) {
            i40Var.a();
            arrayList.add(b(i40Var, f));
            i40Var.f();
        }
        i40Var.f();
        return arrayList;
    }

    public static float d(i40 i40Var) {
        int iO = i40Var.o();
        int iS = ex0.s(iO);
        if (iS != 0) {
            if (iS == 6) {
                return (float) i40Var.l();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(ex0.t(iO)));
        }
        i40Var.a();
        float fL = (float) i40Var.l();
        while (i40Var.i()) {
            i40Var.s();
        }
        i40Var.f();
        return fL;
    }
}
