package P7;

import b9.C1992A;
import f9.InterfaceC4347e;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager$askForConsentIfRequired$2$1$2", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class z extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f10848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, InterfaceC4347e<? super z> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10848l = xVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new z(this.f10848l, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((z) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        x xVar = this.f10848l;
        Oo.j(xVar.f10824a, "consent_form_was_shown", true);
        xVar.f10828e = true;
        return C1992A.f18074a;
    }
}
