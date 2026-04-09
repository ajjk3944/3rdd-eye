.class public abstract Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public static a(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "reconnect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    invoke-direct {v0, p2, p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;-><init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;I)V

    invoke-interface {p0, v0}, Lcom/ubnt/teleport/TeleportTunnel;->b(Lcom/ubnt/teleport/TeleportTunnel$b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;ILjava/lang/Object;)Lgg/b;
    .locals 0

    if-nez p4, :cond_2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, LI7/g;->a:LI7/g;

    invoke-virtual {p1}, LI7/g;->c()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, LI7/g;->a:LI7/g;

    invoke-virtual {p2}, LI7/g;->c()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    move-result-object p2

    :cond_1
    invoke-interface {p0, p1, p2}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;->a(ILcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;)Lgg/b;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: open"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
