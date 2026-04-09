package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class l extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final h f1679c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1680d;

    /* renamed from: e, reason: collision with root package name */
    private n f1681e;

    /* renamed from: f, reason: collision with root package name */
    private Fragment f1682f;

    @Deprecated
    public l(h hVar) {
        this(hVar, 0);
    }

    public l(h hVar, int i2) {
        this.f1681e = null;
        this.f1682f = null;
        this.f1679c = hVar;
        this.f1680d = i2;
    }

    private static String o(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f1681e == null) {
            this.f1681e = this.f1679c.a();
        }
        this.f1681e.f(fragment);
        if (fragment == this.f1682f) {
            this.f1682f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        n nVar = this.f1681e;
        if (nVar != null) {
            nVar.e();
            this.f1681e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object f(ViewGroup viewGroup, int i2) {
        if (this.f1681e == null) {
            this.f1681e = this.f1679c.a();
        }
        long jN = n(i2);
        Fragment fragmentC = this.f1679c.c(o(viewGroup.getId(), jN));
        if (fragmentC != null) {
            this.f1681e.d(fragmentC);
        } else {
            fragmentC = m(i2);
            this.f1681e.b(viewGroup.getId(), fragmentC, o(viewGroup.getId(), jN));
        }
        if (fragmentC != this.f1682f) {
            fragmentC.h1(false);
            if (this.f1680d == 1) {
                this.f1681e.i(fragmentC, d.b.STARTED);
            } else {
                fragmentC.m1(false);
            }
        }
        return fragmentC;
    }

    @Override // androidx.viewpager.widget.a
    public boolean g(View view, Object obj) {
        return ((Fragment) obj).J() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void h(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable i() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void j(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f1682f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.h1(false);
                if (this.f1680d == 1) {
                    if (this.f1681e == null) {
                        this.f1681e = this.f1679c.a();
                    }
                    this.f1681e.i(this.f1682f, d.b.STARTED);
                } else {
                    this.f1682f.m1(false);
                }
            }
            fragment.h1(true);
            if (this.f1680d == 1) {
                if (this.f1681e == null) {
                    this.f1681e = this.f1679c.a();
                }
                this.f1681e.i(fragment, d.b.RESUMED);
            } else {
                fragment.m1(true);
            }
            this.f1682f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void l(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment m(int i2);

    public long n(int i2) {
        return i2;
    }
}
