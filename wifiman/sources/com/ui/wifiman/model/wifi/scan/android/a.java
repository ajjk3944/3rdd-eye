package com.ui.wifiman.model.wifi.scan.android;

import Yg.s;
import Zg.AbstractC3689v;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import ch.AbstractC4260a;
import com.ui.wifiman.model.wifi.scan.android.AndroidWifiSignalFactory;
import fe.u;
import gg.AbstractC5912b;
import gg.EnumC5911a;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.t;
import hg.InterfaceC6043c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import me.InterfaceC6814f;
import tc.InterfaceC8077a;

/* loaded from: classes4.dex */
public final class a implements InterfaceC6814f {

    /* renamed from: m, reason: collision with root package name */
    public static final C1514a f44021m = new C1514a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f44022a;

    /* renamed from: b, reason: collision with root package name */
    private final AndroidWifiSignalFactory f44023b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f44024c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f44025d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f44026e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f44027f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.i f44028g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f44029h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f44030i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f44031j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f44032k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC5912b f44033l;

    /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$a, reason: collision with other inner class name */
    public static final class C1514a {
        public /* synthetic */ C1514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1514a() {
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f44034a;

        /* renamed from: b, reason: collision with root package name */
        private final me.k f44035b;

        public b(long j10, me.k signal) {
            AbstractC6492s.i(signal, "signal");
            this.f44034a = j10;
            this.f44035b = signal;
        }

        public final long a() {
            return this.f44034a;
        }

        public final me.k b() {
            return this.f44035b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f44034a == bVar.f44034a && AbstractC6492s.d(this.f44035b, bVar.f44035b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f44034a) * 31) + this.f44035b.hashCode();
        }

        public String toString() {
            return "DiscoveredSignal(discoverAt=" + this.f44034a + ", signal=" + this.f44035b + ")";
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(Object it) {
            AbstractC6492s.i(it, "it");
            a aVar = a.this;
            List listC = AbstractC3689v.c();
            if (com.ubnt.usurvey.a.f39654r.a().getConfig().r()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<ScanResult> scanResults = aVar.f44022a.getScanResults();
                if (scanResults != null) {
                    Iterator<T> it2 = scanResults.iterator();
                    while (it2.hasNext()) {
                        try {
                            listC.add(new b(jCurrentTimeMillis, aVar.f44023b.a((ScanResult) it2.next())));
                        } catch (AndroidWifiSignalFactory.Error e10) {
                            Z7.b.e("Failed to process Wifi ScanResult", e10, null, 4, null);
                        }
                    }
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44037a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Android Wifi scan returned " + it.size() + " results", null, 2, null);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44038a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long apply(Boolean throttling) {
            AbstractC6492s.i(throttling, "throttling");
            return Long.valueOf(throttling.booleanValue() ? 120000L : 60000L);
        }
    }

    static final class f implements InterfaceC6469f {
        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.g("Scanning DISABLED", "WifiScanner");
            a.this.f44024c.h(Boolean.FALSE);
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe.n f44040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f44041b;

        /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$g$a, reason: collision with other inner class name */
        static final class C1515a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f44042a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f44043b;

            /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$g$a$a, reason: collision with other inner class name */
            static final class C1516a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final C1516a f44044a = new C1516a();

                C1516a() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(Long it) {
                    AbstractC6492s.i(it, "it");
                    Z7.b.g("Scan trigger", "WifiScanner");
                }
            }

            C1515a(long j10, u uVar) {
                this.f44042a = j10;
                this.f44043b = uVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a lastScanAtTimestamp) {
                long j10;
                AbstractC6492s.i(lastScanAtTimestamp, "lastScanAtTimestamp");
                long j11 = this.f44042a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l10 = (Long) lastScanAtTimestamp.b();
                long jLongValue = j11 - (jCurrentTimeMillis - (l10 != null ? l10.longValue() : 0L));
                if (jLongValue > 0) {
                    Z7.b.g("Scan scheduled at " + jLongValue + " ms", "WifiScanner");
                    j10 = jLongValue;
                } else {
                    Z7.b.g("Scan scheduled immediately", "WifiScanner");
                    j10 = 0;
                }
                return gg.i.G0(j10, this.f44042a, TimeUnit.MILLISECONDS, this.f44043b.a()).f0(C1516a.f44044a);
            }
        }

        g(fe.n nVar, u uVar) {
            this.f44040a = nVar;
            this.f44041b = uVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            return ((Boolean) sVar.c()).booleanValue() ? this.f44040a.f("lastScanAt").o0().w(new C1515a(((Number) sVar.a()).longValue(), this.f44041b)) : gg.i.j0();
        }
    }

