package androidx.lifecycle;

import A9.C0575f;
import A9.InterfaceC0594o0;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PausingDispatcher.jvm.kt */
@h9.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class I extends h9.i implements p9.p<A9.E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f16044l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16045m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f16046n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n.b f16047o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H8.f f16048p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC1781n abstractC1781n, AbstractC1781n.b bVar, H8.f fVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16046n = abstractC1781n;
        this.f16047o = bVar;
        this.f16048p = fVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        I i = new I(this.f16046n, this.f16047o, this.f16048p, interfaceC4347e);
        i.f16045m = obj;
        return i;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((I) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1783p c1783p;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f16044l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1783p = (C1783p) this.f16045m;
            try {
                b9.n.b(obj);
                c1783p.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                c1783p.a();
                throw th;
            }
        }
        b9.n.b(obj);
        InterfaceC0594o0 interfaceC0594o0 = (InterfaceC0594o0) ((A9.E) this.f16045m).k0().get(InterfaceC0594o0.a.f263b);
        if (interfaceC0594o0 == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        H h10 = new H();
        C1783p c1783p2 = new C1783p(this.f16046n, this.f16047o, h10.f16043c, interfaceC0594o0);
        try {
            H8.f fVar = this.f16048p;
            this.f16045m = c1783p2;
            this.f16044l = 1;
            obj = C0575f.h(h10, fVar, this);
            if (obj == aVar) {
                return aVar;
            }
            c1783p = c1783p2;
            c1783p.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c1783p = c1783p2;
            c1783p.a();
            throw th;
        }
    }
}
