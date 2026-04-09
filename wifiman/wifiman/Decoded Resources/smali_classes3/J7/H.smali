.class public abstract LJ7/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "\"stun:global.stun.twilio.com:3478\""

    const-string v3, "\"stun:global.stun.twilio.com:3478?transport=udp\""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/t;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
