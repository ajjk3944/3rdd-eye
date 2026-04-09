.class public final LId/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d$h;->a(LJd/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LJd/b;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;


# direct methods
.method public constructor <init>(LJd/b;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;)V
    .locals 0

    iput-object p1, p0, LId/d$h$a;->a:LJd/b;

    iput-object p2, p0, LId/d$h$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 10

    :try_start_0
    iget-object v0, p0, LId/d$h$a;->a:LJd/b;

    new-instance v9, LJd/a;

    iget-object v1, p0, LId/d$h$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->b()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, LId/d$h$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->a()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, LId/d$h$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v2, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, LJd/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v9}, LJd/b;->b(LJd/a;)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, LId/d$h$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to store tunnel "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
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
