.class public abstract Ln8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LCc/a;Ls9/a$b;)Ls9/a$b;
    .locals 2

    invoke-interface {p0}, LCc/a;->d()LCc/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lk8/b;->b(LCc/b;)Ls9/a$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p0}, LCc/a;->d()LCc/b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lk8/b;->b(LCc/b;)Ls9/a$b;

    move-result-object p0

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-interface {p0}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object p0

    instance-of v0, p0, Lcom/ui/wifiman/model/vendor/d$c;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/ui/wifiman/model/vendor/d$c;

    goto :goto_2

    :cond_3
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/ui/wifiman/model/vendor/d$c;->c()Lcom/ui/wifiman/model/vendor/d$d;

    move-result-object v1

    :cond_4
    sget-object p0, Lcom/ui/wifiman/model/vendor/d$d;->UBIQUITI:Lcom/ui/wifiman/model/vendor/d$d;

    if-ne v1, p0, :cond_5

    sget-object p0, LPe/a;->a:LPe/a;

    invoke-virtual {p0}, LPe/a;->B()Ls9/b;

    move-result-object p1

    :cond_5
    :goto_3
    return-object p1
.end method

.method private static final b(LCc/a;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;
    .locals 9

    invoke-interface {p0}, LCc/a;->f()Lxa/a$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/product/o;->b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    instance-of p0, p1, Lcom/ubnt/usurvey/product/m$b;

    if-eqz p0, :cond_1

    new-instance p0, Ls9/c$b;

    check-cast p1, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$b;->a()Ljava/net/URI;

    move-result-object v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    instance-of p0, p1, Lcom/ubnt/usurvey/product/m$a;

    if-eqz p0, :cond_2

    new-instance p0, Ls9/c$a;

    check-cast p1, Lcom/ubnt/usurvey/product/m$a;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$a;->a()I

    move-result p1

    const/4 p2, 0x2

    invoke-direct {p0, p1, v1, p2, v1}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    invoke-interface {p0}, LCc/a;->j()LDc/j;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, LDc/j;->L()LTc/a$a;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, LTc/a$a;->j()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    sget-object p1, LL8/j;->a:LL8/j;

    invoke-virtual {p1, p0}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    :cond_4
    move-object v3, v1

    if-eqz v3, :cond_5

    new-instance p0, Ls9/c$b;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_5
    return-object p2
.end method

.method public static final c(LCc/k;Lcom/ubnt/usurvey/product/m$c;)Ls9/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LCc/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LCc/a;

    invoke-static {p0, p1, v1}, Ln8/m;->b(LCc/a;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method private static final d(LCc/a;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;
    .locals 0

    invoke-static {p0, p1, p2}, Ln8/m;->b(LCc/a;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p0

    :goto_0
    return-object p2
.end method

.method public static final e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "fallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LCc/a;

    if-eqz v0, :cond_0

    check-cast p0, LCc/a;

    invoke-static {p0, p2}, Ln8/m;->a(LCc/a;Ls9/a$b;)Ls9/a$b;

    move-result-object p2

    invoke-static {p0, p1, p2}, Ln8/m;->d(LCc/a;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, LCc/k;->d()LCc/b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lk8/b;->b(LCc/b;)Ls9/a$b;

    move-result-object p0

    if-eqz p0, :cond_1

    move-object p2, p0

    :cond_1
    return-object p2
.end method

.method public static synthetic f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LPe/a;->a:LPe/a;

    invoke-virtual {p2}, LPe/a;->k()Ls9/b;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Ln8/m;->e(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;)Ls9/a;

    move-result-object p0

    return-object p0
.end method
