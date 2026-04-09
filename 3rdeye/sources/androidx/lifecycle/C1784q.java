package androidx.lifecycle;

import A9.C0575f;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Lifecycle.jvm.kt */
@h9.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {55}, m = "invokeSuspend")
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1784q extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f16175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1786t f16176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H8.f f16177n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784q(C1786t c1786t, H8.f fVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16176m = c1786t;
        this.f16177n = fVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C1784q(this.f16176m, this.f16177n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1784q) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f16175l;
        if (i == 0) {
            b9.n.b(obj);
            C1786t c1786t = this.f16176m;
            this.f16175l = 1;
            AbstractC1781n.b bVar = AbstractC1781n.b.CREATED;
            I9.c cVar = A9.U.f211a;
            if (C0575f.h(F9.q.f1782a.R0(), new I(c1786t.f16180b, bVar, this.f16177n, null), this) == aVar) {
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
