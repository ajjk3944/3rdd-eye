package com.google.common.collect;

import com.google.common.collect.d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class c implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public transient Collection f12030a;

    /* renamed from: b, reason: collision with root package name */
    public transient Set f12031b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f12032c;

    public class a extends d0.b {
        public a() {
        }

        @Override // com.google.common.collect.d0.b
        public c0 b() {
            return c.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return c.this.k();
        }
    }

    public class b extends a implements Set {
        public b(c cVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    @Override // com.google.common.collect.c0
    public Map d() {
        Map map = this.f12032c;
        if (map != null) {
            return map;
        }
        Map mapG = g();
        this.f12032c = mapG;
        return mapG;
    }

    @Override // com.google.common.collect.c0
    public boolean e(Object obj, Object obj2) {
        Collection collection = (Collection) d().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean equals(Object obj) {
        return d0.a(this, obj);
    }

    public abstract Map g();

    public abstract Collection h();

    public int hashCode() {
        return d().hashCode();
    }

    public abstract Set i();

    @Override // com.google.common.collect.c0
    public boolean isEmpty() {
        return size() == 0;
    }

    public Collection j() {
        Collection collection = this.f12030a;
        if (collection != null) {
            return collection;
        }
        Collection collectionH = h();
        this.f12030a = collectionH;
        return collectionH;
    }

    public abstract Iterator k();

    @Override // com.google.common.collect.c0
    public Set keySet() {
        Set set = this.f12031b;
        if (set != null) {
            return set;
        }
        Set setI = i();
        this.f12031b = setI;
        return setI;
    }

    @Override // com.google.common.collect.c0
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) d().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return d().toString();
    }
}
