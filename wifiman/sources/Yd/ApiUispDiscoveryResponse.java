package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0019"}, d2 = {"LYd/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getSourceIp", "sourceIp", SnmpConfigurator.O_BIND_ADDRESS, "getSourceMac", "sourceMac", SnmpConfigurator.O_COMMUNITY, "controllerUrl", "d", "token", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "mac", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Yd.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiUispDiscoveryResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("sourceIp")
    private final String sourceIp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("sourceMac")
    private final String sourceMac;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("uispUrl")
    private final String controllerUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("token")
    private final String token;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("mac")
    private final String mac;

    /* renamed from: a, reason: from getter */
    public final String getControllerUrl() {
        return this.controllerUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: c, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUispDiscoveryResponse)) {
            return false;
        }
        ApiUispDiscoveryResponse apiUispDiscoveryResponse = (ApiUispDiscoveryResponse) other;
        return AbstractC6492s.d(this.sourceIp, apiUispDiscoveryResponse.sourceIp) && AbstractC6492s.d(this.sourceMac, apiUispDiscoveryResponse.sourceMac) && AbstractC6492s.d(this.controllerUrl, apiUispDiscoveryResponse.controllerUrl) && AbstractC6492s.d(this.token, apiUispDiscoveryResponse.token) && AbstractC6492s.d(this.mac, apiUispDiscoveryResponse.mac);
    }

    public int hashCode() {
        String str = this.sourceIp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceMac;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.controllerUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mac;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ApiUispDiscoveryResponse(sourceIp=" + this.sourceIp + ", sourceMac=" + this.sourceMac + ", controllerUrl=" + this.controllerUrl + ", token=" + this.token + ", mac=" + this.mac + ")";
    }
}
