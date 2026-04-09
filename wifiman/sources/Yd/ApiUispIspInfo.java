package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u001c"}, d2 = {"LYd/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "name", SnmpConfigurator.O_BIND_ADDRESS, "logoUrl", "d", "phoneNumber", "email", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "webpage", "getControllerHost", "controllerHost", "g", "serverUrl", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Yd.d, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiUispIspInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("networkName")
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("logo")
    private final String logoUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("supportPhone")
    private final String phoneNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("supportEmail")
    private final String email;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("web")
    private final String webpage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("UNMSHostname")
    private final String controllerHost;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("speedTestServer")
    private final String serverUrl;

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: e, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUispIspInfo)) {
            return false;
        }
        ApiUispIspInfo apiUispIspInfo = (ApiUispIspInfo) other;
        return AbstractC6492s.d(this.name, apiUispIspInfo.name) && AbstractC6492s.d(this.logoUrl, apiUispIspInfo.logoUrl) && AbstractC6492s.d(this.phoneNumber, apiUispIspInfo.phoneNumber) && AbstractC6492s.d(this.email, apiUispIspInfo.email) && AbstractC6492s.d(this.webpage, apiUispIspInfo.webpage) && AbstractC6492s.d(this.controllerHost, apiUispIspInfo.controllerHost) && AbstractC6492s.d(this.serverUrl, apiUispIspInfo.serverUrl);
    }

    /* renamed from: f, reason: from getter */
    public final String getWebpage() {
        return this.webpage;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webpage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.controllerHost;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.serverUrl;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "ApiUispIspInfo(name=" + this.name + ", logoUrl=" + this.logoUrl + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", webpage=" + this.webpage + ", controllerHost=" + this.controllerHost + ", serverUrl=" + this.serverUrl + ")";
    }
}
