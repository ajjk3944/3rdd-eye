package com.ui.wmw.wifi;

import Mf.s;
import Zg.AbstractC3689v;
import Zg.d0;
import ch.AbstractC4260a;
import com.ui.common.semver.SemVer;
import com.ui.wmw.WMWizard;
import com.ui.wmw.api.v1.ApiV1WifiScanDone;
import com.ui.wmw.api.v1.ApiV1WifiScanResult;
import com.ui.wmw.api.v1.b;
import com.ui.wmw.wifi.WmwWifiScanResultProcessor;
import com.ui.wmw.wifi.a;
import com.ui.wmw.wifi.b;
import gg.AbstractC5912b;
import gg.D;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import h9.C5969a;
import hg.InterfaceC6043c;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class b implements a.InterfaceC1679a {

    /* renamed from: a, reason: collision with root package name */
    private final com.ui.wmw.api.v1.a f45540a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f45541b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f45542c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f45543d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f45544e;

    /* renamed from: f, reason: collision with root package name */
    private final Fg.a f45545f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f45546g;

    /* renamed from: h, reason: collision with root package name */
    private final gg.i f45547h;

    static final class a implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45548a = new a();

        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
        }
    }

    /* renamed from: com.ui.wmw.wifi.b$b, reason: collision with other inner class name */
    static final class C1680b implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final C1680b f45549a = new C1680b();

        C1680b() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(b.e it) {
            AbstractC6492s.i(it, "it");
            return it.a().b() == ApiV1WifiScanDone.a.DONE;
        }
    }

    static final class c implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Kf.e f45551b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f45552a;

            a(b bVar) {
                this.f45552a = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c() {
                return "Failed to parse WMW scan result";
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set apply(ApiV1WifiScanResult results) {
                AbstractC6492s.i(results, "results");
                HashSet hashSet = new HashSet();
                List<ApiV1WifiScanResult.Result> results2 = results.getResults();
                if (results2 != null) {
                    b bVar = this.f45552a;
                    for (ApiV1WifiScanResult.Result result : results2) {
                        if (result != null) {
                            try {
                                hashSet.add(bVar.i(result));
                            } catch (WmwWifiScanResultProcessor.InvalidData e10) {
                                Nf.a.b(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.c
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return b.c.a.c();
                                    }
                                }, e10);
                            }
                        }
                    }
                }
                return hashSet;
            }
        }

        /* renamed from: com.ui.wmw.wifi.b$c$b, reason: collision with other inner class name */
        static final class C1681b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Kf.e f45553a;

            /* renamed from: com.ui.wmw.wifi.b$c$b$a */
            static final class a implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final a f45554a = new a();

                a() {
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "WMW scan invalid JSON received";
                }
            }

            /* renamed from: com.ui.wmw.wifi.b$c$b$b, reason: collision with other inner class name */
            public static final class C1682b implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f45555a;

                public C1682b(Throwable th2) {
                    this.f45555a = th2;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Nf.a.b(a.f45554a, this.f45555a);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            C1681b(Kf.e eVar) {
                this.f45553a = eVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (this.f45553a.m().compareTo(new SemVer(1, 8, 0, null, null, 24, null)) >= 0 || !(error instanceof WMWizard.Error.Session.InvalidResponse.Content)) {
                    return error instanceof WMWizard.Error.Session.RequestTimeout ? z.z(d0.e()) : z.p(error);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1682b(error));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR.k(z.z(d0.e()));
            }
        }

        c(Kf.e eVar) {
            this.f45551b = eVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(b.e it) {
            AbstractC6492s.i(it, "it");
            return b.this.f45540a.l().A(new a(b.this)).F(new C1681b(this.f45551b));
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f45556a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Scan results stream failed";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Nf.a.b(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.d
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.d.c();
                }
            }, error);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Kf.e f45557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f45558b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f45559a = new a();

            /* renamed from: com.ui.wmw.wifi.b$e$a$a, reason: collision with other inner class name */
            static final class C1683a implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1683a f45560a = new C1683a();

                C1683a() {
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to stop WiFi scan";
                }
            }

            /* renamed from: com.ui.wmw.wifi.b$e$a$b, reason: collision with other inner class name */
            public static final class C1684b implements InterfaceC5915e {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f45561a;

                public C1684b(Throwable th2) {
                    this.f45561a = th2;
                }

                @Override // gg.InterfaceC5915e
                public final void a(InterfaceC5913c interfaceC5913c) {
                    try {
                        Nf.a.b(C1683a.f45560a, this.f45561a);
                        interfaceC5913c.a();
                    } catch (Throwable th2) {
                        interfaceC5913c.onError(th2);
                    }
                }
            }

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                if (!(it instanceof WMWizard.Error.Session.RequestTimeout)) {
                    return AbstractC5912b.D(it);
                }
                AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1684b(it));
                AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
                return abstractC5912bR;
            }
        }

        /* renamed from: com.ui.wmw.wifi.b$e$b, reason: collision with other inner class name */
        static final class C1685b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final C1685b f45562a = new C1685b();

            C1685b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c() {
                return "WMW Wifi Scan is about to be TURNED OFF";
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.i
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return b.e.C1685b.c();
                    }
                });
            }
        }

        static final class c implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f45563a = new c();

            c() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c() {
                return "WMW Wifi Scan is about to be TURNED ON";
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return b.e.c.c();
                    }
                });
            }
        }

        e(Kf.e eVar, b bVar) {
            this.f45557a = eVar;
            this.f45558b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f() {
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.e
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.e.g();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String g() {
            return "WMW Wifi Scan was TURNED OFF";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h() {
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.f
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.e.i();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String i() {
            return "WMW Wifi Scan was TURNED ON";
        }

        @Override // kg.n
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean fwUploadInProcess) {
            AbstractC6492s.i(fwUploadInProcess, "fwUploadInProcess");
            return fwUploadInProcess.booleanValue() ? this.f45557a.m().compareTo(new SemVer(1, 1, 3, null, null, 24, null)) >= 0 ? this.f45558b.f45540a.h().O(a.f45559a).B(C1685b.f45562a).x(new InterfaceC6464a() { // from class: com.ui.wmw.wifi.g
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.e.f();
                }
            }) : AbstractC5912b.m() : this.f45558b.f45540a.k().B(c.f45563a).x(new InterfaceC6464a() { // from class: com.ui.wmw.wifi.h
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.e.h();
                }
            });
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f45564a = new f();

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "WMW Wifi scan trigger subscribed";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.k
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.f.c();
                }
            });
        }
    }

    public static final class g implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f45566b;

        public g(Set set) {
            this.f45566b = set;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                b.this.f45545f.h(this.f45566b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class h implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f45567a;

        h(Set set) {
            this.f45567a = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(Set set) {
            return "WMW Priority channels set FAILED. Channels: " + AbstractC3689v.z0(set, ",", null, null, 0, null, null, 62, null);
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            final Set set = this.f45567a;
            Nf.a.b(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.l
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.h.c(set);
                }
            }, error);
        }
    }

    static final class i implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final i f45568a = new i();

        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(com.ui.wmw.wifi.a aVar) {
            return "Removed " + aVar.n() + "[" + aVar.c() + "] because it reached cache timeout";
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap accumulator, Set signals) {
            AbstractC6492s.i(accumulator, "accumulator");
            AbstractC6492s.i(signals, "signals");
            Iterator it = signals.iterator();
            while (it.hasNext()) {
                com.ui.wmw.wifi.a aVar = (com.ui.wmw.wifi.a) it.next();
                accumulator.put(aVar.c(), aVar);
            }
            Iterator it2 = accumulator.values().iterator();
            long jCurrentTimeMillis = System.currentTimeMillis() - 20000;
            while (it2.hasNext()) {
                final com.ui.wmw.wifi.a aVar2 = (com.ui.wmw.wifi.a) it2.next();
                if (aVar2.k() < jCurrentTimeMillis) {
                    Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.m
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return b.i.c(aVar2);
                        }
                    });
                    it2.remove();
                }
            }
            return accumulator;
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f45569a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            List listC = AbstractC3689v.c();
            Iterator it2 = it.entrySet().iterator();
            while (it2.hasNext()) {
                listC.add((com.ui.wmw.wifi.a) ((Map.Entry) it2.next()).getValue());
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f45570a = new k();

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((com.ui.wmw.wifi.a) obj).c(), ((com.ui.wmw.wifi.a) obj2).c());
            }
        }

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.X0(it, new a());
        }
    }

    static final class l implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final l f45571a = new l();

        l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(List list) {
            return "WMW Wifi scan cache emitted " + list.size() + " results";
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(final List it) {
            AbstractC6492s.i(it, "it");
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.wifi.n
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return b.l.c(it);
                }
            });
        }
    }

    public b(com.ui.wmw.api.v1.a api, Kf.e sessionState, s fwUploadState) {
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(sessionState, "sessionState");
        AbstractC6492s.i(fwUploadState, "fwUploadState");
        this.f45540a = api;
        AbstractC5912b abstractC5912bW = fwUploadState.a().L1(new e(sessionState, this)).B(f.f45564a).w(new InterfaceC6464a() { // from class: Qf.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wmw.wifi.b.j();
            }
        });
        AbstractC6492s.h(abstractC5912bW, "doFinally(...)");
        this.f45541b = abstractC5912bW;
        gg.i iVarD1 = api.b().d1(EnumC5911a.LATEST);
        AbstractC6492s.h(iVarD1, "toFlowable(...)");
        gg.i iVarZ0 = iVarD1.Z0(b.e.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarK = iVarZ0.m0(C1680b.f45549a).K(new c(sessionState));
        AbstractC6492s.h(iVarK, "concatMapSingle(...)");
        gg.i iVarD0 = com.ui.wmw.f.c(iVarK, true).d0(d.f45556a);
        AbstractC6492s.h(iVarD0, "doOnError(...)");
        this.f45542c = iVarD0;
        gg.i iVarF0 = iVarD0.q1(new ConcurrentHashMap(), i.f45568a).N0(j.f45569a).N0(k.f45570a).W().f0(l.f45571a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        this.f45543d = iVarF0;
        gg.i iVarU0 = iVarF0.f0(a.f45548a).U0(abstractC5912bW);
        AbstractC6492s.h(iVarU0, "mergeWith(...)");
        gg.i iVarI2 = com.ui.wmw.f.c(iVarU0, true).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f45544e = iVarI2;
        Fg.a aVarK2 = Fg.a.k2(d0.e());
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f45545f = aVarK2;
        gg.i iVarI22 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f45546g = iVarI22;
        gg.i iVarK0 = gg.i.K0(d0.i(S8.c.GHZ_2_4, S8.c.GHZ_5));
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f45547h = iVarK0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wmw.wifi.a i(ApiV1WifiScanResult.Result result) {
        C5969a c5969aE;
        Integer numH;
        Boolean boolValueOf;
        Integer numQ;
        Integer numQ2;
        Integer numQ3;
        o oVar = new o(result);
        S8.c cVarF = oVar.f();
        int i10 = oVar.i();
        int iG = oVar.g();
        S8.d dVarJ = oVar.j();
        String bssid = result.getBssid();
        if (bssid == null || (c5969aE = C5969a.f48518b.e(bssid)) == null) {
            throw new WMWizard.Error.Session.CommunicationProtocol("WMW Wifi scan result - invalid mac " + result.getBssid());
        }
        String strO = oVar.o();
        int iK = oVar.k();
        S8.c cVar = S8.c.GHZ_2_4;
        int i11 = (cVarF == cVar && dVarJ == S8.d.MHZ_40) ? i10 : iG;
        if (cVarF == cVar && dVarJ == S8.d.MHZ_40) {
            numH = Integer.valueOf(i10 < iG ? i10 + 4 : i10 - 4);
        } else {
            numH = oVar.h();
        }
        Integer num = numH;
        Set setV = oVar.v();
        S8.l lVarS = oVar.s();
        int iT = oVar.t();
        Integer numValueOf = Integer.valueOf(oVar.n());
        String transmitPower = result.getTransmitPower();
        Integer num2 = (transmitPower == null || (numQ3 = t.q(transmitPower)) == null || numQ3.intValue() <= 0) ? null : numQ3;
        String wifiRTTSupported = result.getWifiRTTSupported();
        if (wifiRTTSupported == null || (numQ2 = t.q(wifiRTTSupported)) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(numQ2.intValue() == 1);
        }
        String channelUtilization = result.getChannelUtilization();
        Float fValueOf = (channelUtilization == null || (numQ = t.q(channelUtilization)) == null) ? null : Float.valueOf(numQ.intValue() / 100.0f);
        String stationCount = result.getStationCount();
        return new com.ui.wmw.wifi.a(c5969aE, strO, cVarF, iK, i10, i11, num, dVarJ, setV, lVarS, iT, numValueOf, num2, boolValueOf, fValueOf, stationCount != null ? t.q(stationCount) : null, oVar.m(), oVar.p(), oVar.w(), System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j() {
        Nf.a.d(new InterfaceC6824a() { // from class: Qf.b
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return com.ui.wmw.wifi.b.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k() {
        return "WMW Wifi scan trigger finished";
    }

    @Override // com.ui.wmw.wifi.a.InterfaceC1679a
    public gg.i a() {
        return this.f45547h;
    }

    @Override // com.ui.wmw.wifi.a.InterfaceC1679a
    public gg.i b() {
        return this.f45544e;
    }

    @Override // com.ui.wmw.wifi.a.InterfaceC1679a
    public AbstractC5912b c(Set channels) {
        AbstractC6492s.i(channels, "channels");
        AbstractC5912b abstractC5912bB = com.ui.wmw.f.b(this.f45540a.e(AbstractC3689v.i1(channels)));
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new g(channels));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bZ = abstractC5912bB.g(abstractC5912bR).z(new h(channels));
        AbstractC6492s.h(abstractC5912bZ, "doOnError(...)");
        return abstractC5912bZ;
    }
}
