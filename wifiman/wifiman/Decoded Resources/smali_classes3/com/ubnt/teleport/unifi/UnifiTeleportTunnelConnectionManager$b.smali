.class final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

.field private final c:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->a:J

    .line 3
    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method public synthetic constructor <init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-wide/16 p1, 0xbb8

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;-><init>(J)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    return-void
.end method

.method public final b()J
    .locals 6

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {v1}, LZg/v;->C0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;->b()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;->b()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-double v2, v2

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;->a()J

    move-result-wide v4

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;->a()J

    move-result-wide v0

    sub-long/2addr v4, v0

    long-to-double v0, v4

    div-double/2addr v2, v0

    const-wide v0, 0x408f400000000000L    # 1000.0

    mul-double/2addr v2, v0

    double-to-long v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final c(J)V
    .locals 8

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    if-nez v0, :cond_0

    new-instance p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;-><init>(JJ)V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    goto :goto_1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->a:J

    sub-long v2, v0, v2

    iget-object v4, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v4}, Ljava/util/concurrent/LinkedBlockingQueue;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-string/jumbo v5, "accumulator.iterator()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string/jumbo v6, "iterator.next()"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    invoke-virtual {v5}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;->a()J

    move-result-wide v6

    cmp-long v6, v6, v2

    if-gez v6, :cond_1

    iput-object v5, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v3, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;

    invoke-direct {v3, v0, v1, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$b$a;-><init>(JJ)V

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method
