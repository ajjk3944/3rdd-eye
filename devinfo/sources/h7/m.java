package h7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements n, k {

    /* renamed from: a, reason: collision with root package name */
    public final Path f24958a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f24959b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f24960c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24961d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final m7.g f24962e;

    public m(m7.g gVar) {
        this.f24962e = gVar;
    }

    public final void a(Path.Op op) {
        Path path = this.f24959b;
        path.reset();
        Path path2 = this.f24958a;
        path2.reset();
        ArrayList arrayList = this.f24961d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathB = ((n) arrayList2.get(size2)).b();
                    Matrix matrixE = eVar.f24906d;
                    i7.r rVar = eVar.f24912l;
                    if (rVar != null) {
                        matrixE = rVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathB.transform(matrixE);
                    path.addPath(pathB);
                }
            } else {
                path.addPath(nVar.b());
            }
        }
        int i4 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List listE = eVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i4 >= arrayList3.size()) {
                    break;
                }
                Path pathB2 = ((n) arrayList3.get(i4)).b();
                Matrix matrixE2 = eVar2.f24906d;
                i7.r rVar2 = eVar2.f24912l;
                if (rVar2 != null) {
                    matrixE2 = rVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathB2.transform(matrixE2);
                path2.addPath(pathB2);
                i4++;
            }
        } else {
            path2.set(nVar2.b());
        }
        this.f24960c.op(path2, path, op);
    }

    @Override // h7.n
    public final Path b() {
        Path path = this.f24960c;
        path.reset();
        m7.g gVar = this.f24962e;
        if (!gVar.f28907b) {
            int iC = i3.e.c(gVar.f28906a);
            if (iC == 0) {
                int i4 = 0;
                while (true) {
                    ArrayList arrayList = this.f24961d;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i4)).b());
                    i4++;
                }
            } else {
                if (iC == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iC == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iC == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iC == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // h7.d
    public final void c(List list, List list2) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f24961d;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i4)).c(list, list2);
            i4++;
        }
    }

    @Override // h7.k
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f24961d.add((n) dVar);
                listIterator.remove();
            }
        }
    }
}
