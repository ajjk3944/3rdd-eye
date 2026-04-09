package i8;

import A9.E;
import J8.C0697l;
import P7.C1484a;
import P7.x;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$showConsentDialog$1", f = "PremiumHelper.kt", l = {770}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f38612n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.zipoapps.premiumhelper.e eVar, AppCompatActivity appCompatActivity, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38611m = eVar;
        this.f38612n = appCompatActivity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new m(this.f38611m, this.f38612n, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((m) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f38610l;
        if (i == 0) {
            b9.n.b(obj);
            C1484a c1484a = this.f38611m.f37034x;
            x xVarC = c1484a.c();
            xVarC.getClass();
            AppCompatActivity appCompatActivity = this.f38612n;
            if (xVarC.f10826c == null) {
                xVarC.e(appCompatActivity, null, new C0697l(1));
            }
            x xVarC2 = c1484a.c();
            A2.h hVar = new A2.h(1);
            this.f38610l = 1;
            if (xVarC2.a(appCompatActivity, true, hVar, this) == aVar) {
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
