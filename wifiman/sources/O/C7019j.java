package o;

import org.snmp4j.smi.Counter32;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7019j {

    /* renamed from: a, reason: collision with root package name */
    public final long f54977a;

    private /* synthetic */ C7019j(long j10) {
        this.f54977a = j10;
    }

    public static final /* synthetic */ C7019j a(long j10) {
        return new C7019j(j10);
    }

    public static long b(int i10, int i11) {
        return c((i11 & Counter32.MAX_COUNTER32_VALUE) | (i10 << 32));
    }

    public static long c(long j10) {
        return j10;
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C7019j) && j10 == ((C7019j) obj).i();
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & Counter32.MAX_COUNTER32_VALUE);
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f54977a, obj);
    }

    public int hashCode() {
        return g(this.f54977a);
    }

    public final /* synthetic */ long i() {
        return this.f54977a;
    }

    public String toString() {
        return h(this.f54977a);
    }
}
