package k8;

import A9.C0583j;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: BillingConnection.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.BillingConnection$connect$result$1", f = "BillingConnection.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class C extends h9.i implements p9.l<InterfaceC4347e<? super J8.E<? extends Integer>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43450l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f43451m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e4, InterfaceC4347e<? super C> interfaceC4347e) {
        super(1, interfaceC4347e);
        this.f43451m = e4;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
        return new C(this.f43451m, interfaceC4347e);
    }

    @Override // p9.l
    public final Object invoke(InterfaceC4347e<? super J8.E<? extends Integer>> interfaceC4347e) {
        return ((C) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43450l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        this.f43450l = 1;
        E e4 = this.f43451m;
        e4.getClass();
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
        c0583j.s();
        e4.f43453a.startConnection(new D(c0583j));
        Object objR = c0583j.r();
        return objR == aVar ? aVar : objR;
    }
}
