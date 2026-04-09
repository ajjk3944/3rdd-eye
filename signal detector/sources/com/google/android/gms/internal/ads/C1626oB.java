package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.oB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1626oB extends C1356jB implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f15913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0978cC f15914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626oB(C0978cC c0978cC, SortedMap sortedMap) {
        super(c0978cC, sortedMap);
        Objects.requireNonNull(c0978cC);
        this.f15914f = c0978cC;
    }

    public SortedSet b() {
        return new C1680pB(this.f15914f, d());
    }

    @Override // com.google.android.gms.internal.ads.C1356jB, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f15913e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f15913e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f14914c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1626oB(this.f15914f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1626oB(this.f15914f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1626oB(this.f15914f, d().tailMap(obj));
    }
}
