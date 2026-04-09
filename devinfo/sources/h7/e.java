package h7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements f, n, i7.a, k7.f {

    /* renamed from: a, reason: collision with root package name */
    public final t7.m f24903a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f24904b;

    /* renamed from: c, reason: collision with root package name */
    public final r7.i f24905c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f24906d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f24907e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f24908f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24909h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f24910i;
    public final x j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f24911k;

    /* renamed from: l, reason: collision with root package name */
    public final i7.r f24912l;

    public e(x xVar, n7.a aVar, m7.m mVar, f7.j jVar) {
        l7.e eVar;
        String str = mVar.f28933a;
        boolean z3 = mVar.f28935c;
        List list = mVar.f28934b;
        ArrayList arrayList = new ArrayList(list.size());
        int i4 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVarA = ((m7.b) list.get(i10)).a(xVar, jVar, aVar);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        while (true) {
            if (i4 >= list.size()) {
                eVar = null;
                break;
            }
            m7.b bVar = (m7.b) list.get(i4);
            if (bVar instanceof l7.e) {
                eVar = (l7.e) bVar;
                break;
            }
            i4++;
        }
        this(xVar, aVar, str, z3, arrayList, eVar);
    }

    @Override // i7.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        Matrix matrix = this.f24906d;
        matrix.reset();
        i7.r rVar = this.f24912l;
        if (rVar != null) {
            matrix.set(rVar.e());
        }
        Path path = this.f24907e;
        path.reset();
        if (!this.f24909h) {
            ArrayList arrayList = this.f24910i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).b(), matrix);
                }
            }
        }
        return path;
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f24910i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    @Override // h7.f
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        Matrix matrix2 = this.f24906d;
        matrix2.set(matrix);
        i7.r rVar = this.f24912l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
        }
        RectF rectF2 = this.f24908f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f24910i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).d(rectF2, matrix2, z3);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.f24911k == null) {
            this.f24911k = new ArrayList();
            int i4 = 0;
            while (true) {
                ArrayList arrayList = this.f24910i;
                if (i4 >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i4);
                if (dVar instanceof n) {
                    this.f24911k.add((n) dVar);
                }
                i4++;
            }
        }
        return this.f24911k;
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        i7.r rVar = this.f24912l;
        if (rVar != null) {
            rVar.c(obj, oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        String str = this.g;
        if (!eVar.c(i4, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            k7.e eVar3 = new k7.e(eVar2);
            eVar3.f28062a.add(str);
            if (eVar.a(i4, str)) {
                k7.e eVar4 = new k7.e(eVar3);
                eVar4.f28063b = this;
                arrayList.add(eVar4);
            }
            eVar2 = eVar3;
        }
        if (!eVar.d(i4, str)) {
            return;
        }
        int iB = eVar.b(i4, str) + i4;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f24910i;
            if (i10 >= arrayList2.size()) {
                return;
            }
            d dVar = (d) arrayList2.get(i10);
            if (dVar instanceof k7.f) {
                ((k7.f) dVar).g(eVar, iB, arrayList, eVar2);
            }
            i10++;
        }
    }

    @Override // h7.d
    public final String getName() {
        throw null;
    }

    @Override // h7.f
    public final void h(Canvas canvas, Matrix matrix, int i4, r7.b bVar) {
        if (this.f24909h) {
            return;
        }
        Matrix matrix2 = this.f24906d;
        matrix2.set(matrix);
        i7.r rVar = this.f24912l;
        if (rVar != null) {
            matrix2.preConcat(rVar.e());
            i4 = (int) (((((rVar.f25922p == null ? 100 : ((Integer) r1.e()).intValue()) / 100.0f) * i4) / 255.0f) * 255.0f);
        }
        x xVar = this.j;
        boolean z3 = (xVar.f23817s && i() && i4 != 255) || (bVar != null && xVar.f23818t && i());
        int i10 = z3 ? 255 : i4;
        r7.i iVar = this.f24905c;
        if (z3) {
            RectF rectF = this.f24904b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            t7.m mVar = this.f24903a;
            mVar.f34473b = i4;
            if (bVar != null) {
                if (Color.alpha(bVar.f32849d) > 0) {
                    mVar.f34474c = bVar;
                } else {
                    mVar.f34474c = null;
                }
                bVar = null;
            } else {
                mVar.f34474c = null;
            }
            canvas = iVar.e(canvas, rectF, mVar);
        } else if (bVar != null) {
            r7.b bVar2 = new r7.b(bVar);
            bVar2.b(i10);
            bVar = bVar2;
        }
        ArrayList arrayList = this.f24910i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof f) {
                ((f) obj).h(canvas, matrix2, i10, bVar);
            }
        }
        if (z3) {
            iVar.c();
        }
    }

    public final boolean i() {
        int i4 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24910i;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i4) instanceof f) && (i10 = i10 + 1) >= 2) {
                return true;
            }
            i4++;
        }
    }

    public e(x xVar, n7.a aVar, String str, boolean z3, ArrayList arrayList, l7.e eVar) {
        this.f24903a = new t7.m((byte) 0, 19);
        this.f24904b = new RectF();
        this.f24905c = new r7.i();
        this.f24906d = new Matrix();
        this.f24907e = new Path();
        this.f24908f = new RectF();
        this.g = str;
        this.j = xVar;
        this.f24909h = z3;
        this.f24910i = arrayList;
        if (eVar != null) {
            i7.r rVar = new i7.r(eVar);
            this.f24912l = rVar;
            rVar.a(aVar);
            rVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof k) {
                arrayList2.add((k) dVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
