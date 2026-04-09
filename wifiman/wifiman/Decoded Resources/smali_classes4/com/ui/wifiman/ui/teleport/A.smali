.class public final Lcom/ui/wifiman/ui/teleport/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/teleport/A$a;
    }
.end annotation


# instance fields
.field private final a:Ls9/d;

.field private final b:Lrf/f;

.field private final c:Lcom/ui/wifiman/ui/teleport/A$a;

.field private final d:Lcom/ui/wifiman/ui/teleport/x;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls9/d;Lrf/f;Lcom/ui/wifiman/ui/teleport/A$a;Lcom/ui/wifiman/ui/teleport/x;Z)V
    .locals 1

    const-string v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topology"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    iput-object p4, p0, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    iput-boolean p5, p0, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    return-object v0
.end method

.method public final b()Lcom/ui/wifiman/ui/teleport/A$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/ui/teleport/x;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    return-object v0
.end method

.method public final d()Lrf/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/teleport/A;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/teleport/A;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    iget-boolean p1, p1, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    invoke-virtual {v1}, Lrf/f;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ui/wifiman/ui/teleport/A$a;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/ui/wifiman/ui/teleport/x;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/A;->a:Ls9/d;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/A;->b:Lrf/f;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/A;->c:Lcom/ui/wifiman/ui/teleport/A$a;

    iget-object v3, p0, Lcom/ui/wifiman/ui/teleport/A;->d:Lcom/ui/wifiman/ui/teleport/x;

    iget-boolean v4, p0, Lcom/ui/wifiman/ui/teleport/A;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Status(connectionState="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", topology="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speed="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tunnelSwitchAvailable="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
