package n7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.lifecycle.f1;
import f7.b0;
import f7.j;
import f7.x;
import i7.s;
import java.util.ArrayList;
import java.util.List;
import t7.m;
import x.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends a {
    public i7.e D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final r7.i I;
    public final m J;
    public float K;
    public boolean L;
    public final i7.h M;

    public b(x xVar, d dVar, List list, j jVar) {
        a aVar;
        a bVar;
        String str;
        super(xVar, dVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new r7.i();
        this.J = new m((byte) 0, 19);
        this.L = true;
        l7.b bVar2 = dVar.f29819s;
        if (bVar2 != null) {
            i7.i iVarG = bVar2.g();
            this.D = iVarG;
            e(iVarG);
            this.D.a(this);
        } else {
            this.D = null;
        }
        o oVar = new o(jVar.j.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i4 = 0; i4 < oVar.k(); i4++) {
                    a aVar3 = (a) oVar.e(oVar.h(i4));
                    if (aVar3 != null && (aVar = (a) oVar.e(aVar3.f29792p.f29808f)) != null) {
                        aVar3.f29796t = aVar;
                    }
                }
                f1 f1Var = this.f29792p.f29824x;
                if (f1Var != null) {
                    this.M = new i7.h(this, this, f1Var);
                    return;
                }
                return;
            }
            d dVar2 = (d) list.get(size);
            int iC = i3.e.c(dVar2.f29807e);
            if (iC == 0) {
                bVar = new b(xVar, dVar2, (List) jVar.f23752c.get(dVar2.g), jVar);
            } else if (iC == 1) {
                bVar = new g(xVar, dVar2);
            } else if (iC == 2) {
                bVar = new c(xVar, dVar2);
            } else if (iC == 3) {
                bVar = new e(xVar, dVar2);
            } else if (iC == 4) {
                bVar = new f(xVar, dVar2, this, jVar);
            } else if (iC != 5) {
                switch (dVar2.f29807e) {
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
                r7.d.b("Unknown layer type ".concat(str));
                bVar = null;
            } else {
                bVar = new i(xVar, dVar2);
            }
            if (bVar != null) {
                oVar.i(bVar, bVar.f29792p.f29806d);
                if (aVar2 != null) {
                    aVar2.f29795s = bVar;
                    aVar2 = null;
                } else {
                    this.E.add(0, bVar);
                    int iC2 = i3.e.c(dVar2.f29821u);
                    if (iC2 == 1 || iC2 == 2) {
                        aVar2 = bVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // n7.a, h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) arrayList.get(size)).d(rectF2, this.f29790n, true);
            rectF.union(rectF2);
        }
    }

    @Override // n7.a, k7.f
    public final void f(Object obj, km.o oVar) {
        super.f(obj, oVar);
        if (obj == b0.C) {
            s sVar = new s(null, oVar);
            this.D = sVar;
            sVar.a(this);
            e(this.D);
            return;
        }
        i7.h hVar = this.M;
        if (obj == 5 && hVar != null) {
            hVar.f25883c.j(oVar);
            return;
        }
        if (obj == b0.E && hVar != null) {
            hVar.c(oVar);
            return;
        }
        if (obj == b0.F && hVar != null) {
            hVar.f25885e.j(oVar);
            return;
        }
        if (obj == b0.G && hVar != null) {
            hVar.f25886f.j(oVar);
        } else {
            if (obj != b0.H || hVar == null) {
                return;
            }
            hVar.g.j(oVar);
        }
    }

    @Override // n7.a
    public final void k(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        Canvas canvasE;
        i7.h hVar = this.M;
        int i10 = 0;
        boolean z3 = (bVar == null && hVar == null) ? false : true;
        x xVar = this.f29791o;
        boolean z10 = xVar.f23817s;
        ArrayList arrayList = this.E;
        boolean z11 = (z10 && arrayList.size() > 1 && i4 != 255) || (z3 && xVar.f23818t);
        int i11 = z11 ? 255 : i4;
        if (hVar != null) {
            bVar = hVar.b(matrix, i11);
        }
        boolean z12 = this.L;
        d dVar = this.f29792p;
        RectF rectF = this.G;
        if (z12 || !"__container".equals(dVar.f29805c)) {
            rectF.set(0.0f, 0.0f, dVar.f29815o, dVar.f29816p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                RectF rectF2 = this.H;
                ((a) obj).d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        r7.i iVar = this.I;
        if (z11) {
            m mVar = this.J;
            mVar.f34474c = null;
            mVar.f34473b = i4;
            if (bVar != null) {
                if (Color.alpha(bVar.f32849d) > 0) {
                    mVar.f34474c = bVar;
                } else {
                    mVar.f34474c = null;
                }
                bVar = null;
            }
            canvasE = iVar.e(canvas, rectF, mVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((a) arrayList.get(size2)).h(canvasE, matrix, i11, bVar);
            }
        }
        if (z11) {
            iVar.c();
        }
        canvas.restore();
    }

    @Override // n7.a
    public final void p(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((a) arrayList2.get(i10)).g(eVar, i4, arrayList, eVar2);
            i10++;
        }
    }

    @Override // n7.a
    public final void q(boolean z3) {
        super.q(z3);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((a) obj).q(z3);
        }
    }

    @Override // n7.a
    public final void r(float f10) {
        this.K = f10;
        super.r(f10);
        i7.e eVar = this.D;
        d dVar = this.f29792p;
        if (eVar != null) {
            j jVar = this.f29791o.f23801a;
            f10 = ((((Float) eVar.e()).floatValue() * dVar.f29804b.f23761n) - dVar.f29804b.f23759l) / ((jVar.f23760m - jVar.f23759l) + 0.01f);
        }
        if (this.D == null) {
            float f11 = dVar.f29814n;
            j jVar2 = dVar.f29804b;
            f10 -= f11 / (jVar2.f23760m - jVar2.f23759l);
        }
        if (dVar.f29813m != 0.0f && !"__container".equals(dVar.f29805c)) {
            f10 /= dVar.f29813m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).r(f10);
        }
    }
}
