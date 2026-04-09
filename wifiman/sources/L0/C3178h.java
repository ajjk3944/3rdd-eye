package L0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: L0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3178h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f11144b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f11145c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f11146d = e(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f11147e = e(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f11148a;

    /* renamed from: L0.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C3178h.f11147e;
        }

        public final int b() {
            return C3178h.f11145c;
        }

        public final int c() {
            return C3178h.f11146d;
        }

        private a() {
        }
    }

    private /* synthetic */ C3178h(int i10) {
        this.f11148a = i10;
    }

    public static final /* synthetic */ C3178h d(int i10) {
        return new C3178h(i10);
    }

    private static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C3178h) && i10 == ((C3178h) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        if (i10 == f11145c) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == f11146d) {
            return "EmojiSupportMatch.None";
        }
        if (i10 == f11147e) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f11148a, obj);
    }

    public int hashCode() {
        return h(this.f11148a);
    }

    public final /* synthetic */ int j() {
        return this.f11148a;
    }

    public String toString() {
        return i(this.f11148a);
    }
}
