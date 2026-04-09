package b9;

import b9.m;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class n {
    public static final m.a a(Throwable exception) {
        kotlin.jvm.internal.l.f(exception, "exception");
        return new m.a(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.a) {
            throw ((m.a) obj).f18086b;
        }
    }
}
