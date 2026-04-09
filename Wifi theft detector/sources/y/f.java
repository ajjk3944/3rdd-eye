package y;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import y.b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static b.a f25011a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    public static int f25012b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f25013c = 0;

    public static boolean a(int i10, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourB = constraintWidget.B();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourR = constraintWidget.R();
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget.L() != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget.L() : null;
        if (dVar != null) {
            dVar.B();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.R();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z10 = dimensionBehaviourB == dimensionBehaviour5 || constraintWidget.l0() || dimensionBehaviourB == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourB == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f1717v == 0 && constraintWidget.f1684e0 == 0.0f && constraintWidget.Y(0)) || (dimensionBehaviourB == dimensionBehaviour2 && constraintWidget.f1717v == 1 && constraintWidget.b0(0, constraintWidget.U()));
        boolean z11 = dimensionBehaviourR == dimensionBehaviour5 || constraintWidget.m0() || dimensionBehaviourR == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourR == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f1719w == 0 && constraintWidget.f1684e0 == 0.0f && constraintWidget.Y(1)) || (dimensionBehaviourB == dimensionBehaviour && constraintWidget.f1719w == 1 && constraintWidget.b0(1, constraintWidget.y()));
        if (constraintWidget.f1684e0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0500b interfaceC0500b, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.e0()) {
            return;
        }
        f25012b++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.k0()) {
            int i11 = i10 + 1;
            if (a(i11, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.N1(i11, constraintWidget, interfaceC0500b, new b.a(), b.a.f24987k);
            }
        }
        ConstraintAnchor constraintAnchorP = constraintWidget.p(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorP2 = constraintWidget.p(ConstraintAnchor.Type.RIGHT);
        int iE = constraintAnchorP.e();
        int iE2 = constraintAnchorP2.e();
        if (constraintAnchorP.d() != null && constraintAnchorP.n()) {
            Iterator it = constraintAnchorP.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor constraintAnchor6 = (ConstraintAnchor) it.next();
                ConstraintWidget constraintWidget2 = constraintAnchor6.f1658d;
                int i12 = i10 + 1;
                boolean zA = a(i12, constraintWidget2);
                if (constraintWidget2.k0() && zA) {
                    androidx.constraintlayout.core.widgets.d.N1(i12, constraintWidget2, interfaceC0500b, new b.a(), b.a.f24987k);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviourB = constraintWidget2.B();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourB != dimensionBehaviour || zA) {
                    if (!constraintWidget2.k0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget2.P;
                        if (constraintAnchor6 == constraintAnchor7 && constraintWidget2.R.f1660f == null) {
                            int iF = constraintAnchor7.f() + iE;
                            constraintWidget2.A0(iF, constraintWidget2.U() + iF);
                            b(i12, constraintWidget2, interfaceC0500b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget2.R;
                            if (constraintAnchor6 == constraintAnchor8 && constraintAnchor7.f1660f == null) {
                                int iF2 = iE - constraintAnchor8.f();
                                constraintWidget2.A0(iF2 - constraintWidget2.U(), iF2);
                                b(i12, constraintWidget2, interfaceC0500b, z10);
                            } else if (constraintAnchor6 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor8.f1660f) != null && constraintAnchor3.n() && !constraintWidget2.g0()) {
                                d(i12, interfaceC0500b, constraintWidget2, z10);
                            }
                        }
                    }
                } else if (constraintWidget2.B() == dimensionBehaviour && constraintWidget2.f1725z >= 0 && constraintWidget2.f1723y >= 0 && (constraintWidget2.T() == 8 || (constraintWidget2.f1717v == 0 && constraintWidget2.w() == 0.0f))) {
                    if (!constraintWidget2.g0() && !constraintWidget2.j0() && ((constraintAnchor6 == constraintWidget2.P && (constraintAnchor5 = constraintWidget2.R.f1660f) != null && constraintAnchor5.n()) || (constraintAnchor6 == constraintWidget2.R && (constraintAnchor4 = constraintWidget2.P.f1660f) != null && constraintAnchor4.n()))) {
                        if (!constraintWidget2.g0()) {
                            e(i12, constraintWidget, interfaceC0500b, constraintWidget2, z10);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorP2.d() != null && constraintAnchorP2.n()) {
            Iterator it2 = constraintAnchorP2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor9 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget3 = constraintAnchor9.f1658d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, constraintWidget3);
                if (constraintWidget3.k0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.N1(i13, constraintWidget3, interfaceC0500b, new b.a(), b.a.f24987k);
                }
                boolean z11 = (constraintAnchor9 == constraintWidget3.P && (constraintAnchor2 = constraintWidget3.R.f1660f) != null && constraintAnchor2.n()) || (constraintAnchor9 == constraintWidget3.R && (constraintAnchor = constraintWidget3.P.f1660f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourB2 = constraintWidget3.B();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourB2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.k0()) {
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.P;
                        if (constraintAnchor9 == constraintAnchor10 && constraintWidget3.R.f1660f == null) {
                            int iF3 = constraintAnchor10.f() + iE2;
                            constraintWidget3.A0(iF3, constraintWidget3.U() + iF3);
                            b(i13, constraintWidget3, interfaceC0500b, z10);
                        } else {
                            ConstraintAnchor constraintAnchor11 = constraintWidget3.R;
                            if (constraintAnchor9 == constraintAnchor11 && constraintAnchor10.f1660f == null) {
                                int iF4 = iE2 - constraintAnchor11.f();
                                constraintWidget3.A0(iF4 - constraintWidget3.U(), iF4);
                                b(i13, constraintWidget3, interfaceC0500b, z10);
                            } else if (z11 && !constraintWidget3.g0()) {
                                d(i13, interfaceC0500b, constraintWidget3, z10);
                            }
                        }
                    }
                } else if (constraintWidget3.B() == dimensionBehaviour2 && constraintWidget3.f1725z >= 0 && constraintWidget3.f1723y >= 0 && (constraintWidget3.T() == 8 || (constraintWidget3.f1717v == 0 && constraintWidget3.w() == 0.0f))) {
                    if (!constraintWidget3.g0() && !constraintWidget3.j0() && z11 && !constraintWidget3.g0()) {
                        e(i13, constraintWidget, interfaceC0500b, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.o0();
    }

    public static void c(int i10, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0500b interfaceC0500b, int i11, boolean z10) {
        if (aVar.o1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0500b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0500b);
            }
        }
    }

    public static void d(int i10, b.InterfaceC0500b interfaceC0500b, ConstraintWidget constraintWidget, boolean z10) {
        float fZ = constraintWidget.z();
        int iE = constraintWidget.P.f1660f.e();
        int iE2 = constraintWidget.R.f1660f.e();
        int iF = constraintWidget.P.f() + iE;
        int iF2 = iE2 - constraintWidget.R.f();
        if (iE == iE2) {
            fZ = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iU = constraintWidget.U();
        int i11 = (iE2 - iE) - iU;
        if (iE > iE2) {
            i11 = (iE - iE2) - iU;
        }
        int i12 = ((int) (i11 > 0 ? (fZ * i11) + 0.5f : fZ * i11)) + iE;
        int i13 = i12 + iU;
        if (iE > iE2) {
            i13 = i12 - iU;
        }
        constraintWidget.A0(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0500b, z10);
    }

    public static void e(int i10, ConstraintWidget constraintWidget, b.InterfaceC0500b interfaceC0500b, ConstraintWidget constraintWidget2, boolean z10) {
        float fZ = constraintWidget2.z();
        int iE = constraintWidget2.P.f1660f.e() + constraintWidget2.P.f();
        int iE2 = constraintWidget2.R.f1660f.e() - constraintWidget2.R.f();
        if (iE2 >= iE) {
            int iU = constraintWidget2.U();
            if (constraintWidget2.T() != 8) {
                int i11 = constraintWidget2.f1717v;
                if (i11 == 2) {
                    iU = (int) (constraintWidget2.z() * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.U() : constraintWidget.L().U()));
                } else if (i11 == 0) {
                    iU = iE2 - iE;
                }
                iU = Math.max(constraintWidget2.f1723y, iU);
                int i12 = constraintWidget2.f1725z;
                if (i12 > 0) {
                    iU = Math.min(i12, iU);
                }
            }
            int i13 = iE + ((int) ((fZ * ((iE2 - iE) - iU)) + 0.5f));
            constraintWidget2.A0(i13, iU + i13);
            b(i10 + 1, constraintWidget2, interfaceC0500b, z10);
        }
    }

    public static void f(int i10, b.InterfaceC0500b interfaceC0500b, ConstraintWidget constraintWidget) {
        float fP = constraintWidget.P();
        int iE = constraintWidget.Q.f1660f.e();
        int iE2 = constraintWidget.S.f1660f.e();
        int iF = constraintWidget.Q.f() + iE;
        int iF2 = iE2 - constraintWidget.S.f();
        if (iE == iE2) {
            fP = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iY = constraintWidget.y();
        int i11 = (iE2 - iE) - iY;
        if (iE > iE2) {
            i11 = (iE - iE2) - iY;
        }
        int i12 = (int) (i11 > 0 ? (fP * i11) + 0.5f : fP * i11);
        int i13 = iE + i12;
        int i14 = i13 + iY;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iY;
        }
        constraintWidget.D0(i13, i14);
        i(i10 + 1, constraintWidget, interfaceC0500b);
    }

    public static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0500b interfaceC0500b, ConstraintWidget constraintWidget2) {
        float fP = constraintWidget2.P();
        int iE = constraintWidget2.Q.f1660f.e() + constraintWidget2.Q.f();
        int iE2 = constraintWidget2.S.f1660f.e() - constraintWidget2.S.f();
        if (iE2 >= iE) {
            int iY = constraintWidget2.y();
            if (constraintWidget2.T() != 8) {
                int i11 = constraintWidget2.f1719w;
                if (i11 == 2) {
                    iY = (int) (fP * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.y() : constraintWidget.L().y()));
                } else if (i11 == 0) {
                    iY = iE2 - iE;
                }
                iY = Math.max(constraintWidget2.B, iY);
                int i12 = constraintWidget2.C;
                if (i12 > 0) {
                    iY = Math.min(i12, iY);
                }
            }
            int i13 = iE + ((int) ((fP * ((iE2 - iE) - iY)) + 0.5f));
            constraintWidget2.D0(i13, iY + i13);
            i(i10 + 1, constraintWidget2, interfaceC0500b);
        }
    }

    public static void h(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0500b interfaceC0500b) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourB = dVar.B();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourR = dVar.R();
        f25012b = 0;
        f25013c = 0;
        dVar.t0();
        ArrayList arrayListM1 = dVar.m1();
        int size = arrayListM1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ConstraintWidget) arrayListM1.get(i10)).t0();
        }
        boolean zK1 = dVar.K1();
        if (dimensionBehaviourB == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.A0(0, dVar.U());
        } else {
            dVar.B0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayListM1.get(i11);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.n1() == 1) {
                    if (fVar.o1() != -1) {
                        fVar.r1(fVar.o1());
                    } else if (fVar.p1() != -1 && dVar.l0()) {
                        fVar.r1(dVar.U() - fVar.p1());
                    } else if (dVar.l0()) {
                        fVar.r1((int) ((fVar.q1() * dVar.U()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget).s1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) arrayListM1.get(i12);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.n1() == 1) {
                        b(0, fVar2, interfaceC0500b, zK1);
                    }
                }
            }
        }
        b(0, dVar, interfaceC0500b, zK1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget) arrayListM1.get(i13);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget3;
                    if (aVar.s1() == 0) {
                        c(0, aVar, interfaceC0500b, 0, zK1);
                    }
                }
            }
        }
        if (dimensionBehaviourR == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.D0(0, dVar.y());
        } else {
            dVar.C0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget4 = (ConstraintWidget) arrayListM1.get(i14);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.n1() == 0) {
                    if (fVar3.o1() != -1) {
                        fVar3.r1(fVar3.o1());
                    } else if (fVar3.p1() != -1 && dVar.m0()) {
                        fVar3.r1(dVar.y() - fVar3.p1());
                    } else if (dVar.m0()) {
                        fVar3.r1((int) ((fVar3.q1() * dVar.y()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget4).s1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) arrayListM1.get(i15);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.n1() == 0) {
                        i(1, fVar4, interfaceC0500b);
                    }
                }
            }
        }
        i(0, dVar, interfaceC0500b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) arrayListM1.get(i16);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget6;
                    if (aVar2.s1() == 1) {
                        c(0, aVar2, interfaceC0500b, 1, zK1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            ConstraintWidget constraintWidget7 = (ConstraintWidget) arrayListM1.get(i17);
            if (constraintWidget7.k0() && a(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.d.N1(0, constraintWidget7, interfaceC0500b, f25011a, b.a.f24987k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, interfaceC0500b, zK1);
                    i(0, constraintWidget7, interfaceC0500b);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).n1() == 0) {
                    i(0, constraintWidget7, interfaceC0500b);
                } else {
                    b(0, constraintWidget7, interfaceC0500b, zK1);
                }
            }
        }
    }

    public static void i(int i10, ConstraintWidget constraintWidget, b.InterfaceC0500b interfaceC0500b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.n0()) {
            return;
        }
        f25013c++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.k0()) {
            int i11 = i10 + 1;
            if (a(i11, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.N1(i11, constraintWidget, interfaceC0500b, new b.a(), b.a.f24987k);
            }
        }
        ConstraintAnchor constraintAnchorP = constraintWidget.p(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorP2 = constraintWidget.p(ConstraintAnchor.Type.BOTTOM);
        int iE = constraintAnchorP.e();
        int iE2 = constraintAnchorP2.e();
        if (constraintAnchorP.d() != null && constraintAnchorP.n()) {
            Iterator it = constraintAnchorP.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor constraintAnchor6 = (ConstraintAnchor) it.next();
                ConstraintWidget constraintWidget2 = constraintAnchor6.f1658d;
                int i12 = i10 + 1;
                boolean zA = a(i12, constraintWidget2);
                if (constraintWidget2.k0() && zA) {
                    androidx.constraintlayout.core.widgets.d.N1(i12, constraintWidget2, interfaceC0500b, new b.a(), b.a.f24987k);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviourR = constraintWidget2.R();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourR != dimensionBehaviour || zA) {
                    if (!constraintWidget2.k0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget2.Q;
                        if (constraintAnchor6 == constraintAnchor7 && constraintWidget2.S.f1660f == null) {
                            int iF = constraintAnchor7.f() + iE;
                            constraintWidget2.D0(iF, constraintWidget2.y() + iF);
                            i(i12, constraintWidget2, interfaceC0500b);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget2.S;
                            if (constraintAnchor6 == constraintAnchor8 && constraintAnchor8.f1660f == null) {
                                int iF2 = iE - constraintAnchor8.f();
                                constraintWidget2.D0(iF2 - constraintWidget2.y(), iF2);
                                i(i12, constraintWidget2, interfaceC0500b);
                            } else if (constraintAnchor6 == constraintAnchor7 && (constraintAnchor3 = constraintAnchor8.f1660f) != null && constraintAnchor3.n()) {
                                f(i12, interfaceC0500b, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.R() == dimensionBehaviour && constraintWidget2.C >= 0 && constraintWidget2.B >= 0 && (constraintWidget2.T() == 8 || (constraintWidget2.f1719w == 0 && constraintWidget2.w() == 0.0f))) {
                    if (!constraintWidget2.i0() && !constraintWidget2.j0() && ((constraintAnchor6 == constraintWidget2.Q && (constraintAnchor5 = constraintWidget2.S.f1660f) != null && constraintAnchor5.n()) || (constraintAnchor6 == constraintWidget2.S && (constraintAnchor4 = constraintWidget2.Q.f1660f) != null && constraintAnchor4.n()))) {
                        if (!constraintWidget2.i0()) {
                            g(i12, constraintWidget, interfaceC0500b, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorP2.d() != null && constraintAnchorP2.n()) {
            Iterator it2 = constraintAnchorP2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor constraintAnchor9 = (ConstraintAnchor) it2.next();
                ConstraintWidget constraintWidget3 = constraintAnchor9.f1658d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, constraintWidget3);
                if (constraintWidget3.k0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.N1(i13, constraintWidget3, interfaceC0500b, new b.a(), b.a.f24987k);
                }
                boolean z10 = (constraintAnchor9 == constraintWidget3.Q && (constraintAnchor2 = constraintWidget3.S.f1660f) != null && constraintAnchor2.n()) || (constraintAnchor9 == constraintWidget3.S && (constraintAnchor = constraintWidget3.Q.f1660f) != null && constraintAnchor.n());
                ConstraintWidget.DimensionBehaviour dimensionBehaviourR2 = constraintWidget3.R();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourR2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.k0()) {
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.Q;
                        if (constraintAnchor9 == constraintAnchor10 && constraintWidget3.S.f1660f == null) {
                            int iF3 = constraintAnchor10.f() + iE2;
                            constraintWidget3.D0(iF3, constraintWidget3.y() + iF3);
                            i(i13, constraintWidget3, interfaceC0500b);
                        } else {
                            ConstraintAnchor constraintAnchor11 = constraintWidget3.S;
                            if (constraintAnchor9 == constraintAnchor11 && constraintAnchor10.f1660f == null) {
                                int iF4 = iE2 - constraintAnchor11.f();
                                constraintWidget3.D0(iF4 - constraintWidget3.y(), iF4);
                                i(i13, constraintWidget3, interfaceC0500b);
                            } else if (z10 && !constraintWidget3.i0()) {
                                f(i13, interfaceC0500b, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.R() == dimensionBehaviour2 && constraintWidget3.C >= 0 && constraintWidget3.B >= 0 && (constraintWidget3.T() == 8 || (constraintWidget3.f1719w == 0 && constraintWidget3.w() == 0.0f))) {
                    if (!constraintWidget3.i0() && !constraintWidget3.j0() && z10 && !constraintWidget3.i0()) {
                        g(i13, constraintWidget, interfaceC0500b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorP3 = constraintWidget.p(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorP3.d() != null && constraintAnchorP3.n()) {
            int iE3 = constraintAnchorP3.e();
            Iterator it3 = constraintAnchorP3.d().iterator();
            while (it3.hasNext()) {
                ConstraintAnchor constraintAnchor12 = (ConstraintAnchor) it3.next();
                ConstraintWidget constraintWidget4 = constraintAnchor12.f1658d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, constraintWidget4);
                if (constraintWidget4.k0() && zA3) {
                    androidx.constraintlayout.core.widgets.d.N1(i14, constraintWidget4, interfaceC0500b, new b.a(), b.a.f24987k);
                }
                if (constraintWidget4.R() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zA3) {
                    if (!constraintWidget4.k0() && constraintAnchor12 == constraintWidget4.T) {
                        constraintWidget4.z0(constraintAnchor12.f() + iE3);
                        i(i14, constraintWidget4, interfaceC0500b);
                    }
                }
            }
        }
        constraintWidget.p0();
    }
}
