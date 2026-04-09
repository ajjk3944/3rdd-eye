.class public abstract Lcom/ui/wifiman/ui/component/network/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/component/network/g;->h(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/ui/wifiman/ui/component/network/c$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/g;->f(Lcom/ui/wifiman/ui/component/network/c$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/ui/wifiman/ui/component/network/g;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;LT/l;II)V
    .locals 37

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, 0x695e0eb9

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x2

    if-eqz v4, :cond_0

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
    move v7, v5

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    const/16 v9, 0x10

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    invoke-interface {v15, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    move v8, v9

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v7, 0x13

    const/16 v10, 0x12

    if-ne v8, v10, :cond_7

    invoke-interface {v15}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LT/l;->C()V

    move-object v5, v15

    goto/16 :goto_7

    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v13, v4

    goto :goto_5

    :cond_8
    move-object v13, v6

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, -0x1

    const-string v6, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo (NetworkConnectionInfo.kt:128)"

    invoke-static {v3, v7, v4, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    int-to-float v3, v9

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static {v13, v3, v4, v5, v6}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    sget-object v5, Lz/c;->a:Lz/c;

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lz/c;->n(F)Lz/c$f;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v5, v4, v15, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v15, v11}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {v15, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

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

    invoke-static {v9, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/c$a;->a()Ls9/b;

    move-result-object v4

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v12, v3

    const/16 v5, 0x14

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    shr-int/lit8 v3, v7, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-virtual {v0, v15, v3}, Lcom/ui/wifiman/ui/component/network/c$a;->c(LT/l;I)J

    move-result-wide v6

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v6

    const/16 v9, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v8, v15

    invoke-static/range {v4 .. v10}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/c$a;->b()Ls9/d;

    move-result-object v3

    invoke-static {v3, v15, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v11

    sget-object v3, LW0/j;->b:LW0/j$a;

    invoke-virtual {v3}, LW0/j$a;->f()I

    move-result v3

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v15, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v6

    invoke-virtual {v6}, Lma/a;->f()Lma/a$f;

    move-result-object v6

    invoke-virtual {v6}, Lma/a$f;->a()J

    move-result-wide v6

    move-object v8, v13

    move-wide v13, v6

    sget-object v6, LW0/t;->a:LW0/t$a;

    invoke-virtual {v6}, LW0/t$a;->b()I

    move-result v26

    invoke-virtual {v4, v15, v5}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v4

    invoke-virtual {v4}, Lpa/c;->a()Lpa/b;

    move-result-object v4

    invoke-virtual {v4}, Lpa/b;->b()LL0/U;

    move-result-object v32

    invoke-static {v3}, LW0/j;->h(I)LW0/j;

    move-result-object v23

    const/16 v35, 0xc30

    const v36, 0x1d5f8

    const-wide/16 v3, 0x0

    move-object v5, v15

    move-wide v15, v3

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x30

    move-object/from16 v33, v5

    invoke-static/range {v11 .. v36}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    move-object v6, v8

    :goto_7
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lcom/ui/wifiman/ui/component/network/f;

    invoke-direct {v4, v6, v0, v1, v2}, Lcom/ui/wifiman/ui/component/network/f;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method public static final e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V
    .locals 18

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "networkInfoVm"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x5e81e09b    # -8.61001E-19f

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

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

    invoke-interface {v4, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v2, 0x2

    const/16 v9, 0x20

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    invoke-interface {v4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v7, 0x13

    const/16 v10, 0x12

    if-ne v8, v10, :cond_7

    invoke-interface {v4}, LT/l;->v()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v4}, LT/l;->C()V

    move-object v5, v6

    goto/16 :goto_8

    :cond_7
    :goto_4
    if-eqz v5, :cond_8

    sget-object v5, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_5

    :cond_8
    move-object v5, v6

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_9

    const/4 v6, -0x1

    const-string v8, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo (NetworkConnectionInfo.kt:113)"

    invoke-static {v3, v7, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/c$b;->n0()LLi/N;

    move-result-object v3

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    invoke-static {v3, v6, v4, v8, v10}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v3

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/ui/component/network/c$a;

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    sget-object v6, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v6, v4, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v6

    invoke-virtual {v6}, Loa/a;->b()Loa/a$a;

    move-result-object v6

    invoke-virtual {v6}, Loa/a$a;->a()F

    move-result v6

    invoke-static {v6}, LE/h;->d(F)LE/g;

    move-result-object v6

    invoke-static {v5, v6}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v11

    const v6, -0x39650cb5

    invoke-interface {v4, v6}, LT/l;->U(I)V

    and-int/lit8 v6, v7, 0x70

    if-ne v6, v9, :cond_b

    goto :goto_6

    :cond_b
    move v10, v8

    :goto_6
    invoke-interface {v4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v10, :cond_c

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_d

    :cond_c
    new-instance v6, Lcom/ui/wifiman/ui/component/network/d;

    invoke-direct {v6, v0}, Lcom/ui/wifiman/ui/component/network/d;-><init>(Lcom/ui/wifiman/ui/component/network/c$b;)V

    invoke-interface {v4, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    move-object v15, v6

    check-cast v15, Lmh/a;

    invoke-interface {v4}, LT/l;->J()V

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-static {v6, v3, v4, v8, v8}, Lcom/ui/wifiman/ui/component/network/g;->d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;LT/l;II)V

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_8
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lcom/ui/wifiman/ui/component/network/e;

    invoke-direct {v4, v5, v0, v1, v2}, Lcom/ui/wifiman/ui/component/network/e;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;II)V

    invoke-interface {v3, v4}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final f(Lcom/ui/wifiman/ui/component/network/c$b;)LYg/J;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/c$b;->o0()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/ui/wifiman/ui/component/network/g;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$b;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/ui/wifiman/ui/component/network/g;->d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/c$a;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final i(Lcom/ui/wifiman/ui/component/network/c;)Lcom/ui/wifiman/ui/component/network/c$b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/ui/wifiman/ui/component/network/g$a;

    invoke-direct {p0}, Lcom/ui/wifiman/ui/component/network/g$a;-><init>()V

    return-object p0
.end method
