.class public abstract LN/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/q0;->a:F

    const/16 v0, 0x8

    invoke-static {v0}, LY0/w;->g(I)J

    move-result-wide v0

    sput-wide v0, LN/q0;->b:J

    return-void
.end method

.method public static final a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZLR0/c0;LF/D;LF/C;ZIILy/m;Lm0/i1;LN/S0;LT/l;III)V
    .locals 103

    move/from16 v15, p21

    move/from16 v14, p22

    move/from16 v13, p23

    const v0, 0xe2bb703

    move-object/from16 v1, p20

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v0

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v15, 0x6

    move v4, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v15, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, LT/l;->T(Ljava/lang/Object;)Z

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
    move-object/from16 v1, p0

    move v4, v15

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v0, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit8 v8, v13, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v15, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, v13, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v2, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v2, v15, 0xc00

    if-nez v2, :cond_9

    move/from16 v2, p3

    invoke-interface {v0, v2}, LT/l;->c(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_6

    :cond_b
    move/from16 v18, v16

    :goto_6
    or-int v4, v4, v18

    :goto_7
    and-int/lit8 v18, v13, 0x10

    const/16 v19, 0x4000

    const/16 v20, 0x2000

    if-eqz v18, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v3, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v3, v15, 0x6000

    if-nez v3, :cond_c

    move/from16 v3, p4

    invoke-interface {v0, v3}, LT/l;->c(Z)Z

    move-result v22

    if-eqz v22, :cond_e

    move/from16 v22, v19

    goto :goto_8

    :cond_e
    move/from16 v22, v20

    :goto_8
    or-int v4, v4, v22

    :goto_9
    const/high16 v64, 0x30000

    and-int v22, v15, v64

    if-nez v22, :cond_10

    and-int/lit8 v22, v13, 0x20

    move-object/from16 v6, p5

    if-nez v22, :cond_f

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_f

    const/high16 v23, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v23, 0x10000

    :goto_a
    or-int v4, v4, v23

    goto :goto_b

    :cond_10
    move-object/from16 v6, p5

    :goto_b
    and-int/lit8 v23, v13, 0x40

    const/high16 v24, 0x180000

    const/high16 v25, 0x80000

    if-eqz v23, :cond_11

    or-int v4, v4, v24

    move-object/from16 v7, p6

    goto :goto_d

    :cond_11
    and-int v26, v15, v24

    move-object/from16 v7, p6

    if-nez v26, :cond_13

    invoke-interface {v0, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_12
    move/from16 v27, v25

    :goto_c
    or-int v4, v4, v27

    :cond_13
    :goto_d
    and-int/lit16 v9, v13, 0x80

    const/high16 v28, 0xc00000

    if-eqz v9, :cond_14

    or-int v4, v4, v28

    move-object/from16 v10, p7

    goto :goto_f

    :cond_14
    and-int v29, v15, v28

    move-object/from16 v10, p7

    if-nez v29, :cond_16

    invoke-interface {v0, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_15

    const/high16 v30, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v30, 0x400000

    :goto_e
    or-int v4, v4, v30

    :cond_16
    :goto_f
    and-int/lit16 v1, v13, 0x100

    const/high16 v30, 0x6000000

    if-eqz v1, :cond_17

    or-int v4, v4, v30

    move-object/from16 v2, p8

    goto :goto_11

    :cond_17
    and-int v30, v15, v30

    move-object/from16 v2, p8

    if-nez v30, :cond_19

    invoke-interface {v0, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_18

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v30, 0x2000000

    :goto_10
    or-int v4, v4, v30

    :cond_19
    :goto_11
    and-int/lit16 v2, v13, 0x200

    const/high16 v30, 0x30000000

    if-eqz v2, :cond_1a

    or-int v4, v4, v30

    move-object/from16 v3, p9

    goto :goto_13

    :cond_1a
    and-int v30, v15, v30

    move-object/from16 v3, p9

    if-nez v30, :cond_1c

    invoke-interface {v0, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1b

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v30, 0x10000000

    :goto_12
    or-int v4, v4, v30

    :cond_1c
    :goto_13
    and-int/lit16 v3, v13, 0x400

    if-eqz v3, :cond_1d

    or-int/lit8 v21, v14, 0x6

    move/from16 v5, p10

    goto :goto_15

    :cond_1d
    and-int/lit8 v30, v14, 0x6

    move/from16 v5, p10

    if-nez v30, :cond_1f

    invoke-interface {v0, v5}, LT/l;->c(Z)Z

    move-result v30

    if-eqz v30, :cond_1e

    const/16 v21, 0x4

    goto :goto_14

    :cond_1e
    const/16 v21, 0x2

    :goto_14
    or-int v21, v14, v21

    goto :goto_15

    :cond_1f
    move/from16 v21, v14

    :goto_15
    and-int/lit16 v5, v13, 0x800

    if-eqz v5, :cond_21

    or-int/lit8 v21, v21, 0x30

    :cond_20
    :goto_16
    move/from16 v6, v21

    goto :goto_18

    :cond_21
    and-int/lit8 v30, v14, 0x30

    move-object/from16 v6, p11

    if-nez v30, :cond_20

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_22

    const/16 v26, 0x20

    goto :goto_17

    :cond_22
    const/16 v26, 0x10

    :goto_17
    or-int v21, v21, v26

    goto :goto_16

    :goto_18
    and-int/lit16 v7, v13, 0x1000

    if-eqz v7, :cond_24

    or-int/lit16 v6, v6, 0x180

    :cond_23
    move-object/from16 v10, p12

    goto :goto_1a

    :cond_24
    and-int/lit16 v10, v14, 0x180

    if-nez v10, :cond_23

    move-object/from16 v10, p12

    invoke-interface {v0, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_25

    const/16 v27, 0x100

    goto :goto_19

    :cond_25
    const/16 v27, 0x80

    :goto_19
    or-int v6, v6, v27

    :goto_1a
    and-int/lit16 v10, v14, 0xc00

    if-nez v10, :cond_28

    and-int/lit16 v10, v13, 0x2000

    if-nez v10, :cond_26

    move-object/from16 v10, p13

    invoke-interface {v0, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_27

    move/from16 v16, v17

    goto :goto_1b

    :cond_26
    move-object/from16 v10, p13

    :cond_27
    :goto_1b
    or-int v6, v6, v16

    goto :goto_1c

    :cond_28
    move-object/from16 v10, p13

    :goto_1c
    and-int/lit16 v10, v13, 0x4000

    if-eqz v10, :cond_2a

    or-int/lit16 v6, v6, 0x6000

    :cond_29
    move/from16 v11, p14

    goto :goto_1e

    :cond_2a
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_29

    move/from16 v11, p14

    invoke-interface {v0, v11}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_2b

    goto :goto_1d

    :cond_2b
    move/from16 v19, v20

    :goto_1d
    or-int v6, v6, v19

    :goto_1e
    and-int v16, v14, v64

    if-nez v16, :cond_2d

    const v16, 0x8000

    and-int v16, v13, v16

    move/from16 v11, p15

    if-nez v16, :cond_2c

    invoke-interface {v0, v11}, LT/l;->i(I)Z

    move-result v16

    if-eqz v16, :cond_2c

    const/high16 v16, 0x20000

    goto :goto_1f

    :cond_2c
    const/high16 v16, 0x10000

    :goto_1f
    or-int v6, v6, v16

    goto :goto_20

    :cond_2d
    move/from16 v11, p15

    :goto_20
    const/high16 v16, 0x10000

    and-int v16, v13, v16

    if-eqz v16, :cond_2e

    or-int v6, v6, v24

    move/from16 v11, p16

    goto :goto_22

    :cond_2e
    and-int v17, v14, v24

    move/from16 v11, p16

    if-nez v17, :cond_30

    invoke-interface {v0, v11}, LT/l;->i(I)Z

    move-result v17

    if-eqz v17, :cond_2f

    const/high16 v17, 0x100000

    goto :goto_21

    :cond_2f
    move/from16 v17, v25

    :goto_21
    or-int v6, v6, v17

    :cond_30
    :goto_22
    const/high16 v17, 0x20000

    and-int v17, v13, v17

    if-eqz v17, :cond_31

    or-int v6, v6, v28

    move-object/from16 v11, p17

    goto :goto_24

    :cond_31
    and-int v19, v14, v28

    move-object/from16 v11, p17

    if-nez v19, :cond_33

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_32

    const/high16 v19, 0x800000

    goto :goto_23

    :cond_32
    const/high16 v19, 0x400000

    :goto_23
    or-int v6, v6, v19

    :cond_33
    :goto_24
    const/high16 v19, 0x6000000

    and-int v19, v14, v19

    if-nez v19, :cond_35

    const/high16 v19, 0x40000

    and-int v19, v13, v19

    move-object/from16 v11, p18

    if-nez v19, :cond_34

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_34

    const/high16 v19, 0x4000000

    goto :goto_25

    :cond_34
    const/high16 v19, 0x2000000

    :goto_25
    or-int v6, v6, v19

    goto :goto_26

    :cond_35
    move-object/from16 v11, p18

    :goto_26
    const/high16 v19, 0x30000000

    and-int v19, v14, v19

    if-nez v19, :cond_37

    and-int v19, v13, v25

    move-object/from16 v11, p19

    if-nez v19, :cond_36

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_36

    const/high16 v19, 0x20000000

    goto :goto_27

    :cond_36
    const/high16 v19, 0x10000000

    :goto_27
    or-int v6, v6, v19

    goto :goto_28

    :cond_37
    move-object/from16 v11, p19

    :goto_28
    const v19, 0x12492493

    and-int v11, v4, v19

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    const v11, 0x12492493

    and-int/2addr v11, v6

    const v14, 0x12492492

    if-ne v11, v14, :cond_39

    invoke-interface {v0}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_38

    goto :goto_29

    :cond_38
    invoke-interface {v0}, LT/l;->C()V

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    goto/16 :goto_45

    :cond_39
    :goto_29
    invoke-interface {v0}, LT/l;->q()V

    and-int/lit8 v11, v15, 0x1

    if-eqz v11, :cond_40

    invoke-interface {v0}, LT/l;->H()Z

    move-result v11

    if-eqz v11, :cond_3a

    goto :goto_2a

    :cond_3a
    invoke-interface {v0}, LT/l;->C()V

    and-int/lit8 v1, v13, 0x20

    if-eqz v1, :cond_3b

    const v1, -0x70001

    and-int/2addr v4, v1

    :cond_3b
    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_3c

    and-int/lit16 v6, v6, -0x1c01

    :cond_3c
    const v1, 0x8000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3d

    const v1, -0x70001

    and-int/2addr v6, v1

    :cond_3d
    const/high16 v1, 0x40000

    and-int/2addr v1, v13

    if-eqz v1, :cond_3e

    const v1, -0xe000001

    and-int/2addr v6, v1

    :cond_3e
    and-int v1, v13, v25

    if-eqz v1, :cond_3f

    const v1, -0x70000001

    and-int/2addr v6, v1

    :cond_3f
    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v14, p5

    move-object/from16 v65, p6

    move-object/from16 v9, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p9

    move/from16 v3, p10

    move-object/from16 v5, p11

    move-object/from16 v7, p12

    move/from16 v10, p14

    move/from16 v66, p16

    move-object/from16 v67, p17

    move-object/from16 v36, p18

    move-object/from16 v13, p19

    move v15, v4

    move-object/from16 v4, p13

    goto/16 :goto_3f

    :cond_40
    :goto_2a
    if-eqz v8, :cond_41

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_2b

    :cond_41
    move-object/from16 v8, p2

    :goto_2b
    if-eqz v12, :cond_42

    const/4 v11, 0x1

    goto :goto_2c

    :cond_42
    move/from16 v11, p3

    :goto_2c
    if-eqz v18, :cond_43

    const/4 v12, 0x0

    goto :goto_2d

    :cond_43
    move/from16 v12, p4

    :goto_2d
    and-int/lit8 v18, v13, 0x20

    if-eqz v18, :cond_44

    invoke-static {}, LN/a1;->e()LT/H0;

    move-result-object v14

    invoke-interface {v0, v14}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LL0/U;

    const v18, -0x70001

    and-int v4, v4, v18

    goto :goto_2e

    :cond_44
    move-object/from16 v14, p5

    :goto_2e
    if-eqz v23, :cond_45

    const/16 v65, 0x0

    goto :goto_2f

    :cond_45
    move-object/from16 v65, p6

    :goto_2f
    if-eqz v9, :cond_46

    const/4 v9, 0x0

    goto :goto_30

    :cond_46
    move-object/from16 v9, p7

    :goto_30
    if-eqz v1, :cond_47

    const/4 v1, 0x0

    goto :goto_31

    :cond_47
    move-object/from16 v1, p8

    :goto_31
    if-eqz v2, :cond_48

    const/4 v2, 0x0

    goto :goto_32

    :cond_48
    move-object/from16 v2, p9

    :goto_32
    if-eqz v3, :cond_49

    const/4 v3, 0x0

    goto :goto_33

    :cond_49
    move/from16 v3, p10

    :goto_33
    if-eqz v5, :cond_4a

    sget-object v5, LR0/c0;->a:LR0/c0$a;

    invoke-virtual {v5}, LR0/c0$a;->c()LR0/c0;

    move-result-object v5

    goto :goto_34

    :cond_4a
    move-object/from16 v5, p11

    :goto_34
    if-eqz v7, :cond_4b

    sget-object v7, LF/D;->g:LF/D$a;

    invoke-virtual {v7}, LF/D$a;->a()LF/D;

    move-result-object v7

    goto :goto_35

    :cond_4b
    move-object/from16 v7, p12

    :goto_35
    move-object/from16 p2, v1

    and-int/lit16 v1, v13, 0x2000

    if-eqz v1, :cond_4c

    new-instance v1, LF/C;

    const/16 v18, 0x3f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 p3, v1

    move-object/from16 p4, v20

    move-object/from16 p5, v21

    move-object/from16 p6, v22

    move-object/from16 p7, v23

    move-object/from16 p8, v24

    move-object/from16 p9, v26

    move/from16 p10, v18

    move-object/from16 p11, v19

    invoke-direct/range {p3 .. p11}, LF/C;-><init>(Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_36

    :cond_4c
    move-object/from16 v1, p13

    :goto_36
    if-eqz v10, :cond_4d

    const/4 v10, 0x0

    goto :goto_37

    :cond_4d
    move/from16 v10, p14

    :goto_37
    const v18, 0x8000

    and-int v18, v13, v18

    if-eqz v18, :cond_4f

    if-eqz v10, :cond_4e

    const/16 v18, 0x1

    :goto_38
    const v19, -0x70001

    goto :goto_39

    :cond_4e
    const v18, 0x7fffffff

    goto :goto_38

    :goto_39
    and-int v6, v6, v19

    move/from16 v102, v18

    move/from16 v18, v6

    move/from16 v6, v102

    goto :goto_3a

    :cond_4f
    move/from16 v18, v6

    move/from16 v6, p15

    :goto_3a
    if-eqz v16, :cond_50

    const/16 v66, 0x1

    goto :goto_3b

    :cond_50
    move/from16 v66, p16

    :goto_3b
    if-eqz v17, :cond_51

    const/16 v67, 0x0

    goto :goto_3c

    :cond_51
    move-object/from16 v67, p17

    :goto_3c
    const/high16 v16, 0x40000

    and-int v16, v13, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_52

    sget-object v1, LN/T0;->a:LN/T0;

    move-object/from16 p4, v2

    const/4 v2, 0x6

    invoke-virtual {v1, v0, v2}, LN/T0;->e(LT/l;I)Lm0/i1;

    move-result-object v1

    const v2, -0xe000001

    and-int v2, v18, v2

    goto :goto_3d

    :cond_52
    move-object/from16 p4, v2

    move-object/from16 v1, p18

    move/from16 v2, v18

    :goto_3d
    and-int v16, v13, v25

    if-eqz v16, :cond_53

    sget-object v16, LN/T0;->a:LN/T0;

    const/16 v62, 0x30

    const v63, 0x1fffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    move-object/from16 v59, v0

    invoke-virtual/range {v16 .. v63}, LN/T0;->f(JJJJJJJJJJJJJJJJJJJJJLT/l;IIII)LN/S0;

    move-result-object v16

    const v17, -0x70000001

    and-int v2, v2, v17

    move-object/from16 v36, v1

    move v15, v4

    move/from16 p15, v6

    move-object/from16 v13, v16

    :goto_3e
    move-object/from16 v1, p2

    move-object/from16 v4, p3

    move v6, v2

    move-object/from16 v2, p4

    goto :goto_3f

    :cond_53
    move-object/from16 v13, p19

    move-object/from16 v36, v1

    move v15, v4

    move/from16 p15, v6

    goto :goto_3e

    :goto_3f
    invoke-interface {v0}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    move-object/from16 p16, v4

    if-eqz v16, :cond_54

    const v4, 0xe2bb703

    move-object/from16 p17, v7

    const-string v7, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:366)"

    invoke-static {v4, v15, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_40

    :cond_54
    move-object/from16 p17, v7

    :goto_40
    if-nez v67, :cond_56

    const v4, -0x228dfa6a

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v4, v7, :cond_55

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v4

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_55
    check-cast v4, Ly/m;

    invoke-interface {v0}, LT/l;->J()V

    move-object/from16 v29, v4

    goto :goto_41

    :cond_56
    const v4, 0x282cf561

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->J()V

    move-object/from16 v29, v67

    :goto_41
    const v4, 0x282d0bdf

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-virtual {v14}, LL0/U;->h()J

    move-result-wide v16

    const-wide/16 v18, 0x10

    cmp-long v4, v16, v18

    if-eqz v4, :cond_57

    :goto_42
    move-wide/from16 v69, v16

    goto :goto_43

    :cond_57
    shr-int/lit8 v4, v15, 0x9

    and-int/lit8 v4, v4, 0xe

    shr-int/lit8 v7, v6, 0x18

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v4, v7

    invoke-interface {v13, v11, v0, v4}, LN/S0;->g(ZLT/l;I)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/v0;

    invoke-virtual {v4}, Lm0/v0;->u()J

    move-result-wide v16

    goto :goto_42

    :goto_43
    invoke-interface {v0}, LT/l;->J()V

    new-instance v4, LL0/U;

    move-object/from16 v68, v4

    const v98, 0xfffffe

    const/16 v99, 0x0

    const-wide/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const-wide/16 v78, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const-wide/16 v83, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const-wide/16 v90, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    invoke-direct/range {v68 .. v99}, LL0/U;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14, v4}, LL0/U;->J(LL0/U;)LL0/U;

    move-result-object v21

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v4

    invoke-interface {v0, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY0/d;

    if-eqz v65, :cond_58

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 p18, v14

    sget-object v14, LN/q0$b;->a:LN/q0$b;

    move/from16 p19, v12

    const/4 v12, 0x1

    invoke-static {v7, v12, v14}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object v7

    move v12, v15

    sget-wide v14, LN/q0;->b:J

    invoke-interface {v4, v14, v15}, LY0/l;->n0(J)F

    move-result v4

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 p2, v7

    move/from16 p3, v16

    move/from16 p4, v4

    move/from16 p5, v17

    move/from16 p6, v18

    move/from16 p7, v14

    move-object/from16 p8, v15

    invoke-static/range {p2 .. p8}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    goto :goto_44

    :cond_58
    move/from16 p19, v12

    move-object/from16 p18, v14

    move v12, v15

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    :goto_44
    invoke-interface {v8, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, LN/M0;->a:LN/M0$a;

    invoke-virtual {v7}, LN/M0$a;->c()I

    move-result v7

    const/4 v14, 0x6

    invoke-static {v7, v0, v14}, LN/N0;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v3, v7}, LN/V0;->c(Landroidx/compose/ui/e;ZLjava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, LN/T0;->a:LN/T0;

    invoke-virtual {v7}, LN/T0;->d()F

    move-result v14

    invoke-virtual {v7}, LN/T0;->c()F

    move-result v7

    invoke-static {v4, v14, v7}, Landroidx/compose/foundation/layout/r;->a(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v18

    new-instance v4, Lm0/j1;

    move-object/from16 v30, v4

    and-int/lit8 v7, v6, 0xe

    shr-int/lit8 v14, v6, 0x18

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v7, v14

    invoke-interface {v13, v3, v0, v7}, LN/S0;->f(ZLT/l;I)LT/z1;

    move-result-object v7

    invoke-interface {v7}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm0/v0;

    invoke-virtual {v7}, Lm0/v0;->u()J

    move-result-wide v14

    const/4 v7, 0x0

    invoke-direct {v4, v14, v15, v7}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LN/q0$c;

    move-object/from16 p2, v4

    move-object/from16 p3, p0

    move/from16 p4, v11

    move/from16 p5, v10

    move-object/from16 p6, v5

    move-object/from16 p7, v29

    move/from16 p8, v3

    move-object/from16 p9, v65

    move-object/from16 p10, v9

    move-object/from16 p11, v1

    move-object/from16 p12, v2

    move-object/from16 p13, v36

    move-object/from16 p14, v13

    invoke-direct/range {p2 .. p14}, LN/q0$c;-><init>(LR0/Q;ZZLR0/c0;Ly/m;ZLmh/p;Lmh/p;Lmh/p;Lmh/p;Lm0/i1;LN/S0;)V

    const/16 v7, 0x36

    const v14, -0x3bb21dc7

    const/4 v15, 0x1

    invoke-static {v14, v15, v4, v0, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v31

    const v4, 0xfc7e

    and-int/2addr v4, v12

    shl-int/lit8 v7, v6, 0xc

    const/high16 v12, 0x380000

    and-int/2addr v12, v7

    or-int/2addr v4, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v12, v7

    or-int/2addr v4, v12

    const/high16 v12, 0xe000000

    and-int/2addr v12, v7

    or-int/2addr v4, v12

    const/high16 v12, 0x70000000

    and-int/2addr v7, v12

    or-int v33, v4, v7

    shr-int/lit8 v4, v6, 0x12

    and-int/lit8 v4, v4, 0xe

    or-int v4, v4, v64

    and-int/lit8 v6, v6, 0x70

    or-int v34, v4, v6

    const/16 v35, 0x1000

    const/16 v28, 0x0

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move/from16 v19, v11

    move/from16 v20, p19

    move-object/from16 v22, p17

    move-object/from16 v23, p16

    move/from16 v24, v10

    move/from16 v25, p15

    move/from16 v26, v66

    move-object/from16 v27, v5

    move-object/from16 v32, v0

    invoke-static/range {v16 .. v35}, LF/f;->c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_59

    invoke-static {}, LT/o;->P()V

    :cond_59
    move/from16 v16, p15

    move-object/from16 v14, p16

    move-object/from16 v6, p18

    move-object v12, v5

    move v15, v10

    move v4, v11

    move-object/from16 v20, v13

    move-object/from16 v19, v36

    move-object/from16 v7, v65

    move/from16 v17, v66

    move-object/from16 v18, v67

    move-object/from16 v13, p17

    move/from16 v5, p19

    move-object v10, v2

    move v11, v3

    move-object v3, v8

    move-object v8, v9

    move-object v9, v1

    :goto_45
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_5a

    new-instance v1, LN/q0$a;

    move-object v0, v1

    move-object/from16 v100, v1

    move-object/from16 v1, p0

    move-object/from16 v101, v2

    move-object/from16 v2, p1

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    invoke-direct/range {v0 .. v23}, LN/q0$a;-><init>(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZLR0/c0;LF/D;LF/C;ZIILy/m;Lm0/i1;LN/S0;III)V

    move-object/from16 v1, v100

    move-object/from16 v0, v101

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_5a
    return-void
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/p;Lmh/q;Lmh/p;Lmh/p;Lmh/p;ZFLmh/l;Lmh/p;Lz/N;LT/l;II)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    const v0, -0x7a2970ae

    move-object/from16 v13, p11

    invoke-interface {v13, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v14, v12, 0x6

    if-nez v14, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v14, 0x4

    goto :goto_0

    :cond_0
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v12

    goto :goto_1

    :cond_1
    move v14, v12

    :goto_1
    and-int/lit8 v17, v12, 0x30

    if-nez v17, :cond_3

    invoke-interface {v13, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2

    const/16 v17, 0x20

    goto :goto_2

    :cond_2
    const/16 v17, 0x10

    :goto_2
    or-int v14, v14, v17

    :cond_3
    and-int/lit16 v0, v12, 0x180

    if-nez v0, :cond_5

    invoke-interface {v13, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr v14, v0

    :cond_5
    and-int/lit16 v0, v12, 0xc00

    if-nez v0, :cond_7

    invoke-interface {v13, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x800

    goto :goto_4

    :cond_6
    const/16 v0, 0x400

    :goto_4
    or-int/2addr v14, v0

    :cond_7
    and-int/lit16 v0, v12, 0x6000

    if-nez v0, :cond_9

    invoke-interface {v13, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4000

    goto :goto_5

    :cond_8
    const/16 v0, 0x2000

    :goto_5
    or-int/2addr v14, v0

    :cond_9
    const/high16 v0, 0x30000

    and-int/2addr v0, v12

    if-nez v0, :cond_b

    invoke-interface {v13, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/high16 v0, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v0, 0x10000

    :goto_6
    or-int/2addr v14, v0

    :cond_b
    const/high16 v0, 0x180000

    and-int/2addr v0, v12

    if-nez v0, :cond_d

    invoke-interface {v13, v7}, LT/l;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_c

    const/high16 v0, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v0, 0x80000

    :goto_7
    or-int/2addr v14, v0

    :cond_d
    const/high16 v0, 0xc00000

    and-int/2addr v0, v12

    if-nez v0, :cond_f

    invoke-interface {v13, v8}, LT/l;->g(F)Z

    move-result v0

    if-eqz v0, :cond_e

    const/high16 v0, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v0, 0x400000

    :goto_8
    or-int/2addr v14, v0

    :cond_f
    const/high16 v0, 0x6000000

    and-int/2addr v0, v12

    if-nez v0, :cond_11

    invoke-interface {v13, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/high16 v0, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v0, 0x2000000

    :goto_9
    or-int/2addr v14, v0

    :cond_11
    const/high16 v0, 0x30000000

    and-int/2addr v0, v12

    if-nez v0, :cond_13

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/high16 v0, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v0, 0x10000000

    :goto_a
    or-int/2addr v14, v0

    :cond_13
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_15

    invoke-interface {v13, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    const/4 v0, 0x4

    goto :goto_b

    :cond_14
    const/4 v0, 0x2

    :goto_b
    or-int v0, p13, v0

    goto :goto_c

    :cond_15
    move/from16 v0, p13

    :goto_c
    const v20, 0x12492493

    and-int v15, v14, v20

    const v12, 0x12492492

    if-ne v15, v12, :cond_17

    and-int/lit8 v12, v0, 0x3

    const/4 v15, 0x2

    if-ne v12, v15, :cond_17

    invoke-interface {v13}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_16

    goto :goto_d

    :cond_16
    invoke-interface {v13}, LT/l;->C()V

    move-object v7, v4

    goto/16 :goto_1d

    :cond_17
    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v12

    if-eqz v12, :cond_18

    const-string v12, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:507)"

    const v15, -0x7a2970ae

    invoke-static {v15, v14, v0, v12}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_18
    const/high16 v12, 0xe000000

    and-int/2addr v12, v14

    const/high16 v15, 0x4000000

    if-ne v12, v15, :cond_19

    const/4 v12, 0x1

    goto :goto_e

    :cond_19
    const/4 v12, 0x0

    :goto_e
    const/high16 v15, 0x380000

    and-int/2addr v15, v14

    const/high16 v4, 0x100000

    if-ne v15, v4, :cond_1a

    const/4 v4, 0x1

    goto :goto_f

    :cond_1a
    const/4 v4, 0x0

    :goto_f
    or-int/2addr v4, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v12, v14

    const/high16 v15, 0x800000

    if-ne v12, v15, :cond_1b

    const/4 v12, 0x1

    goto :goto_10

    :cond_1b
    const/4 v12, 0x0

    :goto_10
    or-int/2addr v4, v12

    and-int/lit8 v0, v0, 0xe

    const/4 v12, 0x4

    if-ne v0, v12, :cond_1c

    const/4 v0, 0x1

    goto :goto_11

    :cond_1c
    const/4 v0, 0x0

    :goto_11
    or-int/2addr v0, v4

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_1e

    :cond_1d
    new-instance v4, LN/r0;

    invoke-direct {v4, v9, v7, v8, v11}, LN/r0;-><init>(Lmh/l;ZFLz/N;)V

    invoke-interface {v13, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v4, LN/r0;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v0

    invoke-interface {v13, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    const/4 v12, 0x0

    invoke-static {v13, v12}, LT/j;->a(LT/l;I)I

    move-result v15

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v1

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_1f

    invoke-static {}, LT/j;->c()V

    :cond_1f
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_20

    invoke-interface {v13, v1}, LT/l;->D(Lmh/a;)V

    goto :goto_12

    :cond_20
    invoke-interface {v13}, LT/l;->I()V

    :goto_12
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v1, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v1, v12, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v1}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_21

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_22

    :cond_21
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v8, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_22
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v1, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    shr-int/lit8 v1, v14, 0x1b

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v13, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_27

    const v1, -0x3aedaba7

    invoke-interface {v13, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string v4, "Leading"

    invoke-static {v1, v4}, Landroidx/compose/ui/layout/f;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {}, LN/V0;->e()Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v1, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v13, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_23

    invoke-static {}, LT/j;->c()V

    :cond_23
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_24

    invoke-interface {v13, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_13

    :cond_24
    invoke-interface {v13}, LT/l;->I()V

    :goto_13
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v12, v4, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v12, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v12}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_25

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_26

    :cond_25
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_26
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v12, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v14, 0xc

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v13, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LT/l;->R()V

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_14

    :cond_27
    const v1, -0x3ae9fd6c

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    :goto_14
    if-eqz v6, :cond_2c

    const v1, -0x3ae95729

    invoke-interface {v13, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string v4, "Trailing"

    invoke-static {v1, v4}, Landroidx/compose/ui/layout/f;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {}, LN/V0;->e()Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {v1, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->e()Lf0/c;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v13, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v13, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_28

    invoke-static {}, LT/j;->c()V

    :cond_28
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_29

    invoke-interface {v13, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_15

    :cond_29
    invoke-interface {v13}, LT/l;->I()V

    :goto_15
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v12, v4, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v12, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v12}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_2a

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2b

    :cond_2a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2b
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v12, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v1, v14, 0xf

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v13, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LT/l;->R()V

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_16

    :cond_2c
    const v1, -0x3ae5a16c

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    :goto_16
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/o;->g(Lz/N;LY0/t;)F

    move-result v1

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/o;->f(Lz/N;LY0/t;)F

    move-result v0

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    if-eqz v5, :cond_2d

    invoke-static {}, LN/V0;->d()F

    move-result v7

    sub-float/2addr v1, v7

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    const/4 v7, 0x0

    int-to-float v8, v7

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v1, v8}, Lsh/m;->c(FF)F

    move-result v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    :goto_17
    move/from16 v20, v1

    goto :goto_18

    :cond_2d
    const/4 v7, 0x0

    goto :goto_17

    :goto_18
    if-eqz v6, :cond_2e

    invoke-static {}, LN/V0;->d()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    int-to-float v1, v7

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v0, v1}, Lsh/m;->c(FF)F

    move-result v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    :cond_2e
    move/from16 v22, v0

    const/16 v24, 0xa

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v4

    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    if-eqz v3, :cond_2f

    const v1, -0x3ada1187

    invoke-interface {v13, v1}, LT/l;->U(I)V

    const-string v1, "Hint"

    invoke-static {v4, v1}, Landroidx/compose/ui/layout/f;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    shr-int/lit8 v7, v14, 0x3

    and-int/lit8 v7, v7, 0x70

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v1, v13, v7}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_19

    :cond_2f
    const v1, -0x3ad8bbec

    invoke-interface {v13, v1}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    :goto_19
    const-string v1, "TextField"

    invoke-static {v4, v1}, Landroidx/compose/ui/layout/f;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v13, v8}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v13, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v15

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_30

    invoke-static {}, LT/j;->c()V

    :cond_30
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_31

    invoke-interface {v13, v15}, LT/l;->D(Lmh/a;)V

    goto :goto_1a

    :cond_31
    invoke-interface {v13}, LT/l;->I()V

    :goto_1a
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v15

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v3

    invoke-static {v15, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v15, v8, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v15}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_32

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_33

    :cond_32
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v15, v7, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_33
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v15, v0, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v0, v14, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v13, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LT/l;->R()V

    move-object/from16 v7, p3

    if-eqz v7, :cond_38

    const v0, -0x3ad53a22

    invoke-interface {v13, v0}, LT/l;->U(I)V

    const-string v0, "Label"

    invoke-static {v4, v0}, Landroidx/compose/ui/layout/f;->b(Landroidx/compose/ui/e;Ljava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v1

    invoke-static {v13, v3}, LT/j;->a(LT/l;I)I

    move-result v3

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {v13, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_34

    invoke-static {}, LT/j;->c()V

    :cond_34
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_35

    invoke-interface {v13, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_1b

    :cond_35
    invoke-interface {v13}, LT/l;->I()V

    :goto_1b
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v8, v1, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v8, v4, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v8}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_36

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_37

    :cond_36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v8, v3, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_37
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v8, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    shr-int/lit8 v0, v14, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v13, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v13}, LT/l;->R()V

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_1c

    :cond_38
    const v0, -0x3ad3f74c

    invoke-interface {v13, v0}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->J()V

    :goto_1c
    invoke-interface {v13}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-static {}, LT/o;->P()V

    :cond_39
    :goto_1d
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v14

    if-eqz v14, :cond_3a

    new-instance v15, LN/q0$d;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, LN/q0$d;-><init>(Landroidx/compose/ui/e;Lmh/p;Lmh/q;Lmh/p;Lmh/p;Lmh/p;ZFLmh/l;Lmh/p;Lz/N;II)V

    invoke-interface {v14, v15}, LT/X0;->a(Lmh/p;)V

    :cond_3a
    return-void
.end method

.method public static final synthetic c(IIIIIFJFLz/N;)I
    .locals 0

    invoke-static/range {p0 .. p9}, LN/q0;->h(IIIIIFJFLz/N;)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(IIIIIFJFLz/N;)I
    .locals 0

    invoke-static/range {p0 .. p9}, LN/q0;->i(IIIIIFJFLz/N;)I

    move-result p0

    return p0
.end method

.method public static final synthetic e()F
    .locals 1

    sget v0, LN/q0;->a:F

    return v0
.end method

.method public static final synthetic f(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;FZFLY0/t;Lz/N;)V
    .locals 0

    invoke-static/range {p0 .. p13}, LN/q0;->k(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;FZFLY0/t;Lz/N;)V

    return-void
.end method

.method public static final synthetic g(II)I
    .locals 0

    invoke-static {p0, p1}, LN/q0;->l(II)I

    move-result p0

    return p0
.end method

.method private static final h(IIIIIFJFLz/N;)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0, p5}, La1/b;->c(IIF)I

    move-result v0

    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p9}, Lz/N;->d()F

    move-result p4

    mul-float/2addr p4, p8

    int-to-float p3, p3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    invoke-static {p4, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    invoke-static {p4, p3, p5}, La1/b;->b(FFF)F

    move-result p3

    invoke-interface {p9}, Lz/N;->c()F

    move-result p4

    mul-float/2addr p4, p8

    int-to-float p2, p2

    add-float/2addr p3, p2

    add-float/2addr p3, p4

    invoke-static {p6, p7}, LY0/b;->m(J)I

    move-result p2

    invoke-static {p3}, Loh/b;->e(F)I

    move-result p3

    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method private static final i(IIIIIFJFLz/N;)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0, p5}, La1/b;->c(IIF)I

    move-result v0

    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p0, p2

    add-int/2addr p0, p1

    sget-object p1, LY0/t;->Ltr:LY0/t;

    invoke-interface {p9, p1}, Lz/N;->a(LY0/t;)F

    move-result p2

    invoke-interface {p9, p1}, Lz/N;->b(LY0/t;)F

    move-result p1

    add-float/2addr p2, p1

    invoke-static {p2}, LY0/h;->j(F)F

    move-result p1

    mul-float/2addr p1, p8

    int-to-float p2, p3

    add-float/2addr p2, p1

    mul-float/2addr p2, p5

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p1

    invoke-static {p6, p7}, LY0/b;->n(J)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final j(Landroidx/compose/ui/e;JLz/N;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, LN/q0$e;

    invoke-direct {v0, p1, p2, p3}, LN/q0$e;-><init>(JLz/N;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;FZFLY0/t;Lz/N;)V
    .locals 19

    move/from16 v0, p1

    move/from16 v8, p9

    invoke-interface/range {p13 .. p13}, Lz/N;->d()F

    move-result v1

    mul-float v1, v1, p11

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v9

    move-object/from16 v1, p12

    move-object/from16 v2, p13

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/o;->g(Lz/N;LY0/t;)F

    move-result v1

    mul-float v1, v1, p11

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v10

    invoke-static {}, LN/V0;->d()F

    move-result v1

    mul-float v11, v1, p11

    if-eqz p3, :cond_0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lf0/c$c;->a(II)I

    move-result v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_0
    if-eqz p4, :cond_1

    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    sub-int v14, p2, v1

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lf0/c$c;->a(II)I

    move-result v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p0

    move-object/from16 v13, p4

    invoke-static/range {v12 .. v18}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_1
    if-eqz p6, :cond_4

    if-eqz p10, :cond_2

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lf0/c$c;->a(II)I

    move-result v1

    goto :goto_0

    :cond_2
    move v1, v9

    :goto_0
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    neg-int v2, v2

    invoke-static {v1, v2, v8}, La1/b;->c(IIF)I

    move-result v4

    if-nez p3, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    invoke-static/range {p3 .. p3}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v11

    const/4 v2, 0x1

    int-to-float v2, v2

    sub-float/2addr v2, v8

    mul-float/2addr v1, v2

    :goto_1
    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    add-int v3, v1, v10

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_4
    if-eqz p10, :cond_5

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lf0/c$c;->a(II)I

    move-result v1

    goto :goto_2

    :cond_5
    move v1, v9

    :goto_2
    invoke-static/range {p6 .. p6}, LN/V0;->i(Landroidx/compose/ui/layout/t;)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v13

    invoke-static/range {p3 .. p3}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v12

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object/from16 v10, p0

    move-object/from16 v11, p5

    invoke-static/range {v10 .. v16}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    if-eqz p7, :cond_7

    if-eqz p10, :cond_6

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lf0/c$c;->a(II)I

    move-result v9

    :cond_6
    invoke-static/range {p6 .. p6}, LN/V0;->i(Landroidx/compose/ui/layout/t;)I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static/range {p3 .. p3}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_7
    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p1, p8

    move-wide/from16 p2, v0

    move/from16 p4, v4

    move/from16 p5, v2

    move-object/from16 p6, v3

    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    return-void
.end method

.method private static final l(II)I
    .locals 1

    const v0, 0x7fffffff

    if-ne p0, v0, :cond_0

    return p0

    :cond_0
    sub-int/2addr p0, p1

    return p0
.end method
