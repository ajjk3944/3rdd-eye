package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractBiMap<K, V> extends s implements i, Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public transient Map f11598a;

    /* renamed from: b, reason: collision with root package name */
    public transient AbstractBiMap f11599b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f11600c;

    /* renamed from: d, reason: collision with root package name */
    public transient Set f11601d;

    /* renamed from: e, reason: collision with root package name */
    public transient Set f11602e;

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {

        @GwtIncompatible
        private static final long serialVersionUID = 0;

        public Inverse(Map map, AbstractBiMap abstractBiMap) {
            super(map, abstractBiMap, null);
        }

        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            D((AbstractBiMap) objectInputStream.readObject());
        }

        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(g());
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.v
        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object x() {
            return super.x();
        }

        @GwtIncompatible
        public Object readResolve() {
            return g().g();
        }

        @Override // com.google.common.collect.AbstractBiMap
        public Object v(Object obj) {
            return this.f11599b.w(obj);
        }

        @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.s, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.AbstractBiMap
        public Object w(Object obj) {
            return this.f11599b.v(obj);
        }
    }

    public class a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public Map.Entry f11603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f11604b;

        public a(Iterator it) {
            this.f11604b = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f11604b.next();
            this.f11603a = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11604b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry entry = this.f11603a;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            Object value = entry.getValue();
            this.f11604b.remove();
            AbstractBiMap.this.B(value);
            this.f11603a = null;
        }
    }

    public class b extends t {

        /* renamed from: a, reason: collision with root package name */
        public final Map.Entry f11606a;

        public b(Map.Entry entry) {
            this.f11606a = entry;
        }

        @Override // com.google.common.collect.v
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map.Entry x() {
            return this.f11606a;
        }

        @Override // com.google.common.collect.t, java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractBiMap.this.w(obj);
            com.google.common.base.g.s(AbstractBiMap.this.entrySet().contains(this), "entry no longer in map");
            if (com.google.common.base.f.a(obj, getValue())) {
                return obj;
            }
            com.google.common.base.g.i(!AbstractBiMap.this.containsValue(obj), "value already present: %s", obj);
            Object value = this.f11606a.setValue(obj);
            com.google.common.base.g.s(com.google.common.base.f.a(obj, AbstractBiMap.this.get(getKey())), "entry no longer in map");
            AbstractBiMap.this.E(getKey(), true, value, obj);
            return value;
        }
    }

    public class c extends x {

        /* renamed from: a, reason: collision with root package name */
        public final Set f11608a;

        public c() {
            this.f11608a = AbstractBiMap.this.f11598a.entrySet();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return Maps.c(x(), obj);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return j(collection);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return AbstractBiMap.this.x();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!this.f11608a.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            AbstractBiMap.this.f11599b.f11598a.remove(entry.getValue());
            this.f11608a.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return y(collection);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return s(collection);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return u();
        }

        @Override // com.google.common.collect.q
        public Set x() {
            return this.f11608a;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return v(objArr);
        }

        public /* synthetic */ c(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }
    }

    public class d extends x {
        public d() {
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public void clear() {
            AbstractBiMap.this.clear();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Maps.g(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.A(obj);
            return true;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return y(collection);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return s(collection);
        }

        @Override // com.google.common.collect.q
        public Set x() {
            return AbstractBiMap.this.f11598a.keySet();
        }

        public /* synthetic */ d(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }
    }

    public class e extends x {

        /* renamed from: a, reason: collision with root package name */
        public final Set f11611a;

        public e() {
            this.f11611a = AbstractBiMap.this.f11599b.keySet();
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Maps.p(AbstractBiMap.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return u();
        }

        @Override // com.google.common.collect.v
        public String toString() {
            return w();
        }

        @Override // com.google.common.collect.q
        public Set x() {
            return this.f11611a;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return v(objArr);
        }

        public /* synthetic */ e(AbstractBiMap abstractBiMap, a aVar) {
            this();
        }
    }

    public /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, a aVar) {
        this(map, abstractBiMap);
    }

    public final Object A(Object obj) {
        Object objA = f0.a(this.f11598a.remove(obj));
        B(objA);
        return objA;
    }

    public final void B(Object obj) {
        this.f11599b.f11598a.remove(obj);
    }

    public void C(Map map, Map map2) {
        com.google.common.base.g.r(this.f11598a == null);
        com.google.common.base.g.r(this.f11599b == null);
        com.google.common.base.g.d(map.isEmpty());
        com.google.common.base.g.d(map2.isEmpty());
        com.google.common.base.g.d(map != map2);
        this.f11598a = map;
        this.f11599b = y(map2);
    }

    public void D(AbstractBiMap abstractBiMap) {
        this.f11599b = abstractBiMap;
    }

    public final void E(Object obj, boolean z10, Object obj2, Object obj3) {
        if (z10) {
            B(f0.a(obj2));
        }
        this.f11599b.f11598a.put(obj3, obj);
    }

    @Override // com.google.common.collect.s, java.util.Map
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public Set values() {
        Set set = this.f11601d;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.f11601d = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.s, java.util.Map
    public void clear() {
        this.f11598a.clear();
        this.f11599b.f11598a.clear();
    }

    @Override // com.google.common.collect.s, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f11599b.containsKey(obj);
    }

    @Override // com.google.common.collect.s, java.util.Map
    public Set entrySet() {
        Set set = this.f11602e;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.f11602e = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.i
    public i g() {
        return this.f11599b;
    }

    @Override // com.google.common.collect.v
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Map x() {
        return this.f11598a;
    }

    @Override // com.google.common.collect.s, java.util.Map
    public Set keySet() {
        Set set = this.f11600c;
        if (set != null) {
            return set;
        }
        d dVar = new d(this, null);
        this.f11600c = dVar;
        return dVar;
    }

    @Override // com.google.common.collect.s, java.util.Map
    public Object put(Object obj, Object obj2) {
        return z(obj, obj2, false);
    }

    @Override // com.google.common.collect.s, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.s, java.util.Map
    public Object remove(Object obj) {
        if (containsKey(obj)) {
            return A(obj);
        }
        return null;
    }

    public abstract Object v(Object obj);

    public Object w(Object obj) {
        return obj;
    }

    public Iterator x() {
        return new a(this.f11598a.entrySet().iterator());
    }

    public AbstractBiMap y(Map map) {
        return new Inverse(map, this);
    }

    public final Object z(Object obj, Object obj2, boolean z10) {
        v(obj);
        w(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && com.google.common.base.f.a(obj2, get(obj))) {
            return obj2;
        }
        if (z10) {
            g().remove(obj2);
        } else {
            com.google.common.base.g.i(!containsValue(obj2), "value already present: %s", obj2);
        }
        Object objPut = this.f11598a.put(obj, obj2);
        E(obj, zContainsKey, objPut, obj2);
        return objPut;
    }

    public AbstractBiMap(Map map, AbstractBiMap abstractBiMap) {
        this.f11598a = map;
        this.f11599b = abstractBiMap;
    }
}
