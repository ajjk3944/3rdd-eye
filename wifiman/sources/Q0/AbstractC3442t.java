package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Q0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3442t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19096a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f19097b = d(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f19098c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f19099d = d(2);

    /* renamed from: Q0.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC3442t.f19099d;
        }

        public final int b() {
            return AbstractC3442t.f19097b;
        }

        public final int c() {
            return AbstractC3442t.f19098c;
        }

        private a() {
        }
    }

    private static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        if (e(i10, f19097b)) {
            return "Blocking";
        }
        if (e(i10, f19098c)) {
            return "Optional";
        }
        if (e(i10, f19099d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }
}
