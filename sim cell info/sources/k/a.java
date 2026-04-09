package k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: i, reason: collision with root package name */
    f<K, V> f2721i;

    /* renamed from: k.a$a, reason: collision with other inner class name */
    class C0032a extends f<K, V> {
        C0032a() {
        }

        @Override // k.f
        protected void a() {
            a.this.clear();
        }

        @Override // k.f
        protected Object b(int i2, int i3) {
            return a.this.f2770c[(i2 << 1) + i3];
        }

        @Override // k.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // k.f
        protected int d() {
            return a.this.f2771d;
        }

        @Override // k.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // k.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // k.f
        protected void g(K k2, V v2) {
            a.this.put(k2, v2);
        }

        @Override // k.f
        protected void h(int i2) {
            a.this.j(i2);
        }

        @Override // k.f
        protected V i(int i2, V v2) {
            return a.this.k(i2, v2);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    private f<K, V> m() {
        if (this.f2721i == null) {
            this.f2721i = new C0032a();
        }
        return this.f2721i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f2771d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
