.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->closePeer()Lgg/b;
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

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$i;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$j;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$j;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$i;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-static {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->access$bridgeClosePeer(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$k;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$k;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
