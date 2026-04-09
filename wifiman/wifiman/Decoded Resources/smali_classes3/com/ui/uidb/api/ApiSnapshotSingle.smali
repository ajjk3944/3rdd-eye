.class public final Lcom/ui/uidb/api/ApiSnapshotSingle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u0008\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0013\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ui/uidb/api/ApiSnapshotSingle;",
        "",
        "",
        "version",
        "Lcom/ui/uidb/api/ApiProduct;",
        "product",
        "<init>",
        "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)V",
        "copy",
        "(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)Lcom/ui/uidb/api/ApiSnapshotSingle;",
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
        "Ljava/lang/String;",
        "b",
        "Lcom/ui/uidb/api/ApiProduct;",
        "()Lcom/ui/uidb/api/ApiProduct;",
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/uidb/api/ApiProduct;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version"
        .end annotation
    .end param
    .param p2    # Lcom/ui/uidb/api/ApiProduct;
        .annotation runtime LY6/g;
            name = "device"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/uidb/api/ApiProduct;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)Lcom/ui/uidb/api/ApiSnapshotSingle;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "version"
        .end annotation
    .end param
    .param p2    # Lcom/ui/uidb/api/ApiProduct;
        .annotation runtime LY6/g;
            name = "device"
        .end annotation
    .end param

    new-instance v0, Lcom/ui/uidb/api/ApiSnapshotSingle;

    invoke-direct {v0, p1, p2}, Lcom/ui/uidb/api/ApiSnapshotSingle;-><init>(Ljava/lang/String;Lcom/ui/uidb/api/ApiProduct;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/uidb/api/ApiSnapshotSingle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/uidb/api/ApiSnapshotSingle;

    iget-object v1, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    iget-object p1, p1, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/ui/uidb/api/ApiProduct;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/uidb/api/ApiSnapshotSingle;->b:Lcom/ui/uidb/api/ApiProduct;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ApiSnapshotSingle(version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", product="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
