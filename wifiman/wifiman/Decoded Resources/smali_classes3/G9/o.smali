.class public abstract LG9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;IIIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LG9/o;->c(Landroidx/compose/ui/e;Ljava/lang/String;IIIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ljava/lang/String;IILT/l;II)V
    .locals 29

    move-object/from16 v1, p1

    move/from16 v0, p5

    const-string/jumbo v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x19a18b61

    move-object/from16 v3, p4

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v3, p6, 0x1

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v13, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v4

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, p6, 0x2

    const/16 v8, 0x10

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_5

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    move v7, v8

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-interface {v13, v9}, LT/l;->i(I)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v6, v10

    :goto_5
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_b

    and-int/lit8 v10, p6, 0x8

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-interface {v13, v10}, LT/l;->i(I)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    move/from16 v10, p3

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v6, v11

    goto :goto_7

    :cond_b
    move/from16 v10, p3

    :goto_7
    and-int/lit16 v11, v6, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_d

    invoke-interface {v13}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v13}, LT/l;->C()V

    move-object v1, v5

    move v3, v9

    move v4, v10

    move-object/from16 v28, v13

    goto/16 :goto_d

    :cond_d
    :goto_8
    invoke-interface {v13}, LT/l;->q()V

    and-int/lit8 v11, v0, 0x1

    if-eqz v11, :cond_10

    invoke-interface {v13}, LT/l;->H()Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v13}, LT/l;->C()V

    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_f

    and-int/lit16 v6, v6, -0x1c01

    :cond_f
    move-object/from16 v25, v5

    :goto_9
    move/from16 v26, v9

    move/from16 v27, v10

    goto :goto_c

    :cond_10
    :goto_a
    if-eqz v3, :cond_11

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v3, v5

    :goto_b
    if-eqz v7, :cond_12

    move v9, v4

    :cond_12
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_13

    sget-object v4, LW0/j;->b:LW0/j$a;

    invoke-virtual {v4}, LW0/j$a;->b()I

    move-result v4

    and-int/lit16 v6, v6, -0x1c01

    move-object/from16 v25, v3

    move/from16 v27, v4

    move/from16 v26, v9

    goto :goto_c

    :cond_13
    move-object/from16 v25, v3

    goto :goto_9

    :goto_c
    invoke-interface {v13}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_14

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetTrailingValue (UiSettingsWidgetTrailingValue.kt:23)"

    invoke-static {v2, v6, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v13, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v14

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v2

    invoke-interface {v13, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v16

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v8}, LY0/w;->g(I)J

    move-result-wide v4

    sget-object v7, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v7}, LQ0/A$a;->e()LQ0/A;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v8}, LY0/w;->g(I)J

    move-result-wide v9

    sget-object v8, LW0/t;->a:LW0/t$a;

    invoke-virtual {v8}, LW0/t$a;->b()I

    move-result v15

    invoke-static/range {v27 .. v27}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    shr-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0xe

    const v11, 0xc30c00

    or-int/2addr v8, v11

    shl-int/lit8 v11, v6, 0x3

    and-int/lit8 v14, v11, 0x70

    or-int/2addr v8, v14

    shl-int/lit8 v6, v6, 0x12

    const/high16 v14, 0x70000000

    and-int/2addr v6, v14

    or-int v22, v8, v6

    and-int/lit16 v6, v11, 0x1c00

    or-int/lit8 v23, v6, 0x30

    const v24, 0x1d550

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v28, v13

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, p1

    move-object/from16 v1, v25

    move/from16 v17, v26

    move-object/from16 v21, v28

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object/from16 v1, v25

    move/from16 v3, v26

    move/from16 v4, v27

    :goto_d
    invoke-interface/range {v28 .. v28}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v8, LG9/n;

    move-object v0, v8

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LG9/n;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;IIII)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ljava/lang/String;IIIILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LG9/o;->b(Landroidx/compose/ui/e;Ljava/lang/String;IILT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
