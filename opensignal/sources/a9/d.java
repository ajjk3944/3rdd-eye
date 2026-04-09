package a9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r8.v;
import r8.z;
import u8.r;

/* loaded from: classes.dex */
public final class d extends b {
    public u8.d D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final e9.i I;
    public final ag.b J;
    public float K;
    public boolean L;
    public final u8.g M;

    public d(v vVar, h hVar, List list, r8.h hVar2) {
        b bVar;
        b jVar;
        super(vVar, hVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new e9.i();
        this.J = new ag.b(1, (byte) 0);
        this.L = true;
        y8.b bVar2 = hVar.f264s;
        if (bVar2 != null) {
            u8.h hVarE0 = bVar2.E0();
            this.D = hVarE0;
            e(hVarE0);
            this.D.a(this);
        } else {
            this.D = null;
        }
        u.o oVar = new u.o(hVar2.j.size());
        int size = list.size() - 1;
        b bVar3 = null;
        while (true) {
            if (size < 0) {
                for (int i10 = 0; i10 < oVar.g(); i10++) {
                    b bVar4 = (b) oVar.b(oVar.d(i10));
                    if (bVar4 != null && (bVar = (b) oVar.b(bVar4.f236p.f253f)) != null) {
                        bVar4.f240t = bVar;
                    }
                }
                cj.a aVar = this.f236p.f269x;
                if (aVar != null) {
                    this.M = new u8.g(this, this, aVar);
                    return;
                }
                return;
            }
            h hVar3 = (h) list.get(size);
            switch (a.f221a[hVar3.f252e.ordinal()]) {
                case 1:
                    jVar = new j(vVar, hVar3, this, hVar2);
                    break;
                case 2:
                    jVar = new d(vVar, hVar3, (List) hVar2.f21325c.get(hVar3.f254g), hVar2);
                    break;
                case 3:
                    jVar = new k(vVar, hVar3);
                    break;
                case 4:
                    jVar = new e(vVar, hVar3);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    jVar = new i(vVar, hVar3);
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    jVar = new o(vVar, hVar3);
                    break;
                default:
                    e9.c.b("Unknown layer type " + hVar3.f252e);
                    jVar = null;
                    break;
            }
            if (jVar != null) {
                oVar.e(jVar, jVar.f236p.f251d);
                if (bVar3 != null) {
                    bVar3.f239s = jVar;
                    bVar3 = null;
                } else {
                    this.E.add(0, jVar);
                    int i11 = c.f247a[hVar3.f266u.ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar3 = jVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // a9.b, t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).d(rectF2, this.f234n, true);
            rectF.union(rectF2);
        }
    }

    @Override // a9.b, x8.g
    public final void f(bm.e eVar, Object obj) {
        super.f(eVar, obj);
        if (obj == z.C) {
            r rVar = new r(eVar, null);
            this.D = rVar;
            rVar.a(this);
            e(this.D);
            return;
        }
        u8.g gVar = this.M;
        if (obj == 5 && gVar != null) {
            gVar.f23459c.k(eVar);
            return;
        }
        if (obj == z.E && gVar != null) {
            gVar.c(eVar);
            return;
        }
        if (obj == z.F && gVar != null) {
            gVar.f23461e.k(eVar);
            return;
        }
        if (obj == z.G && gVar != null) {
            gVar.f23462f.k(eVar);
        } else {
            if (obj != z.H || gVar == null) {
                return;
            }
            gVar.f23463g.k(eVar);
        }
    }

    @Override // a9.b
    public final void k(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        Canvas canvasE;
        r8.a aVar2 = r8.d.f21312a;
        boolean z10 = false;
        u8.g gVar = this.M;
        boolean z11 = (aVar == null && gVar == null) ? false : true;
        v vVar = this.f235o;
        boolean z12 = vVar.P;
        ArrayList arrayList = this.E;
        if ((z12 && arrayList.size() > 1 && i10 != 255) || (z11 && vVar.Q)) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        if (gVar != null) {
            aVar = gVar.b(matrix, i11);
        }
        boolean z13 = this.L;
        h hVar = this.f236p;
        RectF rectF = this.G;
        if (z13 || !"__container".equals(hVar.f250c)) {
            rectF.set(0.0f, 0.0f, hVar.f260o, hVar.f261p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                RectF rectF2 = this.H;
                bVar.d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        e9.i iVar = this.I;
        if (z10) {
            ag.b bVar2 = this.J;
            bVar2.f346g = null;
            bVar2.f345d = i10;
            if (aVar != null) {
                if (Color.alpha(aVar.f7979d) > 0) {
                    bVar2.f346g = aVar;
                } else {
                    bVar2.f346g = null;
                }
                aVar = null;
            }
            canvasE = iVar.e(canvas, rectF, bVar2);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).h(canvasE, matrix, i11, aVar);
            }
        }
        if (z10) {
            iVar.c();
        }
        canvas.restore();
        r8.a aVar3 = r8.d.f21312a;
    }

    @Override // a9.b
    public final void p(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i11 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i11)).c(fVar, i10, arrayList, fVar2);
            i11++;
        }
    }

    @Override // a9.b
    public final void q(boolean z10) {
        super.q(z10);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((b) it.next()).q(z10);
        }
    }

    @Override // a9.b
    public final void r(float f10) {
        r8.a aVar = r8.d.f21312a;
        this.K = f10;
        super.r(f10);
        u8.d dVar = this.D;
        h hVar = this.f236p;
        if (dVar != null) {
            r8.h hVar2 = this.f235o.f21375a;
            f10 = ((((Float) dVar.f()).floatValue() * hVar.f249b.f21334n) - hVar.f249b.f21332l) / ((hVar2.f21333m - hVar2.f21332l) + 0.01f);
        }
        if (this.D == null) {
            float f11 = hVar.f259n;
            r8.h hVar3 = hVar.f249b;
            f10 -= f11 / (hVar3.f21333m - hVar3.f21332l);
        }
        if (hVar.f258m != 0.0f && !"__container".equals(hVar.f250c)) {
            f10 /= hVar.f258m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).r(f10);
        }
        r8.a aVar2 = r8.d.f21312a;
    }
}
