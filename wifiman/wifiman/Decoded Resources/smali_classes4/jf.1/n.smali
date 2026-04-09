.class public abstract Ljf/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljf/n;->c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LT/l;II)V
    .locals 19

    move/from16 v0, p2

    move/from16 v1, p3

    const/4 v2, 0x6

    const v3, 0x3c2186cb

    move-object/from16 v4, p1

    invoke-interface {v4, v3}, LT/l;->r(I)LT/l;

    move-result-object v4

    const/4 v5, 0x1

    and-int/lit8 v6, v1, 0x1

    const/4 v7, 0x2

    if-eqz v6, :cond_0

    or-int/lit8 v8, v0, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v0, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v4, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    move v9, v7

    :goto_0
    or-int/2addr v9, v0

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v0

    :goto_1
    and-int/lit8 v10, v9, 0x3

    if-ne v10, v7, :cond_4

    invoke-interface {v4}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v4}, LT/l;->C()V

    move-object v6, v8

    goto/16 :goto_5

    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_3

    :cond_5
    move-object v6, v8

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_6

    const/4 v8, -0x1

    const-string v10, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailLoadingUi (SpeedtestResultDetailLoadingUi.kt:24)"

    invoke-static {v3, v9, v8, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, Lla/a;->a:Lla/a;

    sget v8, Lla/a;->b:I

    invoke-virtual {v3, v4, v8}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$b;->b()J

    move-result-wide v16

    const/4 v9, 0x0

    const/4 v15, 0x0

    invoke-static {v6, v9, v5, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v10

    invoke-virtual {v3, v4, v8}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v11

    invoke-virtual {v11}, Lra/a;->a()Lra/b;

    move-result-object v11

    invoke-virtual {v11}, Lra/b;->a()Lra/b$a$a;

    move-result-object v11

    invoke-virtual {v11}, Lra/b$a$a;->c()F

    move-result v11

    invoke-static {v10, v11, v9, v7, v15}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v7

    const/4 v14, 0x0

    invoke-static {v7, v4, v14}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v10, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v10}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v10

    sget-object v11, Lz/c;->a:Lz/c;

    invoke-virtual {v11}, Lz/c;->g()Lz/c$m;

    move-result-object v11

    const/16 v12, 0x30

    invoke-static {v11, v10, v4, v12}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v10

    invoke-static {v4, v14}, LT/j;->a(LT/l;I)I

    move-result v11

    invoke-interface {v4}, LT/l;->G()LT/x;

    move-result-object v12

    invoke-static {v4, v7}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v7

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v2

    invoke-interface {v4}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_7

    invoke-static {}, LT/j;->c()V

    :cond_7
    invoke-interface {v4}, LT/l;->u()V

    invoke-interface {v4}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-interface {v4, v2}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_8
    invoke-interface {v4}, LT/l;->I()V

    :goto_4
    invoke-static {v4}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v2

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v2, v10, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v9

    invoke-static {v2, v12, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v9

    invoke-interface {v2}, LT/l;->o()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v2, v10}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v2, v10, v9}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_a
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v2, v7, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v2, Lz/k;->a:Lz/k;

    invoke-static {v15, v4, v14, v5}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    invoke-static {v2, v7, v5, v15}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    const/16 v7, 0xc8

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/4 v7, 0x2

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-wide/from16 v11, v16

    move v5, v14

    move v14, v7

    move-object v7, v15

    move-object v15, v9

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-virtual {v3, v4, v8}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v10

    invoke-virtual {v10}, Loa/a;->a()LE/a;

    move-result-object v10

    invoke-static {v9, v10}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v9

    invoke-static {v9, v4, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/16 v9, 0x8

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v9

    const/4 v10, 0x6

    invoke-static {v9, v4, v10}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v2, v10, v9, v7}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    const/16 v9, 0x3c

    int-to-float v9, v9

    invoke-static {v9}, LY0/h;->j(F)F

    move-result v9

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v10

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual {v3, v4, v8}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v3

    invoke-virtual {v3}, Loa/a;->a()LE/a;

    move-result-object v3

    invoke-static {v2, v3}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v4, v5}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v2, 0x1

    invoke-static {v7, v4, v5, v2}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v4}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_5
    invoke-interface {v4}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Ljf/m;

    invoke-direct {v3, v6, v0, v1}, Ljf/m;-><init>(Landroidx/compose/ui/e;II)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;IILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Ljf/n;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
