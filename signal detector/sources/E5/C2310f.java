package e5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: e5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2310f implements Map, Serializable, r5.c {

    /* renamed from: n, reason: collision with root package name */
    public static final C2310f f19959n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f19960a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f19961b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f19962c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f19963d;

    /* renamed from: e, reason: collision with root package name */
    public int f19964e;

    /* renamed from: f, reason: collision with root package name */
    public int f19965f;

    /* renamed from: g, reason: collision with root package name */
    public int f19966g;

    /* renamed from: h, reason: collision with root package name */
    public int f19967h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C2311g f19968j;

    /* renamed from: k, reason: collision with root package name */
    public C2312h f19969k;

    /* renamed from: l, reason: collision with root package name */
    public C2311g f19970l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19971m;

    static {
        C2310f c2310f = new C2310f(0);
        c2310f.f19971m = true;
        f19959n = c2310f;
    }

    public C2310f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.f19964e * 2;
            int length = this.f19963d.length / 2;
            if (i > length) {
                i = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f19963d;
                int i6 = iArr[iJ];
                if (i6 <= 0) {
                    int i7 = this.f19965f;
                    Object[] objArr = this.f19960a;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.f19965f = i8;
                        objArr[i7] = obj;
                        this.f19962c[i7] = iJ;
                        iArr[iJ] = i8;
                        this.i++;
                        this.f19967h++;
                        if (i3 > this.f19964e) {
                            this.f19964e = i3;
                        }
                        return i7;
                    }
                    g(1);
                } else {
                    if (q5.i.a(this.f19960a[i6 - 1], obj)) {
                        return -i6;
                    }
                    i3++;
                    if (i3 > i) {
                        k(this.f19963d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f19963d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final C2310f b() {
        c();
        this.f19971m = true;
        if (this.i > 0) {
            return this;
        }
        C2310f c2310f = f19959n;
        q5.i.c(c2310f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2310f;
    }

    public final void c() {
        if (this.f19971m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f19965f - 1;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.f19962c;
                int i6 = iArr[i3];
                if (i6 >= 0) {
                    this.f19963d[i6] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        I5.b.w(this.f19960a, 0, this.f19965f);
        Object[] objArr = this.f19961b;
        if (objArr != null) {
            I5.b.w(objArr, 0, this.f19965f);
        }
        this.i = 0;
        this.f19965f = 0;
        this.f19967h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z6) {
        int i;
        Object[] objArr = this.f19961b;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            i = this.f19965f;
            if (i3 >= i) {
                break;
            }
            int[] iArr = this.f19962c;
            int i7 = iArr[i3];
            if (i7 >= 0) {
                Object[] objArr2 = this.f19960a;
                objArr2[i6] = objArr2[i3];
                if (objArr != null) {
                    objArr[i6] = objArr[i3];
                }
                if (z6) {
                    iArr[i6] = i7;
                    this.f19963d[i7] = i6 + 1;
                }
                i6++;
            }
            i3++;
        }
        I5.b.w(this.f19960a, i6, i);
        if (objArr != null) {
            I5.b.w(objArr, i6, this.f19965f);
        }
        this.f19965f = i6;
    }

    public final boolean e(Collection collection) {
        q5.i.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2311g c2311g = this.f19970l;
        if (c2311g != null) {
            return c2311g;
        }
        C2311g c2311g2 = new C2311g(this, 0);
        this.f19970l = c2311g2;
        return c2311g2;
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
        return this.i == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        q5.i.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f19961b;
        q5.i.b(objArr);
        return q5.i.a(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f19960a;
        int length = objArr.length;
        int i3 = this.f19965f;
        int i6 = length - i3;
        int i7 = i3 - this.i;
        if (i6 < i && i6 + i7 >= i && i7 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i8 = i3 + i;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr.length) {
            int length2 = objArr.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            q5.i.d(objArrCopyOf2, "copyOf(...)");
            this.f19960a = objArrCopyOf2;
            Object[] objArr2 = this.f19961b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i9);
                q5.i.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f19961b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f19962c, i9);
            q5.i.d(iArrCopyOf, "copyOf(...)");
            this.f19962c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (iHighestOneBit > this.f19963d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f19961b;
        q5.i.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f19964e;
        while (true) {
            int i3 = this.f19963d[iJ];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i6 = i3 - 1;
                if (q5.i.a(this.f19960a[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f19963d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2308d c2308d = new C2308d(this, 0);
        int i = 0;
        while (c2308d.hasNext()) {
            int i3 = c2308d.f3259a;
            C2310f c2310f = (C2310f) c2308d.f3262d;
            if (i3 >= c2310f.f19965f) {
                throw new NoSuchElementException();
            }
            c2308d.f3259a = i3 + 1;
            c2308d.f3260b = i3;
            Object obj = c2310f.f19960a[i3];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2310f.f19961b;
            q5.i.b(objArr);
            Object obj2 = objArr[c2308d.f3260b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c2308d.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f19965f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f19962c[i] >= 0) {
                Object[] objArr = this.f19961b;
                q5.i.b(objArr);
                if (q5.i.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f19966g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f19962c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f19967h
            int r0 = r0 + 1
            r5.f19967h = r0
            int r0 = r5.f19965f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f19963d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f19966g = r6
        L1c:
            int r6 = r5.f19965f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f19960a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f19964e
        L2c:
            int[] r3 = r5.f19963d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f19962c
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
        throw new UnsupportedOperationException("Method not decompiled: e5.C2310f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2311g c2311g = this.f19968j;
        if (c2311g != null) {
            return c2311g;
        }
        C2311g c2311g2 = new C2311g(this, 1);
        this.f19968j = c2311g2;
        return c2311g2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f19960a
            java.lang.String r1 = "<this>"
            q5.i.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f19961b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f19962c
            r0 = r0[r12]
            int r1 = r11.f19964e
            int r1 = r1 * 2
            int[] r2 = r11.f19963d
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
            int[] r0 = r11.f19963d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f19964e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f19963d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f19963d
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
            java.lang.Object[] r5 = r11.f19960a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f19963d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f19962c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f19963d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f19962c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.f19967h
            int r12 = r12 + 1
            r11.f19967h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.C2310f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f19961b;
        if (objArr == null) {
            int length = this.f19960a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f19961b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        q5.i.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f19961b;
            if (objArr == null) {
                int length = this.f19960a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f19961b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!q5.i.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f19961b;
        q5.i.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        C2308d c2308d = new C2308d(this, 0);
        while (c2308d.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i3 = c2308d.f3259a;
            C2310f c2310f = (C2310f) c2308d.f3262d;
            if (i3 >= c2310f.f19965f) {
                throw new NoSuchElementException();
            }
            c2308d.f3259a = i3 + 1;
            c2308d.f3260b = i3;
            Object obj = c2310f.f19960a[i3];
            if (obj == c2310f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c2310f.f19961b;
            q5.i.b(objArr);
            Object obj2 = objArr[c2308d.f3260b];
            if (obj2 == c2310f) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c2308d.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        q5.i.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C2312h c2312h = this.f19969k;
        if (c2312h != null) {
            return c2312h;
        }
        C2312h c2312h2 = new C2312h(this);
        this.f19969k = c2312h2;
        return c2312h2;
    }

    public C2310f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f19960a = objArr;
        this.f19961b = null;
        this.f19962c = iArr;
        this.f19963d = new int[iHighestOneBit];
        this.f19964e = 2;
        this.f19965f = 0;
        this.f19966g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
