package E9;

import C9.u;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: ChannelFlow.kt */
@h9.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends h9.i implements p9.p<u<Object>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1495l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1496m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g<Object> f1497n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<Object> gVar, InterfaceC4347e<? super f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1497n = gVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        f fVar = new f(this.f1497n, interfaceC4347e);
        fVar.f1496m = obj;
        return fVar;
    }

    @Override // p9.p
    public final Object invoke(u<Object> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((f) create(uVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f1495l;
        if (i == 0) {
            b9.n.b(obj);
            u<? super Object> uVar = (u) this.f1496m;
            this.f1495l = 1;
            if (this.f1497n.d(uVar, this) == aVar) {
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
