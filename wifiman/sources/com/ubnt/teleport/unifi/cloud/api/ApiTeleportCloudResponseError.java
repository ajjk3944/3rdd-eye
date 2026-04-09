package com.ubnt.teleport.unifi.cloud.api;

import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class ApiTeleportCloudResponseError extends a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$ClientNotFound;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final class ClientNotFound extends ApiTeleportCloudResponseError {
        public ClientNotFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$RequestFailed;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final class RequestFailed extends ApiTeleportCloudResponseError {
        public RequestFailed() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$SiteGatewayNotFound;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final class SiteGatewayNotFound extends ApiTeleportCloudResponseError {
        public SiteGatewayNotFound() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$TeleportDisabled;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError;", "()V", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @i(generateAdapter = true)
    public static final class TeleportDisabled extends ApiTeleportCloudResponseError {
        public TeleportDisabled() {
            super(null);
        }
    }

    public /* synthetic */ ApiTeleportCloudResponseError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiTeleportCloudResponseError() {
    }
}
