package K6;

import K6.S;
import N7.C1431y3;
import b9.C1992A;

/* compiled from: DivContainerBinder.kt */
/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements p9.l<C1431y3.b, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O6.r f3364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S f3365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(O6.r rVar, S s10) {
        super(1);
        this.f3364g = rVar;
        this.f3365h = s10;
    }

    @Override // p9.l
    public final C1992A invoke(C1431y3.b bVar) {
        C1431y3.b orientation = bVar;
        kotlin.jvm.internal.l.f(orientation, "orientation");
        this.f3365h.getClass();
        this.f3364g.setOrientation(S.a.f3326a[orientation.ordinal()] == 1 ? 0 : 1);
        return C1992A.f18074a;
    }
}
