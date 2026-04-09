.class public final LE8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE8/C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/C;

    invoke-direct {v0}, LE8/C;-><init>()V

    sput-object v0, LE8/C;->a:LE8/C;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LE8/C;Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LE8/C;->f(Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->d()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final b(Lcom/ui/wifiman/model/speedtest/result/b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;
    .locals 3

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v0

    instance-of v2, v0, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    :cond_1
    if-eqz v1, :cond_0

    :cond_2
    return-object v1
.end method

.method public final c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;
    .locals 4

    const-string/jumbo v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$a;

    invoke-direct {p0, p1}, LE8/C;->f(Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, LE8/C;->f(Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LE8/C$a;

    invoke-direct {v2, p1, p2, p3}, LE8/C$a;-><init>(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method

.method public final d(Lcom/ui/wifiman/model/speedtest/result/b$c;)Ls9/b;
    .locals 1

    const-string/jumbo v0, "measurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz v0, :cond_0

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->I()Ls9/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->e()Lxa/a$d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ubnt/usurvey/product/l;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lk8/j;->a(Lcom/ubnt/usurvey/product/l;)Ls9/b;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_1
    sget-object p1, LPe/a;->a:LPe/a;

    invoke-virtual {p1}, LPe/a;->V()Ls9/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz p1, :cond_4

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->B()Ls9/b;

    move-result-object p1

    :cond_3
    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final e(Lcom/ui/wifiman/model/speedtest/result/b$c;Lcom/ubnt/usurvey/product/m$c;)Ls9/a;
    .locals 11

    const-string/jumbo v0, "measurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object p1

    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e()Lrd/b$a$a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lr8/a;->a(Lrd/b$a$a;)Ls9/a$b;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_0
    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->k()Ls9/b;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v1, :cond_2

    sget-object v1, LPe/a;->a:LPe/a;

    invoke-virtual {v1}, LPe/a;->k()Ls9/b;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v1, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v1, :cond_11

    sget-object v1, LN9/b;->a:LN9/b;

    invoke-virtual {v1}, LN9/b;->B()Ls9/b;

    move-result-object v1

    :cond_3
    :goto_0
    const/4 v9, 0x0

    if-eqz v0, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f()Lxa/a$d;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2, p2}, Lcom/ubnt/usurvey/product/o;->b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;

    move-result-object p2

    goto :goto_2

    :cond_4
    :goto_1
    move-object p2, v9

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->e()Lxa/a$d;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2, p2}, Lcom/ubnt/usurvey/product/o;->b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;

    move-result-object p2

    goto :goto_2

    :cond_6
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz p2, :cond_10

    goto :goto_1

    :goto_2
    if-eqz p2, :cond_9

    instance-of v2, p2, Lcom/ubnt/usurvey/product/m$b;

    if-eqz v2, :cond_7

    new-instance v10, Ls9/c$b;

    check-cast p2, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p2}, Lcom/ubnt/usurvey/product/m$b;->a()Ljava/net/URI;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v10

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_7
    instance-of v2, p2, Lcom/ubnt/usurvey/product/m$a;

    if-eqz v2, :cond_8

    new-instance v10, Ls9/c$a;

    check-cast p2, Lcom/ubnt/usurvey/product/m$a;

    invoke-virtual {p2}, Lcom/ubnt/usurvey/product/m$a;->a()I

    move-result p2

    const/4 v2, 0x2

    invoke-direct {v10, p2, v9, v2, v9}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    move-object v10, v9

    :goto_3
    if-eqz v0, :cond_a

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_a
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz p2, :cond_b

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_b
    instance-of p2, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz p2, :cond_f

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->c()Ljava/lang/String;

    move-result-object p1

    :goto_4
    if-eqz p1, :cond_c

    sget-object p2, LL8/j;->a:LL8/j;

    invoke-virtual {p2, p1}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v9, Ls9/c$b;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_c
    if-eqz v10, :cond_d

    move-object v1, v10

    goto :goto_5

    :cond_d
    if-eqz v9, :cond_e

    move-object v1, v9

    :cond_e
    :goto_5
    return-object v1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final g(Lcom/ui/wifiman/model/speedtest/result/b;)Ls9/d;
    .locals 5

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->h()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xee48

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    new-instance p1, Ls9/d$b;

    const v0, 0x7f110327

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/d$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->h()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LE8/C$b;

    invoke-direct {v2, p1}, LE8/C$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
