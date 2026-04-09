.class public final Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u001aBg\u0012\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Jp\u0010\u0011\u001a\u00020\u00002\n\u0008\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008 \u0010\u0014R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010!\u001a\u0004\u0008#\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u001b\u001a\u0004\u0008+\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\u001b\u001a\u0004\u0008\'\u0010\u001cR\u0013\u0010.\u001a\u0004\u0018\u00010,8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;",
        "",
        "",
        "batteryPercent",
        "",
        "batteryVoltage",
        "",
        "changingStateId",
        "powerSourceId",
        "",
        "isLowBattery",
        "",
        "uptime",
        "signalPercent",
        "signalDbm",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "b",
        "Ljava/lang/Float;",
        "()Ljava/lang/Float;",
        "c",
        "Ljava/lang/String;",
        "d",
        "e",
        "Ljava/lang/Boolean;",
        "i",
        "()Ljava/lang/Boolean;",
        "f",
        "Ljava/lang/Long;",
        "h",
        "()Ljava/lang/Long;",
        "g",
        "Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;",
        "()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;",
        "powerSource",
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
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/lang/Float;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/Boolean;

.field private final f:Ljava/lang/Long;

.field private final g:Ljava/lang/Integer;

.field private final h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "battery"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation runtime LY6/g;
            name = "batteryV"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "chargingState"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "powerSource"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime LY6/g;
            name = "isLowBattery"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "uptime"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "signalQuality"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "signalDbm"
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    iput-object p3, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    iput-object p7, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;
    .locals 10
    .param p1    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "battery"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation runtime LY6/g;
            name = "batteryV"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "chargingState"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LY6/g;
            name = "powerSource"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime LY6/g;
            name = "isLowBattery"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation runtime LY6/g;
            name = "uptime"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "signalQuality"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LY6/g;
            name = "signalDbm"
        .end annotation
    .end param

    new-instance v9, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;-><init>(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v9
.end method

.method public final d()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
    .locals 2

    sget-object v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->Companion:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;

    invoke-virtual {v0}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;->a()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public final h()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b:Ljava/lang/Float;

    iget-object v2, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->e:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f:Ljava/lang/Long;

    iget-object v6, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->g:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h:Ljava/lang/Integer;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ApiV1DeviceStatistics(batteryPercent="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batteryVoltage="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", changingStateId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", powerSourceId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLowBattery="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", uptime="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signalPercent="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signalDbm="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
