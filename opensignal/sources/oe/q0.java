package oe;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class q0 extends q implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public transient Map f19369r;

    /* renamed from: x, reason: collision with root package name */
    public transient int f19370x;

    /* renamed from: y, reason: collision with root package name */
    public transient p0 f19371y;

    @Override // oe.q
    public final Map a() {
        Map map = this.f19368g;
        if (map != null) {
            return map;
        }
        Map map2 = this.f19369r;
        Map hVar = map2 instanceof NavigableMap ? new h(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new k(this, (SortedMap) map2) : new f(this, map2);
        this.f19368g = hVar;
        return hVar;
    }

    public final void c() {
        Map map = this.f19369r;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f19370x = 0;
    }

    public final boolean d(Object obj, Object obj2) {
        Map map = this.f19369r;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f19370x++;
            return true;
        }
        List list = (List) this.f19371y.get();
        if (!list.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f19370x++;
        map.put(obj, list);
        return true;
    }

    public final Collection e() {
        Collection collection = this.f19367d;
        if (collection != null) {
            return collection;
        }
        p pVar = new p(0, this);
        this.f19367d = pVar;
        return pVar;
    }
}
