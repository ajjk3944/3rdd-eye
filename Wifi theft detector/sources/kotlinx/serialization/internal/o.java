package kotlinx.serialization.internal;

import kotlin.Result;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f22891a;

    static {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        if (Result.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = Result.b(objB);
        Boolean bool = Boolean.FALSE;
        if (Result.g(objB2)) {
            objB2 = bool;
        }
        f22891a = ((Boolean) objB2).booleanValue();
    }

    public static final x1 a(l9.l factory) {
        kotlin.jvm.internal.p.e(factory, "factory");
        return f22891a ? new t(factory) : new y(factory);
    }

    public static final j1 b(l9.p factory) {
        kotlin.jvm.internal.p.e(factory, "factory");
        return f22891a ? new v(factory) : new z(factory);
    }
}
