.class public final Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;
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
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0018B1\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\n\u0008\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u0010R\u001a\u0010#\u001a\u00020\u001f8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0016\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;",
        "Lcom/ui/comm/v4/UiCommV4Specs$Header;",
        "",
        "guid",
        "",
        "timestamp",
        "error",
        "",
        "errorCode",
        "<init>",
        "(Ljava/lang/String;JLjava/lang/String;I)V",
        "copy",
        "(Ljava/lang/String;JLjava/lang/String;I)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;",
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

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Lg9/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;I)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "error"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LY6/g;
            name = "errorCode"
        .end annotation
    .end param

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    iput-object p4, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    iput p5, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    sget-object p1, Lg9/c;->ERROR:Lg9/c;

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->f:Lg9/c;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lg9/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->f:Lg9/c;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLjava/lang/String;I)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;
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
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "error"
        .end annotation
    .end param
    .param p5    # I
        .annotation runtime LY6/g;
            name = "errorCode"
        .end annotation
    .end param

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    move-object v1, v0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;-><init>(Ljava/lang/String;JLjava/lang/String;I)V

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    iget-wide v5, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    iget p1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->b:Ljava/lang/String;

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->c:J

    iget-object v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->d:Ljava/lang/String;

    iget v4, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;->e:I

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "Error(guid="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
