.class final Lcom/ui/wifiman/model/wmw/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/wmw/b$c;

.field private final b:Lcom/ui/wifiman/model/wmw/b$c;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/b$c;Lcom/ui/wifiman/model/wmw/b$c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$a;->a:Lcom/ui/wifiman/model/wmw/b$c;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    iput-boolean p3, p0, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/wifiman/model/wmw/b$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/j$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/wmw/j$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$a;->a:Lcom/ui/wifiman/model/wmw/b$c;

    iget-object v3, p1, Lcom/ui/wifiman/model/wmw/j$a;->a:Lcom/ui/wifiman/model/wmw/b$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    iget-object v3, p1, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    iget-boolean p1, p1, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$a;->a:Lcom/ui/wifiman/model/wmw/b$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/j$a;->a:Lcom/ui/wifiman/model/wmw/b$c;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$a;->b:Lcom/ui/wifiman/model/wmw/b$c;

    iget-boolean v2, p0, Lcom/ui/wifiman/model/wmw/j$a;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AdoptionStateChange(prev="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latest="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", adoptionWasInProgressInPreviousStep="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
