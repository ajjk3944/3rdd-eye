.class public abstract Lw9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;IIILT/l;I)LYg/J;
    .locals 1

    invoke-static/range {p0 .. p18}, Lw9/g;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;IIILT/l;I)LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V
    .locals 40

    move-object/from16 v15, p2

    move-object/from16 v14, p5

    move-object/from16 v13, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p13

    move/from16 v10, p15

    move/from16 v9, p16

    move/from16 v8, p17

    const-string/jumbo v0, "colors"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dimens"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "textStyle"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onClick"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6cc6de99    # 1.923348E27f

    move-object/from16 v1, p14

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v7

    and-int/lit8 v1, v8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v10, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v10, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v7, v4}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v6, v8, 0x2

    const/16 v16, 0x10

    const/16 v17, 0x20

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v18, v10, 0x30

    move-object/from16 v2, p1

    if-nez v18, :cond_5

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_4

    move/from16 v18, v17

    goto :goto_2

    :cond_4
    move/from16 v18, v16

    :goto_2
    or-int v5, v5, v18

    :cond_5
    :goto_3
    and-int/lit8 v18, v8, 0x4

    const/16 v19, 0x80

    const/16 v20, 0x100

    if-eqz v18, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_8

    invoke-interface {v7, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move/from16 v3, v20

    goto :goto_4

    :cond_7
    move/from16 v3, v19

    :goto_4
    or-int/2addr v5, v3

    :cond_8
    :goto_5
    and-int/lit8 v3, v8, 0x8

    const/16 v21, 0x400

    if-eqz v3, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move/from16 v0, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v0, v10, 0xc00

    if-nez v0, :cond_9

    move/from16 v0, p3

    invoke-interface {v7, v0}, LT/l;->c(Z)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v24, 0x800

    goto :goto_6

    :cond_b
    move/from16 v24, v21

    :goto_6
    or-int v5, v5, v24

    :goto_7
    and-int/lit8 v24, v8, 0x10

    if-eqz v24, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move/from16 v0, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v0, v10, 0x6000

    if-nez v0, :cond_c

    move/from16 v0, p4

    invoke-interface {v7, v0}, LT/l;->c(Z)Z

    move-result v25

    if-eqz v25, :cond_e

    const/16 v25, 0x4000

    goto :goto_8

    :cond_e
    const/16 v25, 0x2000

    :goto_8
    or-int v5, v5, v25

    :goto_9
    and-int/lit8 v25, v8, 0x20

    const/high16 v26, 0x30000

    if-eqz v25, :cond_f

    or-int v5, v5, v26

    goto :goto_b

    :cond_f
    and-int v25, v10, v26

    if-nez v25, :cond_11

    invoke-interface {v7, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v25, 0x10000

    :goto_a
    or-int v5, v5, v25

    :cond_11
    :goto_b
    and-int/lit8 v25, v8, 0x40

    if-eqz v25, :cond_12

    const/high16 v25, 0x180000

    :goto_c
    or-int v5, v5, v25

    goto :goto_d

    :cond_12
    const/high16 v25, 0x180000

    and-int v25, v10, v25

    if-nez v25, :cond_14

    invoke-interface {v7, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x80000

    goto :goto_c

    :cond_14
    :goto_d
    and-int/lit16 v0, v8, 0x80

    if-eqz v0, :cond_15

    const/high16 v0, 0xc00000

    :goto_e
    or-int/2addr v5, v0

    goto :goto_f

    :cond_15
    const/high16 v0, 0xc00000

    and-int/2addr v0, v10

    if-nez v0, :cond_17

    invoke-interface {v7, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v0, 0x400000

    goto :goto_e

    :cond_17
    :goto_f
    and-int/lit16 v0, v8, 0x100

    const/high16 v27, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v27

    move-object/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v27, v10, v27

    move-object/from16 v2, p8

    if-nez v27, :cond_1a

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_19

    const/high16 v27, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v27, 0x2000000

    :goto_10
    or-int v5, v5, v27

    :cond_1a
    :goto_11
    and-int/lit16 v2, v8, 0x200

    const/high16 v27, 0x30000000

    if-eqz v2, :cond_1b

    or-int v5, v5, v27

    move-object/from16 v4, p9

    goto :goto_13

    :cond_1b
    and-int v28, v10, v27

    move-object/from16 v4, p9

    if-nez v28, :cond_1d

    invoke-interface {v7, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1c

    const/high16 v28, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v28, 0x10000000

    :goto_12
    or-int v5, v5, v28

    :cond_1d
    :goto_13
    and-int/lit16 v4, v8, 0x400

    if-eqz v4, :cond_1e

    or-int/lit8 v18, v9, 0x6

    move-object/from16 v10, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v28, v9, 0x6

    move-object/from16 v10, p10

    if-nez v28, :cond_20

    invoke-interface {v7, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1f

    const/16 v18, 0x4

    goto :goto_14

    :cond_1f
    const/16 v18, 0x2

    :goto_14
    or-int v18, v9, v18

    goto :goto_15

    :cond_20
    move/from16 v18, v9

    :goto_15
    and-int/lit16 v10, v8, 0x800

    if-eqz v10, :cond_22

    or-int/lit8 v18, v18, 0x30

    :cond_21
    :goto_16
    move/from16 v11, v18

    goto :goto_17

    :cond_22
    and-int/lit8 v28, v9, 0x30

    move-object/from16 v11, p11

    if-nez v28, :cond_21

    invoke-interface {v7, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_23

    move/from16 v16, v17

    :cond_23
    or-int v18, v18, v16

    goto :goto_16

    :goto_17
    and-int/lit16 v13, v8, 0x1000

    if-eqz v13, :cond_25

    or-int/lit16 v11, v11, 0x180

    :cond_24
    move-object/from16 v14, p12

    goto :goto_18

    :cond_25
    and-int/lit16 v14, v9, 0x180

    if-nez v14, :cond_24

    move-object/from16 v14, p12

    invoke-interface {v7, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_26

    move/from16 v19, v20

    :cond_26
    or-int v11, v11, v19

    :goto_18
    and-int/lit16 v14, v8, 0x2000

    if-eqz v14, :cond_28

    or-int/lit16 v11, v11, 0xc00

    :cond_27
    :goto_19
    move v14, v11

    goto :goto_1a

    :cond_28
    and-int/lit16 v14, v9, 0xc00

    if-nez v14, :cond_27

    invoke-interface {v7, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_29

    const/16 v21, 0x800

    :cond_29
    or-int v11, v11, v21

    goto :goto_19

    :goto_1a
    const v11, 0x12492493

    and-int/2addr v11, v5

    const v8, 0x12492492

    if-ne v11, v8, :cond_2b

    and-int/lit16 v8, v14, 0x493

    const/16 v11, 0x492

    if-ne v8, v11, :cond_2b

    invoke-interface {v7}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_2a

    goto :goto_1b

    :cond_2a
    invoke-interface {v7}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object v15, v7

    goto/16 :goto_3e

    :cond_2b
    :goto_1b
    if-eqz v1, :cond_2c

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v16, v1

    goto :goto_1c

    :cond_2c
    move-object/from16 v16, p0

    :goto_1c
    if-eqz v6, :cond_2d

    const/16 v17, 0x0

    goto :goto_1d

    :cond_2d
    move-object/from16 v17, p1

    :goto_1d
    const/4 v11, 0x1

    if-eqz v3, :cond_2e

    move v8, v11

    goto :goto_1e

    :cond_2e
    move/from16 v8, p3

    :goto_1e
    const/4 v3, 0x0

    if-eqz v24, :cond_2f

    move/from16 v18, v3

    goto :goto_1f

    :cond_2f
    move/from16 v18, p4

    :goto_1f
    if-eqz v0, :cond_30

    const/16 v19, 0x0

    goto :goto_20

    :cond_30
    move-object/from16 v19, p8

    :goto_20
    if-eqz v2, :cond_31

    const/4 v6, 0x0

    goto :goto_21

    :cond_31
    move-object/from16 v6, p9

    :goto_21
    if-eqz v4, :cond_32

    const/16 v20, 0x0

    goto :goto_22

    :cond_32
    move-object/from16 v20, p10

    :goto_22
    if-eqz v10, :cond_33

    sget-object v0, Lz/c;->a:Lz/c;

    invoke-virtual {v0}, Lz/c;->b()Lz/c$f;

    move-result-object v0

    move-object/from16 v21, v0

    goto :goto_23

    :cond_33
    move-object/from16 v21, p11

    :goto_23
    if-eqz v13, :cond_35

    const v0, 0x7b736ee0

    invoke-interface {v7, v0}, LT/l;->U(I)V

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_34

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v0

    invoke-interface {v7, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_34
    check-cast v0, Ly/m;

    invoke-interface {v7}, LT/l;->J()V

    move-object v13, v0

    goto :goto_24

    :cond_35
    move-object/from16 v13, p12

    :goto_24
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_36

    const-string/jumbo v0, "com.ui.core.ui.component.button.UiButton (UiButton.kt:79)"

    const v2, 0x6cc6de99    # 1.923348E27f

    invoke-static {v2, v5, v14, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_36
    const v0, 0x7b737a1e

    invoke-interface {v7, v0}, LT/l;->U(I)V

    and-int/lit16 v0, v5, 0x1c00

    const/16 v2, 0x800

    if-ne v0, v2, :cond_37

    move v2, v11

    goto :goto_25

    :cond_37
    move v2, v3

    :goto_25
    const/high16 v4, 0x70000

    and-int/2addr v4, v5

    const/high16 v10, 0x20000

    if-ne v4, v10, :cond_38

    move v10, v11

    goto :goto_26

    :cond_38
    move v10, v3

    :goto_26
    or-int/2addr v2, v10

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_39

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v10, v2, :cond_3b

    :cond_39
    if-eqz v8, :cond_3a

    invoke-virtual/range {p5 .. p5}, Lw9/a;->a()J

    move-result-wide v28

    goto :goto_27

    :cond_3a
    invoke-virtual/range {p5 .. p5}, Lw9/a;->c()J

    move-result-wide v28

    :goto_27
    invoke-static/range {v28 .. v29}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v10

    invoke-interface {v7, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3b
    check-cast v10, Lm0/v0;

    invoke-virtual {v10}, Lm0/v0;->u()J

    move-result-wide v28

    invoke-interface {v7}, LT/l;->J()V

    const v2, 0x7b7389b8

    invoke-interface {v7, v2}, LT/l;->U(I)V

    const/16 v2, 0x800

    if-ne v0, v2, :cond_3c

    move v10, v11

    :goto_28
    const/high16 v2, 0x20000

    goto :goto_29

    :cond_3c
    move v10, v3

    goto :goto_28

    :goto_29
    if-ne v4, v2, :cond_3d

    move v2, v11

    goto :goto_2a

    :cond_3d
    move v2, v3

    :goto_2a
    or-int/2addr v2, v10

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_3e

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v10, v2, :cond_40

    :cond_3e
    if-eqz v8, :cond_3f

    invoke-virtual/range {p5 .. p5}, Lw9/a;->b()J

    move-result-wide v30

    goto :goto_2b

    :cond_3f
    invoke-virtual/range {p5 .. p5}, Lw9/a;->d()J

    move-result-wide v30

    :goto_2b
    invoke-static/range {v30 .. v31}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v10

    invoke-interface {v7, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_40
    check-cast v10, Lm0/v0;

    invoke-virtual {v10}, Lm0/v0;->u()J

    move-result-wide v30

    invoke-interface {v7}, LT/l;->J()V

    const v2, 0x7b739814

    invoke-interface {v7, v2}, LT/l;->U(I)V

    const/16 v2, 0x800

    if-ne v0, v2, :cond_41

    move v2, v11

    :goto_2c
    const/high16 v0, 0x20000

    goto :goto_2d

    :cond_41
    move v2, v3

    goto :goto_2c

    :goto_2d
    if-ne v4, v0, :cond_42

    move v0, v11

    goto :goto_2e

    :cond_42
    move v0, v3

    :goto_2e
    or-int/2addr v0, v2

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_43

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_45

    :cond_43
    if-eqz v8, :cond_44

    invoke-virtual/range {p5 .. p5}, Lw9/a;->e()J

    move-result-wide v22

    goto :goto_2f

    :cond_44
    invoke-virtual/range {p5 .. p5}, Lw9/a;->d()J

    move-result-wide v22

    :goto_2f
    invoke-static/range {v22 .. v23}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v2

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_45
    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v22

    invoke-interface {v7}, LT/l;->J()V

    if-eqz v17, :cond_46

    move v0, v11

    goto :goto_30

    :cond_46
    move v0, v3

    :goto_30
    if-eqz v15, :cond_47

    move v2, v11

    goto :goto_31

    :cond_47
    move v2, v3

    :goto_31
    const v4, 0x7b73a71a

    invoke-interface {v7, v4}, LT/l;->U(I)V

    invoke-interface {v7, v0}, LT/l;->c(Z)Z

    move-result v0

    invoke-interface {v7, v2}, LT/l;->c(Z)Z

    move-result v2

    or-int/2addr v0, v2

    const/high16 v2, 0x380000

    and-int/2addr v2, v5

    const/high16 v4, 0x100000

    if-ne v2, v4, :cond_48

    move v4, v11

    goto :goto_32

    :cond_48
    move v4, v3

    :goto_32
    or-int/2addr v0, v4

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_49

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4b

    :cond_49
    if-eqz v17, :cond_4a

    if-nez v15, :cond_4a

    invoke-virtual/range {p6 .. p6}, Lw9/b;->b()Lz/N;

    move-result-object v0

    :goto_33
    move-object v4, v0

    goto :goto_34

    :cond_4a
    invoke-virtual/range {p6 .. p6}, Lw9/b;->a()Lz/N;

    move-result-object v0

    goto :goto_33

    :goto_34
    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4b
    check-cast v4, Lz/N;

    invoke-interface {v7}, LT/l;->J()V

    if-eqz v17, :cond_4c

    move v0, v11

    goto :goto_35

    :cond_4c
    move v0, v3

    :goto_35
    if-eqz v15, :cond_4d

    move v10, v11

    goto :goto_36

    :cond_4d
    move v10, v3

    :goto_36
    const v1, 0x7b73c281

    invoke-interface {v7, v1}, LT/l;->U(I)V

    invoke-interface {v7, v0}, LT/l;->c(Z)Z

    move-result v0

    invoke-interface {v7, v10}, LT/l;->c(Z)Z

    move-result v1

    or-int/2addr v0, v1

    const/high16 v1, 0x100000

    if-ne v2, v1, :cond_4e

    move v1, v11

    goto :goto_37

    :cond_4e
    move v1, v3

    :goto_37
    or-int/2addr v0, v1

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4f

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_52

    :cond_4f
    if-nez v17, :cond_51

    if-eqz v15, :cond_50

    goto :goto_38

    :cond_50
    int-to-float v0, v3

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    goto :goto_39

    :cond_51
    :goto_38
    invoke-virtual/range {p6 .. p6}, Lw9/b;->c()F

    move-result v0

    :goto_39
    invoke-static {v0}, LY0/h;->d(F)LY0/h;

    move-result-object v1

    invoke-interface {v7, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_52
    check-cast v1, LY0/h;

    invoke-virtual {v1}, LY0/h;->s()F

    move-result v24

    invoke-interface {v7}, LT/l;->J()V

    if-nez v20, :cond_53

    move/from16 v25, v8

    goto :goto_3a

    :cond_53
    move/from16 v25, v3

    :goto_3a
    invoke-virtual/range {p6 .. p6}, Lw9/b;->d()F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v26

    const v0, 0x7b7410de

    invoke-interface {v7, v0}, LT/l;->U(I)V

    if-nez v6, :cond_54

    const/4 v1, 0x0

    goto :goto_3b

    :cond_54
    shr-int/lit8 v0, v5, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v14, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v5, 0x15

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    invoke-interface {v6, v8, v13, v7, v0}, LN/f;->a(ZLy/k;LT/l;I)LT/z1;

    move-result-object v1

    :goto_3b
    invoke-interface {v7}, LT/l;->J()V

    if-eqz v1, :cond_55

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/h;

    invoke-virtual {v0}, LY0/h;->s()F

    move-result v0

    :goto_3c
    move/from16 v32, v0

    goto :goto_3d

    :cond_55
    int-to-float v0, v3

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    goto :goto_3c

    :goto_3d
    new-instance v10, Lw9/g$a;

    move-object v0, v10

    move-wide/from16 v1, v30

    move-object/from16 v3, p6

    move/from16 v33, v5

    move-object/from16 v5, v21

    move-object/from16 v34, v6

    move-object/from16 v6, v20

    move-object/from16 v35, v7

    move v7, v8

    move/from16 v36, v8

    move-object/from16 v8, p13

    move/from16 v9, v18

    move-object/from16 v37, v10

    move-object/from16 v10, v17

    move-wide/from16 v11, v22

    move-object/from16 v22, v13

    move-object/from16 v13, p2

    move/from16 v23, v14

    move/from16 v14, v24

    move-object/from16 v15, p7

    invoke-direct/range {v0 .. v15}, Lw9/g$a;-><init>(JLw9/b;Lz/N;Lz/c$e;Ls/G;ZLmh/a;ZLs9/b;JLjava/lang/String;FLL0/U;)V

    const/16 v0, 0x36

    const v1, 0x26c7c2b2

    move-object/from16 v15, v35

    move-object/from16 v3, v37

    const/4 v2, 0x1

    invoke-static {v1, v2, v3, v15, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    shr-int/lit8 v0, v23, 0x9

    and-int/lit8 v0, v0, 0xe

    or-int v0, v0, v27

    shl-int/lit8 v1, v33, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    const/high16 v1, 0x380000

    shr-int/lit8 v2, v33, 0x6

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shl-int/lit8 v1, v23, 0x12

    const/high16 v2, 0xe000000

    and-int/2addr v1, v2

    or-int v13, v0, v1

    const/4 v14, 0x0

    move-object/from16 v0, p13

    move-object/from16 v1, v16

    move/from16 v2, v25

    move-object/from16 v3, v26

    move-wide/from16 v4, v28

    move-wide/from16 v6, v30

    move-object/from16 v8, v19

    move/from16 v9, v32

    move-object/from16 v10, v22

    move-object v12, v15

    invoke-static/range {v0 .. v14}, LN/O0;->b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_56

    invoke-static {}, LT/o;->P()V

    :cond_56
    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move/from16 v5, v18

    move-object/from16 v9, v19

    move-object/from16 v11, v20

    move-object/from16 v12, v21

    move-object/from16 v13, v22

    move-object/from16 v10, v34

    move/from16 v4, v36

    :goto_3e
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_57

    new-instance v14, Lw9/f;

    move-object v0, v14

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v38, v14

    move-object/from16 v14, p13

    move-object/from16 v39, v15

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    invoke-direct/range {v0 .. v17}, Lw9/f;-><init>(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;III)V

    move-object/from16 v1, v38

    move-object/from16 v0, v39

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_57
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;IIILT/l;I)LYg/J;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move/from16 v17, p16

    move-object/from16 v14, p17

    or-int/lit8 v15, p14, 0x1

    invoke-static {v15}, LT/L0;->a(I)I

    move-result v15

    invoke-static/range {p15 .. p15}, LT/L0;->a(I)I

    move-result v16

    invoke-static/range {v0 .. v17}, Lw9/g;->b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
