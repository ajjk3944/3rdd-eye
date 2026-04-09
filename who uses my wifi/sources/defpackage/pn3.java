package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pn3 extends em3 implements Serializable {
    public final transient Map i;
    public transient int j;
    public final transient wc k;

    public pn3(Map map, wc wcVar) {
        zt0.D(map.isEmpty());
        this.i = map;
        this.k = wcVar;
    }

    @Override // defpackage.em3
    public final Collection a() {
        return new dm3(0, this);
    }

    @Override // defpackage.em3
    public final Map b() {
        Map map = this.i;
        return map instanceof NavigableMap ? new wl3(this, (NavigableMap) map) : map instanceof SortedMap ? new zl3(this, (SortedMap) map) : new ul3(this, map);
    }

    public final void e() {
        Map map = this.i;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.j = 0;
    }
}
