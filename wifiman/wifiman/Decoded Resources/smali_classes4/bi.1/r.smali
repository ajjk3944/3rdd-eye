.class public abstract Lbi/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic a(Lxi/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lbi/r;->c(Lxi/l;Ljava/lang/Object;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/Collection;Lmh/l;)Ljava/util/Collection;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptorByHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    sget-object p0, Lxi/l;->c:Lxi/l$b;

    invoke-virtual {p0}, Lxi/l$b;->a()Lxi/l;

    move-result-object p0

    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lxi/l;->c:Lxi/l$b;

    invoke-virtual {v3}, Lxi/l$b;->a()Lxi/l;

    move-result-object v3

    new-instance v4, Lbi/q;

    invoke-direct {v4, v3}, Lbi/q;-><init>(Lxi/l;)V

    invoke-static {v2, v0, p1, v4}, Lbi/o;->q(Ljava/lang/Object;Ljava/util/Collection;Lmh/l;Lmh/l;)Ljava/util/Collection;

    move-result-object v2

    const-string v4, "extractMembersOverridableInBothWays(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    if-ne v4, v1, :cond_1

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "single(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lxi/l;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2, p1}, Lbi/o;->L(Ljava/util/Collection;Lmh/l;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LBh/a;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1, v6}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LBh/a;

    invoke-static {v5, v7}, Lbi/o;->B(LBh/a;LBh/a;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :cond_4
    invoke-virtual {p0, v4}, Lxi/l;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object p0
.end method

.method private static final c(Lxi/l;Ljava/lang/Object;)LYg/J;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lxi/l;->add(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
