package Q6;

import E.u;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements p9.l<Throwable, CharSequence> {

    /* renamed from: g, reason: collision with root package name */
    public static final f f11326g = new f(1);

    @Override // p9.l
    public final CharSequence invoke(Throwable th) {
        Throwable it = th;
        kotlin.jvm.internal.l.f(it, "it");
        if (!(it instanceof z7.d)) {
            return " - ".concat(u.k(it));
        }
        return " - " + ((z7.d) it).f48476b + ": " + u.k(it);
    }
}
