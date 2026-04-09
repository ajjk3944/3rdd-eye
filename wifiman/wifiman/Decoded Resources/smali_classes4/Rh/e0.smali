.class public final LRh/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LRh/g;


# direct methods
.method public constructor <init>(LRh/g;)V
    .locals 1

    const-string v0, "typeEnhancement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/e0;->a:LRh/g;

    return-void
.end method

.method static synthetic a(LBh/b;)Lpi/S;
    .locals 0

    invoke-static {p0}, LRh/e0;->n(LBh/b;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(LBh/s0;LBh/b;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, LRh/e0;->o(LBh/s0;LBh/b;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(LBh/b;)Lpi/S;
    .locals 0

    invoke-static {p0}, LRh/e0;->m(LBh/b;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lpi/M0;)Z
    .locals 0

    invoke-static {p0}, LRh/e0;->s(Lpi/M0;)Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lpi/M0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, LRh/e0;->g(Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lpi/S;)Z
    .locals 1

    sget-object v0, LRh/d0;->a:LRh/d0;

    invoke-static {p1, v0}, Lpi/J0;->c(Lpi/S;Lmh/l;)Z

    move-result p1

    return p1
.end method

.method private static final g(Lpi/M0;)Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Lpi/S;->N0()Lpi/v0;

    move-result-object p0

    invoke-interface {p0}, Lpi/v0;->c()LBh/h;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    invoke-interface {p0}, LBh/I;->getName()LZh/f;

    move-result-object v0

    sget-object v1, LAh/c;->a:LAh/c;

    invoke-virtual {v1}, LAh/c;->h()LZh/c;

    move-result-object v2

    invoke-virtual {v2}, LZh/c;->g()LZh/f;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lfi/e;->k(LBh/m;)LZh/c;

    move-result-object p0

    invoke-virtual {v1}, LAh/c;->h()LZh/c;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final h(LBh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;LRh/j0;ZLmh/l;)Lpi/S;
    .locals 10

    move-object/from16 v0, p8

    new-instance v9, LRh/g0;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v8}, LRh/g0;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/S;

    invoke-interface {p1}, LBh/b;->f()Ljava/util/Collection;

    move-result-object v1

    const-string v3, "getOverriddenDescriptors(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBh/b;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/S;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    move-object v1, v9

    move-object/from16 v4, p6

    move/from16 v5, p7

    invoke-direct/range {v0 .. v5}, LRh/e0;->i(LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;Z)Lpi/S;

    move-result-object v0

    return-object v0
.end method

.method private final i(LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;Z)Lpi/S;
    .locals 1

    iget-object v0, p0, LRh/e0;->a:LRh/g;

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p1, p2, p3, p4, p5}, LRh/d;->d(Lri/i;Ljava/lang/Iterable;LRh/j0;Z)Lmh/l;

    move-result-object p3

    invoke-virtual {p1}, LRh/g0;->z()Z

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LRh/g;->a(Lpi/S;Lmh/l;Z)Lpi/S;

    move-result-object p1

    return-object p1
.end method

.method static synthetic j(LRh/e0;LBh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;LRh/j0;ZLmh/l;ILjava/lang/Object;)Lpi/S;
    .locals 10

    and-int/lit8 v0, p9, 0x20

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

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, LRh/e0;->h(LBh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;LRh/j0;ZLmh/l;)Lpi/S;

    move-result-object v0

    return-object v0
.end method

.method static synthetic k(LRh/e0;LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;ZILjava/lang/Object;)Lpi/S;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LRh/e0;->i(LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;Z)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final l(LBh/b;LMh/k;)LBh/b;
    .locals 21

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    instance-of v0, v12, LLh/a;

    if-nez v0, :cond_0

    return-object v12

    :cond_0
    invoke-interface/range {p1 .. p1}, LBh/b;->h()LBh/b$a;

    move-result-object v0

    sget-object v1, LBh/b$a;->FAKE_OVERRIDE:LBh/b$a;

    const/4 v13, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface/range {p1 .. p1}, LBh/b;->a()LBh/b;

    move-result-object v0

    invoke-interface {v0}, LBh/b;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    if-ne v0, v13, :cond_1

    return-object v12

    :cond_1
    invoke-direct/range {p0 .. p2}, LRh/e0;->u(LBh/b;LMh/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    move-object/from16 v7, p2

    invoke-static {v7, v0}, LMh/c;->k(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LMh/k;

    move-result-object v8

    instance-of v0, v12, LLh/f;

    if-eqz v0, :cond_2

    move-object v0, v12

    check-cast v0, LDh/K;

    invoke-virtual {v0}, LDh/K;->R0()LDh/L;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LDh/J;->T()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, LDh/K;->R0()LDh/L;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v9, v0

    goto :goto_0

    :cond_2
    move-object v9, v12

    :goto_0
    invoke-interface/range {p1 .. p1}, LBh/a;->k0()LBh/b0;

    move-result-object v0

    const/4 v14, 0x0

    if-eqz v0, :cond_5

    instance-of v0, v9, LBh/z;

    if-eqz v0, :cond_3

    move-object v0, v9

    check-cast v0, LBh/z;

    goto :goto_1

    :cond_3
    move-object v0, v14

    :goto_1
    if-eqz v0, :cond_4

    sget-object v1, LLh/e;->G:LBh/a$a;

    invoke-interface {v0, v1}, LBh/a;->e0(LBh/a$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBh/s0;

    move-object v2, v0

    goto :goto_2

    :cond_4
    move-object v2, v14

    :goto_2
    const/4 v5, 0x0

    sget-object v6, LRh/Z;->a:LRh/Z;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v8

    invoke-direct/range {v0 .. v6}, LRh/e0;->t(LBh/b;LBh/s0;LMh/k;LRh/j0;ZLmh/l;)Lpi/S;

    move-result-object v0

    move-object v15, v0

    goto :goto_3

    :cond_5
    move-object v15, v14

    :goto_3
    instance-of v0, v12, LLh/e;

    if-eqz v0, :cond_6

    move-object v0, v12

    check-cast v0, LLh/e;

    goto :goto_4

    :cond_6
    move-object v0, v14

    :goto_4
    const/4 v10, 0x0

    if-eqz v0, :cond_b

    sget-object v1, LSh/F;->a:LSh/F;

    invoke-virtual {v0}, LDh/n;->b()LBh/m;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LBh/e;

    const/4 v3, 0x3

    invoke-static {v0, v10, v10, v3, v14}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, LSh/B;->a(LSh/F;LBh/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {}, LRh/X;->u0()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh/Y;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, LRh/Y;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, LRh/Y;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v2, "2."

    const/4 v3, 0x2

    invoke-static {v1, v2, v10, v3, v14}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-ne v1, v13, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    invoke-virtual {v0}, LRh/Y;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, LRh/Y;->d()LRh/Y;

    move-result-object v0

    goto :goto_6

    :cond_a
    move-object v0, v14

    :goto_6
    move-object/from16 v16, v0

    goto :goto_7

    :cond_b
    move-object/from16 v16, v14

    :goto_7
    if-eqz v16, :cond_c

    invoke-virtual/range {v16 .. v16}, LRh/Y;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-object v0, v12

    check-cast v0, LLh/e;

    invoke-virtual {v0}, LDh/s;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    :cond_c
    invoke-virtual/range {p2 .. p2}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->i()LJh/D;

    move-result-object v0

    invoke-static {v0}, LJh/V;->c(LJh/D;)Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v8}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->q()LMh/e;

    move-result-object v0

    invoke-interface {v0}, LMh/e;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_d
    invoke-static/range {p1 .. p1}, LJh/V;->b(LBh/b;)Z

    move-result v0

    if-eqz v0, :cond_e

    move v7, v13

    goto :goto_8

    :cond_e
    move v7, v10

    :goto_8
    invoke-interface {v9}, LBh/a;->i()Ljava/util/List;

    move-result-object v0

    const-string v6, "getValueParameters(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LBh/s0;

    if-eqz v16, :cond_f

    invoke-virtual/range {v16 .. v16}, LRh/Y;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v2}, LBh/s0;->getIndex()I

    move-result v1

    invoke-static {v0, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRh/j0;

    move-object/from16 v18, v0

    goto :goto_a

    :cond_f
    move-object/from16 v18, v14

    :goto_a
    new-instance v3, LRh/a0;

    invoke-direct {v3, v2}, LRh/a0;-><init>(LBh/s0;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v19, v3

    move-object v3, v8

    move v14, v4

    move-object/from16 v4, v18

    move-object v14, v5

    move v5, v7

    move-object/from16 v20, v6

    move-object/from16 v6, v19

    invoke-direct/range {v0 .. v6}, LRh/e0;->t(LBh/b;LBh/s0;LMh/k;LRh/j0;ZLmh/l;)Lpi/S;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v5, v14

    move-object/from16 v6, v20

    const/16 v4, 0xa

    const/4 v14, 0x0

    goto :goto_9

    :cond_10
    move-object v14, v5

    move-object/from16 v20, v6

    instance-of v0, v12, LBh/Y;

    if-eqz v0, :cond_11

    move-object v0, v12

    check-cast v0, LBh/Y;

    goto :goto_b

    :cond_11
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_12

    invoke-static {v0}, LNh/d;->a(LBh/Y;)Z

    move-result v0

    if-ne v0, v13, :cond_12

    sget-object v0, LJh/c;->FIELD:LJh/c;

    :goto_c
    move-object v5, v0

    goto :goto_d

    :cond_12
    sget-object v0, LJh/c;->METHOD_RETURN_TYPE:LJh/c;

    goto :goto_c

    :goto_d
    if-eqz v16, :cond_13

    invoke-virtual/range {v16 .. v16}, LRh/Y;->c()LRh/j0;

    move-result-object v0

    move-object v6, v0

    goto :goto_e

    :cond_13
    const/4 v6, 0x0

    :goto_e
    sget-object v16, LRh/b0;->a:LRh/b0;

    const/16 v17, 0x20

    const/16 v19, 0x0

    const/4 v3, 0x1

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object v4, v8

    move-object/from16 v8, v16

    move/from16 v9, v17

    move/from16 v16, v10

    move-object/from16 v10, v19

    invoke-static/range {v0 .. v10}, LRh/e0;->j(LRh/e0;LBh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;LRh/j0;ZLmh/l;ILjava/lang/Object;)Lpi/S;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v11, v1}, LRh/e0;->f(Lpi/S;)Z

    move-result v1

    const-string v2, "getType(...)"

    if-nez v1, :cond_19

    invoke-interface/range {p1 .. p1}, LBh/a;->k0()LBh/b0;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-interface {v1}, LBh/r0;->getType()Lpi/S;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-direct {v11, v1}, LRh/e0;->f(Lpi/S;)Z

    move-result v10

    goto :goto_f

    :cond_14
    move/from16 v10, v16

    :goto_f
    if-nez v10, :cond_19

    invoke-interface/range {p1 .. p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v1

    move-object/from16 v3, v20

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_16

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_16

    :cond_15
    move/from16 v10, v16

    goto :goto_10

    :cond_16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBh/s0;

    invoke-interface {v3}, LBh/r0;->getType()Lpi/S;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v3}, LRh/e0;->f(Lpi/S;)Z

    move-result v3

    if-eqz v3, :cond_17

    move v10, v13

    :goto_10
    if-eqz v10, :cond_18

    goto :goto_11

    :cond_18
    move/from16 v10, v16

    goto :goto_12

    :cond_19
    :goto_11
    move v10, v13

    :goto_12
    if-eqz v10, :cond_1a

    invoke-static {}, Lei/d;->a()LBh/a$a;

    move-result-object v1

    new-instance v3, LJh/n;

    invoke-direct {v3, v12}, LJh/n;-><init>(LBh/m;)V

    invoke-static {v1, v3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    goto :goto_13

    :cond_1a
    const/4 v1, 0x0

    :goto_13
    if-nez v15, :cond_20

    if-nez v0, :cond_20

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1c

    :cond_1b
    move/from16 v13, v16

    goto :goto_15

    :cond_1c
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpi/S;

    if-eqz v4, :cond_1e

    move v10, v13

    goto :goto_14

    :cond_1e
    move/from16 v10, v16

    :goto_14
    if-eqz v10, :cond_1d

    :goto_15
    if-nez v13, :cond_20

    if-eqz v1, :cond_1f

    goto :goto_16

    :cond_1f
    return-object v12

    :cond_20
    :goto_16
    move-object v3, v12

    check-cast v3, LLh/a;

    if-nez v15, :cond_22

    invoke-interface/range {p1 .. p1}, LBh/a;->k0()LBh/b0;

    move-result-object v4

    if-eqz v4, :cond_21

    invoke-interface {v4}, LBh/r0;->getType()Lpi/S;

    move-result-object v4

    move-object v15, v4

    goto :goto_17

    :cond_21
    const/4 v15, 0x0

    :cond_22
    :goto_17
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v14, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move/from16 v10, v16

    :goto_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v10, 0x1

    if-gez v10, :cond_23

    invoke-static {}, LZg/v;->v()V

    :cond_23
    check-cast v6, Lpi/S;

    if-nez v6, :cond_24

    invoke-interface/range {p1 .. p1}, LBh/a;->i()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LBh/s0;

    invoke-interface {v6}, LBh/r0;->getType()Lpi/S;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_24
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v10, v7

    goto :goto_18

    :cond_25
    if-nez v0, :cond_26

    invoke-interface/range {p1 .. p1}, LBh/a;->getReturnType()Lpi/S;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_26
    invoke-interface {v3, v15, v4, v0, v1}, LLh/a;->A0(Lpi/S;Ljava/util/List;Lpi/S;LYg/s;)LLh/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final m(LBh/b;)Lpi/S;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->getReturnType()Lpi/S;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final n(LBh/b;)Lpi/S;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/a;->k0()LBh/b0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    const-string v0, "getType(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final o(LBh/s0;LBh/b;)Lpi/S;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/a;->i()Ljava/util/List;

    move-result-object p1

    invoke-interface {p0}, LBh/s0;->getIndex()I

    move-result p0

    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBh/s0;

    invoke-interface {p0}, LBh/r0;->getType()Lpi/S;

    move-result-object p0

    const-string p1, "getType(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final s(Lpi/M0;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Lpi/c0;

    return p0
.end method

.method private final t(LBh/b;LBh/s0;LMh/k;LRh/j0;ZLmh/l;)Lpi/S;
    .locals 9

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    invoke-static {p3, v0}, LMh/c;->k(LMh/k;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)LMh/k;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, p3

    :goto_1
    sget-object v5, LJh/c;->VALUE_PARAMETER:LJh/c;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p4

    move v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, LRh/e0;->h(LBh/b;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;LRh/j0;ZLmh/l;)Lpi/S;

    move-result-object v0

    return-object v0
.end method

.method private final u(LBh/b;LMh/k;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 5

    invoke-static {p1}, LBh/s;->a(LBh/m;)LBh/h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, LNh/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, LNh/n;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LNh/n;->T0()Ljava/util/List;

    move-result-object v2

    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQh/a;

    new-instance v3, LNh/j;

    const/4 v4, 0x1

    invoke-direct {v3, p2, v2, v4}, LNh/j;-><init>(LMh/k;LQh/a;Z)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    sget-object p2, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->c1:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-static {p1, v0}, LZg/v;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$a;->a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final p(LMh/k;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformSignatures"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/b;

    invoke-direct {p0, v1, p1}, LRh/e0;->l(LBh/b;LMh/k;)LBh/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final q(Lpi/S;LMh/k;)Lpi/S;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LRh/g0;

    sget-object v5, LJh/c;->TYPE_USE:LJh/c;

    const/4 v6, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, LRh/g0;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;Z)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v3, p1

    invoke-static/range {v1 .. v8}, LRh/e0;->k(LRh/e0;LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;ZILjava/lang/Object;)Lpi/S;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public final r(LBh/l0;Ljava/util/List;LMh/k;)Ljava/util/List;
    .locals 12

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpi/S;

    sget-object v2, LRh/c0;->a:LRh/c0;

    invoke-static {v1, v2}, Lsi/d;->e(Lpi/S;Lmh/l;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance v11, LRh/g0;

    sget-object v7, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    move-object v4, p1

    move-object v6, p3

    invoke-direct/range {v3 .. v10}, LRh/g0;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, v1

    invoke-static/range {v2 .. v9}, LRh/e0;->k(LRh/e0;LRh/g0;Lpi/S;Ljava/util/List;LRh/j0;ZILjava/lang/Object;)Lpi/S;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method
