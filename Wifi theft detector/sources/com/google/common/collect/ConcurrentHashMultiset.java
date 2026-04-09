package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.d;
import com.google.common.collect.e0;
import com.google.common.collect.n0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class ConcurrentHashMultiset<E> extends com.google.common.collect.d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final transient ConcurrentMap f11720c;

    public class a extends x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f11721a;

        public a(ConcurrentHashMultiset concurrentHashMultiset, Set set) {
            this.f11721a = set;
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return obj != null && k.c(this.f11721a, obj);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return j(collection);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return obj != null && k.d(this.f11721a, obj);
        }

        @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return y(collection);
        }

        @Override // com.google.common.collect.q
        public Set x() {
            return this.f11721a;
        }
    }

    public class b extends AbstractIterator {

        /* renamed from: c, reason: collision with root package name */
        public final Iterator f11722c;

        public b() {
            this.f11722c = ConcurrentHashMultiset.this.f11720c.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public e0.a a() {
            while (this.f11722c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f11722c.next();
                int i10 = ((AtomicInteger) entry.getValue()).get();
                if (i10 != 0) {
                    return Multisets.g(entry.getKey(), i10);
                }
            }
            return (e0.a) b();
        }
    }

    public class c extends r {

        /* renamed from: a, reason: collision with root package name */
        public e0.a f11724a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterator f11725b;

        public c(Iterator it) {
            this.f11725b = it;
        }

        @Override // com.google.common.collect.v
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Iterator x() {
            return this.f11725b;
        }

        @Override // com.google.common.collect.r, java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e0.a next() {
            e0.a aVar = (e0.a) super.next();
            this.f11724a = aVar;
            return aVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.g.s(this.f11724a != null, "no calls to next() since the last call to remove()");
            ConcurrentHashMultiset.this.l(this.f11724a.d(), 0);
            this.f11724a = null;
        }
    }

    public class d extends d.b {
        public d() {
            super();
        }

        @Override // com.google.common.collect.d.b, com.google.common.collect.Multisets.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset b() {
            return ConcurrentHashMultiset.this;
        }

        public final List e() {
            ArrayList arrayListI = b0.i(size());
            Iterators.a(arrayListI, iterator());
            return arrayListI;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return e().toArray();
        }

        public /* synthetic */ d(ConcurrentHashMultiset concurrentHashMultiset, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            return e().toArray(objArr);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final n0.b f11728a = n0.a(ConcurrentHashMultiset.class, "countMap");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        e.f11728a.b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f11720c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f11720c.clear();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d
    public Set d() {
        return new a(this, this.f11720c.keySet());
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d
    public Set g() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.d
    public int h() {
        return this.f11720c.size();
    }

    @Override // com.google.common.collect.d
    public Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f11720c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.d
    public Iterator j() {
        return new c(new b());
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public /* bridge */ /* synthetic */ Set k() {
        return super.k();
    }

    @Override // com.google.common.collect.e0
    public int l(Object obj, int i10) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        com.google.common.base.g.m(obj);
        j.b(i10, "count");
        do {
            atomicInteger = (AtomicInteger) Maps.k(this.f11720c, obj);
            if (atomicInteger == null && (i10 == 0 || (atomicInteger = (AtomicInteger) this.f11720c.putIfAbsent(obj, new AtomicInteger(i10))) == null)) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    if (i10 != 0) {
                        atomicInteger2 = new AtomicInteger(i10);
                        if (this.f11720c.putIfAbsent(obj, atomicInteger2) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, i10));
            if (i10 == 0) {
                this.f11720c.remove(obj, atomicInteger);
            }
            return i11;
        } while (!this.f11720c.replace(obj, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public int m(Object obj, int i10) {
        int i11;
        int iMax;
        if (i10 == 0) {
            return r(obj);
        }
        j.c(i10, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.k(this.f11720c, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 == 0) {
                return 0;
            }
            iMax = Math.max(0, i11 - i10);
        } while (!atomicInteger.compareAndSet(i11, iMax));
        if (iMax == 0) {
            this.f11720c.remove(obj, atomicInteger);
        }
        return i11;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public int n(Object obj, int i10) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        com.google.common.base.g.m(obj);
        if (i10 == 0) {
            return r(obj);
        }
        j.c(i10, "occurrences");
        do {
            atomicInteger = (AtomicInteger) Maps.k(this.f11720c, obj);
            if (atomicInteger == null && (atomicInteger = (AtomicInteger) this.f11720c.putIfAbsent(obj, new AtomicInteger(i10))) == null) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    atomicInteger2 = new AtomicInteger(i10);
                    if (this.f11720c.putIfAbsent(obj, atomicInteger2) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("Overflow adding ");
                        sb.append(i10);
                        sb.append(" occurrences to a count of ");
                        sb.append(i11);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, com.google.common.math.b.a(i11, i10)));
            return i11;
        } while (!this.f11720c.replace(obj, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e0
    public boolean p(Object obj, int i10, int i11) {
        com.google.common.base.g.m(obj);
        j.b(i10, "oldCount");
        j.b(i11, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.k(this.f11720c, obj);
        if (atomicInteger == null) {
            if (i10 != 0) {
                return false;
            }
            return i11 == 0 || this.f11720c.putIfAbsent(obj, new AtomicInteger(i11)) == null;
        }
        int i12 = atomicInteger.get();
        if (i12 == i10) {
            if (i12 == 0) {
                if (i11 == 0) {
                    this.f11720c.remove(obj, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i11);
                return this.f11720c.putIfAbsent(obj, atomicInteger2) == null || this.f11720c.replace(obj, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i12, i11)) {
                if (i11 == 0) {
                    this.f11720c.remove(obj, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.e0
    public int r(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.k(this.f11720c, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.e0
    public int size() {
        long j10 = 0;
        while (this.f11720c.values().iterator().hasNext()) {
            j10 += ((AtomicInteger) r0.next()).get();
        }
        return com.google.common.primitives.c.d(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return u().toArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List u() {
        ArrayList arrayListI = b0.i(size());
        for (e0.a aVar : entrySet()) {
            Object objD = aVar.d();
            for (int count = aVar.getCount(); count > 0; count--) {
                arrayListI.add(objD);
            }
        }
        return arrayListI;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return u().toArray(objArr);
    }
}
