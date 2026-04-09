package w1;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: InvalidationTracker.kt */
@h9.e(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f47310m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B8.c f47311n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u uVar, B8.c cVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47310m = uVar;
        this.f47311n = cVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new y(this.f47310m, this.f47311n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((y) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47309l;
        B8.c cVar = this.f47311n;
        try {
            if (i == 0) {
                b9.n.b(obj);
                u uVar = this.f47310m;
                this.f47309l = 1;
                obj = u.b(uVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            cVar.invoke();
            return C1992A.f18074a;
        } catch (Throwable th) {
            cVar.invoke();
            throw th;
        }
    }
}
