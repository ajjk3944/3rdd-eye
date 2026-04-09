.class public final Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/cloud/TeleportCloud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/net/InetAddress;

.field private final b:Ljava/util/List;

.field private final c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

.field private final d:Ljava/net/InetAddress;

.field private final e:I

.field private final f:Ljava/net/InetAddress;

.field private final g:I


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;Ljava/util/List;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;Ljava/net/InetAddress;ILjava/net/InetAddress;I)V
    .locals 1

    const-string/jumbo v0, "remotePeerIp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dnsServers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "remotePeer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "udpEchoAddress"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "remoteUdpEchoAddress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    iput-object p4, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    iput p5, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    iput-object p6, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    iput p7, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    return-object v0
.end method

.method public final c()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final d()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    iget v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    iget p1, p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ljava/net/InetAddress;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    invoke-virtual {v0}, Ljava/net/InetAddress;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    invoke-virtual {v1}, Ljava/net/InetAddress;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionInfo(remotePeerIp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->a:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dnsServers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remotePeer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->c:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", udpEchoAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->d:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", udpEchoPort="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", remoteUdpEchoAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->f:Ljava/net/InetAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remoteUdpEchoMask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$a;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
