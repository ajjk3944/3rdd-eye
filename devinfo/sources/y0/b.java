package y0;

import g1.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends zj.e implements List, Collection, ok.a {
    public abstract b a(int i4, Object obj);

    public abstract b c(Object obj);

    @Override // zj.a, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // zj.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public b d(Collection collection) {
        e eVarF = f();
        eVarF.addAll(collection);
        return eVarF.d();
    }

    public abstract e f();

    public abstract b g(o oVar);

    public abstract b i(int i4);

    @Override // zj.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract b j(int i4, Object obj);

    @Override // zj.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // zj.e, java.util.List
    public final List subList(int i4, int i10) {
        return new x0.a(this, i4, i10);
    }
}
