package com.google.android.gms.internal.ads;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z41 implements Map, Serializable, j$.util.Map {

    /* renamed from: a, reason: collision with root package name */
    public transient w51 f19012a;

    /* renamed from: b, reason: collision with root package name */
    public transient x51 f19013b;

    /* renamed from: c, reason: collision with root package name */
    public transient y51 f19014c;

    public static z41 a(Map map) {
        if ((map instanceof z41) && !(map instanceof SortedMap)) {
            return (z41) map;
        }
        Set setEntrySet = map.entrySet();
        oa oaVar = new oa(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        oaVar.n(setEntrySet);
        return oaVar.v(true);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e51 entrySet() {
        w51 w51Var = this.f19012a;
        if (w51Var != null) {
            return w51Var;
        }
        z51 z51Var = (z51) this;
        w51 w51Var2 = new w51(z51Var, z51Var.f19023e, z51Var.f19024f);
        this.f19012a = w51Var2;
        return w51Var2;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t41 values() {
        y51 y51Var = this.f19014c;
        if (y51Var != null) {
            return y51Var;
        }
        z51 z51Var = (z51) this;
        y51 y51Var2 = new y51(z51Var.f19023e, 1, z51Var.f19024f);
        this.f19014c = y51Var2;
        return y51Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return al0.B(obj, this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return yr1.y(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((z51) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        x51 x51Var = this.f19013b;
        if (x51Var != null) {
            return x51Var;
        }
        z51 z51Var = (z51) this;
        x51 x51Var2 = new x51(z51Var, new y51(z51Var.f19023e, 0, z51Var.f19024f));
        this.f19013b = x51Var2;
        return x51Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i4 = ((z51) this).f19024f;
        yr1.u(i4, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((w51) entrySet()).iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z3) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z3 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
