package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class b41 extends w31 implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p51 f9592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(p51 p51Var, SortedMap sortedMap) {
        super(p51Var, sortedMap);
        Objects.requireNonNull(p51Var);
        this.f9592c = p51Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f17855a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new b41(this.f9592c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new b41(this.f9592c, a().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new b41(this.f9592c, a().tailMap(obj));
    }
}
