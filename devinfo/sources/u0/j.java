package u0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final x.a0 f34836a;

    /* renamed from: b, reason: collision with root package name */
    public final x.a0 f34837b;

    /* renamed from: c, reason: collision with root package name */
    public final x.t f34838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34839d;

    public j(x.a0 a0Var, x.a0 a0Var2, x.t tVar, int i4, Exception exc) {
        super(exc);
        this.f34836a = a0Var;
        this.f34837b = a0Var2;
        this.f34838c = tVar;
        this.f34839d = i4;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listS;
        Collection collectionR0;
        StringBuilder sb2 = new StringBuilder("\n            |Failed to execute op number ");
        sb2.append(this.f34839d);
        sb2.append(":\n            |");
        uk.g gVarR = jm.a.r(new i(this, null));
        if (gVarR.hasNext()) {
            Object next = gVarR.next();
            if (gVarR.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVarR.hasNext()) {
                    arrayList.add(gVarR.next());
                }
                listS = arrayList;
            } else {
                listS = cm.g.s(next);
            }
        } else {
            listS = zj.s.f38317a;
        }
        int size = listS.size();
        if (50 >= size) {
            collectionR0 = zj.n.r0(listS);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listS instanceof RandomAccess) {
                for (int i4 = size - 50; i4 < size; i4++) {
                    arrayList2.add(listS.get(i4));
                }
            } else {
                ListIterator listIterator = listS.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collectionR0 = arrayList2;
        }
        sb2.append(zj.n.g0(collectionR0, "\n", null, null, null, 62));
        sb2.append("\n            ");
        return vk.j.m0(sb2.toString());
    }
}
