package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e61 extends d61 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f10345a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f10345a.iterator();
        it.getClass();
        d31 d31Var = this.f10346b;
        d31Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (d31Var.c(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new e61(((SortedSet) this.f10345a).headSet(obj), this.f10346b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f10345a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f10346b.c(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new e61(((SortedSet) this.f10345a).subSet(obj, obj2), this.f10346b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new e61(((SortedSet) this.f10345a).tailSet(obj), this.f10346b);
    }
}
