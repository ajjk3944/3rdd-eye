package I4;

import A9.I;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f2433a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<s<? super T>> f2434b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<i> f2435c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2436d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2437e;

    /* renamed from: f, reason: collision with root package name */
    public final d<T> f2438f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f2439g;

    public a(String str, Set<s<? super T>> set, Set<i> set2, int i, int i10, d<T> dVar, Set<Class<?>> set3) {
        this.f2433a = str;
        this.f2434b = Collections.unmodifiableSet(set);
        this.f2435c = Collections.unmodifiableSet(set2);
        this.f2436d = i;
        this.f2437e = i10;
        this.f2438f = dVar;
        this.f2439g = Collections.unmodifiableSet(set3);
    }

    public static <T> C0043a<T> a(s<T> sVar) {
        return new C0043a<>(sVar, new s[0]);
    }

    public static <T> C0043a<T> b(Class<T> cls) {
        return new C0043a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> a<T> c(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(s.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            I.l(cls2, "Null interface");
            hashSet.add(s.a(cls2));
        }
        return new a<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new B.f(t10, 6), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f2434b.toArray()) + ">{" + this.f2436d + ", type=" + this.f2437e + ", deps=" + Arrays.toString(this.f2435c.toArray()) + "}";
    }

    /* compiled from: Component.java */
    /* renamed from: I4.a$a, reason: collision with other inner class name */
    public static class C0043a<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f2440a = null;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f2441b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f2442c;

        /* renamed from: d, reason: collision with root package name */
        public int f2443d;

        /* renamed from: e, reason: collision with root package name */
        public int f2444e;

        /* renamed from: f, reason: collision with root package name */
        public d<T> f2445f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet f2446g;

        public C0043a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f2441b = hashSet;
            this.f2442c = new HashSet();
            this.f2443d = 0;
            this.f2444e = 0;
            this.f2446g = new HashSet();
            hashSet.add(s.a(cls));
            for (Class cls2 : clsArr) {
                I.l(cls2, "Null interface");
                this.f2441b.add(s.a(cls2));
            }
        }

        public final void a(i iVar) {
            if (this.f2441b.contains(iVar.f2465a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f2442c.add(iVar);
        }

        public final a<T> b() {
            if (this.f2445f != null) {
                return new a<>(this.f2440a, new HashSet(this.f2441b), new HashSet(this.f2442c), this.f2443d, this.f2444e, this.f2445f, this.f2446g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i) {
            if (!(this.f2443d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f2443d = i;
        }

        public C0043a(s sVar, s[] sVarArr) {
            HashSet hashSet = new HashSet();
            this.f2441b = hashSet;
            this.f2442c = new HashSet();
            this.f2443d = 0;
            this.f2444e = 0;
            this.f2446g = new HashSet();
            hashSet.add(sVar);
            for (s sVar2 : sVarArr) {
                I.l(sVar2, "Null interface");
            }
            Collections.addAll(this.f2441b, sVarArr);
        }
    }
}
