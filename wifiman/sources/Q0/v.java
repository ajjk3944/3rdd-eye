package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19100b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19101c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19102d = d(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f19103a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v.f19102d;
        }

        public final int b() {
            return v.f19101c;
        }

        private a() {
        }
    }

    private /* synthetic */ v(int i10) {
        this.f19103a = i10;
    }

    public static final /* synthetic */ v c(int i10) {
        return new v(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof v) && i10 == ((v) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f19101c) ? "Normal" : f(i10, f19102d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f19103a, obj);
    }

    public int hashCode() {
        return g(this.f19103a);
    }

    public final /* synthetic */ int i() {
        return this.f19103a;
    }

    public String toString() {
        return h(this.f19103a);
    }
}
