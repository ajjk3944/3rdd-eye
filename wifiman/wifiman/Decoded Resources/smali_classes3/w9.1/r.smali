.class public abstract Lw9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw9/r$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p11}, Lw9/r;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V
    .locals 60

    move-object/from16 v14, p1

    move/from16 v13, p9

    move/from16 v6, p10

    const-string/jumbo v0, "onClick"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2ebd90ab

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v5

    and-int/lit8 v1, v6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v13, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v5, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v13

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v13

    :goto_1
    and-int/lit8 v7, v6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v13, 0x30

    if-nez v7, :cond_5

    invoke-interface {v5, v14}, LT/l;->l(Ljava/lang/Object;)Z

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
    and-int/lit8 v7, v6, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v13, 0x180

    if-nez v9, :cond_6

    move/from16 v9, p2

    invoke-interface {v5, v9}, LT/l;->c(Z)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, v6, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v13, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p3

    invoke-interface {v5, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, v6, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v13, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-interface {v5, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit8 v16, v6, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v17

    move-object/from16 v2, p5

    goto :goto_b

    :cond_f
    and-int v17, v13, v17

    move-object/from16 v2, p5

    if-nez v17, :cond_11

    invoke-interface {v5, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v4, v4, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, v6, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move-object/from16 v11, p6

    goto :goto_d

    :cond_12
    and-int v18, v13, v19

    move-object/from16 v11, p6

    if-nez v18, :cond_14

    invoke-interface {v5, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_14
    :goto_d
    const/high16 v18, 0xc00000

    and-int v19, v13, v18

    if-nez v19, :cond_17

    and-int/lit16 v8, v6, 0x80

    if-nez v8, :cond_15

    move-object/from16 v8, p7

    invoke-interface {v5, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_16

    const/high16 v21, 0x800000

    goto :goto_e

    :cond_15
    move-object/from16 v8, p7

    :cond_16
    const/high16 v21, 0x400000

    :goto_e
    or-int v4, v4, v21

    goto :goto_f

    :cond_17
    move-object/from16 v8, p7

    :goto_f
    const v21, 0x492493

    and-int v0, v4, v21

    const v2, 0x492492

    if-ne v0, v2, :cond_19

    invoke-interface {v5}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v5}, LT/l;->C()V

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object v1, v3

    move-object/from16 v19, v5

    move v3, v9

    move-object v5, v15

    goto/16 :goto_1b

    :cond_19
    :goto_10
    invoke-interface {v5}, LT/l;->q()V

    and-int/lit8 v0, v13, 0x1

    const/16 v21, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1c

    invoke-interface {v5}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-interface {v5}, LT/l;->C()V

    and-int/lit16 v0, v6, 0x80

    if-eqz v0, :cond_1b

    const v0, -0x1c00001

    and-int/2addr v4, v0

    :cond_1b
    move/from16 v25, p3

    move-object/from16 v27, p5

    move-object/from16 v23, v3

    :goto_11
    move v0, v4

    move-object v4, v8

    :goto_12
    move/from16 v24, v9

    move-object/from16 v26, v15

    goto :goto_17

    :cond_1c
    :goto_13
    if-eqz v1, :cond_1d

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_14

    :cond_1d
    move-object v0, v3

    :goto_14
    if-eqz v7, :cond_1e

    move v9, v2

    :cond_1e
    if-eqz v10, :cond_1f

    move/from16 v1, v21

    goto :goto_15

    :cond_1f
    move/from16 v1, p3

    :goto_15
    if-eqz v12, :cond_20

    const/4 v3, 0x0

    move-object v15, v3

    :cond_20
    if-eqz v16, :cond_21

    sget-object v3, Lw9/p;->DEFAULT:Lw9/p;

    goto :goto_16

    :cond_21
    move-object/from16 v3, p5

    :goto_16
    and-int/lit16 v7, v6, 0x80

    if-eqz v7, :cond_22

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v5, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->a()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->b()LL0/U;

    move-result-object v7

    const v8, -0x1c00001

    and-int/2addr v4, v8

    move-object/from16 v23, v0

    move/from16 v25, v1

    move-object/from16 v27, v3

    move v0, v4

    move-object v4, v7

    goto :goto_12

    :cond_22
    move-object/from16 v23, v0

    move/from16 v25, v1

    move-object/from16 v27, v3

    goto :goto_11

    :goto_17
    invoke-interface {v5}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_23

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.button.UiButtonPrimary (UiButtonPrimary.kt:38)"

    const v7, 0x2ebd90ab

    invoke-static {v7, v0, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_23
    sget-object v1, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v1, v5, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v1

    const v3, 0x3380eef0

    invoke-interface {v5, v3}, LT/l;->U(I)V

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    const/high16 v7, 0x70000

    and-int/2addr v7, v0

    const/high16 v8, 0x20000

    if-ne v7, v8, :cond_24

    move v7, v2

    goto :goto_18

    :cond_24
    move/from16 v7, v21

    :goto_18
    or-int/2addr v3, v7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_25

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_29

    :cond_25
    sget-object v3, Lw9/r$a;->a:[I

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v3, v3, v7

    if-eq v3, v2, :cond_28

    const/4 v7, 0x2

    if-eq v3, v7, :cond_27

    const/4 v7, 0x3

    if-ne v3, v7, :cond_26

    new-instance v3, Lw9/a;

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->f()J

    move-result-wide v29

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v31

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->l()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->c()J

    move-result-wide v35

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->d()J

    move-result-wide v37

    const/16 v39, 0x4

    const/16 v40, 0x0

    const-wide/16 v33, 0x0

    move-object/from16 v28, v3

    invoke-direct/range {v28 .. v40}, Lw9/a;-><init>(JJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_19
    move-object v7, v3

    goto :goto_1a

    :cond_26
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_27
    new-instance v3, Lw9/a;

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->g()J

    move-result-wide v29

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v31

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->c()J

    move-result-wide v35

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->d()J

    move-result-wide v37

    const/16 v39, 0x4

    const/16 v40, 0x0

    const-wide/16 v33, 0x0

    move-object/from16 v28, v3

    invoke-direct/range {v28 .. v40}, Lw9/a;-><init>(JJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_19

    :cond_28
    new-instance v3, Lw9/a;

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->f()J

    move-result-wide v42

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v44

    invoke-virtual {v1}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$a;->c()J

    move-result-wide v48

    invoke-virtual {v1}, Lma/a;->g()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->d()J

    move-result-wide v50

    const/16 v52, 0x4

    const/16 v53, 0x0

    const-wide/16 v46, 0x0

    move-object/from16 v41, v3

    invoke-direct/range {v41 .. v53}, Lw9/a;-><init>(JJJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_19

    :goto_1a
    invoke-interface {v5, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_29
    move-object/from16 v20, v7

    check-cast v20, Lw9/a;

    invoke-interface {v5}, LT/l;->J()V

    const v3, 0x338173a6

    invoke-interface {v5, v3}, LT/l;->U(I)V

    invoke-interface {v5, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_2b

    :cond_2a
    new-instance v3, Lw9/b;

    const/16 v1, 0x28

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v29

    sget-object v1, LY0/h;->b:LY0/h$a;

    invoke-virtual {v1}, LY0/h$a;->c()F

    move-result v30

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v31

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v32

    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/o;->b(FF)Lz/N;

    move-result-object v33

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/layout/o;->a(F)Lz/N;

    move-result-object v34

    const/16 v1, 0xe

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v35

    const/16 v36, 0x0

    move-object/from16 v28, v3

    invoke-direct/range {v28 .. v36}, Lw9/b;-><init>(FFFFLz/N;Lz/N;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2b
    move-object/from16 v22, v3

    check-cast v22, Lw9/b;

    invoke-interface {v5}, LT/l;->J()V

    const v1, 0x3381adaf

    invoke-interface {v5, v1}, LT/l;->U(I)V

    const/high16 v1, 0x1c00000

    and-int/2addr v1, v0

    xor-int v1, v1, v18

    const/high16 v3, 0x800000

    if-le v1, v3, :cond_2c

    invoke-interface {v5, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    :cond_2c
    and-int v1, v0, v18

    if-ne v1, v3, :cond_2e

    :cond_2d
    move/from16 v21, v2

    :cond_2e
    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v21, :cond_2f

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_30

    :cond_2f
    sget-object v1, LW0/j;->b:LW0/j$a;

    invoke-virtual {v1}, LW0/j$a;->a()I

    move-result v48

    const v58, 0xff7fff

    const/16 v59, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    move-object/from16 v28, v4

    invoke-static/range {v28 .. v59}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v1

    invoke-interface {v5, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_30
    move-object v7, v1

    check-cast v7, LL0/U;

    invoke-interface {v5}, LT/l;->J()V

    and-int/lit8 v1, v0, 0xe

    const/high16 v2, 0x30000000

    or-int/2addr v1, v2

    shr-int/lit8 v2, v0, 0x9

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v0, 0xc

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v1, v3

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int v15, v1, v2

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v16, v0

    const/16 v17, 0x1d00

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v0, 0x0

    move-object v11, v0

    const/4 v12, 0x0

    move-object/from16 v0, v23

    move-object/from16 v1, v26

    move-object/from16 v2, p6

    move/from16 v3, v24

    move-object/from16 v18, v4

    move/from16 v4, v25

    move-object/from16 v19, v5

    move-object/from16 v5, v20

    move-object/from16 v6, v22

    move-object/from16 v13, p1

    move-object/from16 v14, v19

    invoke-static/range {v0 .. v17}, Lw9/g;->b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, LT/o;->P()V

    :cond_31
    move-object/from16 v8, v18

    move-object/from16 v1, v23

    move/from16 v3, v24

    move/from16 v4, v25

    move-object/from16 v5, v26

    move-object/from16 v6, v27

    :goto_1b
    invoke-interface/range {v19 .. v19}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_32

    new-instance v12, Lw9/q;

    move-object v0, v12

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lw9/q;-><init>(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;II)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_32
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;IILT/l;I)LYg/J;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p10

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
