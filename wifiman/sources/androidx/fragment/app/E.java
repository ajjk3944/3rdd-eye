package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC4013k;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private final n f31191a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f31192b;

    /* renamed from: d, reason: collision with root package name */
    int f31194d;

    /* renamed from: e, reason: collision with root package name */
    int f31195e;

    /* renamed from: f, reason: collision with root package name */
    int f31196f;

    /* renamed from: g, reason: collision with root package name */
    int f31197g;

    /* renamed from: h, reason: collision with root package name */
    int f31198h;

    /* renamed from: i, reason: collision with root package name */
    boolean f31199i;

    /* renamed from: k, reason: collision with root package name */
    String f31201k;

    /* renamed from: l, reason: collision with root package name */
    int f31202l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f31203m;

    /* renamed from: n, reason: collision with root package name */
    int f31204n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f31205o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f31206p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f31207q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f31209s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f31193c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f31200j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f31208r = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f31210a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f31211b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31212c;

        /* renamed from: d, reason: collision with root package name */
        int f31213d;

        /* renamed from: e, reason: collision with root package name */
        int f31214e;

        /* renamed from: f, reason: collision with root package name */
        int f31215f;

        /* renamed from: g, reason: collision with root package name */
        int f31216g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC4013k.b f31217h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC4013k.b f31218i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f31210a = i10;
            this.f31211b = fragment;
            this.f31212c = false;
            AbstractC4013k.b bVar = AbstractC4013k.b.RESUMED;
            this.f31217h = bVar;
            this.f31218i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f31210a = i10;
            this.f31211b = fragment;
            this.f31212c = z10;
            AbstractC4013k.b bVar = AbstractC4013k.b.RESUMED;
            this.f31217h = bVar;
            this.f31218i = bVar;
        }
    }

    E(n nVar, ClassLoader classLoader) {
        this.f31191a = nVar;
        this.f31192b = classLoader;
    }

    public E b(int i10, Fragment fragment) {
        l(i10, fragment, null, 1);
        return this;
    }

    public E c(int i10, Fragment fragment, String str) {
        l(i10, fragment, str, 1);
        return this;
    }

    E d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f31229H = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    public E e(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f31193c.add(aVar);
        aVar.f31213d = this.f31194d;
        aVar.f31214e = this.f31195e;
        aVar.f31215f = this.f31196f;
        aVar.f31216g = this.f31197g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public E k() {
        if (this.f31199i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f31200j = false;
        return this;
    }

    void l(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.f31246h1;
        if (str2 != null) {
            V1.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f31274z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f31274z + " now " + str);
            }
            fragment.f31274z = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.f31272x;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f31272x + " now " + i10);
            }
            fragment.f31272x = i10;
            fragment.f31273y = i10;
        }
        f(new a(i11, fragment));
    }

    public E m(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public E n(int i10, Fragment fragment) {
        return o(i10, fragment, null);
    }

    public E o(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, fragment, str, 2);
        return this;
    }

    public E p(boolean z10) {
        this.f31208r = z10;
        return this;
    }
}
