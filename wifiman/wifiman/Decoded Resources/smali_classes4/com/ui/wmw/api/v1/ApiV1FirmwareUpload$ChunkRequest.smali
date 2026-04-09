.class public final Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J.\u0010\n\u001a\u00020\t2\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u000fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "com/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest",
        "",
        "",
        "stateId",
        "",
        "chunkOffset",
        "chunkSize",
        "<init>",
        "(Ljava/lang/String;II)V",
        "Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;",
        "copy",
        "(Ljava/lang/String;II)Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/String;",
        "d",
        "b",
        "I",
        "c",
        "Lcom/ui/wmw/api/v1/c;",
        "()Lcom/ui/wmw/api/v1/c;",
        "state",
        "wifiman-wizard_release"
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

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "status"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LY6/g;
            name = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LY6/g;
            name = "size"
        .end annotation
    .end param

    const-string v0, "stateId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    iput p2, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    iput p3, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    return v0
.end method

.method public final c()Lcom/ui/wmw/api/v1/c;
    .locals 2

    sget-object v0, Lcom/ui/wmw/api/v1/c;->Companion:Lcom/ui/wmw/api/v1/c$a;

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/c$a;->a()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wmw/api/v1/c;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;II)Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "status"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime LY6/g;
            name = "offset"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LY6/g;
            name = "size"
        .end annotation
    .end param

    const-string v0, "stateId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    invoke-direct {v0, p1, p2, p3}, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    iget v3, p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    iget p1, p1, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->a:Ljava/lang/String;

    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->b:I

    iget v2, p0, Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;->c:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ChunkRequest(stateId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", chunkOffset="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", chunkSize="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
