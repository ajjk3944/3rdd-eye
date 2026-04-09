.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Progress"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0008\u0001\u0010\u0006\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J4\u0010\t\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0003\u0010\u0006\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
        "",
        "",
        "id",
        "",
        "",
        "records",
        "<init>",
        "(Ljava/lang/Integer;Ljava/util/List;)V",
        "copy",
        "(Ljava/lang/Integer;Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "b",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "app-model_release"
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
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "records"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LY6/g;
            name = "records"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;>;)",
            "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;"
        }
    .end annotation

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;

    invoke-direct {v0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;-><init>(Ljava/lang/Integer;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    iget-object p1, p1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->a:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Progress(id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", records="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
