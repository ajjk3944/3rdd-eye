package y1;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.w;
import w1.r;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {147}, m = "invokeSuspend")
/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5795f extends h9.i implements p9.p<E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p9.p<r, InterfaceC4347e<Object>, Object> f47941m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w<k> f47942n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5795f(p9.p<? super r, ? super InterfaceC4347e<Object>, ? extends Object> pVar, w<k> wVar, InterfaceC4347e<? super C5795f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47941m = pVar;
        this.f47942n = wVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5795f(this.f47941m, this.f47942n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((C5795f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47940l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        k kVar = this.f47942n.f43660b;
        this.f47940l = 1;
        Object objInvoke = this.f47941m.invoke(kVar, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
