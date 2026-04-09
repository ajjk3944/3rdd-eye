package com.yandex.mobile.ads.impl;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class go1<K, V> extends yj0<K, V> {

    /* renamed from: h, reason: collision with root package name */
    static final yj0<Object, Object> f27856h = new go1(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f27857e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f27858f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f27859g;

    public static class a<K, V> extends zj0<Map.Entry<K, V>> {

        /* renamed from: d, reason: collision with root package name */
        private final transient yj0<K, V> f27860d;

        /* renamed from: e, reason: collision with root package name */
        private final transient Object[] f27861e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f27862f = 0;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f27863g;

        /* renamed from: com.yandex.mobile.ads.impl.go1$a$a, reason: collision with other inner class name */
        public class C0405a extends xj0<Map.Entry<K, V>> {
            public C0405a() {
            }

            @Override // com.yandex.mobile.ads.impl.vj0
            public final boolean f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                pj1.a(i, a.this.f27863g);
                a aVar = a.this;
                int i10 = i * 2;
                Object obj = aVar.f27861e[aVar.f27862f + i10];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f27861e[i10 + (aVar2.f27862f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f27863g;
            }
        }

        public a(yj0 yj0Var, Object[] objArr, int i) {
            this.f27860d = yj0Var;
            this.f27861e = objArr;
            this.f27863g = i;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final int a(int i, Object[] objArr) {
            return b().a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f27860d.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.zj0
        public final xj0<Map.Entry<K, V>> g() {
            return new C0405a();
        }

        @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final v72<Map.Entry<K, V>> iterator() {
            return b().listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f27863g;
        }
    }

    public static final class b<K> extends zj0<K> {

        /* renamed from: d, reason: collision with root package name */
        private final transient yj0<K, ?> f27865d;

        /* renamed from: e, reason: collision with root package name */
        private final transient xj0<K> f27866e;

        public b(yj0<K, ?> yj0Var, xj0<K> xj0Var) {
            this.f27865d = yj0Var;
            this.f27866e = xj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final int a(int i, Object[] objArr) {
            return this.f27866e.a(i, objArr);
        }

        @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0
        public final xj0<K> b() {
            return this.f27866e;
        }

        @Override // com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f27865d.get(obj) != null;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.vj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final v72<K> iterator() {
            return this.f27866e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f27865d.size();
        }
    }

    public static final class c extends xj0<Object> {

        /* renamed from: e, reason: collision with root package name */
        private final transient Object[] f27867e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f27868f;

        /* renamed from: g, reason: collision with root package name */
        private final transient int f27869g;

        public c(Object[] objArr, int i, int i10) {
            this.f27867e = objArr;
            this.f27868f = i;
            this.f27869g = i10;
        }

        @Override // com.yandex.mobile.ads.impl.vj0
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            pj1.a(i, this.f27869g);
            Object obj = this.f27867e[(i * 2) + this.f27868f];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f27869g;
        }
    }

    private go1(Object obj, Object[] objArr, int i) {
        this.f27857e = obj;
        this.f27858f = objArr;
        this.f27859g = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r2[r6] = (byte) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r2[r6] = (short) r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        r2[r7] = r3;
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> com.yandex.mobile.ads.impl.go1<K, V> a(int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.go1.a(int, java.lang.Object[]):com.yandex.mobile.ads.impl.go1");
    }

    @Override // com.yandex.mobile.ads.impl.yj0
    public final zj0<Map.Entry<K, V>> b() {
        return new a(this, this.f27858f, this.f27859g);
    }

    @Override // com.yandex.mobile.ads.impl.yj0
    public final zj0<K> c() {
        return new b(this, new c(this.f27858f, 0, this.f27859g));
    }

    @Override // com.yandex.mobile.ads.impl.yj0
    public final vj0<V> d() {
        return new c(this.f27858f, 1, this.f27859g);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[EDGE_INSN: B:43:0x008d->B:35:0x008d BREAK  A[LOOP:0: B:15:0x0036->B:21:0x004c], EDGE_INSN: B:45:0x008d->B:35:0x008d BREAK  A[LOOP:1: B:25:0x0061->B:31:0x0078], EDGE_INSN: B:47:0x008d->B:35:0x008d BREAK  A[LOOP:2: B:33:0x0087->B:42:0x009f]] */
    @Override // com.yandex.mobile.ads.impl.yj0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f27857e
            java.lang.Object[] r1 = r8.f27858f
            int r2 = r8.f27859g
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8d
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8d
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9b
        L21:
            if (r0 != 0) goto L24
            goto L8d
        L24:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.df0.a(r0)
        L36:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            goto L8d
        L3f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L4c:
            int r0 = r0 + 1
            goto L36
        L4f:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7b
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.impl.df0.a(r0)
        L61:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6b
            goto L8d
        L6b:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L78
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L78:
            int r0 = r0 + 1
            goto L61
        L7b:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.yandex.mobile.ads.impl.df0.a(r5)
        L87:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L8f
        L8d:
            r9 = r3
            goto L9b
        L8f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L9f
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9b:
            if (r9 != 0) goto L9e
            return r3
        L9e:
            return r9
        L9f:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.go1.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27859g;
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }
}
