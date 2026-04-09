.class public abstract LBh/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(LBh/m;)Z
    .locals 0

    invoke-static {p0}, LBh/p0;->h(LBh/m;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(LBh/m;)Z
    .locals 0

    invoke-static {p0}, LBh/p0;->i(LBh/m;)Z

    move-result p0

    return p0
.end method

.method static synthetic c(LBh/m;)Lzi/j;
    .locals 0

    invoke-static {p0}, LBh/p0;->j(LBh/m;)Lzi/j;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lpi/S;)LBh/W;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v1, v0, LBh/i;

    if-eqz v1, :cond_0

    check-cast v0, LBh/i;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LBh/p0;->e(Lpi/S;LBh/i;I)LBh/W;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lpi/S;LBh/i;I)LBh/W;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LBh/i;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, p2

    invoke-interface {p1}, LBh/i;->M()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-static {p1}, Lbi/i;->E(LBh/m;)Z

    move-result v1

    :cond_1
    new-instance v1, LBh/W;

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {v2, p2, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p1, p0, v0}, LBh/W;-><init>(LBh/i;Ljava/util/List;LBh/W;)V

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    new-instance v2, LBh/W;

    invoke-interface {p1}, LBh/n;->b()LBh/m;

    move-result-object v3

    instance-of v4, v3, LBh/i;

    if-eqz v4, :cond_3

    move-object v0, v3

    check-cast v0, LBh/i;

    :cond_3
    invoke-static {p0, v0, v1}, LBh/p0;->e(Lpi/S;LBh/i;I)LBh/W;

    move-result-object p0

    invoke-direct {v2, p1, p2, p0}, LBh/W;-><init>(LBh/i;Ljava/util/List;LBh/W;)V

    return-object v2

    :cond_4
    :goto_0
    return-object v0
.end method

.method private static final f(LBh/l0;LBh/m;I)LBh/c;
    .locals 1

    new-instance v0, LBh/c;

    invoke-direct {v0, p0, p1, p2}, LBh/c;-><init>(LBh/l0;LBh/m;I)V

    return-object v0
.end method

.method public static final g(LBh/i;)Ljava/util/List;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/i;->w()Ljava/util/List;

    move-result-object v0

    const-string v1, "getDeclaredTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/i;->M()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0}, LBh/n;->b()LBh/m;

    move-result-object v2

    instance-of v2, v2, LBh/a;

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lfi/e;->u(LBh/m;)Lzi/j;

    move-result-object v2

    sget-object v3, LBh/m0;->a:LBh/m0;

    invoke-static {v2, v3}, Lzi/m;->W(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    sget-object v3, LBh/n0;->a:LBh/n0;

    invoke-static {v2, v3}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    sget-object v3, LBh/o0;->a:LBh/o0;

    invoke-static {v2, v3}, Lzi/m;->H(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->Z(Lzi/j;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0}, Lfi/e;->u(LBh/m;)Lzi/j;

    move-result-object v3

    invoke-interface {v3}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v6, v4, LBh/e;

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v4, v5

    :goto_0
    check-cast v4, LBh/e;

    if-eqz v4, :cond_3

    invoke-interface {v4}, LBh/h;->k()Lpi/v0;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v5

    :cond_3
    if-nez v5, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v5

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p0}, LBh/i;->w()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_5
    check-cast v2, Ljava/util/Collection;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2, v5}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/l0;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v3, p0, v4}, LBh/p0;->f(LBh/l0;LBh/m;I)LBh/c;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final h(LBh/m;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, LBh/a;

    return p0
.end method

.method private static final i(LBh/m;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, LBh/l;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final j(LBh/m;)Lzi/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, LBh/a;

    invoke-interface {p0}, LBh/a;->getTypeParameters()Ljava/util/List;

    move-result-object p0

    const-string v0, "getTypeParameters(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p0

    return-object p0
.end method
