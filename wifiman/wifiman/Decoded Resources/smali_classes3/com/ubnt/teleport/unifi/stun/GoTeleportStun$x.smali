.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;
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


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;->h()V

    return-void
.end method

.method private static final h()V
    .locals 1

    sget-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x$a;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x$a;

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/D;
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->closePeer()Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/stun/b;

    invoke-direct {v1}, Lcom/ubnt/teleport/unifi/stun/b;-><init>()V

    invoke-virtual {v0, v1}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object v0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$x;->c(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
