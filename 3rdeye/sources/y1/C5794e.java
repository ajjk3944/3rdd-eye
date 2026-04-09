package y1;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import w1.r;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {115}, m = "invokeSuspend")
/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5794e extends h9.i implements p9.p<E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h9.i f47938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f47939n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5794e(p9.p<? super r, ? super InterfaceC4347e<Object>, ? extends Object> pVar, k kVar, InterfaceC4347e<? super C5794e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47938m = (h9.i) pVar;
        this.f47939n = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5794e(this.f47938m, this.f47939n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((C5794e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [h9.i, p9.p] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47937l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        this.f47937l = 1;
        Object objInvoke = this.f47938m.invoke(this.f47939n, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
