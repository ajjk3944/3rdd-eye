.class public abstract Ljj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p8

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x8d39294

    move-object/from16 v3, p7

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_0

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_1

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    move/from16 v6, p4

    :goto_2
    and-int/lit8 v9, p9, 0x20

    const/4 v10, 0x0

    if-eqz v9, :cond_3

    move-object v9, v10

    goto :goto_3

    :cond_3
    move-object/from16 v9, p5

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v11

    if-eqz v11, :cond_4

    const/4 v11, -0x1

    const-string v12, "org.burnoutcrew.reorderable.ReorderableItem (ReorderableItem.kt:49)"

    invoke-static {v0, v8, v11, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    if-eqz v9, :cond_5

    invoke-virtual/range {p0 .. p0}, Ljj/i;->o()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_5
    invoke-virtual/range {p0 .. p0}, Ljj/i;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_4
    const/high16 v11, 0x3f800000    # 1.0f

    if-eqz v0, :cond_6

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v10, v11}, Lf0/l;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    new-instance v11, Ljj/e$b;

    invoke-direct {v11, v6, v1}, Ljj/e$b;-><init>(ZLjj/i;)V

    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v10

    goto :goto_6

    :cond_6
    if-eqz v9, :cond_8

    invoke-virtual/range {p0 .. p0}, Ljj/i;->m()Ljj/b;

    move-result-object v12

    invoke-interface {v12}, Ljj/b;->getPosition()Ljj/d;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Ljj/d;->a()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :cond_7
    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    goto :goto_5

    :cond_8
    invoke-virtual/range {p0 .. p0}, Ljj/i;->m()Ljj/b;

    move-result-object v12

    invoke-interface {v12}, Ljj/b;->getPosition()Ljj/d;

    move-result-object v12

    if-eqz v12, :cond_9

    invoke-virtual {v12}, Ljj/d;->b()Ljava/lang/Object;

    move-result-object v10

    :cond_9
    invoke-static {v2, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    :goto_5
    if-eqz v10, :cond_a

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v10, v11}, Lf0/l;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    new-instance v11, Ljj/e$c;

    invoke-direct {v11, v6, v1}, Ljj/e$c;-><init>(ZLjj/i;)V

    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v10

    goto :goto_6

    :cond_a
    move-object v10, v5

    :goto_6
    invoke-interface {v4, v10}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v10

    const v11, 0x2bb5b5d7

    invoke-interface {v3, v11}, LT/l;->e(I)V

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->o()Lf0/c;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v11, v12, v3, v12}, Landroidx/compose/foundation/layout/d;->j(Lf0/c;ZLT/l;I)LC0/C;

    move-result-object v11

    const v13, -0x4ee9b9da

    invoke-interface {v3, v13}, LT/l;->e(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v13

    invoke-interface {v3, v13}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v14

    invoke-interface {v3, v14}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LY0/t;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v15

    invoke-interface {v3, v15}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/ui/platform/w1;

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-static {v10}, LC0/w;->c(Landroidx/compose/ui/e;)Lmh/q;

    move-result-object v10

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_c

    invoke-interface {v3, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_c
    invoke-interface {v3}, LT/l;->I()V

    :goto_7
    invoke-interface {v3}, LT/l;->w()V

    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v1

    invoke-static {v12, v11, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->c()Lmh/p;

    move-result-object v1

    invoke-static {v12, v13, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->d()Lmh/p;

    move-result-object v1

    invoke-static {v12, v14, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->h()Lmh/p;

    move-result-object v1

    invoke-static {v12, v15, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-interface {v3}, LT/l;->h()V

    invoke-static {v3}, LT/Z0;->b(LT/l;)LT/l;

    move-result-object v1

    invoke-static {v1}, LT/Z0;->a(LT/l;)LT/Z0;

    move-result-object v1

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v10, v1, v3, v11}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v3, v1}, LT/l;->e(I)V

    const v1, -0x7f65a980

    invoke-interface {v3, v1}, LT/l;->e(I)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v10, v8, 0xc

    and-int/lit16 v10, v10, 0x380

    const/4 v11, 0x6

    or-int/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v7, v1, v0, v3, v10}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3}, LT/l;->P()V

    invoke-interface {v3}, LT/l;->P()V

    invoke-interface {v3}, LT/l;->R()V

    invoke-interface {v3}, LT/l;->P()V

    invoke-interface {v3}, LT/l;->P()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v10

    if-nez v10, :cond_e

    goto :goto_8

    :cond_e
    new-instance v11, Ljj/e$a;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v9

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ljj/e$a;-><init>(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :goto_8
    return-void
.end method
