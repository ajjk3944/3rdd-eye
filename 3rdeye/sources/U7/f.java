package U7;

import A9.C0575f;
import A9.E;
import F9.C0663f;
import H6.B;
import P7.s;
import P7.t;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.J;
import b9.C1992A;
import b9.C2001h;
import b9.l;
import b9.p;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import p9.InterfaceC5480a;
import t8.c;
import va.a;

/* compiled from: InterstitialManager.kt */
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f12507a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f12508b;

    /* renamed from: c, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f12509c;

    /* renamed from: d, reason: collision with root package name */
    public final C4461a f12510d;

    /* renamed from: e, reason: collision with root package name */
    public final p f12511e = C2001h.b(new G2.j(this, 2));

    /* renamed from: f, reason: collision with root package name */
    public final n f12512f;

    /* renamed from: g, reason: collision with root package name */
    public final Q7.a f12513g;

    /* renamed from: h, reason: collision with root package name */
    public m<?> f12514h;
    public B i;

    /* renamed from: j, reason: collision with root package name */
    public long f12515j;

    /* renamed from: k, reason: collision with root package name */
    public int f12516k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f12517l;

    /* renamed from: m, reason: collision with root package name */
    public Long f12518m;

    /* renamed from: n, reason: collision with root package name */
    public Activity f12519n;

    /* renamed from: o, reason: collision with root package name */
    public s f12520o;

    /* compiled from: InterstitialManager.kt */
    @h9.e(c = "com.zipoapps.ads.interstitial.InterstitialManager$preCacheAd$1$1", f = "InterstitialManager.kt", l = {213, 214}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f12521l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f12522m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ f f12523n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Activity f12524o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f12525p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j4, f fVar, Activity activity, String str, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f12522m = j4;
            this.f12523n = fVar;
            this.f12524o = activity;
            this.f12525p = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f12522m, this.f12523n, this.f12524o, this.f12525p, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r1.b(r5.f12524o, r5.f12525p, r6, r5) == r0) goto L15;
         */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r5.f12521l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                b9.n.b(r6)
                goto L3b
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                b9.n.b(r6)
                goto L2a
            L1c:
                b9.n.b(r6)
                r5.f12521l = r3
                long r3 = r5.f12522m
                java.lang.Object r6 = A9.O.a(r3, r5)
                if (r6 != r0) goto L2a
                goto L3a
            L2a:
                U7.f r6 = r5.f12523n
                U7.m<?> r1 = r6.f12514h
                r5.f12521l = r2
                android.app.Activity r2 = r5.f12524o
                java.lang.String r3 = r5.f12525p
                java.lang.Object r6 = r1.b(r2, r3, r6, r5)
                if (r6 != r0) goto L3b
            L3a:
                return r0
            L3b:
                b9.A r6 = b9.C1992A.f18074a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: U7.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(C0663f c0663f, com.zipoapps.premiumhelper.d dVar, l8.b bVar, com.zipoapps.premiumhelper.c cVar, C4461a c4461a) {
        this.f12507a = c0663f;
        this.f12508b = bVar;
        this.f12509c = cVar;
        this.f12510d = c4461a;
        n nVar = new n(c0663f, c4461a);
        this.f12512f = nVar;
        this.f12513g = new Q7.a();
        this.f12514h = nVar.a(bVar);
        this.i = Q7.a.a(bVar);
        dVar.registerActivityLifecycleCallbacks(new e(this));
        d dVar2 = new d(this);
        J j4 = J.f16049j;
        j4.f16055g.addObserver(dVar2);
        j4.f16055g.addObserver(new g(this));
    }

    @Override // U7.c
    public final void a() {
        va.a.f47104a.a("[InterstitialManager] onLoadingStarted", new Object[0]);
        this.f12515j = System.currentTimeMillis();
        t8.c.f46451c.getClass();
        c.a.a().f46454b++;
    }

    @Override // U7.c
    public final void b(Activity activity, t.h hVar) {
        kotlin.jvm.internal.l.f(activity, "activity");
        d();
        K9.d dVar = Z7.a.f14051a;
        Z7.a.a(activity, com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL, hVar.f10796a);
        this.f12520o = null;
        int i = this.f12516k + 1;
        this.f12516k = i;
        e(((long) Math.pow(2.0d, i)) * 1000);
    }

    @Override // U7.c
    public final void c() {
        d();
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        C4461a c4461a = e.a.a().f37021k;
        kotlin.jvm.internal.l.f(c4461a, "<this>");
        c4461a.u("First_interstitial_loaded", new Bundle[0]);
        this.f12516k = 0;
    }

    public final void d() {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f12515j;
        va.a.f47104a.a(Oo.d(jCurrentTimeMillis, "[InterstitialManager] onLoadingFinished:time="), new Object[0]);
        t8.c.f46451c.getClass();
        final t8.c cVarA = c.a.a();
        t8.e.a(new InterfaceC5480a() { // from class: t8.b
            @Override // p9.InterfaceC5480a
            public final Object invoke() {
                l lVar = new l("interstitial_loading_time", Long.valueOf(jCurrentTimeMillis));
                l lVar2 = new l("interstitials_count", Integer.valueOf(cVarA.f46454b));
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                Bundle bundleA = G0.d.a(lVar, lVar2, new l("ads_provider", e.a.a().f37034x.d().name()));
                a.b bVar = va.a.f47104a;
                bVar.o("AdsLoadingPerformance");
                bVar.a(bundleA.toString(), new Object[0]);
                C4461a c4461a = e.a.a().f37021k;
                c4461a.getClass();
                c4461a.r(c4461a.c("Performance_interstitials", false, bundleA));
                return C1992A.f18074a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(long j4) {
        va.a.f47104a.a(Oo.d(j4, "[InterstitialManager] preCacheAd. Delay = "), new Object[0]);
        Activity activity = this.f12519n;
        if (activity != 0) {
            String strJ = this.i.j();
            InterfaceC1790x interfaceC1790x = activity instanceof InterfaceC1790x ? (InterfaceC1790x) activity : null;
            C0575f.e(interfaceC1790x != null ? A2.l.y(interfaceC1790x) : this.f12507a, null, null, new a(j4, this, activity, strJ, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Activity activity, s sVar) throws Throwable {
        Throwable th;
        kotlin.jvm.internal.l.f(activity, "activity");
        a.b bVar = va.a.f47104a;
        bVar.a("[InterstitialManager] showInterstitialAd", new Object[0]);
        if (this.f12509c.j()) {
            bVar.l("[InterstitialManager] User is Premium. Don't show ad for Premium users", new Object[0]);
            sVar.c(t.q.f10813b);
            return;
        }
        l8.b bVar2 = this.f12508b;
        l8.d<Boolean> PH_PREVENT_AD_FRAUD = i8.d.f38533M;
        kotlin.jvm.internal.l.e(PH_PREVENT_AD_FRAUD, "PH_PREVENT_AD_FRAUD");
        if (((Boolean) bVar2.h(PH_PREVENT_AD_FRAUD)).booleanValue() && !this.f12514h.a()) {
            bVar.l("[InterstitialManager] Ad forbidden by AD Fraud", new Object[0]);
            sVar.c(t.b.f10798b);
            return;
        }
        if (!((b) this.f12511e.getValue()).a(sVar.f10794a)) {
            bVar.l("[InterstitialManager] Skip Ad. Capping time not passed", new Object[0]);
            sVar.c(t.l.f10808b);
            return;
        }
        if (!kotlin.jvm.internal.l.b(this.f12517l, Boolean.TRUE)) {
            bVar.l("[InterstitialManager] Skip Ad. App is in background", new Object[0]);
            sVar.c(t.a.f10797b);
            return;
        }
        l8.b bVar3 = this.f12508b;
        l8.d<Integer> PH_BACKGROUND_INTERSTITIAL_THRESHOLD = i8.d.f38572n;
        kotlin.jvm.internal.l.e(PH_BACKGROUND_INTERSTITIAL_THRESHOLD, "PH_BACKGROUND_INTERSTITIAL_THRESHOLD");
        Integer num = (Integer) bVar3.h(PH_BACKGROUND_INTERSTITIAL_THRESHOLD);
        Long l5 = this.f12518m;
        if ((l5 != null ? System.currentTimeMillis() - l5.longValue() : Long.MAX_VALUE) <= num.intValue()) {
            bVar.l("[InterstitialManager] Skip Ad. Background threshold time not passed", new Object[0]);
            sVar.c(t.k.f10807b);
            return;
        }
        synchronized (this) {
            try {
                if (this.f12520o != null) {
                    try {
                        bVar.l("[InterstitialManager] Skip Ad. Previous request still in progress", new Object[0]);
                        sVar.c(t.c.f10799b);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f12520o = sVar;
                C1992A c1992a = C1992A.f18074a;
                String strJ = this.i.j();
                h hVar = new h(this, sVar, activity, sVar.f10794a, sVar.f10795b);
                m<?> mVar = this.f12514h;
                mVar.getClass();
                InterfaceC1790x interfaceC1790x = activity instanceof InterfaceC1790x ? (InterfaceC1790x) activity : null;
                C0575f.e(interfaceC1790x != null ? A2.l.y(interfaceC1790x) : mVar.f12547a, null, null, new j(mVar, activity, strJ, this, hVar, null), 3);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
