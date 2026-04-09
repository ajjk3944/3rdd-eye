.class final LN/C0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C0;->c(ZILmh/p;Lmh/q;Lmh/p;Lmh/p;Lz/f0;Lmh/p;LT/l;I)V
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

.field final synthetic e:Z

.field final synthetic f:Lz/f0;

.field final synthetic g:Lmh/p;

.field final synthetic h:Lmh/q;


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;Lmh/p;IZLz/f0;Lmh/p;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LN/C0$f;->a:Lmh/p;

    iput-object p2, p0, LN/C0$f;->b:Lmh/p;

    iput-object p3, p0, LN/C0$f;->c:Lmh/p;

    iput p4, p0, LN/C0$f;->d:I

    iput-boolean p5, p0, LN/C0$f;->e:Z

    iput-object p6, p0, LN/C0$f;->f:Lz/f0;

    iput-object p7, p0, LN/C0$f;->g:Lmh/p;

    iput-object p8, p0, LN/C0$f;->h:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/U;J)LC0/D;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v9

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v22

    const/16 v16, 0xa

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-wide/from16 v10, p2

    invoke-static/range {v10 .. v17}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v10

    sget-object v1, LN/D0;->TopBar:LN/D0;

    iget-object v2, v0, LN/C0$f;->a:Lmh/p;

    invoke-interface {v8, v1, v2}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v3, v13

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/B;

    invoke-interface {v4, v10, v11}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v4

    invoke-interface {v12, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v14, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v12}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    if-gt v14, v4, :cond_3

    move v5, v14

    :goto_1
    invoke-interface {v12, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

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

    move/from16 v16, v1

    goto :goto_3

    :cond_4
    move/from16 v16, v13

    :goto_3
    sget-object v1, LN/D0;->Snackbar:LN/D0;

    iget-object v3, v0, LN/C0$f;->b:Lmh/p;

    invoke-interface {v8, v1, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, LN/C0$f;->f:Lz/f0;

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v5, v13

    :goto_4
    if-ge v5, v4, :cond_5

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/B;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    invoke-interface {v3, v8, v7}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v3, v8, v2}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result v2

    invoke-interface {v3, v8}, Lz/f0;->b(LY0/d;)I

    move-result v14

    neg-int v7, v7

    sub-int/2addr v7, v2

    neg-int v2, v14

    invoke-static {v10, v11, v7, v2}, LY0/c;->n(JII)J

    move-result-wide v13

    invoke-interface {v6, v13, v14}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto :goto_4

    :cond_5
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v1, v2

    check-cast v1, Landroidx/compose/ui/layout/t;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v1

    invoke-static {v15}, LZg/v;->n(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_9

    move-object v4, v2

    move v2, v1

    const/4 v1, 0x1

    :goto_5
    invoke-interface {v15, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/layout/t;

    invoke-virtual {v6}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v6

    if-ge v2, v6, :cond_7

    move-object v4, v5

    move v2, v6

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
    sget-object v2, LN/D0;->Fab:LN/D0;

    iget-object v3, v0, LN/C0$f;->c:Lmh/p;

    invoke-interface {v8, v2, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, LN/C0$f;->f:Lz/f0;

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v4, :cond_b

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/B;

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    invoke-interface {v3, v8, v7}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v13

    invoke-interface {v3, v8, v13}, Lz/f0;->a(LY0/d;LY0/t;)I

    move-result v13

    move-object/from16 v18, v2

    invoke-interface {v3, v8}, Lz/f0;->b(LY0/d;)I

    move-result v2

    neg-int v7, v7

    sub-int/2addr v7, v13

    neg-int v2, v2

    move-object v13, v3

    invoke-static {v10, v11, v7, v2}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {v6, v2, v3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    move-object v3, v13

    move-object/from16 v2, v18

    goto :goto_8

    :cond_b
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x0

    goto :goto_a

    :cond_c
    const/4 v2, 0x0

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    invoke-static {v14}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    const/4 v5, 0x1

    if-gt v5, v4, :cond_f

    move-object v5, v3

    move v3, v2

    const/4 v2, 0x1

    :goto_9
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Landroidx/compose/ui/layout/t;

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v7

    if-ge v3, v7, :cond_d

    move-object v5, v6

    move v3, v7

    :cond_d
    if-eq v2, v4, :cond_e

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_e
    move-object v3, v5

    :cond_f
    :goto_a
    check-cast v3, Landroidx/compose/ui/layout/t;

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    goto :goto_b

    :cond_10
    const/4 v2, 0x0

    :goto_b
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_11

    const/4 v4, 0x0

    goto :goto_d

    :cond_11
    const/4 v3, 0x0

    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v14}, LZg/v;->n(Ljava/util/List;)I

    move-result v5

    const/4 v6, 0x1

    if-gt v6, v5, :cond_14

    move-object v6, v4

    move v4, v3

    const/4 v3, 0x1

    :goto_c
    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Landroidx/compose/ui/layout/t;

    invoke-virtual {v13}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v13

    if-ge v4, v13, :cond_12

    move-object v6, v7

    move v4, v13

    :cond_12
    if-eq v3, v5, :cond_13

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_13
    move-object v4, v6

    :cond_14
    :goto_d
    check-cast v4, Landroidx/compose/ui/layout/t;

    if-eqz v4, :cond_15

    invoke-virtual {v4}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    goto :goto_e

    :cond_15
    const/4 v3, 0x0

    :goto_e
    if-eqz v2, :cond_1a

    if-eqz v3, :cond_1a

    iget v4, v0, LN/C0$f;->d:I

    sget-object v5, LN/P;->a:LN/P$a;

    invoke-virtual {v5}, LN/P$a;->b()I

    move-result v6

    invoke-static {v4, v6}, LN/P;->d(II)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v5, LY0/t;->Ltr:LY0/t;

    if-ne v4, v5, :cond_16

    invoke-static {}, LN/C0;->e()F

    move-result v4

    invoke-interface {v8, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_10

    :cond_16
    invoke-static {}, LN/C0;->e()F

    move-result v4

    invoke-interface {v8, v4}, LY0/d;->x1(F)I

    move-result v4

    :goto_f
    sub-int v4, v9, v4

    sub-int/2addr v4, v2

    goto :goto_10

    :cond_17
    invoke-virtual {v5}, LN/P$a;->a()I

    move-result v5

    invoke-static {v4, v5}, LN/P;->d(II)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface/range {p1 .. p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v5, LY0/t;->Ltr:LY0/t;

    if-ne v4, v5, :cond_18

    invoke-static {}, LN/C0;->e()F

    move-result v4

    invoke-interface {v8, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_f

    :cond_18
    invoke-static {}, LN/C0;->e()F

    move-result v4

    invoke-interface {v8, v4}, LY0/d;->x1(F)I

    move-result v4

    goto :goto_10

    :cond_19
    sub-int v4, v9, v2

    div-int/lit8 v4, v4, 0x2

    :goto_10
    new-instance v5, LN/O;

    iget-boolean v6, v0, LN/C0$f;->e:Z

    invoke-direct {v5, v6, v4, v2, v3}, LN/O;-><init>(ZIII)V

    move-object v13, v5

    goto :goto_11

    :cond_1a
    const/4 v13, 0x0

    :goto_11
    sget-object v2, LN/D0;->BottomBar:LN/D0;

    new-instance v3, LN/C0$f$c;

    iget-object v4, v0, LN/C0$f;->g:Lmh/p;

    invoke-direct {v3, v13, v4}, LN/C0$f$c;-><init>(LN/O;Lmh/p;)V

    const v4, 0x1947131e

    const/4 v5, 0x1

    invoke-static {v4, v5, v3}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v3

    invoke-interface {v8, v2, v3}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v2

    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_12
    if-ge v4, v3, :cond_1b

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC0/B;

    invoke-interface {v5, v10, v11}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_1b
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_14

    :cond_1c
    const/4 v6, 0x0

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    invoke-static {v7}, LZg/v;->n(Ljava/util/List;)I

    move-result v4

    const/4 v5, 0x1

    if-gt v5, v4, :cond_1e

    const/4 v5, 0x1

    :goto_13
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v17

    check-cast v18, Landroidx/compose/ui/layout/t;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v6

    if-ge v3, v6, :cond_1d

    move v3, v6

    move-object/from16 v2, v17

    :cond_1d
    if-eq v5, v4, :cond_1e

    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x0

    goto :goto_13

    :cond_1e
    :goto_14
    check-cast v2, Landroidx/compose/ui/layout/t;

    if-eqz v2, :cond_1f

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_15

    :cond_1f
    const/16 v20, 0x0

    :goto_15
    if-eqz v13, :cond_22

    iget-object v2, v0, LN/C0$f;->f:Lz/f0;

    iget-boolean v3, v0, LN/C0$f;->e:Z

    if-nez v20, :cond_20

    invoke-virtual {v13}, LN/O;->a()I

    move-result v3

    invoke-static {}, LN/C0;->e()F

    move-result v4

    invoke-interface {v8, v4}, LY0/d;->x1(F)I

    move-result v4

    add-int/2addr v3, v4

    invoke-interface {v2, v8}, Lz/f0;->b(LY0/d;)I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_17

    :cond_20
    if-eqz v3, :cond_21

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v13}, LN/O;->a()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    :goto_16
    add-int/2addr v3, v2

    goto :goto_17

    :cond_21
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v13}, LN/O;->a()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, LN/C0;->e()F

    move-result v3

    invoke-interface {v8, v3}, LY0/d;->x1(F)I

    move-result v3

    goto :goto_16

    :goto_17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_18

    :cond_22
    const/16 v21, 0x0

    :goto_18
    if-eqz v1, :cond_25

    if-eqz v21, :cond_23

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_19

    :cond_23
    if-eqz v20, :cond_24

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_19

    :cond_24
    iget-object v2, v0, LN/C0$f;->f:Lz/f0;

    invoke-interface {v2, v8}, Lz/f0;->b(LY0/d;)I

    move-result v2

    :goto_19
    add-int/2addr v1, v2

    move/from16 v18, v1

    goto :goto_1a

    :cond_25
    const/16 v18, 0x0

    :goto_1a
    sub-int v17, v22, v16

    sget-object v6, LN/D0;->MainContent:LN/D0;

    new-instance v5, LN/C0$f$b;

    iget-object v2, v0, LN/C0$f;->f:Lz/f0;

    iget-object v4, v0, LN/C0$f;->h:Lmh/q;

    move-object v1, v5

    move-object/from16 v3, p1

    move-object/from16 v23, v4

    move-object v4, v12

    move-object v0, v5

    move-object v5, v7

    move-object/from16 p2, v13

    const/16 v19, 0x0

    move-object v13, v6

    move-object/from16 v6, v20

    move-object/from16 v31, v7

    move-object/from16 v7, v23

    invoke-direct/range {v1 .. v7}, LN/C0$f$b;-><init>(Lz/f0;LC0/U;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lmh/q;)V

    const v1, -0x22056fd1

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    invoke-interface {v8, v13, v0}, LC0/U;->Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v13, v19

    :goto_1b
    if-ge v13, v2, :cond_26

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC0/B;

    const/16 v29, 0x7

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-wide/from16 v23, v10

    move/from16 v28, v17

    invoke-static/range {v23 .. v30}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_1b

    :cond_26
    new-instance v5, LN/C0$f$a;

    move-object v10, v5

    move-object v11, v1

    move-object/from16 v0, p2

    move-object v13, v15

    move-object v1, v14

    move-object/from16 v14, v31

    move-object v15, v1

    move/from16 v17, v22

    move-object/from16 v19, v20

    move-object/from16 v20, v0

    invoke-direct/range {v10 .. v21}, LN/C0$f$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIILjava/lang/Integer;LN/O;Ljava/lang/Integer;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move v2, v9

    move/from16 v3, v22

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LC0/U;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LN/C0$f;->a(LC0/U;J)LC0/D;

    move-result-object p1

    return-object p1
.end method
