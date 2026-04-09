package t;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8014a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2165a f61650b = new C2165a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final C8014a f61651c = new C8014a("text/*");

    /* renamed from: d, reason: collision with root package name */
    private static final C8014a f61652d = new C8014a("text/plain");

    /* renamed from: e, reason: collision with root package name */
    private static final C8014a f61653e = new C8014a("text/html");

    /* renamed from: f, reason: collision with root package name */
    private static final C8014a f61654f = new C8014a("image/*");

    /* renamed from: g, reason: collision with root package name */
    private static final C8014a f61655g = new C8014a("*/*");

    /* renamed from: a, reason: collision with root package name */
    private final String f61656a;

    /* renamed from: t.a$a, reason: collision with other inner class name */
    public static final class C2165a {
        public /* synthetic */ C2165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8014a a() {
            return C8014a.f61655g;
        }

        public final C8014a b() {
            return C8014a.f61651c;
        }

        private C2165a() {
        }
    }

    public C8014a(String str) {
        this.f61656a = str;
    }

    public final String c() {
        return this.f61656a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8014a) {
            return AbstractC6492s.d(this.f61656a, ((C8014a) obj).f61656a);
        }
        return false;
    }

    public int hashCode() {
        return this.f61656a.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.f61656a + "')";
    }
}
