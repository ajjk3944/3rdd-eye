package F4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5958a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f5959b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f5960c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5961d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5962e;

    /* renamed from: f, reason: collision with root package name */
    private final g f5963f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f5964g;

    public static b c(A a10) {
        return new b(a10, new A[0]);
    }

    public static b d(A a10, A... aArr) {
        return new b(a10, aArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static c l(final Object obj, Class cls) {
        return m(cls).e(new g() { // from class: F4.a
            @Override // F4.g
            public final Object a(d dVar) {
                return c.q(obj, dVar);
            }
        }).c();
    }

    public static b m(Class cls) {
        return e(cls).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }

    public static c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).e(new g() { // from class: F4.b
            @Override // F4.g
            public final Object a(d dVar) {
                return c.r(obj, dVar);
            }
        }).c();
    }

    public Set g() {
        return this.f5960c;
    }

    public g h() {
        return this.f5963f;
    }

    public String i() {
        return this.f5958a;
    }

    public Set j() {
        return this.f5959b;
    }

    public Set k() {
        return this.f5964g;
    }

    public boolean n() {
        return this.f5961d == 1;
    }

    public boolean o() {
        return this.f5961d == 2;
    }

    public boolean p() {
        return this.f5962e == 0;
    }

    public c t(g gVar) {
        return new c(this.f5958a, this.f5959b, this.f5960c, this.f5961d, this.f5962e, gVar, this.f5964g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f5959b.toArray()) + ">{" + this.f5961d + ", type=" + this.f5962e + ", deps=" + Arrays.toString(this.f5960c.toArray()) + "}";
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f5965a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f5966b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f5967c;

        /* renamed from: d, reason: collision with root package name */
        private int f5968d;

        /* renamed from: e, reason: collision with root package name */
        private int f5969e;

        /* renamed from: f, reason: collision with root package name */
        private g f5970f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f5971g;

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f5969e = 1;
            return this;
        }

        private b h(int i10) {
            z.d(this.f5968d == 0, "Instantiation type has already been set.");
            this.f5968d = i10;
            return this;
        }

        private void i(A a10) {
            z.a(!this.f5966b.contains(a10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            z.c(qVar, "Null dependency");
            i(qVar.c());
            this.f5967c.add(qVar);
            return this;
        }

        public c c() {
            z.d(this.f5970f != null, "Missing required property: factory.");
            return new c(this.f5965a, new HashSet(this.f5966b), new HashSet(this.f5967c), this.f5968d, this.f5969e, this.f5970f, this.f5971g);
        }

        public b d() {
            return h(2);
        }

        public b e(g gVar) {
            this.f5970f = (g) z.c(gVar, "Null factory");
            return this;
        }

        public b g(String str) {
            this.f5965a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f5965a = null;
            HashSet hashSet = new HashSet();
            this.f5966b = hashSet;
            this.f5967c = new HashSet();
            this.f5968d = 0;
            this.f5969e = 0;
            this.f5971g = new HashSet();
            z.c(cls, "Null interface");
            hashSet.add(A.b(cls));
            for (Class cls2 : clsArr) {
                z.c(cls2, "Null interface");
                this.f5966b.add(A.b(cls2));
            }
        }

        private b(A a10, A... aArr) {
            this.f5965a = null;
            HashSet hashSet = new HashSet();
            this.f5966b = hashSet;
            this.f5967c = new HashSet();
            this.f5968d = 0;
            this.f5969e = 0;
            this.f5971g = new HashSet();
            z.c(a10, "Null interface");
            hashSet.add(a10);
            for (A a11 : aArr) {
                z.c(a11, "Null interface");
            }
            Collections.addAll(this.f5966b, aArr);
        }
    }

    private c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f5958a = str;
        this.f5959b = Collections.unmodifiableSet(set);
        this.f5960c = Collections.unmodifiableSet(set2);
        this.f5961d = i10;
        this.f5962e = i11;
        this.f5963f = gVar;
        this.f5964g = Collections.unmodifiableSet(set3);
    }
}
