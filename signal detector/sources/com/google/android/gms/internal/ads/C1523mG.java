package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523mG extends Cr implements Map {

    /* renamed from: c, reason: collision with root package name */
    public final Map f15603c;

    public C1523mG(Map map) {
        super(7);
        this.f15603c = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f15603c.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f15603c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C1681pC) entrySet()).iterator();
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
        return C1476lN.q(this.f15603c.entrySet(), E0.f7865d);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && Cr.x(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f15603c.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C1476lN.z(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f15603c;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C1476lN.q(this.f15603c.keySet(), E0.f7866e);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f15603c.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f15603c.putAll(map);
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ Object r() {
        return this.f15603c;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f15603c.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f15603c;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f15603c.values();
    }
}
