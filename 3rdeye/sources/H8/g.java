package H8;

import A9.E;
import b9.C1992A;
import b9.n;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f9.InterfaceC4347e;
import p9.p;

/* compiled from: PHSplashActivity.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$readyForConsentCheck$1", f = "PHSplashActivity.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends h9.i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f2319l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PHSplashActivity f2320m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PHSplashActivity pHSplashActivity, InterfaceC4347e<? super g> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f2320m = pHSplashActivity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new g(this.f2320m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f2319l;
        if (i == 0) {
            n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            B8.a aVar2 = new B8.a(2);
            this.f2319l = 1;
            if (eVarA.f37034x.b(this.f2320m, aVar2, this) == aVar) {
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
