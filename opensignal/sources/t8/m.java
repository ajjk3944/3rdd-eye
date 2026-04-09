package t8;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class m implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f22604a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f22605b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f22606c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22607d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final z8.k f22608e;

    public m(z8.k kVar) {
        this.f22608e = kVar;
    }

    public final void a(Path.Op op) {
        Path path = this.f22605b;
        path.reset();
        Path path2 = this.f22604a;
        path2.reset();
        ArrayList arrayList = this.f22607d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                ArrayList arrayList2 = (ArrayList) dVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathG = ((n) arrayList2.get(size2)).g();
                    Matrix matrixE = dVar.f22550d;
                    u8.q qVar = dVar.f22556l;
                    if (qVar != null) {
                        matrixE = qVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathG.transform(matrixE);
                    path.addPath(pathG);
                }
            } else {
                path.addPath(nVar.g());
            }
        }
        int i10 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List listE = dVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path pathG2 = ((n) arrayList3.get(i10)).g();
                Matrix matrixE2 = dVar2.f22550d;
                u8.q qVar2 = dVar2.f22556l;
                if (qVar2 != null) {
                    matrixE2 = qVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathG2.transform(matrixE2);
                path2.addPath(pathG2);
                i10++;
            }
        } else {
            path2.set(nVar2.g());
        }
        this.f22606c.op(path2, path, op);
    }

    @Override // t8.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22607d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i10)).b(list, list2);
            i10++;
        }
    }

    @Override // t8.j
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof n) {
                this.f22607d.add((n) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // t8.n
    public final Path g() {
        Path path = this.f22606c;
        path.reset();
        z8.k kVar = this.f22608e;
        if (!kVar.f26740b) {
            int i10 = l.f22603a[kVar.f26739a.ordinal()];
            if (i10 == 1) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f22607d;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i11)).g());
                    i11++;
                }
            } else {
                if (i10 == 2) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i10 == 3) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i10 == 4) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i10 == 5) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
