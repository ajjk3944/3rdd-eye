package P7;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$prepareConsentInfo$1$1", f = "AdManager.kt", l = {146}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C1484a c1484a, InterfaceC4347e<? super m> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10775m = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new m(this.f10775m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((m) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10774l;
        if (i == 0) {
            b9.n.b(obj);
            this.f10774l = 1;
            if (this.f10775m.f(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
