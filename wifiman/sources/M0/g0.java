package M0;

import M0.G;
import Zg.AbstractC3682n;
import android.graphics.RectF;
import android.text.Layout;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import sh.C7972g;

/* loaded from: classes.dex */
public abstract class g0 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int c(G.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, N0.f fVar, InterfaceC6839p interfaceC6839p) {
        int iB;
        int iD;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.right < f11) && (!aVar.c() || rectF.left > f10)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i13 = (iA + iB) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.c() || fA <= rectF.right) && (!aVar.c() || fA >= rectF.left)) {
                    iB = i13;
                } else {
                    iA = i13;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.a() - 1;
        }
        int iC = fVar.c(iB + 1);
        if (iC == -1 || (iD = fVar.d(iC)) <= aVar.b()) {
            return -1;
        }
        int iD2 = AbstractC7978m.d(iC, aVar.b());
        int iG = AbstractC7978m.g(iD, aVar.a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.c() ? a(iG - 1, i10, fArr) : a(iD2, i10, fArr);
            rectF2.right = aVar.c() ? b(iD2, i10, fArr) : b(iG - 1, i10, fArr);
            if (((Boolean) interfaceC6839p.invoke(rectF2, rectF)).booleanValue()) {
                return iG;
            }
            iG = fVar.b(iG);
            if (iG == -1 || iG <= aVar.b()) {
                break;
            }
            iD2 = AbstractC7978m.d(fVar.c(iG), aVar.b());
        }
        return -1;
    }

    public static final int[] d(f0 f0Var, Layout layout, G g10, RectF rectF, int i10, InterfaceC6839p interfaceC6839p) {
        int i11;
        int i12;
        N0.f jVar = i10 == 1 ? new N0.j(f0Var.G(), f0Var.I()) : N0.g.a(f0Var.G(), f0Var.H());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > f0Var.l(lineForVertical) && (lineForVertical = lineForVertical + 1) >= f0Var.m()) {
            return null;
        }
        int i13 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < f0Var.w(0)) {
            return null;
        }
        int iF = f(f0Var, layout, g10, i13, rectF, jVar, interfaceC6839p, true);
        while (true) {
            i11 = i13;
            i12 = iF;
            if (i12 != -1 || i11 >= lineForVertical2) {
                break;
            }
            i13 = i11 + 1;
            iF = f(f0Var, layout, g10, i13, rectF, jVar, interfaceC6839p, true);
        }
        if (i12 == -1) {
            return null;
        }
        int iF2 = f(f0Var, layout, g10, lineForVertical2, rectF, jVar, interfaceC6839p, false);
        while (iF2 == -1 && i11 < lineForVertical2) {
            lineForVertical2--;
            iF2 = f(f0Var, layout, g10, lineForVertical2, rectF, jVar, interfaceC6839p, false);
        }
        if (iF2 == -1) {
            return null;
        }
        return new int[]{jVar.c(i12 + 1), jVar.d(iF2 - 1)};
    }

    private static final int e(G.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, N0.f fVar, InterfaceC6839p interfaceC6839p) {
        int iB;
        int iC;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f10) && (!aVar.c() || rectF.right < f11)) {
            iB = aVar.b();
            int iA = aVar.a();
            while (iA - iB > 1) {
                int i13 = (iA + iB) / 2;
                float fA = a(i13, i10, fArr);
                if ((aVar.c() || fA <= rectF.left) && (!aVar.c() || fA >= rectF.right)) {
                    iB = i13;
                } else {
                    iA = i13;
                }
            }
            if (aVar.c()) {
                iB = iA;
            }
        } else {
            iB = aVar.b();
        }
        int iD = fVar.d(iB);
        if (iD == -1 || (iC = fVar.c(iD)) >= aVar.a()) {
            return -1;
        }
        int iD2 = AbstractC7978m.d(iC, aVar.b());
        int iG = AbstractC7978m.g(iD, aVar.a());
        RectF rectF2 = new RectF(0.0f, i11, 0.0f, i12);
        while (true) {
            rectF2.left = aVar.c() ? a(iG - 1, i10, fArr) : a(iD2, i10, fArr);
            rectF2.right = aVar.c() ? b(iD2, i10, fArr) : b(iG - 1, i10, fArr);
            if (((Boolean) interfaceC6839p.invoke(rectF2, rectF)).booleanValue()) {
                return iD2;
            }
            iD2 = fVar.a(iD2);
            if (iD2 == -1 || iD2 >= aVar.a()) {
                break;
            }
            iG = AbstractC7978m.g(fVar.d(iD2), aVar.a());
        }
        return -1;
    }

    private static final int f(f0 f0Var, Layout layout, G g10, int i10, RectF rectF, N0.f fVar, InterfaceC6839p interfaceC6839p, boolean z10) {
        int i11;
        G.a[] aVarArr;
        int i12;
        int iC;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        f0Var.b(i10, fArr);
        G.a[] aVarArrD = g10.d(i10);
        C7972g c7972gC0 = z10 ? AbstractC3682n.c0(aVarArrD) : AbstractC7978m.p(AbstractC3682n.g0(aVarArrD), 0);
        int i13 = c7972gC0.i();
        int iJ = c7972gC0.j();
        int iK = c7972gC0.k();
        if ((iK <= 0 || i13 > iJ) && (iK >= 0 || iJ > i13)) {
            return -1;
        }
        int i14 = i13;
        while (true) {
            G.a aVar = aVarArrD[i14];
            float fA = aVar.c() ? a(aVar.a() - 1, lineStart, fArr) : a(aVar.b(), lineStart, fArr);
            float fB = aVar.c() ? b(aVar.b(), lineStart, fArr) : b(aVar.a() - 1, lineStart, fArr);
            if (z10) {
                i11 = i14;
                aVarArr = aVarArrD;
                i12 = iJ;
                iC = e(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, interfaceC6839p);
            } else {
                i11 = i14;
                aVarArr = aVarArrD;
                i12 = iJ;
                iC = c(aVar, rectF, lineStart, lineTop, lineBottom, fA, fB, fArr, fVar, interfaceC6839p);
            }
            if (iC >= 0) {
                return iC;
            }
            if (i11 == i12) {
                return -1;
            }
            i14 = i11 + iK;
            iJ = i12;
            aVarArrD = aVarArr;
        }
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }
}
