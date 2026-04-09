package l6;

import Z6.d;
import d7.C4278a;

/* compiled from: VariableProperties.kt */
/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5291a extends AbstractC5299i {

    /* renamed from: b, reason: collision with root package name */
    public static final C5291a f43859b = new C5291a();

    @Override // l6.AbstractC5299i
    public final void a(int i, Object obj) throws Z6.f {
        d.c target = (d.c) obj;
        kotlin.jvm.internal.l.f(target, "target");
        target.f(new C4278a(i));
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        d.c target = (d.c) obj;
        kotlin.jvm.internal.l.f(target, "target");
        Object objB = target.b();
        kotlin.jvm.internal.l.d(objB, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Integer.valueOf(((C4278a) objB).f37526a);
    }
}
