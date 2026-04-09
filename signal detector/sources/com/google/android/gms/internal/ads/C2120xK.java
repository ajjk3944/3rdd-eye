package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2120xK extends AbstractMap implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final C2045w f17576h = new C2045w(9);

    /* renamed from: b, reason: collision with root package name */
    public C2066wK f17578b;

    /* renamed from: f, reason: collision with root package name */
    public C1904tK f17582f;

    /* renamed from: g, reason: collision with root package name */
    public C1904tK f17583g;

    /* renamed from: c, reason: collision with root package name */
    public int f17579c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f17580d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C2045w f17577a = f17576h;

    /* renamed from: e, reason: collision with root package name */
    public final C2066wK f17581e = new C2066wK();

    public final C2066wK a(Object obj, boolean z6) {
        int iCompareTo;
        C2066wK c2066wK;
        C2066wK c2066wK2 = this.f17578b;
        C2045w c2045w = f17576h;
        C2045w c2045w2 = this.f17577a;
        if (c2066wK2 != null) {
            Comparable comparable = c2045w2 == c2045w ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c2066wK2.f17428f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : c2045w2.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return c2066wK2;
                }
                C2066wK c2066wK3 = iCompareTo < 0 ? c2066wK2.f17424b : c2066wK2.f17425c;
                if (c2066wK3 == null) {
                    break;
                }
                c2066wK2 = c2066wK3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z6) {
            return null;
        }
        C2066wK c2066wK4 = this.f17581e;
        if (c2066wK2 != null) {
            C2066wK c2066wK5 = new C2066wK(c2066wK2, obj, c2066wK4, c2066wK4.f17427e);
            if (iCompareTo < 0) {
                c2066wK2.f17424b = c2066wK5;
            } else {
                c2066wK2.f17425c = c2066wK5;
            }
            d(c2066wK2, true);
            c2066wK = c2066wK5;
        } else {
            if (c2045w2 == c2045w && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c2066wK = new C2066wK(null, obj, c2066wK4, c2066wK4.f17427e);
            this.f17578b = c2066wK;
        }
        this.f17579c++;
        this.f17580d++;
        return c2066wK;
    }

    public final void b(C2066wK c2066wK, boolean z6) {
        C2066wK c2066wK2;
        C2066wK c2066wK3;
        int i;
        if (z6) {
            C2066wK c2066wK4 = c2066wK.f17427e;
            c2066wK4.f17426d = c2066wK.f17426d;
            c2066wK.f17426d.f17427e = c2066wK4;
        }
        C2066wK c2066wK5 = c2066wK.f17424b;
        C2066wK c2066wK6 = c2066wK.f17425c;
        C2066wK c2066wK7 = c2066wK.f17423a;
        int i3 = 0;
        if (c2066wK5 == null || c2066wK6 == null) {
            if (c2066wK5 != null) {
                c(c2066wK, c2066wK5);
                c2066wK.f17424b = null;
            } else if (c2066wK6 != null) {
                c(c2066wK, c2066wK6);
                c2066wK.f17425c = null;
            } else {
                c(c2066wK, null);
            }
            d(c2066wK7, false);
            this.f17579c--;
            this.f17580d++;
            return;
        }
        if (c2066wK5.f17430h > c2066wK6.f17430h) {
            do {
                c2066wK3 = c2066wK5;
                c2066wK5 = c2066wK5.f17425c;
            } while (c2066wK5 != null);
        } else {
            do {
                c2066wK2 = c2066wK6;
                c2066wK6 = c2066wK6.f17424b;
            } while (c2066wK6 != null);
            c2066wK3 = c2066wK2;
        }
        b(c2066wK3, false);
        C2066wK c2066wK8 = c2066wK.f17424b;
        if (c2066wK8 != null) {
            i = c2066wK8.f17430h;
            c2066wK3.f17424b = c2066wK8;
            c2066wK8.f17423a = c2066wK3;
            c2066wK.f17424b = null;
        } else {
            i = 0;
        }
        C2066wK c2066wK9 = c2066wK.f17425c;
        if (c2066wK9 != null) {
            i3 = c2066wK9.f17430h;
            c2066wK3.f17425c = c2066wK9;
            c2066wK9.f17423a = c2066wK3;
            c2066wK.f17425c = null;
        }
        c2066wK3.f17430h = Math.max(i, i3) + 1;
        c(c2066wK, c2066wK3);
    }

    public final void c(C2066wK c2066wK, C2066wK c2066wK2) {
        C2066wK c2066wK3 = c2066wK.f17423a;
        c2066wK.f17423a = null;
        if (c2066wK2 != null) {
            c2066wK2.f17423a = c2066wK3;
        }
        if (c2066wK3 == null) {
            this.f17578b = c2066wK2;
        } else if (c2066wK3.f17424b == c2066wK) {
            c2066wK3.f17424b = c2066wK2;
        } else {
            c2066wK3.f17425c = c2066wK2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f17578b = null;
        this.f17579c = 0;
        this.f17580d++;
        C2066wK c2066wK = this.f17581e;
        c2066wK.f17427e = c2066wK;
        c2066wK.f17426d = c2066wK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C2066wK c2066wKA = null;
        if (obj != null) {
            try {
                c2066wKA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c2066wKA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.C2066wK r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.wK r0 = r9.f17424b
            com.google.android.gms.internal.ads.wK r1 = r9.f17425c
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f17430h
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f17430h
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.wK r0 = r1.f17424b
            com.google.android.gms.internal.ads.wK r3 = r1.f17425c
            if (r3 == 0) goto L22
            int r3 = r3.f17430h
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.f17430h
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
            com.google.android.gms.internal.ads.wK r1 = r0.f17424b
            com.google.android.gms.internal.ads.wK r3 = r0.f17425c
            if (r3 == 0) goto L4e
            int r3 = r3.f17430h
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.f17430h
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
            r9.f17430h = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.f17430h = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.wK r9 = r9.f17423a
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2120xK.d(com.google.android.gms.internal.ads.wK, boolean):void");
    }

    public final void e(C2066wK c2066wK) {
        C2066wK c2066wK2 = c2066wK.f17424b;
        C2066wK c2066wK3 = c2066wK.f17425c;
        C2066wK c2066wK4 = c2066wK3.f17424b;
        C2066wK c2066wK5 = c2066wK3.f17425c;
        c2066wK.f17425c = c2066wK4;
        if (c2066wK4 != null) {
            c2066wK4.f17423a = c2066wK;
        }
        c(c2066wK, c2066wK3);
        c2066wK3.f17424b = c2066wK;
        c2066wK.f17423a = c2066wK3;
        int iMax = Math.max(c2066wK2 != null ? c2066wK2.f17430h : 0, c2066wK4 != null ? c2066wK4.f17430h : 0) + 1;
        c2066wK.f17430h = iMax;
        c2066wK3.f17430h = Math.max(iMax, c2066wK5 != null ? c2066wK5.f17430h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1904tK c1904tK = this.f17582f;
        if (c1904tK != null) {
            return c1904tK;
        }
        C1904tK c1904tK2 = new C1904tK(this, 0);
        this.f17582f = c1904tK2;
        return c1904tK2;
    }

    public final void f(C2066wK c2066wK) {
        C2066wK c2066wK2 = c2066wK.f17424b;
        C2066wK c2066wK3 = c2066wK.f17425c;
        C2066wK c2066wK4 = c2066wK2.f17424b;
        C2066wK c2066wK5 = c2066wK2.f17425c;
        c2066wK.f17424b = c2066wK5;
        if (c2066wK5 != null) {
            c2066wK5.f17423a = c2066wK;
        }
        c(c2066wK, c2066wK2);
        c2066wK2.f17425c = c2066wK;
        c2066wK.f17423a = c2066wK2;
        int iMax = Math.max(c2066wK3 != null ? c2066wK3.f17430h : 0, c2066wK5 != null ? c2066wK5.f17430h : 0) + 1;
        c2066wK.f17430h = iMax;
        c2066wK2.f17430h = Math.max(iMax, c2066wK4 != null ? c2066wK4.f17430h : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C2066wK c2066wKA;
        if (obj != null) {
            try {
                c2066wKA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c2066wKA = null;
        }
        if (c2066wKA != null) {
            return c2066wKA.f17429g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1904tK c1904tK = this.f17583g;
        if (c1904tK != null) {
            return c1904tK;
        }
        C1904tK c1904tK2 = new C1904tK(this, 1);
        this.f17583g = c1904tK2;
        return c1904tK2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null) {
            throw new NullPointerException("value == null");
        }
        C2066wK c2066wKA = a(obj, true);
        Object obj3 = c2066wKA.f17429g;
        c2066wKA.f17429g = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C2066wK c2066wKA;
        if (obj != null) {
            try {
                c2066wKA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            c2066wKA = null;
        }
        if (c2066wKA != null) {
            b(c2066wKA, true);
        }
        if (c2066wKA != null) {
            return c2066wKA.f17429g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f17579c;
    }
}
