.class public abstract LBe/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p11}, LBe/w;->c(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v9, p9

    const-string v0, "$this$ImageOrTintedIcon"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x33057bdd

    move-object/from16 v2, p8

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    const/high16 v3, -0x80000000

    and-int v3, p10, v3

    if-eqz v3, :cond_0

    or-int/lit8 v3, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move v3, v9

    :goto_1
    and-int/lit8 v4, p10, 0x1

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p10, 0x2

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v9, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, p10, 0x4

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v9, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_e

    and-int/lit8 v11, p10, 0x8

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v2, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v11, p4

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v3, v12

    goto :goto_9

    :cond_e
    move-object/from16 v11, p4

    :goto_9
    and-int/lit8 v12, p10, 0x10

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v3, v13

    :cond_f
    move/from16 v13, p5

    goto :goto_b

    :cond_10
    and-int/2addr v13, v9

    if-nez v13, :cond_f

    move/from16 v13, p5

    invoke-interface {v2, v13}, LT/l;->g(F)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v3, v14

    :goto_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v9

    if-nez v14, :cond_14

    and-int/lit8 v14, p10, 0x20

    if-nez v14, :cond_12

    move-wide/from16 v14, p6

    invoke-interface {v2, v14, v15}, LT/l;->j(J)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_12
    move-wide/from16 v14, p6

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    goto :goto_d

    :cond_14
    move-wide/from16 v14, p6

    :goto_d
    const v16, 0x92493

    and-int v0, v3, v16

    const v1, 0x92492

    if-ne v0, v1, :cond_17

    invoke-interface {v2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_f

    :cond_15
    invoke-interface {v2}, LT/l;->C()V

    :cond_16
    :goto_e
    move-object v3, v7

    move-object v4, v10

    move v6, v13

    move-wide v7, v14

    goto/16 :goto_14

    :cond_17
    :goto_f
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v0, v9, 0x1

    const v1, -0x380001

    const v16, -0xe001

    if-eqz v0, :cond_1a

    invoke-interface {v2}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_11

    :cond_18
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_19

    and-int v3, v3, v16

    :cond_19
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_21

    :goto_10
    and-int/2addr v3, v1

    goto :goto_13

    :cond_1a
    :goto_11
    if-eqz v4, :cond_1b

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v5, v0

    :cond_1b
    const/4 v0, 0x0

    if-eqz v6, :cond_1c

    move-object v7, v0

    :cond_1c
    if-eqz v8, :cond_1d

    move-object v10, v0

    :cond_1d
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_1f

    invoke-interface/range {p0 .. p0}, Ls9/a;->getContentDescription()Ls9/d;

    move-result-object v4

    if-nez v4, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v0, 0x0

    invoke-static {v4, v2, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    :goto_12
    and-int v3, v3, v16

    move-object v11, v0

    :cond_1f
    if-eqz v12, :cond_20

    const/high16 v0, 0x3f800000    # 1.0f

    move v13, v0

    :cond_20
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_21

    sget-object v0, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v0, v2, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->c()Lma/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$c;->a()J

    move-result-wide v14

    goto :goto_10

    :cond_21
    :goto_13
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_22

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.ImageOrTintedIcon (ImageOrTintedIcon.kt:23)"

    const v4, 0x33057bdd

    invoke-static {v4, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_22
    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v0

    invoke-static {v14, v15}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-virtual {v0, v1}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v0

    new-instance v1, LBe/w$a;

    move-object/from16 p1, v1

    move-object/from16 p2, p0

    move-object/from16 p3, v5

    move-object/from16 p4, v7

    move-object/from16 p5, v10

    move-object/from16 p6, v11

    move/from16 p7, v13

    invoke-direct/range {p1 .. p7}, LBe/w$a;-><init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;F)V

    const/16 v3, 0x36

    const v4, 0x92ac09d

    const/4 v6, 0x1

    invoke-static {v4, v6, v1, v2, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    sget v3, LT/I0;->i:I

    or-int/lit8 v3, v3, 0x30

    invoke-static {v0, v1, v2, v3}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LT/o;->P()V

    goto/16 :goto_e

    :goto_14
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_23

    new-instance v13, LBe/v;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object v2, v5

    move-object v5, v11

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LBe/v;-><init>(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJII)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_23
    return-void
.end method

.method private static final c(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJIILT/l;I)LYg/J;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move-object/from16 v9, p10

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
