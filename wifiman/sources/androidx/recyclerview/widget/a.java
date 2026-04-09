package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private E1.e f32102a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f32103b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f32104c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1117a f32105d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f32106e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f32107f;

    /* renamed from: g, reason: collision with root package name */
    final h f32108g;

    /* renamed from: h, reason: collision with root package name */
    private int f32109h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC1117a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.C e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f32110a;

        /* renamed from: b, reason: collision with root package name */
        int f32111b;

        /* renamed from: c, reason: collision with root package name */
        Object f32112c;

        /* renamed from: d, reason: collision with root package name */
        int f32113d;

        b(int i10, int i11, int i12, Object obj) {
            this.f32110a = i10;
            this.f32111b = i11;
            this.f32113d = i12;
            this.f32112c = obj;
        }

        String a() {
            int i10 = this.f32110a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f32110a;
            if (i10 != bVar.f32110a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f32113d - this.f32111b) == 1 && this.f32113d == bVar.f32111b && this.f32111b == bVar.f32113d) {
                return true;
            }
            if (this.f32113d != bVar.f32113d || this.f32111b != bVar.f32111b) {
                return false;
            }
            Object obj2 = this.f32112c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f32112c)) {
                    return false;
                }
            } else if (bVar.f32112c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f32110a * 31) + this.f32111b) * 31) + this.f32113d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f32111b + "c:" + this.f32113d + ",p:" + this.f32112c + "]";
        }
    }

    a(InterfaceC1117a interfaceC1117a) {
        this(interfaceC1117a, false);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f32111b;
        int i11 = bVar.f32113d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f32105d.e(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    r(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f32113d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f32111b;
        int i11 = bVar.f32113d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f32105d.e(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f32112c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    r(b(4, i13, i12, bVar.f32112c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f32113d) {
            Object obj = bVar.f32112c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (z10) {
            r(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f32104c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f32104c.get(i11);
            int i12 = bVar.f32110a;
            if (i12 == 8) {
                if (n(bVar.f32113d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f32111b;
                int i14 = bVar.f32113d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f32110a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f32111b, i11);
        int i12 = bVar.f32111b;
        int i13 = bVar.f32110a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f32113d; i15++) {
            int iV2 = v(bVar.f32111b + (i10 * i15), bVar.f32110a);
            int i16 = bVar.f32110a;
            if (i16 == 2 ? iV2 != iV : !(i16 == 4 && iV2 == iV + 1)) {
                b bVarB = b(i16, iV, i14, bVar.f32112c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f32110a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iV = iV2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f32112c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f32110a, iV, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void r(b bVar) {
        this.f32104c.add(bVar);
        int i10 = bVar.f32110a;
        if (i10 == 1) {
            this.f32105d.g(bVar.f32111b, bVar.f32113d);
            return;
        }
        if (i10 == 2) {
            this.f32105d.f(bVar.f32111b, bVar.f32113d);
            return;
        }
        if (i10 == 4) {
            this.f32105d.c(bVar.f32111b, bVar.f32113d, bVar.f32112c);
        } else {
            if (i10 == 8) {
                this.f32105d.a(bVar.f32111b, bVar.f32113d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int v(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f32104c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f32104c.get(size);
            int i14 = bVar.f32110a;
            if (i14 == 8) {
                int i15 = bVar.f32111b;
                int i16 = bVar.f32113d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f32111b = i15 + 1;
                            bVar.f32113d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f32111b = i15 - 1;
                            bVar.f32113d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f32113d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f32113d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f32111b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f32111b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f32111b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f32113d;
                    } else if (i14 == 2) {
                        i10 += bVar.f32113d;
                    }
                } else if (i11 == 1) {
                    bVar.f32111b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f32111b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f32104c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f32104c.get(size2);
            if (bVar2.f32110a == 8) {
                int i18 = bVar2.f32113d;
                if (i18 == bVar2.f32111b || i18 < 0) {
                    this.f32104c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f32113d <= 0) {
                this.f32104c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f32107f) {
            return;
        }
        bVar.f32112c = null;
        this.f32102a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f32102a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f32110a = i10;
        bVar.f32111b = i11;
        bVar.f32113d = i12;
        bVar.f32112c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f32103b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f32103b.get(i11);
            int i12 = bVar.f32110a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f32111b;
                    if (i13 <= i10) {
                        int i14 = bVar.f32113d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f32111b;
                    if (i15 == i10) {
                        i10 = bVar.f32113d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f32113d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f32111b <= i10) {
                i10 += bVar.f32113d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f32104c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32105d.d((b) this.f32104c.get(i10));
        }
        t(this.f32104c);
        this.f32109h = 0;
    }

    void j() {
        i();
        int size = this.f32103b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f32103b.get(i10);
            int i11 = bVar.f32110a;
            if (i11 == 1) {
                this.f32105d.d(bVar);
                this.f32105d.g(bVar.f32111b, bVar.f32113d);
            } else if (i11 == 2) {
                this.f32105d.d(bVar);
                this.f32105d.h(bVar.f32111b, bVar.f32113d);
            } else if (i11 == 4) {
                this.f32105d.d(bVar);
                this.f32105d.c(bVar.f32111b, bVar.f32113d, bVar.f32112c);
            } else if (i11 == 8) {
                this.f32105d.d(bVar);
                this.f32105d.a(bVar.f32111b, bVar.f32113d);
            }
            Runnable runnable = this.f32106e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f32103b);
        this.f32109h = 0;
    }

    void l(b bVar, int i10) {
        this.f32105d.b(bVar);
        int i11 = bVar.f32110a;
        if (i11 == 2) {
            this.f32105d.h(i10, bVar.f32113d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f32105d.c(i10, bVar.f32113d, bVar.f32112c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f32104c.size();
        while (i11 < size) {
            b bVar = (b) this.f32104c.get(i11);
            int i12 = bVar.f32110a;
            if (i12 == 8) {
                int i13 = bVar.f32111b;
                if (i13 == i10) {
                    i10 = bVar.f32113d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f32113d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f32111b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f32113d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f32113d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f32109h) != 0;
    }

    boolean p() {
        return this.f32103b.size() > 0;
    }

    boolean q() {
        return (this.f32104c.isEmpty() || this.f32103b.isEmpty()) ? false : true;
    }

    void s() {
        this.f32108g.b(this.f32103b);
        int size = this.f32103b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f32103b.get(i10);
            int i11 = bVar.f32110a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f32106e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f32103b.clear();
    }

    void t(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    void u() {
        t(this.f32103b);
        t(this.f32104c);
        this.f32109h = 0;
    }

    a(InterfaceC1117a interfaceC1117a, boolean z10) {
        this.f32102a = new E1.f(30);
        this.f32103b = new ArrayList();
        this.f32104c = new ArrayList();
        this.f32109h = 0;
        this.f32105d = interfaceC1117a;
        this.f32107f = z10;
        this.f32108g = new h(this);
    }
}
