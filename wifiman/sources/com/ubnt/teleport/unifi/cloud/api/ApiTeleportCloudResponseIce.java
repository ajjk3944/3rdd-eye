package com.ubnt.teleport.unifi.cloud.api;

import Y6.g;
import Y6.i;
import com.ubnt.teleport.unifi.util.moshi.ForcedStringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;", "Lcom/ubnt/teleport/unifi/cloud/api/a;", "", "ice", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Error", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudResponseIce extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ice;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce$Error;", "Lcom/ubnt/teleport/unifi/cloud/api/a;", "<init>", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final class Error extends a {
    }

    public ApiTeleportCloudResponseIce(@g(name = "ice_configuration") @ForcedStringValue String str) {
        this.ice = str;
    }

    /* renamed from: b, reason: from getter */
    public final String getIce() {
        return this.ice;
    }

    public final ApiTeleportCloudResponseIce copy(@g(name = "ice_configuration") @ForcedStringValue String ice) {
        return new ApiTeleportCloudResponseIce(ice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiTeleportCloudResponseIce) && AbstractC6492s.d(this.ice, ((ApiTeleportCloudResponseIce) other).ice);
    }

    public int hashCode() {
        String str = this.ice;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ApiTeleportCloudResponseIce(ice=" + this.ice + ')';
    }
}
