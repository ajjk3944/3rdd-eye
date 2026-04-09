.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$r;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$r;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$p;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->access$bridgeSetRemotePeerDesc(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;Ljava/lang/String;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;->getError()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$SetRemotePeerDescResult;->getError()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
