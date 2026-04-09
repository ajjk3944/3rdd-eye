package com.ubnt.teleport.unifi.cloud.api;

import Y6.g;
import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;", "Lcom/ubnt/teleport/unifi/cloud/api/a;", "", "secret", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "d", "Error", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class ApiTeleportCloudResponseTokenFetch extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secret;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    public static abstract class Error extends a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenExpired;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @i(generateAdapter = true)
        public static final class TokenExpired extends Error {
            public TokenExpired() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenInvalidForRequestType;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @i(generateAdapter = true)
        public static final class TokenInvalidForRequestType extends Error {
            public TokenInvalidForRequestType() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotFound;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @i(generateAdapter = true)
        public static final class TokenNotFound extends Error {
            public TokenNotFound() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotRegistered;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @i(generateAdapter = true)
        public static final class TokenNotRegistered extends Error {
            public TokenNotRegistered() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenRegistrationFailed;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @i(generateAdapter = true)
        public static final class TokenRegistrationFailed extends Error {
            public TokenRegistrationFailed() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public ApiTeleportCloudResponseTokenFetch(@g(name = "secret") String str, @g(name = "token") String str2) {
        this.secret = str;
        this.token = str2;
    }

    /* renamed from: b, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* renamed from: c, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final ApiTeleportCloudResponseTokenFetch copy(@g(name = "secret") String secret, @g(name = "token") String token) {
        return new ApiTeleportCloudResponseTokenFetch(secret, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiTeleportCloudResponseTokenFetch)) {
            return false;
        }
        ApiTeleportCloudResponseTokenFetch apiTeleportCloudResponseTokenFetch = (ApiTeleportCloudResponseTokenFetch) other;
        return AbstractC6492s.d(this.secret, apiTeleportCloudResponseTokenFetch.secret) && AbstractC6492s.d(this.token, apiTeleportCloudResponseTokenFetch.token);
    }

    public int hashCode() {
        String str = this.secret;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiTeleportCloudResponseTokenFetch(secret=" + this.secret + ", token=" + this.token + ')';
    }
}
