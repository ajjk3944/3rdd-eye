package defpackage;

import android.graphics.PointF;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qp implements o41 {
    public static final qp f = new qp();
    public static final l92 g = l92.D("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.o41
    public final Object k(i40 i40Var, float f2) {
        PointF pointF;
        PointF pointF2;
        i40Var.c();
        String strN = null;
        float fL = 0.0f;
        float fL2 = 0.0f;
        float fL3 = 0.0f;
        float fL4 = 0.0f;
        int iM = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zK = true;
        int i = 3;
        String strN2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (i40Var.i()) {
            switch (i40Var.q(g)) {
                case 0:
                    strN = i40Var.n();
                    break;
                case 1:
                    strN2 = i40Var.n();
                    break;
                case 2:
                    pointF = pointF3;
                    fL = (float) i40Var.l();
                    pointF3 = pointF;
                    break;
                case 3:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int iM2 = i40Var.m();
                    i = (iM2 > 2 || iM2 < 0) ? 3 : ex0.v(3)[iM2];
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case 4:
                    iM = i40Var.m();
                    break;
                case 5:
                    pointF = pointF3;
                    fL2 = (float) i40Var.l();
                    pointF3 = pointF;
                    break;
                case 6:
                    pointF = pointF3;
                    fL3 = (float) i40Var.l();
                    pointF3 = pointF;
                    break;
                case 7:
                    iA = k40.a(i40Var);
                    break;
                case 8:
                    iA2 = k40.a(i40Var);
                    break;
                case 9:
                    pointF = pointF3;
                    fL4 = (float) i40Var.l();
                    pointF3 = pointF;
                    break;
                case 10:
                    zK = i40Var.k();
                    break;
                case 11:
                    i40Var.a();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) i40Var.l()) * f2, ((float) i40Var.l()) * f2);
                    i40Var.f();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    i40Var.a();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) i40Var.l()) * f2, ((float) i40Var.l()) * f2);
                    i40Var.f();
                    pointF3 = pointF;
                    break;
                default:
                    i40Var.r();
                    i40Var.s();
                    break;
            }
        }
        i40Var.g();
        pp ppVar = new pp();
        ppVar.a = strN;
        ppVar.b = strN2;
        ppVar.c = fL;
        ppVar.d = i;
        ppVar.e = iM;
        ppVar.f = fL2;
        ppVar.g = fL3;
        ppVar.h = iA;
        ppVar.i = iA2;
        ppVar.j = fL4;
        ppVar.k = zK;
        ppVar.l = pointF3;
        ppVar.m = pointF4;
        return ppVar;
    }
}
