.class public abstract LN/V0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J

.field private static final b:F

.field private static final c:F

.field private static final d:Landroidx/compose/ui/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    sput-wide v0, LN/V0;->a:J

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/V0;->b:F

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/V0;->c:F

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/r;->a(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    sput-object v0, LN/V0;->d:Landroidx/compose/ui/e;

    return-void
.end method

.method public static final a(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;LT/l;II)V
    .locals 32

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move/from16 v2, p9

    move/from16 v1, p10

    move-object/from16 v0, p11

    move-object/from16 v15, p14

    move/from16 v14, p17

    move/from16 v13, p18

    const v5, 0x145f34c6

    move-object/from16 v6, p16

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v6, v14, 0x6

    move-object/from16 v11, p0

    if-nez v6, :cond_1

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v14

    goto :goto_1

    :cond_1
    move v6, v14

    :goto_1
    and-int/lit8 v9, v14, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v6, v6, v16

    goto :goto_3

    :cond_3
    move-object/from16 v9, p1

    :goto_3
    and-int/lit16 v8, v14, 0x180

    const/16 v17, 0x80

    const/16 v18, 0x100

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-interface {v12, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_4

    move/from16 v19, v18

    goto :goto_4

    :cond_4
    move/from16 v19, v17

    :goto_4
    or-int v6, v6, v19

    goto :goto_5

    :cond_5
    move-object/from16 v8, p2

    :goto_5
    and-int/lit16 v10, v14, 0xc00

    const/16 v20, 0x400

    if-nez v10, :cond_7

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_6

    :cond_6
    move/from16 v10, v20

    :goto_6
    or-int/2addr v6, v10

    :cond_7
    and-int/lit16 v10, v14, 0x6000

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-nez v10, :cond_9

    invoke-interface {v12, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move/from16 v10, v23

    goto :goto_7

    :cond_8
    move/from16 v10, v22

    :goto_7
    or-int/2addr v6, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int v24, v14, v10

    const/high16 v25, 0x10000

    const/high16 v26, 0x20000

    move-object/from16 v7, p5

    if-nez v24, :cond_b

    invoke-interface {v12, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_a

    move/from16 v27, v26

    goto :goto_8

    :cond_a
    move/from16 v27, v25

    :goto_8
    or-int v6, v6, v27

    :cond_b
    const/high16 v27, 0x180000

    and-int v27, v14, v27

    move-object/from16 v5, p6

    if-nez v27, :cond_d

    invoke-interface {v12, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v28, 0x80000

    :goto_9
    or-int v6, v6, v28

    :cond_d
    const/high16 v28, 0xc00000

    and-int v28, v14, v28

    move-object/from16 v10, p7

    if-nez v28, :cond_f

    invoke-interface {v12, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v29, 0x400000

    :goto_a
    or-int v6, v6, v29

    :cond_f
    const/high16 v29, 0x6000000

    and-int v29, v14, v29

    move/from16 v11, p8

    if-nez v29, :cond_11

    invoke-interface {v12, v11}, LT/l;->c(Z)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v29, 0x2000000

    :goto_b
    or-int v6, v6, v29

    :cond_11
    const/high16 v29, 0x30000000

    and-int v29, v14, v29

    if-nez v29, :cond_13

    invoke-interface {v12, v2}, LT/l;->c(Z)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v29, 0x10000000

    :goto_c
    or-int v6, v6, v29

    :cond_13
    and-int/lit8 v29, v13, 0x6

    if-nez v29, :cond_15

    invoke-interface {v12, v1}, LT/l;->c(Z)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v16, 0x4

    goto :goto_d

    :cond_14
    const/16 v16, 0x2

    :goto_d
    or-int v16, v13, v16

    goto :goto_e

    :cond_15
    move/from16 v16, v13

    :goto_e
    and-int/lit8 v29, v13, 0x30

    if-nez v29, :cond_17

    invoke-interface {v12, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/16 v19, 0x20

    goto :goto_f

    :cond_16
    const/16 v19, 0x10

    :goto_f
    or-int v16, v16, v19

    :cond_17
    and-int/lit16 v5, v13, 0x180

    if-nez v5, :cond_19

    move-object/from16 v5, p12

    invoke-interface {v12, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_18

    move/from16 v17, v18

    :cond_18
    or-int v16, v16, v17

    goto :goto_10

    :cond_19
    move-object/from16 v5, p12

    :goto_10
    and-int/lit16 v5, v13, 0xc00

    if-nez v5, :cond_1b

    move-object/from16 v5, p13

    invoke-interface {v12, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1a

    const/16 v20, 0x800

    :cond_1a
    or-int v16, v16, v20

    goto :goto_11

    :cond_1b
    move-object/from16 v5, p13

    :goto_11
    and-int/lit16 v5, v13, 0x6000

    if-nez v5, :cond_1d

    invoke-interface {v12, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    move/from16 v22, v23

    :cond_1c
    or-int v16, v16, v22

    :cond_1d
    const/high16 v5, 0x30000

    and-int/2addr v5, v13

    if-nez v5, :cond_1f

    move-object/from16 v5, p15

    invoke-interface {v12, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1e

    move/from16 v25, v26

    :cond_1e
    or-int v16, v16, v25

    :goto_12
    move/from16 v5, v16

    goto :goto_13

    :cond_1f
    move-object/from16 v5, p15

    goto :goto_12

    :goto_13
    const v16, 0x12492493

    and-int v7, v6, v16

    const v8, 0x12492492

    if-ne v7, v8, :cond_21

    const v7, 0x12493

    and-int/2addr v7, v5

    const v8, 0x12492

    if-ne v7, v8, :cond_21

    invoke-interface {v12}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_20

    goto :goto_14

    :cond_20
    invoke-interface {v12}, LT/l;->C()V

    move-object v3, v12

    goto/16 :goto_1e

    :cond_21
    :goto_14
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_22

    const-string v7, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:81)"

    const v8, 0x145f34c6

    invoke-static {v8, v6, v5, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_22
    and-int/lit8 v7, v6, 0x70

    const/16 v22, 0x0

    const/16 v8, 0x20

    if-ne v7, v8, :cond_23

    const/4 v7, 0x1

    goto :goto_15

    :cond_23
    move/from16 v7, v22

    :goto_15
    and-int/lit16 v6, v6, 0x1c00

    const/16 v8, 0x800

    if-ne v6, v8, :cond_24

    const/4 v6, 0x1

    goto :goto_16

    :cond_24
    move/from16 v6, v22

    :goto_16
    or-int/2addr v6, v7

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_25

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_26

    :cond_25
    new-instance v6, LL0/d;

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v6

    move-object/from16 v17, p1

    invoke-direct/range {v16 .. v21}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v6}, LR0/c0;->a(LL0/d;)LR0/a0;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v7, LR0/a0;

    invoke-virtual {v7}, LR0/a0;->b()LL0/d;

    move-result-object v6

    invoke-virtual {v6}, LL0/d;->k()Ljava/lang/String;

    move-result-object v8

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v0, v12, v5}, Ly/f;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object v5

    invoke-interface {v5}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_27

    sget-object v5, LN/b0;->Focused:LN/b0;

    :goto_17
    move-object v7, v5

    goto :goto_18

    :cond_27
    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_28

    sget-object v5, LN/b0;->UnfocusedEmpty:LN/b0;

    goto :goto_17

    :cond_28
    sget-object v5, LN/b0;->UnfocusedNotEmpty:LN/b0;

    goto :goto_17

    :goto_18
    new-instance v6, LN/V0$c;

    invoke-direct {v6, v15, v2, v1, v0}, LN/V0$c;-><init>(LN/S0;ZZLy/k;)V

    sget-object v5, LN/f0;->a:LN/f0;

    const/4 v0, 0x6

    invoke-virtual {v5, v12, v0}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LN/c1;->e()LL0/U;

    move-result-object v17

    invoke-virtual/range {v16 .. v16}, LN/c1;->d()LL0/U;

    move-result-object v16

    invoke-virtual/range {v17 .. v17}, LL0/U;->h()J

    move-result-wide v0

    sget-object v19, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual/range {v19 .. v19}, Lm0/v0$a;->e()J

    move-result-wide v9

    invoke-static {v0, v1, v9, v10}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-virtual/range {v16 .. v16}, LL0/U;->h()J

    move-result-wide v0

    invoke-virtual/range {v19 .. v19}, Lm0/v0$a;->e()J

    move-result-wide v9

    invoke-static {v0, v1, v9, v10}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_2a

    :cond_29
    invoke-virtual/range {v17 .. v17}, LL0/U;->h()J

    move-result-wide v0

    invoke-virtual/range {v19 .. v19}, Lm0/v0$a;->e()J

    move-result-wide v9

    invoke-static {v0, v1, v9, v10}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_2b

    invoke-virtual/range {v16 .. v16}, LL0/U;->h()J

    move-result-wide v0

    invoke-virtual/range {v19 .. v19}, Lm0/v0$a;->e()J

    move-result-wide v9

    invoke-static {v0, v1, v9, v10}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-eqz v0, :cond_2b

    :cond_2a
    const/16 v20, 0x1

    goto :goto_19

    :cond_2b
    move/from16 v20, v22

    :goto_19
    sget-object v0, LN/Y0;->a:LN/Y0;

    const v1, 0x5e1b9465

    invoke-interface {v12, v1}, LT/l;->U(I)V

    const/4 v1, 0x6

    invoke-virtual {v5, v12, v1}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v9

    invoke-virtual {v9}, LN/c1;->d()LL0/U;

    move-result-object v1

    invoke-virtual {v1}, LL0/U;->h()J

    move-result-wide v9

    const-wide/16 v16, 0x10

    if-eqz v20, :cond_2d

    const v1, -0x5dbfcd6c

    invoke-interface {v12, v1}, LT/l;->U(I)V

    cmp-long v1, v9, v16

    if-eqz v1, :cond_2c

    goto :goto_1a

    :cond_2c
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v7, v12, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v9

    :goto_1a
    invoke-interface {v12}, LT/l;->J()V

    move-wide/from16 v23, v9

    goto :goto_1b

    :cond_2d
    const v1, 0x2e86386d

    invoke-interface {v12, v1}, LT/l;->U(I)V

    goto :goto_1a

    :goto_1b
    invoke-interface {v12}, LT/l;->J()V

    const v1, 0x5e1bac47

    invoke-interface {v12, v1}, LT/l;->U(I)V

    const/4 v1, 0x6

    invoke-virtual {v5, v12, v1}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object v1

    invoke-virtual {v1}, LN/c1;->e()LL0/U;

    move-result-object v1

    invoke-virtual {v1}, LL0/U;->h()J

    move-result-wide v9

    if-eqz v20, :cond_2f

    const v1, -0x5dbce18c

    invoke-interface {v12, v1}, LT/l;->U(I)V

    cmp-long v1, v9, v16

    if-eqz v1, :cond_2e

    goto :goto_1c

    :cond_2e
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v7, v12, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v9

    :goto_1c
    invoke-interface {v12}, LT/l;->J()V

    move-wide/from16 v25, v9

    goto :goto_1d

    :cond_2f
    const v1, 0x2e86508d

    invoke-interface {v12, v1}, LT/l;->U(I)V

    goto :goto_1c

    :goto_1d
    invoke-interface {v12}, LT/l;->J()V

    if-eqz v3, :cond_30

    const/16 v22, 0x1

    :cond_30
    new-instance v1, LN/V0$a;

    move-object v5, v1

    move-object/from16 v27, v6

    move-object/from16 v6, p4

    move-object/from16 v28, v7

    move-object/from16 v7, p5

    const/4 v10, 0x1

    move-object/from16 v9, p14

    move v2, v10

    move/from16 v10, p9

    move/from16 v11, p10

    move-object v3, v12

    move-object/from16 v12, p11

    move-object/from16 v13, p6

    move-object/from16 v14, p7

    move-object/from16 v15, p13

    move-object/from16 v16, p0

    move-object/from16 v17, p2

    move/from16 v18, p8

    move-object/from16 v19, p12

    move-object/from16 v21, p15

    invoke-direct/range {v5 .. v21}, LN/V0$a;-><init>(Lmh/p;Lmh/p;Ljava/lang/String;LN/S0;ZZLy/k;Lmh/p;Lmh/p;Lm0/i1;LN/Z0;Lmh/p;ZLz/N;ZLmh/p;)V

    const/16 v5, 0x36

    const v6, 0xd71bbe3

    invoke-static {v6, v2, v1, v3, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v14

    const/high16 v16, 0x1b0000

    move-object v6, v0

    move-object/from16 v7, v28

    move-wide/from16 v8, v23

    move-wide/from16 v10, v25

    move-object/from16 v12, v27

    move/from16 v13, v22

    move-object v15, v3

    invoke-virtual/range {v6 .. v16}, LN/Y0;->a(LN/b0;JJLmh/q;ZLmh/t;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, LT/o;->P()V

    :cond_31
    :goto_1e
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v15

    if-eqz v15, :cond_32

    new-instance v14, LN/V0$b;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v30, v14

    move-object/from16 v14, p13

    move-object/from16 v31, v15

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, LN/V0$b;-><init>(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;II)V

    move-object/from16 v1, v30

    move-object/from16 v0, v31

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_32
    return-void
.end method

.method public static final b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V
    .locals 13

    move-wide v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    const v0, -0x17cfc8dc

    move-object/from16 v3, p5

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, p7, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, p0, p1}, LT/l;->j(J)Z

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
    move v4, v6

    :goto_1
    and-int/lit8 v7, p7, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object v8, p2

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    move-object v8, p2

    invoke-interface {v3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    :goto_3
    and-int/lit8 v9, p7, 0x4

    if-eqz v9, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v10, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p3

    invoke-interface {v3, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v4, v11

    :goto_5
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_b

    invoke-interface {v3, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :cond_b
    :goto_7
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    if-ne v11, v12, :cond_e

    invoke-interface {v3}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v3}, LT/l;->C()V

    :cond_d
    :goto_8
    move-object v4, v10

    goto :goto_c

    :cond_e
    :goto_9
    const/4 v11, 0x0

    if-eqz v7, :cond_f

    move-object v8, v11

    :cond_f
    if-eqz v9, :cond_10

    move-object v10, v11

    :cond_10
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_11

    const/4 v7, -0x1

    const-string v9, "androidx.compose.material.Decoration (TextFieldImpl.kt:229)"

    invoke-static {v0, v4, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_11
    new-instance v0, LN/V0$e;

    invoke-direct {v0, p0, p1, v10, v5}, LN/V0$e;-><init>(JLjava/lang/Float;Lmh/p;)V

    const/16 v7, 0x36

    const v9, 0x1d7c49ae

    const/4 v11, 0x1

    invoke-static {v9, v11, v0, v3, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    if-eqz v8, :cond_12

    const v7, 0x7e1f2024

    invoke-interface {v3, v7}, LT/l;->U(I)V

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/lit8 v4, v4, 0x30

    invoke-static {v8, v0, v3, v4}, LN/a1;->a(LL0/U;Lmh/p;LT/l;I)V

    :goto_a
    invoke-interface {v3}, LT/l;->J()V

    goto :goto_b

    :cond_12
    const v4, 0x7e1f2688

    invoke-interface {v3, v4}, LT/l;->U(I)V

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    goto :goto_8

    :goto_c
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v10, LN/V0$d;

    move-object v0, v10

    move-wide v1, p0

    move-object v3, v8

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LN/V0$d;-><init>(JLL0/U;Ljava/lang/Float;Lmh/p;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method public static final c(Landroidx/compose/ui/e;ZLjava/lang/String;)Landroidx/compose/ui/e;
    .locals 2

    if-eqz p1, :cond_0

    new-instance p1, LN/V0$f;

    invoke-direct {p1, p2}, LN/V0$f;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, p2, v0}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final d()F
    .locals 1

    sget v0, LN/V0;->c:F

    return v0
.end method

.method public static final e()Landroidx/compose/ui/e;
    .locals 1

    sget-object v0, LN/V0;->d:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public static final f(LC0/n;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, LC0/n;->b()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LC0/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, LC0/u;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, LC0/u;->g0()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method public static final g()F
    .locals 1

    sget v0, LN/V0;->b:F

    return v0
.end method

.method public static final h()J
    .locals 2

    sget-wide v0, LN/V0;->a:J

    return-wide v0
.end method

.method public static final i(Landroidx/compose/ui/layout/t;)I
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->C0()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final j(Landroidx/compose/ui/layout/t;)I
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/layout/t;->I0()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
