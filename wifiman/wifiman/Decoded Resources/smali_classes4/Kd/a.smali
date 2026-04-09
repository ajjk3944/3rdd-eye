.class public final LKd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKd/a$a;,
        LKd/a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

.field private final c:Ljava/util/UUID;

.field private final d:LKd/a$a;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;)V
    .locals 1

    const-string v0, "tunnelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "console"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LKd/a;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    .line 5
    iput-object p3, p0, LKd/a;->c:Ljava/util/UUID;

    .line 6
    iput-object p4, p0, LKd/a;->d:LKd/a$a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LKd/a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;)V

    return-void
.end method

.method public static synthetic b(LKd/a;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;ILjava/lang/Object;)LKd/a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LKd/a;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, LKd/a;->c:Ljava/util/UUID;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, LKd/a;->d:LKd/a$a;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LKd/a;->a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;)LKd/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;)LKd/a;
    .locals 7

    const-string v0, "tunnelId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "console"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKd/a;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, LKd/a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c()LKd/a$a;
    .locals 1

    iget-object v0, p0, LKd/a;->d:LKd/a$a;

    return-object v0
.end method

.method public final d()LKd/a$b;
    .locals 1

    iget-object v0, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    if-eqz v0, :cond_0

    sget-object v0, LKd/a$b;->INVITATION_LINK:LKd/a$b;

    goto :goto_0

    :cond_0
    sget-object v0, LKd/a$b;->API:LKd/a$b;

    :goto_0
    return-object v0
.end method

.method public final e()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;
    .locals 1

    iget-object v0, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LKd/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LKd/a;

    iget-object v1, p0, LKd/a;->a:Ljava/lang/String;

    iget-object v3, p1, LKd/a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ubnt/teleport/TeleportTunnel$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iget-object v3, p1, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LKd/a;->c:Ljava/util/UUID;

    iget-object v3, p1, LKd/a;->c:Ljava/util/UUID;

    if-nez v1, :cond_5

    if-nez v3, :cond_4

    move v1, v0

    goto :goto_1

    :cond_4
    :goto_0
    move v1, v2

    goto :goto_1

    :cond_5
    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->d(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    :goto_1
    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LKd/a;->d:LKd/a$a;

    iget-object p1, p1, LKd/a;->d:LKd/a$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LKd/a;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LKd/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LKd/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->e(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKd/a;->c:Ljava/util/UUID;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKd/a;->d:LKd/a$a;

    invoke-virtual {v1}, LKd/a$a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LKd/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ubnt/teleport/TeleportTunnel$d;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LKd/a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iget-object v2, p0, LKd/a;->c:Ljava/util/UUID;

    if-nez v2, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->f(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object v3, p0, LKd/a;->d:LKd/a$a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TeleportTunnelRecord(tunnelId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", publicSecret="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ssoAccountId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", console="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
