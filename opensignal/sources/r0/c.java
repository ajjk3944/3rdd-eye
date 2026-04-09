package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends mq.d implements List, Collection, cr.a {
    public abstract c b(int i10, Object obj);

    public abstract c c(Object obj);

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // mq.a, java.util.Collection
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

    public c d(Collection collection) {
        f fVarE = e();
        fVarE.addAll(collection);
        return fVarE.c();
    }

    public abstract f e();

    public abstract c g(b bVar);

    @Override // mq.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i10);

    public abstract c k(int i10, Object obj);

    @Override // mq.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // mq.d, java.util.List
    public final List subList(int i10, int i11) {
        return new q0.a(this, i10, i11);
    }
}
