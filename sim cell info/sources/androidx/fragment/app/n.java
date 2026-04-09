package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    int f1698b;

    /* renamed from: c, reason: collision with root package name */
    int f1699c;

    /* renamed from: d, reason: collision with root package name */
    int f1700d;

    /* renamed from: e, reason: collision with root package name */
    int f1701e;

    /* renamed from: f, reason: collision with root package name */
    int f1702f;

    /* renamed from: g, reason: collision with root package name */
    int f1703g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1704h;

    /* renamed from: j, reason: collision with root package name */
    String f1706j;

    /* renamed from: k, reason: collision with root package name */
    int f1707k;

    /* renamed from: l, reason: collision with root package name */
    CharSequence f1708l;

    /* renamed from: m, reason: collision with root package name */
    int f1709m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f1710n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f1711o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f1712p;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Runnable> f1714r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f1697a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f1705i = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f1713q = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f1715a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f1716b;

        /* renamed from: c, reason: collision with root package name */
        int f1717c;

        /* renamed from: d, reason: collision with root package name */
        int f1718d;

        /* renamed from: e, reason: collision with root package name */
        int f1719e;

        /* renamed from: f, reason: collision with root package name */
        int f1720f;

        /* renamed from: g, reason: collision with root package name */
        d.b f1721g;

        /* renamed from: h, reason: collision with root package name */
        d.b f1722h;

        a() {
        }

        a(int i2, Fragment fragment) {
            this.f1715a = i2;
            this.f1716b = fragment;
            d.b bVar = d.b.RESUMED;
            this.f1721g = bVar;
            this.f1722h = bVar;
        }

        a(int i2, Fragment fragment, d.b bVar) {
            this.f1715a = i2;
            this.f1716b = fragment;
            this.f1721g = fragment.S;
            this.f1722h = bVar;
        }
    }

    public n b(int i2, Fragment fragment, String str) {
        h(i2, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.f1697a.add(aVar);
        aVar.f1717c = this.f1698b;
        aVar.f1718d = this.f1699c;
        aVar.f1719e = this.f1700d;
        aVar.f1720f = this.f1701e;
    }

    public n d(Fragment fragment) {
        c(new a(7, fragment));
        return this;
    }

    public abstract void e();

    public n f(Fragment fragment) {
        c(new a(6, fragment));
        return this;
    }

    public n g() {
        if (this.f1704h) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1705i = false;
        return this;
    }

    void h(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f1553y;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f1553y + " now " + str);
            }
            fragment.f1553y = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.f1551w;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f1551w + " now " + i2);
            }
            fragment.f1551w = i2;
            fragment.f1552x = i2;
        }
        c(new a(i3, fragment));
    }

    public n i(Fragment fragment, d.b bVar) {
        c(new a(10, fragment, bVar));
        return this;
    }
}
