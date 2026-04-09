package com.ubnt.teleport.unifi.cloud.api;

import K7.b;
import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;", "", "", "token", "LK7/b;", "payload", "<init>", "(Ljava/lang/String;LK7/b;)V", "copy", "(Ljava/lang/String;LK7/b;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "LK7/b;", "()LK7/b;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b payload;

    public ApiTeleportCloudRequest(@g(name = "token") String token, @g(name = "payload") b payload) {
        AbstractC6492s.i(token, "token");
        AbstractC6492s.i(payload, "payload");
        this.token = token;
        this.payload = payload;
    }

    /* renamed from: a, reason: from getter */
    public final b getPayload() {
        return this.payload;
    }

    /* renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final ApiTeleportCloudRequest copy(@g(name = "token") String token, @g(name = "payload") b payload) {
        AbstractC6492s.i(token, "token");
        AbstractC6492s.i(payload, "payload");
        return new ApiTeleportCloudRequest(token, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudRequest)) {
            return false;
        }
        ApiTeleportCloudRequest apiTeleportCloudRequest = (ApiTeleportCloudRequest) other;
        return AbstractC6492s.d(this.token, apiTeleportCloudRequest.token) && AbstractC6492s.d(this.payload, apiTeleportCloudRequest.payload);
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "ApiTeleportCloudRequest(token=" + this.token + ", payload=" + this.payload + ')';
    }
}
