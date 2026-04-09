.class public final Lcom/ui/wifiman/model/teleport/h$a;
.super Lcom/ui/wifiman/model/teleport/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/teleport/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Lcom/ui/wifiman/model/ubiquiti/console/e;

.field private final f:LKd/a;

.field private final g:Lcom/ui/wifiman/model/teleport/n$b;

.field private final h:LFd/B;


# direct methods
.method private constructor <init>(Ljava/lang/String;ZLcom/ui/wifiman/model/ubiquiti/console/e;LKd/a;Lcom/ui/wifiman/model/teleport/n$b;LFd/B;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cloudConsole"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/teleport/h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    .line 5
    iput-object p3, p0, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    .line 6
    iput-object p4, p0, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    .line 7
    iput-object p5, p0, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    .line 8
    iput-object p6, p0, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLcom/ui/wifiman/model/ubiquiti/console/e;LKd/a;Lcom/ui/wifiman/model/teleport/n$b;LFd/B;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/ui/wifiman/model/teleport/h$a;-><init>(Ljava/lang/String;ZLcom/ui/wifiman/model/ubiquiti/console/e;LKd/a;Lcom/ui/wifiman/model/teleport/n$b;LFd/B;)V

    return-void
.end method


# virtual methods
.method protected B()LKd/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    return-object v0
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/teleport/h$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/teleport/h$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    iget-object v3, p1, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    iget-object v3, p1, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    iget-object p1, p1, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method protected g()Lcom/ui/wifiman/model/ubiquiti/console/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->j(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LKd/a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public t()LRd/a;
    .locals 7

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a()LRd/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a()LRd/a;

    move-result-object v0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, LRd/a$b$a;->a:LRd/a$b$a;

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/ui/wifiman/model/teleport/tunnel/TeleportAvailableNonFatal;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e;->l()Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$a$b;->a()LRd/a;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h$a;->B()LKd/a;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Teleport unsupported and cloudConsole?.network: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and : cloudConsole.network?.teleportStatus : "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", tunnelRecord : "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/ui/wifiman/model/teleport/tunnel/TeleportAvailableNonFatal;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, LRd/a$c;->a:LRd/a$c;

    :goto_2
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ui/wifiman/model/teleport/h$a;->d:Z

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/h$a;->e:Lcom/ui/wifiman/model/ubiquiti/console/e;

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/h$a;->f:LKd/a;

    iget-object v4, p0, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    iget-object v5, p0, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Cloud(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isMain="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", cloudConsole="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tunnelRecord="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tokenState="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", teleportConnection="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v()LFd/B;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->h:LFd/B;

    return-object v0
.end method

.method public y()Lcom/ui/wifiman/model/teleport/n$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/h$a;->g:Lcom/ui/wifiman/model/teleport/n$b;

    return-object v0
.end method
