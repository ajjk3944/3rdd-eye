package com.ui.wmw.api.v1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\u0012\b\u0001\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\u0012\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;", "", "", "Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;", "results", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", "Result", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1WifiScanResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List results;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u008c\u0002\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b(\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b,\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b-\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b3\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b8\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b9\u0010\u001dR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b:\u0010\u001d¨\u0006;"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;", "", "", "ssid", "bssid", "frequency", "channel", "channelCenter", "channelCeter2", "supportedBandwidth", "bandwidth", "spatialStreams", "rssi", "mcs", "transmitPower", "wifiRTTSupported", "channelUtilization", "stationCount", "ieeeMode", "encryption", "encryptionCipher", "supportedDataRates", "capabilities", "ubntFlags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1WifiScanResult$Result;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_OPERATION, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "j", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "g", "q", "h", "i", SnmpConfigurator.O_CONTEXT_NAME, "m", "k", "l", "s", SnmpConfigurator.O_SECURITY_NAME, "p", SnmpConfigurator.O_RETRIES, SnmpConfigurator.O_TIMEOUT, "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Y6.i(generateAdapter = true)
    public static final /* data */ class Result {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ssid;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bssid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String frequency;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String channel;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String channelCenter;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String channelCeter2;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String supportedBandwidth;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bandwidth;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String spatialStreams;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rssi;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mcs;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transmitPower;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String wifiRTTSupported;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String channelUtilization;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stationCount;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ieeeMode;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encryption;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encryptionCipher;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final String supportedDataRates;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String capabilities;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ubntFlags;

        public Result(@Y6.g(name = "ssid") String str, @Y6.g(name = "bssid") String str2, @Y6.g(name = "freq") String str3, @Y6.g(name = "ch") String str4, @Y6.g(name = "ch_s0") String str5, @Y6.g(name = "ch_s1") String str6, @Y6.g(name = "sbw") String str7, @Y6.g(name = "bw") String str8, @Y6.g(name = "nss") String str9, @Y6.g(name = "rssi") String str10, @Y6.g(name = "mcs") String str11, @Y6.g(name = "tpc") String str12, @Y6.g(name = "rtt") String str13, @Y6.g(name = "ch_util") String str14, @Y6.g(name = "sta_cnt") String str15, @Y6.g(name = "std") String str16, @Y6.g(name = "akm") String str17, @Y6.g(name = "cipher") String str18, @Y6.g(name = "sdr") String str19, @Y6.g(name = "cap") String str20, @Y6.g(name = "ubnt_flags") String str21) {
            this.ssid = str;
            this.bssid = str2;
            this.frequency = str3;
            this.channel = str4;
            this.channelCenter = str5;
            this.channelCeter2 = str6;
            this.supportedBandwidth = str7;
            this.bandwidth = str8;
            this.spatialStreams = str9;
            this.rssi = str10;
            this.mcs = str11;
            this.transmitPower = str12;
            this.wifiRTTSupported = str13;
            this.channelUtilization = str14;
            this.stationCount = str15;
            this.ieeeMode = str16;
            this.encryption = str17;
            this.encryptionCipher = str18;
            this.supportedDataRates = str19;
            this.capabilities = str20;
            this.ubntFlags = str21;
        }

        /* renamed from: a, reason: from getter */
        public final String getBandwidth() {
            return this.bandwidth;
        }

        /* renamed from: b, reason: from getter */
        public final String getBssid() {
            return this.bssid;
        }

        /* renamed from: c, reason: from getter */
        public final String getCapabilities() {
            return this.capabilities;
        }

        public final Result copy(@Y6.g(name = "ssid") String ssid, @Y6.g(name = "bssid") String bssid, @Y6.g(name = "freq") String frequency, @Y6.g(name = "ch") String channel, @Y6.g(name = "ch_s0") String channelCenter, @Y6.g(name = "ch_s1") String channelCeter2, @Y6.g(name = "sbw") String supportedBandwidth, @Y6.g(name = "bw") String bandwidth, @Y6.g(name = "nss") String spatialStreams, @Y6.g(name = "rssi") String rssi, @Y6.g(name = "mcs") String mcs, @Y6.g(name = "tpc") String transmitPower, @Y6.g(name = "rtt") String wifiRTTSupported, @Y6.g(name = "ch_util") String channelUtilization, @Y6.g(name = "sta_cnt") String stationCount, @Y6.g(name = "std") String ieeeMode, @Y6.g(name = "akm") String encryption, @Y6.g(name = "cipher") String encryptionCipher, @Y6.g(name = "sdr") String supportedDataRates, @Y6.g(name = "cap") String capabilities, @Y6.g(name = "ubnt_flags") String ubntFlags) {
            return new Result(ssid, bssid, frequency, channel, channelCenter, channelCeter2, supportedBandwidth, bandwidth, spatialStreams, rssi, mcs, transmitPower, wifiRTTSupported, channelUtilization, stationCount, ieeeMode, encryption, encryptionCipher, supportedDataRates, capabilities, ubntFlags);
        }

        /* renamed from: d, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        /* renamed from: e, reason: from getter */
        public final String getChannelCenter() {
            return this.channelCenter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return AbstractC6492s.d(this.ssid, result.ssid) && AbstractC6492s.d(this.bssid, result.bssid) && AbstractC6492s.d(this.frequency, result.frequency) && AbstractC6492s.d(this.channel, result.channel) && AbstractC6492s.d(this.channelCenter, result.channelCenter) && AbstractC6492s.d(this.channelCeter2, result.channelCeter2) && AbstractC6492s.d(this.supportedBandwidth, result.supportedBandwidth) && AbstractC6492s.d(this.bandwidth, result.bandwidth) && AbstractC6492s.d(this.spatialStreams, result.spatialStreams) && AbstractC6492s.d(this.rssi, result.rssi) && AbstractC6492s.d(this.mcs, result.mcs) && AbstractC6492s.d(this.transmitPower, result.transmitPower) && AbstractC6492s.d(this.wifiRTTSupported, result.wifiRTTSupported) && AbstractC6492s.d(this.channelUtilization, result.channelUtilization) && AbstractC6492s.d(this.stationCount, result.stationCount) && AbstractC6492s.d(this.ieeeMode, result.ieeeMode) && AbstractC6492s.d(this.encryption, result.encryption) && AbstractC6492s.d(this.encryptionCipher, result.encryptionCipher) && AbstractC6492s.d(this.supportedDataRates, result.supportedDataRates) && AbstractC6492s.d(this.capabilities, result.capabilities) && AbstractC6492s.d(this.ubntFlags, result.ubntFlags);
        }

        /* renamed from: f, reason: from getter */
        public final String getChannelCeter2() {
            return this.channelCeter2;
        }

        /* renamed from: g, reason: from getter */
        public final String getChannelUtilization() {
            return this.channelUtilization;
        }

        /* renamed from: h, reason: from getter */
        public final String getEncryption() {
            return this.encryption;
        }

        public int hashCode() {
            String str = this.ssid;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bssid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.frequency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.channel;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.channelCenter;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.channelCeter2;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.supportedBandwidth;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.bandwidth;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.spatialStreams;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.rssi;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.mcs;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.transmitPower;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.wifiRTTSupported;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.channelUtilization;
            int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.stationCount;
            int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.ieeeMode;
            int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.encryption;
            int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.encryptionCipher;
            int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.supportedDataRates;
            int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.capabilities;
            int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.ubntFlags;
            return iHashCode20 + (str21 != null ? str21.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getEncryptionCipher() {
            return this.encryptionCipher;
        }

        /* renamed from: j, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* renamed from: k, reason: from getter */
        public final String getIeeeMode() {
            return this.ieeeMode;
        }

        /* renamed from: l, reason: from getter */
        public final String getMcs() {
            return this.mcs;
        }

        /* renamed from: m, reason: from getter */
        public final String getRssi() {
            return this.rssi;
        }

        /* renamed from: n, reason: from getter */
        public final String getSpatialStreams() {
            return this.spatialStreams;
        }

        /* renamed from: o, reason: from getter */
        public final String getSsid() {
            return this.ssid;
        }

        /* renamed from: p, reason: from getter */
        public final String getStationCount() {
            return this.stationCount;
        }

        /* renamed from: q, reason: from getter */
        public final String getSupportedBandwidth() {
            return this.supportedBandwidth;
        }

        /* renamed from: r, reason: from getter */
        public final String getSupportedDataRates() {
            return this.supportedDataRates;
        }

        /* renamed from: s, reason: from getter */
        public final String getTransmitPower() {
            return this.transmitPower;
        }

        /* renamed from: t, reason: from getter */
        public final String getUbntFlags() {
            return this.ubntFlags;
        }

        public String toString() {
            return "Result(ssid=" + this.ssid + ", bssid=" + this.bssid + ", frequency=" + this.frequency + ", channel=" + this.channel + ", channelCenter=" + this.channelCenter + ", channelCeter2=" + this.channelCeter2 + ", supportedBandwidth=" + this.supportedBandwidth + ", bandwidth=" + this.bandwidth + ", spatialStreams=" + this.spatialStreams + ", rssi=" + this.rssi + ", mcs=" + this.mcs + ", transmitPower=" + this.transmitPower + ", wifiRTTSupported=" + this.wifiRTTSupported + ", channelUtilization=" + this.channelUtilization + ", stationCount=" + this.stationCount + ", ieeeMode=" + this.ieeeMode + ", encryption=" + this.encryption + ", encryptionCipher=" + this.encryptionCipher + ", supportedDataRates=" + this.supportedDataRates + ", capabilities=" + this.capabilities + ", ubntFlags=" + this.ubntFlags + ")";
        }

        /* renamed from: u, reason: from getter */
        public final String getWifiRTTSupported() {
            return this.wifiRTTSupported;
        }
    }

    public ApiV1WifiScanResult(@Y6.g(name = "scan_result") List<Result> list) {
        this.results = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getResults() {
        return this.results;
    }

    public final ApiV1WifiScanResult copy(@Y6.g(name = "scan_result") List<Result> results) {
        return new ApiV1WifiScanResult(results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiV1WifiScanResult) && AbstractC6492s.d(this.results, ((ApiV1WifiScanResult) other).results);
    }

    public int hashCode() {
        List list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ApiV1WifiScanResult(results=" + this.results + ")";
    }
}
