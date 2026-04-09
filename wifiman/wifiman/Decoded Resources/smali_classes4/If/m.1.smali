.class public abstract LIf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LIf/d;)I
    .locals 0

    invoke-static {p0}, LIf/m;->h(LIf/d;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;LIf/c;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, LIf/m;->f(Landroidx/compose/ui/e;LIf/c;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;LIf/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/m;->j(Landroidx/compose/ui/e;LIf/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LIf/e;LIf/d;LC/C;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LIf/m;->i(LIf/e;LIf/d;LC/C;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/e;LIf/c;LT/l;II)V
    .locals 31

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const/4 v3, 0x2

    const v4, 0x33c8b9c4

    move-object/from16 v5, p2

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v14, 0x1

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v6, v1, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/2addr v3, v2

    const/16 v8, 0x10

    if-eqz v3, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    move v3, v8

    :goto_2
    or-int/2addr v7, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v7, 0x13

    const/16 v9, 0x12

    if-ne v3, v9, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v3, v6

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.wmw.DeviceItem (WmwStatusPopupAdoption.kt:68)"

    invoke-static {v4, v7, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v4, Lz/c;->a:Lz/c;

    int-to-float v5, v8

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-virtual {v4, v5}, Lz/c;->n(F)Lz/c$f;

    move-result-object v4

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v4, v5, v15, v6}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v13, 0x0

    invoke-static {v15, v13}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_a

    invoke-static {}, LT/j;->c()V

    :cond_a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v15, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_b
    invoke-interface {v15}, LT/l;->I()V

    :goto_6
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_d
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LIf/c;->b()Ls9/c;

    move-result-object v5

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v6, 0x96

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v6, v11, v14, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v16, 0x30

    const/16 v17, 0x3e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v18, 0x0

    move-wide/from16 v11, v18

    move-object v13, v15

    move/from16 v14, v16

    move-object/from16 p0, v3

    move-object v3, v15

    move/from16 v15, v17

    invoke-static/range {v5 .. v15}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v4, v6, v5, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LIf/c;->c()Ls9/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v3, v5}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v5

    sget-object v4, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v4, v3, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v8

    invoke-virtual {v8}, Lpa/c;->a()Lpa/b;

    move-result-object v8

    invoke-virtual {v8}, Lpa/b;->b()LL0/U;

    move-result-object v26

    invoke-virtual {v4, v3, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->f()Lma/a$f;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$f;->a()J

    move-result-wide v7

    sget-object v4, LW0/j;->b:LW0/j$a;

    invoke-virtual {v4}, LW0/j$a;->a()I

    move-result v4

    invoke-static {v4}, LW0/j;->h(I)LW0/j;

    move-result-object v17

    const/16 v29, 0x0

    const v30, 0x1fdf8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x30

    move-object/from16 v27, v3

    invoke-static/range {v5 .. v30}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object/from16 v6, p0

    :goto_7
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, LIf/l;

    invoke-direct {v4, v6, v0, v1, v2}, LIf/l;-><init>(Landroidx/compose/ui/e;LIf/c;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final f(Landroidx/compose/ui/e;LIf/c;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, LIf/m;->e(Landroidx/compose/ui/e;LIf/c;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/e;LIf/e;LT/l;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "modifier"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vm"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x69e0b313

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x10

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move v5, v6

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    move v12, v4

    and-int/lit8 v4, v12, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v15

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoption (WmwStatusPopupAdoption.kt:97)"

    invoke-static {v3, v12, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lz/c;->a:Lz/c;

    int-to-float v4, v6

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-virtual {v3, v4}, Lz/c;->n(F)Lz/c$f;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v4

    const/16 v11, 0x36

    invoke-static {v3, v4, v15, v11}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v15, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v15, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LT/l;->I()V

    :goto_4
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v3, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v8, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v8, v6, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-virtual/range {p1 .. p1}, LIf/e;->n0()LLi/N;

    move-result-object v4

    const/4 v9, 0x0

    const/4 v8, 0x1

    invoke-static {v4, v9, v15, v10, v8}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v4

    invoke-interface {v4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, LIf/d;

    const v4, -0x4b32f8aa

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_b

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_c

    :cond_b
    new-instance v5, LIf/i;

    invoke-direct {v5, v7}, LIf/i;-><init>(LIf/d;)V

    invoke-interface {v15, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v6, v5

    check-cast v6, Lmh/a;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v16, 0x0

    const/16 v17, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v14, v7

    move-object v7, v15

    move v13, v8

    move/from16 v8, v16

    move/from16 v16, v12

    move-object v12, v9

    move/from16 v9, v17

    invoke-static/range {v4 .. v9}, LC/D;->k(IFLmh/a;LT/l;II)LC/C;

    move-result-object v9

    move-object v4, v9

    sget-object v8, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    invoke-static {v8, v7, v13, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    new-instance v6, LIf/m$a;

    invoke-direct {v6, v14}, LIf/m$a;-><init>(LIf/d;)V

    const v7, -0x718f5f2b

    invoke-static {v7, v13, v6, v15, v11}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v17

    const/16 v20, 0xc00

    const/16 v21, 0x1ffc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    move-object/from16 v22, v8

    move/from16 v8, v19

    const/16 v19, 0x0

    move-object/from16 v23, v9

    move/from16 v9, v19

    const/16 v19, 0x0

    move-object/from16 v10, v19

    move-object/from16 v11, v19

    const/16 v19, 0x0

    move/from16 v24, v16

    move/from16 v12, v19

    const/16 v16, 0x0

    move/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v14

    move-object/from16 v14, v16

    move-object/from16 v25, v15

    move-object/from16 v15, v16

    const/16 v19, 0x30

    move-object/from16 v18, v25

    invoke-static/range {v4 .. v21}, LC/m;->a(LC/C;Landroidx/compose/ui/e;Lz/N;LC/g;IFLf0/c$c;Lw/C;ZZLmh/l;Lx0/a;Lx/j;Lmh/r;LT/l;III)V

    invoke-virtual/range {p2 .. p2}, LIf/d;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v14, 0x1

    if-le v4, v14, :cond_d

    move v5, v14

    goto :goto_5

    :cond_d
    const/4 v5, 0x0

    :goto_5
    new-instance v4, LIf/m$b;

    move-object/from16 v15, p2

    move-object/from16 v13, v23

    invoke-direct {v4, v13, v15}, LIf/m$b;-><init>(LC/C;LIf/d;)V

    const v6, -0x6940ba21

    move-object/from16 v12, v25

    const/16 v7, 0x36

    invoke-static {v6, v14, v4, v12, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const v16, 0x180006

    const/16 v17, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v3

    move-object v11, v12

    move-object v3, v12

    move/from16 v12, v16

    move-object/from16 v26, v13

    move/from16 v13, v17

    invoke-static/range {v4 .. v13}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    move-object/from16 v5, v22

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v5, v6, v14, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v7, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v7, v3, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$a;->c()F

    move-result v7

    const/4 v8, 0x2

    invoke-static {v5, v7, v6, v8, v4}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget v5, Lm8/c;->J5:I

    const/4 v6, 0x0

    invoke-static {v5, v3, v6}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v10

    const v5, -0x4b329326

    invoke-interface {v3, v5}, LT/l;->U(I)V

    and-int/lit8 v5, v24, 0x70

    const/16 v7, 0x20

    if-ne v5, v7, :cond_e

    goto :goto_6

    :cond_e
    move v14, v6

    :goto_6
    invoke-interface {v3, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v14

    move-object/from16 v6, v26

    invoke-interface {v3, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_f

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_10

    :cond_f
    new-instance v7, LIf/j;

    invoke-direct {v7, v1, v15, v6}, LIf/j;-><init>(LIf/e;LIf/d;LC/C;)V

    invoke-interface {v3, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v5, v7

    check-cast v5, Lmh/a;

    invoke-interface {v3}, LT/l;->J()V

    const/4 v13, 0x0

    const/16 v14, 0xbc

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v12, v3

    invoke-static/range {v4 .. v14}, Lw9/r;->b(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/p;Ljava/lang/String;LL0/U;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_7
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, LIf/k;

    invoke-direct {v4, v0, v1, v2}, LIf/k;-><init>(Landroidx/compose/ui/e;LIf/e;I)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final h(LIf/d;)I
    .locals 0

    invoke-virtual {p0}, LIf/d;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method private static final i(LIf/e;LIf/d;LC/C;)LYg/J;
    .locals 0

    invoke-virtual {p1}, LIf/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, LC/C;->v()I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIf/c;

    invoke-virtual {p0, p1}, LIf/e;->o0(LIf/c;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/e;LIf/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, LIf/m;->g(Landroidx/compose/ui/e;LIf/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic k(Landroidx/compose/ui/e;LIf/c;LT/l;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LIf/m;->e(Landroidx/compose/ui/e;LIf/c;LT/l;II)V

    return-void
.end method
