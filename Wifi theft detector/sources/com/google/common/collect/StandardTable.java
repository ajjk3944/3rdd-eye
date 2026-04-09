package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.t0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class StandardTable<R, C, V> extends g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient Map f11971b;

    @GwtTransient
    final Map<R, Map<C, V>> backingMap;

    @GwtTransient
    final com.google.common.base.j factory;

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f11972a;

        /* renamed from: b, reason: collision with root package name */
        public Map.Entry f11973b;

        /* renamed from: c, reason: collision with root package name */
        public Iterator f11974c;

        public b() {
            this.f11972a = StandardTable.this.backingMap.entrySet().iterator();
            this.f11974c = Iterators.g();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0.a next() {
            if (!this.f11974c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f11972a.next();
                this.f11973b = entry;
                this.f11974c = ((Map) entry.getValue()).entrySet().iterator();
            }
            Objects.requireNonNull(this.f11973b);
            Map.Entry entry2 = (Map.Entry) this.f11974c.next();
            return Tables.b(this.f11973b.getKey(), entry2.getKey(), entry2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11972a.hasNext() || this.f11974c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11974c.remove();
            Map.Entry entry = this.f11973b;
            Objects.requireNonNull(entry);
            if (((Map) entry.getValue()).isEmpty()) {
                this.f11972a.remove();
                this.f11973b = null;
            }
        }
    }

    public class c extends Maps.f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11976a;

        /* renamed from: b, reason: collision with root package name */
        public Map f11977b;

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f11979a;

            public a(Iterator it) {
                this.f11979a = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return c.this.f((Map.Entry) this.f11979a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11979a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11979a.remove();
                c.this.d();
            }
        }

        public class b extends t {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map.Entry f11981a;

            public b(c cVar, Map.Entry entry) {
                this.f11981a = entry;
            }

            @Override // com.google.common.collect.t, java.util.Map.Entry
            public boolean equals(Object obj) {
                return i(obj);
            }

            @Override // com.google.common.collect.v
            public Map.Entry h() {
                return this.f11981a;
            }

            @Override // com.google.common.collect.t, java.util.Map.Entry
            public Object setValue(Object obj) {
                return super.setValue(com.google.common.base.g.m(obj));
            }
        }

        public c(Object obj) {
            this.f11976a = com.google.common.base.g.m(obj);
        }

        @Override // com.google.common.collect.Maps.f
        public Iterator a() {
            e();
            Map map = this.f11977b;
            return map == null ? Iterators.g() : new a(map.entrySet().iterator());
        }

        public Map c() {
            return StandardTable.this.backingMap.get(this.f11976a);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            e();
            Map map = this.f11977b;
            if (map != null) {
                map.clear();
            }
            d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map map;
            e();
            return (obj == null || (map = this.f11977b) == null || !Maps.j(map, obj)) ? false : true;
        }

        public void d() {
            e();
            Map map = this.f11977b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.backingMap.remove(this.f11976a);
            this.f11977b = null;
        }

        public final void e() {
            Map map = this.f11977b;
            if (map == null || (map.isEmpty() && StandardTable.this.backingMap.containsKey(this.f11976a))) {
                this.f11977b = c();
            }
        }

        public Map.Entry f(Map.Entry entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            Map map;
            e();
            if (obj == null || (map = this.f11977b) == null) {
                return null;
            }
            return Maps.k(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            com.google.common.base.g.m(obj);
            com.google.common.base.g.m(obj2);
            Map map = this.f11977b;
            return (map == null || map.isEmpty()) ? StandardTable.this.n(this.f11976a, obj, obj2) : this.f11977b.put(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            e();
            Map map = this.f11977b;
            if (map == null) {
                return null;
            }
            Object objL = Maps.l(map, obj);
            d();
            return objL;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            e();
            Map map = this.f11977b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class d extends Maps.j {

        public class a extends e {

            /* renamed from: com.google.common.collect.StandardTable$d$a$a, reason: collision with other inner class name */
            public class C0218a implements com.google.common.base.c {
                public C0218a() {
                }

                @Override // com.google.common.base.c
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map apply(Object obj) {
                    return StandardTable.this.o(obj);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && k.c(StandardTable.this.backingMap.entrySet(), entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return Maps.a(StandardTable.this.backingMap.keySet(), new C0218a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.backingMap.entrySet().remove(entry)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.backingMap.size();
            }
        }

        public d() {
        }

        @Override // com.google.common.collect.Maps.j
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return StandardTable.this.k(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map get(Object obj) {
            if (!StandardTable.this.k(obj)) {
                return null;
            }
            StandardTable standardTable = StandardTable.this;
            Objects.requireNonNull(obj);
            return standardTable.o(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }
    }

    public abstract class e extends Sets.a {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
    }

    public StandardTable(Map map, com.google.common.base.j jVar) {
        this.backingMap = map;
        this.factory = jVar;
    }

    @Override // com.google.common.collect.g, com.google.common.collect.t0
    public Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.t0
    public Map g() {
        Map map = this.f11971b;
        if (map != null) {
            return map;
        }
        Map mapL = l();
        this.f11971b = mapL;
        return mapL;
    }

    @Override // com.google.common.collect.g
    public Iterator h() {
        return new b();
    }

    @Override // com.google.common.collect.g
    public void i() {
        this.backingMap.clear();
    }

    public boolean k(Object obj) {
        return obj != null && Maps.j(this.backingMap, obj);
    }

    public Map l() {
        return new d();
    }

    public final Map m(Object obj) {
        Map<C, V> map = this.backingMap.get(obj);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.factory.get();
        this.backingMap.put(obj, map2);
        return map2;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        com.google.common.base.g.m(obj);
        com.google.common.base.g.m(obj2);
        com.google.common.base.g.m(obj3);
        return m(obj).put(obj2, obj3);
    }

    public Map o(Object obj) {
        return new c(obj);
    }

    @Override // com.google.common.collect.t0
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }
}
