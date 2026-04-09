package Tc;

import S8.l;
import Tc.a;
import Zg.AbstractC3689v;
import be.InterfaceC4091e;
import ce.ApiNetworkWifimanLanNeighbour;
import com.ui.wifiman.model.vendor.d;
import gg.i;
import h9.C5969a;
import java.util.List;
import kg.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.N;
import kotlin.text.t;
import l9.C6556a;
import wa.InterfaceC8290a;
import xa.InterfaceC8439a;
import xa.o;

/* loaded from: classes4.dex */
public final class b implements Tc.a {

    /* renamed from: a, reason: collision with root package name */
    private final i f21567a;

    static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21568a = new a();

        a() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List a(InterfaceC8290a interfaceC8290a, d.a vendorDir, C6556a c6556a) {
            InterfaceC8290a catalogBrowser = interfaceC8290a;
            AbstractC6492s.i(catalogBrowser, "catalogBrowser");
            AbstractC6492s.i(vendorDir, "vendorDir");
            AbstractC6492s.i(c6556a, "<destruct>");
            List<ApiNetworkWifimanLanNeighbour> list = (List) c6556a.a();
            if (list == null) {
                return AbstractC3689v.l();
            }
            List listC = AbstractC3689v.c();
            N n10 = new N();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (ApiNetworkWifimanLanNeighbour apiNetworkWifimanLanNeighbour : list) {
                String strF = apiNetworkWifimanLanNeighbour.f();
                n10.f51689a = strF != null ? (InterfaceC8439a.d) catalogBrowser.d(strF) : null;
                if (apiNetworkWifimanLanNeighbour.d() != null && apiNetworkWifimanLanNeighbour.e() != null) {
                    String strA = apiNetworkWifimanLanNeighbour.a();
                    String str = (strA == null || t.m0(strA)) ? null : strA;
                    inet.ipaddr.g gVarD = apiNetworkWifimanLanNeighbour.d();
                    AbstractC6492s.f(gVarD);
                    C5969a c5969aE = apiNetworkWifimanLanNeighbour.e();
                    AbstractC6492s.f(c5969aE);
                    W7.b bVarH = apiNetworkWifimanLanNeighbour.h();
                    Integer numI = apiNetworkWifimanLanNeighbour.i();
                    S8.g gVarA = numI != null ? S8.g.f20381b.a(numI.intValue()) : null;
                    String strB = apiNetworkWifimanLanNeighbour.b();
                    String strG = apiNetworkWifimanLanNeighbour.g();
                    String str2 = (strG == null || t.m0(strG)) ? null : strG;
                    S8.a aVarC = apiNetworkWifimanLanNeighbour.c();
                    l lVarJ = apiNetworkWifimanLanNeighbour.j();
                    InterfaceC8439a.d dVar = (InterfaceC8439a.d) n10.f51689a;
                    String strF2 = apiNetworkWifimanLanNeighbour.f();
                    if (strF2 == null || t.m0(strF2)) {
                        strF2 = null;
                    }
                    C5969a c5969aE2 = apiNetworkWifimanLanNeighbour.e();
                    d dVarA = c5969aE2 != null ? vendorDir.a(c5969aE2) : null;
                    InterfaceC8439a.d dVar2 = (InterfaceC8439a.d) n10.f51689a;
                    listC.add(new a.C0794a(gVarD, str, c5969aE, bVarH, gVarA, strB, dVar, dVarA, strF2, str2, aVarC, lVarJ, dVar2 != null ? Sc.i.a(dVar2) : null, jCurrentTimeMillis, Long.MAX_VALUE));
                }
                catalogBrowser = interfaceC8290a;
            }
            return AbstractC3689v.a(listC);
        }
    }

    public b(o productCatalog, InterfaceC4091e unifiApiManager, d.b vendorManager) {
        AbstractC6492s.i(productCatalog, "productCatalog");
        AbstractC6492s.i(unifiApiManager, "unifiApiManager");
        AbstractC6492s.i(vendorManager, "vendorManager");
        i iVarI2 = i.u(productCatalog.b(), vendorManager.a().W(), unifiApiManager.b(), a.f21568a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f21567a = iVarI2;
    }

    @Override // Ec.t
    public i b() {
        return this.f21567a;
    }
}
