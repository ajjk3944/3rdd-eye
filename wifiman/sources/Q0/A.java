package Q0;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class A implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f18971b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final A f18972c;

    /* renamed from: d, reason: collision with root package name */
    private static final A f18973d;

    /* renamed from: e, reason: collision with root package name */
    private static final A f18974e;

    /* renamed from: f, reason: collision with root package name */
    private static final A f18975f;

    /* renamed from: g, reason: collision with root package name */
    private static final A f18976g;

    /* renamed from: h, reason: collision with root package name */
    private static final A f18977h;

    /* renamed from: i, reason: collision with root package name */
    private static final A f18978i;

    /* renamed from: j, reason: collision with root package name */
    private static final A f18979j;

    /* renamed from: k, reason: collision with root package name */
    private static final A f18980k;

    /* renamed from: l, reason: collision with root package name */
    private static final A f18981l;

    /* renamed from: m, reason: collision with root package name */
    private static final A f18982m;

    /* renamed from: n, reason: collision with root package name */
    private static final A f18983n;

    /* renamed from: o, reason: collision with root package name */
    private static final A f18984o;

    /* renamed from: p, reason: collision with root package name */
    private static final A f18985p;

    /* renamed from: q, reason: collision with root package name */
    private static final A f18986q;

    /* renamed from: r, reason: collision with root package name */
    private static final A f18987r;

    /* renamed from: s, reason: collision with root package name */
    private static final A f18988s;

    /* renamed from: t, reason: collision with root package name */
    private static final A f18989t;

    /* renamed from: u, reason: collision with root package name */
    private static final List f18990u;

    /* renamed from: a, reason: collision with root package name */
    private final int f18991a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A a() {
            return A.f18989t;
        }

        public final A b() {
            return A.f18987r;
        }

        public final A c() {
            return A.f18983n;
        }

        public final A d() {
            return A.f18985p;
        }

        public final A e() {
            return A.f18984o;
        }

        public final A f() {
            return A.f18975f;
        }

        public final A g() {
            return A.f18976g;
        }

        public final A h() {
            return A.f18977h;
        }

        private a() {
        }
    }

    static {
        A a10 = new A(100);
        f18972c = a10;
        A a11 = new A(200);
        f18973d = a11;
        A a12 = new A(300);
        f18974e = a12;
        A a13 = new A(400);
        f18975f = a13;
        A a14 = new A(500);
        f18976g = a14;
        A a15 = new A(600);
        f18977h = a15;
        A a16 = new A(700);
        f18978i = a16;
        A a17 = new A(800);
        f18979j = a17;
        A a18 = new A(900);
        f18980k = a18;
        f18981l = a10;
        f18982m = a11;
        f18983n = a12;
        f18984o = a13;
        f18985p = a14;
        f18986q = a15;
        f18987r = a16;
        f18988s = a17;
        f18989t = a18;
        f18990u = AbstractC3689v.o(a10, a11, a12, a13, a14, a15, a16, a17, a18);
    }

    public A(int i10) {
        this.f18991a = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.f18991a == ((A) obj).f18991a;
    }

    public int hashCode() {
        return this.f18991a;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(A a10) {
        return AbstractC6492s.k(this.f18991a, a10.f18991a);
    }

    public final int p() {
        return this.f18991a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f18991a + ')';
    }
}
