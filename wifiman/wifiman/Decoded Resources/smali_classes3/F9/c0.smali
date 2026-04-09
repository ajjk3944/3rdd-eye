.class public abstract LF9/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lk0/e;Landroidx/compose/ui/focus/o;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LF9/c0;->d(Lk0/e;Landroidx/compose/ui/focus/o;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;IIILT/l;I)LYg/J;
    .locals 1

    invoke-static/range {p0 .. p23}, LF9/c0;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;IIILT/l;I)LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V
    .locals 73

    move/from16 v15, p20

    move/from16 v14, p21

    move/from16 v12, p22

    const v0, 0x631a59d4

    move-object/from16 v1, p19

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v0

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v15, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

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
    move-object/from16 v3, p0

    move v4, v15

    :goto_1
    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v15, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v0, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v4, v10

    :goto_3
    and-int/lit8 v10, v12, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v2, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v2, v15, 0x180

    if-nez v2, :cond_6

    move-object/from16 v2, p2

    invoke-interface {v0, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v4, v4, v16

    :goto_5
    and-int/lit16 v6, v15, 0xc00

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-nez v6, :cond_b

    and-int/lit8 v6, v12, 0x8

    if-nez v6, :cond_9

    move-object/from16 v6, p3

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v18

    goto :goto_6

    :cond_9
    move-object/from16 v6, p3

    :cond_a
    move/from16 v19, v17

    :goto_6
    or-int v4, v4, v19

    goto :goto_7

    :cond_b
    move-object/from16 v6, p3

    :goto_7
    and-int/lit8 v19, v12, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v0, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v4, v4, v23

    :goto_9
    and-int/lit8 v23, v12, 0x20

    const/high16 v24, 0x30000

    if-eqz v23, :cond_f

    or-int v4, v4, v24

    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int v25, v15, v24

    move-object/from16 v13, p5

    if-nez v25, :cond_11

    invoke-interface {v0, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v26, 0x10000

    :goto_a
    or-int v4, v4, v26

    :cond_11
    :goto_b
    and-int/lit8 v26, v12, 0x40

    const/high16 v27, 0x180000

    if-eqz v26, :cond_12

    or-int v4, v4, v27

    move/from16 v8, p6

    goto :goto_d

    :cond_12
    and-int v28, v15, v27

    move/from16 v8, p6

    if-nez v28, :cond_14

    invoke-interface {v0, v8}, LT/l;->c(Z)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x80000

    :goto_c
    or-int v4, v4, v28

    :cond_14
    :goto_d
    and-int/lit16 v7, v12, 0x80

    const/high16 v28, 0xc00000

    if-eqz v7, :cond_15

    or-int v4, v4, v28

    move-object/from16 v6, p7

    goto :goto_f

    :cond_15
    and-int v29, v15, v28

    move-object/from16 v6, p7

    if-nez v29, :cond_17

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/high16 v29, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v29, 0x400000

    :goto_e
    or-int v4, v4, v29

    :cond_17
    :goto_f
    const/high16 v29, 0x6000000

    and-int v29, v15, v29

    if-nez v29, :cond_1a

    and-int/lit16 v2, v12, 0x100

    if-nez v2, :cond_18

    move/from16 v2, p8

    invoke-interface {v0, v2}, LT/l;->i(I)Z

    move-result v29

    if-eqz v29, :cond_19

    const/high16 v29, 0x4000000

    goto :goto_10

    :cond_18
    move/from16 v2, p8

    :cond_19
    const/high16 v29, 0x2000000

    :goto_10
    or-int v4, v4, v29

    goto :goto_11

    :cond_1a
    move/from16 v2, p8

    :goto_11
    and-int/lit16 v6, v12, 0x200

    const/high16 v29, 0x30000000

    if-eqz v6, :cond_1c

    or-int v4, v4, v29

    :cond_1b
    move/from16 v29, v6

    move-object/from16 v6, p9

    goto :goto_13

    :cond_1c
    and-int v29, v15, v29

    if-nez v29, :cond_1b

    move/from16 v29, v6

    move-object/from16 v6, p9

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1d

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1d
    const/high16 v30, 0x10000000

    :goto_12
    or-int v4, v4, v30

    :goto_13
    and-int/lit16 v6, v12, 0x400

    if-eqz v6, :cond_1e

    or-int/lit8 v30, v14, 0x6

    move/from16 v31, v30

    move/from16 v30, v6

    move-object/from16 v6, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v30, v14, 0x6

    if-nez v30, :cond_20

    move/from16 v30, v6

    move-object/from16 v6, p10

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1f

    const/16 v31, 0x4

    goto :goto_14

    :cond_1f
    const/16 v31, 0x2

    :goto_14
    or-int v31, v14, v31

    goto :goto_15

    :cond_20
    move/from16 v30, v6

    move-object/from16 v6, p10

    move/from16 v31, v14

    :goto_15
    and-int/lit8 v32, v14, 0x30

    if-nez v32, :cond_22

    and-int/lit16 v2, v12, 0x800

    move/from16 v32, v7

    move-wide/from16 v6, p11

    if-nez v2, :cond_21

    invoke-interface {v0, v6, v7}, LT/l;->j(J)Z

    move-result v2

    if-eqz v2, :cond_21

    const/16 v16, 0x20

    goto :goto_16

    :cond_21
    const/16 v16, 0x10

    :goto_16
    or-int v31, v31, v16

    :goto_17
    move/from16 v2, v31

    goto :goto_18

    :cond_22
    move/from16 v32, v7

    move-wide/from16 v6, p11

    goto :goto_17

    :goto_18
    and-int/lit16 v6, v12, 0x1000

    if-eqz v6, :cond_24

    or-int/lit16 v2, v2, 0x180

    :cond_23
    move-object/from16 v7, p13

    goto :goto_1a

    :cond_24
    and-int/lit16 v7, v14, 0x180

    if-nez v7, :cond_23

    move-object/from16 v7, p13

    invoke-interface {v0, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_25

    const/16 v25, 0x100

    goto :goto_19

    :cond_25
    const/16 v25, 0x80

    :goto_19
    or-int v2, v2, v25

    :goto_1a
    move/from16 v16, v6

    and-int/lit16 v6, v12, 0x2000

    if-eqz v6, :cond_27

    or-int/lit16 v2, v2, 0xc00

    :cond_26
    move/from16 v3, p14

    goto :goto_1b

    :cond_27
    and-int/lit16 v3, v14, 0xc00

    if-nez v3, :cond_26

    move/from16 v3, p14

    invoke-interface {v0, v3}, LT/l;->c(Z)Z

    move-result v22

    if-eqz v22, :cond_28

    move/from16 v17, v18

    :cond_28
    or-int v2, v2, v17

    :goto_1b
    and-int/lit16 v3, v14, 0x6000

    if-nez v3, :cond_2b

    and-int/lit16 v3, v12, 0x4000

    if-nez v3, :cond_29

    move-object/from16 v3, p15

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2a

    move/from16 v20, v21

    goto :goto_1c

    :cond_29
    move-object/from16 v3, p15

    :cond_2a
    :goto_1c
    or-int v2, v2, v20

    goto :goto_1d

    :cond_2b
    move-object/from16 v3, p15

    :goto_1d
    const v17, 0x8000

    and-int v64, v12, v17

    if-eqz v64, :cond_2d

    or-int v2, v2, v24

    :cond_2c
    move/from16 v17, v6

    move-object/from16 v6, p16

    goto :goto_1f

    :cond_2d
    and-int v17, v14, v24

    if-nez v17, :cond_2c

    move/from16 v17, v6

    move-object/from16 v6, p16

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2e

    const/high16 v18, 0x20000

    goto :goto_1e

    :cond_2e
    const/high16 v18, 0x10000

    :goto_1e
    or-int v2, v2, v18

    :goto_1f
    const/high16 v18, 0x10000

    and-int v65, v12, v18

    if-eqz v65, :cond_2f

    or-int v2, v2, v27

    move-object/from16 v6, p17

    goto :goto_21

    :cond_2f
    and-int v18, v14, v27

    move-object/from16 v6, p17

    if-nez v18, :cond_31

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_30

    const/high16 v18, 0x100000

    goto :goto_20

    :cond_30
    const/high16 v18, 0x80000

    :goto_20
    or-int v2, v2, v18

    :cond_31
    :goto_21
    const/high16 v18, 0x20000

    and-int v66, v12, v18

    if-eqz v66, :cond_33

    or-int v2, v2, v28

    move-object/from16 v6, p18

    :cond_32
    :goto_22
    move/from16 v18, v2

    goto :goto_24

    :cond_33
    and-int v18, v14, v28

    move-object/from16 v6, p18

    if-nez v18, :cond_32

    invoke-interface {v0, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_34

    const/high16 v18, 0x800000

    goto :goto_23

    :cond_34
    const/high16 v18, 0x400000

    :goto_23
    or-int v2, v2, v18

    goto :goto_22

    :goto_24
    const v2, 0x12492493

    and-int/2addr v2, v4

    const v3, 0x12492492

    if-ne v2, v3, :cond_36

    const v2, 0x492493

    and-int v2, v18, v2

    const v3, 0x492492

    if-ne v2, v3, :cond_36

    invoke-interface {v0}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_35

    goto :goto_25

    :cond_35
    invoke-interface {v0}, LT/l;->C()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v10, p9

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, v6

    move-object v14, v7

    move v7, v8

    move-object v2, v9

    move-object v5, v11

    move-object v6, v13

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v11, p10

    move-wide/from16 v12, p11

    goto/16 :goto_42

    :cond_36
    :goto_25
    invoke-interface {v0}, LT/l;->q()V

    and-int/lit8 v2, v15, 0x1

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_3c

    invoke-interface {v0}, LT/l;->H()Z

    move-result v2

    if-eqz v2, :cond_37

    goto :goto_26

    :cond_37
    invoke-interface {v0}, LT/l;->C()V

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_38

    and-int/lit16 v4, v4, -0x1c01

    :cond_38
    and-int/lit16 v1, v12, 0x100

    if-eqz v1, :cond_39

    const v1, -0xe000001

    and-int/2addr v4, v1

    :cond_39
    and-int/lit16 v1, v12, 0x800

    if-eqz v1, :cond_3a

    and-int/lit8 v18, v18, -0x71

    :cond_3a
    and-int/lit16 v1, v12, 0x4000

    if-eqz v1, :cond_3b

    const v1, -0xe001

    and-int v18, v18, v1

    :cond_3b
    move-object/from16 v67, p0

    move-object/from16 v10, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p7

    move/from16 v3, p8

    move-object/from16 v6, p10

    move-wide/from16 v69, p11

    move/from16 v68, p14

    move-object/from16 v5, p15

    move-object/from16 v48, p16

    move-object/from16 v49, p17

    move-object/from16 p17, p18

    move v12, v4

    move/from16 v14, v18

    move-object/from16 v4, p9

    goto/16 :goto_36

    :cond_3c
    :goto_26
    if-eqz v1, :cond_3d

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v67, v1

    goto :goto_27

    :cond_3d
    move-object/from16 v67, p0

    :goto_27
    if-eqz v5, :cond_3e

    const/4 v9, 0x0

    :cond_3e
    if-eqz v10, :cond_3f

    const/4 v10, 0x0

    goto :goto_28

    :cond_3f
    move-object/from16 v10, p2

    :goto_28
    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_40

    const/4 v5, 0x0

    const/16 v20, 0x3

    const/4 v1, 0x0

    const-wide/16 v21, 0x0

    move-wide/from16 v2, v21

    move/from16 v68, v4

    move-object v4, v0

    move/from16 v21, v16

    move/from16 v22, v17

    move/from16 v16, v29

    move/from16 v17, v30

    const/4 v7, 0x0

    move/from16 v6, v20

    invoke-static/range {v1 .. v6}, LH/m;->b(Ljava/lang/String;JLT/l;II)LH/l;

    move-result-object v1

    move/from16 v4, v68

    and-int/lit16 v4, v4, -0x1c01

    goto :goto_29

    :cond_40
    move/from16 v21, v16

    move/from16 v22, v17

    move/from16 v16, v29

    move/from16 v17, v30

    const/4 v7, 0x0

    move-object/from16 v1, p3

    :goto_29
    if-eqz v19, :cond_41

    move-object v11, v7

    :cond_41
    if-eqz v23, :cond_42

    move-object v13, v7

    :cond_42
    if-eqz v26, :cond_43

    const/4 v8, 0x1

    :cond_43
    if-eqz v32, :cond_44

    move-object v2, v7

    goto :goto_2a

    :cond_44
    move-object/from16 v2, p7

    :goto_2a
    and-int/lit16 v3, v12, 0x100

    if-eqz v3, :cond_45

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->b()I

    move-result v3

    const v5, -0xe000001

    and-int/2addr v4, v5

    goto :goto_2b

    :cond_45
    move/from16 v3, p8

    :goto_2b
    if-eqz v16, :cond_46

    move-object v5, v7

    goto :goto_2c

    :cond_46
    move-object/from16 v5, p9

    :goto_2c
    if-eqz v17, :cond_47

    move-object v6, v7

    goto :goto_2d

    :cond_47
    move-object/from16 v6, p10

    :goto_2d
    and-int/lit16 v7, v12, 0x800

    if-eqz v7, :cond_48

    sget-object v7, Lla/a;->a:Lla/a;

    move-object/from16 p0, v1

    sget v1, Lla/a;->b:I

    invoke-virtual {v7, v0, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a;->f()Lma/a$f;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$f;->a()J

    move-result-wide v16

    and-int/lit8 v18, v18, -0x71

    move-wide/from16 v69, v16

    :goto_2e
    move/from16 v1, v18

    goto :goto_2f

    :cond_48
    move-object/from16 p0, v1

    move-wide/from16 v69, p11

    goto :goto_2e

    :goto_2f
    if-eqz v21, :cond_49

    invoke-static {}, LCi/a;->d()LCi/h;

    move-result-object v7

    goto :goto_30

    :cond_49
    move-object/from16 v7, p13

    :goto_30
    if-eqz v22, :cond_4a

    const/16 v68, 0x0

    goto :goto_31

    :cond_4a
    move/from16 v68, p14

    :goto_31
    move-object/from16 p1, v2

    and-int/lit16 v2, v12, 0x4000

    if-eqz v2, :cond_4b

    new-instance v2, Lm0/j1;

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

    move/from16 p2, v3

    invoke-virtual/range {v16 .. v63}, LN/T0;->i(JJJJJJJJJJJJJJJJJJJJJLT/l;IIII)LN/S0;

    move-result-object v3

    move/from16 p3, v4

    const/4 v4, 0x6

    move-object/from16 p4, v5

    const/4 v5, 0x0

    invoke-interface {v3, v5, v0, v4}, LN/S0;->f(ZLT/l;I)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v3, -0xe001

    and-int/2addr v1, v3

    :goto_32
    move/from16 v18, v1

    goto :goto_33

    :cond_4b
    move/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 v2, p15

    goto :goto_32

    :goto_33
    if-eqz v64, :cond_4c

    sget-object v1, LF/D;->g:LF/D$a;

    invoke-virtual {v1}, LF/D$a;->a()LF/D;

    move-result-object v1

    goto :goto_34

    :cond_4c
    move-object/from16 v1, p16

    :goto_34
    if-eqz v65, :cond_4d

    const/4 v3, 0x0

    goto :goto_35

    :cond_4d
    move-object/from16 v3, p17

    :goto_35
    if-eqz v66, :cond_4f

    const v4, -0x30361ce5    # -6.774208E9f

    invoke-interface {v0, v4}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_4e

    new-instance v4, Landroidx/compose/ui/focus/o;

    invoke-direct {v4}, Landroidx/compose/ui/focus/o;-><init>()V

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4e
    check-cast v4, Landroidx/compose/ui/focus/o;

    invoke-interface {v0}, LT/l;->J()V

    move/from16 v12, p3

    move-object/from16 v48, v1

    move-object v5, v2

    move-object/from16 v49, v3

    move-object/from16 p17, v4

    move/from16 v14, v18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p4

    goto :goto_36

    :cond_4f
    move/from16 v12, p3

    move-object/from16 v4, p4

    move-object/from16 p17, p18

    move-object/from16 v48, v1

    move-object v5, v2

    move-object/from16 v49, v3

    move/from16 v14, v18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    :goto_36
    invoke-interface {v0}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_50

    const v15, 0x631a59d4

    move-object/from16 p18, v10

    const-string/jumbo v10, "com.ui.core.ui.component.settings.UiSettingsTextField2 (UiSettingsTextField2.kt:79)"

    invoke-static {v15, v12, v14, v10}, LT/o;->Q(IIILjava/lang/String;)V

    goto :goto_37

    :cond_50
    move-object/from16 p18, v10

    :goto_37
    const v10, -0x303614e0

    invoke-interface {v0, v10}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    sget-object v15, LT/l;->a:LT/l$a;

    move-object/from16 v50, v9

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_51

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move/from16 v51, v12

    const/4 v10, 0x2

    const/4 v12, 0x0

    invoke-static {v9, v12, v10, v12}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v10

    invoke-interface {v0, v10}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_38

    :cond_51
    move/from16 v51, v12

    :goto_38
    move-object v9, v10

    check-cast v9, LT/q0;

    invoke-interface {v0}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->h()LT/H0;

    move-result-object v10

    invoke-interface {v0, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lk0/e;

    invoke-virtual {v1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v12

    invoke-static {v12}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_52

    goto :goto_39

    :cond_52
    const/4 v12, 0x0

    :goto_39
    if-eqz v68, :cond_53

    if-eqz v12, :cond_53

    const/4 v12, 0x1

    goto :goto_3a

    :cond_53
    const/4 v12, 0x0

    :goto_3a
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-interface {v9, v12}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, LN/a1;->e()LT/H0;

    move-result-object v12

    invoke-interface {v0, v12}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v12

    check-cast v16, LL0/U;

    if-nez v8, :cond_54

    const v12, -0x3035e7a0

    invoke-interface {v0, v12}, LT/l;->U(I)V

    sget-object v12, Lla/a;->a:Lla/a;

    move/from16 v52, v14

    sget v14, Lla/a;->b:I

    invoke-virtual {v12, v0, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v12

    invoke-virtual {v12}, Lma/a;->f()Lma/a$f;

    move-result-object v12

    invoke-virtual {v12}, Lma/a$f;->d()J

    move-result-wide v17

    :goto_3b
    invoke-interface {v0}, LT/l;->J()V

    const/16 v12, 0x10

    goto :goto_3c

    :cond_54
    move/from16 v52, v14

    const v12, -0x3035e420

    invoke-interface {v0, v12}, LT/l;->U(I)V

    sget-object v12, Lla/a;->a:Lla/a;

    sget v14, Lla/a;->b:I

    invoke-virtual {v12, v0, v14}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v12

    invoke-virtual {v12}, Lma/a;->f()Lma/a$f;

    move-result-object v12

    invoke-virtual {v12}, Lma/a$f;->a()J

    move-result-wide v17

    goto :goto_3b

    :goto_3c
    invoke-static {v12}, LY0/w;->g(I)J

    move-result-wide v19

    sget-object v12, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v12}, LQ0/A$a;->e()LQ0/A;

    move-result-object v21

    const/16 v12, 0x18

    invoke-static {v12}, LY0/w;->g(I)J

    move-result-wide v38

    const/4 v12, 0x0

    invoke-static {v12}, LY0/w;->g(I)J

    move-result-wide v26

    const v46, 0xfd7f78

    const/16 v47, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move/from16 v36, v3

    invoke-static/range {v16 .. v47}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v14

    if-eqz v13, :cond_55

    invoke-static {v13}, LG9/h;->c(Lmh/a;)Lmh/q;

    move-result-object v16

    move-object/from16 v28, v16

    goto :goto_3d

    :cond_55
    const/16 v28, 0x0

    :goto_3d
    const v12, -0x3035a643

    invoke-interface {v0, v12}, LT/l;->U(I)V

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v39, v13

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_56

    new-instance v12, LF9/l$a;

    const/4 v13, 0x0

    move-object/from16 v40, v2

    move-object/from16 v16, v15

    const/4 v2, 0x1

    const/4 v15, 0x0

    invoke-direct {v12, v13, v2, v15}, LF9/l$a;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v12}, LT/l;->K(Ljava/lang/Object;)V

    goto :goto_3e

    :cond_56
    move-object/from16 v40, v2

    move-object/from16 v16, v15

    const/4 v2, 0x1

    :goto_3e
    move-object/from16 v33, v12

    check-cast v33, LF9/l$a;

    invoke-interface {v0}, LT/l;->J()V

    new-instance v12, LF9/c0$a;

    move-object/from16 p0, v12

    move-object/from16 p1, v6

    move/from16 p2, v8

    move-wide/from16 p3, v69

    move-object/from16 p5, v9

    move-object/from16 p6, v1

    move-object/from16 p7, v4

    move-object/from16 p8, v7

    move-object/from16 p9, v10

    move-object/from16 p10, p17

    move-object/from16 p11, v11

    move-object/from16 p12, v14

    move-object/from16 p13, v48

    move-object/from16 p14, v49

    move-object/from16 p15, v5

    move/from16 p16, v3

    invoke-direct/range {p0 .. p16}, LF9/c0$a;-><init>(Ljava/lang/String;ZJLT/q0;LH/l;Ljava/lang/String;LCi/e;Lk0/e;Landroidx/compose/ui/focus/o;LH/b;LL0/U;LF/D;LH/d;Lm0/l0;I)V

    const/16 v9, 0x36

    const v13, -0x26563ae7

    invoke-static {v13, v2, v12, v0, v9}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v27

    new-instance v9, LF9/c0$b;

    move-object/from16 v12, v40

    invoke-direct {v9, v12}, LF9/c0$b;-><init>(Ljava/lang/String;)V

    const/16 v13, 0x36

    const v14, 0x1a850dd8

    invoke-static {v14, v2, v9, v0, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v29

    const v9, -0x3035c0c7

    invoke-interface {v0, v9}, LT/l;->U(I)V

    invoke-interface {v0, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v9

    const/high16 v13, 0x1c00000

    and-int v13, v52, v13

    const/high16 v14, 0x800000

    if-ne v13, v14, :cond_57

    goto :goto_3f

    :cond_57
    const/4 v2, 0x0

    :goto_3f
    or-int/2addr v2, v9

    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_59

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v9, v2, :cond_58

    goto :goto_40

    :cond_58
    move-object/from16 v2, p17

    goto :goto_41

    :cond_59
    :goto_40
    new-instance v9, LF9/Z;

    move-object/from16 v2, p17

    invoke-direct {v9, v10, v2}, LF9/Z;-><init>(Lk0/e;Landroidx/compose/ui/focus/o;)V

    invoke-interface {v0, v9}, LT/l;->K(Ljava/lang/Object;)V

    :goto_41
    move-object/from16 v34, v9

    check-cast v34, Lmh/a;

    invoke-interface {v0}, LT/l;->J()V

    and-int/lit8 v9, v51, 0xe

    const/high16 v10, 0x6000000

    or-int/2addr v9, v10

    and-int/lit8 v10, v51, 0x70

    or-int/2addr v9, v10

    move/from16 v10, v51

    and-int/lit16 v13, v10, 0x380

    or-int v36, v9, v13

    shr-int/lit8 v9, v10, 0xc

    and-int/lit16 v9, v9, 0x380

    or-int/lit16 v9, v9, 0x6006

    move/from16 v37, v9

    const/16 v38, 0x28f8

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v16, v67

    move-object/from16 v17, v50

    move-object/from16 v18, p18

    move/from16 v31, v8

    move-object/from16 v35, v0

    invoke-static/range {v16 .. v38}, LF9/q;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;JJJILmh/q;Lmh/q;Lmh/q;Lmh/q;Lz/N;ZLjava/lang/Boolean;LF9/l;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_5a

    invoke-static {}, LT/o;->P()V

    :cond_5a
    move-object/from16 v19, v2

    move v9, v3

    move-object v10, v4

    move-object/from16 v16, v5

    move-object v14, v7

    move v7, v8

    move-object v5, v11

    move-object v8, v12

    move-object/from16 v17, v48

    move-object/from16 v18, v49

    move-object/from16 v2, v50

    move/from16 v15, v68

    move-wide/from16 v12, v69

    move-object/from16 v3, p18

    move-object v4, v1

    move-object v11, v6

    move-object/from16 v6, v39

    move-object/from16 v1, v67

    :goto_42
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_5b

    move/from16 p0, v15

    new-instance v15, LF9/a0;

    move-object/from16 v71, v0

    move-object v0, v15

    move-object/from16 v72, v15

    move/from16 v15, p0

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, LF9/a0;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;III)V

    move-object/from16 v0, v71

    move-object/from16 v1, v72

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_5b
    return-void
.end method

.method private static final d(Lk0/e;Landroidx/compose/ui/focus/o;)LYg/J;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lk0/e;->c(Lk0/e;ZILjava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/compose/ui/focus/o;->f()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;IIILT/l;I)LYg/J;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-wide/from16 v11, p11

    move-object/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move/from16 v22, p21

    move-object/from16 v19, p22

    or-int/lit8 v20, p19, 0x1

    invoke-static/range {v20 .. v20}, LT/L0;->a(I)I

    move-result v20

    invoke-static/range {p20 .. p20}, LT/L0;->a(I)I

    move-result v21

    invoke-static/range {v0 .. v22}, LF9/c0;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;LH/l;LH/b;Lmh/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLCi/e;ZLm0/l0;LF/D;LH/d;Landroidx/compose/ui/focus/o;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
