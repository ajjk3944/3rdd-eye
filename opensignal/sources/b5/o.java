package b5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.d1;

/* loaded from: classes.dex */
public final class o implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2462a;

    public o(Map map) {
        this.f2462a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f2462a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f2462a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((d1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return oe.s.g(this.f2462a.entrySet(), new n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && oe.s.e(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f2462a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return oe.s.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f2462a;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return oe.s.g(this.f2462a.keySet(), new n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f2462a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f2462a.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f2462a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f2462a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f2462a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f2462a.values();
    }
}
