.class public abstract Lkotlin/reflect/jvm/internal/impl/types/checker/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lpi/M0;Lri/b;)Ljava/util/List;
    .locals 11

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-interface {v1}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/B0;

    invoke-interface {v4}, Lpi/B0;->a()Lpi/N0;

    move-result-object v4

    sget-object v5, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v3

    invoke-interface {v3}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v3

    const-string v4, "getParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, LZg/v;->s1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/s;

    invoke-virtual {v4}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpi/B0;

    invoke-virtual {v4}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/l0;

    invoke-interface {v5}, Lpi/B0;->a()Lpi/N0;

    move-result-object v6

    sget-object v7, Lpi/N0;->INVARIANT:Lpi/N0;

    if-ne v6, v7, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {v5}, Lpi/B0;->c()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-interface {v5}, Lpi/B0;->a()Lpi/N0;

    move-result-object v6

    sget-object v7, Lpi/N0;->IN_VARIANCE:Lpi/N0;

    if-ne v6, v7, :cond_4

    invoke-interface {v5}, Lpi/B0;->getType()Lpi/S;

    move-result-object v6

    invoke-virtual {v6}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v6

    goto :goto_2

    :cond_4
    move-object v6, v2

    :goto_2
    new-instance v7, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v7, p1, v6, v5, v4}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;-><init>(Lri/b;Lpi/M0;Lpi/B0;LBh/l0;)V

    invoke-static {v7}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v5

    :goto_3
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    sget-object p1, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-virtual {p1, v1, v3}, Lpi/w0$a;->b(Lpi/v0;Ljava/util/List;)Lpi/E0;

    move-result-object p1

    invoke-virtual {p1}, Lpi/E0;->c()Lpi/G0;

    move-result-object p1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_9

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/B0;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpi/B0;

    invoke-interface {v4}, Lpi/B0;->a()Lpi/N0;

    move-result-object v6

    sget-object v7, Lpi/N0;->INVARIANT:Lpi/N0;

    if-eq v6, v7, :cond_8

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v6

    invoke-interface {v6}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LBh/l0;

    invoke-interface {v6}, LBh/l0;->getUpperBounds()Ljava/util/List;

    move-result-object v6

    const-string v7, "getUpperBounds(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpi/S;

    sget-object v9, Lkotlin/reflect/jvm/internal/impl/types/checker/f$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/f$a;

    sget-object v10, Lpi/N0;->INVARIANT:Lpi/N0;

    invoke-virtual {p1, v8, v10}, Lpi/G0;->n(Lpi/S;Lpi/N0;)Lpi/S;

    move-result-object v8

    invoke-virtual {v8}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v8

    invoke-virtual {v9, v8}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->b(Lri/i;)Lpi/M0;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_6
    invoke-interface {v4}, Lpi/B0;->c()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v4}, Lpi/B0;->a()Lpi/N0;

    move-result-object v6

    sget-object v8, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    if-ne v6, v8, :cond_7

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/types/checker/f$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/f$a;

    invoke-interface {v4}, Lpi/B0;->getType()Lpi/S;

    move-result-object v4

    invoke-virtual {v4}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v4

    invoke-virtual {v6, v4}, Lkotlin/reflect/jvm/internal/impl/types/checker/f;->b(Lri/i;)Lpi/M0;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-interface {v5}, Lpi/B0;->getType()Lpi/S;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/checker/i;->X0()Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    move-result-object v4

    invoke-virtual {v4, v7}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;->n(Ljava/util/List;)V

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    :cond_9
    return-object v3

    :cond_a
    :goto_6
    return-object v2
.end method

.method public static final b(Lpi/d0;Lri/b;)Lpi/d0;
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/o;->a(Lpi/M0;Lri/b;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/o;->c(Lpi/M0;Ljava/util/List;)Lpi/d0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final c(Lpi/M0;Ljava/util/List;)Lpi/d0;
    .locals 7

    invoke-virtual {p0}, Lpi/S;->M0()Lpi/r0;

    move-result-object v0

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-virtual {p0}, Lpi/S;->O0()Z

    move-result v3

    const/16 v5, 0x10

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method
