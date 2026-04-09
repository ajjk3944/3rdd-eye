.class public abstract LM5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
    .locals 36

    move/from16 v15, p17

    move/from16 v14, p19

    const-string/jumbo v0, "chart"

    move-object/from16 v13, p0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    move-object/from16 v12, p1

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x642d5dfc

    move-object/from16 v1, p16

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v1, v14, 0x4

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p2

    :goto_0
    and-int/lit8 v1, v14, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object/from16 v18, v2

    goto :goto_1

    :cond_1
    move-object/from16 v18, p3

    :goto_1
    and-int/lit8 v1, v14, 0x10

    if-eqz v1, :cond_2

    move-object/from16 v19, v2

    goto :goto_2

    :cond_2
    move-object/from16 v19, p4

    :goto_2
    and-int/lit8 v1, v14, 0x20

    if-eqz v1, :cond_3

    move-object/from16 v20, v2

    goto :goto_3

    :cond_3
    move-object/from16 v20, p5

    :goto_3
    and-int/lit8 v1, v14, 0x40

    if-eqz v1, :cond_4

    move-object/from16 v21, v2

    goto :goto_4

    :cond_4
    move-object/from16 v21, p6

    :goto_4
    and-int/lit16 v1, v14, 0x80

    if-eqz v1, :cond_5

    move-object/from16 v22, v2

    goto :goto_5

    :cond_5
    move-object/from16 v22, p7

    :goto_5
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_6

    move-object/from16 v23, v2

    goto :goto_6

    :cond_6
    move-object/from16 v23, p8

    :goto_6
    and-int/lit16 v1, v14, 0x200

    if-eqz v1, :cond_7

    move-object/from16 v24, v2

    goto :goto_7

    :cond_7
    move-object/from16 v24, p9

    :goto_7
    and-int/lit16 v1, v14, 0x400

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    const/16 v3, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v11

    move/from16 p7, v1

    move/from16 p8, v3

    invoke-static/range {p2 .. p8}, LO5/b;->a(ZLE6/d;LE6/c;Lr/i;LT/l;II)LO5/a;

    move-result-object v1

    and-int/lit8 v3, p18, -0xf

    move-object/from16 v25, v1

    goto :goto_8

    :cond_8
    move-object/from16 v25, p10

    move/from16 v3, p18

    :goto_8
    and-int/lit16 v1, v14, 0x800

    const/4 v9, 0x1

    if-eqz v1, :cond_9

    move/from16 v26, v9

    goto :goto_9

    :cond_9
    move/from16 v26, p11

    :goto_9
    and-int/lit16 v1, v14, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v27, v2

    goto :goto_a

    :cond_a
    move-object/from16 v27, p12

    :goto_a
    and-int/lit16 v1, v14, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v28, v2

    goto :goto_b

    :cond_b
    move-object/from16 v28, p13

    :goto_b
    and-int/lit16 v1, v14, 0x4000

    if-eqz v1, :cond_c

    sget-object v1, Li6/a;->Full:Li6/a;

    move-object/from16 v29, v1

    goto :goto_c

    :cond_c
    move-object/from16 v29, p14

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v14

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    invoke-static {v11, v1}, LO5/d;->a(LT/l;I)LO5/c;

    move-result-object v1

    const v2, -0x70001

    and-int/2addr v2, v3

    move-object/from16 v30, v1

    move v8, v2

    goto :goto_d

    :cond_d
    move-object/from16 v30, p15

    move v8, v3

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string/jumbo v1, "com.patrykandpatrick.vico.compose.chart.Chart (Charts.kt:243)"

    invoke-static {v0, v15, v8, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_e
    new-instance v7, LM5/a$a;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v31, v7

    move-object/from16 v7, v22

    move/from16 v17, v8

    move-object/from16 v8, v23

    move-object/from16 v9, v24

    move-object/from16 v32, v10

    move-object/from16 v10, v25

    move-object/from16 v33, v11

    move/from16 v11, v26

    move-object/from16 v12, v27

    move-object/from16 v13, v28

    move-object/from16 v14, v29

    move-object/from16 v15, v30

    move/from16 v16, p17

    invoke-direct/range {v0 .. v17}, LM5/a$a;-><init>(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;II)V

    const v0, -0x103bba36

    move-object/from16 v3, v31

    move-object/from16 v1, v33

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v3}, Lb0/c;->b(LT/l;IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    shr-int/lit8 v2, p17, 0x6

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v3, v32

    invoke-static {v3, v0, v1, v2}, LM5/a;->b(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v15

    if-nez v15, :cond_10

    goto :goto_e

    :cond_10
    new-instance v14, LM5/a$b;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, v18

    move-object/from16 v5, v19

    move-object/from16 v6, v20

    move-object/from16 v7, v21

    move-object/from16 v8, v22

    move-object/from16 v9, v23

    move-object/from16 v10, v24

    move-object/from16 v11, v25

    move/from16 v12, v26

    move-object/from16 v13, v27

    move-object/from16 v34, v14

    move-object/from16 v14, v28

    move-object/from16 v35, v15

    move-object/from16 v15, v29

    move-object/from16 v16, v30

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, LM5/a$b;-><init>(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;III)V

    move-object/from16 v1, v34

    move-object/from16 v0, v35

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :goto_e
    return-void
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/q;LT/l;I)V
    .locals 10

    const-string/jumbo v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7c4313ec

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x70

    if-nez v2, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x5b

    const/16 v3, 0x12

    if-ne v2, v3, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string/jumbo v3, "com.patrykandpatrick.vico.compose.chart.ChartBox (Charts.kt:412)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const/high16 v0, 0x43480000    # 200.0f

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    const v2, 0x2bb5b5d7

    invoke-interface {p2, v2}, LT/l;->e(I)V

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, p2, v3}, Landroidx/compose/foundation/layout/d;->j(Lf0/c;ZLT/l;I)LC0/C;

    move-result-object v2

    const v4, -0x4ee9b9da

    invoke-interface {p2, v4}, LT/l;->e(I)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v4

    invoke-interface {p2, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v5

    invoke-interface {p2, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LY0/t;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v6

    invoke-interface {p2, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/platform/w1;

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-static {v0}, LC0/w;->c(Landroidx/compose/ui/e;)Lmh/q;

    move-result-object v0

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {p2, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {p2}, LT/l;->I()V

    :goto_4
    invoke-interface {p2}, LT/l;->w()V

    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->c()Lmh/p;

    move-result-object v2

    invoke-static {v8, v4, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->d()Lmh/p;

    move-result-object v2

    invoke-static {v8, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->h()Lmh/p;

    move-result-object v2

    invoke-static {v8, v6, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-interface {p2}, LT/l;->h()V

    invoke-static {p2}, LT/Z0;->b(LT/l;)LT/l;

    move-result-object v2

    invoke-static {v2}, LT/Z0;->a(LT/l;)LT/Z0;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, p2, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LT/l;->e(I)V

    const v0, -0x7f65a980

    invoke-interface {p2, v0}, LT/l;->e(I)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, p2, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->P()V

    invoke-interface {p2}, LT/l;->P()V

    invoke-interface {p2}, LT/l;->R()V

    invoke-interface {p2}, LT/l;->P()V

    invoke-interface {p2}, LT/l;->P()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-nez p2, :cond_a

    goto :goto_6

    :cond_a
    new-instance v0, LM5/a$c;

    invoke-direct {v0, p0, p1, p3}, LM5/a$c;-><init>(Landroidx/compose/ui/e;Lmh/q;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :goto_6
    return-void
.end method

.method public static final c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
    .locals 38

    move/from16 v15, p18

    const-string/jumbo v0, "chart"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    move-object/from16 v8, p1

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartScrollSpec"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "autoScaleUp"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6fd5e37f

    move-object/from16 v2, p15

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    and-int/lit16 v2, v15, 0x800

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    move-object v12, v11

    goto :goto_0

    :cond_0
    move-object/from16 v12, p11

    :goto_0
    and-int/lit16 v2, v15, 0x4000

    const/4 v13, 0x0

    if-eqz v2, :cond_1

    invoke-static {v9, v13}, LO5/d;->a(LT/l;I)LO5/c;

    move-result-object v2

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p14

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.chart.ChartImpl (Charts.kt:284)"

    move/from16 v6, p16

    move/from16 v5, p17

    invoke-static {v0, v6, v5, v2}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_2

    :cond_2
    move/from16 v6, p16

    move/from16 v5, p17

    :goto_2
    const v0, -0x1d58f75c

    invoke-interface {v9, v0}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    new-instance v2, LY5/b;

    invoke-direct {v2}, LY5/b;-><init>()V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {v9}, LT/l;->P()V

    move-object v4, v2

    check-cast v4, LY5/b;

    invoke-interface {v9, v0}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {v9}, LT/l;->P()V

    move-object v3, v2

    check-cast v3, Landroid/graphics/RectF;

    invoke-interface {v9, v0}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 p14, v7

    const/4 v7, 0x2

    if-ne v2, v13, :cond_5

    invoke-static {v11, v11, v7, v11}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {v9}, LT/l;->P()V

    move-object v13, v2

    check-cast v13, LT/q0;

    invoke-interface {v9, v0}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0, v11, v7, v11}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v9}, LT/l;->P()V

    move-object v0, v2

    check-cast v0, LT/q0;

    invoke-virtual/range {p9 .. p9}, LO5/a;->b()Z

    move-result v2

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Number;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/16 v11, 0x200

    invoke-static {v2, v7, v3, v9, v11}, LV5/a;->a(ZFLandroid/graphics/RectF;LT/l;I)Lu6/f;

    move-result-object v19

    const v2, -0x1d58f75c

    invoke-interface {v9, v2}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v2, v7, :cond_7

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v2

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {v9}, LT/l;->P()V

    move-object v11, v2

    check-cast v11, Ly/m;

    invoke-interface {v11}, Ly/k;->b()LLi/g;

    move-result-object v2

    const/16 v7, 0x38

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, v3

    move-object/from16 v3, v21

    move-object/from16 v35, v4

    move-object/from16 v4, v22

    move-object v5, v9

    move v6, v7

    move-object/from16 v15, p14

    const/4 v1, 0x2

    move/from16 v7, v20

    invoke-static/range {v2 .. v7}, LT/o1;->a(LLi/g;Ljava/lang/Object;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v13, v2, v9, v3}, LM5/a;->d(LT/q0;LT/z1;LT/l;I)LE6/e;

    move-result-object v2

    const v3, -0x1d58f75c

    invoke-interface {v9, v3}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_8

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v3

    invoke-interface {v9, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    invoke-interface {v9}, LT/l;->P()V

    move-object/from16 v34, v3

    check-cast v34, LT/q0;

    move-object/from16 v7, p2

    move-object/from16 v6, p3

    move-object/from16 v5, p4

    move-object/from16 v4, p5

    move-object/from16 v3, v35

    invoke-virtual {v3, v7, v6, v5, v4}, LY5/b;->i(LY5/d;LY5/d;LY5/d;LY5/d;)V

    invoke-virtual {v15, v2}, LO5/c;->k(LE6/e;)V

    const v2, -0x1d58f75c

    invoke-interface {v9, v2}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_9

    new-instance v2, LA6/a;

    invoke-direct {v2, v3}, LA6/a;-><init>(LY5/b;)V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    invoke-interface {v9}, LT/l;->P()V

    move-object/from16 v21, v2

    check-cast v21, LA6/a;

    const/4 v1, 0x0

    invoke-static {v9, v1}, LW5/b;->a(LT/l;I)LW5/a;

    move-result-object v2

    invoke-virtual {v2}, LW5/a;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lm0/x0;->j(J)I

    move-result v26

    const v1, -0x1d58f75c

    invoke-interface {v9, v1}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v35, v3

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v9, v1}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    move-object/from16 v35, v3

    :goto_3
    invoke-interface {v9}, LT/l;->P()V

    check-cast v1, LT/q0;

    invoke-interface {v1}, LT/q0;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v32

    invoke-interface {v1}, LT/q0;->b()Lmh/l;

    move-result-object v33

    const v1, 0x2e20b340

    invoke-interface {v9, v1}, LT/l;->e(I)V

    const v1, -0x1d58f75c

    invoke-interface {v9, v1}, LT/l;->e(I)V

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_b

    sget-object v1, Ldh/j;->a:Ldh/j;

    invoke-static {v1, v9}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v1

    new-instance v2, LT/A;

    invoke-direct {v2, v1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v2

    :cond_b
    invoke-interface {v9}, LT/l;->P()V

    check-cast v1, LT/A;

    invoke-virtual {v1}, LT/A;->a()LIi/N;

    move-result-object v1

    invoke-interface {v9}, LT/l;->P()V

    new-instance v3, LM5/a$g;

    invoke-direct {v3, v15}, LM5/a$g;-><init>(LO5/c;)V

    new-instance v2, LM5/a$h;

    invoke-direct {v2, v1, v15}, LM5/a$h;-><init>(LIi/N;LO5/c;)V

    invoke-interface/range {p0 .. p0}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    const/16 v16, 0x1006

    move-object/from16 v18, v2

    move-object v2, v0

    move-object/from16 v0, v35

    move-object/from16 v4, v18

    move-object v5, v1

    move-object v6, v9

    move/from16 v7, v16

    invoke-static/range {v2 .. v7}, LM5/a;->e(LT/q0;Lmh/a;Lmh/l;Landroid/graphics/RectF;LT/l;I)Lmh/p;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, Lx6/b;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v6, LM5/a$d;

    const/16 v16, 0x0

    move-object v2, v6

    move-object/from16 v3, p9

    move-object/from16 v4, p1

    move-object v5, v12

    move-object/from16 p14, v1

    move-object v1, v6

    move-object v6, v15

    move-object v8, v7

    move-object/from16 v7, v16

    invoke-direct/range {v2 .. v7}, LM5/a$d;-><init>(LO5/a;Lx6/b;Lx6/b;LO5/c;Ldh/e;)V

    const/16 v2, 0x40

    invoke-static {v8, v1, v9, v2}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v13}, LT/q0;->b()Lmh/l;

    move-result-object v2

    if-eqz p6, :cond_c

    goto :goto_4

    :cond_c
    move-object v2, v4

    :goto_4
    invoke-virtual/range {p9 .. p9}, LO5/a;->b()Z

    move-result v3

    if-eqz v3, :cond_d

    move-object v7, v15

    goto :goto_5

    :cond_d
    move-object v7, v4

    :goto_5
    if-eqz p10, :cond_e

    move-object/from16 v4, p14

    :cond_e
    invoke-static {v1, v2, v7, v4, v11}, LT5/a;->b(Landroidx/compose/ui/e;Lmh/l;Lw/y;Lmh/p;Ly/m;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, LM5/a$e;

    move-object/from16 v16, v2

    move-object/from16 v17, v23

    move-object/from16 v18, p0

    move-object/from16 v20, p1

    move-object/from16 v22, p8

    move-object/from16 v23, p6

    move-object/from16 v24, v15

    move-object/from16 v25, p9

    move-object/from16 v27, v13

    move-object/from16 v28, p13

    move-object/from16 v29, p12

    move-object/from16 v30, v0

    move-object/from16 v31, p7

    invoke-direct/range {v16 .. v34}, LM5/a$e;-><init>(Landroid/graphics/RectF;Lb6/b;Lu6/f;Lx6/b;LA6/a;LB6/a;LC6/a;LO5/c;LO5/a;ILT/q0;Li6/a;Lf6/a;LY5/b;LC6/b;ZLmh/l;LT/q0;)V

    const/4 v0, 0x0

    invoke-static {v1, v2, v9, v0}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v13

    if-nez v13, :cond_10

    goto :goto_6

    :cond_10
    new-instance v11, LM5/a$f;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v36, v11

    move/from16 v11, p10

    move-object/from16 v37, v13

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, LM5/a$f;-><init>(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;III)V

    move-object/from16 v1, v36

    move-object/from16 v0, v37

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :goto_6
    return-void
.end method

.method public static final d(LT/q0;LT/z1;LT/l;I)LE6/e;
    .locals 3

    const-string/jumbo v0, "touchPoint"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "interaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5cb2345a

    invoke-interface {p2, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.chart.rememberScrollListener (Charts.kt:423)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p3, -0x1d58f75c

    invoke-interface {p2, p3}, LT/l;->e(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_1

    new-instance p3, LM5/a$i;

    invoke-direct {p3, p0, p1}, LM5/a$i;-><init>(LT/q0;LT/z1;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p2}, LT/l;->P()V

    check-cast p3, LM5/a$i;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->P()V

    return-object p3
.end method

.method public static final e(LT/q0;Lmh/a;Lmh/l;Landroid/graphics/RectF;LT/l;I)Lmh/p;
    .locals 3

    const-string/jumbo v0, "zoom"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "getScroll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "scrollBy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartBounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6b228198

    invoke-interface {p4, v0}, LT/l;->e(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.patrykandpatrick.vico.compose.chart.rememberZoomState (Charts.kt:445)"

    invoke-static {v0, p5, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p5, -0x1d58f75c

    invoke-interface {p4, p5}, LT/l;->e(I)V

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p5, v0, :cond_1

    new-instance p5, LM5/a$j;

    invoke-direct {p5, p0, p1, p3, p2}, LM5/a$j;-><init>(LT/q0;Lmh/a;Landroid/graphics/RectF;Lmh/l;)V

    invoke-interface {p4, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p4}, LT/l;->P()V

    check-cast p5, Lmh/p;

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p4}, LT/l;->P()V

    return-object p5
.end method
