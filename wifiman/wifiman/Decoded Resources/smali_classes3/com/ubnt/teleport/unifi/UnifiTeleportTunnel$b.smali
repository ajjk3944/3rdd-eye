.class public final Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ubnt/teleport/TeleportTunnel$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;I)V
    .locals 1

    const-string/jumbo v0, "reconnect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    iput p2, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->b:I

    return v0
.end method

.method public final b()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result p1

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConnectionParams(reconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$b;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
