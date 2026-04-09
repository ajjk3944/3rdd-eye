package d8;

import Fd.C;
import Fd.D;
import Od.a;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.product.p;
import com.ui.wifiman.model.network.hosts.NetworkHost;
import com.ui.wifiman.model.speedtest.internet.InternetSpeedtest;
import com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager;
import com.ui.wifiman.model.ubiquiti.uisp.UispController;
import com.ui.wifiman.model.wmw.WifimanWizard;
import gg.AbstractC5912b;
import gg.f;
import gg.i;
import hd.AbstractC5975a;
import java.util.concurrent.TimeUnit;
import jd.InterfaceC6293b;
import je.InterfaceC6297C;
import kd.InterfaceC6454d;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import ld.InterfaceC6575b;
import ne.C6937a;
import pc.InterfaceC7283a;
import rc.InterfaceC7586b;
import rd.InterfaceC7587a;
import re.InterfaceC7588a;
import wc.C8322b;
import xa.o;

/* renamed from: d8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5306b implements InterfaceC5305a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5912b f45767a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f45768b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5912b f45769c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5912b f45770d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f45771e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f45772f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5912b f45773g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f45774h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC5912b f45775i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5912b f45776j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5912b f45777k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC5912b f45778l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC5912b f45779m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5912b f45780n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC5912b f45781o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC5912b f45782p;

    /* renamed from: q, reason: collision with root package name */
    private final AbstractC5912b f45783q;

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC5912b f45784r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC5912b f45785s;

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC5912b f45786t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC5912b f45787u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC5912b f45788v;

    /* renamed from: w, reason: collision with root package name */
    private final AbstractC5912b f45789w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC5912b f45790x;

    /* renamed from: y, reason: collision with root package name */
    private final AbstractC5912b f45791y;

    /* renamed from: z, reason: collision with root package name */
    private final AbstractC5912b f45792z;

    /* renamed from: d8.b$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45793a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(C6556a c6556a) {
            com.ui.wifiman.model.ubiquiti.console.b bVarD;
            i iVarA;
            AbstractC5912b abstractC5912bE0;
            AbstractC6492s.i(c6556a, "<destruct>");
            Ld.e eVar = (Ld.e) c6556a.a();
            return (eVar == null || (bVarD = eVar.d()) == null || (iVarA = bVarD.a()) == null || (abstractC5912bE0 = iVarA.E0()) == null) ? AbstractC5912b.m() : abstractC5912bE0;
        }
    }

    /* renamed from: d8.b$b, reason: collision with other inner class name */
    static final class C1696b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1696b f45794a = new C1696b();

        C1696b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(C6556a c6556a) {
            AbstractC5912b abstractC5912bM;
            AbstractC5912b abstractC5912bM2;
            i iVarE;
            i iVarA;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            if (aVar == null || (iVarA = aVar.a()) == null || (abstractC5912bM = iVarA.E0()) == null) {
                abstractC5912bM = AbstractC5912b.m();
                AbstractC6492s.h(abstractC5912bM, "complete(...)");
            }
            if (aVar == null || (iVarE = aVar.e()) == null || (abstractC5912bM2 = iVarE.E0()) == null) {
                abstractC5912bM2 = AbstractC5912b.m();
                AbstractC6492s.h(abstractC5912bM2, "complete(...)");
            }
            return AbstractC5912b.I(abstractC5912bM, abstractC5912bM2);
        }
    }

    /* renamed from: d8.b$c */
    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f45795a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(InterfaceC7588a.b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof InterfaceC7588a.b.C2111a) {
                InterfaceC7588a.b.C2111a c2111a = (InterfaceC7588a.b.C2111a) it;
                return AbstractC5912b.I(c2111a.a().e(), c2111a.b().c().E0());
            }
            if (it instanceof InterfaceC7588a.b.C2112b) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C5306b(InterfaceC6575b sessionManager, InterfaceC6297C wifiConnectionTimelapseService, C6937a.InterfaceC1989a wifiSignalTimelapse, ie.f wifiAirQualityService, C8322b.a bluetoothDeviceStatistics, Dc.e networkDiscovery, InternetSpeedtest.d speedtestServerService, InterfaceC6454d publicIPService, InterfaceC7587a app2appSpeedtestServer, InterfaceC6293b topology, Bc.a cellService, InterfaceC7586b appReviewOpertor, UispController uispController, UiSSOAccountManager accountManager, com.ui.wifiman.model.wmw.d wifimanWizardDiscovery, WifimanWizard wifimanWizard, O8.a wifimanWizardConnectionNotification, P8.f wifimanWizardPopupController, InterfaceC7588a wifimanWizardApComparisonManager, Ld.f ubiquitiSsoAccountSessionService, a.InterfaceC0616a ubiquitiCloudStatus, p uidbSynchronizer, o productCatalog, Cc.n wifimanDeviceManager, NetworkHost.Manager favoriteHostsManager, AbstractC5975a.c apRoamingService, C teleportConsoleService, com.ubnt.usurvey.ui.teleport.deeplink.a teleportDeepLinkConsoleConnectProcessor, Sd.d localConsoleService, D wifimanTeleportTunnelManager, InterfaceC7283a locationService) {
        AbstractC6492s.i(sessionManager, "sessionManager");
        AbstractC6492s.i(wifiConnectionTimelapseService, "wifiConnectionTimelapseService");
        AbstractC6492s.i(wifiSignalTimelapse, "wifiSignalTimelapse");
        AbstractC6492s.i(wifiAirQualityService, "wifiAirQualityService");
        AbstractC6492s.i(bluetoothDeviceStatistics, "bluetoothDeviceStatistics");
        AbstractC6492s.i(networkDiscovery, "networkDiscovery");
        AbstractC6492s.i(speedtestServerService, "speedtestServerService");
        AbstractC6492s.i(publicIPService, "publicIPService");
        AbstractC6492s.i(app2appSpeedtestServer, "app2appSpeedtestServer");
        AbstractC6492s.i(topology, "topology");
        AbstractC6492s.i(cellService, "cellService");
        AbstractC6492s.i(appReviewOpertor, "appReviewOpertor");
        AbstractC6492s.i(uispController, "uispController");
        AbstractC6492s.i(accountManager, "accountManager");
        AbstractC6492s.i(wifimanWizardDiscovery, "wifimanWizardDiscovery");
        AbstractC6492s.i(wifimanWizard, "wifimanWizard");
        AbstractC6492s.i(wifimanWizardConnectionNotification, "wifimanWizardConnectionNotification");
        AbstractC6492s.i(wifimanWizardPopupController, "wifimanWizardPopupController");
        AbstractC6492s.i(wifimanWizardApComparisonManager, "wifimanWizardApComparisonManager");
        AbstractC6492s.i(ubiquitiSsoAccountSessionService, "ubiquitiSsoAccountSessionService");
        AbstractC6492s.i(ubiquitiCloudStatus, "ubiquitiCloudStatus");
        AbstractC6492s.i(uidbSynchronizer, "uidbSynchronizer");
        AbstractC6492s.i(productCatalog, "productCatalog");
        AbstractC6492s.i(wifimanDeviceManager, "wifimanDeviceManager");
        AbstractC6492s.i(favoriteHostsManager, "favoriteHostsManager");
        AbstractC6492s.i(apRoamingService, "apRoamingService");
        AbstractC6492s.i(teleportConsoleService, "teleportConsoleService");
        AbstractC6492s.i(teleportDeepLinkConsoleConnectProcessor, "teleportDeepLinkConsoleConnectProcessor");
        AbstractC6492s.i(localConsoleService, "localConsoleService");
        AbstractC6492s.i(wifimanTeleportTunnelManager, "wifimanTeleportTunnelManager");
        AbstractC6492s.i(locationService, "locationService");
        AbstractC5912b abstractC5912bE0 = sessionManager.a().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f45767a = abstractC5912bE0;
        AbstractC5912b abstractC5912bA = wifiConnectionTimelapseService.a();
        this.f45768b = abstractC5912bA;
        AbstractC5912b abstractC5912bB = apRoamingService.b();
        this.f45769c = abstractC5912bB;
        AbstractC5912b abstractC5912bE02 = wifiSignalTimelapse.getAll().E0();
        AbstractC6492s.h(abstractC5912bE02, "ignoreElements(...)");
        this.f45770d = abstractC5912bE02;
        AbstractC5912b abstractC5912bE03 = bluetoothDeviceStatistics.getAll().E0();
        AbstractC6492s.h(abstractC5912bE03, "ignoreElements(...)");
        this.f45771e = abstractC5912bE03;
        AbstractC5912b abstractC5912bG = AbstractC5912b.a0(1500L, TimeUnit.MILLISECONDS).g(networkDiscovery.c());
        AbstractC6492s.h(abstractC5912bG, "andThen(...)");
        this.f45772f = abstractC5912bG;
        AbstractC5912b abstractC5912bE04 = speedtestServerService.c().E0();
        AbstractC6492s.h(abstractC5912bE04, "ignoreElements(...)");
        this.f45773g = abstractC5912bE04;
        AbstractC5912b abstractC5912bE05 = speedtestServerService.b().E0();
        AbstractC6492s.h(abstractC5912bE05, "ignoreElements(...)");
        this.f45774h = abstractC5912bE05;
        AbstractC5912b abstractC5912bE06 = publicIPService.a().E0();
        AbstractC6492s.h(abstractC5912bE06, "ignoreElements(...)");
        this.f45775i = abstractC5912bE06;
        AbstractC5912b abstractC5912bA2 = app2appSpeedtestServer.a();
        this.f45776j = abstractC5912bA2;
        AbstractC5912b abstractC5912bE07 = topology.a().E0();
        AbstractC6492s.h(abstractC5912bE07, "ignoreElements(...)");
        this.f45777k = abstractC5912bE07;
        AbstractC5912b abstractC5912bH = AbstractC5912b.H(AbstractC3689v.o(cellService.b().E0(), cellService.c().E0()));
        AbstractC6492s.h(abstractC5912bH, "merge(...)");
        this.f45778l = abstractC5912bH;
        AbstractC5912b abstractC5912bC = appReviewOpertor.c();
        this.f45779m = abstractC5912bC;
        AbstractC5912b abstractC5912bE08 = uispController.a().E0();
        AbstractC6492s.h(abstractC5912bE08, "ignoreElements(...)");
        this.f45780n = abstractC5912bE08;
        AbstractC5912b abstractC5912bE09 = accountManager.a().E0();
        AbstractC6492s.h(abstractC5912bE09, "ignoreElements(...)");
        this.f45781o = abstractC5912bE09;
        AbstractC5912b abstractC5912bC2 = wifimanTeleportTunnelManager.c();
        this.f45782p = abstractC5912bC2;
        AbstractC5912b abstractC5912bI = AbstractC5912b.I(wifimanWizardDiscovery.a().E0(), wifimanWizard.c(), wifimanWizardConnectionNotification.a(), wifimanWizardPopupController.d(), wifimanWizardApComparisonManager.getState().L1(c.f45795a));
        AbstractC6492s.h(abstractC5912bI, "mergeArray(...)");
        this.f45783q = abstractC5912bI;
        AbstractC5912b abstractC5912bL1 = ubiquitiSsoAccountSessionService.a().L1(a.f45793a);
        AbstractC6492s.h(abstractC5912bL1, "switchMapCompletable(...)");
        this.f45784r = abstractC5912bL1;
        AbstractC5912b abstractC5912bE010 = ubiquitiCloudStatus.a().E0();
        AbstractC6492s.h(abstractC5912bE010, "ignoreElements(...)");
        this.f45785s = abstractC5912bE010;
        AbstractC5912b abstractC5912bI2 = AbstractC5912b.I(productCatalog.b().E0(), p.a.a(uidbSynchronizer, false, 0L, 2, null).M());
        AbstractC6492s.h(abstractC5912bI2, "mergeArray(...)");
        this.f45786t = abstractC5912bI2;
        AbstractC5912b abstractC5912bE011 = wifimanDeviceManager.a().E0();
        AbstractC6492s.h(abstractC5912bE011, "ignoreElements(...)");
        this.f45787u = abstractC5912bE011;
        AbstractC5912b abstractC5912bE012 = favoriteHostsManager.c().E0();
        AbstractC6492s.h(abstractC5912bE012, "ignoreElements(...)");
        this.f45788v = abstractC5912bE012;
        AbstractC5912b abstractC5912bE013 = wifiAirQualityService.a().E0();
        AbstractC6492s.h(abstractC5912bE013, "ignoreElements(...)");
        this.f45789w = abstractC5912bE013;
        AbstractC5912b abstractC5912bL12 = localConsoleService.b().L1(C1696b.f45794a);
        AbstractC6492s.h(abstractC5912bL12, "switchMapCompletable(...)");
        this.f45790x = abstractC5912bL12;
        AbstractC5912b abstractC5912bE014 = locationService.b().E0();
        AbstractC6492s.h(abstractC5912bE014, "ignoreElements(...)");
        this.f45791y = abstractC5912bE014;
        AbstractC5912b abstractC5912bF0 = AbstractC5912b.I(abstractC5912bE0, abstractC5912bA, abstractC5912bB, abstractC5912bE02, abstractC5912bE03, abstractC5912bG, abstractC5912bE04, abstractC5912bE05, abstractC5912bE06, abstractC5912bA2, abstractC5912bE07, abstractC5912bH, abstractC5912bC, abstractC5912bE08, abstractC5912bE09, abstractC5912bC2, abstractC5912bI, abstractC5912bL1, abstractC5912bE010, abstractC5912bI2, abstractC5912bE011, abstractC5912bE012, teleportDeepLinkConsoleConnectProcessor.a(), teleportConsoleService.b(), abstractC5912bE013, abstractC5912bL12, abstractC5912bE014).f0().M0(Gg.a.d()).r0().l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f45792z = abstractC5912bF0;
    }

    @Override // d8.InterfaceC5305a
    public AbstractC5912b a() {
        return this.f45792z;
    }
}
