.class public final Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;
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
    name = "Request"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J.\u0010\t\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u000cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u0018\u0010\u000cR\u001a\u0010 \u001a\u00020\u001c8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0015\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;",
        "Lcom/ui/comm/v4/UiCommV4Specs$Header;",
        "",
        "guid",
        "",
        "timestamp",
        "action",
        "<init>",
        "(Ljava/lang/String;JLjava/lang/String;)V",
        "copy",
        "(Ljava/lang/String;JLjava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;",
        "toString",
        "()Ljava/lang/String;",
        "",
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
        "d",
        "()J",
        "Lg9/c;",
        "e",
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

.field private final e:Lg9/c;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
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
            name = "action"
        .end annotation
    .end param

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    iput-object p4, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    sget-object p1, Lg9/c;->REQUEST:Lg9/c;

    iput-object p1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->e:Lg9/c;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lg9/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->e:Lg9/c;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLjava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;
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
            name = "action"
        .end annotation
    .end param

    const-string/jumbo v0, "guid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    iget-wide v5, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->b:Ljava/lang/String;

    iget-wide v1, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->c:J

    iget-object v3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Request(guid="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
