package com.ubnt.teleport.unifi.cloud.api;

import K7.b;
import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;", "LK7/b;", "", "clientName", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "clientInfo", "secret", "<init>", "(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", SnmpConfigurator.O_BIND_ADDRESS, "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudRequestPayloadConnection extends b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ApiTeleportCloudClientInfo clientInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secret;

    public ApiTeleportCloudRequestPayloadConnection(@g(name = "client_name") String clientName, @g(name = "client_info") ApiTeleportCloudClientInfo clientInfo, @g(name = "secret") String secret) {
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientInfo, "clientInfo");
        AbstractC6492s.i(secret, "secret");
        this.clientName = clientName;
        this.clientInfo = clientInfo;
        this.secret = secret;
    }

    /* renamed from: b, reason: from getter */
    public final ApiTeleportCloudClientInfo getClientInfo() {
        return this.clientInfo;
    }

    /* renamed from: c, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    public final ApiTeleportCloudRequestPayloadConnection copy(@g(name = "client_name") String clientName, @g(name = "client_info") ApiTeleportCloudClientInfo clientInfo, @g(name = "secret") String secret) {
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(clientInfo, "clientInfo");
        AbstractC6492s.i(secret, "secret");
        return new ApiTeleportCloudRequestPayloadConnection(clientName, clientInfo, secret);
    }

    /* renamed from: d, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudRequestPayloadConnection)) {
            return false;
        }
        ApiTeleportCloudRequestPayloadConnection apiTeleportCloudRequestPayloadConnection = (ApiTeleportCloudRequestPayloadConnection) other;
        return AbstractC6492s.d(this.clientName, apiTeleportCloudRequestPayloadConnection.clientName) && AbstractC6492s.d(this.clientInfo, apiTeleportCloudRequestPayloadConnection.clientInfo) && AbstractC6492s.d(this.secret, apiTeleportCloudRequestPayloadConnection.secret);
    }

    public int hashCode() {
        return (((this.clientName.hashCode() * 31) + this.clientInfo.hashCode()) * 31) + this.secret.hashCode();
    }

    public String toString() {
        return "ApiTeleportCloudRequestPayloadConnection(clientName=" + this.clientName + ", clientInfo=" + this.clientInfo + ", secret=" + this.secret + ')';
    }
}
