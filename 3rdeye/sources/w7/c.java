package W7;

import A9.C0583j;
import A9.E;
import A9.I;
import android.app.Activity;
import b9.C1992A;
import b9.n;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;
import va.a;

/* compiled from: ApplovinInterstitialProvider.kt */
@e(c = "com.zipoapps.ads.interstitial.applovin.ApplovinInterstitialProvider$loadInterstitialInternal$2", f = "ApplovinInterstitialProvider.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f13353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U7.c f13354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13355o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Activity f13356p;

    /* compiled from: ApplovinInterstitialProvider.kt */
    public static final class a implements MaxAdRevenueListener {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13357b = new a();

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public final void onAdRevenuePaid(MaxAd ad) {
            l.f(ad, "ad");
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            eVarA.f37021k.l(I.q(ad));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, U7.c cVar, String str, Activity activity, InterfaceC4347e<? super c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13353m = dVar;
        this.f13354n = cVar;
        this.f13355o = str;
        this.f13356p = activity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new c(this.f13353m, this.f13354n, this.f13355o, this.f13356p, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13352l;
        if (i == 0) {
            n.b(obj);
            d dVar = this.f13353m;
            dVar.f12549c.set(true);
            this.f13354n.a();
            a.b bVar = va.a.f47104a;
            StringBuilder sb = new StringBuilder("[InterstitialManager] Applovin start ad loading. AdUnitId=");
            String str = this.f13355o;
            sb.append(str);
            bVar.a(sb.toString(), new Object[0]);
            Activity activity = this.f13356p;
            U7.c cVar = this.f13354n;
            this.f13352l = 1;
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
            c0583j.s();
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(str);
            maxInterstitialAd.setRevenueListener(a.f13357b);
            maxInterstitialAd.setListener(new W7.a(c0583j, cVar, activity, dVar, maxInterstitialAd));
            maxInterstitialAd.loadAd();
            if (c0583j.r() == aVar) {
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
