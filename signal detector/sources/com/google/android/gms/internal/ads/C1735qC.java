package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.qC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735qC extends C1681pC implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f16147a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f16147a.iterator();
        it.getClass();
        RA ra = this.f16148b;
        ra.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ra.b(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C1735qC(((SortedSet) this.f16147a).headSet(obj), this.f16148b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f16147a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f16148b.b(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C1735qC(((SortedSet) this.f16147a).subSet(obj, obj2), this.f16148b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C1735qC(((SortedSet) this.f16147a).tailSet(obj), this.f16148b);
    }
}
