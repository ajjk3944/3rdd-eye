.class public abstract LLh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/Collection;Ljava/util/Collection;LBh/a;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "newValueParameterTypes"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "oldValueParameters"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "newOwner"

    move-object/from16 v15, p2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->size()I

    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->size()I

    check-cast v0, Ljava/lang/Iterable;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, LZg/v;->s1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lpi/S;

    invoke-virtual {v2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBh/s0;

    new-instance v14, LDh/V;

    invoke-interface {v2}, LBh/s0;->getIndex()I

    move-result v6

    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v7

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v8

    const-string v3, "getName(...)"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, LBh/s0;->s0()Z

    move-result v10

    invoke-interface {v2}, LBh/s0;->Y()Z

    move-result v11

    invoke-interface {v2}, LBh/s0;->W()Z

    move-result v12

    invoke-interface {v2}, LBh/s0;->j0()Lpi/S;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static/range {p2 .. p2}, Lfi/e;->s(LBh/m;)LBh/G;

    move-result-object v3

    invoke-interface {v3}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object v3

    invoke-virtual {v3, v9}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->k(Lpi/S;)Lpi/S;

    move-result-object v3

    :goto_1
    move-object v13, v3

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {v2}, LBh/p;->j()LBh/g0;

    move-result-object v2

    const-string v3, "getSource(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v3, v14

    move-object/from16 v4, p2

    move-object/from16 p0, v0

    move-object v0, v14

    move-object v14, v2

    invoke-direct/range {v3 .. v14}, LDh/V;-><init>(LBh/a;LBh/s0;ILkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/f;Lpi/S;ZZZLpi/S;LBh/g0;)V

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final b(LBh/e;)LNh/a0;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lfi/e;->x(LBh/e;)LBh/e;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, LBh/e;->Q()Lii/k;

    move-result-object v1

    instance-of v2, v1, LNh/a0;

    if-eqz v2, :cond_1

    move-object v0, v1

    check-cast v0, LNh/a0;

    :cond_1
    if-nez v0, :cond_2

    invoke-static {p0}, LLh/h;->b(LBh/e;)LNh/a0;

    move-result-object v0

    :cond_2
    return-object v0
.end method
