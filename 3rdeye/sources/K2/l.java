package k2;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p2.i;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f43235a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f43236b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f43237c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f43238d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final p2.i f43239e;

    /* compiled from: MergePathsContent.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43240a;

        static {
            int[] iArr = new int[i.a.values().length];
            f43240a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43240a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43240a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43240a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43240a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(p2.i iVar) {
        iVar.getClass();
        this.f43239e = iVar;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.f43236b;
        path.reset();
        Path path2 = this.f43235a;
        path2.reset();
        ArrayList arrayList = this.f43238d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof C5213d) {
                C5213d c5213d = (C5213d) mVar;
                ArrayList arrayList2 = (ArrayList) c5213d.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((m) arrayList2.get(size2)).getPath();
                    l2.p pVar = c5213d.f43183k;
                    if (pVar != null) {
                        matrixE2 = pVar.e();
                    } else {
                        matrixE2 = c5213d.f43176c;
                        matrixE2.reset();
                    }
                    path3.transform(matrixE2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(mVar.getPath());
            }
        }
        int i = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof C5213d) {
            C5213d c5213d2 = (C5213d) mVar2;
            List<m> listE = c5213d2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((m) arrayList3.get(i)).getPath();
                l2.p pVar2 = c5213d2.f43183k;
                if (pVar2 != null) {
                    matrixE = pVar2.e();
                } else {
                    matrixE = c5213d2.f43176c;
                    matrixE.reset();
                }
                path4.transform(matrixE);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(mVar2.getPath());
        }
        this.f43237c.op(path2, path, op);
    }

    @Override // k2.InterfaceC5212c
    public final void b(List<InterfaceC5212c> list, List<InterfaceC5212c> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f43238d;
            if (i >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // k2.j
    public final void e(ListIterator<InterfaceC5212c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC5212c interfaceC5212cPrevious = listIterator.previous();
            if (interfaceC5212cPrevious instanceof m) {
                this.f43238d.add((m) interfaceC5212cPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // k2.m
    public final Path getPath() {
        Path path = this.f43237c;
        path.reset();
        p2.i iVar = this.f43239e;
        if (!iVar.f45047b) {
            int i = a.f43240a[iVar.f45046a.ordinal()];
            if (i == 1) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f43238d;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i10)).getPath());
                    i10++;
                }
            } else {
                if (i == 2) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
