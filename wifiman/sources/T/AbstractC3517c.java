package T;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: T.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3517c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(InterfaceC3540l interfaceC3540l, InterfaceC6839p interfaceC6839p) {
        AbstractC6492s.g(interfaceC6839p, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((InterfaceC6839p) kotlin.jvm.internal.V.f(interfaceC6839p, 2)).invoke(interfaceC3540l, 1);
    }
}
