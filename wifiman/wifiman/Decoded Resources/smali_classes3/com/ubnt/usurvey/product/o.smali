.class public abstract Lcom/ubnt/usurvey/product/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/product/o$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Lua/a$b;)Lab/d$a;
    .locals 0

    invoke-static {p0}, Lcom/ubnt/usurvey/product/o;->c(Lua/a$b;)Lab/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lxa/a$d;Lcom/ubnt/usurvey/product/m$c;)Lcom/ubnt/usurvey/product/m;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/ubnt/usurvey/product/u;->a(Lcom/ubnt/usurvey/product/l;)Lab/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$c;->getVariant()Lab/d$a$b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lab/d;->c(Lab/d$a$b;)Lab/d$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-interface {p0}, Lua/a;->Q0()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    new-instance v3, Lcom/ubnt/usurvey/product/n;

    invoke-direct {v3}, Lcom/ubnt/usurvey/product/n;-><init>()V

    invoke-static {v2, v3}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-interface {v2}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lab/d$a;

    invoke-virtual {v4}, Lab/d$a;->g()Lab/d$a$b;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$c;->getVariant()Lab/d$a$b;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    check-cast v3, Lab/d$a;

    if-eqz v0, :cond_3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lab/d$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lab/d$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lab/d$a$a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance p0, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$c;->getSize()I

    move-result p1

    invoke-virtual {v3, p1}, Lab/d$a;->c(I)Ljava/net/URI;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ubnt/usurvey/product/m$b;-><init>(Ljava/net/URI;)V

    return-object p0

    :cond_3
    if-nez v0, :cond_4

    if-eqz v3, :cond_4

    new-instance p0, Lcom/ubnt/usurvey/product/m$b;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/product/m$c;->getSize()I

    move-result p1

    invoke-virtual {v3, p1}, Lab/d$a;->c(I)Ljava/net/URI;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ubnt/usurvey/product/m$b;-><init>(Ljava/net/URI;)V

    return-object p0

    :cond_4
    if-eqz v0, :cond_8

    sget-object v0, Lcom/ubnt/usurvey/product/o$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 v0, 0x2

    if-ne p1, v0, :cond_6

    invoke-interface {p0}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/product/l;

    if-eqz p0, :cond_5

    invoke-static {p0}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/r;->a()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_2

    :cond_5
    move-object p0, v1

    goto :goto_2

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    invoke-interface {p0}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/product/l;

    if-eqz p0, :cond_5

    invoke-static {p0}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/ubnt/usurvey/product/r;->b()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_2
    if-eqz p0, :cond_8

    new-instance p1, Lcom/ubnt/usurvey/product/m$a;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-direct {p1, p0}, Lcom/ubnt/usurvey/product/m$a;-><init>(I)V

    return-object p1

    :cond_8
    return-object v1
.end method

.method private static final c(Lua/a$b;)Lab/d$a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lab/d$a;

    if-eqz v0, :cond_0

    check-cast p0, Lab/d$a;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
