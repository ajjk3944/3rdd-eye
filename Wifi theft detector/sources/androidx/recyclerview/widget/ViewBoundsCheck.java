package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ViewBoundsCheck {

    /* renamed from: a, reason: collision with root package name */
    public final b f3859a;

    /* renamed from: b, reason: collision with root package name */
    public a f3860b = new a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3861a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f3862b;

        /* renamed from: c, reason: collision with root package name */
        public int f3863c;

        /* renamed from: d, reason: collision with root package name */
        public int f3864d;

        /* renamed from: e, reason: collision with root package name */
        public int f3865e;

        public void a(int i10) {
            this.f3861a = i10 | this.f3861a;
        }

        public boolean b() {
            int i10 = this.f3861a;
            if ((i10 & 7) != 0 && (i10 & c(this.f3864d, this.f3862b)) == 0) {
                return false;
            }
            int i11 = this.f3861a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3864d, this.f3863c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3861a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3865e, this.f3862b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3861a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3865e, this.f3863c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f3861a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f3862b = i10;
            this.f3863c = i11;
            this.f3864d = i12;
            this.f3865e = i13;
        }
    }

    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public ViewBoundsCheck(b bVar) {
        this.f3859a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iC = this.f3859a.c();
        int iD = this.f3859a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f3859a.a(i10);
            this.f3860b.e(iC, iD, this.f3859a.b(viewA), this.f3859a.e(viewA));
            if (i12 != 0) {
                this.f3860b.d();
                this.f3860b.a(i12);
                if (this.f3860b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f3860b.d();
                this.f3860b.a(i13);
                if (this.f3860b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f3860b.e(this.f3859a.c(), this.f3859a.d(), this.f3859a.b(view), this.f3859a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3860b.d();
        this.f3860b.a(i10);
        return this.f3860b.b();
    }
}
