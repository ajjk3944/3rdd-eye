package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0038b f3878a;

    /* renamed from: e, reason: collision with root package name */
    public View f3882e;

    /* renamed from: d, reason: collision with root package name */
    public int f3881d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f3879b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final List f3880c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f3883a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f3884b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f3883a &= ~(1 << i10);
                return;
            }
            a aVar = this.f3884b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.f3884b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f3883a) : Long.bitCount(this.f3883a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f3883a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3883a);
        }

        public final void c() {
            if (this.f3884b == null) {
                this.f3884b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3883a & (1 << i10)) != 0;
            }
            c();
            return this.f3884b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3884b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3883a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3883a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3884b != null) {
                c();
                this.f3884b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3884b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3883a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3883a = j12;
            long j13 = j10 - 1;
            this.f3883a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3884b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3884b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f3883a = 0L;
            a aVar = this.f3884b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f3883a |= 1 << i10;
            } else {
                c();
                this.f3884b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f3884b == null) {
                return Long.toBinaryString(this.f3883a);
            }
            return this.f3884b.toString() + "xx" + Long.toBinaryString(this.f3883a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0038b {
        View a(int i10);

        void addView(View view, int i10);

        void b(View view);

        int c();

        RecyclerView.c0 d(View view);

        void e(int i10);

        void f();

        int g(View view);

        void h(View view);

        void i(int i10);

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public b(InterfaceC0038b interfaceC0038b) {
        this.f3878a = interfaceC0038b;
    }

    public void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f3878a.c() : h(i10);
        this.f3879b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3878a.addView(view, iC);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f3878a.c() : h(i10);
        this.f3879b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3878a.j(view, iC, layoutParams);
    }

    public void d(int i10) {
        int iH = h(i10);
        this.f3879b.f(iH);
        this.f3878a.e(iH);
    }

    public View e(int i10) {
        int size = this.f3880c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f3880c.get(i11);
            RecyclerView.c0 c0VarD = this.f3878a.d(view);
            if (c0VarD.getLayoutPosition() == i10 && !c0VarD.isInvalid() && !c0VarD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f3878a.a(h(i10));
    }

    public int g() {
        return this.f3878a.c() - this.f3880c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f3878a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f3879b.b(i11));
            if (iB == 0) {
                while (this.f3879b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f3878a.a(i10);
    }

    public int j() {
        return this.f3878a.c();
    }

    public void k(View view) {
        int iG = this.f3878a.g(view);
        if (iG >= 0) {
            this.f3879b.h(iG);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f3880c.add(view);
        this.f3878a.b(view);
    }

    public int m(View view) {
        int iG = this.f3878a.g(view);
        if (iG == -1 || this.f3879b.d(iG)) {
            return -1;
        }
        return iG - this.f3879b.b(iG);
    }

    public boolean n(View view) {
        return this.f3880c.contains(view);
    }

    public void o() {
        this.f3879b.g();
        for (int size = this.f3880c.size() - 1; size >= 0; size--) {
            this.f3878a.h((View) this.f3880c.get(size));
            this.f3880c.remove(size);
        }
        this.f3878a.f();
    }

    public void p(View view) {
        int i10 = this.f3881d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f3881d = 1;
            this.f3882e = view;
            int iG = this.f3878a.g(view);
            if (iG >= 0) {
                if (this.f3879b.f(iG)) {
                    t(view);
                }
                this.f3878a.i(iG);
            }
            this.f3881d = 0;
            this.f3882e = null;
        } catch (Throwable th) {
            this.f3881d = 0;
            this.f3882e = null;
            throw th;
        }
    }

    public void q(int i10) {
        int i11 = this.f3881d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f3878a.a(iH);
            if (viewA != null) {
                this.f3881d = 1;
                this.f3882e = viewA;
                if (this.f3879b.f(iH)) {
                    t(viewA);
                }
                this.f3878a.i(iH);
            }
            this.f3881d = 0;
            this.f3882e = null;
        } catch (Throwable th) {
            this.f3881d = 0;
            this.f3882e = null;
            throw th;
        }
    }

    public boolean r(View view) {
        int i10 = this.f3881d;
        if (i10 == 1) {
            if (this.f3882e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f3881d = 2;
            int iG = this.f3878a.g(view);
            if (iG == -1) {
                t(view);
                return true;
            }
            if (!this.f3879b.d(iG)) {
                return false;
            }
            this.f3879b.f(iG);
            t(view);
            this.f3878a.i(iG);
            return true;
        } finally {
            this.f3881d = 0;
        }
    }

    public void s(View view) {
        int iG = this.f3878a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3879b.d(iG)) {
            this.f3879b.a(iG);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f3880c.remove(view)) {
            return false;
        }
        this.f3878a.h(view);
        return true;
    }

    public String toString() {
        return this.f3879b.toString() + ", hidden list:" + this.f3880c.size();
    }
}
