package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52930a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52931b = d(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52932c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52933d = d(2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l1.f52933d;
        }

        public final int b() {
            return l1.f52931b;
        }

        public final int c() {
            return l1.f52932c;
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
        return e(i10, f52931b) ? "Miter" : e(i10, f52932c) ? "Round" : e(i10, f52933d) ? "Bevel" : "Unknown";
    }
}
