package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: R0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3470x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19521b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19522c = g(-1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19523d = g(0);

    /* renamed from: e, reason: collision with root package name */
    private static final int f19524e = g(1);

    /* renamed from: f, reason: collision with root package name */
    private static final int f19525f = g(2);

    /* renamed from: g, reason: collision with root package name */
    private static final int f19526g = g(3);

    /* renamed from: a, reason: collision with root package name */
    private final int f19527a;

    /* renamed from: R0.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C3470x.f19524e;
        }

        public final int b() {
            return C3470x.f19523d;
        }

        public final int c() {
            return C3470x.f19526g;
        }

        public final int d() {
            return C3470x.f19522c;
        }

        public final int e() {
            return C3470x.f19525f;
        }

        private a() {
        }
    }

    private /* synthetic */ C3470x(int i10) {
        this.f19527a = i10;
    }

    public static final /* synthetic */ C3470x f(int i10) {
        return new C3470x(i10);
    }

    private static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof C3470x) && i10 == ((C3470x) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f19522c) ? "Unspecified" : i(i10, f19523d) ? "None" : i(i10, f19524e) ? "Characters" : i(i10, f19525f) ? "Words" : i(i10, f19526g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f19527a, obj);
    }

    public int hashCode() {
        return j(this.f19527a);
    }

    public final /* synthetic */ int l() {
        return this.f19527a;
    }

    public String toString() {
        return k(this.f19527a);
    }
}
