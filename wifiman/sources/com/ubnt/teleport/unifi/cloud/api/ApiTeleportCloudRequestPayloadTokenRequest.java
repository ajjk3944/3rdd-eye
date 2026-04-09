package com.ubnt.teleport.unifi.cloud.api;

import K7.b;
import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadTokenRequest;", "LK7/b;", "", "clientId", "clientName", "secret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadTokenRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudRequestPayloadTokenRequest extends b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secret;

    public ApiTeleportCloudRequestPayloadTokenRequest(@g(name = "client_id") String clientId, @g(name = "client_name") String clientName, @g(name = "secret") String secret) {
        AbstractC6492s.i(clientId, "clientId");
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(secret, "secret");
        this.clientId = clientId;
        this.clientName = clientName;
        this.secret = secret;
    }

    /* renamed from: b, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: c, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    public final ApiTeleportCloudRequestPayloadTokenRequest copy(@g(name = "client_id") String clientId, @g(name = "client_name") String clientName, @g(name = "secret") String secret) {
        AbstractC6492s.i(clientId, "clientId");
        AbstractC6492s.i(clientName, "clientName");
        AbstractC6492s.i(secret, "secret");
        return new ApiTeleportCloudRequestPayloadTokenRequest(clientId, clientName, secret);
    }

    /* renamed from: d, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudRequestPayloadTokenRequest)) {
            return false;
        }
        ApiTeleportCloudRequestPayloadTokenRequest apiTeleportCloudRequestPayloadTokenRequest = (ApiTeleportCloudRequestPayloadTokenRequest) other;
        return AbstractC6492s.d(this.clientId, apiTeleportCloudRequestPayloadTokenRequest.clientId) && AbstractC6492s.d(this.clientName, apiTeleportCloudRequestPayloadTokenRequest.clientName) && AbstractC6492s.d(this.secret, apiTeleportCloudRequestPayloadTokenRequest.secret);
    }

    public int hashCode() {
        return (((this.clientId.hashCode() * 31) + this.clientName.hashCode()) * 31) + this.secret.hashCode();
    }

    public String toString() {
        return "ApiTeleportCloudRequestPayloadTokenRequest(clientId=" + this.clientId + ", clientName=" + this.clientName + ", secret=" + this.secret + ')';
    }
}
