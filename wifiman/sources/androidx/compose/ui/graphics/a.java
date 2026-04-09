package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1065a f28894a = new C1065a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f28895b = d(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f28896c = d(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f28897d = d(2);

    /* renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    public static final class C1065a {
        public /* synthetic */ C1065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f28895b;
        }

        public final int b() {
            return a.f28897d;
        }

        public final int c() {
            return a.f28896c;
        }

        private C1065a() {
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
        return "CompositingStrategy(value=" + i10 + ')';
    }
}
