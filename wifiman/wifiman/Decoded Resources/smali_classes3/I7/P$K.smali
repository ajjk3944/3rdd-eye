.class final LI7/P$K;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$c;Lcom/ubnt/teleport/unifi/stun/TeleportStun;Lcom/wireguard/android/backend/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/P$K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$K;

    invoke-direct {v0}, LI7/P$K;-><init>()V

    sput-object v0, LI7/P$K;->a:LI7/P$K;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
    .locals 2

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;

    if-eqz v1, :cond_0

    const-string/jumbo v1, "isReconnecting"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$c;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$c;

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LI7/P$K;->a(LYg/s;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;

    move-result-object p1

    return-object p1
.end method
