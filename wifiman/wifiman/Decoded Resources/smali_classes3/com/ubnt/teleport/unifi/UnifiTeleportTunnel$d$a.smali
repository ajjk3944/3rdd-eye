.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;
.super Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

.field private final b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;)V
    .locals 1

    const-string/jumbo v0, "tunnelConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "statistics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    return-void
.end method


# virtual methods
.method public a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->b:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d$a;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$d;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
