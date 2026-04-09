package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC4138k;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4152m<K, V> implements j31<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private transient Set<K> f30138b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f30139c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f30140d;

    /* renamed from: com.yandex.mobile.ads.impl.m$a */
    public class a extends AbstractCollection<V> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4152m f30141b;

        public a(AbstractC4138k abstractC4138k) {
            this.f30141b = abstractC4138k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            ((AbstractC4138k) this.f30141b).d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            Iterator<V> it = ((vt0) this.f30141b.a()).values().iterator();
            while (it.hasNext()) {
                if (((Collection) it.next()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            AbstractC4138k abstractC4138k = (AbstractC4138k) this.f30141b;
            abstractC4138k.getClass();
            return new C4131j(abstractC4138k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return ((AbstractC4138k) this.f30141b).g();
        }
    }

    @Override // com.yandex.mobile.ads.impl.j31
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f30140d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = ((n31) this).e();
        this.f30140d = mapE;
        return mapE;
    }

    public final Set<K> b() {
        Set<K> set = this.f30138b;
        if (set != null) {
            return set;
        }
        Set<K> setF = ((n31) this).f();
        this.f30138b = setF;
        return setF;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j31)) {
            return false;
        }
        return ((AbstractC4138k.a) ((AbstractC4124i) this).a()).equals(((j31) obj).a());
    }

    public final int hashCode() {
        return ((AbstractC4138k.a) a()).f29400d.hashCode();
    }

    public final String toString() {
        return ((AbstractC4138k.a) a()).f29400d.toString();
    }

    @Override // com.yandex.mobile.ads.impl.j31
    public Collection<V> values() {
        Collection<V> collection = this.f30139c;
        if (collection != null) {
            return collection;
        }
        a aVar = new a((AbstractC4138k) this);
        this.f30139c = aVar;
        return aVar;
    }
}
