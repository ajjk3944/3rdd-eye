.class public abstract LF/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LH/j;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LF/f$m;->a:LF/f$m;

    sput-object v0, LF/f;->a:LH/j;

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v1, v0}, LY0/i;->b(FF)J

    move-result-wide v0

    sput-wide v0, LF/f;->b:J

    return-void
.end method

.method public static final a(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LH/e;LH/j;Landroidx/compose/foundation/o;LT/l;III)V
    .locals 42

    move-object/from16 v0, p13

    move/from16 v15, p16

    move/from16 v14, p17

    move/from16 v13, p18

    const v1, 0x1bfb15b1

    move-object/from16 v2, p15

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, v13, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v15, 0x6

    move v6, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v15, 0x6

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
    or-int/2addr v6, v15

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v6, v15

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v6, v6, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v15, 0x30

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
    and-int/lit16 v4, v15, 0x180

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

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-eqz v17, :cond_a

    or-int/lit16 v6, v6, 0xc00

    :cond_9
    move/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v15, 0xc00

    if-nez v5, :cond_9

    move/from16 v5, p3

    invoke-interface {v2, v5}, LT/l;->c(Z)Z

    move-result v21

    if-eqz v21, :cond_b

    move/from16 v21, v19

    goto :goto_6

    :cond_b
    move/from16 v21, v18

    :goto_6
    or-int v6, v6, v21

    :goto_7
    and-int/lit8 v21, v13, 0x10

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-eqz v21, :cond_d

    or-int/lit16 v6, v6, 0x6000

    :cond_c
    move-object/from16 v8, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v8, v15, 0x6000

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_e

    move/from16 v25, v23

    goto :goto_8

    :cond_e
    move/from16 v25, v22

    :goto_8
    or-int v6, v6, v25

    :goto_9
    and-int/lit8 v25, v13, 0x20

    const/high16 v26, 0x30000

    if-eqz v25, :cond_f

    or-int v6, v6, v26

    move-object/from16 v9, p5

    goto :goto_b

    :cond_f
    and-int v26, v15, v26

    move-object/from16 v9, p5

    if-nez v26, :cond_11

    invoke-interface {v2, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_10

    const/high16 v27, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v27, 0x10000

    :goto_a
    or-int v6, v6, v27

    :cond_11
    :goto_b
    and-int/lit8 v27, v13, 0x40

    const/high16 v28, 0x180000

    if-eqz v27, :cond_12

    or-int v6, v6, v28

    move-object/from16 v12, p6

    goto :goto_d

    :cond_12
    and-int v28, v15, v28

    move-object/from16 v12, p6

    if-nez v28, :cond_14

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v29, 0x80000

    :goto_c
    or-int v6, v6, v29

    :cond_14
    :goto_d
    and-int/lit16 v1, v13, 0x80

    const/high16 v30, 0xc00000

    if-eqz v1, :cond_15

    or-int v6, v6, v30

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v30, v15, v30

    move-object/from16 v3, p7

    if-nez v30, :cond_17

    invoke-interface {v2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v30, 0x400000

    :goto_e
    or-int v6, v6, v30

    :cond_17
    :goto_f
    and-int/lit16 v3, v13, 0x100

    const/high16 v30, 0x6000000

    if-eqz v3, :cond_18

    or-int v6, v6, v30

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v30, v15, v30

    move-object/from16 v4, p8

    if-nez v30, :cond_1a

    invoke-interface {v2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v30, 0x2000000

    :goto_10
    or-int v6, v6, v30

    :cond_1a
    :goto_11
    and-int/lit16 v4, v13, 0x200

    const/high16 v30, 0x30000000

    if-eqz v4, :cond_1b

    or-int v6, v6, v30

    move-object/from16 v5, p9

    goto :goto_13

    :cond_1b
    and-int v30, v15, v30

    move-object/from16 v5, p9

    if-nez v30, :cond_1d

    invoke-interface {v2, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_12
    or-int v6, v6, v30

    :cond_1d
    :goto_13
    and-int/lit16 v5, v13, 0x400

    if-eqz v5, :cond_1e

    or-int/lit8 v20, v14, 0x6

    move-object/from16 v8, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v30, v14, 0x6

    move-object/from16 v8, p10

    if-nez v30, :cond_20

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v20, 0x4

    goto :goto_14

    :cond_1f
    const/16 v20, 0x2

    :goto_14
    or-int v20, v14, v20

    goto :goto_15

    :cond_20
    move/from16 v20, v14

    :goto_15
    and-int/lit16 v8, v13, 0x800

    if-eqz v8, :cond_22

    or-int/lit8 v20, v20, 0x30

    :cond_21
    :goto_16
    move/from16 v9, v20

    goto :goto_18

    :cond_22
    and-int/lit8 v30, v14, 0x30

    move-object/from16 v9, p11

    if-nez v30, :cond_21

    invoke-interface {v2, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_23

    const/16 v24, 0x20

    goto :goto_17

    :cond_23
    const/16 v24, 0x10

    :goto_17
    or-int v20, v20, v24

    goto :goto_16

    :goto_18
    and-int/lit16 v10, v13, 0x1000

    if-eqz v10, :cond_25

    or-int/lit16 v9, v9, 0x180

    :cond_24
    move-object/from16 v12, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v12, v14, 0x180

    if-nez v12, :cond_24

    move-object/from16 v12, p12

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_26

    goto :goto_19

    :cond_26
    const/16 v16, 0x80

    :goto_19
    or-int v9, v9, v16

    :goto_1a
    and-int/lit16 v12, v13, 0x2000

    if-eqz v12, :cond_27

    or-int/lit16 v9, v9, 0xc00

    move/from16 v16, v12

    goto :goto_1c

    :cond_27
    move/from16 v16, v12

    and-int/lit16 v12, v14, 0xc00

    if-nez v12, :cond_2a

    and-int/lit16 v12, v14, 0x1000

    if-nez v12, :cond_28

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_1b

    :cond_28
    invoke-interface {v2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    :goto_1b
    if-eqz v12, :cond_29

    move/from16 v18, v19

    :cond_29
    or-int v9, v9, v18

    :cond_2a
    :goto_1c
    and-int/lit16 v12, v14, 0x6000

    if-nez v12, :cond_2d

    and-int/lit16 v12, v13, 0x4000

    if-nez v12, :cond_2b

    move-object/from16 v12, p14

    invoke-interface {v2, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2c

    move/from16 v22, v23

    goto :goto_1d

    :cond_2b
    move-object/from16 v12, p14

    :cond_2c
    :goto_1d
    or-int v9, v9, v22

    goto :goto_1e

    :cond_2d
    move-object/from16 v12, p14

    :goto_1e
    const v18, 0x12492493

    and-int v0, v6, v18

    const v12, 0x12492492

    if-ne v0, v12, :cond_2f

    and-int/lit16 v0, v9, 0x2493

    const/16 v12, 0x2492

    if-ne v0, v12, :cond_2f

    invoke-interface {v2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2e

    goto :goto_1f

    :cond_2e
    invoke-interface {v2}, LT/l;->C()V

    move-object/from16 v3, p1

    move/from16 v11, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v37, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_30

    :cond_2f
    :goto_1f
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v0, v15, 0x1

    if-eqz v0, :cond_32

    invoke-interface {v2}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_30

    goto :goto_20

    :cond_30
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit16 v0, v13, 0x4000

    if-eqz v0, :cond_31

    const v0, -0xe001

    and-int/2addr v9, v0

    :cond_31
    move-object/from16 v0, p1

    move/from16 v11, p2

    move/from16 v1, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p10

    move-object/from16 v12, p11

    move-object/from16 v37, p12

    move-object/from16 v38, p13

    move-object/from16 v39, p14

    move v13, v9

    move-object/from16 v9, p9

    goto/16 :goto_2f

    :cond_32
    :goto_20
    if-eqz v7, :cond_33

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_21

    :cond_33
    move-object/from16 v0, p1

    :goto_21
    const/4 v7, 0x1

    if-eqz v11, :cond_34

    move v11, v7

    goto :goto_22

    :cond_34
    move/from16 v11, p2

    :goto_22
    const/4 v12, 0x0

    if-eqz v17, :cond_35

    move/from16 v17, v12

    goto :goto_23

    :cond_35
    move/from16 v17, p3

    :goto_23
    const/16 v18, 0x0

    if-eqz v21, :cond_36

    move-object/from16 v19, v18

    goto :goto_24

    :cond_36
    move-object/from16 v19, p4

    :goto_24
    if-eqz v25, :cond_37

    sget-object v20, LL0/U;->d:LL0/U$a;

    invoke-virtual/range {v20 .. v20}, LL0/U$a;->a()LL0/U;

    move-result-object v20

    goto :goto_25

    :cond_37
    move-object/from16 v20, p5

    :goto_25
    if-eqz v27, :cond_38

    sget-object v21, LF/D;->g:LF/D$a;

    invoke-virtual/range {v21 .. v21}, LF/D$a;->a()LF/D;

    move-result-object v21

    goto :goto_26

    :cond_38
    move-object/from16 v21, p6

    :goto_26
    if-eqz v1, :cond_39

    move-object/from16 v1, v18

    goto :goto_27

    :cond_39
    move-object/from16 v1, p7

    :goto_27
    if-eqz v3, :cond_3a

    sget-object v3, LH/k;->a:LH/k$a;

    invoke-virtual {v3}, LH/k$a;->a()LH/k;

    move-result-object v3

    goto :goto_28

    :cond_3a
    move-object/from16 v3, p8

    :goto_28
    if-eqz v4, :cond_3b

    move-object/from16 v4, v18

    goto :goto_29

    :cond_3b
    move-object/from16 v4, p9

    :goto_29
    if-eqz v5, :cond_3c

    move-object/from16 v5, v18

    goto :goto_2a

    :cond_3c
    move-object/from16 v5, p10

    :goto_2a
    if-eqz v8, :cond_3d

    sget-object v8, LF/e;->a:LF/e;

    invoke-virtual {v8}, LF/e;->a()Lm0/j1;

    move-result-object v8

    goto :goto_2b

    :cond_3d
    move-object/from16 v8, p11

    :goto_2b
    if-eqz v10, :cond_3e

    move-object/from16 v10, v18

    goto :goto_2c

    :cond_3e
    move-object/from16 v10, p12

    :goto_2c
    if-eqz v16, :cond_3f

    goto :goto_2d

    :cond_3f
    move-object/from16 v18, p13

    :goto_2d
    move-object/from16 p1, v0

    and-int/lit16 v0, v13, 0x4000

    if-eqz v0, :cond_40

    invoke-static {v12, v2, v12, v7}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v0

    const v7, -0xe001

    and-int/2addr v9, v7

    move-object/from16 v39, v0

    move-object v7, v1

    move-object v12, v8

    move v13, v9

    move-object/from16 v37, v10

    move/from16 v1, v17

    move-object/from16 v38, v18

    move-object/from16 v0, p1

    :goto_2e
    move-object v8, v3

    move-object v9, v4

    move-object v10, v5

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    goto :goto_2f

    :cond_40
    move-object/from16 v0, p1

    move-object/from16 v39, p14

    move-object v7, v1

    move-object v12, v8

    move v13, v9

    move-object/from16 v37, v10

    move/from16 v1, v17

    move-object/from16 v38, v18

    goto :goto_2e

    :goto_2f
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_41

    const-string v14, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)"

    const v15, 0x1bfb15b1

    invoke-static {v15, v6, v13, v14}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_41
    const v14, 0x7ffffffe

    and-int v34, v6, v14

    and-int/lit8 v6, v13, 0xe

    or-int/lit16 v6, v6, 0x180

    and-int/lit8 v14, v13, 0x70

    or-int/2addr v6, v14

    shl-int/lit8 v13, v13, 0x3

    and-int/lit16 v14, v13, 0x1c00

    or-int/2addr v6, v14

    const v14, 0xe000

    and-int/2addr v14, v13

    or-int/2addr v6, v14

    const/high16 v14, 0x70000

    and-int/2addr v13, v14

    or-int v35, v6, v13

    const/high16 v36, 0x10000

    const/16 v28, 0x0

    const/16 v32, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, v0

    move/from16 v18, v11

    move/from16 v19, v1

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    move-object/from16 v27, v12

    move-object/from16 v29, v37

    move-object/from16 v30, v38

    move-object/from16 v31, v39

    move-object/from16 v33, v2

    invoke-static/range {v16 .. v36}, LF/f;->b(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_42

    invoke-static {}, LT/o;->P()V

    :cond_42
    move-object v6, v4

    move-object v13, v12

    move-object/from16 v14, v38

    move-object/from16 v15, v39

    move v4, v1

    move-object v12, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v5

    move-object v5, v3

    move-object v3, v0

    :goto_30
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_43

    new-instance v1, LF/f$d;

    move-object v0, v1

    move-object/from16 v40, v1

    move-object/from16 v1, p0

    move-object/from16 v41, v2

    move-object v2, v3

    move v3, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v37

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, LF/f$d;-><init>(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LH/e;LH/j;Landroidx/compose/foundation/o;III)V

    move-object/from16 v1, v40

    move-object/from16 v0, v41

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_43
    return-void
.end method

.method public static final b(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZLT/l;III)V
    .locals 57

    move-object/from16 v1, p0

    move-object/from16 v0, p14

    move/from16 v15, p18

    move/from16 v14, p19

    move/from16 v13, p20

    const/high16 v3, 0xc00000

    const/16 v11, 0x80

    const/16 v12, 0x20

    const/16 v16, 0x10

    const v5, 0x398702f5

    move-object/from16 v4, p17

    invoke-interface {v4, v5}, LT/l;->r(I)LT/l;

    move-result-object v4

    const/4 v5, 0x1

    and-int/lit8 v21, v13, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-eqz v21, :cond_0

    or-int/lit8 v21, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v21, v15, 0x6

    if-nez v21, :cond_2

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1

    move/from16 v21, v6

    goto :goto_0

    :cond_1
    move/from16 v21, v5

    :goto_0
    or-int v21, v15, v21

    goto :goto_1

    :cond_2
    move/from16 v21, v15

    :goto_1
    and-int/lit8 v23, v13, 0x2

    if-eqz v23, :cond_4

    or-int/lit8 v21, v21, 0x30

    move-object/from16 v5, p1

    :cond_3
    :goto_2
    move/from16 v7, v21

    goto :goto_4

    :cond_4
    and-int/lit8 v24, v15, 0x30

    move-object/from16 v5, p1

    if-nez v24, :cond_3

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_5

    move/from16 v25, v12

    goto :goto_3

    :cond_5
    move/from16 v25, v16

    :goto_3
    or-int v21, v21, v25

    goto :goto_2

    :goto_4
    and-int/lit8 v21, v13, 0x4

    if-eqz v21, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move/from16 v6, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v6, v15, 0x180

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-interface {v4, v6}, LT/l;->c(Z)Z

    move-result v27

    if-eqz v27, :cond_8

    const/16 v27, 0x100

    goto :goto_5

    :cond_8
    move/from16 v27, v11

    :goto_5
    or-int v7, v7, v27

    :goto_6
    and-int/lit8 v27, v13, 0x8

    if-eqz v27, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move/from16 v8, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v8, v15, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p3

    invoke-interface {v4, v8}, LT/l;->c(Z)Z

    move-result v28

    if-eqz v28, :cond_b

    const/16 v28, 0x800

    goto :goto_7

    :cond_b
    const/16 v28, 0x400

    :goto_7
    or-int v7, v7, v28

    :goto_8
    and-int/lit8 v28, v13, 0x10

    if-eqz v28, :cond_d

    or-int/lit16 v7, v7, 0x6000

    :cond_c
    move-object/from16 v9, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v9, v15, 0x6000

    if-nez v9, :cond_c

    move-object/from16 v9, p4

    invoke-interface {v4, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_e

    const/16 v30, 0x4000

    goto :goto_9

    :cond_e
    const/16 v30, 0x2000

    :goto_9
    or-int v7, v7, v30

    :goto_a
    and-int/lit8 v30, v13, 0x20

    const/high16 v31, 0x10000

    const/high16 v32, 0x30000

    if-eqz v30, :cond_f

    or-int v7, v7, v32

    move-object/from16 v12, p5

    goto :goto_c

    :cond_f
    and-int v33, v15, v32

    move-object/from16 v12, p5

    if-nez v33, :cond_11

    invoke-interface {v4, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_10

    const/high16 v34, 0x20000

    goto :goto_b

    :cond_10
    move/from16 v34, v31

    :goto_b
    or-int v7, v7, v34

    :cond_11
    :goto_c
    and-int/lit8 v34, v13, 0x40

    const/high16 v35, 0x180000

    if-eqz v34, :cond_12

    or-int v7, v7, v35

    move-object/from16 v2, p6

    goto :goto_e

    :cond_12
    and-int v36, v15, v35

    move-object/from16 v2, p6

    if-nez v36, :cond_14

    invoke-interface {v4, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_13

    const/high16 v37, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v37, 0x80000

    :goto_d
    or-int v7, v7, v37

    :cond_14
    :goto_e
    and-int/lit16 v10, v13, 0x80

    if-eqz v10, :cond_16

    or-int/2addr v7, v3

    :cond_15
    move-object/from16 v3, p7

    :goto_f
    const/16 v11, 0x100

    goto :goto_11

    :cond_16
    and-int/2addr v3, v15

    if-nez v3, :cond_15

    move-object/from16 v3, p7

    invoke-interface {v4, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_17

    const/high16 v38, 0x800000

    goto :goto_10

    :cond_17
    const/high16 v38, 0x400000

    :goto_10
    or-int v7, v7, v38

    goto :goto_f

    :goto_11
    and-int/lit16 v2, v13, 0x100

    const/high16 v11, 0x6000000

    if-eqz v2, :cond_19

    or-int/2addr v7, v11

    :cond_18
    move-object/from16 v11, p8

    goto :goto_13

    :cond_19
    and-int/2addr v11, v15

    if-nez v11, :cond_18

    move-object/from16 v11, p8

    invoke-interface {v4, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1a

    const/high16 v36, 0x4000000

    goto :goto_12

    :cond_1a
    const/high16 v36, 0x2000000

    :goto_12
    or-int v7, v7, v36

    :goto_13
    and-int/lit16 v3, v13, 0x200

    const/high16 v36, 0x30000000

    if-eqz v3, :cond_1c

    :goto_14
    or-int v7, v7, v36

    :cond_1b
    const/16 v5, 0x400

    goto :goto_15

    :cond_1c
    and-int v36, v15, v36

    move-object/from16 v5, p9

    if-nez v36, :cond_1b

    invoke-interface {v4, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1d

    const/high16 v36, 0x20000000

    goto :goto_14

    :cond_1d
    const/high16 v36, 0x10000000

    goto :goto_14

    :goto_15
    and-int/lit16 v6, v13, 0x400

    if-eqz v6, :cond_1e

    or-int/lit8 v29, v14, 0x6

    move/from16 v36, v29

    :goto_16
    const/16 v5, 0x800

    goto :goto_18

    :cond_1e
    and-int/lit8 v29, v14, 0x6

    move-object/from16 v5, p10

    if-nez v29, :cond_20

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1f

    const/16 v36, 0x4

    goto :goto_17

    :cond_1f
    const/16 v36, 0x2

    :goto_17
    or-int v36, v14, v36

    goto :goto_16

    :cond_20
    move/from16 v36, v14

    goto :goto_16

    :goto_18
    and-int/lit16 v8, v13, 0x800

    if-eqz v8, :cond_21

    or-int/lit8 v36, v36, 0x30

    :goto_19
    move/from16 v5, v36

    goto :goto_1a

    :cond_21
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_23

    move-object/from16 v5, p11

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_22

    const/16 v16, 0x20

    :cond_22
    or-int v36, v36, v16

    goto :goto_19

    :cond_23
    move-object/from16 v5, p11

    goto :goto_19

    :goto_1a
    and-int/lit16 v9, v13, 0x1000

    if-eqz v9, :cond_24

    or-int/lit16 v5, v5, 0x180

    :goto_1b
    const/16 v11, 0x2000

    goto :goto_1d

    :cond_24
    and-int/lit16 v11, v14, 0x180

    if-nez v11, :cond_26

    move-object/from16 v11, p12

    invoke-interface {v4, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_25

    const/16 v38, 0x100

    goto :goto_1c

    :cond_25
    const/16 v38, 0x80

    :goto_1c
    or-int v5, v5, v38

    goto :goto_1b

    :cond_26
    move-object/from16 v11, p12

    goto :goto_1b

    :goto_1d
    and-int/lit16 v12, v13, 0x2000

    if-eqz v12, :cond_27

    or-int/lit16 v5, v5, 0xc00

    :goto_1e
    const/16 v11, 0x4000

    goto :goto_20

    :cond_27
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_29

    move-object/from16 v11, p13

    invoke-interface {v4, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_28

    const/16 v29, 0x800

    goto :goto_1f

    :cond_28
    const/16 v29, 0x400

    :goto_1f
    or-int v5, v5, v29

    goto :goto_1e

    :cond_29
    move-object/from16 v11, p13

    goto :goto_1e

    :goto_20
    and-int/lit16 v1, v13, 0x4000

    const v11, 0x8000

    if-eqz v1, :cond_2a

    or-int/lit16 v5, v5, 0x6000

    move/from16 v16, v1

    goto :goto_23

    :cond_2a
    move/from16 v16, v1

    and-int/lit16 v1, v14, 0x6000

    if-nez v1, :cond_2d

    and-int v1, v14, v11

    if-nez v1, :cond_2b

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_21

    :cond_2b
    invoke-interface {v4, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_21
    if-eqz v1, :cond_2c

    const/16 v25, 0x4000

    goto :goto_22

    :cond_2c
    const/16 v25, 0x2000

    :goto_22
    or-int v5, v5, v25

    :cond_2d
    :goto_23
    and-int v1, v14, v32

    if-nez v1, :cond_30

    and-int v1, v13, v11

    if-nez v1, :cond_2e

    move-object/from16 v1, p15

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_2f

    const/high16 v18, 0x20000

    goto :goto_24

    :cond_2e
    move-object/from16 v1, p15

    :cond_2f
    move/from16 v18, v31

    :goto_24
    or-int v5, v5, v18

    goto :goto_25

    :cond_30
    move-object/from16 v1, p15

    :goto_25
    and-int v18, v13, v31

    if-eqz v18, :cond_31

    or-int v5, v5, v35

    move/from16 v11, p16

    goto :goto_27

    :cond_31
    and-int v25, v14, v35

    move/from16 v11, p16

    if-nez v25, :cond_33

    invoke-interface {v4, v11}, LT/l;->c(Z)Z

    move-result v29

    if-eqz v29, :cond_32

    const/high16 v17, 0x100000

    goto :goto_26

    :cond_32
    const/high16 v17, 0x80000

    :goto_26
    or-int v5, v5, v17

    :cond_33
    :goto_27
    const v17, 0x12492493

    and-int v0, v7, v17

    const v1, 0x12492492

    if-ne v0, v1, :cond_35

    const v0, 0x92493

    and-int/2addr v0, v5

    const v1, 0x92492

    if-ne v0, v1, :cond_35

    invoke-interface {v4}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_34

    goto :goto_28

    :cond_34
    invoke-interface {v4}, LT/l;->C()V

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v23, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, v11

    move-object/from16 v11, p10

    goto/16 :goto_4c

    :cond_35
    :goto_28
    invoke-interface {v4}, LT/l;->q()V

    const/4 v0, 0x1

    and-int/lit8 v1, v15, 0x1

    const/4 v0, 0x0

    if-eqz v1, :cond_38

    invoke-interface {v4}, LT/l;->H()Z

    move-result v1

    if-eqz v1, :cond_36

    goto :goto_29

    :cond_36
    invoke-interface {v4}, LT/l;->C()V

    const v1, 0x8000

    and-int/2addr v1, v13

    if-eqz v1, :cond_37

    const v1, -0x70001

    and-int/2addr v5, v1

    :cond_37
    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v23, p3

    move-object/from16 v3, p4

    move-object/from16 v28, p5

    move-object/from16 v29, p6

    move-object/from16 v10, p7

    move-object/from16 v6, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v12, p13

    move-object/from16 v16, p14

    move-object/from16 v25, p15

    move v0, v5

    move/from16 v18, v11

    move-object/from16 v5, p8

    move-object/from16 v11, p12

    goto/16 :goto_3b

    :cond_38
    :goto_29
    if-eqz v23, :cond_39

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_2a

    :cond_39
    move-object/from16 v1, p1

    :goto_2a
    if-eqz v21, :cond_3a

    const/16 v21, 0x1

    goto :goto_2b

    :cond_3a
    move/from16 v21, p2

    :goto_2b
    if-eqz v27, :cond_3b

    move/from16 v23, v0

    goto :goto_2c

    :cond_3b
    move/from16 v23, p3

    :goto_2c
    if-eqz v28, :cond_3c

    const/16 v27, 0x0

    goto :goto_2d

    :cond_3c
    move-object/from16 v27, p4

    :goto_2d
    if-eqz v30, :cond_3d

    sget-object v28, LL0/U;->d:LL0/U$a;

    invoke-virtual/range {v28 .. v28}, LL0/U$a;->a()LL0/U;

    move-result-object v28

    goto :goto_2e

    :cond_3d
    move-object/from16 v28, p5

    :goto_2e
    if-eqz v34, :cond_3e

    sget-object v29, LF/D;->g:LF/D$a;

    invoke-virtual/range {v29 .. v29}, LF/D$a;->a()LF/D;

    move-result-object v29

    goto :goto_2f

    :cond_3e
    move-object/from16 v29, p6

    :goto_2f
    if-eqz v10, :cond_3f

    const/4 v10, 0x0

    goto :goto_30

    :cond_3f
    move-object/from16 v10, p7

    :goto_30
    if-eqz v2, :cond_40

    sget-object v2, LH/k;->a:LH/k$a;

    invoke-virtual {v2}, LH/k$a;->a()LH/k;

    move-result-object v2

    goto :goto_31

    :cond_40
    move-object/from16 v2, p8

    :goto_31
    if-eqz v3, :cond_41

    const/4 v3, 0x0

    goto :goto_32

    :cond_41
    move-object/from16 v3, p9

    :goto_32
    if-eqz v6, :cond_42

    const/4 v6, 0x0

    goto :goto_33

    :cond_42
    move-object/from16 v6, p10

    :goto_33
    if-eqz v8, :cond_43

    sget-object v8, LF/e;->a:LF/e;

    invoke-virtual {v8}, LF/e;->a()Lm0/j1;

    move-result-object v8

    goto :goto_34

    :cond_43
    move-object/from16 v8, p11

    :goto_34
    if-eqz v9, :cond_44

    const/4 v9, 0x0

    goto :goto_35

    :cond_44
    move-object/from16 v9, p12

    :goto_35
    if-eqz v12, :cond_45

    const/4 v12, 0x0

    goto :goto_36

    :cond_45
    move-object/from16 v12, p13

    :goto_36
    if-eqz v16, :cond_46

    const/16 v16, 0x0

    :goto_37
    const v25, 0x8000

    goto :goto_38

    :cond_46
    move-object/from16 v16, p14

    goto :goto_37

    :goto_38
    and-int v25, v13, v25

    move-object/from16 p1, v1

    if-eqz v25, :cond_47

    const/4 v1, 0x1

    invoke-static {v0, v4, v0, v1}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v25

    const v1, -0x70001

    and-int/2addr v5, v1

    goto :goto_39

    :cond_47
    move-object/from16 v25, p15

    :goto_39
    move-object/from16 v1, p1

    if-eqz v18, :cond_48

    move/from16 v18, v0

    move v0, v5

    move-object v11, v9

    move-object v5, v2

    move-object v9, v8

    move/from16 v2, v21

    :goto_3a
    move-object v8, v6

    move-object v6, v3

    move-object/from16 v3, v27

    goto :goto_3b

    :cond_48
    move v0, v5

    move/from16 v18, v11

    move-object v5, v2

    move-object v11, v9

    move/from16 v2, v21

    move-object v9, v8

    goto :goto_3a

    :goto_3b
    invoke-interface {v4}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v27

    if-eqz v27, :cond_49

    const-string v13, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)"

    const v14, 0x398702f5

    invoke-static {v14, v7, v0, v13}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_49
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v13

    invoke-interface {v4, v13}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v14

    invoke-interface {v4, v14}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LY0/t;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->u()LT/H0;

    move-result-object v15

    invoke-interface {v4, v15}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/ui/platform/E1;

    move-object/from16 p12, v6

    sget-object v6, LH/k$c;->b:LH/k$c;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v53

    if-nez v8, :cond_4b

    const v6, 0x5c72b35

    invoke-interface {v4, v6}, LT/l;->U(I)V

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v20, LT/l;->a:LT/l$a;

    move-object/from16 p13, v8

    invoke-virtual/range {v20 .. v20}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_4a

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v6

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4a
    check-cast v6, Ly/m;

    invoke-interface {v4}, LT/l;->J()V

    goto :goto_3c

    :cond_4b
    move-object/from16 p13, v8

    const v6, -0x4a22e01e

    invoke-interface {v4, v6}, LT/l;->U(I)V

    invoke-interface {v4}, LT/l;->J()V

    move-object/from16 v6, p13

    :goto_3c
    if-eqz v53, :cond_4c

    sget-object v8, Lw/q;->Horizontal:Lw/q;

    :goto_3d
    move-object/from16 p14, v9

    const/4 v9, 0x0

    goto :goto_3e

    :cond_4c
    sget-object v8, Lw/q;->Vertical:Lw/q;

    goto :goto_3d

    :goto_3e
    invoke-static {v6, v4, v9}, Ly/f;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/Boolean;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v43

    invoke-static {v6, v4, v9}, Ly/i;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object v20

    invoke-interface/range {v20 .. v20}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v45

    invoke-interface {v15}, Landroidx/compose/ui/platform/E1;->a()Z

    move-result v44

    and-int/lit8 v9, v7, 0xe

    const/4 v15, 0x4

    if-ne v9, v15, :cond_4d

    const/4 v9, 0x1

    goto :goto_3f

    :cond_4d
    const/4 v9, 0x0

    :goto_3f
    and-int/lit16 v15, v0, 0x380

    move-object/from16 v20, v5

    const/16 v5, 0x100

    if-ne v15, v5, :cond_4e

    const/4 v5, 0x1

    goto :goto_40

    :cond_4e
    const/4 v5, 0x0

    :goto_40
    or-int/2addr v5, v9

    and-int/lit16 v9, v0, 0x1c00

    const/16 v15, 0x800

    if-ne v9, v15, :cond_4f

    const/4 v9, 0x1

    goto :goto_41

    :cond_4f
    const/4 v9, 0x0

    :goto_41
    or-int/2addr v5, v9

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_51

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v9, v5, :cond_50

    goto :goto_42

    :cond_50
    move-object/from16 v15, p0

    goto :goto_44

    :cond_51
    :goto_42
    if-nez v11, :cond_53

    sget-object v5, LI/Y0;->a:LI/Y0;

    if-eqz v53, :cond_52

    goto :goto_43

    :cond_52
    const/4 v5, 0x0

    goto :goto_43

    :cond_53
    move-object v5, v11

    :goto_43
    new-instance v9, LI/o1;

    move-object/from16 v15, p0

    invoke-direct {v9, v15, v3, v5, v12}, LI/o1;-><init>(LH/l;LH/b;LI/o;LH/e;)V

    invoke-interface {v4, v9}, LT/l;->K(Ljava/lang/Object;)V

    :goto_44
    move-object v5, v9

    check-cast v5, LI/o1;

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    move-object/from16 p15, v11

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_54

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v11, v9, :cond_55

    :cond_54
    new-instance v11, LI/l1;

    invoke-direct {v11}, LI/l1;-><init>()V

    invoke-interface {v4, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_55
    move-object/from16 v41, v11

    check-cast v41, LI/l1;

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_56

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v11, v9, :cond_58

    :cond_56
    new-instance v11, LJ/j;

    if-eqz v43, :cond_57

    if-eqz v44, :cond_57

    const/4 v9, 0x1

    goto :goto_45

    :cond_57
    const/4 v9, 0x0

    :goto_45
    move-object/from16 p1, v11

    move-object/from16 p2, v5

    move-object/from16 p3, v41

    move-object/from16 p4, v13

    move/from16 p5, v2

    move/from16 p6, v23

    move/from16 p7, v9

    move/from16 p8, v18

    invoke-direct/range {p1 .. p8}, LJ/j;-><init>(LI/o1;LI/l1;LY0/d;ZZZZ)V

    invoke-interface {v4, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_58
    check-cast v11, LJ/j;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->k()LT/H0;

    move-result-object v9

    invoke-interface {v4, v9}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu0/a;

    move-object/from16 v26, v12

    invoke-static {}, Landroidx/compose/ui/platform/k0;->f()LT/H0;

    move-result-object v12

    invoke-interface {v4, v12}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/platform/h0;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->r()LT/H0;

    move-result-object v15

    invoke-interface {v4, v15}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/ui/platform/q1;

    invoke-interface {v4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v27

    const v30, 0xe000

    move-object/from16 v31, v8

    and-int v8, v7, v30

    move-object/from16 p16, v14

    const/16 v14, 0x4000

    if-ne v8, v14, :cond_59

    const/4 v8, 0x1

    goto :goto_46

    :cond_59
    const/4 v8, 0x0

    :goto_46
    or-int v8, v27, v8

    invoke-interface {v4, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-interface {v4, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-interface {v4, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-interface {v4, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-interface {v4, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    and-int/lit16 v14, v7, 0x380

    move-object/from16 v22, v1

    const/16 v1, 0x100

    if-ne v14, v1, :cond_5a

    const/4 v1, 0x1

    goto :goto_47

    :cond_5a
    const/4 v1, 0x0

    :goto_47
    or-int/2addr v1, v8

    and-int/lit16 v8, v7, 0x1c00

    const/16 v14, 0x800

    if-ne v8, v14, :cond_5b

    const/4 v8, 0x1

    goto :goto_48

    :cond_5b
    const/4 v8, 0x0

    :goto_48
    or-int/2addr v1, v8

    const/high16 v8, 0x380000

    and-int/2addr v0, v8

    const/high16 v8, 0x100000

    if-ne v0, v8, :cond_5c

    const/4 v0, 0x1

    goto :goto_49

    :cond_5c
    const/4 v0, 0x0

    :goto_49
    or-int/2addr v0, v1

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_5e

    :cond_5d
    new-instance v1, LF/f$e;

    move-object/from16 p1, v1

    move-object/from16 p2, v5

    move-object/from16 p3, v3

    move-object/from16 p4, v11

    move-object/from16 p5, v9

    move-object/from16 p6, v12

    move-object/from16 p7, v15

    move-object/from16 p8, v13

    move/from16 p9, v2

    move/from16 p10, v23

    move/from16 p11, v18

    invoke-direct/range {p1 .. p11}, LF/f$e;-><init>(LI/o1;LH/b;LJ/j;Lu0/a;Landroidx/compose/ui/platform/h0;Landroidx/compose/ui/platform/q1;LY0/d;ZZZ)V

    invoke-interface {v4, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5e
    check-cast v1, Lmh/a;

    const/4 v0, 0x0

    invoke-static {v1, v4, v0}, LT/O;->g(Lmh/a;LT/l;I)V

    invoke-interface {v4, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5f

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_60

    :cond_5f
    new-instance v1, LF/f$f;

    invoke-direct {v1, v11}, LF/f$f;-><init>(LJ/j;)V

    invoke-interface {v4, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_60
    check-cast v1, Lmh/l;

    const/4 v0, 0x0

    invoke-static {v11, v1, v4, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    new-instance v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;

    move-object/from16 p1, v0

    move-object/from16 p2, v5

    move-object/from16 p3, v41

    move-object/from16 p4, v11

    move-object/from16 p5, v3

    move/from16 p6, v2

    move/from16 p7, v23

    move-object/from16 p8, v29

    move-object/from16 p9, v10

    move/from16 p10, v53

    move-object/from16 p11, v6

    invoke-direct/range {p1 .. p11}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;-><init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V

    move-object/from16 v1, v22

    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v2, v6}, Landroidx/compose/foundation/FocusableKt;->b(Landroidx/compose/ui/e;ZLy/m;)Landroidx/compose/ui/e;

    move-result-object v0

    if-eqz v2, :cond_61

    invoke-virtual {v11}, LJ/j;->U()LJ/j$a;

    move-result-object v8

    sget-object v9, LJ/j$a;->None:LJ/j$a;

    if-ne v8, v9, :cond_61

    const/4 v8, 0x1

    goto :goto_4a

    :cond_61
    const/4 v8, 0x0

    :goto_4a
    sget-object v9, Lw/x;->a:Lw/x;

    move-object/from16 v14, p16

    move-object/from16 v13, v31

    const/4 v12, 0x0

    invoke-virtual {v9, v14, v13, v12}, Lw/x;->c(LY0/t;Lw/q;Z)Z

    move-result v9

    const/16 v12, 0x10

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v25

    move-object/from16 p3, v13

    move/from16 p4, v8

    move/from16 p5, v9

    move-object/from16 p6, v15

    move-object/from16 p7, v6

    move/from16 p8, v12

    move-object/from16 p9, v14

    invoke-static/range {p1 .. p9}, Landroidx/compose/foundation/gestures/d;->i(Landroidx/compose/ui/e;Lw/y;Lw/q;ZZLw/n;Ly/m;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {}, LF/p0;->a()Ly0/t;

    move-result-object v6

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-static {v0, v6, v12, v8, v9}, Ly0/u;->b(Landroidx/compose/ui/e;Ly0/t;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->o()Lf0/c;

    move-result-object v6

    const/4 v8, 0x1

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v6

    invoke-static {v4, v12}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v4, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_62

    invoke-static {}, LT/j;->c()V

    :cond_62
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_63

    invoke-interface {v4, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_4b

    :cond_63
    invoke-interface {v4}, LT/l;->I()V

    :goto_4b
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v6, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v14, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v14}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_64

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v9, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_65

    :cond_64
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v14, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_65
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v14, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    new-instance v0, LF/f$g;

    move-object/from16 v38, v0

    move-object/from16 v39, v16

    move-object/from16 v40, v20

    move-object/from16 v42, v28

    move-object/from16 v46, v5

    move-object/from16 v47, v11

    move-object/from16 v48, p14

    move/from16 v49, v2

    move/from16 v50, v23

    move-object/from16 v51, v25

    move-object/from16 v52, v13

    move-object/from16 v54, p12

    invoke-direct/range {v38 .. v54}, LF/f$g;-><init>(LH/j;LH/k;LI/l1;LL0/U;ZZZLI/o1;LJ/j;Lm0/l0;ZZLandroidx/compose/foundation/o;Lw/q;ZLmh/p;)V

    const/16 v5, 0x36

    const v6, -0x2820d9ff

    const/4 v8, 0x1

    invoke-static {v6, v8, v0, v4, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    shr-int/lit8 v5, v7, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/lit16 v5, v5, 0x180

    invoke-static {v11, v2, v0, v4, v5}, LF/k;->a(LJ/j;ZLmh/p;LT/l;I)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_66

    invoke-static {}, LT/o;->P()V

    :cond_66
    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object v5, v3

    move-object v8, v10

    move-object/from16 v15, v16

    move/from16 v17, v18

    move-object/from16 v9, v20

    move-object/from16 v16, v25

    move-object/from16 v14, v26

    move-object/from16 v6, v28

    move-object/from16 v7, v29

    move-object/from16 v10, p12

    move v3, v2

    move-object v2, v1

    :goto_4c
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_67

    new-instance v1, LF/f$h;

    move-object v0, v1

    move-object/from16 v55, v1

    move-object/from16 v1, p0

    move-object/from16 v56, v4

    move/from16 v4, v23

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    invoke-direct/range {v0 .. v20}, LF/f$h;-><init>(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZIII)V

    move-object/from16 v1, v55

    move-object/from16 v0, v56

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_67
    return-void
.end method

.method public static final c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
    .locals 37

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move/from16 v13, p17

    move/from16 v12, p18

    move/from16 v11, p19

    const v0, 0x6b8eb362

    move-object/from16 v1, p16

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_2

    invoke-interface {v10, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v13, 0x30

    if-nez v4, :cond_5

    invoke-interface {v10, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v11, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v13, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v10, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v1, v1, v16

    :goto_5
    and-int/lit8 v16, v11, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v2, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v2, v13, 0xc00

    if-nez v2, :cond_9

    move/from16 v2, p3

    invoke-interface {v10, v2}, LT/l;->c(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v1, v1, v19

    :goto_7
    and-int/lit8 v19, v11, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move/from16 v5, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v5, v13, 0x6000

    if-nez v5, :cond_c

    move/from16 v5, p4

    invoke-interface {v10, v5}, LT/l;->c(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v1, v1, v23

    :goto_9
    and-int/lit8 v23, v11, 0x20

    const/high16 v24, 0x10000

    const/high16 v25, 0x20000

    const/high16 v26, 0x30000

    if-eqz v23, :cond_f

    or-int v1, v1, v26

    move-object/from16 v7, p5

    goto :goto_b

    :cond_f
    and-int v27, v13, v26

    move-object/from16 v7, p5

    if-nez v27, :cond_11

    invoke-interface {v10, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    move/from16 v28, v25

    goto :goto_a

    :cond_10
    move/from16 v28, v24

    :goto_a
    or-int v1, v1, v28

    :cond_11
    :goto_b
    and-int/lit8 v28, v11, 0x40

    const/high16 v29, 0x180000

    if-eqz v28, :cond_12

    or-int v1, v1, v29

    move-object/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v29, v13, v29

    move-object/from16 v8, p6

    if-nez v29, :cond_14

    invoke-interface {v10, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_13

    const/high16 v30, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v30, 0x80000

    :goto_c
    or-int v1, v1, v30

    :cond_14
    :goto_d
    and-int/lit16 v6, v11, 0x80

    const/high16 v31, 0xc00000

    if-eqz v6, :cond_15

    or-int v1, v1, v31

    move-object/from16 v3, p7

    goto :goto_f

    :cond_15
    and-int v31, v13, v31

    move-object/from16 v3, p7

    if-nez v31, :cond_17

    invoke-interface {v10, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_16

    const/high16 v32, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v32, 0x400000

    :goto_e
    or-int v1, v1, v32

    :cond_17
    :goto_f
    and-int/lit16 v0, v11, 0x100

    const/high16 v33, 0x6000000

    if-eqz v0, :cond_18

    or-int v1, v1, v33

    move/from16 v2, p8

    goto :goto_11

    :cond_18
    and-int v33, v13, v33

    move/from16 v2, p8

    if-nez v33, :cond_1a

    invoke-interface {v10, v2}, LT/l;->c(Z)Z

    move-result v33

    if-eqz v33, :cond_19

    const/high16 v33, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v33, 0x2000000

    :goto_10
    or-int v1, v1, v33

    :cond_1a
    :goto_11
    const/high16 v33, 0x30000000

    and-int v33, v13, v33

    if-nez v33, :cond_1d

    and-int/lit16 v2, v11, 0x200

    if-nez v2, :cond_1b

    move/from16 v2, p9

    invoke-interface {v10, v2}, LT/l;->i(I)Z

    move-result v33

    if-eqz v33, :cond_1c

    const/high16 v33, 0x20000000

    goto :goto_12

    :cond_1b
    move/from16 v2, p9

    :cond_1c
    const/high16 v33, 0x10000000

    :goto_12
    or-int v1, v1, v33

    goto :goto_13

    :cond_1d
    move/from16 v2, p9

    :goto_13
    and-int/lit16 v2, v11, 0x400

    if-eqz v2, :cond_1e

    or-int/lit8 v33, v12, 0x6

    move/from16 v3, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v33, v12, 0x6

    move/from16 v3, p10

    if-nez v33, :cond_20

    invoke-interface {v10, v3}, LT/l;->i(I)Z

    move-result v33

    if-eqz v33, :cond_1f

    const/16 v33, 0x4

    goto :goto_14

    :cond_1f
    const/16 v33, 0x2

    :goto_14
    or-int v33, v12, v33

    goto :goto_15

    :cond_20
    move/from16 v33, v12

    :goto_15
    and-int/lit16 v3, v11, 0x800

    if-eqz v3, :cond_22

    or-int/lit8 v33, v33, 0x30

    :cond_21
    :goto_16
    move/from16 v5, v33

    goto :goto_18

    :cond_22
    and-int/lit8 v34, v12, 0x30

    move-object/from16 v5, p11

    if-nez v34, :cond_21

    invoke-interface {v10, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_23

    const/16 v22, 0x20

    goto :goto_17

    :cond_23
    const/16 v22, 0x10

    :goto_17
    or-int v33, v33, v22

    goto :goto_16

    :goto_18
    and-int/lit16 v7, v11, 0x1000

    if-eqz v7, :cond_25

    or-int/lit16 v5, v5, 0x180

    :cond_24
    move-object/from16 v8, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v8, v12, 0x180

    if-nez v8, :cond_24

    move-object/from16 v8, p12

    invoke-interface {v10, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_26

    const/16 v29, 0x100

    goto :goto_19

    :cond_26
    const/16 v29, 0x80

    :goto_19
    or-int v5, v5, v29

    :goto_1a
    and-int/lit16 v8, v11, 0x2000

    if-eqz v8, :cond_28

    or-int/lit16 v5, v5, 0xc00

    :cond_27
    move-object/from16 v9, p13

    goto :goto_1b

    :cond_28
    and-int/lit16 v9, v12, 0xc00

    if-nez v9, :cond_27

    move-object/from16 v9, p13

    invoke-interface {v10, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_29

    move/from16 v17, v18

    :cond_29
    or-int v5, v5, v17

    :goto_1b
    and-int/lit16 v9, v11, 0x4000

    if-eqz v9, :cond_2b

    or-int/lit16 v5, v5, 0x6000

    :cond_2a
    move-object/from16 v14, p14

    goto :goto_1c

    :cond_2b
    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_2a

    move-object/from16 v14, p14

    invoke-interface {v10, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2c

    move/from16 v20, v21

    :cond_2c
    or-int v5, v5, v20

    :goto_1c
    const v17, 0x8000

    and-int v17, v11, v17

    if-eqz v17, :cond_2d

    or-int v5, v5, v26

    move-object/from16 v12, p15

    goto :goto_1d

    :cond_2d
    and-int v18, v12, v26

    move-object/from16 v12, p15

    if-nez v18, :cond_2f

    invoke-interface {v10, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2e

    move/from16 v24, v25

    :cond_2e
    or-int v5, v5, v24

    :cond_2f
    :goto_1d
    const v18, 0x12492493

    and-int v12, v1, v18

    const v14, 0x12492492

    if-ne v12, v14, :cond_31

    const v12, 0x12493

    and-int/2addr v12, v5

    const v14, 0x12492

    if-ne v12, v14, :cond_31

    invoke-interface {v10}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_30

    goto :goto_1e

    :cond_30
    invoke-interface {v10}, LT/l;->C()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v30, v10

    move/from16 v10, p9

    goto/16 :goto_36

    :cond_31
    :goto_1e
    invoke-interface {v10}, LT/l;->q()V

    and-int/lit8 v12, v13, 0x1

    const/16 v18, 0x1

    if-eqz v12, :cond_34

    invoke-interface {v10}, LT/l;->H()Z

    move-result v12

    if-eqz v12, :cond_32

    goto :goto_1f

    :cond_32
    invoke-interface {v10}, LT/l;->C()V

    and-int/lit16 v0, v11, 0x200

    if-eqz v0, :cond_33

    const v0, -0x70000001

    and-int/2addr v1, v0

    :cond_33
    move-object/from16 v20, p2

    move/from16 v21, p3

    move/from16 v22, p4

    move-object/from16 v23, p5

    move-object/from16 v14, p6

    move-object/from16 v24, p7

    move/from16 v12, p8

    move/from16 v25, p9

    move/from16 v26, p10

    move-object/from16 v27, p11

    move-object/from16 v28, p12

    move-object/from16 v29, p13

    move-object/from16 v33, p14

    move-object/from16 v34, p15

    move v0, v1

    goto/16 :goto_2f

    :cond_34
    :goto_1f
    if-eqz v4, :cond_35

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_20

    :cond_35
    move-object/from16 v4, p2

    :goto_20
    if-eqz v16, :cond_36

    move/from16 v12, v18

    goto :goto_21

    :cond_36
    move/from16 v12, p3

    :goto_21
    if-eqz v19, :cond_37

    const/16 v16, 0x0

    goto :goto_22

    :cond_37
    move/from16 v16, p4

    :goto_22
    if-eqz v23, :cond_38

    sget-object v19, LL0/U;->d:LL0/U$a;

    invoke-virtual/range {v19 .. v19}, LL0/U$a;->a()LL0/U;

    move-result-object v19

    goto :goto_23

    :cond_38
    move-object/from16 v19, p5

    :goto_23
    if-eqz v28, :cond_39

    sget-object v20, LF/D;->g:LF/D$a;

    invoke-virtual/range {v20 .. v20}, LF/D$a;->a()LF/D;

    move-result-object v20

    goto :goto_24

    :cond_39
    move-object/from16 v20, p6

    :goto_24
    if-eqz v6, :cond_3a

    sget-object v6, LF/C;->g:LF/C$a;

    invoke-virtual {v6}, LF/C$a;->a()LF/C;

    move-result-object v6

    goto :goto_25

    :cond_3a
    move-object/from16 v6, p7

    :goto_25
    if-eqz v0, :cond_3b

    const/4 v0, 0x0

    goto :goto_26

    :cond_3b
    move/from16 v0, p8

    :goto_26
    and-int/lit16 v14, v11, 0x200

    if-eqz v14, :cond_3d

    if-eqz v0, :cond_3c

    move/from16 v14, v18

    goto :goto_27

    :cond_3c
    const v14, 0x7fffffff

    :goto_27
    const v21, -0x70000001

    and-int v1, v1, v21

    goto :goto_28

    :cond_3d
    move/from16 v14, p9

    :goto_28
    if-eqz v2, :cond_3e

    move/from16 v2, v18

    goto :goto_29

    :cond_3e
    move/from16 v2, p10

    :goto_29
    if-eqz v3, :cond_3f

    sget-object v3, LR0/c0;->a:LR0/c0$a;

    invoke-virtual {v3}, LR0/c0$a;->c()LR0/c0;

    move-result-object v3

    goto :goto_2a

    :cond_3f
    move-object/from16 v3, p11

    :goto_2a
    if-eqz v7, :cond_40

    sget-object v7, LF/f$a;->a:LF/f$a;

    goto :goto_2b

    :cond_40
    move-object/from16 v7, p12

    :goto_2b
    if-eqz v8, :cond_41

    const/4 v8, 0x0

    goto :goto_2c

    :cond_41
    move-object/from16 v8, p13

    :goto_2c
    if-eqz v9, :cond_42

    new-instance v9, Lm0/j1;

    sget-object v21, Lm0/v0;->b:Lm0/v0$a;

    move/from16 p2, v0

    move/from16 p3, v1

    invoke-virtual/range {v21 .. v21}, Lm0/v0$a;->a()J

    move-result-wide v0

    move/from16 p4, v2

    const/4 v2, 0x0

    invoke-direct {v9, v0, v1, v2}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2d

    :cond_42
    move/from16 p2, v0

    move/from16 p3, v1

    move/from16 p4, v2

    move-object/from16 v9, p14

    :goto_2d
    if-eqz v17, :cond_43

    sget-object v0, LF/i;->a:LF/i;

    invoke-virtual {v0}, LF/i;->b()Lmh/q;

    move-result-object v0

    move/from16 v26, p4

    move-object/from16 v34, v0

    move-object/from16 v27, v3

    move-object/from16 v24, v6

    move-object/from16 v28, v7

    move-object/from16 v29, v8

    move-object/from16 v33, v9

    move/from16 v21, v12

    move/from16 v25, v14

    move/from16 v22, v16

    move-object/from16 v23, v19

    move-object/from16 v14, v20

    move/from16 v12, p2

    move/from16 v0, p3

    :goto_2e
    move-object/from16 v20, v4

    goto :goto_2f

    :cond_43
    move/from16 v0, p3

    move/from16 v26, p4

    move-object/from16 v34, p15

    move-object/from16 v27, v3

    move-object/from16 v24, v6

    move-object/from16 v28, v7

    move-object/from16 v29, v8

    move-object/from16 v33, v9

    move/from16 v21, v12

    move/from16 v25, v14

    move/from16 v22, v16

    move-object/from16 v23, v19

    move-object/from16 v14, v20

    move/from16 v12, p2

    goto :goto_2e

    :goto_2f
    invoke-interface {v10}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_44

    const-string v1, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)"

    const v2, 0x6b8eb362

    invoke-static {v2, v0, v5, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_44
    invoke-virtual {v14, v12}, LF/D;->l(Z)LR0/s;

    move-result-object v16

    xor-int/lit8 v8, v12, 0x1

    if-eqz v12, :cond_45

    move/from16 v32, v18

    goto :goto_30

    :cond_45
    move/from16 v32, v26

    :goto_30
    if-eqz v12, :cond_46

    move/from16 v9, v18

    goto :goto_31

    :cond_46
    move/from16 v9, v25

    :goto_31
    and-int/lit8 v1, v0, 0xe

    const/4 v2, 0x4

    if-ne v1, v2, :cond_47

    move/from16 v1, v18

    goto :goto_32

    :cond_47
    const/4 v1, 0x0

    :goto_32
    and-int/lit8 v2, v0, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_48

    goto :goto_33

    :cond_48
    const/16 v18, 0x0

    :goto_33
    or-int v1, v1, v18

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_49

    goto :goto_34

    :cond_49
    move-object/from16 v7, p1

    goto :goto_35

    :cond_4a
    :goto_34
    new-instance v2, LF/f$b;

    move-object/from16 v7, p1

    invoke-direct {v2, v15, v7}, LF/f$b;-><init>(LR0/Q;Lmh/l;)V

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    :goto_35
    move-object v1, v2

    check-cast v1, Lmh/l;

    and-int/lit16 v2, v0, 0x38e

    shr-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    shl-int/lit8 v3, v5, 0x9

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int v17, v2, v3

    shr-int/lit8 v2, v0, 0xf

    and-int/lit16 v2, v2, 0x380

    and-int/lit16 v3, v0, 0x1c00

    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v5

    or-int v18, v0, v2

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v23

    move-object/from16 v4, v27

    move-object/from16 v5, v28

    move-object/from16 v6, v29

    move-object/from16 v7, v33

    move-object/from16 v30, v10

    move/from16 v10, v32

    move-object/from16 v11, v16

    move/from16 v31, v12

    move-object/from16 v12, v24

    move/from16 v13, v21

    move-object/from16 v32, v14

    move/from16 v14, v22

    move-object/from16 v15, v34

    move-object/from16 v16, v30

    invoke-static/range {v0 .. v19}, LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-static {}, LT/o;->P()V

    :cond_4b
    move-object/from16 v3, v20

    move/from16 v4, v21

    move/from16 v5, v22

    move-object/from16 v6, v23

    move-object/from16 v8, v24

    move/from16 v10, v25

    move/from16 v11, v26

    move-object/from16 v12, v27

    move-object/from16 v13, v28

    move-object/from16 v14, v29

    move/from16 v9, v31

    move-object/from16 v7, v32

    move-object/from16 v15, v33

    move-object/from16 v16, v34

    :goto_36
    invoke-interface/range {v30 .. v30}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_4c

    new-instance v1, LF/f$c;

    move-object v0, v1

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    move-object/from16 v36, v2

    move-object/from16 v2, p1

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, LF/f$c;-><init>(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;III)V

    move-object/from16 v1, v35

    move-object/from16 v0, v36

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_4c
    return-void
.end method

.method public static final d(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
    .locals 41

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v15, p17

    move/from16 v14, p18

    move/from16 v13, p19

    const v0, 0x3857730f

    move-object/from16 v3, p16

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, v13, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v15, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v15

    goto :goto_1

    :cond_2
    move v4, v15

    :goto_1
    and-int/lit8 v7, v13, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v15, 0x30

    if-nez v7, :cond_5

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, v13, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v12, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v12, v15, 0x180

    if-nez v12, :cond_6

    move-object/from16 v12, p2

    invoke-interface {v3, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v4, v4, v16

    :goto_5
    and-int/lit8 v16, v13, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v8, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v15, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p3

    invoke-interface {v3, v8}, LT/l;->c(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v4, v4, v19

    :goto_7
    and-int/lit8 v19, v13, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v15, 0x6000

    if-nez v10, :cond_c

    move/from16 v10, p4

    invoke-interface {v3, v10}, LT/l;->c(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v4, v4, v23

    :goto_9
    and-int/lit8 v23, v13, 0x20

    const/high16 v24, 0x20000

    const/high16 v25, 0x30000

    if-eqz v23, :cond_f

    or-int v4, v4, v25

    move-object/from16 v11, p5

    goto :goto_b

    :cond_f
    and-int v26, v15, v25

    move-object/from16 v11, p5

    if-nez v26, :cond_11

    invoke-interface {v3, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_10

    move/from16 v27, v24

    goto :goto_a

    :cond_10
    const/high16 v27, 0x10000

    :goto_a
    or-int v4, v4, v27

    :cond_11
    :goto_b
    and-int/lit8 v27, v13, 0x40

    const/high16 v28, 0x180000

    if-eqz v27, :cond_12

    or-int v4, v4, v28

    move-object/from16 v9, p6

    goto :goto_d

    :cond_12
    and-int v28, v15, v28

    move-object/from16 v9, p6

    if-nez v28, :cond_14

    invoke-interface {v3, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_13

    const/high16 v29, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v29, 0x80000

    :goto_c
    or-int v4, v4, v29

    :cond_14
    :goto_d
    and-int/lit16 v5, v13, 0x80

    const/high16 v30, 0xc00000

    if-eqz v5, :cond_15

    or-int v4, v4, v30

    move-object/from16 v6, p7

    goto :goto_f

    :cond_15
    and-int v30, v15, v30

    move-object/from16 v6, p7

    if-nez v30, :cond_17

    invoke-interface {v3, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_16

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v31, 0x400000

    :goto_e
    or-int v4, v4, v31

    :cond_17
    :goto_f
    and-int/lit16 v0, v13, 0x100

    const/high16 v32, 0x6000000

    if-eqz v0, :cond_18

    or-int v4, v4, v32

    move/from16 v6, p8

    goto :goto_11

    :cond_18
    and-int v32, v15, v32

    move/from16 v6, p8

    if-nez v32, :cond_1a

    invoke-interface {v3, v6}, LT/l;->c(Z)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v4, v4, v32

    :cond_1a
    :goto_11
    const/high16 v32, 0x30000000

    and-int v32, v15, v32

    if-nez v32, :cond_1d

    and-int/lit16 v6, v13, 0x200

    if-nez v6, :cond_1b

    move/from16 v6, p9

    invoke-interface {v3, v6}, LT/l;->i(I)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/high16 v32, 0x20000000

    goto :goto_12

    :cond_1b
    move/from16 v6, p9

    :cond_1c
    const/high16 v32, 0x10000000

    :goto_12
    or-int v4, v4, v32

    goto :goto_13

    :cond_1d
    move/from16 v6, p9

    :goto_13
    and-int/lit16 v6, v13, 0x400

    if-eqz v6, :cond_1e

    or-int/lit8 v32, v14, 0x6

    move/from16 v8, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v32, v14, 0x6

    move/from16 v8, p10

    if-nez v32, :cond_20

    invoke-interface {v3, v8}, LT/l;->i(I)Z

    move-result v32

    if-eqz v32, :cond_1f

    const/16 v32, 0x4

    goto :goto_14

    :cond_1f
    const/16 v32, 0x2

    :goto_14
    or-int v32, v14, v32

    goto :goto_15

    :cond_20
    move/from16 v32, v14

    :goto_15
    and-int/lit16 v8, v13, 0x800

    if-eqz v8, :cond_22

    or-int/lit8 v32, v32, 0x30

    :cond_21
    :goto_16
    move/from16 v9, v32

    goto :goto_18

    :cond_22
    and-int/lit8 v33, v14, 0x30

    move-object/from16 v9, p11

    if-nez v33, :cond_21

    invoke-interface {v3, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_23

    const/16 v33, 0x20

    goto :goto_17

    :cond_23
    const/16 v33, 0x10

    :goto_17
    or-int v32, v32, v33

    goto :goto_16

    :goto_18
    and-int/lit16 v10, v13, 0x1000

    if-eqz v10, :cond_25

    or-int/lit16 v9, v9, 0x180

    :cond_24
    move-object/from16 v11, p12

    goto :goto_1a

    :cond_25
    and-int/lit16 v11, v14, 0x180

    if-nez v11, :cond_24

    move-object/from16 v11, p12

    invoke-interface {v3, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_26

    const/16 v22, 0x100

    goto :goto_19

    :cond_26
    const/16 v22, 0x80

    :goto_19
    or-int v9, v9, v22

    :goto_1a
    and-int/lit16 v11, v13, 0x2000

    if-eqz v11, :cond_28

    or-int/lit16 v9, v9, 0xc00

    :cond_27
    move-object/from16 v12, p13

    goto :goto_1b

    :cond_28
    and-int/lit16 v12, v14, 0xc00

    if-nez v12, :cond_27

    move-object/from16 v12, p13

    invoke-interface {v3, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_29

    move/from16 v17, v18

    :cond_29
    or-int v9, v9, v17

    :goto_1b
    and-int/lit16 v12, v13, 0x4000

    if-eqz v12, :cond_2b

    or-int/lit16 v9, v9, 0x6000

    :cond_2a
    move-object/from16 v2, p14

    goto :goto_1c

    :cond_2b
    and-int/lit16 v2, v14, 0x6000

    if-nez v2, :cond_2a

    move-object/from16 v2, p14

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2c

    move/from16 v20, v21

    :cond_2c
    or-int v9, v9, v20

    :goto_1c
    const v17, 0x8000

    and-int v17, v13, v17

    if-eqz v17, :cond_2d

    or-int v9, v9, v25

    move-object/from16 v2, p15

    goto :goto_1e

    :cond_2d
    and-int v18, v14, v25

    move-object/from16 v2, p15

    if-nez v18, :cond_2f

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2e

    goto :goto_1d

    :cond_2e
    const/high16 v24, 0x10000

    :goto_1d
    or-int v9, v9, v24

    :cond_2f
    :goto_1e
    const v18, 0x12492493

    and-int v2, v4, v18

    const v14, 0x12492492

    if-ne v2, v14, :cond_31

    const v2, 0x12493

    and-int/2addr v2, v9

    const v14, 0x12492

    if-ne v2, v14, :cond_31

    invoke-interface {v3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_30

    goto :goto_1f

    :cond_30
    invoke-interface {v3}, LT/l;->C()V

    move-object/from16 v7, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v36, p13

    move-object/from16 v37, p14

    move-object/from16 v16, p15

    goto/16 :goto_39

    :cond_31
    :goto_1f
    invoke-interface {v3}, LT/l;->q()V

    and-int/lit8 v2, v15, 0x1

    const/16 v18, 0x1

    if-eqz v2, :cond_34

    invoke-interface {v3}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_32

    goto :goto_20

    :cond_32
    invoke-interface {v3}, LT/l;->C()V

    and-int/lit16 v0, v13, 0x200

    if-eqz v0, :cond_33

    const v0, -0x70000001

    and-int/2addr v4, v0

    :cond_33
    move-object/from16 v2, p2

    move/from16 v7, p3

    move/from16 v0, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move/from16 v8, p8

    move/from16 v14, p9

    move/from16 p9, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v36, p13

    move-object/from16 v37, p14

    move-object/from16 v38, p15

    move v10, v4

    move-object/from16 v4, p5

    goto/16 :goto_30

    :cond_34
    :goto_20
    if-eqz v7, :cond_35

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_21

    :cond_35
    move-object/from16 v2, p2

    :goto_21
    if-eqz v16, :cond_36

    move/from16 v7, v18

    goto :goto_22

    :cond_36
    move/from16 v7, p3

    :goto_22
    if-eqz v19, :cond_37

    const/16 v16, 0x0

    goto :goto_23

    :cond_37
    move/from16 v16, p4

    :goto_23
    if-eqz v23, :cond_38

    sget-object v19, LL0/U;->d:LL0/U$a;

    invoke-virtual/range {v19 .. v19}, LL0/U$a;->a()LL0/U;

    move-result-object v19

    goto :goto_24

    :cond_38
    move-object/from16 v19, p5

    :goto_24
    if-eqz v27, :cond_39

    sget-object v20, LF/D;->g:LF/D$a;

    invoke-virtual/range {v20 .. v20}, LF/D$a;->a()LF/D;

    move-result-object v20

    goto :goto_25

    :cond_39
    move-object/from16 v20, p6

    :goto_25
    if-eqz v5, :cond_3a

    sget-object v5, LF/C;->g:LF/C$a;

    invoke-virtual {v5}, LF/C$a;->a()LF/C;

    move-result-object v5

    goto :goto_26

    :cond_3a
    move-object/from16 v5, p7

    :goto_26
    if-eqz v0, :cond_3b

    const/4 v0, 0x0

    goto :goto_27

    :cond_3b
    move/from16 v0, p8

    :goto_27
    and-int/lit16 v14, v13, 0x200

    if-eqz v14, :cond_3d

    if-eqz v0, :cond_3c

    move/from16 v14, v18

    goto :goto_28

    :cond_3c
    const v14, 0x7fffffff

    :goto_28
    const v22, -0x70000001

    and-int v4, v4, v22

    goto :goto_29

    :cond_3d
    move/from16 v14, p9

    :goto_29
    if-eqz v6, :cond_3e

    move/from16 v6, v18

    goto :goto_2a

    :cond_3e
    move/from16 v6, p10

    :goto_2a
    if-eqz v8, :cond_3f

    sget-object v8, LR0/c0;->a:LR0/c0$a;

    invoke-virtual {v8}, LR0/c0$a;->c()LR0/c0;

    move-result-object v8

    goto :goto_2b

    :cond_3f
    move-object/from16 v8, p11

    :goto_2b
    if-eqz v10, :cond_40

    sget-object v10, LF/f$i;->a:LF/f$i;

    goto :goto_2c

    :cond_40
    move-object/from16 v10, p12

    :goto_2c
    if-eqz v11, :cond_41

    const/4 v11, 0x0

    goto :goto_2d

    :cond_41
    move-object/from16 v11, p13

    :goto_2d
    if-eqz v12, :cond_42

    new-instance v12, Lm0/j1;

    sget-object v22, Lm0/v0;->b:Lm0/v0$a;

    move/from16 p3, v4

    move-object/from16 p2, v5

    invoke-virtual/range {v22 .. v22}, Lm0/v0$a;->a()J

    move-result-wide v4

    move/from16 p4, v0

    const/4 v0, 0x0

    invoke-direct {v12, v4, v5, v0}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2e

    :cond_42
    move/from16 p4, v0

    move/from16 p3, v4

    move-object/from16 p2, v5

    move-object/from16 v12, p14

    :goto_2e
    if-eqz v17, :cond_43

    sget-object v0, LF/i;->a:LF/i;

    invoke-virtual {v0}, LF/i;->a()Lmh/q;

    move-result-object v0

    move-object/from16 v38, v0

    :goto_2f
    move/from16 p9, v6

    move-object/from16 v36, v11

    move-object/from16 v37, v12

    move/from16 v0, v16

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, p2

    move-object v11, v8

    move-object v12, v10

    move/from16 v10, p3

    move/from16 v8, p4

    goto :goto_30

    :cond_43
    move-object/from16 v38, p15

    goto :goto_2f

    :goto_30
    invoke-interface {v3}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_44

    const-string v13, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)"

    move/from16 p10, v14

    const v14, 0x3857730f

    invoke-static {v14, v10, v9, v13}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_31

    :cond_44
    move/from16 p10, v14

    :goto_31
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, LT/l;->a:LT/l$a;

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v13, v15, :cond_45

    new-instance v13, LR0/Q;

    const/4 v15, 0x6

    const/16 v16, 0x0

    const-wide/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 p2, v13

    move-object/from16 p3, p0

    move-wide/from16 p4, v19

    move-object/from16 p6, v17

    move/from16 p7, v15

    move-object/from16 p8, v16

    invoke-direct/range {p2 .. p8}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 p11, v0

    const/4 v0, 0x0

    const/4 v15, 0x2

    invoke-static {v13, v0, v15, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v13

    invoke-interface {v3, v13}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_32

    :cond_45
    move/from16 p11, v0

    :goto_32
    check-cast v13, LT/q0;

    invoke-static {v13}, LF/f;->e(LT/q0;)LR0/Q;

    move-result-object v0

    const/4 v15, 0x6

    const/16 v16, 0x0

    const-wide/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 p2, v0

    move-object/from16 p3, p0

    move-wide/from16 p4, v19

    move-object/from16 p6, v17

    move/from16 p7, v15

    move-object/from16 p8, v16

    invoke-static/range {p2 .. p8}, LR0/Q;->e(LR0/Q;Ljava/lang/String;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object v0

    invoke-interface {v3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    move/from16 p2, v7

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v15, :cond_46

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v7, v15, :cond_47

    :cond_46
    new-instance v7, LF/f$j;

    invoke-direct {v7, v0, v13}, LF/f$j;-><init>(LR0/Q;LT/q0;)V

    invoke-interface {v3, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_47
    check-cast v7, Lmh/a;

    const/4 v15, 0x0

    invoke-static {v7, v3, v15}, LT/O;->g(Lmh/a;LT/l;I)V

    and-int/lit8 v7, v10, 0xe

    const/4 v15, 0x4

    if-ne v7, v15, :cond_48

    move/from16 v7, v18

    goto :goto_33

    :cond_48
    const/4 v7, 0x0

    :goto_33
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_49

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v15, v7, :cond_4a

    :cond_49
    const/4 v7, 0x2

    const/4 v15, 0x0

    invoke-static {v1, v15, v7, v15}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v15

    invoke-interface {v3, v15}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4a
    check-cast v15, LT/q0;

    invoke-virtual {v5, v8}, LF/D;->l(Z)LR0/s;

    move-result-object v27

    xor-int/lit8 v24, v8, 0x1

    if-eqz v8, :cond_4b

    move/from16 v26, v18

    goto :goto_34

    :cond_4b
    move/from16 v26, p9

    :goto_34
    if-eqz v8, :cond_4c

    move/from16 v25, v18

    goto :goto_35

    :cond_4c
    move/from16 v25, p10

    :goto_35
    invoke-interface {v3, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v1, v10, 0x70

    move-object/from16 p3, v5

    const/16 v5, 0x20

    if-ne v1, v5, :cond_4d

    goto :goto_36

    :cond_4d
    const/16 v18, 0x0

    :goto_36
    or-int v1, v7, v18

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_4f

    invoke-virtual {v14}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_4e

    goto :goto_37

    :cond_4e
    move-object/from16 v7, p1

    goto :goto_38

    :cond_4f
    :goto_37
    new-instance v5, LF/f$k;

    move-object/from16 v7, p1

    invoke-direct {v5, v7, v13, v15}, LF/f$k;-><init>(Lmh/l;LT/q0;LT/q0;)V

    invoke-interface {v3, v5}, LT/l;->K(Ljava/lang/Object;)V

    :goto_38
    move-object/from16 v17, v5

    check-cast v17, Lmh/l;

    and-int/lit16 v1, v10, 0x380

    shr-int/lit8 v5, v10, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v1, v5

    shl-int/lit8 v5, v9, 0x9

    const v13, 0xe000

    and-int/2addr v13, v5

    or-int/2addr v1, v13

    const/high16 v13, 0x70000

    and-int/2addr v13, v5

    or-int/2addr v1, v13

    const/high16 v13, 0x380000

    and-int/2addr v13, v5

    or-int/2addr v1, v13

    const/high16 v13, 0x1c00000

    and-int/2addr v5, v13

    or-int v33, v1, v5

    shr-int/lit8 v1, v10, 0xf

    and-int/lit16 v1, v1, 0x380

    and-int/lit16 v5, v10, 0x1c00

    or-int/2addr v1, v5

    const v5, 0xe000

    and-int/2addr v5, v10

    or-int/2addr v1, v5

    const/high16 v5, 0x70000

    and-int/2addr v5, v9

    or-int v34, v1, v5

    const/16 v35, 0x0

    move-object/from16 v16, v0

    move-object/from16 v18, v2

    move-object/from16 v19, v4

    move-object/from16 v20, v11

    move-object/from16 v21, v12

    move-object/from16 v22, v36

    move-object/from16 v23, v37

    move-object/from16 v28, v6

    move/from16 v29, p2

    move/from16 v30, p11

    move-object/from16 v31, v38

    move-object/from16 v32, v3

    invoke-static/range {v16 .. v35}, LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_50

    invoke-static {}, LT/o;->P()V

    :cond_50
    move/from16 v5, p2

    move-object/from16 v9, p3

    move/from16 v13, p9

    move-object v10, v6

    move-object v14, v11

    move-object v15, v12

    move-object/from16 v16, v38

    move/from16 v12, p10

    move/from16 v6, p11

    move v11, v8

    move-object v8, v4

    move-object v4, v2

    :goto_39
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_51

    new-instance v2, LF/f$l;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object/from16 v39, v2

    move-object/from16 v2, p1

    move-object v7, v3

    move-object v3, v4

    move v4, v5

    move v5, v6

    move-object v6, v8

    move-object v8, v7

    move-object v7, v9

    move-object v9, v8

    move-object v8, v10

    move-object v10, v9

    move v9, v11

    move-object v11, v10

    move v10, v12

    move-object v12, v11

    move v11, v13

    move-object v13, v12

    move-object v12, v14

    move-object v14, v13

    move-object v13, v15

    move-object v15, v14

    move-object/from16 v14, v36

    move-object/from16 v40, v15

    move-object/from16 v15, v37

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, LF/f$l;-><init>(Ljava/lang/String;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;III)V

    move-object/from16 v1, v39

    move-object/from16 v0, v40

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_51
    return-void
.end method

.method private static final e(LT/q0;)LR0/Q;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LR0/Q;

    return-object p0
.end method

.method private static final f(LT/q0;LR0/Q;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final h(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(LJ/j;LT/l;I)V
    .locals 8

    const v0, 0x76b52065

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

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_6

    :cond_5
    new-instance v0, LF/f$q;

    invoke-direct {v0, p0}, LF/f$q;-><init>(LJ/j;)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, LT/z1;

    invoke-static {v1}, LF/f;->j(LT/z1;)LJ/d;

    move-result-object v0

    invoke-virtual {v0}, LJ/d;->e()Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, -0x12e681fc

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, LF/f$n;

    invoke-direct {v1, p0}, LF/f$n;-><init>(LJ/j;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, LM/j;

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    :cond_9
    new-instance v3, LF/f$o;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, LF/f$o;-><init>(LJ/j;Ldh/e;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lmh/p;

    invoke-static {v0, p0, v3}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-wide v3, LF/f;->b:J

    const/16 v6, 0x180

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v1 .. v7}, LF/a;->a(LM/j;Landroidx/compose/ui/e;JLT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_3

    :cond_b
    const v0, -0x12e006c2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_4
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, LF/f$p;

    invoke-direct {v0, p0, p2}, LF/f$p;-><init>(LJ/j;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final j(LT/z1;)LJ/d;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ/d;

    return-object p0
.end method

.method public static final k(LJ/j;LT/l;I)V
    .locals 13

    const v0, 0x78b77004

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

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:439)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    new-instance v0, LF/f$x;

    invoke-direct {v0, p0}, LF/f$x;-><init>(LJ/j;)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LT/z1;

    invoke-static {v0}, LF/f;->l(LT/z1;)LJ/d;

    move-result-object v1

    invoke-virtual {v1}, LJ/d;->e()Z

    move-result v1

    const/4 v12, 0x0

    if-eqz v1, :cond_a

    const v1, -0x50b4017b

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_7

    :cond_6
    new-instance v2, LF/f$r;

    invoke-direct {v2, p0}, LF/f$r;-><init>(LJ/j;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v1, v2

    check-cast v1, LM/j;

    invoke-static {v0}, LF/f;->l(LT/z1;)LJ/d;

    move-result-object v2

    invoke-virtual {v2}, LJ/d;->b()LW0/i;

    move-result-object v3

    invoke-static {v0}, LF/f;->l(LT/z1;)LJ/d;

    move-result-object v0

    invoke-virtual {v0}, LJ/d;->c()Z

    move-result v4

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_8

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_9

    :cond_8
    new-instance v5, LF/f$s;

    invoke-direct {v5, p0, v12}, LF/f$s;-><init>(LJ/j;Ldh/e;)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lmh/p;

    invoke-static {v0, p0, v5}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-wide v5, LF/f;->b:J

    const/16 v9, 0x6030

    const/4 v10, 0x0

    const/4 v2, 0x1

    move-object v8, p1

    invoke-static/range {v1 .. v10}, LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_3

    :cond_a
    const v0, -0x50ab3523

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_3
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_b

    new-instance v0, LF/f$w;

    invoke-direct {v0, p0}, LF/f$w;-><init>(LJ/j;)V

    invoke-static {v0}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, LT/z1;

    invoke-static {v0}, LF/f;->m(LT/z1;)LJ/d;

    move-result-object v1

    invoke-virtual {v1}, LJ/d;->e()Z

    move-result v1

    if-eqz v1, :cond_10

    const v1, -0x50a6bb3a

    invoke-interface {p1, v1}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_d

    :cond_c
    new-instance v2, LF/f$t;

    invoke-direct {v2, p0}, LF/f$t;-><init>(LJ/j;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v1, v2

    check-cast v1, LM/j;

    invoke-static {v0}, LF/f;->m(LT/z1;)LJ/d;

    move-result-object v2

    invoke-virtual {v2}, LJ/d;->b()LW0/i;

    move-result-object v3

    invoke-static {v0}, LF/f;->m(LT/z1;)LJ/d;

    move-result-object v0

    invoke-virtual {v0}, LJ/d;->c()Z

    move-result v4

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_e

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_f

    :cond_e
    new-instance v5, LF/f$u;

    invoke-direct {v5, p0, v12}, LF/f$u;-><init>(LJ/j;Ldh/e;)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lmh/p;

    invoke-static {v0, p0, v5}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-wide v5, LF/f;->b:J

    const/16 v9, 0x6030

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object v8, p1

    invoke-static/range {v1 .. v10}, LM/a;->b(LM/j;ZLW0/i;ZJLandroidx/compose/ui/e;LT/l;II)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_4

    :cond_10
    const v0, -0x509df2a3

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_5
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_12

    new-instance v0, LF/f$v;

    invoke-direct {v0, p0, p2}, LF/f$v;-><init>(LJ/j;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final l(LT/z1;)LJ/d;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ/d;

    return-object p0
.end method

.method private static final m(LT/z1;)LJ/d;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ/d;

    return-object p0
.end method

.method public static final synthetic n(LT/q0;)LR0/Q;
    .locals 0

    invoke-static {p0}, LF/f;->e(LT/q0;)LR0/Q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LT/q0;LR0/Q;)V
    .locals 0

    invoke-static {p0, p1}, LF/f;->f(LT/q0;LR0/Q;)V

    return-void
.end method

.method public static final synthetic p(LT/q0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LF/f;->g(LT/q0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(LT/q0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LF/f;->h(LT/q0;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic r()LH/j;
    .locals 1

    sget-object v0, LF/f;->a:LH/j;

    return-object v0
.end method
