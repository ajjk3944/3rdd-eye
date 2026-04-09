package P7;

import P7.x;
import b9.C1992A;
import com.vungle.ads.l0;
import f9.InterfaceC4347e;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$askForConsentIfRequired$2$1", f = "AdManager.kt", l = {164}, m = "invokeSuspend")
/* renamed from: P7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1486c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x.b f10733m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1484a f10734n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1486c(x.b bVar, C1484a c1484a, InterfaceC4347e<? super C1486c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10733m = bVar;
        this.f10734n = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C1486c(this.f10733m, this.f10734n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1486c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10732l;
        if (i == 0) {
            b9.n.b(obj);
            l0.setGDPRStatus(this.f10733m.f10833a == x.c.RESULT_OK, "v1.0.0");
            this.f10732l = 1;
            if (this.f10734n.f(this) == aVar) {
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
