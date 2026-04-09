.class public final LI7/P$y$d$e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$y$d$e;->n(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

.field final synthetic c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

.field final synthetic d:LI7/P;

.field final synthetic e:Lcom/wireguard/crypto/c;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;LI7/P;Lcom/wireguard/crypto/c;)V
    .locals 0

    iput-object p1, p0, LI7/P$y$d$e$g;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iput-object p2, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    iput-object p3, p0, LI7/P$y$d$e$g;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    iput-object p4, p0, LI7/P$y$d$e$g;->d:LI7/P;

    iput-object p5, p0, LI7/P$y$d$e$g;->e:Lcom/wireguard/crypto/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 14

    const-string/jumbo v0, "hostAddress"

    :try_start_0
    sget-object v1, LI7/P$y$d$e$a;->a:LI7/P$y$d$e$a;

    invoke-static {v1}, LN7/a;->b(Lmh/a;)V

    iget-object v1, p0, LI7/P$y$d$e$g;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result v3

    iget-object v1, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v10

    iget-object v1, p0, LI7/P$y$d$e$g;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, LI7/P$y$d$e$g;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->b()I

    move-result v7

    iget-object v1, p0, LI7/P$y$d$e$g;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->c()Ljava/lang/String;

    move-result-object v8

    iget-object v1, p0, LI7/P$y$d$e$g;->c:Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;->d()I

    move-result v9

    iget-object v1, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v11

    iget-object v1, p0, LI7/P$y$d$e$g;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e()I

    move-result v12

    iget-object v2, p0, LI7/P$y$d$e$g;->d:LI7/P;

    iget-object v1, p0, LI7/P$y$d$e$g;->e:Lcom/wireguard/crypto/c;

    const-string/jumbo v4, "encKeypar"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LI7/P$y$d$e$g;->e:Lcom/wireguard/crypto/c;

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v2 .. v13}, LI7/P;->R(LI7/P;ILcom/wireguard/crypto/c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/wireguard/config/a;

    move-result-object v0

    iget-object v1, p0, LI7/P$y$d$e$g;->d:LI7/P;

    invoke-static {v1}, LI7/P;->L(LI7/P;)Lcom/wireguard/android/backend/a;

    move-result-object v1

    iget-object v2, p0, LI7/P$y$d$e$g;->d:LI7/P;

    sget-object v3, Lcom/wireguard/android/backend/c$a;->UP:Lcom/wireguard/android/backend/c$a;

    invoke-interface {v1, v2, v3, v0}, Lcom/wireguard/android/backend/a;->a(Lcom/wireguard/android/backend/c;Lcom/wireguard/android/backend/c$a;Lcom/wireguard/config/a;)Lcom/wireguard/android/backend/c$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
