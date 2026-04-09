package com.ubnt.teleport.unifi.cloud.api;

import K7.b;
import Y6.g;
import Y6.i;
import com.ubnt.teleport.unifi.util.moshi.ForcedStringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJd\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "LK7/b;", "", "encryptionPublicKey", "peerDescription", "stunSessionSecret", "", "udpEchoPort", "udpEchoAddr", "udpEchoTunnelAddress", "udpEchoTunnelAddressMask", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "h", "i", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudClientInfo extends b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String encryptionPublicKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String peerDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stunSessionSecret;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer udpEchoPort;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String udpEchoAddr;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String udpEchoTunnelAddress;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer udpEchoTunnelAddressMask;

    public ApiTeleportCloudClientInfo(@g(name = "wg_pub_key") String str, @g(name = "peer_desc") @ForcedStringValue String str2, @g(name = "stun_session_secret") String str3, @g(name = "udp_echo_port") Integer num, @g(name = "udp_echo_addr") String str4, @g(name = "tunnel_addr") String str5, @g(name = "tunnel_mask") Integer num2) {
        this.encryptionPublicKey = str;
        this.peerDescription = str2;
        this.stunSessionSecret = str3;
        this.udpEchoPort = num;
        this.udpEchoAddr = str4;
        this.udpEchoTunnelAddress = str5;
        this.udpEchoTunnelAddressMask = num2;
    }

    /* renamed from: b, reason: from getter */
    public final String getEncryptionPublicKey() {
        return this.encryptionPublicKey;
    }

    /* renamed from: c, reason: from getter */
    public final String getPeerDescription() {
        return this.peerDescription;
    }

    public final ApiTeleportCloudClientInfo copy(@g(name = "wg_pub_key") String encryptionPublicKey, @g(name = "peer_desc") @ForcedStringValue String peerDescription, @g(name = "stun_session_secret") String stunSessionSecret, @g(name = "udp_echo_port") Integer udpEchoPort, @g(name = "udp_echo_addr") String udpEchoAddr, @g(name = "tunnel_addr") String udpEchoTunnelAddress, @g(name = "tunnel_mask") Integer udpEchoTunnelAddressMask) {
        return new ApiTeleportCloudClientInfo(encryptionPublicKey, peerDescription, stunSessionSecret, udpEchoPort, udpEchoAddr, udpEchoTunnelAddress, udpEchoTunnelAddressMask);
    }

    /* renamed from: d, reason: from getter */
    public final String getStunSessionSecret() {
        return this.stunSessionSecret;
    }

    /* renamed from: e, reason: from getter */
    public final String getUdpEchoAddr() {
        return this.udpEchoAddr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudClientInfo)) {
            return false;
        }
        ApiTeleportCloudClientInfo apiTeleportCloudClientInfo = (ApiTeleportCloudClientInfo) other;
        return AbstractC6492s.d(this.encryptionPublicKey, apiTeleportCloudClientInfo.encryptionPublicKey) && AbstractC6492s.d(this.peerDescription, apiTeleportCloudClientInfo.peerDescription) && AbstractC6492s.d(this.stunSessionSecret, apiTeleportCloudClientInfo.stunSessionSecret) && AbstractC6492s.d(this.udpEchoPort, apiTeleportCloudClientInfo.udpEchoPort) && AbstractC6492s.d(this.udpEchoAddr, apiTeleportCloudClientInfo.udpEchoAddr) && AbstractC6492s.d(this.udpEchoTunnelAddress, apiTeleportCloudClientInfo.udpEchoTunnelAddress) && AbstractC6492s.d(this.udpEchoTunnelAddressMask, apiTeleportCloudClientInfo.udpEchoTunnelAddressMask);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getUdpEchoPort() {
        return this.udpEchoPort;
    }

    /* renamed from: g, reason: from getter */
    public final String getUdpEchoTunnelAddress() {
        return this.udpEchoTunnelAddress;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getUdpEchoTunnelAddressMask() {
        return this.udpEchoTunnelAddressMask;
    }

    public int hashCode() {
        String str = this.encryptionPublicKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.peerDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stunSessionSecret;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.udpEchoPort;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.udpEchoAddr;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.udpEchoTunnelAddress;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.udpEchoTunnelAddressMask;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ApiTeleportCloudClientInfo(encryptionPublicKey=" + this.encryptionPublicKey + ", peerDescription=" + this.peerDescription + ", stunSessionSecret=" + this.stunSessionSecret + ", udpEchoPort=" + this.udpEchoPort + ", udpEchoAddr=" + this.udpEchoAddr + ", udpEchoTunnelAddress=" + this.udpEchoTunnelAddress + ", udpEchoTunnelAddressMask=" + this.udpEchoTunnelAddressMask + ')';
    }
}
