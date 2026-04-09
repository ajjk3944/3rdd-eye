package d3;

/* renamed from: d3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5293g {

    /* renamed from: d3.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC5293g a() {
        return new C5288b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC5293g d() {
        return new C5288b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC5293g e(long j10) {
        return new C5288b(a.OK, j10);
    }

    public static AbstractC5293g f() {
        return new C5288b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
