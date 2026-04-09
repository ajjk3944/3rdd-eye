.class public abstract LIf/D;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LIf/B;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/D;->c(Landroidx/compose/ui/e;LIf/B;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LIf/B;LT/l;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x7b914f83

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v4, 0x6

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x10

    const/16 v13, 0x20

    if-nez v6, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v13

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    move v14, v5

    and-int/lit8 v5, v14, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wmw.WmwStatusPopupDiscovering (WmwStatusPopupDiscovering.kt:58)"

    invoke-static {v3, v14, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lz/c;->a:Lz/c;

    int-to-float v5, v7

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v3, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v3, v5, v15, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v12, 0x0

    invoke-static {v15, v12}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v3, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v9, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v9, v7, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static {v15, v12}, LE9/l;->j(LT/l;I)LE9/f;

    move-result-object v3

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v5, 0x0

    const/4 v10, 0x1

    const/4 v8, 0x0

    invoke-static {v11, v5, v10, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v6, v3, v15, v4, v12}, LE9/l;->e(Landroidx/compose/ui/e;LE9/f;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LIf/B;->n0()LLi/N;

    move-result-object v4

    invoke-static {v4, v8, v15, v12, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls9/d;

    const v6, -0x54d46183

    invoke-interface {v15, v6}, LT/l;->U(I)V

    if-nez v4, :cond_b

    move-object/from16 v30, v11

    move/from16 v31, v14

    move-object/from16 p2, v15

    goto :goto_5

    :cond_b
    invoke-static {v11, v5, v10, v8}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-static {v4, v15, v12}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v4

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v15, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v9

    invoke-virtual {v9}, Lpa/c;->b()Lpa/b;

    move-result-object v9

    invoke-virtual {v9}, Lpa/b;->a()LL0/U;

    move-result-object v25

    invoke-virtual {v6, v15, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->c()J

    move-result-wide v6

    sget-object v9, LW0/j;->b:LW0/j$a;

    invoke-virtual {v9}, LW0/j$a;->a()I

    move-result v9

    invoke-static {v9}, LW0/j;->h(I)LW0/j;

    move-result-object v16

    const/16 v28, 0x0

    const v29, 0x1fdf8

    const-wide/16 v17, 0x0

    move-wide/from16 v8, v17

    const/16 v17, 0x0

    move-object/from16 v10, v17

    move-object/from16 v30, v11

    move-object/from16 v11, v17

    move-object/from16 v12, v17

    const-wide/16 v17, 0x0

    move/from16 v31, v14

    move-wide/from16 v13, v17

    const/16 v17, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v17

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x30

    move-object/from16 v26, p2

    invoke-static/range {v4 .. v29}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_5
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    invoke-virtual/range {p1 .. p1}, LIf/B;->o0()LLi/N;

    move-result-object v4

    move-object/from16 v15, p2

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static {v4, v12, v15, v14, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls9/d;

    const v5, -0x54d43551

    invoke-interface {v15, v5}, LT/l;->U(I)V

    if-nez v4, :cond_c

    move/from16 v18, v13

    move/from16 v16, v14

    goto :goto_7

    :cond_c
    invoke-static {v4, v15, v14}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v10

    const v4, 0x7dd9c944

    invoke-interface {v15, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v31, 0x70

    const/16 v11, 0x20

    if-ne v4, v11, :cond_d

    move v4, v13

    goto :goto_6

    :cond_d
    move v4, v14

    :goto_6
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_e

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_f

    :cond_e
    new-instance v5, LIf/D$a;

    invoke-direct {v5, v1}, LIf/D$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lth/g;

    invoke-interface {v15}, LT/l;->J()V

    check-cast v5, Lmh/a;

    const/16 v16, 0x6

    const/16 v17, 0xbc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v18, 0x0

    move-object/from16 v4, v30

    move-object/from16 v11, v18

    move-object v12, v15

    move/from16 v18, v13

    move/from16 v13, v16

    move/from16 v16, v14

    move/from16 v14, v17

    invoke-static/range {v4 .. v14}, Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V

    :goto_7
    invoke-interface {v15}, LT/l;->J()V

    const v4, -0x54d41932

    invoke-interface {v15, v4}, LT/l;->U(I)V

    and-int/lit8 v4, v31, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_10

    move/from16 v12, v18

    goto :goto_8

    :cond_10
    move/from16 v12, v16

    :goto_8
    invoke-interface {v15, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v12

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_11

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_12

    :cond_11
    new-instance v5, LIf/D$b;

    const/4 v4, 0x0

    invoke-direct {v5, v1, v3, v4}, LIf/D$b;-><init>(LIf/B;LE9/f;Ldh/e;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lmh/p;

    invoke-interface {v15}, LT/l;->J()V

    shr-int/lit8 v3, v31, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v1, v5, v15, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {v15}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_9
    invoke-interface {v15}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_14

    new-instance v4, LIf/C;

    invoke-direct {v4, v0, v1, v2}, LIf/C;-><init>(Landroidx/compose/ui/e;LIf/B;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LIf/B;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LIf/D;->b(Landroidx/compose/ui/e;LIf/B;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
