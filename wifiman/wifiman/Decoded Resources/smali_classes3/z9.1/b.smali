.class public abstract Lz9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JFFFIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lz9/b;->c(Landroidx/compose/ui/e;JFFFIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;JFFFLT/l;II)V
    .locals 16

    move/from16 v7, p7

    const v0, 0x26f70204

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p8, 0x2

    if-nez v5, :cond_3

    move-wide/from16 v5, p1

    invoke-interface {v1, v5, v6}, LT/l;->j(J)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v5, p1

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_3

    :cond_5
    move-wide/from16 v5, p1

    :goto_3
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v9, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p3

    invoke-interface {v1, v9}, LT/l;->g(F)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v11, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p4

    invoke-interface {v1, v11}, LT/l;->g(F)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v13, p5

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v7, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p5

    invoke-interface {v1, v13}, LT/l;->g(F)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    and-int/lit16 v14, v4, 0x2493

    const/16 v15, 0x2492

    if-ne v14, v15, :cond_11

    invoke-interface {v1}, LT/l;->v()Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    :cond_10
    :goto_a
    move v4, v9

    goto/16 :goto_10

    :cond_11
    :goto_b
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v14, v7, 0x1

    const/4 v15, 0x0

    if-eqz v14, :cond_14

    invoke-interface {v1}, LT/l;->H()Z

    move-result v14

    if-eqz v14, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_13

    and-int/lit8 v4, v4, -0x71

    :cond_13
    move-object v2, v3

    goto :goto_e

    :cond_14
    :goto_c
    if-eqz v2, :cond_15

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_d

    :cond_15
    move-object v2, v3

    :goto_d
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_16

    sget-object v3, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v3, v1, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->b()J

    move-result-wide v5

    and-int/lit8 v4, v4, -0x71

    :cond_16
    if-eqz v8, :cond_17

    const/4 v3, 0x1

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move v9, v3

    :cond_17
    if-eqz v10, :cond_18

    int-to-float v3, v15

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move v11, v3

    :cond_18
    if-eqz v12, :cond_19

    int-to-float v3, v15

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    move v13, v3

    :cond_19
    :goto_e
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1a

    const/4 v3, -0x1

    const-string/jumbo v8, "com.ui.core.ui.component.divider.UiDividerHorizontal (UiDivider.kt:29)"

    invoke-static {v0, v4, v3, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1a
    const v0, 0x5f4c1cbe

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->a()F

    move-result v0

    invoke-static {v9, v0}, LY0/h;->n(FF)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v0

    const/high16 v3, 0x3f800000    # 1.0f

    div-float/2addr v3, v0

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v0

    goto :goto_f

    :cond_1b
    move v0, v9

    :goto_f
    invoke-interface {v1}, LT/l;->J()V

    const/16 v3, 0xa

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 p0, v2

    move/from16 p1, v11

    move/from16 p2, v8

    move/from16 p3, v13

    move/from16 p4, v10

    move/from16 p5, v3

    move-object/from16 p6, v4

    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v3, 0x2

    const/4 v8, 0x0

    move-object/from16 p0, v0

    move-wide/from16 p1, v5

    move-object/from16 p3, v8

    move/from16 p4, v3

    move-object/from16 p5, v4

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v1, v15}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_a

    :goto_10
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1c

    new-instance v10, Lz9/a;

    move-object v0, v10

    move-object v1, v2

    move-wide v2, v5

    move v5, v11

    move v6, v13

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lz9/a;-><init>(Landroidx/compose/ui/e;JFFFII)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;JFFFIILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
