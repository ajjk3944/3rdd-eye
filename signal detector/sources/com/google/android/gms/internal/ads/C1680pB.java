package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.pB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1680pB extends C1410kB implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0978cC f16146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1680pB(C0978cC c0978cC, SortedMap sortedMap) {
        super(c0978cC, sortedMap);
        Objects.requireNonNull(c0978cC);
        this.f16146c = c0978cC;
    }

    public SortedMap a() {
        return (SortedMap) this.f15069a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1680pB(this.f16146c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1680pB(this.f16146c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1680pB(this.f16146c, a().tailMap(obj));
    }
}
