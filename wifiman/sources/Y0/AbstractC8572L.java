package y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8572L {

    /* renamed from: a, reason: collision with root package name */
    public static final a f66233a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f66234b = f(0);

    /* renamed from: c, reason: collision with root package name */
    private static final int f66235c = f(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f66236d = f(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f66237e = f(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f66238f = f(4);

    /* renamed from: y0.L$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC8572L.f66238f;
        }

        public final int b() {
            return AbstractC8572L.f66236d;
        }

        public final int c() {
            return AbstractC8572L.f66237e;
        }

        public final int d() {
            return AbstractC8572L.f66235c;
        }

        public final int e() {
            return AbstractC8572L.f66234b;
        }

        private a() {
        }
    }

    private static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