    static final class h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe.n f44045a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f44046b;

        /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$h$a, reason: collision with other inner class name */
        public static final class C1517a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f44047a;

            public C1517a(a aVar) {
                this.f44047a = aVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.g("WifiManager startScan()", "WifiScanner");
                    try {
                        this.f44047a.f44022a.startScan();
                    } catch (NullPointerException unused) {
                    } catch (Exception e10) {
                        Z7.b.c("startScanError", e10, "WifiScanner");
                    }
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        h(fe.n nVar, a aVar) {
            this.f44045a = nVar;
            this.f44046b = aVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Long it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1517a(this.f44046b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR.g(this.f44045a.j("lastScanAt", Long.valueOf(System.currentTimeMillis())));
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f44048a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long apply(Boolean throttling) {
            AbstractC6492s.i(throttling, "throttling");
            return Long.valueOf(throttling.booleanValue() ? 31000L : 3000L);
        }
    }

    static final class j implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f44049a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(com.ubnt.usurvey.a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.r());
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final k f44050a = new k();

        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            boolean zBooleanValue = ((Boolean) sVar.a()).booleanValue();
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            return Boolean.valueOf(zBooleanValue && ((Boolean) objC).booleanValue());
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Set it) {
            AbstractC6492s.i(it, "it");
            return it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE) ? a.this.f44031j.U0(a.this.f44029h) : gg.i.K0(AbstractC3689v.l());
        }
    }

    static final class m implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final m f44052a = new m();

