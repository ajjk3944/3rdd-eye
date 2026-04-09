.class public abstract LBe/U;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBe/U$b;
    }
.end annotation


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LBe/U;->g()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)LYg/J;
    .locals 0

    invoke-static {p0}, LBe/U;->i(Ljava/lang/String;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p11}, LBe/U;->j(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LBe/U;->h(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;LT/l;II)V
    .locals 22

    move-object/from16 v11, p2

    move-object/from16 v12, p7

    move/from16 v13, p9

    const-string v0, "onDismissRequest"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6640f716

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v14

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v13, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v13, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v14, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v13

    :goto_1
    and-int/lit8 v4, p10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    move/from16 v15, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v13, 0x30

    move/from16 v15, p1

    if-nez v4, :cond_5

    invoke-interface {v14, v15}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p10, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v13, 0x180

    if-nez v4, :cond_8

    invoke-interface {v14, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p10, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-wide/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v13, 0xc00

    if-nez v5, :cond_9

    move-wide/from16 v5, p3

    invoke-interface {v14, v5, v6}, LT/l;->j(J)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x800

    goto :goto_6

    :cond_b
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    :goto_7
    and-int/lit16 v7, v13, 0x6000

    if-nez v7, :cond_e

    and-int/lit8 v7, p10, 0x10

    if-nez v7, :cond_c

    move-object/from16 v7, p5

    invoke-interface {v14, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v8, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v7, p5

    :cond_d
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v3, v8

    goto :goto_9

    :cond_e
    move-object/from16 v7, p5

    :goto_9
    and-int/lit8 v8, p10, 0x20

    const/high16 v9, 0x30000

    if-eqz v8, :cond_10

    or-int/2addr v3, v9

    :cond_f
    move-object/from16 v9, p6

    goto :goto_b

    :cond_10
    and-int/2addr v9, v13

    if-nez v9, :cond_f

    move-object/from16 v9, p6

    invoke-interface {v14, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v3, v10

    :goto_b
    and-int/lit8 v10, p10, 0x40

    const/high16 v16, 0x180000

    if-eqz v10, :cond_12

    or-int v3, v3, v16

    goto :goto_d

    :cond_12
    and-int v10, v13, v16

    if-nez v10, :cond_14

    invoke-interface {v14, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_13

    const/high16 v10, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v10, 0x80000

    :goto_c
    or-int/2addr v3, v10

    :cond_14
    :goto_d
    const v10, 0x92493

    and-int/2addr v10, v3

    const v0, 0x92492

    if-ne v10, v0, :cond_16

    invoke-interface {v14}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v14}, LT/l;->C()V

    move-object v1, v2

    move-wide v4, v5

    move-object v6, v7

    move-object v7, v9

    goto/16 :goto_13

    :cond_16
    :goto_e
    invoke-interface {v14}, LT/l;->q()V

    and-int/lit8 v0, v13, 0x1

    const/4 v10, 0x1

    if-eqz v0, :cond_19

    invoke-interface {v14}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_10

    :cond_17
    invoke-interface {v14}, LT/l;->C()V

    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_18

    const v0, -0xe001

    and-int/2addr v3, v0

    :cond_18
    move-object/from16 v18, v2

    :goto_f
    move-wide/from16 v19, v5

    move-object/from16 v21, v7

    goto :goto_12

    :cond_19
    :goto_10
    if-eqz v1, :cond_1a

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_11

    :cond_1a
    move-object v0, v2

    :goto_11
    const/4 v1, 0x0

    if-eqz v4, :cond_1b

    int-to-float v2, v1

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-static {v4, v2}, LY0/i;->a(FF)J

    move-result-wide v4

    move-wide v5, v4

    :cond_1b
    and-int/lit8 v2, p10, 0x10

    if-eqz v2, :cond_1c

    invoke-static {v1, v14, v1, v10}, Landroidx/compose/foundation/m;->a(ILT/l;II)Landroidx/compose/foundation/o;

    move-result-object v1

    const v2, -0xe001

    and-int/2addr v3, v2

    move-object v7, v1

    :cond_1c
    if-eqz v8, :cond_1e

    const v1, -0x63702ee5

    invoke-interface {v14, v1}, LT/l;->U(I)V

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1d

    new-instance v1, LBe/O;

    invoke-direct {v1}, LBe/O;-><init>()V

    invoke-interface {v14, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v1, Lmh/l;

    invoke-interface {v14}, LT/l;->J()V

    move-object/from16 v18, v0

    move-object v9, v1

    goto :goto_f

    :cond_1e
    move-object/from16 v18, v0

    goto :goto_f

    :goto_12
    invoke-interface {v14}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.UiDropdownMenu (UiDropdownMenu.kt:69)"

    const v2, -0x6640f716

    invoke-static {v2, v3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1f
    new-instance v0, LBe/U$a;

    invoke-direct {v0, v12, v9}, LBe/U$a;-><init>(LCi/c;Lmh/l;)V

    const/16 v1, 0x36

    const v2, 0x8550ed7

    invoke-static {v2, v10, v0, v14, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v1, v0, 0xe

    or-int v1, v1, v16

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v1

    shl-int/lit8 v1, v3, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0x1c00

    or-int/2addr v0, v1

    const v1, 0xe000

    and-int/2addr v1, v3

    or-int v10, v0, v1

    const/16 v16, 0x20

    const/4 v6, 0x0

    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, v18

    move-wide/from16 v3, v19

    move-object/from16 v5, v21

    move-object v8, v14

    move-object/from16 v17, v9

    move v9, v10

    move/from16 v10, v16

    invoke-static/range {v0 .. v10}, LN/c;->a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    move-object/from16 v7, v17

    move-object/from16 v1, v18

    move-wide/from16 v4, v19

    move-object/from16 v6, v21

    :goto_13
    invoke-interface {v14}, LT/l;->z()LT/X0;

    move-result-object v14

    if-eqz v14, :cond_21

    new-instance v10, LBe/P;

    move-object v0, v10

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object v11, v10

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LBe/P;-><init>(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;II)V

    invoke-interface {v14, v11}, LT/X0;->a(Lmh/p;)V

    :cond_21
    return-void
.end method

.method public static final f(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;LT/l;II)V
    .locals 38

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "model"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x775c95b3

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, p6, 0x1

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v7, v12

    :goto_7
    and-int/lit16 v12, v7, 0x493

    const/16 v13, 0x492

    if-ne v12, v13, :cond_d

    invoke-interface {v1}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LT/l;->C()V

    move-object v3, v6

    move-object v4, v11

    goto/16 :goto_13

    :cond_d
    :goto_8
    if-eqz v3, :cond_e

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_9

    :cond_e
    move-object v3, v6

    :goto_9
    if-eqz v8, :cond_f

    sget-object v6, LBe/N;->a:LBe/N;

    invoke-virtual {v6}, LBe/N;->a()Lz/N;

    move-result-object v6

    move-object v8, v6

    goto :goto_a

    :cond_f
    move-object v8, v9

    :goto_a
    if-eqz v10, :cond_11

    const v6, 0x3c4ad8ce

    invoke-interface {v1, v6}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_10

    new-instance v6, LBe/Q;

    invoke-direct {v6}, LBe/Q;-><init>()V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    move-object/from16 v32, v6

    goto :goto_b

    :cond_11
    move-object/from16 v32, v11

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_12

    const/4 v6, -0x1

    const-string v9, "com.ui.wifiman.ui.component.UiDropdownMenuItem (UiDropdownMenu.kt:96)"

    invoke-static {v0, v7, v6, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    invoke-virtual/range {p1 .. p1}, LBe/N$a;->a()Z

    move-result v0

    const/4 v6, 0x6

    if-eqz v0, :cond_13

    const v0, 0x3c4ae4f3

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, Ltf/a;->a:Ltf/a;

    invoke-virtual {v0, v1, v6}, Ltf/a;->b(LT/l;I)F

    move-result v0

    :goto_c
    invoke-interface {v1}, LT/l;->J()V

    goto :goto_d

    :cond_13
    const v0, 0x3c4ae874

    invoke-interface {v1, v0}, LT/l;->U(I)V

    sget-object v0, Ltf/a;->a:Ltf/a;

    invoke-virtual {v0, v1, v6}, Ltf/a;->a(LT/l;I)F

    move-result v0

    goto :goto_c

    :goto_d
    invoke-static {v3, v0}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LBe/N$a;->a()Z

    move-result v10

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v13, v32

    invoke-static/range {v9 .. v15}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x1

    invoke-static {v0, v6, v9, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v6, 0xfa

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/16 v0, 0x2c

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v12

    const/16 v15, 0xd

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/r;->y(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v6

    sget-object v7, Lz/c;->a:Lz/c;

    const/16 v10, 0x8

    int-to-float v10, v10

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v10

    invoke-virtual {v7, v10}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    const/16 v10, 0x36

    invoke-static {v7, v6, v1, v10}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v1, v7}, LT/j;->a(LT/l;I)I

    move-result v10

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-interface {v1, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_15
    invoke-interface {v1}, LT/l;->I()V

    :goto_e
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v6, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v13, v11, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_16

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    :cond_16
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v13, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    sget-object v15, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-interface {v0, v15, v6, v9}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v14, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v14, v1, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->b()LL0/U;

    move-result-object v27

    invoke-virtual/range {p1 .. p1}, LBe/N$a;->e()LBe/N$a$a;

    move-result-object v6

    sget-object v33, LBe/U$b;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v33, v6

    if-eq v6, v9, :cond_19

    if-ne v6, v4, :cond_18

    const v6, 0x572533f6

    invoke-interface {v1, v6}, LT/l;->U(I)V

    invoke-virtual {v14, v1, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->a()Lma/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$a;->c()J

    move-result-wide v10

    invoke-interface {v1}, LT/l;->J()V

    :goto_f
    move-wide/from16 v34, v10

    goto :goto_10

    :cond_18
    const v0, 0x57251f4f

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_19
    const v6, 0x57252a0d    # 1.8160003E14f

    invoke-interface {v1, v6}, LT/l;->U(I)V

    invoke-virtual {v14, v1, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v10

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p1}, LBe/N$a;->d()Ls9/d;

    move-result-object v6

    invoke-static {v6, v1, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    const/16 v30, 0x0

    const v31, 0x1fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v7, 0x0

    move/from16 v36, v13

    move-object v13, v7

    move-object/from16 v37, v14

    move-object v14, v7

    const-wide/16 v16, 0x0

    move-object v7, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object v4, v7

    move-object v7, v0

    move-object v0, v8

    move-wide/from16 v8, v34

    move-object/from16 v28, v1

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LBe/N$a;->b()Ls9/b;

    move-result-object v6

    const v7, 0x5725413f

    invoke-interface {v1, v7}, LT/l;->U(I)V

    if-nez v6, :cond_1a

    goto :goto_12

    :cond_1a
    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LBe/N$a;->e()LBe/N$a$a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v33, v4

    const/4 v8, 0x1

    if-eq v4, v8, :cond_1c

    const/4 v8, 0x2

    if-ne v4, v8, :cond_1b

    const v4, 0x57256236

    invoke-interface {v1, v4}, LT/l;->U(I)V

    move/from16 v8, v36

    move-object/from16 v4, v37

    invoke-virtual {v4, v1, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->c()J

    move-result-wide v8

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_11

    :cond_1b
    const v0, 0x57254cf4

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->J()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1c
    move/from16 v8, v36

    move-object/from16 v4, v37

    const v9, 0x5725584d

    invoke-interface {v1, v9}, LT/l;->U(I)V

    invoke-virtual {v4, v1, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v8

    invoke-interface {v1}, LT/l;->J()V

    :goto_11
    invoke-static {v8, v9}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v8

    const/16 v11, 0x30

    const/4 v12, 0x4

    const/4 v9, 0x0

    move-object v10, v1

    invoke-static/range {v6 .. v12}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    :goto_12
    invoke-interface {v1}, LT/l;->J()V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-static {}, LT/o;->P()V

    :cond_1d
    move-object v9, v0

    move-object/from16 v4, v32

    :goto_13
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_1e

    new-instance v8, LBe/S;

    move-object v0, v8

    move-object v1, v3

    move-object/from16 v2, p1

    move-object v3, v9

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LBe/S;-><init>(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_1e
    return-void
.end method

.method private static final g()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final h(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;IILT/l;I)LYg/J;
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

    invoke-static/range {v0 .. v6}, LBe/U;->f(Landroidx/compose/ui/e;LBe/N$a;Lz/N;Lmh/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Ljava/lang/String;)LYg/J;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;IILT/l;I)LYg/J;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p10

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, LBe/U;->e(Landroidx/compose/ui/e;ZLmh/a;JLandroidx/compose/foundation/o;Lmh/l;LCi/c;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
