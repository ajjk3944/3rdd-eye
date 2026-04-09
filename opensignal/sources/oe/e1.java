package oe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class e1 extends d1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f19314a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f19314a.iterator();
        it.getClass();
        ne.j jVar = this.f19315d;
        jVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (jVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new e1(((SortedSet) this.f19314a).headSet(obj), this.f19315d);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f19314a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f19315d.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new e1(((SortedSet) this.f19314a).subSet(obj, obj2), this.f19315d);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new e1(((SortedSet) this.f19314a).tailSet(obj), this.f19315d);
    }
}
