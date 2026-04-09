package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: m0.E0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6665E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52788a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52789b = c(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52790c = c(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52791d = c(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f52792e = c(3);

    /* renamed from: m0.E0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC6665E0.f52790c;
        }

        public final int b() {
            return AbstractC6665E0.f52789b;
        }

        private a() {
        }
    }

    public static int c(int i10) {
        return i10;
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return d(i10, f52789b) ? "None" : d(i10, f52790c) ? "Low" : d(i10, f52791d) ? "Medium" : d(i10, f52792e) ? "High" : "Unknown";
    }
}
