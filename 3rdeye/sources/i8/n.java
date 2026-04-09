package i8;

import A9.C0575f;
import A9.E;
import A9.F;
import A9.U;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.concurrent.atomic.AtomicReference;
import s8.C5585a;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$startInitialization$1", f = "PremiumHelper.kt", l = {550}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class n extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super n> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38614m = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new n(this.f38614m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((n) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = g9.a.COROUTINE_SUSPENDED;
        int i = this.f38613l;
        com.zipoapps.premiumhelper.e eVar = this.f38614m;
        com.zipoapps.premiumhelper.d dVar = eVar.f37012a;
        if (i == 0) {
            b9.n.b(obj);
            if (!P5.a.f10654a.getAndSet(true)) {
                P5.b bVar = new P5.b(dVar);
                if (ra.h.f45861a.get()) {
                    throw new IllegalStateException("Already initialized");
                }
                AtomicReference<ra.h> atomicReference = ra.h.f45862b;
                while (!atomicReference.compareAndSet(null, bVar)) {
                    if (atomicReference.get() != null) {
                        throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
                    }
                }
            }
            this.f38613l = 1;
            eVar.e().g("PREMIUM HELPER: 5.0.3", new Object[0]);
            eVar.e().g(eVar.f37020j.toString(), new Object[0]);
            C5585a.f46167c.a(dVar);
            Object objC = F.c(new com.zipoapps.premiumhelper.f(eVar, null), this);
            if (objC != g9.a.COROUTINE_SUSPENDED) {
                objC = C1992A.f18074a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        C0575f.e(F.a(U.f212b), null, null, new D8.b(dVar, null), 3);
        return C1992A.f18074a;
    }
}
