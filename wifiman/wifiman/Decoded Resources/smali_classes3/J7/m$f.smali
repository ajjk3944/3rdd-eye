.class final LJ7/m$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/m;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ7/m;


# direct methods
.method constructor <init>(LJ7/m;)V
    .locals 0

    iput-object p1, p0, LJ7/m$f;->a:LJ7/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;
    .locals 12

    const-string v0, "\' is not an IP address"

    :try_start_0
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_3

    const-string/jumbo v1, "try {\n                  \u2026or)\n                    }"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    :try_start_1
    invoke-static {v6}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v6
    :try_end_1
    .catch Ljava/net/UnknownHostException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "dns addr \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    move-object v6, v4

    goto :goto_1

    :cond_1
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    move-object v6, v1

    :goto_1
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v4, p0, LJ7/m$f;->a:LJ7/m;

    invoke-static {v4, v1}, LJ7/m;->C(LJ7/m;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    move-result-object v7

    if-eqz v7, :cond_6

    :try_start_2
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->e()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_2

    const-string/jumbo v4, "missing udp echo address"

    if-eqz v1, :cond_5

    :try_start_3
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v8
    :try_end_3
    .catch Ljava/net/UnknownHostException; {:try_start_3 .. :try_end_3} :catch_2

    const-string/jumbo v1, "try {\n                  \u2026  )\n                    }"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object v9

    invoke-virtual {v9}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->f()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :try_start_4
    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object v10

    invoke-virtual {v10}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->g()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-static {v10}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v10
    :try_end_4
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->h()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    move-object v4, p1

    invoke-direct/range {v4 .. v11}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;-><init>(Ljava/net/InetAddress;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;Ljava/net/InetAddress;ILjava/net/InetAddress;I)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v0, "missing udp echo address mask"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_1
    move-exception v1

    goto :goto_2

    :cond_3
    :try_start_5
    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
    :try_end_5
    .catch Ljava/net/UnknownHostException; {:try_start_5 .. :try_end_5} :catch_1

    :goto_2
    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "udp echo tunnel address \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_4
    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v0, "missing udp echo port"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_2
    move-exception v1

    goto :goto_3

    :cond_5
    :try_start_6
    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
    :try_end_6
    .catch Ljava/net/UnknownHostException; {:try_start_6 .. :try_end_6} :catch_2

    :goto_3
    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "udp echo address \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_6
    new-instance p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v0, "missing peer info"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_3
    move-exception v1

    goto :goto_4

    :cond_7
    :try_start_7
    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    const-string/jumbo v4, "missing remote peer IP"

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
    :try_end_7
    .catch Ljava/net/UnknownHostException; {:try_start_7 .. :try_end_7} :catch_3

    :goto_4
    new-instance v2, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "client IP \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;

    invoke-virtual {p0, p1}, LJ7/m$f;->a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudResponseConnection;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    move-result-object p1

    return-object p1
.end method
