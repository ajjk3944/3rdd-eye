package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    final b f32255a;

    /* renamed from: b, reason: collision with root package name */
    a f32256b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f32257a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f32258b;

        /* renamed from: c, reason: collision with root package name */
        int f32259c;

        /* renamed from: d, reason: collision with root package name */
        int f32260d;

        /* renamed from: e, reason: collision with root package name */
        int f32261e;

        a() {
        }

        void a(int i10) {
            this.f32257a = i10 | this.f32257a;
        }

        boolean b() {
            int i10 = this.f32257a;
            if ((i10 & 7) != 0 && (i10 & c(this.f32260d, this.f32258b)) == 0) {
                return false;
            }
            int i11 = this.f32257a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f32260d, this.f32259c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f32257a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f32261e, this.f32258b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f32257a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f32261e, this.f32259c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f32257a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f32258b = i10;
            this.f32259c = i11;
            this.f32260d = i12;
            this.f32261e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    p(b bVar) {
        this.f32255a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f32255a.c();
        int iD = this.f32255a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f32255a.a(i10);
            this.f32256b.e(iC, iD, this.f32255a.b(viewA), this.f32255a.e(viewA));
            if (i12 != 0) {
                this.f32256b.d();
                this.f32256b.a(i12);
                if (this.f32256b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f32256b.d();
                this.f32256b.a(i13);
                if (this.f32256b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f32256b.e(this.f32255a.c(), this.f32255a.d(), this.f32255a.b(view), this.f32255a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f32256b.d();
        this.f32256b.a(i10);
        return this.f32256b.b();
    }
}
