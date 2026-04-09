.class public final LRh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRh/g$a;,
        LRh/g$b;
    }
.end annotation


# instance fields
.field private final a:LMh/e;


# direct methods
.method public constructor <init>(LMh/e;)V
    .locals 1

    const-string v0, "javaResolverSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/g;->a:LMh/e;

    return-void
.end method

.method private final b(Lpi/d0;Lmh/l;ILRh/h0;ZZ)LRh/g$b;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move/from16 v3, p6

    invoke-static/range {p4 .. p4}, LRh/i0;->a(LRh/h0;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_1

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    move v7, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v7, v6

    :goto_1
    const/4 v8, 0x0

    if-nez v4, :cond_2

    invoke-virtual/range {p1 .. p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v1, LRh/g$b;

    invoke-direct {v1, v8, v6, v5}, LRh/g$b;-><init>(Lpi/d0;IZ)V

    return-object v1

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v4

    invoke-interface {v4}, Lpi/v0;->c()LBh/h;

    move-result-object v4

    if-nez v4, :cond_3

    new-instance v1, LRh/g$b;

    invoke-direct {v1, v8, v6, v5}, LRh/g$b;-><init>(Lpi/d0;IZ)V

    return-object v1

    :cond_3
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v9}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LRh/h;

    invoke-static {v4, v9, v2}, LRh/k0;->b(LBh/h;LRh/h;LRh/h0;)LBh/h;

    move-result-object v4

    invoke-static {v9, v2}, LRh/k0;->d(LRh/h;LRh/h0;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v4, :cond_5

    invoke-interface {v4}, LBh/h;->k()Lpi/v0;

    move-result-object v10

    if-nez v10, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v12, v10

    goto :goto_4

    :cond_5
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v10

    goto :goto_2

    :goto_4
    add-int/lit8 v10, p3, 0x1

    invoke-virtual/range {p1 .. p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v12}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v13

    const-string v14, "getParameters(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    new-instance v6, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v11, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-static {v13, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LBh/l0;

    check-cast v11, Lpi/B0;

    if-nez v7, :cond_6

    new-instance v5, LRh/g$a;

    move/from16 p5, v7

    const/4 v7, 0x0

    invoke-direct {v5, v8, v7}, LRh/g$a;-><init>(Lpi/S;I)V

    goto :goto_6

    :cond_6
    move/from16 p5, v7

    invoke-interface {v11}, Lpi/B0;->c()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v11}, Lpi/B0;->getType()Lpi/S;

    move-result-object v5

    invoke-virtual {v5}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v5

    invoke-direct {v0, v5, v1, v10, v3}, LRh/g;->d(Lpi/M0;Lmh/l;IZ)LRh/g$a;

    move-result-object v5

    goto :goto_6

    :cond_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LRh/h;

    invoke-virtual {v5}, LRh/h;->f()LRh/k;

    move-result-object v5

    sget-object v7, LRh/k;->FORCE_FLEXIBILITY:LRh/k;

    if-ne v5, v7, :cond_8

    invoke-interface {v11}, Lpi/B0;->getType()Lpi/S;

    move-result-object v5

    invoke-virtual {v5}, Lpi/S;->Q0()Lpi/M0;

    move-result-object v5

    new-instance v7, LRh/g$a;

    invoke-static {v5}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object v8

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v8

    invoke-static {v5}, Lpi/L;->d(Lpi/S;)Lpi/d0;

    move-result-object v1

    const/4 v5, 0x1

    invoke-virtual {v1, v5}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object v1

    invoke-static {v8, v1}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v1

    invoke-direct {v7, v1, v5}, LRh/g$a;-><init>(Lpi/S;I)V

    move-object v5, v7

    goto :goto_6

    :cond_8
    const/4 v5, 0x1

    new-instance v1, LRh/g$a;

    const/4 v7, 0x0

    invoke-direct {v1, v7, v5}, LRh/g$a;-><init>(Lpi/S;I)V

    move-object v5, v1

    :goto_6
    invoke-virtual {v5}, LRh/g$a;->a()I

    move-result v1

    add-int/2addr v10, v1

    invoke-virtual {v5}, LRh/g$a;->b()Lpi/S;

    move-result-object v1

    const-string v7, "getProjectionKind(...)"

    if-eqz v1, :cond_9

    invoke-virtual {v5}, LRh/g$a;->b()Lpi/S;

    move-result-object v1

    invoke-interface {v11}, Lpi/B0;->a()Lpi/N0;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5, v13}, Lsi/d;->k(Lpi/S;Lpi/N0;LBh/l0;)Lpi/B0;

    move-result-object v7

    goto :goto_7

    :cond_9
    if-eqz v4, :cond_a

    invoke-interface {v11}, Lpi/B0;->c()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-interface {v11}, Lpi/B0;->getType()Lpi/S;

    move-result-object v1

    const-string v5, "getType(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11}, Lpi/B0;->a()Lpi/N0;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5, v13}, Lsi/d;->k(Lpi/S;Lpi/N0;LBh/l0;)Lpi/B0;

    move-result-object v7

    goto :goto_7

    :cond_a
    if-eqz v4, :cond_b

    invoke-static {v13}, Lpi/J0;->s(LBh/l0;)Lpi/B0;

    move-result-object v7

    goto :goto_7

    :cond_b
    const/4 v7, 0x0

    :goto_7
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p2

    move/from16 v7, p5

    const/16 v5, 0xa

    const/4 v8, 0x0

    goto/16 :goto_5

    :cond_c
    sub-int v10, v10, p3

    if-nez v4, :cond_e

    if-nez v2, :cond_e

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpi/B0;

    if-nez v3, :cond_e

    goto :goto_8

    :cond_e
    const/4 v7, 0x0

    goto :goto_a

    :cond_f
    :goto_9
    new-instance v1, LRh/g$b;

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct {v1, v7, v10, v2}, LRh/g$b;-><init>(Lpi/d0;IZ)V

    return-object v1

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v1

    invoke-static {}, LRh/k0;->c()LRh/f;

    move-result-object v3

    if-eqz v4, :cond_10

    goto :goto_b

    :cond_10
    move-object v3, v7

    :goto_b
    invoke-static {}, LRh/k0;->g()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v4

    if-eqz v2, :cond_11

    move-object v8, v4

    goto :goto_c

    :cond_11
    move-object v8, v7

    :goto_c
    const/4 v4, 0x3

    new-array v4, v4, [Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v3, v4, v1

    const/4 v3, 0x2

    aput-object v8, v4, v3

    invoke-static {v4}, LZg/v;->q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, LRh/k0;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v3

    invoke-static {v3}, Lpi/s0;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lpi/r0;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    new-instance v13, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v3, v8}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpi/B0;

    check-cast v3, Lpi/B0;

    if-nez v3, :cond_12

    goto :goto_e

    :cond_12
    move-object v6, v3

    :goto_e
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_13
    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_f
    move v14, v3

    goto :goto_10

    :cond_14
    invoke-virtual/range {p1 .. p1}, Lpi/S;->O0()Z

    move-result v3

    goto :goto_f

    :goto_10
    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v11 .. v17}, Lpi/V;->k(Lpi/r0;Lpi/v0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/types/checker/g;ILjava/lang/Object;)Lpi/d0;

    move-result-object v3

    invoke-virtual {v9}, LRh/h;->d()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-direct {v0, v3}, LRh/g;->e(Lpi/d0;)Lpi/d0;

    move-result-object v3

    :cond_15
    if-eqz v2, :cond_16

    invoke-virtual {v9}, LRh/h;->g()Z

    move-result v2

    if-eqz v2, :cond_16

    move v5, v1

    :cond_16
    new-instance v1, LRh/g$b;

    invoke-direct {v1, v3, v10, v5}, LRh/g$b;-><init>(Lpi/d0;IZ)V

    return-object v1
