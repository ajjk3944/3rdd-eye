package Y1;

import b2.C1842w;
import kotlin.jvm.internal.l;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class b extends d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final int f13702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Z1.c tracker) {
        super(tracker);
        l.f(tracker, "tracker");
        this.f13702b = 5;
    }

    @Override // Y1.d
    public final int a() {
        return this.f13702b;
    }

    @Override // Y1.d
    public final boolean b(C1842w c1842w) {
        return c1842w.f17146j.f16885d;
    }

    @Override // Y1.d
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