        m() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap accumulator, s sVar) {
            AbstractC6492s.i(accumulator, "accumulator");
            AbstractC6492s.i(sVar, "<destruct>");
            List<b> list = (List) sVar.a();
            long jLongValue = ((Number) sVar.c()).longValue();
            for (b bVar : list) {
                accumulator.put(bVar.b().b(), bVar);
            }
            Iterator it = accumulator.values().iterator();
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if (bVar2.a() < jCurrentTimeMillis) {
                    Z7.b.h("Removed " + bVar2.b().i() + "[" + bVar2.b().b() + "] because it reached cache timeout", null, 2, null);
                    it.remove();
                }
            }
            return accumulator;
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final n f44053a = new n();

        /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$n$a, reason: collision with other inner class name */
        public static final class C1518a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((me.k) obj).b(), ((me.k) obj2).b());
            }
        }

        n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            List listC = AbstractC3689v.c();
            Iterator it2 = it.entrySet().iterator();
            while (it2.hasNext()) {
                listC.add(((b) ((Map.Entry) it2.next()).getValue()).b());
            }
            return AbstractC3689v.X0(AbstractC3689v.a(listC), new C1518a());
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f44054a = new o();

        /* renamed from: com.ui.wifiman.model.wifi.scan.android.a$o$a, reason: collision with other inner class name */
        public static final class C1519a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(((me.k) obj).b(), ((me.k) obj2).b());
            }
        }

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.X0(it, new C1519a());
        }
    }

    static final class p implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final p f44055a = new p();

        p() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(List it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Wifi scan cache emitted " + it.size() + " results", null, 2, null);
        }
    }

    public a(WifiManager wifiManager, InterfaceC8077a androidOS, com.ui.wifiman.model.android.permissions.d permissionsService, fe.n scanStateManager, AndroidWifiSignalFactory wifiSignalFactory, u schedulers) {
        AbstractC6492s.i(wifiManager, "wifiManager");
        AbstractC6492s.i(androidOS, "androidOS");
        AbstractC6492s.i(permissionsService, "permissionsService");
        AbstractC6492s.i(scanStateManager, "scanStateManager");
        AbstractC6492s.i(wifiSignalFactory, "wifiSignalFactory");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f44022a = wifiManager;
        this.f44023b = wifiSignalFactory;
        Fg.a aVarK2 = Fg.a.k2(Boolean.TRUE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f44024c = aVarK2;
        Ag.c cVar = Ag.c.f753a;
        gg.i iVarN0 = com.ubnt.usurvey.a.f39654r.a().b().N0(j.f44049a);
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarI2 = cVar.a(iVarN0, aVarK2).N0(k.f44050a).e1().Y0(schedulers.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f44025d = iVarI2;
        gg.i iVarI22 = gg.i.N(new gg.k() { // from class: me.h
            @Override // gg.k
            public final void a(gg.j jVar) {
                com.ui.wifiman.model.wifi.scan.android.a.n(this.f53982a, jVar);
            }
        }, EnumC5911a.LATEST).F1(schedulers.a()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f44026e = iVarI22;
        gg.i iVarI23 = m().N0(i.f44048a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f44027f = iVarI23;
        gg.i iVarI24 = m().N0(e.f44038a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f44028g = iVarI24;
        AbstractC5912b abstractC5912bT0 = cVar.a(iVarI23, iVarI2).W().e1().I1(new g(scanStateManager, schedulers)).e1().Y0(schedulers.a(), false, 1).t0(new h(scanStateManager, this));
        AbstractC6492s.h(abstractC5912bT0, "flatMapCompletable(...)");
        this.f44029h = abstractC5912bT0;
        gg.i iVarF0 = gg.i.Q0(androidOS.a(new IntentFilter("android.net.wifi.SCAN_RESULTS")), gg.i.G0(0L, 2000L, TimeUnit.MILLISECONDS, schedulers.a())).e1().Y0(schedulers.a(), false, 1).N0(new c()).f0(d.f44037a);
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        this.f44030i = iVarF0;
        gg.i iVarF02 = cVar.a(iVarF0, iVarI24).q1(new ConcurrentHashMap(), m.f44052a).N0(n.f44053a).N0(o.f44054a).W().f0(p.f44055a);
        AbstractC6492s.h(iVarF02, "doOnNext(...)");
        this.f44031j = iVarF02;
        gg.i iVarI25 = permissionsService.b().I1(new l()).o1(1).i2();
        AbstractC6492s.h(iVarI25, "refCount(...)");
        this.f44032k = iVarI25;
        AbstractC5912b abstractC5912bF0 = gg.s.o(new gg.u() { // from class: me.i
            @Override // gg.u
            public final void a(gg.t tVar) {
                com.ui.wifiman.model.wifi.scan.android.a.k(tVar);
            }
        }).G(new f()).A(new InterfaceC6464a() { // from class: me.j
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.wifi.scan.android.a.l(this.f53983a);
            }
        }).x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f44033l = abstractC5912bF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(t it) {
        AbstractC6492s.i(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        Z7.b.g("Scanning ENABLED", "WifiScanner");
        aVar.f44024c.h(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(a aVar, gg.j it) {
        AbstractC6492s.i(it, "it");
        int i10 = Build.VERSION.SDK_INT;
        boolean zIsScanThrottleEnabled = false;
        if (i10 >= 28) {
            if (i10 >= 28 && i10 < 30) {
                zIsScanThrottleEnabled = true;
            } else if (i10 >= 30) {
                zIsScanThrottleEnabled = aVar.f44022a.isScanThrottleEnabled();
            }
        }
        it.h(Boolean.valueOf(zIsScanThrottleEnabled));
    }

    @Override // me.InterfaceC6814f
    public gg.i a() {
        return this.f44032k;
    }

    @Override // me.InterfaceC6814f
    public AbstractC5912b b() {
        return this.f44033l;
    }

    public gg.i m() {
        return this.f44026e;
    }
}
