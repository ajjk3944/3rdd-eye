package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes2.dex */
public final class f<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final a i = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super K> f23485b;

    /* renamed from: c, reason: collision with root package name */
    public e<K, V> f23486c;

    /* renamed from: d, reason: collision with root package name */
    public int f23487d;

    /* renamed from: e, reason: collision with root package name */
    public int f23488e;

    /* renamed from: f, reason: collision with root package name */
    public final e<K, V> f23489f;

    /* renamed from: g, reason: collision with root package name */
    public f<K, V>.b f23490g;

    /* renamed from: h, reason: collision with root package name */
    public f<K, V>.c f23491h;

    /* compiled from: LinkedTreeMap.java */
    public static class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        public class a extends f<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean contains(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L2d
                com.google.gson.internal.f r0 = com.google.gson.internal.f.this
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r2 = r5.getKey()
                r3 = 0
                if (r2 == 0) goto L15
                com.google.gson.internal.f$e r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L15
                goto L16
            L15:
                r0 = r3
            L16:
                if (r0 == 0) goto L29
                V r2 = r0.f23504h
                java.lang.Object r5 = r5.getValue()
                if (r2 == r5) goto L28
                if (r2 == 0) goto L29
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L29
            L28:
                r3 = r0
            L29:
                if (r3 == 0) goto L2d
                r5 = 1
                return r5
            L2d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.b.contains(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean remove(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                goto L2c
            L6:
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                com.google.gson.internal.f r0 = com.google.gson.internal.f.this
                java.lang.Object r2 = r6.getKey()
                r3 = 0
                if (r2 == 0) goto L16
                com.google.gson.internal.f$e r2 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L16
                goto L17
            L16:
                r2 = r3
            L17:
                if (r2 == 0) goto L2a
                V r4 = r2.f23504h
                java.lang.Object r6 = r6.getValue()
                if (r4 == r6) goto L29
                if (r4 == 0) goto L2a
                boolean r6 = r4.equals(r6)
                if (r6 == 0) goto L2a
            L29:
                r3 = r2
            L2a:
                if (r3 != 0) goto L2d
            L2c:
                return r1
            L2d:
                r6 = 1
                r0.d(r3, r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.f.b.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f.this.f23487d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        public class a extends f<K, V>.d<K> {
            @Override // com.google.gson.internal.f.d, java.util.Iterator
            public final K next() {
                return a().f23503g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return f.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            f fVar = f.this;
            e<K, V> eVarA = null;
            if (obj != null) {
                try {
                    eVarA = fVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarA != null) {
                fVar.d(eVarA, true);
            }
            return eVarA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return f.this.f23487d;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f23494b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f23495c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f23496d;

        public d() {
            this.f23494b = f.this.f23489f.f23501e;
            this.f23496d = f.this.f23488e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f23494b;
            f fVar = f.this;
            if (eVar == fVar.f23489f) {
                throw new NoSuchElementException();
            }
            if (fVar.f23488e != this.f23496d) {
                throw new ConcurrentModificationException();
            }
            this.f23494b = eVar.f23501e;
            this.f23495c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23494b != f.this.f23489f;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f23495c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            f fVar = f.this;
            fVar.d(eVar, true);
            this.f23495c = null;
            this.f23496d = fVar.f23488e;
        }
    }

    public f() {
        a aVar = i;
        this.f23487d = 0;
        this.f23488e = 0;
        this.f23489f = new e<>();
        this.f23485b = aVar;
    }

    public final e<K, V> a(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f23486c;
        a aVar = i;
        Comparator<? super K> comparator = this.f23485b;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f23503g;
                iCompareTo = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f23499c : eVar2.f23500d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f23489f;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f23502f);
            if (iCompareTo < 0) {
                eVar2.f23499c = eVar;
            } else {
                eVar2.f23500d = eVar;
            }
            c(eVar2, true);
        } else {
            if (comparator == aVar && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f23502f);
            this.f23486c = eVar;
        }
        this.f23487d++;
        this.f23488e++;
        return eVar;
    }

    public final void c(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f23499c;
            e<K, V> eVar3 = eVar.f23500d;
            int i10 = eVar2 != null ? eVar2.i : 0;
            int i11 = eVar3 != null ? eVar3.i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f23499c;
                e<K, V> eVar5 = eVar3.f23500d;
                int i13 = (eVar4 != null ? eVar4.i : 0) - (eVar5 != null ? eVar5.i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    f(eVar);
                } else {
                    g(eVar3);
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f23499c;
                e<K, V> eVar7 = eVar2.f23500d;
                int i14 = (eVar6 != null ? eVar6.i : 0) - (eVar7 != null ? eVar7.i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    g(eVar);
                } else {
                    f(eVar2);
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f23498b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f23486c = null;
        this.f23487d = 0;
        this.f23488e++;
        e<K, V> eVar = this.f23489f;
        eVar.f23502f = eVar;
        eVar.f23501e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVarA = null;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVarA != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i10;
        if (z10) {
            e<K, V> eVar4 = eVar.f23502f;
            eVar4.f23501e = eVar.f23501e;
            eVar.f23501e.f23502f = eVar4;
        }
        e<K, V> eVar5 = eVar.f23499c;
        e<K, V> eVar6 = eVar.f23500d;
        e<K, V> eVar7 = eVar.f23498b;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.f23499c = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.f23500d = null;
            } else {
                e(eVar, null);
            }
            c(eVar7, false);
            this.f23487d--;
            this.f23488e++;
            return;
        }
        if (eVar5.i > eVar6.i) {
            e<K, V> eVar8 = eVar5.f23500d;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f23500d;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f23499c;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f23499c;
                }
            }
            eVar3 = eVar2;
        }
        d(eVar3, false);
        e<K, V> eVar11 = eVar.f23499c;
        if (eVar11 != null) {
            i10 = eVar11.i;
            eVar3.f23499c = eVar11;
            eVar11.f23498b = eVar3;
            eVar.f23499c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar12 = eVar.f23500d;
        if (eVar12 != null) {
            i11 = eVar12.i;
            eVar3.f23500d = eVar12;
            eVar12.f23498b = eVar3;
            eVar.f23500d = null;
        }
        eVar3.i = Math.max(i10, i11) + 1;
        e(eVar, eVar3);
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f23498b;
        eVar.f23498b = null;
        if (eVar2 != null) {
            eVar2.f23498b = eVar3;
        }
        if (eVar3 == null) {
            this.f23486c = eVar2;
        } else if (eVar3.f23499c == eVar) {
            eVar3.f23499c = eVar2;
        } else {
            eVar3.f23500d = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        f<K, V>.b bVar = this.f23490g;
        if (bVar != null) {
            return bVar;
        }
        f<K, V>.b bVar2 = new b();
        this.f23490g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23499c;
        e<K, V> eVar3 = eVar.f23500d;
        e<K, V> eVar4 = eVar3.f23499c;
        e<K, V> eVar5 = eVar3.f23500d;
        eVar.f23500d = eVar4;
        if (eVar4 != null) {
            eVar4.f23498b = eVar;
        }
        e(eVar, eVar3);
        eVar3.f23499c = eVar;
        eVar.f23498b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.i : 0, eVar4 != null ? eVar4.i : 0) + 1;
        eVar.i = iMax;
        eVar3.i = Math.max(iMax, eVar5 != null ? eVar5.i : 0) + 1;
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f23499c;
        e<K, V> eVar3 = eVar.f23500d;
        e<K, V> eVar4 = eVar2.f23499c;
        e<K, V> eVar5 = eVar2.f23500d;
        eVar.f23499c = eVar5;
        if (eVar5 != null) {
            eVar5.f23498b = eVar;
        }
        e(eVar, eVar2);
        eVar2.f23500d = eVar;
        eVar.f23498b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.i : 0, eVar5 != null ? eVar5.i : 0) + 1;
        eVar.i = iMax;
        eVar2.i = Math.max(iMax, eVar4 != null ? eVar4.i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            return eVarA.f23504h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        f<K, V>.c cVar = this.f23491h;
        if (cVar != null) {
            return cVar;
        }
        f<K, V>.c cVar2 = new c();
        this.f23491h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarA = a(k10, true);
        V v11 = eVarA.f23504h;
        eVarA.f23504h = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            d(eVarA, true);
        }
        if (eVarA != null) {
            return eVarA.f23504h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23487d;
    }

    /* compiled from: LinkedTreeMap.java */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public e<K, V> f23498b;

        /* renamed from: c, reason: collision with root package name */
        public e<K, V> f23499c;

        /* renamed from: d, reason: collision with root package name */
        public e<K, V> f23500d;

        /* renamed from: e, reason: collision with root package name */
        public e<K, V> f23501e;

        /* renamed from: f, reason: collision with root package name */
        public e<K, V> f23502f;

        /* renamed from: g, reason: collision with root package name */
        public final K f23503g;

        /* renamed from: h, reason: collision with root package name */
        public V f23504h;
        public int i;

        public e() {
            this.f23503g = null;
            this.f23502f = this;
            this.f23501e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f23503g;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f23504h;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f23503g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f23504h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f23503g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f23504h;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f23504h;
            this.f23504h = v10;
            return v11;
        }

        public final String toString() {
            return this.f23503g + "=" + this.f23504h;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f23498b = eVar;
            this.f23503g = k10;
            this.i = 1;
            this.f23501e = eVar2;
            this.f23502f = eVar3;
            eVar3.f23501e = this;
            eVar2.f23502f = this;
        }
    }
}