.end method

.method static synthetic c(LRh/g;Lpi/d0;Lmh/l;ILRh/h0;ZZILjava/lang/Object;)LRh/g$b;
    .locals 9

    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v7, v1

    goto :goto_0

    :cond_0
    move v7, p5

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move v8, v1

    goto :goto_1

    :cond_1
    move v8, p6

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v2 .. v8}, LRh/g;->b(Lpi/d0;Lmh/l;ILRh/h0;ZZ)LRh/g$b;

    move-result-object v0

    return-object v0
.end method

.method private final d(Lpi/M0;Lmh/l;IZ)LRh/g$a;
    .locals 11

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p1, LRh/g$a;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, LRh/g$a;-><init>(Lpi/S;I)V

    return-object p1

    :cond_0
    instance-of v0, p1, Lpi/I;

    if-eqz v0, :cond_c

    instance-of v0, p1, Lpi/c0;

    move-object v9, p1

    check-cast v9, Lpi/I;

    invoke-virtual {v9}, Lpi/I;->V0()Lpi/d0;

    move-result-object v3

    sget-object v6, LRh/h0;->FLEXIBLE_LOWER:LRh/h0;

    move-object v2, p0

    move-object v4, p2

    move v5, p3

    move v7, v0

    move v8, p4

    invoke-direct/range {v2 .. v8}, LRh/g;->b(Lpi/d0;Lmh/l;ILRh/h0;ZZ)LRh/g$b;

    move-result-object v10

    invoke-virtual {v9}, Lpi/I;->W0()Lpi/d0;

    move-result-object v3

    sget-object v6, LRh/h0;->FLEXIBLE_UPPER:LRh/h0;

    invoke-direct/range {v2 .. v8}, LRh/g;->b(Lpi/d0;Lmh/l;ILRh/h0;ZZ)LRh/g$b;

    move-result-object p2

    invoke-virtual {v10}, LRh/g$b;->b()I

    invoke-virtual {p2}, LRh/g$b;->b()I

    invoke-virtual {v10}, LRh/g$b;->c()Lpi/d0;

    move-result-object p3

    if-nez p3, :cond_1

    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, LRh/g$b;->a()Z

    move-result p3

    if-nez p3, :cond_8

    invoke-virtual {p2}, LRh/g$b;->a()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_5

    new-instance v1, LOh/k;

    invoke-virtual {v10}, LRh/g$b;->c()Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {v9}, Lpi/I;->V0()Lpi/d0;

    move-result-object p1

    :cond_3
    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p2

    if-nez p2, :cond_4

    invoke-virtual {v9}, Lpi/I;->W0()Lpi/d0;

    move-result-object p2

    :cond_4
    invoke-direct {v1, p1, p2}, LOh/k;-><init>(Lpi/d0;Lpi/d0;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v10}, LRh/g$b;->c()Lpi/d0;

    move-result-object p1

    if-nez p1, :cond_6

    invoke-virtual {v9}, Lpi/I;->V0()Lpi/d0;

    move-result-object p1

    :cond_6
    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p2

    if-nez p2, :cond_7

    invoke-virtual {v9}, Lpi/I;->W0()Lpi/d0;

    move-result-object p2

    :cond_7
    invoke-static {p1, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object v1

    goto :goto_1

    :cond_8
    :goto_0
    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {v10}, LRh/g$b;->c()Lpi/d0;

    move-result-object p3

    if-nez p3, :cond_9

    move-object p3, p2

    :cond_9
    invoke-static {p3, p2}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p2

    if-nez p2, :cond_b

    :cond_a
    invoke-virtual {v10}, LRh/g$b;->c()Lpi/d0;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_b
    invoke-static {p1, p2}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object v1

    :goto_1
    new-instance p1, LRh/g$a;

    invoke-virtual {v10}, LRh/g$b;->b()I

    move-result p2

    invoke-direct {p1, v1, p2}, LRh/g$a;-><init>(Lpi/S;I)V

    goto :goto_3

    :cond_c
    instance-of v0, p1, Lpi/d0;

    if-eqz v0, :cond_e

    move-object v2, p1

    check-cast v2, Lpi/d0;

    sget-object v5, LRh/h0;->INFLEXIBLE:LRh/h0;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v7, p4

    invoke-static/range {v1 .. v9}, LRh/g;->c(LRh/g;Lpi/d0;Lmh/l;ILRh/h0;ZZILjava/lang/Object;)LRh/g$b;

    move-result-object p2

    new-instance p3, LRh/g$a;

    invoke-virtual {p2}, LRh/g$b;->a()Z

    move-result p4

    if-eqz p4, :cond_d

    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p4

    invoke-static {p1, p4}, Lpi/L0;->d(Lpi/M0;Lpi/S;)Lpi/M0;

    move-result-object p1

    goto :goto_2

    :cond_d
    invoke-virtual {p2}, LRh/g$b;->c()Lpi/d0;

    move-result-object p1

    :goto_2
    invoke-virtual {p2}, LRh/g$b;->b()I

    move-result p2

    invoke-direct {p3, p1, p2}, LRh/g$a;-><init>(Lpi/S;I)V

    move-object p1, p3

    :goto_3
    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final e(Lpi/d0;)Lpi/d0;
    .locals 1

    iget-object v0, p0, LRh/g;->a:LMh/e;

    invoke-interface {v0}, LMh/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lpi/h0;->h(Lpi/d0;Z)Lpi/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, LRh/j;

    invoke-direct {v0, p1}, LRh/j;-><init>(Lpi/d0;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final a(Lpi/S;Lmh/l;Z)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "qualifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, LRh/g;->d(Lpi/M0;Lmh/l;IZ)LRh/g$a;

    move-result-object p1

    invoke-virtual {p1}, LRh/g$a;->b()Lpi/S;

    move-result-object p1

    return-object p1
.end method
