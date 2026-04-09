package Td;

import Td.a;
import Vd.a;
import Vd.c;
import Wc.b;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.model.ubiquiti.console.e;
import com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleDevice;
import com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleDevices;
import com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleSiteFeature;
import com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleSpeedtest;
import com.ui.wifiman.model.ubiquiti.console.network.api.Request;
import com.ui.wifiman.model.ubiquiti.console.network.api.Response;
import fe.AbstractC5817h;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import h9.C5969a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6465b;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.AbstractC6561f;
import l9.C6556a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;

/* loaded from: classes4.dex */
public final class d implements Td.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21569g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f21570a;

    /* renamed from: b, reason: collision with root package name */
    private final a.EnumC0795a f21571b;

    /* renamed from: c, reason: collision with root package name */
    private final Ud.a f21572c;

    /* renamed from: d, reason: collision with root package name */
    private final o f21573d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f21574e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f21575f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21576a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(10000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f21577a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(InterfaceC8290a catalogBrowser, ApiUnifiConsoleDevices apiDevices) {
            AbstractC6492s.i(catalogBrowser, "catalogBrowser");
            AbstractC6492s.i(apiDevices, "apiDevices");
            List listC = AbstractC3689v.c();
            List<ApiUnifiConsoleDevice> network = apiDevices.getNetwork();
            if (network != null) {
                for (ApiUnifiConsoleDevice apiUnifiConsoleDevice : network) {
                    String id2 = apiUnifiConsoleDevice.getId();
                    if (id2 != null) {
                        C5969a c5969aC = apiUnifiConsoleDevice.c();
                        inet.ipaddr.g gVarB = apiUnifiConsoleDevice.b();
                        String name = apiUnifiConsoleDevice.getName();
                        a.EnumC0868a enumC0868aF = apiUnifiConsoleDevice.f();
                        String model = apiUnifiConsoleDevice.getModel();
                        String model2 = apiUnifiConsoleDevice.getModel();
                        listC.add(new Vd.a(id2, c5969aC, gVarB, name, model, model2 != null ? (InterfaceC8439a.d) catalogBrowser.d(model2) : null, enumC0868aF));
                    }
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* renamed from: Td.d$d, reason: collision with other inner class name */
    static final class C0796d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0796d f21578a = new C0796d();

        C0796d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(5000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f21579a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(10000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f21580a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vd.b apply(List apiSiteFeatures) {
            Boolean supported;
            AbstractC6492s.i(apiSiteFeatures, "apiSiteFeatures");
            List list = apiSiteFeatures;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((ApiUnifiConsoleSiteFeature) obj).getName(), obj);
            }
            ApiUnifiConsoleSiteFeature apiUnifiConsoleSiteFeature = (ApiUnifiConsoleSiteFeature) linkedHashMap.get(ApiUnifiConsoleSiteFeature.a.SPEED_TEST.getId());
            return new Vd.b((apiUnifiConsoleSiteFeature == null || (supported = apiUnifiConsoleSiteFeature.getSupported()) == null) ? false : supported.booleanValue());
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21581a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(gg.i it) {
            AbstractC6492s.i(it, "it");
            return it.R(5000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConcurrentLinkedQueue f21582a;

        h(ConcurrentLinkedQueue concurrentLinkedQueue) {
            this.f21582a = concurrentLinkedQueue;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Long it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(this.f21582a.size() > 1 ? (Vd.c) this.f21582a.poll() : (Vd.c) this.f21582a.peek());
        }
    }

    static final class i implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConcurrentLinkedQueue f21583a;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ConcurrentLinkedQueue f21584a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f21585b;

            public a(ConcurrentLinkedQueue concurrentLinkedQueue, List list) {
                this.f21584a = concurrentLinkedQueue;
                this.f21585b = list;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f21584a.addAll(this.f21585b);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        i(ConcurrentLinkedQueue concurrentLinkedQueue) {
            this.f21583a = concurrentLinkedQueue;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(List it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(this.f21583a, it));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final j f21586a = new j();

        j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vd.d apply(Response response) throws UnifiConsoleConnectionError.RequestFailed {
            AbstractC6492s.i(response, "response");
            String secret = response.getSecret();
            if (secret == null) {
                throw new UnifiConsoleConnectionError.RequestFailed("no secret in teleport auth request", null, 2, null);
            }
            String token = response.getToken();
            if (token != null) {
                return new Vd.d(secret, token);
            }
            throw new UnifiConsoleConnectionError.RequestFailed("no token in teleport auth request", null, 2, null);
        }
    }

    static final class k implements n {
        k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ApiUnifiConsoleSpeedtest.State it) {
            AbstractC6492s.i(it, "it");
            return d.this.n(it);
        }
    }

    static final class l implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final l f21588a = new l();

        l() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Vd.c it) {
            AbstractC6492s.i(it, "it");
            return it.d() == c.b.FINISHED;
        }
    }

    static final class m implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f21589a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TimeoutException ? gg.i.k0(new UnifiConsoleConnectionError.RequestFailed("Speedtest timeout", error)) : gg.i.k0(error);
        }
    }

    public /* synthetic */ d(String str, a.EnumC0795a enumC0795a, Ud.a aVar, o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC0795a, aVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i j(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (error instanceof UnifiConsoleConnectionError) {
            gg.i iVarK0 = gg.i.K0(new b.a.C0896a(error));
            AbstractC6492s.h(iVarK0, "just(...)");
            return iVarK0;
        }
        gg.i iVarK02 = gg.i.k0(error);
        AbstractC6492s.h(iVarK02, "error(...)");
        return iVarK02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i k(Throwable error) {
        AbstractC6492s.i(error, "error");
        if (error instanceof UnifiConsoleConnectionError) {
            gg.i iVarK0 = gg.i.K0(new b.a.C0896a(error));
            AbstractC6492s.h(iVarK0, "just(...)");
            return iVarK0;
        }
        gg.i iVarK02 = gg.i.k0(error);
        AbstractC6492s.h(iVarK02, "error(...)");
        return iVarK02;
    }

    private final c.a l(ApiUnifiConsoleSpeedtest.State state) {
        ApiUnifiConsoleSpeedtest.State.Server server = state.getServer();
        String countryCode = server != null ? server.getCountryCode() : null;
        ApiUnifiConsoleSpeedtest.State.Server server2 = state.getServer();
        String city = server2 != null ? server2.getCity() : null;
        ApiUnifiConsoleSpeedtest.State.Server server3 = state.getServer();
        String strE = server3 != null ? server3.e() : null;
        ApiUnifiConsoleSpeedtest.State.Server server4 = state.getServer();
        return new c.a(countryCode, city, strE, server4 != null ? server4.getProviderUrl() : null);
    }

    private final gg.i m(gg.i iVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        gg.i iVarN0 = gg.i.F0(0L, 50L, TimeUnit.MILLISECONDS).N0(new h(concurrentLinkedQueue));
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarU0 = AbstractC6561f.e(iVarN0).e1().Y0(Gg.a.a(), false, 1).U0(iVar.D(new i(concurrentLinkedQueue)));
        AbstractC6492s.h(iVarU0, "mergeWith(...)");
        return iVarU0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List n(ApiUnifiConsoleSpeedtest.State state) {
        List progressUpload;
        ArrayList arrayList;
        List progressDownload;
        ApiUnifiConsoleSpeedtest.State.a statusSummary = state.getStatusSummary();
        ApiUnifiConsoleSpeedtest.State.a aVar = ApiUnifiConsoleSpeedtest.State.a.IN_PROGRESS;
        if (statusSummary != aVar) {
            c.b bVar = c.b.FINISHED;
            c.a aVarL = l(state);
            Integer numB = state.b();
            Double dA = state.a();
            Long lValueOf = dA != null ? Long.valueOf((long) (dA.doubleValue() * 1000000.0d)) : null;
            Double dK = state.k();
            return AbstractC3689v.e(new Vd.c(bVar, aVarL, numB, lValueOf, dK != null ? Long.valueOf((long) (dK.doubleValue() * 1000000.0d)) : null));
        }
        if (state.getStatusLatency() == aVar) {
            return AbstractC3689v.e(new Vd.c(c.b.LATENCY_CHECK, l(state), state.b(), null, null));
        }
        if (state.getStatusDownload() != aVar || (progressDownload = state.getProgressDownload()) == null || progressDownload.isEmpty()) {
            if (state.getStatusUpload() != aVar || (progressUpload = state.getProgressUpload()) == null || progressUpload.isEmpty()) {
                return AbstractC3689v.l();
            }
            c.a aVarL2 = l(state);
            List progressUpload2 = state.getProgressUpload();
            ArrayList<List> arrayList2 = new ArrayList();
            Iterator it = progressUpload2.iterator();
            while (it.hasNext()) {
                List records = ((ApiUnifiConsoleSpeedtest.State.Progress) it.next()).getRecords();
                if (records == null) {
                    records = AbstractC3689v.l();
                }
                AbstractC3689v.C(arrayList2, records);
            }
            arrayList = new ArrayList(AbstractC3689v.w(arrayList2, 10));
            for (List list : arrayList2) {
                c.b bVar2 = c.b.UPLOAD;
                Integer numB2 = state.b();
                Double dA2 = state.a();
                Long lValueOf2 = dA2 != null ? Long.valueOf((long) (dA2.doubleValue() * 1000000.0d)) : null;
                Long l10 = (Long) AbstractC3689v.t0(list, 1);
                arrayList.add(new Vd.c(bVar2, aVarL2, numB2, lValueOf2, l10 != null ? Long.valueOf(l10.longValue() * 10000) : null));
            }
        } else {
            c.a aVarL3 = l(state);
            List progressDownload2 = state.getProgressDownload();
            ArrayList<List> arrayList3 = new ArrayList();
            Iterator it2 = progressDownload2.iterator();
            while (it2.hasNext()) {
                List records2 = ((ApiUnifiConsoleSpeedtest.State.Progress) it2.next()).getRecords();
                if (records2 == null) {
                    records2 = AbstractC3689v.l();
                }
                AbstractC3689v.C(arrayList3, records2);
            }
            arrayList = new ArrayList(AbstractC3689v.w(arrayList3, 10));
            for (List list2 : arrayList3) {
                c.b bVar3 = c.b.DOWNLOAD;
                Integer numB3 = state.b();
                Long l11 = (Long) AbstractC3689v.t0(list2, 1);
                Long lValueOf3 = l11 != null ? Long.valueOf(l11.longValue() * 10000) : null;
                Double dK2 = state.k();
                arrayList.add(new Vd.c(bVar3, aVarL3, numB3, lValueOf3, dK2 != null ? Long.valueOf((long) (dK2.doubleValue() * 1000000.0d)) : null));
            }
        }
        return arrayList;
    }

    @Override // Td.a
    public gg.i a() {
        return this.f21574e;
    }

    @Override // Td.a
    public a.EnumC0795a b() {
        return this.f21571b;
    }

    @Override // Td.a
    public z c(String clientName, String clientId) {
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientId, "clientId");
        z zVarA = this.f21572c.d(new Request(clientId, clientName)).A(j.f21586a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // Td.a
    public String d() {
        return this.f21570a;
    }

    @Override // Td.a
    public gg.i e() {
        return this.f21575f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e.b.h(this.f21570a, dVar.f21570a) && this.f21571b == dVar.f21571b && AbstractC6492s.d(this.f21572c, dVar.f21572c) && AbstractC6492s.d(this.f21573d, dVar.f21573d);
    }

    @Override // Td.a
    public gg.i f() {
        gg.i iVarZ0 = this.f21572c.b().Z0(ApiUnifiConsoleSpeedtest.State.class);
        AbstractC6492s.h(iVarZ0, "ofType(R::class.java)");
        gg.i iVarZ1 = iVarZ0.U0(this.f21572c.c()).N0(new k()).Z1(30000L, TimeUnit.MILLISECONDS);
        AbstractC6492s.h(iVarZ1, "timeout(...)");
        gg.i iVarF1 = m(iVarZ1).R1(l.f21588a).z1(new Vd.c(c.b.LATENCY_CHECK, null, null, null, null)).f1(m.f21589a);
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        return iVarF1;
    }

    public int hashCode() {
        return (((((e.b.j(this.f21570a) * 31) + this.f21571b.hashCode()) * 31) + this.f21572c.hashCode()) * 31) + this.f21573d.hashCode();
    }

    public String toString() {
        return "UnifiNetworkConsoleSessionImpl(id=" + e.b.l(this.f21570a) + ", connectionType=" + this.f21571b + ", api=" + this.f21572c + ", productCatalog=" + this.f21573d + ")";
    }

    private d(String id2, a.EnumC0795a connectionType, Ud.a api, o productCatalog) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(connectionType, "connectionType");
        AbstractC6492s.i(api, "api");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f21570a = id2;
        this.f21571b = connectionType;
        this.f21572c = api;
        this.f21573d = productCatalog;
        gg.i iVarV = gg.i.v(productCatalog.b(), api.a().K(b.f21576a), c.f21577a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        gg.i iVarI2 = AbstractC5817h.c(iVarV, new InterfaceC6835l() { // from class: Td.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.j((Throwable) obj);
            }
        }).n1(C0796d.f21578a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f21574e = iVarI2;
        gg.i iVarN0 = api.e().K(e.f21579a).N0(f.f21580a);
        AbstractC6492s.h(iVarN0, "map(...)");
        gg.i iVarI22 = AbstractC5817h.c(iVarN0, new InterfaceC6835l() { // from class: Td.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return d.k((Throwable) obj);
            }
        }).n1(g.f21581a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f21575f = iVarI22;
    }
}
