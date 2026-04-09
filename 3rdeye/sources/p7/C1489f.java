package P7;

import D9.InterfaceC0645g;
import D9.J;
import b9.C1992A;
import com.zipoapps.ads.banner.b;
import f9.InterfaceC4347e;
import va.a;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$handleInitComplete$1", f = "AdManager.kt", l = {128}, m = "invokeSuspend")
/* renamed from: P7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1489f extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10743m;

    /* compiled from: AdManager.kt */
    /* renamed from: P7.f$a */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1484a f10744b;

        public a(C1484a c1484a) {
            this.f10744b = c1484a;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            ((Boolean) obj).getClass();
            C1484a c1484a = this.f10744b;
            U7.f fVar = c1484a.f10717d;
            fVar.getClass();
            a.b bVar = va.a.f47104a;
            bVar.a("[InterstitialManager] onAdsProviderInitCompleted", new Object[0]);
            fVar.e(0L);
            c1484a.f10718e.getClass();
            bVar.a("[RewardedManager] onAdsProviderInitCompleted", new Object[0]);
            com.zipoapps.ads.banner.a aVar = c1484a.f10719f;
            aVar.getClass();
            bVar.a("[BannerManager] onAdsProviderInitCompleted", new Object[0]);
            aVar.i.clear();
            aVar.b(new b.C0429b(aVar.f36963b.getResources().getConfiguration().screenWidthDp));
            c1484a.f10720g.getClass();
            bVar.a("[NativeAdManager] onAdsProviderInitCompleted", new Object[0]);
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489f(C1484a c1484a, InterfaceC4347e<? super C1489f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10743m = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C1489f(this.f10743m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1489f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10742l;
        if (i == 0) {
            b9.n.b(obj);
            C1484a c1484a = this.f10743m;
            J j4 = c1484a.f10722j;
            a aVar2 = new a(c1484a);
            this.f10742l = 1;
            Object objB = j4.b(new C1490g(aVar2), this);
            if (objB != aVar) {
                objB = C1992A.f18074a;
            }
            if (objB == aVar) {
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
