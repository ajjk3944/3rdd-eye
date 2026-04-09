.class public abstract LF9/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ls9/b;JZLmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LF9/r0;->k(Ls9/b;JZLmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/r0;->j(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;IIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, LF9/r0;->m(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;IIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmh/a;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/r0;->l(Lmh/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;IIILT/l;I)LYg/J;
    .locals 1

    invoke-static/range {p0 .. p19}, LF9/r0;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;IIILT/l;I)LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;LT/l;III)V
    .locals 39

    move-object/from16 v15, p1

    move/from16 v12, p16

    move/from16 v10, p17

    move/from16 v2, p18

    const-string/jumbo v0, "title"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3b475ef9

    move-object/from16 v1, p15

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v6, v12, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v12, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v12

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v12

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v12, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v2, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v7, v7, v16

    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v12, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v7, v7, v19

    :goto_7
    and-int/lit8 v19, v2, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v7, v7, 0x6000

    :cond_c
    move-object/from16 v9, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v9, v12, 0x6000

    if-nez v9, :cond_c

    move-object/from16 v9, p4

    invoke-interface {v1, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v7, v7, v23

    :goto_9
    and-int/lit8 v23, v2, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v7, v7, v24

    move/from16 v11, p5

    goto :goto_b

    :cond_f
    and-int v24, v12, v24

    move/from16 v11, p5

    if-nez v24, :cond_11

    invoke-interface {v1, v11}, LT/l;->i(I)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v25, 0x10000

    :goto_a
    or-int v7, v7, v25

    :cond_11
    :goto_b
    and-int/lit8 v25, v2, 0x40

    const/high16 v26, 0x180000

    if-eqz v25, :cond_12

    or-int v7, v7, v26

    move-object/from16 v13, p6

    goto :goto_d

    :cond_12
    and-int v26, v12, v26

    move-object/from16 v13, p6

    if-nez v26, :cond_14

    invoke-interface {v1, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_13

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v27, 0x80000

    :goto_c
    or-int v7, v7, v27

    :cond_14
    :goto_d
    and-int/lit16 v14, v2, 0x80

    const/high16 v28, 0xc00000

    if-eqz v14, :cond_15

    or-int v7, v7, v28

    move-object/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v28, v12, v28

    move-object/from16 v0, p7

    if-nez v28, :cond_17

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/high16 v29, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v29, 0x400000

    :goto_e
    or-int v7, v7, v29

    :cond_17
    :goto_f
    and-int/lit16 v0, v2, 0x100

    const/high16 v29, 0x6000000

    if-eqz v0, :cond_18

    or-int v7, v7, v29

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v30, v12, v29

    move-object/from16 v4, p8

    if-nez v30, :cond_1a

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v30, 0x2000000

    :goto_10
    or-int v7, v7, v30

    :cond_1a
    :goto_11
    and-int/lit16 v4, v2, 0x200

    const/high16 v30, 0x30000000

    if-eqz v4, :cond_1b

    or-int v7, v7, v30

    move/from16 v5, p9

    goto :goto_13

    :cond_1b
    and-int v30, v12, v30

    move/from16 v5, p9

    if-nez v30, :cond_1d

    invoke-interface {v1, v5}, LT/l;->c(Z)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_12
    or-int v7, v7, v30

    :cond_1d
    :goto_13
    and-int/lit16 v5, v2, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v16, v10, 0x6

    move-object/from16 v6, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v30, v10, 0x6

    move-object/from16 v6, p10

    if-nez v30, :cond_20

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v16, 0x4

    goto :goto_14

    :cond_1f
    const/16 v16, 0x2

    :goto_14
    or-int v16, v10, v16

    goto :goto_15

    :cond_20
    move/from16 v16, v10

    :goto_15
    and-int/lit16 v6, v2, 0x800

    if-eqz v6, :cond_22

    or-int/lit8 v16, v16, 0x30

    :cond_21
    :goto_16
    move/from16 v9, v16

    goto :goto_18

    :cond_22
    and-int/lit8 v30, v10, 0x30

    move-object/from16 v9, p11

    if-nez v30, :cond_21

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_23

    const/16 v22, 0x20

    goto :goto_17

    :cond_23
    const/16 v22, 0x10

    :goto_17
    or-int v16, v16, v22

    goto :goto_16

    :goto_18
    and-int/lit16 v11, v2, 0x1000

    if-eqz v11, :cond_25

    or-int/lit16 v9, v9, 0x180

    :cond_24
    move-object/from16 v12, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v12, v10, 0x180

    if-nez v12, :cond_24

    move-object/from16 v12, p12

    invoke-interface {v1, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_26

    const/16 v26, 0x100

    goto :goto_19

    :cond_26
    const/16 v26, 0x80

    :goto_19
    or-int v9, v9, v26

    :goto_1a
    and-int/lit16 v12, v2, 0x2000

    if-eqz v12, :cond_28

    or-int/lit16 v9, v9, 0xc00

    :cond_27
    move-object/from16 v13, p13

    goto :goto_1b

    :cond_28
    and-int/lit16 v13, v10, 0xc00

    if-nez v13, :cond_27

    move-object/from16 v13, p13

    invoke-interface {v1, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_29

    move/from16 v17, v18

    :cond_29
    or-int v9, v9, v17

    :goto_1b
    and-int/lit16 v13, v2, 0x4000

    if-eqz v13, :cond_2b

    or-int/lit16 v9, v9, 0x6000

    :cond_2a
    move-object/from16 v2, p14

    goto :goto_1c

    :cond_2b
    and-int/lit16 v2, v10, 0x6000

    if-nez v2, :cond_2a

    move-object/from16 v2, p14

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2c

    move/from16 v20, v21

    :cond_2c
    or-int v9, v9, v20

    :goto_1c
    const v16, 0x12492493

    and-int v2, v7, v16

    const v10, 0x12492492

    if-ne v2, v10, :cond_2e

    and-int/lit16 v2, v9, 0x2493

    const/16 v10, 0x2492

    if-ne v2, v10, :cond_2e

    invoke-interface {v1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2d

    goto :goto_1d

    :cond_2d
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v28, v1

    move-object/from16 v1, p0

    goto/16 :goto_2c

    :cond_2e
    :goto_1d
    if-eqz v3, :cond_2f

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v24, v2

    goto :goto_1e

    :cond_2f
    move-object/from16 v24, p0

    :goto_1e
    const/4 v2, 0x0

    if-eqz v8, :cond_30

    move-object/from16 v26, v2

    goto :goto_1f

    :cond_30
    move-object/from16 v26, p2

    :goto_1f
    if-eqz v19, :cond_31

    move-object/from16 v27, v2

    goto :goto_20

    :cond_31
    move-object/from16 v27, p4

    :goto_20
    if-eqz v23, :cond_32

    const v3, 0x7fffffff

    move/from16 v23, v3

    goto :goto_21

    :cond_32
    move/from16 v23, p5

    :goto_21
    if-eqz v25, :cond_33

    move-object/from16 v25, v2

    goto :goto_22

    :cond_33
    move-object/from16 v25, p6

    :goto_22
    if-eqz v14, :cond_34

    move-object/from16 v30, v2

    goto :goto_23

    :cond_34
    move-object/from16 v30, p7

    :goto_23
    if-eqz v0, :cond_35

    sget-object v0, LF9/k;->START:LF9/k;

    move-object/from16 v31, v0

    goto :goto_24

    :cond_35
    move-object/from16 v31, p8

    :goto_24
    const/4 v0, 0x1

    if-eqz v4, :cond_36

    move/from16 v32, v0

    goto :goto_25

    :cond_36
    move/from16 v32, p9

    :goto_25
    if-eqz v5, :cond_37

    move-object v10, v2

    goto :goto_26

    :cond_37
    move-object/from16 v10, p10

    :goto_26
    if-eqz v6, :cond_38

    move-object/from16 v33, v2

    goto :goto_27

    :cond_38
    move-object/from16 v33, p11

    :goto_27
    if-eqz v11, :cond_39

    move-object/from16 v34, v2

    goto :goto_28

    :cond_39
    move-object/from16 v34, p12

    :goto_28
    if-eqz v12, :cond_3a

    move-object/from16 v35, v2

    goto :goto_29

    :cond_3a
    move-object/from16 v35, p13

    :goto_29
    if-eqz v13, :cond_3b

    move-object/from16 v36, v2

    goto :goto_2a

    :cond_3b
    move-object/from16 v36, p14

    :goto_2a
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_3c

    const-string/jumbo v3, "com.ui.core.ui.component.settings.UiSettingsTextValue (UiSettingsTextValue.kt:147)"

    const v4, -0x3b475ef9

    invoke-static {v4, v7, v9, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_3c
    const v3, -0x659161fd

    invoke-interface {v1, v3}, LT/l;->U(I)V

    if-eqz v36, :cond_3d

    shr-int/lit8 v3, v9, 0xc

    and-int/lit8 v3, v3, 0xe

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 p4, v36

    move/from16 p5, v5

    move-wide/from16 p6, v8

    move-object/from16 p8, v1

    move/from16 p9, v3

    move/from16 p10, v4

    invoke-static/range {p4 .. p10}, LG9/i;->a(Ls9/a;FJLT/l;II)Lmh/q;

    move-result-object v3

    move-object v12, v3

    goto :goto_2b

    :cond_3d
    move-object v12, v2

    :goto_2b
    invoke-interface {v1}, LT/l;->J()V

    if-eqz v33, :cond_3e

    invoke-static/range {v33 .. v33}, LG9/h;->c(Lmh/a;)Lmh/q;

    move-result-object v2

    :cond_3e
    move-object/from16 v19, v2

    new-instance v2, LF9/r0$a;

    move-object/from16 p4, v2

    move-object/from16 p5, v27

    move-object/from16 p6, v30

    move-object/from16 p7, v25

    move-object/from16 p8, v31

    move/from16 p9, v32

    move-object/from16 p10, v34

    move-object/from16 p11, p3

    move-object/from16 p12, v35

    move/from16 p13, v23

    invoke-direct/range {p4 .. p13}, LF9/r0$a;-><init>(Lm0/v0;Lm0/v0;Ls9/b;LF9/k;ZLmh/a;Ljava/lang/String;Lmh/a;I)V

    const/16 v3, 0x36

    const v4, 0x5eea9122

    invoke-static {v4, v0, v2, v1, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    new-instance v2, LF9/r0$b;

    invoke-direct {v2, v10}, LF9/r0$b;-><init>(Ljava/lang/String;)V

    const v4, 0x6c7f3c83

    invoke-static {v4, v0, v2, v1, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    and-int/lit8 v0, v7, 0xe

    or-int v0, v0, v29

    and-int/lit8 v2, v7, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v7, 0x380

    or-int v20, v0, v2

    shr-int/lit8 v0, v7, 0x15

    and-int/lit16 v0, v0, 0x380

    const v2, 0x30006

    or-int v21, v0, v2

    const/16 v22, 0x6878

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v24

    move-object/from16 v28, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v29, v10

    move-object v10, v12

    move-object/from16 v12, v19

    move/from16 v15, v32

    move-object/from16 v19, v28

    invoke-static/range {v0 .. v22}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-static {}, LT/o;->P()V

    :cond_3f
    move/from16 v6, v23

    move-object/from16 v1, v24

    move-object/from16 v7, v25

    move-object/from16 v3, v26

    move-object/from16 v5, v27

    move-object/from16 v11, v29

    move-object/from16 v8, v30

    move-object/from16 v9, v31

    move/from16 v10, v32

    move-object/from16 v12, v33

    move-object/from16 v13, v34

    move-object/from16 v14, v35

    move-object/from16 v15, v36

    :goto_2c
    invoke-interface/range {v28 .. v28}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_40

    new-instance v2, LF9/m0;

    move-object v0, v2

    move-object/from16 v37, v2

    move-object/from16 v2, p1

    move-object/from16 v38, v4

    move-object/from16 v4, p3

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, LF9/m0;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;III)V

    move-object/from16 v1, v37

    move-object/from16 v0, v38

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_40
    return-void
.end method

.method private static final g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;IIILT/l;I)LYg/J;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v18, p17

    move-object/from16 v15, p18

    or-int/lit8 v16, p15, 0x1

    invoke-static/range {v16 .. v16}, LT/L0;->a(I)I

    move-result v16

    invoke-static/range {p16 .. p16}, LT/L0;->a(I)I

    move-result v17

    invoke-static/range {v0 .. v18}, LF9/r0;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/v0;ILs9/b;Lm0/v0;LF9/k;ZLjava/lang/String;Lmh/a;Lmh/a;Lmh/a;Ls9/a;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;ILT/l;II)V
    .locals 29

    move-object/from16 v2, p1

    move/from16 v3, p8

    const-string/jumbo v0, "text"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x37f4f15b

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v13, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v3

    :goto_1
    and-int/lit8 v6, p9, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_5

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    move-wide/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v3, 0x180

    move-wide/from16 v11, p2

    if-nez v6, :cond_8

    invoke-interface {v13, v11, v12}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_8
    :goto_5
    and-int/lit8 v6, p9, 0x8

    if-eqz v6, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move/from16 v8, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v3, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p4

    invoke-interface {v13, v8}, LT/l;->c(Z)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_6

    :cond_b
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v5, v9

    :goto_7
    and-int/lit8 v9, p9, 0x10

    if-eqz v9, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move-object/from16 v14, p5

    goto :goto_9

    :cond_d
    and-int/lit16 v14, v3, 0x6000

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-interface {v13, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_8

    :cond_e
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v5, v15

    :goto_9
    and-int/lit8 v15, p9, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_10

    or-int v5, v5, v16

    :cond_f
    move/from16 v15, p6

    goto :goto_b

    :cond_10
    and-int v15, v3, v16

    if-nez v15, :cond_f

    move/from16 v15, p6

    invoke-interface {v13, v15}, LT/l;->i(I)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v5, v5, v16

    :goto_b
    const v16, 0x12493

    and-int v7, v5, v16

    const v10, 0x12492

    if-ne v7, v10, :cond_13

    invoke-interface {v13}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v13}, LT/l;->C()V

    move-object v1, v4

    move v5, v8

    move-object/from16 v27, v13

    move-object v6, v14

    goto/16 :goto_11

    :cond_13
    :goto_c
    if-eqz v1, :cond_14

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v25, v1

    goto :goto_d

    :cond_14
    move-object/from16 v25, v4

    :goto_d
    const/4 v1, 0x1

    if-eqz v6, :cond_15

    move/from16 v26, v1

    goto :goto_e

    :cond_15
    move/from16 v26, v8

    :goto_e
    if-eqz v9, :cond_16

    const/4 v4, 0x0

    move-object v14, v4

    :cond_16
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, -0x1

    const-string/jumbo v6, "com.ui.core.ui.component.settings.ValueText (UiSettingsTextValue.kt:239)"

    invoke-static {v0, v5, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_17
    const/4 v0, 0x0

    if-eqz v26, :cond_18

    if-eqz v14, :cond_18

    move/from16 v18, v1

    goto :goto_f

    :cond_18
    move/from16 v18, v0

    :goto_f
    const v4, 0x4f1563d1

    invoke-interface {v13, v4}, LT/l;->U(I)V

    const v4, 0xe000

    and-int/2addr v4, v5

    const/16 v6, 0x4000

    if-ne v4, v6, :cond_19

    goto :goto_10

    :cond_19
    move v1, v0

    :goto_10
    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_1a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_1b

    :cond_1a
    new-instance v4, LF9/n0;

    invoke-direct {v4, v14}, LF9/n0;-><init>(Lmh/a;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v21, v4

    check-cast v21, Lmh/a;

    invoke-interface {v13}, LT/l;->J()V

    const/16 v22, 0x6

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v25

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    const-string/jumbo v4, "value_text"

    invoke-static {v1, v4}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v4, 0x10

    invoke-static {v4}, LY0/w;->g(I)J

    move-result-wide v6

    move v8, v5

    move-wide v4, v6

    sget-object v6, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v6}, LQ0/A$a;->e()LQ0/A;

    move-result-object v7

    sget-object v6, LW0/j;->b:LW0/j$a;

    invoke-virtual {v6}, LW0/j$a;->b()I

    move-result v6

    invoke-static {v0}, LY0/w;->g(I)J

    move-result-wide v9

    sget-object v0, LW0/t;->a:LW0/t$a;

    invoke-virtual {v0}, LW0/t$a;->b()I

    move-result v0

    move v15, v0

    invoke-static {v6}, LW0/j;->h(I)LW0/j;

    move-result-object v0

    move-object v12, v0

    shr-int/lit8 v0, v8, 0x3

    and-int/lit8 v0, v0, 0xe

    const v6, 0xc30c00

    or-int/2addr v0, v6

    and-int/lit16 v6, v8, 0x380

    or-int v22, v0, v6

    shr-int/lit8 v0, v8, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v23, v0, 0x30

    const v24, 0x1d550

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v27, v13

    move-object/from16 v28, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    move/from16 v17, p6

    move-object/from16 v21, v27

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    move-object/from16 v1, v25

    move/from16 v5, v26

    move-object/from16 v6, v28

    :goto_11
    invoke-interface/range {v27 .. v27}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1d

    new-instance v11, LF9/o0;

    move-object v0, v11

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LF9/o0;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;III)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1d
    return-void
.end method

.method public static final i(Ls9/b;JZLmh/a;LT/l;II)V
    .locals 17

    move/from16 v6, p6

    const v0, 0x59c491f3

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

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
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-wide/from16 v14, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    move-wide/from16 v14, p1

    if-nez v5, :cond_5

    invoke-interface {v1, v14, v15}, LT/l;->j(J)Z

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
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p3

    invoke-interface {v1, v7}, LT/l;->c(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    const/16 v9, 0x800

    if-eqz v8, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v10, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    move v11, v9

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v2, v3

    move v4, v7

    move-object v5, v10

    goto/16 :goto_e

    :cond_d
    :goto_8
    if-eqz v2, :cond_e

    sget-object v2, LF9/Y;->a:LF9/Y;

    invoke-virtual {v2}, LF9/Y;->a()Ls9/b;

    move-result-object v2

    goto :goto_9

    :cond_e
    move-object v2, v3

    :goto_9
    const/4 v3, 0x1

    if-eqz v5, :cond_f

    move v5, v3

    goto :goto_a

    :cond_f
    move v5, v7

    :goto_a
    if-eqz v8, :cond_10

    const/4 v7, 0x0

    move-object v13, v7

    goto :goto_b

    :cond_10
    move-object v13, v10

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_11

    const/4 v7, -0x1

    const-string/jumbo v8, "com.ui.core.ui.component.settings.ValueTextIcon (UiSettingsTextValue.kt:221)"

    invoke-static {v0, v4, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_11
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v0, 0x0

    if-eqz v5, :cond_12

    if-eqz v13, :cond_12

    move v10, v3

    goto :goto_c

    :cond_12
    move v10, v0

    :goto_c
    const v8, 0xef9b2ea

    invoke-interface {v1, v8}, LT/l;->U(I)V

    and-int/lit16 v8, v4, 0x1c00

    if-ne v8, v9, :cond_13

    goto :goto_d

    :cond_13
    move v3, v0

    :goto_d
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v3, :cond_14

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_15

    :cond_14
    new-instance v0, LF9/p0;

    invoke-direct {v0, v13}, LF9/p0;-><init>(Lmh/a;)V

    invoke-interface {v1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v11, v0

    check-cast v11, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    const/4 v0, 0x6

    const/4 v3, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v12, v1

    move-object/from16 v16, v13

    move v13, v0

    move v14, v3

    invoke-static/range {v7 .. v14}, LM9/i;->f(Landroidx/compose/ui/e;Ly/m;FZLmh/a;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v0

    const-string/jumbo v3, "value_text_icon"

    invoke-static {v0, v3}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-static/range {p1 .. p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v9

    and-int/lit8 v0, v4, 0xe

    shl-int/lit8 v3, v4, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int v12, v0, v3

    const/4 v13, 0x4

    const/4 v10, 0x0

    move-object v7, v2

    move-object v11, v1

    invoke-static/range {v7 .. v13}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    :cond_16
    move v4, v5

    move-object/from16 v5, v16

    :goto_e
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v9, LF9/q0;

    move-object v0, v9

    move-object v1, v2

    move-wide/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LF9/q0;-><init>(Ls9/b;JZLmh/a;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_17
    return-void
.end method

.method private static final j(Lmh/a;)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Ls9/b;JZLmh/a;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LF9/r0;->i(Ls9/b;JZLmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final l(Lmh/a;)LYg/J;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;IIILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, LF9/r0;->h(Landroidx/compose/ui/e;Ljava/lang/String;JZLmh/a;ILT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
