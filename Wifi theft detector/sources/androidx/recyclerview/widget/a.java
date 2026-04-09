package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public r0.f f3866a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3867b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3868c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0037a f3869d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f3870e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3871f;

    /* renamed from: g, reason: collision with root package name */
    public final h f3872g;

    /* renamed from: h, reason: collision with root package name */
    public int f3873h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0037a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.c0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3874a;

        /* renamed from: b, reason: collision with root package name */
        public int f3875b;

        /* renamed from: c, reason: collision with root package name */
        public Object f3876c;

        /* renamed from: d, reason: collision with root package name */
        public int f3877d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f3874a = i10;
            this.f3875b = i11;
            this.f3877d = i12;
            this.f3876c = obj;
        }

        public String a() {
            int i10 = this.f3874a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3874a;
            if (i10 != bVar.f3874a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3877d - this.f3875b) == 1 && this.f3877d == bVar.f3875b && this.f3875b == bVar.f3877d) {
                return true;
            }
            if (this.f3877d != bVar.f3877d || this.f3875b != bVar.f3875b) {
                return false;
            }
            Object obj2 = this.f3876c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3876c)) {
                    return false;
                }
            } else if (bVar.f3876c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3874a * 31) + this.f3875b) * 31) + this.f3877d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3875b + "c:" + this.f3877d + ",p:" + this.f3876c + "]";
        }
    }

    public a(InterfaceC0037a interfaceC0037a) {
        this(interfaceC0037a, false);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f3866a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f3874a = i10;
        bVar.f3875b = i11;
        bVar.f3877d = i12;
        bVar.f3876c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void b(b bVar) {
        if (this.f3871f) {
            return;
        }
        bVar.f3876c = null;
        this.f3866a.a(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i10) {
        int size = this.f3867b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3867b.get(i11);
            int i12 = bVar.f3874a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3875b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3877d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3875b;
                    if (i15 == i10) {
                        i10 = bVar.f3877d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3877d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3875b <= i10) {
                i10 += bVar.f3877d;
            }
        }
        return i10;
    }

    public final void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f3875b;
        int i11 = bVar.f3877d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3869d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
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
        if (i13 != bVar.f3877d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i10 = bVar.f3875b;
        int i11 = bVar.f3877d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f3869d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f3876c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f3876c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f3877d) {
            Object obj = bVar.f3876c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (z10) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    public final boolean h(int i10) {
        int size = this.f3868c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3868c.get(i11);
            int i12 = bVar.f3874a;
            if (i12 == 8) {
                if (n(bVar.f3877d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3875b;
                int i14 = bVar.f3877d + i13;
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

    public void i() {
        int size = this.f3868c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3869d.c((b) this.f3868c.get(i10));
        }
        x(this.f3868c);
        this.f3873h = 0;
    }

    public void j() {
        i();
        int size = this.f3867b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3867b.get(i10);
            int i11 = bVar.f3874a;
            if (i11 == 1) {
                this.f3869d.c(bVar);
                this.f3869d.g(bVar.f3875b, bVar.f3877d);
            } else if (i11 == 2) {
                this.f3869d.c(bVar);
                this.f3869d.h(bVar.f3875b, bVar.f3877d);
            } else if (i11 == 4) {
                this.f3869d.c(bVar);
                this.f3869d.e(bVar.f3875b, bVar.f3877d, bVar.f3876c);
            } else if (i11 == 8) {
                this.f3869d.c(bVar);
                this.f3869d.a(bVar.f3875b, bVar.f3877d);
            }
            Runnable runnable = this.f3870e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f3867b);
        this.f3873h = 0;
    }

    public final void k(b bVar) {
        int i10;
        int i11 = bVar.f3874a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f3875b, i11);
        int i12 = bVar.f3875b;
        int i13 = bVar.f3874a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3877d; i15++) {
            int iZ2 = z(bVar.f3875b + (i10 * i15), bVar.f3874a);
            int i16 = bVar.f3874a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f3876c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f3874a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f3876c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f3874a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    public void l(b bVar, int i10) {
        this.f3869d.b(bVar);
        int i11 = bVar.f3874a;
        if (i11 == 2) {
            this.f3869d.h(i10, bVar.f3877d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3869d.e(i10, bVar.f3877d, bVar.f3876c);
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    public int n(int i10, int i11) {
        int size = this.f3868c.size();
        while (i11 < size) {
            b bVar = (b) this.f3868c.get(i11);
            int i12 = bVar.f3874a;
            if (i12 == 8) {
                int i13 = bVar.f3875b;
                if (i13 == i10) {
                    i10 = bVar.f3877d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3877d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3875b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3877d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3877d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (i10 & this.f3873h) != 0;
    }

    public boolean p() {
        return this.f3867b.size() > 0;
    }

    public boolean q() {
        return (this.f3868c.isEmpty() || this.f3867b.isEmpty()) ? false : true;
    }

    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3867b.add(a(4, i10, i11, obj));
        this.f3873h |= 4;
        return this.f3867b.size() == 1;
    }

    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3867b.add(a(1, i10, i11, null));
        this.f3873h |= 1;
        return this.f3867b.size() == 1;
    }

    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f3867b.add(a(8, i10, i11, null));
        this.f3873h |= 8;
        return this.f3867b.size() == 1;
    }

    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3867b.add(a(2, i10, i11, null));
        this.f3873h |= 2;
        return this.f3867b.size() == 1;
    }

    public final void v(b bVar) {
        this.f3868c.add(bVar);
        int i10 = bVar.f3874a;
        if (i10 == 1) {
            this.f3869d.g(bVar.f3875b, bVar.f3877d);
            return;
        }
        if (i10 == 2) {
            this.f3869d.d(bVar.f3875b, bVar.f3877d);
            return;
        }
        if (i10 == 4) {
            this.f3869d.e(bVar.f3875b, bVar.f3877d, bVar.f3876c);
        } else {
            if (i10 == 8) {
                this.f3869d.a(bVar.f3875b, bVar.f3877d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f3872g.b(this.f3867b);
        int size = this.f3867b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3867b.get(i10);
            int i11 = bVar.f3874a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3870e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3867b.clear();
    }

    public void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    public void y() {
        x(this.f3867b);
        x(this.f3868c);
        this.f3873h = 0;
    }

    public final int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3868c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f3868c.get(size);
            int i14 = bVar.f3874a;
            if (i14 == 8) {
                int i15 = bVar.f3875b;
                int i16 = bVar.f3877d;
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
                            bVar.f3875b = i15 + 1;
                            bVar.f3877d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3875b = i15 - 1;
                            bVar.f3877d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3877d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3877d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3875b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3875b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3875b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3877d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3877d;
                    }
                } else if (i11 == 1) {
                    bVar.f3875b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3875b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3868c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f3868c.get(size2);
            if (bVar2.f3874a == 8) {
                int i18 = bVar2.f3877d;
                if (i18 == bVar2.f3875b || i18 < 0) {
                    this.f3868c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f3877d <= 0) {
                this.f3868c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public a(InterfaceC0037a interfaceC0037a, boolean z10) {
        this.f3866a = new r0.g(30);
        this.f3867b = new ArrayList();
        this.f3868c = new ArrayList();
        this.f3873h = 0;
        this.f3869d = interfaceC0037a;
        this.f3871f = z10;
        this.f3872g = new h(this);
    }
}
