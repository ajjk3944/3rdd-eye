package N;

import C.k0;
import W.F;
import Z.h;
import Z.k;
import Z.k.a;
import a6.C1661j;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.Q0;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.g4;
import com.applovin.impl.l2;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.monetization.ads.mediation.banner.d;
import com.vungle.ads.internal.load.d;
import d0.s;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.C4859p1;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import sa.h;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4379e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f4376b = i;
        this.f4377c = obj;
        this.f4378d = obj2;
        this.f4379e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f4376b) {
            case 0:
                if (!((j) this.f4377c).f4405k) {
                    ((Runnable) this.f4379e).run();
                    break;
                } else {
                    ((Runnable) this.f4378d).run();
                    break;
                }
            case 1:
                F f10 = (F) this.f4377c;
                k0 k0Var = f10.f13131w;
                if (k0Var != null && !k0Var.a()) {
                    f10.f13131w.d();
                }
                k0 k0Var2 = (k0) this.f4378d;
                f10.f13131w = k0Var2;
                Q0 q02 = (Q0) this.f4379e;
                f10.f13132x = q02;
                f10.g(k0Var2, q02, true);
                break;
            case 2:
                Z.k kVar = ((Z.p) this.f4377c).f13966g;
                h.a aVar = (h.a) this.f4378d;
                H.g gVar = (H.g) this.f4379e;
                A2.l.q("AudioStream can not be started when setCallback.", !kVar.f13937d.get());
                kVar.a();
                kVar.f13941h = aVar;
                kVar.i = gVar;
                if (Build.VERSION.SDK_INT >= 29) {
                    k.a aVar2 = kVar.f13943k;
                    if (aVar2 != null) {
                        a0.c.d(kVar.f13934a, aVar2);
                    }
                    if (kVar.f13943k == null) {
                        kVar.f13943k = kVar.new a();
                    }
                    a0.c.c(kVar.f13934a, gVar, kVar.f13943k);
                    break;
                }
                break;
            case 3:
                ((g4) this.f4377c).b((Executor) this.f4378d, (g4.b) this.f4379e);
                break;
            case 4:
                l2.a((MaxAdReviewListener) this.f4377c, (String) this.f4378d, (MaxAd) this.f4379e);
                break;
            case 5:
                ((MaxAdViewImpl) this.f4377c).a((a.InterfaceC0312a) this.f4378d, (EnumC2121h) this.f4379e);
                break;
            case 6:
                ((AppLovinAdServiceImpl) this.f4377c).a((AppLovinAdLoadListener) this.f4378d, (AppLovinAd) this.f4379e);
                break;
            case 7:
                com.monetization.ads.mediation.banner.d.a((com.monetization.ads.mediation.banner.d) this.f4377c, (View) this.f4378d, (d.a) this.f4379e);
                break;
            case 8:
                d.a.m77onResponse$lambda0((com.vungle.ads.internal.load.d) this.f4377c, (C1661j) this.f4378d, (com.vungle.ads.internal.network.d) this.f4379e);
                break;
            case 9:
                com.vungle.ads.internal.network.e.m83sendTpat$lambda2((com.vungle.ads.internal.network.e) this.f4377c, (String) this.f4378d, (String) this.f4379e);
                break;
            case 10:
                s.a aVar3 = (s.a) this.f4377c;
                LinkedHashMap linkedHashMap = aVar3.f37283a;
                InterfaceC1715t0.a aVar4 = (InterfaceC1715t0.a) this.f4378d;
                aVar4.getClass();
                Executor executor = (Executor) this.f4379e;
                executor.getClass();
                linkedHashMap.put(aVar4, executor);
                executor.execute(new B.a(19, aVar4, aVar3.f37284b));
                break;
            case 11:
                ((C4859p1) this.f4377c).b((Context) this.f4378d, (AppMetricaConfig) this.f4379e);
                break;
            case 12:
                h.a aVar5 = h.a.this;
                boolean zIsCanceled = aVar5.f46207c.isCanceled();
                sa.d dVar = (sa.d) this.f4378d;
                if (!zIsCanceled) {
                    dVar.c(aVar5, (sa.u) this.f4379e);
                    break;
                } else {
                    dVar.i(aVar5, new IOException("Canceled"));
                    break;
                }
            default:
                C5658m.a aVar6 = ((C5658m) this.f4377c).f46775z;
                HashSet hashSet = aVar6.f46776a;
                AbstractC1707p abstractC1707p = (AbstractC1707p) this.f4379e;
                hashSet.add(abstractC1707p);
                aVar6.f46777b.put(abstractC1707p, (Executor) this.f4378d);
                break;
        }
    }
}
