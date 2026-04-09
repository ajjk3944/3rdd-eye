package L0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: L0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3194y {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11198a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f11199b = h(1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f11200c = h(2);

    /* renamed from: d, reason: collision with root package name */
    private static final int f11201d = h(3);

    /* renamed from: e, reason: collision with root package name */
    private static final int f11202e = h(4);

    /* renamed from: f, reason: collision with root package name */
    private static final int f11203f = h(5);

    /* renamed from: g, reason: collision with root package name */
    private static final int f11204g = h(6);

    /* renamed from: h, reason: collision with root package name */
    private static final int f11205h = h(7);

    /* renamed from: L0.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC3194y.f11199b;
        }

        public final int b() {
            return AbstractC3194y.f11201d;
        }

        public final int c() {
            return AbstractC3194y.f11202e;
        }

        public final int d() {
            return AbstractC3194y.f11204g;
        }

        public final int e() {
            return AbstractC3194y.f11205h;
        }

        public final int f() {
            return AbstractC3194y.f11203f;
        }

        public final int g() {
            return AbstractC3194y.f11200c;
        }

        private a() {
        }
    }

    public static int h(int i10) {
        return i10;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f11199b) ? "AboveBaseline" : i(i10, f11200c) ? "Top" : i(i10, f11201d) ? "Bottom" : i(i10, f11202e) ? "Center" : i(i10, f11203f) ? "TextTop" : i(i10, f11204g) ? "TextBottom" : i(i10, f11205h) ? "TextCenter" : "Invalid";
    }
}
