.class public abstract Lw9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw9/e$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lw9/e;->c(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;LT/l;II)V
    .locals 57

    move-object/from16 v14, p6

    move/from16 v13, p8

    const-string/jumbo v0, "onClick"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4d55fac3    # 2.2437381E8f

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v6

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v13, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v13, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v6, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v13

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v13

    :goto_1
    and-int/lit8 v7, p9, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v13, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v6, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :goto_3
    and-int/lit8 v10, p9, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v13, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v6, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit8 v12, p9, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move-object/from16 v12, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v12, v13, 0xc00

    if-nez v12, :cond_9

    move-object/from16 v12, p3

    invoke-interface {v6, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x800

    goto :goto_6

    :cond_b
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v5, v15

    :goto_7
    and-int/lit8 v15, p9, 0x10

    if-eqz v15, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move/from16 v3, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v3, v13, 0x6000

    if-nez v3, :cond_c

    move/from16 v3, p4

    invoke-interface {v6, v3}, LT/l;->c(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v5, v5, v16

    :goto_9
    and-int/lit8 v16, p9, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v5, v5, v17

    move/from16 v2, p5

    goto :goto_b

    :cond_f
    and-int v17, v13, v17

    move/from16 v2, p5

    if-nez v17, :cond_11

    invoke-interface {v6, v2}, LT/l;->c(Z)Z

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
    and-int/lit8 v18, p9, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v5, v5, v19

    goto :goto_d

    :cond_12
    and-int v18, v13, v19

    if-nez v18, :cond_14

    invoke-interface {v6, v14}, LT/l;->l(Ljava/lang/Object;)Z

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
    const v18, 0x92493

    and-int v8, v5, v18

    const v0, 0x92492

    if-ne v8, v0, :cond_16

    invoke-interface {v6}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v6}, LT/l;->C()V

    move v5, v3

    move-object v1, v4

    move-object/from16 v18, v6

    move-object v3, v11

    move v6, v2

    move-object v2, v9

    goto/16 :goto_16

    :cond_16
    :goto_e
    if-eqz v1, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object/from16 v20, v0

    goto :goto_f

    :cond_17
    move-object/from16 v20, v4

    :goto_f
    if-eqz v7, :cond_18

    sget-object v0, Lw9/c;->DEFAULT:Lw9/c;

    move-object/from16 v21, v0

    goto :goto_10

    :cond_18
    move-object/from16 v21, v9

    :goto_10
    if-eqz v10, :cond_19

    const/4 v0, 0x0

    move-object/from16 v22, v0

    goto :goto_11

    :cond_19
    move-object/from16 v22, v11

    :goto_11
    const/4 v0, 0x1

    if-eqz v15, :cond_1a

    move/from16 v23, v0

    goto :goto_12

    :cond_1a
    move/from16 v23, v3

    :goto_12
    const/4 v1, 0x0

    if-eqz v16, :cond_1b

    move/from16 v24, v1

    goto :goto_13

    :cond_1b
    move/from16 v24, v2

    :goto_13
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1c

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.button.UiButtonInline (UiButtonInline.kt:34)"

    const v4, 0x4d55fac3    # 2.2437381E8f

    invoke-static {v4, v5, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1c
    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v6, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    const v7, -0x621afff9

    invoke-interface {v6, v7}, LT/l;->U(I)V

    invoke-interface {v6, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v8, v5, 0x70

    const/16 v9, 0x20

    if-ne v8, v9, :cond_1d

    move v1, v0

    :cond_1d
    or-int/2addr v1, v7

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_1e

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_21

    :cond_1e
    sget-object v1, Lw9/e$a;->a:[I

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v1, v1, v7

    if-eq v1, v0, :cond_20

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1f

    new-instance v0, Lw9/a;

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->a()J

    move-result-wide v26

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v28

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v30

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->a()J

    move-result-wide v32

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->i()J

    move-result-wide v34

    const/16 v36, 0x0

    move-object/from16 v25, v0

    invoke-direct/range {v25 .. v36}, Lw9/a;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_14
    move-object v7, v0

    goto :goto_15

    :cond_1f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_20
    new-instance v0, Lw9/a;

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->f()J

    move-result-wide v26

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->j()J

    move-result-wide v28

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->j()J

    move-result-wide v30

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->e()J

    move-result-wide v32

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->i()J

    move-result-wide v34

    const/16 v36, 0x0

    move-object/from16 v25, v0

    invoke-direct/range {v25 .. v36}, Lw9/a;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_14

    :goto_15
    invoke-interface {v6, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v18, v7

    check-cast v18, Lw9/a;

    invoke-interface {v6}, LT/l;->J()V

    const v0, -0x621a94b1

    invoke-interface {v6, v0}, LT/l;->U(I)V

    invoke-interface {v6, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_23

    :cond_22
    new-instance v1, Lw9/b;

    const/16 v0, 0x20

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v26

    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v27

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v28

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v29

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/o;->b(FF)Lz/N;

    move-result-object v30

    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, Landroidx/compose/foundation/layout/o;->a(F)Lz/N;

    move-result-object v31

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v32

    const/16 v33, 0x0

    move-object/from16 v25, v1

    invoke-direct/range {v25 .. v33}, Lw9/b;-><init>(FFFFLz/N;Lz/N;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    move-object/from16 v19, v1

    check-cast v19, Lw9/b;

    invoke-interface {v6}, LT/l;->J()V

    invoke-virtual {v2, v6, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v0

    const v1, -0x621a56b5

    invoke-interface {v6, v1}, LT/l;->U(I)V

    invoke-interface {v6, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_24

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_25

    :cond_24
    invoke-virtual {v0}, Lpa/c;->b()Lpa/b;

    move-result-object v0

    invoke-virtual {v0}, Lpa/b;->b()LL0/U;

    move-result-object v25

    sget-object v0, LW0/j;->b:LW0/j$a;

    invoke-virtual {v0}, LW0/j$a;->a()I

    move-result v45

    const v55, 0xff7fff

    const/16 v56, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    invoke-static/range {v25 .. v56}, LL0/U;->c(LL0/U;JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILjava/lang/Object;)LL0/U;

    move-result-object v2

    invoke-interface {v6, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_25
    move-object v7, v2

    check-cast v7, LL0/U;

    invoke-interface {v6}, LT/l;->J()V

    and-int/lit8 v0, v5, 0xe

    const/high16 v1, 0x30000000

    or-int/2addr v0, v1

    shr-int/lit8 v1, v5, 0x3

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v1, v2

    or-int v15, v0, v1

    shr-int/lit8 v0, v5, 0x9

    and-int/lit16 v0, v0, 0x1c00

    move/from16 v16, v0

    const/16 v17, 0x1d00

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v0, 0x0

    move-object v12, v0

    move-object/from16 v0, v20

    move-object/from16 v1, v22

    move-object/from16 v2, p3

    move/from16 v3, v23

    move/from16 v4, v24

    move-object/from16 v5, v18

    move-object/from16 v18, v6

    move-object/from16 v6, v19

    move-object/from16 v13, p6

    move-object/from16 v14, v18

    invoke-static/range {v0 .. v17}, Lw9/g;->b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, LT/o;->P()V

    :cond_26
    move-object/from16 v1, v20

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    move/from16 v5, v23

    move/from16 v6, v24

    :goto_16
    invoke-interface/range {v18 .. v18}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_27

    new-instance v11, Lw9/d;

    move-object v0, v11

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lw9/d;-><init>(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_27
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;IILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, Lw9/e;->b(Landroidx/compose/ui/e;Lw9/c;Ls9/b;Ljava/lang/String;ZZLmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
