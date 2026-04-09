package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final k f3391a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f3392b;

    /* renamed from: d, reason: collision with root package name */
    public int f3394d;

    /* renamed from: e, reason: collision with root package name */
    public int f3395e;

    /* renamed from: f, reason: collision with root package name */
    public int f3396f;

    /* renamed from: g, reason: collision with root package name */
    public int f3397g;

    /* renamed from: h, reason: collision with root package name */
    public int f3398h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3399i;

    /* renamed from: k, reason: collision with root package name */
    public String f3401k;

    /* renamed from: l, reason: collision with root package name */
    public int f3402l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3403m;

    /* renamed from: n, reason: collision with root package name */
    public int f3404n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f3405o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3406p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3407q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f3409s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3393c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f3400j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3408r = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3410a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f3411b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3412c;

        /* renamed from: d, reason: collision with root package name */
        public int f3413d;

        /* renamed from: e, reason: collision with root package name */
        public int f3414e;

        /* renamed from: f, reason: collision with root package name */
        public int f3415f;

        /* renamed from: g, reason: collision with root package name */
        public int f3416g;

        /* renamed from: h, reason: collision with root package name */
        public Lifecycle.State f3417h;

        /* renamed from: i, reason: collision with root package name */
        public Lifecycle.State f3418i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f3410a = i10;
            this.f3411b = fragment;
            this.f3412c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3417h = state;
            this.f3418i = state;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f3410a = i10;
            this.f3411b = fragment;
            this.f3412c = z10;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3417h = state;
            this.f3418i = state;
        }

        public a(int i10, Fragment fragment, Lifecycle.State state) {
            this.f3410a = i10;
            this.f3411b = fragment;
            this.f3412c = false;
            this.f3417h = fragment.mMaxState;
            this.f3418i = state;
        }
    }

    public z(k kVar, ClassLoader classLoader) {
        this.f3391a = kVar;
        this.f3392b = classLoader;
    }

    public z b(int i10, Fragment fragment) {
        l(i10, fragment, null, 1);
        return this;
    }

    public z c(int i10, Fragment fragment, String str) {
        l(i10, fragment, str, 1);
        return this;
    }

    public z d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public z e(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    public void f(a aVar) {
        this.f3393c.add(aVar);
        aVar.f3413d = this.f3394d;
        aVar.f3414e = this.f3395e;
        aVar.f3415f = this.f3396f;
        aVar.f3416g = this.f3397g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public z k() {
        if (this.f3399i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3400j = false;
        return this;
    }

    public void l(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        f(new a(i11, fragment));
    }

    public z m(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public z n(int i10, Fragment fragment) {
        return o(i10, fragment, null);
    }

    public z o(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, fragment, str, 2);
        return this;
    }

    public z p(Fragment fragment, Lifecycle.State state) {
        f(new a(10, fragment, state));
        return this;
    }

    public z q(boolean z10) {
        this.f3408r = z10;
        return this;
    }
}
