package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map.Entry[] f11790d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    public transient ImmutableSet f11791a;

    /* renamed from: b, reason: collision with root package name */
    public transient ImmutableSet f11792b;

    /* renamed from: c, reason: collision with root package name */
    public transient ImmutableCollection f11793c;

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            v0 it = immutableMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i10] = entry.getKey();
                objArr2[i10] = entry.getValue();
                i10++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public final Object d() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            a aVarE = e(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                aVarE.g(objArr[i10], objArr2[i10]);
            }
            return aVarE.d();
        }

        public a e(int i10) {
            return new a(i10);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return d();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            a aVarE = e(immutableSet.size());
            v0 it = immutableSet.iterator();
            v0 it2 = immutableCollection.iterator();
            while (it.hasNext()) {
                aVarE.g(it.next(), it2.next());
            }
            return aVarE.d();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Comparator f11794a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f11795b;

        /* renamed from: c, reason: collision with root package name */
        public int f11796c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11797d;

        /* renamed from: e, reason: collision with root package name */
        public C0217a f11798e;

        /* renamed from: com.google.common.collect.ImmutableMap$a$a, reason: collision with other inner class name */
        public static final class C0217a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f11799a;

            /* renamed from: b, reason: collision with root package name */
            public final Object f11800b;

            /* renamed from: c, reason: collision with root package name */
            public final Object f11801c;

            public C0217a(Object obj, Object obj2, Object obj3) {
                this.f11799a = obj;
                this.f11800b = obj2;
                this.f11801c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f11799a);
                String strValueOf2 = String.valueOf(this.f11800b);
                String strValueOf3 = String.valueOf(this.f11799a);
                String strValueOf4 = String.valueOf(this.f11801c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        private void e(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f11795b;
            if (i11 > objArr.length) {
                this.f11795b = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i11));
                this.f11797d = false;
            }
        }

        public static void k(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, j0.a(comparator).h(Maps.o()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public ImmutableMap a() {
            return d();
        }

        public final ImmutableMap b(boolean z10) {
            Object[] objArrF;
            C0217a c0217a;
            C0217a c0217a2;
            if (z10 && (c0217a2 = this.f11798e) != null) {
                throw c0217a2.a();
            }
            int length = this.f11796c;
            if (this.f11794a == null) {
                objArrF = this.f11795b;
            } else {
                if (this.f11797d) {
                    this.f11795b = Arrays.copyOf(this.f11795b, length * 2);
                }
                objArrF = this.f11795b;
                if (!z10) {
                    objArrF = f(objArrF, this.f11796c);
                    if (objArrF.length < this.f11795b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f11794a);
            }
            this.f11797d = true;
            RegularImmutableMap regularImmutableMapQ = RegularImmutableMap.q(length, objArrF, this);
            if (!z10 || (c0217a = this.f11798e) == null) {
                return regularImmutableMapQ;
            }
            throw c0217a.a();
        }

        public ImmutableMap c() {
            return b(false);
        }

        public ImmutableMap d() {
            return b(true);
        }

        public final Object[] f(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public a g(Object obj, Object obj2) {
            e(this.f11796c + 1);
            j.a(obj, obj2);
            Object[] objArr = this.f11795b;
            int i10 = this.f11796c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f11796c = i10 + 1;
            return this;
        }

        public a h(Map.Entry entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a i(Iterable iterable) {
            if (iterable instanceof Collection) {
                e(this.f11796c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                h((Map.Entry) it.next());
            }
            return this;
        }

        public a j(Map map) {
            return i(map.entrySet());
        }

        public a(int i10) {
            this.f11795b = new Object[i10 * 2];
            this.f11796c = 0;
            this.f11797d = false;
        }
    }

    public static a d() {
        return new a();
    }

    public static ImmutableMap e(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static ImmutableMap f(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.m()) {
                return immutableMap;
            }
        }
        return e(map.entrySet());
    }

    public static ImmutableMap o() {
        return RegularImmutableMap.f11939h;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.d(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public abstract ImmutableSet h();

    @Override // java.util.Map
    public int hashCode() {
        return Sets.b(entrySet());
    }

    public abstract ImmutableSet i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract ImmutableCollection j();

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.f11791a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetH = h();
        this.f11791a = immutableSetH;
        return immutableSetH;
    }

    public boolean l() {
        return false;
    }

    public abstract boolean m();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.f11792b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetI = i();
        this.f11792b = immutableSetI;
        return immutableSetI;
    }

    @Override // java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.f11793c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection immutableCollectionJ = j();
        this.f11793c = immutableCollectionJ;
        return immutableCollectionJ;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
