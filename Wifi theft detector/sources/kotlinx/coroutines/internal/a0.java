package kotlinx.coroutines.internal;

/* loaded from: classes4.dex */
public abstract class a0 {
    public static Object a(Object obj) {
        return obj;
    }

    public static final z b(Object obj) {
        if (obj == d.f22526a) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.p.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (z) obj;
    }

    public static final boolean c(Object obj) {
        return obj == d.f22526a;
    }
}
