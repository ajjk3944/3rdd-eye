.class public final Lcom/ui/uidb/api/ApiProductUnifi$Network;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/uidb/api/ApiProductUnifi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Network"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0010\u0008\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJF\u0010\u000c\u001a\u00020\u00002\u0010\u0008\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/ui/uidb/api/ApiProductUnifi$Network;",
        "",
        "",
        "Lcom/ui/uidb/api/ApiProductUnifi$BleService;",
        "bleServices",
        "",
        "type",
        "model",
        "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;",
        "shadowMode",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)V",
        "copy",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)Lcom/ui/uidb/api/ApiProductUnifi$Network;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "b",
        "Ljava/lang/String;",
        "d",
        "c",
        "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;",
        "()Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;",
        "uidb"
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
.field private final a:Ljava/util/List;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "bleServices"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "model"
        .end annotation
    .end param
    .param p4    # Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;
        .annotation runtime LY6/g;
            name = "shadowMode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ui/uidb/api/ApiProductUnifi$BleService;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)Lcom/ui/uidb/api/ApiProductUnifi$Network;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "bleServices"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "model"
        .end annotation
    .end param
    .param p4    # Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;
        .annotation runtime LY6/g;
            name = "shadowMode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ui/uidb/api/ApiProductUnifi$BleService;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;",
            ")",
            "Lcom/ui/uidb/api/ApiProductUnifi$Network;"
        }
    .end annotation

    new-instance v0, Lcom/ui/uidb/api/ApiProductUnifi$Network;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ui/uidb/api/ApiProductUnifi$Network;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;)V

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;

    iget-object v1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    iget-object p1, p1, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/uidb/api/ApiProductUnifi$Network;->d:Lcom/ui/uidb/api/ApiProductUnifi$ShadowMode;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Network(bleServices="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shadowMode="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
