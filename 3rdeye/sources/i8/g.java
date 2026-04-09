package i8;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$consumeAllRx$1", f = "PremiumHelper.kt", l = {488}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends h9.i implements p9.p<E, InterfaceC4347e<? super J8.E<? extends Integer>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38590m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super g> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38590m = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new g(this.f38590m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super J8.E<? extends Integer>> interfaceC4347e) {
        return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f38589l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        this.f38589l = 1;
        Object objJ = this.f38590m.f37027q.j(this);
        return objJ == aVar ? aVar : objJ;
    }
}
