package ce;

import inet.ipaddr.AddressStringException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000eR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b\u0014\u0010(R\u0016\u0010.\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010\rR\u0016\u00100\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0013\u00103\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b\u0012\u00102R\u0013\u00106\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b\u0016\u00105R\u0013\u00109\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b\u0010\u00108R\u0013\u0010<\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010;¨\u0006="}, d2 = {"Lce/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "channelNum", SnmpConfigurator.O_BIND_ADDRESS, "_channelWidth", SnmpConfigurator.O_COMMUNITY, "capabilityDownloadMbps", "d", "capabilityUploadMbps", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "rateDownloadKbps", "f", "rateUploadKbps", "g", "Ljava/lang/String;", "radioModulation", "h", "radioProtocol", "i", "signal", "j", "getNoise", "noise", "", "k", "Ljava/util/List;", "getStatistics", "()Ljava/util/List;", "statistics", "Lce/b$a;", "l", "topology", "m", "_wifiExperience", SnmpConfigurator.O_CONTEXT_NAME, "_wifiBand", "LW7/b;", "()LW7/b;", "rate", "LS8/c;", "()LS8/c;", "wifiBand", "LS8/a;", "()LS8/a;", "ieeeMode", "LS8/d;", "()LS8/d;", "wifiBandwidth", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ce.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiNetworkWifimanDeviceInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("channel")
    private final Integer channelNum;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("channel_width")
    private final Integer _channelWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("isp_download_capability")
    private final Integer capabilityDownloadMbps;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("isp_upload_capability")
    private final Integer capabilityUploadMbps;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("link_download_rate_kbps")
    private final Integer rateDownloadKbps;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("link_upload_rate_kbps")
    private final Integer rateUploadKbps;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("radio_modulation")
    private final String radioModulation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("radio_protocol")
    private final String radioProtocol;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("signal")
    private final Integer signal;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("noise")
    private final Integer noise;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("statistics")
    private final List<Object> statistics;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("uplink_devices")
    private final List<TopologyItem> topology;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("wifi_experience")
    private final Integer _wifiExperience;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("wlan_band")
    private final String _wifiBand;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\f\u0010\u0012R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000f\u0010!R\u0013\u0010#\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0013\u0010&\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010%R\u0013\u0010'\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006("}, d2 = {"Lce/b$a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "_name", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "wifiExperience", SnmpConfigurator.O_COMMUNITY, "_iconDevice", "d", "iconDeviceUidb", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "iconEngine", "f", "_ip", "g", "clientsCount", "_sku", "i", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasWirelessUplinkConnection", "name", "Linet/ipaddr/g;", "()Linet/ipaddr/g;", GenericAddress.TYPE_IP, "iconDevice", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ce.b$a, reason: from toString */
    public static final /* data */ class TopologyItem {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("display_name")
        private final String _name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("experience")
        private final Integer wifiExperience;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("icon_device_id")
        private final Integer _iconDevice;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("icon_device_uidb_id")
        private final String iconDeviceUidb;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("icon_engine_id")
        private final Integer iconEngine;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c(GenericAddress.TYPE_IP)
        private final String _ip;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("number_of_clients")
        private final Integer clientsCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("sku")
        private final String _sku;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("wireless_uplink")
        private final Boolean hasWirelessUplinkConnection;

        /* renamed from: a, reason: from getter */
        public final Integer getClientsCount() {
            return this.clientsCount;
        }

        /* renamed from: b, reason: from getter */
        public final Boolean getHasWirelessUplinkConnection() {
            return this.hasWirelessUplinkConnection;
        }

        public final Integer c() {
            Integer num;
            Integer num2 = this._iconDevice;
            if ((num2 != null && num2.intValue() == 0) || ((num = this._iconDevice) != null && num.intValue() == -1)) {
                return null;
            }
            return this._iconDevice;
        }

        /* renamed from: d, reason: from getter */
        public final String getIconDeviceUidb() {
            return this.iconDeviceUidb;
        }

        /* renamed from: e, reason: from getter */
        public final Integer getIconEngine() {
            return this.iconEngine;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TopologyItem)) {
                return false;
            }
            TopologyItem topologyItem = (TopologyItem) other;
            return AbstractC6492s.d(this._name, topologyItem._name) && AbstractC6492s.d(this.wifiExperience, topologyItem.wifiExperience) && AbstractC6492s.d(this._iconDevice, topologyItem._iconDevice) && AbstractC6492s.d(this.iconDeviceUidb, topologyItem.iconDeviceUidb) && AbstractC6492s.d(this.iconEngine, topologyItem.iconEngine) && AbstractC6492s.d(this._ip, topologyItem._ip) && AbstractC6492s.d(this.clientsCount, topologyItem.clientsCount) && AbstractC6492s.d(this._sku, topologyItem._sku) && AbstractC6492s.d(this.hasWirelessUplinkConnection, topologyItem.hasWirelessUplinkConnection);
        }

        public final inet.ipaddr.g f() {
            String str = this._ip;
            if (str == null) {
                return null;
            }
            if (t.m0(str)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            try {
                return new n(str).p();
            } catch (AddressStringException | IncompatibleAddressException unused) {
                return null;
            }
        }

        public final String g() {
            String str = this._name;
            if (str == null || t.m0(str)) {
                return null;
            }
            return str;
        }

        /* renamed from: h, reason: from getter */
        public final Integer getWifiExperience() {
            return this.wifiExperience;
        }

        public int hashCode() {
            String str = this._name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.wifiExperience;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this._iconDevice;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.iconDeviceUidb;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.iconEngine;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str3 = this._ip;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num4 = this.clientsCount;
            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str4 = this._sku;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.hasWirelessUplinkConnection;
            return iHashCode8 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "TopologyItem(_name=" + this._name + ", wifiExperience=" + this.wifiExperience + ", _iconDevice=" + this._iconDevice + ", iconDeviceUidb=" + this.iconDeviceUidb + ", iconEngine=" + this.iconEngine + ", _ip=" + this._ip + ", clientsCount=" + this.clientsCount + ", _sku=" + this._sku + ", hasWirelessUplinkConnection=" + this.hasWirelessUplinkConnection + ")";
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getChannelNum() {
        return this.channelNum;
    }

    public final S8.a b() {
        String str = this.radioProtocol;
        if (str != null) {
            return C4247d.f33991a.a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final W7.b c() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.rateDownloadKbps
            r1 = 0
            if (r0 == 0) goto Lc
            int r2 = r0.intValue()
            if (r2 <= 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L1d
            java.lang.Integer r0 = r4.rateUploadKbps
            if (r0 == 0) goto L1a
            int r2 = r0.intValue()
            if (r2 <= 0) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L59
        L1d:
            java.lang.Integer r0 = r4.rateDownloadKbps
            if (r0 == 0) goto L38
            int r2 = r0.intValue()
            if (r2 <= 0) goto L28
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L38
            int r0 = r0.intValue()
            W7.a$a r2 = W7.a.f23676b
            int r0 = r0 * 1000
            W7.a r0 = r2.a(r0)
            goto L39
        L38:
            r0 = r1
        L39:
            java.lang.Integer r2 = r4.rateUploadKbps
            if (r2 == 0) goto L53
            int r3 = r2.intValue()
            if (r3 <= 0) goto L44
            goto L45
        L44:
            r2 = r1
        L45:
            if (r2 == 0) goto L53
            int r1 = r2.intValue()
            W7.a$a r2 = W7.a.f23676b
            int r1 = r1 * 1000
            W7.a r1 = r2.a(r1)
        L53:
            W7.b r2 = new W7.b
            r2.<init>(r0, r1)
            r1 = r2
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.ApiNetworkWifimanDeviceInfo.c():W7.b");
    }

    /* renamed from: d, reason: from getter */
    public final List getTopology() {
        return this.topology;
    }

    public final S8.c e() {
        String str = this._wifiBand;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -284840886) {
            str.equals("unknown");
            return null;
        }
        if (iHashCode == 1653) {
            if (str.equals("2g")) {
                return S8.c.GHZ_2_4;
            }
            return null;
        }
        if (iHashCode == 1746) {
            if (str.equals("5g")) {
                return S8.c.GHZ_5;
            }
            return null;
        }
        if (iHashCode == 3029889 && str.equals("both")) {
            return S8.c.GHZ_5;
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiNetworkWifimanDeviceInfo)) {
            return false;
        }
        ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) other;
        return AbstractC6492s.d(this.channelNum, apiNetworkWifimanDeviceInfo.channelNum) && AbstractC6492s.d(this._channelWidth, apiNetworkWifimanDeviceInfo._channelWidth) && AbstractC6492s.d(this.capabilityDownloadMbps, apiNetworkWifimanDeviceInfo.capabilityDownloadMbps) && AbstractC6492s.d(this.capabilityUploadMbps, apiNetworkWifimanDeviceInfo.capabilityUploadMbps) && AbstractC6492s.d(this.rateDownloadKbps, apiNetworkWifimanDeviceInfo.rateDownloadKbps) && AbstractC6492s.d(this.rateUploadKbps, apiNetworkWifimanDeviceInfo.rateUploadKbps) && AbstractC6492s.d(this.radioModulation, apiNetworkWifimanDeviceInfo.radioModulation) && AbstractC6492s.d(this.radioProtocol, apiNetworkWifimanDeviceInfo.radioProtocol) && AbstractC6492s.d(this.signal, apiNetworkWifimanDeviceInfo.signal) && AbstractC6492s.d(this.noise, apiNetworkWifimanDeviceInfo.noise) && AbstractC6492s.d(this.statistics, apiNetworkWifimanDeviceInfo.statistics) && AbstractC6492s.d(this.topology, apiNetworkWifimanDeviceInfo.topology) && AbstractC6492s.d(this._wifiExperience, apiNetworkWifimanDeviceInfo._wifiExperience) && AbstractC6492s.d(this._wifiBand, apiNetworkWifimanDeviceInfo._wifiBand);
    }

    public final S8.d f() {
        Integer num = this._channelWidth;
        if (num == null) {
            return null;
        }
        return S8.d.Companion.a(num.intValue());
    }

    public int hashCode() {
        Integer num = this.channelNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this._channelWidth;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.capabilityDownloadMbps;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.capabilityUploadMbps;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rateDownloadKbps;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.rateUploadKbps;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.radioModulation;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.radioProtocol;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.signal;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.noise;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        List<Object> list = this.statistics;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<TopologyItem> list2 = this.topology;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num9 = this._wifiExperience;
        int iHashCode13 = (iHashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str3 = this._wifiBand;
        return iHashCode13 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ApiNetworkWifimanDeviceInfo(channelNum=" + this.channelNum + ", _channelWidth=" + this._channelWidth + ", capabilityDownloadMbps=" + this.capabilityDownloadMbps + ", capabilityUploadMbps=" + this.capabilityUploadMbps + ", rateDownloadKbps=" + this.rateDownloadKbps + ", rateUploadKbps=" + this.rateUploadKbps + ", radioModulation=" + this.radioModulation + ", radioProtocol=" + this.radioProtocol + ", signal=" + this.signal + ", noise=" + this.noise + ", statistics=" + this.statistics + ", topology=" + this.topology + ", _wifiExperience=" + this._wifiExperience + ", _wifiBand=" + this._wifiBand + ")";
    }
}
