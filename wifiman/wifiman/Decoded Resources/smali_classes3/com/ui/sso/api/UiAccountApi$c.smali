.class public final Lcom/ui/sso/api/UiAccountApi$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/sso/api/UiAccountApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:LNa/c;

.field private final e:Lcom/ui/sso/api/UiAccountApi$a;

.field private final f:Z

.field private final g:Z

.field private final h:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;LNa/c;Lcom/ui/sso/api/UiAccountApi$a;ZZZ)V
    .locals 1

    const-string/jumbo v0, "accountType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "appPackage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storageType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accessType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    iput-object p2, p0, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    iput-object p5, p0, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    iput-boolean p6, p0, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    iput-boolean p7, p0, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    iput-boolean p8, p0, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/sso/api/UiAccountApi$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()LNa/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/sso/api/UiAccountApi$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/sso/api/UiAccountApi$c;

    iget v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    iget v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    iget-object v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    iget-object v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    iget-boolean v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    iget-boolean v3, p1, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    iget-boolean p1, p1, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/ui/sso/api/UiAccountApi$c;->a:I

    iget-object v1, p0, Lcom/ui/sso/api/UiAccountApi$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/sso/api/UiAccountApi$c;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/sso/api/UiAccountApi$c;->d:LNa/c;

    iget-object v4, p0, Lcom/ui/sso/api/UiAccountApi$c;->e:Lcom/ui/sso/api/UiAccountApi$a;

    iget-boolean v5, p0, Lcom/ui/sso/api/UiAccountApi$c;->f:Z

    iget-boolean v6, p0, Lcom/ui/sso/api/UiAccountApi$c;->g:Z

    iget-boolean v7, p0, Lcom/ui/sso/api/UiAccountApi$c;->h:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "State(apiVersion="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", accountType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", appPackage="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", storageType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accessType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAndroidAccountStorageAccessible="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isAndroidAccountStorageApiOwner="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLocalAccountStorageApiOwner="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
