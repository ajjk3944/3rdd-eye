package V7;

import A9.C0583j;
import A9.E;
import android.app.Activity;
import b9.C1992A;
import b9.n;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: AdMobInterstitialProvider.kt */
@h9.e(c = "com.zipoapps.ads.interstitial.admob.AdMobInterstitialProvider$loadInterstitialInternal$2", f = "AdMobInterstitialProvider.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f13043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f13044m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U7.c f13045n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f13046o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Activity f13047p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, U7.c cVar, String str, Activity activity, InterfaceC4347e<? super c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f13044m = eVar;
        this.f13045n = cVar;
        this.f13046o = str;
        this.f13047p = activity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new c(this.f13044m, this.f13045n, this.f13046o, this.f13047p, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f13043l;
        if (i == 0) {
            n.b(obj);
            e eVar = this.f13044m;
            eVar.f12549c.set(true);
            this.f13045n.a();
            va.a.f47104a.a("[InterstitialManager] AdMob start ad loading. AdUnitId=" + this.f13046o, new Object[0]);
            Activity activity = this.f13047p;
            String str = this.f13046o;
            U7.c cVar = this.f13045n;
            this.f13043l = 1;
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
            c0583j.s();
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            l.e(adRequestBuild, "build(...)");
            InterstitialAd.load(activity, str, adRequestBuild, new b(c0583j, cVar, activity, eVar, str));
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
