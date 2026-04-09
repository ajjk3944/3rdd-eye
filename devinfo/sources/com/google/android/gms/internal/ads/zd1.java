package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zd1 extends al0 implements Map {

    /* renamed from: c, reason: collision with root package name */
    public final Map f19063c;

    public zd1(Map map) {
        super(7);
        this.f19063c = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f19063c.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f19063c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((d61) entrySet()).iterator();
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
        return yr1.p(this.f19063c.entrySet(), g2.f11348d);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && al0.B(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f19063c.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return yr1.y(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f19063c;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return yr1.p(this.f19063c.keySet(), g2.f11349e);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f19063c.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f19063c.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f19063c.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f19063c;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ Object v() {
        return this.f19063c;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f19063c.values();
    }
}
