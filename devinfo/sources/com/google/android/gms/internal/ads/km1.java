package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class km1 extends AbstractMap implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final v f13200h = new v(9);

    /* renamed from: b, reason: collision with root package name */
    public jm1 f13202b;

    /* renamed from: f, reason: collision with root package name */
    public gm1 f13206f;
    public gm1 g;

    /* renamed from: c, reason: collision with root package name */
    public int f13203c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f13204d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f13201a = f13200h;

    /* renamed from: e, reason: collision with root package name */
    public final jm1 f13205e = new jm1();

    public final jm1 a(Object obj, boolean z3) {
        int iCompareTo;
        jm1 jm1Var;
        jm1 jm1Var2 = this.f13202b;
        v vVar = f13200h;
        v vVar2 = this.f13201a;
        if (jm1Var2 != null) {
            Comparable comparable = vVar2 == vVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = jm1Var2.f12793f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : vVar2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return jm1Var2;
                }
                jm1 jm1Var3 = iCompareTo < 0 ? jm1Var2.f12789b : jm1Var2.f12790c;
                if (jm1Var3 == null) {
                    break;
                }
                jm1Var2 = jm1Var3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z3) {
            return null;
        }
        jm1 jm1Var4 = this.f13205e;
        if (jm1Var2 != null) {
            jm1 jm1Var5 = new jm1(jm1Var2, obj, jm1Var4, jm1Var4.f12792e);
            if (iCompareTo < 0) {
                jm1Var2.f12789b = jm1Var5;
            } else {
                jm1Var2.f12790c = jm1Var5;
            }
            d(jm1Var2, true);
            jm1Var = jm1Var5;
        } else {
            if (vVar2 == vVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            jm1Var = new jm1(null, obj, jm1Var4, jm1Var4.f12792e);
            this.f13202b = jm1Var;
        }
        this.f13203c++;
        this.f13204d++;
        return jm1Var;
    }

    public final void b(jm1 jm1Var, boolean z3) {
        jm1 jm1Var2;
        jm1 jm1Var3;
        int i4;
        if (z3) {
            jm1 jm1Var4 = jm1Var.f12792e;
            jm1Var4.f12791d = jm1Var.f12791d;
            jm1Var.f12791d.f12792e = jm1Var4;
        }
        jm1 jm1Var5 = jm1Var.f12789b;
        jm1 jm1Var6 = jm1Var.f12790c;
        jm1 jm1Var7 = jm1Var.f12788a;
        int i10 = 0;
        if (jm1Var5 == null || jm1Var6 == null) {
            if (jm1Var5 != null) {
                c(jm1Var, jm1Var5);
                jm1Var.f12789b = null;
            } else if (jm1Var6 != null) {
                c(jm1Var, jm1Var6);
                jm1Var.f12790c = null;
            } else {
                c(jm1Var, null);
            }
            d(jm1Var7, false);
            this.f13203c--;
            this.f13204d++;
            return;
        }
        if (jm1Var5.f12794h > jm1Var6.f12794h) {
            do {
                jm1Var3 = jm1Var5;
                jm1Var5 = jm1Var5.f12790c;
            } while (jm1Var5 != null);
        } else {
            do {
                jm1Var2 = jm1Var6;
                jm1Var6 = jm1Var6.f12789b;
            } while (jm1Var6 != null);
            jm1Var3 = jm1Var2;
        }
        b(jm1Var3, false);
        jm1 jm1Var8 = jm1Var.f12789b;
        if (jm1Var8 != null) {
            i4 = jm1Var8.f12794h;
            jm1Var3.f12789b = jm1Var8;
            jm1Var8.f12788a = jm1Var3;
            jm1Var.f12789b = null;
        } else {
            i4 = 0;
        }
        jm1 jm1Var9 = jm1Var.f12790c;
        if (jm1Var9 != null) {
            i10 = jm1Var9.f12794h;
            jm1Var3.f12790c = jm1Var9;
            jm1Var9.f12788a = jm1Var3;
            jm1Var.f12790c = null;
        }
        jm1Var3.f12794h = Math.max(i4, i10) + 1;
        c(jm1Var, jm1Var3);
    }

    public final void c(jm1 jm1Var, jm1 jm1Var2) {
        jm1 jm1Var3 = jm1Var.f12788a;
        jm1Var.f12788a = null;
        if (jm1Var2 != null) {
            jm1Var2.f12788a = jm1Var3;
        }
        if (jm1Var3 == null) {
            this.f13202b = jm1Var2;
        } else if (jm1Var3.f12789b == jm1Var) {
            jm1Var3.f12789b = jm1Var2;
        } else {
            jm1Var3.f12790c = jm1Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f13202b = null;
        this.f13203c = 0;
        this.f13204d++;
        jm1 jm1Var = this.f13205e;
        jm1Var.f12792e = jm1Var;
        jm1Var.f12791d = jm1Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        jm1 jm1VarA = null;
        if (obj != null) {
            try {
                jm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return jm1VarA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.jm1 r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.jm1 r0 = r9.f12789b
            com.google.android.gms.internal.ads.jm1 r1 = r9.f12790c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f12794h
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f12794h
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.jm1 r0 = r1.f12789b
            com.google.android.gms.internal.ads.jm1 r3 = r1.f12790c
            if (r3 == 0) goto L22
            int r3 = r3.f12794h
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.f12794h
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
            com.google.android.gms.internal.ads.jm1 r1 = r0.f12789b
            com.google.android.gms.internal.ads.jm1 r3 = r0.f12790c
            if (r3 == 0) goto L4e
            int r3 = r3.f12794h
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.f12794h
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
            r9.f12794h = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f12794h = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.jm1 r9 = r9.f12788a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.km1.d(com.google.android.gms.internal.ads.jm1, boolean):void");
    }

    public final void e(jm1 jm1Var) {
        jm1 jm1Var2 = jm1Var.f12789b;
        jm1 jm1Var3 = jm1Var.f12790c;
        jm1 jm1Var4 = jm1Var3.f12789b;
        jm1 jm1Var5 = jm1Var3.f12790c;
        jm1Var.f12790c = jm1Var4;
        if (jm1Var4 != null) {
            jm1Var4.f12788a = jm1Var;
        }
        c(jm1Var, jm1Var3);
        jm1Var3.f12789b = jm1Var;
        jm1Var.f12788a = jm1Var3;
        int iMax = Math.max(jm1Var2 != null ? jm1Var2.f12794h : 0, jm1Var4 != null ? jm1Var4.f12794h : 0) + 1;
        jm1Var.f12794h = iMax;
        jm1Var3.f12794h = Math.max(iMax, jm1Var5 != null ? jm1Var5.f12794h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        gm1 gm1Var = this.f13206f;
        if (gm1Var != null) {
            return gm1Var;
        }
        gm1 gm1Var2 = new gm1(this, 0);
        this.f13206f = gm1Var2;
        return gm1Var2;
    }

    public final void f(jm1 jm1Var) {
        jm1 jm1Var2 = jm1Var.f12789b;
        jm1 jm1Var3 = jm1Var.f12790c;
        jm1 jm1Var4 = jm1Var2.f12789b;
        jm1 jm1Var5 = jm1Var2.f12790c;
        jm1Var.f12789b = jm1Var5;
        if (jm1Var5 != null) {
            jm1Var5.f12788a = jm1Var;
        }
        c(jm1Var, jm1Var2);
        jm1Var2.f12790c = jm1Var;
        jm1Var.f12788a = jm1Var2;
        int iMax = Math.max(jm1Var3 != null ? jm1Var3.f12794h : 0, jm1Var5 != null ? jm1Var5.f12794h : 0) + 1;
        jm1Var.f12794h = iMax;
        jm1Var2.f12794h = Math.max(iMax, jm1Var4 != null ? jm1Var4.f12794h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        jm1 jm1VarA;
        if (obj != null) {
            try {
                jm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            jm1VarA = null;
        }
        if (jm1VarA != null) {
            return jm1VarA.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        gm1 gm1Var = this.g;
        if (gm1Var != null) {
            return gm1Var;
        }
        gm1 gm1Var2 = new gm1(this, 1);
        this.g = gm1Var2;
        return gm1Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        jm1 jm1VarA = a(obj, true);
        Object obj3 = jm1VarA.g;
        jm1VarA.g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        jm1 jm1VarA;
        if (obj != null) {
            try {
                jm1VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            jm1VarA = null;
        }
        if (jm1VarA != null) {
            b(jm1VarA, true);
        }
        if (jm1VarA != null) {
            return jm1VarA.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13203c;
    }
}
