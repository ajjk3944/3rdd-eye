.class public abstract LGe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LGe/a;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LGe/c;->c(Landroidx/compose/ui/e;LGe/a;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LGe/a;Lmh/a;LT/l;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move/from16 v11, p4

    const-string v2, "modifier"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "model"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onCloseClicked"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x34afc537    # -1.3646537E7f

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v13

    const/4 v14, 0x6

    and-int/lit8 v3, v11, 0x6

    const/4 v4, 0x2

    const/4 v12, 0x4

    if-nez v3, :cond_1

    invoke-interface {v13, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v12

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_1
    move v3, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    const/16 v6, 0x10

    if-nez v5, :cond_3

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_5

    invoke-interface {v13, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    move v15, v3

    and-int/lit16 v3, v15, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_7

    invoke-interface {v13}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v13}, LT/l;->C()V

    goto/16 :goto_9

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.component.notification.ApRoamingNotificationContent (ApRoamingNotification.kt:45)"

    invoke-static {v2, v15, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const/16 v2, 0x48

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v2, v3, v4, v5}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/16 v5, 0xc

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/4 v9, 0x0

    int-to-float v7, v9

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v2, v5, v4, v7, v3}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v3

    sget-object v8, Lz/c;->a:Lz/c;

    int-to-float v4, v6

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v8, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    const/16 v5, 0x36

    invoke-static {v4, v3, v13, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v13, v9}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v13, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v13, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_a
    invoke-interface {v13}, LT/l;->I()V

    :goto_5
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, v3, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v6, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v6}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v6, v2, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v18, Lz/Z;->a:Lz/Z;

    sget-object v2, LPe/a;->a:LPe/a;

    invoke-virtual {v2}, LPe/a;->r()Ls9/b;

    move-result-object v3

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v7, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v7, v13, v6}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->c()Lma/a$c;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$c;->a()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    const/16 v19, 0x36

    const/16 v20, 0x4

    const/16 v21, 0x0

    move/from16 v38, v6

    move-object/from16 v6, v21

    move-object/from16 v39, v7

    move-object v7, v13

    move-object v14, v8

    move/from16 v8, v19

    move/from16 v9, v20

    invoke-static/range {v3 .. v9}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/high16 v20, 0x3f800000    # 1.0f

    const/16 v21, 0x0

    move-object/from16 v19, v2

    invoke-static/range {v18 .. v23}, Lz/Y;->b(Lz/Y;Landroidx/compose/ui/e;FZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    int-to-float v4, v12

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v14, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v4, v5, v13, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v13, v5}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface {v13}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v13, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v13}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_d

    invoke-static {}, LT/j;->c()V

    :cond_d
    invoke-interface {v13}, LT/l;->u()V

    invoke-interface {v13}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_e

    invoke-interface {v13, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_e
    invoke-interface {v13}, LT/l;->I()V

    :goto_6
    invoke-static {v13}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v9, v4, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_f

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_10
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LGe/a;->c()Ls9/d;

    move-result-object v3

    invoke-static {v3, v13, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v12

    move/from16 v4, v38

    move-object/from16 v3, v39

    invoke-virtual {v3, v13, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v33

    invoke-virtual {v3, v13, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->a()J

    move-result-wide v7

    move v9, v15

    move-wide v14, v7

    const/16 v36, 0x0

    const v37, 0x1fffa

    const/4 v7, 0x0

    move-object v8, v13

    move-object v13, v7

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v8

    invoke-static/range {v12 .. v37}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-virtual/range {p1 .. p1}, LGe/a;->b()Ls9/d;

    move-result-object v7

    const v12, 0x78832f2

    invoke-interface {v8, v12}, LT/l;->U(I)V

    if-nez v7, :cond_11

    goto :goto_7

    :cond_11
    invoke-virtual/range {p1 .. p1}, LGe/a;->b()Ls9/d;

    move-result-object v7

    invoke-static {v7, v8, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v12

    invoke-virtual {v3, v8, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v7

    invoke-virtual {v7}, Lpa/c;->b()Lpa/b;

    move-result-object v7

    invoke-virtual {v7}, Lpa/b;->f()LL0/U;

    move-result-object v33

    invoke-virtual {v3, v8, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->f()Lma/a$f;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$f;->b()J

    move-result-wide v14

    const/16 v36, 0x0

    const v37, 0x1fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v8

    invoke-static/range {v12 .. v37}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v7, LYg/J;->a:LYg/J;

    :goto_7
    invoke-interface {v8}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LGe/a;->a()Ls9/d;

    move-result-object v7

    const v12, 0x7885398

    invoke-interface {v8, v12}, LT/l;->U(I)V

    if-nez v7, :cond_12

    goto :goto_8

    :cond_12
    invoke-virtual/range {p1 .. p1}, LGe/a;->a()Ls9/d;

    move-result-object v7

    invoke-static {v7, v8, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v12

    invoke-virtual {v3, v8, v4}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->b()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->f()LL0/U;

    move-result-object v33

    invoke-virtual {v3, v8, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->c()J

    move-result-wide v14

    const/16 v36, 0x0

    const v37, 0x1fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    move-object/from16 v34, v8

    invoke-static/range {v12 .. v37}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    sget-object v3, LYg/J;->a:LYg/J;

    :goto_8
    invoke-interface {v8}, LT/l;->J()V

    invoke-interface {v8}, LT/l;->R()V

    const/16 v3, 0x14

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v2, LGe/d;->a:LGe/d;

    invoke-virtual {v2}, LGe/d;->a()Lmh/p;

    move-result-object v7

    shr-int/lit8 v2, v9, 0x6

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v9, v2, 0x6030

    const/16 v12, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, p2

    move-object v6, v7

    move-object v7, v8

    move-object v13, v8

    move v8, v9

    move v9, v12

    invoke-static/range {v2 .. v9}, LN/Z;->a(Lmh/a;Landroidx/compose/ui/e;ZLy/m;Lmh/p;LT/l;II)V

    invoke-interface {v13}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_9
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_14

    new-instance v3, LGe/b;

    invoke-direct {v3, v0, v1, v10, v11}, LGe/b;-><init>(Landroidx/compose/ui/e;LGe/a;Lmh/a;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LGe/a;Lmh/a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, LGe/c;->b(Landroidx/compose/ui/e;LGe/a;Lmh/a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
