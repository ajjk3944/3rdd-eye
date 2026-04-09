package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y31 extends b41 implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p51 f18623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(p51 p51Var, NavigableMap navigableMap) {
        super(p51Var, navigableMap);
        Objects.requireNonNull(p51Var);
        this.f18623d = p51Var;
    }

    @Override // com.google.android.gms.internal.ads.b41
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f17855a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17855a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((w31) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new y31(this.f18623d, ((NavigableMap) ((SortedMap) this.f17855a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17855a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.b41, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17855a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f17855a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        u31 u31Var = (u31) iterator();
        if (!u31Var.hasNext()) {
            return null;
        }
        Object next = u31Var.next();
        u31Var.remove();
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

    @Override // com.google.android.gms.internal.ads.b41, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.b41, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new y31(this.f18623d, ((NavigableMap) ((SortedMap) this.f17855a)).headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z10) {
        return new y31(this.f18623d, ((NavigableMap) ((SortedMap) this.f17855a)).subMap(obj, z3, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new y31(this.f18623d, ((NavigableMap) ((SortedMap) this.f17855a)).tailMap(obj, z3));
    }
}
