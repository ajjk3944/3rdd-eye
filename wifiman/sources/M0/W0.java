package m0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52862a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f52863b = c(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52864c = c(1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return W0.f52864c;
        }

        public final int b() {
            return W0.f52863b;
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
}
