package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fh extends da {
    public ba D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final pi0 I;
    public final t3 J;
    public float K;
    public boolean L;
    public final pq M;

    public fh(i90 i90Var, f50 f50Var, List list, u80 u80Var) {
        da daVar;
        da fhVar;
        String str;
        super(i90Var, f50Var);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new pi0();
        this.J = new t3(4, (byte) 0);
        this.L = true;
        c4 c4Var = f50Var.s;
        if (c4Var != null) {
            pu puVarQ0 = c4Var.Q0();
            this.D = puVarQ0;
            e(puVarQ0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        l80 l80Var = new l80(u80Var.j.size());
        int size = list.size() - 1;
        da daVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < l80Var.f(); i++) {
                    da daVar3 = (da) l80Var.b(l80Var.d(i));
                    if (daVar3 != null && (daVar = (da) l80Var.b(daVar3.p.f)) != null) {
                        daVar3.t = daVar;
                    }
                }
                g4 g4Var = this.p.x;
                if (g4Var != null) {
                    this.M = new pq(this, this, g4Var);
                    return;
                }
                return;
            }
            f50 f50Var2 = (f50) list.get(size);
            int iS = ex0.s(f50Var2.e);
            if (iS == 0) {
                fhVar = new fh(i90Var, f50Var2, (List) u80Var.c.get(f50Var2.g), u80Var);
            } else if (iS == 1) {
                fhVar = new dx0(i90Var, f50Var2);
            } else if (iS == 2) {
                fhVar = new h20(i90Var, f50Var2);
            } else if (iS == 3) {
                fhVar = new ii0(i90Var, f50Var2);
            } else if (iS == 4) {
                fhVar = new dv0(i90Var, f50Var2, this, u80Var);
            } else if (iS != 5) {
                switch (f50Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                j80.b("Unknown layer type ".concat(str));
                fhVar = null;
            } else {
                fhVar = new e11(i90Var, f50Var2);
            }
            if (fhVar != null) {
                l80Var.e(fhVar.p.d, fhVar);
                if (daVar2 != null) {
                    daVar2.s = fhVar;
                    daVar2 = null;
                } else {
                    this.E.add(0, fhVar);
                    int iS2 = ex0.s(f50Var2.u);
                    if (iS2 == 1 || iS2 == 2) {
                        daVar2 = fhVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.da, defpackage.u40
    public final void a(Object obj, vq2 vq2Var) {
        super.a(obj, vq2Var);
        if (obj == n90.z) {
            m41 m41Var = new m41(null, vq2Var);
            this.D = m41Var;
            m41Var.a(this);
            e(this.D);
            return;
        }
        pq pqVar = this.M;
        if (obj == 5 && pqVar != null) {
            pqVar.c.j(vq2Var);
            return;
        }
        if (obj == n90.B && pqVar != null) {
            pqVar.b(vq2Var);
            return;
        }
        if (obj == n90.C && pqVar != null) {
            pqVar.e.j(vq2Var);
            return;
        }
        if (obj == n90.D && pqVar != null) {
            pqVar.f.j(vq2Var);
        } else {
            if (obj != n90.E || pqVar == null) {
                return;
            }
            pqVar.g.j(vq2Var);
        }
    }

    @Override // defpackage.da, defpackage.bq
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((da) arrayList.get(size)).b(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.da
    public final void k(Canvas canvas, Matrix matrix, int i, mq mqVar) {
        Canvas canvasE;
        pq pqVar = this.M;
        int i2 = 0;
        boolean z = (mqVar == null && pqVar == null) ? false : true;
        i90 i90Var = this.o;
        boolean z2 = i90Var.x;
        ArrayList arrayList = this.E;
        boolean z3 = (z2 && arrayList.size() > 1 && i != 255) || (z && i90Var.y);
        int i3 = z3 ? 255 : i;
        if (pqVar != null) {
            mqVar = pqVar.a(matrix, i3);
        }
        boolean z4 = this.L;
        f50 f50Var = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(f50Var.c)) {
            rectF.set(0.0f, 0.0f, f50Var.o, f50Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                RectF rectF2 = this.H;
                ((da) obj).b(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        pi0 pi0Var = this.I;
        if (z3) {
            t3 t3Var = this.J;
            t3Var.h = null;
            t3Var.g = i;
            if (mqVar != null) {
                if (Color.alpha(mqVar.d) > 0) {
                    t3Var.h = mqVar;
                } else {
                    t3Var.h = null;
                }
                mqVar = null;
            }
            canvasE = pi0Var.e(canvas, rectF, t3Var);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((da) arrayList.get(size2)).g(canvasE, matrix, i3, mqVar);
            }
        }
        if (z3) {
            pi0Var.c();
        }
        canvas.restore();
    }

    @Override // defpackage.da
    public final void p(t40 t40Var, int i, ArrayList arrayList, t40 t40Var2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((da) arrayList2.get(i2)).h(t40Var, i, arrayList, t40Var2);
            i2++;
        }
    }

    @Override // defpackage.da
    public final void q(boolean z) {
        super.q(z);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((da) obj).q(z);
        }
    }

    @Override // defpackage.da
    public final void r(float f) {
        this.K = f;
        super.r(f);
        ba baVar = this.D;
        f50 f50Var = this.p;
        if (baVar != null) {
            u80 u80Var = this.o.f;
            f = ((((Float) baVar.e()).floatValue() * f50Var.b.n) - f50Var.b.l) / ((u80Var.m - u80Var.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = f50Var.n;
            u80 u80Var2 = f50Var.b;
            f -= f2 / (u80Var2.m - u80Var2.l);
        }
        if (f50Var.m != 0.0f && !"__container".equals(f50Var.c)) {
            f /= f50Var.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((da) arrayList.get(size)).r(f);
        }
    }
}
