package d9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;
import q9.InterfaceC5499a;
import q9.InterfaceC5502d;

/* compiled from: MapBuilder.kt */
/* renamed from: d9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4285c<K, V> implements Map<K, V>, Serializable, InterfaceC5502d {

    /* renamed from: o, reason: collision with root package name */
    public static final C4285c f37552o;

    /* renamed from: b, reason: collision with root package name */
    public K[] f37553b;

    /* renamed from: c, reason: collision with root package name */
    public V[] f37554c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f37555d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f37556e;

    /* renamed from: f, reason: collision with root package name */
    public int f37557f;

    /* renamed from: g, reason: collision with root package name */
    public int f37558g;

    /* renamed from: h, reason: collision with root package name */
    public int f37559h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f37560j;

    /* renamed from: k, reason: collision with root package name */
    public C4287e<K> f37561k;

    /* renamed from: l, reason: collision with root package name */
    public C4288f<V> f37562l;

    /* renamed from: m, reason: collision with root package name */
    public C4286d<K, V> f37563m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37564n;

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$a */
    public static final class a {
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$b */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC5499a {
        @Override // java.util.Iterator
        public final Object next() {
            a();
            int i = this.f37569c;
            C4285c<K, V> c4285c = this.f37568b;
            if (i >= c4285c.f37558g) {
                throw new NoSuchElementException();
            }
            this.f37569c = i + 1;
            this.f37570d = i;
            C0443c c0443c = new C0443c(c4285c, i);
            c();
            return c0443c;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$c, reason: collision with other inner class name */
    public static final class C0443c<K, V> implements Map.Entry<K, V>, InterfaceC5499a {

        /* renamed from: b, reason: collision with root package name */
        public final C4285c<K, V> f37565b;

        /* renamed from: c, reason: collision with root package name */
        public final int f37566c;

        /* renamed from: d, reason: collision with root package name */
        public final int f37567d;

        public C0443c(C4285c<K, V> map, int i) {
            l.f(map, "map");
            this.f37565b = map;
            this.f37566c = i;
            this.f37567d = map.i;
        }

        public final void a() {
            if (this.f37565b.i != this.f37567d) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return l.b(entry.getKey(), getKey()) && l.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            a();
            return this.f37565b.f37553b[this.f37566c];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            a();
            V[] vArr = this.f37565b.f37554c;
            l.c(vArr);
            return vArr[this.f37566c];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            a();
            C4285c<K, V> c4285c = this.f37565b;
            c4285c.d();
            V[] vArr = c4285c.f37554c;
            if (vArr == null) {
                int length = c4285c.f37553b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                c4285c.f37554c = vArr;
            }
            int i = this.f37566c;
            V v11 = vArr[i];
            vArr[i] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$d */
    public static class d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final C4285c<K, V> f37568b;

        /* renamed from: c, reason: collision with root package name */
        public int f37569c;

        /* renamed from: d, reason: collision with root package name */
        public int f37570d;

        /* renamed from: e, reason: collision with root package name */
        public int f37571e;

        public d(C4285c<K, V> map) {
            l.f(map, "map");
            this.f37568b = map;
            this.f37570d = -1;
            this.f37571e = map.i;
            c();
        }

        public final void a() {
            if (this.f37568b.i != this.f37571e) {
                throw new ConcurrentModificationException();
            }
        }

        public final void c() {
            while (true) {
                int i = this.f37569c;
                C4285c<K, V> c4285c = this.f37568b;
                if (i >= c4285c.f37558g || c4285c.f37555d[i] >= 0) {
                    return;
                } else {
                    this.f37569c = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f37569c < this.f37568b.f37558g;
        }

        public final void remove() {
            a();
            if (this.f37570d == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            C4285c<K, V> c4285c = this.f37568b;
            c4285c.d();
            c4285c.n(this.f37570d);
            this.f37570d = -1;
            this.f37571e = c4285c.i;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$e */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC5499a {
        @Override // java.util.Iterator
        public final K next() {
            a();
            int i = this.f37569c;
            C4285c<K, V> c4285c = this.f37568b;
            if (i >= c4285c.f37558g) {
                throw new NoSuchElementException();
            }
            this.f37569c = i + 1;
            this.f37570d = i;
            K k10 = c4285c.f37553b[i];
            c();
            return k10;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: d9.c$f */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC5499a {
        @Override // java.util.Iterator
        public final V next() {
            a();
            int i = this.f37569c;
            C4285c<K, V> c4285c = this.f37568b;
            if (i >= c4285c.f37558g) {
                throw new NoSuchElementException();
            }
            this.f37569c = i + 1;
            this.f37570d = i;
            V[] vArr = c4285c.f37554c;
            l.c(vArr);
            V v10 = vArr[this.f37570d];
            c();
            return v10;
        }
    }

    static {
        C4285c c4285c = new C4285c(0);
        c4285c.f37564n = true;
        f37552o = c4285c;
    }

    public C4285c() {
        this(8);
    }

    public final int a(K k10) {
        d();
        while (true) {
            int iL = l(k10);
            int i = this.f37557f * 2;
            int length = this.f37556e.length / 2;
            if (i > length) {
                i = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f37556e;
                int i11 = iArr[iL];
                if (i11 <= 0) {
                    int i12 = this.f37558g;
                    K[] kArr = this.f37553b;
                    if (i12 < kArr.length) {
                        int i13 = i12 + 1;
                        this.f37558g = i13;
                        kArr[i12] = k10;
                        this.f37555d[i12] = iL;
                        iArr[iL] = i13;
                        this.f37560j++;
                        this.i++;
                        if (i10 > this.f37557f) {
                            this.f37557f = i10;
                        }
                        return i12;
                    }
                    h(1);
                } else {
                    if (l.b(this.f37553b[i11 - 1], k10)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i) {
                        m(this.f37556e.length * 2);
                        break;
                    }
                    iL = iL == 0 ? this.f37556e.length - 1 : iL - 1;
                }
            }
        }
    }

    public final C4285c c() {
        d();
        this.f37564n = true;
        if (this.f37560j > 0) {
            return this;
        }
        C4285c c4285c = f37552o;
        l.d(c4285c, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c4285c;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i = this.f37558g - 1;
        if (i >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f37555d;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f37556e[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        com.google.gson.internal.c.w(this.f37553b, 0, this.f37558g);
        V[] vArr = this.f37554c;
        if (vArr != null) {
            com.google.gson.internal.c.w(vArr, 0, this.f37558g);
        }
        this.f37560j = 0;
        this.f37558g = 0;
        this.i++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public final void d() {
        if (this.f37564n) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z10) {
        int i;
        V[] vArr = this.f37554c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = this.f37558g;
            if (i10 >= i) {
                break;
            }
            int[] iArr = this.f37555d;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                K[] kArr = this.f37553b;
                kArr[i11] = kArr[i10];
                if (vArr != null) {
                    vArr[i11] = vArr[i10];
                }
                if (z10) {
                    iArr[i11] = i12;
                    this.f37556e[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        com.google.gson.internal.c.w(this.f37553b, i11, i);
        if (vArr != null) {
            com.google.gson.internal.c.w(vArr, i11, this.f37558g);
        }
        this.f37558g = i11;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C4286d<K, V> c4286d = this.f37563m;
        if (c4286d != null) {
            return c4286d;
        }
        C4286d<K, V> c4286d2 = new C4286d<>(this);
        this.f37563m = c4286d2;
        return c4286d2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f37560j == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection<?> m10) {
        l.f(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        V[] vArr = this.f37554c;
        l.c(vArr);
        return l.b(vArr[iJ], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        V[] vArr = this.f37554c;
        l.c(vArr);
        return vArr[iJ];
    }

    public final void h(int i) {
        V[] vArr;
        K[] kArr = this.f37553b;
        int length = kArr.length;
        int i10 = this.f37558g;
        int i11 = length - i10;
        int i12 = i10 - this.f37560j;
        if (i11 < i && i11 + i12 >= i && i12 >= kArr.length / 4) {
            e(true);
            return;
        }
        int i13 = i10 + i;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > kArr.length) {
            int length2 = kArr.length;
            int i14 = length2 + (length2 >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            if (i14 - 2147483639 > 0) {
                i14 = i13 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, i14);
            l.e(kArr2, "copyOf(...)");
            this.f37553b = kArr2;
            V[] vArr2 = this.f37554c;
            if (vArr2 != null) {
                vArr = (V[]) Arrays.copyOf(vArr2, i14);
                l.e(vArr, "copyOf(...)");
            } else {
                vArr = null;
            }
            this.f37554c = vArr;
            int[] iArrCopyOf = Arrays.copyOf(this.f37555d, i14);
            l.e(iArrCopyOf, "copyOf(...)");
            this.f37555d = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i14 >= 1 ? i14 : 1) * 3);
            if (iHighestOneBit > this.f37556e.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i10 = bVar.f37569c;
            C4285c<K, V> c4285c = bVar.f37568b;
            if (i10 >= c4285c.f37558g) {
                throw new NoSuchElementException();
            }
            bVar.f37569c = i10 + 1;
            bVar.f37570d = i10;
            K k10 = c4285c.f37553b[i10];
            int iHashCode = k10 != null ? k10.hashCode() : 0;
            V[] vArr = c4285c.f37554c;
            l.c(vArr);
            V v10 = vArr[bVar.f37570d];
            int iHashCode2 = v10 != null ? v10.hashCode() : 0;
            bVar.c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f37560j == 0;
    }

    public final int j(K k10) {
        int iL = l(k10);
        int i = this.f37557f;
        while (true) {
            int i10 = this.f37556e[iL];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (l.b(this.f37553b[i11], k10)) {
                    return i11;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iL = iL == 0 ? this.f37556e.length - 1 : iL - 1;
        }
    }

    public final int k(V v10) {
        int i = this.f37558g;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f37555d[i] >= 0) {
                V[] vArr = this.f37554c;
                l.c(vArr);
                if (l.b(vArr[i], v10)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C4287e<K> c4287e = this.f37561k;
        if (c4287e != null) {
            return c4287e;
        }
        C4287e<K> c4287e2 = new C4287e<>(this);
        this.f37561k = c4287e2;
        return c4287e2;
    }

    public final int l(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f37559h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f37555d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r6) {
        /*
            r5 = this;
            int r0 = r5.i
            int r0 = r0 + 1
            r5.i = r0
            int r0 = r5.f37558g
            int r1 = r5.f37560j
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f37556e = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f37559h = r6
        L1c:
            int r6 = r5.f37558g
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            K[] r0 = r5.f37553b
            r0 = r0[r2]
            int r0 = r5.l(r0)
            int r1 = r5.f37557f
        L2c:
            int[] r3 = r5.f37556e
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f37555d
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.C4285c.m(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f37553b
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.l.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            V[] r0 = r11.f37554c
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f37555d
            r0 = r0[r12]
            int r1 = r11.f37557f
            int r1 = r1 * 2
            int[] r2 = r11.f37556e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f37556e
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f37557f
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f37556e
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f37556e
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            K[] r5 = r11.f37553b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.l(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f37556e
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f37555d
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f37556e
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f37555d
            r0[r12] = r6
            int r12 = r11.f37560j
            int r12 = r12 + r6
            r11.f37560j = r12
            int r12 = r11.i
            int r12 = r12 + 1
            r11.i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.C4285c.n(int):void");
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        d();
        int iA = a(k10);
        V[] vArr = this.f37554c;
        if (vArr == null) {
            int length = this.f37553b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            vArr = (V[]) new Object[length];
            this.f37554c = vArr;
        }
        if (iA >= 0) {
            vArr[iA] = v10;
            return null;
        }
        int i = (-iA) - 1;
        V v11 = vArr[i];
        vArr[i] = v10;
        return v11;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> from) {
        l.f(from, "from");
        d();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            V[] vArr = this.f37554c;
            if (vArr == null) {
                int length = this.f37553b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                vArr = (V[]) new Object[length];
                this.f37554c = vArr;
            }
            if (iA >= 0) {
                vArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!l.b(entry.getValue(), vArr[i])) {
                    vArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        d();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        V[] vArr = this.f37554c;
        l.c(vArr);
        V v10 = vArr[iJ];
        n(iJ);
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f37560j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f37560j * 3) + 2);
        sb.append("{");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i10 = bVar.f37569c;
            C4285c<K, V> c4285c = bVar.f37568b;
            if (i10 >= c4285c.f37558g) {
                throw new NoSuchElementException();
            }
            bVar.f37569c = i10 + 1;
            bVar.f37570d = i10;
            K k10 = c4285c.f37553b[i10];
            if (k10 == c4285c) {
                sb.append("(this Map)");
            } else {
                sb.append(k10);
            }
            sb.append('=');
            V[] vArr = c4285c.f37554c;
            l.c(vArr);
            V v10 = vArr[bVar.f37570d];
            if (v10 == c4285c) {
                sb.append("(this Map)");
            } else {
                sb.append(v10);
            }
            bVar.c();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        l.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C4288f<V> c4288f = this.f37562l;
        if (c4288f != null) {
            return c4288f;
        }
        C4288f<V> c4288f2 = new C4288f<>(this);
        this.f37562l = c4288f2;
        return c4288f2;
    }

    public C4285c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f37553b = kArr;
        this.f37554c = null;
        this.f37555d = iArr;
        this.f37556e = new int[iHighestOneBit];
        this.f37557f = 2;
        this.f37558g = 0;
        this.f37559h = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
