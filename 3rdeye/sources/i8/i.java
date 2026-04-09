package i8;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import va.a;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$initLogger$1", f = "PremiumHelper.kt", l = {582}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class i extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38597m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super i> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38597m = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new i(this.f38597m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((i) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f38596l;
        com.zipoapps.premiumhelper.e eVar = this.f38597m;
        com.zipoapps.premiumhelper.d dVar = eVar.f37012a;
        if (i == 0) {
            b9.n.b(obj);
            if (!eVar.f37020j.f43910b.isDebugMode()) {
                o8.f fVar = o8.f.f44891a;
                this.f38596l = 1;
                obj = fVar.a(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            va.a.f47104a.n(new a.C0540a());
            return C1992A.f18074a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b9.n.b(obj);
        if (((Boolean) obj).booleanValue()) {
            va.a.f47104a.n(new a.C0540a());
        } else {
            va.a.f47104a.n(new r8.b(dVar));
        }
        return C1992A.f18074a;
    }
}
