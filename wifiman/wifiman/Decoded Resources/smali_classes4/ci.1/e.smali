.class public abstract Lci/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lpi/B0;LBh/l0;)Lpi/B0;
    .locals 0

    invoke-static {p0, p1}, Lci/e;->c(Lpi/B0;LBh/l0;)Lpi/B0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lpi/B0;)Lpi/S;
    .locals 0

    invoke-static {p0}, Lci/e;->d(Lpi/B0;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lpi/B0;LBh/l0;)Lpi/B0;
    .locals 3

    if-eqz p1, :cond_3

    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v0

    sget-object v1, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, LBh/l0;->p()Lpi/N0;

    move-result-object p1

    invoke-interface {p0}, Lpi/B0;->a()Lpi/N0;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-interface {p0}, Lpi/B0;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lpi/D0;

    new-instance v0, Lpi/Y;

    sget-object v1, Loi/f;->e:Loi/n;

    const-string v2, "NO_LOCKS"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lci/d;

    invoke-direct {v2, p0}, Lci/d;-><init>(Lpi/B0;)V

    invoke-direct {v0, v1, v2}, Lpi/Y;-><init>(Loi/n;Lmh/a;)V

    invoke-direct {p1, v0}, Lpi/D0;-><init>(Lpi/S;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lpi/D0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    invoke-direct {p1, p0}, Lpi/D0;-><init>(Lpi/S;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lpi/D0;

    invoke-static {p0}, Lci/e;->e(Lpi/B0;)Lpi/S;

    move-result-object p0

    invoke-direct {p1, p0}, Lpi/D0;-><init>(Lpi/S;)V

    return-object p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method private static final d(Lpi/B0;)Lpi/S;
    .locals 1

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Lpi/B0;)Lpi/S;
    .locals 8

    const-string v0, "typeProjection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lci/a;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lci/a;-><init>(Lpi/B0;Lci/b;ZLpi/r0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final f(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    instance-of p0, p0, Lci/b;

    return p0
.end method

.method public static final g(Lpi/E0;Z)Lpi/E0;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lpi/M;

    if-eqz v0, :cond_1

    check-cast p0, Lpi/M;

    invoke-virtual {p0}, Lpi/M;->j()[LBh/l0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/M;->i()[Lpi/B0;

    move-result-object v1

    invoke-virtual {p0}, Lpi/M;->j()[LBh/l0;

    move-result-object p0

    invoke-static {v1, p0}, LZg/n;->t1([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/B0;

    invoke-virtual {v2}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/l0;

    invoke-static {v3, v2}, Lci/e;->c(Lpi/B0;LBh/l0;)Lpi/B0;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    new-array p0, p0, [Lpi/B0;

    invoke-interface {v1, p0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lpi/B0;

    new-instance v1, Lpi/M;

    invoke-direct {v1, v0, p0, p1}, Lpi/M;-><init>([LBh/l0;[Lpi/B0;Z)V

    goto :goto_1

    :cond_1
    new-instance v1, Lci/e$a;

    invoke-direct {v1, p0, p1}, Lci/e$a;-><init>(Lpi/E0;Z)V

    :goto_1
    return-object v1
.end method

.method public static synthetic h(Lpi/E0;ZILjava/lang/Object;)Lpi/E0;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Lci/e;->g(Lpi/E0;Z)Lpi/E0;

    move-result-object p0

    return-object p0
.end method
