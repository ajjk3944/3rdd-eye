.class public abstract LAf/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LAf/H;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LAf/K;->e(Landroidx/compose/ui/e;LAf/H;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LAf/K;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;LAf/H;Lmh/a;LT/l;II)V
    .locals 39

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3d4bc0d4

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p5, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v5

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, p5, 0x2

    const/16 v9, 0x10

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    move v8, v9

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-interface {v1, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v7, v11

    :goto_5
    and-int/lit16 v11, v7, 0x93

    const/16 v12, 0x92

    if-ne v11, v12, :cond_a

    invoke-interface {v1}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v6

    goto/16 :goto_c

    :cond_a
    :goto_6
    if-eqz v3, :cond_b

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_7

    :cond_b
    move-object v3, v6

    :goto_7
    const/4 v6, 0x0

    if-eqz v8, :cond_c

    move-object/from16 v37, v6

    goto :goto_8

    :cond_c
    move-object/from16 v37, v10

    :goto_8
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_d

    const/4 v8, -0x1

    const-string v10, "com.ui.wifiman.ui.wifi.component.WmwStatusButton (WmwStatusButton.kt:57)"

    invoke-static {v0, v7, v8, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v0, v1, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->e()Lma/a$e;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$e;->b()J

    move-result-wide v10

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v12

    invoke-static {v12}, LE/h;->d(F)LE/g;

    move-result-object v12

    invoke-static {v3, v10, v11, v12}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v8}, LE/h;->d(F)LE/g;

    move-result-object v8

    invoke-static {v10, v8}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v14

    const/4 v11, 0x0

    if-eqz v37, :cond_e

    const/4 v15, 0x1

    goto :goto_9

    :cond_e
    move v15, v11

    :goto_9
    const v8, -0x321512b4

    invoke-interface {v1, v8}, LT/l;->U(I)V

    if-nez v37, :cond_10

    const v8, -0x3215115f

    invoke-interface {v1, v8}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    sget-object v12, LT/l;->a:LT/l$a;

    invoke-virtual {v12}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v8, v12, :cond_f

    new-instance v8, LAf/I;

    invoke-direct {v8}, LAf/I;-><init>()V

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    move-object/from16 v18, v8

    goto :goto_a

    :cond_10
    move-object/from16 v18, v37

    :goto_a
    invoke-interface {v1}, LT/l;->J()V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    const/4 v12, 0x0

    invoke-static {v8, v9, v12, v5, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, Lz/c;->a:Lz/c;

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v6, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v8, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v8}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v8

    const/16 v15, 0x36

    invoke-static {v6, v8, v1, v15}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v1, v11}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v1, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_11

    invoke-static {}, LT/j;->c()V

    :cond_11
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_12

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_b

    :cond_12
    invoke-interface {v1}, LT/l;->I()V

    :goto_b
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v14, v6, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v14, v9, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v14}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_13

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    :cond_13
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v14, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_14
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v14, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v14, Lz/Z;->a:Lz/Z;

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v10

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-interface {v14, v10, v9, v11}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v5

    shr-int/lit8 v6, v7, 0x3

    and-int/lit8 v6, v6, 0xe

    invoke-static {v2, v1, v6}, LAf/K;->f(LAf/H;LT/l;I)J

    move-result-wide v6

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v1

    move/from16 v9, v16

    move-object/from16 v38, v10

    move/from16 v10, v17

    invoke-static/range {v5 .. v10}, LBe/E;->b(Landroidx/compose/ui/e;JLT/l;II)V

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->I5:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    invoke-static {v5, v1, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move v6, v11

    move-object v11, v5

    invoke-virtual {v0, v1, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->a()LL0/U;

    move-result-object v32

    invoke-virtual {v0, v1, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->a()J

    move-result-wide v7

    move-object v0, v14

    move-wide v13, v7

    sget-object v5, LW0/t;->a:LW0/t$a;

    invoke-virtual {v5}, LW0/t$a;->b()I

    move-result v26

    const/16 v35, 0xc30

    const v36, 0x1d7f8

    const-wide/16 v7, 0x0

    move v5, v15

    move-wide v15, v7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x30

    move-object/from16 v33, v1

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    move-object/from16 v7, v38

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-interface {v0, v7, v8, v6}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v7

    instance-of v6, v2, LAf/H$a;

    new-instance v8, LAf/K$a;

    invoke-direct {v8, v2}, LAf/K$a;-><init>(LAf/H;)V

    const v9, 0x764fac70

    const/4 v10, 0x1

    invoke-static {v9, v10, v8, v1, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v13, 0x180006

    const/16 v14, 0x1c

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    move-object v12, v1

    invoke-static/range {v5 .. v14}, Lq/d;->e(Lz/Y;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    move-object/from16 v10, v37

    :goto_c
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v7, LAf/J;

    move-object v0, v7

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v10

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LAf/J;-><init>(Landroidx/compose/ui/e;LAf/H;Lmh/a;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_16
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;LAf/H;Lmh/a;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LAf/K;->c(Landroidx/compose/ui/e;LAf/H;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LAf/H;LT/l;I)J
    .locals 3

    const v0, 0x11ee9884

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.component.statusColor (WmwStatusButton.kt:46)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, LAf/H$c;

    if-eqz p2, :cond_1

    const p0, 0x2955d08d

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->i()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    instance-of p2, p0, LAf/H$b;

    if-eqz p2, :cond_2

    const p0, 0x2955d96d

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->h()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    instance-of p0, p0, LAf/H$a;

    if-eqz p0, :cond_4

    const p0, 0x2955e20d

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_4
    const p0, 0x2955c6d4

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
