.class public final LJ7/m$k$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m$k;->a(Ljava/lang/String;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/n;


# direct methods
.method public constructor <init>(LJ7/n;)V
    .locals 0

    iput-object p1, p0, LJ7/m$k$a;->a:LJ7/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LMj/w;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LJ7/m$k$a;->a:LJ7/n;

    const-string/jumbo v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LMj/w;->f()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LMj/w;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, LMj/w;->d()Lokhttp3/ResponseBody;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->C()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    :try_start_0
    invoke-static {v0}, LJ7/n;->i(LJ7/n;)LY6/h;

    move-result-object v4

    invoke-virtual {v4, v1}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :try_start_1
    invoke-static {v0}, LJ7/n;->h(LJ7/n;)LY6/h;

    move-result-object v0

    invoke-virtual {v0, v1}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    invoke-virtual {p1}, LMj/w;->b()I

    move-result v1

    instance-of v4, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseIce;

    if-eqz v4, :cond_2

    return-object v0

    :cond_2
    instance-of v4, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;

    if-eqz v4, :cond_9

    const/16 v2, 0x191

    if-eq v1, v2, :cond_8

    const/16 v2, 0x194

    if-eq v1, v2, :cond_8

    check-cast v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;->c()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "Valid token is required."

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, LMj/w;->b()I

    move-result p1

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_4
    move-object v1, v3

    :goto_2
    check-cast v1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudError$Error;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_5
    move-object v3, v1

    :cond_6
    :goto_3
    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    invoke-direct {v0, p1, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_7
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;

    throw p1

    :cond_8
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;

    throw p1

    :cond_9
    instance-of p1, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$TeleportDisabled;

    if-nez p1, :cond_f

    instance-of p1, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenNotFound;

    if-eqz p1, :cond_a

    const/4 p1, 0x1

    goto :goto_4

    :cond_a
    instance-of p1, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseTokenFetch$Error$TokenExpired;

    :goto_4
    if-nez p1, :cond_e

    instance-of p1, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$ClientNotFound;

    if-nez p1, :cond_d

    instance-of p1, v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseError$SiteGatewayNotFound;

    if-nez p1, :cond_c

    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Invalid response - "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_b
    move-object v0, v3

    :goto_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_c
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$SiteGatewayNotFound;

    throw p1

    :cond_d
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$ClientInvalid;

    throw p1

    :cond_e
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$Unauthenticated;

    throw p1

    :cond_f
    sget-object p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$CloudError$TeleportDisabled;

    throw p1

    :catch_1
    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    invoke-virtual {p1}, LMj/w;->b()I

    move-result p1

    invoke-direct {v0, p1, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_10
    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;

    invoke-virtual {p1}, LMj/w;->b()I

    move-result p1

    invoke-direct {v0, p1, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$ApiError;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMj/w;

    invoke-virtual {p0, p1}, LJ7/m$k$a;->a(LMj/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
