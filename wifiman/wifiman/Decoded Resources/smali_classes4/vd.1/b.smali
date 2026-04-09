.class public final Lvd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/b$a;,
        Lvd/b$b;
    }
.end annotation


# instance fields
.field private final a:LP7/a;


# direct methods
.method public constructor <init>(LP7/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/b;->a:LP7/a;

    return-void
.end method

.method private final f(Ljava/lang/Throwable;)Z
    .locals 1

    instance-of v0, p1, Ljava/net/SocketException;

    if-nez v0, :cond_1

    instance-of p1, p1, Ljava/net/UnknownHostException;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public a(Lvd/a$a;)Lgg/b;
    .locals 4

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lvd/a$a;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvd/b;->g(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1}, Lvd/a$a;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    move-result-object v1

    invoke-virtual {p0, v1}, Lvd/b;->h(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lgg/b;->J([Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1}, Lvd/a$a;->b()J

    move-result-wide v1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lgg/b;->Y(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p1

    sget-object v0, Lvd/b$d;->a:Lvd/b$d;

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->M()Lgg/b;

    move-result-object p1

    const-string v0, "onErrorComplete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(LCd/n$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvd/b$b;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p1, "End"

    goto :goto_0

    :pswitch_1
    const-string p1, "Result Update with report"

    goto :goto_0

    :pswitch_2
    const-string p1, "Result Report"

    goto :goto_0

    :pswitch_3
    const-string p1, "Result Save"

    goto :goto_0

    :pswitch_4
    const-string p1, "Test Upload"

    goto :goto_0

    :pswitch_5
    const-string p1, "Upload start delay"

    goto :goto_0

    :pswitch_6
    const-string p1, "Test Download"

    goto :goto_0

    :pswitch_7
    const-string p1, "Download start delay"

    goto :goto_0

    :pswitch_8
    const-string p1, "Evaluation"

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lcom/ui/wifiman/model/speedtest/advanced/b$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvd/b$b;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p1, "End"

    goto :goto_0

    :pswitch_1
    const-string p1, "Result Update with report"

    goto :goto_0

    :pswitch_2
    const-string p1, "Result Report"

    goto :goto_0

    :pswitch_3
    const-string p1, "Result Save"

    goto :goto_0

    :pswitch_4
    const-string p1, "Test Upload (Local)"

    goto :goto_0

    :pswitch_5
    const-string p1, "Upload start delay (Local)"

    goto :goto_0

    :pswitch_6
    const-string p1, "Test Download (Local)"

    goto :goto_0

    :pswitch_7
    const-string p1, "Download start delay (Local)"

    goto :goto_0

    :pswitch_8
    const-string p1, "Evaluation (Local)"

    goto :goto_0

    :pswitch_9
    const-string p1, "Test Upload (Console)"

    goto :goto_0

    :pswitch_a
    const-string p1, "Upload start delay (Console)"

    goto :goto_0

    :pswitch_b
    const-string p1, "Test Download (Console)"

    goto :goto_0

    :pswitch_c
    const-string p1, "Download start delay (Console)"

    goto :goto_0

    :pswitch_d
    const-string p1, "Evaluation (Console)"

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lcom/ui/wifiman/model/speedtest/internet/f$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvd/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p1, "End"

    goto :goto_0

    :pswitch_1
    const-string p1, "Result Update with report"

    goto :goto_0

    :pswitch_2
    const-string p1, "Result Report"

    goto :goto_0

    :pswitch_3
    const-string p1, "Result Save"

    goto :goto_0

    :pswitch_4
    const-string p1, "Test Upload"

    goto :goto_0

    :pswitch_5
    const-string p1, "Upload start delay"

    goto :goto_0

    :pswitch_6
    const-string p1, "Test Download"

    goto :goto_0

    :pswitch_7
    const-string p1, "Download start delay"

    goto :goto_0

    :pswitch_8
    const-string p1, "Server Wakeup"

    goto :goto_0

    :pswitch_9
    const-string p1, "Token Fetch"

    goto :goto_0

    :pswitch_a
    const-string p1, "Server Evaluation"

    goto :goto_0

    :pswitch_b
    const-string p1, "Server Fetch"

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lqd/d$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvd/b$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p1, "End"

    goto :goto_0

    :pswitch_1
    const-string p1, "Result Update with report"

    goto :goto_0

    :pswitch_2
    const-string p1, "Result Report"

    goto :goto_0

    :pswitch_3
    const-string p1, "Result Save"

    goto :goto_0

    :pswitch_4
    const-string p1, "Test Upload"

    goto :goto_0

    :pswitch_5
    const-string p1, "Upload start delay"

    goto :goto_0

    :pswitch_6
    const-string p1, "Test Download"

    goto :goto_0

    :pswitch_7
    const-string p1, "Download start delay"

    goto :goto_0

    :pswitch_8
    const-string p1, "Evaluation"

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/b;
    .locals 1

    const-string v0, "speedtestState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvd/b$c;

    invoke-direct {v0, p1, p0}, Lvd/b$c;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lvd/b;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/b;
    .locals 8

    const-string v0, "speedtestState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    invoke-direct {p0, v0}, Lvd/b;->f(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_b

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    const-string v1, " - "

    const-string v2, "UNKNOWN ERROR MESSAGE"

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvd/b;->a:LP7/a;

    new-instance v4, LP7/c$i;

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->l()Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v5

    invoke-virtual {p0, v5}, Lvd/b;->d(Lcom/ui/wifiman/model/speedtest/internet/f$b;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v3

    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v7

    :cond_2
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-direct {v4, v5, v1, v3}, LP7/c$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    goto :goto_3

    :cond_4
    instance-of v0, p1, Lqd/d;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lvd/b;->a:LP7/a;

    new-instance v4, LP7/c$j;

    check-cast p1, Lqd/d;

    invoke-virtual {p1}, Lqd/d;->l()Lqd/d$b;

    move-result-object v5

    invoke-virtual {p0, v5}, Lvd/b;->e(Lqd/d$b;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lqd/d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-virtual {p1}, Lqd/d;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v6

    :cond_7
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-direct {v4, v5, v1, p1}, LP7/c$j;-><init>(Ljava/lang/String;Ljava/lang/String;Linet/ipaddr/g;)V

    invoke-interface {v0, v4}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    goto :goto_3

    :cond_8
    instance-of v0, p1, LCd/n;

    if-eqz v0, :cond_9

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz p1, :cond_a

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_3
    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unknown speedtest state type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1
.end method
