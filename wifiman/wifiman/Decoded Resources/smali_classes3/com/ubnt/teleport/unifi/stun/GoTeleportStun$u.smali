.class final Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;
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
.field public static final a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;->a:Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;->isSuccess()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$u;->a(Lcom/ubnt/teleport/unifi/stun/GoTeleportStun$TryGetConnectionResult;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
