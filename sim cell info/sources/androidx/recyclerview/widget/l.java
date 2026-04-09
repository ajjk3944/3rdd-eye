package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    final b f2214a;

    /* renamed from: b, reason: collision with root package name */
    a f2215b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f2216a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f2217b;

        /* renamed from: c, reason: collision with root package name */
        int f2218c;

        /* renamed from: d, reason: collision with root package name */
        int f2219d;

        /* renamed from: e, reason: collision with root package name */
        int f2220e;

        a() {
        }

        void a(int i2) {
            this.f2216a = i2 | this.f2216a;
        }

        boolean b() {
            int i2 = this.f2216a;
            if ((i2 & 7) != 0 && (i2 & (c(this.f2219d, this.f2217b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f2216a;
            if ((i3 & 112) != 0 && (i3 & (c(this.f2219d, this.f2218c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f2216a;
            if ((i4 & 1792) != 0 && (i4 & (c(this.f2220e, this.f2217b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f2216a;
            return (i5 & 28672) == 0 || (i5 & (c(this.f2220e, this.f2218c) << 12)) != 0;
        }

        int c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        void d() {
            this.f2216a = 0;
        }

        void e(int i2, int i3, int i4, int i5) {
            this.f2217b = i2;
            this.f2218c = i3;
            this.f2219d = i4;
            this.f2220e = i5;
        }
    }

    interface b {
        View a(int i2);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    l(b bVar) {
        this.f2214a = bVar;
    }

    View a(int i2, int i3, int i4, int i5) {
        int iC = this.f2214a.c();
        int iB = this.f2214a.b();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewA = this.f2214a.a(i2);
            this.f2215b.e(iC, iB, this.f2214a.e(viewA), this.f2214a.d(viewA));
            if (i4 != 0) {
                this.f2215b.d();
                this.f2215b.a(i4);
                if (this.f2215b.b()) {
                    return viewA;
                }
            }
            if (i5 != 0) {
                this.f2215b.d();
                this.f2215b.a(i5);
                if (this.f2215b.b()) {
                    view = viewA;
                }
            }
            i2 += i6;
        }
        return view;
    }

    boolean b(View view, int i2) {
        this.f2215b.e(this.f2214a.c(), this.f2214a.b(), this.f2214a.e(view), this.f2214a.d(view));
        if (i2 == 0) {
            return false;
        }
        this.f2215b.d();
        this.f2215b.a(i2);
        return this.f2215b.b();
    }
}
