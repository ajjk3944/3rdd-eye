.class public final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CreateLocalPeerDescResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0006\"\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;",
        "",
        "()V",
        "error",
        "",
        "getError",
        "()Ljava/lang/String;",
        "setError",
        "(Ljava/lang/String;)V",
        "localPeerDesc",
        "getLocalPeerDesc",
        "setLocalPeerDesc",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private error:Ljava/lang/String;

.field private localPeerDesc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocalPeerDesc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->localPeerDesc:Ljava/lang/String;

    return-object v0
.end method

.method public final setError(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->error:Ljava/lang/String;

    return-void
.end method

.method public final setLocalPeerDesc(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$CreateLocalPeerDescResult;->localPeerDesc:Ljava/lang/String;

    return-void
.end method
