package ak;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import nk.k;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements Map, Serializable, ok.d {

    /* renamed from: n, reason: collision with root package name */
    public static final g f447n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f448a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f449b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f450c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f451d;

    /* renamed from: e, reason: collision with root package name */
    public int f452e;

    /* renamed from: f, reason: collision with root package name */
    public int f453f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f454h;

    /* renamed from: i, reason: collision with root package name */
    public int f455i;
    public h j;

    /* renamed from: k, reason: collision with root package name */
    public i f456k;

    /* renamed from: l, reason: collision with root package name */
    public h f457l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f458m;

    static {
        g gVar = new g(0);
        gVar.f458m = true;
        f447n = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i4 = this.f452e * 2;
            int length = this.f451d.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f451d;
                int i11 = iArr[iJ];
                if (i11 <= 0) {
                    int i12 = this.f453f;
                    Object[] objArr = this.f448a;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f453f = i13;
                        objArr[i12] = obj;
                        this.f450c[i12] = iJ;
                        iArr[iJ] = i13;
                        this.f455i++;
                        this.f454h++;
                        if (i10 > this.f452e) {
                            this.f452e = i10;
                        }
                        return i12;
                    }
                    g(1);
                } else {
                    if (k.a(this.f448a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i4) {
                        k(this.f451d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f451d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final g b() {
        c();
        this.f458m = true;
        if (this.f455i > 0) {
            return this;
        }
        g gVar = f447n;
        k.c(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void c() {
        if (this.f458m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i4 = this.f453f - 1;
        if (i4 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f450c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f451d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i4) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        i0.u(this.f448a, 0, this.f453f);
        Object[] objArr = this.f449b;
        if (objArr != null) {
            i0.u(objArr, 0, this.f453f);
        }
        this.f455i = 0;
        this.f453f = 0;
        this.f454h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z3) {
        int i4;
        Object[] objArr = this.f449b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i4 = this.f453f;
            if (i10 >= i4) {
                break;
            }
            int[] iArr = this.f450c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f448a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z3) {
                    iArr[i11] = i12;
                    this.f451d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        i0.u(this.f448a, i11, i4);
        if (objArr != null) {
            i0.u(objArr, i11, this.f453f);
        }
        this.f453f = i11;
    }

    public final boolean e(Collection collection) {
        k.e(collection, "m");
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
        h hVar = this.f457l;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f457l = hVar2;
        return hVar2;
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
        return this.f455i == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        k.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f449b;
        k.b(objArr);
        return k.a(objArr[iH], entry.getValue());
    }

    public final void g(int i4) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f448a;
        int length = objArr.length;
        int i10 = this.f453f;
        int i11 = length - i10;
        int i12 = i10 - this.f455i;
        if (i11 < i4 && i11 + i12 >= i4 && i12 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i4;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            zj.b bVar = zj.e.Companion;
            int length2 = objArr.length;
            bVar.getClass();
            int iD = zj.b.d(length2, i13);
            Object[] objArr2 = this.f448a;
            k.e(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iD);
            k.d(objArrCopyOf2, "copyOf(...)");
            this.f448a = objArrCopyOf2;
            Object[] objArr3 = this.f449b;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iD);
                k.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f449b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f450c, iD);
            k.d(iArrCopyOf, "copyOf(...)");
            this.f450c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iD >= 1 ? iD : 1) * 3);
            if (iHighestOneBit > this.f451d.length) {
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
        Object[] objArr = this.f449b;
        k.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i4 = this.f452e;
        while (true) {
            int i10 = this.f451d[iJ];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (k.a(this.f448a[i11], obj)) {
                    return i11;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f451d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i4 = 0;
        while (dVar.hasNext()) {
            int i10 = dVar.f443a;
            g gVar = (g) dVar.f446d;
            if (i10 >= gVar.f453f) {
                throw new NoSuchElementException();
            }
            dVar.f443a = i10 + 1;
            dVar.f444b = i10;
            Object obj = gVar.f448a[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f449b;
            k.b(objArr);
            Object obj2 = objArr[dVar.f444b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i4 += iHashCode ^ iHashCode2;
        }
        return i4;
    }

    public final int i(Object obj) {
        int i4 = this.f453f;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.f450c[i4] >= 0) {
                Object[] objArr = this.f449b;
                k.b(objArr);
                if (k.a(objArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f455i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f450c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f454h
            int r0 = r0 + 1
            r5.f454h = r0
            int r0 = r5.f453f
            int r1 = r5.f455i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f451d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.g = r6
        L1c:
            int r6 = r5.f453f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f448a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f452e
        L2c:
            int[] r3 = r5.f451d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f450c
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
        throw new UnsupportedOperationException("Method not decompiled: ak.g.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.j;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.j = hVar2;
        return hVar2;
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
            java.lang.Object[] r0 = r11.f448a
            java.lang.String r1 = "<this>"
            nk.k.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f449b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f450c
            r0 = r0[r12]
            int r1 = r11.f452e
            int r1 = r1 * 2
            int[] r2 = r11.f451d
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
            int[] r0 = r11.f451d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f452e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f451d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f451d
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
            java.lang.Object[] r5 = r11.f448a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f451d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f450c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f451d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f450c
            r0[r12] = r6
            int r12 = r11.f455i
            int r12 = r12 + r6
            r11.f455i = r12
            int r12 = r11.f454h
            int r12 = r12 + 1
            r11.f454h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.g.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f449b;
        if (objArr == null) {
            int length = this.f448a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f449b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i4 = (-iA) - 1;
        Object obj3 = objArr[i4];
        objArr[i4] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f449b;
            if (objArr == null) {
                int length = this.f448a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f449b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i4 = (-iA) - 1;
                if (!k.a(entry.getValue(), objArr[i4])) {
                    objArr[i4] = entry.getValue();
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
        Object[] objArr = this.f449b;
        k.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f455i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f455i * 3) + 2);
        sb2.append("{");
        int i4 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            int i10 = dVar.f443a;
            g gVar = (g) dVar.f446d;
            if (i10 >= gVar.f453f) {
                throw new NoSuchElementException();
            }
            dVar.f443a = i10 + 1;
            dVar.f444b = i10;
            Object obj = gVar.f448a[i10];
            if (obj == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = gVar.f449b;
            k.b(objArr);
            Object obj2 = objArr[dVar.f444b];
            if (obj2 == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.e();
            i4++;
        }
        sb2.append("}");
        String string = sb2.toString();
        k.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f456k;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(0, this);
        this.f456k = iVar2;
        return iVar2;
    }

    public g(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i4];
        int[] iArr = new int[i4];
        int iHighestOneBit = Integer.highestOneBit((i4 < 1 ? 1 : i4) * 3);
        this.f448a = objArr;
        this.f449b = null;
        this.f450c = iArr;
        this.f451d = new int[iHighestOneBit];
        this.f452e = 2;
        this.f453f = 0;
        this.g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
