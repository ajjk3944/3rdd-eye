.class public abstract Lpi/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/S;)Lpi/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of v0, p0, Lpi/a;

    if-eqz v0, :cond_0

    check-cast p0, Lpi/a;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lpi/S;)Lpi/d0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/h0;->a(Lpi/S;)Lpi/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lpi/a;->Z0()Lpi/d0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final c(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    instance-of p0, p0, Lpi/y;

    return p0
.end method

.method private static final d(Lpi/Q;)Lpi/Q;
    .locals 8

    invoke-virtual {p0}, Lpi/Q;->a()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/S;

    invoke-static {v4}, Lpi/J0;->l(Lpi/S;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v4}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v3

    invoke-static {v3, v2, v5, v6}, Lpi/h0;->f(Lpi/M0;ZILjava/lang/Object;)Lpi/M0;

    move-result-object v4

    move v3, v5

    :cond_0
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lpi/Q;->l()Lpi/S;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lpi/J0;->l(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p0

    invoke-static {p0, v2, v5, v6}, Lpi/h0;->f(Lpi/M0;ZILjava/lang/Object;)Lpi/M0;

    move-result-object p0

    :cond_3
    move-object v6, p0

    :cond_4
    new-instance p0, Lpi/Q;

    invoke-direct {p0, v1}, Lpi/Q;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v6}, Lpi/Q;->s(Lpi/S;)Lpi/Q;

    move-result-object v6

    :goto_1
    return-object v6
.end method

.method public static final e(Lpi/M0;Z)Lpi/M0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lpi/y;->d:Lpi/y$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p1

    invoke-static/range {v1 .. v6}, Lpi/y$a;->c(Lpi/y$a;Lpi/M0;ZZILjava/lang/Object;)Lpi/y;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lpi/h0;->g(Lpi/S;)Lpi/d0;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lpi/M0;->R0(Z)Lpi/M0;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public static synthetic f(Lpi/M0;ZILjava/lang/Object;)Lpi/M0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lpi/h0;->e(Lpi/M0;Z)Lpi/M0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lpi/S;)Lpi/d0;
    .locals 2

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    instance-of v0, p0, Lpi/Q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lpi/Q;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Lpi/h0;->d(Lpi/Q;)Lpi/Q;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lpi/Q;->j()Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lpi/d0;Z)Lpi/d0;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lpi/y;->d:Lpi/y$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move v3, p1

    invoke-static/range {v1 .. v6}, Lpi/y$a;->c(Lpi/y$a;Lpi/M0;ZZILjava/lang/Object;)Lpi/y;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lpi/h0;->g(Lpi/S;)Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static synthetic i(Lpi/d0;ZILjava/lang/Object;)Lpi/d0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lpi/h0;->h(Lpi/d0;Z)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lpi/d0;Lpi/d0;)Lpi/d0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviatedType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lpi/a;

    invoke-direct {v0, p0, p1}, Lpi/a;-><init>(Lpi/d0;Lpi/d0;)V

    return-object v0
.end method

.method public static final k(Lkotlin/reflect/jvm/internal/impl/types/checker/i;)Lkotlin/reflect/jvm/internal/impl/types/checker/i;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->W0()Lri/b;

    move-result-object v2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->Y0()Lpi/M0;

    move-result-object v4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->M0()Lpi/r0;

    move-result-object v5

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->O0()Z

    move-result v6

    const/4 v7, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lpi/M0;Lpi/r0;ZZ)V

    return-object v0
.end method
