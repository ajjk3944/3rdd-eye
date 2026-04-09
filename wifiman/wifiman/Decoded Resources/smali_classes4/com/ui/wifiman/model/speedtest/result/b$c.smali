.class public final Lcom/ui/wifiman/model/speedtest/result/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/result/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:Lpd/s;

.field private final c:Lcom/ui/wifiman/model/speedtest/result/b$b;

.field private final d:Ljava/lang/Integer;

.field private final e:Ljava/lang/Integer;

.field private final f:Ljava/lang/Long;

.field private final g:Ljava/util/ArrayList;

.field private final h:Ljava/lang/Long;

.field private final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endpoint"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    .line 3
    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    .line 4
    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    .line 5
    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    .line 6
    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    .line 7
    iput-object p6, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    .line 8
    iput-object p7, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    .line 9
    iput-object p8, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    .line 10
    iput-object p9, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 11
    invoke-direct/range {v1 .. v10}, Lcom/ui/wifiman/model/speedtest/result/b$c;-><init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    return-object v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final g()Lpd/s;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    return-object v0
.end method

.method public final h()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->a:Ljava/lang/Long;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->b:Lpd/s;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->c:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iget-object v3, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->d:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->e:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->f:Ljava/lang/Long;

    iget-object v6, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->g:Ljava/util/ArrayList;

    iget-object v7, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->h:Ljava/lang/Long;

    iget-object v8, p0, Lcom/ui/wifiman/model/speedtest/result/b$c;->i:Ljava/util/ArrayList;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Measurement(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endpoint="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latency="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", jitter="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", downloadSpeedBps="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", downloadSpeedChartData="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", uploadSpeedBps="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", uploadSpeedChartData="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
