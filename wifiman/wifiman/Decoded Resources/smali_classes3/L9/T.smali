.class public abstract LL9/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IIJLjava/lang/String;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LL9/T;->c(Landroidx/compose/ui/e;IIJLjava/lang/String;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;IIJLjava/lang/String;LT/l;II)V
    .locals 31

    move-object/from16 v15, p5

    move/from16 v2, p7

    const-string/jumbo v0, "text"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x28e3d6e7

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v2, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v3, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v2

    :goto_1
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p1

    invoke-interface {v3, v7}, LT/l;->i(I)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :goto_3
    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v2, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-interface {v3, v9}, LT/l;->i(I)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v5, v10

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move-wide/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v2, 0xc00

    if-nez v11, :cond_9

    move-wide/from16 v11, p3

    invoke-interface {v3, v11, v12}, LT/l;->j(J)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v5, v13

    :goto_7
    and-int/lit8 v13, p8, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v13, v2, 0x6000

    if-nez v13, :cond_e

    invoke-interface {v3, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v5, v13

    :cond_e
    :goto_9
    and-int/lit16 v13, v5, 0x2493

    const/16 v14, 0x2492

    if-ne v13, v14, :cond_10

    invoke-interface {v3}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v3}, LT/l;->C()V

    move-object/from16 v30, v3

    move-object v1, v4

    move v2, v7

    move v3, v9

    move-wide v4, v11

    goto/16 :goto_f

    :cond_10
    :goto_a
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v25, v1

    goto :goto_b

    :cond_11
    move-object/from16 v25, v4

    :goto_b
    if-eqz v6, :cond_12

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v1

    move/from16 v26, v1

    goto :goto_c

    :cond_12
    move/from16 v26, v7

    :goto_c
    if-eqz v8, :cond_13

    const/4 v1, 0x1

    move/from16 v27, v1

    goto :goto_d

    :cond_13
    move/from16 v27, v9

    :goto_d
    if-eqz v10, :cond_14

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->e()J

    move-result-wide v6

    move-wide/from16 v28, v6

    goto :goto_e

    :cond_14
    move-wide/from16 v28, v11

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.toolbar.UiToolbarTitle (UiToolbarTitle.kt:17)"

    invoke-static {v0, v5, v1, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    sget-object v0, LW0/j;->b:LW0/j$a;

    invoke-virtual {v0}, LW0/j$a;->a()I

    move-result v0

    sget-object v1, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v1, v3, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v1

    invoke-virtual {v1}, Lpa/c;->a()Lpa/b;

    move-result-object v1

    invoke-virtual {v1}, Lpa/b;->c()LL0/U;

    move-result-object v20

    invoke-static {v0}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    shr-int/lit8 v0, v5, 0xc

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, v5, 0x3

    and-int/lit8 v4, v1, 0x70

    or-int/2addr v0, v4

    shr-int/lit8 v4, v5, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int v22, v0, v4

    and-int/lit8 v0, v5, 0x70

    and-int/lit16 v1, v1, 0x1c00

    or-int v23, v0, v1

    const v24, 0xd5f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p5

    move-object/from16 v1, v25

    move-object/from16 v30, v3

    move-wide/from16 v2, v28

    move/from16 v15, v26

    move/from16 v17, v27

    move-object/from16 v21, v30

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move-object/from16 v1, v25

    move/from16 v2, v26

    move/from16 v3, v27

    move-wide/from16 v4, v28

    :goto_f
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v10, LL9/S;

    move-object v0, v10

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LL9/S;-><init>(Landroidx/compose/ui/e;IIJLjava/lang/String;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;IIJLjava/lang/String;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LL9/T;->b(Landroidx/compose/ui/e;IIJLjava/lang/String;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
