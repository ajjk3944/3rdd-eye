package E9;

import A9.E;
import C9.w;
import D9.C0646h;
import D9.InterfaceC0645g;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: ChannelFlow.kt */
@h9.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1491l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1492m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0645g<Object> f1493n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g<Object> f1494o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC0645g<Object> interfaceC0645g, g<Object> gVar, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1493n = interfaceC0645g;
        this.f1494o = gVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        e eVar = new e(this.f1493n, this.f1494o, interfaceC4347e);
        eVar.f1492m = obj;
        return eVar;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = g9.a.COROUTINE_SUSPENDED;
        int i = this.f1491l;
        if (i == 0) {
            b9.n.b(obj);
            w<Object> wVarF = this.f1494o.f((E) this.f1492m);
            this.f1491l = 1;
            Object objA = C0646h.a(this.f1493n, wVarF, true, this);
            if (objA != obj2) {
                objA = C1992A.f18074a;
            }
            if (objA == obj2) {
                return obj2;
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
