.class public abstract LF9/F;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lmh/l;LF9/C;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LF9/F;->d(Lmh/l;LF9/C;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LCi/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LF9/F;->e(Landroidx/compose/ui/e;LCi/c;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V
    .locals 25

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const/4 v0, 0x2

    const/4 v1, 0x4

    const-string/jumbo v5, "items"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v5, "onItemSelected"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x23e4cd14

    move-object/from16 v6, p3

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v6, p5, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v4, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v4, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v1

    goto :goto_0

    :cond_1
    move v8, v0

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v0, v4, 0x30

    if-nez v0, :cond_6

    and-int/lit8 v0, v4, 0x40

    if-nez v0, :cond_4

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_4
    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_5

    const/16 v0, 0x20

    goto :goto_3

    :cond_5
    const/16 v0, 0x10

    :goto_3
    or-int/2addr v8, v0

    :cond_6
    :goto_4
    and-int/lit8 v0, p5, 0x4

    const/16 v1, 0x100

    if-eqz v0, :cond_8

    or-int/lit16 v8, v8, 0x180

    :cond_7
    :goto_5
    move v0, v8

    goto :goto_7

    :cond_8
    and-int/lit16 v0, v4, 0x180

    if-nez v0, :cond_7

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v1

    goto :goto_6

    :cond_9
    const/16 v0, 0x80

    :goto_6
    or-int/2addr v8, v0

    goto :goto_5

    :goto_7
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_b

    invoke-interface {v15}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_8

    :cond_a
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v7

    move-object/from16 v24, v15

    goto/16 :goto_d

    :cond_b
    :goto_8
    if-eqz v6, :cond_c

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v6

    goto :goto_9

    :cond_c
    move-object v13, v7

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_d

    const/4 v6, -0x1

    const-string/jumbo v7, "com.ui.core.ui.component.settings.UiSettingsCheckList (UiSettingsCheckList.kt:33)"

    invoke-static {v5, v0, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_d
    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    const/4 v12, 0x0

    invoke-static {v5, v6, v15, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v13}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_f
    invoke-interface {v15}, LT/l;->I()V

    :goto_a
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v7, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v5, Lz/k;->a:Lz/k;

    const v5, -0x74b67296    # -3.881758E-32f

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v12

    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v19, v6, 0x1

    if-gez v6, :cond_12

    invoke-static {}, LZg/v;->v()V

    :cond_12
    check-cast v7, LF9/C;

    const v8, -0x74b6702d

    invoke-interface {v15, v8}, LT/l;->U(I)V

    if-eqz v6, :cond_13

    invoke-static {v15, v12}, LF9/x;->e(LT/l;I)V

    :cond_13
    invoke-interface {v15}, LT/l;->J()V

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v6, v8, v14, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-interface {v7}, LF9/C;->a()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_14

    invoke-interface {v7}, LF9/C;->c()Z

    move-result v9

    invoke-static {v6, v8, v9}, LM9/i;->h(Landroidx/compose/ui/e;Ljava/lang/String;Z)Landroidx/compose/ui/e;

    move-result-object v6

    :cond_14
    invoke-interface {v7}, LF9/C;->getTitle()Ls9/d;

    move-result-object v8

    invoke-static {v8, v15, v12}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7}, LF9/C;->getIcon()Ls9/a;

    move-result-object v10

    invoke-interface {v7}, LF9/C;->c()Z

    move-result v9

    invoke-interface {v7}, LF9/C;->b()Lmh/a;

    move-result-object v16

    invoke-interface {v7}, LF9/C;->d()Z

    move-result v17

    const v11, -0x6260653d

    invoke-interface {v15, v11}, LT/l;->U(I)V

    and-int/lit16 v11, v0, 0x380

    if-ne v11, v1, :cond_15

    move v11, v14

    goto :goto_c

    :cond_15
    move v11, v12

    :goto_c
    invoke-interface {v15, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v18

    or-int v11, v11, v18

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v11, :cond_16

    sget-object v11, LT/l;->a:LT/l$a;

    invoke-virtual {v11}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v1, v11, :cond_17

    :cond_16
    new-instance v1, LF9/D;

    invoke-direct {v1, v3, v7}, LF9/D;-><init>(Lmh/l;LF9/C;)V

    invoke-interface {v15, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v1, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v18, 0x0

    const/16 v20, 0x224

    const/4 v11, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v7, v8

    move-object v8, v11

    move/from16 v11, v21

    move/from16 v21, v12

    move-object v12, v1

    move-object v1, v13

    move-object/from16 v13, v16

    move/from16 v23, v14

    move/from16 v14, v17

    move-object/from16 v24, v15

    move-object/from16 v15, v22

    move-object/from16 v16, v24

    move/from16 v17, v18

    move/from16 v18, v20

    invoke-static/range {v6 .. v18}, LF9/B;->d(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;LT/l;II)V

    move-object v13, v1

    move/from16 v6, v19

    move/from16 v12, v21

    move/from16 v14, v23

    move-object/from16 v15, v24

    const/16 v1, 0x100

    goto/16 :goto_b

    :cond_18
    move-object v1, v13

    move-object/from16 v24, v15

    invoke-interface/range {v24 .. v24}, LT/l;->J()V

    invoke-interface/range {v24 .. v24}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LT/o;->P()V

    :cond_19
    :goto_d
    invoke-interface/range {v24 .. v24}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v7, LF9/E;

    move-object v0, v7

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LF9/E;-><init>(Landroidx/compose/ui/e;LCi/c;Lmh/l;II)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_1a
    return-void
.end method

.method private static final d(Lmh/l;LF9/C;Z)LYg/J;
    .locals 0

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;LCi/c;Lmh/l;IILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p5

    move v5, p4

    invoke-static/range {v0 .. v5}, LF9/F;->c(Landroidx/compose/ui/e;LCi/c;Lmh/l;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
