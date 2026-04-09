.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Ljava/net/InetAddress;

.field private final g:Ljava/net/InetAddress;

.field private final h:I

.field private final i:Ljava/util/List;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;ILjava/net/InetAddress;Ljava/net/InetAddress;ILjava/util/List;)V
    .locals 1

    const-string/jumbo v0, "listenIP"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "peerIP"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "remoteIP"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "udpEchoIP"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dns"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->a:I

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->b:Ljava/lang/String;

    iput p3, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->c:I

    iput-object p4, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->d:Ljava/lang/String;

    iput p5, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->e:I

    iput-object p6, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->f:Ljava/net/InetAddress;

    iput-object p7, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->g:Ljava/net/InetAddress;

    iput p8, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->h:I

    iput-object p9, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->i:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->a:I

    iget v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->c:I

    iget v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->e:I

    iget v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->f:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->f:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->g:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->g:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->h:I

    iget v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->i:Ljava/util/List;

    iget-object p1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->i:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->f:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->g:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->i:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "TunnelConfiguration(mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", listenIP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", listenPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", peerIP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", peerPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remoteIP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->f:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", udpEchoIP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->g:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", udpEchoNetmask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$f;->i:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
