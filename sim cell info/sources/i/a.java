package i;

import i.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f2686f = new HashMap<>();

    @Override // i.b
    protected b.c<K, V> c(K k2) {
        return this.f2686f.get(k2);
    }

    public boolean contains(K k2) {
        return this.f2686f.containsKey(k2);
    }

    @Override // i.b
    public V g(K k2) {
        V v2 = (V) super.g(k2);
        this.f2686f.remove(k2);
        return v2;
    }

    public Map.Entry<K, V> h(K k2) {
        if (contains(k2)) {
            return this.f2686f.get(k2).f2694e;
        }
        return null;
    }

    public V i(K k2, V v2) {
        b.c<K, V> cVarC = c(k2);
        if (cVarC != null) {
            return cVarC.f2692c;
        }
        this.f2686f.put(k2, f(k2, v2));
        return null;
    }
}
