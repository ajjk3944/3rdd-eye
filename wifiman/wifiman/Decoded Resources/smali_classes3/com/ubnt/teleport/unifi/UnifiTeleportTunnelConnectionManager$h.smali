.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;

    invoke-direct {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;-><init>()V

    sput-object v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LY6/r;
    .locals 1

    new-instance v0, LY6/r$a;

    invoke-direct {v0}, LY6/r$a;-><init>()V

    invoke-virtual {v0}, LY6/r$a;->c()LY6/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$h;->a()LY6/r;

    move-result-object v0

    return-object v0
.end method
