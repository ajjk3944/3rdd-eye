.class public final Lcom/ui/wifiman/model/speedtest/result/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/result/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LS8/g;

.field private final c:Ljava/lang/String;

.field private final d:LS8/a;

.field private final e:LW7/f;

.field private final f:LS8/c;

.field private final g:LW7/f;

.field private final h:Ljava/lang/Integer;

.field private final i:LS8/d;

.field private final j:LW7/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;LS8/g;Ljava/lang/String;LS8/a;LW7/f;LS8/c;LW7/f;Ljava/lang/Integer;LS8/d;LW7/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    iput-object p6, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    iput-object p7, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    iput-object p8, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    iput-object p9, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    iput-object p10, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()LS8/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()LS8/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    return-object v0
.end method

.method public final e()LW7/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$d;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    iget-object p1, p1, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()LW7/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    return-object v0
.end method

.method public final g()LW7/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LS8/g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, LW7/f;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, LW7/f;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, LW7/b;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()LS8/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    return-object v0
.end method

.method public final j()LS8/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->b:LS8/g;

    iget-object v2, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->d:LS8/a;

    iget-object v4, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->e:LW7/f;

    iget-object v5, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->f:LS8/c;

    iget-object v6, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->g:LW7/f;

    iget-object v7, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->h:Ljava/lang/Integer;

    iget-object v8, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->i:LS8/d;

    iget-object v9, p0, Lcom/ui/wifiman/model/speedtest/result/b$d;->j:LW7/b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WirelessConnectionDetails(ssid="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", wifiExperience="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", apName="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", wifiMode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signal="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", band="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signalAP="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channelWidth="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rate="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
