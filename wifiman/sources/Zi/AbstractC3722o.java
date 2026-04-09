package Zi;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: Zi.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3722o {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f25669a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f25669a = z10;
    }

    public static final S0 a(InterfaceC6835l factory) {
        AbstractC6492s.i(factory, "factory");
        return f25669a ? new C3731t(factory) : new C3741y(factory);
    }

    public static final InterfaceC3744z0 b(InterfaceC6839p factory) {
        AbstractC6492s.i(factory, "factory");
        return f25669a ? new C3733u(factory) : new C3743z(factory);
    }
}
