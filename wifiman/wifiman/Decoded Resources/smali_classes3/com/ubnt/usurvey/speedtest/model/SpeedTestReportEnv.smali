.class public final Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LY6/i;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B{\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008 \u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001d\u001a\u0004\u0008!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008\"\u0010\u0014R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001d\u001a\u0004\u0008#\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001d\u001a\u0004\u0008$\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001d\u001a\u0004\u0008&\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u001d\u001a\u0004\u0008\'\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010(\u001a\u0004\u0008%\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010*\u001a\u0004\u0008\u001f\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;",
        "",
        "",
        "appName",
        "appVersion",
        "deviceModel",
        "deviceManufacturer",
        "os",
        "osVersion",
        "util",
        "utilArch",
        "utilVersion",
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;",
        "unifiInfo",
        "",
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;",
        "connection",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;Ljava/util/List;)V",
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
        "c",
        "e",
        "d",
        "f",
        "g",
        "i",
        "h",
        "j",
        "k",
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;",
        "()Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "speedtest-api_release"
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

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

.field private final k:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    iput-object p9, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    iput-object p10, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    iput-object p11, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;

    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    iget-object v3, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    iget-object p1, p1, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->g:Ljava/lang/String;

    iget-object v7, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->h:Ljava/lang/String;

    iget-object v8, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->i:Ljava/lang/String;

    iget-object v9, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->j:Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;

    iget-object v10, p0, Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;->k:Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v12, "SpeedTestReportEnv(appName="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", appVersion="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceModel="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceManufacturer="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", os="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", osVersion="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", util="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", utilArch="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", utilVersion="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unifiInfo="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connection="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
