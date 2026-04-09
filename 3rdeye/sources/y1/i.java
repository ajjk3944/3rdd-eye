package Y1;

import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class i extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Z1.h<Boolean> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13717b = 9;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13717b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16886e;
    }

    @Override // Y1.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
