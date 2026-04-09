package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f24553b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f24554c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f24555d = e(4294967296L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f24556e = e(8589934592L);

    /* renamed from: a, reason: collision with root package name */
    private final long f24557a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.f24556e;
        }

        public final long b() {
            return x.f24555d;
        }

        public final long c() {
            return x.f24554c;
        }

        private a() {
        }
    }

    private /* synthetic */ x(long j10) {
        this.f24557a = j10;
    }

    public static final /* synthetic */ x d(long j10) {
        return new x(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).j();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10, f24554c) ? "Unspecified" : g(j10, f24555d) ? "Sp" : g(j10, f24556e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f24557a, obj);
    }

    public int hashCode() {
        return h(this.f24557a);
    }

    public final /* synthetic */ long j() {
        return this.f24557a;
    }

    public String toString() {
        return i(this.f24557a);
    }
}
