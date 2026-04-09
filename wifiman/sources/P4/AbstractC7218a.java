package p4;

import java.security.GeneralSecurityException;
import s4.AbstractC7911a;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7218a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f57573a = new C7222e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f57574b = new p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f57575c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f57576d = new C7225h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f57577e = new D().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f57578f = new F().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f57579g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f57580h = new H().d();

    /* renamed from: i, reason: collision with root package name */
    public static final A4.J f57581i;

    /* renamed from: j, reason: collision with root package name */
    public static final A4.J f57582j;

    /* renamed from: k, reason: collision with root package name */
    public static final A4.J f57583k;

    static {
        A4.J jU = A4.J.U();
        f57581i = jU;
        f57582j = jU;
        f57583k = jU;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        C7221d.e();
        w4.o.b();
        C7222e.p(true);
        p.o(true);
        if (AbstractC7911a.a()) {
            return;
        }
        C7225h.o(true);
        u.p(true);
        z.m(true);
        D.m(true);
        F.m(true);
        H.m(true);
    }
}
