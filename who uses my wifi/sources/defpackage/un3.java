package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class un3 extends dn3 {
    public final transient xn3 i;
    public final transient Object[] j;
    public final transient int k;

    public un3(xn3 xn3Var, Object[] objArr, int i) {
        this.i = xn3Var;
        this.j = objArr;
        this.k = i;
    }

    @Override // defpackage.tm3
    public final yq2 a() {
        return e().listIterator(0);
    }

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tm3
    public final boolean f() {
        return true;
    }

    @Override // defpackage.tm3
    public final int g(Object[] objArr, int i) {
        return e().g(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.dn3
    public final xm3 k() {
        return new tn3(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k;
    }
}
