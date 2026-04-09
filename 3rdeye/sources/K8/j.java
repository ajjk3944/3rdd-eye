package k8;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$getOffer$2", f = "Billing.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends h9.i implements p9.l<InterfaceC4347e<? super G>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43517l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f43518m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f43519n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, String str, InterfaceC4347e<? super j> interfaceC4347e) {
        super(1, interfaceC4347e);
        this.f43518m = tVar;
        this.f43519n = str;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
        return new j(this.f43518m, this.f43519n, interfaceC4347e);
    }

    @Override // p9.l
    public final Object invoke(InterfaceC4347e<? super G> interfaceC4347e) {
        return ((j) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43517l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        this.f43517l = 1;
        Object objE = t.e(this.f43518m, this.f43519n, this);
        return objE == aVar ? aVar : objE;
    }
}
