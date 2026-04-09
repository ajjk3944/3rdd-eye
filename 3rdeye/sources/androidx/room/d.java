package androidx.room;

import A9.E;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import p9.p;

/* compiled from: InvalidationTracker.android.kt */
@h9.e(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f16799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f16800m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, InterfaceC4347e<? super d> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16800m = cVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new d(this.f16800m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f16799l;
        if (i == 0) {
            n.b(obj);
            c cVar = this.f16800m;
            this.f16799l = 1;
            if (cVar.f16791c.f(this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        }
        return C1992A.f18074a;
    }
}
