.class public abstract LG9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LL0/d;ZIIIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LG9/k;->c(Landroidx/compose/ui/e;LL0/d;ZIIIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LL0/d;ZIILT/l;II)V
    .locals 33

    move-object/from16 v15, p1

    move/from16 v2, p6

    const-string/jumbo v0, "text"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4724fef4

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v1, p7, 0x1

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
    and-int/lit8 v6, p7, 0x2

    const/16 v7, 0x10

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    move v6, v7

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p7, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v2, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-interface {v3, v8}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v2, 0xc00

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-interface {v3, v10}, LT/l;->i(I)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v5, v11

    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v2, 0x6000

    if-nez v12, :cond_c

    move/from16 v12, p4

    invoke-interface {v3, v12}, LT/l;->i(I)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v5, v13

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

    move-object/from16 v32, v3

    move-object v1, v4

    move v3, v8

    move v4, v10

    move v5, v12

    goto/16 :goto_11

    :cond_10
    :goto_a
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_b

    :cond_11
    move-object v1, v4

    :goto_b
    if-eqz v6, :cond_12

    const/4 v4, 0x0

    move/from16 v26, v4

    goto :goto_c

    :cond_12
    move/from16 v26, v8

    :goto_c
    if-eqz v9, :cond_13

    const v4, 0x7fffffff

    move/from16 v27, v4

    goto :goto_d

    :cond_13
    move/from16 v27, v10

    :goto_d
    if-eqz v11, :cond_14

    sget-object v4, LW0/t;->a:LW0/t$a;

    invoke-virtual {v4}, LW0/t$a;->a()I

    move-result v4

    move/from16 v28, v4

    goto :goto_e

    :cond_14
    move/from16 v28, v12

    :goto_e
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v4, -0x1

    const-string/jumbo v6, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetSelectableValue (UiSettingsWidgetSelectableValue.kt:22)"

    invoke-static {v0, v5, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    sget-object v0, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v0, v3, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v6

    invoke-virtual {v6}, Lr9/a$b;->f()J

    move-result-wide v16

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v6

    invoke-interface {v3, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v8

    const/4 v6, 0x6

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v6}, LE/h;->d(F)LE/g;

    move-result-object v6

    invoke-static {v1, v8, v9, v6}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v6

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v6, v7, v8}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v17

    const v6, 0x18d3f820

    invoke-interface {v3, v6}, LT/l;->U(I)V

    if-eqz v26, :cond_16

    invoke-virtual {v0, v3, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v6

    invoke-static {}, LN/s;->a()LT/H0;

    move-result-object v0

    invoke-interface {v3, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    :goto_f
    move-wide/from16 v29, v6

    goto :goto_10

    :cond_16
    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v6

    goto :goto_f

    :goto_10
    invoke-interface {v3}, LT/l;->J()V

    shr-int/lit8 v0, v5, 0x3

    and-int/lit8 v23, v0, 0xe

    shr-int/lit8 v0, v5, 0x9

    and-int/lit8 v0, v0, 0x70

    and-int/lit16 v4, v5, 0x1c00

    or-int v24, v0, v4

    const v25, 0x3d7f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v0, p1

    move-object/from16 v31, v1

    move-object/from16 v1, v17

    move-object/from16 v32, v3

    move-wide/from16 v2, v29

    move/from16 v15, v28

    move/from16 v17, v27

    move-object/from16 v22, v32

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LT/o;->P()V

    :cond_17
    move/from16 v3, v26

    move/from16 v4, v27

    move/from16 v5, v28

    move-object/from16 v1, v31

    :goto_11
    invoke-interface/range {v32 .. v32}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v9, LG9/j;

    move-object v0, v9

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LG9/j;-><init>(Landroidx/compose/ui/e;LL0/d;ZIIII)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_18
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LL0/d;ZIIIILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LG9/k;->b(Landroidx/compose/ui/e;LL0/d;ZIILT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
