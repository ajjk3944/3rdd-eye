package u;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class q implements Map, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f23097a;

    /* renamed from: d, reason: collision with root package name */
    public g f23098d;

    /* renamed from: g, reason: collision with root package name */
    public g f23099g;

    /* renamed from: r, reason: collision with root package name */
    public k0 f23100r;

    public q(a0 a0Var) {
        br.l.e(a0Var, "parent");
        this.f23097a = a0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f23097a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f23097a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f23098d;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f23097a, 0);
        this.f23098d = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return br.l.a(this.f23097a, ((q) obj).f23097a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f23097a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f23097a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23097a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f23099g;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f23097a, 1);
        this.f23099g = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23097a.f23041e;
    }

    public final String toString() {
        return this.f23097a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        k0 k0Var = this.f23100r;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(this.f23097a);
        this.f23100r = k0Var2;
        return k0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
