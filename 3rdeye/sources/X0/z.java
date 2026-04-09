package X0;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z extends h9.i implements p9.p<E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h9.i f13536m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13537n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(p9.p<Object, ? super InterfaceC4347e<Object>, ? extends Object> pVar, Object obj, InterfaceC4347e<? super z> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13536m = (h9.i) pVar;
        this.f13537n = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new z(this.f13536m, this.f13537n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((z) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13535l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        this.f13535l = 1;
        Object objInvoke = this.f13536m.invoke(this.f13537n, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
