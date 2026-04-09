.class public abstract LF9/M;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LD9/o;)LYg/J;
    .locals 0

    invoke-static {p0}, LF9/M;->d(LD9/o;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;IIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p15}, LF9/M;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;IIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;LT/l;III)V
    .locals 36

    move-object/from16 v15, p1

    move-object/from16 v14, p4

    move-object/from16 v13, p5

    move-object/from16 v12, p6

    move-object/from16 v11, p7

    move/from16 v10, p12

    move/from16 v9, p14

    const-string/jumbo v0, "title"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "items"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "itemFormatter"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onItemSelected"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x17298baf

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v8

    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v10, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v10, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v10

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v10

    :goto_1
    and-int/lit8 v6, v9, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v10, 0x30

    if-nez v6, :cond_5

    invoke-interface {v8, v15}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v6, v9, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v8, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    :goto_5
    and-int/lit8 v16, v9, 0x8

    if-eqz v16, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move-object/from16 v2, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v2, v10, 0xc00

    if-nez v2, :cond_9

    move-object/from16 v2, p3

    invoke-interface {v8, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v17, 0x800

    goto :goto_6

    :cond_b
    const/16 v17, 0x400

    :goto_6
    or-int v5, v5, v17

    :goto_7
    and-int/lit8 v17, v9, 0x10

    if-eqz v17, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_a

    :cond_c
    and-int/lit16 v0, v10, 0x6000

    if-nez v0, :cond_f

    const v0, 0x8000

    and-int/2addr v0, v10

    if-nez v0, :cond_d

    invoke-interface {v8, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_8

    :cond_d
    invoke-interface {v8, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    :goto_8
    if-eqz v0, :cond_e

    const/16 v0, 0x4000

    goto :goto_9

    :cond_e
    const/16 v0, 0x2000

    :goto_9
    or-int/2addr v5, v0

    :cond_f
    :goto_a
    and-int/lit8 v0, v9, 0x20

    const/high16 v18, 0x30000

    if-eqz v0, :cond_10

    or-int v5, v5, v18

    goto :goto_c

    :cond_10
    and-int v0, v10, v18

    if-nez v0, :cond_12

    invoke-interface {v8, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const/high16 v0, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v0, 0x10000

    :goto_b
    or-int/2addr v5, v0

    :cond_12
    :goto_c
    and-int/lit8 v0, v9, 0x40

    const/high16 v18, 0x180000

    if-eqz v0, :cond_13

    or-int v5, v5, v18

    goto :goto_f

    :cond_13
    and-int v0, v10, v18

    if-nez v0, :cond_16

    const/high16 v0, 0x200000

    and-int/2addr v0, v10

    if-nez v0, :cond_14

    invoke-interface {v8, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_d

    :cond_14
    invoke-interface {v8, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    :goto_d
    if-eqz v0, :cond_15

    const/high16 v0, 0x100000

    goto :goto_e

    :cond_15
    const/high16 v0, 0x80000

    :goto_e
    or-int/2addr v5, v0

    :cond_16
    :goto_f
    and-int/lit16 v0, v9, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_17

    or-int v5, v5, v18

    goto :goto_11

    :cond_17
    and-int v0, v10, v18

    if-nez v0, :cond_19

    invoke-interface {v8, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    const/high16 v0, 0x800000

    goto :goto_10

    :cond_18
    const/high16 v0, 0x400000

    :goto_10
    or-int/2addr v5, v0

    :cond_19
    :goto_11
    and-int/lit16 v0, v9, 0x100

    const/high16 v19, 0x6000000

    if-eqz v0, :cond_1a

    or-int v5, v5, v19

    move-object/from16 v3, p8

    goto :goto_13

    :cond_1a
    and-int v18, v10, v19

    move-object/from16 v3, p8

    if-nez v18, :cond_1c

    invoke-interface {v8, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1b

    const/high16 v20, 0x4000000

    goto :goto_12

    :cond_1b
    const/high16 v20, 0x2000000

    :goto_12
    or-int v5, v5, v20

    :cond_1c
    :goto_13
    and-int/lit16 v2, v9, 0x200

    const/high16 v20, 0x30000000

    if-eqz v2, :cond_1d

    or-int v5, v5, v20

    move/from16 v3, p9

    goto :goto_15

    :cond_1d
    and-int v20, v10, v20

    move/from16 v3, p9

    if-nez v20, :cond_1f

    invoke-interface {v8, v3}, LT/l;->c(Z)Z

    move-result v20

    if-eqz v20, :cond_1e

    const/high16 v20, 0x20000000

    goto :goto_14

    :cond_1e
    const/high16 v20, 0x10000000

    :goto_14
    or-int v5, v5, v20

    :cond_1f
    :goto_15
    and-int/lit16 v3, v9, 0x400

    if-eqz v3, :cond_20

    or-int/lit8 v20, p13, 0x6

    :goto_16
    move/from16 v4, v20

    goto :goto_18

    :cond_20
    and-int/lit8 v20, p13, 0x6

    move-object/from16 v4, p10

    if-nez v20, :cond_22

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_21

    const/16 v20, 0x4

    goto :goto_17

    :cond_21
    const/16 v20, 0x2

    :goto_17
    or-int v20, p13, v20

    goto :goto_16

    :cond_22
    move/from16 v4, p13

    :goto_18
    const v20, 0x12492493

    and-int v7, v5, v20

    const v9, 0x12492492

    if-ne v7, v9, :cond_24

    and-int/lit8 v7, v4, 0x3

    const/4 v9, 0x2

    if-ne v7, v9, :cond_24

    invoke-interface {v8}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_23

    goto :goto_19

    :cond_23
    invoke-interface {v8}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v33, v8

    goto/16 :goto_23

    :cond_24
    :goto_19
    if-eqz v1, :cond_25

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v23, v1

    goto :goto_1a

    :cond_25
    move-object/from16 v23, p0

    :goto_1a
    const/4 v9, 0x0

    if-eqz v6, :cond_26

    move-object/from16 v24, v9

    goto :goto_1b

    :cond_26
    move-object/from16 v24, p2

    :goto_1b
    if-eqz v16, :cond_27

    move-object/from16 v25, v9

    goto :goto_1c

    :cond_27
    move-object/from16 v25, p3

    :goto_1c
    if-eqz v0, :cond_28

    move-object/from16 v26, v9

    goto :goto_1d

    :cond_28
    move-object/from16 v26, p8

    :goto_1d
    const/4 v0, 0x1

    if-eqz v2, :cond_29

    move/from16 v27, v0

    goto :goto_1e

    :cond_29
    move/from16 v27, p9

    :goto_1e
    if-eqz v3, :cond_2a

    move-object v7, v9

    goto :goto_1f

    :cond_2a
    move-object/from16 v7, p10

    :goto_1f
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2b

    const-string/jumbo v1, "com.ui.core.ui.component.settings.UiSettingsDropdown (UiSettingsDropdown.kt:47)"

    const v2, 0x17298baf

    invoke-static {v2, v5, v4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2b
    const/4 v1, 0x0

    invoke-static {v9, v8, v1, v0}, LD9/k;->v(LD9/p;LT/l;II)LD9/o;

    move-result-object v6

    sget-object v1, LF9/J;->a:LF9/J;

    const/4 v2, 0x6

    invoke-virtual {v1, v8, v2}, LF9/J;->a(LT/l;I)Lz/N;

    move-result-object v28

    const v1, -0x1305a52

    invoke-interface {v8, v1}, LT/l;->U(I)V

    if-eqz v24, :cond_2c

    shr-int/lit8 v1, v5, 0x6

    and-int/lit8 v16, v1, 0xe

    const/16 v17, 0x6

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object/from16 v1, v24

    move/from16 v21, v5

    move-object v5, v8

    move-object/from16 p0, v6

    move/from16 v6, v16

    move-object v9, v7

    move/from16 v7, v17

    invoke-static/range {v1 .. v7}, LG9/i;->a(Ls9/a;FJLT/l;II)Lmh/q;

    move-result-object v1

    move-object/from16 v29, v1

    goto :goto_20

    :cond_2c
    move/from16 v21, v5

    move-object/from16 p0, v6

    move-object v9, v7

    const/16 v29, 0x0

    :goto_20
    invoke-interface {v8}, LT/l;->J()V

    if-eqz v26, :cond_2d

    invoke-static/range {v26 .. v26}, LG9/h;->c(Lmh/a;)Lmh/q;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_21

    :cond_2d
    const/16 v30, 0x0

    :goto_21
    const v1, -0x12f5331

    invoke-interface {v8, v1}, LT/l;->U(I)V

    if-eqz v9, :cond_2e

    new-instance v1, LF9/M$a;

    invoke-direct {v1, v9}, LF9/M$a;-><init>(Ljava/lang/String;)V

    const/16 v2, 0x36

    const v3, -0x50803094

    invoke-static {v3, v0, v1, v8, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    move-object/from16 v31, v1

    goto :goto_22

    :cond_2e
    const/16 v31, 0x0

    :goto_22
    invoke-interface {v8}, LT/l;->J()V

    new-instance v7, LF9/M$b;

    move v6, v0

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move/from16 v4, v21

    move-object/from16 v5, p4

    move-object/from16 p2, v9

    move v9, v6

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v6}, LF9/M$b;-><init>(LD9/o;Lmh/q;Ljava/lang/Object;ILCi/c;Lmh/l;)V

    const/16 v0, 0x36

    const v1, 0x51acc874

    invoke-static {v1, v9, v7, v8, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v32

    const v0, -0x1306d6d

    invoke-interface {v8, v0}, LT/l;->U(I)V

    move-object/from16 v0, p0

    invoke-interface {v8, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2f

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_30

    :cond_2f
    new-instance v2, LF9/K;

    invoke-direct {v2, v0}, LF9/K;-><init>(LD9/o;)V

    invoke-interface {v8, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_30
    move-object/from16 v18, v2

    check-cast v18, Lmh/a;

    invoke-interface {v8}, LT/l;->J()V

    and-int/lit8 v0, v21, 0xe

    or-int v0, v0, v19

    and-int/lit8 v1, v21, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v21, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v20, v0, v1

    shr-int/lit8 v0, v21, 0x15

    and-int/lit16 v0, v0, 0x380

    move/from16 v21, v0

    const/16 v22, 0x6078

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v0, 0x0

    move-object/from16 v33, v8

    move-wide v7, v0

    const/4 v9, 0x0

    move-object/from16 v34, p2

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    move-object/from16 v10, v29

    move-object/from16 v11, v32

    move-object/from16 v12, v30

    move-object/from16 v13, v31

    move-object/from16 v14, v28

    move/from16 v15, v27

    move-object/from16 v19, v33

    invoke-static/range {v0 .. v22}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, LT/o;->P()V

    :cond_31
    move-object/from16 v1, v23

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v10, v27

    move-object/from16 v11, v34

    :goto_23
    invoke-interface/range {v33 .. v33}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_32

    new-instance v14, LF9/L;

    move-object v0, v14

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v35, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LF9/L;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;III)V

    move-object/from16 v0, v35

    invoke-interface {v15, v0}, LT/X0;->a(Lmh/p;)V

    :cond_32
    return-void
.end method

.method private static final d(LD9/o;)LYg/J;
    .locals 0

    invoke-virtual {p0}, LD9/o;->f()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;IIILT/l;I)LYg/J;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, LT/L0;->a(I)I

    move-result v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p14

    move/from16 v15, p13

    invoke-static/range {v1 .. v15}, LF9/M;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;Ljava/lang/String;LCi/c;Lmh/q;Ljava/lang/Object;Lmh/l;Lmh/a;ZLjava/lang/String;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
