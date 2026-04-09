package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class co3 extends bo3 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f.iterator();
        it.getClass();
        cl3 cl3Var = this.g;
        cl3Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (cl3Var.c(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new co3(((SortedSet) this.f).headSet(obj), this.g);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.g.c(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new co3(((SortedSet) this.f).subSet(obj, obj2), this.g);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new co3(((SortedSet) this.f).tailSet(obj), this.g);
    }
}
