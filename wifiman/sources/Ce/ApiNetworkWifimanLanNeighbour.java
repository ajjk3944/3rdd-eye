package ce;

import Md.g;
import S8.l;
import W7.a;
import h9.C5969a;
import inet.ipaddr.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\rR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0016\u0010!\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\rR\u0016\u0010#\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\rR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\rR\u0016\u0010'\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\rR\u0016\u0010)\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u0013\u0010*\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0004R\u0013\u0010+\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0013\u0010.\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b\u0016\u00100R\u0013\u00102\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0013\u00105\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b\u0014\u00104R\u0013\u00108\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b\u001e\u00107R\u0013\u00109\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010<\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b\"\u0010;R\u0013\u0010=\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006>"}, d2 = {"Lce/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "_hostName", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Integer;", "get_wifiExperience", "()Ljava/lang/Integer;", "_wifiExperience", SnmpConfigurator.O_COMMUNITY, "_iconDevice", "d", "_iconDeviceUidb", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "iconEngine", "f", "_ip", "g", "rateDownloadKbps", "h", "rateUploadKbps", "i", "_mac", "j", "_model", "k", "_name", "l", "_radioProtocol", "m", "_signal", "name", "hostname", "Lh9/a;", "()Lh9/a;", "mac", "Linet/ipaddr/g;", "()Linet/ipaddr/g;", GenericAddress.TYPE_IP, "model", "LS8/a;", "()LS8/a;", "ieeeMode", "LW7/b;", "()LW7/b;", "rate", "wifiExperience", "LS8/l;", "()LS8/l;", "wifiSignal", "iconUrl", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ce.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiNetworkWifimanLanNeighbour {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("hostname")
    private final String _hostName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("experience")
    private final Integer _wifiExperience;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("icon_device_id")
    private final Integer _iconDevice;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("icon_device_uidb_id")
    private final String _iconDeviceUidb;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("icon_engine_id")
    private final Integer iconEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c(GenericAddress.TYPE_IP)
    private final String _ip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("link_download_rate_kbps")
    private final Integer rateDownloadKbps;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("link_upload_rate_kbps")
    private final Integer rateUploadKbps;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("mac")
    private final String _mac;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("model")
    private final String _model;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("name")
    private final String _name;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("radio_protocol")
    private final String _radioProtocol;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("signal")
    private final Integer _signal;

    public final String a() {
        String str = this._hostName;
        if (str == null || t.m0(str)) {
            return null;
        }
        return str;
    }

    public final String b() {
        String str;
        Integer num;
        Integer num2;
        String string;
        Integer num3;
        Integer num4 = this.iconEngine;
        int iB = g.c.f13113b.b();
        if (num4 == null || num4.intValue() != iB) {
            int iB2 = g.b.f13110b.b();
            if (num4 != null && num4.intValue() == iB2) {
                Integer num5 = this._iconDevice;
                if ((num5 == null || num5.intValue() != 0) && (((num = this._iconDevice) == null || num.intValue() != -1) && (num2 = this._iconDevice) != null)) {
                    string = num2.toString();
                }
            } else {
                Z7.b.h("Unknown product icon engine " + this.iconEngine, null, 2, null);
            }
            str = null;
            if (str == null && (num3 = this.iconEngine) != null) {
                return g.a.b(Md.g.f13109a, str, num3.intValue(), null, 4, null);
            }
        }
        string = this._iconDeviceUidb;
        str = string;
        return str == null ? null : null;
    }

    public final S8.a c() {
        String str = this._radioProtocol;
        if (str != null) {
            return C4247d.f33991a.a(str);
        }
        return null;
    }

    public final inet.ipaddr.g d() {
        String str = this._ip;
        if (str != null) {
            return new n(str).g();
        }
        return null;
    }

    public final C5969a e() {
        String str = this._mac;
        if (str != null) {
            return C5969a.f48518b.e(str);
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiNetworkWifimanLanNeighbour)) {
            return false;
        }
        ApiNetworkWifimanLanNeighbour apiNetworkWifimanLanNeighbour = (ApiNetworkWifimanLanNeighbour) other;
        return AbstractC6492s.d(this._hostName, apiNetworkWifimanLanNeighbour._hostName) && AbstractC6492s.d(this._wifiExperience, apiNetworkWifimanLanNeighbour._wifiExperience) && AbstractC6492s.d(this._iconDevice, apiNetworkWifimanLanNeighbour._iconDevice) && AbstractC6492s.d(this._iconDeviceUidb, apiNetworkWifimanLanNeighbour._iconDeviceUidb) && AbstractC6492s.d(this.iconEngine, apiNetworkWifimanLanNeighbour.iconEngine) && AbstractC6492s.d(this._ip, apiNetworkWifimanLanNeighbour._ip) && AbstractC6492s.d(this.rateDownloadKbps, apiNetworkWifimanLanNeighbour.rateDownloadKbps) && AbstractC6492s.d(this.rateUploadKbps, apiNetworkWifimanLanNeighbour.rateUploadKbps) && AbstractC6492s.d(this._mac, apiNetworkWifimanLanNeighbour._mac) && AbstractC6492s.d(this._model, apiNetworkWifimanLanNeighbour._model) && AbstractC6492s.d(this._name, apiNetworkWifimanLanNeighbour._name) && AbstractC6492s.d(this._radioProtocol, apiNetworkWifimanLanNeighbour._radioProtocol) && AbstractC6492s.d(this._signal, apiNetworkWifimanLanNeighbour._signal);
    }

    public final String f() {
        String str = this._model;
        if (str == null || t.m0(str)) {
            return null;
        }
        return str;
    }

    public final String g() {
        String str = this._name;
        if (str == null || t.m0(str)) {
            return null;
        }
        return str;
    }

    public final W7.b h() {
        Integer num = this.rateDownloadKbps;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        if (num == null) {
            return null;
        }
        Integer num2 = this.rateUploadKbps;
        if (num2 == null || num2.intValue() <= 0) {
            num2 = null;
        }
        if (num2 == null) {
            return null;
        }
        a.C0878a c0878a = W7.a.f23676b;
        return new W7.b(c0878a.a(this.rateDownloadKbps.intValue() * 1000), c0878a.a(this.rateUploadKbps.intValue() * 1000));
    }

    public int hashCode() {
        String str = this._hostName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this._wifiExperience;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this._iconDevice;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this._iconDeviceUidb;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.iconEngine;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this._ip;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.rateDownloadKbps;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rateUploadKbps;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this._mac;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this._model;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._name;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this._radioProtocol;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num6 = this._signal;
        return iHashCode12 + (num6 != null ? num6.hashCode() : 0);
    }

    public final Integer i() {
        if (this._signal != null) {
            return this._wifiExperience;
        }
        return null;
    }

    public final l j() {
        Integer num = this._signal;
        if (num == null) {
            return null;
        }
        return l.f20404f.a(num.intValue());
    }

    public String toString() {
        return "ApiNetworkWifimanLanNeighbour(_hostName=" + this._hostName + ", _wifiExperience=" + this._wifiExperience + ", _iconDevice=" + this._iconDevice + ", _iconDeviceUidb=" + this._iconDeviceUidb + ", iconEngine=" + this.iconEngine + ", _ip=" + this._ip + ", rateDownloadKbps=" + this.rateDownloadKbps + ", rateUploadKbps=" + this.rateUploadKbps + ", _mac=" + this._mac + ", _model=" + this._model + ", _name=" + this._name + ", _radioProtocol=" + this._radioProtocol + ", _signal=" + this._signal + ")";
    }
}
