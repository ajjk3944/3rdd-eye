.class final LI7/P$j$b$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$j$b$a;->a(Ljava/lang/Throwable;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V
    .locals 0

    iput-object p1, p0, LI7/P$j$b$a$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, LI7/P$j$b$a$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Retrying to establish tunnel connection. Try num "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI7/P$j$b$a$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI7/P$j$b$a$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    move-result-object v1

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/P$j$b$a$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
