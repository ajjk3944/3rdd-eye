.class public final Lpi/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/g$a;
    }
.end annotation


# static fields
.field public static final a:Lpi/g;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/g;

    invoke-direct {v0}, Lpi/g;-><init>()V

    sput-object v0, Lpi/g;->a:Lpi/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final A(Lpi/u0;Ljava/util/List;)Ljava/util/List;
    .locals 7

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-object p2

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lri/j;

    invoke-interface {p1, v3}, Lri/o;->l0(Lri/j;)Lri/k;

    move-result-object v3

    invoke-interface {p1, v3}, Lri/o;->l(Lri/k;)I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    invoke-interface {p1, v3, v5}, Lri/o;->U(Lri/k;I)Lri/l;

    move-result-object v6

    invoke-interface {p1, v6}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v6

    invoke-interface {p1, v6}, Lri/o;->u(Lri/i;)Lri/g;

    move-result-object v6

    if-nez v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    move-object p2, v1

    :cond_4
    return-object p2
.end method

.method static synthetic a(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;Lpi/u0$a;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpi/g;->x(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;Lpi/u0$a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lpi/u0;Lri/o;Lri/j;Lri/j;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpi/g;->y(Lpi/u0;Lri/o;Lri/j;Lri/j;)Z

    move-result p0

    return p0
.end method

.method private final c(Lpi/u0;Lri/j;Lri/j;)Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    invoke-interface {v0, p2}, Lri/o;->i(Lri/j;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-interface {v0, p3}, Lri/o;->i(Lri/j;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {v0, p2}, Lpi/g;->f(Lri/o;Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p3}, Lpi/g;->f(Lri/o;Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    invoke-interface {v0, p2}, Lri/o;->i(Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, p3, v1}, Lpi/g;->g(Lri/o;Lpi/u0;Lri/j;Lri/j;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_2
    invoke-interface {v0, p3}, Lri/o;->i(Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0, p2}, Lpi/g;->e(Lri/o;Lri/j;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    invoke-static {v0, p1, p3, p2, v1}, Lpi/g;->g(Lri/o;Lpi/u0;Lri/j;Lri/j;Z)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    return-object v2
.end method

.method private static final d(Lri/o;Lri/j;)Z
    .locals 2

    instance-of v0, p1, Lri/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lri/d;

    invoke-interface {p0, p1}, Lri/o;->A0(Lri/d;)Lri/c;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->P(Lri/c;)Lri/l;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->p(Lri/l;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0, p1}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p1

    invoke-interface {p0, p1}, Lri/o;->i(Lri/j;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method private static final e(Lri/o;Lri/j;)Z
    .locals 2

    invoke-interface {p0, p1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object p1

    instance-of v0, p1, Lri/h;

    if-eqz v0, :cond_2

    invoke-interface {p0, p1}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lri/i;

    invoke-interface {p0, v0}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0, v0}, Lri/o;->i(Lri/j;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private static final f(Lri/o;Lri/j;)Z
    .locals 1

    invoke-interface {p0, p1}, Lri/o;->i(Lri/j;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Lpi/g;->d(Lri/o;Lri/j;)Z

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

.method private static final g(Lri/o;Lpi/u0;Lri/j;Lri/j;Z)Z
    .locals 9

    invoke-interface {p0, p2}, Lri/o;->A(Lri/j;)Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lri/i;

    invoke-interface {p0, v5}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v0

    invoke-interface {p0, p3}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p4, :cond_1

    sget-object v2, Lpi/g;->a:Lpi/g;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v2 .. v8}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_0
    return v1
.end method

.method private final h(Lpi/u0;Lri/j;Lri/j;)Ljava/lang/Boolean;
    .locals 14

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v9

    invoke-interface {v9, v7}, Lri/o;->w0(Lri/i;)Z

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_0

    invoke-interface {v9, v8}, Lri/o;->w0(Lri/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v13, p1

    goto/16 :goto_8

    :cond_1
    invoke-interface {v9, v7}, Lri/o;->Q(Lri/j;)Z

    move-result v0

    const/4 v11, 0x1

    if-eqz v0, :cond_4

    invoke-interface {v9, v8}, Lri/o;->Q(Lri/j;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lpi/g;->a:Lpi/g;

    invoke-direct {v0, v9, v7, v8}, Lpi/g;->r(Lri/o;Lri/j;Lri/j;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lpi/u0;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v10, v11

    :cond_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_4
    invoke-interface {v9, v7}, Lri/o;->z0(Lri/j;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {v9, v8}, Lri/o;->z0(Lri/j;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    move-object v13, p1

    goto/16 :goto_7

    :cond_6
    invoke-interface {v9, v8}, Lri/o;->V(Lri/j;)Lri/e;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v9, v0}, Lri/o;->B0(Lri/e;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_8

    :cond_7
    move-object v0, v8

    :cond_8
    invoke-interface {v9, v0}, Lri/o;->a(Lri/j;)Lri/d;

    move-result-object v0

    const/4 v12, 0x0

    if-eqz v0, :cond_9

    invoke-interface {v9, v0}, Lri/o;->p0(Lri/d;)Lri/i;

    move-result-object v1

    goto :goto_0

    :cond_9
    move-object v1, v12

    :goto_0
    if-eqz v0, :cond_f

    if-eqz v1, :cond_f

    invoke-interface {v9, v8}, Lri/o;->t(Lri/j;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v9, v1, v11}, Lri/o;->x(Lri/i;Z)Lri/i;

    move-result-object v1

    :cond_a
    :goto_1
    move-object v13, p1

    move-object v3, v1

    goto :goto_2

    :cond_b
    invoke-interface {v9, v8}, Lri/o;->K(Lri/i;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v9, v1}, Lri/o;->w(Lri/i;)Lri/i;

    move-result-object v1

    goto :goto_1

    :goto_2
    invoke-virtual {p1, v7, v0}, Lpi/u0;->g(Lri/j;Lri/d;)Lpi/u0$b;

    move-result-object v0

    sget-object v1, Lpi/g$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v11, :cond_e

    const/4 v1, 0x2

    if-eq v0, v1, :cond_d

    const/4 v1, 0x3

    if-ne v0, v1, :cond_c

    goto :goto_3

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    sget-object v0, Lpi/g;->a:Lpi/g;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_e
    sget-object v0, Lpi/g;->a:Lpi/g;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_f
    move-object v13, p1

    :cond_10
    :goto_3
    invoke-interface {v9, v8}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v0

    invoke-interface {v9, v0}, Lri/o;->i0(Lri/m;)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v9, v8}, Lri/o;->t(Lri/j;)Z

    invoke-interface {v9, v0}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    :cond_11
    move v10, v11

    goto :goto_4

    :cond_12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lri/i;

    sget-object v0, Lpi/g;->a:Lpi/g;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v6}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :goto_4
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_14
    invoke-interface {v9, v7}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v0

    instance-of v1, v7, Lri/d;

    if-nez v1, :cond_17

    invoke-interface {v9, v0}, Lri/o;->i0(Lri/m;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v9, v0}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_15

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_5

    :cond_15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lri/i;

    instance-of v1, v1, Lri/d;

    if-nez v1, :cond_16

    goto :goto_6

    :cond_17
    :goto_5
    sget-object v0, Lpi/g;->a:Lpi/g;

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v1

    invoke-direct {v0, v1, v8, v7}, Lpi/g;->o(Lri/o;Lri/i;Lri/i;)Lri/n;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-interface {v9, v8}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Lri/o;->E0(Lri/n;Lri/m;)Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_18
    :goto_6
    return-object v12

    :goto_7
    invoke-virtual {p1}, Lpi/u0;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :goto_8
    invoke-virtual {p1}, Lpi/u0;->m()Z

    move-result v0

    if-eqz v0, :cond_19

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_19
    invoke-interface {v9, v7}, Lri/o;->t(Lri/j;)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v9, v8}, Lri/o;->t(Lri/j;)Z

    move-result v0

    if-nez v0, :cond_1a

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_1a
    sget-object v0, Lpi/d;->a:Lpi/d;

    invoke-interface {v9, v7, v10}, Lri/o;->b(Lri/j;Z)Lri/j;

    move-result-object v1

    invoke-interface {v9, v8, v10}, Lri/o;->b(Lri/j;Z)Lri/j;

    move-result-object v2

    invoke-virtual {v0, v9, v1, v2}, Lpi/d;->b(Lri/o;Lri/i;Lri/i;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private final i(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;
    .locals 15

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lri/o;->F(Lri/j;Lri/m;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    invoke-interface {v2, v1}, Lri/o;->Z(Lri/m;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2, v0}, Lri/o;->q0(Lri/j;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-interface {v2, v1}, Lri/o;->X(Lri/m;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2, v0}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lri/o;->O(Lri/m;Lri/m;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lri/b;->FOR_SUBTYPING:Lri/b;

    invoke-interface {v2, v0, v1}, Lri/o;->y(Lri/j;Lri/b;)Lri/j;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_4
    new-instance v3, Lxi/k;

    invoke-direct {v3}, Lxi/k;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->k()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->h()Ljava/util/ArrayDeque;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->i()Ljava/util/Set;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :goto_2
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v6

    const/16 v7, 0x3e8

    if-gt v6, v7, :cond_b

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lri/j;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    sget-object v7, Lri/b;->FOR_SUBTYPING:Lri/b;

    invoke-interface {v2, v6, v7}, Lri/o;->y(Lri/j;Lri/b;)Lri/j;

    move-result-object v7

    if-nez v7, :cond_5

    move-object v7, v6

    :cond_5
    invoke-interface {v2, v7}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v8

    invoke-interface {v2, v8, v1}, Lri/o;->O(Lri/m;Lri/m;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v7, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    goto :goto_3

    :cond_6
    invoke-interface {v2, v7}, Lri/o;->k0(Lri/i;)I

    move-result v8

    if-nez v8, :cond_7

    sget-object v7, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v8

    invoke-interface {v8, v7}, Lri/o;->h0(Lri/j;)Lpi/u0$c;

    move-result-object v7

    :goto_3
    sget-object v8, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    :goto_4
    if-nez v7, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v8

    invoke-interface {v8, v6}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v6

    invoke-interface {v8, v6}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lri/i;

    move-object/from16 v9, p1

    invoke-virtual {v7, v9, v8}, Lpi/u0$c;->a(Lpi/u0;Lri/i;)Lri/j;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    move-object/from16 v9, p1

    goto :goto_2

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Supertypes = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    const/16 v13, 0x3f

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    move-object/from16 v9, p1

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    return-object v3
.end method

.method private final j(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpi/g;->i(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lpi/g;->A(Lpi/u0;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lpi/u0;Lri/i;Lri/i;Z)Z
    .locals 4

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    invoke-virtual {p1, p2}, Lpi/u0;->p(Lri/i;)Lri/i;

    move-result-object p2

    invoke-virtual {p1, p2}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object p2

    invoke-virtual {p1, p3}, Lpi/u0;->p(Lri/i;)Lri/i;

    move-result-object p3

    invoke-virtual {p1, p3}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object p3

    sget-object v1, Lpi/g;->a:Lpi/g;

    invoke-interface {v0, p2}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v2

    invoke-interface {v0, p3}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3}, Lpi/g;->h(Lpi/u0;Lri/j;Lri/j;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, p2, p3, p4}, Lpi/u0;->c(Lri/i;Lri/i;Z)Ljava/lang/Boolean;

    return v0

    :cond_0
    invoke-virtual {p1, p2, p3, p4}, Lpi/u0;->c(Lri/i;Lri/i;Z)Ljava/lang/Boolean;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {v0, p2}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object p2

    invoke-interface {v0, p3}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object p3

    invoke-direct {v1, p1, p2, p3}, Lpi/g;->w(Lpi/u0;Lri/j;Lri/j;)Z

    move-result p1

    return p1
.end method

.method private final o(Lri/o;Lri/i;Lri/i;)Lri/n;
    .locals 6

    invoke-interface {p1, p2}, Lri/o;->k0(Lri/i;)I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_6

    invoke-interface {p1, p2, v2}, Lri/o;->C(Lri/i;I)Lri/l;

    move-result-object v4

    invoke-interface {p1, v4}, Lri/o;->p(Lri/l;)Z

    move-result v5

    if-nez v5, :cond_0

    move-object v3, v4

    :cond_0
    if-eqz v3, :cond_5

    invoke-interface {p1, v3}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {p1, v3}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v4

    invoke-interface {p1, v4}, Lri/o;->o0(Lri/j;)Lri/j;

    move-result-object v4

    invoke-interface {p1, v4}, Lri/o;->g0(Lri/i;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, p3}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v4

    invoke-interface {p1, v4}, Lri/o;->o0(Lri/j;)Lri/j;

    move-result-object v4

    invoke-interface {p1, v4}, Lri/o;->g0(Lri/i;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    invoke-static {v3, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz v4, :cond_3

    invoke-interface {p1, v3}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v4

    invoke-interface {p1, p3}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1, v3, p3}, Lpi/g;->o(Lri/o;Lri/i;Lri/i;)Lri/n;

    move-result-object v3

    if-eqz v3, :cond_5

    return-object v3

    :cond_4
    :goto_2
    invoke-interface {p1, p2}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object p2

    invoke-interface {p1, p2, v2}, Lri/o;->a0(Lri/m;I)Lri/n;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-object v3
.end method

.method private final p(Lpi/u0;Lri/j;)Z
    .locals 13

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    invoke-interface {v0, p2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lri/o;->Z(Lri/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Lri/o;->B(Lri/m;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {v0, p2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v1

    invoke-interface {v0, v1}, Lri/o;->B(Lri/m;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-virtual {p1}, Lpi/u0;->k()V

    invoke-virtual {p1}, Lpi/u0;->h()Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lpi/u0;->i()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v4

    const/16 v5, 0x3e8

    if-gt v4, v5, :cond_7

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lri/j;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0, v4}, Lri/o;->q0(Lri/j;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v5, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    goto :goto_1

    :cond_3
    sget-object v5, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    :goto_1
    sget-object v6, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v6

    invoke-interface {v6, v4}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v4

    invoke-interface {v6, v4}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lri/i;

    invoke-virtual {v5, p1, v6}, Lpi/u0$c;->a(Lpi/u0;Lri/i;)Lri/j;

    move-result-object v6

    invoke-interface {v0, v6}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v0, v7}, Lri/o;->B(Lri/m;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {p1}, Lpi/u0;->e()V

    goto :goto_4

    :cond_6
    invoke-virtual {v1, v6}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Too many supertypes for type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Supertypes = "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p1}, Lpi/u0;->e()V

    const/4 v2, 0x0

    :goto_4
    return v2
.end method

.method private final q(Lri/o;Lri/i;)Z
    .locals 1

    invoke-interface {p1, p2}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v0

    invoke-interface {p1, v0}, Lri/o;->r0(Lri/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lri/o;->c0(Lri/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lri/o;->K(Lri/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lri/o;->L(Lri/i;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lri/o;->z(Lri/i;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final r(Lri/o;Lri/j;Lri/j;)Z
    .locals 3

    invoke-interface {p1, p2}, Lri/o;->V(Lri/j;)Lri/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lri/o;->B0(Lri/e;)Lri/j;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p2

    :cond_1
    invoke-interface {p1, p3}, Lri/o;->V(Lri/j;)Lri/e;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p1, v1}, Lri/o;->B0(Lri/e;)Lri/j;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    move-object v1, p3

    :cond_3
    invoke-interface {p1, v0}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v0

    invoke-interface {p1, v1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    return v2

    :cond_4
    invoke-interface {p1, p2}, Lri/o;->K(Lri/i;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p1, p3}, Lri/o;->K(Lri/i;)Z

    move-result v0

    if-eqz v0, :cond_5

    return v2

    :cond_5
    invoke-interface {p1, p2}, Lri/o;->t(Lri/j;)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1, p3}, Lri/o;->t(Lri/j;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lpi/g;->u(Lpi/u0;Lri/i;Lri/i;Z)Z

    move-result p0

    return p0
.end method

.method private final w(Lpi/u0;Lri/j;Lri/j;)Z
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v3

    sget-boolean v4, Lpi/g;->b:Z

    if-eqz v4, :cond_1

    invoke-interface {v3, v1}, Lri/o;->f(Lri/j;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v3, v1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v4

    invoke-interface {v3, v4}, Lri/o;->i0(Lri/m;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual/range {p1 .. p2}, Lpi/u0;->l(Lri/i;)Z

    move-result v4

    :cond_0
    invoke-interface {v3, v2}, Lri/o;->f(Lri/j;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v2}, Lpi/u0;->l(Lri/i;)Z

    move-result v4

    :cond_1
    sget-object v4, Lpi/c;->a:Lpi/c;

    invoke-virtual {v4, v0, v1, v2}, Lpi/c;->d(Lpi/u0;Lri/j;Lri/j;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    return v5

    :cond_2
    sget-object v4, Lpi/g;->a:Lpi/g;

    invoke-interface {v3, v1}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v6

    invoke-interface {v3, v2}, Lri/o;->F0(Lri/i;)Lri/j;

    move-result-object v7

    invoke-direct {v4, v0, v6, v7}, Lpi/g;->c(Lpi/u0;Lri/j;Lri/j;)Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-static/range {v0 .. v5}, Lpi/u0;->d(Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Ljava/lang/Boolean;

    return v6

    :cond_3
    invoke-interface {v3, v2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v6

    invoke-interface {v3, v1}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v3, v7, v6}, Lri/o;->O(Lri/m;Lri/m;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    invoke-interface {v3, v6}, Lri/o;->q(Lri/m;)I

    move-result v7

    if-nez v7, :cond_4

    return v8

    :cond_4
    invoke-interface {v3, v2}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v3, v7}, Lri/o;->N(Lri/m;)Z

    move-result v7

    if-eqz v7, :cond_5

    return v8

    :cond_5
    invoke-virtual {v4, v0, v1, v6}, Lpi/g;->n(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    const/16 v9, 0xa

    if-le v7, v8, :cond_8

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v7

    instance-of v11, v7, Lri/q;

    if-eqz v11, :cond_6

    check-cast v7, Lri/q;

    goto :goto_0

    :cond_6
    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_8

    invoke-interface {v7}, Lri/q;->d0()Z

    move-result v7

    if-ne v7, v8, :cond_8

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lri/j;

    invoke-virtual {v0, v11}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object v12

    invoke-interface {v3, v12}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v12

    if-nez v12, :cond_7

    goto :goto_2

    :cond_7
    move-object v11, v12

    :goto_2
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lri/j;

    invoke-virtual {v0, v11}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object v12

    invoke-interface {v3, v12}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object v12

    if-nez v12, :cond_9

    goto :goto_4

    :cond_9
    move-object v11, v12

    :goto_4
    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v4

    if-eqz v4, :cond_14

    if-eq v4, v8, :cond_13

    new-instance v4, Lri/a;

    invoke-interface {v3, v6}, Lri/o;->q(Lri/m;)I

    move-result v11

    invoke-direct {v4, v11}, Lri/a;-><init>(I)V

    invoke-interface {v3, v6}, Lri/o;->q(Lri/m;)I

    move-result v11

    move v12, v5

    move v13, v12

    :goto_5
    if-ge v12, v11, :cond_11

    if-nez v13, :cond_c

    invoke-interface {v3, v6, v12}, Lri/o;->a0(Lri/m;I)Lri/n;

    move-result-object v13

    invoke-interface {v3, v13}, Lri/o;->E(Lri/n;)Lri/s;

    move-result-object v13

    sget-object v14, Lri/s;->OUT:Lri/s;

    if-eq v13, v14, :cond_b

    goto :goto_6

    :cond_b
    move v13, v5

    goto :goto_7

    :cond_c
    :goto_6
    move v13, v8

    :goto_7
    if-nez v13, :cond_10

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v7, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_8
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_f

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v5, v16

    check-cast v5, Lri/j;

    invoke-interface {v3, v5, v12}, Lri/o;->M(Lri/j;I)Lri/l;

    move-result-object v9

    if-eqz v9, :cond_e

    invoke-interface {v3, v9}, Lri/o;->v(Lri/l;)Lri/s;

    move-result-object v10

    sget-object v8, Lri/s;->INV:Lri/s;

    if-ne v10, v8, :cond_d

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_9
    if-eqz v9, :cond_e

    invoke-interface {v3, v9}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v8

    if-eqz v8, :cond_e

    invoke-interface {v14, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xa

    goto :goto_8

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Incorrect type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", subType: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", superType: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-interface {v3, v14}, Lri/o;->T(Ljava/util/Collection;)Lri/i;

    move-result-object v5

    invoke-interface {v3, v5}, Lri/o;->s(Lri/i;)Lri/l;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v12, v12, 0x1

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/16 v9, 0xa

    goto/16 :goto_5

    :cond_11
    if-nez v13, :cond_12

    sget-object v1, Lpi/g;->a:Lpi/g;

    invoke-virtual {v1, v0, v4, v2}, Lpi/g;->s(Lpi/u0;Lri/k;Lri/j;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, 0x1

    return v1

    :cond_12
    new-instance v1, Lpi/e;

    invoke-direct {v1, v7, v0, v3, v2}, Lpi/e;-><init>(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;)V

    invoke-virtual {v0, v1}, Lpi/u0;->q(Lmh/l;)Z

    move-result v0

    return v0

    :cond_13
    sget-object v1, Lpi/g;->a:Lpi/g;

    invoke-static {v7}, LZg/v;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lri/j;

    invoke-interface {v3, v4}, Lri/o;->l0(Lri/j;)Lri/k;

    move-result-object v3

    invoke-virtual {v1, v0, v3, v2}, Lpi/g;->s(Lpi/u0;Lri/k;Lri/j;)Z

    move-result v0

    return v0

    :cond_14
    sget-object v2, Lpi/g;->a:Lpi/g;

    invoke-direct {v2, v0, v1}, Lpi/g;->p(Lpi/u0;Lri/j;)Z

    move-result v0

    return v0
.end method

.method private static final x(Ljava/util/Collection;Lpi/u0;Lri/o;Lri/j;Lpi/u0$a;)LYg/J;
    .locals 2

    const-string v0, "$this$runForkingPoint"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lri/j;

    new-instance v1, Lpi/f;

    invoke-direct {v1, p1, p2, v0, p3}, Lpi/f;-><init>(Lpi/u0;Lri/o;Lri/j;Lri/j;)V

    invoke-interface {p4, v1}, Lpi/u0$a;->a(Lmh/a;)V

    goto :goto_0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final y(Lpi/u0;Lri/o;Lri/j;Lri/j;)Z
    .locals 1

    sget-object v0, Lpi/g;->a:Lpi/g;

    invoke-interface {p1, p2}, Lri/o;->l0(Lri/j;)Lri/k;

    move-result-object p1

    invoke-virtual {v0, p0, p1, p3}, Lpi/g;->s(Lpi/u0;Lri/k;Lri/j;)Z

    move-result p0

    return p0
.end method

.method private final z(Lri/o;Lri/i;Lri/i;Lri/m;)Z
    .locals 1

    invoke-interface {p1, p2}, Lri/o;->c(Lri/i;)Lri/j;

    move-result-object p2

    instance-of p4, p2, Lri/d;

    const/4 v0, 0x0

    if-eqz p4, :cond_2

    check-cast p2, Lri/d;

    invoke-interface {p1, p2}, Lri/o;->k(Lri/d;)Z

    move-result p4

    if-nez p4, :cond_2

    invoke-interface {p1, p2}, Lri/o;->A0(Lri/d;)Lri/c;

    move-result-object p4

    invoke-interface {p1, p4}, Lri/o;->P(Lri/c;)Lri/l;

    move-result-object p4

    invoke-interface {p1, p4}, Lri/o;->p(Lri/l;)Z

    move-result p4

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lri/o;->y0(Lri/d;)Lri/b;

    move-result-object p2

    sget-object p4, Lri/b;->FOR_SUBTYPING:Lri/b;

    if-eq p2, p4, :cond_1

    return v0

    :cond_1
    invoke-interface {p1, p3}, Lri/o;->f0(Lri/i;)Lri/m;

    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public final l(Lri/s;Lri/s;)Lri/s;
    .locals 1

    const-string v0, "declared"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "useSite"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lri/s;->INV:Lri/s;

    if-ne p1, v0, :cond_0

    return-object p2

    :cond_0
    if-ne p2, v0, :cond_1

    return-object p1

    :cond_1
    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final m(Lpi/u0;Lri/i;Lri/i;)Z
    .locals 11

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "a"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/u0;->j()Lri/o;

    move-result-object v0

    const/4 v1, 0x1

    if-ne p2, p3, :cond_0

    return v1

    :cond_0
    sget-object v9, Lpi/g;->a:Lpi/g;

    invoke-direct {v9, v0, p2}, Lpi/g;->q(Lri/o;Lri/i;)Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_5

    invoke-direct {v9, v0, p3}, Lpi/g;->q(Lri/o;Lri/i;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, p2}, Lpi/u0;->p(Lri/i;)Lri/i;

    move-result-object v2

    invoke-virtual {p1, v2}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object v2

    invoke-virtual {p1, p3}, Lpi/u0;->p(Lri/i;)Lri/i;

    move-result-object v3

    invoke-virtual {p1, v3}, Lpi/u0;->o(Lri/i;)Lri/i;

    move-result-object v3

    invoke-interface {v0, v2}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object v4

    invoke-interface {v0, v2}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v5

    invoke-interface {v0, v3}, Lri/o;->f0(Lri/i;)Lri/m;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Lri/o;->O(Lri/m;Lri/m;)Z

    move-result v5

    if-nez v5, :cond_1

    return v10

    :cond_1
    invoke-interface {v0, v4}, Lri/o;->k0(Lri/i;)I

    move-result v5

    if-nez v5, :cond_5

    invoke-interface {v0, v2}, Lri/o;->J(Lri/i;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0, v3}, Lri/o;->J(Lri/i;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v0, v4}, Lri/o;->t(Lri/j;)Z

    move-result p1

    invoke-interface {v0, v3}, Lri/o;->b0(Lri/i;)Lri/j;

    move-result-object p2

    invoke-interface {v0, p2}, Lri/o;->t(Lri/j;)Z

    move-result p2

    if-ne p1, p2, :cond_3

    goto :goto_0

    :cond_3
    move v1, v10

    :cond_4
    :goto_0
    return v1

    :cond_5
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v8}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v9

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    invoke-static/range {v2 .. v8}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    :cond_6
    move v1, v10

    :goto_1
    return v1
.end method

.method public final n(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "state"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subType"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "superConstructor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v3

    invoke-interface {v3, v1}, Lri/o;->q0(Lri/j;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v3, Lpi/g;->a:Lpi/g;

    invoke-direct {v3, v0, v1, v2}, Lpi/g;->j(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {v3, v2}, Lri/o;->Z(Lri/m;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3, v2}, Lri/o;->D(Lri/m;)Z

    move-result v4

    if-nez v4, :cond_1

    sget-object v3, Lpi/g;->a:Lpi/g;

    invoke-direct {v3, v0, v1, v2}, Lpi/g;->i(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v4, Lxi/k;

    invoke-direct {v4}, Lxi/k;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->k()V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->h()Ljava/util/ArrayDeque;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->i()Ljava/util/Set;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7

    const/16 v8, 0x3e8

    if-gt v7, v8, :cond_6

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lri/j;

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v3, v7}, Lri/o;->q0(Lri/j;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v4, v7}, Lxi/k;->add(Ljava/lang/Object;)Z

    sget-object v8, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    goto :goto_1

    :cond_3
    sget-object v8, Lpi/u0$c$b;->a:Lpi/u0$c$b;

    :goto_1
    sget-object v9, Lpi/u0$c$c;->a:Lpi/u0$c$c;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v9

    invoke-interface {v9, v7}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v7

    invoke-interface {v9, v7}, Lri/o;->x0(Lri/m;)Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lri/i;

    invoke-virtual {v8, v0, v9}, Lpi/u0$c;->a(Lpi/u0;Lri/i;)Lri/j;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Too many supertypes for type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Supertypes = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const/16 v14, 0x3f

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lpi/u0;->e()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lri/j;

    sget-object v5, Lpi/g;->a:Lpi/g;

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v5, v0, v4, v2}, Lpi/g;->j(Lpi/u0;Lri/j;Lri/m;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_4

    :cond_8
    return-object v1
.end method

.method public final s(Lpi/u0;Lri/k;Lri/j;)Z
    .locals 16

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    const-string v0, "<this>"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capturedSubArguments"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->j()Lri/o;

    move-result-object v10

    invoke-interface {v10, v9}, Lri/o;->d(Lri/j;)Lri/m;

    move-result-object v11

    invoke-interface {v10, v8}, Lri/o;->l(Lri/k;)I

    move-result v0

    invoke-interface {v10, v11}, Lri/o;->q(Lri/m;)I

    move-result v12

    const/4 v13, 0x0

    if-ne v0, v12, :cond_9

    invoke-interface {v10, v9}, Lri/o;->k0(Lri/i;)I

    move-result v1

    if-eq v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    move v14, v13

    :goto_0
    const/4 v0, 0x1

    if-ge v14, v12, :cond_8

    invoke-interface {v10, v9, v14}, Lri/o;->C(Lri/i;I)Lri/l;

    move-result-object v1

    invoke-interface {v10, v1}, Lri/o;->p(Lri/l;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v10, v1}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v3

    invoke-interface {v10, v8, v14}, Lri/o;->U(Lri/k;I)Lri/l;

    move-result-object v2

    invoke-interface {v10, v2}, Lri/o;->v(Lri/l;)Lri/s;

    sget-object v4, Lri/s;->INV:Lri/s;

    invoke-interface {v10, v2}, Lri/o;->j(Lri/l;)Lri/i;

    move-result-object v5

    sget-object v2, Lpi/g;->a:Lpi/g;

    invoke-interface {v10, v11, v14}, Lri/o;->a0(Lri/m;I)Lri/n;

    move-result-object v6

    invoke-interface {v10, v6}, Lri/o;->E(Lri/n;)Lri/s;

    move-result-object v6

    invoke-interface {v10, v1}, Lri/o;->v(Lri/l;)Lri/s;

    move-result-object v1

    invoke-virtual {v2, v6, v1}, Lpi/g;->l(Lri/s;Lri/s;)Lri/s;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lpi/u0;->m()Z

    move-result v0

    return v0

    :cond_1
    if-ne v1, v4, :cond_2

    invoke-direct {v2, v10, v5, v3, v11}, Lpi/g;->z(Lri/o;Lri/i;Lri/i;Lri/m;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-direct {v2, v10, v3, v5, v11}, Lpi/g;->z(Lri/o;Lri/i;Lri/i;Lri/m;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lpi/u0;->a(Lpi/u0;)I

    move-result v4

    const/16 v6, 0x64

    if-gt v4, v6, :cond_6

    invoke-static/range {p1 .. p1}, Lpi/u0;->a(Lpi/u0;)I

    move-result v4

    add-int/2addr v4, v0

    invoke-static {v7, v4}, Lpi/u0;->b(Lpi/u0;I)V

    sget-object v4, Lpi/g$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v4, v1

    if-eq v1, v0, :cond_5

    const/4 v0, 0x2

    if-eq v1, v0, :cond_4

    const/4 v0, 0x3

    if-ne v1, v0, :cond_3

    const/16 v6, 0x8

    const/4 v15, 0x0

    const/4 v4, 0x0

    move-object v0, v2

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v5

    move v5, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    const/16 v6, 0x8

    const/4 v15, 0x0

    const/4 v4, 0x0

    move-object v0, v2

    move-object/from16 v1, p1

    move-object v2, v5

    move v5, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_5
    invoke-virtual {v2, v7, v5, v3}, Lpi/g;->m(Lpi/u0;Lri/i;Lri/i;)Z

    move-result v0

    :goto_1
    invoke-static/range {p1 .. p1}, Lpi/u0;->a(Lpi/u0;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v7, v1}, Lpi/u0;->b(Lpi/u0;I)V

    if-nez v0, :cond_7

    return v13

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Arguments depth is too high. Some related argument: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_0

    :cond_8
    return v0

    :cond_9
    :goto_3
    return v13
.end method

.method public final t(Lpi/u0;Lri/i;Lri/i;)Z
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lpi/g;->v(Lpi/g;Lpi/u0;Lri/i;Lri/i;ZILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final u(Lpi/u0;Lri/i;Lri/i;Z)Z
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "superType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p2, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1, p2, p3}, Lpi/u0;->f(Lri/i;Lri/i;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lpi/g;->k(Lpi/u0;Lri/i;Lri/i;Z)Z

    move-result p1

    return p1
.end method
