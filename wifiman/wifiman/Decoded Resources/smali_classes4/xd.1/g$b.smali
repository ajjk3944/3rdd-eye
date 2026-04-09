.class final Lxd/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/g;->d(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, Lxd/g$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, LWc/b;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Lxd/g$b;->b(LWc/b;LWc/b;Ll9/a;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    move-result-object p1

    return-object p1
.end method

.method public final b(LWc/b;LWc/b;Ll9/a;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;
    .locals 10

    const-string v0, "ispInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publicIp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LW7/b;

    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->d()Ljava/lang/String;

    move-result-object p1

    move-object v2, p1

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkd/e;->c()Linet/ipaddr/g;

    move-result-object p1

    move-object v3, p1

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    const-wide/32 p1, 0xf4240

    if-eqz p3, :cond_2

    invoke-virtual {p3}, LW7/b;->b()LW7/a;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LW7/a;->d()I

    move-result v1

    int-to-long v4, v1

    mul-long/2addr v4, p1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, LW7/b;->c()LW7/a;

    move-result-object p3

    if-eqz p3, :cond_3

    invoke-virtual {p3}, LW7/a;->d()I

    move-result p3

    int-to-long v5, p3

    mul-long/2addr v5, p1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v5, p1

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    iget-object p1, p0, Lxd/g$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v6

    if-eqz v6, :cond_a

    iget-object p1, p0, Lxd/g$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz p2, :cond_4

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->d()Ljava/lang/String;

    move-result-object p1

    :goto_4
    move-object v7, p1

    goto :goto_5

    :cond_4
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz p2, :cond_5

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_5
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz p2, :cond_8

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :goto_5
    if-eqz v7, :cond_9

    iget-object p1, p0, Lxd/g$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const-wide/16 p2, 0x8

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    div-long/2addr v8, p2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    move-object v8, p1

    goto :goto_6

    :cond_6
    move-object v8, v0

    :goto_6
    iget-object p1, p0, Lxd/g$b;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    div-long/2addr v0, p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :cond_7
    move-object v9, v0

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;-><init>(Ljava/lang/String;Linet/ipaddr/g;Ljava/lang/Long;Ljava/lang/Long;Lpd/s;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
