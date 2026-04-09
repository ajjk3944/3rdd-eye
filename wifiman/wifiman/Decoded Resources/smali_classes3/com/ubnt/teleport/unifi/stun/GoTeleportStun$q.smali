.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


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


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$q;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$q;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->access$bridgeTryGetConnection(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getErrorMsg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$StunError;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
