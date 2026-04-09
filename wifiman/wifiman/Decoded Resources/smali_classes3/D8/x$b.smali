.class final LD8/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/result/b;

.field private final b:Lcom/ui/wifiman/model/speedtest/result/b$b;

.field private final c:Ljava/lang/Integer;

.field private final d:Ljava/lang/Long;

.field private final e:Ljava/lang/Long;

.field private final f:Lhf/h;

.field private final g:Lhf/h;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lhf/h;Lhf/h;)V
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "endpoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartDown"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartUp"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    iput-object p2, p0, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iput-object p3, p0, LD8/x$b;->c:Ljava/lang/Integer;

    iput-object p4, p0, LD8/x$b;->d:Ljava/lang/Long;

    iput-object p5, p0, LD8/x$b;->e:Ljava/lang/Long;

    iput-object p6, p0, LD8/x$b;->f:Lhf/h;

    iput-object p7, p0, LD8/x$b;->g:Lhf/h;

    return-void
.end method


# virtual methods
.method public final a()Lhf/h;
    .locals 1

    iget-object v0, p0, LD8/x$b;->f:Lhf/h;

    return-object v0
.end method

.method public final b()Lhf/h;
    .locals 1

    iget-object v0, p0, LD8/x$b;->g:Lhf/h;

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 1

    iget-object v0, p0, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LD8/x$b;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 1

    iget-object v0, p0, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LD8/x$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LD8/x$b;

    iget-object v1, p0, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    iget-object v3, p1, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iget-object v3, p1, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LD8/x$b;->c:Ljava/lang/Integer;

    iget-object v3, p1, LD8/x$b;->c:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LD8/x$b;->d:Ljava/lang/Long;

    iget-object v3, p1, LD8/x$b;->d:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LD8/x$b;->e:Ljava/lang/Long;

    iget-object v3, p1, LD8/x$b;->e:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LD8/x$b;->f:Lhf/h;

    iget-object v3, p1, LD8/x$b;->f:Lhf/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LD8/x$b;->g:Lhf/h;

    iget-object p1, p1, LD8/x$b;->g:Lhf/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LD8/x$b;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public final g()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LD8/x$b;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->c:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->d:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->e:Ljava/lang/Long;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->f:Lhf/h;

    invoke-virtual {v1}, Lhf/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LD8/x$b;->g:Lhf/h;

    invoke-virtual {v1}, Lhf/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, LD8/x$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    iget-object v1, p0, LD8/x$b;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iget-object v2, p0, LD8/x$b;->c:Ljava/lang/Integer;

    iget-object v3, p0, LD8/x$b;->d:Ljava/lang/Long;

    iget-object v4, p0, LD8/x$b;->e:Ljava/lang/Long;

    iget-object v5, p0, LD8/x$b;->f:Lhf/h;

    iget-object v6, p0, LD8/x$b;->g:Lhf/h;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "SpeedtestResultCardDataHolder(result="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endpoint="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latency="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speedDownBps="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speedUpBps="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chartDown="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chartUp="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
