package H;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7567b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f7568c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f7569d = d(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f7570a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n.f7569d;
        }

        public final int b() {
            return n.f7568c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(int i10) {
        this.f7570a = i10;
    }

    public static final /* synthetic */ n c(int i10) {
        return new n(i10);
    }

    private static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof n) && i10 == ((n) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return "TextHighlightType(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f7570a, obj);
    }

    public int hashCode() {
        return g(this.f7570a);
    }

    public final /* synthetic */ int i() {
        return this.f7570a;
    }

    public String toString() {
        return h(this.f7570a);
    }
}
