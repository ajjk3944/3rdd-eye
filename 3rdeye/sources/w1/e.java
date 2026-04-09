package w1;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: InvalidationTracker.android.kt */
@h9.e(c = "androidx.room.InvalidationTracker$syncBlocking$1", f = "InvalidationTracker.android.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f47219l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.room.c f47220m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.room.c cVar, InterfaceC4347e<? super e> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47220m = cVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new e(this.f47220m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47219l;
        if (i == 0) {
            b9.n.b(obj);
            this.f47219l = 1;
            if (this.f47220m.a(this) == aVar) {
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
