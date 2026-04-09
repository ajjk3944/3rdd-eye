package t8;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, n, u8.a, x8.g {

    /* renamed from: a, reason: collision with root package name */
    public final ag.b f22547a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f22548b;

    /* renamed from: c, reason: collision with root package name */
    public final e9.i f22549c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f22550d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f22551e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f22552f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22553g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22554h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22555i;
    public final r8.v j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final u8.q f22556l;

    public d(r8.v vVar, a9.b bVar, z8.r rVar, r8.h hVar) {
        y8.d dVar;
        String str = rVar.f26766a;
        boolean z10 = rVar.f26768c;
        List list = rVar.f26767b;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVarA = ((z8.b) list.get(i11)).a(vVar, hVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i10 >= list.size()) {
                dVar = null;
                break;
            }
            z8.b bVar2 = (z8.b) list.get(i10);
            if (bVar2 instanceof y8.d) {
                dVar = (y8.d) bVar2;
                break;
            }
            i10++;
        }
        this(vVar, bVar, str, z10, arrayList, dVar);
    }

    @Override // u8.a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f22555i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        String str = this.f22553g;
        if (!fVar.c(i10, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            x8.f fVar3 = new x8.f(fVar2);
            fVar3.f25092a.add(str);
            if (fVar.a(i10, str)) {
                x8.f fVar4 = new x8.f(fVar3);
                fVar4.f25093b = this;
                arrayList.add(fVar4);
            }
            fVar2 = fVar3;
        }
        if (!fVar.d(i10, str)) {
            return;
        }
        int iB = fVar.b(i10, str) + i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f22555i;
            if (i11 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i11);
            if (cVar instanceof x8.g) {
                ((x8.g) cVar).c(fVar, iB, arrayList, fVar2);
            }
            i11++;
        }
    }

    @Override // t8.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f22550d;
        matrix2.set(matrix);
        u8.q qVar = this.f22556l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f22552f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f22555i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public final List e() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f22555i;
                if (i10 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof n) {
                    this.k.add((n) cVar);
                }
                i10++;
            }
        }
        return this.k;
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        u8.q qVar = this.f22556l;
        if (qVar != null) {
            qVar.c(eVar, obj);
        }
    }

    @Override // t8.n
    public final Path g() {
        Matrix matrix = this.f22550d;
        matrix.reset();
        u8.q qVar = this.f22556l;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f22551e;
        path.reset();
        if (!this.f22554h) {
            ArrayList arrayList = this.f22555i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof n) {
                    path.addPath(((n) cVar).g(), matrix);
                }
            }
        }
        return path;
    }

    @Override // t8.c
    public final String getName() {
        throw null;
    }

    @Override // t8.e
    public final void h(Canvas canvas, Matrix matrix, int i10, e9.a aVar) {
        if (this.f22554h) {
            return;
        }
        Matrix matrix2 = this.f22550d;
        matrix2.set(matrix);
        u8.q qVar = this.f22556l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
            i10 = (int) (((((qVar.f23496p == null ? 100 : ((Integer) r1.f()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        r8.v vVar = this.j;
        boolean z10 = (vVar.P && i() && i10 != 255) || (aVar != null && vVar.Q && i());
        int i11 = z10 ? 255 : i10;
        e9.i iVar = this.f22549c;
        if (z10) {
            RectF rectF = this.f22548b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(rectF, matrix, true);
            ag.b bVar = this.f22547a;
            bVar.f345d = i10;
            if (aVar != null) {
                if (Color.alpha(aVar.f7979d) > 0) {
                    bVar.f346g = aVar;
                } else {
                    bVar.f346g = null;
                }
                aVar = null;
            } else {
                bVar.f346g = null;
            }
            canvas = iVar.e(canvas, rectF, bVar);
        } else if (aVar != null) {
            e9.a aVar2 = new e9.a(aVar);
            aVar2.b(i11);
            aVar = aVar2;
        }
        ArrayList arrayList = this.f22555i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).h(canvas, matrix2, i11, aVar);
            }
        }
        if (z10) {
            iVar.c();
        }
    }

    public final boolean i() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22555i;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i10) instanceof e) && (i11 = i11 + 1) >= 2) {
                return true;
            }
            i10++;
        }
    }

    public d(r8.v vVar, a9.b bVar, String str, boolean z10, ArrayList arrayList, y8.d dVar) {
        this.f22547a = new ag.b(1, (byte) 0);
        this.f22548b = new RectF();
        this.f22549c = new e9.i();
        this.f22550d = new Matrix();
        this.f22551e = new Path();
        this.f22552f = new RectF();
        this.f22553g = str;
        this.j = vVar;
        this.f22554h = z10;
        this.f22555i = arrayList;
        if (dVar != null) {
            u8.q qVar = new u8.q(dVar);
            this.f22556l = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).e(arrayList.listIterator(arrayList.size()));
        }
    }
}
