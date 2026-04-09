package y;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24984a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public a f24985b = new a();

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.d f24986c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f24987k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f24988l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f24989m = 2;

        /* renamed from: a, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f24990a;

        /* renamed from: b, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f24991b;

        /* renamed from: c, reason: collision with root package name */
        public int f24992c;

        /* renamed from: d, reason: collision with root package name */
        public int f24993d;

        /* renamed from: e, reason: collision with root package name */
        public int f24994e;

        /* renamed from: f, reason: collision with root package name */
        public int f24995f;

        /* renamed from: g, reason: collision with root package name */
        public int f24996g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f24997h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f24998i;

        /* renamed from: j, reason: collision with root package name */
        public int f24999j;
    }

    /* renamed from: y.b$b, reason: collision with other inner class name */
    public interface InterfaceC0500b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.f24986c = dVar;
    }

    public final boolean a(InterfaceC0500b interfaceC0500b, ConstraintWidget constraintWidget, int i10) {
        this.f24985b.f24990a = constraintWidget.B();
        this.f24985b.f24991b = constraintWidget.R();
        this.f24985b.f24992c = constraintWidget.U();
        this.f24985b.f24993d = constraintWidget.y();
        a aVar = this.f24985b;
        aVar.f24998i = false;
        aVar.f24999j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f24990a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z10 = dimensionBehaviour == dimensionBehaviour2;
        boolean z11 = aVar.f24991b == dimensionBehaviour2;
        boolean z12 = z10 && constraintWidget.f1684e0 > 0.0f;
        boolean z13 = z11 && constraintWidget.f1684e0 > 0.0f;
        if (z12 && constraintWidget.f1721x[0] == 4) {
            aVar.f24990a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z13 && constraintWidget.f1721x[1] == 4) {
            aVar.f24991b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0500b.b(constraintWidget, aVar);
        constraintWidget.f1(this.f24985b.f24994e);
        constraintWidget.G0(this.f24985b.f24995f);
        constraintWidget.F0(this.f24985b.f24997h);
        constraintWidget.v0(this.f24985b.f24996g);
        a aVar2 = this.f24985b;
        aVar2.f24999j = a.f24987k;
        return aVar2.f24998i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.constraintlayout.core.widgets.d r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.T0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.O1(r1)
            y.b$b r2 = r13.D1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.T0
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r5.f1683e
            if (r6 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.d r7 = r5.f1685f
            if (r7 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f1759e
            boolean r6 = r6.f1743j
            if (r6 == 0) goto L47
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r7.f1759e
            boolean r6 = r6.f1743j
            if (r6 == 0) goto L47
            goto La0
        L47:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.v(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.v(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f1717v
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f1719w
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.O1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.h
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f1717v
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f1719w
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f1684e0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = y.b.a.f24987k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.b.b(androidx.constraintlayout.core.widgets.d):void");
    }

    public final void c(androidx.constraintlayout.core.widgets.d dVar, String str, int i10, int i11, int i12) {
        int iJ = dVar.J();
        int I = dVar.I();
        dVar.V0(0);
        dVar.U0(0);
        dVar.f1(i11);
        dVar.G0(i12);
        dVar.V0(iJ);
        dVar.U0(I);
        this.f24986c.S1(i10);
        this.f24986c.n1();
    }

    public long d(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zC1;
        int i19;
        int i20;
        int i21;
        androidx.constraintlayout.core.widgets.d dVar2;
        long j10;
        int i22;
        int i23;
        boolean z10;
        b bVar = this;
        InterfaceC0500b interfaceC0500bD1 = dVar.D1();
        int size = dVar.T0.size();
        int iU = dVar.U();
        int iY = dVar.y();
        boolean zB = androidx.constraintlayout.core.widgets.g.b(i10, 128);
        boolean z11 = zB || androidx.constraintlayout.core.widgets.g.b(i10, 64);
        if (z11) {
            for (int i24 = 0; i24 < size; i24++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) dVar.T0.get(i24);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourB = constraintWidget.B();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z12 = (dimensionBehaviourB == dimensionBehaviour) && (constraintWidget.R() == dimensionBehaviour) && constraintWidget.w() > 0.0f;
                if ((constraintWidget.g0() && z12) || ((constraintWidget.i0() && z12) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.h) || constraintWidget.g0() || constraintWidget.i0())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            boolean z13 = androidx.constraintlayout.core.c.f1555r;
        }
        boolean z14 = z11 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i25 = 2;
        if (z14) {
            int iMin = Math.min(dVar.H(), i14);
            int iMin2 = Math.min(dVar.G(), i16);
            if (i13 == 1073741824 && dVar.U() != iMin) {
                dVar.f1(iMin);
                dVar.H1();
            }
            if (i15 == 1073741824 && dVar.y() != iMin2) {
                dVar.G0(iMin2);
                dVar.H1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zC1 = dVar.A1(zB);
                i19 = 2;
            } else {
                boolean zB1 = dVar.B1(zB);
                if (i13 == 1073741824) {
                    zB1 &= dVar.C1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zC1 = dVar.C1(zB, 1) & zB1;
                    i19++;
                } else {
                    zC1 = zB1;
                }
            }
            if (zC1) {
                dVar.k1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zC1 = false;
            i19 = 0;
        }
        long j11 = 0;
        if (zC1 && i19 == 2) {
            return 0L;
        }
        int iE1 = dVar.E1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = bVar.f24984a.size();
        if (size > 0) {
            bVar.c(dVar, "First pass", 0, iU, iY);
            i20 = iU;
            i21 = iY;
        } else {
            i20 = iU;
            i21 = iY;
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourB2 = dVar.B();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z15 = dimensionBehaviourB2 == dimensionBehaviour2;
            boolean z16 = dVar.R() == dimensionBehaviour2;
            int iMax = Math.max(dVar.U(), bVar.f24986c.J());
            int iMax2 = Math.max(dVar.y(), bVar.f24986c.I());
            int i26 = 0;
            boolean zA1 = false;
            while (i26 < size2) {
                long j12 = j11;
                ConstraintWidget constraintWidget2 = (ConstraintWidget) bVar.f24984a.get(i26);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.h) {
                    int iU2 = constraintWidget2.U();
                    int iY2 = constraintWidget2.y();
                    boolean zA = zA1 | bVar.a(interfaceC0500bD1, constraintWidget2, a.f24988l);
                    i23 = i20;
                    int iU3 = constraintWidget2.U();
                    z10 = z14;
                    int iY3 = constraintWidget2.y();
                    if (iU3 != iU2) {
                        constraintWidget2.f1(iU3);
                        if (z15 && constraintWidget2.N() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.N() + constraintWidget2.p(ConstraintAnchor.Type.RIGHT).f());
                        }
                        zA = true;
                    }
                    if (iY3 != iY2) {
                        constraintWidget2.G0(iY3);
                        if (z16 && constraintWidget2.s() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.s() + constraintWidget2.p(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        zA = true;
                    }
                    zA1 = zA | ((androidx.constraintlayout.core.widgets.h) constraintWidget2).A1();
                } else {
                    i23 = i20;
                    z10 = z14;
                }
                i26++;
                i20 = i23;
                j11 = j12;
                z14 = z10;
                i25 = 2;
            }
            int i27 = i20;
            boolean z17 = z14;
            j10 = j11;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) bVar.f24984a.get(i30);
                    if (((constraintWidget3 instanceof x.a) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.h)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.f) || constraintWidget3.T() == 8 || ((z17 && constraintWidget3.f1683e.f1759e.f1743j && constraintWidget3.f1685f.f1759e.f1743j) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.h))) {
                        i22 = i29;
                    } else {
                        int iU4 = constraintWidget3.U();
                        int iY4 = constraintWidget3.y();
                        int iQ = constraintWidget3.q();
                        int i31 = a.f24988l;
                        if (i29 == 1) {
                            i31 = a.f24989m;
                        }
                        boolean zA2 = zA1 | bVar.a(interfaceC0500bD1, constraintWidget3, i31);
                        int iU5 = constraintWidget3.U();
                        i22 = i29;
                        int iY5 = constraintWidget3.y();
                        if (iU5 != iU4) {
                            constraintWidget3.f1(iU5);
                            if (z15 && constraintWidget3.N() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.N() + constraintWidget3.p(ConstraintAnchor.Type.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iY5 != iY4) {
                            constraintWidget3.G0(iY5);
                            if (z16 && constraintWidget3.s() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.s() + constraintWidget3.p(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zA1 = (!constraintWidget3.X() || iQ == constraintWidget3.q()) ? zA2 : true;
                    }
                    i30++;
                    bVar = this;
                    i29 = i22;
                }
                int i32 = i29;
                if (!zA1) {
                    break;
                }
                i29 = i32 + 1;
                c(dVar, "intermediate pass", i29, i27, i21);
                i28 = 2;
                zA1 = false;
                bVar = this;
            }
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            j10 = 0;
        }
        dVar2.R1(iE1);
        return j10;
    }

    public void e(androidx.constraintlayout.core.widgets.d dVar) {
        this.f24984a.clear();
        int size = dVar.T0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) dVar.T0.get(i10);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourB = constraintWidget.B();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourB == dimensionBehaviour || constraintWidget.R() == dimensionBehaviour) {
                this.f24984a.add(constraintWidget);
            }
        }
        dVar.H1();
    }
}
