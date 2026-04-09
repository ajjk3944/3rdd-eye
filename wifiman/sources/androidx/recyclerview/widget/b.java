package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1118b f32114a;

    /* renamed from: b, reason: collision with root package name */
    final a f32115b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List f32116c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f32117a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f32118b;

        a() {
        }

        private void c() {
            if (this.f32118b == null) {
                this.f32118b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f32117a &= ~(1 << i10);
                return;
            }
            a aVar = this.f32118b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f32118b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f32117a) : Long.bitCount(this.f32117a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f32117a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f32117a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f32117a & (1 << i10)) != 0;
            }
            c();
            return this.f32118b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f32118b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f32117a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f32117a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f32118b != null) {
                c();
                this.f32118b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f32118b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f32117a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f32117a = j12;
            long j13 = j10 - 1;
            this.f32117a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f32118b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f32118b.f(0);
            }
            return z10;
        }

        void g() {
            this.f32117a = 0L;
            a aVar = this.f32118b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f32117a |= 1 << i10;
            } else {
                c();
                this.f32118b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f32118b == null) {
                return Long.toBinaryString(this.f32117a);
            }
            return this.f32118b.toString() + "xx" + Long.toBinaryString(this.f32117a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC1118b {
        View a(int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.C f(View view);

        void g(int i10);

        void h(View view);

        void i(View view, int i10);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC1118b interfaceC1118b) {
        this.f32114a = interfaceC1118b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f32114a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f32115b.b(i11));
            if (iB == 0) {
                while (this.f32115b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f32116c.add(view);
        this.f32114a.b(view);
    }

    private boolean t(View view) {
        if (!this.f32116c.remove(view)) {
            return false;
        }
        this.f32114a.h(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f32114a.c() : h(i10);
        this.f32115b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f32114a.i(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f32114a.c() : h(i10);
        this.f32115b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f32114a.k(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f32115b.f(iH);
        this.f32114a.g(iH);
    }

    View e(int i10) {
        int size = this.f32116c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f32116c.get(i11);
            RecyclerView.C cF = this.f32114a.f(view);
            if (cF.m() == i10 && !cF.t() && !cF.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f32114a.a(h(i10));
    }

    int g() {
        return this.f32114a.c() - this.f32116c.size();
    }

    View i(int i10) {
        return this.f32114a.a(i10);
    }

    int j() {
        return this.f32114a.c();
    }

    void k(View view) {
        int iE = this.f32114a.e(view);
        if (iE >= 0) {
            this.f32115b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.f32114a.e(view);
        if (iE == -1 || this.f32115b.d(iE)) {
            return -1;
        }
        return iE - this.f32115b.b(iE);
    }

    boolean n(View view) {
        return this.f32116c.contains(view);
    }

    void o() {
        this.f32115b.g();
        for (int size = this.f32116c.size() - 1; size >= 0; size--) {
            this.f32114a.h((View) this.f32116c.get(size));
            this.f32116c.remove(size);
        }
        this.f32114a.d();
    }

    void p(View view) {
        int iE = this.f32114a.e(view);
        if (iE < 0) {
            return;
        }
        if (this.f32115b.f(iE)) {
            t(view);
        }
        this.f32114a.j(iE);
    }

    void q(int i10) {
        int iH = h(i10);
        View viewA = this.f32114a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f32115b.f(iH)) {
            t(viewA);
        }
        this.f32114a.j(iH);
    }

    boolean r(View view) {
        int iE = this.f32114a.e(view);
        if (iE == -1) {
            t(view);
            return true;
        }
        if (!this.f32115b.d(iE)) {
            return false;
        }
        this.f32115b.f(iE);
        t(view);
        this.f32114a.j(iE);
        return true;
    }

    void s(View view) {
        int iE = this.f32114a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f32115b.d(iE)) {
            this.f32115b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f32115b.toString() + ", hidden list:" + this.f32116c.size();
    }
}
