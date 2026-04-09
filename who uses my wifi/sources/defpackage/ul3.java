package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ul3 extends AbstractMap {
    public transient sl3 f;
    public transient dm3 g;
    public final transient Map h;
    public final /* synthetic */ pn3 i;

    public ul3(pn3 pn3Var, Map map) {
        Objects.requireNonNull(pn3Var);
        this.i = pn3Var;
        this.h = map;
    }

    public final AbstractMap.SimpleImmutableEntry a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        pn3 pn3Var = this.i;
        pn3Var.getClass();
        List list = (List) collection;
        return new AbstractMap.SimpleImmutableEntry(key, list instanceof RandomAccess ? new yl3(pn3Var, key, list, null) : new cm3(pn3Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.h;
        pn3 pn3Var = this.i;
        if (map == pn3Var.i) {
            pn3Var.e();
            return;
        }
        tl3 tl3Var = new tl3(this);
        while (tl3Var.hasNext()) {
            tl3Var.next();
            tl3Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.h;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        sl3 sl3Var = this.f;
        if (sl3Var != null) {
            return sl3Var;
        }
        sl3 sl3Var2 = new sl3(this);
        this.f = sl3Var2;
        return sl3Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.h.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.h;
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
        pn3 pn3Var = this.i;
        pn3Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new yl3(pn3Var, obj, list, null) : new cm3(pn3Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.h.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        pn3 pn3Var = this.i;
        Set set = pn3Var.f;
        if (set != null) {
            return set;
        }
        Map map = pn3Var.i;
        Set xl3Var = map instanceof NavigableMap ? new xl3(pn3Var, (NavigableMap) map) : map instanceof SortedMap ? new am3(pn3Var, (SortedMap) map) : new vl3(pn3Var, map);
        pn3Var.f = xl3Var;
        return xl3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.h.remove(obj);
        if (collection == null) {
            return null;
        }
        pn3 pn3Var = this.i;
        List list = (List) pn3Var.k.a();
        list.addAll(collection);
        pn3Var.j -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.h.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        dm3 dm3Var = this.g;
        if (dm3Var != null) {
            return dm3Var;
        }
        dm3 dm3Var2 = new dm3(this);
        this.g = dm3Var2;
        return dm3Var2;
    }
}
