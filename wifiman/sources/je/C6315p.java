package je;

import S8.j;
import Zg.AbstractC3689v;
import Zg.d0;
import android.net.MacAddress;
import android.net.wifi.MloLink;
import android.net.wifi.WifiInfo;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import h9.C5969a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC6317r;
import ke.AbstractC6456a;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import pe.InterfaceC7316a;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: je.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6315p implements InterfaceC6300a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f50760c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7316a f50761a;

    /* renamed from: b, reason: collision with root package name */
    private final T7.a f50762b;

    /* renamed from: je.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6315p(InterfaceC7316a ssidParser, T7.a sdkVersion) {
        AbstractC6492s.i(ssidParser, "ssidParser");
        AbstractC6492s.i(sdkVersion, "sdkVersion");
        this.f50761a = ssidParser;
        this.f50762b = sdkVersion;
    }

    private final S8.c d(MloLink mloLink) {
        int band = mloLink.getBand();
        if (band == 1) {
            return S8.c.GHZ_2_4;
        }
        if (band == 2) {
            return S8.c.GHZ_5;
        }
        if (band != 8) {
            return null;
        }
        return S8.c.GHZ_6;
    }

    private final S8.c e(WifiInfo wifiInfo) {
        Integer numI = i(wifiInfo);
        if (numI == null) {
            return null;
        }
        return WifiChannelUtils.f41035a.a(numI.intValue());
    }

    private final C5969a f(WifiInfo wifiInfo) {
        String bssid = wifiInfo.getBSSID();
        if (bssid == null || kotlin.text.t.m0(bssid) || AbstractC6492s.d(bssid, "00:00:00:00:00:00") || AbstractC6492s.d(bssid, "02:00:00:00:00:00")) {
            return null;
        }
        return C5969a.f48518b.e(bssid);
    }

    private final int g(MloLink mloLink) {
        return mloLink.getChannel();
    }

    private final Integer h(WifiInfo wifiInfo) {
        Integer numI = i(wifiInfo);
        if (numI == null) {
            return null;
        }
        return WifiChannelUtils.f41035a.c(numI.intValue());
    }

    private final Integer i(WifiInfo wifiInfo) {
        int frequency = wifiInfo.getFrequency();
        if (frequency == -1 || WifiChannelUtils.f41035a.a(wifiInfo.getFrequency()) == null) {
            return null;
        }
        return Integer.valueOf(frequency);
    }

    private final C6316q j(WifiInfo wifiInfo) {
        S8.c cVarE = e(wifiInfo);
        if (cVarE == null) {
            Z7.b.e("Failed get band for Wifi Info which seems to be connected. " + wifiInfo, null, null, 6, null);
        }
        if (cVarE != null) {
            return new C6316q(cVarE, f(wifiInfo), v(wifiInfo), s(wifiInfo), h(wifiInfo), null, AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a.f51416a);
        }
        return null;
    }

    private final S8.a k(WifiInfo wifiInfo) {
        int wifiStandard;
        if (this.f50762b.c(30) || (wifiStandard = wifiInfo.getWifiStandard()) == 0) {
            return null;
        }
        if (wifiStandard == 1) {
            return S8.a.f20356G;
        }
        switch (wifiStandard) {
            case 4:
                return S8.a.f20357N;
            case 5:
                return S8.a.AC;
            case 6:
                return S8.a.AX;
            case 7:
                return S8.a.AD;
            case 8:
                return S8.a.BE;
            default:
                Z7.b.e("Unknown WIFI Standard " + this, null, null, 6, null);
                return null;
        }
    }

    private final W7.b l(Integer num, Integer num2) {
        W7.a aVarZ = num != null ? z(num.intValue()) : null;
        W7.a aVarZ2 = num2 != null ? z(num2.intValue()) : null;
        if (aVarZ == null && aVarZ2 == null) {
            return null;
        }
        return new W7.b(aVarZ, aVarZ2);
    }

    static /* synthetic */ W7.b m(C6315p c6315p, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        return c6315p.l(num, num2);
    }

    private final AbstractC6456a n(MloLink mloLink) {
        int state = mloLink.getState();
        if (state == 0) {
            return null;
        }
        if (state == 1) {
            return AbstractC6456a.AbstractC1905a.b.f51418a;
        }
        if (state == 2) {
            return AbstractC6456a.AbstractC1905a.AbstractC1906a.b.f51417a;
        }
        if (state != 3) {
            return null;
        }
        return AbstractC6456a.AbstractC1905a.AbstractC1906a.C1907a.f51416a;
    }

    private final AbstractC6317r.b.a o(WifiInfo wifiInfo, Map map) {
        return new AbstractC6317r.b.a.C1873a(x(wifiInfo), f(wifiInfo), k(wifiInfo), t(wifiInfo), (C6316q) map.get(S8.c.GHZ_2_4), (C6316q) map.get(S8.c.GHZ_5), (C6316q) map.get(S8.c.GHZ_6));
    }

    private final Map p(WifiInfo wifiInfo) {
        final C6316q c6316qJ = j(wifiInfo);
        List affiliatedMloLinks = wifiInfo.getAffiliatedMloLinks();
        AbstractC6492s.h(affiliatedMloLinks, "getAffiliatedMloLinks(...)");
        InterfaceC8780j interfaceC8780jO = AbstractC8783m.O(AbstractC3689v.d0(affiliatedMloLinks), new InterfaceC6835l() { // from class: je.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C6315p.q(this.f50758a, c6316qJ, (MloLink) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC8780jO) {
            linkedHashMap.put(((C6316q) obj).c(), obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6316q q(C6315p c6315p, C6316q c6316q, MloLink mloLink) {
        S8.c cVarD;
        C5969a c5969aD;
        AbstractC6492s.f(mloLink);
        AbstractC6456a abstractC6456aN = c6315p.n(mloLink);
        if (abstractC6456aN == null || (cVarD = c6315p.d(mloLink)) == null) {
            return null;
        }
        if (c6316q == null || c6316q.c() != cVarD) {
            c6316q = null;
        }
        MacAddress apMacAddress = mloLink.getApMacAddress();
        if (apMacAddress != null) {
            C5969a.b bVar = C5969a.f48518b;
            byte[] byteArray = apMacAddress.toByteArray();
            AbstractC6492s.h(byteArray, "toByteArray(...)");
            c5969aD = bVar.d(byteArray);
        } else {
            c5969aD = null;
        }
        S8.l lVarU = c6315p.u(mloLink);
        if (lVarU == null) {
            lVarU = c6316q != null ? c6316q.h() : null;
        }
        W7.b bVarR = c6315p.r(mloLink);
        if (bVarR == null) {
            bVarR = c6316q != null ? c6316q.g() : null;
        }
        return new C6316q(cVarD, c5969aD, lVarU, bVarR, Integer.valueOf(c6315p.g(mloLink)), null, abstractC6456aN);
    }

    private final W7.b r(MloLink mloLink) {
        return l(Integer.valueOf(mloLink.getTxLinkSpeedMbps()), Integer.valueOf(mloLink.getRxLinkSpeedMbps()));
    }

    private final W7.b s(WifiInfo wifiInfo) {
        return this.f50762b.c(29) ? m(this, Integer.valueOf(wifiInfo.getLinkSpeed()), null, 2, null) : l(Integer.valueOf(wifiInfo.getTxLinkSpeedMbps()), Integer.valueOf(wifiInfo.getRxLinkSpeedMbps()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final S8.j t(WifiInfo wifiInfo) {
        Object obj;
        if (this.f50762b.c(31)) {
            return null;
        }
        switch (wifiInfo.getCurrentSecurityType()) {
            case -1:
            case 11:
            case 12:
                obj = null;
                break;
            case 0:
                obj = j.b.C0730b.f20389a;
                break;
            case 1:
                obj = j.b.e.f20392a;
                break;
            case 2:
                obj = j.b.f.C0731b.f20394a;
                break;
            case 3:
                obj = j.b.f.a.f20393a;
                break;
            case 4:
                obj = j.b.h.d.f20400a;
                break;
            case 5:
                obj = j.b.h.C0733b.f20398a;
                break;
            case 6:
                obj = j.b.h.c.f20399a;
                break;
            case 7:
                obj = j.b.d.f20391a;
                break;
            case 8:
                obj = j.b.d.f20391a;
                break;
            case 9:
                obj = j.b.h.C0733b.f20398a;
                break;
            case 10:
                obj = j.b.c.f20390a;
                break;
            case 13:
                obj = j.b.h.a.f20397a;
                break;
            default:
                Z7.b.e("Unknown WifiInfo security type '" + wifiInfo.getCurrentSecurityType() + "'", null, null, 6, null);
                obj = null;
                break;
        }
        if (obj == null) {
            return null;
        }
        return S8.j.f20385c.a(d0.c(obj));
    }

    private final S8.l u(MloLink mloLink) {
        return S8.l.f20404f.a(mloLink.getRssi());
    }

    private final S8.l v(WifiInfo wifiInfo) {
        return S8.l.f20404f.a(wifiInfo.getRssi());
    }

    private final AbstractC6317r.b.a w(WifiInfo wifiInfo) {
        C5969a c5969aF;
        C6316q c6316qJ = j(wifiInfo);
        AbstractC6458c abstractC6458cX = x(wifiInfo);
        if (c6316qJ == null || (c5969aF = c6316qJ.e()) == null) {
            c5969aF = f(wifiInfo);
        }
        return new AbstractC6317r.b.a.C1874b(abstractC6458cX, c5969aF, k(wifiInfo), t(wifiInfo), c6316qJ);
    }

    private final AbstractC6458c x(WifiInfo wifiInfo) {
        String strA;
        if (wifiInfo.getHiddenSSID()) {
            return AbstractC6458c.b.f51421a;
        }
        String ssid = wifiInfo.getSSID();
        if (ssid == null || (strA = this.f50761a.a(ssid)) == null) {
            return null;
        }
        return new AbstractC6458c.a(strA);
    }

    private final boolean y(WifiInfo wifiInfo) {
        String bssid = wifiInfo.getBSSID();
        return !(bssid == null || kotlin.text.t.m0(bssid));
    }

    private final W7.a z(int i10) {
        if (i10 != -1 && i10 >= 0) {
            return W7.a.f23676b.d(i10);
        }
        return null;
    }

    @Override // je.InterfaceC6300a
    public AbstractC6317r.b a(WifiInfo wifiInfo) {
        AbstractC6492s.i(wifiInfo, "wifiInfo");
        if (!y(wifiInfo)) {
            return AbstractC6317r.b.C1875b.f50791a;
        }
        if (this.f50762b.b(34)) {
            Map mapP = p(wifiInfo);
            Collection collectionValues = mapP.values();
            int i10 = 0;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if ((((C6316q) it.next()).i() instanceof AbstractC6456a.AbstractC1905a.AbstractC1906a) && (i10 = i10 + 1) < 0) {
                        AbstractC3689v.u();
                    }
                }
            }
            if (i10 > 1) {
                return o(wifiInfo, mapP);
            }
        }
        return w(wifiInfo);
    }

    @Override // je.InterfaceC6300a
    public S8.j b(S8.j securityFromWifiInfo, S8.j securityFromWifiScan) {
        AbstractC6492s.i(securityFromWifiInfo, "securityFromWifiInfo");
        AbstractC6492s.i(securityFromWifiScan, "securityFromWifiScan");
        Set<j.b> setA = securityFromWifiInfo.a();
        if ((setA instanceof Collection) && setA.isEmpty()) {
            return securityFromWifiInfo;
        }
        for (j.b bVar : setA) {
            if ((bVar instanceof j.b.f.C0731b) || (bVar instanceof j.b.f.a)) {
                j.a aVar = S8.j.f20385c;
                Set setB = d0.b();
                for (j.b bVar2 : securityFromWifiInfo.a()) {
                    if (bVar2 instanceof j.b.f.C0731b) {
                        Set setA2 = securityFromWifiScan.a();
                        j.b.g.C0732b c0732b = j.b.g.C0732b.f20396a;
                        if (setA2.contains(c0732b)) {
                            setB.add(c0732b);
                        } else {
                            setB.add(j.b.f.C0731b.f20394a);
                        }
                    } else if (bVar2 instanceof j.b.f.a) {
                        Set setA3 = securityFromWifiScan.a();
                        j.b.g.a aVar2 = j.b.g.a.f20395a;
                        if (setA3.contains(aVar2)) {
                            setB.add(aVar2);
                        } else {
                            setB.add(j.b.f.a.f20393a);
                        }
                    } else {
                        setB.add(bVar2);
                    }
                }
                return aVar.a(d0.a(setB));
            }
        }
        return securityFromWifiInfo;
    }
}
