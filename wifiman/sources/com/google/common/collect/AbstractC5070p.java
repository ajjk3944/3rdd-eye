package com.google.common.collect;

import com.google.common.collect.AbstractC5068n;
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

/* renamed from: com.google.common.collect.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5070p implements Map, Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f38395d = new Map.Entry[0];

    /* renamed from: a, reason: collision with root package name */
    private transient r f38396a;

    /* renamed from: b, reason: collision with root package name */
    private transient r f38397b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC5068n f38398c;

    /* renamed from: com.google.common.collect.p$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f38399a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f38400b;

        /* renamed from: c, reason: collision with root package name */
        int f38401c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38402d;

        /* renamed from: e, reason: collision with root package name */
        C1212a f38403e;

        /* renamed from: com.google.common.collect.p$a$a, reason: collision with other inner class name */
        static final class C1212a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f38404a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f38405b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f38406c;

            C1212a(Object obj, Object obj2, Object obj3) {
                this.f38404a = obj;
                this.f38405b = obj2;
                this.f38406c = obj3;
            }

            IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f38404a);
                String strValueOf2 = String.valueOf(this.f38405b);
                String strValueOf3 = String.valueOf(this.f38404a);
                String strValueOf4 = String.valueOf(this.f38406c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(strValueOf);
                sb2.append("=");
                sb2.append(strValueOf2);
                sb2.append(" and ");
                sb2.append(strValueOf3);
                sb2.append("=");
                sb2.append(strValueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        private AbstractC5070p b(boolean z10) {
            Object[] objArrE;
            C1212a c1212a;
            C1212a c1212a2;
            if (z10 && (c1212a2 = this.f38403e) != null) {
                throw c1212a2.a();
            }
            int length = this.f38401c;
            if (this.f38399a == null) {
                objArrE = this.f38400b;
            } else {
                if (this.f38402d) {
                    this.f38400b = Arrays.copyOf(this.f38400b, length * 2);
                }
                objArrE = this.f38400b;
                if (!z10) {
                    objArrE = e(objArrE, this.f38401c);
                    if (objArrE.length < this.f38400b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f38399a);
            }
            this.f38402d = true;
            J jC = J.C(length, objArrE, this);
            if (!z10 || (c1212a = this.f38403e) == null) {
                return jC;
            }
            throw c1212a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f38400b;
            if (i11 > objArr.length) {
                this.f38400b = Arrays.copyOf(objArr, AbstractC5068n.b.a(objArr.length, i11));
                this.f38402d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
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

        static void j(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, G.a(comparator).h(z.d()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public AbstractC5070p a() {
            return c();
        }

        public AbstractC5070p c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f38401c + 1);
            AbstractC5061g.a(obj, obj2);
            Object[] objArr = this.f38400b;
            int i10 = this.f38401c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f38401c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f38401c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        a(int i10) {
            this.f38400b = new Object[i10 * 2];
            this.f38401c = 0;
            this.f38402d = false;
        }
    }

    AbstractC5070p() {
    }

    public static a d() {
        return new a();
    }

    public static AbstractC5070p g(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static AbstractC5070p r() {
        return J.f38324h;
    }

    public static AbstractC5070p s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        AbstractC5061g.a(obj, obj2);
        AbstractC5061g.a(obj3, obj4);
        AbstractC5061g.a(obj5, obj6);
        AbstractC5061g.a(obj7, obj8);
        return J.B(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static AbstractC5070p t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        AbstractC5061g.a(obj, obj2);
        AbstractC5061g.a(obj3, obj4);
        AbstractC5061g.a(obj5, obj6);
        AbstractC5061g.a(obj7, obj8);
        AbstractC5061g.a(obj9, obj10);
        return J.B(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static AbstractC5070p v(Map.Entry... entryArr) {
        return g(Arrays.asList(entryArr));
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
        return z.a(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract r h();

    @Override // java.util.Map
    public int hashCode() {
        return M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract r j();

    abstract AbstractC5068n l();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public r entrySet() {
        r rVar = this.f38396a;
        if (rVar != null) {
            return rVar;
        }
        r rVarH = h();
        this.f38396a = rVarH;
        return rVarH;
    }

    @Override // java.util.Map
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public r keySet() {
        r rVar = this.f38397b;
        if (rVar != null) {
            return rVar;
        }
        r rVarJ = j();
        this.f38397b = rVarJ;
        return rVarJ;
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
        return z.c(this);
    }

    @Override // java.util.Map
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC5068n values() {
        AbstractC5068n abstractC5068n = this.f38398c;
        if (abstractC5068n != null) {
            return abstractC5068n;
        }
        AbstractC5068n abstractC5068nL = l();
        this.f38398c = abstractC5068nL;
        return abstractC5068nL;
    }
}
