.class public final Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;
.super Lcom/ui/comm/v4/UiCommV4Specs$Header;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/UiCommV4Specs$Header;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HttpResponse"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0008\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJF\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00062\u0016\u0008\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010\u0011R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010 \u001a\u0004\u0008\u001a\u0010!R\u001a\u0010&\u001a\u00020\"8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u0017\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;",
        "Lcom/ui/comm/v4/UiCommV4Specs$Header;",
        "",
        "guid",
        "",
        "timestamp",
        "",
        "statusCode",
        "",
        "headers",
        "<init>",
        "(Ljava/lang/String;JILjava/util/Map;)V",
        "copy",
        "(Ljava/lang/String;JILjava/util/Map;)Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Ljava/lang/String;",
        "a",
        "c",
        "J",
        "e",
        "()J",
        "d",
        "I",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "Lg9/c;",
        "f",
        "Lg9/c;",
        "()Lg9/c;",
        "type",
        "ui-communication-v4_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:I

.field private final e:Ljava/util/Map;

.field private final f:Lg9/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;JILjava/util/Map;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LY6/g;
            name = "timestamp"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LY6/g;
            name = "statusCode"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "headers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    iput p4, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    iput-object p5, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    sget-object p1, Lg9/c;->HTTP_RESPONSE:Lg9/c;

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->f:Lg9/c;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lg9/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->f:Lg9/c;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JILjava/util/Map;)Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # J
        .annotation runtime LY6/g;
            name = "timestamp"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime LY6/g;
            name = "statusCode"
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation runtime LY6/g;
            name = "headers"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;"
        }
    .end annotation

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    move-object v1, v0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;-><init>(Ljava/lang/String;JILjava/util/Map;)V

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    iget-wide v5, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    iget v3, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    iget-object p1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->b:Ljava/lang/String;

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->c:J

    iget v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->d:I

    iget-object v4, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;->e:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "HttpResponse(guid="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", statusCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", headers="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
