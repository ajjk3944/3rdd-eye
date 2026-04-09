package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ke0 implements kk0, yz {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final je0 e;

    public ke0(je0 je0Var) {
        this.e = je0Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            kk0 kk0Var = (kk0) arrayList.get(size);
            if (kk0Var instanceof zi) {
                zi ziVar = (zi) kk0Var;
                ArrayList arrayList2 = (ArrayList) ziVar.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathF = ((kk0) arrayList2.get(size2)).f();
                    Matrix matrixE = ziVar.d;
                    q21 q21Var = ziVar.l;
                    if (q21Var != null) {
                        matrixE = q21Var.e();
                    } else {
                        matrixE.reset();
                    }
                    pathF.transform(matrixE);
                    path.addPath(pathF);
                }
            } else {
                path.addPath(kk0Var.f());
            }
        }
        int i = 0;
        kk0 kk0Var2 = (kk0) arrayList.get(0);
        if (kk0Var2 instanceof zi) {
            zi ziVar2 = (zi) kk0Var2;
            List listE = ziVar2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathF2 = ((kk0) arrayList3.get(i)).f();
                Matrix matrixE2 = ziVar2.d;
                q21 q21Var2 = ziVar2.l;
                if (q21Var2 != null) {
                    matrixE2 = q21Var2.e();
                } else {
                    matrixE2.reset();
                }
                pathF2.transform(matrixE2);
                path2.addPath(pathF2);
                i++;
            }
        } else {
            path2.set(kk0Var2.f());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((kk0) arrayList.get(i)).d(list, list2);
            i++;
        }
    }

    @Override // defpackage.yz
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            vi viVar = (vi) listIterator.previous();
            if (viVar instanceof kk0) {
                this.d.add((kk0) viVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.kk0
    public final Path f() {
        Path path = this.c;
        path.reset();
        je0 je0Var = this.e;
        if (!je0Var.b) {
            int iS = ex0.s(je0Var.a);
            if (iS == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((kk0) arrayList.get(i)).f());
                    i++;
                }
            } else {
                if (iS == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iS == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iS == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iS == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
