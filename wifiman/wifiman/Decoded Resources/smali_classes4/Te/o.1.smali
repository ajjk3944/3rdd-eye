.class public abstract LTe/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LTe/o;->f()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LTe/o;->e()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LTe/o;->g(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x12fd247c

    move-object/from16 v3, p4

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move v4, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v3, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v3, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :goto_7
    and-int/lit16 v10, v4, 0x493

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v3}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v3}, LT/l;->C()V

    move-object v4, v9

    goto/16 :goto_b

    :cond_d
    :goto_8
    if-eqz v6, :cond_f

    const v6, -0x427ef3bb

    invoke-interface {v3, v6}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_e

    new-instance v6, LTe/l;

    invoke-direct {v6}, LTe/l;-><init>()V

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    move-object v15, v6

    goto :goto_9

    :cond_f
    move-object v15, v7

    :goto_9
    if-eqz v8, :cond_11

    const v6, -0x427eeebb

    invoke-interface {v3, v6}, LT/l;->U(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_10

    new-instance v6, LTe/m;

    invoke-direct {v6}, LTe/m;-><init>()V

    invoke-interface {v3, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    move-object v14, v6

    goto :goto_a

    :cond_11
    move-object v14, v9

    :goto_a
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_12

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.signal.components.SignalMapperDeviceFoundOverlay (FloorplanDeviceFoundOverlay.kt:56)"

    invoke-static {v0, v4, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    const/16 v0, 0x154

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v1, v6, v0, v7, v4}, Landroidx/compose/foundation/layout/r;->B(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v0, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v0, v3, v4}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v8

    invoke-virtual {v8}, Loa/a;->a()LE/a;

    move-result-object v8

    invoke-virtual {v0, v3, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v9

    new-instance v0, LTe/o$a;

    invoke-direct {v0, v2, v15, v14}, LTe/o$a;-><init>(LTe/k;Lmh/a;Lmh/a;)V

    const/16 v4, 0x36

    const v11, 0x20d0fdc0

    invoke-static {v11, v7, v0, v3, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/high16 v16, 0x180000

    const/16 v17, 0x38

    const-wide/16 v11, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    move-object v7, v8

    move-wide v8, v9

    move-wide v10, v11

    move-object v12, v4

    move-object v4, v14

    move-object v14, v0

    move-object v0, v15

    move-object v15, v3

    invoke-static/range {v6 .. v17}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    move-object v7, v0

    :goto_b
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v9, LTe/n;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v7

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LTe/n;-><init>(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final e()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final f()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LTe/o;->d(Landroidx/compose/ui/e;LTe/k;Lmh/a;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
