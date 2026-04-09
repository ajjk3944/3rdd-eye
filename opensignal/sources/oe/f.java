package oe;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public class f extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient d f19323a;

    /* renamed from: d, reason: collision with root package name */
    public transient p f19324d;

    /* renamed from: g, reason: collision with root package name */
    public final transient Map f19325g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q0 f19326r;

    public f(q0 q0Var, Map map) {
        this.f19326r = q0Var;
        this.f19325g = map;
    }

    public final d0 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z10 = list instanceof RandomAccess;
        q0 q0Var = this.f19326r;
        return new d0(key, z10 ? new j(q0Var, key, list, null) : new n(q0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        q0 q0Var = this.f19326r;
        if (this.f19325g == q0Var.f19369r) {
            q0Var.c();
            return;
        }
        e eVar = new e(this);
        while (eVar.hasNext()) {
            eVar.next();
            eVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f19325g;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        d dVar = this.f19323a;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f19323a = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f19325g.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f19325g;
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
        List list = (List) collection;
        boolean z10 = list instanceof RandomAccess;
        q0 q0Var = this.f19326r;
        return z10 ? new j(q0Var, obj, list, null) : new n(q0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f19325g.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        q0 q0Var = this.f19326r;
        Set set = q0Var.f19366a;
        if (set != null) {
            return set;
        }
        Map map = q0Var.f19369r;
        Set iVar = map instanceof NavigableMap ? new i(q0Var, (NavigableMap) map) : map instanceof SortedMap ? new l(q0Var, (SortedMap) map) : new g(q0Var, map);
        q0Var.f19366a = iVar;
        return iVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f19325g.remove(obj);
        if (collection == null) {
            return null;
        }
        q0 q0Var = this.f19326r;
        List list = (List) q0Var.f19371y.get();
        list.addAll(collection);
        q0Var.f19370x -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19325g.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f19325g.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        p pVar = this.f19324d;
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this);
        this.f19324d = pVar2;
        return pVar2;
    }
}
