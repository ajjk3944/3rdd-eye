package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.mB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518mB extends C1680pB implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0978cC f15593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518mB(C0978cC c0978cC, NavigableMap navigableMap) {
        super(c0978cC, navigableMap);
        Objects.requireNonNull(c0978cC);
        this.f15593d = c0978cC;
    }

    @Override // com.google.android.gms.internal.ads.C1680pB
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f15069a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15069a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1410kB) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1518mB(this.f15593d, ((NavigableMap) ((SortedMap) this.f15069a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15069a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1680pB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15069a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f15069a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1304iB c1304iB = (C1304iB) iterator();
        if (!c1304iB.hasNext()) {
            return null;
        }
        Object next = c1304iB.next();
        c1304iB.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.C1680pB, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C1680pB, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new C1518mB(this.f15593d, ((NavigableMap) ((SortedMap) this.f15069a)).headMap(obj, z6));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z7) {
        return new C1518mB(this.f15593d, ((NavigableMap) ((SortedMap) this.f15069a)).subMap(obj, z6, obj2, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new C1518mB(this.f15593d, ((NavigableMap) ((SortedMap) this.f15069a)).tailMap(obj, z6));
    }
}
