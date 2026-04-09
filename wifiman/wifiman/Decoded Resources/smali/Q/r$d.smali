.class final LQ/r$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r;->b(ILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/p;

.field final synthetic c:Lmh/p;

.field final synthetic d:I

.field final synthetic e:Lz/f0;

.field final synthetic f:Lmh/p;

.field final synthetic g:Lmh/q;


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;Lmh/p;ILz/f0;Lmh/p;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LQ/r$d;->a:Lmh/p;

    iput-object p2, p0, LQ/r$d;->b:Lmh/p;

    iput-object p3, p0, LQ/r$d;->c:Lmh/p;

    iput p4, p0, LQ/r$d;->d:I

    iput-object p5, p0, LQ/r$d;->e:Lz/f0;

    iput-object p6, p0, LQ/r$d;->f:Lmh/p;

    iput-object p7, p0, LQ/r$d;->g:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/U;J)LC0/D;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v16

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v17

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide/from16 v1, p2

    invoke-static/range {v1 .. v8}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v9

    sget-object v1, LQ/s;->TopBar:LQ/s;

    iget-object v2, v0, LQ/r$d;->a:Lmh/p;

    invoke-interface {v15, v1, v2}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x0

    move v3, v12

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4, v9, v10}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    invoke-interface {v11, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v13, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v11}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    if-gt v13, v4, :cond_3

    move v5, v13

    :goto_1
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroidx/compose/ui/layout/t;

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    if-ge v3, v7, :cond_2

    move-object v1, v6

    move v3, v7

    :cond_2
    if-eq v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v1, Landroidx/compose/ui/layout/t;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    move v5, v1

    goto :goto_3

    :cond_4
    move v5, v12

    :goto_3
    sget-object v1, LQ/s;->Snackbar:LQ/s;

    iget-object v3, v0, LQ/r$d;->b:Lmh/p;

    invoke-interface {v15, v1, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, LQ/r$d;->e:Lz/f0;

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v6, v12

    :goto_4
    if-ge v6, v4, :cond_5

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LC0/B;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v8

    invoke-interface {v3, v15, v8}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v8

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v3, v15, v2}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result v2

    invoke-interface {v3, v15}, Lz/f0;->b(LY0/d;)I

    move-result v13

    neg-int v8, v8

    sub-int/2addr v8, v2

    neg-int v2, v13

    invoke-static {v9, v10, v8, v2}, LY0/c;->n(JII)J

    move-result-wide v12

    invoke-interface {v7, v12, v13}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    goto :goto_4

    :cond_5
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v1, v2

    check-cast v1, Landroidx/compose/ui/layout/t;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    invoke-static {v14}, LZg/v;->n(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_9

    move-object v4, v2

    move v2, v1

    const/4 v1, 0x1

    :goto_5
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroidx/compose/ui/layout/t;

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    if-ge v2, v7, :cond_7

    move-object v4, v6

    move v2, v7

    :cond_7
    if-eq v1, v3, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_8
    move-object v2, v4

    :cond_9
    :goto_6
    check-cast v2, Landroidx/compose/ui/layout/t;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    goto :goto_7

    :cond_a
    const/4 v1, 0x0

    :goto_7
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v3, 0x0

    goto :goto_9

    :cond_b
    const/4 v2, 0x0

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-static {v14}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    const/4 v6, 0x1

    if-gt v6, v4, :cond_e

    move-object v6, v3

    move v3, v2

    const/4 v2, 0x1

    :goto_8
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/layout/t;

    invoke-virtual {v8}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v8

    if-ge v3, v8, :cond_c

    move-object v6, v7

    move v3, v8

    :cond_c
    if-eq v2, v4, :cond_d

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_d
    move-object v3, v6

    :cond_e
    :goto_9
    check-cast v3, Landroidx/compose/ui/layout/t;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    move v12, v2

    goto :goto_a

    :cond_f
    const/4 v12, 0x0

    :goto_a
    sget-object v2, LQ/s;->Fab:LQ/s;

    iget-object v3, v0, LQ/r$d;->c:Lmh/p;

    invoke-interface {v15, v2, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, LQ/r$d;->e:Lz/f0;

    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v4, :cond_12

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LC0/B;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v8

    invoke-interface {v3, v15, v8}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v8

    move-object/from16 v19, v2

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v3, v15, v2}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result v2

    move/from16 v20, v4

    invoke-interface {v3, v15}, Lz/f0;->b(LY0/d;)I

    move-result v4

    neg-int v8, v8

    sub-int/2addr v8, v2

    neg-int v2, v4

    move-object v4, v3

    invoke-static {v9, v10, v8, v2}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {v7, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_c

    :cond_10
    const/4 v2, 0x0

    :goto_c
    if-eqz v2, :cond_11

    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v6, v6, 0x1

    move-object v3, v4

    move-object/from16 v2, v19

    move/from16 v4, v20

    goto :goto_b

    :cond_12
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_20

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v3, 0x0

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-static {v13}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    const/4 v6, 0x1

    if-gt v6, v4, :cond_16

    move-object v6, v3

    move v3, v2

    const/4 v2, 0x1

    :goto_d
    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Landroidx/compose/ui/layout/t;

    invoke-virtual {v8}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v8

    if-ge v3, v8, :cond_14

    move-object v6, v7

    move v3, v8

    :cond_14
    if-eq v2, v4, :cond_15

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_15
    move-object v3, v6

    :cond_16
    :goto_e
    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_17

    const/4 v4, 0x0

    goto :goto_11

    :cond_17
    const/4 v3, 0x0

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v13}, LZg/v;->n(Ljava/util/List;)I

    move-result v6

    const/4 v7, 0x1

    if-gt v7, v6, :cond_1a

    move-object v7, v4

    move v4, v3

    const/4 v3, 0x1

    :goto_f
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v19, v8

    check-cast v19, Landroidx/compose/ui/layout/t;

    move-object/from16 v20, v7

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    if-ge v4, v7, :cond_18

    move v4, v7

    move-object v7, v8

    goto :goto_10

    :cond_18
    move-object/from16 v7, v20

    :goto_10
    if-eq v3, v6, :cond_19

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_19
    move-object v4, v7

    :cond_1a
    :goto_11
    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v4, Landroidx/compose/ui/layout/t;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    iget v4, v0, LQ/r$d;->d:I

    sget-object v6, LQ/k;->a:LQ/k$a;

    invoke-virtual {v6}, LQ/k$a;->c()I

    move-result v7

    invoke-static {v4, v7}, LQ/k;->e(II)Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v6, LY0/t;->Ltr:LY0/t;

    if-ne v4, v6, :cond_1b

    invoke-static {}, LQ/r;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_14

    :cond_1b
    invoke-static {}, LQ/r;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/d;->x1(F)I

    move-result v4

    :goto_12
    sub-int v4, v16, v4

    sub-int/2addr v4, v2

    goto :goto_14

    :cond_1c
    invoke-virtual {v6}, LQ/k$a;->a()I

    move-result v7

    invoke-static {v4, v7}, LQ/k;->e(II)Z

    move-result v7

    if-eqz v7, :cond_1d

    const/4 v4, 0x1

    goto :goto_13

    :cond_1d
    invoke-virtual {v6}, LQ/k$a;->b()I

    move-result v6

    invoke-static {v4, v6}, LQ/k;->e(II)Z

    move-result v4

    :goto_13
    if-eqz v4, :cond_1f

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v6, LY0/t;->Ltr:LY0/t;

    if-ne v4, v6, :cond_1e

    invoke-static {}, LQ/r;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_12

    :cond_1e
    invoke-static {}, LQ/r;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_14

    :cond_1f
    sub-int v4, v16, v2

    div-int/lit8 v4, v4, 0x2

    :goto_14
    new-instance v6, LQ/j;

    invoke-direct {v6, v4, v2, v3}, LQ/j;-><init>(III)V

    move-object/from16 v19, v6

    goto :goto_15

    :cond_20
    const/16 v19, 0x0

    :goto_15
    sget-object v2, LQ/s;->BottomBar:LQ/s;

    new-instance v3, LQ/r$d$c;

    iget-object v4, v0, LQ/r$d;->f:Lmh/p;

    invoke-direct {v3, v4}, LQ/r$d$c;-><init>(Lmh/p;)V

    const v4, -0x7ff00d2f

    const/4 v6, 0x1

    invoke-static {v4, v6, v3}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v3

    invoke-interface {v15, v2, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v2

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_16
    if-ge v4, v3, :cond_21

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/B;

    invoke-interface {v6, v9, v10}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v6

    invoke-interface {v8, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_21
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_22

    const/4 v2, 0x0

    goto :goto_18

    :cond_22
    const/4 v7, 0x0

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v8}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    const/4 v6, 0x1

    if-gt v6, v4, :cond_24

    const/4 v6, 0x1

    :goto_17
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v20, v18

    check-cast v20, Landroidx/compose/ui/layout/t;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    if-ge v3, v7, :cond_23

    move v3, v7

    move-object/from16 v2, v18

    :cond_23
    if-eq v6, v4, :cond_24

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    goto :goto_17

    :cond_24
    :goto_18
    check-cast v2, Landroidx/compose/ui/layout/t;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_19

    :cond_25
    const/16 v18, 0x0

    :goto_19
    if-eqz v19, :cond_28

    iget v2, v0, LQ/r$d;->d:I

    iget-object v3, v0, LQ/r$d;->e:Lz/f0;

    if-eqz v18, :cond_27

    sget-object v4, LQ/k;->a:LQ/k$a;

    invoke-virtual {v4}, LQ/k$a;->b()I

    move-result v4

    invoke-static {v2, v4}, LQ/k;->e(II)Z

    move-result v2

    if-eqz v2, :cond_26

    goto :goto_1b

    :cond_26
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual/range {v19 .. v19}, LQ/j;->a()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, LQ/r;->d()F

    move-result v3

    invoke-interface {v15, v3}, LY0/d;->x1(F)I

    move-result v3

    :goto_1a
    add-int/2addr v2, v3

    goto :goto_1c

    :cond_27
    :goto_1b
    invoke-virtual/range {v19 .. v19}, LQ/j;->a()I

    move-result v2

    invoke-static {}, LQ/r;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/d;->x1(F)I

    move-result v4

    add-int/2addr v2, v4

    invoke-interface {v3, v15}, Lz/f0;->b(LY0/d;)I

    move-result v3

    goto :goto_1a

    :goto_1c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_1d

    :cond_28
    const/16 v20, 0x0

    :goto_1d
    if-eqz v1, :cond_2b

    if-eqz v20, :cond_29

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1e

    :cond_29
    if-eqz v18, :cond_2a

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1e

    :cond_2a
    iget-object v2, v0, LQ/r$d;->e:Lz/f0;

    invoke-interface {v2, v15}, Lz/f0;->b(LY0/d;)I

    move-result v2

    :goto_1e
    add-int/2addr v1, v2

    move/from16 v22, v1

    goto :goto_1f

    :cond_2b
    const/16 v22, 0x0

    :goto_1f
    sget-object v7, LQ/s;->MainContent:LQ/s;

    new-instance v6, LQ/r$d$b;

    iget-object v2, v0, LQ/r$d;->e:Lz/f0;

    iget-object v4, v0, LQ/r$d;->g:Lmh/q;

    move-object v1, v6

    move-object/from16 v3, p1

    move-object/from16 v23, v4

    move-object v4, v11

    move-object/from16 p2, v13

    move-object v13, v6

    move-object v6, v8

    move/from16 v24, v12

    const/16 v21, 0x0

    move-object v12, v7

    move-object/from16 v7, v18

    move-object/from16 v25, v8

    move-object/from16 v8, v23

    invoke-direct/range {v1 .. v8}, LQ/r$d$b;-><init>(Lz/f0;LC0/U;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Lmh/q;)V

    const v1, -0x48526920

    const/4 v2, 0x1

    invoke-static {v1, v2, v13}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v1

    invoke-interface {v15, v12, v1}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v12, v21

    :goto_20
    if-ge v12, v3, :cond_2c

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4, v9, v10}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_20

    :cond_2c
    new-instance v21, LQ/r$d$a;

    iget-object v9, v0, LQ/r$d;->e:Lz/f0;

    move-object/from16 v1, v21

    move-object v3, v11

    move-object v4, v14

    move-object/from16 v5, v25

    move-object/from16 v6, v19

    move/from16 v7, v16

    move/from16 v8, v24

    move-object/from16 v10, p1

    move/from16 v11, v17

    move/from16 v12, v22

    move-object/from16 v14, p2

    move-object/from16 v13, v18

    move-object/from16 v15, v20

    invoke-direct/range {v1 .. v15}, LQ/r$d$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LQ/j;IILz/f0;LC0/U;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move/from16 v2, v16

    move/from16 v3, v17

    move-object/from16 v5, v21

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LQ/r$d;->a(LC0/U;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
