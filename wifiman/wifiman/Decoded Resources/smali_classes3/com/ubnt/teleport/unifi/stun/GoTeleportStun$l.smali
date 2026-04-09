.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->createLocalPeerDescription(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

.field final synthetic b:Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->b:Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->access$getInterfaceAddressesJson(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$m;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->b:Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;

    invoke-direct {v1, v2, v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$m;-><init>(Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;Ljava/lang/String;)V

    invoke-static {v1}, LN7/a;->b(Lmh/a;)V

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->b:Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$l;->b:Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;

    invoke-virtual {v3}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->access$bridgeCreateLocalPeerDesc(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->getError()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->getError()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->getLocalPeerDesc()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->getLocalPeerDesc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;

    const-string/jumbo v1, "Local peer description"

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
