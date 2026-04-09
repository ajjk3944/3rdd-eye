package y8;

/* loaded from: classes4.dex */
public final class n implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25188b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f25189a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ n(long j10) {
        this.f25189a = j10;
    }

    public static final /* synthetic */ n a(long j10) {
        return new n(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).g();
    }

    public static int d(long j10) {
        return androidx.privacysandbox.ads.adservices.topics.d.a(j10);
    }

    public static String f(long j10) {
        return t.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return t.b(g(), ((n) obj).g());
    }

    public boolean equals(Object obj) {
        return c(this.f25189a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f25189a;
    }

    public int hashCode() {
        return d(this.f25189a);
    }

    public String toString() {
        return f(this.f25189a);
    }

    public static long b(long j10) {
        return j10;
    }
}
