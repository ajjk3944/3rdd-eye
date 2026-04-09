.class public abstract LMe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;LMe/c;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LMe/e;->c(Landroidx/compose/ui/e;LMe/c;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LMe/c;LT/l;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const/16 v3, 0x30

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "item"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x389654c7

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v5, v2, 0x6

    const/4 v6, 0x4

    const/4 v14, 0x2

    if-nez v5, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    move v5, v14

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit8 v7, v5, 0x13

    const/16 v9, 0x12

    if-ne v7, v9, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v0, v15

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_6

    const/4 v7, -0x1

    const-string v9, "com.ui.wifiman.ui.discovery.component.DiscoveryResultBluetooth (DiscoveryResultBluetooth.kt:57)"

    invoke-static {v4, v5, v7, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    int-to-float v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static {v0, v4, v13, v14, v11}, Landroidx/compose/foundation/layout/r;->b(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    int-to-float v12, v8

    invoke-static {v12}, LY0/h;->j(F)F

    move-result v5

    int-to-float v10, v6

    invoke-static {v10}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v16, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    sget-object v9, Lz/c;->a:Lz/c;

    invoke-virtual {v9}, Lz/c;->f()Lz/c$e;

    move-result-object v6

    invoke-static {v6, v5, v15, v3}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v17, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-interface {v15, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_9

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v4, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, LMe/c;->a()Ls9/a;

    move-result-object v5

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v6, 0x28

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v18, 0x30

    const/16 v19, 0x3e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    move-object/from16 v31, v9

    move-object/from16 v9, v20

    move/from16 v20, v10

    move/from16 v10, v21

    move/from16 v32, v12

    move-wide/from16 v11, v22

    move-object v13, v15

    move/from16 v14, v18

    move-object v0, v15

    move/from16 v15, v19

    invoke-static/range {v5 .. v15}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v15, 0x1

    invoke-interface {v3, v4, v5, v15}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v5, 0xa

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-static {v3, v5, v13, v14, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v5

    int-to-float v6, v14

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    move-object/from16 v7, v31

    invoke-virtual {v7, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    const/16 v8, 0x36

    invoke-static {v6, v5, v0, v8}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v0, v11}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {v0}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v0, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v0}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v0}, LT/l;->u()V

    invoke-interface {v0}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_c

    invoke-interface {v0, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_5

    :cond_c
    invoke-interface {v0}, LT/l;->I()V

    :goto_5
    invoke-static {v0}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v17 .. v17}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_d

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual/range {v17 .. v17}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v3, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v7, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v6

    invoke-static/range {v20 .. v20}, LY0/h;->j(F)F

    move-result v3

    invoke-virtual {v7, v3}, Lz/c;->n(F)Lz/c$f;

    move-result-object v7

    new-instance v3, LMe/e$a;

    invoke-direct {v3, v1}, LMe/e$a;-><init>(LMe/c;)V

    const v5, 0x363a589a

    invoke-static {v5, v15, v3, v0, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v3, 0x1801b6

    const/16 v16, 0x38

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v4

    const/4 v15, 0x0

    move-object v12, v0

    move v13, v3

    move v3, v14

    move/from16 v14, v16

    invoke-static/range {v5 .. v14}, Lz/t;->a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, LMe/c;->b()Ls9/d;

    move-result-object v5

    invoke-static {v5, v0, v15}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v14, Lla/a;->a:Lla/a;

    sget v13, Lla/a;->b:I

    invoke-virtual {v14, v0, v13}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v26

    invoke-virtual {v14, v0, v13}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->c()J

    move-result-wide v7

    sget-object v6, LW0/t;->a:LW0/t$a;

    invoke-virtual {v6}, LW0/t$a;->b()I

    move-result v20

    const/16 v29, 0xc30

    const v30, 0x1d7fa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move/from16 v33, v13

    move-object/from16 v13, v16

    const-wide/16 v16, 0x0

    move-object/from16 v34, v14

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v0

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static/range {v32 .. v32}, LY0/h;->j(F)F

    move-result v5

    const/4 v6, 0x0

    const/4 v14, 0x0

    invoke-static {v4, v5, v6, v3, v14}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LMe/c;->e()Ls9/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v0, v4}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    move/from16 v7, v33

    move-object/from16 v3, v34

    invoke-virtual {v3, v0, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->b()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->c()LL0/U;

    move-result-object v26

    invoke-virtual {v3, v0, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->f()Lma/a$f;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$f;->a()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x1fff8

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-object v3, v14

    move-wide v14, v15

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v28, 0x30

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    const/4 v5, 0x1

    invoke-static {v3, v0, v4, v5}, LEe/K;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v0}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_6
    invoke-interface {v0}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v3, LMe/d;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v2}, LMe/d;-><init>(Landroidx/compose/ui/e;LMe/c;I)V

    invoke-interface {v0, v3}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;LMe/c;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LMe/e;->b(Landroidx/compose/ui/e;LMe/c;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
