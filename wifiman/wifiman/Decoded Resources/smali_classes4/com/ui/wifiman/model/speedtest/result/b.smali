.class public final Lcom/ui/wifiman/model/speedtest/result/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/result/b$a;,
        Lcom/ui/wifiman/model/speedtest/result/b$b;,
        Lcom/ui/wifiman/model/speedtest/result/b$c;,
        Lcom/ui/wifiman/model/speedtest/result/b$d;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lb8/c;

.field private final e:J

.field private final f:Ljava/util/List;

.field private final g:Lcom/ui/wifiman/model/speedtest/result/b$d;

.field private final h:Ljava/util/List;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnsServers"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wireless"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurements"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    .line 3
    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    .line 6
    iput-wide p6, p0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    .line 7
    iput-object p8, p0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    .line 8
    iput-object p9, p0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    .line 9
    iput-object p10, p0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v3, v0

    goto :goto_0

    :cond_0
    move-wide v3, p1

    :goto_0
    move-object v2, p0

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-wide/from16 v8, p6

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    .line 10
    invoke-direct/range {v2 .. v12}, Lcom/ui/wifiman/model/speedtest/result/b;-><init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p10

    :goto_7
    move-wide p1, v2

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-wide/from16 p6, v7

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/ui/wifiman/model/speedtest/result/b;->a(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 12

    const-string v0, "connection"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dnsServers"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wireless"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurements"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/b;

    move-object v1, v0

    move-wide v2, p1

    move-object v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v7, p6

    invoke-direct/range {v1 .. v11}, Lcom/ui/wifiman/model/speedtest/result/b;-><init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lb8/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b;

    iget-wide v3, p0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    return-wide v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    return-object v0
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Lcom/ui/wifiman/model/speedtest/result/b$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lcom/ui/wifiman/model/speedtest/result/b;->a:J

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/speedtest/result/b;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wifiman/model/speedtest/result/b;->d:Lb8/c;

    iget-wide v5, p0, Lcom/ui/wifiman/model/speedtest/result/b;->e:J

    iget-object v7, p0, Lcom/ui/wifiman/model/speedtest/result/b;->f:Ljava/util/List;

    iget-object v8, p0, Lcom/ui/wifiman/model/speedtest/result/b;->g:Lcom/ui/wifiman/model/speedtest/result/b$d;

    iget-object v9, p0, Lcom/ui/wifiman/model/speedtest/result/b;->h:Ljava/util/List;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SpeedtestResult(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", cloudId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", unifiControllerId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", connection="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", dnsServers="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wireless="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", measurements="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
