package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f1555r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f1556s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f1557t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f1558u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f1559v = false;

    /* renamed from: w, reason: collision with root package name */
    public static int f1560w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f1561x;

    /* renamed from: y, reason: collision with root package name */
    public static long f1562y;

    /* renamed from: d, reason: collision with root package name */
    public a f1566d;

    /* renamed from: g, reason: collision with root package name */
    public androidx.constraintlayout.core.b[] f1569g;

    /* renamed from: n, reason: collision with root package name */
    public final u.a f1576n;

    /* renamed from: q, reason: collision with root package name */
    public a f1579q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1563a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1564b = 0;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1565c = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1567e = 32;

    /* renamed from: f, reason: collision with root package name */
    public int f1568f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1570h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1571i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f1572j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    public int f1573k = 1;

    /* renamed from: l, reason: collision with root package name */
    public int f1574l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1575m = 32;

    /* renamed from: o, reason: collision with root package name */
    public SolverVariable[] f1577o = new SolverVariable[f1560w];

    /* renamed from: p, reason: collision with root package name */
    public int f1578p = 0;

    public interface a {
        void a(a aVar);

        SolverVariable b(c cVar, boolean[] zArr);

        void c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    public class b extends androidx.constraintlayout.core.b {
        public b(u.a aVar) {
            this.f1553e = new e(this, aVar);
        }
    }

    public c() {
        this.f1569g = null;
        this.f1569g = new androidx.constraintlayout.core.b[32];
        C();
        u.a aVar = new u.a();
        this.f1576n = aVar;
        this.f1566d = new d(aVar);
        if (f1559v) {
            this.f1579q = new b(aVar);
        } else {
            this.f1579q = new androidx.constraintlayout.core.b(aVar);
        }
    }

    public static androidx.constraintlayout.core.b s(c cVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f10) {
        return cVar.r().j(solverVariable, solverVariable2, f10);
    }

    public static u.b w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f1573k; i10++) {
            this.f1572j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f1573k * 2) {
                if (aVar.getKey() != null) {
                    this.f1572j[aVar.getKey().f1516c] = true;
                }
                SolverVariable solverVariableB = aVar.b(this, this.f1572j);
                if (solverVariableB != null) {
                    boolean[] zArr = this.f1572j;
                    int i12 = solverVariableB.f1516c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (solverVariableB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f1574l; i14++) {
                        androidx.constraintlayout.core.b bVar = this.f1569g[i14];
                        if (bVar.f1549a.f1523j != SolverVariable.Type.UNRESTRICTED && !bVar.f1554f && bVar.t(solverVariableB)) {
                            float fJ = bVar.f1553e.j(solverVariableB);
                            if (fJ < 0.0f) {
                                float f11 = (-bVar.f1550b) / fJ;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        androidx.constraintlayout.core.b bVar2 = this.f1569g[i13];
                        bVar2.f1549a.f1517d = -1;
                        bVar2.x(solverVariableB);
                        SolverVariable solverVariable = bVar2.f1549a;
                        solverVariable.f1517d = i13;
                        solverVariable.i(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    public final void C() {
        int i10 = 0;
        if (f1559v) {
            while (i10 < this.f1574l) {
                androidx.constraintlayout.core.b bVar = this.f1569g[i10];
                if (bVar != null) {
                    this.f1576n.f24479a.a(bVar);
                }
                this.f1569g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f1574l) {
            androidx.constraintlayout.core.b bVar2 = this.f1569g[i10];
            if (bVar2 != null) {
                this.f1576n.f24480b.a(bVar2);
            }
            this.f1569g[i10] = null;
            i10++;
        }
    }

    public void D() {
        u.a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f1576n;
            SolverVariable[] solverVariableArr = aVar.f24482d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.f();
            }
            i10++;
        }
        aVar.f24481c.c(this.f1577o, this.f1578p);
        this.f1578p = 0;
        Arrays.fill(this.f1576n.f24482d, (Object) null);
        HashMap map = this.f1565c;
        if (map != null) {
            map.clear();
        }
        this.f1564b = 0;
        this.f1566d.clear();
        this.f1573k = 1;
        for (int i11 = 0; i11 < this.f1574l; i11++) {
            androidx.constraintlayout.core.b bVar = this.f1569g[i11];
            if (bVar != null) {
                bVar.f1551c = false;
            }
        }
        C();
        this.f1574l = 0;
        if (f1559v) {
            this.f1579q = new b(this.f1576n);
        } else {
            this.f1579q = new androidx.constraintlayout.core.b(this.f1576n);
        }
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f1576n.f24481c.b();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.h(type, str);
        } else {
            solverVariable.f();
            solverVariable.h(type, str);
        }
        int i10 = this.f1578p;
        int i11 = f1560w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f1560w = i12;
            this.f1577o = (SolverVariable[]) Arrays.copyOf(this.f1577o, i12);
        }
        SolverVariable[] solverVariableArr = this.f1577o;
        int i13 = this.f1578p;
        this.f1578p = i13 + 1;
        solverVariableArr[i13] = solverVariable;
        return solverVariable;
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f10, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableQ = q(constraintWidget.p(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableQ2 = q(constraintWidget.p(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableQ3 = q(constraintWidget.p(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableQ4 = q(constraintWidget.p(type4));
        SolverVariable solverVariableQ5 = q(constraintWidget2.p(type));
        SolverVariable solverVariableQ6 = q(constraintWidget2.p(type2));
        SolverVariable solverVariableQ7 = q(constraintWidget2.p(type3));
        SolverVariable solverVariableQ8 = q(constraintWidget2.p(type4));
        androidx.constraintlayout.core.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(solverVariableQ2, solverVariableQ4, solverVariableQ6, solverVariableQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        androidx.constraintlayout.core.b bVarR2 = r();
        bVarR2.q(solverVariableQ, solverVariableQ3, solverVariableQ5, solverVariableQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.h(solverVariable, solverVariable2, i10, f10, solverVariable3, solverVariable4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(androidx.constraintlayout.core.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f1574l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f1575m
            if (r0 >= r2) goto L13
            int r0 = r5.f1573k
            int r0 = r0 + r1
            int r2 = r5.f1568f
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f1554f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            androidx.constraintlayout.core.SolverVariable r0 = r5.p()
            r6.f1549a = r0
            int r3 = r5.f1574l
            r5.l(r6)
            int r4 = r5.f1574l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            androidx.constraintlayout.core.c$a r2 = r5.f1579q
            r2.a(r6)
            androidx.constraintlayout.core.c$a r2 = r5.f1579q
            r5.B(r2, r1)
            int r2 = r0.f1517d
            r3 = -1
            if (r2 != r3) goto L7d
            androidx.constraintlayout.core.SolverVariable r2 = r6.f1549a
            if (r2 != r0) goto L5a
            androidx.constraintlayout.core.SolverVariable r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f1554f
            if (r0 != 0) goto L63
            androidx.constraintlayout.core.SolverVariable r0 = r6.f1549a
            r0.i(r5, r6)
        L63:
            boolean r0 = androidx.constraintlayout.core.c.f1559v
            if (r0 == 0) goto L6f
            u.a r0 = r5.f1576n
            u.c r0 = r0.f24479a
            r0.a(r6)
            goto L76
        L6f:
            u.a r0 = r5.f1576n
            u.c r0 = r0.f24480b
            r0.a(r6)
        L76:
            int r0 = r5.f1574l
            int r0 = r0 - r1
            r5.f1574l = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.c.d(androidx.constraintlayout.core.b):void");
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (f1556s && i11 == 8 && solverVariable2.f1520g && solverVariable.f1517d == -1) {
            solverVariable.g(this, solverVariable2.f1519f + i10);
            return null;
        }
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.n(solverVariable, solverVariable2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(SolverVariable solverVariable, int i10) {
        if (f1556s && solverVariable.f1517d == -1) {
            float f10 = i10;
            solverVariable.g(this, f10);
            for (int i11 = 0; i11 < this.f1564b + 1; i11++) {
                SolverVariable solverVariable2 = this.f1576n.f24482d[i11];
                if (solverVariable2 != null && solverVariable2.f1527n && solverVariable2.f1528o == solverVariable.f1516c) {
                    solverVariable2.g(this, solverVariable2.f1529p + f10);
                }
            }
            return;
        }
        int i12 = solverVariable.f1517d;
        if (i12 == -1) {
            androidx.constraintlayout.core.b bVarR = r();
            bVarR.i(solverVariable, i10);
            d(bVarR);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.f1569g[i12];
        if (bVar.f1554f) {
            bVar.f1550b = i10;
            return;
        }
        if (bVar.f1553e.f() == 0) {
            bVar.f1554f = true;
            bVar.f1550b = i10;
        } else {
            androidx.constraintlayout.core.b bVarR2 = r();
            bVarR2.m(solverVariable, i10);
            d(bVarR2);
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.f1518e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i10);
        d(bVarR);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.f1518e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f1553e.j(solverVariableT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.f1518e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i10);
        d(bVarR);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.f1518e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f1553e.j(solverVariableT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f10, int i10) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    public final void l(androidx.constraintlayout.core.b bVar) {
        int i10;
        if (f1557t && bVar.f1554f) {
            bVar.f1549a.g(this, bVar.f1550b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.f1569g;
            int i11 = this.f1574l;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f1549a;
            solverVariable.f1517d = i11;
            this.f1574l = i11 + 1;
            solverVariable.i(this, bVar);
        }
        if (f1557t && this.f1563a) {
            int i12 = 0;
            while (i12 < this.f1574l) {
                if (this.f1569g[i12] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.f1569g[i12];
                if (bVar2 != null && bVar2.f1554f) {
                    bVar2.f1549a.g(this, bVar2.f1550b);
                    if (f1559v) {
                        this.f1576n.f24479a.a(bVar2);
                    } else {
                        this.f1576n.f24480b.a(bVar2);
                    }
                    this.f1569g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f1574l;
                        if (i13 >= i10) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.f1569g;
                        int i15 = i13 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f1549a;
                        if (solverVariable2.f1517d == i13) {
                            solverVariable2.f1517d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f1569g[i14] = null;
                    }
                    this.f1574l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f1563a = false;
        }
    }

    public void m(androidx.constraintlayout.core.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public final void n() {
        for (int i10 = 0; i10 < this.f1574l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f1569g[i10];
            bVar.f1549a.f1519f = bVar.f1550b;
        }
    }

    public SolverVariable o(int i10, String str) {
        if (this.f1573k + 1 >= this.f1568f) {
            y();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i11 = this.f1564b + 1;
        this.f1564b = i11;
        this.f1573k++;
        solverVariableA.f1516c = i11;
        solverVariableA.f1518e = i10;
        this.f1576n.f24482d[i11] = solverVariableA;
        this.f1566d.c(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable p() {
        if (this.f1573k + 1 >= this.f1568f) {
            y();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f1564b + 1;
        this.f1564b = i10;
        this.f1573k++;
        solverVariableA.f1516c = i10;
        this.f1576n.f24482d[i10] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariableI = null;
        if (obj == null) {
            return null;
        }
        if (this.f1573k + 1 >= this.f1568f) {
            y();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableI = constraintAnchor.i();
            if (solverVariableI == null) {
                constraintAnchor.s(this.f1576n);
                solverVariableI = constraintAnchor.i();
            }
            int i10 = solverVariableI.f1516c;
            if (i10 != -1 && i10 <= this.f1564b && this.f1576n.f24482d[i10] != null) {
                return solverVariableI;
            }
            if (i10 != -1) {
                solverVariableI.f();
            }
            int i11 = this.f1564b + 1;
            this.f1564b = i11;
            this.f1573k++;
            solverVariableI.f1516c = i11;
            solverVariableI.f1523j = SolverVariable.Type.UNRESTRICTED;
            this.f1576n.f24482d[i11] = solverVariableI;
        }
        return solverVariableI;
    }

    public androidx.constraintlayout.core.b r() {
        androidx.constraintlayout.core.b bVar;
        if (f1559v) {
            bVar = (androidx.constraintlayout.core.b) this.f1576n.f24479a.b();
            if (bVar == null) {
                bVar = new b(this.f1576n);
                f1562y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (androidx.constraintlayout.core.b) this.f1576n.f24480b.b();
            if (bVar == null) {
                bVar = new androidx.constraintlayout.core.b(this.f1576n);
                f1561x++;
            } else {
                bVar.y();
            }
        }
        SolverVariable.c();
        return bVar;
    }

    public SolverVariable t() {
        if (this.f1573k + 1 >= this.f1568f) {
            y();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f1564b + 1;
        this.f1564b = i10;
        this.f1573k++;
        solverVariableA.f1516c = i10;
        this.f1576n.f24482d[i10] = solverVariableA;
        return solverVariableA;
    }

    public final int u(a aVar) {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f1574l; i10++) {
            androidx.constraintlayout.core.b bVar = this.f1569g[i10];
            if (bVar.f1549a.f1523j != SolverVariable.Type.UNRESTRICTED) {
                float f12 = 0.0f;
                if (bVar.f1550b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f1574l) {
                                break;
                            }
                            androidx.constraintlayout.core.b bVar2 = this.f1569g[i12];
                            if (bVar2.f1549a.f1523j == SolverVariable.Type.UNRESTRICTED || bVar2.f1554f || bVar2.f1550b >= f12) {
                                f10 = f12;
                            } else if (f1558u) {
                                int iF = bVar2.f1553e.f();
                                int i16 = 0;
                                while (i16 < iF) {
                                    SolverVariable solverVariableB = bVar2.f1553e.b(i16);
                                    float fJ = bVar2.f1553e.j(solverVariableB);
                                    if (fJ <= f12) {
                                        f11 = f12;
                                    } else {
                                        f11 = f12;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = solverVariableB.f1521h[i17] / fJ;
                                            if ((f14 < f13 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = solverVariableB.f1516c;
                                                i13 = i12;
                                                f13 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f12 = f11;
                                }
                                f10 = f12;
                            } else {
                                f10 = f12;
                                for (int i18 = 1; i18 < this.f1573k; i18++) {
                                    SolverVariable solverVariable = this.f1576n.f24482d[i18];
                                    float fJ2 = bVar2.f1553e.j(solverVariable);
                                    if (fJ2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = solverVariable.f1521h[i19] / fJ2;
                                            if ((f15 < f13 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f13 = f15;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f12 = f10;
                        }
                        float f16 = f12;
                        if (i13 != -1) {
                            androidx.constraintlayout.core.b bVar3 = this.f1569g[i13];
                            bVar3.f1549a.f1517d = -1;
                            bVar3.x(this.f1576n.f24482d[i14]);
                            SolverVariable solverVariable2 = bVar3.f1549a;
                            solverVariable2.f1517d = i13;
                            solverVariable2.i(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f1573k / 2) {
                            z10 = true;
                        }
                        f12 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public u.a v() {
        return this.f1576n;
    }

    public int x(Object obj) {
        SolverVariable solverVariableI = ((ConstraintAnchor) obj).i();
        if (solverVariableI != null) {
            return (int) (solverVariableI.f1519f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i10 = this.f1567e * 2;
        this.f1567e = i10;
        this.f1569g = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.f1569g, i10);
        u.a aVar = this.f1576n;
        aVar.f24482d = (SolverVariable[]) Arrays.copyOf(aVar.f24482d, this.f1567e);
        int i11 = this.f1567e;
        this.f1572j = new boolean[i11];
        this.f1568f = i11;
        this.f1575m = i11;
    }

    public void z() {
        if (this.f1566d.isEmpty()) {
            n();
            return;
        }
        if (!this.f1570h && !this.f1571i) {
            A(this.f1566d);
            return;
        }
        for (int i10 = 0; i10 < this.f1574l; i10++) {
            if (!this.f1569g[i10].f1554f) {
                A(this.f1566d);
                return;
            }
        }
        n();
    }
}
