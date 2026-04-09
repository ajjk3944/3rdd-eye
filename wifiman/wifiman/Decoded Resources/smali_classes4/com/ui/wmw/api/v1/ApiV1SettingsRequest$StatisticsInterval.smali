.class public final Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;
.super Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StatisticsInterval"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;",
        "Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;",
        "",
        "statisticsIntervalSeconds",
        "<init>",
        "(I)V",
        "copy",
        "(I)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
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
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 1
    .param p1    # I
        .annotation runtime LY6/g;
            name = "intStats"
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    return v0
.end method

.method public final copy(I)Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;
    .locals 1
    .param p1    # I
        .annotation runtime LY6/g;
            name = "intStats"
        .end annotation
    .end param

    new-instance v0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;

    invoke-direct {v0, p1}, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;

    iget v1, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    iget p1, p1, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/ui/wmw/api/v1/ApiV1SettingsRequest$StatisticsInterval;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "StatisticsInterval(statisticsIntervalSeconds="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
