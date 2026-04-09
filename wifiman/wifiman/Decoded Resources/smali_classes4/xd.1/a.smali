.class public final Lxd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/a$a;
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

    iput-object p1, p0, Lxd/a;->a:LP7/a;

    return-void
.end method

.method public static final synthetic a(Lxd/a;)LP7/a;
    .locals 0

    iget-object p0, p0, Lxd/a;->a:LP7/a;

    return-object p0
.end method

.method public static final synthetic b(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lxd/a;->g(Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lxd/a;->h(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lxd/a;->i(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, Lxd/a;->j(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lcom/ui/wifiman/model/speedtest/result/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/b;
    .locals 1

    new-instance p2, Lxd/a$d;

    invoke-direct {p2, p1}, Lxd/a$d;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p2

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd/a$e;

    invoke-direct {v0, p0, p1}, Lxd/a$e;-><init>(Lxd/a;Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-virtual {p2, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "flatMapCompletable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 9

    iget-object v0, p0, Lxd/a;->a:LP7/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v3

    sget-object v4, Lpd/s;->APP_TO_APP:Lpd/s;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    new-instance v1, LP7/c$n;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v8

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, LP7/c$n;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lb8/c;)V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "app2app measurement must be available to report"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final i(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 10

    iget-object v0, p0, Lxd/a;->a:LP7/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v3

    sget-object v4, Lpd/s;->INTERNET:Lpd/s;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v9

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.ui.wifiman.model.speedtest.result.SpeedtestResult.Endpoint.InternetServer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->d()Ljava/lang/String;

    move-result-object v5

    new-instance p1, LP7/c$l;

    move-object v3, p1

    invoke-direct/range {v3 .. v9}, LP7/c$l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lb8/c;)V

    invoke-interface {v0, p1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "internet measurement must be available to report"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final j(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 9

    iget-object v0, p0, Lxd/a;->a:LP7/a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v3

    sget-object v4, Lpd/s;->LOCAL:Lpd/s;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    new-instance v1, LP7/c$m;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v8

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, LP7/c$m;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lb8/c;)V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "local measurement must be available to report"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
    .locals 0

    const-string p2, "state"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lxd/a$b;

    invoke-direct {p2, p1, p0}, Lxd/a$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/a;)V

    invoke-static {p2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lxd/a$c;->a:Lxd/a$c;

    invoke-virtual {p1, p2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance p2, Lxd/a$a;

    invoke-direct {p2}, Lxd/a$a;-><init>()V

    invoke-virtual {p1, p2}, Lgg/b;->h0(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string p2, "toSingleDefault(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
