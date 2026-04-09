.class public abstract LFe/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, LFe/g;->c(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V
    .locals 21

    move-object/from16 v7, p6

    move/from16 v8, p8

    const-string v0, "content"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6ea43eb0

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

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
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, p9, 0x2

    move-wide/from16 v9, p1

    if-nez v6, :cond_3

    invoke-interface {v1, v9, v10}, LT/l;->j(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    goto :goto_3

    :cond_4
    move-wide/from16 v9, p1

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-object/from16 v11, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v8, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit8 v12, p9, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v5, v5, 0xc00

    :cond_8
    move/from16 v13, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v8, 0xc00

    if-nez v13, :cond_8

    move/from16 v13, p4

    invoke-interface {v1, v13}, LT/l;->c(Z)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v5, v14

    :goto_7
    and-int/lit8 v14, p9, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v5, v5, 0x6000

    :cond_b
    move/from16 v15, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v8, 0x6000

    if-nez v15, :cond_b

    move/from16 v15, p5

    invoke-interface {v1, v15}, LT/l;->g(F)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v5, v5, v16

    :goto_9
    and-int/lit8 v16, p9, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_e

    or-int v5, v5, v17

    goto :goto_b

    :cond_e
    and-int v16, v8, v17

    if-nez v16, :cond_10

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v16, 0x10000

    :goto_a
    or-int v5, v5, v16

    :cond_10
    :goto_b
    const v16, 0x12493

    and-int v3, v5, v16

    const v0, 0x12492

    if-ne v3, v0, :cond_12

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_c

    :cond_11
    invoke-interface {v1}, LT/l;->C()V

    move-wide v2, v9

    move v5, v13

    move v6, v15

    goto/16 :goto_11

    :cond_12
    :goto_c
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v0, v8, 0x1

    if-eqz v0, :cond_16

    invoke-interface {v1}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_14

    and-int/lit8 v5, v5, -0x71

    :cond_14
    move-object v0, v4

    :cond_15
    move-wide v2, v9

    move-object v4, v11

    move v6, v15

    :goto_d
    move v9, v5

    move v5, v13

    goto :goto_10

    :cond_16
    :goto_e
    if-eqz v2, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_f

    :cond_17
    move-object v0, v4

    :goto_f
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_18

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v1, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->b()J

    move-result-wide v2

    and-int/lit8 v5, v5, -0x71

    move-wide v9, v2

    :cond_18
    if-eqz v6, :cond_19

    sget-object v2, LFe/a;->a:LFe/a;

    invoke-virtual {v2}, LFe/a;->a()Lmh/q;

    move-result-object v2

    move-object v11, v2

    :cond_19
    if-eqz v12, :cond_1a

    const/4 v2, 0x0

    move v13, v2

    :cond_1a
    if-eqz v14, :cond_15

    const/16 v2, 0xa0

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    move v6, v2

    move-wide v2, v9

    move-object v4, v11

    goto :goto_d

    :goto_10
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_1b

    const/4 v10, -0x1

    const-string v11, "com.ui.wifiman.ui.component.modal.ModalScaffold (ModalScaffold.kt:31)"

    const v12, 0x6ea43eb0

    invoke-static {v12, v9, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v0, v10, v11, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v13

    const/4 v14, 0x2

    invoke-static {v13, v6, v10, v14, v12}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    new-instance v12, LFe/g$a;

    invoke-direct {v12, v5, v4, v7}, LFe/g$a;-><init>(ZLmh/q;Lmh/q;)V

    const/16 v13, 0x36

    const v14, -0x589a670c

    invoke-static {v14, v11, v12, v1, v13}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    shl-int/lit8 v9, v9, 0x3

    and-int/lit16 v9, v9, 0x380

    const/high16 v11, 0x180000

    or-int v19, v9, v11

    const/16 v20, 0x3a

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v9, v10

    move-object v10, v11

    move-wide v11, v2

    move-object/from16 v18, v1

    invoke-static/range {v9 .. v20}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-static {}, LT/o;->P()V

    :cond_1c
    move-object v11, v4

    move-object v4, v0

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_1d

    new-instance v12, LFe/f;

    move-object v0, v12

    move-object v1, v4

    move-object v4, v11

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LFe/f;-><init>(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;II)V

    invoke-interface {v10, v12}, LT/X0;->a(Lmh/p;)V

    :cond_1d
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;IILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, LFe/g;->b(Landroidx/compose/ui/e;JLmh/q;ZFLmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
