package nq;

import br.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, cr.c {
    public static final f J;
    public int B;
    public int D;
    public int E;
    public g F;
    public h G;
    public g H;
    public boolean I;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f18505a;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f18506d;

    /* renamed from: g, reason: collision with root package name */
    public int[] f18507g;

    /* renamed from: r, reason: collision with root package name */
    public int[] f18508r;

    /* renamed from: x, reason: collision with root package name */
    public int f18509x;

    /* renamed from: y, reason: collision with root package name */
    public int f18510y;

    static {
        f fVar = new f(0);
        fVar.I = true;
        J = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i10 = this.f18509x * 2;
            int length = this.f18508r.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f18508r;
                int i12 = iArr[iJ];
                if (i12 <= 0) {
                    int i13 = this.f18510y;
                    Object[] objArr = this.f18505a;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f18510y = i14;
                        objArr[i13] = obj;
                        this.f18507g[i13] = iJ;
                        iArr[iJ] = i14;
                        this.E++;
                        this.D++;
                        if (i11 > this.f18509x) {
                            this.f18509x = i11;
                        }
                        return i13;
                    }
                    g(1);
                } else {
                    if (l.a(this.f18505a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        k(this.f18508r.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f18508r.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.I = true;
        if (this.E > 0) {
            return this;
        }
        f fVar = J;
        l.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.I) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f18510y - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f18507g;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f18508r[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        xu.l.Q(this.f18505a, 0, this.f18510y);
        Object[] objArr = this.f18506d;
        if (objArr != null) {
            xu.l.Q(objArr, 0, this.f18510y);
        }
        this.E = 0;
        this.f18510y = 0;
        this.D++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z10) {
        int i10;
        Object[] objArr = this.f18506d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f18510y;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f18507g;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f18505a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f18508r[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        xu.l.Q(this.f18505a, i12, i10);
        if (objArr != null) {
            xu.l.Q(objArr, i12, this.f18510y);
        }
        this.f18510y = i12;
    }

    public final boolean e(Collection collection) {
        l.e(collection, "m");
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
        g gVar = this.H;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.H = gVar2;
        return gVar2;
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
        return this.E == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        l.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f18506d;
        l.b(objArr);
        return l.a(objArr[iH], entry.getValue());
    }

    public final void g(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f18505a;
        int length = objArr.length;
        int i11 = this.f18510y;
        int i12 = length - i11;
        int i13 = i11 - this.E;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            l.d(objArrCopyOf2, "copyOf(...)");
            this.f18505a = objArrCopyOf2;
            Object[] objArr2 = this.f18506d;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                l.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f18506d = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f18507g, i15);
            l.d(iArrCopyOf, "copyOf(...)");
            this.f18507g = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f18508r.length) {
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
        Object[] objArr = this.f18506d;
        l.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i10 = this.f18509x;
        while (true) {
            int i11 = this.f18508r[iJ];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l.a(this.f18505a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f18508r.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            int i11 = dVar.f14037a;
            f fVar = (f) dVar.f14040r;
            if (i11 >= fVar.f18510y) {
                throw new NoSuchElementException();
            }
            dVar.f14037a = i11 + 1;
            dVar.f14038d = i11;
            Object obj = fVar.f18505a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f18506d;
            l.b(objArr);
            Object obj2 = objArr[dVar.f14038d];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final int i(Object obj) {
        int i10 = this.f18510y;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f18507g[i10] >= 0) {
                Object[] objArr = this.f18506d;
                l.b(objArr);
                if (l.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.E == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f18507g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.D
            int r0 = r0 + 1
            r5.D = r0
            int r0 = r5.f18510y
            int r1 = r5.E
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f18508r = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.B = r6
        L1c:
            int r6 = r5.f18510y
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f18505a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f18509x
        L2c:
            int[] r3 = r5.f18508r
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f18507g
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
        throw new UnsupportedOperationException("Method not decompiled: nq.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.F;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.F = gVar2;
        return gVar2;
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
            java.lang.Object[] r0 = r11.f18505a
            java.lang.String r1 = "<this>"
            br.l.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f18506d
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f18507g
            r0 = r0[r12]
            int r1 = r11.f18509x
            int r1 = r1 * 2
            int[] r2 = r11.f18508r
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
            int[] r0 = r11.f18508r
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f18509x
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f18508r
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f18508r
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
            java.lang.Object[] r5 = r11.f18505a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f18508r
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f18507g
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f18508r
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f18507g
            r0[r12] = r6
            int r12 = r11.E
            int r12 = r12 + r6
            r11.E = r12
            int r12 = r11.D
            int r12 = r12 + 1
            r11.D = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f18506d;
        if (objArr == null) {
            int length = this.f18505a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f18506d = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f18506d;
            if (objArr == null) {
                int length = this.f18505a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f18506d = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!l.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
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
        Object[] objArr = this.f18506d;
        l.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.E;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.E * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = dVar.f14037a;
            f fVar = (f) dVar.f14040r;
            if (i11 >= fVar.f18510y) {
                throw new NoSuchElementException();
            }
            dVar.f14037a = i11 + 1;
            dVar.f14038d = i11;
            Object obj = fVar.f18505a[i11];
            if (obj == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = fVar.f18506d;
            l.b(objArr);
            Object obj2 = objArr[dVar.f14038d];
            if (obj2 == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.e();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(0, this);
        this.G = hVar2;
        return hVar2;
    }

    public f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f18505a = objArr;
        this.f18506d = null;
        this.f18507g = iArr;
        this.f18508r = new int[iHighestOneBit];
        this.f18509x = 2;
        this.f18510y = 0;
        this.B = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
