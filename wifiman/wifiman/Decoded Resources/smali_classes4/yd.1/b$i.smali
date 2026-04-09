.class final Lyd/b$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->r(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/internet/f;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V
    .locals 0

    iput-object p1, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b$b$b;)Ljava/util/List;
    .locals 13

    const-string v0, "internetEndpoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lpd/s;->INTERNET:Lpd/s;

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/g;->d(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object v5

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-static {v0}, Lcom/ui/wifiman/model/speedtest/internet/g;->c(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Ljava/lang/Integer;

    move-result-object v6

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "download must be ended at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    move-object v7, v1

    :goto_0
    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v0, :cond_3

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "upload must be ended at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move-object v9, v1

    :goto_1
    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v0, :cond_6

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    if-eqz v2, :cond_4

    check-cast v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b()Ljava/util/ArrayList;

    move-result-object v0

    move-object v8, v0

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "download must be finished at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object v8, v1

    :goto_3
    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    instance-of v0, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v0, :cond_9

    iget-object v0, p0, Lyd/b$i;->a:Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/internet/f;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    if-eqz v2, :cond_7

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b()Ljava/util/ArrayList;

    move-result-object v0

    move-object v10, v0

    goto :goto_4

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "upload must be finished at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    move-object v10, v1

    :goto_4
    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v2, 0x0

    move-object v1, v0

    move-object v4, p1

    invoke-direct/range {v1 .. v12}, Lcom/ui/wifiman/model/speedtest/result/b$c;-><init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    invoke-virtual {p0, p1}, Lyd/b$i;->a(Lcom/ui/wifiman/model/speedtest/result/b$b$b;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
