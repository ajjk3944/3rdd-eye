package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableCollection;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient Object[] f11747a;

    /* renamed from: b, reason: collision with root package name */
    public transient Object[] f11748b;

    /* renamed from: c, reason: collision with root package name */
    public transient int f11749c;

    /* renamed from: d, reason: collision with root package name */
    public transient int f11750d;

    /* renamed from: e, reason: collision with root package name */
    public transient int[] f11751e;

    /* renamed from: f, reason: collision with root package name */
    public transient int[] f11752f;

    /* renamed from: g, reason: collision with root package name */
    public transient int[] f11753g;

    /* renamed from: h, reason: collision with root package name */
    public transient int[] f11754h;

    /* renamed from: i, reason: collision with root package name */
    public transient int f11755i;

    /* renamed from: j, reason: collision with root package name */
    public transient int f11756j;

    /* renamed from: k, reason: collision with root package name */
    public transient int[] f11757k;

    /* renamed from: l, reason: collision with root package name */
    public transient int[] f11758l;

    /* renamed from: m, reason: collision with root package name */
    public transient Set f11759m;

    /* renamed from: n, reason: collision with root package name */
    public transient Set f11760n;

    /* renamed from: o, reason: collision with root package name */
    public transient Set f11761o;

    /* renamed from: p, reason: collision with root package name */
    public transient i f11762p;

    public static class Inverse<K, V> extends AbstractMap<V, K> implements i, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public transient Set f11763a;
        private final HashBiMap<K, V> forward;

        public Inverse(HashBiMap hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.forward.f11762p = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Set values() {
            return this.forward.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f11763a;
            if (set != null) {
                return set;
            }
            d dVar = new d(this.forward);
            this.f11763a = dVar;
            return dVar;
        }

        @Override // com.google.common.collect.i
        public i g() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            return this.forward.s(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.forward.y(obj, obj2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            return this.forward.D(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.f11749c;
        }
    }

    public final class a extends com.google.common.collect.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11764a;

        /* renamed from: b, reason: collision with root package name */
        public int f11765b;

        public a(int i10) {
            this.f11764a = f0.a(HashBiMap.this.f11747a[i10]);
            this.f11765b = i10;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.f11764a;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            j();
            int i10 = this.f11765b;
            return i10 == -1 ? f0.b() : f0.a(HashBiMap.this.f11748b[i10]);
        }

        public void j() {
            int i10 = this.f11765b;
            if (i10 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i10 <= hashBiMap.f11749c && com.google.common.base.f.a(hashBiMap.f11747a[i10], this.f11764a)) {
                    return;
                }
            }
            this.f11765b = HashBiMap.this.o(this.f11764a);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object setValue(Object obj) {
            j();
            int i10 = this.f11765b;
            if (i10 == -1) {
                HashBiMap.this.put(this.f11764a, obj);
                return f0.b();
            }
            Object objA = f0.a(HashBiMap.this.f11748b[i10]);
            if (com.google.common.base.f.a(objA, obj)) {
                return obj;
            }
            HashBiMap.this.F(this.f11765b, obj, false);
            return objA;
        }
    }

    public static final class b extends com.google.common.collect.b {

        /* renamed from: a, reason: collision with root package name */
        public final HashBiMap f11767a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f11768b;

        /* renamed from: c, reason: collision with root package name */
        public int f11769c;

        public b(HashBiMap hashBiMap, int i10) {
            this.f11767a = hashBiMap;
            this.f11768b = f0.a(hashBiMap.f11748b[i10]);
            this.f11769c = i10;
        }

        private void j() {
            int i10 = this.f11769c;
            if (i10 != -1) {
                HashBiMap hashBiMap = this.f11767a;
                if (i10 <= hashBiMap.f11749c && com.google.common.base.f.a(this.f11768b, hashBiMap.f11748b[i10])) {
                    return;
                }
            }
            this.f11769c = this.f11767a.q(this.f11768b);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.f11768b;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            j();
            int i10 = this.f11769c;
            return i10 == -1 ? f0.b() : f0.a(this.f11767a.f11747a[i10]);
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object setValue(Object obj) {
            j();
            int i10 = this.f11769c;
            if (i10 == -1) {
                this.f11767a.y(this.f11768b, obj, false);
                return f0.b();
            }
            Object objA = f0.a(this.f11767a.f11747a[i10]);
            if (com.google.common.base.f.a(objA, obj)) {
                return obj;
            }
            this.f11767a.E(this.f11769c, obj, false);
            return objA;
        }
    }

    public final class c extends g {
        public c() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return new a(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iO = HashBiMap.this.o(key);
                if (iO != -1 && com.google.common.base.f.a(value, HashBiMap.this.f11748b[iO])) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = z.d(key);
            int iP = HashBiMap.this.p(key, iD);
            if (iP == -1 || !com.google.common.base.f.a(value, HashBiMap.this.f11748b[iP])) {
                return false;
            }
            HashBiMap.this.B(iP, iD);
            return true;
        }
    }

    public static class d extends g {
        public d(HashBiMap hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return new b(this.f11773a, i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iQ = this.f11773a.q(key);
                if (iQ != -1 && com.google.common.base.f.a(this.f11773a.f11747a[iQ], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = z.d(key);
            int iR = this.f11773a.r(key, iD);
            if (iR == -1 || !com.google.common.base.f.a(this.f11773a.f11747a[iR], value)) {
                return false;
            }
            this.f11773a.C(iR, iD);
            return true;
        }
    }

    public final class e extends g {
        public e() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        public Object b(int i10) {
            return f0.a(HashBiMap.this.f11747a[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = z.d(obj);
            int iP = HashBiMap.this.p(obj, iD);
            if (iP == -1) {
                return false;
            }
            HashBiMap.this.B(iP, iD);
            return true;
        }
    }

    public final class f extends g {
        public f() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.g
        public Object b(int i10) {
            return f0.a(HashBiMap.this.f11748b[i10]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = z.d(obj);
            int iR = HashBiMap.this.r(obj, iD);
            if (iR == -1) {
                return false;
            }
            HashBiMap.this.C(iR, iD);
            return true;
        }
    }

    public static abstract class g extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        public final HashBiMap f11773a;

        public class a implements Iterator {

            /* renamed from: a, reason: collision with root package name */
            public int f11774a;

            /* renamed from: b, reason: collision with root package name */
            public int f11775b = -1;

            /* renamed from: c, reason: collision with root package name */
            public int f11776c;

            /* renamed from: d, reason: collision with root package name */
            public int f11777d;

            public a() {
                this.f11774a = g.this.f11773a.f11755i;
                HashBiMap hashBiMap = g.this.f11773a;
                this.f11776c = hashBiMap.f11750d;
                this.f11777d = hashBiMap.f11749c;
            }

            public final void a() {
                if (g.this.f11773a.f11750d != this.f11776c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f11774a != -2 && this.f11777d > 0;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objB = g.this.b(this.f11774a);
                this.f11775b = this.f11774a;
                this.f11774a = g.this.f11773a.f11758l[this.f11774a];
                this.f11777d--;
                return objB;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                j.d(this.f11775b != -1);
                g.this.f11773a.z(this.f11775b);
                int i10 = this.f11774a;
                HashBiMap hashBiMap = g.this.f11773a;
                if (i10 == hashBiMap.f11749c) {
                    this.f11774a = this.f11775b;
                }
                this.f11775b = -1;
                this.f11776c = hashBiMap.f11750d;
            }
        }

        public g(HashBiMap hashBiMap) {
            this.f11773a = hashBiMap;
        }

        public abstract Object b(int i10);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f11773a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11773a.f11749c;
        }
    }

    public static int[] i(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static int[] m(int[] iArr, int i10) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
        Arrays.fill(iArrCopyOf, length, i10, -1);
        return iArrCopyOf;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = n0.h(objectInputStream);
        t(16);
        n0.c(this, objectInputStream, iH);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.i(this, objectOutputStream);
    }

    public final void A(int i10, int i11, int i12) {
        com.google.common.base.g.d(i10 != -1);
        j(i10, i11);
        k(i10, i12);
        G(this.f11757k[i10], this.f11758l[i10]);
        w(this.f11749c - 1, i10);
        Object[] objArr = this.f11747a;
        int i13 = this.f11749c;
        objArr[i13 - 1] = null;
        this.f11748b[i13 - 1] = null;
        this.f11749c = i13 - 1;
        this.f11750d++;
    }

    public void B(int i10, int i11) {
        A(i10, i11, z.d(this.f11748b[i10]));
    }

    public void C(int i10, int i11) {
        A(i10, z.d(this.f11747a[i10]), i11);
    }

    public Object D(Object obj) {
        int iD = z.d(obj);
        int iR = r(obj, iD);
        if (iR == -1) {
            return null;
        }
        Object obj2 = this.f11747a[iR];
        C(iR, iD);
        return obj2;
    }

    public final void E(int i10, Object obj, boolean z10) {
        int i11;
        com.google.common.base.g.d(i10 != -1);
        int iD = z.d(obj);
        int iP = p(obj, iD);
        int i12 = this.f11756j;
        if (iP == -1) {
            i11 = -2;
        } else {
            if (!z10) {
                String strValueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 28);
                sb.append("Key already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            i12 = this.f11757k[iP];
            i11 = this.f11758l[iP];
            B(iP, iD);
            if (i10 == this.f11749c) {
                i10 = iP;
            }
        }
        if (i12 == i10) {
            i12 = this.f11757k[i10];
        } else if (i12 == this.f11749c) {
            i12 = iP;
        }
        if (i11 == i10) {
            iP = this.f11758l[i10];
        } else if (i11 != this.f11749c) {
            iP = i11;
        }
        G(this.f11757k[i10], this.f11758l[i10]);
        j(i10, z.d(this.f11747a[i10]));
        this.f11747a[i10] = obj;
        u(i10, z.d(obj));
        G(i12, i10);
        G(i10, iP);
    }

    public final void F(int i10, Object obj, boolean z10) {
        com.google.common.base.g.d(i10 != -1);
        int iD = z.d(obj);
        int iR = r(obj, iD);
        if (iR != -1) {
            if (!z10) {
                String strValueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 30);
                sb.append("Value already present in map: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            C(iR, iD);
            if (i10 == this.f11749c) {
                i10 = iR;
            }
        }
        k(i10, z.d(this.f11748b[i10]));
        this.f11748b[i10] = obj;
        v(i10, iD);
    }

    public final void G(int i10, int i11) {
        if (i10 == -2) {
            this.f11755i = i11;
        } else {
            this.f11758l[i10] = i11;
        }
        if (i11 == -2) {
            this.f11756j = i10;
        } else {
            this.f11757k[i11] = i10;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Set values() {
        Set set = this.f11760n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f11760n = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f11747a, 0, this.f11749c, (Object) null);
        Arrays.fill(this.f11748b, 0, this.f11749c, (Object) null);
        Arrays.fill(this.f11751e, -1);
        Arrays.fill(this.f11752f, -1);
        Arrays.fill(this.f11753g, 0, this.f11749c, -1);
        Arrays.fill(this.f11754h, 0, this.f11749c, -1);
        Arrays.fill(this.f11757k, 0, this.f11749c, -1);
        Arrays.fill(this.f11758l, 0, this.f11749c, -1);
        this.f11749c = 0;
        this.f11755i = -2;
        this.f11756j = -2;
        this.f11750d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return q(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f11761o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f11761o = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.i
    public i g() {
        i iVar = this.f11762p;
        if (iVar != null) {
            return iVar;
        }
        Inverse inverse = new Inverse(this);
        this.f11762p = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int iO = o(obj);
        if (iO == -1) {
            return null;
        }
        return this.f11748b[iO];
    }

    public final int h(int i10) {
        return i10 & (this.f11751e.length - 1);
    }

    public final void j(int i10, int i11) {
        com.google.common.base.g.d(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f11751e;
        int i12 = iArr[iH];
        if (i12 == i10) {
            int[] iArr2 = this.f11753g;
            iArr[iH] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f11753g[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.f11747a[i10]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i12 == i10) {
                int[] iArr3 = this.f11753g;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f11753g[i12];
        }
    }

    public final void k(int i10, int i11) {
        com.google.common.base.g.d(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f11752f;
        int i12 = iArr[iH];
        if (i12 == i10) {
            int[] iArr2 = this.f11754h;
            iArr[iH] = iArr2[i10];
            iArr2[i10] = -1;
            return;
        }
        int i13 = this.f11754h[i12];
        while (true) {
            int i14 = i12;
            i12 = i13;
            if (i12 == -1) {
                String strValueOf = String.valueOf(this.f11748b[i10]);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
            }
            if (i12 == i10) {
                int[] iArr3 = this.f11754h;
                iArr3[i14] = iArr3[i10];
                iArr3[i10] = -1;
                return;
            }
            i13 = this.f11754h[i12];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f11759m;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.f11759m = eVar;
        return eVar;
    }

    public final void l(int i10) {
        int[] iArr = this.f11753g;
        if (iArr.length < i10) {
            int iA = ImmutableCollection.b.a(iArr.length, i10);
            this.f11747a = Arrays.copyOf(this.f11747a, iA);
            this.f11748b = Arrays.copyOf(this.f11748b, iA);
            this.f11753g = m(this.f11753g, iA);
            this.f11754h = m(this.f11754h, iA);
            this.f11757k = m(this.f11757k, iA);
            this.f11758l = m(this.f11758l, iA);
        }
        if (this.f11751e.length < i10) {
            int iA2 = z.a(i10, 1.0d);
            this.f11751e = i(iA2);
            this.f11752f = i(iA2);
            for (int i11 = 0; i11 < this.f11749c; i11++) {
                int iH = h(z.d(this.f11747a[i11]));
                int[] iArr2 = this.f11753g;
                int[] iArr3 = this.f11751e;
                iArr2[i11] = iArr3[iH];
                iArr3[iH] = i11;
                int iH2 = h(z.d(this.f11748b[i11]));
                int[] iArr4 = this.f11754h;
                int[] iArr5 = this.f11752f;
                iArr4[i11] = iArr5[iH2];
                iArr5[iH2] = i11;
            }
        }
    }

    public int n(Object obj, int i10, int[] iArr, int[] iArr2, Object[] objArr) {
        int i11 = iArr[h(i10)];
        while (i11 != -1) {
            if (com.google.common.base.f.a(objArr[i11], obj)) {
                return i11;
            }
            i11 = iArr2[i11];
        }
        return -1;
    }

    public int o(Object obj) {
        return p(obj, z.d(obj));
    }

    public int p(Object obj, int i10) {
        return n(obj, i10, this.f11751e, this.f11753g, this.f11747a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return x(obj, obj2, false);
    }

    public int q(Object obj) {
        return r(obj, z.d(obj));
    }

    public int r(Object obj, int i10) {
        return n(obj, i10, this.f11752f, this.f11754h, this.f11748b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int iD = z.d(obj);
        int iP = p(obj, iD);
        if (iP == -1) {
            return null;
        }
        Object obj2 = this.f11748b[iP];
        B(iP, iD);
        return obj2;
    }

    public Object s(Object obj) {
        int iQ = q(obj);
        if (iQ == -1) {
            return null;
        }
        return this.f11747a[iQ];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11749c;
    }

    public void t(int i10) {
        j.b(i10, "expectedSize");
        int iA = z.a(i10, 1.0d);
        this.f11749c = 0;
        this.f11747a = new Object[i10];
        this.f11748b = new Object[i10];
        this.f11751e = i(iA);
        this.f11752f = i(iA);
        this.f11753g = i(i10);
        this.f11754h = i(i10);
        this.f11755i = -2;
        this.f11756j = -2;
        this.f11757k = i(i10);
        this.f11758l = i(i10);
    }

    public final void u(int i10, int i11) {
        com.google.common.base.g.d(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f11753g;
        int[] iArr2 = this.f11751e;
        iArr[i10] = iArr2[iH];
        iArr2[iH] = i10;
    }

    public final void v(int i10, int i11) {
        com.google.common.base.g.d(i10 != -1);
        int iH = h(i11);
        int[] iArr = this.f11754h;
        int[] iArr2 = this.f11752f;
        iArr[i10] = iArr2[iH];
        iArr2[iH] = i10;
    }

    public final void w(int i10, int i11) {
        int i12;
        int i13;
        if (i10 == i11) {
            return;
        }
        int i14 = this.f11757k[i10];
        int i15 = this.f11758l[i10];
        G(i14, i11);
        G(i11, i15);
        Object[] objArr = this.f11747a;
        Object obj = objArr[i10];
        Object[] objArr2 = this.f11748b;
        Object obj2 = objArr2[i10];
        objArr[i11] = obj;
        objArr2[i11] = obj2;
        int iH = h(z.d(obj));
        int[] iArr = this.f11751e;
        int i16 = iArr[iH];
        if (i16 == i10) {
            iArr[iH] = i11;
        } else {
            int i17 = this.f11753g[i16];
            while (true) {
                i12 = i16;
                i16 = i17;
                if (i16 == i10) {
                    break;
                } else {
                    i17 = this.f11753g[i16];
                }
            }
            this.f11753g[i12] = i11;
        }
        int[] iArr2 = this.f11753g;
        iArr2[i11] = iArr2[i10];
        iArr2[i10] = -1;
        int iH2 = h(z.d(obj2));
        int[] iArr3 = this.f11752f;
        int i18 = iArr3[iH2];
        if (i18 == i10) {
            iArr3[iH2] = i11;
        } else {
            int i19 = this.f11754h[i18];
            while (true) {
                i13 = i18;
                i18 = i19;
                if (i18 == i10) {
                    break;
                } else {
                    i19 = this.f11754h[i18];
                }
            }
            this.f11754h[i13] = i11;
        }
        int[] iArr4 = this.f11754h;
        iArr4[i11] = iArr4[i10];
        iArr4[i10] = -1;
    }

    public Object x(Object obj, Object obj2, boolean z10) {
        int iD = z.d(obj);
        int iP = p(obj, iD);
        if (iP != -1) {
            Object obj3 = this.f11748b[iP];
            if (com.google.common.base.f.a(obj3, obj2)) {
                return obj2;
            }
            F(iP, obj2, z10);
            return obj3;
        }
        int iD2 = z.d(obj2);
        int iR = r(obj2, iD2);
        if (!z10) {
            com.google.common.base.g.i(iR == -1, "Value already present: %s", obj2);
        } else if (iR != -1) {
            C(iR, iD2);
        }
        l(this.f11749c + 1);
        Object[] objArr = this.f11747a;
        int i10 = this.f11749c;
        objArr[i10] = obj;
        this.f11748b[i10] = obj2;
        u(i10, iD);
        v(this.f11749c, iD2);
        G(this.f11756j, this.f11749c);
        G(this.f11749c, -2);
        this.f11749c++;
        this.f11750d++;
        return null;
    }

    public Object y(Object obj, Object obj2, boolean z10) {
        int iD = z.d(obj);
        int iR = r(obj, iD);
        if (iR != -1) {
            Object obj3 = this.f11747a[iR];
            if (com.google.common.base.f.a(obj3, obj2)) {
                return obj2;
            }
            E(iR, obj2, z10);
            return obj3;
        }
        int i10 = this.f11756j;
        int iD2 = z.d(obj2);
        int iP = p(obj2, iD2);
        if (!z10) {
            com.google.common.base.g.i(iP == -1, "Key already present: %s", obj2);
        } else if (iP != -1) {
            i10 = this.f11757k[iP];
            B(iP, iD2);
        }
        l(this.f11749c + 1);
        Object[] objArr = this.f11747a;
        int i11 = this.f11749c;
        objArr[i11] = obj2;
        this.f11748b[i11] = obj;
        u(i11, iD2);
        v(this.f11749c, iD);
        int i12 = i10 == -2 ? this.f11755i : this.f11758l[i10];
        G(i10, this.f11749c);
        G(this.f11749c, i12);
        this.f11749c++;
        this.f11750d++;
        return null;
    }

    public void z(int i10) {
        B(i10, z.d(this.f11747a[i10]));
    }
}
