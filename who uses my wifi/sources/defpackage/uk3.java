package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uk3 extends pu1 implements Map {
    public final Map v;

    public uk3(Map map) {
        this.v = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.v.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.v.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((bo3) entrySet()).iterator();
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
        return m54.K(this.v.entrySet(), tf1.i);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && uk2.Q(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.v.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return m54.N(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.v;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return m54.K(this.v.keySet(), tf1.j);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.v.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.v.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.v.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.v;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.v.values();
    }

    @Override // defpackage.pu1
    public final /* synthetic */ Object w() {
        return this.v;
    }
}
