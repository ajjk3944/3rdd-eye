.class public abstract Ly9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, Ly9/s;->d(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V
    .locals 19

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p7

    const-string/jumbo v0, "onDismissRequest"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3642cce5

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v9

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v9, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p8, 0x2

    if-nez v4, :cond_3

    move-wide/from16 v4, p1

    invoke-interface {v9, v4, v5}, LT/l;->j(J)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v4, p1

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    goto :goto_3

    :cond_5
    move-wide/from16 v4, p1

    :goto_3
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_8

    and-int/lit8 v10, p8, 0x4

    if-nez v10, :cond_6

    move-object/from16 v10, p3

    invoke-interface {v9, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v10, p3

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    goto :goto_5

    :cond_8
    move-object/from16 v10, p3

    :goto_5
    and-int/lit8 v11, p8, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_b

    invoke-interface {v9, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :cond_b
    :goto_7
    and-int/lit8 v11, p8, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_e

    invoke-interface {v9, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/16 v11, 0x4000

    goto :goto_8

    :cond_d
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v3, v11

    :cond_e
    :goto_9
    and-int/lit16 v11, v3, 0x2493

    const/16 v12, 0x2492

    if-ne v11, v12, :cond_10

    invoke-interface {v9}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v9}, LT/l;->C()V

    move-object v1, v2

    move-wide v2, v4

    move-object v4, v10

    goto/16 :goto_f

    :cond_10
    :goto_a
    invoke-interface {v9}, LT/l;->q()V

    and-int/lit8 v11, v8, 0x1

    const/4 v12, 0x1

    if-eqz v11, :cond_14

    invoke-interface {v9}, LT/l;->H()Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_b

    :cond_11
    invoke-interface {v9}, LT/l;->C()V

    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_12

    and-int/lit8 v3, v3, -0x71

    :cond_12
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_13

    and-int/lit16 v3, v3, -0x381

    :cond_13
    move v15, v3

    move-wide v13, v4

    move-object v11, v10

    move-object v10, v2

    goto :goto_e

    :cond_14
    :goto_b
    if-eqz v1, :cond_15

    sget-object v1, Ly9/f;->DEFAULT:Ly9/f;

    goto :goto_c

    :cond_15
    move-object v1, v2

    :goto_c
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_16

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v9, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v4

    and-int/lit8 v3, v3, -0x71

    :cond_16
    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_18

    new-instance v2, Landroidx/compose/ui/window/i;

    invoke-static {}, Lla/g;->o()LT/H0;

    move-result-object v10

    invoke-interface {v9, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lra/a;

    invoke-virtual {v10}, Lra/a;->b()Lra/d;

    move-result-object v10

    sget-object v11, Lra/d;->COMPACT:Lra/d;

    if-eq v10, v11, :cond_17

    move/from16 v16, v12

    goto :goto_d

    :cond_17
    const/4 v10, 0x0

    move/from16 v16, v10

    :goto_d
    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Landroidx/compose/ui/window/i;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v3, v3, -0x381

    move-object v10, v1

    move-object v11, v2

    move v15, v3

    move-wide v13, v4

    goto :goto_e

    :cond_18
    move v15, v3

    move-wide v13, v4

    move-object v11, v10

    move-object v10, v1

    :goto_e
    invoke-interface {v9}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_19

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.dialog.UiDialog (UiDialog.kt:51)"

    invoke-static {v0, v15, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    new-instance v5, Ly9/s$a;

    move-object v0, v5

    move-object v1, v10

    move-object/from16 v2, p4

    move-wide v3, v13

    move-object v6, v5

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Ly9/s$a;-><init>(Ly9/f;Lmh/a;JLmh/p;)V

    const/16 v0, 0x36

    const v1, 0x10641aee

    invoke-static {v1, v12, v6, v9, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    shr-int/lit8 v0, v15, 0x9

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0x180

    shr-int/lit8 v1, v15, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v4, v0, v1

    const/4 v5, 0x0

    move-object/from16 v0, p4

    move-object v1, v11

    move-object v3, v9

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/window/a;->a(Lmh/a;Landroidx/compose/ui/window/i;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move-object v1, v10

    move-object v4, v11

    move-wide v2, v13

    :goto_f
    invoke-interface {v9}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v10, Ly9/r;

    move-object v0, v10

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Ly9/r;-><init>(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;II)V

    invoke-interface {v9, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method

.method public static final c(LLi/g;Ljava/lang/Object;Lmh/r;LT/l;I)V
    .locals 11

    const-string/jumbo v0, "eventFlow"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dialogBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5686ae3c

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.dialog.UiDialogEventHelper (UiDialog.kt:141)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x515f0159

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v0, v2, :cond_1

    invoke-static {v4, v4, v3, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v7, v0

    check-cast v7, LT/q0;

    invoke-interface {p3}, LT/l;->J()V

    const v0, 0x515f0a2b

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_2

    invoke-static {v4, v4, v3, v4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v8, v0

    check-cast v8, LT/q0;

    invoke-interface {p3}, LT/l;->J()V

    const v0, 0x515f127b

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {v7}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-interface {v8}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/p;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, p3, v3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    invoke-interface {p3}, LT/l;->J()V

    const v0, 0x515f2231

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit16 v3, p4, 0x380

    xor-int/lit16 v3, v3, 0x180

    const/16 v4, 0x100

    if-le v3, v4, :cond_5

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    and-int/lit16 v3, p4, 0x180

    if-ne v3, v4, :cond_7

    :cond_6
    const/4 v2, 0x1

    :cond_7
    or-int/2addr v0, v2

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_8

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_9

    :cond_8
    new-instance v2, Ly9/s$b;

    const/4 v10, 0x0

    move-object v5, v2

    move-object v6, p0

    move-object v9, p2

    invoke-direct/range {v5 .. v10}, Ly9/s$b;-><init>(LLi/g;LT/q0;LT/q0;Lmh/r;Ldh/e;)V

    invoke-interface {p3, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    shr-int/lit8 p0, p4, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {p1, v2, p3, p0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    invoke-interface {p3}, LT/l;->J()V

    return-void
.end method

.method private static final d(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, Ly9/s;->b(Ly9/f;JLandroidx/compose/ui/window/i;Lmh/a;Lmh/p;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
