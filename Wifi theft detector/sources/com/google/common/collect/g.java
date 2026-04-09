package com.google.common.collect;

import com.google.common.collect.t0;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class g implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f12043a;

    public class a extends AbstractSet {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof t0.a) {
                t0.a aVar = (t0.a) obj;
                Map map = (Map) Maps.k(g.this.g(), aVar.d());
                if (map != null && k.c(map.entrySet(), Maps.e(aVar.g(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return g.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof t0.a) {
                t0.a aVar = (t0.a) obj;
                Map map = (Map) Maps.k(g.this.g(), aVar.d());
                if (map != null && k.d(map.entrySet(), Maps.e(aVar.g(), aVar.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.size();
        }
    }

    @Override // com.google.common.collect.t0
    public Set d() {
        Set set = this.f12043a;
        if (set != null) {
            return set;
        }
        Set setJ = j();
        this.f12043a = setJ;
        return setJ;
    }

    public boolean equals(Object obj) {
        return Tables.a(this, obj);
    }

    public abstract Iterator h();

    public int hashCode() {
        return d().hashCode();
    }

    public abstract void i();

    public Set j() {
        return new a();
    }

    public String toString() {
        return g().toString();
    }
}
