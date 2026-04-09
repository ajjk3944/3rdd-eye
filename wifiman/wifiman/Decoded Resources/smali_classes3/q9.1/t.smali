.class public abstract Lq9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Lq9/t;->c(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;LT/l;II)V
    .locals 23

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p7

    const-string/jumbo v0, "avatar"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "avatarPlaceholder"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7123377d

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v1, p8, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, v11, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v11

    :goto_1
    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_5

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_8

    invoke-interface {v12, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v4, v4, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v11, 0xc00

    move-object/from16 v13, p3

    if-nez v5, :cond_b

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v4, v5

    :cond_b
    :goto_7
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_c

    or-int/lit16 v4, v4, 0x6000

    move-object/from16 v14, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v5, v11, 0x6000

    move-object/from16 v14, p4

    if-nez v5, :cond_e

    invoke-interface {v12, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v5, 0x4000

    goto :goto_8

    :cond_d
    const/16 v5, 0x2000

    :goto_8
    or-int/2addr v4, v5

    :cond_e
    :goto_9
    and-int/lit8 v5, p8, 0x20

    const/high16 v6, 0x30000

    if-eqz v5, :cond_f

    or-int/2addr v4, v6

    move-object/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int v5, v11, v6

    move-object/from16 v15, p5

    if-nez v5, :cond_11

    invoke-interface {v12, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v5, 0x10000

    :goto_a
    or-int/2addr v4, v5

    :cond_11
    :goto_b
    const v5, 0x12493

    and-int/2addr v5, v4

    const v6, 0x12492

    if-ne v5, v6, :cond_13

    invoke-interface {v12}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v12}, LT/l;->C()V

    move-object v1, v3

    goto/16 :goto_e

    :cond_13
    :goto_c
    if-eqz v1, :cond_14

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v8, v1

    goto :goto_d

    :cond_14
    move-object v8, v3

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.account.UiAccountStrip (UiAccountStrip.kt:30)"

    invoke-static {v0, v4, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_15
    const/16 v0, 0x48

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v1, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    invoke-static {v8, v1, v0, v7, v3}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const v1, -0x3bced2e6

    invoke-interface {v12, v1}, LT/l;->U(I)V

    const v1, 0xca3d8b5

    invoke-interface {v12, v1}, LT/l;->U(I)V

    invoke-interface {v12}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/d;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v4, v6, :cond_16

    new-instance v4, Lb1/z;

    invoke-direct {v4, v1}, Lb1/z;-><init>(LY0/d;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    check-cast v4, Lb1/z;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_17

    new-instance v1, Lb1/l;

    invoke-direct {v1}, Lb1/l;-><init>()V

    invoke-interface {v12, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    move-object v6, v1

    check-cast v6, Lb1/l;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v1, v7, :cond_18

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v3, v2, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    invoke-interface {v12, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    check-cast v1, LT/q0;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v2, v7, :cond_19

    new-instance v2, Lb1/o;

    invoke-direct {v2, v6}, Lb1/o;-><init>(Lb1/l;)V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v2, Lb1/o;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_1a

    sget-object v3, LYg/J;->a:LYg/J;

    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v7

    invoke-static {v3, v7}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v7

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1a
    move-object v3, v7

    check-cast v3, LT/q0;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    move-object/from16 v22, v8

    const/16 v8, 0x101

    invoke-interface {v12, v8}, LT/l;->i(I)Z

    move-result v16

    or-int v7, v7, v16

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1b

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_1c

    :cond_1b
    new-instance v8, Lq9/t$a;

    move-object/from16 v16, v8

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v2

    const/16 v7, 0x101

    move/from16 v20, v7

    move-object/from16 v21, v1

    invoke-direct/range {v16 .. v21}, Lq9/t$a;-><init>(LT/q0;Lb1/z;Lb1/o;ILT/q0;)V

    invoke-interface {v12, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v16, v8

    check-cast v16, LC0/C;

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_1d

    new-instance v7, Lq9/t$b;

    invoke-direct {v7, v1, v2}, Lq9/t$b;-><init>(LT/q0;Lb1/o;)V

    invoke-interface {v12, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v7, Lmh/a;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1e

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_1f

    :cond_1e
    new-instance v2, Lq9/t$c;

    invoke-direct {v2, v4}, Lq9/t$c;-><init>(Lb1/z;)V

    invoke-interface {v12, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v2, Lmh/l;

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x1

    invoke-static {v0, v4, v2, v8, v1}, LJ0/m;->c(Landroidx/compose/ui/e;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v17

    new-instance v5, Lq9/t$d;

    move-object v0, v5

    move-object v1, v3

    move-object v2, v6

    move-object v3, v7

    move-object/from16 v4, p1

    move-object v7, v5

    move-object/from16 v5, p2

    move-object/from16 v6, p5

    move-object v9, v7

    move-object/from16 v7, p3

    move v10, v8

    move-object/from16 v18, v22

    move-object/from16 v8, p4

    invoke-direct/range {v0 .. v8}, Lq9/t$d;-><init>(LT/q0;Lb1/l;Lmh/a;Ls9/c;Ls9/a$b;Ls9/b;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x36

    const v1, 0x478ef317

    invoke-static {v1, v10, v9, v12, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    const/16 v5, 0x30

    const/4 v6, 0x0

    move-object/from16 v1, v17

    move-object/from16 v3, v16

    move-object v4, v12

    invoke-static/range {v1 .. v6}, LC0/w;->a(Landroidx/compose/ui/e;Lmh/p;LC0/C;LT/l;II)V

    invoke-interface {v12}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LT/o;->P()V

    :cond_20
    move-object/from16 v1, v18

    :goto_e
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v10, Lq9/s;

    move-object v0, v10

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lq9/s;-><init>(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_21
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lq9/t;->b(Landroidx/compose/ui/e;Ls9/c;Ls9/a$b;Ljava/lang/String;Ljava/lang/String;Ls9/b;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
