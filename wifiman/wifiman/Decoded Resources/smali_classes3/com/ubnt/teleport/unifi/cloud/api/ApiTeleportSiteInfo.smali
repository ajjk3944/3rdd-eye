.class public final Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
.super Lcom/ubnt/teleport/unifi/cloud/api/a;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Owner;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;,
        Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0005 !\"#$B\u001f\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u0008\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001d\u00a8\u0006%"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;",
        "Lcom/ubnt/teleport/unifi/cloud/api/a;",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;",
        "reachability",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        "metadata",
        "<init>",
        "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V",
        "copy",
        "(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;",
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
        "c",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;",
        "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;",
        "d",
        "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        "b",
        "()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;",
        "()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;",
        "state",
        "e",
        "a",
        "Location",
        "Metadata",
        "Owner",
        "Reachability",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$a;


# instance fields
.field private final c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

.field private final d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->e:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$a;

    return-void
.end method

.method public constructor <init>(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V
    .locals 0
    .param p1    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;
        .annotation runtime LY6/g;
            name = "connectionStateData"
        .end annotation
    .end param
    .param p2    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;
        .annotation runtime LY6/g;
            name = "metadata"
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/ubnt/teleport/unifi/cloud/api/a;-><init>()V

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    iput-object p2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    return-void
.end method


# virtual methods
.method public final b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    return-object v0
.end method

.method public final c()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    return-object v0
.end method

.method public final copy(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;
    .locals 1
    .param p1    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;
        .annotation runtime LY6/g;
            name = "connectionStateData"
        .end annotation
    .end param
    .param p2    # Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;
        .annotation runtime LY6/g;
            name = "metadata"
        .end annotation
    .end param

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    invoke-direct {v0, p1, p2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;-><init>(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;)V

    return-object v0
.end method

.method public final d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;
    .locals 4

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x7c6dfd17

    if-eq v2, v3, :cond_5

    const v3, 0x2e4a7314

    if-eq v2, v3, :cond_3

    const v3, 0x37c8963b

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "DISCONNECTED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->DISCONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    goto :goto_1

    :cond_3
    const-string/jumbo v2, "UNSTABLE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->UNSTABLE:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    goto :goto_1

    :cond_5
    const-string v2, "CONNECTED"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    sget-object v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;->CONNECTED:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    :cond_7
    :goto_1
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    iget-object v3, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    iget-object p1, p1, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApiTeleportSiteInfo(reachability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d:Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
