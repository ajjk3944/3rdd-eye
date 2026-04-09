package v0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8183a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2244a f63351b = new C2244a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f63352c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f63353d = d(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f63354a;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public static final class C2244a {
        public /* synthetic */ C2244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C8183a.f63353d;
        }

        public final int b() {
            return C8183a.f63352c;
        }

        private C2244a() {
        }
    }

    private /* synthetic */ C8183a(int i10) {
        this.f63354a = i10;
    }

    public static final /* synthetic */ C8183a c(int i10) {
        return new C8183a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C8183a) && i10 == ((C8183a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f63352c) ? "Touch" : f(i10, f63353d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f63354a, obj);
    }

    public int hashCode() {
        return g(this.f63354a);
    }

    public final /* synthetic */ int i() {
        return this.f63354a;
    }

    public String toString() {
        return h(this.f63354a);
    }
}
