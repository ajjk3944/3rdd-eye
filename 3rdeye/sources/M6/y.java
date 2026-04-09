package M6;

import N7.C1175g0;
import b9.C1992A;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: PagerSelectedActionsDispatcher.kt */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f4318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i7.b f4319h;
    public final /* synthetic */ List<C1175g0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, i7.b bVar, List<C1175g0> list) {
        super(0);
        this.f4318g = xVar;
        this.f4319h = bVar;
        this.i = list;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        x xVar = this.f4318g;
        i7.b bVar = this.f4319h;
        xVar.f4313c.d(xVar.f4311a, bVar.f38461b, this.i, "selection", null);
        return C1992A.f18074a;
    }
}
