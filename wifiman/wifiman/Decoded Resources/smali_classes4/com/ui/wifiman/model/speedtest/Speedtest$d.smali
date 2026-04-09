.class public abstract Lcom/ui/wifiman/model/speedtest/Speedtest$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/Speedtest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public abstract b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;
.end method

.method public abstract c()Z
.end method

.method public abstract d()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public abstract e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public abstract f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public abstract g()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public abstract h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;
.end method

.method public abstract i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    invoke-interface {v1}, Lth/d;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->h()Lcom/ui/wifiman/model/speedtest/Speedtest$e;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->f()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    instance-of v4, v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v4

    instance-of v6, v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v6, :cond_2

    check-cast v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    goto :goto_2

    :cond_2
    move-object v4, v5

    :goto_2
    const-string v6, "null"

    const-wide v7, 0x412e848000000000L    # 1000000.0

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    long-to-double v9, v9

    div-double/2addr v9, v7

    invoke-virtual {v0, v9, v10}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    :cond_3
    move-object v4, v6

    :cond_4
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v9

    instance-of v10, v9, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    if-eqz v10, :cond_5

    check-cast v9, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    goto :goto_3

    :cond_5
    move-object v9, v5

    :goto_3
    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;->c()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v9

    long-to-double v9, v9

    div-double/2addr v9, v7

    invoke-virtual {v0, v9, v10}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v6, v0

    :cond_7
    :goto_4
    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SPEEDTEST STATE ("

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") ( step: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", download: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upload: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "),error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
