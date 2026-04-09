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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class v31 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient t31 f17450a;

    /* renamed from: b, reason: collision with root package name */
    public transient e41 f17451b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f17452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p51 f17453d;

    public v31(p51 p51Var, Map map) {
        Objects.requireNonNull(p51Var);
        this.f17453d = p51Var;
        this.f17452c = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        p51 p51Var = this.f17453d;
        p51Var.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new z31(p51Var, key, list, null) : new d41(p51Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f17452c;
        p51 p51Var = this.f17453d;
        if (map == p51Var.f14901d) {
            p51Var.e();
            return;
        }
        u31 u31Var = new u31(this);
        while (u31Var.hasNext()) {
            u31Var.next();
            u31Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f17452c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        t31 t31Var = this.f17450a;
        if (t31Var != null) {
            return t31Var;
        }
        t31 t31Var2 = new t31(this);
        this.f17450a = t31Var2;
        return t31Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f17452c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f17452c;
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
        p51 p51Var = this.f17453d;
        p51Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new z31(p51Var, obj, list, null) : new d41(p51Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f17452c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        p51 p51Var = this.f17453d;
        Set set = p51Var.f10988a;
        if (set != null) {
            return set;
        }
        Map map = p51Var.f14901d;
        Set y31Var = map instanceof NavigableMap ? new y31(p51Var, (NavigableMap) map) : map instanceof SortedMap ? new b41(p51Var, (SortedMap) map) : new w31(p51Var, map);
        p51Var.f10988a = y31Var;
        return y31Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f17452c.remove(obj);
        if (collection == null) {
            return null;
        }
        p51 p51Var = this.f17453d;
        List list = (List) p51Var.f14903f.b();
        list.addAll(collection);
        p51Var.f14902e -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f17452c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f17452c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e41 e41Var = this.f17451b;
        if (e41Var != null) {
            return e41Var;
        }
        e41 e41Var2 = new e41(this);
        this.f17451b = e41Var2;
        return e41Var2;
    }
}
