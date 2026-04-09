.class public abstract LK7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;)V
    .locals 2

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestResponse;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "missing requestID in long term token generation request"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static b(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;)V
    .locals 2

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->b()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p0

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->c()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "connection info fetch - server info missing peer description"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "connection info fetch - server info missing public key"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "connection info fetch - server info unavailable"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "connection info fetch - dns unavailable"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_4
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "connection info fetch - client ip unavailable"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static c(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;)V
    .locals 2

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "ice fetch - ice unavailable"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method

.method public static d(LK7/c;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;)V
    .locals 2

    const-string p0, "$receiver"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;->b()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch;->c()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "token fetch - token unavailable"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo p1, "token fetch - secret unavailable"

    invoke-direct {p0, p1, v1, v0, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p0
.end method
