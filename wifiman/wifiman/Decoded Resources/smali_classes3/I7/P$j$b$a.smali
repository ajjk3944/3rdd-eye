.class final LI7/P$j$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$j$b;->c(Lgg/i;)LDj/a;
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

    iput-object p1, p0, LI7/P$j$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, LI7/P$j$b$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)LDj/a;
    .locals 3

    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$InterruptedByUser;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    if-eqz v0, :cond_2

    iget-object v0, p0, LI7/P$j$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iget-object v1, p0, LI7/P$j$b$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    move-result-object v1

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;->b()I

    move-result v1

    if-ge v0, v1, :cond_1

    new-instance p1, LI7/P$j$b$a$a;

    iget-object v0, p0, LI7/P$j$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v1, p0, LI7/P$j$b$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {p1, v0, v1}, LI7/P$j$b$a$a;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    invoke-static {p1}, LN7/a;->b(Lmh/a;)V

    iget-object p1, p0, LI7/P$j$b$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    move-result-object p1

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a$a;->a()J

    move-result-wide v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance v0, LI7/P$j$b$a$b;

    iget-object v1, p0, LI7/P$j$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, LI7/P$j$b$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {v0, v1, v2}, LI7/P$j$b$a$b;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;

    const-string/jumbo v1, "error"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-direct {v0, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error$ReconnectionFailed;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V

    invoke-static {v0}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI7/P$j$b$a;->a(Ljava/lang/Throwable;)LDj/a;

    move-result-object p1

    return-object p1
.end method
