.class public abstract Ls/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V
    .locals 19

    move-object/from16 v2, p1

    move/from16 v8, p8

    const v0, 0x441d0e20

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v1, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v4, v13

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v4, v14

    :cond_f
    move/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int/2addr v14, v8

    if-nez v14, :cond_f

    move/from16 v14, p5

    invoke-interface {v1, v14}, LT/l;->g(F)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v4, v15

    :goto_b
    and-int/lit8 v15, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_12

    or-int v4, v4, v16

    move-object/from16 v6, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v16

    move-object/from16 v6, p6

    if-nez v16, :cond_14

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v4, v4, v16

    :cond_14
    :goto_d
    const v16, 0x92493

    and-int v0, v4, v16

    const v3, 0x92492

    if-ne v0, v3, :cond_16

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v7

    move-object v4, v10

    move-object v5, v12

    move-object v7, v6

    move v6, v14

    goto/16 :goto_15

    :cond_16
    :goto_e
    if-eqz v5, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v7, v0

    :cond_17
    if-eqz v9, :cond_18

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->e()Lf0/c;

    move-result-object v0

    goto :goto_f

    :cond_18
    move-object v0, v10

    :goto_f
    if-eqz v11, :cond_19

    sget-object v3, LC0/h;->a:LC0/h$a;

    invoke-virtual {v3}, LC0/h$a;->b()LC0/h;

    move-result-object v3

    goto :goto_10

    :cond_19
    move-object v3, v12

    :goto_10
    if-eqz v13, :cond_1a

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_11

    :cond_1a
    move v5, v14

    :goto_11
    const/4 v9, 0x0

    if-eqz v15, :cond_1b

    move-object v6, v9

    :cond_1b
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_1c

    const/4 v10, -0x1

    const-string v11, "androidx.compose.foundation.Image (Image.kt:243)"

    const v12, 0x441d0e20

    invoke-static {v12, v4, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1c
    const/4 v15, 0x0

    if-eqz v2, :cond_20

    const v10, 0x3e0116d7

    invoke-interface {v1, v10}, LT/l;->U(I)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    and-int/lit8 v4, v4, 0x70

    const/4 v11, 0x1

    const/16 v12, 0x20

    if-ne v4, v12, :cond_1d

    move v4, v11

    goto :goto_12

    :cond_1d
    move v4, v15

    :goto_12
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v4, :cond_1e

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v12, v4, :cond_1f

    :cond_1e
    new-instance v12, Ls/F$c;

    invoke-direct {v12, v2}, Ls/F$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v12, Lmh/l;

    invoke-static {v10, v15, v12, v11, v9}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_13

    :cond_20
    const v4, 0x3e033709

    invoke-interface {v1, v4}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_13
    invoke-interface {v7, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4}, Lj0/e;->b(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/4 v11, 0x0

    move-object/from16 v10, p0

    move-object v12, v0

    move-object v13, v3

    move v14, v5

    move v4, v15

    move-object v15, v6

    invoke-static/range {v9 .. v17}, Landroidx/compose/ui/draw/d;->b(Landroidx/compose/ui/e;Lr0/d;ZLf0/c;LC0/h;FLm0/w0;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    sget-object v10, Ls/F$a;->a:Ls/F$a;

    invoke-static {v1, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-static {v1, v9}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v11

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_21

    invoke-static {}, LT/j;->c()V

    :cond_21
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_22

    invoke-interface {v1, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_14

    :cond_22
    invoke-interface {v1}, LT/l;->I()V

    :goto_14
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v10, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v10

    invoke-static {v13, v11, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v10

    invoke-static {v13, v9, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v13}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_23

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_24

    :cond_23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v13, v4, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_24
    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-static {}, LT/o;->P()V

    :cond_25
    move-object v4, v0

    move/from16 v18, v5

    move-object v5, v3

    move-object v3, v7

    move-object v7, v6

    move/from16 v6, v18

    :goto_15
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_26

    new-instance v11, Ls/F$b;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ls/F$b;-><init>(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_26
    return-void
.end method

.method public static final b(Ls0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V
    .locals 12

    move/from16 v0, p8

    and-int/lit8 v1, p9, 0x4

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v1, p9, 0x8

    if-eqz v1, :cond_1

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 v1, p9, 0x10

    if-eqz v1, :cond_2

    sget-object v1, LC0/h;->a:LC0/h$a;

    invoke-virtual {v1}, LC0/h$a;->b()LC0/h;

    move-result-object v1

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v1, p9, 0x20

    if-eqz v1, :cond_3

    const/high16 v1, 0x3f800000    # 1.0f

    move v7, v1

    goto :goto_3

    :cond_3
    move/from16 v7, p5

    :goto_3
    and-int/lit8 v1, p9, 0x40

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move-object v8, v1

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.Image (Image.kt:197)"

    const v3, 0x5f1f9c13

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_5
    and-int/lit8 v1, v0, 0xe

    move-object v2, p0

    move-object/from16 v9, p7

    invoke-static {p0, v9, v1}, Ls0/q;->g(Ls0/d;LT/l;I)Ls0/p;

    move-result-object v2

    sget v1, Ls0/p;->n:I

    and-int/lit8 v3, v0, 0x70

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x1c00

    or-int/2addr v1, v3

    const v3, 0xe000

    and-int/2addr v3, v0

    or-int/2addr v1, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v0

    or-int/2addr v1, v3

    const/high16 v3, 0x380000

    and-int/2addr v0, v3

    or-int v10, v1, v0

    const/4 v11, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v11}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    return-void
.end method

.method public static final c(Lm0/J0;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;ILT/l;II)V
    .locals 16

    move-object/from16 v7, p8

    move/from16 v0, p9

    move/from16 v1, p10

    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p2

    :goto_0
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_1

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->e()Lf0/c;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v1, 0x10

    if-eqz v4, :cond_2

    sget-object v4, LC0/h;->a:LC0/h$a;

    invoke-virtual {v4}, LC0/h$a;->b()LC0/h;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v1, 0x20

    if-eqz v5, :cond_3

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v1, 0x40

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p6

    :goto_4
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_5

    sget-object v1, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v1}, Lo0/f$a;->b()I

    move-result v1

    move v13, v1

    goto :goto_5

    :cond_5
    move/from16 v13, p7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v8, "androidx.compose.foundation.Image (Image.kt:152)"

    const v9, -0x53393f7c

    invoke-static {v9, v0, v1, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    move-object/from16 v1, p0

    invoke-interface {v7, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface/range {p8 .. p8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_7

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_8

    :cond_7
    const/4 v14, 0x6

    const/4 v15, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v8, p0

    invoke-static/range {v8 .. v15}, Lr0/b;->b(Lm0/J0;JJIILjava/lang/Object;)Lr0/a;

    move-result-object v9

    invoke-interface {v7, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v1, v9

    check-cast v1, Lr0/a;

    const v8, 0x3ffff0

    and-int/2addr v8, v0

    const/4 v9, 0x0

    move-object v0, v1

    move-object/from16 v1, p1

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v9}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    return-void
.end method
