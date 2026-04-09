package K6;

import K6.S;
import N7.C1431y3;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.m implements p9.l<C1431y3.b, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.E f3366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f3367h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(O6.E e4, S s10) {
        super(1);
        this.f3366g = e4;
        this.f3367h = s10;
    }

    @Override // p9.l
    public final C1992A invoke(C1431y3.b bVar) {
        C1431y3.b orientation = bVar;
        kotlin.jvm.internal.l.f(orientation, "orientation");
        this.f3367h.getClass();
        this.f3366g.setWrapDirection(S.a.f3326a[orientation.ordinal()] == 1 ? 0 : 1);
        return C1992A.f18074a;
    }
}
