.class public abstract LHe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LHe/i;->e(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, LHe/i;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;LT/l;II)V
    .locals 19

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x1e6b62a2

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p6, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

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
    move v7, v3

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move-object/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :goto_3
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_6

    move/from16 v11, p2

    invoke-interface {v1, v11}, LT/l;->c(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v7, v12

    :goto_5
    and-int/lit8 v12, p6, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_b

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v7, v12

    :cond_b
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

    move-object v2, v6

    move v3, v11

    goto/16 :goto_d

    :cond_d
    :goto_8
    if-eqz v2, :cond_e

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_9

    :cond_e
    move-object v2, v6

    :goto_9
    if-eqz v8, :cond_10

    const v6, 0x2429b596

    invoke-interface {v1, v6}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_f

    new-instance v6, LHe/g;

    invoke-direct {v6}, LHe/g;-><init>()V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    move-object/from16 v17, v6

    goto :goto_a

    :cond_10
    move-object/from16 v17, v9

    :goto_a
    if-eqz v10, :cond_11

    const/4 v6, 0x1

    move/from16 v18, v6

    goto :goto_b

    :cond_11
    move/from16 v18, v11

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_12

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.component.toolbar.UiToolbarActionTextButton (UiToolbarActionsContainer.kt:18)"

    invoke-static {v0, v7, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {v2, v0, v6, v3, v8}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const v0, 0x2429d641

    invoke-interface {v1, v0}, LT/l;->U(I)V

    if-nez v4, :cond_13

    move-object v12, v8

    goto :goto_c

    :cond_13
    shr-int/lit8 v0, v7, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v4, v1, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    :goto_c
    invoke-interface {v1}, LT/l;->J()V

    and-int/lit8 v0, v7, 0x70

    or-int/lit16 v0, v0, 0x6000

    and-int/lit16 v3, v7, 0x380

    or-int v15, v0, v3

    const/16 v16, 0xa8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v7, v17

    move/from16 v8, v18

    move-object v14, v1

    invoke-static/range {v6 .. v16}, Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LT/o;->P()V

    :cond_14
    move-object/from16 v9, v17

    move/from16 v3, v18

    :goto_d
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v8, LHe/h;

    move-object v0, v8

    move-object v1, v2

    move-object v2, v9

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LHe/h;-><init>(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;II)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_15
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;IILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p6

    move v6, p5

    invoke-static/range {v0 .. v6}, LHe/i;->c(Landroidx/compose/ui/e;Lmh/a;ZLs9/d;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
