.class public abstract LFe/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LFe/j;->d()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, LFe/j;->e(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V
    .locals 28

    move-object/from16 v0, p2

    move/from16 v8, p8

    const v1, -0x75fb9610

    move-object/from16 v2, p7

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v8

    :goto_1
    and-int/lit8 v6, p9, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v8, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :goto_3
    and-int/lit8 v9, p9, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_9

    and-int/lit16 v10, v8, 0x200

    if-nez v10, :cond_7

    invoke-interface {v2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_4

    :cond_7
    invoke-interface {v2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    :goto_4
    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v5, v10

    :cond_9
    :goto_6
    and-int/lit8 v10, p9, 0x8

    if-eqz v10, :cond_b

    or-int/lit16 v5, v5, 0xc00

    :cond_a
    move-object/from16 v11, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_a

    move-object/from16 v11, p3

    invoke-interface {v2, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x800

    goto :goto_7

    :cond_c
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v5, v12

    :goto_8
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_e

    or-int/lit16 v5, v5, 0x6000

    :cond_d
    move-object/from16 v13, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_d

    move-object/from16 v13, p4

    invoke-interface {v2, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/16 v14, 0x4000

    goto :goto_9

    :cond_f
    const/16 v14, 0x2000

    :goto_9
    or-int/2addr v5, v14

    :goto_a
    and-int/lit8 v14, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_10

    or-int/2addr v5, v15

    move-wide/from16 v7, p5

    goto :goto_c

    :cond_10
    and-int/2addr v15, v8

    move-wide/from16 v7, p5

    if-nez v15, :cond_12

    invoke-interface {v2, v7, v8}, LT/l;->j(J)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v15, 0x10000

    :goto_b
    or-int/2addr v5, v15

    :cond_12
    :goto_c
    const v15, 0x12493

    and-int/2addr v15, v5

    const v1, 0x12492

    if-ne v15, v1, :cond_14

    invoke-interface {v2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_d

    :cond_13
    invoke-interface {v2}, LT/l;->C()V

    move-object v3, v0

    move-object v1, v4

    move-object v6, v11

    move-object v5, v13

    move-object/from16 v4, p1

    goto/16 :goto_14

    :cond_14
    :goto_d
    if-eqz v3, :cond_15

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_e

    :cond_15
    move-object v1, v4

    :goto_e
    const/4 v3, 0x0

    if-eqz v6, :cond_16

    move-object v4, v3

    goto :goto_f

    :cond_16
    move-object/from16 v4, p1

    :goto_f
    if-eqz v9, :cond_17

    move-object v0, v3

    :cond_17
    if-eqz v10, :cond_19

    const v6, -0x1e085bda

    invoke-interface {v2, v6}, LT/l;->U(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v6, v9, :cond_18

    new-instance v6, LFe/h;

    invoke-direct {v6}, LFe/h;-><init>()V

    invoke-interface {v2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_18
    check-cast v6, Lmh/a;

    invoke-interface {v2}, LT/l;->J()V

    goto :goto_10

    :cond_19
    move-object v6, v11

    :goto_10
    if-eqz v12, :cond_1a

    sget-object v9, LFe/c;->a:LFe/c;

    invoke-virtual {v9}, LFe/c;->a()Lmh/q;

    move-result-object v9

    move-object/from16 v27, v9

    goto :goto_11

    :cond_1a
    move-object/from16 v27, v13

    :goto_11
    if-eqz v14, :cond_1b

    sget-object v7, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v7}, Lm0/v0$a;->d()J

    move-result-wide v7

    :cond_1b
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1c

    const/4 v9, -0x1

    const-string v10, "com.ui.wifiman.ui.component.modal.ModalToolbar (ModalToolbar.kt:32)"

    const v11, -0x75fb9610

    invoke-static {v11, v5, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1c
    const v9, -0x1e081b0f

    invoke-interface {v2, v9}, LT/l;->U(I)V

    if-nez v4, :cond_1d

    :goto_12
    move-object v10, v3

    goto :goto_13

    :cond_1d
    shr-int/lit8 v3, v5, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v4, v2, v3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_12

    :goto_13
    invoke-interface {v2}, LT/l;->J()V

    sget-object v3, LL9/w;->a:LL9/w;

    invoke-virtual {v3}, LL9/w;->c()F

    move-result v20

    and-int/lit8 v3, v5, 0xe

    sget v9, LL9/d;->a:I

    shl-int/lit8 v9, v9, 0x6

    or-int/2addr v3, v9

    and-int/lit16 v9, v5, 0x380

    or-int/2addr v3, v9

    and-int/lit16 v9, v5, 0x1c00

    or-int/2addr v3, v9

    const v9, 0xe000

    and-int/2addr v9, v5

    or-int/2addr v3, v9

    const/high16 v9, 0x1c00000

    shl-int/lit8 v5, v5, 0x6

    and-int/2addr v5, v9

    or-int v24, v3, v5

    const/16 v25, 0x0

    const/16 v26, 0x660

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v9, v1

    move-object v11, v0

    move-object v12, v6

    move-object/from16 v13, v27

    move-wide/from16 v18, v7

    move-object/from16 v23, v2

    invoke-static/range {v9 .. v26}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v3, v0

    move-object/from16 v5, v27

    :goto_14
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v11, LFe/i;

    move-object v0, v11

    move-object v2, v4

    move-object v4, v6

    move-wide v6, v7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LFe/i;-><init>(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JII)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final d()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JIILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, LFe/j;->c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
