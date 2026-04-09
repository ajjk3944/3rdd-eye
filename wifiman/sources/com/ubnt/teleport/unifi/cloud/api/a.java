package com.ubnt.teleport.unifi.cloud.api;

import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseError;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1255a f39589a = new C1255a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Z6.a f39590b;

    /* renamed from: com.ubnt.teleport.unifi.cloud.api.a$a, reason: collision with other inner class name */
    public static final class C1255a {
        public /* synthetic */ C1255a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z6.a a() {
            return a.f39590b;
        }

        private C1255a() {
        }
    }

    static {
        Z6.a aVarC = Z6.a.b(a.class, "response_type").c(ApiTeleportCloudResponseTokenFetch.class, "ACCESS_GRANTED").c(ApiTeleportCloudResponseTokenFetch.Error.TokenNotFound.class, "TOKEN_NOT_FOUND").c(ApiTeleportCloudResponseTokenFetch.Error.TokenNotRegistered.class, "TOKEN_NOT_REGISTERED").c(ApiTeleportCloudResponseTokenFetch.Error.TokenInvalidForRequestType.class, "TOKEN_INVALID_FOR_REQUEST_TYPE").c(ApiTeleportCloudResponseTokenFetch.Error.TokenExpired.class, "TOKEN_EXPIRED").c(ApiTeleportCloudResponseTokenFetch.Error.TokenRegistrationFailed.class, "TOKEN_REGISTRATION_ERROR").c(ApiTeleportCloudResponseIce.class, "ICE_CONFIGURATION").c(ApiTeleportCloudResponseIce.Error.class, "ICE_CONFIGURATION_ERROR").c(ApiTeleportCloudResponseConnection.class, "CONNECT_RESPONSE").c(ApiTeleportCloudResponseError.RequestFailed.class, "TELEPORT_REQUEST_ERROR").c(ApiTeleportCloudResponseError.ClientNotFound.class, "TELEPORT_CLIENT_NOT_FOUND").c(ApiTeleportCloudResponseError.SiteGatewayNotFound.class, "TELEPORT_SITE_GATEWAY_NOT_FOUND").c(ApiTeleportCloudResponseError.TeleportDisabled.class, "TELEPORT_DISABLED");
        AbstractC6492s.h(aVarC, "of(ApiTeleportCloudFetch…ava, \"TELEPORT_DISABLED\")");
        f39590b = aVarC;
    }
}
