package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52924a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52925b = d(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52926c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52927d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k1.f52925b;
        }

        public final int b() {
            return k1.f52926c;
        }

        public final int c() {
            return k1.f52927d;
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
        return e(i10, f52925b) ? "Butt" : e(i10, f52926c) ? "Round" : e(i10, f52927d) ? "Square" : "Unknown";
    }
}
