package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a41 extends v31 implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f9204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p51 f9205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(p51 p51Var, SortedMap sortedMap) {
        super(p51Var, sortedMap);
        Objects.requireNonNull(p51Var);
        this.f9205f = p51Var;
    }

    public SortedSet b() {
        return new b41(this.f9205f, d());
    }

    @Override // com.google.android.gms.internal.ads.v31, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f9204e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f9204e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f17452c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new a41(this.f9205f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new a41(this.f9205f, d().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new a41(this.f9205f, d().tailMap(obj));
    }
}
