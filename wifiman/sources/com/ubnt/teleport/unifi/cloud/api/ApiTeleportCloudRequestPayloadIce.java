package com.ubnt.teleport.unifi.cloud.api;

import K7.b;
import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadIce;", "LK7/b;", "", "secret", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/lang/String;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final class ApiTeleportCloudRequestPayloadIce extends b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String secret;

    public ApiTeleportCloudRequestPayloadIce(@g(name = "secret") String secret) {
        AbstractC6492s.i(secret, "secret");
        this.secret = secret;
    }

    /* renamed from: b, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }
}
