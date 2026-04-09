.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->setupPeerConnection(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;)Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;
    .locals 4

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getLocalIP()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getLocalPort()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getRemoteIP()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->getRemotePort()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-object v0

    :cond_0
    new-instance p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;

    const-string/jumbo v0, "missing remote port in connection result"

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;

    const-string/jumbo v0, "missing remote ip in connection result"

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;

    const-string/jumbo v0, "missing local port in connection result"

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;

    const-string/jumbo v0, "missing local ip in connection result"

    invoke-direct {p1, v0}, Lcom/ubnt/teleport/unifi/stun/TeleportStun$Error$InvalidLibOutput;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$v;->a(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;)Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    move-result-object p1

    return-object p1
.end method
