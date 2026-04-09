package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52935a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52936b = e(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52937c = e(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52938d = e(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f52939e = e(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return m1.f52936b;
        }

        public final int b() {
            return m1.f52939e;
        }

        public final int c() {
            return m1.f52938d;
        }

        public final int d() {
            return m1.f52937c;
        }

        private a() {
        }
    }

    public static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f52936b) ? "Clamp" : f(i10, f52937c) ? "Repeated" : f(i10, f52938d) ? "Mirror" : f(i10, f52939e) ? "Decal" : "Unknown";
    }
}
