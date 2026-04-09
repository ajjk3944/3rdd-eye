package l6;

import Z6.d;

/* compiled from: VariableProperties.kt */
/* renamed from: l6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5300j extends AbstractC5299i {

    /* renamed from: b, reason: collision with root package name */
    public static final C5300j f43872b = new C5300j();

    @Override // l6.AbstractC5299i
    public final void a(int i, Object obj) throws Z6.f {
        d.f target = (d.f) obj;
        kotlin.jvm.internal.l.f(target, "target");
        target.f(Long.valueOf(i));
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        d.f target = (d.f) obj;
        kotlin.jvm.internal.l.f(target, "target");
        Object objB = target.b();
        kotlin.jvm.internal.l.d(objB, "null cannot be cast to non-null type kotlin.Long");
        return Integer.valueOf((int) ((Long) objB).longValue());
    }
}
