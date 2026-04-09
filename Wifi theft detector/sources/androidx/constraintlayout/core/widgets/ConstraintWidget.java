package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static float S0 = 0.5f;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public boolean L;
    public float[] L0;
    public ConstraintWidget[] M0;
    public ConstraintWidget[] N0;
    public ConstraintWidget O0;
    public ConstraintWidget P0;
    public int Q0;
    public int R0;
    public ConstraintAnchor W;
    public ConstraintAnchor[] X;
    public ArrayList Y;
    public boolean[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public DimensionBehaviour[] f1676a0;

    /* renamed from: b0, reason: collision with root package name */
    public ConstraintWidget f1678b0;

    /* renamed from: c, reason: collision with root package name */
    public y.c f1679c;

    /* renamed from: c0, reason: collision with root package name */
    public int f1680c0;

    /* renamed from: d, reason: collision with root package name */
    public y.c f1681d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1682d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f1684e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1686f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f1688g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f1690h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f1692i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f1694j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f1696k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f1698l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1700m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1702n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f1704o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f1706p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f1708q0;

    /* renamed from: r0, reason: collision with root package name */
    public Object f1710r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f1712s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f1714t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f1716u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f1718v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f1720w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1722x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f1724y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f1726z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1675a = false;

    /* renamed from: b, reason: collision with root package name */
    public WidgetRun[] f1677b = new WidgetRun[2];

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f1683e = null;

    /* renamed from: f, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f1685f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f1687g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    public boolean f1689h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1691i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1693j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1695k = true;

    /* renamed from: l, reason: collision with root package name */
    public int f1697l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f1699m = -1;

    /* renamed from: n, reason: collision with root package name */
    public w.a f1701n = new w.a(this);

    /* renamed from: o, reason: collision with root package name */
    public boolean f1703o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1705p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1707q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1709r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f1711s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f1713t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f1715u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f1717v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1719w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int[] f1721x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public int f1723y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f1725z = 0;
    public float A = 1.0f;
    public int B = 0;
    public int C = 0;
    public float D = 1.0f;
    public int G = -1;
    public float H = 1.0f;
    public int[] I = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float J = 0.0f;
    public boolean K = false;
    public boolean M = false;
    public int N = 0;
    public int O = 0;
    public ConstraintAnchor P = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
    public ConstraintAnchor Q = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
    public ConstraintAnchor R = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
    public ConstraintAnchor S = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
    public ConstraintAnchor T = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
    public ConstraintAnchor U = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
    public ConstraintAnchor V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1732a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1733b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f1733b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1733b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1733b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1733b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f1732a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1732a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1732a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1732a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1732a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1732a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1732a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1732a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1732a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.W = constraintAnchor;
        this.X = new ConstraintAnchor[]{this.P, this.R, this.Q, this.S, this.T, constraintAnchor};
        this.Y = new ArrayList();
        this.Z = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f1676a0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f1678b0 = null;
        this.f1680c0 = 0;
        this.f1682d0 = 0;
        this.f1684e0 = 0.0f;
        this.f1686f0 = -1;
        this.f1688g0 = 0;
        this.f1690h0 = 0;
        this.f1692i0 = 0;
        this.f1694j0 = 0;
        this.f1696k0 = 0;
        this.f1698l0 = 0;
        this.f1700m0 = 0;
        float f10 = S0;
        this.f1706p0 = f10;
        this.f1708q0 = f10;
        this.f1712s0 = 0;
        this.f1714t0 = 0;
        this.f1716u0 = null;
        this.f1718v0 = null;
        this.G0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.L0 = new float[]{-1.0f, -1.0f};
        this.M0 = new ConstraintWidget[]{null, null};
        this.N0 = new ConstraintWidget[]{null, null};
        this.O0 = null;
        this.P0 = null;
        this.Q0 = -1;
        this.R0 = -1;
        d();
    }

    public int A() {
        return this.H0;
    }

    public void A0(int i10, int i11) {
        if (this.f1703o) {
            return;
        }
        this.P.t(i10);
        this.R.t(i11);
        this.f1688g0 = i10;
        this.f1680c0 = i11 - i10;
        this.f1703o = true;
    }

    public DimensionBehaviour B() {
        return this.f1676a0[0];
    }

    public void B0(int i10) {
        this.P.t(i10);
        this.f1688g0 = i10;
    }

    public int C() {
        ConstraintAnchor constraintAnchor = this.P;
        int i10 = constraintAnchor != null ? constraintAnchor.f1661g : 0;
        ConstraintAnchor constraintAnchor2 = this.R;
        return constraintAnchor2 != null ? i10 + constraintAnchor2.f1661g : i10;
    }

    public void C0(int i10) {
        this.Q.t(i10);
        this.f1690h0 = i10;
    }

    public int D() {
        return this.N;
    }

    public void D0(int i10, int i11) {
        if (this.f1705p) {
            return;
        }
        this.Q.t(i10);
        this.S.t(i11);
        this.f1690h0 = i10;
        this.f1682d0 = i11 - i10;
        if (this.K) {
            this.T.t(i10 + this.f1700m0);
        }
        this.f1705p = true;
    }

    public int E() {
        return this.O;
    }

    public void E0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f1688g0 = i10;
        this.f1690h0 = i11;
        if (this.f1714t0 == 8) {
            this.f1680c0 = 0;
            this.f1682d0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f1676a0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i16 < (i15 = this.f1680c0)) {
            i16 = i15;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i17 < (i14 = this.f1682d0)) {
            i17 = i14;
        }
        this.f1680c0 = i16;
        this.f1682d0 = i17;
        int i18 = this.f1704o0;
        if (i17 < i18) {
            this.f1682d0 = i18;
        }
        int i19 = this.f1702n0;
        if (i16 < i19) {
            this.f1680c0 = i19;
        }
        int i20 = this.f1725z;
        if (i20 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f1680c0 = Math.min(this.f1680c0, i20);
        }
        int i21 = this.C;
        if (i21 > 0 && this.f1676a0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f1682d0 = Math.min(this.f1682d0, i21);
        }
        int i22 = this.f1680c0;
        if (i16 != i22) {
            this.f1697l = i22;
        }
        int i23 = this.f1682d0;
        if (i17 != i23) {
            this.f1699m = i23;
        }
    }

    public int F(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 == 1) {
            return y();
        }
        return 0;
    }

    public void F0(boolean z10) {
        this.K = z10;
    }

    public int G() {
        return this.I[1];
    }

    public void G0(int i10) {
        this.f1682d0 = i10;
        int i11 = this.f1704o0;
        if (i10 < i11) {
            this.f1682d0 = i11;
        }
    }

    public int H() {
        return this.I[0];
    }

    public void H0(float f10) {
        this.f1706p0 = f10;
    }

    public int I() {
        return this.f1704o0;
    }

    public void I0(int i10) {
        this.H0 = i10;
    }

    public int J() {
        return this.f1702n0;
    }

    public void J0(int i10, int i11) {
        this.f1688g0 = i10;
        int i12 = i11 - i10;
        this.f1680c0 = i12;
        int i13 = this.f1702n0;
        if (i12 < i13) {
            this.f1680c0 = i13;
        }
    }

    public ConstraintWidget K(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.S).f1660f) != null && constraintAnchor2.f1660f == constraintAnchor) {
                return constraintAnchor2.f1658d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.R;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
        if (constraintAnchor4 == null || constraintAnchor4.f1660f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f1658d;
    }

    public void K0(DimensionBehaviour dimensionBehaviour) {
        this.f1676a0[0] = dimensionBehaviour;
    }

    public ConstraintWidget L() {
        return this.f1678b0;
    }

    public void L0(int i10, int i11, int i12, float f10) {
        this.f1717v = i10;
        this.f1723y = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f1725z = i12;
        this.A = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f1717v = 2;
    }

    public ConstraintWidget M(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.Q).f1660f) != null && constraintAnchor2.f1660f == constraintAnchor) {
                return constraintAnchor2.f1658d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.P;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
        if (constraintAnchor4 == null || constraintAnchor4.f1660f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f1658d;
    }

    public void M0(float f10) {
        this.L0[0] = f10;
    }

    public int N() {
        return V() + this.f1680c0;
    }

    public void N0(int i10, boolean z10) {
        this.Z[i10] = z10;
    }

    public WidgetRun O(int i10) {
        if (i10 == 0) {
            return this.f1683e;
        }
        if (i10 == 1) {
            return this.f1685f;
        }
        return null;
    }

    public void O0(boolean z10) {
        this.L = z10;
    }

    public float P() {
        return this.f1708q0;
    }

    public void P0(boolean z10) {
        this.M = z10;
    }

    public int Q() {
        return this.I0;
    }

    public void Q0(int i10, int i11) {
        this.N = i10;
        this.O = i11;
        T0(false);
    }

    public DimensionBehaviour R() {
        return this.f1676a0[1];
    }

    public void R0(int i10) {
        this.I[1] = i10;
    }

    public int S() {
        int i10 = this.P != null ? this.Q.f1661g : 0;
        return this.R != null ? i10 + this.S.f1661g : i10;
    }

    public void S0(int i10) {
        this.I[0] = i10;
    }

    public int T() {
        return this.f1714t0;
    }

    public void T0(boolean z10) {
        this.f1691i = z10;
    }

    public int U() {
        if (this.f1714t0 == 8) {
            return 0;
        }
        return this.f1680c0;
    }

    public void U0(int i10) {
        if (i10 < 0) {
            this.f1704o0 = 0;
        } else {
            this.f1704o0 = i10;
        }
    }

    public int V() {
        ConstraintWidget constraintWidget = this.f1678b0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f1688g0 : ((d) constraintWidget).f1799a1 + this.f1688g0;
    }

    public void V0(int i10) {
        if (i10 < 0) {
            this.f1702n0 = 0;
        } else {
            this.f1702n0 = i10;
        }
    }

    public int W() {
        ConstraintWidget constraintWidget = this.f1678b0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f1690h0 : ((d) constraintWidget).f1800b1 + this.f1690h0;
    }

    public void W0(int i10, int i11) {
        this.f1688g0 = i10;
        this.f1690h0 = i11;
    }

    public boolean X() {
        return this.K;
    }

    public void X0(ConstraintWidget constraintWidget) {
        this.f1678b0 = constraintWidget;
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.P.f1660f != null ? 1 : 0) + (this.R.f1660f != null ? 1 : 0) < 2;
        }
        return ((this.Q.f1660f != null ? 1 : 0) + (this.S.f1660f != null ? 1 : 0)) + (this.T.f1660f != null ? 1 : 0) < 2;
    }

    public void Y0(float f10) {
        this.f1708q0 = f10;
    }

    public boolean Z() {
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((ConstraintAnchor) this.Y.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(int i10) {
        this.I0 = i10;
    }

    public boolean a0() {
        return (this.f1697l == -1 && this.f1699m == -1) ? false : true;
    }

    public void a1(int i10, int i11) {
        this.f1690h0 = i10;
        int i12 = i11 - i10;
        this.f1682d0 = i12;
        int i13 = this.f1704o0;
        if (i12 < i13) {
            this.f1682d0 = i13;
        }
    }

    public boolean b0(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.P.f1660f;
            return constraintAnchor3 != null && constraintAnchor3.n() && (constraintAnchor2 = this.R.f1660f) != null && constraintAnchor2.n() && (this.R.f1660f.e() - this.R.f()) - (this.P.f1660f.e() + this.P.f()) >= i11;
        }
        ConstraintAnchor constraintAnchor4 = this.Q.f1660f;
        if (constraintAnchor4 != null && constraintAnchor4.n() && (constraintAnchor = this.S.f1660f) != null && constraintAnchor.n() && (this.S.f1660f.e() - this.S.f()) - (this.Q.f1660f.e() + this.Q.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void b1(DimensionBehaviour dimensionBehaviour) {
        this.f1676a0[1] = dimensionBehaviour;
    }

    public void c0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        p(type).b(constraintWidget.p(type2), i10, i11, true);
    }

    public void c1(int i10, int i11, int i12, float f10) {
        this.f1719w = i10;
        this.B = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.C = i12;
        this.D = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f1719w = 2;
    }

    public final void d() {
        this.Y.add(this.P);
        this.Y.add(this.Q);
        this.Y.add(this.R);
        this.Y.add(this.S);
        this.Y.add(this.U);
        this.Y.add(this.V);
        this.Y.add(this.W);
        this.Y.add(this.T);
    }

    public final boolean d0(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.X;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
        return (constraintAnchor4 == null || constraintAnchor4.f1660f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f1660f) == null || constraintAnchor2.f1660f != constraintAnchor) ? false : true;
    }

    public void d1(float f10) {
        this.L0[1] = f10;
    }

    public void e(d dVar, androidx.constraintlayout.core.c cVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            g(cVar, dVar.O1(64));
        }
        if (i10 == 0) {
            HashSet hashSetD = this.P.d();
            if (hashSetD != null) {
                Iterator it = hashSetD.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).f1658d.e(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet hashSetD2 = this.R.d();
            if (hashSetD2 != null) {
                Iterator it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).f1658d.e(dVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetD3 = this.Q.d();
        if (hashSetD3 != null) {
            Iterator it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).f1658d.e(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD4 = this.S.d();
        if (hashSetD4 != null) {
            Iterator it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).f1658d.e(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD5 = this.T.d();
        if (hashSetD5 != null) {
            Iterator it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).f1658d.e(dVar, cVar, hashSet, i10, true);
            }
        }
    }

    public boolean e0() {
        return this.f1707q;
    }

    public void e1(int i10) {
        this.f1714t0 = i10;
    }

    public boolean f() {
        return (this instanceof h) || (this instanceof f);
    }

    public boolean f0(int i10) {
        return this.Z[i10];
    }

    public void f1(int i10) {
        this.f1680c0 = i10;
        int i11 = this.f1702n0;
        if (i10 < i11) {
            this.f1680c0 = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x056b  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(androidx.constraintlayout.core.c r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.c, boolean):void");
    }

    public boolean g0() {
        ConstraintAnchor constraintAnchor = this.P;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
        if (constraintAnchor2 != null && constraintAnchor2.f1660f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.R;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
        return constraintAnchor4 != null && constraintAnchor4.f1660f == constraintAnchor3;
    }

    public void g1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f1715u = i10;
    }

    public boolean h() {
        return this.f1714t0 != 8;
    }

    public boolean h0() {
        return this.L;
    }

    public void h1(int i10) {
        this.f1688g0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0557 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:376:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.constraintlayout.core.c r31, boolean r32, boolean r33, boolean r34, boolean r35, androidx.constraintlayout.core.SolverVariable r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r38, boolean r39, androidx.constraintlayout.core.widgets.ConstraintAnchor r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public boolean i0() {
        ConstraintAnchor constraintAnchor = this.Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f1660f;
        if (constraintAnchor2 != null && constraintAnchor2.f1660f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f1660f;
        return constraintAnchor4 != null && constraintAnchor4.f1660f == constraintAnchor3;
    }

    public void i1(int i10) {
        this.f1690h0 = i10;
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    j(type6, constraintWidget, type2, 0);
                    j(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    p(type5).a(constraintWidget.p(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    j(type7, constraintWidget, type2, 0);
                    j(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    p(type5).a(constraintWidget.p(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorP = p(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorP2 = p(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorP3 = p(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorP4 = p(type11);
            boolean z11 = true;
            if ((constraintAnchorP == null || !constraintAnchorP.o()) && (constraintAnchorP2 == null || !constraintAnchorP2.o())) {
                j(type8, constraintWidget, type8, 0);
                j(type9, constraintWidget, type9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((constraintAnchorP3 == null || !constraintAnchorP3.o()) && (constraintAnchorP4 == null || !constraintAnchorP4.o())) {
                j(type10, constraintWidget, type10, 0);
                j(type11, constraintWidget, type11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                p(type5).a(constraintWidget.p(type5), 0);
                return;
            }
            if (z10) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                p(type12).a(constraintWidget.p(type12), 0);
                return;
            } else {
                if (z11) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    p(type13).a(constraintWidget.p(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorP5 = p(type4);
            ConstraintAnchor constraintAnchorP6 = constraintWidget.p(type2);
            ConstraintAnchor constraintAnchorP7 = p(ConstraintAnchor.Type.RIGHT);
            constraintAnchorP5.a(constraintAnchorP6, 0);
            constraintAnchorP7.a(constraintAnchorP6, 0);
            p(type14).a(constraintAnchorP6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorP8 = constraintWidget.p(type2);
            p(type3).a(constraintAnchorP8, 0);
            p(ConstraintAnchor.Type.BOTTOM).a(constraintAnchorP8, 0);
            p(type15).a(constraintAnchorP8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            p(type16).a(constraintWidget.p(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            p(type17).a(constraintWidget.p(type17), 0);
            p(type14).a(constraintWidget.p(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            p(type18).a(constraintWidget.p(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            p(type19).a(constraintWidget.p(type19), 0);
            p(type15).a(constraintWidget.p(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorP9 = p(type);
        ConstraintAnchor constraintAnchorP10 = constraintWidget.p(type2);
        if (constraintAnchorP9.p(constraintAnchorP10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorP11 = p(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorP12 = p(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorP11 != null) {
                    constraintAnchorP11.q();
                }
                if (constraintAnchorP12 != null) {
                    constraintAnchorP12.q();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorP13 = p(type20);
                if (constraintAnchorP13 != null) {
                    constraintAnchorP13.q();
                }
                ConstraintAnchor constraintAnchorP14 = p(type5);
                if (constraintAnchorP14.j() != constraintAnchorP10) {
                    constraintAnchorP14.q();
                }
                ConstraintAnchor constraintAnchorG = p(type).g();
                ConstraintAnchor constraintAnchorP15 = p(type15);
                if (constraintAnchorP15.o()) {
                    constraintAnchorG.q();
                    constraintAnchorP15.q();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorP16 = p(type5);
                if (constraintAnchorP16.j() != constraintAnchorP10) {
                    constraintAnchorP16.q();
                }
                ConstraintAnchor constraintAnchorG2 = p(type).g();
                ConstraintAnchor constraintAnchorP17 = p(type14);
                if (constraintAnchorP17.o()) {
                    constraintAnchorG2.q();
                    constraintAnchorP17.q();
                }
            }
            constraintAnchorP9.a(constraintAnchorP10, i10);
        }
    }

    public boolean j0() {
        return this.M;
    }

    public void j1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.G == -1) {
            if (z12 && !z13) {
                this.G = 0;
            } else if (!z12 && z13) {
                this.G = 1;
                if (this.f1686f0 == -1) {
                    this.H = 1.0f / this.H;
                }
            }
        }
        if (this.G == 0 && (!this.Q.o() || !this.S.o())) {
            this.G = 1;
        } else if (this.G == 1 && (!this.P.o() || !this.R.o())) {
            this.G = 0;
        }
        if (this.G == -1 && (!this.Q.o() || !this.S.o() || !this.P.o() || !this.R.o())) {
            if (this.Q.o() && this.S.o()) {
                this.G = 0;
            } else if (this.P.o() && this.R.o()) {
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
        if (this.G == -1) {
            int i10 = this.f1723y;
            if (i10 > 0 && this.B == 0) {
                this.G = 0;
            } else {
                if (i10 != 0 || this.B <= 0) {
                    return;
                }
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
    }

    public void k(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.h() == this) {
            j(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i10);
        }
    }

    public boolean k0() {
        return this.f1691i && this.f1714t0 != 8;
    }

    public void k1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f1683e.k();
        boolean zK2 = z11 & this.f1685f.k();
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.f1683e;
        int i12 = cVar.f1762h.f1740g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f1685f;
        int i13 = dVar.f1762h.f1740g;
        int i14 = cVar.f1763i.f1740g;
        int i15 = dVar.f1763i.f1740g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f1688g0 = i12;
        }
        if (zK2) {
            this.f1690h0 = i13;
        }
        if (this.f1714t0 == 8) {
            this.f1680c0 = 0;
            this.f1682d0 = 0;
            return;
        }
        if (zK) {
            if (this.f1676a0[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.f1680c0)) {
                i17 = i11;
            }
            this.f1680c0 = i17;
            int i19 = this.f1702n0;
            if (i17 < i19) {
                this.f1680c0 = i19;
            }
        }
        if (zK2) {
            if (this.f1676a0[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.f1682d0)) {
                i18 = i10;
            }
            this.f1682d0 = i18;
            int i20 = this.f1704o0;
            if (i18 < i20) {
                this.f1682d0 = i20;
            }
        }
    }

    public void l(ConstraintWidget constraintWidget, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        c0(type, constraintWidget, type, i10, 0);
        this.J = f10;
    }

    public boolean l0() {
        if (this.f1703o) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void l1(androidx.constraintlayout.core.c cVar, boolean z10) {
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        androidx.constraintlayout.core.widgets.analyzer.c cVar2;
        int iX = cVar.x(this.P);
        int iX2 = cVar.x(this.Q);
        int iX3 = cVar.x(this.R);
        int iX4 = cVar.x(this.S);
        if (z10 && (cVar2 = this.f1683e) != null) {
            DependencyNode dependencyNode = cVar2.f1762h;
            if (dependencyNode.f1743j) {
                DependencyNode dependencyNode2 = cVar2.f1763i;
                if (dependencyNode2.f1743j) {
                    iX = dependencyNode.f1740g;
                    iX3 = dependencyNode2.f1740g;
                }
            }
        }
        if (z10 && (dVar = this.f1685f) != null) {
            DependencyNode dependencyNode3 = dVar.f1762h;
            if (dependencyNode3.f1743j) {
                DependencyNode dependencyNode4 = dVar.f1763i;
                if (dependencyNode4.f1743j) {
                    iX2 = dependencyNode3.f1740g;
                    iX4 = dependencyNode4.f1740g;
                }
            }
        }
        int i10 = iX4 - iX2;
        if (iX3 - iX < 0 || i10 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        E0(iX, iX2, iX3, iX4);
    }

    public void m(ConstraintWidget constraintWidget, HashMap map) {
        this.f1711s = constraintWidget.f1711s;
        this.f1713t = constraintWidget.f1713t;
        this.f1717v = constraintWidget.f1717v;
        this.f1719w = constraintWidget.f1719w;
        int[] iArr = this.f1721x;
        int[] iArr2 = constraintWidget.f1721x;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f1723y = constraintWidget.f1723y;
        this.f1725z = constraintWidget.f1725z;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        int[] iArr3 = constraintWidget.I;
        this.I = Arrays.copyOf(iArr3, iArr3.length);
        this.J = constraintWidget.J;
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.f1676a0 = (DimensionBehaviour[]) Arrays.copyOf(this.f1676a0, 2);
        this.f1678b0 = this.f1678b0 == null ? null : (ConstraintWidget) map.get(constraintWidget.f1678b0);
        this.f1680c0 = constraintWidget.f1680c0;
        this.f1682d0 = constraintWidget.f1682d0;
        this.f1684e0 = constraintWidget.f1684e0;
        this.f1686f0 = constraintWidget.f1686f0;
        this.f1688g0 = constraintWidget.f1688g0;
        this.f1690h0 = constraintWidget.f1690h0;
        this.f1692i0 = constraintWidget.f1692i0;
        this.f1694j0 = constraintWidget.f1694j0;
        this.f1696k0 = constraintWidget.f1696k0;
        this.f1698l0 = constraintWidget.f1698l0;
        this.f1700m0 = constraintWidget.f1700m0;
        this.f1702n0 = constraintWidget.f1702n0;
        this.f1704o0 = constraintWidget.f1704o0;
        this.f1706p0 = constraintWidget.f1706p0;
        this.f1708q0 = constraintWidget.f1708q0;
        this.f1710r0 = constraintWidget.f1710r0;
        this.f1712s0 = constraintWidget.f1712s0;
        this.f1714t0 = constraintWidget.f1714t0;
        this.f1716u0 = constraintWidget.f1716u0;
        this.f1718v0 = constraintWidget.f1718v0;
        this.f1720w0 = constraintWidget.f1720w0;
        this.f1722x0 = constraintWidget.f1722x0;
        this.f1724y0 = constraintWidget.f1724y0;
        this.f1726z0 = constraintWidget.f1726z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        this.H0 = constraintWidget.H0;
        this.I0 = constraintWidget.I0;
        this.J0 = constraintWidget.J0;
        this.K0 = constraintWidget.K0;
        float[] fArr = this.L0;
        float[] fArr2 = constraintWidget.L0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.M0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.M0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.N0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.N0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.O0;
        this.O0 = constraintWidget2 == null ? null : (ConstraintWidget) map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.P0;
        this.P0 = constraintWidget3 != null ? (ConstraintWidget) map.get(constraintWidget3) : null;
    }

    public boolean m0() {
        if (this.f1705p) {
            return true;
        }
        return this.Q.n() && this.S.n();
    }

    public void n(androidx.constraintlayout.core.c cVar) {
        cVar.q(this.P);
        cVar.q(this.Q);
        cVar.q(this.R);
        cVar.q(this.S);
        if (this.f1700m0 > 0) {
            cVar.q(this.T);
        }
    }

    public boolean n0() {
        return this.f1709r;
    }

    public void o() {
        if (this.f1683e == null) {
            this.f1683e = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f1685f == null) {
            this.f1685f = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public void o0() {
        this.f1707q = true;
    }

    public ConstraintAnchor p(ConstraintAnchor.Type type) {
        switch (a.f1732a[type.ordinal()]) {
            case 1:
                return this.P;
            case 2:
                return this.Q;
            case 3:
                return this.R;
            case 4:
                return this.S;
            case 5:
                return this.T;
            case 6:
                return this.W;
            case 7:
                return this.U;
            case 8:
                return this.V;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public void p0() {
        this.f1709r = true;
    }

    public int q() {
        return this.f1700m0;
    }

    public boolean q0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f1676a0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public float r(int i10) {
        if (i10 == 0) {
            return this.f1706p0;
        }
        if (i10 == 1) {
            return this.f1708q0;
        }
        return -1.0f;
    }

    public void r0() {
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.f1678b0 = null;
        this.J = 0.0f;
        this.f1680c0 = 0;
        this.f1682d0 = 0;
        this.f1684e0 = 0.0f;
        this.f1686f0 = -1;
        this.f1688g0 = 0;
        this.f1690h0 = 0;
        this.f1696k0 = 0;
        this.f1698l0 = 0;
        this.f1700m0 = 0;
        this.f1702n0 = 0;
        this.f1704o0 = 0;
        float f10 = S0;
        this.f1706p0 = f10;
        this.f1708q0 = f10;
        DimensionBehaviour[] dimensionBehaviourArr = this.f1676a0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f1710r0 = null;
        this.f1712s0 = 0;
        this.f1714t0 = 0;
        this.f1718v0 = null;
        this.E0 = false;
        this.F0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = false;
        this.K0 = false;
        float[] fArr = this.L0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1711s = -1;
        this.f1713t = -1;
        int[] iArr = this.I;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1717v = 0;
        this.f1719w = 0;
        this.A = 1.0f;
        this.D = 1.0f;
        this.f1725z = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.f1723y = 0;
        this.B = 0;
        this.f1689h = false;
        this.G = -1;
        this.H = 1.0f;
        this.G0 = false;
        boolean[] zArr = this.f1687g;
        zArr[0] = true;
        zArr[1] = true;
        this.M = false;
        boolean[] zArr2 = this.Z;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1691i = true;
        int[] iArr2 = this.f1721x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f1697l = -1;
        this.f1699m = -1;
    }

    public int s() {
        return W() + this.f1682d0;
    }

    public void s0() {
        ConstraintWidget constraintWidgetL = L();
        if (constraintWidgetL != null && (constraintWidgetL instanceof d) && ((d) L()).G1()) {
            return;
        }
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ConstraintAnchor) this.Y.get(i10)).q();
        }
    }

    public Object t() {
        return this.f1710r0;
    }

    public void t0() {
        this.f1703o = false;
        this.f1705p = false;
        this.f1707q = false;
        this.f1709r = false;
        int size = this.Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ConstraintAnchor) this.Y.get(i10)).r();
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f1718v0 != null) {
            str = "type: " + this.f1718v0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1716u0 != null) {
            str2 = "id: " + this.f1716u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1688g0);
        sb.append(", ");
        sb.append(this.f1690h0);
        sb.append(") - (");
        sb.append(this.f1680c0);
        sb.append(" x ");
        sb.append(this.f1682d0);
        sb.append(")");
        return sb.toString();
    }

    public String u() {
        return this.f1716u0;
    }

    public void u0(u.a aVar) {
        this.P.s(aVar);
        this.Q.s(aVar);
        this.R.s(aVar);
        this.S.s(aVar);
        this.T.s(aVar);
        this.W.s(aVar);
        this.U.s(aVar);
        this.V.s(aVar);
    }

    public DimensionBehaviour v(int i10) {
        if (i10 == 0) {
            return B();
        }
        if (i10 == 1) {
            return R();
        }
        return null;
    }

    public void v0(int i10) {
        this.f1700m0 = i10;
        this.K = i10 > 0;
    }

    public float w() {
        return this.f1684e0;
    }

    public void w0(Object obj) {
        this.f1710r0 = obj;
    }

    public int x() {
        return this.f1686f0;
    }

    public void x0(String str) {
        this.f1716u0 = str;
    }

    public int y() {
        if (this.f1714t0 == 8) {
            return 0;
        }
        return this.f1682d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y0(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.f1684e0 = r9
            r8.f1686f0 = r5
        L8f:
            return
        L90:
            r8.f1684e0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.y0(java.lang.String):void");
    }

    public float z() {
        return this.f1706p0;
    }

    public void z0(int i10) {
        if (this.K) {
            int i11 = i10 - this.f1700m0;
            int i12 = this.f1682d0 + i11;
            this.f1690h0 = i11;
            this.Q.t(i11);
            this.S.t(i12);
            this.T.t(i10);
            this.f1705p = true;
        }
    }
}
