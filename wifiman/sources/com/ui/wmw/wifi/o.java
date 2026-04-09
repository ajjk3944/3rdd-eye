package com.ui.wmw.wifi;

import S8.j;
import Zg.AbstractC3682n;
import Zg.d0;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import com.ui.wmw.api.v1.ApiV1WifiScanResult;
import com.ui.wmw.wifi.WmwWifiScanResultProcessor;
import com.ui.wmw.wifi.o;
import com.ui.wmw.wifi.p;
import java.nio.ByteBuffer;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class o extends WmwWifiScanResultProcessor implements p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ApiV1WifiScanResult.Result result) {
        super(result);
        AbstractC6492s.i(result, "result");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(o oVar) {
        return "No Encryption value for " + oVar.c().getEncryption();
    }

    @Override // com.ui.wmw.wifi.p
    public S8.d a(int i10) {
        return p.a.f(this, i10);
    }

    @Override // com.ui.wmw.wifi.p
    public boolean b(int i10, int i11) {
        return p.a.k(this, i10, i11);
    }

    public byte[] e(String str) {
        return p.a.c(this, str);
    }

    public S8.c f() {
        S8.c cVarA = WifiChannelUtils.f41035a.a(k());
        if (cVarA != null) {
            return cVarA;
        }
        throw new WmwWifiScanResultProcessor.InvalidData("No matching band found for: " + c().getFrequency());
    }

    public int g() {
        Integer numQ;
        String channelCenter = c().getChannelCenter();
        if (channelCenter != null && (numQ = t.q(channelCenter)) != null) {
            return numQ.intValue();
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid Center Channel: " + c().getChannelCenter());
    }

    public Integer h() {
        Integer numQ;
        String channelCeter2 = c().getChannelCeter2();
        if (channelCeter2 == null || (numQ = t.q(channelCeter2)) == null || numQ.intValue() <= 0) {
            return null;
        }
        return numQ;
    }

    public int i() {
        Integer numQ;
        String channel = c().getChannel();
        if (channel != null && (numQ = t.q(channel)) != null) {
            return numQ.intValue();
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid Channel: " + c().getChannel());
    }

    public S8.d j() {
        Integer numQ;
        S8.d dVarA;
        String bandwidth = c().getBandwidth();
        if (bandwidth != null && (numQ = t.q(bandwidth)) != null && (dVarA = a(numQ.intValue())) != null) {
            return dVarA;
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid channel width: " + c().getBandwidth());
    }

    public int k() {
        Integer numQ;
        String frequency = c().getFrequency();
        if (frequency != null && (numQ = t.q(frequency)) != null) {
            return numQ.intValue();
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid frequency: " + c().getFrequency());
    }

    public S8.a l(int i10) {
        return p.a.g(this, i10);
    }

    public S8.a m() {
        byte[] bArrE;
        String ieeeMode = c().getIeeeMode();
        if (ieeeMode != null && (bArrE = e(ieeeMode)) != null) {
            if (bArrE.length == 0) {
                throw new WmwWifiScanResultProcessor.InvalidData("Invalid IEEE mode data " + c().getIeeeMode());
            }
            S8.a aVarL = l(bArrE[AbstractC3682n.d0(bArrE)]);
            if (aVarL != null) {
                return aVarL;
            }
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid IEEE mode " + c().getIeeeMode());
    }

    public int n() {
        Integer numQ;
        String mcs = c().getMcs();
        if (mcs != null && (numQ = t.q(mcs)) != null) {
            return numQ.intValue();
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid mcs index: " + c().getMcs());
    }

    public String o() {
        String ssid = c().getSsid();
        if (ssid == null || t.m0(ssid)) {
            return null;
        }
        return ssid;
    }

    public S8.j p() {
        Integer numValueOf;
        byte[] bArrE;
        String encryption = c().getEncryption();
        if (encryption == null || (bArrE = e(encryption)) == null) {
            numValueOf = null;
        } else {
            if (bArrE.length > 4) {
                throw new WmwWifiScanResultProcessor.InvalidData("Invalid security type " + c().getEncryption());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(4 - bArrE.length);
            byteBufferAllocate.put(bArrE);
            byteBufferAllocate.rewind();
            numValueOf = Integer.valueOf(byteBufferAllocate.getInt());
        }
        j.a aVar = S8.j.f20385c;
        Set setR = numValueOf != null ? r(numValueOf.intValue()) : null;
        if (setR == null) {
            Nf.a.b(new InterfaceC6824a() { // from class: Qf.c
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return o.q(this.f19348a);
                }
            }, new WmwWifiScanResultProcessor.InvalidData("Unknown encryption " + c().getEncryption()));
        }
        if (setR == null) {
            setR = d0.e();
        }
        return aVar.a(setR);
    }

    public Set r(int i10) {
        return p.a.h(this, i10);
    }

    public S8.l s() {
        Integer numQ;
        String rssi = c().getRssi();
        if (rssi != null && (numQ = t.q(rssi)) != null) {
            S8.l lVarA = S8.l.f20404f.a(numQ.intValue());
            if (lVarA != null) {
                return lVarA;
            }
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid signal Strength: " + c().getRssi());
    }

    public int t() {
        Integer numQ;
        String spatialStreams = c().getSpatialStreams();
        if (spatialStreams != null && (numQ = t.q(spatialStreams)) != null) {
            return numQ.intValue();
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid spatial streams: " + c().getMcs());
    }

    public Set u(int i10) {
        return p.a.i(this, i10);
    }

    public Set v() {
        Integer numQ;
        Set setU;
        String supportedBandwidth = c().getSupportedBandwidth();
        if (supportedBandwidth != null && (numQ = t.q(supportedBandwidth)) != null && (setU = u(numQ.intValue())) != null) {
            return setU;
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid supported channel width: " + c().getSupportedBandwidth());
    }

    public Set w() {
        byte[] bArrE;
        String supportedDataRates = c().getSupportedDataRates();
        if (supportedDataRates != null && (bArrE = e(supportedDataRates)) != null) {
            if (bArrE.length != 2) {
                throw new WmwWifiScanResultProcessor.InvalidData("Invalid data rates " + c().getSupportedDataRates());
            }
            Set setX = x(ByteBuffer.wrap(bArrE).getShort());
            if (setX != null) {
                return setX;
            }
        }
        throw new WmwWifiScanResultProcessor.InvalidData("Invalid data rates " + c().getSupportedDataRates());
    }

    public Set x(int i10) {
        return p.a.j(this, i10);
    }
}
