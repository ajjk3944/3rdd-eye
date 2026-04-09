.class public abstract LIf/T;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LIf/Q;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/T;->c(Landroidx/compose/ui/e;LIf/Q;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LIf/Q;LT/l;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x20f8608f

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x10

    const/16 v14, 0x20

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v14

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    move v13, v4

    and-int/lit8 v4, v13, 0x13

    const/16 v6, 0x12

    if-ne v4, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v0, v15

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.wmw.WmwStatusPopupUnavailable (WmwStatusPopupUnavailable.kt:50)"

    invoke-static {v3, v13, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lla/a;->a:Lla/a;

    sget v12, Lla/a;->b:I

    invoke-virtual {v3, v15, v12}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v6, Lz/c;->a:Lz/c;

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v6, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v7

    const/16 v8, 0x36

    invoke-static {v6, v7, v15, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v6

    const/4 v11, 0x0

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_8

    invoke-interface {v15, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v6, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v10, v8, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_9

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v10, v4, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    new-instance v4, Ls9/c$a;

    sget-object v6, Lcom/ubnt/usurvey/product/l;->WM_W_d64:Lcom/ubnt/usurvey/product/l;

    invoke-static {v6}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/ubnt/usurvey/product/r;->a()I

    move-result v6

    const/4 v11, 0x0

    invoke-direct {v4, v6, v11, v5, v11}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v10, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v9, 0x0

    const/4 v8, 0x1

    invoke-static {v10, v9, v8, v11}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v3, v15, v12}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v6

    invoke-virtual {v6}, Lra/a;->a()Lra/b;

    move-result-object v6

    invoke-virtual {v6}, Lra/b;->a()Lra/b$a$a;

    move-result-object v6

    invoke-virtual {v6}, Lra/b$a$a;->c()F

    move-result v6

    invoke-static {v5, v9, v6, v8, v11}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v6, LIf/a;->REQUIREMENTS_NOT_MET:LIf/a;

    invoke-static {v6}, LIf/L;->b(LIf/a;)F

    move-result v6

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/16 v16, 0x0

    const/16 v17, 0xfe

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v8, v18

    move-object/from16 v9, v19

    move-object/from16 v30, v10

    move-object/from16 v10, v20

    move/from16 v11, v21

    move/from16 v31, v12

    move-object/from16 v12, v22

    move/from16 v32, v13

    move-object v13, v15

    move/from16 v14, v16

    move-object v0, v15

    move/from16 v15, v17

    invoke-static/range {v4 .. v15}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LIf/Q;->getTitle()LLi/N;

    move-result-object v4

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v4, v13, v0, v15, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls9/d;

    const v5, -0x6a43ab11

    invoke-interface {v0, v5}, LT/l;->U(I)V

    if-nez v4, :cond_b

    move-object/from16 v34, v30

    move/from16 v33, v31

    goto :goto_5

    :cond_b
    move-object/from16 v12, v30

    const/4 v11, 0x0

    invoke-static {v12, v11, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v4, v0, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v10, v31

    invoke-virtual {v3, v0, v10}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->a()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->c()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v0, v10}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v6

    sget-object v8, LW0/j;->b:LW0/j$a;

    invoke-virtual {v8}, LW0/j$a;->a()I

    move-result v8

    invoke-static {v8}, LW0/j;->h(I)LW0/j;

    move-result-object v16

    const/16 v28, 0x0

    const v29, 0x1fdf8

    const-wide/16 v8, 0x0

    const/16 v17, 0x0

    move/from16 v33, v10

    move-object/from16 v10, v17

    move-object/from16 v11, v17

    move-object/from16 v34, v12

    move-object/from16 v12, v17

    const-wide/16 v17, 0x0

    move-wide/from16 v13, v17

    const/16 v17, 0x0

    move-object/from16 v15, v17

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, v0

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_5
    invoke-interface {v0}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LIf/Q;->o0()LLi/N;

    move-result-object v4

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v4, v13, v0, v15, v14}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls9/d;

    const v5, -0x6a43800a

    invoke-interface {v0, v5}, LT/l;->U(I)V

    if-nez v4, :cond_c

    move-object v3, v13

    move-object/from16 v35, v34

    goto :goto_6

    :cond_c
    move-object/from16 v12, v34

    const/4 v11, 0x0

    invoke-static {v12, v11, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v4, v0, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    move/from16 v6, v33

    invoke-virtual {v3, v0, v6}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v3, v0, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->b()J

    move-result-wide v6

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->a()I

    move-result v3

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v16

    const/16 v28, 0x0

    const v29, 0x1fdf8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v3, 0x0

    move-object v11, v3

    move-object/from16 v35, v12

    move-object v12, v3

    const-wide/16 v17, 0x0

    move-object v3, v13

    move-wide/from16 v13, v17

    const/16 v17, 0x0

    move-object/from16 v15, v17

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, v0

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_6
    invoke-interface {v0}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LIf/Q;->n0()LLi/N;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {v4, v3, v0, v5, v6}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls9/d;

    const v7, -0x6a4353be

    invoke-interface {v0, v7}, LT/l;->U(I)V

    if-nez v4, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v7, v35

    const/4 v8, 0x0

    invoke-static {v7, v8, v6, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v4, v0, v5}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v10

    const v4, -0x5b73a8c2

    invoke-interface {v0, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v32, 0x70

    const/16 v7, 0x20

    if-ne v4, v7, :cond_e

    move v11, v6

    goto :goto_7

    :cond_e
    move v11, v5

    :goto_7
    invoke-interface {v0}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v11, :cond_f

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_10

    :cond_f
    new-instance v4, LIf/T$a;

    invoke-direct {v4, v1}, LIf/T$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lth/g;

    invoke-interface {v0}, LT/l;->J()V

    move-object v5, v4

    check-cast v5, Lmh/a;

    const/4 v13, 0x6

    const/16 v14, 0xbc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v4, v3

    move-object v12, v0

    invoke-static/range {v4 .. v14}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    :goto_8
    invoke-interface {v0}, LT/l;->J()V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_9
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v3, LIf/S;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v2}, LIf/S;-><init>(Landroidx/compose/ui/e;LIf/Q;I)V

    invoke-interface {v0, v3}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LIf/Q;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LIf/T;->b(Landroidx/compose/ui/e;LIf/Q;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
