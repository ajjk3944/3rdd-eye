package w4;

import A4.J;
import java.security.GeneralSecurityException;
import s4.AbstractC7911a;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f64431a = new C8266k().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f64432b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f64433c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f64434d;

    static {
        J jU = J.U();
        f64432b = jU;
        f64433c = jU;
        f64434d = jU;
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
        r.f();
        C8263h.d();
        C8266k.p(true);
        if (AbstractC7911a.a()) {
            return;
        }
        C8258c.o(true);
    }
}
