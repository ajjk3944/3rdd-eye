package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC4138k;
import com.yandex.mobile.ads.impl.AbstractC4138k.a.C0410a;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class vt0<K, V> extends AbstractMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f34665b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f34666c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f34665b;
        if (set != null) {
            return set;
        }
        AbstractC4138k.a.C0410a c0410a = ((AbstractC4138k.a) this).new C0410a();
        this.f34665b = c0410a;
        return c0410a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f34666c;
        if (collection != null) {
            return collection;
        }
        ut0 ut0Var = new ut0(this);
        this.f34666c = ut0Var;
        return ut0Var;
    }
}
