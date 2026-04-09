.class public abstract LK9/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, LK9/g;->f()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LK9/g;->i(Lmh/l;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LK9/g;->j(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LK9/g;->g(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V
    .locals 35

    move/from16 v6, p6

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/16 v2, 0x30

    const v3, -0x3a5437ea

    move-object/from16 v4, p5

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

    const/4 v5, 0x1

    and-int/lit8 v7, p7, 0x1

    const/4 v8, 0x4

    if-eqz v7, :cond_0

    or-int/lit8 v9, v6, 0x6

    move v10, v9

    move-object/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v6, 0x6

    if-nez v9, :cond_2

    move-object/from16 v9, p0

    invoke-interface {v4, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move v10, v8

    goto :goto_0

    :cond_1
    move v10, v1

    :goto_0
    or-int/2addr v10, v6

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    move v10, v6

    :goto_1
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_4

    or-int/2addr v10, v2

    :cond_3
    move-object/from16 v1, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v1, v6, 0x30

    if-nez v1, :cond_3

    move-object/from16 v1, p1

    invoke-interface {v4, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    move v11, v0

    :goto_2
    or-int/2addr v10, v11

    :goto_3
    and-int/lit8 v11, p7, 0x4

    if-eqz v11, :cond_6

    or-int/lit16 v10, v10, 0x180

    move-object/from16 v15, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v6, 0x180

    move-object/from16 v15, p2

    if-nez v11, :cond_8

    invoke-interface {v4, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v10, v11

    :cond_8
    :goto_5
    and-int/lit8 v11, p7, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v10, v10, 0xc00

    move/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v6, 0xc00

    move/from16 v14, p3

    if-nez v11, :cond_b

    invoke-interface {v4, v14}, LT/l;->c(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v10, v11

    :cond_b
    :goto_7
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_d

    or-int/lit16 v10, v10, 0x6000

    :cond_c
    move-object/from16 v11, p4

    :goto_8
    move v13, v10

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v4, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_9

    :cond_e
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v10, v12

    goto :goto_8

    :goto_a
    and-int/lit16 v10, v13, 0x2493

    const/16 v12, 0x2492

    if-ne v10, v12, :cond_10

    invoke-interface {v4}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v4}, LT/l;->C()V

    move-object v5, v11

    goto/16 :goto_10

    :cond_10
    :goto_b
    if-eqz v7, :cond_11

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v7

    goto :goto_c

    :cond_11
    move-object v12, v9

    :goto_c
    if-eqz v0, :cond_13

    const v0, -0x3aafcc58

    invoke-interface {v4, v0}, LT/l;->U(I)V

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v0, v7, :cond_12

    new-instance v0, LK9/c;

    invoke-direct {v0}, LK9/c;-><init>()V

    invoke-interface {v4, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v0, Lmh/a;

    invoke-interface {v4}, LT/l;->J()V

    goto :goto_d

    :cond_13
    move-object v0, v11

    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_14

    const/4 v7, -0x1

    const-string/jumbo v9, "com.ui.core.ui.component.theme.UiThemeRadioButton (UiThemeSwitcher.kt:102)"

    invoke-static {v3, v13, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_14
    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v7}, LE/h;->d(F)LE/g;

    move-result-object v7

    invoke-static {v12, v7}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v16

    const v7, -0x3aafb993

    invoke-interface {v4, v7}, LT/l;->U(I)V

    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_15

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v7

    invoke-interface {v4, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v17, v7

    check-cast v17, Ly/m;

    invoke-interface {v4}, LT/l;->J()V

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-static/range {v18 .. v23}, LN/A0;->f(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v18

    const/16 v23, 0x1c

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v16 .. v24}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v9, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v9}, Lf0/c$a;->o()Lf0/c;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v10

    invoke-static {v4, v11}, LT/j;->a(LT/l;I)I

    move-result v16

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v4, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_16

    invoke-static {}, LT/j;->c()V

    :cond_16
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_17

    invoke-interface {v4, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_17
    invoke-interface {v4}, LT/l;->I()V

    :goto_e
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v2

    invoke-static {v11, v10, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v11, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v11}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_18

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    :cond_18
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v11, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v11, v5, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_19
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v11, v7, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v7, v8

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v7

    invoke-virtual {v9}, Lf0/c$a;->e()Lf0/c;

    move-result-object v8

    invoke-interface {v2, v7, v8}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v9}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v7

    sget-object v8, Lz/c;->a:Lz/c;

    invoke-virtual {v8}, Lz/c;->g()Lz/c$m;

    move-result-object v8

    const/16 v9, 0x30

    invoke-static {v8, v7, v4, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v4, v8}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v4, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_1a

    invoke-static {}, LT/j;->c()V

    :cond_1a
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v4, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_f

    :cond_1b
    invoke-interface {v4}, LT/l;->I()V

    :goto_f
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v7, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v7

    invoke-static {v10, v9, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v7

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_1c

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1d

    :cond_1c
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v7}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1d
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v7

    invoke-static {v10, v2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    const/16 v2, 0x52

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v5, v8, v2, v9, v7}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    shr-int/lit8 v2, v13, 0x6

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6030

    const/16 v18, 0xf6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v7, p2

    move-object/from16 v32, v12

    move-object/from16 v12, v16

    move/from16 v33, v13

    move-object/from16 v13, v17

    move/from16 v14, v19

    move-object/from16 v15, v21

    move-object/from16 v16, v4

    move/from16 v17, v2

    invoke-static/range {v7 .. v18}, Lta/c;->e(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v23

    const/16 v26, 0xd

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v5

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v2, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v2, v4, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->f()Lma/a$f;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$f;->a()J

    move-result-wide v9

    invoke-virtual {v2, v4, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v11

    invoke-virtual {v11}, Lpa/c;->b()Lpa/b;

    move-result-object v11

    invoke-virtual {v11}, Lpa/b;->b()LL0/U;

    move-result-object v27

    sget-object v11, LW0/j;->b:LW0/j$a;

    invoke-virtual {v11}, LW0/j$a;->a()I

    move-result v11

    invoke-static {v11}, LW0/j;->h(I)LW0/j;

    move-result-object v19

    shr-int/lit8 v11, v33, 0x3

    and-int/lit8 v11, v11, 0xe

    const/16 v12, 0x30

    or-int/lit8 v29, v11, 0x30

    const/16 v30, 0x0

    const v31, 0xfdf8

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

    move/from16 v34, v7

    move-object/from16 v7, p1

    move-object/from16 v28, v4

    invoke-static/range {v7 .. v31}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    sget-object v7, LN/v0;->a:LN/v0;

    move/from16 v8, v34

    invoke-virtual {v2, v4, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$a;->f()J

    move-result-wide v9

    invoke-virtual {v2, v4, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a;->a()Lma/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v11

    invoke-virtual {v11}, Lr9/a$b;->f()J

    move-result-wide v11

    invoke-virtual {v2, v4, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->a()Lma/a$a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$b;->b()J

    move-result-wide v13

    sget v2, LN/v0;->b:I

    shl-int/lit8 v15, v2, 0x9

    const/16 v16, 0x0

    move-wide v8, v9

    move-wide v10, v11

    move-wide v12, v13

    move-object v14, v4

    invoke-virtual/range {v7 .. v16}, LN/v0;->a(JJJLT/l;II)LN/u0;

    move-result-object v12

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v23

    const/16 v26, 0xd

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v21, v5

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    shr-int/lit8 v2, v33, 0x9

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v14, v2, 0x1b0

    const/16 v15, 0x18

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v7, p3

    move-object v13, v4

    invoke-static/range {v7 .. v15}, LN/w0;->a(ZLmh/a;Landroidx/compose/ui/e;ZLy/m;LN/u0;LT/l;II)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-static {}, LT/o;->P()V

    :cond_1e
    move-object v5, v0

    move-object/from16 v9, v32

    :goto_10
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v10, LK9/d;

    move-object v0, v10

    move-object v1, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LK9/d;-><init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;II)V

    invoke-interface {v8, v10}, LT/X0;->a(Lmh/p;)V

    :cond_1f
    return-void
.end method

.method private static final f()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LK9/g;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final h(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;LT/l;II)V
    .locals 22

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v15, p3

    move-object/from16 v12, p4

    move/from16 v11, p6

    const-string/jumbo v0, "onFollowSystemThemeChange"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onDarkThemeSelectedChange"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1092abf1

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v11, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v10, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v11

    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_5

    invoke-interface {v10, v13}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_8

    invoke-interface {v10, v14}, LT/l;->c(Z)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v4, v11, 0xc00

    if-nez v4, :cond_b

    invoke-interface {v10, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/16 v4, 0x800

    goto :goto_6

    :cond_a
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    :goto_7
    and-int/lit8 v4, p7, 0x10

    if-eqz v4, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v4, v11, 0x6000

    if-nez v4, :cond_e

    invoke-interface {v10, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/16 v4, 0x4000

    goto :goto_8

    :cond_d
    const/16 v4, 0x2000

    :goto_8
    or-int/2addr v3, v4

    :cond_e
    :goto_9
    and-int/lit16 v4, v3, 0x2493

    const/16 v6, 0x2492

    if-ne v4, v6, :cond_10

    invoke-interface {v10}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v10}, LT/l;->C()V

    move-object v1, v2

    move-object v11, v10

    move-object v15, v12

    goto/16 :goto_d

    :cond_10
    :goto_a
    if-eqz v1, :cond_11

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v9, v1

    goto :goto_b

    :cond_11
    move-object v9, v2

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.theme.UiThemeSwitcher (UiThemeSwitcher.kt:45)"

    invoke-static {v0, v3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    invoke-static {v9, v0}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v16

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v10, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->e()Lma/a$e;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$e;->b()J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    const/16 v4, 0x30

    invoke-static {v2, v1, v10, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v10, v2}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v10, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_13

    invoke-static {}, LT/j;->c()V

    :cond_13
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_14

    invoke-interface {v10, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_c

    :cond_14
    invoke-interface {v10}, LT/l;->I()V

    :goto_c
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v5

    invoke-static {v8, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v8, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    :cond_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_16
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v8, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v17, Lz/k;->a:Lz/k;

    sget v0, Lt9/b;->f:I

    invoke-static {v0, v10, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    const v0, -0x2940cb58

    invoke-interface {v10, v0}, LT/l;->U(I)V

    and-int/lit16 v0, v3, 0x1c00

    const/4 v8, 0x1

    const/16 v1, 0x800

    if-ne v0, v1, :cond_17

    move v2, v8

    :cond_17
    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_18

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_19

    :cond_18
    new-instance v0, LK9/a;

    invoke-direct {v0, v15}, LK9/a;-><init>(Lmh/l;)V

    invoke-interface {v10, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    move-object v5, v0

    check-cast v5, Lmh/l;

    invoke-interface {v10}, LT/l;->J()V

    shl-int/lit8 v0, v3, 0x9

    const v1, 0xe000

    and-int v18, v0, v1

    const/16 v19, 0x3cb

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v2, v4

    move/from16 v4, p1

    move/from16 v8, v20

    move-object/from16 v20, v9

    move-object/from16 v9, v21

    move-object/from16 p0, v10

    move/from16 v11, v18

    move-object v15, v12

    move/from16 v12, v19

    invoke-static/range {v0 .. v12}, LF9/u0;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;Ljava/lang/String;ZLmh/l;Ls9/b;Lmh/a;ZLjava/lang/String;LT/l;II)V

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v0}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v5

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/animation/g;->m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v4

    invoke-static {v0, v1, v2, v0}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v6

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/animation/g;->y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v5

    xor-int/lit8 v2, v13, 0x1

    new-instance v0, LK9/g$a;

    invoke-direct {v0, v14, v15}, LK9/g$a;-><init>(ZLmh/l;)V

    const/16 v1, 0x36

    const v3, 0x4e6f4e01

    const/4 v6, 0x1

    move-object/from16 v11, p0

    invoke-static {v3, v6, v0, v11, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x186c06

    const/16 v10, 0x12

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v17

    move-object v8, v11

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v11}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LT/o;->P()V

    :cond_1a
    move-object/from16 v1, v20

    :goto_d
    invoke-interface {v11}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v9, LK9/b;

    move-object v0, v9

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LK9/b;-><init>(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_1b
    return-void
.end method

.method private static final i(Lmh/l;Z)LYg/J;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LK9/g;->h(Landroidx/compose/ui/e;ZZLmh/l;Lmh/l;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic k(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V
    .locals 0

    invoke-static/range {p0 .. p7}, LK9/g;->e(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/c;ZLmh/a;LT/l;II)V

    return-void
.end method
