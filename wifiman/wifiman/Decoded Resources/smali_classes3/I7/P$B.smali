.class final LI7/P$B;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P;->q0(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$B;->a:LI7/P;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "TUNNEL Open Connection "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI7/P$B;->a:LI7/P;

    invoke-virtual {v1}, LI7/P;->getConfig()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " SUCCESS"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/P$B;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
