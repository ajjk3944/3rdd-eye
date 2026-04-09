.class public abstract Lkotlin/reflect/jvm/internal/impl/builtins/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpi/S;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->D:LZh/c;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->a()Ljava/util/Map;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o;->q:LZh/f;

    invoke-static {p0, v0}, LZg/U;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldi/g;

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ldi/n;

    invoke-virtual {p0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;Z)Lpi/d0;
    .locals 6

    const-string v0, "builtIns"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextReceiverTypes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameterTypes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    move-object v4, p6

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->g(Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Ljava/util/List;

    move-result-object p5

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p6

    add-int/2addr p4, p6

    if-nez p2, :cond_0

    const/4 p6, 0x0

    goto :goto_0

    :cond_0
    const/4 p6, 0x1

    :goto_0
    add-int/2addr p4, p6

    invoke-static {p0, p4, p7}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->f(Lkotlin/reflect/jvm/internal/impl/builtins/i;IZ)LBh/e;

    move-result-object p4

    if-eqz p2, :cond_1

    invoke-static {p1, p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->u(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    :cond_1
    move-object p2, p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p1, p0, p2}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->t(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/builtins/i;I)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    :cond_2
    invoke-static {p1}, Lpi/s0;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;

    move-result-object p0

    invoke-static {p0, p4, p5}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/reflect/jvm/internal/impl/builtins/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;ZILjava/lang/Object;)Lpi/d0;
    .locals 9

    move/from16 v0, p8

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-static/range {v1 .. v8}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->b(Lkotlin/reflect/jvm/internal/impl/builtins/i;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;Z)Lpi/d0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lpi/S;)LZh/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->E:LZh/c;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->S0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    instance-of v1, p0, Ldi/x;

    if-eqz v1, :cond_1

    check-cast p0, Ldi/x;

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_3

    invoke-static {p0}, LZh/f;->l(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_3

    invoke-static {p0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static final e(Lpi/S;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->p(Lpi/S;)Z

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->a(Lpi/S;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    invoke-interface {p0, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/B0;

    invoke-interface {v1}, Lpi/B0;->getType()Lpi/S;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object p0, v0

    :goto_1
    return-object p0
.end method

.method public static final f(Lkotlin/reflect/jvm/internal/impl/builtins/i;IZ)LBh/e;
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->X(I)LBh/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->C(I)LBh/e;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final g(Lpi/S;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpi/S;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "contextReceiverTypes"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "parameterTypes"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "returnType"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "builtIns"

    move-object/from16 v12, p5

    invoke-static {v12, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz p0, :cond_0

    move v8, v7

    goto :goto_0

    :cond_0
    move v8, v6

    :goto_0
    add-int/2addr v5, v8

    add-int/2addr v5, v7

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpi/S;

    invoke-static {v7}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-static/range {p0 .. p0}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    invoke-static {v3, v5}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v13, v6, 0x1

    if-gez v6, :cond_3

    invoke-static {}, LZg/v;->v()V

    :cond_3
    move-object v14, v5

    check-cast v14, Lpi/S;

    if-eqz v2, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZh/f;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, LZh/f;->j()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, v0

    :goto_4
    if-eqz v5, :cond_5

    new-instance v15, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;

    sget-object v7, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->E:LZh/c;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/builtins/o;->m:LZh/f;

    new-instance v8, Ldi/x;

    invoke-virtual {v5}, LZh/f;->b()Ljava/lang/String;

    move-result-object v5

    const-string v9, "asString(...)"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v5}, Ldi/x;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v8}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    invoke-static {v5}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, v15

    move-object/from16 v6, p5

    invoke-direct/range {v5 .. v11}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-virtual {v14}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v6

    invoke-static {v6, v15}, LZg/v;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v5

    invoke-static {v14, v5}, Lsi/d;->C(Lpi/S;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/S;

    move-result-object v14

    :cond_5
    invoke-static {v14}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v6, v13

    goto :goto_3

    :cond_6
    invoke-static/range {p4 .. p4}, Lsi/d;->d(Lpi/S;)Lpi/B0;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3
.end method

.method public static final h(LBh/m;)Lzh/f;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LBh/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->B0(LBh/m;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Lfi/e;->p(LBh/m;)LZh/d;

    move-result-object p0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->i(LZh/d;)Lzh/f;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LZh/d;)Lzh/f;
    .locals 3

    invoke-virtual {p0}, LZh/d;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lzh/g;->c:Lzh/g$a;

    invoke-virtual {v0}, Lzh/g$a;->a()Lzh/g;

    move-result-object v0

    invoke-virtual {p0}, LZh/d;->l()LZh/c;

    move-result-object v1

    invoke-virtual {v1}, LZh/c;->e()LZh/c;

    move-result-object v1

    const-string v2, "parent(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZh/d;->i()LZh/f;

    move-result-object p0

    invoke-virtual {p0}, LZh/f;->b()Ljava/lang/String;

    move-result-object p0

    const-string v2, "asString(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p0}, Lzh/g;->b(LZh/c;Ljava/lang/String;)Lzh/f;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final j(Lpi/S;)Lzh/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->h(LBh/m;)Lzh/f;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final k(Lpi/S;)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->p(Lpi/S;)Z

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->s(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->a(Lpi/S;)I

    move-result v0

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/B0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lpi/S;)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->p(Lpi/S;)Z

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpi/B0;

    invoke-interface {p0}, Lpi/B0;->getType()Lpi/S;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final m(Lpi/S;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->p(Lpi/S;)Z

    invoke-virtual {p0}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->a(Lpi/S;)I

    move-result v1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->n(Lpi/S;)Z

    move-result p0

    add-int/2addr v1, p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-interface {v0, v1, p0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->p(Lpi/S;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->s(Lpi/S;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final o(LBh/m;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->h(LBh/m;)Lzh/f;

    move-result-object p0

    sget-object v0, Lzh/f$a;->e:Lzh/f$a;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lzh/f$d;->e:Lzh/f$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final p(Lpi/S;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->o(LBh/m;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public static final q(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->j(Lpi/S;)Lzh/f;

    move-result-object p0

    sget-object v0, Lzh/f$a;->e:Lzh/f$a;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final r(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/h;->j(Lpi/S;)Lzh/f;

    move-result-object p0

    sget-object v0, Lzh/f$d;->e:Lzh/f$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final s(Lpi/S;)Z
    .locals 1

    invoke-virtual {p0}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->C:LZh/c;

    invoke-interface {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final t(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/builtins/i;I)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->D:LZh/c;

    invoke-interface {p0, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    new-instance v8, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o;->q:LZh/f;

    new-instance v2, Ldi/n;

    invoke-direct {v2, p2}, Ldi/n;-><init>(I)V

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    invoke-static {p2}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, v8}, LZg/v;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final u(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lkotlin/reflect/jvm/internal/impl/builtins/i;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->C:LZh/c;

    invoke-interface {p0, v3}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    new-instance v8, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/l;-><init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LZh/c;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, v8}, LZg/v;->L0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    :goto_0
    return-object p0
.end method
