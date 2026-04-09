.class public abstract Lkf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkf/k;->c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LT/l;II)V
    .locals 19

    move/from16 v0, p2

    move/from16 v1, p3

    const/4 v2, 0x3

    const/4 v3, 0x6

    const v4, 0xb6b2e66

    move-object/from16 v5, p1

    invoke-interface {v5, v4}, LT/l;->r(I)LT/l;

    move-result-object v5

    const/4 v6, 0x1

    and-int/lit8 v7, v1, 0x1

    const/4 v8, 0x2

    if-eqz v7, :cond_0

    or-int/lit8 v9, v0, 0x6

    move v10, v9

    move-object/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v0, 0x6

    if-nez v9, :cond_2

    move-object/from16 v9, p0

    invoke-interface {v5, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/4 v10, 0x4

    goto :goto_0

    :cond_1
    move v10, v8

    :goto_0
    or-int/2addr v10, v0

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    move v10, v0

    :goto_1
    and-int/lit8 v11, v10, 0x3

    if-ne v11, v8, :cond_4

    invoke-interface {v5}, LT/l;->v()Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v5}, LT/l;->C()V

    move-object v7, v9

    goto/16 :goto_6

    :cond_4
    :goto_2
    if-eqz v7, :cond_5

    sget-object v7, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_3

    :cond_5
    move-object v7, v9

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v9, -0x1

    const-string v11, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsLoadingUi (SpeedtestResultsLoadingUi.kt:24)"

    invoke-static {v4, v10, v9, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v4, Lla/a;->a:Lla/a;

    sget v9, Lla/a;->b:I

    invoke-virtual {v4, v5, v9}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v10

    invoke-virtual {v10}, Lma/a;->a()Lma/a$a;

    move-result-object v10

    invoke-virtual {v10}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v10

    invoke-virtual {v10}, Lr9/a$b;->b()J

    move-result-wide v17

    const/4 v10, 0x0

    const/4 v15, 0x0

    invoke-static {v7, v10, v6, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v11

    invoke-virtual {v4, v5, v9}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->c()F

    move-result v4

    invoke-static {v11, v4, v10, v8, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v4, v5, v9}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v11, Lz/c;->a:Lz/c;

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-virtual {v11, v8}, Lz/c;->n(F)Lz/c$f;

    move-result-object v8

    sget-object v11, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v11}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v11

    invoke-static {v8, v11, v5, v3}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    invoke-static {v5, v9}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v5}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v5, v4}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v12, LE0/g;->K:LE0/g$a;

    invoke-virtual {v12}, LE0/g$a;->a()Lmh/a;

    move-result-object v13

    invoke-interface {v5}, LT/l;->x()LT/f;

    move-result-object v14

    if-nez v14, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v5}, LT/l;->u()V

    invoke-interface {v5}, LT/l;->o()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v5, v13}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v5}, LT/l;->I()V

    :goto_4
    invoke-static {v5}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v13

    invoke-virtual {v12}, LE0/g$a;->e()Lmh/p;

    move-result-object v14

    invoke-static {v13, v3, v14}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v13, v11, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v12}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v13}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_9

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    :cond_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v13, v8, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v12}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v13, v4, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-static {v15, v5, v9, v6}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    const v3, 0x30efd62

    invoke-interface {v5, v3}, LT/l;->U(I)V

    invoke-static {v9, v2}, Lsh/m;->s(II)Lsh/i;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    move-object v3, v2

    check-cast v3, LZg/Q;

    invoke-virtual {v3}, LZg/Q;->d()I

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v10, v6, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    const/16 v4, 0x71

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v11

    const/4 v3, 0x2

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-wide/from16 v12, v17

    move-object v4, v15

    move v15, v3

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v8, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v8, v5, v11}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v8

    invoke-virtual {v8}, Loa/a;->a()LE/a;

    move-result-object v8

    invoke-static {v3, v8}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3, v5, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    move-object v15, v4

    goto :goto_5

    :cond_b
    move-object v4, v15

    invoke-interface {v5}, LT/l;->J()V

    invoke-static {v4, v5, v9, v6}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v5}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_6
    invoke-interface {v5}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v3, Lkf/j;

    invoke-direct {v3, v7, v0, v1}, Lkf/j;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_d
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lkf/k;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
