.class public abstract Lcom/ubnt/teleport/unifi/cloud/api/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/api/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/cloud/api/a$a;

.field private static final b:LZ6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/cloud/api/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/api/a;->a:Lcom/ubnt/teleport/unifi/cloud/api/a$a;

    const-class v0, Lcom/ubnt/teleport/unifi/cloud/api/a;

    const-string/jumbo v1, "response_type"

    invoke-static {v0, v1}, LZ6/a;->b(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;

    const-string v2, "ACCESS_GRANTED"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotFound;

    const-string/jumbo v2, "TOKEN_NOT_FOUND"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotRegistered;

    const-string/jumbo v2, "TOKEN_NOT_REGISTERED"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenInvalidForRequestType;

    const-string/jumbo v2, "TOKEN_INVALID_FOR_REQUEST_TYPE"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenExpired;

    const-string/jumbo v2, "TOKEN_EXPIRED"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenRegistrationFailed;

    const-string/jumbo v2, "TOKEN_REGISTRATION_ERROR"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    const-string/jumbo v2, "ICE_CONFIGURATION"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce$Error;

    const-string/jumbo v2, "ICE_CONFIGURATION_ERROR"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;

    const-string v2, "CONNECT_RESPONSE"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$RequestFailed;

    const-string/jumbo v2, "TELEPORT_REQUEST_ERROR"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$ClientNotFound;

    const-string/jumbo v2, "TELEPORT_CLIENT_NOT_FOUND"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$SiteGatewayNotFound;

    const-string/jumbo v2, "TELEPORT_SITE_GATEWAY_NOT_FOUND"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-class v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$TeleportDisabled;

    const-string/jumbo v2, "TELEPORT_DISABLED"

    invoke-virtual {v0, v1, v2}, LZ6/a;->c(Ljava/lang/Class;Ljava/lang/String;)LZ6/a;

    move-result-object v0

    const-string/jumbo v1, "of(ApiTeleportCloudFetch\u2026ava, \"TELEPORT_DISABLED\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/api/a;->b:LZ6/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LZ6/a;
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/cloud/api/a;->b:LZ6/a;

    return-object v0
.end method
