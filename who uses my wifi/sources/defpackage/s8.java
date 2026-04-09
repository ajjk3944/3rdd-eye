package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s8 extends bw0 implements Map {
    public n8 i;
    public p8 j;
    public r8 k;

    @Override // java.util.Map
    public final Set entrySet() {
        n8 n8Var = this.i;
        if (n8Var != null) {
            return n8Var;
        }
        n8 n8Var2 = new n8(0, this);
        this.i = n8Var2;
        return n8Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        p8 p8Var = this.j;
        if (p8Var != null) {
            return p8Var;
        }
        p8 p8Var2 = new p8(this);
        this.j = p8Var2;
        return p8Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        r8 r8Var = this.k;
        if (r8Var != null) {
            return r8Var;
        }
        r8 r8Var2 = new r8(this);
        this.k = r8Var2;
        return r8Var2;
    }
}
