package D9;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Collect.kt */
@h9.e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
/* renamed from: D9.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0647i extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1200l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f1201m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647i(t tVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1201m = tVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C0647i(this.f1201m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C0647i) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f1200l;
        if (i == 0) {
            b9.n.b(obj);
            this.f1200l = 1;
            Object objB = this.f1201m.b(E9.n.f1563b, this);
            if (objB != aVar) {
                objB = C1992A.f18074a;
            }
            if (objB == aVar) {
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
