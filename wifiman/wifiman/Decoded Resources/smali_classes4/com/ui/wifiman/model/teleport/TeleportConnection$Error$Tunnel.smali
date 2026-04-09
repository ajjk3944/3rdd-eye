.class public final Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;
.super Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
.source "SourceFile"

# interfaces
.implements LWc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Tunnel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;",
        "Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;",
        "LWc/d;",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;",
        "cause",
        "<init>",
        "(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;",
        "()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;",
        "app-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;


# direct methods
.method public constructor <init>(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)V
    .locals 1

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    return-void
.end method


# virtual methods
.method public a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    iget-object p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic getCause()Ljava/lang/Throwable;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a()Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$Tunnel;->a:Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tunnel(cause="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
