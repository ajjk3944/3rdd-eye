.class public abstract Lgf/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lgf/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgf/j;->n(Landroidx/compose/ui/e;Lgf/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgf/c;)LYg/J;
    .locals 0

    invoke-static {p0}, Lgf/j;->h(Lgf/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lgf/c;)LYg/J;
    .locals 0

    invoke-static {p0}, Lgf/j;->j(Lgf/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgf/b;)I
    .locals 0

    invoke-static {p0}, Lgf/j;->k(Lgf/b;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lgf/b;LC/C;Lgf/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lgf/j;->l(Lgf/b;LC/C;Lgf/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lgf/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgf/j;->i(Lgf/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lgf/c;LT/l;II)V
    .locals 42

    move/from16 v0, p2

    move/from16 v1, p3

    const v2, 0xdf24980

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v3, v0, 0x6

    const/4 v14, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x1

    if-nez v3, :cond_0

    move-object/from16 v3, p0

    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v3, p0

    :cond_1
    move v4, v14

    :goto_0
    or-int/2addr v4, v0

    move v11, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v11, v0

    :goto_1
    and-int/lit8 v4, v11, 0x3

    if-ne v4, v14, :cond_4

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v15}, LT/l;->C()V

    move-object v14, v3

    move-object v3, v15

    goto/16 :goto_d

    :cond_4
    :goto_2
    invoke-interface {v15}, LT/l;->q()V

    and-int/lit8 v4, v0, 0x1

    const/4 v13, 0x0

    if-eqz v4, :cond_7

    invoke-interface {v15}, LT/l;->H()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v15}, LT/l;->C()V

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    :goto_3
    and-int/lit8 v11, v11, -0xf

    :cond_6
    move-object v4, v3

    move v3, v11

    goto/16 :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_6

    const v3, -0x72e5f4af

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Lc2/a;->a:Lc2/a;

    sget v4, Lc2/a;->c:I

    invoke-virtual {v3, v15, v4}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v3

    invoke-interface {v15, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroidx/lifecycle/P$c;

    const/4 v9, 0x0

    const/16 v10, 0x10

    const-class v3, Lgf/c;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v3 .. v10}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v4

    invoke-interface {v15, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v5

    invoke-interface {v15, v5}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v6

    invoke-interface {v15, v6}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v6

    const v7, 0x318a4a49

    invoke-interface {v15, v7}, LT/l;->U(I)V

    invoke-interface {v15, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v15, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_8

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_9

    :cond_8
    new-instance v8, Lye/i;

    invoke-direct {v8, v3, v4, v5}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {v15, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lmh/l;

    invoke-interface {v15}, LT/l;->J()V

    invoke-static {v6, v8, v15, v13}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {v15}, LT/l;->J()V

    check-cast v3, Lgf/c;

    goto/16 :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_5
    invoke-interface {v15}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_b

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi (A2ASpeedtestPopupUi.kt:52)"

    invoke-static {v2, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_b
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v8, 0x0

    invoke-static {v2, v10, v11, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x3

    invoke-static {v5, v8, v8, v6, v8}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->g()Lz/c$m;

    move-result-object v6

    sget-object v29, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v29 .. v29}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v7

    invoke-static {v6, v7, v15, v13}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v15, v5}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v30, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-interface {v15, v12}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_d
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v12

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->e()Lmh/p;

    move-result-object v13

    invoke-static {v12, v6, v13}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v12, v14, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v12}, LT/l;->o()Z

    move-result v13

    if-nez v13, :cond_e

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v30 .. v30}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v12, v5, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v31, Lz/k;->a:Lz/k;

    invoke-static {v2, v10, v11, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v18

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v20

    const/16 v23, 0xd

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v21

    sget v5, Lm8/c;->W2:I

    const/4 v12, 0x0

    invoke-static {v5, v15, v12}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v17

    const v5, 0x1ac6ae75

    invoke-interface {v15, v5}, LT/l;->U(I)V

    and-int/lit8 v5, v3, 0xe

    const/4 v14, 0x6

    xor-int/lit8 v13, v5, 0x6

    const/4 v5, 0x4

    if-le v13, v5, :cond_10

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    and-int/lit8 v6, v3, 0x6

    if-ne v6, v5, :cond_12

    :cond_11
    move v6, v11

    goto :goto_7

    :cond_12
    move v6, v12

    :goto_7
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_13

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_14

    :cond_13
    new-instance v7, Lgf/d;

    invoke-direct {v7, v4}, Lgf/d;-><init>(Lgf/c;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    move-object v6, v7

    check-cast v6, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    new-instance v7, Lgf/j$a;

    invoke-direct {v7, v4}, Lgf/j$a;-><init>(Lgf/c;)V

    const v5, 0x1de27b66

    const/16 v14, 0x36

    invoke-static {v5, v11, v7, v15, v14}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v19, 0x0

    const/16 v20, 0x7e0

    const/4 v5, 0x0

    const/16 v16, 0x4

    const-wide/16 v22, 0x0

    move-object/from16 v33, v9

    move-wide/from16 v8, v22

    move-wide/from16 v10, v22

    move/from16 v34, v13

    move-wide/from16 v12, v22

    const/16 v16, 0x0

    move/from16 v14, v16

    const/16 v16, 0x0

    move-object/from16 p0, v15

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v18, 0x6186

    move/from16 v35, v3

    move-object/from16 v3, v21

    move-object/from16 p1, v4

    move-object/from16 v4, v17

    move-object/from16 v17, p0

    invoke-static/range {v3 .. v20}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    const/16 v3, 0x10

    int-to-float v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v12, 0x6

    move-object/from16 v14, p0

    invoke-static {v3, v14, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p1 .. p1}, Lgf/c;->n0()LLi/N;

    move-result-object v3

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-static {v3, v10, v14, v13, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Lgf/b;

    const/4 v7, 0x0

    invoke-static {v2, v7, v11, v10}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v8, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v8, v14, v15}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->d()F

    move-result v5

    const/4 v6, 0x2

    invoke-static {v3, v5, v7, v6, v10}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v25

    new-instance v3, Ls9/d$b;

    invoke-virtual {v9}, Lgf/b;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v11, :cond_15

    sget v5, Lm8/c;->V2:I

    goto :goto_8

    :cond_15
    sget v5, Lm8/c;->U2:I

    :goto_8
    invoke-direct {v3, v5}, Ls9/d$b;-><init>(I)V

    invoke-static {v3, v14, v13}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    invoke-virtual {v8, v14, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v16

    move-wide/from16 v5, v16

    sget-object v16, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v16 .. v16}, LW0/j$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, LW0/j;->h(I)LW0/j;

    move-result-object v16

    move/from16 v36, v15

    move-object/from16 v15, v16

    const/16 v27, 0x0

    const v28, 0x3fdf8

    const-wide/16 v16, 0x0

    move-object/from16 v37, v8

    move-wide/from16 v7, v16

    const/16 v16, 0x0

    move-object/from16 v38, v9

    move-object/from16 v9, v16

    move-object/from16 v10, v16

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 p0, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v32, v4

    move-object/from16 v4, v25

    move-object/from16 v25, p0

    invoke-static/range {v3 .. v28}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v2, v15, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static/range {v32 .. v32}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v5, v33

    invoke-virtual {v5, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v29 .. v29}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v5

    const/16 v11, 0x36

    move-object/from16 v12, p0

    invoke-static {v4, v5, v12, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v12, v10}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v12}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v12}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_16

    invoke-static {}, LT/j;->c()V

    :cond_16
    invoke-interface {v12}, LT/l;->u()V

    invoke-interface {v12}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v12, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_9

    :cond_17
    invoke-interface {v12}, LT/l;->I()V

    :goto_9
    invoke-static {v12}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v30 .. v30}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_18

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    :cond_18
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_19
    invoke-virtual/range {v30 .. v30}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    const v3, -0x210d5eed

    invoke-interface {v12, v3}, LT/l;->U(I)V

    move-object/from16 v9, v38

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1a

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_1b

    :cond_1a
    new-instance v4, Lgf/e;

    invoke-direct {v4, v9}, Lgf/e;-><init>(Lgf/b;)V

    invoke-interface {v12, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1b
    move-object v5, v4

    check-cast v5, Lmh/a;

    invoke-interface {v12}, LT/l;->J()V

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v12

    invoke-static/range {v3 .. v8}, LC/D;->k(IFLmh/a;LT/l;II)LC/C;

    move-result-object v8

    move-object v3, v8

    invoke-static {v2, v15, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance v5, Lgf/j$b;

    invoke-direct {v5, v9}, Lgf/j$b;-><init>(Lgf/b;)V

    const v6, -0x675e9e72

    invoke-static {v6, v14, v5, v12, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const/16 v19, 0xc00

    const/16 v20, 0x1ffc

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    move-object/from16 v39, v8

    move/from16 v8, v17

    const/16 v17, 0x0

    move-object/from16 v38, v9

    move-object/from16 v9, v17

    move-object/from16 v10, v17

    const/16 v17, 0x0

    move/from16 v11, v17

    move-object/from16 p0, v12

    move/from16 v12, v17

    const/16 v17, 0x0

    move-object/from16 v13, v17

    move-object/from16 v14, v17

    move-object/from16 v15, v17

    const/16 v18, 0x30

    move-object/from16 v17, p0

    invoke-static/range {v3 .. v20}, LC/m;->a(LC/C;Landroidx/compose/ui/e;Lz/N;LC/g;IFLf0/c$c;Lw/C;ZZLmh/l;Lx0/a;Lx/j;Lmh/r;LT/l;III)V

    invoke-virtual/range {v38 .. v38}, Lgf/b;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v14, 0x1

    if-le v3, v14, :cond_1c

    move v4, v14

    goto :goto_a

    :cond_1c
    const/4 v4, 0x0

    :goto_a
    new-instance v3, Lgf/j$c;

    move-object/from16 v13, v38

    move-object/from16 v15, v39

    invoke-direct {v3, v15, v13}, Lgf/j$c;-><init>(LC/C;Lgf/b;)V

    const v5, -0x412d90bc

    const/16 v6, 0x36

    move-object/from16 v12, p0

    invoke-static {v5, v14, v3, v12, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x180006

    const/16 v16, 0x1e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v3, v31

    move-object v10, v12

    move-object/from16 v40, v12

    move/from16 v12, v16

    invoke-static/range {v3 .. v12}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    move/from16 v7, v36

    move-object/from16 v6, v37

    move-object/from16 v12, v40

    invoke-virtual {v6, v12, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->d()F

    move-result v6

    const/4 v7, 0x2

    invoke-static {v5, v6, v3, v7, v4}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget v4, Lm8/c;->T2:I

    const/4 v11, 0x0

    invoke-static {v4, v12, v11}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v9

    const v4, -0x210cee7f

    invoke-interface {v12, v4}, LT/l;->U(I)V

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v12, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    move/from16 v8, v34

    const/4 v10, 0x4

    move-object/from16 v7, p1

    if-le v8, v10, :cond_1d

    invoke-interface {v12, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1e

    :cond_1d
    and-int/lit8 v5, v35, 0x6

    if-ne v5, v10, :cond_1f

    :cond_1e
    move v5, v14

    goto :goto_b

    :cond_1f
    move v5, v11

    :goto_b
    or-int/2addr v4, v5

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_20

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_21

    :cond_20
    new-instance v5, Lgf/f;

    invoke-direct {v5, v13, v15, v7}, Lgf/f;-><init>(Lgf/b;LC/C;Lgf/c;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    move-object v4, v5

    check-cast v4, Lmh/a;

    invoke-interface {v12}, LT/l;->J()V

    const/4 v13, 0x0

    const/16 v15, 0xbc

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v14, v7

    move-object/from16 v7, v16

    move/from16 v41, v8

    move-object/from16 v8, v17

    move-object/from16 v10, v18

    move-object v11, v12

    move-object/from16 p0, v12

    move v12, v13

    move v13, v15

    invoke-static/range {v3 .. v13}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface/range {p0 .. p0}, LT/l;->R()V

    const/16 v3, 0x2a

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v4, 0x6

    move-object/from16 v3, p0

    invoke-static {v2, v3, v4}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {v3}, LT/l;->R()V

    const v2, -0x70e9847e

    invoke-interface {v3, v2}, LT/l;->U(I)V

    move/from16 v5, v41

    const/4 v2, 0x4

    if-le v5, v2, :cond_22

    invoke-interface {v3, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    :cond_22
    and-int/lit8 v4, v35, 0x6

    if-ne v4, v2, :cond_24

    :cond_23
    const/4 v13, 0x1

    goto :goto_c

    :cond_24
    const/4 v13, 0x0

    :goto_c
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v13, :cond_25

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_26

    :cond_25
    new-instance v2, Lgf/g;

    invoke-direct {v2, v14}, Lgf/g;-><init>(Lgf/c;)V

    invoke-interface {v3, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v2, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v4, v2, v3, v4, v5}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-static {}, LT/o;->P()V

    :cond_27
    :goto_d
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_28

    new-instance v3, Lgf/h;

    invoke-direct {v3, v14, v0, v1}, Lgf/h;-><init>(Lgf/c;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_28
    return-void
.end method

.method private static final h(Lgf/c;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lgf/c;->o0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lgf/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lgf/j;->g(Lgf/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Lgf/c;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lgf/c;->o0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final k(Lgf/b;)I
    .locals 0

    invoke-virtual {p0}, Lgf/b;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final l(Lgf/b;LC/C;Lgf/c;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lgf/b;->a()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, LC/C;->v()I

    move-result p1

    invoke-static {p0, p1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgf/a;

    if-eqz p0, :cond_0

    invoke-virtual {p2, p0}, Lgf/c;->q0(Lgf/a;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/e;Lgf/a;LT/l;II)V
    .locals 40

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const/4 v4, 0x6

    const v5, -0x26596904

    move-object/from16 v6, p2

    invoke-interface {v6, v5}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v6, v2, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v3

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/2addr v3, v2

    const/16 v9, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v9

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v8, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v8, 0x13

    const/16 v10, 0x12

    if-ne v3, v10, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v7

    move-object/from16 v32, v15

    goto/16 :goto_9

    :cond_7
    :goto_4
    if-eqz v6, :cond_8

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v3, v7

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v7, "com.ui.wifiman.ui.speedtest.a2a.DeviceItem (A2ASpeedtestPopupUi.kt:145)"

    invoke-static {v5, v8, v6, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v5, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v5, v15, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->d()F

    move-result v6

    const/16 v7, 0x8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v3, v6, v7}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v17, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v7

    sget-object v11, Lz/c;->a:Lz/c;

    int-to-float v8, v9

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v11, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    const/16 v9, 0x36

    invoke-static {v8, v7, v15, v9}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v10, 0x0

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v10, v7, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_c

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v6, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v6, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, Lgf/a;->b()Ls9/a;

    move-result-object v6

    sget-object v12, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v7, 0x50

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    const/16 v16, 0x30

    const/16 v19, 0x3e

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    move-object v4, v11

    move/from16 v11, v20

    move-object/from16 v34, v12

    move/from16 v33, v13

    move-wide/from16 v12, v21

    move-object v14, v15

    move-object/from16 v35, v15

    move/from16 v15, v16

    move/from16 v16, v19

    invoke-static/range {v6 .. v16}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v4, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    move-object/from16 v15, v35

    const/4 v7, 0x6

    invoke-static {v4, v6, v15, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v14, 0x0

    invoke-static {v15, v14}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_e

    invoke-static {}, LT/j;->c()V

    :cond_e
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_f
    invoke-interface {v15}, LT/l;->I()V

    :goto_7
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_11
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    const/4 v4, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, v34

    const/4 v12, 0x1

    invoke-static {v10, v4, v12, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lgf/a;->d()Ls9/d;

    move-result-object v6

    invoke-static {v6, v15, v14}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v11, v33

    invoke-virtual {v5, v15, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->c()LL0/U;

    move-result-object v27

    invoke-virtual {v5, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->a()J

    move-result-wide v8

    const/16 v30, 0x0

    const v31, 0x1fff8

    const-wide/16 v16, 0x0

    move-object/from16 v37, v10

    move/from16 v36, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-object/from16 v35, v15

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

    const/16 v29, 0x30

    move-object/from16 v28, v35

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    move-object/from16 v14, v37

    const/4 v13, 0x0

    const/4 v15, 0x1

    invoke-static {v14, v4, v15, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lgf/a;->c()Ls9/d;

    move-result-object v6

    move-object/from16 v12, v35

    const/4 v10, 0x0

    invoke-static {v6, v12, v10}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v11, v36

    invoke-virtual {v5, v12, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->f()LL0/U;

    move-result-object v27

    invoke-virtual {v5, v12, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v8

    invoke-virtual {v8}, Lma/a;->f()Lma/a$f;

    move-result-object v8

    invoke-virtual {v8}, Lma/a$f;->c()J

    move-result-wide v8

    const-wide/16 v16, 0x0

    move/from16 v38, v11

    move-wide/from16 v10, v16

    const/16 v16, 0x0

    move-object/from16 v12, v16

    move-object/from16 v13, v16

    move-object/from16 v39, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, Lgf/a;->e()Ls9/d;

    move-result-object v6

    const v7, 0x11ab88c

    move-object/from16 v15, v35

    invoke-interface {v15, v7}, LT/l;->U(I)V

    if-nez v6, :cond_12

    move-object/from16 v32, v15

    goto :goto_8

    :cond_12
    move-object/from16 v8, v39

    const/4 v7, 0x1

    const/4 v9, 0x0

    invoke-static {v8, v4, v7, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v4, 0x0

    invoke-static {v6, v15, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v6

    move/from16 v4, v38

    invoke-virtual {v5, v15, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->f()LL0/U;

    move-result-object v27

    invoke-virtual {v5, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->c()J

    move-result-wide v8

    const/16 v30, 0x0

    const v31, 0x1fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v32, v15

    move-wide v15, v4

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x30

    move-object/from16 v28, v32

    invoke-static/range {v6 .. v31}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_8
    invoke-interface/range {v32 .. v32}, LT/l;->J()V

    invoke-interface/range {v32 .. v32}, LT/l;->R()V

    invoke-interface/range {v32 .. v32}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_9
    invoke-interface/range {v32 .. v32}, LT/l;->z()LT/X0;

    move-result-object v4

    if-eqz v4, :cond_14

    new-instance v5, Lgf/i;

    invoke-direct {v5, v3, v0, v1, v2}, Lgf/i;-><init>(Landroidx/compose/ui/e;Lgf/a;II)V

    invoke-interface {v4, v5}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final n(Landroidx/compose/ui/e;Lgf/a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lgf/j;->m(Landroidx/compose/ui/e;Lgf/a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic o(Landroidx/compose/ui/e;Lgf/a;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgf/j;->m(Landroidx/compose/ui/e;Lgf/a;LT/l;II)V

    return-void
.end method
