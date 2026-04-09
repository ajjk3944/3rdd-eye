package f8;

import A9.C0575f;
import A9.E;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import b9.C1992A;
import b9.n;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.toto.TotoOffer;
import f9.InterfaceC4347e;
import h9.i;
import k8.F;
import k8.G;
import k8.H;
import k8.t;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: PremiumViewModel.kt */
@h9.e(c = "com.zipoapps.premium.PremiumViewModel$onCtaButtonClicked$1", f = "PremiumViewModel.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f37860l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4340c<?> f37861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G f37862n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC4342e f37863o;

    /* compiled from: PremiumViewModel.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4342e f37864b;

        public a(AbstractC4342e abstractC4342e) {
            this.f37864b = abstractC4342e;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            if (F.i(((H) obj).f43459a)) {
                this.f37864b.g();
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractActivityC4340c<?> abstractActivityC4340c, G g10, AbstractC4342e abstractC4342e, InterfaceC4347e<? super g> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37861m = abstractActivityC4340c;
        this.f37862n = g10;
        this.f37863o = abstractC4342e;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new g(this.f37861m, this.f37862n, this.f37863o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f37860l;
        if (i == 0) {
            n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            AbstractActivityC4340c<?> abstractActivityC4340c = this.f37861m;
            G offer = this.f37862n;
            l.f(offer, "offer");
            t tVar = eVarA.f37027q;
            tVar.getClass();
            tVar.f43579l = abstractActivityC4340c instanceof RelaunchActivity ? l.b(((RelaunchActivity) abstractActivityC4340c).k().h(), "relaunch") ? TotoOffer.Relaunch : TotoOffer.Fallback : TotoOffer.Onboarding;
            C0575f.e(A2.l.y(abstractActivityC4340c), null, null, new k8.p(offer, tVar, abstractActivityC4340c, null), 3);
            InterfaceC0644f interfaceC0644fC = D9.H.c(tVar.f43577j);
            a aVar2 = new a(this.f37863o);
            this.f37860l = 1;
            if (interfaceC0644fC.b(aVar2, this) == aVar) {
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
