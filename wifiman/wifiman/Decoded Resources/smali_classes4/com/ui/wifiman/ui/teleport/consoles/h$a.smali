.class public final Lcom/ui/wifiman/ui/teleport/consoles/h$a;
.super Lcom/ui/wifiman/ui/teleport/consoles/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/teleport/consoles/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ls9/a;

.field private final c:Ls9/d;

.field private final d:Ls9/d;

.field private final e:Lcom/ui/wifiman/ui/teleport/z;

.field private final f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

.field private final g:Z

.field private final h:Ljava/lang/Boolean;

.field private final i:Z

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;ZLjava/lang/Boolean;ZZ)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/teleport/consoles/h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    iput-object p4, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    iput-object p5, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    iput-object p6, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    iput-boolean p7, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    iput-object p8, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    iput-boolean p9, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    iput-boolean p10, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    return v0
.end method

.method public final d()Ls9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    iget-boolean p1, p1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    return v0
.end method

.method public final g()Lcom/ui/wifiman/ui/teleport/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    return-object v0
.end method

.method public final h()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    return-object v0
.end method

.method public final j()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->b:Ls9/a;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->c:Ls9/d;

    iget-object v3, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->d:Ls9/d;

    iget-object v4, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->e:Lcom/ui/wifiman/ui/teleport/z;

    iget-object v5, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->f:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    iget-boolean v6, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->g:Z

    iget-object v7, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->h:Ljava/lang/Boolean;

    iget-boolean v8, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->i:Z

    iget-boolean v9, p0, Lcom/ui/wifiman/ui/teleport/consoles/h$a;->j:Z

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Console(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", image="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reachability="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connectability="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", invitedByTeleportLink="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", tokenValid="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", inEditMode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", deletableInEditMode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
