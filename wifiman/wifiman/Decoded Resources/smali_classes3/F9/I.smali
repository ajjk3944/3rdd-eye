.class public abstract LF9/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;IIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p15}, LF9/I;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;IIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/I;->d(Lmh/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;LT/l;III)V
    .locals 37

    move-object/from16 v15, p1

    move/from16 v13, p3

    move-object/from16 v12, p6

    move/from16 v11, p12

    move/from16 v10, p14

    const-string/jumbo v0, "title"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2056499d

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v11, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v11, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v11

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v11

    :goto_1
    and-int/lit8 v6, v10, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_5

    invoke-interface {v14, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v11, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :goto_5
    and-int/lit8 v8, v10, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v11, 0xc00

    if-nez v8, :cond_b

    invoke-interface {v14, v13}, LT/l;->c(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v5, v8

    :cond_b
    :goto_7
    and-int/lit8 v8, v10, 0x10

    if-eqz v8, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move-object/from16 v2, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v2, v11, 0x6000

    if-nez v2, :cond_c

    move-object/from16 v2, p4

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v5, v5, v16

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v5, v5, v17

    move/from16 v9, p5

    goto :goto_b

    :cond_f
    and-int v17, v11, v17

    move/from16 v9, p5

    if-nez v17, :cond_11

    invoke-interface {v14, v9}, LT/l;->g(F)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v5, v5, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v5, v5, v19

    goto :goto_d

    :cond_12
    and-int v18, v11, v19

    if-nez v18, :cond_14

    invoke-interface {v14, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v5, v5, v18

    :cond_14
    :goto_d
    and-int/lit16 v7, v10, 0x80

    const/high16 v19, 0xc00000

    if-eqz v7, :cond_15

    or-int v5, v5, v19

    move-object/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v19, v11, v19

    move-object/from16 v0, p7

    if-nez v19, :cond_17

    invoke-interface {v14, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v5, v5, v20

    :cond_17
    :goto_f
    and-int/lit16 v3, v10, 0x100

    const/high16 v21, 0x6000000

    if-eqz v3, :cond_18

    or-int v5, v5, v21

    move/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v22, v11, v21

    move/from16 v0, p8

    if-nez v22, :cond_1a

    invoke-interface {v14, v0}, LT/l;->c(Z)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v22, 0x2000000

    :goto_10
    or-int v5, v5, v22

    :cond_1a
    :goto_11
    and-int/lit16 v0, v10, 0x200

    const/high16 v22, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v22

    move-object/from16 v2, p9

    goto :goto_13

    :cond_1b
    and-int v22, v11, v22

    move-object/from16 v2, p9

    if-nez v22, :cond_1d

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1c

    const/high16 v22, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v22, 0x10000000

    :goto_12
    or-int v5, v5, v22

    :cond_1d
    :goto_13
    and-int/lit16 v2, v10, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v22, p13, 0x6

    :goto_14
    move/from16 v4, v22

    goto :goto_16

    :cond_1e
    and-int/lit8 v22, p13, 0x6

    move-object/from16 v4, p10

    if-nez v22, :cond_20

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1f

    const/16 v22, 0x4

    goto :goto_15

    :cond_1f
    const/16 v22, 0x2

    :goto_15
    or-int v22, p13, v22

    goto :goto_14

    :cond_20
    move/from16 v4, p13

    :goto_16
    const v22, 0x12492493

    and-int v9, v5, v22

    const v10, 0x12492492

    if-ne v9, v10, :cond_22

    and-int/lit8 v9, v4, 0x3

    const/4 v10, 0x2

    if-ne v9, v10, :cond_22

    invoke-interface {v14}, LT/l;->v()Z

    move-result v9

    if-nez v9, :cond_21

    goto :goto_17

    :cond_21
    invoke-interface {v14}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v33, v14

    goto/16 :goto_24

    :cond_22
    :goto_17
    if-eqz v1, :cond_23

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v10, v1

    goto :goto_18

    :cond_23
    move-object/from16 v10, p0

    :goto_18
    if-eqz v6, :cond_24

    const/16 v23, 0x0

    goto :goto_19

    :cond_24
    move-object/from16 v23, p2

    :goto_19
    if-eqz v8, :cond_25

    const/16 v24, 0x0

    goto :goto_1a

    :cond_25
    move-object/from16 v24, p4

    :goto_1a
    if-eqz v16, :cond_26

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move/from16 v25, v1

    goto :goto_1b

    :cond_26
    move/from16 v25, p5

    :goto_1b
    if-eqz v7, :cond_27

    const/16 v26, 0x0

    goto :goto_1c

    :cond_27
    move-object/from16 v26, p7

    :goto_1c
    if-eqz v3, :cond_28

    const/16 v27, 0x1

    goto :goto_1d

    :cond_28
    move/from16 v27, p8

    :goto_1d
    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_1e

    :cond_29
    move-object/from16 v0, p9

    :goto_1e
    if-eqz v2, :cond_2a

    const/4 v7, 0x0

    goto :goto_1f

    :cond_2a
    move-object/from16 v7, p10

    :goto_1f
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2b

    const-string/jumbo v1, "com.ui.core.ui.component.settings.UiSettingsCheckbox (UiSettingsCheckbox.kt:37)"

    const v2, 0x2056499d

    invoke-static {v2, v5, v4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2b
    const-string/jumbo v1, "ui_settings_checkbox"

    invoke-static {v10, v1, v13}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v19

    const v1, -0x736bebab

    invoke-interface {v14, v1}, LT/l;->U(I)V

    if-eqz v24, :cond_2c

    shr-int/lit8 v1, v5, 0xc

    and-int/lit8 v6, v1, 0x7e

    const/16 v16, 0x4

    const-wide/16 v3, 0x0

    move-object/from16 v1, v24

    move/from16 v2, v25

    move v9, v5

    move-object v5, v14

    move-object v8, v7

    move/from16 v7, v16

    invoke-static/range {v1 .. v7}, LG9/i;->a(Ls9/a;FJLT/l;II)Lmh/q;

    move-result-object v1

    move-object/from16 v29, v1

    goto :goto_20

    :cond_2c
    move v9, v5

    move-object v8, v7

    const/16 v29, 0x0

    :goto_20
    invoke-interface {v14}, LT/l;->J()V

    if-eqz v26, :cond_2d

    invoke-static/range {v26 .. v26}, LG9/h;->c(Lmh/a;)Lmh/q;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_21

    :cond_2d
    const/16 v30, 0x0

    :goto_21
    new-instance v1, LF9/I$a;

    invoke-direct {v1, v8, v13}, LF9/I$a;-><init>(Ljava/lang/String;Z)V

    const/16 v2, 0x36

    const v3, -0x5090ecde

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, v14, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v31

    new-instance v1, LF9/I$b;

    invoke-direct {v1, v0}, LF9/I$b;-><init>(Ljava/lang/String;)V

    const v3, -0x7ba35d5f

    invoke-static {v3, v4, v1, v14, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v32

    const v1, -0x736bfc56

    invoke-interface {v14, v1}, LT/l;->U(I)V

    const/high16 v1, 0x380000

    and-int/2addr v1, v9

    const/high16 v2, 0x100000

    if-ne v1, v2, :cond_2e

    move v1, v4

    goto :goto_22

    :cond_2e
    const/4 v1, 0x0

    :goto_22
    and-int/lit16 v2, v9, 0x1c00

    const/16 v3, 0x800

    if-ne v2, v3, :cond_2f

    move v2, v4

    goto :goto_23

    :cond_2f
    const/4 v2, 0x0

    :goto_23
    or-int/2addr v1, v2

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_30

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_31

    :cond_30
    new-instance v2, LF9/G;

    invoke-direct {v2, v12, v13}, LF9/G;-><init>(Lmh/l;Z)V

    invoke-interface {v14, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_31
    move-object/from16 v18, v2

    check-cast v18, Lmh/a;

    invoke-interface {v14}, LT/l;->J()V

    and-int/lit8 v1, v9, 0x70

    or-int v1, v1, v21

    and-int/lit16 v2, v9, 0x380

    or-int v20, v1, v2

    shr-int/lit8 v1, v9, 0x12

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v21, v1, 0x6

    const/16 v22, 0x6878

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v1, 0x0

    move-object/from16 v28, v8

    move-wide v7, v1

    const/4 v9, 0x0

    const/4 v1, 0x0

    move-object/from16 v33, v14

    move-object v14, v1

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v34, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    move-object/from16 v2, v23

    move-object/from16 v35, v10

    move-object/from16 v10, v29

    move-object/from16 v11, v31

    move-object/from16 v12, v30

    move-object/from16 v13, v32

    move/from16 v15, v27

    move-object/from16 v19, v33

    invoke-static/range {v0 .. v22}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-static {}, LT/o;->P()V

    :cond_32
    move-object/from16 v3, v23

    move-object/from16 v5, v24

    move/from16 v6, v25

    move-object/from16 v8, v26

    move/from16 v9, v27

    move-object/from16 v11, v28

    move-object/from16 v10, v34

    move-object/from16 v1, v35

    :goto_24
    invoke-interface/range {v33 .. v33}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_33

    new-instance v14, LF9/H;

    move-object v0, v14

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v36, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LF9/H;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;III)V

    move-object/from16 v0, v36

    invoke-interface {v15, v0}, LT/X0;->a(Lmh/p;)V

    :cond_33
    return-void
.end method

.method private static final d(Lmh/l;Z)LYg/J;
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

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;IIILT/l;I)LYg/J;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, LT/L0;->a(I)I

    move-result v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p14

    move/from16 v15, p13

    invoke-static/range {v1 .. v15}, LF9/I;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
