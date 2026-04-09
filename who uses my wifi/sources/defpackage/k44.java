package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k44 extends AbstractMap implements Serializable {
    public static final bk m = new bk(14);
    public j44 g;
    public i44 k;
    public i44 l;
    public int h = 0;
    public int i = 0;
    public final bk f = m;
    public final j44 j = new j44();

    public final j44 a(Object obj, boolean z) {
        int iCompareTo;
        j44 j44Var;
        j44 j44Var2 = this.g;
        bk bkVar = m;
        bk bkVar2 = this.f;
        if (j44Var2 != null) {
            Comparable comparable = bkVar2 == bkVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = j44Var2.k;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : bkVar2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return j44Var2;
                }
                j44 j44Var3 = iCompareTo < 0 ? j44Var2.g : j44Var2.h;
                if (j44Var3 == null) {
                    break;
                }
                j44Var2 = j44Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        j44 j44Var4 = this.j;
        if (j44Var2 != null) {
            j44 j44Var5 = new j44(j44Var2, obj, j44Var4, j44Var4.j);
            if (iCompareTo < 0) {
                j44Var2.g = j44Var5;
            } else {
                j44Var2.h = j44Var5;
            }
            d(j44Var2, true);
            j44Var = j44Var5;
        } else {
            if (bkVar2 == bkVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            j44Var = new j44(null, obj, j44Var4, j44Var4.j);
            this.g = j44Var;
        }
        this.h++;
        this.i++;
        return j44Var;
    }

    public final void b(j44 j44Var, boolean z) {
        j44 j44Var2;
        j44 j44Var3;
        int i;
        if (z) {
            j44 j44Var4 = j44Var.j;
            j44Var4.i = j44Var.i;
            j44Var.i.j = j44Var4;
        }
        j44 j44Var5 = j44Var.g;
        j44 j44Var6 = j44Var.h;
        j44 j44Var7 = j44Var.f;
        int i2 = 0;
        if (j44Var5 == null || j44Var6 == null) {
            if (j44Var5 != null) {
                c(j44Var, j44Var5);
                j44Var.g = null;
            } else if (j44Var6 != null) {
                c(j44Var, j44Var6);
                j44Var.h = null;
            } else {
                c(j44Var, null);
            }
            d(j44Var7, false);
            this.h--;
            this.i++;
            return;
        }
        if (j44Var5.m > j44Var6.m) {
            do {
                j44Var3 = j44Var5;
                j44Var5 = j44Var5.h;
            } while (j44Var5 != null);
        } else {
            do {
                j44Var2 = j44Var6;
                j44Var6 = j44Var6.g;
            } while (j44Var6 != null);
            j44Var3 = j44Var2;
        }
        b(j44Var3, false);
        j44 j44Var8 = j44Var.g;
        if (j44Var8 != null) {
            i = j44Var8.m;
            j44Var3.g = j44Var8;
            j44Var8.f = j44Var3;
            j44Var.g = null;
        } else {
            i = 0;
        }
        j44 j44Var9 = j44Var.h;
        if (j44Var9 != null) {
            i2 = j44Var9.m;
            j44Var3.h = j44Var9;
            j44Var9.f = j44Var3;
            j44Var.h = null;
        }
        j44Var3.m = Math.max(i, i2) + 1;
        c(j44Var, j44Var3);
    }

    public final void c(j44 j44Var, j44 j44Var2) {
        j44 j44Var3 = j44Var.f;
        j44Var.f = null;
        if (j44Var2 != null) {
            j44Var2.f = j44Var3;
        }
        if (j44Var3 == null) {
            this.g = j44Var2;
        } else if (j44Var3.g == j44Var) {
            j44Var3.g = j44Var2;
        } else {
            j44Var3.h = j44Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.g = null;
        this.h = 0;
        this.i++;
        j44 j44Var = this.j;
        j44Var.j = j44Var;
        j44Var.i = j44Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        j44 j44VarA = null;
        if (obj != null) {
            try {
                j44VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return j44VarA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.j44 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            j44 r0 = r9.g
            j44 r1 = r9.h
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.m
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.m
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            j44 r0 = r1.g
            j44 r3 = r1.h
            if (r3 == 0) goto L22
            int r3 = r3.m
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.m
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.f(r1)
            r8.e(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.e(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            j44 r1 = r0.g
            j44 r3 = r0.h
            if (r3 == 0) goto L4e
            int r3 = r3.m
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.m
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.e(r0)
            r8.f(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.f(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.m = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.m = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            j44 r9 = r9.f
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k44.d(j44, boolean):void");
    }

    public final void e(j44 j44Var) {
        j44 j44Var2 = j44Var.g;
        j44 j44Var3 = j44Var.h;
        j44 j44Var4 = j44Var3.g;
        j44 j44Var5 = j44Var3.h;
        j44Var.h = j44Var4;
        if (j44Var4 != null) {
            j44Var4.f = j44Var;
        }
        c(j44Var, j44Var3);
        j44Var3.g = j44Var;
        j44Var.f = j44Var3;
        int iMax = Math.max(j44Var2 != null ? j44Var2.m : 0, j44Var4 != null ? j44Var4.m : 0) + 1;
        j44Var.m = iMax;
        j44Var3.m = Math.max(iMax, j44Var5 != null ? j44Var5.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        i44 i44Var = this.k;
        if (i44Var != null) {
            return i44Var;
        }
        i44 i44Var2 = new i44(this, 0);
        this.k = i44Var2;
        return i44Var2;
    }

    public final void f(j44 j44Var) {
        j44 j44Var2 = j44Var.g;
        j44 j44Var3 = j44Var.h;
        j44 j44Var4 = j44Var2.g;
        j44 j44Var5 = j44Var2.h;
        j44Var.g = j44Var5;
        if (j44Var5 != null) {
            j44Var5.f = j44Var;
        }
        c(j44Var, j44Var2);
        j44Var2.h = j44Var;
        j44Var.f = j44Var2;
        int iMax = Math.max(j44Var3 != null ? j44Var3.m : 0, j44Var5 != null ? j44Var5.m : 0) + 1;
        j44Var.m = iMax;
        j44Var2.m = Math.max(iMax, j44Var4 != null ? j44Var4.m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        j44 j44VarA;
        if (obj != null) {
            try {
                j44VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            j44VarA = null;
        }
        if (j44VarA != null) {
            return j44VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i44 i44Var = this.l;
        if (i44Var != null) {
            return i44Var;
        }
        i44 i44Var2 = new i44(this, 1);
        this.l = i44Var2;
        return i44Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        j44 j44VarA = a(obj, true);
        Object obj3 = j44VarA.l;
        j44VarA.l = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j44 j44VarA;
        if (obj != null) {
            try {
                j44VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            j44VarA = null;
        }
        if (j44VarA != null) {
            b(j44VarA, true);
        }
        if (j44VarA != null) {
            return j44VarA.l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.h;
    }
}
