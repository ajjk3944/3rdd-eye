package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1175g0;
import b9.C1992A;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f3567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O6.A f3568h;
    public final /* synthetic */ C0672i i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3569j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<C1175g0> f3570k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(v1 v1Var, O6.A a10, C0672i c0672i, A7.d dVar, List<C1175g0> list) {
        super(0);
        this.f3567g = v1Var;
        this.f3568h = a10;
        this.i = c0672i;
        this.f3569j = dVar;
        this.f3570k = list;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        C0672i c0672i = this.i;
        v1 v1Var = this.f3567g;
        O6.A a10 = this.f3568h;
        A7.d dVar = this.f3569j;
        C0675l c0675l = c0672i.f2146a;
        c0675l.s(new C0754s(v1Var, c0675l, dVar, this.f3570k, a10, 1));
        return C1992A.f18074a;
    }
}
