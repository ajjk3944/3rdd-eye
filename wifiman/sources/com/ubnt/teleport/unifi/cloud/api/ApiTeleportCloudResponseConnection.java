package com.ubnt.teleport.unifi.cloud.api;

import Y6.g;
import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;", "Lcom/ubnt/teleport/unifi/cloud/api/a;", "", "clientIp", "", "dns", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "remoteClientInfo", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "d", "Ljava/util/List;", "()Ljava/util/List;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudResponseConnection extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientIp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List dns;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiTeleportCloudClientInfo remoteClientInfo;

    public ApiTeleportCloudResponseConnection(@g(name = "client_ip") String str, @g(name = "dns_addrs") List<String> list, @g(name = "server_info") ApiTeleportCloudClientInfo apiTeleportCloudClientInfo) {
        this.clientIp = str;
        this.dns = list;
        this.remoteClientInfo = apiTeleportCloudClientInfo;
    }

    /* renamed from: b, reason: from getter */
    public final String getClientIp() {
        return this.clientIp;
    }

    /* renamed from: c, reason: from getter */
    public final List getDns() {
        return this.dns;
    }

    public final ApiTeleportCloudResponseConnection copy(@g(name = "client_ip") String clientIp, @g(name = "dns_addrs") List<String> dns, @g(name = "server_info") ApiTeleportCloudClientInfo remoteClientInfo) {
        return new ApiTeleportCloudResponseConnection(clientIp, dns, remoteClientInfo);
    }

    /* renamed from: d, reason: from getter */
    public final ApiTeleportCloudClientInfo getRemoteClientInfo() {
        return this.remoteClientInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudResponseConnection)) {
            return false;
        }
        ApiTeleportCloudResponseConnection apiTeleportCloudResponseConnection = (ApiTeleportCloudResponseConnection) other;
        return AbstractC6492s.d(this.clientIp, apiTeleportCloudResponseConnection.clientIp) && AbstractC6492s.d(this.dns, apiTeleportCloudResponseConnection.dns) && AbstractC6492s.d(this.remoteClientInfo, apiTeleportCloudResponseConnection.remoteClientInfo);
    }

    public int hashCode() {
        String str = this.clientIp;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.dns;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ApiTeleportCloudClientInfo apiTeleportCloudClientInfo = this.remoteClientInfo;
        return iHashCode2 + (apiTeleportCloudClientInfo != null ? apiTeleportCloudClientInfo.hashCode() : 0);
    }

    public String toString() {
        return "ApiTeleportCloudResponseConnection(clientIp=" + this.clientIp + ", dns=" + this.dns + ", remoteClientInfo=" + this.remoteClientInfo + ')';
    }
}
