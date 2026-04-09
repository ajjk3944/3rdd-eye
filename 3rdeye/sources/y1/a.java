package Y1;

import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class a extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Z1.h<Boolean> tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13701b = 6;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13701b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16883b;
    }

    @Override // Y1.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
