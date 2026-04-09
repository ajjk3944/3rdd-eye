package com.ui.wmw.api.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJd\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1Device;", "", "", "mac", "model", "firmwareVersion", "bomId", "proId", "stateId", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wmw/api/v1/ApiV1Device;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_BIND_ADDRESS, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "g", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1Device {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mac;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firmwareVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bomId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String proId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stateId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public ApiV1Device(@Y6.g(name = "id") String str, @Y6.g(name = "type") String str2, @Y6.g(name = "fwv") String str3, @Y6.g(name = "bomId") String str4, @Y6.g(name = "proId") String str5, @Y6.g(name = "state") String str6, @Y6.g(name = "name") String str7) {
        this.mac = str;
        this.model = str2;
        this.firmwareVersion = str3;
        this.bomId = str4;
        this.proId = str5;
        this.stateId = str6;
        this.name = str7;
    }

    /* renamed from: a, reason: from getter */
    public final String getBomId() {
        return this.bomId;
    }

    /* renamed from: b, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* renamed from: c, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    public final ApiV1Device copy(@Y6.g(name = "id") String mac, @Y6.g(name = "type") String model, @Y6.g(name = "fwv") String firmwareVersion, @Y6.g(name = "bomId") String bomId, @Y6.g(name = "proId") String proId, @Y6.g(name = "state") String stateId, @Y6.g(name = "name") String name) {
        return new ApiV1Device(mac, model, firmwareVersion, bomId, proId, stateId, name);
    }

    /* renamed from: d, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiV1Device)) {
            return false;
        }
        ApiV1Device apiV1Device = (ApiV1Device) other;
        return AbstractC6492s.d(this.mac, apiV1Device.mac) && AbstractC6492s.d(this.model, apiV1Device.model) && AbstractC6492s.d(this.firmwareVersion, apiV1Device.firmwareVersion) && AbstractC6492s.d(this.bomId, apiV1Device.bomId) && AbstractC6492s.d(this.proId, apiV1Device.proId) && AbstractC6492s.d(this.stateId, apiV1Device.stateId) && AbstractC6492s.d(this.name, apiV1Device.name);
    }

    /* renamed from: f, reason: from getter */
    public final String getProId() {
        return this.proId;
    }

    /* renamed from: g, reason: from getter */
    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        String str = this.mac;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmwareVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bomId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.proId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "ApiV1Device(mac=" + this.mac + ", model=" + this.model + ", firmwareVersion=" + this.firmwareVersion + ", bomId=" + this.bomId + ", proId=" + this.proId + ", stateId=" + this.stateId + ", name=" + this.name + ")";
    }
}
