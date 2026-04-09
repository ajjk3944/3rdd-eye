.class public abstract Lfa/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lfa/f;Lfa/j;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lfa/i;->d(Lfa/f;Lfa/j;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfa/j;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfa/i;->e(Lfa/j;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfa/j;LT/l;I)V
    .locals 41

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string/jumbo v2, "vm"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x5b39b98a

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x6

    and-int/lit8 v3, v1, 0x6

    const/4 v12, 0x2

    const/4 v13, 0x4

    if-nez v3, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v13

    goto :goto_0

    :cond_0
    move v3, v12

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v3, 0x3

    if-ne v4, v12, :cond_3

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LT/l;->C()V

    move-object v1, v15

    goto/16 :goto_a

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.sso.trusted.UiTrustedDeviceLayout (UiTrustedDeviceLayout.kt:48)"

    invoke-static {v2, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const v2, 0x2a0c29e8

    invoke-interface {v15, v2}, LT/l;->U(I)V

    and-int/lit8 v2, v3, 0xe

    const/4 v11, 0x1

    const/4 v10, 0x0

    if-ne v2, v13, :cond_5

    move v3, v11

    goto :goto_3

    :cond_5
    move v3, v10

    :goto_3
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_7

    :cond_6
    new-instance v4, Lfa/i$a;

    invoke-direct {v4, v0}, Lfa/i$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    check-cast v4, Lmh/a;

    invoke-static {v10, v4, v15, v10, v11}, Ld/a;->a(ZLmh/a;LT/l;II)V

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v15, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->a()J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v5, v11, v6}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3}, Lz/j0;->d(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v16

    const/16 v3, 0x24

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v18

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v20

    const/16 v21, 0x5

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->e()Lz/c$f;

    move-result-object v12

    sget-object v28, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v13

    invoke-static {v12, v13, v15, v14}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v12

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v14

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v29, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v15, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_9
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v12, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v6

    invoke-static {v5, v14, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v6

    invoke-interface {v5}, LT/l;->o()Z

    move-result v12

    if-nez v12, :cond_a

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12, v6}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v6

    invoke-static {v5, v3, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p0 .. p0}, Lfa/j;->g0()LLi/N;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v5, v15, v10, v11}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lfa/f;

    const/4 v6, 0x0

    invoke-static {v9, v6, v11, v5}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v4}, Lz/c;->g()Lz/c$m;

    move-result-object v12

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v13

    invoke-static {v12, v13, v15, v10}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v12

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v13

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_c

    invoke-static {}, LT/j;->c()V

    :cond_c
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_d

    invoke-interface {v15, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_d
    invoke-interface {v15}, LT/l;->I()V

    :goto_5
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v6, v12, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v11

    invoke-static {v6, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v6}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_e

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_f

    :cond_e
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v11, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_f
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v6, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget v3, LP9/b;->X0:I

    invoke-static {v3, v15, v10}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v15, v8}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v5

    invoke-virtual {v5}, Lpa/c;->a()Lpa/b;

    move-result-object v5

    invoke-virtual {v5}, Lpa/b;->e()LL0/U;

    move-result-object v23

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v17

    invoke-virtual {v7, v15, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v19

    const/16 v5, 0x10

    int-to-float v12, v5

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v18

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    move-object v13, v4

    move-object v4, v5

    invoke-virtual {v7, v15, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->a()J

    move-result-wide v5

    const/4 v11, 0x0

    const/16 v26, 0x0

    const v27, 0xfff8

    const-wide/16 v16, 0x0

    move-object/from16 v31, v7

    move/from16 v32, v8

    move-wide/from16 v7, v16

    const/16 v16, 0x0

    move-object/from16 v33, v9

    move-object/from16 v9, v16

    move-object/from16 v10, v16

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move/from16 v30, v12

    move-object/from16 v34, v13

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 p1, v14

    move-object/from16 v14, v16

    move-object/from16 v35, v15

    move-object/from16 v15, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v35

    invoke-static/range {v3 .. v27}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    sget v3, LP9/b;->W0:I

    move-object/from16 v15, v35

    const/4 v14, 0x0

    invoke-static {v3, v15, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v12, v31

    move/from16 v13, v32

    invoke-virtual {v12, v15, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->b()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->a()LL0/U;

    move-result-object v23

    invoke-virtual {v12, v15, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    invoke-virtual {v12, v15, v13}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v5

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v6

    const/4 v11, 0x4

    int-to-float v7, v11

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    move-object/from16 v10, v33

    invoke-static {v10, v4, v7, v5, v6}, Landroidx/compose/foundation/layout/o;->l(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual {v12, v15, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v5

    invoke-virtual {v5}, Lma/a;->f()Lma/a$f;

    move-result-object v5

    invoke-virtual {v5}, Lma/a$f;->c()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v36, v10

    move-object/from16 v10, v16

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-object/from16 v37, v12

    move/from16 v38, v13

    move-wide/from16 v12, v16

    const/16 v16, 0x0

    move-object/from16 v14, v16

    move-object/from16 v15, v16

    const-wide/16 v16, 0x0

    invoke-static/range {v3 .. v27}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    move-object/from16 v15, v36

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static {v15, v13, v14, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v4, 0x7c

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v11, 0x2

    invoke-static {v3, v4, v13, v11, v12}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v10, v35

    move-object/from16 v9, v37

    move/from16 v8, v38

    invoke-virtual {v9, v10, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    invoke-static/range {v30 .. v30}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual {v9, v10, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->e()Lma/a$e;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$e;->b()J

    move-result-wide v4

    const/16 v6, 0xc

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v7}, LE/h;->d(F)LE/g;

    move-result-object v7

    invoke-static {v3, v4, v5, v7}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v13, v4, v14, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->o()Lf0/c;

    move-result-object v4

    const/4 v7, 0x0

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v4

    invoke-static {v10, v7}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v10, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_10

    invoke-static {}, LT/j;->c()V

    :cond_10
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_11

    invoke-interface {v10, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_11
    invoke-interface {v10}, LT/l;->I()V

    :goto_6
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v7, v4, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_12

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_13
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-virtual/range {p1 .. p1}, Lfa/f;->b()Lfa/e;

    move-result-object v4

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->e()Lf0/c;

    move-result-object v5

    invoke-interface {v3, v15, v5}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v5

    new-instance v6, Lfa/i$b;

    invoke-direct {v6, v3}, Lfa/i$b;-><init>(Lz/d;)V

    const/16 v3, 0x36

    const v7, -0x446b0edf

    invoke-static {v7, v14, v6, v10, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v16, 0x186000

    const/16 v17, 0x2c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string/jumbo v18, "device-data-animation"

    const/16 v19, 0x0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v7, v18

    move/from16 v39, v8

    move-object/from16 v8, v19

    move-object/from16 v40, v9

    move-object v9, v11

    move-object v11, v10

    move-object/from16 v35, v11

    move/from16 v11, v16

    move-object v1, v12

    move/from16 v12, v17

    invoke-static/range {v3 .. v12}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V

    invoke-interface/range {v35 .. v35}, LT/l;->R()V

    invoke-interface/range {v35 .. v35}, LT/l;->R()V

    invoke-static {v15, v13, v14, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v12, v35

    move/from16 v5, v39

    move-object/from16 v4, v40

    invoke-virtual {v4, v12, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    const/4 v5, 0x2

    invoke-static {v3, v4, v13, v5, v1}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    move-object/from16 v5, v34

    invoke-virtual {v5, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    invoke-virtual/range {v28 .. v28}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v4, v5, v12, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v12, v11}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v12}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v12, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v12}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_14

    invoke-static {}, LT/j;->c()V

    :cond_14
    invoke-interface {v12}, LT/l;->u()V

    invoke-interface {v12}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-interface {v12, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_7

    :cond_15
    invoke-interface {v12}, LT/l;->I()V

    :goto_7
    invoke-static {v12}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v4, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v7, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v29 .. v29}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_16

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    :cond_16
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_17
    invoke-virtual/range {v29 .. v29}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v7, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget v3, LP9/b;->T0:I

    invoke-static {v3, v12, v11}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lfa/f;->a()Z

    move-result v5

    invoke-static {v15, v13, v14, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const v4, 0x1f3a4a0a

    invoke-interface {v12, v4}, LT/l;->U(I)V

    move-object/from16 v10, p1

    invoke-interface {v12, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    const/4 v8, 0x4

    if-ne v2, v8, :cond_18

    move v6, v14

    goto :goto_8

    :cond_18
    move v6, v11

    :goto_8
    or-int/2addr v4, v6

    invoke-interface {v12}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_19

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_1a

    :cond_19
    new-instance v6, Lfa/g;

    invoke-direct {v6, v10, v0}, Lfa/g;-><init>(Lfa/f;Lfa/j;)V

    invoke-interface {v12, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1a
    move-object v4, v6

    check-cast v4, Lmh/a;

    invoke-interface {v12}, LT/l;->J()V

    const/16 v16, 0x6

    const/16 v17, 0xb8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move v1, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v10

    move-object/from16 v10, v19

    move v14, v11

    move-object v11, v12

    move-object v1, v12

    move/from16 v12, v16

    move/from16 v13, v17

    invoke-static/range {v3 .. v13}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    sget v3, LP9/b;->U0:I

    invoke-static {v3, v1, v14}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v8

    const v3, 0x1f3a7006

    invoke-interface {v1, v3}, LT/l;->U(I)V

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1b

    const/4 v11, 0x1

    goto :goto_9

    :cond_1b
    move v11, v14

    :goto_9
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v11, :cond_1c

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_1d

    :cond_1c
    new-instance v2, Lfa/i$c;

    invoke-direct {v2, v0}, Lfa/i$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v2, Lth/g;

    invoke-interface {v1}, LT/l;->J()V

    invoke-virtual/range {v18 .. v18}, Lfa/f;->c()Z

    move-result v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v15, v4, v3, v6}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    move-object v4, v2

    check-cast v4, Lmh/a;

    const/4 v10, 0x6

    const/16 v11, 0x18

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, v1

    invoke-static/range {v3 .. v11}, Lw9/o;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Ljava/lang/String;LT/l;II)V

    invoke-interface {v1}, LT/l;->R()V

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    :goto_a
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v1

    if-eqz v1, :cond_1f

    new-instance v2, Lfa/h;

    move/from16 v3, p2

    invoke-direct {v2, v0, v3}, Lfa/h;-><init>(Lfa/j;I)V

    invoke-interface {v1, v2}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final d(Lfa/f;Lfa/j;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lfa/f;->b()Lfa/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lfa/e;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, p0}, Lfa/j;->f0(Ljava/lang/String;)V

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Lfa/j;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lfa/i;->c(Lfa/j;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
