package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class a implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private z.d<b> f2082a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f2083b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f2084c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0016a f2085d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f2086e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f2087f;

    /* renamed from: g, reason: collision with root package name */
    final g f2088g;

    /* renamed from: h, reason: collision with root package name */
    private int f2089h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0016a {
        void a(int i2, int i3);

        void b(b bVar);

        void c(b bVar);

        void d(int i2, int i3);

        RecyclerView.d0 e(int i2);

        void f(int i2, int i3, Object obj);

        void g(int i2, int i3);

        void h(int i2, int i3);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f2090a;

        /* renamed from: b, reason: collision with root package name */
        int f2091b;

        /* renamed from: c, reason: collision with root package name */
        Object f2092c;

        /* renamed from: d, reason: collision with root package name */
        int f2093d;

        b(int i2, int i3, int i4, Object obj) {
            this.f2090a = i2;
            this.f2091b = i3;
            this.f2093d = i4;
            this.f2092c = obj;
        }

        String a() {
            int i2 = this.f2090a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f2090a;
            if (i2 != bVar.f2090a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f2093d - this.f2091b) == 1 && this.f2093d == bVar.f2091b && this.f2091b == bVar.f2093d) {
                return true;
            }
            if (this.f2093d != bVar.f2093d || this.f2091b != bVar.f2091b) {
                return false;
            }
            Object obj2 = this.f2092c;
            Object obj3 = bVar.f2092c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2090a * 31) + this.f2091b) * 31) + this.f2093d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2091b + "c:" + this.f2093d + ",p:" + this.f2092c + "]";
        }
    }

    a(InterfaceC0016a interfaceC0016a) {
        this(interfaceC0016a, false);
    }

    a(InterfaceC0016a interfaceC0016a, boolean z2) {
        this.f2082a = new z.e(30);
        this.f2083b = new ArrayList<>();
        this.f2084c = new ArrayList<>();
        this.f2089h = 0;
        this.f2085d = interfaceC0016a;
        this.f2087f = z2;
        this.f2088g = new g(this);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z2;
        char c2;
        int i2 = bVar.f2091b;
        int i3 = bVar.f2093d + i2;
        char c3 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f2085d.e(i4) != null || h(i4)) {
                if (c3 == 0) {
                    k(a(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    r(a(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 0;
            }
            if (z2) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != bVar.f2093d) {
            b(bVar);
            bVar = a(2, i2, i5, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i2 = bVar.f2091b;
        int i3 = bVar.f2093d + i2;
        int i4 = i2;
        char c2 = 65535;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f2085d.e(i2) != null || h(i2)) {
                if (c2 == 0) {
                    k(a(4, i4, i5, bVar.f2092c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    r(a(4, i4, i5, bVar.f2092c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f2093d) {
            Object obj = bVar.f2092c;
            b(bVar);
            bVar = a(4, i4, i5, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i2) {
        int size = this.f2084c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f2084c.get(i3);
            int i4 = bVar.f2090a;
            if (i4 == 8) {
                if (n(bVar.f2093d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f2091b;
                int i6 = bVar.f2093d + i5;
                while (i5 < i6) {
                    if (n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i2;
        int i3 = bVar.f2090a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f2091b, i3);
        int i4 = bVar.f2091b;
        int i5 = bVar.f2090a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f2093d; i7++) {
            int iV2 = v(bVar.f2091b + (i2 * i7), bVar.f2090a);
            int i8 = bVar.f2090a;
            if (i8 == 2 ? iV2 == iV : i8 == 4 && iV2 == iV + 1) {
                i6++;
            } else {
                b bVarA = a(i8, iV, i6, bVar.f2092c);
                l(bVarA, i4);
                b(bVarA);
                if (bVar.f2090a == 4) {
                    i4 += i6;
                }
                iV = iV2;
                i6 = 1;
            }
        }
        Object obj = bVar.f2092c;
        b(bVar);
        if (i6 > 0) {
            b bVarA2 = a(bVar.f2090a, iV, i6, obj);
            l(bVarA2, i4);
            b(bVarA2);
        }
    }

    private void r(b bVar) {
        this.f2084c.add(bVar);
        int i2 = bVar.f2090a;
        if (i2 == 1) {
            this.f2085d.d(bVar.f2091b, bVar.f2093d);
            return;
        }
        if (i2 == 2) {
            this.f2085d.h(bVar.f2091b, bVar.f2093d);
            return;
        }
        if (i2 == 4) {
            this.f2085d.f(bVar.f2091b, bVar.f2093d, bVar.f2092c);
        } else {
            if (i2 == 8) {
                this.f2085d.a(bVar.f2091b, bVar.f2093d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int v(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f2084c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r8.f2084c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.f2090a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f2091b
            int r4 = r3.f2093d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f2093d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f2091b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f2091b = r2
            int r4 = r4 + 1
        L52:
            r3.f2093d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f2091b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f2091b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f2093d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f2093d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f2091b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r10 = r8.f2084c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f2084c
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.f2090a
            if (r1 != r2) goto L9b
            int r1 = r0.f2093d
            int r3 = r0.f2091b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f2093d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r8.f2084c
            r1.remove(r10)
            r8.b(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.v(int, int):int");
    }

    @Override // androidx.recyclerview.widget.g.a
    public b a(int i2, int i3, int i4, Object obj) {
        b bVarB = this.f2082a.b();
        if (bVarB == null) {
            return new b(i2, i3, i4, obj);
        }
        bVarB.f2090a = i2;
        bVarB.f2091b = i3;
        bVarB.f2093d = i4;
        bVarB.f2092c = obj;
        return bVarB;
    }

    @Override // androidx.recyclerview.widget.g.a
    public void b(b bVar) {
        if (this.f2087f) {
            return;
        }
        bVar.f2092c = null;
        this.f2082a.a(bVar);
    }

    public int e(int i2) {
        int size = this.f2083b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f2083b.get(i3);
            int i4 = bVar.f2090a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f2091b;
                    if (i5 <= i2) {
                        int i6 = bVar.f2093d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f2091b;
                    if (i7 == i2) {
                        i2 = bVar.f2093d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f2093d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f2091b <= i2) {
                i2 += bVar.f2093d;
            }
        }
        return i2;
    }

    void i() {
        int size = this.f2084c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2085d.b(this.f2084c.get(i2));
        }
        t(this.f2084c);
        this.f2089h = 0;
    }

    void j() {
        i();
        int size = this.f2083b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2083b.get(i2);
            int i3 = bVar.f2090a;
            if (i3 == 1) {
                this.f2085d.b(bVar);
                this.f2085d.d(bVar.f2091b, bVar.f2093d);
            } else if (i3 == 2) {
                this.f2085d.b(bVar);
                this.f2085d.g(bVar.f2091b, bVar.f2093d);
            } else if (i3 == 4) {
                this.f2085d.b(bVar);
                this.f2085d.f(bVar.f2091b, bVar.f2093d, bVar.f2092c);
            } else if (i3 == 8) {
                this.f2085d.b(bVar);
                this.f2085d.a(bVar.f2091b, bVar.f2093d);
            }
            Runnable runnable = this.f2086e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f2083b);
        this.f2089h = 0;
    }

    void l(b bVar, int i2) {
        this.f2085d.c(bVar);
        int i3 = bVar.f2090a;
        if (i3 == 2) {
            this.f2085d.g(i2, bVar.f2093d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f2085d.f(i2, bVar.f2093d, bVar.f2092c);
        }
    }

    int m(int i2) {
        return n(i2, 0);
    }

    int n(int i2, int i3) {
        int size = this.f2084c.size();
        while (i3 < size) {
            b bVar = this.f2084c.get(i3);
            int i4 = bVar.f2090a;
            if (i4 == 8) {
                int i5 = bVar.f2091b;
                if (i5 == i2) {
                    i2 = bVar.f2093d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f2093d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f2091b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f2093d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f2093d;
                }
            }
            i3++;
        }
        return i2;
    }

    boolean o(int i2) {
        return (i2 & this.f2089h) != 0;
    }

    boolean p() {
        return this.f2083b.size() > 0;
    }

    boolean q() {
        return (this.f2084c.isEmpty() || this.f2083b.isEmpty()) ? false : true;
    }

    void s() {
        this.f2088g.b(this.f2083b);
        int size = this.f2083b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2083b.get(i2);
            int i3 = bVar.f2090a;
            if (i3 == 1) {
                c(bVar);
            } else if (i3 == 2) {
                f(bVar);
            } else if (i3 == 4) {
                g(bVar);
            } else if (i3 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f2086e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2083b.clear();
    }

    void t(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b(list.get(i2));
        }
        list.clear();
    }

    void u() {
        t(this.f2083b);
        t(this.f2084c);
        this.f2089h = 0;
    }
}
