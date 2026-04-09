.class public abstract LFf/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LFf/y;->c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "modifier"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x2e32109b

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LT/l;->r(I)LT/l;

    move-result-object v3

    const/4 v4, 0x6

    and-int/lit8 v5, v1, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-interface {v3, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    and-int/lit8 v7, v5, 0x3

    if-ne v7, v6, :cond_3

    invoke-interface {v3}, LT/l;->v()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v3}, LT/l;->C()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v7, -0x1

    const-string v8, "com.ui.wifiman.ui.wifi.scan.WifiScanUiLoading (WifiScanUiLoading.kt:23)"

    invoke-static {v2, v5, v7, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v2, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v2, v3, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a;->a()Lma/a$a;

    move-result-object v7

    invoke-virtual {v7}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v7

    invoke-virtual {v7}, Lr9/a$b;->b()J

    move-result-wide v14

    invoke-virtual {v2, v3, v5}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$a;->c()F

    move-result v7

    const/4 v13, 0x0

    const/4 v12, 0x0

    invoke-static {v0, v7, v13, v6, v12}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v3, v7}, LH9/a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v16, Lz/c;->a:Lz/c;

    invoke-virtual/range {v16 .. v16}, Lz/c;->g()Lz/c$m;

    move-result-object v8

    sget-object v17, Lf0/c;->a:Lf0/c$a;

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v9

    invoke-static {v8, v9, v3, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v8

    invoke-static {v3, v7}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v3, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v18, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v19

    if-nez v19, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v19

    if-eqz v19, :cond_6

    invoke-interface {v3, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {v3}, LT/l;->I()V

    :goto_3
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v11, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v11, v10, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v11}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_7

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v11, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v4, Lz/k;->a:Lz/k;

    const/4 v4, 0x1

    invoke-static {v12, v3, v7, v4}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v6, v13, v4, v12}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/4 v11, 0x0

    move-wide v9, v14

    move/from16 v12, v19

    move-object/from16 v13, v20

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-virtual {v2, v3, v5}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v2

    invoke-virtual {v2}, Loa/a;->a()LE/a;

    move-result-object v2

    invoke-static {v8, v2}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v8

    invoke-static {v5, v8, v3, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {v3, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {v3}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {v3, v2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {v3}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_9

    invoke-static {}, LT/j;->c()V

    :cond_9
    invoke-interface {v3}, LT/l;->u()V

    invoke-interface {v3}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v3, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_4

    :cond_a
    invoke-interface {v3}, LT/l;->I()V

    :goto_4
    invoke-static {v3}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v9, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v18 .. v18}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_c
    invoke-virtual/range {v18 .. v18}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v2, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-interface {v3}, LT/l;->R()V

    const/4 v2, 0x0

    invoke-static {v2, v3, v7, v4}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, v3, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const v5, -0x3580b104    # -4182975.0f

    invoke-interface {v3, v5}, LT/l;->U(I)V

    const/4 v5, 0x5

    invoke-static {v7, v5}, Lsh/m;->s(II)Lsh/i;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    move-object v6, v5

    check-cast v6, LZg/Q;

    invoke-virtual {v6}, LZg/Q;->d()I

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v8, v4

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v13, 0x6

    invoke-static {v8, v3, v13}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v12, 0x0

    invoke-static {v6, v12, v4, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/16 v8, 0x3c

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const/4 v6, 0x2

    const/16 v16, 0x0

    const/4 v11, 0x0

    move-wide v9, v14

    move/from16 v17, v12

    move v12, v6

    move v6, v13

    move-object/from16 v13, v16

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    sget-object v9, Lla/a;->a:Lla/a;

    sget v10, Lla/a;->b:I

    invoke-virtual {v9, v3, v10}, Lla/a;->b(LT/l;I)Loa/a;

    move-result-object v9

    invoke-virtual {v9}, Loa/a;->a()LE/a;

    move-result-object v9

    invoke-static {v8, v9}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v8

    invoke-static {v8, v3, v7}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    goto :goto_5

    :cond_d
    invoke-interface {v3}, LT/l;->J()V

    invoke-static {v2, v3, v7, v4}, LBe/v0;->b(Landroidx/compose/ui/e;LT/l;II)V

    invoke-interface {v3}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {}, LT/o;->P()V

    :cond_e
    :goto_6
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v2

    if-eqz v2, :cond_f

    new-instance v3, LFf/x;

    invoke-direct {v3, v0, v1}, LFf/x;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {v2, v3}, LT/X0;->a(Lmh/p;)V

    :cond_f
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, LT/L0;->a(I)I

    move-result p1

    invoke-static {p0, p2, p1}, LFf/y;->b(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method
