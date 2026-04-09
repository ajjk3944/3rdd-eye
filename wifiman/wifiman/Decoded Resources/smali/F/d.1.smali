.class public abstract LF/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LT/z1;II)I
    .locals 0

    invoke-static {p0, p1, p2}, LF/d;->c(LT/z1;II)I

    move-result p0

    return p0
.end method

.method public static final b(LH/l;Landroidx/compose/ui/e;ZLH/b;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LH/j;ICLT/l;III)V
    .locals 37

    move-object/from16 v0, p10

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v13, p16

    const v1, 0x5367ca89

    move-object/from16 v2, p13

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, v13, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v14, 0x6

    move v6, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v14, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v14

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v6, v14

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v6, v6, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v14, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v6, v11

    :goto_3
    and-int/lit8 v11, v13, 0x4

    const/16 v16, 0x100

    if-eqz v11, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v14, 0x180

    if-nez v4, :cond_6

    move/from16 v4, p2

    invoke-interface {v2, v4}, LT/l;->c(Z)Z

    move-result v17

    if-eqz v17, :cond_8

    move/from16 v17, v16

    goto :goto_4

    :cond_8
    const/16 v17, 0x80

    :goto_4
    or-int v6, v6, v17

    :goto_5
    and-int/lit8 v17, v13, 0x8

    if-eqz v17, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v14, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_b

    const/16 v19, 0x800

    goto :goto_6

    :cond_b
    const/16 v19, 0x400

    :goto_6
    or-int v6, v6, v19

    :goto_7
    and-int/lit8 v19, v13, 0x10

    if-eqz v19, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v8, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v8, v14, 0x6000

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_e

    const/16 v21, 0x4000

    goto :goto_8

    :cond_e
    const/16 v21, 0x2000

    :goto_8
    or-int v6, v6, v21

    :goto_9
    and-int/lit8 v21, v13, 0x20

    const/high16 v22, 0x30000

    if-eqz v21, :cond_f

    or-int v6, v6, v22

    move-object/from16 v12, p5

    goto :goto_b

    :cond_f
    and-int v22, v14, v22

    move-object/from16 v12, p5

    if-nez v22, :cond_11

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v23, 0x10000

    :goto_a
    or-int v6, v6, v23

    :cond_11
    :goto_b
    and-int/lit8 v23, v13, 0x40

    const/high16 v24, 0x180000

    if-eqz v23, :cond_12

    or-int v6, v6, v24

    move-object/from16 v9, p6

    goto :goto_d

    :cond_12
    and-int v24, v14, v24

    move-object/from16 v9, p6

    if-nez v24, :cond_14

    invoke-interface {v2, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x80000

    :goto_c
    or-int v6, v6, v25

    :cond_14
    :goto_d
    and-int/lit16 v1, v13, 0x80

    const/high16 v26, 0xc00000

    if-eqz v1, :cond_15

    or-int v6, v6, v26

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v26, v14, v26

    move-object/from16 v3, p7

    if-nez v26, :cond_17

    invoke-interface {v2, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_16

    const/high16 v26, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v26, 0x400000

    :goto_e
    or-int v6, v6, v26

    :cond_17
    :goto_f
    and-int/lit16 v3, v13, 0x100

    const/high16 v26, 0x6000000

    if-eqz v3, :cond_18

    or-int v6, v6, v26

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v26, v14, v26

    move-object/from16 v4, p8

    if-nez v26, :cond_1a

    invoke-interface {v2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_19

    const/high16 v26, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v26, 0x2000000

    :goto_10
    or-int v6, v6, v26

    :cond_1a
    :goto_11
    and-int/lit16 v4, v13, 0x200

    const/high16 v26, 0x30000000

    if-eqz v4, :cond_1b

    or-int v6, v6, v26

    move-object/from16 v5, p9

    goto :goto_13

    :cond_1b
    and-int v26, v14, v26

    move-object/from16 v5, p9

    if-nez v26, :cond_1d

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1c

    const/high16 v26, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v26, 0x10000000

    :goto_12
    or-int v6, v6, v26

    :cond_1d
    :goto_13
    and-int/lit16 v5, v13, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v18, v15, 0x6

    goto :goto_16

    :cond_1e
    and-int/lit8 v26, v15, 0x6

    if-nez v26, :cond_21

    and-int/lit8 v26, v15, 0x8

    if-nez v26, :cond_1f

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v26

    goto :goto_14

    :cond_1f
    invoke-interface {v2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v26

    :goto_14
    if-eqz v26, :cond_20

    const/16 v18, 0x4

    goto :goto_15

    :cond_20
    const/16 v18, 0x2

    :goto_15
    or-int v18, v15, v18

    goto :goto_16

    :cond_21
    move/from16 v18, v15

    :goto_16
    and-int/lit16 v0, v13, 0x800

    if-eqz v0, :cond_23

    or-int/lit8 v18, v18, 0x30

    :cond_22
    :goto_17
    move/from16 v8, v18

    goto :goto_19

    :cond_23
    and-int/lit8 v26, v15, 0x30

    move/from16 v8, p11

    if-nez v26, :cond_22

    invoke-interface {v2, v8}, LT/l;->i(I)Z

    move-result v26

    if-eqz v26, :cond_24

    const/16 v20, 0x20

    goto :goto_18

    :cond_24
    const/16 v20, 0x10

    :goto_18
    or-int v18, v18, v20

    goto :goto_17

    :goto_19
    and-int/lit16 v9, v13, 0x1000

    if-eqz v9, :cond_26

    or-int/lit16 v8, v8, 0x180

    :cond_25
    move/from16 v10, p12

    goto :goto_1b

    :cond_26
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_25

    move/from16 v10, p12

    invoke-interface {v2, v10}, LT/l;->n(C)Z

    move-result v18

    if-eqz v18, :cond_27

    goto :goto_1a

    :cond_27
    const/16 v16, 0x80

    :goto_1a
    or-int v8, v8, v16

    :goto_1b
    const v16, 0x12492493

    and-int v10, v6, v16

    const v12, 0x12492492

    if-ne v10, v12, :cond_29

    and-int/lit16 v10, v8, 0x93

    const/16 v12, 0x92

    if-ne v10, v12, :cond_29

    invoke-interface {v2}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_28

    goto :goto_1c

    :cond_28
    invoke-interface {v2}, LT/l;->C()V

    move-object/from16 v7, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v34, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    goto/16 :goto_2d

    :cond_29
    :goto_1c
    if-eqz v7, :cond_2a

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_1d

    :cond_2a
    move-object/from16 v7, p1

    :goto_1d
    if-eqz v11, :cond_2b

    const/4 v11, 0x1

    goto :goto_1e

    :cond_2b
    move/from16 v11, p2

    :goto_1e
    const/4 v12, 0x0

    if-eqz v17, :cond_2c

    move-object/from16 v31, v12

    goto :goto_1f

    :cond_2c
    move-object/from16 v31, p3

    :goto_1f
    if-eqz v19, :cond_2d

    sget-object v16, LL0/U;->d:LL0/U$a;

    invoke-virtual/range {v16 .. v16}, LL0/U$a;->a()LL0/U;

    move-result-object v16

    move-object/from16 v32, v16

    goto :goto_20

    :cond_2d
    move-object/from16 v32, p4

    :goto_20
    if-eqz v21, :cond_2e

    sget-object v16, LF/D;->g:LF/D$a;

    invoke-virtual/range {v16 .. v16}, LF/D$a;->b()LF/D;

    move-result-object v16

    move-object/from16 v33, v16

    goto :goto_21

    :cond_2e
    move-object/from16 v33, p5

    :goto_21
    if-eqz v23, :cond_2f

    move-object/from16 v34, v12

    goto :goto_22

    :cond_2f
    move-object/from16 v34, p6

    :goto_22
    if-eqz v1, :cond_30

    move-object v1, v12

    goto :goto_23

    :cond_30
    move-object/from16 v1, p7

    :goto_23
    if-eqz v3, :cond_31

    move-object v3, v12

    goto :goto_24

    :cond_31
    move-object/from16 v3, p8

    :goto_24
    if-eqz v4, :cond_32

    new-instance v4, Lm0/j1;

    sget-object v16, Lm0/v0;->b:Lm0/v0$a;

    move/from16 p2, v11

    invoke-virtual/range {v16 .. v16}, Lm0/v0$a;->a()J

    move-result-wide v10

    invoke-direct {v4, v10, v11, v12}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_25

    :cond_32
    move/from16 p2, v11

    move-object/from16 v4, p9

    :goto_25
    if-eqz v5, :cond_33

    move-object v5, v12

    goto :goto_26

    :cond_33
    move-object/from16 v5, p10

    :goto_26
    if-eqz v0, :cond_34

    sget-object v0, LH/o;->a:LH/o$a;

    invoke-virtual {v0}, LH/o$a;->b()I

    move-result v0

    goto :goto_27

    :cond_34
    move/from16 v0, p11

    :goto_27
    if-eqz v9, :cond_35

    const/16 v9, 0x2022

    goto :goto_28

    :cond_35
    move/from16 v9, p12

    :goto_28
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_36

    const-string v10, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)"

    const v11, 0x5367ca89

    invoke-static {v11, v6, v8, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_36
    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    shr-int/lit8 v10, v8, 0x6

    and-int/lit8 v10, v10, 0xe

    invoke-static {v6, v2, v10}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v6

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_37

    new-instance v10, LF/L;

    invoke-direct {v10, v6}, LF/L;-><init>(LT/z1;)V

    invoke-interface {v2, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_37
    check-cast v10, LF/L;

    invoke-interface {v2, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    move/from16 p3, v9

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v12, :cond_38

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v9, v12, :cond_39

    :cond_38
    new-instance v9, LF/d$a;

    const/4 v12, 0x0

    invoke-direct {v9, v10, v12}, LF/d$a;-><init>(LF/L;Ldh/e;)V

    invoke-interface {v2, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_39
    check-cast v9, Lmh/p;

    const/4 v12, 0x0

    invoke-static {v10, v9, v2, v12}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v9, LH/o;->a:LH/o$a;

    invoke-virtual {v9}, LH/o$a;->b()I

    move-result v12

    invoke-static {v0, v12}, LH/o;->e(II)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-interface {v2, v12}, LT/l;->c(Z)Z

    move-result v16

    invoke-interface {v2, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    if-nez v16, :cond_3b

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v14, v15, :cond_3a

    goto :goto_29

    :cond_3a
    const/4 v15, 0x0

    goto :goto_2a

    :cond_3b
    :goto_29
    new-instance v14, LF/d$b;

    const/4 v15, 0x0

    invoke-direct {v14, v12, v10, v15}, LF/d$b;-><init>(ZLF/L;Ldh/e;)V

    invoke-interface {v2, v14}, LT/l;->K(Ljava/lang/Object;)V

    :goto_2a
    check-cast v14, Lmh/p;

    const/4 v15, 0x0

    invoke-static {v13, v14, v2, v15}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    and-int/lit8 v8, v8, 0x70

    const/16 v13, 0x20

    if-ne v8, v13, :cond_3c

    const/4 v15, 0x1

    :cond_3c
    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v15, :cond_3d

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_40

    :cond_3d
    invoke-virtual {v9}, LH/o$a;->b()I

    move-result v8

    invoke-static {v0, v8}, LH/o;->e(II)Z

    move-result v8

    if-eqz v8, :cond_3e

    invoke-virtual {v10}, LF/L;->d()LI/o;

    move-result-object v6

    goto :goto_2b

    :cond_3e
    invoke-virtual {v9}, LH/o$a;->a()I

    move-result v8

    invoke-static {v0, v8}, LH/o;->e(II)Z

    move-result v8

    if-eqz v8, :cond_3f

    new-instance v8, LF/c;

    invoke-direct {v8, v6}, LF/c;-><init>(LT/z1;)V

    move-object v6, v8

    goto :goto_2b

    :cond_3f
    const/4 v6, 0x0

    :goto_2b
    invoke-interface {v2, v6}, LT/l;->K(Ljava/lang/Object;)V

    move-object v8, v6

    :cond_40
    move-object/from16 v29, v8

    check-cast v29, LI/o;

    sget-object v6, LF/d$e;->a:LF/d$e;

    const/4 v8, 0x1

    invoke-static {v7, v8, v6}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object v6

    if-eqz v12, :cond_41

    invoke-virtual {v10}, LF/L;->e()Landroidx/compose/ui/e;

    move-result-object v8

    goto :goto_2c

    :cond_41
    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_2c
    invoke-interface {v6, v8}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v18

    new-instance v6, LF/d$c;

    move-object/from16 v16, v6

    move-object/from16 v17, p0

    move/from16 v19, p2

    move/from16 v20, v12

    move-object/from16 v21, v31

    move-object/from16 v22, v10

    move-object/from16 v23, v32

    move-object/from16 v24, v33

    move-object/from16 v25, v34

    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v30, v5

    invoke-direct/range {v16 .. v30}, LF/d$c;-><init>(LH/l;Landroidx/compose/ui/e;ZZLH/b;LF/L;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/j;)V

    const/16 v8, 0x36

    const v9, 0x78a39ead

    const/4 v10, 0x1

    invoke-static {v9, v10, v6, v2, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/4 v8, 0x6

    invoke-static {v6, v2, v8}, LF/d;->d(Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_42

    invoke-static {}, LT/o;->P()V

    :cond_42
    move/from16 v13, p3

    move v12, v0

    move-object v8, v1

    move-object v9, v3

    move-object v10, v4

    move-object v11, v5

    move-object/from16 v4, v31

    move-object/from16 v5, v32

    move-object/from16 v6, v33

    move/from16 v3, p2

    :goto_2d
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_43

    new-instance v14, LF/d$d;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v2, v7

    move-object/from16 v7, v34

    move-object/from16 v35, v14

    move/from16 v14, p14

    move-object/from16 v36, v15

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, LF/d$d;-><init>(LH/l;Landroidx/compose/ui/e;ZLH/b;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LH/j;ICIII)V

    move-object/from16 v1, v35

    move-object/from16 v0, v36

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_43
    return-void
.end method

.method private static final c(LT/z1;II)I
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Character;

    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p0

    return p0
.end method

.method private static final d(Lmh/p;LT/l;I)V
    .locals 5

    const v0, -0x40b4416a

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/k0;->r()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/q1;

    invoke-interface {p1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    :cond_5
    new-instance v2, LF/d$h;

    invoke-direct {v2, v0}, LF/d$h;-><init>(Landroidx/compose/ui/platform/q1;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, LF/d$h;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->r()LT/H0;

    move-result-object v0

    invoke-virtual {v0, v2}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LF/d$f;

    invoke-direct {v1, p0}, LF/d$f;-><init>(Lmh/p;)V

    const/16 v2, 0x36

    const v3, -0x565b3caa

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p1, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v2, LT/I0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v0, v1, p1, v2}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, LF/d$g;

    invoke-direct {v0, p0, p2}, LF/d$g;-><init>(Lmh/p;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_8
    return-void
.end method

.method public static final synthetic e(Lmh/p;LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LF/d;->d(Lmh/p;LT/l;I)V

    return-void
.end method

.method public static final synthetic f(LH/b;LH/b;)LH/b;
    .locals 0

    invoke-static {p0, p1}, LF/d;->g(LH/b;LH/b;)LH/b;

    move-result-object p0

    return-object p0
.end method

.method private static final g(LH/b;LH/b;)LH/b;
    .locals 0

    if-nez p0, :cond_0

    move-object p0, p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LH/c;->a(LH/b;LH/b;)LH/b;

    move-result-object p0

    :goto_0
    return-object p0
.end method
