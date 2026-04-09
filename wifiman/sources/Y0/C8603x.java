package y0;

/* renamed from: y0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8603x {

    /* renamed from: a, reason: collision with root package name */
    private final long f66333a;

    private /* synthetic */ C8603x(long j10) {
        this.f66333a = j10;
    }

    public static final /* synthetic */ C8603x a(long j10) {
        return new C8603x(j10);
    }

    public static long b(long j10) {
        return j10;
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C8603x) && j10 == ((C8603x) obj).g();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f66333a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f66333a;
    }

    public int hashCode() {
        return e(this.f66333a);
    }

    public String toString() {
        return f(this.f66333a);
    }
}
