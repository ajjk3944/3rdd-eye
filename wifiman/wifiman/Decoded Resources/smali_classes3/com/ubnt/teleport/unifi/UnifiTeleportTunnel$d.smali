.class public abstract Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b;,
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$b;

    if-eqz v0, :cond_0

    const-string v0, "DISCONNECTED"

    goto/16 :goto_1

    :cond_0
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$c;

    if-eqz v0, :cond_1

    const-string v0, "DISCONNECTED (reconnecting)"

    goto/16 :goto_1

    :cond_1
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DISCONNECTED (error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p0

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$c$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$c;

    if-eqz v0, :cond_4

    const-string v0, "CONNECTING (initialization)"

    goto :goto_1

    :cond_4
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$d;

    if-eqz v0, :cond_5

    const-string v0, "CONNECTING (peer description)"

    goto :goto_1

    :cond_5
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$b;

    if-eqz v0, :cond_6

    const-string v0, "CONNECTING (handshake)"

    goto :goto_1

    :cond_6
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$e;

    if-eqz v0, :cond_7

    const-string v0, "CONNECTING (tunnel creation)"

    goto :goto_1

    :cond_7
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$b$a;

    if-eqz v0, :cond_8

    const-string v0, "CONNECTING (connection activation)"

    goto :goto_1

    :cond_8
    instance-of v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECTED since "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p0

    check-cast v1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;->d()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " RX:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;->g()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " TX:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;->h()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
