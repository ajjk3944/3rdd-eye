package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class yj0<K, V> implements Map<K, V>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private transient zj0<Map.Entry<K, V>> f35835b;

    /* renamed from: c, reason: collision with root package name */
    private transient zj0<K> f35836c;

    /* renamed from: d, reason: collision with root package name */
    private transient vj0<V> f35837d;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f35838a;

        /* renamed from: b, reason: collision with root package name */
        int f35839b;

        public a() {
            this(4);
        }

        public a(int i) {
            this.f35838a = new Object[i * 2];
            this.f35839b = 0;
        }

        public final yj0<K, V> a() {
            return go1.a(this.f35839b, this.f35838a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            int i10 = i * 2;
            Object[] objArr = this.f35838a;
            if (i10 > objArr.length) {
                int length = objArr.length;
                if (i10 >= 0) {
                    int iHighestOneBit = length + (length >> 1) + 1;
                    if (iHighestOneBit < i10) {
                        iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
                    }
                    if (iHighestOneBit < 0) {
                        iHighestOneBit = Integer.MAX_VALUE;
                    }
                    this.f35838a = Arrays.copyOf(objArr, iHighestOneBit);
                    return;
                }
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }

        public final a<K, V> a(K k10, V v10) {
            a(this.f35839b + 1);
            if (k10 == null) {
                throw new NullPointerException("null key in entry: null=" + v10);
            }
            if (v10 != null) {
                Object[] objArr = this.f35838a;
                int i = this.f35839b;
                int i10 = i * 2;
                objArr[i10] = k10;
                objArr[i10 + 1] = v10;
                this.f35839b = i + 1;
                return this;
            }
            throw new NullPointerException("null value in entry: " + k10 + "=null");
        }
    }

    public static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Object[] f35840b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f35841c;

        public b(yj0<K, V> yj0Var) {
            Object[] objArr = new Object[yj0Var.size()];
            Object[] objArr2 = new Object[yj0Var.size()];
            v72<Map.Entry<K, V>> it = yj0Var.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f35840b = objArr;
            this.f35841c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.f35840b;
            if (!(objArr instanceof zj0)) {
                Object[] objArr2 = this.f35841c;
                a aVar = new a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    aVar.a((a) objArr[i], (Object[]) objArr2[i]);
                }
                return go1.a(aVar.f35839b, aVar.f35838a);
            }
            zj0 zj0Var = (zj0) objArr;
            vj0 vj0Var = (vj0) this.f35841c;
            a aVar2 = new a(zj0Var.size());
            Iterator it = zj0Var.iterator();
            v72 it2 = vj0Var.iterator();
            while (it.hasNext()) {
                aVar2.a((a) it.next(), (Object) it2.next());
            }
            return go1.a(aVar2.f35839b, aVar2.f35838a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yj0 a(HashMap map) {
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        a aVar = new a(z10 ? setEntrySet.size() : 4);
        if (z10) {
            aVar.a(setEntrySet.size());
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.a((a) entry.getKey(), entry.getValue());
        }
        return go1.a(aVar.f35839b, aVar.f35838a);
    }

    public static <K, V> yj0<K, V> g() {
        return (yj0<K, V>) go1.f27856h;
    }

    public abstract zj0<Map.Entry<K, V>> b();

    public abstract zj0<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract vj0<V> d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final zj0<Map.Entry<K, V>> entrySet() {
        zj0<Map.Entry<K, V>> zj0Var = this.f35835b;
        if (zj0Var != null) {
            return zj0Var;
        }
        zj0<Map.Entry<K, V>> zj0VarB = b();
        this.f35835b = zj0VarB;
        return zj0VarB;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((zj0) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final zj0<K> keySet() {
        zj0<K> zj0Var = this.f35836c;
        if (zj0Var != null) {
            return zj0Var;
        }
        zj0<K> zj0VarC = c();
        this.f35836c = zj0VarC;
        return zj0VarC;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final vj0<V> values() {
        vj0<V> vj0Var = this.f35837d;
        if (vj0Var != null) {
            return vj0Var;
        }
        vj0<V> vj0VarD = d();
        this.f35837d = vj0VarD;
        return vj0VarD;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return lx1.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        jq.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }
}
