package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.jB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1356jB extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C1250hB f14912a;

    /* renamed from: b, reason: collision with root package name */
    public transient C1841sB f14913b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f14914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0978cC f14915d;

    public C1356jB(C0978cC c0978cC, Map map) {
        Objects.requireNonNull(c0978cC);
        this.f14915d = c0978cC;
        this.f14914c = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C0978cC c0978cC = this.f14915d;
        c0978cC.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new C1572nB(c0978cC, key, list, null) : new C1787rB(c0978cC, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f14914c;
        C0978cC c0978cC = this.f14915d;
        if (map == c0978cC.f13540d) {
            c0978cC.e();
            return;
        }
        C1304iB c1304iB = new C1304iB(this);
        while (c1304iB.hasNext()) {
            c1304iB.next();
            c1304iB.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f14914c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1250hB c1250hB = this.f14912a;
        if (c1250hB != null) {
            return c1250hB;
        }
        C1250hB c1250hB2 = new C1250hB(this);
        this.f14912a = c1250hB2;
        return c1250hB2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f14914c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f14914c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C0978cC c0978cC = this.f14915d;
        c0978cC.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C1572nB(c0978cC, obj, list, null) : new C1787rB(c0978cC, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f14914c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C0978cC c0978cC = this.f14915d;
        Set set = c0978cC.f16873a;
        if (set != null) {
            return set;
        }
        Map map = c0978cC.f13540d;
        Set c1518mB = map instanceof NavigableMap ? new C1518mB(c0978cC, (NavigableMap) map) : map instanceof SortedMap ? new C1680pB(c0978cC, (SortedMap) map) : new C1410kB(c0978cC, map);
        c0978cC.f16873a = c1518mB;
        return c1518mB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f14914c.remove(obj);
        if (collection == null) {
            return null;
        }
        C0978cC c0978cC = this.f14915d;
        List list = (List) c0978cC.f13542f.a();
        list.addAll(collection);
        c0978cC.f13541e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f14914c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f14914c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1841sB c1841sB = this.f14913b;
        if (c1841sB != null) {
            return c1841sB;
        }
        C1841sB c1841sB2 = new C1841sB(this);
        this.f14913b = c1841sB2;
        return c1841sB2;
    }
}
