package J0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9593b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f9594c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f9595d = d(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f9596a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f9595d;
        }

        public final int b() {
            return e.f9594c;
        }

        private a() {
        }
    }

    private /* synthetic */ e(int i10) {
        this.f9596a = i10;
    }

    public static final /* synthetic */ e c(int i10) {
        return new e(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f9594c) ? "Polite" : f(i10, f9595d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f9596a, obj);
    }

    public int hashCode() {
        return g(this.f9596a);
    }

    public final /* synthetic */ int i() {
        return this.f9596a;
    }

    public String toString() {
        return h(this.f9596a);
    }
}
