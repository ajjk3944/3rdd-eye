package Ni;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class A {
    public static Object a(Object obj) {
        return obj;
    }

    public static final z b(Object obj) {
        if (obj == AbstractC3399a.f16586a) {
            throw new IllegalStateException("Does not contain segment");
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (z) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC3399a.f16586a;
    }
}
