package com.zipoapps.premiumhelper;

import A9.C0583j;
import A9.E;
import F9.C0663f;
import J8.L;
import P7.C1484a;
import U7.a;
import android.content.SharedPreferences;
import androidx.lifecycle.J;
import b9.C1992A;
import b9.n;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.tasks.Tasks;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import f9.InterfaceC4347e;
import h9.i;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.l;
import l8.b;
import p9.p;
import r5.j;
import va.a;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2", f = "PremiumHelper.kt", l = {648, 650, 653, 656, 660, 665, 670, 688}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f37037l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f37038m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f37039n;

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$1", f = "PremiumHelper.kt", l = {633}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37040l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37041m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37041m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f37041m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$3", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends i implements p<E, InterfaceC4347e<? super C6.a>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37042l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37042l = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f37042l, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C6.a> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            e.a aVar2 = com.zipoapps.premiumhelper.e.f37006D;
            com.zipoapps.premiumhelper.e eVar = this.f37042l;
            J j4 = J.f16049j;
            j4.f16055g.addObserver(new com.zipoapps.premiumhelper.g(eVar));
            U7.a aVar3 = eVar.f37024n;
            aVar3.getClass();
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            if (e.a.a().i.j()) {
                a.b bVar = va.a.f47104a;
                bVar.o("a");
                bVar.k("AutoInterstitial are not active. App is purchased.", new Object[0]);
            } else {
                l8.d<Boolean> PH_AUTO_INTERSTITIALS_ENABLED = i8.d.f38570m;
                l.e(PH_AUTO_INTERSTITIALS_ENABLED, "PH_AUTO_INTERSTITIALS_ENABLED");
                if (((Boolean) aVar3.f12493b.h(PH_AUTO_INTERSTITIALS_ENABLED)).booleanValue()) {
                    com.zipoapps.premiumhelper.d dVar = aVar3.f12492a;
                    a.C0175a c0175a = aVar3.f12494c;
                    dVar.unregisterActivityLifecycleCallbacks(c0175a);
                    dVar.registerActivityLifecycleCallbacks(c0175a);
                    a.b bVar2 = va.a.f47104a;
                    bVar2.o("a");
                    bVar2.k("AutoInterstitial callback initialized.", new Object[0]);
                }
            }
            com.zipoapps.premiumhelper.d dVar2 = eVar.f37012a;
            C0663f phScope = eVar.f37014c;
            l.f(phScope, "phScope");
            L shakeDetector = eVar.f37016e;
            l.f(shakeDetector, "shakeDetector");
            C6.a aVar4 = new C6.a();
            j4.f16055g.addObserver(new D8.c(phScope, aVar4, dVar2, shakeDetector, new D8.d(aVar4, dVar2)));
            return aVar4;
        }
    }

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$4", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37043l;

        /* compiled from: PremiumHelper.kt */
        public static final class a implements L.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.zipoapps.premiumhelper.e f37044a;

            public a(com.zipoapps.premiumhelper.e eVar) {
                this.f37044a = eVar;
            }

            @Override // J8.L.a
            public final void a() {
                C1484a c1484a = this.f37044a.f37034x;
                if (c1484a.d() == b.a.APPLOVIN) {
                    if (C1484a.C0122a.f10725a[c1484a.d().ordinal()] == 2) {
                        AppLovinSdk.getInstance(c1484a.f10714a).showMediationDebugger();
                        return;
                    }
                    c1484a.e().c("Current provider doesn't support debug screen. " + c1484a.d(), new Object[0]);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37043l = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(this.f37043l, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            n.b(obj);
            com.zipoapps.premiumhelper.e eVar = this.f37043l;
            if (eVar.f37020j.f43910b.isDebugMode()) {
                if (C1484a.f10713n.contains(eVar.f37034x.d())) {
                    eVar.f37016e.a(new a(eVar));
                }
            }
            return C1992A.f18074a;
        }
    }

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$getPurchasesTask$1", f = "PremiumHelper.kt", l = {641}, m = "invokeSuspend")
    public static final class d extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37045l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37046m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super d> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37046m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new d(this.f37046m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37045l;
            if (i == 0) {
                n.b(obj);
                this.f37045l = 1;
                if (com.zipoapps.premiumhelper.e.b(this.f37046m, this) == aVar) {
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

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$remoteConfigTask$1", f = "PremiumHelper.kt", l = {638}, m = "invokeSuspend")
    public static final class e extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37047l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37048m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super e> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37048m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new e(this.f37048m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((e) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            r5.e eVarB;
            j.a aVar;
            long j4;
            g9.a aVar2 = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37047l;
            if (i == 0) {
                n.b(obj);
                this.f37047l = 1;
                com.zipoapps.premiumhelper.e eVar = this.f37048m;
                boolean zIsDebugMode = eVar.f37020j.f43910b.isDebugMode();
                n8.f fVar = eVar.f37017f;
                fVar.f44422c = zIsDebugMode;
                try {
                    eVarB = ((r5.n) B4.e.c().b(r5.n.class)).b();
                } catch (IllegalStateException unused) {
                    B4.e.f(eVar.f37012a);
                    eVarB = ((r5.n) B4.e.c().b(r5.n.class)).b();
                }
                l.c(eVarB);
                fVar.f44420a = eVarB;
                StartupPerformanceTracker.f37057b.getClass();
                StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.a.a().f37059a;
                if (startupData != null) {
                    startupData.setRemoteConfigStartTimestamp(System.currentTimeMillis());
                }
                C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(this));
                c0583j.s();
                try {
                    aVar = new j.a();
                    aVar.f45701a = com.google.firebase.remoteconfig.internal.c.f23311j;
                    j4 = zIsDebugMode ? 0L : 43200L;
                } catch (Throwable th) {
                    StartupPerformanceTracker.f37057b.getClass();
                    StartupPerformanceTracker.StartupData startupData2 = StartupPerformanceTracker.a.a().f37059a;
                    if (startupData2 != null) {
                        startupData2.setRemoteConfigEndTimestamp(System.currentTimeMillis());
                    }
                    if (c0583j.isActive()) {
                        c0583j.resumeWith(n.a(th));
                    }
                }
                if (j4 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j4 + " is an invalid argument");
                }
                aVar.f45701a = j4;
                final j jVar = new j(aVar);
                long jCurrentTimeMillis = System.currentTimeMillis();
                final r5.e eVar2 = fVar.f44420a;
                if (eVar2 == null) {
                    l.l("firebaseRemoteConfig");
                    throw null;
                }
                l.c(Tasks.call(eVar2.f45691b, new Callable() { // from class: r5.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        e eVar3 = eVar2;
                        j jVar2 = jVar;
                        com.google.firebase.remoteconfig.internal.d dVar = eVar3.f45696g;
                        synchronized (dVar.f23327b) {
                            SharedPreferences.Editor editorEdit = dVar.f23326a.edit();
                            jVar2.getClass();
                            editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", jVar2.f45700a).commit();
                        }
                        return null;
                    }
                }).continueWithTask(new n8.e(fVar, jCurrentTimeMillis, zIsDebugMode, c0583j)));
                Object objR = c0583j.r();
                if (objR != g9.a.COROUTINE_SUSPENDED) {
                    objR = C1992A.f18074a;
                }
                if (objR == aVar2) {
                    return aVar2;
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

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$testyConfigTask$1", f = "PremiumHelper.kt", l = {640}, m = "invokeSuspend")
    /* renamed from: com.zipoapps.premiumhelper.f$f, reason: collision with other inner class name */
    public static final class C0430f extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37049l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37050m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0430f(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super C0430f> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37050m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new C0430f(this.f37050m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((C0430f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37049l;
            if (i == 0) {
                n.b(obj);
                this.f37049l = 1;
                if (com.zipoapps.premiumhelper.e.c(this.f37050m, this) == aVar) {
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

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$totoConfigTask$1", f = "PremiumHelper.kt", l = {639}, m = "invokeSuspend")
    public static final class g extends i implements p<E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37051l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f37052m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super g> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f37052m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new g(this.f37052m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((g) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37051l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            this.f37051l = 1;
            Object objInitToto = this.f37052m.f37033w.initToto(this);
            return objInitToto == aVar ? aVar : objInitToto;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super f> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f37039n = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        f fVar = new f(this.f37039n, interfaceC4347e);
        fVar.f37038m = obj;
        return fVar;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((f) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x019f, code lost:
    
        if (r11.f(r17) == r6) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #0 {Exception -> 0x0031, blocks: (B:9:0x002c, B:35:0x012d, B:38:0x0141), top: B:61:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:9:0x002c, B:35:0x012d, B:38:0x0141), top: B:61:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0197  */
    /* JADX WARN: Type inference failed for: r2v15, types: [A9.L] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
