.class public abstract LF9/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/B;->e(Lmh/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p13}, LF9/B;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LF9/B;->h(ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;LT/l;II)V
    .locals 36

    move-object/from16 v15, p1

    move/from16 v13, p3

    move-object/from16 v12, p6

    move/from16 v11, p11

    move/from16 v10, p12

    const-string/jumbo v0, "title"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x227ceca4

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v11, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v11

    :goto_1
    and-int/lit8 v4, v10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_5

    invoke-interface {v14, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v10, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v5, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-interface {v14, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_4

    :cond_8
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    :goto_5
    and-int/lit8 v6, v10, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_b

    invoke-interface {v14, v13}, LT/l;->c(Z)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_6

    :cond_a
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v3, v6

    :cond_b
    :goto_7
    and-int/lit8 v6, v10, 0x10

    if-eqz v6, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v7, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v7, v11, 0x6000

    if-nez v7, :cond_c

    move-object/from16 v7, p4

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    const/16 v9, 0x4000

    goto :goto_8

    :cond_e
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v3, v9

    :goto_9
    and-int/lit8 v9, v10, 0x20

    const/high16 v16, 0x30000

    if-eqz v9, :cond_f

    or-int v3, v3, v16

    move/from16 v8, p5

    goto :goto_b

    :cond_f
    and-int v16, v11, v16

    move/from16 v8, p5

    if-nez v16, :cond_11

    invoke-interface {v14, v8}, LT/l;->g(F)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v3, v3, v16

    :cond_11
    :goto_b
    and-int/lit8 v16, v10, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v3, v3, v17

    goto :goto_d

    :cond_12
    and-int v16, v11, v17

    if-nez v16, :cond_14

    invoke-interface {v14, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    :cond_14
    :goto_d
    and-int/lit16 v7, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v7, :cond_15

    or-int v3, v3, v17

    move-object/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v17, v11, v17

    move-object/from16 v0, p7

    if-nez v17, :cond_17

    invoke-interface {v14, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v18, 0x400000

    :goto_e
    or-int v3, v3, v18

    :cond_17
    :goto_f
    and-int/lit16 v0, v10, 0x100

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_18

    or-int v3, v3, v19

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v18, v11, v19

    move/from16 v2, p8

    if-nez v18, :cond_1a

    invoke-interface {v14, v2}, LT/l;->c(Z)Z

    move-result v18

    if-eqz v18, :cond_19

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v18, 0x2000000

    :goto_10
    or-int v3, v3, v18

    :cond_1a
    :goto_11
    and-int/lit16 v2, v10, 0x200

    const/high16 v18, 0x30000000

    if-eqz v2, :cond_1b

    or-int v3, v3, v18

    move-object/from16 v5, p9

    goto :goto_13

    :cond_1b
    and-int v18, v11, v18

    move-object/from16 v5, p9

    if-nez v18, :cond_1d

    invoke-interface {v14, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1c

    const/high16 v18, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v18, 0x10000000

    :goto_12
    or-int v3, v3, v18

    :cond_1d
    :goto_13
    const v18, 0x12492493

    and-int v5, v3, v18

    const v8, 0x12492492

    if-ne v5, v8, :cond_1f

    invoke-interface {v14}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v30, v14

    goto/16 :goto_20

    :cond_1f
    :goto_14
    if-eqz v1, :cond_20

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v1

    goto :goto_15

    :cond_20
    move-object/from16 v8, p0

    :goto_15
    const/16 v18, 0x0

    if-eqz v4, :cond_21

    move-object/from16 v23, v18

    goto :goto_16

    :cond_21
    move-object/from16 v23, p2

    :goto_16
    if-eqz v6, :cond_22

    move-object/from16 v24, v18

    goto :goto_17

    :cond_22
    move-object/from16 v24, p4

    :goto_17
    if-eqz v9, :cond_23

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move/from16 v25, v1

    goto :goto_18

    :cond_23
    move/from16 v25, p5

    :goto_18
    if-eqz v7, :cond_24

    move-object/from16 v26, v18

    goto :goto_19

    :cond_24
    move-object/from16 v26, p7

    :goto_19
    const/4 v9, 0x1

    if-eqz v0, :cond_25

    move/from16 v27, v9

    goto :goto_1a

    :cond_25
    move/from16 v27, p8

    :goto_1a
    if-eqz v2, :cond_26

    move-object/from16 v0, v18

    goto :goto_1b

    :cond_26
    move-object/from16 v0, p9

    :goto_1b
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_27

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.UiSettingsCheck (UiSettingsCheck.kt:30)"

    const v4, 0x227ceca4

    invoke-static {v4, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_27
    const-string/jumbo v1, "ui_settings_check"

    invoke-static {v8, v1, v13}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v28

    const v1, -0x6c678cd8

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-eqz v24, :cond_28

    shr-int/lit8 v1, v3, 0xc

    and-int/lit8 v6, v1, 0x7e

    const/4 v7, 0x4

    const-wide/16 v4, 0x0

    move-object/from16 v1, v24

    move/from16 v2, v25

    move/from16 v29, v3

    move-wide v3, v4

    move-object v5, v14

    invoke-static/range {v1 .. v7}, LG9/i;->a(Ls9/a;FJLT/l;II)Lmh/q;

    move-result-object v1

    move-object/from16 v31, v1

    goto :goto_1c

    :cond_28
    move/from16 v29, v3

    move-object/from16 v31, v18

    :goto_1c
    invoke-interface {v14}, LT/l;->J()V

    if-eqz v26, :cond_29

    invoke-static/range {v26 .. v26}, LG9/h;->c(Lmh/a;)Lmh/q;

    move-result-object v1

    move-object/from16 v32, v1

    goto :goto_1d

    :cond_29
    move-object/from16 v32, v18

    :goto_1d
    new-instance v1, LF9/B$a;

    invoke-direct {v1, v13}, LF9/B$a;-><init>(Z)V

    const v2, 0x26220eff

    const/16 v3, 0x36

    invoke-static {v2, v9, v1, v14, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v33

    new-instance v1, LF9/B$b;

    invoke-direct {v1, v0}, LF9/B$b;-><init>(Ljava/lang/String;)V

    const v2, 0x2b863d20

    invoke-static {v2, v9, v1, v14, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v34

    const v1, -0x6c679d83

    invoke-interface {v14, v1}, LT/l;->U(I)V

    const/high16 v1, 0x380000

    move/from16 v3, v29

    and-int/2addr v1, v3

    const/high16 v2, 0x100000

    if-ne v1, v2, :cond_2a

    move v1, v9

    goto :goto_1e

    :cond_2a
    const/4 v1, 0x0

    :goto_1e
    and-int/lit16 v2, v3, 0x1c00

    const/16 v4, 0x800

    if-ne v2, v4, :cond_2b

    goto :goto_1f

    :cond_2b
    const/4 v9, 0x0

    :goto_1f
    or-int/2addr v1, v9

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2c

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2d

    :cond_2c
    new-instance v2, LF9/y;

    invoke-direct {v2, v12, v13}, LF9/y;-><init>(Lmh/l;Z)V

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    move-object/from16 v18, v2

    check-cast v18, Lmh/a;

    invoke-interface {v14}, LT/l;->J()V

    and-int/lit8 v1, v3, 0x70

    or-int v1, v1, v19

    and-int/lit16 v2, v3, 0x380

    or-int v20, v1, v2

    shr-int/lit8 v1, v3, 0x12

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v21, v1, 0x6

    const/16 v22, 0x6878

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v1, 0x0

    move-object/from16 v29, v8

    move-wide v7, v1

    const/4 v9, 0x0

    const/4 v1, 0x0

    move-object/from16 v30, v14

    move-object v14, v1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v35, v0

    move-object/from16 v0, v28

    move-object/from16 v1, p1

    move-object/from16 v2, v23

    move-object/from16 v10, v31

    move-object/from16 v11, v33

    move-object/from16 v12, v32

    move-object/from16 v13, v34

    move/from16 v15, v27

    move-object/from16 v19, v30

    invoke-static/range {v0 .. v22}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-static {}, LT/o;->P()V

    :cond_2e
    move-object/from16 v3, v23

    move-object/from16 v5, v24

    move/from16 v6, v25

    move-object/from16 v8, v26

    move/from16 v9, v27

    move-object/from16 v1, v29

    move-object/from16 v10, v35

    :goto_20
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_2f

    new-instance v14, LF9/z;

    move-object v0, v14

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LF9/z;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_2f
    return-void
.end method

.method private static final e(Lmh/l;Z)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;IILT/l;I)LYg/J;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p12

    move/from16 v13, p11

    invoke-static/range {v1 .. v13}, LF9/B;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final g(LT/l;I)V
    .locals 9

    const v0, -0x1eff70d5

    invoke-interface {p0, v0}, LT/l;->r(I)LT/l;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.settings.UiSettingsListSelectedWidget (UiSettingsCheck.kt:53)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LN9/b;->a:LN9/b;

    invoke-virtual {v0}, LN9/b;->o()Ls9/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v1

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, p0, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$a;->f()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v1 .. v8}, LN/a0;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, LF9/A;

    invoke-direct {v0, p1}, LF9/A;-><init>(I)V

    invoke-interface {p0, v0}, LT/X0;->a(Lmh/p;)V

    :cond_4
    return-void
.end method

.method private static final h(ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, LT/L0;->a(I)I

    move-result p0

    invoke-static {p1, p0}, LF9/B;->g(LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic i(LT/l;I)V
    .locals 0

    invoke-static {p0, p1}, LF9/B;->g(LT/l;I)V

    return-void
.end method
