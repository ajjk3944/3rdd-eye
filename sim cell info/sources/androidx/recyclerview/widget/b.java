package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC0017b f2094a;

    /* renamed from: b, reason: collision with root package name */
    final a f2095b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f2096c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f2097a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f2098b;

        a() {
        }

        private void c() {
            if (this.f2098b == null) {
                this.f2098b = new a();
            }
        }

        void a(int i2) {
            if (i2 < 64) {
                this.f2097a &= (1 << i2) ^ (-1);
                return;
            }
            a aVar = this.f2098b;
            if (aVar != null) {
                aVar.a(i2 - 64);
            }
        }

        int b(int i2) {
            a aVar = this.f2098b;
            return aVar == null ? i2 >= 64 ? Long.bitCount(this.f2097a) : Long.bitCount(this.f2097a & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.f2097a & ((1 << i2) - 1)) : aVar.b(i2 - 64) + Long.bitCount(this.f2097a);
        }

        boolean d(int i2) {
            if (i2 < 64) {
                return (this.f2097a & (1 << i2)) != 0;
            }
            c();
            return this.f2098b.d(i2 - 64);
        }

        void e(int i2, boolean z2) {
            if (i2 >= 64) {
                c();
                this.f2098b.e(i2 - 64, z2);
                return;
            }
            long j2 = this.f2097a;
            boolean z3 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f2097a = ((j2 & (j3 ^ (-1))) << 1) | (j2 & j3);
            if (z2) {
                h(i2);
            } else {
                a(i2);
            }
            if (z3 || this.f2098b != null) {
                c();
                this.f2098b.e(0, z3);
            }
        }

        boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f2098b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f2097a;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (j2 ^ (-1));
            this.f2097a = j4;
            long j5 = j2 - 1;
            this.f2097a = (j4 & j5) | Long.rotateRight((j5 ^ (-1)) & j4, 1);
            a aVar = this.f2098b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2098b.f(0);
            }
            return z2;
        }

        void g() {
            this.f2097a = 0L;
            a aVar = this.f2098b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i2) {
            if (i2 < 64) {
                this.f2097a |= 1 << i2;
            } else {
                c();
                this.f2098b.h(i2 - 64);
            }
        }

        public String toString() {
            if (this.f2098b == null) {
                return Long.toBinaryString(this.f2097a);
            }
            return this.f2098b.toString() + "xx" + Long.toBinaryString(this.f2097a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0017b {
        View a(int i2);

        void b(int i2);

        void c(View view);

        void d(View view, int i2, ViewGroup.LayoutParams layoutParams);

        void e(View view);

        void f(View view, int i2);

        int g(View view);

        int h();

        void i(int i2);

        void j();

        RecyclerView.d0 k(View view);
    }

    b(InterfaceC0017b interfaceC0017b) {
        this.f2094a = interfaceC0017b;
    }

    private int h(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iH = this.f2094a.h();
        int i3 = i2;
        while (i3 < iH) {
            int iB = i2 - (i3 - this.f2095b.b(i3));
            if (iB == 0) {
                while (this.f2095b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f2096c.add(view);
        this.f2094a.e(view);
    }

    private boolean t(View view) {
        if (!this.f2096c.remove(view)) {
            return false;
        }
        this.f2094a.c(view);
        return true;
    }

    void a(View view, int i2, boolean z2) {
        int iH = i2 < 0 ? this.f2094a.h() : h(i2);
        this.f2095b.e(iH, z2);
        if (z2) {
            l(view);
        }
        this.f2094a.f(view, iH);
    }

    void b(View view, boolean z2) {
        a(view, -1, z2);
    }

    void c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int iH = i2 < 0 ? this.f2094a.h() : h(i2);
        this.f2095b.e(iH, z2);
        if (z2) {
            l(view);
        }
        this.f2094a.d(view, iH, layoutParams);
    }

    void d(int i2) {
        int iH = h(i2);
        this.f2095b.f(iH);
        this.f2094a.b(iH);
    }

    View e(int i2) {
        int size = this.f2096c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f2096c.get(i3);
            RecyclerView.d0 d0VarK = this.f2094a.k(view);
            if (d0VarK.m() == i2 && !d0VarK.t() && !d0VarK.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i2) {
        return this.f2094a.a(h(i2));
    }

    int g() {
        return this.f2094a.h() - this.f2096c.size();
    }

    View i(int i2) {
        return this.f2094a.a(i2);
    }

    int j() {
        return this.f2094a.h();
    }

    void k(View view) {
        int iG = this.f2094a.g(view);
        if (iG >= 0) {
            this.f2095b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iG = this.f2094a.g(view);
        if (iG == -1 || this.f2095b.d(iG)) {
            return -1;
        }
        return iG - this.f2095b.b(iG);
    }

    boolean n(View view) {
        return this.f2096c.contains(view);
    }

    void o() {
        this.f2095b.g();
        for (int size = this.f2096c.size() - 1; size >= 0; size--) {
            this.f2094a.c(this.f2096c.get(size));
            this.f2096c.remove(size);
        }
        this.f2094a.j();
    }

    void p(View view) {
        int iG = this.f2094a.g(view);
        if (iG < 0) {
            return;
        }
        if (this.f2095b.f(iG)) {
            t(view);
        }
        this.f2094a.i(iG);
    }

    void q(int i2) {
        int iH = h(i2);
        View viewA = this.f2094a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f2095b.f(iH)) {
            t(viewA);
        }
        this.f2094a.i(iH);
    }

    boolean r(View view) {
        int iG = this.f2094a.g(view);
        if (iG == -1) {
            t(view);
            return true;
        }
        if (!this.f2095b.d(iG)) {
            return false;
        }
        this.f2095b.f(iG);
        t(view);
        this.f2094a.i(iG);
        return true;
    }

    void s(View view) {
        int iG = this.f2094a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f2095b.d(iG)) {
            this.f2095b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2095b.toString() + ", hidden list:" + this.f2096c.size();
    }
}
