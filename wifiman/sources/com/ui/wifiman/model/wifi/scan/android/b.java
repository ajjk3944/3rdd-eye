package com.ui.wifiman.model.wifi.scan.android;

import S8.c;
import S8.d;
import S8.e;
import S8.j;
import S8.l;
import Zg.AbstractC3689v;
import Zg.d0;
import android.net.MacAddress;
import android.net.wifi.MloLink;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiSsid;
import android.os.Build;
import android.os.SystemClock;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import com.ui.wifiman.model.wifi.scan.android.AndroidWifiSignalFactory;
import h9.C5969a;
import java.util.List;
import java.util.Set;
import ke.AbstractC6458c;
import kotlin.jvm.internal.AbstractC6492s;
import me.InterfaceC6809a;
import me.k;
import me.q;
import me.r;
import mh.InterfaceC6835l;
import pe.InterfaceC7316a;
import zi.AbstractC8783m;

/* loaded from: classes4.dex */
public final class b implements AndroidWifiSignalFactory {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6809a f44056a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7316a f44057b;

    /* renamed from: c, reason: collision with root package name */
    private final r f44058c;

    /* renamed from: d, reason: collision with root package name */
    private final long f44059d;

    public b(InterfaceC6809a securityParser, InterfaceC7316a ssidParser, r beaconFactory) {
        AbstractC6492s.i(securityParser, "securityParser");
        AbstractC6492s.i(ssidParser, "ssidParser");
        AbstractC6492s.i(beaconFactory, "beaconFactory");
        this.f44056a = securityParser;
        this.f44057b = ssidParser;
        this.f44058c = beaconFactory;
        this.f44059d = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private final Set c(ScanResult scanResult) {
        if (Build.VERSION.SDK_INT < 33) {
            return d0.e();
        }
        List affiliatedMloLinks = scanResult.getAffiliatedMloLinks();
        AbstractC6492s.h(affiliatedMloLinks, "getAffiliatedMloLinks(...)");
        return AbstractC8783m.b0(AbstractC8783m.O(AbstractC3689v.d0(affiliatedMloLinks), new InterfaceC6835l() { // from class: me.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return com.ui.wifiman.model.wifi.scan.android.b.d((MloLink) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5969a d(MloLink mloLink) {
        byte[] byteArray;
        MacAddress apMacAddress = mloLink.getApMacAddress();
        if (apMacAddress == null || (byteArray = apMacAddress.toByteArray()) == null) {
            return null;
        }
        return C5969a.f48518b.d(byteArray);
    }

    private final C5969a e(ScanResult scanResult) throws AndroidWifiSignalFactory.Error {
        C5969a.b bVar = C5969a.f48518b;
        String BSSID = scanResult.BSSID;
        AbstractC6492s.h(BSSID, "BSSID");
        C5969a c5969aE = bVar.e(BSSID);
        if (c5969aE != null) {
            return c5969aE;
        }
        throw new AndroidWifiSignalFactory.Error("Failed to parse BSSID from " + scanResult.BSSID);
    }

    private final c f(ScanResult scanResult) throws AndroidWifiSignalFactory.Error {
        c cVarA = WifiChannelUtils.f41035a.a(scanResult.frequency);
        if (cVarA != null) {
            return cVarA;
        }
        throw new AndroidWifiSignalFactory.Error("Can't get WiFiband from frequency '" + scanResult.frequency + "'");
    }

    private final d g(ScanResult scanResult, c cVar, Boolean bool) {
        int i10 = scanResult.channelWidth;
        if (i10 == 0) {
            return d.MHZ_20;
        }
        if (i10 == 1) {
            return d.MHZ_40;
        }
        if (i10 == 2) {
            return d.MHZ_80;
        }
        if (i10 == 3) {
            return (cVar == c.GHZ_6 && AbstractC6492s.d(bool, Boolean.TRUE)) ? d.MHZ_320 : d.MHZ_160;
        }
        if (i10 == 4) {
            return d.MHZ_80_80;
        }
        if (i10 == 5) {
            return d.MHZ_320;
        }
        Z7.b.j("UNKNOWN CHANNEL WIDTH " + scanResult + ".channelWidth", null, null, 6, null);
        return d.MHZ_20;
    }

    private final int h(ScanResult scanResult, c cVar, int i10, d dVar) {
        e.b bVarE;
        if (scanResult.channelWidth == 1 && cVar == c.GHZ_2_4) {
            return scanResult.frequency;
        }
        e channel = cVar.getChannel(i10, dVar);
        if (channel != null && (bVarE = channel.e()) != null) {
            return bVarE.a();
        }
        Integer numValueOf = Integer.valueOf(scanResult.centerFreq0);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : scanResult.frequency;
    }

    private final Integer i(ScanResult scanResult, c cVar) {
        int i10 = scanResult.channelWidth;
        if (i10 == 1 && cVar == c.GHZ_2_4) {
            int i11 = scanResult.frequency;
            int i12 = scanResult.centerFreq0;
            return Integer.valueOf(i11 < i12 ? i12 + 10 : i12 - 10);
        }
        if (i10 == 4) {
            Integer numValueOf = Integer.valueOf(scanResult.centerFreq1);
            if (numValueOf.intValue() != 0) {
                return numValueOf;
            }
        }
        return null;
    }

    private final int j(ScanResult scanResult) throws AndroidWifiSignalFactory.Error {
        Integer numC = WifiChannelUtils.f41035a.c(scanResult.frequency);
        if (numC != null) {
            return numC.intValue();
        }
        throw new AndroidWifiSignalFactory.Error("Unable to convert frequency '" + scanResult.frequency + "' into channel");
    }

    private final S8.a k(ScanResult scanResult, q qVar, c cVar, Set set) {
        int wifiStandard;
        S8.a aVar = null;
        if (Build.VERSION.SDK_INT >= 30 && (wifiStandard = scanResult.getWifiStandard()) != 0 && wifiStandard != 1) {
            switch (wifiStandard) {
                case 4:
                    aVar = S8.a.f20357N;
                    break;
                case 5:
                    aVar = S8.a.AC;
                    break;
                case 6:
                    aVar = S8.a.AX;
                    break;
                case 7:
                    aVar = S8.a.AD;
                    break;
                case 8:
                    aVar = S8.a.BE;
                    break;
            }
        }
        return aVar == null ? qVar.g(cVar, set) : aVar;
    }

    private final long l(ScanResult scanResult) {
        return this.f44059d + (scanResult.timestamp / 1000);
    }

    private final boolean m(ScanResult scanResult) {
        return scanResult.is80211mcResponder();
    }

    private final AbstractC6458c n(ScanResult scanResult) {
        String string;
        if (Build.VERSION.SDK_INT < 33) {
            InterfaceC7316a interfaceC7316a = this.f44057b;
            String SSID = scanResult.SSID;
            AbstractC6492s.h(SSID, "SSID");
            String strA = interfaceC7316a.a(SSID);
            return strA != null ? new AbstractC6458c.a(strA) : AbstractC6458c.b.f51421a;
        }
        WifiSsid wifiSsid = scanResult.getWifiSsid();
        if (wifiSsid == null || (string = wifiSsid.toString()) == null) {
            return AbstractC6458c.b.f51421a;
        }
        String strA2 = this.f44057b.a(string);
        return strA2 != null ? new AbstractC6458c.a(strA2) : AbstractC6458c.b.f51421a;
    }

    private final j o(ScanResult scanResult) {
        String str = scanResult.capabilities;
        if (str != null) {
            return this.f44056a.a(str);
        }
        return null;
    }

    private final l p(ScanResult scanResult) throws AndroidWifiSignalFactory.Error {
        l lVarA = l.f20404f.a(scanResult.level);
        if (lVarA != null) {
            return lVarA;
        }
        throw new AndroidWifiSignalFactory.Error("Failed to parse signal from " + scanResult.level);
    }

    private final e q(ScanResult scanResult, Boolean bool) throws AndroidWifiSignalFactory.Error {
        c cVarF = f(scanResult);
        int iJ = j(scanResult);
        d dVarG = g(scanResult, cVarF, bool);
        int iH = h(scanResult, cVarF, iJ, dVarG);
        Integer numI = i(scanResult, cVarF);
        return new e(cVarF, iJ, numI != null ? new e.b.a(dVarG, iH, numI.intValue()) : new e.b.C0729b(dVarG, iH), dVarG);
    }

    @Override // com.ui.wifiman.model.wifi.scan.android.AndroidWifiSignalFactory
    public k a(ScanResult scanResult) throws AndroidWifiSignalFactory.Error {
        AbstractC6492s.i(scanResult, "scanResult");
        q qVarA = this.f44058c.a(scanResult);
        e eVarQ = q(scanResult, qVarA.a());
        Set setC = qVarA.c();
        S8.a aVarK = k(scanResult, qVarA, eVarQ.a(), setC);
        Set setE = qVarA.e(aVarK, eVarQ.a());
        AbstractC6458c abstractC6458cN = n(scanResult);
        C5969a c5969aE = e(scanResult);
        l lVarP = p(scanResult);
        j jVarO = o(scanResult);
        long jL = l(scanResult);
        boolean zM = m(scanResult);
        return new k(abstractC6458cN, c5969aE, eVarQ, aVarK, jVarO, lVarP, Boolean.valueOf(zM), qVarA.b(), qVarA.d(), qVarA.f(setE), qVarA.h(), setC, setE, c(scanResult), jL);
    }
}
