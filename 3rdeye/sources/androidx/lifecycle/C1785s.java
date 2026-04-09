package androidx.lifecycle;

import A9.C0572d0;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Lifecycle.kt */
@h9.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785s extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f16178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1786t f16179m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785s(C1786t c1786t, InterfaceC4347e<? super C1785s> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16179m = c1786t;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C1785s c1785s = new C1785s(this.f16179m, interfaceC4347e);
        c1785s.f16178l = obj;
        return c1785s;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1785s) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        A9.E e4 = (A9.E) this.f16178l;
        C1786t c1786t = this.f16179m;
        AbstractC1781n abstractC1781n = c1786t.f16180b;
        if (abstractC1781n.getCurrentState().compareTo(AbstractC1781n.b.INITIALIZED) >= 0) {
            abstractC1781n.addObserver(c1786t);
        } else {
            C0572d0.b(e4.k0(), null);
        }
        return C1992A.f18074a;
    }
}
