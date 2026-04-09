package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23567a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f23568b = d(1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f23569c = d(2);

    /* renamed from: d, reason: collision with root package name */
    private static final int f23570d = d(3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t.f23568b;
        }

        public final int b() {
            return t.f23569c;
        }

        public final int c() {
            return t.f23570d;
        }

        private a() {
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f23568b) ? "Clip" : e(i10, f23569c) ? "Ellipsis" : e(i10, f23570d) ? "Visible" : "Invalid";
    }
}
