package W0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23537b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f23538c = h(1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f23539d = h(2);

    /* renamed from: e, reason: collision with root package name */
    private static final int f23540e = h(3);

    /* renamed from: f, reason: collision with root package name */
    private static final int f23541f = h(4);

    /* renamed from: g, reason: collision with root package name */
    private static final int f23542g = h(5);

    /* renamed from: h, reason: collision with root package name */
    private static final int f23543h = h(PduHandle.NONE);

    /* renamed from: a, reason: collision with root package name */
    private final int f23544a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.f23540e;
        }

        public final int b() {
            return l.f23541f;
        }

        public final int c() {
            return l.f23542g;
        }

        public final int d() {
            return l.f23538c;
        }

        public final int e() {
            return l.f23539d;
        }

        public final int f() {
            return l.f23543h;
        }

        private a() {
        }
    }

    private /* synthetic */ l(int i10) {
        this.f23544a = i10;
    }

    public static final /* synthetic */ l g(int i10) {
        return new l(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof l) && i10 == ((l) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        return j(i10, f23538c) ? "Ltr" : j(i10, f23539d) ? "Rtl" : j(i10, f23540e) ? "Content" : j(i10, f23541f) ? "ContentOrLtr" : j(i10, f23542g) ? "ContentOrRtl" : j(i10, f23543h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f23544a, obj);
    }

    public int hashCode() {
        return k(this.f23544a);
    }

    public final /* synthetic */ int m() {
        return this.f23544a;
    }

    public String toString() {
        return l(this.f23544a);
    }
}
