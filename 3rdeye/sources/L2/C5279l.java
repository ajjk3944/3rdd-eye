package l2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import k2.s;
import n2.C5347a;
import u2.C5624c;
import u2.C5628g;
import v2.C5673a;

/* compiled from: ShapeKeyframeAnimation.java */
/* renamed from: l2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5279l extends AbstractC5268a<p2.n, Path> {
    public final p2.n i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f43722j;

    /* renamed from: k, reason: collision with root package name */
    public Path f43723k;

    /* renamed from: l, reason: collision with root package name */
    public Path f43724l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f43725m;

    public C5279l(List<C5673a<p2.n>> list) {
        super(list);
        this.i = new p2.n();
        this.f43722j = new Path();
    }

    @Override // l2.AbstractC5268a
    public final Path g(C5673a<p2.n> c5673a, float f10) {
        p2.n nVarF;
        p2.n nVar = c5673a.f47012b;
        p2.n nVar2 = c5673a.f47013c;
        p2.n nVar3 = nVar2 == null ? nVar : nVar2;
        p2.n nVar4 = this.i;
        if (nVar4.f45070b == null) {
            nVar4.f45070b = new PointF();
        }
        boolean z10 = true;
        nVar4.f45071c = nVar.f45071c || nVar3.f45071c;
        ArrayList arrayList = nVar.f45069a;
        int size = arrayList.size();
        int size2 = nVar3.f45069a.size();
        ArrayList arrayList2 = nVar3.f45069a;
        if (size != size2) {
            C5624c.b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = nVar4.f45069a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new C5347a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = nVar.f45070b;
        PointF pointF2 = nVar3.f45070b;
        nVar4.a(C5628g.e(pointF.x, pointF2.x, f10), C5628g.e(pointF.y, pointF2.y, f10));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            C5347a c5347a = (C5347a) arrayList.get(size5);
            C5347a c5347a2 = (C5347a) arrayList2.get(size5);
            PointF pointF3 = c5347a.f44245a;
            PointF pointF4 = c5347a2.f44245a;
            boolean z11 = z10;
            p2.n nVar5 = nVar4;
            ((C5347a) arrayList3.get(size5)).f44245a.set(C5628g.e(pointF3.x, pointF4.x, f10), C5628g.e(pointF3.y, pointF4.y, f10));
            C5347a c5347a3 = (C5347a) arrayList3.get(size5);
            PointF pointF5 = c5347a.f44246b;
            float f11 = pointF5.x;
            PointF pointF6 = c5347a2.f44246b;
            c5347a3.f44246b.set(C5628g.e(f11, pointF6.x, f10), C5628g.e(pointF5.y, pointF6.y, f10));
            C5347a c5347a4 = (C5347a) arrayList3.get(size5);
            PointF pointF7 = c5347a.f44247c;
            float f12 = pointF7.x;
            PointF pointF8 = c5347a2.f44247c;
            c5347a4.f44247c.set(C5628g.e(f12, pointF8.x, f10), C5628g.e(pointF7.y, pointF8.y, f10));
            size5--;
            z10 = z11;
            nVar4 = nVar5;
        }
        p2.n nVar6 = nVar4;
        ArrayList arrayList4 = this.f43725m;
        if (arrayList4 != null) {
            nVarF = nVar6;
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                nVarF = ((s) this.f43725m.get(size6)).f(nVarF);
            }
        } else {
            nVarF = nVar6;
        }
        Path path = this.f43722j;
        C5628g.d(nVarF, path);
        if (this.f43690e == null) {
            return path;
        }
        if (this.f43723k == null) {
            this.f43723k = new Path();
            this.f43724l = new Path();
        }
        C5628g.d(nVar, this.f43723k);
        if (nVar2 != null) {
            C5628g.d(nVar2, this.f43724l);
        }
        B0.f fVar = this.f43690e;
        float fFloatValue = c5673a.f47018h.floatValue();
        Path path2 = this.f43723k;
        return (Path) fVar.e(c5673a.f47017g, fFloatValue, path2, nVar2 == null ? path2 : this.f43724l, f10, e(), this.f43689d);
    }
}
