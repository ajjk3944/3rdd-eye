package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class db0 implements Map, Serializable, q40 {
    public static final db0 s;
    public Object[] f;
    public Object[] g;
    public int[] h;
    public int[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public eb0 o;
    public fb0 p;
    public eb0 q;
    public boolean r;

    static {
        db0 db0Var = new db0(0);
        db0Var.r = true;
        s = db0Var;
    }

    public db0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f = objArr;
        this.g = null;
        this.h = iArr;
        this.i = new int[iHighestOneBit];
        this.j = 2;
        this.k = 0;
        this.l = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int i = i(obj);
            int i2 = this.j * 2;
            int length = this.i.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.i;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.k;
                    Object[] objArr = this.f;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.k = i6;
                        objArr[i5] = obj;
                        this.h[i5] = i;
                        iArr[i] = i6;
                        this.n++;
                        this.m++;
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (i30.c(this.f[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.i.length * 2);
                        break;
                    }
                    i = i == 0 ? this.i.length - 1 : i - 1;
                }
            }
        }
    }

    public final void b() {
        if (this.r) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.g;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.h;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        yc0.j(this.f, i3, i);
        if (objArr != null) {
            yc0.j(objArr, i3, this.k);
        }
        this.k = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.k - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        yc0.j(this.f, 0, this.k);
        Object[] objArr = this.g;
        if (objArr != null) {
            yc0.j(objArr, 0, this.k);
        }
        this.n = 0;
        this.k = 0;
        this.m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        i30.m(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        i30.m(entry, "entry");
        int iG = g(entry.getKey());
        if (iG < 0) {
            return false;
        }
        Object[] objArr = this.g;
        i30.j(objArr);
        return i30.c(objArr[iG], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        eb0 eb0Var = this.q;
        if (eb0Var != null) {
            return eb0Var;
        }
        eb0 eb0Var2 = new eb0(this, 0);
        this.q = eb0Var2;
        return eb0Var2;
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
        return this.n == map.size() && d(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f;
        int length = objArr.length;
        int i2 = this.k;
        int i3 = length - i2;
        int i4 = i2 - this.n;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            i30.l(objArrCopyOf2, "copyOf(...)");
            this.f = objArrCopyOf2;
            Object[] objArr2 = this.g;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i6);
                i30.l(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.g = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.h, i6);
            i30.l(iArrCopyOf, "copyOf(...)");
            this.h = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.i.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.j;
        while (true) {
            int i3 = this.i[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (i30.c(this.f[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.i.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.g;
        i30.j(objArr);
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.k;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.h[i] >= 0) {
                Object[] objArr = this.g;
                i30.j(objArr);
                if (i30.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        ab0 ab0Var = new ab0(this, 0);
        int i = 0;
        while (ab0Var.hasNext()) {
            int i2 = ab0Var.f;
            db0 db0Var = (db0) ab0Var.i;
            if (i2 >= db0Var.k) {
                throw new NoSuchElementException();
            }
            ab0Var.f = i2 + 1;
            ab0Var.g = i2;
            Object obj = db0Var.f[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = db0Var.g;
            i30.j(objArr);
            Object obj2 = objArr[ab0Var.g];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            ab0Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.l;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.n == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.h[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.m
            int r0 = r0 + 1
            r5.m = r0
            int r0 = r5.k
            int r1 = r5.n
            r2 = 0
            if (r0 <= r1) goto L10
            r5.c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.i = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.l = r6
        L1c:
            int r6 = r5.k
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.j
        L2c:
            int[] r3 = r5.i
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.h
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db0.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f
            java.lang.String r1 = "<this>"
            defpackage.i30.m(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.g
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.h
            r0 = r0[r12]
            int r1 = r11.j
            int r1 = r1 * 2
            int[] r2 = r11.i
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
            int[] r0 = r11.i
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.j
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.i
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.i
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
            java.lang.Object[] r5 = r11.f
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.i(r5)
            int r5 = r5 - r0
            int[] r9 = r11.i
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.h
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.i
            r0[r1] = r6
        L6c:
            int[] r0 = r11.h
            r0[r12] = r6
            int r12 = r11.n
            int r12 = r12 + r6
            r11.n = r12
            int r12 = r11.m
            int r12 = r12 + 1
            r11.m = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db0.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        eb0 eb0Var = this.o;
        if (eb0Var != null) {
            return eb0Var;
        }
        eb0 eb0Var2 = new eb0(this, 1);
        this.o = eb0Var2;
        return eb0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int iA = a(obj);
        Object[] objArr = this.g;
        if (objArr == null) {
            int length = this.f.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.g = objArr;
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
        i30.m(map, "from");
        b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.g;
            if (objArr == null) {
                int length = this.f.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.g = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!i30.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.g;
        i30.j(objArr);
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.n * 3) + 2);
        sb.append("{");
        int i = 0;
        ab0 ab0Var = new ab0(this, 0);
        while (ab0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ab0Var.f;
            db0 db0Var = (db0) ab0Var.i;
            if (i2 >= db0Var.k) {
                throw new NoSuchElementException();
            }
            ab0Var.f = i2 + 1;
            ab0Var.g = i2;
            Object obj = db0Var.f[i2];
            if (obj == db0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = db0Var.g;
            i30.j(objArr);
            Object obj2 = objArr[ab0Var.g];
            if (obj2 == db0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            ab0Var.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        i30.l(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        fb0 fb0Var = this.p;
        if (fb0Var != null) {
            return fb0Var;
        }
        fb0 fb0Var2 = new fb0(this);
        this.p = fb0Var2;
        return fb0Var2;
    }
}
