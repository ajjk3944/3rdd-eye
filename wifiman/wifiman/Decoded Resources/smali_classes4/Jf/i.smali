.class public abstract LJf/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, LJf/i;->c(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;LT/l;I)V
    .locals 46

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x507e8ac3

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    const/4 v15, 0x6

    and-int/lit8 v7, v6, 0x6

    const/4 v8, 0x2

    if-nez v7, :cond_1

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v9, v6, 0x30

    const/16 v10, 0x10

    move/from16 v13, p1

    if-nez v9, :cond_3

    invoke-interface {v2, v13}, LT/l;->g(F)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    move v9, v10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    invoke-interface {v2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_7

    invoke-interface {v2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_9

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v7, v9

    :cond_9
    move v12, v7

    and-int/lit16 v7, v12, 0x2493

    const/16 v9, 0x2492

    if-ne v7, v9, :cond_b

    invoke-interface {v2}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v2}, LT/l;->C()V

    goto/16 :goto_c

    :cond_b
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v9, "com.ui.wifiman.ui.wmw.common.WmwStatusPopupProgress (WmwStatusPopupProgress.kt:30)"

    invoke-static {v0, v12, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    sget-object v0, Lz/c;->a:Lz/c;

    int-to-float v7, v10

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-virtual {v0, v7}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    sget-object v33, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v33 .. v33}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v9

    invoke-static {v7, v9, v2, v15}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v11, 0x0

    invoke-static {v2, v11}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v2}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v2, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v11

    sget-object v34, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v2}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v2}, LT/l;->u()V

    invoke-interface {v2}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-interface {v2, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_e
    invoke-interface {v2}, LT/l;->I()V

    :goto_7
    invoke-static {v2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v7, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v14, v10, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v14}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_f

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    :cond_f
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v14, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v14, v9, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v34 .. v34}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v14, v11, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v7, Lz/k;->a:Lz/k;

    new-instance v7, Ls9/c$a;

    sget-object v9, Lcom/ubnt/usurvey/product/l;->WM_W_d64:Lcom/ubnt/usurvey/product/l;

    invoke-static {v9}, Lcom/ubnt/usurvey/product/s;->a(Lcom/ubnt/usurvey/product/l;)Lcom/ubnt/usurvey/product/r;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lcom/ubnt/usurvey/product/r;->a()I

    move-result v9

    const/4 v15, 0x0

    invoke-direct {v7, v9, v15, v8, v15}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v11, 0x0

    const/4 v10, 0x1

    invoke-static {v14, v11, v10, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, Lla/a;->a:Lla/a;

    move-object/from16 v18, v14

    sget v14, Lla/a;->b:I

    invoke-virtual {v9, v2, v14}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lra/a;->a()Lra/b;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lra/b;->a()Lra/b$a$a;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lra/b$a$a;->c()F

    move-result v1

    invoke-static {v8, v11, v1, v10, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, LIf/a;->FW_UPDATE_PROGRESS:LIf/a;

    invoke-static {v8}, LIf/L;->b(LIf/a;)F

    move-result v8

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v1, 0x0

    const/16 v19, 0xfe

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v35, v9

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move-object/from16 v11, v22

    move/from16 v36, v12

    move-object/from16 v12, v23

    move-object/from16 v13, v24

    move/from16 v38, v14

    move-object/from16 v37, v18

    move/from16 v14, v25

    move-object/from16 v15, v26

    move-object/from16 v16, v2

    move/from16 v17, v1

    move/from16 v18, v19

    invoke-static/range {v7 .. v18}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    const v1, 0x250055ed

    invoke-interface {v2, v1}, LT/l;->U(I)V

    if-nez v3, :cond_11

    move-object/from16 v40, v35

    move-object/from16 v41, v37

    move/from16 v39, v38

    const/4 v1, 0x0

    goto :goto_8

    :cond_11
    move-object/from16 v15, v37

    const/4 v1, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v15, v14, v13, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v11, 0x6

    shr-int/lit8 v7, v36, 0x6

    and-int/lit8 v7, v7, 0xe

    invoke-static {v3, v2, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v7

    move-object/from16 v12, v35

    move/from16 v9, v38

    invoke-virtual {v12, v2, v9}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v10

    invoke-virtual {v10}, Lpa/c;->a()Lpa/b;

    move-result-object v10

    invoke-virtual {v10}, Lpa/b;->d()LL0/U;

    move-result-object v28

    invoke-virtual {v12, v2, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v10

    invoke-virtual {v10}, Lma/a;->f()Lma/a$f;

    move-result-object v10

    invoke-virtual {v10}, Lma/a$f;->a()J

    move-result-wide v16

    move/from16 v39, v9

    move-wide/from16 v9, v16

    sget-object v16, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v16 .. v16}, LW0/j$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, LW0/j;->h(I)LW0/j;

    move-result-object v19

    const/16 v31, 0x0

    const v32, 0x1fdf8

    const-wide/16 v16, 0x0

    move-object/from16 v40, v12

    move-wide/from16 v11, v16

    const/16 v16, 0x0

    move-object/from16 v13, v16

    move-object/from16 v14, v16

    move-object/from16 v41, v15

    move-object/from16 v15, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x30

    move-object/from16 v29, v2

    invoke-static/range {v7 .. v32}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v7, LYg/J;->a:LYg/J;

    :goto_8
    invoke-interface {v2}, LT/l;->J()V

    const v7, 0x25007f31

    invoke-interface {v2, v7}, LT/l;->U(I)V

    if-nez v4, :cond_12

    move/from16 v43, v39

    move-object/from16 v42, v40

    move-object/from16 v44, v41

    goto :goto_9

    :cond_12
    move-object/from16 v15, v41

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v15, v14, v13, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    shr-int/lit8 v7, v36, 0x9

    and-int/lit8 v7, v7, 0xe

    invoke-static {v4, v2, v7}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v7

    move/from16 v12, v39

    move-object/from16 v11, v40

    invoke-virtual {v11, v2, v12}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->a()LL0/U;

    move-result-object v28

    invoke-virtual {v11, v2, v12}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->f()Lma/a$f;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$f;->b()J

    move-result-wide v9

    sget-object v16, LW0/j;->b:LW0/j$a;

    invoke-virtual/range {v16 .. v16}, LW0/j$a;->a()I

    move-result v16

    invoke-static/range {v16 .. v16}, LW0/j;->h(I)LW0/j;

    move-result-object v19

    const/16 v31, 0x0

    const v32, 0x1fdf8

    const-wide/16 v16, 0x0

    move-object/from16 v42, v11

    move/from16 v43, v12

    move-wide/from16 v11, v16

    const/16 v16, 0x0

    move-object/from16 v13, v16

    move-object/from16 v14, v16

    move-object/from16 v44, v15

    move-object/from16 v15, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x30

    move-object/from16 v29, v2

    invoke-static/range {v7 .. v32}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v7, LYg/J;->a:LYg/J;

    :goto_9
    invoke-interface {v2}, LT/l;->J()V

    move-object/from16 v15, v44

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v15, v14, v13, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v8, 0x4

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v0, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v0

    invoke-virtual/range {v33 .. v33}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v0, v8, v2, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v2, v8}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v2}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v2, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v2}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {v2}, LT/l;->u()V

    invoke-interface {v2}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v2, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_a

    :cond_14
    invoke-interface {v2}, LT/l;->I()V

    :goto_a
    invoke-static {v2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v0, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v11, v10, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v34 .. v34}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v11}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_15

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    :cond_15
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual/range {v34 .. v34}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v11, v7, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {v15, v14, v13, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    and-int/lit8 v0, v36, 0x70

    or-int/2addr v0, v9

    const/16 v16, 0x7c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    move/from16 v8, p1

    move/from16 v13, v17

    move-object v14, v2

    move-object/from16 v45, v15

    move v15, v0

    invoke-static/range {v7 .. v16}, LE9/d;->c(Landroidx/compose/ui/e;FLE9/e;FFIZLT/l;II)V

    const v0, 0x37bbb3ba

    invoke-interface {v2, v0}, LT/l;->U(I)V

    if-nez v5, :cond_17

    goto :goto_b

    :cond_17
    move-object/from16 v0, v45

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v0, v7, v8, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    shr-int/lit8 v0, v36, 0xc

    and-int/lit8 v0, v0, 0xe

    invoke-static {v5, v2, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v7

    move-object/from16 v0, v42

    move/from16 v1, v43

    invoke-virtual {v0, v2, v1}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->f()LL0/U;

    move-result-object v28

    invoke-virtual {v0, v2, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->f()Lma/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$f;->b()J

    move-result-wide v9

    sget-object v0, LW0/j;->b:LW0/j$a;

    invoke-virtual {v0}, LW0/j$a;->f()I

    move-result v0

    invoke-static {v0}, LW0/j;->h(I)LW0/j;

    move-result-object v19

    const/16 v31, 0x0

    const v32, 0x1fdf8

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x30

    move-object/from16 v29, v2

    invoke-static/range {v7 .. v32}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_b
    invoke-interface {v2}, LT/l;->J()V

    invoke-interface {v2}, LT/l;->R()V

    invoke-interface {v2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_c
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v8, LJf/h;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LJf/h;-><init>(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;I)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_19
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, LJf/i;->b(Landroidx/compose/ui/e;FLs9/d;Ls9/d;Ls9/d;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
